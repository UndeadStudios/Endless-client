package net.runelite.standalone;

import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.geom.Area;
import net.runelite.api.Perspective;
import net.runelite.api.Point;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.coords.WorldPoint;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.api.RSItemLayer;
import net.runelite.rs.api.RSRenderable;

@ObfuscatedName("dy")
public final class ItemLayer implements RSItemLayer {
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "Lem;"
   )
   Entity top;
   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "Lem;"
   )
   Entity bottom;
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      intValue = -683834749
   )
   int height;
   @ObfuscatedName("p")
   @ObfuscatedGetter(
      longValue = 4919486212967381457L
   )
   long hash;
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      intValue = -1922326197
   )
   int tileHeight;
   public int itemLayerPlane;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = 1126674869
   )
   int x;
   @ObfuscatedName("h")
   @ObfuscatedSignature(
      signature = "Lem;"
   )
   Entity middle;
   @ObfuscatedName("g")
   @ObfuscatedGetter(
      intValue = -571565015
   )
   int y;

   ItemLayer() {
      this.rl$$init();
      this.rl$$init1();
   }

   public Point getCanvasLocation(int var1) {
      return Perspective.localToCanvas(ItemContainer.clientInstance, this.getLocalLocation(), this.getPlane(), var1);
   }

   public long getHash() {
      return this.hash;
   }

   public int getX() {
      return this.x;
   }

   private void rl$$init() {
   }

   public LocalPoint getLocalLocation() {
      return new LocalPoint(this.getX(), this.getY());
   }

   public int getY() {
      return this.y;
   }

   private void rl$$init1() {
   }

   public int getPlane() {
      return this.itemLayerPlane;
   }

   public void setPlane(int var1) {
      this.itemLayerPlane = var1;
   }

   public Area getClickbox() {
      throw new UnsupportedOperationException();
   }

   public int getId() {
      long var1 = this.getHash();
      return (int)(var1 >>> 17 & 4294967295L);
   }

   public WorldPoint getWorldLocation() {
      return WorldPoint.fromLocal(ItemContainer.clientInstance, this.getX(), this.getY(), this.getPlane());
   }

   public Point getCanvasLocation() {
      return this.getCanvasLocation(0);
   }

   public Polygon getCanvasTilePoly() {
      return Perspective.getCanvasTilePoly(ItemContainer.clientInstance, this.getLocalLocation());
   }

   public Point getCanvasTextLocation(Graphics2D var1, String var2, int var3) {
      return Perspective.getCanvasTextLocation(ItemContainer.clientInstance, var1, this.getLocalLocation(), var2, var3);
   }

   public Point getMinimapLocation() {
      return Perspective.localToMinimap(ItemContainer.clientInstance, this.getLocalLocation());
   }

   public RSRenderable getBottom() {
      return this.bottom;
   }

   public RSRenderable getMiddle() {
      return this.middle;
   }

   public RSRenderable getTop() {
      return this.top;
   }

   public int getHeight() {
      return this.height;
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/CharSequence;IZI)I",
      garbageValue = "276016292"
   )
   static int method525(CharSequence var0, int var1, boolean var2) {
      if(var1 >= 2 && var1 <= 36) {
         boolean var3 = false;
         boolean var4 = false;
         int var5 = 0;
         int var6 = var0.length();

         for(int var7 = 0; var7 < var6; ++var7) {
            char var8 = var0.charAt(var7);
            if(var7 == 0) {
               if(var8 == '-') {
                  var3 = true;
                  continue;
               }

               if(var8 == '+') {
                  continue;
               }
            }

            int var10;
            if(var8 >= '0' && var8 <= '9') {
               var10 = var8 - '0';
            } else if(var8 >= 'A' && var8 <= 'Z') {
               var10 = var8 - '7';
            } else {
               if(var8 < 'a' || var8 > 'z') {
                  throw new NumberFormatException();
               }

               var10 = var8 - 'W';
            }

            if(var10 >= var1) {
               throw new NumberFormatException();
            }

            if(var3) {
               var10 = -var10;
            }

            int var9 = var5 * var1 + var10;
            if(var9 / var1 != var5) {
               throw new NumberFormatException();
            }

            var5 = var9;
            var4 = true;
         }

         if(!var4) {
            throw new NumberFormatException();
         } else {
            return var5;
         }
      } else {
         throw new IllegalArgumentException("");
      }
   }
}
