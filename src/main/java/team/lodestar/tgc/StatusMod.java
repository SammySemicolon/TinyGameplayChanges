package team.lodestar.tgc;

import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.fml.common.Mod;

import static team.lodestar.tgc.StatusMod.MODID;

@Mod(MODID)
public class StatusMod {
	public static final String MODID = "status";

	public StatusMod() {
	}

	public static ResourceLocation path(String path) {
		return new ResourceLocation(MODID, path);
	}
}