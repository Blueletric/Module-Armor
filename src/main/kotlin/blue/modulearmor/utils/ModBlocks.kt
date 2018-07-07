package blue.modulearmor.utils

import net.minecraft.block.Block
import net.minecraft.block.material.Material
import net.minecraft.creativetab.CreativeTabs

class ModBlocks {
    private val blocks = mutableListOf<Block>()

    fun createBlock(material : Material, name: String, creativeTab: CreativeTabs, registryName: String? = null,
                    toolType: String, miningLevel: Int = 0, unbreakable: Boolean = false,
                    hardness: Float = 5F, resistance: Float = 15F){
        blocks.add(Block(material).apply{
            unlocalizedName = name
            setCreativeTab(creativeTab)
            setRegistryName(registryName ?: name)
            setHardness(hardness)
            setResistance(resistance)
            if (unbreakable)
                setBlockUnbreakable()
            else
                setHarvestLevel(toolType, miningLevel)
        })
    }

    fun addBlock(block: Block) = blocks.add(block)

    fun getRegisteredBlocks() = blocks.toTypedArray()
}
