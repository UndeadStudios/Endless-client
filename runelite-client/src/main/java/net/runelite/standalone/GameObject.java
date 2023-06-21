package net.runelite.standalone;

import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.geom.Area;
import net.runelite.api.Perspective;
import net.runelite.api.Point;
import net.runelite.api.coords.Angle;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.coords.WorldPoint;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.api.RSGameObject;
import net.runelite.rs.api.RSModel;
import net.runelite.rs.api.RSRenderable;

@ObfuscatedName("er")
public final class GameObject implements RSGameObject {
   @ObfuscatedName("gx")
   static byte[][] field1932;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = 647360359
   )
   int orientation;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = -972042923
   )
   int cycle;
   @ObfuscatedName("r")
   @ObfuscatedGetter(
      longValue = 4048635491163491633L
   )
   public long hash;
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = 677592277
   )
   int relativeY;
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = -903852657
   )
   int y;
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      intValue = 84457517
   )
   int offsetX;
   @ObfuscatedName("p")
   @ObfuscatedGetter(
      intValue = -798171635
   )
   int relativeX;
   @ObfuscatedName("b")
   @ObfuscatedGetter(
      intValue = 1327459531
   )
   int offsetY;
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      intValue = 930687481
   )
   int plane;
   @ObfuscatedName("n")
   @ObfuscatedGetter(
      intValue = -964826023
   )
   int drawPriority;
   @ObfuscatedName("t")
   @ObfuscatedGetter(
      intValue = 1401209023
   )
   int flags;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = -1690232561
   )
   int height;
   @ObfuscatedName("h")
   @ObfuscatedSignature(
      signature = "Lem;"
   )
   public Entity entity;
   @ObfuscatedName("g")
   @ObfuscatedGetter(
      intValue = 369246091
   )
   int x;

   GameObject() {
      this.hash = 0L;
      this.flags = 0;
      this.rl$$init();
      this.rl$$init1();
   }

   public Point getCanvasLocation(int var1) {
      return Perspective.localToCanvas(ItemContainer.clientInstance, this.getLocalLocation(), this.getPlane(), var1);
   }

   public int getRelativeX() {
      return this.relativeX;
   }

   public int getOffsetX() {
      return this.offsetX;
   }

   public long getHash() {
      return this.hash;
   }

   public RSModel getModel() {
      RSRenderable var1 = this.getRenderable();
      return var1 == null?null:(var1 instanceof RSModel?(RSModel)var1:var1.getModel());
   }

   public RSRenderable getRenderable() {
      return this.entity;
   }

   @Override
   public int getModelOrientation() {
      return 0;
   }
   @Override
   public int getConfig() {
      return 0;
   }
   public int getRsOrientation() {
      return this.orientation;
   }

   public int getX() {
      return this.x;
   }

   public LocalPoint getLocalLocation() {
      return new LocalPoint(this.getX(), this.getY());
   }

   public int getRelativeY() {
      return this.relativeY;
   }

   public int getOffsetY() {
      return this.offsetY;
   }

   public int getFlags() {
      return this.flags;
   }

   public int getY() {
      return this.y;
   }

   public int getPlane() {
      return this.plane;
   }

   private void rl$$init() {
   }

   private void rl$$init1() {
   }
   @Override
   public int sizeX() {
      return 0;
   }

   @Override
   public int sizeY() {
      return 0;
   }
   public Point getSceneMinLocation() {
      return new Point(this.getRelativeX(), this.getRelativeY());
   }

   public Point getSceneMaxLocation() {
      return new Point(this.getOffsetX(), this.getOffsetY());
   }

   public Area getClickbox() {
      return Perspective.getClickbox(ItemContainer.clientInstance, this.getModel(), this.getRsOrientation(), this.getLocalLocation());
   }

   public Polygon getConvexHull() {
      RSModel var1 = this.getModel();
      if(var1 == null) {
         return null;
      } else {
         int var2 = Perspective.getTileHeight(ItemContainer.clientInstance, new LocalPoint(this.getX(), this.getY()), ItemContainer.clientInstance.getPlane());
         return var1.getConvexHull(this.getX(), this.getY(), this.getRsOrientation(), var2);
      }
   }

   public Angle getOrientation() {
      int var1 = this.getRsOrientation();
      int var2 = this.getFlags() >> 6 & 3;
      return new Angle(var1 + var2 * 512);
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

   public int getHeight() {
      return this.height;
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(ILcs;ZB)I",
      garbageValue = "-4"
   )
   static int method1096(int var0, class314 var1, boolean var2) {
      boolean var3 = true;
      ComponentType var4;
      if(var0 >= 2000) {
         var0 -= 1000;
         var4 = ChatHistory.method6246(class281.intStack[--class281.intStackSize]);
         var3 = false;
      } else {
         var4 = var2?ClientOptions.field1035:class290.field1119;
      }

      int var11;
      if(var0 == 1300) {
         var11 = class281.intStack[--class281.intStackSize] - 1;
         if(var11 >= 0 && var11 <= 9) {
            String op = class281.scriptStringStack[--class295.scriptStringStackSize];
            var4.method5664(var11, op);
            return 1;
         } else {
            --class295.scriptStringStackSize;
            return 1;
         }
      } else {
         int var6;
         if(var0 == 1301) {
            class281.intStackSize -= 2;
            var11 = class281.intStack[class281.intStackSize];
            var6 = class281.intStack[class281.intStackSize + 1];
            var4.dragParent = UnitPriceComparator.method2289(var11, var6);
            return 1;
         } else if(var0 == 1302) {
            var4.dragRenderBehavior = class281.intStack[--class281.intStackSize] == 1;
            return 1;
         } else if(var0 == 1303) {
            var4.dragDeadZone = class281.intStack[--class281.intStackSize];
            return 1;
         } else if(var0 == 1304) {
            var4.dragDeadTime = class281.intStack[--class281.intStackSize];
            return 1;
         } else if(var0 == 1305) {
            var4.opBase = class281.scriptStringStack[--class295.scriptStringStackSize];
            return 1;
         } else if(var0 == 1306) {
            var4.targetVerb = class281.scriptStringStack[--class295.scriptStringStackSize];
            return 1;
         } else if(var0 == 1307) {
            var4.ops = null;
            return 1;
         } else if(var0 == 1308) {
            var4.field2831 = class281.intStack[--class281.intStackSize] == 1;
            return 1;
         } else {
            int var7;
            byte[] var9;
            if(var0 != 1350) {
               byte var5;
               if(var0 == 1351) {
                  class281.intStackSize -= 2;
                  var5 = 10;
                  var9 = new byte[]{(byte)class281.intStack[class281.intStackSize]};
                  byte[] var10 = new byte[]{(byte)class281.intStack[class281.intStackSize + 1]};
                  class281.method5820(var4, var5, var9, var10);
                  return 1;
               } else if(var0 == 1352) {
                  class281.intStackSize -= 3;
                  var11 = class281.intStack[class281.intStackSize] - 1;
                  var6 = class281.intStack[class281.intStackSize + 1];
                  var7 = class281.intStack[class281.intStackSize + 2];
                  if(var11 >= 0 && var11 <= 9) {
                     class186.method3568(var4, var11, var6, var7);
                     return 1;
                  } else {
                     throw new RuntimeException();
                  }
               } else if(var0 == 1353) {
                  var5 = 10;
                  var6 = class281.intStack[--class281.intStackSize];
                  var7 = class281.intStack[--class281.intStackSize];
                  class186.method3568(var4, var5, var6, var7);
                  return 1;
               } else if(var0 == 1354) {
                  --class281.intStackSize;
                  var11 = class281.intStack[class281.intStackSize] - 1;
                  if(var11 >= 0 && var11 <= 9) {
                     class191.method3805(var4, var11);
                     return 1;
                  } else {
                     throw new RuntimeException();
                  }
               } else if(var0 == 1355) {
                  var5 = 10;
                  class191.method3805(var4, var5);
                  return 1;
               } else {
                  return 2;
               }
            } else {
               byte[] var8 = null;
               var9 = null;
               if(var3) {
                  class281.intStackSize -= 10;

                  for(var7 = 0; var7 < 10 && class281.intStack[var7 + class281.intStackSize] >= 0; var7 += 2) {
                     ;
                  }

                  if(var7 > 0) {
                     var8 = new byte[var7 / 2];
                     var9 = new byte[var7 / 2];

                     for(var7 -= 2; var7 >= 0; var7 -= 2) {
                        var8[var7 / 2] = (byte)class281.intStack[var7 + class281.intStackSize];
                        var9[var7 / 2] = (byte)class281.intStack[var7 + class281.intStackSize + 1];
                     }
                  }
               } else {
                  class281.intStackSize -= 2;
                  var8 = new byte[]{(byte)class281.intStack[class281.intStackSize]};
                  var9 = new byte[]{(byte)class281.intStack[class281.intStackSize + 1]};
               }

               var7 = class281.intStack[--class281.intStackSize] - 1;
               if(var7 >= 0 && var7 <= 9) {
                  class281.method5820(var4, var7, var8, var9);
                  return 1;
               } else {
                  throw new RuntimeException();
               }
            }
         }
      }
   }

   @ObfuscatedName("jo")
   @ObfuscatedSignature(
      signature = "(Lia;IIIIIII)V",
      garbageValue = "-1186758236"
   )
   static final void method1097(ComponentType var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      if(client.field715) {
         client.field864 = 32;
      } else {
         client.field864 = 0;
      }

      client.field715 = false;
      int var7;
      if(MouseInput.mouseCurrentButton == 1 || !TextureProvider.middleMouseMovesCamera && MouseInput.mouseCurrentButton == 4) {
         if(var5 >= var1 && var5 < var1 + 16 && var6 >= var2 && var6 < var2 + 16) {
            var0.scrollY -= 4;
            WorldMapRegion.method5554(var0);
         } else if(var5 >= var1 && var5 < var1 + 16 && var6 >= var3 + var2 - 16 && var6 < var3 + var2) {
            var0.scrollY += 4;
            WorldMapRegion.method5554(var0);
         } else if(var5 >= var1 - client.field864 && var5 < client.field864 + var1 + 16 && var6 >= var2 + 16 && var6 < var3 + var2 - 16) {
            var7 = var3 * (var3 - 32) / var4;
            if(var7 < 8) {
               var7 = 8;
            }

            int var8 = var6 - var2 - 16 - var7 / 2;
            int var9 = var3 - 32 - var7;
            var0.scrollY = var8 * (var4 - var3) / var9;
            WorldMapRegion.method5554(var0);
            client.field715 = true;
         }
      }

      if(client.field847 != 0) {
         var7 = var0.width;
         if(var5 >= var1 - var7 && var6 >= var2 && var5 < var1 + 16 && var6 <= var3 + var2) {
            var0.scrollY += client.field847 * 45;
            WorldMapRegion.method5554(var0);
         }
      }

   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "(Liz;Liz;ZI)V",
      garbageValue = "-2026760233"
   )
   public static void method1098(Js5Index var0, Js5Index var1, boolean var2) {
      LocType.objects_ref = var0;
      LocType.field3453 = var1;
      LocType.objectCompositionLowDetail = var2;
   }
}
