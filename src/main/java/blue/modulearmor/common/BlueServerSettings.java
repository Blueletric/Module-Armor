package blue.modulearmor.common;

import blue.modulearmor.network.BluePackager;
import blue.modulearmor.network.BluePacket;

import java.io.DataInputStream;

public class BlueServerSettings {
    public final double mekRatio;
    public final double ic2Ratio;
    public final double rsRatio;
    public final double ae2Ratio;

    public final int maxTier1;
    public final int maxTier2;
    public final int maxTier3;
    public final int maxTier4;

    public BlueServerSettings() {
        mekRatio = BlueSettings.mekRatio;
        ic2Ratio = BlueSettings.ic2Ratio;
        rsRatio = BlueSettings.rsRatio;
        ae2Ratio = BlueSettings.ae2Ratio;

        maxTier1 = BlueSettings.maxTier1;
        maxTier2 = BlueSettings.maxTier2;
        maxTier3 = BlueSettings.maxTier3;
        maxTier4 = BlueSettings.maxTier4;

    }

    public BlueServerSettings(final DataInputStream datain) {
        mekRatio= BluePackager.getInstance().readDouble(datain);
        ic2Ratio= BluePackager.getInstance().readDouble(datain);
        rsRatio= BluePackager.getInstance().readDouble(datain);
        ae2Ratio= BluePackager.getInstance().readDouble(datain);

        maxTier1= BluePackager.getInstance().readDouble(datain);
        maxTier2= BluePackager.getInstance().readDouble(datain);
        maxTier3= BluePackager.getInstance().readDouble(datain);
        maxTier4= BluePackager.getInstance().readDouble(datain);
    }

    public void writeToBuffer(final BluePacket packet) {
        packet.writeDouble(mekRatio);
        packet.writeDouble(ic2Ratio);
        packet.writeDouble(rsRatio);
        packet.writeDouble(ae2Ratio);

        packet.writeDouble(maxTier1);
        packet.writeDouble(maxTier2);
        packet.writeDouble(maxTier3);
        packet.writeDouble(maxTier4);
    }
}
