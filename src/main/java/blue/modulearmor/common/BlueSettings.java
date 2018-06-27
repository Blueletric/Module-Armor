package blue.modulearmor.common;

import blue.modulearmor.utils.BlueLogger;
import net.minecraftforge.common.config.Config;
import net.minecraftforge.common.config.ConfigManager;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import javax.annotation.Nullable;

import static blue.modulearmor.constants.BlueConstants.*;

@Config(modid = MODID, name = CONFIG_FILE)
public class BlueSettings {
    @Config.LangKey(CONFIG_USE_FOV_FIX)
    @Config.Comment("Ignore speed boosts for field of view")
    // @Config.RequiresWorldRestart
    public static boolean useFOVFix = true;


    @Config.LangKey(CONFIG_FOV_FIX_DEFAULT_STATE)
    @Config.Comment("Default state of FOVFix on login (enabled = true, disabled = false)")
    // @Config.RequiresWorldRestart
    public static boolean fovFixDefaultState = true;


    @Config.LangKey(CONFIG_USE_SOUNDS)
    @Config.Comment("Use Sounds")
    // @Config.RequiresWorldRestart
    public static boolean useSounds = true;


    @Config.LangKey(CONFIG_DEBUGGING_INFO)
    @Config.Comment("Debugging Info")
    // @Config.RequiresWorldRestart
    public static boolean isDebugging = false;


    @Config.LangKey(CONFIG_MEK_J_TO_RF_RATIO)
    @Config.Comment("Mekanism Joules to RF Ratio")
    // @Config.RequiresWorldRestart
    public static double mekRatio = 0.4;

    //1 RF = 0.25 EU
    //1 EU = 4 RF
    @Config.LangKey(CONFIG_IC2_EU_TO_RF_RATIO)
    @Config.Comment("IC2 EU equal how many RF")
    //@Config.RequiresWorldRestart
    public static double ic2Ratio = 4D;

    @Config.LangKey(CONFIG_RS_TO_RF_RATIO)
    @Config.Comment("Refined PlayerFOVStateStorage energy equals how many RF")
    //@Config.RequiresWorldRestart
    public static double rsRatio = 1D;

    @Config.LangKey(CONFIG_AE_TO_RF_RATIO)
    @Config.Comment("AE energy equals how many RF")
    //@Config.RequiresWorldRestart
    public static double ae2Ratio = 2D;

    // 1M RF
    @Config.LangKey(CONFIG_TIER_1_ENERGY_LVL)
    @Config.Comment("Maximum amount of RF energy for Tier 1")
    @Config.RangeInt(min = 0)
    public static int maxTier1 = (int) (1 *Math.pow(10, 6));

    // Advanced Capacitor
    @Config.LangKey(CONFIG_TIER_2_ENERGY_LVL)
    @Config.Comment("Maximum amount of RF energy for Tier 2")
    @Config.RangeInt(min = 0)
    public static int maxTier2 = (int) (5 * Math.pow(10, 6));

    // Elite Capacitor
    @Config.LangKey(CONFIG_TIER_3_ENERGY_LVL)
    @Config.Comment("Maximum amount of RF energy for Tier 3")
    @Config.RangeInt(min = 0)
    public static int maxTier3 = (int) (5 * Math.pow(10, 7));

    // Ultimate Capacitor
    @Config.LangKey(CONFIG_TIER_4_ENERGY_LVL)
    @Config.Comment("Maximum amount of RF energy for Tier 4")
    @Config.RangeInt(min = 0)
    public static int maxTier4 = (int) (5 * Math.pow(10, 8));

    private static BlueServerSettings serverSettings;
    public static void setServerSettings(@Nullable final BlueServerSettings serverSettings) {
        BlueSettings.serverSettings = serverSettings;
    }

    @Nullable
    public static final BlueServerSettings getServerSettings() {
        return serverSettings;
    }

    @Mod.EventBusSubscriber
    public static class ConfigSyncHandler {
        @SubscribeEvent
        public static void onConfigChanged(ConfigChangedEvent.OnConfigChangedEvent event) {
            if (event.getModID().equals(MODID)) {
                ConfigManager.load(MODID, Config.Type.INSTANCE);
                BlueLogger.logInfo("Configuration has been saved.");
            }
        }
    }
}
