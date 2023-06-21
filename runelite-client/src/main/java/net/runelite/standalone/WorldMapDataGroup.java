package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ae")
public class WorldMapDataGroup {
   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "Lhx;"
   )
   public static Track1 field302;
   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "Lae;"
   )
   static final WorldMapDataGroup field310;
   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "Lae;"
   )
   public static final WorldMapDataGroup field309;
   @ObfuscatedName("bx")
   @ObfuscatedSignature(
      signature = "Llv;"
   )
   static IndexedSprite field308;
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "Lae;"
   )
   public static final WorldMapDataGroup field303;
   @ObfuscatedName("h")
   @ObfuscatedSignature(
      signature = "Lae;"
   )
   public static final WorldMapDataGroup field306;
   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "Lae;"
   )
   public static final WorldMapDataGroup field304;
   @ObfuscatedName("f")
   public final String name;

   static {
      field309 = new WorldMapDataGroup("details");
      field303 = new WorldMapDataGroup("compositemap");
      field304 = new WorldMapDataGroup("compositetexture");
      field310 = new WorldMapDataGroup("area");
      field306 = new WorldMapDataGroup("labels");
   }

   WorldMapDataGroup(String var1) {
      this.name = var1;
   }

   @ObfuscatedName("r")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-171510744"
   )
   static void method958() {
      class203.worldSelectShown = false;
      class302.leftBackground.method1331(class203.field1168, 0);
      //class203.rightBackground.method1331(class203.field1168 + 382, 0);
      //class203.logoSprite.method4282(class203.field1168 + 382 - class203.logoSprite.width / 2, 18);
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "(Liz;IIIZI)V",
      garbageValue = "-530719579"
   )
   public static void method957(Js5Index var0, int var1, int var2, int var3, boolean var4) {
      class262.field2557 = 1;
      class129.field278 = var0;
      class262.field2551 = var1;
      class262.field2552 = var2;
      class308.field536 = var3;
      class262.field2553 = var4;
      TextureProvider.field1525 = 10000;
   }

   @ObfuscatedName("fj")
   @ObfuscatedSignature(
      signature = "(B)Llq;",
      garbageValue = "1"
   )
   static WorldMap method959() {
      return class69.worldMap;
   }

   @ObfuscatedName("t")
   @ObfuscatedSignature(
      signature = "(II)I",
      garbageValue = "1911537018"
   )
   public static int method960(int var0) {
      return var0 > 0?1:(var0 < 0?-1:0);
   }
}
