package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jo")
public class FloorUnderlayDefinition extends CacheableNode {
   @ObfuscatedName("dr")
   @ObfuscatedGetter(
      longValue = -5832929330207401863L
   )
   static long field3371;
   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "Liz;"
   )
   public static Js5Index underlay_ref;
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "Lgp;"
   )
   public static NodeCache underlays;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = -1957094679
   )
   public int lightness;
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = -923744073
   )
   public int hue;
   @ObfuscatedName("p")
   @ObfuscatedGetter(
      intValue = -1613065465
   )
   public int hueMultiplier;
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      intValue = -207542285
   )
   public int saturation;
   @ObfuscatedName("g")
   @ObfuscatedGetter(
      intValue = -1269432375
   )
   int rgbColor;

   static {
      underlays = new NodeCache(64);
   }

   public FloorUnderlayDefinition() {
      this.rgbColor = 0;
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(Lgx;III)V",
      garbageValue = "-987832054"
   )
   void method1884(Packet var1, int var2, int var3) {
      if(var2 == 1) {
         this.rgbColor = var1.method5090();
      }

   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1621517336"
   )
   public void method1883() {
      this.method1895(this.rgbColor);
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "-740923085"
   )
   void method1895(int var1) {
      double var2 = (double)(var1 >> 16 & 255) / 256.0D;
      double var4 = (double)(var1 >> 8 & 255) / 256.0D;
      double var6 = (double)(var1 & 255) / 256.0D;
      double var8 = var2;
      if(var4 < var2) {
         var8 = var4;
      }

      if(var6 < var8) {
         var8 = var6;
      }

      double var10 = var2;
      if(var4 > var2) {
         var10 = var4;
      }

      if(var6 > var10) {
         var10 = var6;
      }

      double var12 = 0.0D;
      double var14 = 0.0D;
      double var16 = (var8 + var10) / 2.0D;
      if(var8 != var10) {
         if(var16 < 0.5D) {
            var14 = (var10 - var8) / (var10 + var8);
         }

         if(var16 >= 0.5D) {
            var14 = (var10 - var8) / (2.0D - var10 - var8);
         }

         if(var10 == var2) {
            var12 = (var4 - var6) / (var10 - var8);
         } else if(var4 == var10) {
            var12 = 2.0D + (var6 - var2) / (var10 - var8);
         } else if(var10 == var6) {
            var12 = (var2 - var4) / (var10 - var8) + 4.0D;
         }
      }

      var12 /= 6.0D;
      this.saturation = (int)(var14 * 256.0D);
      this.lightness = (int)(var16 * 256.0D);
      if(this.saturation < 0) {
         this.saturation = 0;
      } else if(this.saturation > 255) {
         this.saturation = 255;
      }

      if(this.lightness < 0) {
         this.lightness = 0;
      } else if(this.lightness > 255) {
         this.lightness = 255;
      }

      if(var16 > 0.5D) {
         this.hueMultiplier = (int)(512.0D * (1.0D - var16) * var14);
      } else {
         this.hueMultiplier = (int)(512.0D * var16 * var14);
      }

      if(this.hueMultiplier < 1) {
         this.hueMultiplier = 1;
      }

      this.hue = (int)(var12 * (double)this.hueMultiplier);
   }

   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "(Lgx;II)V",
      garbageValue = "1128661368"
   )
   public void method1893(Packet var1, int var2) {
      while(true) {
         int var3 = var1.readUnsignedByte();
         if(var3 == 0) {
            return;
         }

         this.method1884(var1, var3, var2);
      }
   }
}
