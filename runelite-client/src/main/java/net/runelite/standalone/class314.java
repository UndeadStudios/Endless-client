package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.api.RSScript;

@ObfuscatedName("cs")
public class class314 extends CacheableNode implements RSScript {
   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "Lgp;"
   )
   static NodeCache field1269;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = -255128747
   )
   int localStringCount;
   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "[Lgs;"
   )
   IterableHashTable[] switches;
   @ObfuscatedName("x")
   String[] stringOperands;
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      intValue = 1575135525
   )
   int stringStackCount;
   @ObfuscatedName("p")
   @ObfuscatedGetter(
      intValue = -591471643
   )
   int intStackCount;
   @ObfuscatedName("s")
   int[] instructions;
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      intValue = -1628931263
   )
   int localIntCount;
   @ObfuscatedName("g")
   int[] intOperands;

   static {
      field1269 = new NodeCache(128);
   }

   public int[] getInstructions() {
      return this.instructions;
   }

   public int[] getIntOperands() {
      return this.intOperands;
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      signature = "(IB)[Lgs;",
      garbageValue = "-1"
   )
   IterableHashTable[] method6298(int var1) {
      return new IterableHashTable[var1];
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/CharSequence;IB)I",
      garbageValue = "0"
   )
   public static int method6302(CharSequence var0, int var1) {
      return ItemLayer.method525(var0, var1, true);
   }
}
