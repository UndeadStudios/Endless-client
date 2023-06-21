package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ja")
public class InvType extends CacheableNode {
   @ObfuscatedName("l")
   static int[][][] field3314;
   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "Liz;"
   )
   public static Js5Index field3310;
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "Lgp;"
   )
   static NodeCache field3311;
   @ObfuscatedName("g")
   @ObfuscatedGetter(
      intValue = -733268637
   )
   public int size;

   static {
      field3311 = new NodeCache(64);
   }

   InvType() {
      this.size = 0;
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(Lgx;B)V",
      garbageValue = "2"
   )
   void method1566(Packet var1) {
      while(true) {
         int var2 = var1.readUnsignedByte();
         if(var2 == 0) {
            return;
         }

         this.method1567(var1, var2);
      }
   }

   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "(Lgx;II)V",
      garbageValue = "1365905715"
   )
   void method1567(Packet var1, int var2) {
      if(var2 == 2) {
         this.size = var1.readUnsignedShort();
      }

   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(Lgx;Ljava/lang/String;I)I",
      garbageValue = "1699317104"
   )
   public static int method1565(Packet var0, String var1) {
      int var2 = var0.offset;
      byte[] var3 = class292.method5965(var1);
      var0.method5084(var3.length);
      var0.offset += class202.huffman.method527(var3, 0, var3.length, var0.payload, var0.offset);
      return var0.offset - var2;
   }
}
