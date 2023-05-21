package team.lodestar.tgc;

import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.fml.common.Mod;

import static team.lodestar.tgc.TinyGameplayChangesMod.MODID;

@Mod(MODID)
public class TinyGameplayChangesMod {
	public static final String MODID = "tgc";

	public TinyGameplayChangesMod() {
	}

	public static ResourceLocation path(String path) {
		return new ResourceLocation(MODID, path);
	}
}