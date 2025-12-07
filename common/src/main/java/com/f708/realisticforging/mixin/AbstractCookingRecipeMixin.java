package com.f708.realisticforging.mixin;

import com.f708.realisticforging.registry.items.CModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.component.DataComponents;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.AbstractCookingRecipe;
import net.minecraft.world.item.crafting.SingleRecipeInput;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(AbstractCookingRecipe.class)
public class AbstractCookingRecipeMixin {

    @Inject(at = @At("TAIL"), method = "assemble(Lnet/minecraft/world/item/crafting/SingleRecipeInput;Lnet/minecraft/core/HolderLookup$Provider;)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void change(SingleRecipeInput input, HolderLookup.Provider registries, CallbackInfoReturnable<ItemStack> cir){
        ItemStack inputStack = input.item();
        boolean matches = inputStack.getDescriptionId().contains("iron");
        if (matches){
            cir.setReturnValue(new ItemStack(CModItems.HOT_IRON_ORE.get()));
        }
    }

}
