package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("u")
public class class318 {
   @ObfuscatedName("sv")
   @ObfuscatedGetter(
      intValue = 760845619
   )
   static int field114;
   @ObfuscatedName("gr")
   @ObfuscatedGetter(
      intValue = 1173873021
   )
   static int field115;

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(II)Lbl;",
      garbageValue = "2047075680"
   )
   static ChatLine method6318(int var0) {
      return (ChatLine)ChatHistory.messages.method2178((long)var0);
   }

   @ObfuscatedName("b")
   @ObfuscatedSignature(
      signature = "(IIIB)I",
      garbageValue = "50"
   )
   static final int method6319(int var0, int var1, int var2) {
      int var3 = 256 - var2;
      return (var3 * (var0 & 16711935) + (var1 & 16711935) * var2 & -16711936) + ((var0 & 65280) * var3 + (var1 & 65280) * var2 & 16711680) >> 8;
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "(I)J",
      garbageValue = "-2112726319"
   )
   public static synchronized long method6317() {
      long var0 = System.currentTimeMillis();
      if(var0 < class295.field2439) {
         class295.field2437 += class295.field2439 - var0;
      }

      class295.field2439 = var0;
      return class295.field2437 + var0;
   }
}
