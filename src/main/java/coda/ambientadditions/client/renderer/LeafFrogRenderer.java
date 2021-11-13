package coda.ambientadditions.client.renderer;

import coda.ambientadditions.AmbientAdditions;
import coda.ambientadditions.client.model.LeafFrogModel;
import coda.ambientadditions.common.entities.LeafFrogEntity;
import com.google.common.collect.Maps;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.Util;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import java.util.Map;

@OnlyIn(Dist.CLIENT)
public class LeafFrogRenderer extends MobRenderer<LeafFrogEntity, LeafFrogModel<LeafFrogEntity>> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(AmbientAdditions.MOD_ID, "textures/entity/leaf_frog.png");

    public LeafFrogRenderer(EntityRendererManager p_i48864_1_) {
        super(p_i48864_1_, new LeafFrogModel<>(), 0.35F);
    }

    public ResourceLocation getTextureLocation(LeafFrogEntity entity) {
        return TEXTURE;
    }
}


