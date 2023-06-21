package net.runelite.standalone;

import java.util.HashMap;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("iq")
public class class7 {
   @ObfuscatedName("x")
   int[] field3297;
   @ObfuscatedName("a")
   final HashMap field3298;
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "Llh;"
   )
   Bounds field3295;
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      intValue = 1887235647
   )
   int field3299;
   @ObfuscatedName("g")
   int[] field3296;

   public class7() {
      this.field3298 = new HashMap();
      this.field3295 = new Bounds(0, 0);
      this.field3296 = new int[2048];
      this.field3297 = new int[2048];
      this.field3299 = 0;
      ItemContainer.method3963();
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(IILld;FI)V",
      garbageValue = "1132431495"
   )
   public final void method92(int var1, int var2, SpritePixels var3, float var4) {
      int var5 = (int)(18.0F * var4);
      SpritePixels var6 = this.method90(var5);
      int var7 = var5 * 2 + 1;
      Bounds var8 = new Bounds(0, 0, var3.width, var3.height);
      Bounds var9 = new Bounds(0, 0);
      this.field3295.method477(var7, var7);
      System.nanoTime();

      int var10;
      int var11;
      int var12;
      for(var10 = 0; var10 < this.field3299; ++var10) {
         var11 = this.field3296[var10];
         var12 = this.field3297[var10];
         int var13 = (int)(var4 * (float)(var11 - var1)) - var5;
         int var14 = (int)((float)var3.height - var4 * (float)(var12 - var2)) - var5;
         this.field3295.method478(var13, var14);
         this.field3295.method496(var8, var9);
         this.method93(var6, var3, var9);
      }

      System.nanoTime();
      System.nanoTime();

      for(var10 = 0; var10 < var3.pixels.length; ++var10) {
         if(var3.pixels[var10] == 0) {
            var3.pixels[var10] = -16777216;
         } else {
            var11 = (var3.pixels[var10] + 64 - 1) / 256;
            if(var11 <= 0) {
               var3.pixels[var10] = -16777216;
            } else {
               if(var11 > class266.field1977.length) {
                  var11 = class266.field1977.length;
               }

               var12 = class266.field1977[var11 - 1];
               var3.pixels[var10] = -16777216 | var12;
            }
         }
      }

      System.nanoTime();
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(III)V",
      garbageValue = "-2042722903"
   )
   public final void method91(int var1, int var2) {
      if(this.field3299 < this.field3296.length) {
         this.field3296[this.field3299] = var1;
         this.field3297[this.field3299] = var2;
         ++this.field3299;
      }
   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "(Lld;Lld;Llh;B)V",
      garbageValue = "1"
   )
   void method93(SpritePixels var1, SpritePixels var2, Bounds var3) {
      if(var3.field3846 != 0 && var3.field3847 != 0) {
         int var4 = 0;
         int var5 = 0;
         if(var3.field3844 == 0) {
            var4 = var1.width - var3.field3846;
         }

         if(var3.field3845 == 0) {
            var5 = var1.height - var3.field3847;
         }

         int var6 = var4 + var5 * var1.width;
         int var7 = var2.width * var3.field3845 + var3.field3844;

         for(int var8 = 0; var8 < var3.field3847; ++var8) {
            for(int var9 = 0; var9 < var3.field3846; ++var9) {
               int var10001 = var7++;
               var2.pixels[var10001] += var1.pixels[var6++];
            }

            var6 += var1.width - var3.field3846;
            var7 += var2.width - var3.field3846;
         }

      }
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "-2029849843"
   )
   void method89(int var1) {
      int var2 = var1 * 2 + 1;
      double var4 = (double)((float)var1 / 3.0F);
      int var6 = var1 * 2 + 1;
      double[] var7 = new double[var6];
      int var8 = -var1;

      for(int var9 = 0; var8 <= var1; ++var9) {
         var7[var9] = AttackOpPriority.method1549((double)var8, 0.0D, var4);
         ++var8;
      }

      double[] var14 = var7;
      double var15 = var7[var1] * var7[var1];
      int[] var17 = new int[var2 * var2];
      boolean var10 = false;

      for(int var11 = 0; var11 < var2; ++var11) {
         for(int var12 = 0; var12 < var2; ++var12) {
            int var13 = var17[var12 + var11 * var2] = (int)(var14[var12] * var14[var11] / var15 * 256.0D);
            if(!var10 && var13 > 0) {
               var10 = true;
            }
         }
      }

      SpritePixels var18 = new SpritePixels(var17, var2, var2);
      this.field3298.put(Integer.valueOf(var1), var18);
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "1004620997"
   )
   public final void method98() {
      this.field3299 = 0;
   }

   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "(IB)Lld;",
      garbageValue = "0"
   )
   SpritePixels method90(int var1) {
      if(!this.field3298.containsKey(Integer.valueOf(var1))) {
         this.method89(var1);
      }

      return (SpritePixels)this.field3298.get(Integer.valueOf(var1));
   }

   @ObfuscatedName("gb")
   @ObfuscatedSignature(
      signature = "(IIIIZI)V",
      garbageValue = "-1602426861"
   )
   static final void method111(int var0, int var1, int var2, int var3, boolean var4) {
      if(var2 < 1) {
         var2 = 1;
      }

      if(var3 < 1) {
         var3 = 1;
      }

      int var5 = var3 - 334;
      int var6;
      if(var5 < 0) {
         var6 = client.field899;
      } else if(var5 >= 100) {
         var6 = client.field900;
      } else {
         var6 = (client.field900 - client.field899) * var5 / 100 + client.field899;
      }

      int var7 = var3 * var6 * 512 / (var2 * 334);
      int var8;
      int var9;
      short var10;
      if(var7 < client.field905) {
         var10 = client.field905;
         var6 = var10 * var2 * 334 / (var3 * 512);
         if(var6 > client.field872) {
            var6 = client.field872;
            var8 = var3 * var6 * 512 / (var10 * 334);
            var9 = (var2 - var8) / 2;
            if(var4) {
               Rasterizer2D.method683();
               Rasterizer2D.method692(var0, var1, var9, var3, -16777216);
               Rasterizer2D.method692(var0 + var2 - var9, var1, var9, var3, -16777216);
            }

            var0 += var9;
            var2 -= var9 * 2;
         }
      } else if(var7 > client.field906) {
         var10 = client.field906;
         var6 = var10 * var2 * 334 / (var3 * 512);
         if(var6 < client.field903) {
            var6 = client.field903;
            var8 = var10 * var2 * 334 / (var6 * 512);
            var9 = (var3 - var8) / 2;
            if(var4) {
               Rasterizer2D.method683();
               Rasterizer2D.method692(var0, var1, var2, var9, -16777216);
               Rasterizer2D.method692(var0, var3 + var1 - var9, var2, var9, -16777216);
            }

            var1 += var9;
            var3 -= var9 * 2;
         }
      }

      client.scale = var3 * var6 / 334;
      if(var2 != client.viewportWidth || var3 != client.viewportHeight) {
         class53.method856(var2, var3);
      }

      client.Viewport_xOffset = var0;
      client.Viewport_yOffset = var1;
      client.viewportWidth = var2;
      client.viewportHeight = var3;
   }
}
