package blue.modulearmor.common;

public class BlueConfig
{
    public static boolean useSounds() {
        return BlueSettings.useSounds;
    }

    public static boolean isDebugging() {
        return BlueSettings.isDebugging;
    }

    public static boolean useFOVFix() {
        return BlueSettings.useFOVFix;
    }

    public static boolean fovFixDefaultState() {
        return BlueSettings.fovFixDefaultState;
    }


    public static double getMekRatio() {
        return BlueSettings.getServerSettings() != null ? BlueSettings.getServerSettings().mekRatio : BlueSettings.mekRatio;
    }

    public static double getIC2Ratio() {
        return BlueSettings.getServerSettings() != null ? BlueSettings.getServerSettings().ic2Ratio : BlueSettings.ic2Ratio;
    }

    public static double getRSRatio() {
        return BlueSettings.getServerSettings() != null ? BlueSettings.getServerSettings().rsRatio : BlueSettings.rsRatio;
    }

    public static double getAE2Ratio() {
        return BlueSettings.getServerSettings() != null ? BlueSettings.getServerSettings().ae2Ratio : BlueSettings.ae2Ratio;
    }

    public static int getTier1MaxRF() {
        return BlueSettings.getServerSettings() != null ? BlueSettings.getServerSettings().maxTier1 : BlueSettings.maxTier1;
    }

    public static int getTier2MaxRF() {
        return BlueSettings.getServerSettings() != null ? BlueSettings.getServerSettings().maxTier2 : BlueSettings.maxTier2;
    }

    public static int getTier3MaxRF() {
        return BlueSettings.getServerSettings() != null ? BlueSettings.getServerSettings().maxTier3 : BlueSettings.maxTier3;
    }

    public static int getTier4MaxRF() {
        return BlueSettings.getServerSettings() != null ? BlueSettings.getServerSettings().maxTier4 : BlueSettings.maxTier4;
    }
}
