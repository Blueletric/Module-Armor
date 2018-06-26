package blue.modulearmor.network;

import blue.modulearmor.utils.BlueLogger;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;

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

    public BluePacket read()
}
