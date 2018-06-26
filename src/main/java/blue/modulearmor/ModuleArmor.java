package blue.modulearmor;

import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;

import javax.annotation.Nonnull;

@Mod(modid = MODID, version = VERSION)
public final class ModuleArmor {
    @Nonnull
    private static ModuleArmor INSTANCE;

    private ModuleArmor() {
        FluidRegistry.enableUniversalBucket();
    }

    @Nonnull
    @Mod.InstanceFactory
    public static ModuleArmor getINSTANCE() {
        if (INSTANCE == null)
            INSTANCE = new ModuleArmor();
        return INSTANCE;
    }

    @SidedProxy(clientSide = "blue.modulearmor.proxy.ClientSide")
    public static CommonProxy proxy;
}
