package net.runelite.standalone;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import net.runelite.api.Point;
import net.runelite.api.coords.WorldPoint;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.api.RSRenderOverview;
import net.runelite.rs.api.RSWorldMapData;
import net.runelite.rs.api.RSWorldMapManager;

@ObfuscatedName("lq")
public class WorldMap implements RSRenderOverview {
   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "Lkw;"
   )
   static final FontName field3960;
   @ObfuscatedName("b")
   @ObfuscatedSignature(
      signature = "Lkw;"
   )
   static final FontName field3972;
   @ObfuscatedName("n")
   @ObfuscatedSignature(
      signature = "Lkw;"
   )
   static final FontName field3957;
   @ObfuscatedName("ak")
   HashSet field3995;
   @ObfuscatedName("bn")
   @ObfuscatedGetter(
      intValue = 292217987
   )
   int field4007;
   @ObfuscatedName("aq")
   @ObfuscatedGetter(
      intValue = 276263011
   )
   int field3989;
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "[Llv;"
   )
   IndexedSprite[] field3961;
   @ObfuscatedName("v")
   @ObfuscatedSignature(
      signature = "Lav;"
   )
   WorldMapManager worldMapManager;
   @ObfuscatedName("r")
   @ObfuscatedSignature(
      signature = "Lkt;"
   )
   Font field4003;
   @ObfuscatedName("af")
   @ObfuscatedGetter(
      intValue = 1734018001
   )
   int worldMapDisplayWidth;
   @ObfuscatedName("al")
   @ObfuscatedGetter(
      intValue = -1830588467
   )
   int field3990;
   @ObfuscatedName("ae")
   @ObfuscatedGetter(
      intValue = -929811291
   )
   int field3982;
   @ObfuscatedName("k")
   @ObfuscatedSignature(
      signature = "Lag;"
   )
   WorldMapData field3994;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = -1162073603
   )
   int worldMapX;
   @ObfuscatedName("bz")
   Iterator field4000;
   @ObfuscatedName("bg")
   @ObfuscatedSignature(
      signature = "Lld;"
   )
   SpritePixels field3948;
   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "Liz;"
   )
   Js5Index field3955;
   @ObfuscatedName("br")
   @ObfuscatedGetter(
      intValue = -1862450189
   )
   int field3962;
   @ObfuscatedName("bd")
   List field3956;
   @ObfuscatedName("au")
   @ObfuscatedGetter(
      intValue = 137845797
   )
   int field3984;
   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "Liz;"
   )
   Js5Index field3954;
   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "Liz;"
   )
   Js5Index worldmapdata;
   @ObfuscatedName("ag")
   float worldMapZoomTarget;
   @ObfuscatedName("aj")
   @ObfuscatedGetter(
      intValue = 341855601
   )
   int field3985;
   @ObfuscatedName("aw")
   @ObfuscatedGetter(
      intValue = -1451304293
   )
   int field3959;
   @ObfuscatedName("o")
   HashMap worldMapDataByIdentifier;
   @ObfuscatedName("bp")
   @ObfuscatedSignature(
      signature = "Lif;"
   )
   CoordGrid field4002;
   @ObfuscatedName("ai")
   @ObfuscatedGetter(
      longValue = -3815897326315943185L
   )
   long field3988;
   @ObfuscatedName("z")
   float worldMapZoom;
   @ObfuscatedName("av")
   @ObfuscatedGetter(
      intValue = 265619751
   )
   int field3983;
   @ObfuscatedName("c")
   @ObfuscatedGetter(
      intValue = -1010057293
   )
   int worldMapTargetX;
   @ObfuscatedName("bk")
   @ObfuscatedGetter(
      intValue = 1467869341
   )
   int field3958;
   @ObfuscatedName("t")
   HashMap field3952;
   @ObfuscatedName("ay")
   @ObfuscatedGetter(
      intValue = -337859149
   )
   int worldMapDisplayHeight;
   @ObfuscatedName("ah")
   @ObfuscatedGetter(
      intValue = 1451062415
   )
   int field3966;
   @ObfuscatedName("an")
   boolean field4004;
   @ObfuscatedName("be")
   final int[] field3998;
   @ObfuscatedName("i")
   @ObfuscatedGetter(
      intValue = -430412355
   )
   int worldMapY;
   @ObfuscatedName("bv")
   public boolean field3967;
   @ObfuscatedName("at")
   HashSet field3981;
   @ObfuscatedName("y")
   @ObfuscatedSignature(
      signature = "Lag;"
   )
   WorldMapData worldMapData;
   @ObfuscatedName("am")
   boolean field3996;
   @ObfuscatedName("bf")
   @ObfuscatedGetter(
      intValue = -513481129
   )
   int field3997;
   @ObfuscatedName("as")
   @ObfuscatedGetter(
      intValue = 2007235211
   )
   int field3986;
   @ObfuscatedName("ax")
   HashSet field3993;
   @ObfuscatedName("d")
   @ObfuscatedSignature(
      signature = "Llw;"
   )
   class247 field3964;
   @ObfuscatedName("ar")
   @ObfuscatedGetter(
      intValue = -669721695
   )
   int field3987;
   @ObfuscatedName("ad")
   HashSet field3992;
   @ObfuscatedName("j")
   @ObfuscatedGetter(
      intValue = 1554339443
   )
   int worldMapTargetY;
   @ObfuscatedName("aa")
   @ObfuscatedGetter(
      intValue = 2122982383
   )
   int worldMapDisplayX;
   @ObfuscatedName("bl")
   @ObfuscatedGetter(
      intValue = -440766419
   )
   int field4008;
   @ObfuscatedName("az")
   boolean field3991;
   @ObfuscatedName("ap")
   HashSet field3950;
   @ObfuscatedName("bi")
   HashSet field4001;
   @ObfuscatedName("u")
   @ObfuscatedSignature(
      signature = "Lag;"
   )
   WorldMapData field3963;
   @ObfuscatedName("ab")
   @ObfuscatedGetter(
      intValue = -1551657967
   )
   int worldMapDisplayY;

   static {
      field3972 = FontName.field3747;
      field3957 = FontName.field3745;
      field3960 = FontName.field3755;
   }

   public WorldMap() {
      this.worldMapTargetX = -1;
      this.worldMapTargetY = -1;
      this.worldMapDisplayWidth = -1;
      this.worldMapDisplayHeight = -1;
      this.worldMapDisplayX = -1;
      this.worldMapDisplayY = -1;
      this.field3966 = 3;
      this.field3959 = 50;
      this.field4004 = false;
      this.field3981 = null;
      this.field3982 = -1;
      this.field3983 = -1;
      this.field3984 = -1;
      this.field3985 = -1;
      this.field3986 = -1;
      this.field3987 = -1;
      this.field3991 = true;
      this.field3992 = new HashSet();
      this.field3993 = new HashSet();
      this.field3950 = new HashSet();
      this.field3995 = new HashSet();
      this.field3996 = false;
      this.field3997 = 0;
      this.field3998 = new int[]{1008, 1009, 1010, 1011, 1012};
      this.field4001 = new HashSet();
      this.field4002 = null;
      this.field3967 = false;
      this.field3962 = -1;
      this.field4007 = -1;
      this.field4008 = -1;
      this.rl$$init();
   }

   @ObfuscatedName("ak")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "-49"
   )
   public void method2905() {
      this.field3959 = 50;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1442221252"
   )
   void method2868() {
      if(WorldMapType1.field216 != null) {
         this.worldMapZoom = this.worldMapZoomTarget;
      } else {
         if(this.worldMapZoom < this.worldMapZoomTarget) {
            this.worldMapZoom = Math.min(this.worldMapZoomTarget, this.worldMapZoom + this.worldMapZoom / 30.0F);
         }

         if(this.worldMapZoom > this.worldMapZoomTarget) {
            this.worldMapZoom = Math.max(this.worldMapZoomTarget, this.worldMapZoom - this.worldMapZoom / 30.0F);
         }

      }
   }

   @ObfuscatedName("bn")
   @ObfuscatedSignature(
      signature = "(ILif;S)Lif;",
      garbageValue = "-3309"
   )
   public CoordGrid method2918(int var1, CoordGrid var2) {
      if(!this.field3964.method4663()) {
         return null;
      } else if(!this.worldMapManager.method2298()) {
         return null;
      } else if(!this.worldMapData.method1705(var2.x, var2.y)) {
         return null;
      } else {
         HashMap var3 = this.worldMapManager.method2299();
         List var4 = (List)var3.get(Integer.valueOf(var1));
         if(var4 != null && !var4.isEmpty()) {
            MapIcon var5 = null;
            int var6 = -1;
            Iterator var7 = var4.iterator();

            while(true) {
               MapIcon var8;
               int var11;
               do {
                  if(!var7.hasNext()) {
                     return var5.field297;
                  }

                  var8 = (MapIcon)var7.next();
                  int var9 = var8.field297.x - var2.x;
                  int var10 = var8.field297.y - var2.y;
                  var11 = var10 * var10 + var9 * var9;
                  if(var11 == 0) {
                     return var8.field297;
                  }
               } while(var11 >= var6 && var5 != null);

               var5 = var8;
               var6 = var11;
            }
         } else {
            return null;
         }
      }
   }

   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "379128806"
   )
   public int method2897() {
      return this.worldMapData == null?-1:this.worldMapX + this.worldMapData.method1689() * 64;
   }

   @ObfuscatedName("bb")
   @ObfuscatedSignature(
      signature = "(S)Lat;",
      garbageValue = "-8213"
   )
   public MapIcon method2920() {
      if(!this.field3964.method4663()) {
         return null;
      } else if(!this.worldMapManager.method2298()) {
         return null;
      } else {
         HashMap var1 = this.worldMapManager.method2299();
         this.field3956 = new LinkedList();
         Iterator var2 = var1.values().iterator();

         while(var2.hasNext()) {
            List var3 = (List)var2.next();
            this.field3956.addAll(var3);
         }

         this.field4000 = this.field3956.iterator();
         return this.method2921();
      }
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(I)Lag;",
      garbageValue = "-1208579130"
   )
   public WorldMapData method3028() {
      return this.worldMapData;
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      signature = "(IIIIII)V",
      garbageValue = "-1641186121"
   )
   public void method2882(int var1, int var2, int var3, int var4, int var5) {
      int[] var6 = new int[4];
      Rasterizer2D.method686(var6);
      Rasterizer2D.method684(var1, var2, var3 + var1, var2 + var4);
      Rasterizer2D.method692(var1, var2, var3, var4, -16777216);
      int var7 = this.field3964.method4656();
      if(var7 < 100) {
         this.method2887(var1, var2, var3, var4, var7);
      } else {
         if(!this.worldMapManager.method2298()) {
            this.worldMapManager.method2291(this.worldmapdata, this.worldMapData.method1653(), client.isMembers);
            if(!this.worldMapManager.method2298()) {
               return;
            }
         }

         if(this.field3981 != null) {
            ++this.field3983;
            if(this.field3983 % this.field3959 == 0) {
               this.field3983 = 0;
               ++this.field3982;
            }

            if(this.field3982 >= this.field3966 && !this.field4004) {
               this.field3981 = null;
            }
         }

         int var8 = (int)Math.ceil((double)((float)var3 / this.worldMapZoom));
         int var9 = (int)Math.ceil((double)((float)var4 / this.worldMapZoom));
         this.worldMapManager.method2301(this.worldMapX - var8 / 2, this.worldMapY - var9 / 2, var8 / 2 + this.worldMapX, var9 / 2 + this.worldMapY, var1, var2, var3 + var1, var2 + var4);
         if(!this.field3996) {
            boolean var10 = false;
            if(var5 - this.field3997 > 100) {
               this.field3997 = var5;
               var10 = true;
            }

            this.worldMapManager.method2294(this.worldMapX - var8 / 2, this.worldMapY - var9 / 2, var8 / 2 + this.worldMapX, var9 / 2 + this.worldMapY, var1, var2, var3 + var1, var2 + var4, this.field3995, this.field3981, this.field3983, this.field3959, var10);
         }

         this.method2884(var1, var2, var3, var4, var8, var9);
         if(class177.method2854() && this.field3967 && this.field4002 != null) {
            this.field4003.method6165("Coord: " + this.field4002, Rasterizer2D.draw_region_x + 10, Rasterizer2D.drawingAreaTop + 20, 16776960, -1);
         }

         this.worldMapDisplayWidth = var8;
         this.worldMapDisplayHeight = var9;
         this.worldMapDisplayX = var1;
         this.worldMapDisplayY = var2;
         Rasterizer2D.method687(var6);
      }
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "(IIIZB)V",
      garbageValue = "-31"
   )
   public void method2874(int var1, int var2, int var3, boolean var4) {
      WorldMapData var5 = this.method2873(var1, var2, var3);
      if(var5 == null) {
         if(!var4) {
            return;
         }

         var5 = this.field3963;
      }

      boolean var6 = false;
      if(var5 != this.field3994 || var4) {
         this.field3994 = var5;
         this.method2929(var5);
         var6 = true;
      }

      if(var6 || var4) {
         this.method2881(var1, var2, var3);
      }

   }

   @ObfuscatedName("r")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "-1958030248"
   )
   public void method2935(int var1) {
      WorldMapData var2 = this.method3040(var1);
      if(var2 != null) {
         this.method2929(var2);
      }

   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "356985113"
   )
   public int method2898() {
      return this.worldMapData == null?-1:this.worldMapY + this.worldMapData.method1659() * 64;
   }

   @ObfuscatedName("ae")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-374473077"
   )
   public void method2965() {
      this.field3964.method4664();
   }

   @ObfuscatedName("k")
   @ObfuscatedSignature(
      signature = "(IIIB)V",
      garbageValue = "-90"
   )
   void method2881(int var1, int var2, int var3) {
      if(this.worldMapData != null) {
         int[] var4 = this.worldMapData.method1648(var1, var2, var3);
         if(var4 == null) {
            var4 = this.worldMapData.method1648(this.worldMapData.method1662(), this.worldMapData.method1661(), this.worldMapData.method1654());
         }

         this.method2870(var4[0] - this.worldMapData.method1689() * 64, var4[1] - this.worldMapData.method1659() * 64, true);
         this.worldMapTargetX = -1;
         this.worldMapTargetY = -1;
         this.worldMapZoom = this.method2888(this.worldMapData.method1656());
         this.worldMapZoomTarget = this.worldMapZoom;
         this.field3956 = null;
         this.field4000 = null;
         this.worldMapManager.method2315();
      }
   }

   @ObfuscatedName("bz")
   @ObfuscatedSignature(
      signature = "(IZI)V",
      garbageValue = "1488452307"
   )
   public void method2896(int var1, boolean var2) {
      if(!var2) {
         this.field3992.add(Integer.valueOf(var1));
      } else {
         this.field3992.remove(Integer.valueOf(var1));
      }

      this.method2890();
   }

   @ObfuscatedName("bg")
   @ObfuscatedSignature(
      signature = "(II)Z",
      garbageValue = "-1851148601"
   )
   public boolean method2915(int var1) {
      return !this.field3993.contains(Integer.valueOf(var1));
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "1794990122"
   )
   final void method2877() {
      this.field3987 = -1;
      this.field3986 = -1;
      this.field3985 = -1;
      this.field3984 = -1;
   }

   @ObfuscatedName("br")
   @ObfuscatedSignature(
      signature = "(IIIIIII)V",
      garbageValue = "-2005512791"
   )
   public void method2917(int var1, int var2, int var3, int var4, int var5, int var6) {
      if(this.field3964.method4663()) {
         int var7 = (int)Math.ceil((double)((float)var3 / this.worldMapZoom));
         int var8 = (int)Math.ceil((double)((float)var4 / this.worldMapZoom));
         List var9 = this.worldMapManager.method2296(this.worldMapX - var7 / 2 - 1, this.worldMapY - var8 / 2 - 1, var7 / 2 + this.worldMapX + 1, var8 / 2 + this.worldMapY + 1, var1, var2, var3, var4, var5, var6);
         if(!var9.isEmpty()) {
            Iterator var10 = var9.iterator();

            boolean var13;
            do {
               if(!var10.hasNext()) {
                  return;
               }

               MapIcon var11 = (MapIcon)var10.next();
               MapElementType var12 = MapLabel.method2858(var11.vmethod4060());
               var13 = false;

               for(int var14 = this.field3998.length - 1; var14 >= 0; --var14) {
                  if(var12.ops[var14] != null) {
                     class290.method5964(var12.ops[var14], var12.opbase, this.field3998[var14], var11.vmethod4060(), var11.field298.method886(), var11.field297.method886());
                     var13 = true;
                  }
               }
            } while(!var13);

         }
      }
   }

   @ObfuscatedName("bd")
   @ObfuscatedSignature(
      signature = "(ZI)V",
      garbageValue = "1425308680"
   )
   public void method2959(boolean var1) {
      this.field3996 = !var1;
   }

   @ObfuscatedName("au")
   @ObfuscatedSignature(
      signature = "(II)Lag;",
      garbageValue = "1334754880"
   )
   public WorldMapData method3040(int var1) {
      Iterator var2 = this.worldMapDataByIdentifier.values().iterator();

      WorldMapData var3;
      do {
         if(!var2.hasNext()) {
            return null;
         }

         var3 = (WorldMapData)var2.next();
      } while(var3.method1682() != var1);

      return var3;
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(IIZZI)V",
      garbageValue = "-1094523023"
   )
   public void method2866(int var1, int var2, boolean var3, boolean var4) {
      long var5 = class318.method6317();
      this.method2937(var1, var2, var4, var5);
      if(!this.method2872() && (var4 || var3)) {
         if(var4) {
            this.field3986 = var1;
            this.field3987 = var2;
            this.field3984 = this.worldMapX;
            this.field3985 = this.worldMapY;
         }

         if(this.field3984 != -1) {
            int var7 = var1 - this.field3986;
            int var8 = var2 - this.field3987;
            this.method2870(this.field3984 - (int)((float)var7 / this.worldMapZoomTarget), (int)((float)var8 / this.worldMapZoomTarget) + this.field3985, false);
         }
      } else {
         this.method2877();
      }

      if(var4) {
         this.field3988 = var5;
         this.field3989 = var1;
         this.field3990 = var2;
      }

   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(IIZI)V",
      garbageValue = "33340347"
   )
   final void method2870(int var1, int var2, boolean var3) {
      this.worldMapX = var1;
      this.worldMapY = var2;
      class318.method6317();
      if(var3) {
         this.method2877();
      }

   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "2101868184"
   )
   void method2869() {
      if(this.method2872()) {
         int var1 = this.worldMapTargetX - this.worldMapX;
         int var2 = this.worldMapTargetY - this.worldMapY;
         if(var1 != 0) {
            var1 /= Math.min(8, Math.abs(var1));
         }

         if(var2 != 0) {
            var2 /= Math.min(8, Math.abs(var2));
         }

         this.method2870(var1 + this.worldMapX, var2 + this.worldMapY, true);
         if(this.worldMapX == this.worldMapTargetX && this.worldMapY == this.worldMapTargetY) {
            this.worldMapTargetX = -1;
            this.worldMapTargetY = -1;
         }

      }
   }

   @ObfuscatedName("b")
   @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "1254930453"
   )
   boolean method2872() {
      return this.worldMapTargetX != -1 && this.worldMapTargetY != -1;
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      signature = "(III)V",
      garbageValue = "-1908432938"
   )
   public void method2893(int var1, int var2) {
      if(this.worldMapData != null && this.worldMapData.method1705(var1, var2)) {
         this.worldMapTargetX = var1 - this.worldMapData.method1689() * 64;
         this.worldMapTargetY = var2 - this.worldMapData.method1659() * 64;
      }
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      signature = "(IIIIII)V",
      garbageValue = "-591467767"
   )
   void method2887(int var1, int var2, int var3, int var4, int var5) {
      byte var6 = 20;
      int var7 = var3 / 2 + var1;
      int var8 = var4 / 2 + var2 - 18 - var6;
      Rasterizer2D.method692(var1, var2, var3, var4, -16777216);
      Rasterizer2D.method696(var7 - 152, var8, 304, 34, -65536);
      Rasterizer2D.method692(var7 - 150, var8 + 2, var5 * 3, 30, -65536);
      this.field4003.method6222("Loading...", var7, var8 + var6, -1, -1);
   }

   @ObfuscatedName("bo")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "610589765"
   )
   public void method2998(int var1) {
      this.field3981 = new HashSet();
      this.field3982 = 0;
      this.field3983 = 0;

      for(int var2 = 0; var2 < MapElementType.field3322; ++var2) {
         if(MapLabel.method2858(var2) != null && MapLabel.method2858(var2).category == var1) {
            this.field3981.add(Integer.valueOf(MapLabel.method2858(var2).id));
         }
      }

   }

   @ObfuscatedName("o")
   @ObfuscatedSignature(
      signature = "(Lag;B)V",
      garbageValue = "-13"
   )
   void method2929(WorldMapData var1) {
      if(this.worldMapData == null || var1 != this.worldMapData) {
         this.method2962(var1);
         this.method2881(-1, -1, -1);
      }
   }

   @ObfuscatedName("bp")
   @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "1050827509"
   )
   public boolean method2913() {
      return !this.field3996;
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "(Liz;Liz;Liz;Lkt;Ljava/util/HashMap;[Llv;B)V",
      garbageValue = "101"
   )
   public void method2863(Js5Index var1, Js5Index var2, Js5Index var3, Font var4, HashMap var5, IndexedSprite[] var6) {
      this.field3961 = var6;
      this.worldmapdata = var1;
      this.field3954 = var2;
      this.field3955 = var3;
      this.field4003 = var4;
      this.field3952 = new HashMap();
      this.field3952.put(Size.field123, var5.get(field3972));
      this.field3952.put(Size.field126, var5.get(field3957));
      this.field3952.put(Size.field120, var5.get(field3960));
      this.field3964 = new class247(var1);
      int var7 = this.worldmapdata.method4132(WorldMapDataGroup.field309.name);
      int[] var8 = this.worldmapdata.method4126(var7);
      this.worldMapDataByIdentifier = new HashMap(var8.length);

      for(int var9 = 0; var9 < var8.length; ++var9) {
         Packet var10 = new Packet(this.worldmapdata.method4115(var7, var8[var9], 925082241));
         WorldMapData var11 = new WorldMapData();
         var11.method1698(var10, var8[var9]);
         this.worldMapDataByIdentifier.put(var11.method1653(), var11);
         if(var11.method1680()) {
            this.field3963 = var11;
         }
      }

      this.method2929(this.field3963);
      this.field3994 = null;
   }

   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      signature = "(IIIB)V",
      garbageValue = "107"
   )
   public void method2939(int var1, int var2, int var3) {
      if(this.worldMapData != null) {
         int[] var4 = this.worldMapData.method1648(var1, var2, var3);
         if(var4 != null) {
            this.method3025(var4[0], var4[1]);
         }

      }
   }

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      signature = "(IIIB)Lag;",
      garbageValue = "35"
   )
   public WorldMapData method2873(int var1, int var2, int var3) {
      Iterator var4 = this.worldMapDataByIdentifier.values().iterator();

      WorldMapData var5;
      do {
         if(!var4.hasNext()) {
            return null;
         }

         var5 = (WorldMapData)var4.next();
      } while(!var5.method1663(var1, var2, var3));

      return var5;
   }

   @ObfuscatedName("av")
   @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "1906502597"
   )
   public boolean method2891() {
      return this.field3964.method4663();
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      signature = "(IIIIIII)Z",
      garbageValue = "1012984441"
   )
   boolean method2883(int var1, int var2, int var3, int var4, int var5, int var6) {
      return this.field3948 == null?true:(this.field3948.width == var1 && this.field3948.height == var2?(this.worldMapManager.field326 != this.field3958?true:(this.field4008 != client.field797?true:(var3 <= 0 && var4 <= 0?var3 + var1 < var5 || var2 + var4 < var6:true))):true);
   }

   @ObfuscatedName("bk")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "93"
   )
   void method2890() {
      this.field3995.clear();
      this.field3995.addAll(this.field3992);
      this.field3995.addAll(this.field3950);
   }

   @ObfuscatedName("t")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "-2028037976"
   )
   public int method2876() {
      return this.worldMapData == null?-1:this.worldMapData.method1682();
   }

   @ObfuscatedName("ah")
   @ObfuscatedSignature(
      signature = "(IB)V",
      garbageValue = "16"
   )
   public void method2886(int var1) {
      this.worldMapZoomTarget = this.method2888(var1);
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      signature = "(IB)F",
      garbageValue = "-59"
   )
   float method2888(int var1) {
      return var1 == 25?1.0F:(var1 == 37?1.5F:(var1 == 50?2.0F:(var1 == 75?3.0F:(var1 == 100?4.0F:8.0F))));
   }

   public RSWorldMapManager getWorldMapManager() {
      return this.worldMapManager;
   }

   public int getWorldMapX() {
      return this.worldMapX;
   }

   public void setWorldMapPositionTarget(int var1, int var2) {
      this.method2893(var1, var2);
   }

   public int getWorldMapY() {
      return this.worldMapY;
   }

   private void rl$$init() {
   }

   public Point getWorldMapPosition() {
      RSWorldMapManager var1 = this.getWorldMapManager();
      int var2 = this.getWorldMapX() + var1.getSurfaceOffsetX();
      int var3 = this.getWorldMapY() + var1.getSurfaceOffsetY();
      return new Point(var2, var3);
   }

   public void setWorldMapPositionTarget(WorldPoint var1) {
      this.setWorldMapPositionTarget(var1.getX(), var1.getY());
   }

   public RSWorldMapData getWorldMapData() {
      return this.worldMapData;
   }

   public int getWorldMapTargetX() {
      return this.worldMapTargetX;
   }

   public int getWorldMapTargetY() {
      return this.worldMapTargetY;
   }

   public float getWorldMapZoom() {
      return this.worldMapZoom;
   }

   public int getWorldMapDisplayWidth() {
      return this.worldMapDisplayWidth;
   }

   public int getWorldMapDisplayHeight() {
      return this.worldMapDisplayHeight;
   }

   public int getWorldMapDisplayX() {
      return this.worldMapDisplayX;
   }

   public int getWorldMapDisplayY() {
      return this.worldMapDisplayY;
   }

   public void setWorldMapPosition(int var1, int var2, boolean var3) {
      this.method2870(var1, var2, var3);
   }

   public void initializeWorldMap(net.runelite.api.WorldMapData var1) {
      this.method2962((WorldMapData)var1);
   }

   @ObfuscatedName("be")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "-67"
   )
   public void method2909() {
      this.field3981 = null;
   }

   @ObfuscatedName("bv")
   @ObfuscatedSignature(
      signature = "(II)Z",
      garbageValue = "2095239062"
   )
   public boolean method2914(int var1) {
      return !this.field3992.contains(Integer.valueOf(var1));
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "-1389281243"
   )
   public int method2987() {
      return (double)this.worldMapZoomTarget == 1.0D?25:((double)this.worldMapZoomTarget == 1.5D?37:((double)this.worldMapZoomTarget == 2.0D?50:(3.0D == (double)this.worldMapZoomTarget?75:(4.0D == (double)this.worldMapZoomTarget?100:200))));
   }

   @ObfuscatedName("y")
   @ObfuscatedSignature(
      signature = "(Lag;Lif;Lif;ZI)V",
      garbageValue = "1150248219"
   )
   public void method2880(WorldMapData var1, CoordGrid var2, CoordGrid var3, boolean var4) {
      if(var1 != null) {
         if(this.worldMapData == null || var1 != this.worldMapData) {
            this.method2962(var1);
         }

         if(!var4 && this.worldMapData.method1663(var2.z, var2.x, var2.y)) {
            this.method2881(var2.z, var2.x, var2.y);
         } else {
            this.method2881(var3.z, var3.x, var3.y);
         }

      }
   }

   @ObfuscatedName("am")
   @ObfuscatedSignature(
      signature = "(ZI)V",
      garbageValue = "-897528364"
   )
   public void method2906(boolean var1) {
      this.field4004 = var1;
   }

   @ObfuscatedName("bf")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "18124363"
   )
   public void method2867(int var1) {
      this.field3981 = new HashSet();
      this.field3981.add(Integer.valueOf(var1));
      this.field3982 = 0;
      this.field3983 = 0;
   }

   @ObfuscatedName("as")
   @ObfuscatedSignature(
      signature = "(III)V",
      garbageValue = "1917814513"
   )
   public void method3025(int var1, int var2) {
      if(this.worldMapData != null) {
         this.method2870(var1 - this.worldMapData.method1689() * 64, var2 - this.worldMapData.method1659() * 64, true);
         this.worldMapTargetX = -1;
         this.worldMapTargetY = -1;
      }
   }

   @ObfuscatedName("ax")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "328982248"
   )
   public void method3009() {
      this.field3966 = 3;
   }

   @ObfuscatedName("ar")
   @ObfuscatedSignature(
      signature = "(IIII)V",
      garbageValue = "858477588"
   )
   public void method2895(int var1, int var2, int var3) {
      if(this.worldMapData != null) {
         int[] var4 = this.worldMapData.method1648(var1, var2, var3);
         if(var4 != null) {
            this.method2893(var4[0], var4[1]);
         }

      }
   }

   @ObfuscatedName("ad")
   @ObfuscatedSignature(
      signature = "(IB)V",
      garbageValue = "92"
   )
   public void method2902(int var1) {
      if(var1 >= 1) {
         this.field3966 = var1;
      }

   }

   @ObfuscatedName("aa")
   @ObfuscatedSignature(
      signature = "(IIIIIII)V",
      garbageValue = "-1027441618"
   )
   void method2884(int var1, int var2, int var3, int var4, int var5, int var6) {
      if(WorldMapType1.field216 != null) {
         int var7 = 512 / (this.worldMapManager.field326 * 2);
         int var8 = var3 + 512;
         int var9 = var4 + 512;
         float var10 = 1.0F;
         var8 = (int)((float)var8 / var10);
         var9 = (int)((float)var9 / var10);
         int var11 = this.method2897() - var5 / 2 - var7;
         int var12 = this.method2898() - var6 / 2 - var7;
         int var13 = var1 - (var11 + var7 - this.field3962) * this.worldMapManager.field326;
         int var14 = var2 - this.worldMapManager.field326 * (var7 - (var12 - this.field4007));
         if(this.method2883(var8, var9, var13, var14, var3, var4)) {
            if(this.field3948 != null && this.field3948.width == var8 && this.field3948.height == var9) {
               Arrays.fill(this.field3948.pixels, 0);
            } else {
               this.field3948 = new SpritePixels(var8, var9);
            }

            this.field3962 = this.method2897() - var5 / 2 - var7;
            this.field4007 = this.method2898() - var6 / 2 - var7;
            this.field3958 = this.worldMapManager.field326;
            WorldMapType1.field216.method92(this.field3962, this.field4007, this.field3948, (float)this.field3958 / var10);
            this.field4008 = client.field797;
            var13 = var1 - (var11 + var7 - this.field3962) * this.worldMapManager.field326;
            var14 = var2 - this.worldMapManager.field326 * (var7 - (var12 - this.field4007));
         }

         Rasterizer2D.method691(var1, var2, var3, var4, 0, 128);
         if(1.0F == var10) {
            this.field3948.method1321(var13, var14, 192);
         } else {
            this.field3948.method1324(var13, var14, (int)((float)var8 * var10), (int)((float)var9 * var10), 192);
         }
      }

   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-21522833"
   )
   public void method3001() {
      PlayerList.method4739();
   }

   @ObfuscatedName("bl")
   @ObfuscatedSignature(
      signature = "(IILif;Lif;I)V",
      garbageValue = "1597654593"
   )
   public void method2919(int var1, int var2, CoordGrid var3, CoordGrid var4) {
      ScriptEvent var5 = new ScriptEvent();
      MapIconReference var6 = new MapIconReference(var2, var3, var4);
      var5.method1146(new Object[]{var6});
      switch(var1) {
      case 1008:
         var5.method1140(10);
         break;
      case 1009:
         var5.method1140(11);
         break;
      case 1010:
         var5.method1140(12);
         break;
      case 1011:
         var5.method1140(13);
         break;
      case 1012:
         var5.method1140(14);
      }

      class192.method3810(var5);
   }

   @ObfuscatedName("az")
   @ObfuscatedSignature(
      signature = "(B)Lif;",
      garbageValue = "-100"
   )
   public CoordGrid method2899() {
      return this.worldMapData == null?null:this.worldMapData.method1697(this.method2897(), this.method2898());
   }

   @ObfuscatedName("bw")
   @ObfuscatedSignature(
      signature = "(B)Lat;",
      garbageValue = "-46"
   )
   public MapIcon method2921() {
      if(this.field4000 == null) {
         return null;
      } else {
         MapIcon var1;
         do {
            if(!this.field4000.hasNext()) {
               return null;
            }

            var1 = (MapIcon)this.field4000.next();
         } while(var1.vmethod4060() == -1);

         return var1;
      }
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "1279650225"
   )
   public void method2925(int var1) {
      if(var1 >= 1) {
         this.field3959 = var1;
      }

   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "1660805123"
   )
   public int method2974() {
      return this.worldMapDisplayWidth;
   }

   @ObfuscatedName("bi")
   @ObfuscatedSignature(
      signature = "(IZI)V",
      garbageValue = "1833010157"
   )
   public void method2946(int var1, boolean var2) {
      if(!var2) {
         this.field3993.add(Integer.valueOf(var1));
      } else {
         this.field3993.remove(Integer.valueOf(var1));
      }

      for(int var3 = 0; var3 < MapElementType.field3322; ++var3) {
         if(MapLabel.method2858(var3) != null && MapLabel.method2858(var3).category == var1) {
            int var4 = MapLabel.method2858(var3).id;
            if(!var2) {
               this.field3950.add(Integer.valueOf(var4));
            } else {
               this.field3950.remove(Integer.valueOf(var4));
            }
         }
      }

      this.method2890();
   }

   @ObfuscatedName("h")
   void method2937(int var1, int var2, boolean var3, long var4) {
      if(this.worldMapData != null) {
         int var6 = (int)((float)this.worldMapX + ((float)(var1 - this.worldMapDisplayX) - (float)this.method2974() * this.worldMapZoom / 2.0F) / this.worldMapZoom);
         int var7 = (int)((float)this.worldMapY - ((float)(var2 - this.worldMapDisplayY) - (float)this.method3003() * this.worldMapZoom / 2.0F) / this.worldMapZoom);
         this.field4002 = this.worldMapData.method1697(var6 + this.worldMapData.method1689() * 64, var7 + this.worldMapData.method1659() * 64);
         if(this.field4002 != null && var3) {
            int var9;
            int var10;
            if(class177.method2854() && KeyFocusListener.keyPressed[82] && KeyFocusListener.keyPressed[81]) {
               int var13 = this.field4002.x;
               var9 = this.field4002.y;
               var10 = this.field4002.z;
               TcpConnectionMessage var11 = class232.method4535(ClientProt.field2280, client.serverConnection.isaac);
               var11.packetBuffer.method5131(0);
               var11.packetBuffer.method5121(var9);
               var11.packetBuffer.method5232(var10);
               var11.packetBuffer.writeShort(var13);
               client.serverConnection.method18(var11);
            } else {
               boolean var8 = true;
               if(this.field3991) {
                  var9 = var1 - this.field3989;
                  var10 = var2 - this.field3990;
                  if(var4 - this.field3988 > 500L || var9 < -25 || var9 > 25 || var10 < -25 || var10 > 25) {
                     var8 = false;
                  }
               }

               if(var8) {
                  TcpConnectionMessage var12 = class232.method4535(ClientProt.field2290, client.serverConnection.isaac);
                  var12.packetBuffer.method5131(this.field4002.method886());
                  client.serverConnection.method18(var12);
                  this.field3988 = 0L;
               }
            }
         }
      } else {
         this.field4002 = null;
      }

   }

   @ObfuscatedName("u")
   @ObfuscatedSignature(
      signature = "(Lag;I)V",
      garbageValue = "223731905"
   )
   void method2962(WorldMapData var1) {
      this.worldMapData = var1;
      this.worldMapManager = new WorldMapManager(this.field3961, this.field3952, this.field3954, this.field3955);
      this.field3964.method4653(this.worldMapData.method1653());
   }

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      signature = "(IIIIB)V",
      garbageValue = "7"
   )
   public void method2885(int var1, int var2, int var3, int var4) {
      if(this.field3964.method4663()) {
         if(!this.worldMapManager.method2298()) {
            this.worldMapManager.method2291(this.worldmapdata, this.worldMapData.method1653(), client.isMembers);
            if(!this.worldMapManager.method2298()) {
               return;
            }
         }

         this.worldMapManager.method2295(var1, var2, var3, var4, this.field3981, this.field3983, this.field3959);
      }
   }

   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "1567000652"
   )
   public int method3003() {
      return this.worldMapDisplayHeight;
   }

   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "(IIZIIIII)V",
      garbageValue = "1038228069"
   )
   public void method2865(int var1, int var2, boolean var3, int var4, int var5, int var6, int var7) {
      if(this.field3964.method4663()) {
         this.method2868();
         this.method2869();
         if(var3) {
            int var8 = (int)Math.ceil((double)((float)var6 / this.worldMapZoom));
            int var9 = (int)Math.ceil((double)((float)var7 / this.worldMapZoom));
            List var10 = this.worldMapManager.method2296(this.worldMapX - var8 / 2 - 1, this.worldMapY - var9 / 2 - 1, var8 / 2 + this.worldMapX + 1, var9 / 2 + this.worldMapY + 1, var4, var5, var6, var7, var1, var2);
            HashSet var11 = new HashSet();

            Iterator var12;
            MapIcon var13;
            ScriptEvent var14;
            MapIconReference var15;
            for(var12 = var10.iterator(); var12.hasNext(); class192.method3810(var14)) {
               var13 = (MapIcon)var12.next();
               var11.add(var13);
               var14 = new ScriptEvent();
               var15 = new MapIconReference(var13.vmethod4060(), var13.field298, var13.field297);
               var14.method1146(new Object[]{var15, Integer.valueOf(var1), Integer.valueOf(var2)});
               if(this.field4001.contains(var13)) {
                  var14.method1140(17);
               } else {
                  var14.method1140(15);
               }
            }

            var12 = this.field4001.iterator();

            while(var12.hasNext()) {
               var13 = (MapIcon)var12.next();
               if(!var11.contains(var13)) {
                  var14 = new ScriptEvent();
                  var15 = new MapIconReference(var13.vmethod4060(), var13.field298, var13.field297);
                  var14.method1146(new Object[]{var15, Integer.valueOf(var1), Integer.valueOf(var2)});
                  var14.method1140(16);
                  class192.method3810(var14);
               }
            }

            this.field4001 = var11;
         }
      }
   }
}
