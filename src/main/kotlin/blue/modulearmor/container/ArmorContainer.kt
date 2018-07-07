package blue.modulearmor.container

import blue.modulearmor.slots.ArmorSlot
import net.minecraft.entity.player.EntityPlayer
import net.minecraft.inventory.Container
import net.minecraft.entity.player.InventoryPlayer
import net.minecraft.item.ItemStack



class ArmorContainer(val armorStack: ItemStack, inventoryPlayer: InventoryPlayer): Container() {
    private var gridSize = 0
    private var armor = armorStack.item

    init {
        gridSize = getSizeFor(armorStack)

        var slotID = 0

        for (i in 0 until gridSize)
            for (j in 0 until gridSize)
                addSlotToContainer(ArmorSlot(inventoryPlayer, slotID++, i, j))

        // TODO: Make this work like Factorio Armor
    }

    private fun getSizeFor(stack: ItemStack): Int {
        println(stack.displayName)
        return when (stack.displayName){
            "simple modular armor" -> 3
            "advanced modular armor" -> 5
            "elite modular armor" -> 7
            "ultimate modular armor" -> 9
            else -> 1
        }
    }

    override fun canInteractWith(playerIn: EntityPlayer?) = true
}