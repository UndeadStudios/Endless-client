package net.runelite.standalone;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("aa")
public class WorldMapRegion {
   @ObfuscatedName("nz")
   @ObfuscatedGetter(
      intValue = 1603304763
   )
   static int field267;
   @ObfuscatedName("c")
   static int[] field266;
   @ObfuscatedName("h")
   @ObfuscatedSignature(
      signature = "Lha;"
   )
   static class105 field255;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = -2040938815
   )
   int field256;
   @ObfuscatedName("e")
   List field264;
   @ObfuscatedName("r")
   HashMap field263;
   @ObfuscatedName("q")
   LinkedList field259;
   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "Lo;"
   )
   class135 field258;
   @ObfuscatedName("p")
   @ObfuscatedGetter(
      intValue = 456795829
   )
   int field257;
   @ObfuscatedName("b")
   @ObfuscatedGetter(
      intValue = 1559167195
   )
   int field253;
   @ObfuscatedName("n")
   @ObfuscatedGetter(
      intValue = -827937127
   )
   int pixelsPerTile;
   @ObfuscatedName("t")
   final HashMap mapFonts;

   static {
      field255 = new class105(37748736, 256);
   }

   WorldMapRegion(int var1, int var2, int var3, HashMap var4) {
      this.field256 = var1;
      this.field257 = var2;
      this.field259 = new LinkedList();
      this.field264 = new LinkedList();
      this.field263 = new HashMap();
      this.field253 = var3 | -16777216;
      this.mapFonts = var4;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(IIIILw;I)V",
      garbageValue = "-367889105"
   )
   void method5432(int var1, int var2, int var3, int var4, class71 var5) {
      this.field263.clear();

      for(int var6 = var1; var6 < var3 + var1; ++var6) {
         label48:
         for(int var7 = var2; var7 < var2 + var4; ++var7) {
            for(int var8 = 0; var8 < var5.field168; ++var8) {
               WorldMapDecoration[] var9 = var5.decorations[var8][var6][var7];
               if(var9 != null && var9.length != 0) {
                  WorldMapDecoration[] var10 = var9;

                  for(int var11 = 0; var11 < var10.length; ++var11) {
                     WorldMapDecoration var12 = var10[var11];
                     LocType var13 = GrandExchangeOffer.method1736(var12.objectDefinitionId);
                     if(class186.method3569(var13)) {
                        this.method5491(var13, var8, var6, var7, var5);
                        continue label48;
                     }
                  }
               }
            }
         }
      }

   }

   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      signature = "(IIIIII)Ljava/util/List;",
      garbageValue = "1174387475"
   )
   List method5478(int var1, int var2, int var3, int var4, int var5) {
      LinkedList var6 = new LinkedList();
      if(var4 >= var1 && var5 >= var2) {
         if(var4 < var3 + var1 && var5 < var3 + var2) {
            Iterator var7 = this.field263.values().iterator();

            MapIcon var8;
            while(var7.hasNext()) {
               var8 = (MapIcon)var7.next();
               if(var8.method4064() && var8.method4063(var4, var5)) {
                  var6.add(var8);
               }
            }

            var7 = this.field264.iterator();

            while(var7.hasNext()) {
               var8 = (MapIcon)var7.next();
               if(var8.method4064() && var8.method4063(var4, var5)) {
                  var6.add(var8);
               }
            }

            return var6;
         } else {
            return var6;
         }
      } else {
         return var6;
      }
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(Lar;[Llv;Laf;I)V",
      garbageValue = "1448109159"
   )
   void method5441(class258 var1, IndexedSprite[] var2, class57 var3) {
      int var4;
      int var5;
      for(var4 = 0; var4 < 64; ++var4) {
         for(var5 = 0; var5 < 64; ++var5) {
            this.method5444(var4, var5, this.field258, var1, var3);
            this.method5445(var4, var5, this.field258, var1);
         }
      }

      for(var4 = 0; var4 < 64; ++var4) {
         for(var5 = 0; var5 < 64; ++var5) {
            this.method5513(var4, var5, this.field258, var1, var2);
         }
      }

   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      signature = "(IILw;Laf;I)I",
      garbageValue = "-705076753"
   )
   int method5446(int var1, int var2, class71 var3, class57 var4) {
      return var3.field188[0][var1][var2] == 0?this.field253:var4.method905(var1, var2);
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "(ILar;[Llv;Liz;Liz;I)V",
      garbageValue = "-1586636872"
   )
   void method5438(int var1, class258 var2, IndexedSprite[] var3, Js5Index var4, Js5Index var5) {
      this.pixelsPerTile = var1;
      if(this.field258 != null || !this.field259.isEmpty()) {
         if(class333.method6435(this.field256, this.field257, var1) == null) {
            boolean var6 = true;
            var6 &= this.method5498(var4);
            int var8;
            if(this.field258 != null) {
               var8 = this.field258.field174;
            } else {
               var8 = ((class71)this.field259.getFirst()).field174;
            }

            var6 &= var5.method4159(var8);
            if(var6) {
               byte[] var7 = var5.method4122(var8);
               class57 var9 = SpotAnimation.method1583(var7);
               SpritePixels var10 = new SpritePixels(this.pixelsPerTile * 64, this.pixelsPerTile * 64);
               var10.method1390();
               if(this.field258 != null) {
                  this.method5441(var2, var3, var9);
               } else {
                  this.method5442(var2, var3, var9);
               }

               int var11 = this.field256;
               int var12 = this.field257;
               int var13 = this.pixelsPerTile;
               class105 var14 = field255;
               long var16 = (long)(var13 << 16 | var11 << 8 | var12);
               var14.method1524(var10, var16, var10.pixels.length * 4);
               this.method5516();
            }
         }
      }
   }

   @ObfuscatedName("r")
   @ObfuscatedSignature(
      signature = "(IIILjava/util/HashSet;I)V",
      garbageValue = "1305396217"
   )
   void method5439(int var1, int var2, int var3, HashSet var4) {
      if(var4 == null) {
         var4 = new HashSet();
      }

      this.method5449(var1, var2, var4, var3);
      this.method5455(var1, var2, var4, var3);
   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      signature = "(B)Ljava/util/List;",
      garbageValue = "-120"
   )
   List method5461() {
      LinkedList var1 = new LinkedList();
      var1.addAll(this.field264);
      var1.addAll(this.field263.values());
      return var1;
   }

   @ObfuscatedName("ae")
   @ObfuscatedSignature(
      signature = "(Lat;Ljd;IIFB)V",
      garbageValue = "97"
   )
   void method5454(MapIcon var1, MapElementType var2, int var3, int var4, float var5) {
      MapLabel var6 = var1.vmethod4061();
      if(var6 != null) {
         if(var6.fontSize.method4086(var5)) {
            Font var7 = (Font)this.mapFonts.get(var6.fontSize);
            var7.method6207(var6.text, var3 - var6.field247 / 2, var4, var6.field247, var6.field248, -16777216 | var2.textColor, 0, 1, 0, var7.verticalSpace / 2);
         }
      }
   }

   @ObfuscatedName("k")
   @ObfuscatedSignature(
      signature = "(IILw;Lar;I)V",
      garbageValue = "1455535887"
   )
   void method5445(int var1, int var2, class71 var3, class258 var4) {
      for(int var5 = 1; var5 < var3.field168; ++var5) {
         int var6 = var3.field185[var5][var1][var2] - 1;
         if(var6 > -1) {
            int var8 = this.field253;
            Overlay var10 = (Overlay)Overlay.overlays.method635((long)var6);
            Overlay var9;
            if(var10 != null) {
               var9 = var10;
            } else {
               byte[] var11 = Overlay.overlay_ref.method4115(4, var6, 640811416);
               var10 = new Overlay();
               if(var11 != null) {
                  var10.method6389(new Packet(var11), var6);
               }

               var10.method6395();
               Overlay.overlays.method628(var10, (long)var6);
               var9 = var10;
            }

            int var7;
            if(var9 == null) {
               var7 = var8;
            } else if(var9.otherRgbColor >= 0) {
               var7 = var9.otherRgbColor | -16777216;
            } else {
               int var12;
               int var21;
               if(var9.texture >= 0) {
                  var12 = Graphics3D.textureLoader.vmethod1151(var9.texture);
                  byte var13 = 96;
                  int var20;
                  if(var12 == -2) {
                     var20 = 12345678;
                  } else if(var12 == -1) {
                     if(var13 < 0) {
                        var13 = 0;
                     } else if(var13 > 127) {
                        var13 = 127;
                     }

                     var21 = 127 - var13;
                     var20 = var21;
                  } else {
                     var21 = var13 * (var12 & 127) / 128;
                     if(var21 < 2) {
                        var21 = 2;
                     } else if(var21 > 126) {
                        var21 = 126;
                     }

                     var20 = var21 + (var12 & 65408);
                  }

                  var7 = Graphics3D.colorPalette[var20] | -16777216;
               } else if(var9.color == 16711935) {
                  var7 = var8;
               } else {
                  var12 = var9.hue;
                  var21 = var9.saturation;
                  int var14 = var9.lightness;
                  if(var14 > 179) {
                     var21 /= 2;
                  }

                  if(var14 > 192) {
                     var21 /= 2;
                  }

                  if(var14 > 217) {
                     var21 /= 2;
                  }

                  if(var14 > 243) {
                     var21 /= 2;
                  }

                  int var15 = (var21 / 32 << 7) + var14 / 2 + (var12 / 4 << 10);
                  byte var17 = 96;
                  int var16;
                  if(var15 == -2) {
                     var16 = 12345678;
                  } else {
                     int var22;
                     if(var15 == -1) {
                        if(var17 < 0) {
                           var17 = 0;
                        } else if(var17 > 127) {
                           var17 = 127;
                        }

                        var22 = 127 - var17;
                        var16 = var22;
                     } else {
                        var22 = var17 * (var15 & 127) / 128;
                        if(var22 < 2) {
                           var22 = 2;
                        } else if(var22 > 126) {
                           var22 = 126;
                        }

                        var16 = var22 + (var15 & 65408);
                     }
                  }

                  var7 = Graphics3D.colorPalette[var16] | -16777216;
               }
            }

            if(var3.field178[var5][var1][var2] == 0) {
               Rasterizer2D.method692(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, this.pixelsPerTile, var7);
            } else {
               var4.method4829(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), 0, var7, this.pixelsPerTile, this.pixelsPerTile, var3.field178[var5][var1][var2], var3.field179[var5][var1][var2]);
            }
         }
      }

   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "(Ljava/util/List;I)V",
      garbageValue = "1863380061"
   )
   void method5435(List var1) {
      Iterator var2 = var1.iterator();

      while(var2.hasNext()) {
         class69 var3 = (class69)var2.next();
         if(var3.field297.x >> 6 == this.field256 && var3.field297.y >> 6 == this.field257) {
            class69 var4 = new class69(var3.field297, var3.field297, var3.field134, this.method5458(var3.field134));
            this.field264.add(var4);
         }
      }

   }

   @ObfuscatedName("au")
   @ObfuscatedSignature(
      signature = "(Lld;Lji;I)I",
      garbageValue = "-17075263"
   )
   int method5428(SpritePixels var1, class299 var2) {
      switch(var2.field3562) {
      case 0:
         return -var1.width / 2;
      case 2:
         return 0;
      default:
         return -var1.width;
      }
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(Lo;Ljava/util/List;I)V",
      garbageValue = "-239871291"
   )
   void method5465(class135 var1, List var2) {
      this.field263.clear();
      this.field258 = var1;
      this.method5435(var2);
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1460781870"
   )
   void method5434() {
      Iterator var1 = this.field263.values().iterator();

      while(var1.hasNext()) {
         MapIcon var2 = (MapIcon)var1.next();
         if(var2 instanceof class172) {
            ((class172)var2).method2696();
         }
      }

   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "(Ljy;IIILw;I)V",
      garbageValue = "545372346"
   )
   void method5491(LocType var1, int var2, int var3, int var4, class71 var5) {
      CoordGrid var6 = new CoordGrid(var2, var3 + this.field256 * 64, this.field257 * 64 + var4);
      CoordGrid var7 = null;
      if(this.field258 != null) {
         var7 = new CoordGrid(this.field258.field172 + var2, var3 + this.field258.field173 * 64, var4 + this.field258.field169 * 64);
      } else {
         class232 var8 = (class232)var5;
         var7 = new CoordGrid(var2 + var8.field172, var3 + var8.field173 * 64 + var8.method4506() * 8, var8.field169 * 64 + var4 + var8.method4507() * 8);
      }

      Object var10;
      if(var1.multiLocs != null) {
         var10 = new class172(var7, var6, var1.field3476, this);
      } else {
         MapElementType var9 = MapLabel.method2858(var1.mapelement);
         var10 = new class69(var7, var6, var9.id, this.method5459(var9));
      }

      this.field263.put(new CoordGrid(0, var3, var4), var10);
   }

   @ObfuscatedName("b")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "1214927551"
   )
   void method5516() {
      if(this.field258 != null) {
         this.field258.method1002();
      } else {
         Iterator var1 = this.field259.iterator();

         while(var1.hasNext()) {
            class232 var2 = (class232)var1.next();
            var2.method1002();
         }
      }

   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      signature = "(Lld;Lip;I)I",
      garbageValue = "1448466244"
   )
   int method5457(SpritePixels var1, class302 var2) {
      switch(var2.field3305) {
      case 0:
         return -var1.height / 2;
      case 1:
         return 0;
      default:
         return -var1.height;
      }
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      signature = "(Ljd;IIIIB)V",
      garbageValue = "43"
   )
   void method5451(MapElementType var1, int var2, int var3, int var4, int var5) {
      SpritePixels var6 = var1.method1483(false);
      if(var6 != null) {
         var6.method1311(var2 - var6.width / 2, var3 - var6.height / 2);
         if(var4 % var5 < var5 / 2) {
            Rasterizer2D.method690(var2, var3, 15, 16776960, 128);
            Rasterizer2D.method690(var2, var3, 7, 16777215, 256);
         }

      }
   }

   @ObfuscatedName("o")
   @ObfuscatedSignature(
      signature = "(Lar;[Llv;Laf;I)V",
      garbageValue = "1763160815"
   )
   void method5442(class258 var1, IndexedSprite[] var2, class57 var3) {
      Iterator var4 = this.field259.iterator();

      class232 var5;
      int var6;
      int var7;
      while(var4.hasNext()) {
         var5 = (class232)var4.next();

         for(var6 = var5.method4508() * 8; var6 < var5.method4508() * 8 + 8; ++var6) {
            for(var7 = var5.method4509() * 8; var7 < var5.method4509() * 8 + 8; ++var7) {
               this.method5444(var6, var7, var5, var1, var3);
               this.method5445(var6, var7, var5, var1);
            }
         }
      }

      var4 = this.field259.iterator();

      while(var4.hasNext()) {
         var5 = (class232)var4.next();

         for(var6 = var5.method4508() * 8; var6 < var5.method4508() * 8 + 8; ++var6) {
            for(var7 = var5.method4509() * 8; var7 < var5.method4509() * 8 + 8; ++var7) {
               this.method5513(var6, var7, var5, var1, var2);
            }
         }
      }

   }

   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      signature = "(Ljd;I)Lay;",
      garbageValue = "-975984983"
   )
   MapLabel method5459(MapElementType var1) {
      if(var1.text != null && this.mapFonts != null && this.mapFonts.get(Size.field123) != null) {
         Size var2 = Size.method4087(var1.textSize);
         if(var2 == null) {
            return null;
         } else {
            Font var3 = (Font)this.mapFonts.get(var2);
            if(var3 == null) {
               return null;
            } else {
               int var4 = var3.method6163(var1.text, 1000000);
               String[] var5 = new String[var4];
               var3.method6240(var1.text, (int[])null, var5);
               int var6 = var5.length * var3.verticalSpace / 2;
               int var7 = 0;
               String[] var8 = var5;

               for(int var9 = 0; var9 < var8.length; ++var9) {
                  String var10 = var8[var9];
                  int var11 = var3.method6160(var10);
                  if(var11 > var7) {
                     var7 = var11;
                  }
               }

               return new MapLabel(var1.text, var7, var6, var2);
            }
         }
      } else {
         return null;
      }
   }

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      signature = "(Liz;B)Z",
      garbageValue = "-3"
   )
   boolean method5498(Js5Index var1) {
      if(this.field258 != null) {
         this.field258.method999(var1);
         if(this.field258.method1000()) {
            this.method5432(0, 0, 64, 64, this.field258);
            return true;
         } else {
            return false;
         }
      } else {
         boolean var2 = true;

         Iterator var3;
         class232 var4;
         for(var3 = this.field259.iterator(); var3.hasNext(); var2 &= var4.method1000()) {
            var4 = (class232)var3.next();
            var4.method999(var1);
         }

         if(var2) {
            var3 = this.field259.iterator();

            while(var3.hasNext()) {
               var4 = (class232)var3.next();
               this.method5432(var4.method4508() * 8, var4.method4509() * 8, 8, 8, var4);
            }
         }

         return var2;
      }
   }

   @ObfuscatedName("av")
   @ObfuscatedSignature(
      signature = "(IILjava/util/HashSet;IB)V",
      garbageValue = "1"
   )
   void method5455(int var1, int var2, HashSet var3, int var4) {
      float var5 = (float)var4 / 64.0F;
      Iterator var6 = this.field264.iterator();

      while(var6.hasNext()) {
         MapIcon var7 = (MapIcon)var6.next();
         if(var7.method4064()) {
            int var8 = var7.field297.x % 64;
            int var9 = var7.field297.y % 64;
            var7.field296 = (int)(var5 * (float)var8 + (float)var1);
            var7.field299 = (int)((float)var2 + var5 * (float)(63 - var9));
            if(!var3.contains(Integer.valueOf(var7.vmethod4060()))) {
               this.method5452(var7, var7.field296, var7.field299, var5);
            }
         }
      }

   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      signature = "(IILw;[Llv;I)V",
      garbageValue = "-2142882096"
   )
   void method5447(int var1, int var2, class71 var3, IndexedSprite[] var4) {
      for(int var5 = 0; var5 < var3.field168; ++var5) {
         WorldMapDecoration[] var6 = var3.decorations[var5][var1][var2];
         if(var6 != null && var6.length != 0) {
            WorldMapDecoration[] var7 = var6;

            for(int var8 = 0; var8 < var7.length; ++var8) {
               WorldMapDecoration var9 = var7[var8];
               int var11 = var9.decoration;
               boolean var10 = var11 >= WorldMapDecorationType.field2842.rsOrdinal && var11 <= WorldMapDecorationType.field2860.rsOrdinal;
               if(!var10) {
                  int var13 = var9.decoration;
                  boolean var12 = var13 == WorldMapDecorationType.field2839.rsOrdinal;
                  if(!var12) {
                     continue;
                  }
               }

               LocType var14 = GrandExchangeOffer.method1736(var9.objectDefinitionId);
               if(var14.mapSceneId != -1) {
                  if(var14.mapSceneId != 46 && var14.mapSceneId != 52) {
                     var4[var14.mapSceneId].method4291(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile * 2, this.pixelsPerTile * 2);
                  } else {
                     var4[var14.mapSceneId].method4291(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile * 2 + 1, this.pixelsPerTile * 2 + 1);
                  }
               }
            }
         }
      }

   }

   @ObfuscatedName("t")
   @ObfuscatedSignature(
      signature = "(Ljava/util/HashSet;IIB)V",
      garbageValue = "1"
   )
   void method5460(HashSet var1, int var2, int var3) {
      Iterator var4 = this.field263.values().iterator();

      while(var4.hasNext()) {
         MapIcon var5 = (MapIcon)var4.next();
         if(var5.method4064()) {
            int var6 = var5.vmethod4060();
            if(var1.contains(Integer.valueOf(var6))) {
               MapElementType var7 = MapLabel.method2858(var6);
               this.method5451(var7, var5.field296, var5.field299, var2, var3);
            }
         }
      }

      this.method5527(var1, var2, var3);
   }

   @ObfuscatedName("ah")
   @ObfuscatedSignature(
      signature = "(Ljava/util/HashSet;IIB)V",
      garbageValue = "125"
   )
   void method5527(HashSet var1, int var2, int var3) {
      Iterator var4 = this.field264.iterator();

      while(var4.hasNext()) {
         MapIcon var5 = (MapIcon)var4.next();
         if(var5.method4064()) {
            MapElementType var6 = MapLabel.method2858(var5.vmethod4060());
            if(var6 != null && var1.contains(Integer.valueOf(var6.method1499()))) {
               this.method5451(var6, var5.field296, var5.field299, var2, var3);
            }
         }
      }

   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      signature = "(Lat;IIFI)V",
      garbageValue = "-1197848968"
   )
   void method5452(MapIcon var1, int var2, int var3, float var4) {
      MapElementType var5 = MapLabel.method2858(var1.vmethod4060());
      this.method5464(var5, var2, var3);
      this.method5454(var1, var5, var2, var3, var4);
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      signature = "(Ljd;IIB)V",
      garbageValue = "2"
   )
   void method5464(MapElementType var1, int var2, int var3) {
      SpritePixels var4 = var1.method1483(false);
      if(var4 != null) {
         int var5 = this.method5428(var4, var1.horizontalAlignment);
         int var6 = this.method5457(var4, var1.verticalAlignment);
         var4.method1311(var5 + var2, var3 + var6);
      }

   }

   @ObfuscatedName("y")
   @ObfuscatedSignature(
      signature = "(IILw;Lar;Laf;I)V",
      garbageValue = "1627636006"
   )
   void method5444(int var1, int var2, class71 var3, class258 var4, class57 var5) {
      int var6 = var3.field188[0][var1][var2] - 1;
      int var7 = var3.field185[0][var1][var2] - 1;
      if(var6 == -1 && var7 == -1) {
         Rasterizer2D.method692(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, this.pixelsPerTile, this.field253);
      }

      int var8 = 16711935;
      int var9;
      if(var7 != -1) {
         int var10 = this.field253;
         Overlay var12 = (Overlay)Overlay.overlays.method635((long)var7);
         Overlay var11;
         if(var12 != null) {
            var11 = var12;
         } else {
            byte[] var13 = Overlay.overlay_ref.method4115(4, var7, 648079912);
            var12 = new Overlay();
            if(var13 != null) {
               var12.method6389(new Packet(var13), var7);
            }

            var12.method6395();
            Overlay.overlays.method628(var12, (long)var7);
            var11 = var12;
         }

         if(var11 == null) {
            var9 = var10;
         } else if(var11.otherRgbColor >= 0) {
            var9 = var11.otherRgbColor | -16777216;
         } else {
            int var14;
            int var22;
            if(var11.texture >= 0) {
               var14 = Graphics3D.textureLoader.vmethod1151(var11.texture);
               byte var15 = 96;
               int var21;
               if(var14 == -2) {
                  var21 = 12345678;
               } else if(var14 == -1) {
                  if(var15 < 0) {
                     var15 = 0;
                  } else if(var15 > 127) {
                     var15 = 127;
                  }

                  var22 = 127 - var15;
                  var21 = var22;
               } else {
                  var22 = var15 * (var14 & 127) / 128;
                  if(var22 < 2) {
                     var22 = 2;
                  } else if(var22 > 126) {
                     var22 = 126;
                  }

                  var21 = var22 + (var14 & 65408);
               }

               var9 = Graphics3D.colorPalette[var21] | -16777216;
            } else if(var11.color == 16711935) {
               var9 = var10;
            } else {
               var14 = var11.hue;
               var22 = var11.saturation;
               int var16 = var11.lightness;
               if(var16 > 179) {
                  var22 /= 2;
               }

               if(var16 > 192) {
                  var22 /= 2;
               }

               if(var16 > 217) {
                  var22 /= 2;
               }

               if(var16 > 243) {
                  var22 /= 2;
               }

               int var17 = (var22 / 32 << 7) + var16 / 2 + (var14 / 4 << 10);
               byte var19 = 96;
               int var18;
               if(var17 == -2) {
                  var18 = 12345678;
               } else {
                  int var23;
                  if(var17 == -1) {
                     if(var19 < 0) {
                        var19 = 0;
                     } else if(var19 > 127) {
                        var19 = 127;
                     }

                     var23 = 127 - var19;
                     var18 = var23;
                  } else {
                     var23 = var19 * (var17 & 127) / 128;
                     if(var23 < 2) {
                        var23 = 2;
                     } else if(var23 > 126) {
                        var23 = 126;
                     }

                     var18 = var23 + (var17 & 65408);
                  }
               }

               var9 = Graphics3D.colorPalette[var18] | -16777216;
            }
         }

         var8 = var9;
      }

      if(var7 > -1 && var3.field178[0][var1][var2] == 0) {
         Rasterizer2D.method692(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, this.pixelsPerTile, var8);
      } else {
         var9 = this.method5446(var1, var2, var3, var5);
         if(var7 == -1) {
            Rasterizer2D.method692(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, this.pixelsPerTile, var9);
         } else {
            var4.method4829(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), var9, var8, this.pixelsPerTile, this.pixelsPerTile, var3.field178[0][var1][var2], var3.field179[0][var1][var2]);
         }
      }
   }

   @ObfuscatedName("ar")
   @ObfuscatedSignature(
      signature = "(IB)Lay;",
      garbageValue = "25"
   )
   MapLabel method5458(int var1) {
      MapElementType var2 = MapLabel.method2858(var1);
      return this.method5459(var2);
   }

   @ObfuscatedName("aa")
   @ObfuscatedSignature(
      signature = "(IILw;I)V",
      garbageValue = "1097213498"
   )
   void method5448(int var1, int var2, class71 var3) {
      for(int var4 = 0; var4 < var3.field168; ++var4) {
         WorldMapDecoration[] var5 = var3.decorations[var4][var1][var2];
         if(var5 != null && var5.length != 0) {
            WorldMapDecoration[] var6 = var5;

            for(int var7 = 0; var7 < var6.length; ++var7) {
               WorldMapDecoration var8 = var6[var7];
               int var10 = var8.decoration;
               boolean var9 = var10 >= WorldMapDecorationType.field2856.rsOrdinal && var10 <= WorldMapDecorationType.field2850.rsOrdinal || var10 == WorldMapDecorationType.field2859.rsOrdinal;
               if(var9) {
                  LocType var11 = GrandExchangeOffer.method1736(var8.objectDefinitionId);
                  int var12 = var11.field3471 != 0?-3407872:-3355444;
                  if(var8.decoration == WorldMapDecorationType.field2856.rsOrdinal) {
                     this.method5521(var1, var2, var8.rotation, var12);
                  }

                  if(var8.decoration == WorldMapDecorationType.field2841.rsOrdinal) {
                     this.method5521(var1, var2, var8.rotation, -3355444);
                     this.method5521(var1, var2, var8.rotation + 1, var12);
                  }

                  if(var8.decoration == WorldMapDecorationType.field2850.rsOrdinal) {
                     if(var8.rotation == 0) {
                        Rasterizer2D.method698(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), 1, var12);
                     }

                     if(var8.rotation == 1) {
                        Rasterizer2D.method698(this.pixelsPerTile * var1 + this.pixelsPerTile - 1, this.pixelsPerTile * (63 - var2), 1, var12);
                     }

                     if(var8.rotation == 2) {
                        Rasterizer2D.method698(this.pixelsPerTile * var1 + this.pixelsPerTile - 1, this.pixelsPerTile * (63 - var2) + this.pixelsPerTile - 1, 1, var12);
                     }

                     if(var8.rotation == 3) {
                        Rasterizer2D.method698(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2) + this.pixelsPerTile - 1, 1, var12);
                     }
                  }

                  if(var8.decoration == WorldMapDecorationType.field2859.rsOrdinal) {
                     int var13 = var8.rotation % 2;
                     int var14;
                     if(var13 == 0) {
                        for(var14 = 0; var14 < this.pixelsPerTile; ++var14) {
                           Rasterizer2D.method698(var14 + this.pixelsPerTile * var1, (64 - var2) * this.pixelsPerTile - 1 - var14, 1, var12);
                        }
                     } else {
                        for(var14 = 0; var14 < this.pixelsPerTile; ++var14) {
                           Rasterizer2D.method698(var14 + this.pixelsPerTile * var1, var14 + this.pixelsPerTile * (63 - var2), 1, var12);
                        }
                     }
                  }
               }
            }
         }
      }

   }

   @ObfuscatedName("az")
   @ObfuscatedSignature(
      signature = "(IIIIB)V",
      garbageValue = "1"
   )
   void method5521(int var1, int var2, int var3, int var4) {
      var3 %= 4;
      if(var3 == 0) {
         Rasterizer2D.method757(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, var4);
      }

      if(var3 == 1) {
         Rasterizer2D.method698(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, var4);
      }

      if(var3 == 2) {
         Rasterizer2D.method757(this.pixelsPerTile + this.pixelsPerTile * var1 - 1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, var4);
      }

      if(var3 == 3) {
         Rasterizer2D.method698(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2) + this.pixelsPerTile - 1, this.pixelsPerTile, var4);
      }

   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      signature = "(Ljava/util/HashSet;Ljava/util/List;I)V",
      garbageValue = "761583671"
   )
   void method5431(HashSet var1, List var2) {
      this.field263.clear();
      Iterator var3 = var1.iterator();

      while(var3.hasNext()) {
         class232 var4 = (class232)var3.next();
         if(var4.method1007() == this.field256 && var4.method1008() == this.field257) {
            this.field259.add(var4);
         }
      }

      this.method5435(var2);
   }

   @ObfuscatedName("u")
   @ObfuscatedSignature(
      signature = "(IILw;Lar;[Llv;I)V",
      garbageValue = "-1537372179"
   )
   void method5513(int var1, int var2, class71 var3, class258 var4, IndexedSprite[] var5) {
      this.method5448(var1, var2, var3);
      this.method5447(var1, var2, var3, var5);
   }

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      signature = "(IILjava/util/HashSet;IB)V",
      garbageValue = "1"
   )
   void method5449(int var1, int var2, HashSet var3, int var4) {
      float var5 = (float)var4 / 64.0F;
      float var6 = var5 / 2.0F;
      Iterator var7 = this.field263.entrySet().iterator();

      while(var7.hasNext()) {
         Entry var8 = (Entry)var7.next();
         CoordGrid var9 = (CoordGrid)var8.getKey();
         int var10 = (int)((float)var1 + (float)var9.x * var5 - var6);
         int var11 = (int)((float)(var2 + var4) - var5 * (float)var9.y - var6);
         MapIcon var12 = (MapIcon)var8.getValue();
         if(var12 != null && var12.method4064()) {
            var12.field296 = var10;
            var12.field299 = var11;
            MapElementType var13 = MapLabel.method2858(var12.vmethod4060());
            if(!var3.contains(Integer.valueOf(var13.method1499()))) {
               this.method5452(var12, var10, var11, var5);
            }
         }
      }

   }

   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "(IIIB)V",
      garbageValue = "8"
   )
   void method5429(int var1, int var2, int var3) {
      SpritePixels var4 = class333.method6435(this.field256, this.field257, this.pixelsPerTile);
      if(var4 != null) {
         if(var3 == this.pixelsPerTile * 64) {
            var4.method1331(var1, var2);
         } else {
            var4.method1302(var1, var2, var3, var3);
         }

      }
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "384592949"
   )
   public static void method5555() {
      Spotanim.spotanims.method629();
      Spotanim.SpotAnimationDefinition_cachedModels.method629();
   }

   @ObfuscatedName("js")
   @ObfuscatedSignature(
      signature = "(Lia;S)V",
      garbageValue = "13492"
   )
   static void method5554(ComponentType var0) {
      if(var0.loopCycle == client.field658) {
         client.field795[var0.boundsIndex] = true;
      }

   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(Liz;Ljava/lang/String;Ljava/lang/String;I)[Llv;",
      garbageValue = "1016807882"
   )
   public static IndexedSprite[] method5556(Js5Index var0, String var1, String var2) {
      int var3 = var0.method4132(var1);
      int var4 = var0.method4137(var3, var2);
      IndexedSprite[] var5;
      if(!class205.method4006(var0, var3, var4)) {
         var5 = null;
      } else {
         IndexedSprite[] var7 = new IndexedSprite[class96.indexedSpriteCount];

         for(int var8 = 0; var8 < class96.indexedSpriteCount; ++var8) {
            IndexedSprite var9 = var7[var8] = new IndexedSprite();
            var9.originalWidth = class96.indexedSpriteWidth;
            var9.originalHeight = class96.indexedSpriteHeight;
            var9.offsetX = class96.indexedSpriteOffsetXs[var8];
            var9.offsetY = GameCanvas.indexedSpriteOffsetYs[var8];
            var9.width = class96.indexSpriteWidths[var8];
            var9.height = class96.indexedSpriteHeights[var8];
            var9.palette = class96.indexedSpritePalette;
            var9.pixels = class241.spritePixels[var8];
         }

         class43.method648();
         var5 = var7;
      }

      return var5;
   }

   @ObfuscatedName("t")
   @ObfuscatedSignature(
      signature = "(III)I",
      garbageValue = "2074293123"
   )
   static final int method5553(int var0, int var1) {
      int var2 = class31.method524(var0 - 1, var1 - 1) + class31.method524(var0 + 1, var1 - 1) + class31.method524(var0 - 1, 1 + var1) + class31.method524(var0 + 1, var1 + 1);
      int var3 = class31.method524(var0 - 1, var1) + class31.method524(1 + var0, var1) + class31.method524(var0, var1 - 1) + class31.method524(var0, var1 + 1);
      int var4 = class31.method524(var0, var1);
      return var2 / 16 + var3 / 8 + var4 / 4;
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      signature = "(Liz;Ljava/lang/String;Ljava/lang/String;I)Llv;",
      garbageValue = "-930985732"
   )
   public static IndexedSprite method5496(Js5Index var0, String var1, String var2) {
      int var3 = var0.method4132(var1);
      int var4 = var0.method4137(var3, var2);
      IndexedSprite var5;
      if(!class205.method4006(var0, var3, var4)) {
         var5 = null;
      } else {
         IndexedSprite var7 = new IndexedSprite();
         var7.originalWidth = class96.indexedSpriteWidth;
         var7.originalHeight = class96.indexedSpriteHeight;
         var7.offsetX = class96.indexedSpriteOffsetXs[0];
         var7.offsetY = GameCanvas.indexedSpriteOffsetYs[0];
         var7.width = class96.indexSpriteWidths[0];
         var7.height = class96.indexedSpriteHeights[0];
         var7.palette = class96.indexedSpritePalette;
         var7.pixels = class241.spritePixels[0];
         class43.method648();
         var5 = var7;
      }

      return var5;
   }
}
