package com.gamma1772.additionalbarsbyg.common.registry;

import com.gamma1772.additionalbars.common.content.block.HorizontalBarsSlabBlock;
import com.gamma1772.additionalbarsbyg.common.AdditionalBarsBYG;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.entity.EntityType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ABBlocksBYG {
	public static final DeferredRegister<Block> BYG_BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, AdditionalBarsBYG.MODID);

	public static final RegistryObject<Block> ASPEN_BARS = BYG_BLOCKS.register("aspen_bars", ABBlocksBYG::createBarsBlock);
	public static final RegistryObject<Block> BAOBAB_BARS = BYG_BLOCKS.register("baobab_bars", ABBlocksBYG::createBarsBlock);
	public static final RegistryObject<Block> BLUE_ENCHANTED_BARS = BYG_BLOCKS.register("blue_enchanted_bars", ABBlocksBYG::createBarsBlock);
	public static final RegistryObject<Block> BULBIS_BARS = BYG_BLOCKS.register("bulbis_bars", ABBlocksBYG::createBarsBlock);
	public static final RegistryObject<Block> CHERRY_BARS = BYG_BLOCKS.register("cherry_bars", ABBlocksBYG::createBarsBlock);
	public static final RegistryObject<Block> CIKA_BARS = BYG_BLOCKS.register("cika_bars", ABBlocksBYG::createBarsBlock);
	public static final RegistryObject<Block> CYPRESS_BARS = BYG_BLOCKS.register("cypress_bars", ABBlocksBYG::createBarsBlock);
	public static final RegistryObject<Block> EBONY_BARS = BYG_BLOCKS.register("ebony_bars", ABBlocksBYG::createBarsBlock);
	public static final RegistryObject<Block> ETHER_BARS = BYG_BLOCKS.register("ether_bars", ABBlocksBYG::createBarsBlock);
	public static final RegistryObject<Block> FIR_BARS = BYG_BLOCKS.register("fir_bars", ABBlocksBYG::createBarsBlock);
	public static final RegistryObject<Block> GREEN_ENCHANTED_BARS = BYG_BLOCKS.register("green_enchanted_bars", ABBlocksBYG::createBarsBlock);
	public static final RegistryObject<Block> HOLLY_BARS = BYG_BLOCKS.register("holly_bars", ABBlocksBYG::createBarsBlock);
	public static final RegistryObject<Block> IMPARIUS_BARS = BYG_BLOCKS.register("imparius_bars", ABBlocksBYG::createBarsBlock);
	public static final RegistryObject<Block> JACARANDA_BARS = BYG_BLOCKS.register("jacaranda_bars", ABBlocksBYG::createBarsBlock);
	public static final RegistryObject<Block> LAMENT_BARS = BYG_BLOCKS.register("lament_bars", ABBlocksBYG::createBarsBlock);
	public static final RegistryObject<Block> MAHOGANY_BARS = BYG_BLOCKS.register("mahogany_bars", ABBlocksBYG::createBarsBlock);
	public static final RegistryObject<Block> MANGROVE_BARS = BYG_BLOCKS.register("mangrove_bars", ABBlocksBYG::createBarsBlock);
	public static final RegistryObject<Block> MAPLE_BARS = BYG_BLOCKS.register("maple_bars", ABBlocksBYG::createBarsBlock);
	public static final RegistryObject<Block> NIGHTSHADE_BARS = BYG_BLOCKS.register("nightshade_bars", ABBlocksBYG::createBarsBlock);
	public static final RegistryObject<Block> PALM_BARS = BYG_BLOCKS.register("palm_bars", ABBlocksBYG::createBarsBlock);
	public static final RegistryObject<Block> PINE_BARS = BYG_BLOCKS.register("pine_bars", ABBlocksBYG::createBarsBlock);
	public static final RegistryObject<Block> RAINBOW_EUCALYPTUS_BARS = BYG_BLOCKS.register("rainbow_eucalyptus_bars", ABBlocksBYG::createBarsBlock);
	public static final RegistryObject<Block> REDWOOD_BARS = BYG_BLOCKS.register("redwood_bars", ABBlocksBYG::createBarsBlock);
	public static final RegistryObject<Block> SKYRIS_BARS = BYG_BLOCKS.register("skyris_bars", ABBlocksBYG::createBarsBlock);
	public static final RegistryObject<Block> WILLOW_BARS = BYG_BLOCKS.register("willow_bars", ABBlocksBYG::createBarsBlock);
	public static final RegistryObject<Block> WITCH_HAZEL_BARS = BYG_BLOCKS.register("witch_hazel_bars", ABBlocksBYG::createBarsBlock);
	public static final RegistryObject<Block> ZELKOVA_BARS = BYG_BLOCKS.register("zelkova_bars", ABBlocksBYG::createBarsBlock);
	public static final RegistryObject<Block> SYTHIAN_BARS = BYG_BLOCKS.register("sythian_bars", ABBlocksBYG::createBarsBlock);
	public static final RegistryObject<Block> EMBUR_BARS = BYG_BLOCKS.register("embur_bars", ABBlocksBYG::createBarsBlock);

	public static final RegistryObject<Block> CROSSED_ASPEN_BARS = BYG_BLOCKS.register("crossed_aspen_bars", ABBlocksBYG::createBarsBlock);
	public static final RegistryObject<Block> CROSSED_BAOBAB_BARS = BYG_BLOCKS.register("crossed_baobab_bars", ABBlocksBYG::createBarsBlock);
	public static final RegistryObject<Block> CROSSED_BLUE_ENCHANTED_BARS = BYG_BLOCKS.register("crossed_blue_enchanted_bars", ABBlocksBYG::createBarsBlock);
	public static final RegistryObject<Block> CROSSED_BULBIS_BARS = BYG_BLOCKS.register("crossed_bulbis_bars", ABBlocksBYG::createBarsBlock);
	public static final RegistryObject<Block> CROSSED_CHERRY_BARS = BYG_BLOCKS.register("crossed_cherry_bars", ABBlocksBYG::createBarsBlock);
	public static final RegistryObject<Block> CROSSED_CIKA_BARS = BYG_BLOCKS.register("crossed_cika_bars", ABBlocksBYG::createBarsBlock);
	public static final RegistryObject<Block> CROSSED_CYPRESS_BARS = BYG_BLOCKS.register("crossed_cypress_bars", ABBlocksBYG::createBarsBlock);
	public static final RegistryObject<Block> CROSSED_EBONY_BARS = BYG_BLOCKS.register("crossed_ebony_bars", ABBlocksBYG::createBarsBlock);
	public static final RegistryObject<Block> CROSSED_ETHER_BARS = BYG_BLOCKS.register("crossed_ether_bars", ABBlocksBYG::createBarsBlock);
	public static final RegistryObject<Block> CROSSED_FIR_BARS = BYG_BLOCKS.register("crossed_fir_bars", ABBlocksBYG::createBarsBlock);
	public static final RegistryObject<Block> CROSSED_GREEN_ENCHANTED_BARS = BYG_BLOCKS.register("crossed_green_enchanted_bars", ABBlocksBYG::createBarsBlock);
	public static final RegistryObject<Block> CROSSED_HOLLY_BARS = BYG_BLOCKS.register("crossed_holly_bars", ABBlocksBYG::createBarsBlock);
	public static final RegistryObject<Block> CROSSED_IMPARIUS_BARS = BYG_BLOCKS.register("crossed_imparius_bars", ABBlocksBYG::createBarsBlock);
	public static final RegistryObject<Block> CROSSED_JACARANDA_BARS = BYG_BLOCKS.register("crossed_jacaranda_bars", ABBlocksBYG::createBarsBlock);
	public static final RegistryObject<Block> CROSSED_LAMENT_BARS = BYG_BLOCKS.register("crossed_lament_bars", ABBlocksBYG::createBarsBlock);
	public static final RegistryObject<Block> CROSSED_MAHOGANY_BARS = BYG_BLOCKS.register("crossed_mahogany_bars", ABBlocksBYG::createBarsBlock);
	public static final RegistryObject<Block> CROSSED_MANGROVE_BARS = BYG_BLOCKS.register("crossed_mangrove_bars", ABBlocksBYG::createBarsBlock);
	public static final RegistryObject<Block> CROSSED_MAPLE_BARS = BYG_BLOCKS.register("crossed_maple_bars", ABBlocksBYG::createBarsBlock);
	public static final RegistryObject<Block> CROSSED_NIGHTSHADE_BARS = BYG_BLOCKS.register("crossed_nightshade_bars", ABBlocksBYG::createBarsBlock);
	public static final RegistryObject<Block> CROSSED_PALM_BARS = BYG_BLOCKS.register("crossed_palm_bars", ABBlocksBYG::createBarsBlock);
	public static final RegistryObject<Block> CROSSED_PINE_BARS = BYG_BLOCKS.register("crossed_pine_bars", ABBlocksBYG::createBarsBlock);
	public static final RegistryObject<Block> CROSSED_RAINBOW_EUCALYPTUS_BARS = BYG_BLOCKS.register("crossed_rainbow_eucalyptus_bars", ABBlocksBYG::createBarsBlock);
	public static final RegistryObject<Block> CROSSED_REDWOOD_BARS = BYG_BLOCKS.register("crossed_redwood_bars", ABBlocksBYG::createBarsBlock);
	public static final RegistryObject<Block> CROSSED_SKYRIS_BARS = BYG_BLOCKS.register("crossed_skyris_bars", ABBlocksBYG::createBarsBlock);
	public static final RegistryObject<Block> CROSSED_WILLOW_BARS = BYG_BLOCKS.register("crossed_willow_bars", ABBlocksBYG::createBarsBlock);
	public static final RegistryObject<Block> CROSSED_WITCH_HAZEL_BARS = BYG_BLOCKS.register("crossed_witch_hazel_bars", ABBlocksBYG::createBarsBlock);
	public static final RegistryObject<Block> CROSSED_ZELKOVA_BARS = BYG_BLOCKS.register("crossed_zelkova_bars", ABBlocksBYG::createBarsBlock);
	public static final RegistryObject<Block> CROSSED_SYTHIAN_BARS = BYG_BLOCKS.register("crossed_sythian_bars", ABBlocksBYG::createBarsBlock);
	public static final RegistryObject<Block> CROSSED_EMBUR_BARS = BYG_BLOCKS.register("crossed_embur_bars", ABBlocksBYG::createBarsBlock);

	public static final RegistryObject<Block> HORIZONTAL_ASPEN_BARS = BYG_BLOCKS.register("horizontal_aspen_bars", ABBlocksBYG::createBarsBlock);
	public static final RegistryObject<Block> HORIZONTAL_BAOBAB_BARS = BYG_BLOCKS.register("horizontal_baobab_bars", ABBlocksBYG::createBarsBlock);
	public static final RegistryObject<Block> HORIZONTAL_BLUE_ENCHANTED_BARS = BYG_BLOCKS.register("horizontal_blue_enchanted_bars", ABBlocksBYG::createBarsBlock);
	public static final RegistryObject<Block> HORIZONTAL_BULBIS_BARS = BYG_BLOCKS.register("horizontal_bulbis_bars", ABBlocksBYG::createBarsBlock);
	public static final RegistryObject<Block> HORIZONTAL_CHERRY_BARS = BYG_BLOCKS.register("horizontal_cherry_bars", ABBlocksBYG::createBarsBlock);
	public static final RegistryObject<Block> HORIZONTAL_CIKA_BARS = BYG_BLOCKS.register("horizontal_cika_bars", ABBlocksBYG::createBarsBlock);
	public static final RegistryObject<Block> HORIZONTAL_CYPRESS_BARS = BYG_BLOCKS.register("horizontal_cypress_bars", ABBlocksBYG::createBarsBlock);
	public static final RegistryObject<Block> HORIZONTAL_EBONY_BARS = BYG_BLOCKS.register("horizontal_ebony_bars", ABBlocksBYG::createBarsBlock);
	public static final RegistryObject<Block> HORIZONTAL_ETHER_BARS = BYG_BLOCKS.register("horizontal_ether_bars", ABBlocksBYG::createBarsBlock);
	public static final RegistryObject<Block> HORIZONTAL_FIR_BARS = BYG_BLOCKS.register("horizontal_fir_bars", ABBlocksBYG::createBarsBlock);
	public static final RegistryObject<Block> HORIZONTAL_GREEN_ENCHANTED_BARS = BYG_BLOCKS.register("horizontal_green_enchanted_bars", ABBlocksBYG::createBarsBlock);
	public static final RegistryObject<Block> HORIZONTAL_HOLLY_BARS = BYG_BLOCKS.register("horizontal_holly_bars", ABBlocksBYG::createBarsBlock);
	public static final RegistryObject<Block> HORIZONTAL_IMPARIUS_BARS = BYG_BLOCKS.register("horizontal_imparius_bars", ABBlocksBYG::createBarsBlock);
	public static final RegistryObject<Block> HORIZONTAL_JACARANDA_BARS = BYG_BLOCKS.register("horizontal_jacaranda_bars", ABBlocksBYG::createBarsBlock);
	public static final RegistryObject<Block> HORIZONTAL_LAMENT_BARS = BYG_BLOCKS.register("horizontal_lament_bars", ABBlocksBYG::createBarsBlock);
	public static final RegistryObject<Block> HORIZONTAL_MAHOGANY_BARS = BYG_BLOCKS.register("horizontal_mahogany_bars", ABBlocksBYG::createBarsBlock);
	public static final RegistryObject<Block> HORIZONTAL_MANGROVE_BARS = BYG_BLOCKS.register("horizontal_mangrove_bars", ABBlocksBYG::createBarsBlock);
	public static final RegistryObject<Block> HORIZONTAL_MAPLE_BARS = BYG_BLOCKS.register("horizontal_maple_bars", ABBlocksBYG::createBarsBlock);
	public static final RegistryObject<Block> HORIZONTAL_NIGHTSHADE_BARS = BYG_BLOCKS.register("horizontal_nightshade_bars", ABBlocksBYG::createBarsBlock);
	public static final RegistryObject<Block> HORIZONTAL_PALM_BARS = BYG_BLOCKS.register("horizontal_palm_bars", ABBlocksBYG::createBarsBlock);
	public static final RegistryObject<Block> HORIZONTAL_PINE_BARS = BYG_BLOCKS.register("horizontal_pine_bars", ABBlocksBYG::createBarsBlock);
	public static final RegistryObject<Block> HORIZONTAL_RAINBOW_EUCALYPTUS_BARS = BYG_BLOCKS.register("horizontal_rainbow_eucalyptus_bars", ABBlocksBYG::createBarsBlock);
	public static final RegistryObject<Block> HORIZONTAL_REDWOOD_BARS = BYG_BLOCKS.register("horizontal_redwood_bars", ABBlocksBYG::createBarsBlock);
	public static final RegistryObject<Block> HORIZONTAL_SKYRIS_BARS = BYG_BLOCKS.register("horizontal_skyris_bars", ABBlocksBYG::createBarsBlock);
	public static final RegistryObject<Block> HORIZONTAL_WILLOW_BARS = BYG_BLOCKS.register("horizontal_willow_bars", ABBlocksBYG::createBarsBlock);
	public static final RegistryObject<Block> HORIZONTAL_WITCH_HAZEL_BARS = BYG_BLOCKS.register("horizontal_witch_hazel_bars", ABBlocksBYG::createBarsBlock);
	public static final RegistryObject<Block> HORIZONTAL_ZELKOVA_BARS = BYG_BLOCKS.register("horizontal_zelkova_bars", ABBlocksBYG::createBarsBlock);
	public static final RegistryObject<Block> HORIZONTAL_SYTHIAN_BARS = BYG_BLOCKS.register("horizontal_sythian_bars", ABBlocksBYG::createBarsBlock);
	public static final RegistryObject<Block> HORIZONTAL_EMBUR_BARS = BYG_BLOCKS.register("horizontal_embur_bars", ABBlocksBYG::createBarsBlock);

	public static final RegistryObject<Block> HORIZONTAL_CROSSED_ASPEN_BARS = BYG_BLOCKS.register("horizontal_crossed_aspen_bars", ABBlocksBYG::createBarsBlock);
	public static final RegistryObject<Block> HORIZONTAL_CROSSED_BAOBAB_BARS = BYG_BLOCKS.register("horizontal_crossed_baobab_bars", ABBlocksBYG::createBarsBlock);
	public static final RegistryObject<Block> HORIZONTAL_CROSSED_BLUE_ENCHANTED_BARS = BYG_BLOCKS.register("horizontal_crossed_blue_enchanted_bars", ABBlocksBYG::createBarsBlock);
	public static final RegistryObject<Block> HORIZONTAL_CROSSED_BULBIS_BARS = BYG_BLOCKS.register("horizontal_crossed_bulbis_bars", ABBlocksBYG::createBarsBlock);
	public static final RegistryObject<Block> HORIZONTAL_CROSSED_CHERRY_BARS = BYG_BLOCKS.register("horizontal_crossed_cherry_bars", ABBlocksBYG::createBarsBlock);
	public static final RegistryObject<Block> HORIZONTAL_CROSSED_CIKA_BARS = BYG_BLOCKS.register("horizontal_crossed_cika_bars", ABBlocksBYG::createBarsBlock);
	public static final RegistryObject<Block> HORIZONTAL_CROSSED_CYPRESS_BARS = BYG_BLOCKS.register("horizontal_crossed_cypress_bars", ABBlocksBYG::createBarsBlock);
	public static final RegistryObject<Block> HORIZONTAL_CROSSED_EBONY_BARS = BYG_BLOCKS.register("horizontal_crossed_ebony_bars", ABBlocksBYG::createBarsBlock);
	public static final RegistryObject<Block> HORIZONTAL_CROSSED_ETHER_BARS = BYG_BLOCKS.register("horizontal_crossed_ether_bars", ABBlocksBYG::createBarsBlock);
	public static final RegistryObject<Block> HORIZONTAL_CROSSED_FIR_BARS = BYG_BLOCKS.register("horizontal_crossed_fir_bars", ABBlocksBYG::createBarsBlock);
	public static final RegistryObject<Block> HORIZONTAL_CROSSED_GREEN_ENCHANTED_BARS = BYG_BLOCKS.register("horizontal_crossed_green_enchanted_bars", ABBlocksBYG::createBarsBlock);
	public static final RegistryObject<Block> HORIZONTAL_CROSSED_HOLLY_BARS = BYG_BLOCKS.register("horizontal_crossed_holly_bars", ABBlocksBYG::createBarsBlock);
	public static final RegistryObject<Block> HORIZONTAL_CROSSED_IMPARIUS_BARS = BYG_BLOCKS.register("horizontal_crossed_imparius_bars", ABBlocksBYG::createBarsBlock);
	public static final RegistryObject<Block> HORIZONTAL_CROSSED_JACARANDA_BARS = BYG_BLOCKS.register("horizontal_crossed_jacaranda_bars", ABBlocksBYG::createBarsBlock);
	public static final RegistryObject<Block> HORIZONTAL_CROSSED_LAMENT_BARS = BYG_BLOCKS.register("horizontal_crossed_lament_bars", ABBlocksBYG::createBarsBlock);
	public static final RegistryObject<Block> HORIZONTAL_CROSSED_MAHOGANY_BARS = BYG_BLOCKS.register("horizontal_crossed_mahogany_bars", ABBlocksBYG::createBarsBlock);
	public static final RegistryObject<Block> HORIZONTAL_CROSSED_MANGROVE_BARS = BYG_BLOCKS.register("horizontal_crossed_mangrove_bars", ABBlocksBYG::createBarsBlock);
	public static final RegistryObject<Block> HORIZONTAL_CROSSED_MAPLE_BARS = BYG_BLOCKS.register("maple_bars", ABBlocksBYG::createBarsBlock);
	public static final RegistryObject<Block> HORIZONTAL_CROSSED_NIGHTSHADE_BARS = BYG_BLOCKS.register("horizontal_crossed_nightshade_bars", ABBlocksBYG::createBarsBlock);
	public static final RegistryObject<Block> HORIZONTAL_CROSSED_PALM_BARS = BYG_BLOCKS.register("horizontal_crossed_palm_bars", ABBlocksBYG::createBarsBlock);
	public static final RegistryObject<Block> HORIZONTAL_CROSSED_PINE_BARS = BYG_BLOCKS.register("horizontal_crossed_pine_bars", ABBlocksBYG::createBarsBlock);
	public static final RegistryObject<Block> HORIZONTAL_CROSSED_RAINBOW_EUCALYPTUS_BARS = BYG_BLOCKS.register("horizontal_crossed_rainbow_eucalyptus_bars", ABBlocksBYG::createBarsBlock);
	public static final RegistryObject<Block> HORIZONTAL_CROSSED_REDWOOD_BARS = BYG_BLOCKS.register("horizontal_crossed_redwood_bars", ABBlocksBYG::createBarsBlock);
	public static final RegistryObject<Block> HORIZONTAL_CROSSED_SKYRIS_BARS = BYG_BLOCKS.register("horizontal_crossed_skyris_bars", ABBlocksBYG::createBarsBlock);
	public static final RegistryObject<Block> HORIZONTAL_CROSSED_WILLOW_BARS = BYG_BLOCKS.register("horizontal_crossed_willow_bars", ABBlocksBYG::createBarsBlock);
	public static final RegistryObject<Block> HORIZONTAL_CROSSED_WITCH_HAZEL_BARS = BYG_BLOCKS.register("horizontal_crossed_witch_hazel_bars", ABBlocksBYG::createBarsBlock);
	public static final RegistryObject<Block> HORIZONTAL_CROSSED_ZELKOVA_BARS = BYG_BLOCKS.register("horizontal_crossed_zelkova_bars", ABBlocksBYG::createBarsBlock);
	public static final RegistryObject<Block> HORIZONTAL_CROSSED_SYTHIAN_BARS = BYG_BLOCKS.register("horizontal_crossed_sythian_bars", ABBlocksBYG::createBarsBlock);
	public static final RegistryObject<Block> HORIZONTAL_CROSSED_EMBUR_BARS = BYG_BLOCKS.register("horizontal_crossed_embur_bars", ABBlocksBYG::createBarsBlock);


	private static PaneBlock createBarsBlock() {
		return new PaneBlock(AbstractBlock.Properties.of(Material.WOOD, MaterialColor.WOOD).sound(SoundType.WOOD).harvestTool(ToolType.AXE).harvestLevel(0).strength(3.0F, 4.0F).noOcclusion().isValidSpawn(ABBlocksBYG::never).isViewBlocking(ABBlocksBYG::never).isSuffocating(ABBlocksBYG::never).isRedstoneConductor(ABBlocksBYG::never));
	}
//
//	private static PaneBlock createBarsBlock(Material material, MaterialColor color, SoundType sound) {
//		return new PaneBlock(AbstractBlock.Properties.create(material, color).sound(sound).harvestTool(ToolType.AXE).harvestLevel(0).hardnessAndResistance(3.0f, 4.0f).notSolid().setAllowsSpawn(ABBlocksBYG::never).setOpaque(ABBlocksBYG::never).setSuffocates(ABBlocksBYG::never).setBlocksVision(ABBlocksBYG::never));
//	}
//
//	private static PaneBlock createBarsBlock(Material material, MaterialColor color, SoundType sound, ToolType tool, float hardness, float resistance) {
//		return new PaneBlock(AbstractBlock.Properties.create(material, color).sound(sound).harvestTool(tool).harvestLevel(0).hardnessAndResistance(hardness, resistance).notSolid().setAllowsSpawn(ABBlocksBYG::never).setOpaque(ABBlocksBYG::never).setSuffocates(ABBlocksBYG::never).setBlocksVision(ABBlocksBYG::never));
//	}

	private static HorizontalBarsSlabBlock createHorizontalBarsBlock() {
		return new HorizontalBarsSlabBlock(AbstractBlock.Properties.of(Material.WOOD, MaterialColor.WOOD).sound(SoundType.WOOD).harvestTool(ToolType.AXE).harvestLevel(0).strength(3.0F, 4.0F).noOcclusion().isValidSpawn(ABBlocksBYG::never).isViewBlocking(ABBlocksBYG::never).isSuffocating(ABBlocksBYG::never).isRedstoneConductor(ABBlocksBYG::never));
	}

//	private static HorizontalBarsSlabBlock createHorizontalBarsBlock(Material material, MaterialColor color, SoundType sound) {
//		return new HorizontalBarsSlabBlock(AbstractBlock.Properties.create(material, color).sound(sound).harvestTool(ToolType.AXE).harvestLevel(0).hardnessAndResistance(3.0f, 4.0f).notSolid().setAllowsSpawn(ABBlocksBYG::never).setOpaque(ABBlocksBYG::never).setSuffocates(ABBlocksBYG::never).setBlocksVision(ABBlocksBYG::never));
//	}
//
//	private static HorizontalBarsSlabBlock createHorizontalBarsBlock(Material material, MaterialColor color, SoundType sound, ToolType tool, float hardness, float resistance) {
//		return new HorizontalBarsSlabBlock(AbstractBlock.Properties.create(material, color).sound(sound).harvestTool(tool).harvestLevel(0).hardnessAndResistance(hardness, resistance).notSolid().setAllowsSpawn(ABBlocksBYG::never).setOpaque(ABBlocksBYG::never).setSuffocates(ABBlocksBYG::never).setBlocksVision(ABBlocksBYG::never));
//	}

	private static Boolean never(BlockState blockState, IBlockReader blockView, BlockPos blockPos, EntityType<?> entityType) { return false; }
	private static boolean never(BlockState blockState, IBlockReader blockView, BlockPos blockPos) { return false; }
}
