package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ii")
public class class139 {
   @ObfuscatedName("n")
   @ObfuscatedSignature(
      signature = "(IIIIIZB)Lld;",
      garbageValue = "87"
   )
   public static final SpritePixels method1992(int var0, int var1, int var2, int var3, int var4, boolean var5) {
      if(var1 == -1) {
         var4 = 0;
      } else if(var4 == 2 && var1 != 1) {
         var4 = 1;
      }

      long var6 = ((long)var4 << 40) + ((long)var2 << 38) + (long)var0 + ((long)var1 << 16) + ((long)var3 << 42);
      SpritePixels var8;
      if(!var5) {
         var8 = (SpritePixels)ObjType.itemSpriteCache.method635(var6);
         if(var8 != null) {
            return var8;
         }
      }

      ObjType var9 = class79.method1074(var0);
      if(var1 > 1 && var9.countObj != null) {
         int var10 = -1;

         for(int var11 = 0; var11 < 10; ++var11) {
            if(var1 >= var9.countCo[var11] && var9.countCo[var11] != 0) {
               var10 = var9.countObj[var11];
            }
         }

         if(var10 != -1) {
            var9 = class79.method1074(var10);
         }
      }

      Model var21 = var9.method2220(1);
      if(var21 == null) {
         return null;
      } else {
         SpritePixels var22 = null;
         if(var9.certTemplate != -1) {
            var22 = method1992(var9.certLink, 10, 1, 0, 0, true);
            if(var22 == null) {
               return null;
            }
         } else if(var9.boughtTemplate != -1) {
            var22 = method1992(var9.boughtLink, var1, var2, var3, 0, false);
            if(var22 == null) {
               return null;
            }
         } else if(var9.placeholderTemplate != -1) {
            var22 = method1992(var9.placeholderLink, var1, 0, 0, 0, false);
            if(var22 == null) {
               return null;
            }
         }

         int[] var12 = Rasterizer2D.graphicsPixels;
         int var13 = Rasterizer2D.graphicsPixelsWidth;
         int var14 = Rasterizer2D.graphicsPixelsHeight;
         int[] var15 = new int[4];
         Rasterizer2D.method686(var15);
         var8 = new SpritePixels(36, 32);
         Rasterizer2D.method701(var8.pixels, 36, 32);
         Rasterizer2D.method688();
         Graphics3D.method2087();
         Graphics3D.method2090(16, 16);
         Graphics3D.rasterGouraudLowRes = false;
         if(var9.placeholderTemplate != -1) {
            var22.method1311(0, 0);
         }

         int var16 = var9.zoom2d;
         if(var5) {
            var16 = (int)(1.5D * (double)var16);
         } else if(var2 == 2) {
            var16 = (int)(1.04D * (double)var16);
         }

         int var17 = var16 * Graphics3D.SINE[var9.xan2d] >> 16;
         int var18 = var16 * Graphics3D.COSINE[var9.xan2d] >> 16;
         var21.method3833();
         var21.method3844(0, var9.yan2d, var9.zan2d, var9.xan2d, var9.xof2d, var21.modelHeight / 2 + var17 + var9.yof2d, var18 + var9.yof2d);
         if(var9.boughtTemplate != -1) {
            var22.method1311(0, 0);
         }

         if(var2 >= 1) {
            var8.method1307(1);
         }

         if(var2 >= 2) {
            var8.method1307(16777215);
         }

         if(var3 != 0) {
            var8.method1308(var3);
         }

         Rasterizer2D.method701(var8.pixels, 36, 32);
         if(var9.certTemplate != -1) {
            var22.method1311(0, 0);
         }

         if(var4 == 1 || var4 == 2 && var9.stackable == 1) {
            Font var19 = Size.field127;
            String var20;
            if(var1 < 100000) {
               var20 = "<col=ffff00>" + var1 + "</col>";
            } else if(var1 < 10000000) {
               var20 = "<col=ffffff>" + var1 / 1000 + "K" + "</col>";
            } else {
               var20 = "<col=00ff80>" + var1 / 1000000 + "M" + "</col>";
            }

            var19.method6165(var20, 0, 9, 16776960, 1);
         }

         if(!var5) {
            ObjType.itemSpriteCache.method628(var8, var6);
         }

         Rasterizer2D.method701(var12, var13, var14);
         Rasterizer2D.method687(var15);
         Graphics3D.method2087();
         Graphics3D.rasterGouraudLowRes = true;
         return var8;
      }
   }
}
