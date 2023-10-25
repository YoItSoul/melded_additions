package net.soul.meldedadditions.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.soul.meldedadditions.MeldedAdditions;
import net.soul.meldedadditions.item.ModItems;

import javax.annotation.Nullable;
import java.util.concurrent.CompletableFuture;

public class ModItemTagGenerator extends ItemTagsProvider {
    public ModItemTagGenerator(PackOutput p_275343_, CompletableFuture<HolderLookup.Provider> p_275729_,
                               CompletableFuture<TagLookup<Block>> p_275322_, @Nullable ExistingFileHelper existingFileHelper){
        super(p_275343_, p_275729_, p_275322_, MeldedAdditions.MOD_ID,existingFileHelper);
}

@Override
protected void addTags(HolderLookup.Provider pProvider) {
    this.tag(ItemTags.MUSIC_DISCS)
            .add(ModItems.SUNRISEDISC.get())
            .add(ModItems.STENCILDISC.get());
}
}