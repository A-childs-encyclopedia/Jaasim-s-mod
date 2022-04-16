
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.jaasimsmod.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.item.Item;

import net.mcreator.jaasimsmod.item.MbbItem;
import net.mcreator.jaasimsmod.item.InfinityBladeItem;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class JaasimsModModItems {
	private static final List<Item> REGISTRY = new ArrayList<>();
	public static final Item INFINITY_BLADE = register(new InfinityBladeItem());
	public static final Item MBB = register(new MbbItem());

	private static Item register(Item item) {
		REGISTRY.add(item);
		return item;
	}

	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Item[0]));
	}
}
