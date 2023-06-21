package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eo")
public class FaceNormal {
   @ObfuscatedName("ba")
   @ObfuscatedSignature(
      signature = "Llv;"
   )
   static IndexedSprite field1878;
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      intValue = -1318747687
   )
   int x;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = -595977289
   )
   int y;
   @ObfuscatedName("g")
   @ObfuscatedGetter(
      intValue = -179165399
   )
   int z;

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1800337948"
   )
   static void method2642() {
      ItemContainer.itemContainers = new HashTable(32);
   }
}
