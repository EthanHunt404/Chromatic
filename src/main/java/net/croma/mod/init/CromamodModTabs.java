
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.croma.mod.init;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class CromamodModTabs {
	public static CreativeModeTab TAB_CHROMATIC_BUILDING_BLOCKS_TAB;
	public static CreativeModeTab TAB_CHROMATIC_DECOR_TAB;

	public static void load() {
		TAB_CHROMATIC_BUILDING_BLOCKS_TAB = new CreativeModeTab("tabchromatic_building_blocks_tab") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(CromamodModBlocks.CHROMA_TILE.get());
			}

			@Override
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
		TAB_CHROMATIC_DECOR_TAB = new CreativeModeTab("tabchromatic_decor_tab") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(CromamodModBlocks.CUT_CHROMA_SLAB.get());
			}

			@Override
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
	}
}
