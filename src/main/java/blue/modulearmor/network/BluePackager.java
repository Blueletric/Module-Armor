package blue.modulearmor.network;

import blue.modulearmor.utils.BlueLogger;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import org.apache.logging.log4j.core.pattern.AbstractStyleNameConverter;
import scala.tools.nsc.interpreter.Power;

import java.io.DataInputStream;
import java.io.IOException;
import java.util.HashMap;

public class BluePackager
{
    private static BluePackager INSTANCE;
    public short READ_ERROR = -150;

    public static BluePackager getINSTANCE() {
        if (INSTANCE == null)
            INSTANCE = new BluePackager();
        return INSTANCE;
    }

    public BluePacket read(DataInputStream datain, EntityPlayer player) {
        return null;
    }

    public byte readByte(DataInputStream datain) {
        try {
            return datain.readByte();
        } catch (IOException exception) {
            BlueLogger.logException("PROBLEM READING DATA FROM PACKET D:", exception);
            return Byte.parseByte(null);
        }
    }

    public short readShort(DataInputStream datain) {
        try {
            return datain.readShort();
        } catch (IOException exception) {
            BlueLogger.logException("PROBLEM READING DATA FROM PACKET D:", exception);
            return Short.parseShort(null);
        }
    }

    public int readInt(DataInputStream datain) {
        try {
            return datain.readInt();
        } catch (IOException exception) {
            BlueLogger.logException("PROBLEM READING DATA FROM PACKET D:", exception);
            return Integer.parseInt(null);
        }
    }

    public long readLong(DataInputStream datain) {
        try {
            return datain.readLong();
        } catch (IOException exception) {
            BlueLogger.logException("PROBLEM READING DATA FROM PACKET D:", exception);
            return Long.parseLong(null);
        }
    }

    public boolean readBoolean(DataInputStream datain) {
        try {
            return datain.readBoolean();
        } catch (IOException exception) {
            BlueLogger.logException("PROBLEM READING DATA FROM PACKET D:", exception);
            return Boolean.parseBoolean(null);
        }
    }

    public float readFloat(DataInputStream datain) {
        try {
            return datain.readFloat();
        } catch (IOException exception) {
            BlueLogger.logException("PROBLEM READING DATA FROM PACKET D:", exception);
            return Float.parseFloat(null);
        }
    }

    public double readDouble(DataInputStream datain) {
        try {
            return datain.readDouble();
        } catch (IOException exception) {
            BlueLogger.logException("PROBLEM READING DATA FROM PACKET D:", exception);
            return Double.parseDouble(null);
        }
    }
}
