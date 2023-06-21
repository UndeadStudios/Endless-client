package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ji")
public enum class299 implements Enumerated {
   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "Lji;"
   )
   field3564(2, 0),
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "Lji;"
   )
   field3560(0, 1),
   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "Lji;"
   )
   field3561(1, 2);

   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = 1720495645
   )
   public final int field3562;
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      intValue = -627355553
   )
   final int field3559;

   class299(int var3, int var4) {
      this.field3562 = var3;
      this.field3559 = var4;
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "-303219076"
   )
   public int vmethod6373() {
      return this.field3559;
   }
}
