package net.runelite.standalone;

import java.applet.Applet;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.geom.Area;
import java.net.URL;
import net.runelite.api.Perspective;
import net.runelite.api.Point;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.coords.WorldPoint;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.api.RSDecorativeObject;
import net.runelite.rs.api.RSModel;
import net.runelite.rs.api.RSNPCComposition;
import net.runelite.rs.api.RSRenderable;
import netscape.javascript.JSObject;

@ObfuscatedName("ef")
public final class DecorativeObject implements RSDecorativeObject {
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = -1246331161
   )
   int offsetX;
   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "Lem;"
   )
   public Entity entity2;
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = 205892101
   )
   int renderFlag;
   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "Lem;"
   )
   public Entity entity1;
   @ObfuscatedName("p")
   @ObfuscatedGetter(
      intValue = 399558767
   )
   int offsetY;
   @ObfuscatedName("b")
   @ObfuscatedGetter(
      longValue = -7300530763844858277L
   )
   public long hash;
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      intValue = -103719315
   )
   int floor;
   @ObfuscatedName("n")
   @ObfuscatedGetter(
      intValue = -1941711703
   )
   int renderInfoBitPacked;
   public int decorativeObjectPlane;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = 1049239705
   )
   int x;
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      intValue = 1554727321
   )
   int rotation;
   @ObfuscatedName("g")
   @ObfuscatedGetter(
      intValue = 465213843
   )
   int y;

   DecorativeObject() {
      this.hash = 0L;
      this.renderInfoBitPacked = 0;
      this.rl$$init();
      this.rl$$init1();
   }

   public RSModel getModel2() {
      RSRenderable var1 = this.getRenderable2();
      if(var1 == null) {
         return null;
      } else {
         RSModel var2;
         if(var1 instanceof net.runelite.api.Model) {
            var2 = (RSModel)var1;
         } else {
            var2 = var1.getModel();
         }

         return var2;
      }
   }

   public Point getCanvasLocation(int var1) {
      return Perspective.localToCanvas(ItemContainer.clientInstance, this.getLocalLocation(), this.getPlane(), var1);
   }

   public long getHash() {
      return this.hash;
   }

   public RSModel getModel() {
      RSRenderable var1 = this.getRenderable();
      if(var1 == null) {
         return null;
      } else {
         RSModel var2;
         if(var1 instanceof net.runelite.api.Model) {
            var2 = (RSModel)var1;
         } else {
            var2 = var1.getModel();
         }

         return var2;
      }
   }

   public RSRenderable getRenderable2() {
      return this.entity2;
   }

   /**
    * A bitfield containing various flags:
    * <pre>{@code
    * object type id = bits & 0x20
    * orientation (0-3) = bits >>> 6 & 3
    * supports items = bits >>> 8 & 1
    * }</pre>
    */
   @Override
   public int getConfig() {
      return 0;
   }

   public RSRenderable getRenderable() {
      return this.entity1;
   }

   public int getX() {
      return this.x;
   }

   public LocalPoint getLocalLocation() {
      return new LocalPoint(this.getX(), this.getY());
   }

   public int getY() {
      return this.y;
   }

   public int getOrientation() {
      return this.rotation;
   }

   public int getPlane() {
      return this.decorativeObjectPlane;
   }

   private void rl$$init() {
   }

   private void rl$$init1() {
   }

   public int getXOffset() {
      return this.offsetX;
   }

   public int getYOffset() {
      return this.offsetY;
   }

   public void setPlane(int var1) {
      this.decorativeObjectPlane = var1;
   }

   public Area getClickbox() {
      return Perspective.getClickbox(ItemContainer.clientInstance, this.getModel(), this.getOrientation(), this.getLocalLocation());
   }

   public Polygon getConvexHull() {
      RSModel var1 = this.getModel();
      if(var1 == null) {
         return null;
      } else {
         int var2 = Perspective.getTileHeight(ItemContainer.clientInstance, new LocalPoint(this.getX(), this.getY()), ItemContainer.clientInstance.getPlane());
         return var1.getConvexHull(this.getX() + this.getXOffset(), this.getY() + this.getYOffset(), 0, var2);
      }
   }

   public Polygon getConvexHull2() {
      RSModel var1 = this.getModel2();
      if(var1 == null) {
         return null;
      } else {
         int var2 = Perspective.getTileHeight(ItemContainer.clientInstance, new LocalPoint(this.getX(), this.getY()), ItemContainer.clientInstance.getPlane());
         return var1.getConvexHull(this.getX(), this.getY(), 0, var2);
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

   @ObfuscatedName("hc")
   @ObfuscatedSignature(
      signature = "(ZLge;B)V",
      garbageValue = "-102"
   )
   static final void method914(boolean var0, Bit var1) {
      while(true) {
         if(var1.method2654(client.serverConnection.currentPacketSize) >= 27) {
            int var2 = var1.method2652(15);
            if(var2 != 32767) {
               boolean var3 = false;
               if(client.npcs[var2] == null) {
                  client.npcs[var2] = new NPCEntity();
                  client.cachedNPCsChanged(var2);
                  var3 = true;
               }

               NPCEntity var4 = client.npcs[var2];
               client.highResolutionNpcIndexes[++client.highResolutionNpcCount - 1] = var2;
               var4.lastUpdatedAt = client.gameCycle;
               int var5;
               if(var0) {
                  var5 = var1.method2652(8);
                  if(var5 > 127) {
                     var5 -= 256;
                  }
               } else {
                  var5 = var1.method2652(5);
                  if(var5 > 15) {
                     var5 -= 32;
                  }
               }

               int var6 = var1.method2652(1);
               int var7 = client.npcFacingDirections[var1.method2652(3)];
               if(var3) {
                  var4.orientation = var4.angle = var7;
               }

               int var8 = var1.method2652(1);
               if(var8 == 1) {
                  client.extendedInfoNpcIndexes[++client.extendedInfoNpcCount - 1] = var2;
               }

               int var9;
               if(var0) {
                  var9 = var1.method2652(8);
                  if(var9 > 127) {
                     var9 -= 256;
                  }
               } else {
                  var9 = var1.method2652(5);
                  if(var9 > 15) {
                     var9 -= 32;
                  }
               }

               NPCType var10001 = ZoneProt.method374(var1.method2652(14));
               var4.onCompositionChanged((RSNPCComposition)var10001);
               var4.type = var10001;
               var4.size = var4.type.size;
               var4.direction = var4.type.rotation;
               if(var4.direction == 0) {
                  var4.angle = 0;
               }

               var4.walkAnim = var4.type.walkAnim;
               var4.rotate180Anim = var4.type.rotate180Anim;
               var4.rotate90Anim = var4.type.rotate90Anim;
               var4.rotate270Anim = var4.type.rotate270Anim;
               var4.idlePoseAnimation = var4.type.idleAnim;
               var4.field945 = var4.type.field3578;
               var4.field946 = var4.type.field3575;
               var4.method1822(class71.localPlayer.pathX[0] + var5, class71.localPlayer.pathY[0] + var9, var6 == 1);
               continue;
            }
         }

         var1.method2671();
         return;
      }
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(IZIZI)V",
      garbageValue = "-1485537882"
   )
   static void method915(int var0, boolean var1, int var2, boolean var3) {
      if(class242.worldList != null) {
         class192.method3814(0, class242.worldList.length - 1, var0, var1, var2, var3);
      }

   }

   @ObfuscatedName("ha")
   @ObfuscatedSignature(
      signature = "(Lbq;II)V",
      garbageValue = "-439662432"
   )
   static final void method913(PathingEntity var0, int var1) {
      class75.method1048(var0.x * -1234429701, var0.y, var1);
   }

   @ObfuscatedName("jg")
   @ObfuscatedSignature(
      signature = "([Lia;IB)V",
      garbageValue = "25"
   )
   static final void method912(ComponentType[] var0, int var1) {
      for(int var2 = 0; var2 < var0.length; ++var2) {
         ComponentType var3 = var0[var2];
         if(var3 != null) {
            if(var3.type == 0) {
               if(var3.children != null) {
                  method912(var3.children, var1);
               }

               SubInterface var4 = (SubInterface) client.subInterfaces.method6335((long)var3.id);
               if(var4 != null) {
                  class61.method923(var4.id, var1);
               }
            }

            ScriptEvent var5;
            if(var1 == 0 && var3.onDialogAbortListener != null) {
               var5 = new ScriptEvent();
               var5.source = var3;
               var5.params = var3.onDialogAbortListener;
               class192.method3810(var5);
            }

            if(var1 == 1 && var3.onSubChangeListener != null) {
               if(var3.index >= 0) {
                  ComponentType var6 = ChatHistory.method6246(var3.id);
                  if(var6 == null || var6.children == null || var3.index >= var6.children.length || var3 != var6.children[var3.index]) {
                     continue;
                  }
               }

               var5 = new ScriptEvent();
               var5.source = var3;
               var5.params = var3.onSubChangeListener;
               class192.method3810(var5);
            }
         }
      }

   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(II)[B",
      garbageValue = "-2131355083"
   )
   static synchronized byte[] method911(int var0) {
      return class235.method4546(var0, false);
   }

   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;ILjava/lang/String;I)Z",
      garbageValue = "-2083802809"
   )
   static boolean method916(String var0, int var1, String var2) {
      if(var1 == 0) {
         try {
            if(!class2.field436.startsWith("win")) {
               throw new Exception();
            } else if(!var0.startsWith("http://") && !var0.startsWith("https://")) {
               throw new Exception();
            } else {
               String var13 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";

               for(int var4 = 0; var4 < var0.length(); ++var4) {
                  if(var13.indexOf(var0.charAt(var4)) == -1) {
                     throw new Exception();
                  }
               }

               Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var0 + "\"");
               return true;
            }
         } catch (Throwable var8) {
            return false;
         }
      } else if(var1 == 1) {
         try {
            Applet var7 = class2.field443;
            Object[] var5 = new Object[]{(new URL(class2.field443.getCodeBase(), var0)).toString()};
            Object var3 = JSObject.getWindow(var7).call(var2, var5);
            return var3 != null;
         } catch (Throwable var9) {
            return false;
         }
      } else if(var1 == 2) {
         try {
            class2.field443.getAppletContext().showDocument(new URL(class2.field443.getCodeBase(), var0), "_blank");
            return true;
         } catch (Exception var10) {
            return false;
         }
      } else if(var1 == 3) {
         try {
            class328.method6407(class2.field443, "loggedout");
         } catch (Throwable var12) {
            ;
         }

         try {
            class2.field443.getAppletContext().showDocument(new URL(class2.field443.getCodeBase(), var0), "_top");
            return true;
         } catch (Exception var11) {
            return false;
         }
      } else {
         throw new IllegalArgumentException();
      }
   }
}
