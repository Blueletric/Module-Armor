package blue.modulearmor.utils;

import blue.modulearmor.common.BlueConfig;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public final class BlueLogger
{
    private static final Logger logger = LogManager.getLogger("Blueletric");

    public static void logDebug(String string) {
        boolean debugging = true;
        try {
            if (!BlueConfig.isDebugging()) debugging = false;
        } catch (Exception ignored){
        }
        if (debugging) logger.info(string);

    }

    public static void logError(String string) {
        logger.warn(string);
    }

    public static void logInfo(String string) {
        logger.info(string);
    }

    public static void logException(String string, Throwable exception) {
        logger.warn(string);
        exception.printStackTrace();
    }
}
