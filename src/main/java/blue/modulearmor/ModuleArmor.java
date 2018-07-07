package blue.modulearmor;

import blue.modulearmor.proxy.ClientProxy;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import javax.annotation.Nonnull;

import static blue.modulearmor.constants.BlueConstants.MODID;
import static blue.modulearmor.constants.BlueConstants.VERSION;

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
    public static ClientProxy proxy;
}
