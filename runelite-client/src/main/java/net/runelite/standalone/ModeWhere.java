package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ix")
public class ModeWhere {
   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "Lix;"
   )
   static final ModeWhere WIP;
   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "Lix;"
   )
   static final ModeWhere LIVE;
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "Lix;"
   )
   static final ModeWhere BUILDLIVE;
   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "Lix;"
   )
   static final ModeWhere RC;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = -70287847
   )
   final int field3216;
   @ObfuscatedName("h")
   public final String identifier;

   static {
      LIVE = new ModeWhere("LIVE", 0);
      BUILDLIVE = new ModeWhere("BUILDLIVE", 3);
      RC = new ModeWhere("RC", 1);
      WIP = new ModeWhere("WIP", 2);
   }

   ModeWhere(String var1, int var2) {
      this.identifier = var1;
      this.field3216 = var2;
   }

   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "(Lgx;I)Ljava/lang/String;",
      garbageValue = "1904519986"
   )
   public static String method1463(Packet var0) {
      String var1;
      try {
         int var2 = var0.method5269();
         if(var2 > 32767) {
            var2 = 32767;
         }

         byte[] var3 = new byte[var2];
         var0.offset += class202.huffman.method528(var0.payload, var0.offset, var3, 0, var2);
         String var4 = TradingPost.method1607(var3, 0, var2);
         var1 = var4;
      } catch (Exception var6) {
         var1 = "Cabbage";
      }

      return var1;
   }
}
