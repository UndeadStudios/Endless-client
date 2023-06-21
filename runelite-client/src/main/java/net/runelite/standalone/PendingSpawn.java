package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bj")
public final class PendingSpawn extends Node {
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = 168160053
   )
   int field927;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = 1467726553
   )
   int hitpoints;
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = -2078120651
   )
   int orientation;
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = 2003953975
   )
   int y;
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      intValue = -1077869601
   )
   int id;
   @ObfuscatedName("p")
   @ObfuscatedGetter(
      intValue = 1563700397
   )
   int field936;
   @ObfuscatedName("b")
   @ObfuscatedGetter(
      intValue = -1885608007
   )
   int field935;
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      intValue = -1484935613
   )
   int level;
   @ObfuscatedName("n")
   @ObfuscatedGetter(
      intValue = 541672069
   )
   int delay;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = 1986346213
   )
   int type;
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      intValue = -1203333515
   )
   int field930;
   @ObfuscatedName("g")
   @ObfuscatedGetter(
      intValue = -1790508481
   )
   int x;

   PendingSpawn() {
      this.delay = 0;
      this.hitpoints = -1;
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "(IB)Z",
      garbageValue = "76"
   )
   public static boolean method6454(int var0) {
      return var0 == 10 || var0 == 11 || var0 == 12 || var0 == 13 || var0 == 14 || var0 == 15 || var0 == 16 || var0 == 17;
   }
}
