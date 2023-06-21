package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ie")
public enum WorldMapDecorationType implements Enumerated {
   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "Lie;"
   )
   field2856(0, 0),
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "Lie;"
   )
   field2840(1, 0),
   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "Lie;"
   )
   field2841(2, 0),
   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "Lie;"
   )
   field2850(3, 0),
   @ObfuscatedName("h")
   @ObfuscatedSignature(
      signature = "Lie;"
   )
   field2859(9, 2),
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "Lie;"
   )
   field2846(4, 1),
   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "Lie;"
   )
   field2845(5, 1),
   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "Lie;"
   )
   field2863(6, 1),
   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "Lie;"
   )
   field2847(7, 1),
   @ObfuscatedName("b")
   @ObfuscatedSignature(
      signature = "Lie;"
   )
   field2848(8, 1),
   @ObfuscatedName("n")
   @ObfuscatedSignature(
      signature = "Lie;"
   )
   field2849(12, 2),
   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "Lie;"
   )
   field2844(13, 2),
   @ObfuscatedName("r")
   @ObfuscatedSignature(
      signature = "Lie;"
   )
   field2851(14, 2),
   @ObfuscatedName("t")
   @ObfuscatedSignature(
      signature = "Lie;"
   )
   field2843(15, 2),
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "Lie;"
   )
   field2853(16, 2),
   @ObfuscatedName("o")
   @ObfuscatedSignature(
      signature = "Lie;"
   )
   field2854(17, 2),
   @ObfuscatedName("u")
   @ObfuscatedSignature(
      signature = "Lie;"
   )
   field2855(18, 2),
   @ObfuscatedName("y")
   @ObfuscatedSignature(
      signature = "Lie;"
   )
   field2861(19, 2),
   @ObfuscatedName("k")
   @ObfuscatedSignature(
      signature = "Lie;"
   )
   field2857(20, 2),
   @ObfuscatedName("v")
   @ObfuscatedSignature(
      signature = "Lie;"
   )
   field2858(21, 2),
   @ObfuscatedName("d")
   @ObfuscatedSignature(
      signature = "Lie;"
   )
   field2842(10, 2),
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "Lie;"
   )
   field2860(11, 2),
   @ObfuscatedName("i")
   @ObfuscatedSignature(
      signature = "Lie;"
   )
   field2839(22, 3);

   @ObfuscatedName("c")
   @ObfuscatedGetter(
      intValue = 399378277
   )
   public final int rsOrdinal;

   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "0"
   )
   WorldMapDecorationType(int var3, int var4) {
      this.rsOrdinal = var3;
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "-303219076"
   )
   public int vmethod6373() {
      return this.rsOrdinal;
   }
}
