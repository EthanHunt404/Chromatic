
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.chromatic.mod.init;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class ChromaticModTabs {
	public static CreativeModeTab TAB_CHROMATIC_BUILDING_BLOCKS_TAB;
	public static CreativeModeTab TAB_CHROMATIC_DECOR_TAB;

	public static void load() {
		TAB_CHROMATIC_BUILDING_BLOCKS_TAB = new CreativeModeTab("tabchromatic_building_blocks_tab") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(ChromaticModBlocks.CHROMA_TILE.get());
			}

			@Override
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
		TAB_CHROMATIC_DECOR_TAB = new CreativeModeTab("tabchromatic_decor_tab") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(ChromaticModBlocks.CHROMA_STAIRS.get());
			}

			@Override
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
	}
}
