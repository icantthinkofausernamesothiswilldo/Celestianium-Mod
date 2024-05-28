package com.celestianiummoddev.celestianium.CelestianiumModItems;

import cpw.mods.fml.common.registry.GameRegistry;

public class CelestianiumModItems {
  public static Item CELESTIANIUM_INGOT = new CelestianiumIngot();

  {
    GameRegistry.registerItem(CELESTIANIUM_INGOT,"item.celestianium_ingot.name");
  }
}
