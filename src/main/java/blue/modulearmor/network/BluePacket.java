package blue.modulearmor.network;

import blue.modulearmor.utils.BlueLogger;
import io.netty.buffer.ByteBufOutputStream;
import io.netty.buffer.Unpooled;
import net.jpountz.lz4.LZ4BlockOutputStream;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompressedStreamTools;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.PacketBuffer;
import net.minecraftforge.fml.common.network.internal.FMLProxyPacket;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;


public abstract class BluePacket
{
    private PacketBuffer packetBuffer;
    private final DataOutputStream dataout;

    public BluePacket() {
        this.packetBuffer = new PacketBuffer(Unpooled.buffer());
        this.dataout = new DataOutputStream(new ByteBufOutputStream(this.packetBuffer));
    }

    public abstract BluePackager packager();

    public abstract void write();

    public PacketBuffer packetBuffer() {
        return this.packetBuffer;
    }

    public DataOutputStream dataout() {
        return this.dataout;
    }

    public FMLProxyPacket getFMLProxyPacket() throws IOException {
        this.dataout.writeInt((Integer) BluePacketHandler.packagers.inverse().get(this.packager()));
    }
}
