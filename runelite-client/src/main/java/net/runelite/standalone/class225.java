package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lp")
public enum class225 implements Enumerated {
   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "Llp;"
   )
   field3877(0, 0),
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "Llp;"
   )
   field3873(1, 1),
   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "Llp;"
   )
   field3871(2, 2);

   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = 606563051
   )
   public final int field3874;
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      intValue = -960272879
   )
   final int field3872;

   class225(int var3, int var4) {
      this.field3874 = var3;
      this.field3872 = var4;
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "-303219076"
   )
   public int vmethod6373() {
      return this.field3872;
   }
}
