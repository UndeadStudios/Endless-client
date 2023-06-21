package net.runelite.standalone;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.api.RSWorldMapManager;

@ObfuscatedName("av")
public final class WorldMapManager implements RSWorldMapManager {
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "[[Laa;"
   )
   WorldMapRegion[][] mapRegions;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = -1531384229
   )
   int field325;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = 1632051693
   )
   int mapSurfaceBaseOffsetX;
   @ObfuscatedName("r")
   @ObfuscatedGetter(
      intValue = 649473809
   )
   int mapSurfaceBaseOffsetY;
   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "Liz;"
   )
   final Js5Index field319;
   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "Lld;"
   )
   SpritePixels field314;
   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "[Llv;"
   )
   IndexedSprite[] field311;
   @ObfuscatedName("p")
   HashMap field317;
   @ObfuscatedName("b")
   @ObfuscatedSignature(
      signature = "Liz;"
   )
   final Js5Index field320;
   @ObfuscatedName("o")
   @ObfuscatedGetter(
      intValue = 384685617
   )
   public int field326;
   @ObfuscatedName("a")
   boolean loaded;
   @ObfuscatedName("n")
   final HashMap field321;
   @ObfuscatedName("t")
   @ObfuscatedGetter(
      intValue = -213701855
   )
   int field323;
   @ObfuscatedName("s")
   boolean loading;
   @ObfuscatedName("h")
   HashMap field315;
   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "Laj;"
   )
   class125 field313;

   @ObfuscatedSignature(
      signature = "([Llv;Ljava/util/HashMap;Liz;Liz;)V"
   )
   public WorldMapManager(IndexedSprite[] var1, HashMap var2, Js5Index var3, Js5Index var4) {
      this.loaded = false;
      this.loading = false;
      this.field317 = new HashMap();
      this.field326 = 0;
      this.field311 = var1;
      this.field321 = var2;
      this.field319 = var3;
      this.field320 = var4;
      this.rl$$init();
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(IIIIIIIIIII)Ljava/util/List;",
      garbageValue = "-367223073"
   )
   public List method2296(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
      LinkedList var11 = new LinkedList();
      if(!this.loaded) {
         return var11;
      } else {
         WorldMapRectangle var12 = this.method2297(var1, var2, var3, var4);
         float var13 = this.method2300(var7, var3 - var1);
         int var14 = (int)(64.0F * var13);
         int var15 = this.mapSurfaceBaseOffsetX + var1;
         int var16 = var2 + this.mapSurfaceBaseOffsetY;

         for(int var17 = var12.worldMapRegionX; var17 < var12.worldMapRegionWidth + var12.worldMapRegionX; ++var17) {
            for(int var18 = var12.worldMapRegionY; var18 < var12.worldMapRegionY + var12.worldMapRegionHeight; ++var18) {
               List var19 = this.mapRegions[var17][var18].method5478(var5 + var14 * (this.mapRegions[var17][var18].field256 * 64 - var15) / 64, var8 + var6 - var14 * (this.mapRegions[var17][var18].field257 * 64 - var16 + 64) / 64, var14, var9, var10);
               if(!var19.isEmpty()) {
                  var11.addAll(var19);
               }
            }
         }

         return var11;
      }
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "(B)Ljava/util/HashMap;",
      garbageValue = "-127"
   )
   public HashMap method2299() {
      this.method2292();
      return this.field315;
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(IIIIIIIILjava/util/HashSet;Ljava/util/HashSet;IIZI)V",
      garbageValue = "371593388"
   )
   public final void method2294(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, HashSet var9, HashSet var10, int var11, int var12, boolean var13) {
      WorldMapRectangle var14 = this.method2297(var1, var2, var3, var4);
      float var15 = this.method2300(var7 - var5, var3 - var1);
      int var16 = (int)(64.0F * var15);
      int var17 = this.mapSurfaceBaseOffsetX + var1;
      int var18 = var2 + this.mapSurfaceBaseOffsetY;

      int var19;
      int var20;
      for(var19 = var14.worldMapRegionX; var19 < var14.worldMapRegionX + var14.worldMapRegionWidth; ++var19) {
         for(var20 = var14.worldMapRegionY; var20 < var14.worldMapRegionHeight + var14.worldMapRegionY; ++var20) {
            if(var13) {
               this.mapRegions[var19][var20].method5434();
            }

            this.mapRegions[var19][var20].method5439(var5 + var16 * (this.mapRegions[var19][var20].field256 * 64 - var17) / 64, var8 - var16 * (this.mapRegions[var19][var20].field257 * 64 - var18 + 64) / 64, var16, var9);
         }
      }

      if(var10 != null && var11 > 0) {
         for(var19 = var14.worldMapRegionX; var19 < var14.worldMapRegionX + var14.worldMapRegionWidth; ++var19) {
            for(var20 = var14.worldMapRegionY; var20 < var14.worldMapRegionHeight + var14.worldMapRegionY; ++var20) {
               this.mapRegions[var19][var20].method5460(var10, var11, var12);
            }
         }
      }

   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(B)Z",
      garbageValue = "-121"
   )
   public boolean method2298() {
      return this.loaded;
   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "(IIIII)Li;",
      garbageValue = "-29659034"
   )
   WorldMapRectangle method2297(int var1, int var2, int var3, int var4) {
      WorldMapRectangle var5 = new WorldMapRectangle(this);
      int var6 = this.mapSurfaceBaseOffsetX + var1;
      int var7 = var2 + this.mapSurfaceBaseOffsetY;
      int var8 = var3 + this.mapSurfaceBaseOffsetX;
      int var9 = var4 + this.mapSurfaceBaseOffsetY;
      int var10 = var6 / 64;
      int var11 = var7 / 64;
      int var12 = var8 / 64;
      int var13 = var9 / 64;
      var5.worldMapRegionWidth = var12 - var10 + 1;
      var5.worldMapRegionHeight = var13 - var11 + 1;
      var5.worldMapRegionX = var10 - this.field313.method1689();
      var5.worldMapRegionY = var11 - this.field313.method1659();
      if(var5.worldMapRegionX < 0) {
         var5.worldMapRegionWidth += var5.worldMapRegionX;
         var5.worldMapRegionX = 0;
      }

      if(var5.worldMapRegionX > this.mapRegions.length - var5.worldMapRegionWidth) {
         var5.worldMapRegionWidth = this.mapRegions.length - var5.worldMapRegionX;
      }

      if(var5.worldMapRegionY < 0) {
         var5.worldMapRegionHeight += var5.worldMapRegionY;
         var5.worldMapRegionY = 0;
      }

      if(var5.worldMapRegionY > this.mapRegions[0].length - var5.worldMapRegionHeight) {
         var5.worldMapRegionHeight = this.mapRegions[0].length - var5.worldMapRegionY;
      }

      var5.worldMapRegionWidth = Math.min(var5.worldMapRegionWidth, this.mapRegions.length);
      var5.worldMapRegionHeight = Math.min(var5.worldMapRegionHeight, this.mapRegions[0].length);
      return var5;
   }

   @ObfuscatedName("b")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "810457602"
   )
   void method2292() {
      if(this.field315 == null) {
         this.field315 = new HashMap();
      }

      this.field315.clear();

      for(int var1 = 0; var1 < this.mapRegions.length; ++var1) {
         for(int var2 = 0; var2 < this.mapRegions[var1].length; ++var2) {
            List var3 = this.mapRegions[var1][var2].method5461();
            Iterator var4 = var3.iterator();

            while(var4.hasNext()) {
               MapIcon var5 = (MapIcon)var4.next();
               if(var5.method4064()) {
                  int var6 = var5.vmethod4060();
                  if(!this.field315.containsKey(Integer.valueOf(var6))) {
                     LinkedList var7 = new LinkedList();
                     var7.add(var5);
                     this.field315.put(Integer.valueOf(var6), var7);
                  } else {
                     List var8 = (List)this.field315.get(Integer.valueOf(var6));
                     var8.add(var5);
                  }
               }
            }
         }
      }

   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "(Liz;Ljava/lang/String;ZI)V",
      garbageValue = "-1168992218"
   )
   public void method2291(Js5Index var1, String var2, boolean var3) {
      if(!this.loading) {
         this.loaded = false;
         this.loading = true;
         System.nanoTime();
         int var4 = var1.method4132(WorldMapDataGroup.field309.name);
         int var5 = var1.method4137(var4, var2);
         Packet var6 = new Packet(var1.method4135(WorldMapDataGroup.field309.name, var2));
         Packet var7 = new Packet(var1.method4135(WorldMapDataGroup.field303.name, var2));
         System.nanoTime();
         System.nanoTime();
         this.field313 = new class125();

         try {
            this.field313.method1846(var6, var7, var5, var3);
         } catch (IllegalStateException var19) {
            return;
         }

         this.field313.method1661();
         this.field313.method1662();
         this.field313.method1654();
         this.mapSurfaceBaseOffsetX = this.field313.method1689() * 64;
         this.mapSurfaceBaseOffsetY = this.field313.method1659() * 64;
         this.field323 = (this.field313.method1658() - this.field313.method1689() + 1) * 64;
         this.field325 = (this.field313.method1694() - this.field313.method1659() + 1) * 64;
         int var16 = this.field313.method1658() - this.field313.method1689() + 1;
         int var9 = this.field313.method1694() - this.field313.method1659() + 1;
         System.nanoTime();
         System.nanoTime();
         WorldMapRegion.field255.method1514();
         this.mapRegions = new WorldMapRegion[var16][var9];
         Iterator var10 = this.field313.field331.iterator();

         while(var10.hasNext()) {
            class135 var11 = (class135)var10.next();
            int var12 = var11.field173;
            int var13 = var11.field169;
            int var14 = var12 - this.field313.method1689();
            int var15 = var13 - this.field313.method1659();
            this.mapRegions[var14][var15] = new WorldMapRegion(var12, var13, this.field313.method1655(), this.field321);
            this.mapRegions[var14][var15].method5465(var11, this.field313.field332);
         }

         for(int var17 = 0; var17 < var16; ++var17) {
            for(int var18 = 0; var18 < var9; ++var18) {
               if(this.mapRegions[var17][var18] == null) {
                  this.mapRegions[var17][var18] = new WorldMapRegion(this.field313.method1689() + var17, this.field313.method1659() + var18, this.field313.method1655(), this.field321);
                  this.mapRegions[var17][var18].method5431(this.field313.field335, this.field313.field332);
               }
            }
         }

         System.nanoTime();
         System.nanoTime();
         if(var1.method4134(WorldMapDataGroup.field304.name, var2)) {
            byte[] var20 = var1.method4135(WorldMapDataGroup.field304.name, var2);
            this.field314 = class331.method6416(var20);
         }

         System.nanoTime();
         var1.method4198();
         var1.method4130();
         this.loaded = true;
      }
   }

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      signature = "(III)F",
      garbageValue = "-2092073595"
   )
   float method2300(int var1, int var2) {
      return ItemContainer.clientInstance.getRenderOverview().getWorldMapZoom();
   }

   private void rl$$init() {
   }

   public boolean isLoaded() {
      return this.loaded;
   }

   public int getSurfaceOffsetX() {
      return this.mapSurfaceBaseOffsetX;
   }

   public int getSurfaceOffsetY() {
      return this.mapSurfaceBaseOffsetY;
   }

   public float getPixelsPerTile(int var1, int var2) {
      return this.method2300(var1, var2);
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-713649352"
   )
   public final void method2315() {
      this.field315 = null;
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      signature = "(IIIILjava/util/HashSet;III)V",
      garbageValue = "-1657590950"
   )
   public void method2295(int var1, int var2, int var3, int var4, HashSet var5, int var6, int var7) {
      if(this.field314 != null) {
         this.field314.method1313(var1, var2, var3, var4);
         if(var6 > 0 && var6 % var7 < var7 / 2) {
            if(this.field315 == null) {
               this.method2292();
            }

            Iterator var8 = var5.iterator();

            while(true) {
               List var10;
               do {
                  if(!var8.hasNext()) {
                     return;
                  }

                  int var9 = ((Integer)var8.next()).intValue();
                  var10 = (List)this.field315.get(Integer.valueOf(var9));
               } while(var10 == null);

               Iterator var11 = var10.iterator();

               while(var11.hasNext()) {
                  MapIcon var12 = (MapIcon)var11.next();
                  int var13 = var3 * (var12.field297.x - this.mapSurfaceBaseOffsetX) / this.field323;
                  int var14 = var4 - (var12.field297.y - this.mapSurfaceBaseOffsetY) * var4 / this.field325;
                  Rasterizer2D.method690(var13 + var1, var14 + var2, 2, 16776960, 256);
               }
            }
         }
      }
   }

   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "(IIIIIIIII)V",
      garbageValue = "1968023039"
   )
   public final void method2301(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      int[] var9 = Rasterizer2D.graphicsPixels;
      int var10 = Rasterizer2D.graphicsPixelsWidth;
      int var11 = Rasterizer2D.graphicsPixelsHeight;
      int[] var12 = new int[4];
      Rasterizer2D.method686(var12);
      WorldMapRectangle var13 = this.method2297(var1, var2, var3, var4);
      float var14 = this.method2300(var7 - var5, var3 - var1);
      int var15 = (int)Math.ceil((double)var14);
      this.field326 = var15;
      if(!this.field317.containsKey(Integer.valueOf(var15))) {
         class258 var16 = new class258(var15);
         var16.method4834();
         this.field317.put(Integer.valueOf(var15), var16);
      }

      int var23 = var13.worldMapRegionX + var13.worldMapRegionWidth - 1;
      int var17 = var13.worldMapRegionHeight + var13.worldMapRegionY - 1;

      int var18;
      int var19;
      for(var18 = var13.worldMapRegionX; var18 <= var23; ++var18) {
         for(var19 = var13.worldMapRegionY; var19 <= var17; ++var19) {
            this.mapRegions[var18][var19].method5438(var15, (class258)this.field317.get(Integer.valueOf(var15)), this.field311, this.field319, this.field320);
         }
      }

      Rasterizer2D.method701(var9, var10, var11);
      Rasterizer2D.method687(var12);
      var18 = (int)(var14 * 64.0F);
      var19 = this.mapSurfaceBaseOffsetX + var1;
      int var20 = var2 + this.mapSurfaceBaseOffsetY;

      for(int var21 = var13.worldMapRegionX; var21 < var13.worldMapRegionWidth + var13.worldMapRegionX; ++var21) {
         for(int var22 = var13.worldMapRegionY; var22 < var13.worldMapRegionY + var13.worldMapRegionHeight; ++var22) {
            this.mapRegions[var21][var22].method5429(var5 + var18 * (this.mapRegions[var21][var22].field256 * 64 - var19) / 64, var8 - var18 * (this.mapRegions[var21][var22].field257 * 64 - var20 + 64) / 64, var18);
         }
      }

   }

   @ObfuscatedName("lt")
   @ObfuscatedSignature(
      signature = "(IIIZI)V",
      garbageValue = "744248380"
   )
   static void method2322(int var0, int var1, int var2, boolean var3) {
      TcpConnectionMessage var4 = class232.method4535(ClientProt.field2280, client.serverConnection.isaac);
      var4.packetBuffer.method5131(client.field731);
      var4.packetBuffer.method5121(var1);
      var4.packetBuffer.method5232(var2);
      var4.packetBuffer.writeShort(var0);
      client.serverConnection.method18(var4);
   }

   @ObfuscatedName("gn")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-153017291"
   )
   static final void method2330() {
      int var0 = WorldMapDecoration.field222 * 128 + 64;
      int var1 = FontName.field3757 * 128 + 64;
      int var2 = TcpConnectionMessage.method5618(var0, var1, ServerProt.level) - class312.field25;
      if(class258.cameraX < var0) {
         class258.cameraX = (var0 - class258.cameraX) * GameSocket.field2100 / 1000 + class258.cameraX + class187.field3842;
         if(class258.cameraX > var0) {
            class258.cameraX = var0;
         }
      }

      if(class258.cameraX > var0) {
         class258.cameraX -= GameSocket.field2100 * (class258.cameraX - var0) / 1000 + class187.field3842;
         if(class258.cameraX < var0) {
            class258.cameraX = var0;
         }
      }

      if(class2.cameraZ < var2) {
         class2.cameraZ = (var2 - class2.cameraZ) * GameSocket.field2100 / 1000 + class2.cameraZ + class187.field3842;
         if(class2.cameraZ > var2) {
            class2.cameraZ = var2;
         }
      }

      if(class2.cameraZ > var2) {
         class2.cameraZ -= GameSocket.field2100 * (class2.cameraZ - var2) / 1000 + class187.field3842;
         if(class2.cameraZ < var2) {
            class2.cameraZ = var2;
         }
      }

      if(FontName.cameraY < var1) {
         FontName.cameraY = (var1 - FontName.cameraY) * GameSocket.field2100 / 1000 + FontName.cameraY + class187.field3842;
         if(FontName.cameraY > var1) {
            FontName.cameraY = var1;
         }
      }

      if(FontName.cameraY > var1) {
         FontName.cameraY -= GameSocket.field2100 * (FontName.cameraY - var1) / 1000 + class187.field3842;
         if(FontName.cameraY < var1) {
            FontName.cameraY = var1;
         }
      }

      var0 = Varcs.field1258 * 128 + 64;
      var1 = class232.field339 * 128 + 64;
      var2 = TcpConnectionMessage.method5618(var0, var1, ServerProt.level) - class248.field167;
      int var3 = var0 - class258.cameraX;
      int var4 = var2 - class2.cameraZ;
      int var5 = var1 - FontName.cameraY;
      int var6 = (int)Math.sqrt((double)(var3 * var3 + var5 * var5));
      int var7 = (int)(Math.atan2((double)var4, (double)var6) * 325.949D) & 2047;
      int var8 = (int)(Math.atan2((double)var3, (double)var5) * -325.949D) & 2047;
      if(var7 < 128) {
         var7 = 128;
      }

      if(var7 > 383) {
         var7 = 383;
      }

      if(GZipDecompressor.cameraPitch < var7) {
         GZipDecompressor.cameraPitch = (var7 - GZipDecompressor.cameraPitch) * class235.field2436 / 1000 + GZipDecompressor.cameraPitch + Size.field119;
         client.onCameraPitchChanged(-1);
         if(GZipDecompressor.cameraPitch > var7) {
            GZipDecompressor.cameraPitch = var7;
            client.onCameraPitchChanged(-1);
         }
      }

      if(GZipDecompressor.cameraPitch > var7) {
         GZipDecompressor.cameraPitch -= class235.field2436 * (GZipDecompressor.cameraPitch - var7) / 1000 + Size.field119;
         client.onCameraPitchChanged(-1);
         if(GZipDecompressor.cameraPitch < var7) {
            GZipDecompressor.cameraPitch = var7;
            client.onCameraPitchChanged(-1);
         }
      }

      int var9 = var8 - class142.cameraYaw;
      if(var9 > 1024) {
         var9 -= 2048;
      }

      if(var9 < -1024) {
         var9 += 2048;
      }

      if(var9 > 0) {
         class142.cameraYaw = var9 * class235.field2436 / 1000 + class142.cameraYaw + Size.field119;
         class142.cameraYaw &= 2047;
      }

      if(var9 < 0) {
         class142.cameraYaw -= Size.field119 + -var9 * class235.field2436 / 1000;
         class142.cameraYaw &= 2047;
      }

      int var10 = var8 - class142.cameraYaw;
      if(var10 > 1024) {
         var10 -= 2048;
      }

      if(var10 < -1024) {
         var10 += 2048;
      }

      if(var10 < 0 && var9 > 0 || var10 > 0 && var9 < 0) {
         class142.cameraYaw = var8;
      }

   }

   @ObfuscatedName("fd")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "586471978"
   )
   static void method2327() {
      int var0;
      if(client.loadingStage == 0) {
         class312.sceneManager = new SceneManager(4, 104, 104, class91.tileHeights);

         for(var0 = 0; var0 < 4; ++var0) {
            client.collisionMaps[var0] = new CollisionData(104, 104);
         }

         class281.minimapSprite = new SpritePixels(512, 512);
         class203.loadingText = "Starting game engine...";
         class203.loadingBarPercentage = 5;
         client.loadingStage = 20;
      } else if(client.loadingStage == 20) {
         class203.loadingText = "Prepared visibility map";
         class203.loadingBarPercentage = 10;
         client.loadingStage = 30;
      } else if(client.loadingStage == 30) {
         class181.anims = FontName.method508(0, false, true, true);
         class87.bases = FontName.method508(1, false, true, true);
         class177.configs = FontName.method508(2, true, false, true);
         class129.interfacesArchive = FontName.method508(3, false, true, true);
         class142.synths = FontName.method508(4, false, true, true);
         class142.maps = FontName.method508(5, true, true, true);
         class75.music = FontName.method508(6, true, true, true);
         WorldMapData.models = FontName.method508(7, false, true, true);
         ModeGame.sprites = FontName.method508(8, false, true, true);
         class93.textures = FontName.method508(9, false, true, true);
         class44.binary = FontName.method508(10, false, true, true);
         WorldMapType1.jingles = FontName.method508(11, false, true, true);
         class27.clientscripts = FontName.method508(12, false, true, true);
         KeyFocusListener.fontmetrics = FontName.method508(13, true, false, true);
         class211.vorbis = FontName.method508(14, false, true, true);
         class333.instruments = FontName.method508(15, false, true, true);
         LoginProt.worldmapdata = FontName.method508(17, true, true, true);
         PlayerEntity.defaults = FontName.method508(18, false, true, true);
         Sequence.field3630 = FontName.method508(19, false, true, true);
         Size.field125 = FontName.method508(20, false, true, true);
         class203.loadingText = "Connecting to update server";
         class203.loadingBarPercentage = 20;
         client.loadingStage = 40;
      } else if(client.loadingStage == 40) {
         byte var25 = 0;
         var0 = var25 + class181.anims.method2743() * 4 / 100;
         var0 += class87.bases.method2743() * 4 / 100;
         var0 += class177.configs.method2743() * 2 / 100;
         var0 += class129.interfacesArchive.method2743() * 2 / 100;
         var0 += class142.synths.method2743() * 6 / 100;
         var0 += class142.maps.method2743() * 4 / 100;
         var0 += class75.music.method2743() * 2 / 100;
         var0 += WorldMapData.models.method2743() * 56 / 100;
         var0 += ModeGame.sprites.method2743() * 2 / 100;
         var0 += class93.textures.method2743() * 2 / 100;
         var0 += class44.binary.method2743() * 2 / 100;
         var0 += WorldMapType1.jingles.method2743() * 2 / 100;
         var0 += class27.clientscripts.method2743() * 2 / 100;
         var0 += KeyFocusListener.fontmetrics.method2743() * 2 / 100;
         var0 += class211.vorbis.method2743() * 2 / 100;
         var0 += class333.instruments.method2743() * 2 / 100;
         var0 += Sequence.field3630.method2743() / 100;
         var0 += PlayerEntity.defaults.method2743() / 100;
         var0 += Size.field125.method2743() / 100;
         var0 += LoginProt.worldmapdata.method2716() && LoginProt.worldmapdata.method4120()?1:0;
         if(var0 != 100) {
            if(var0 != 0) {
               class203.loadingText = "Checking for updates - " + var0 + "%";
            }

            class203.loadingBarPercentage = 30;
         } else {
            method2306(class181.anims, "Animations");
            method2306(class87.bases, "Skeletons");
            method2306(class142.synths, "Sound FX");
            method2306(class142.maps, "Maps");
            method2306(class75.music, "Music Tracks");
            method2306(WorldMapData.models, "Models");
            method2306(ModeGame.sprites, "Sprites");
            method2306(WorldMapType1.jingles, "Music Jingles");
            method2306(class211.vorbis, "Music Samples");
            method2306(class333.instruments, "Music Patches");
            method2306(Sequence.field3630, "World Map");
            method2306(PlayerEntity.defaults, "World Map Geography");
            method2306(Size.field125, "World Map Ground");
            ModeGame.field3227 = new GraphicsDefaults();
            ModeGame.field3227.method2175(LoginProt.worldmapdata);
            class203.loadingText = "Loaded update list";
            class203.loadingBarPercentage = 30;
            client.loadingStage = 45;
         }
      } else {
         Js5 var2;
         Js5 var22;
         if(client.loadingStage == 45) {
            CombatInfo1.method56(22050, !client.lowMemory, 2);
            class15 var27 = new class15();
            var27.method201(9, 128);
            class191.soundSystem0 = MapIcon.method4083(class315.taskManager, 0, 22050);
            class191.soundSystem0.method1746(var27);
            var22 = class333.instruments;
            var2 = class211.vorbis;
            Js5 var3 = class142.synths;
            class262.field2550 = var22;
            class262.field2547 = var2;
            class262.field2558 = var3;
            class3.field1860 = var27;
            CombatInfo1.soundSystem1 = MapIcon.method4083(class315.taskManager, 1, 2048);
            TotalQuantityComparator.field60 = new class185();
            CombatInfo1.soundSystem1.method1746(TotalQuantityComparator.field60);
            WorldComparator.field36 = new Resampler(22050, MapIconReference.sampleRate);
            class203.loadingText = "Prepared sound engine";
            class203.loadingBarPercentage = 35;
            client.loadingStage = 50;
            CombatInfoListHolder.fonts = new Fonts(ModeGame.sprites, KeyFocusListener.fontmetrics);
         } else if(client.loadingStage == 50) {
            var0 = FontName.method510().length;
            client.fontsMap = CombatInfoListHolder.fonts.method6418(FontName.method510());
            if(client.fontsMap.size() < var0) {
               class203.loadingText = "Loading fonts - " + client.fontsMap.size() * 100 / var0 + "%";
               class203.loadingBarPercentage = 40;
            } else {
               client.fontPlain11 = (Font) client.fontsMap.get(FontName.FontName_plain11);
               Occluder.font_p12full = (Font) client.fontsMap.get(FontName.FontName_plain12);
               class191.fontBold12 = (Font) client.fontsMap.get(FontName.FontName_bold12);
               WorldMapType2.machineInfo = client.field915.vmethod6314();
               class203.loadingText = "Loaded fonts";
               class203.loadingBarPercentage = 40;
               client.loadingStage = 60;
            }
         } else {
            int var16;
            if(client.loadingStage == 60) {
               var22 = class44.binary;
               var2 = ModeGame.sprites;
               var16 = 0;
               if(var22.method4136("title.jpg", "")) {
                  ++var16;
               }

               if(var2.method4136("logo", "")) {
                  ++var16;
               }

               if(var2.method4136("logo_deadman_mode", "")) {
                  ++var16;
               }

               if(var2.method4136("titlebox", "")) {
                  ++var16;
               }

               if(var2.method4136("titlebutton", "")) {
                  ++var16;
               }

               if(var2.method4136("runes", "")) {
                  ++var16;
               }

               if(var2.method4136("title_mute", "")) {
                  ++var16;
               }

               if(var2.method4136("options_radio_buttons,0", "")) {
                  ++var16;
               }

               if(var2.method4136("options_radio_buttons,2", "")) {
                  ++var16;
               }

               if(var2.method4136("options_radio_buttons,4", "")) {
                  ++var16;
               }

               if(var2.method4136("options_radio_buttons,6", "")) {
                  ++var16;
               }

               var2.method4136("sl_back", "");
               var2.method4136("sl_flags", "");
               var2.method4136("sl_arrows", "");
               var2.method4136("sl_stars", "");
               var2.method4136("sl_button", "");
               byte var23 = 11;
               if(var16 < var23) {
                  class203.loadingText = "Loading title screen - " + var16 * 100 / var23 + "%";
                  class203.loadingBarPercentage = 50;
               } else {
                  class203.loadingText = "Loaded title screen";
                  class203.loadingBarPercentage = 50;
                  class124.method1843(5);
                  client.loadingStage = 70;
               }
            } else if(client.loadingStage == 70) {
               if(!class177.configs.method4120()) {
                  class203.loadingText = "Loading config - " + class177.configs.method2731() + "%";
                  class203.loadingBarPercentage = 60;
               } else {
                  ClientOptions.method1094(class177.configs);
                  World.method4938(class177.configs);
                  ServerConnection.method21(class177.configs, WorldMapData.models);
                  GameObject.method1098(class177.configs, WorldMapData.models, client.lowMemory);
                  OwnWorldComparator.method75(class177.configs, WorldMapData.models);
                  Js5 var26 = class177.configs;
                  StructType.field3414 = var26;
                  var22 = class177.configs;
                  var2 = WorldMapData.models;
                  boolean var28 = client.isMembers;
                  Font var17 = client.fontPlain11;
                  class48.item_ref = var22;
                  class60.ItemDefinition_modelIndexCache = var2;
                  ObjType.isMembersWorld = var28;
                  ObjType.field3508 = class48.item_ref.method4112(10);
                  Size.field127 = var17;
                  Js5 var29 = class177.configs;
                  Js5 var6 = class181.anims;
                  Js5 var24 = class87.bases;
                  Sequence.seq_ref = var29;
                  Sequence.skel_ref = var6;
                  Frames.skin_ref = var24;
                  class234.method4541(class177.configs, WorldMapData.models);
                  UnitPriceComparator.method2283(class177.configs);
                  Sequence.method5008(class177.configs);
                  ItemContainer.method3965(class129.interfacesArchive, WorldMapData.models, ModeGame.sprites, KeyFocusListener.fontmetrics);
                  Js5 var8 = class177.configs;
                  InvType.field3310 = var8;
                  Js5 var9 = class177.configs;
                  Enum.EnumDefinition_indexCache = var9;
                  Js5 var10 = class177.configs;
                  VarClientType.field3346 = var10;
                  Js5 var11 = class177.configs;
                  ParamType.field3411 = var11;
                  WorldMapType3.varcs = new Varcs();
                  Js5 var12 = class177.configs;
                  Js5 var13 = ModeGame.sprites;
                  Js5 var14 = KeyFocusListener.fontmetrics;
                  HitmarkType.field3430 = var12;
                  class211.field1991 = var13;
                  HitmarkType.field3438 = var14;
                  VarPlayerType.method13(class177.configs, ModeGame.sprites);
                  class57.method903(class177.configs, ModeGame.sprites);
                  class203.loadingText = "Loaded config";
                  class203.loadingBarPercentage = 60;
                  client.loadingStage = 80;
               }
            } else if(client.loadingStage == 80) {
               var0 = 0;
               if(class232.compass == null) {
                  class232.compass = IDKType.method5403(ModeGame.sprites, ModeGame.field3227.field3826, 0, -1942416918);
               } else {
                  ++var0;
               }

               if(class71.mapedge == null) {
                  class71.mapedge = IDKType.method5403(ModeGame.sprites, ModeGame.field3227.field3819, 0, -1955366546);
               } else {
                  ++var0;
               }

               IndexedSprite[] var1;
               IndexedSprite var7;
               IndexedSprite[] var18;
               int var19;
               if(SubInterface.mapscene == null) {
                  var2 = ModeGame.sprites;
                  var16 = ModeGame.field3227.field3820;
                  if(!class205.method4006(var2, var16, 0)) {
                     var1 = null;
                  } else {
                     var18 = new IndexedSprite[class96.indexedSpriteCount];

                     for(var19 = 0; var19 < class96.indexedSpriteCount; ++var19) {
                        var7 = var18[var19] = new IndexedSprite();
                        var7.originalWidth = class96.indexedSpriteWidth;
                        var7.originalHeight = class96.indexedSpriteHeight;
                        var7.offsetX = class96.indexedSpriteOffsetXs[var19];
                        var7.offsetY = GameCanvas.indexedSpriteOffsetYs[var19];
                        var7.width = class96.indexSpriteWidths[var19];
                        var7.height = class96.indexedSpriteHeights[var19];
                        var7.palette = class96.indexedSpritePalette;
                        var7.pixels = class241.spritePixels[var19];
                     }

                     class43.method648();
                     var1 = var18;
                  }

                  SubInterface.mapscene = var1;
               } else {
                  ++var0;
               }

               if(IndexStoreActionHandler.headIconsPk == null) {
                  IndexStoreActionHandler.headIconsPk = Bit.method2676(ModeGame.sprites, ModeGame.field3227.field3828, 0);
               } else {
                  ++var0;
               }

               if(ItemContainer.headIconsPrayer == null) {
                  ItemContainer.headIconsPrayer = Bit.method2676(ModeGame.sprites, ModeGame.field3227.field3822, 0);
               } else {
                  ++var0;
               }

               if(WorldMapDecoration.headIconsHint == null) {
                  WorldMapDecoration.headIconsHint = Bit.method2676(ModeGame.sprites, ModeGame.field3227.field3823, 0);
               } else {
                  ++var0;
               }

               if(Occluder.mapMarkers == null) {
                  Occluder.mapMarkers = Bit.method2676(ModeGame.sprites, ModeGame.field3227.field3818, 0);
               } else {
                  ++var0;
               }

               if(GrandExchangeOffer.crossSprites == null) {
                  GrandExchangeOffer.crossSprites = Bit.method2676(ModeGame.sprites, ModeGame.field3227.field3825, 0);
               } else {
                  ++var0;
               }

               if(class285.mapDots == null) {
                  class285.mapDots = Bit.method2676(ModeGame.sprites, ModeGame.field3227.field3821, 0);
               } else {
                  ++var0;
               }

               if(PlayerList.scrollbarSprites == null) {
                  var2 = ModeGame.sprites;
                  var16 = ModeGame.field3227.field3827;
                  if(!class205.method4006(var2, var16, 0)) {
                     var1 = null;
                  } else {
                     var18 = new IndexedSprite[class96.indexedSpriteCount];

                     for(var19 = 0; var19 < class96.indexedSpriteCount; ++var19) {
                        var7 = var18[var19] = new IndexedSprite();
                        var7.originalWidth = class96.indexedSpriteWidth;
                        var7.originalHeight = class96.indexedSpriteHeight;
                        var7.offsetX = class96.indexedSpriteOffsetXs[var19];
                        var7.offsetY = GameCanvas.indexedSpriteOffsetYs[var19];
                        var7.width = class96.indexSpriteWidths[var19];
                        var7.height = class96.indexedSpriteHeights[var19];
                        var7.palette = class96.indexedSpritePalette;
                        var7.pixels = class241.spritePixels[var19];
                     }

                     class43.method648();
                     var1 = var18;
                  }

                  PlayerList.scrollbarSprites = var1;
               } else {
                  ++var0;
               }

               if(TcpConnectionMessage.modIconSprites == null) {
                  var2 = ModeGame.sprites;
                  var16 = ModeGame.field3227.field3824;
                  if(!class205.method4006(var2, var16, 0)) {
                     var1 = null;
                  } else {
                     var18 = new IndexedSprite[class96.indexedSpriteCount];

                     for(var19 = 0; var19 < class96.indexedSpriteCount; ++var19) {
                        var7 = var18[var19] = new IndexedSprite();
                        var7.originalWidth = class96.indexedSpriteWidth;
                        var7.originalHeight = class96.indexedSpriteHeight;
                        var7.offsetX = class96.indexedSpriteOffsetXs[var19];
                        var7.offsetY = GameCanvas.indexedSpriteOffsetYs[var19];
                        var7.width = class96.indexSpriteWidths[var19];
                        var7.height = class96.indexedSpriteHeights[var19];
                        var7.palette = class96.indexedSpritePalette;
                        var7.pixels = class241.spritePixels[var19];
                     }

                     class43.method648();
                     var1 = var18;
                  }

                  TcpConnectionMessage.modIconSprites = var1;
               } else {
                  ++var0;
               }


               if(TcpConnectionMessage.memberIconSprites == null) {
                  var2 = ModeGame.sprites;
                  if(!class205.method4006(var2, 2501, 0)) {
                     var1 = null;
                  } else {
                     var18 = new IndexedSprite[class96.indexedSpriteCount];

                     for(var19 = 0; var19 < class96.indexedSpriteCount; ++var19) {
                        var7 = var18[var19] = new IndexedSprite();
                        var7.originalWidth = class96.indexedSpriteWidth;
                        var7.originalHeight = class96.indexedSpriteHeight;
                        var7.offsetX = class96.indexedSpriteOffsetXs[var19];
                        var7.offsetY = GameCanvas.indexedSpriteOffsetYs[var19];
                        var7.width = class96.indexSpriteWidths[var19];
                        var7.height = class96.indexedSpriteHeights[var19];
                        var7.palette = class96.indexedSpritePalette;
                        var7.pixels = class241.spritePixels[var19];
                     }

                     class43.method648();
                     var1 = var18;
                  }

                  TcpConnectionMessage.memberIconSprites = var1;
               }

               if(var0 < 11) {
                  class203.loadingText = "Loading sprites - " + var0 * 100 / 12 + "%";
                  class203.loadingBarPercentage = 70;
               } else {
                  FontTypeFace.modIcons = TcpConnectionMessage.modIconSprites;
                  FontTypeFace.memberIcons = TcpConnectionMessage.memberIconSprites;
                  class71.mapedge.method1303();
                  int var20 = (int)(Math.random() * 21.0D) - 10;
                  int var21 = (int)(Math.random() * 21.0D) - 10;
                  var16 = (int)(Math.random() * 21.0D) - 10;
                  int var4 = (int)(Math.random() * 41.0D) - 20;
                  SubInterface.mapscene[0].method4281(var20 + var4, var4 + var21, var4 + var16);
                  class203.loadingText = "Loaded sprites";
                  class203.loadingBarPercentage = 70;
                  client.loadingStage = 90;
               }
            } else if(client.loadingStage == 90) {
               if(!class93.textures.method4120()) {
                  class203.loadingText = "Loading textures - " + "0%";
                  class203.loadingBarPercentage = 90;
               } else {
                  class29.field608 = new TextureProvider(class93.textures, ModeGame.sprites, 20, 0.8D, client.lowMemory?64:128);
                  Graphics3D.method2142(class29.field608);
                  Graphics3D.method2121(0.8D);
                  client.loadingStage = 100;
               }
            } else if(client.loadingStage == 100) {
               var0 = class29.field608.method1158();
               if(var0 < 100) {
                  class203.loadingText = "Loading textures - " + var0 + "%";
                  class203.loadingBarPercentage = 90;
               } else {
                  class203.loadingText = "Loaded textures";
                  class203.loadingBarPercentage = 90;
                  client.loadingStage = 110;
               }
            } else if(client.loadingStage == 110) {
               class72.mouseRecorder = new MouseRecorder();
               class315.taskManager.method5829(class72.mouseRecorder, 10);
               class203.loadingText = "Loaded input handler";
               class203.loadingBarPercentage = 92;
               client.loadingStage = 120;
            } else if(client.loadingStage == 120) {
               if(!class44.binary.method4136("huffman", "")) {
                  class203.loadingText = "Loading wordpack - " + 0 + "%";
                  class203.loadingBarPercentage = 94;
               } else {
                  Huffman var15 = new Huffman(class44.binary.method4135("huffman", ""));
                  CombatInfo1.method59(var15);
                  class203.loadingText = "Loaded wordpack";
                  class203.loadingBarPercentage = 94;
                  client.loadingStage = 130;
               }
            } else if(client.loadingStage == 130) {
               if(!class129.interfacesArchive.method4120()) {
                  class203.loadingText = "Loading interfaces - " + class129.interfacesArchive.method2731() * 4 / 5 + "%";
                  class203.loadingBarPercentage = 96;
               } else if(!class27.clientscripts.method4120()) {
                  class203.loadingText = "Loading interfaces - " + (80 + class27.clientscripts.method2731() / 6) + "%";
                  class203.loadingBarPercentage = 96;
               } else if(!KeyFocusListener.fontmetrics.method4120()) {
                  class203.loadingText = "Loading interfaces - " + (96 + KeyFocusListener.fontmetrics.method2731() / 50) + "%";
                  class203.loadingBarPercentage = 96;
               } else {
                  class203.loadingText = "Loaded interfaces";
                  class203.loadingBarPercentage = 98;
                  client.loadingStage = 140;
               }
            } else if(client.loadingStage == 140) {
               class203.loadingBarPercentage = 100;
               if(!Sequence.field3630.method4157(WorldMapDataGroup.field309.name)) {
                  class203.loadingText = "Loading world map - " + Sequence.field3630.method4139(WorldMapDataGroup.field309.name) / 10 + "%";
               } else {
                  if(class69.worldMap == null) {
                     class69.worldMap = new WorldMap();
                     class69.worldMap.method2863(Sequence.field3630, PlayerEntity.defaults, Size.field125, class191.fontBold12, client.fontsMap, SubInterface.mapscene);
                  }

                  class203.loadingText = "Loaded world map";
                  client.loadingStage = 150;
               }
            } else if(client.loadingStage == 150) {
               class124.method1843(10);
            }
         }
      }
   }

   @ObfuscatedName("fq")
   @ObfuscatedSignature(
      signature = "(Lin;Ljava/lang/String;B)V",
      garbageValue = "-43"
   )
   static void method2306(Js5 var0, String var1) {
      class142 var2 = new class142(var0, var1);
      client.field919.add(var2);
   }

   @ObfuscatedName("ke")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-411428613"
   )
   static final void method2329() {
      TcpConnectionMessage var0 = class232.method4535(ClientProt.field2297, client.serverConnection.isaac);
      var0.packetBuffer.writeByte(0);
      client.serverConnection.method18(var0);
   }
}
