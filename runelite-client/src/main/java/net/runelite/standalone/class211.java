package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("et")
public class class211 implements class204 {
   @ObfuscatedName("bt")
   @ObfuscatedSignature(
      signature = "[Llv;"
   )
   static IndexedSprite[] slFlagSprites;
   @ObfuscatedName("dv")
   @ObfuscatedSignature(
      signature = "Lin;"
   )
   static Js5 vorbis;
   @ObfuscatedName("y")
   public static String[] historicCacheDirectories;
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "Liz;"
   )
   public static Js5Index field1991;

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "(CI)Z",
      garbageValue = "-729809184"
   )
   public static boolean method4099(char var0) {
      return var0 >= '0' && var0 <= '9';
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(II)I",
      garbageValue = "444837344"
   )
   public static int method4098(int var0) {
      int var1 = 0;
      if(var0 < 0 || var0 >= 65536) {
         var0 >>>= 16;
         var1 += 16;
      }

      if(var0 >= 256) {
         var0 >>>= 8;
         var1 += 8;
      }

      if(var0 >= 16) {
         var0 >>>= 4;
         var1 += 4;
      }

      if(var0 >= 4) {
         var0 >>>= 2;
         var1 += 2;
      }

      if(var0 >= 1) {
         var0 >>>= 1;
         ++var1;
      }

      return var0 + var1;
   }
}
