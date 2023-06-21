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
import net.runelite.rs.api.RSRenderable;
import net.runelite.rs.api.RSWallObject;

@ObfuscatedName("ep")
public final class WallObject implements RSWallObject {
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "Lem;"
   )
   public Entity entity1;
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = 1561916487
   )
   int config;
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = 1799011399
   )
   int orientationA;
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      longValue = 6449850688779105297L
   )
   public long hash;
   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "Lem;"
   )
   public Entity entity2;
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      intValue = -940943055
   )
   int floor;
   public int wallPlane;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = 794221253
   )
   int x;
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      intValue = -346291033
   )
   int orientationB;
   @ObfuscatedName("g")
   @ObfuscatedGetter(
      intValue = -1427779503
   )
   int y;

   WallObject() {
      this.hash = 0L;
      this.config = 0;
      this.rl$$init();
      this.rl$$init1();
   }

   public Point getCanvasLocation(int var1) {
      return Perspective.localToCanvas(ItemContainer.clientInstance, this.getLocalLocation(), this.getPlane(), var1);
   }

   public long getHash() {
      return this.hash;
   }

   public RSRenderable getRenderable1() {
      return this.entity1;
   }

   public RSRenderable getRenderable2() {
      return this.entity2;
   }

   public int getX() {
      return this.x;
   }

   public LocalPoint getLocalLocation() {
      return new LocalPoint(this.getX(), this.getY());
   }

   public net.runelite.api.Model getModelA() {
      RSRenderable var1 = this.getRenderable1();
      return var1 == null?null:(var1 instanceof net.runelite.api.Model?(net.runelite.api.Model)var1:var1.getModel());
   }

   public int getY() {
      return this.y;
   }

   public int getPlane() {
      return this.wallPlane;
   }

   public int getOrientationA() {
      return this.orientationA;
   }

   private void rl$$init() {
   }

   private void rl$$init1() {
   }

   public net.runelite.api.Model getModelB() {
      RSRenderable var1 = this.getRenderable2();
      return var1 == null?null:(var1 instanceof net.runelite.api.Model?(net.runelite.api.Model)var1:var1.getModel());
   }

   public int getOrientationB() {
      return this.orientationB;
   }

   public void setPlane(int var1) {
      this.wallPlane = var1;
   }

   public Area getClickbox() {
      Area var1 = new Area();
      Area var2 = Perspective.getClickbox(ItemContainer.clientInstance, this.getModelA(), this.getOrientationA(), this.getLocalLocation());
      Area var3 = Perspective.getClickbox(ItemContainer.clientInstance, this.getModelB(), this.getOrientationB(), this.getLocalLocation());
      if(var2 == null && var3 == null) {
         return null;
      } else {
         if(var2 != null) {
            var1.add(var2);
         }

         if(var3 != null) {
            var1.add(var3);
         }

         return var1;
      }
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

   public int getConfig() {
      return this.config;
   }

   @ObfuscatedName("b")
   @ObfuscatedSignature(
      signature = "(II)Lei;",
      garbageValue = "-1202094912"
   )
   static Frames method1971(int var0) {
      Frames var1 = (Frames)Sequence.skeletons.method635((long)var0);
      if(var1 != null) {
         return var1;
      } else {
         Js5Index var3 = Sequence.skel_ref;
         Js5Index var4 = Frames.skin_ref;
         boolean var5 = true;
         int[] var6 = var3.method4126(var0);

         for(int var7 = 0; var7 < var6.length; ++var7) {
            byte[] var8 = var3.method4123(var0, var6[var7]);
            if(var8 == null) {
               var5 = false;
            } else {
               int var9 = (var8[0] & 255) << 8 | var8[1] & 255;
               byte[] var10 = var4.method4123(var9, 0);
               if(var10 == null) {
                  var5 = false;
               }
            }
         }

         Frames var2;
         if(!var5) {
            var2 = null;
         } else {
            try {
               var2 = new Frames(var3, var4, var0, false);
            } catch (Exception var12) {
               var2 = null;
            }
         }

         if(var2 != null) {
            Sequence.skeletons.method628(var2, (long)var0);
         }

         return var2;
      }
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(III)V",
      garbageValue = "1838496349"
   )
   static void method1973(int var0, int var1) {
      int[] var2 = new int[4];
      int[] var3 = new int[4];
      var2[0] = var0;
      var3[0] = var1;
      int var4 = 1;

      for(int var5 = 0; var5 < 4; ++var5) {
         if(World.field1018[var5] != var0) {
            var2[var4] = World.field1018[var5];
            var3[var4] = World.field1016[var5];
            ++var4;
         }
      }

      World.field1018 = var2;
      World.field1016 = var3;
      CoordGrid.method901(class242.worldList, 0, class242.worldList.length - 1, World.field1018, World.field1016);
   }

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      signature = "(ILcs;ZI)I",
      garbageValue = "-1981280978"
   )
   static int method1972(int var0, class314 var1, boolean var2) {
      if(var0 == 3200) {
         class281.intStackSize -= 3;
         ParamType.method609(class281.intStack[class281.intStackSize], class281.intStack[class281.intStackSize + 1], class281.intStack[class281.intStackSize + 2]);
         return 1;
      } else if(var0 == 3201) {
         class53.method866(class281.intStack[--class281.intStackSize]);
         return 1;
      } else if(var0 == 3202) {
         class281.intStackSize -= 2;
         FileSystem.method570(class281.intStack[class281.intStackSize], class281.intStack[class281.intStackSize + 1]);
         return 1;
      } else {
         return 2;
      }
   }
}
