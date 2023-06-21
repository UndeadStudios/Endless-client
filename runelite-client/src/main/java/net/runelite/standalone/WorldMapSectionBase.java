package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("au")
public interface WorldMapSectionBase {
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(Lgx;B)V",
      garbageValue = "46"
   )
   void vmethod4912(Packet var1);

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(IIIB)[I",
      garbageValue = "103"
   )
   int[] vmethod4911(int var1, int var2, int var3);

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "(Lag;B)V",
      garbageValue = "-123"
   )
   void vmethod4925(WorldMapData var1);

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(IIII)Z",
      garbageValue = "-12219513"
   )
   boolean vmethod4930(int var1, int var2, int var3);

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      signature = "(III)Lif;",
      garbageValue = "-957800253"
   )
   CoordGrid vmethod4935(int var1, int var2);

   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "(III)Z",
      garbageValue = "1385272861"
   )
   boolean vmethod4910(int var1, int var2);
}
