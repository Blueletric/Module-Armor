package blue.modulearmor.utils

import net.minecraft.creativetab.CreativeTabs
import net.minecraft.item.Item

class ModItems {
    private val items = mutableListOf<Item>()

    fun createItem(name: String, creativeTab: CreativeTabs, registryName: String? = null,
                   maxStackSize: Int = 64, toolType: String? = null, miningLevel: Int = 0){
        items.add(Item().apply {
            unlocalizedName = name
            setCreativeTab(creativeTab)
            setMaxStackSize(maxStackSize)
            setRegistryName(registryName ?: name)
            if (toolType != null){
                setHarvestLevel(toolType, miningLevel)
            }
        })
    }

    fun addItem(item: Item) = items.add(item)

    fun getRegisteredItems() = items.toTypedArray()
}
