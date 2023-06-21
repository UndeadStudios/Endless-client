package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("y")
public class Size {
   @ObfuscatedName("rz")
   @ObfuscatedGetter(
      intValue = 1813401529
   )
   static int field119;
   @ObfuscatedName("r")
   @ObfuscatedSignature(
      signature = "Lkt;"
   )
   public static Font field127;
   @ObfuscatedName("w")
   static int[] field128;
   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "Ly;"
   )
   public static final Size field123;
   @ObfuscatedName("eb")
   @ObfuscatedSignature(
      signature = "Lin;"
   )
   static Js5 field125;
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "Ly;"
   )
   public static final Size field126;
   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "Ly;"
   )
   public static final Size field120;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = -980199831
   )
   final int field118;
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = 319484891
   )
   final int field121;
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      intValue = -1197932527
   )
   final int field122;

   static {
      field123 = new Size(2, 0, 4);
      field126 = new Size(1, 1, 2);
      field120 = new Size(0, 2, 0);
   }

   Size(int var1, int var2, int var3) {
      this.field121 = var1;
      this.field122 = var2;
      this.field118 = var3;
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(FB)Z",
      garbageValue = "16"
   )
   boolean method4086(float var1) {
      return var1 >= (float)this.field118;
   }

   @ObfuscatedName("if")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "10"
   )
   static final void method4085() {
      int var0 = class181.menuX;
      int var1 = TotalQuantityComparator.menuY;
      int var2 = class302.field3309;
      int var3 = class288.field1949;
      int var4 = 6116423;
      Rasterizer2D.method692(var0, var1, var2, var3, var4);
      Rasterizer2D.method692(var0 + 1, var1 + 1, var2 - 2, 16, 0);
      Rasterizer2D.method696(var0 + 1, var1 + 18, var2 - 2, var3 - 19, 0);
      class191.fontBold12.method6165("Choose Option", var0 + 3, var1 + 14, var4, -1);
      int var5 = MouseInput.mouseLastX;
      int var6 = MouseInput.mouseLastY;

      int var7;
      int var8;
      int var9;
      for(var7 = 0; var7 < client.menuOptionCount; ++var7) {
         var8 = (client.menuOptionCount - 1 - var7) * 15 + var1 + 31;
         var9 = 16777215;
         if(var5 > var0 && var5 < var0 + var2 && var6 > var8 - 13 && var6 < var8 + 3) {
            var9 = 16776960;
         }

         class191.fontBold12.method6165(MilliTimer.method1071(var7), var0 + 3, var8, var9, 0);
      }

      var7 = class181.menuX;
      var8 = TotalQuantityComparator.menuY;
      var9 = class302.field3309;
      int var10 = class288.field1949;

      for(int var11 = 0; var11 < client.interfaceCount; ++var11) {
         if(client.widgetPositionX[var11] + client.widgetBoundsWidth[var11] > var7 && client.widgetPositionX[var11] < var9 + var7 && client.widgetPositionY[var11] + client.widgetBoundsHeight[var11] > var8 && client.widgetPositionY[var11] < var8 + var10) {
            client.field923[var11] = true;
         }
      }

   }

   @ObfuscatedName("hx")
   @ObfuscatedSignature(
      signature = "(IIB)Lfu;",
      garbageValue = "124"
   )
   static class93 method4089(int var0, int var1) {
      client.field818.field2127 = var0;
      client.field818.field2126 = var1;
      client.field818.field2130 = 1;
      client.field818.field2129 = 1;
      return client.field818;
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "(I)[Ly;",
      garbageValue = "-391898132"
   )
   static Size[] method4097() {
      return new Size[]{field120, field126, field123};
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(CI)Z",
      garbageValue = "2054948874"
   )
   public static final boolean method4096(char var0) {
      return var0 == 160 || var0 == ' ' || var0 == '_' || var0 == '-';
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(Lge;II)V",
      garbageValue = "-1824516225"
   )
   static final void method4095(Bit var0, int var1) {
      int var2 = var0.offset;
      PlayerList.extendedInfoPlayerCount = 0;
      class12.method178(var0);
      MouseInput.method1911(var0);
      if(var0.offset - var2 != var1) {
         throw new RuntimeException(var0.offset - var2 + " " + var1);
      }
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      signature = "(Lgx;IIIIIIB)V",
      garbageValue = "72"
   )
   static final void method4094(Packet var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      int var7;
      if(var2 >= 0 && var2 < 104 && var3 >= 0 && var3 < 104) {
         class91.tileSettings[var1][var2][var3] = 0;

         while(true) {
            var7 = var0.readUnsignedByte();
            if(var7 == 0) {
               if(var1 == 0) {
                  int[] var8 = class91.tileHeights[0][var2];
                  int var11 = var2 + var4 + 932731;
                  int var12 = var3 + var5 + 556238;
                  int var13 = class262.method4905(45365 + var11, 91923 + var12, 4) - 128 + (class262.method4905(10294 + var11, var12 + 37821, 2) - 128 >> 1) + (class262.method4905(var11, var12, 1) - 128 >> 2);
                  var13 = (int)((double)var13 * 0.3D) + 35;
                  if(var13 < 10) {
                     var13 = 10;
                  } else if(var13 > 60) {
                     var13 = 60;
                  }

                  var8[var3] = -var13 * 8;
               } else {
                  class91.tileHeights[var1][var2][var3] = class91.tileHeights[var1 - 1][var2][var3] - 240;
               }
               break;
            }

            if(var7 == 1) {
               int var14 = var0.readUnsignedByte();
               if(var14 == 1) {
                  var14 = 0;
               }

               if(var1 == 0) {
                  class91.tileHeights[0][var2][var3] = -var14 * 8;
               } else {
                  class91.tileHeights[var1][var2][var3] = class91.tileHeights[var1 - 1][var2][var3] - var14 * 8;
               }
               break;
            }

            if(var7 <= 49) {
               class91.tileOverlayIds[var1][var2][var3] = var0.method5230();
               class91.tileOverlayPath[var1][var2][var3] = (byte)((var7 - 2) / 4);
               class91.overlayRotations[var1][var2][var3] = (byte)(var7 - 2 + var6 & 3);
            } else if(var7 <= 81) {
               class91.tileSettings[var1][var2][var3] = (byte)(var7 - 49);
            } else {
               class91.tileUnderlayIds[var1][var2][var3] = (byte)(var7 - 81);
            }
         }
      } else {
         while(true) {
            var7 = var0.readUnsignedByte();
            if(var7 == 0) {
               break;
            }

            if(var7 == 1) {
               var0.readUnsignedByte();
               break;
            }

            if(var7 <= 49) {
               var0.readUnsignedByte();
            }
         }
      }

   }

   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "(IB)Ly;",
      garbageValue = "-43"
   )
   static Size method4087(int var0) {
      Size[] var1 = method4097();

      for(int var2 = 0; var2 < var1.length; ++var2) {
         Size var3 = var1[var2];
         if(var0 == var3.field122) {
            return var3;
         }
      }

      return null;
   }
}
