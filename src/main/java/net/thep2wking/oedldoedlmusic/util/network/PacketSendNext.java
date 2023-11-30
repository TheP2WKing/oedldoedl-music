package net.thep2wking.oedldoedlmusic.util.network;

import io.netty.buffer.ByteBuf;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;
import net.thep2wking.oedldoedlmusic.content.block.TileMusicPlayer;

public class PacketSendNext implements IMessage {
	private BlockPos blockPos;

	public PacketSendNext() {
	}

	public PacketSendNext(BlockPos pos) {
		blockPos = pos;
	}

	@Override
	public void fromBytes(ByteBuf buf) {
		blockPos = new BlockPos(buf.readInt(), buf.readInt(), buf.readInt());
	}

	@Override
	public void toBytes(ByteBuf buf) {
		buf.writeInt(blockPos.getX());
		buf.writeInt(blockPos.getY());
		buf.writeInt(blockPos.getZ());
	}

	@SuppressWarnings("null")
	public static class Handler implements IMessageHandler<PacketSendNext, IMessage> {
		private void handle(PacketSendNext message, MessageContext ctx) {
			EntityPlayerMP playerEntity = ctx.getServerHandler().player;
			World world = playerEntity.world;
			TileMusicPlayer musicplayer = (TileMusicPlayer) world.getTileEntity(message.blockPos);
			musicplayer.nextSong();
		}

		@Override
		public IMessage onMessage(PacketSendNext message, MessageContext ctx) {
			FMLCommonHandler.instance().getWorldThread(ctx.netHandler).addScheduledTask(() -> handle(message, ctx));
			return null;
		}
	}
}