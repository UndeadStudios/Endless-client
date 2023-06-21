package net.runelite.standalone;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;
import net.runelite.api.Actor;
import net.runelite.api.Point;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.DecorativeObjectChanged;
import net.runelite.api.events.DecorativeObjectDespawned;
import net.runelite.api.events.DecorativeObjectSpawned;
import net.runelite.api.events.GameObjectChanged;
import net.runelite.api.events.GameObjectDespawned;
import net.runelite.api.events.GameObjectSpawned;
import net.runelite.api.events.GroundObjectChanged;
import net.runelite.api.events.GroundObjectDespawned;
import net.runelite.api.events.GroundObjectSpawned;
import net.runelite.api.events.ItemDespawned;
import net.runelite.api.events.ItemSpawned;
import net.runelite.api.events.WallObjectChanged;
import net.runelite.api.events.WallObjectDespawned;
import net.runelite.api.events.WallObjectSpawned;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.api.RSDeque;
import net.runelite.rs.api.RSGameObject;
import net.runelite.rs.api.RSItem;
import net.runelite.rs.api.RSItemLayer;
import net.runelite.rs.api.RSNode;
import net.runelite.rs.api.RSTile;

@ObfuscatedName("de")
public final class Tile extends Node implements RSTile {
   public static RSDeque[][][] lastGroundItems;
   public static net.runelite.api.GameObject lastGameObject;
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "Ldh;"
   )
   SceneTileModel overlay;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = -799286185
   )
   int physicalLevel;
   @ObfuscatedName("v")
   @ObfuscatedGetter(
      intValue = 1274390359
   )
   int wallUncullDirection;
   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "[Ler;"
   )
   GameObject[] objects;
   @ObfuscatedName("r")
   int[] entityFlags;
   @ObfuscatedName("k")
   @ObfuscatedGetter(
      intValue = -200015443
   )
   int wallCullDirection;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = 2039042225
   )
   int wallDrawFlags;
   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "Ldw;"
   )
   GroundObject groundObject;
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = -901714141
   )
   int renderLevel;
   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "Lef;"
   )
   DecorativeObject decorativeObject;
   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "Lep;"
   )
   WallObject wallObject;
   @ObfuscatedName("b")
   @ObfuscatedSignature(
      signature = "Ldy;"
   )
   ItemLayer itemLayer;
   @ObfuscatedName("o")
   boolean draw;
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      intValue = 1819906267
   )
   int level;
   @ObfuscatedName("n")
   @ObfuscatedGetter(
      intValue = -1960775337
   )
   int entityCount;
   @ObfuscatedName("t")
   @ObfuscatedGetter(
      intValue = -2089434541
   )
   int flags;
   public net.runelite.api.WallObject previousWallObject;
   public net.runelite.api.DecorativeObject previousDecorativeObject;
   public net.runelite.api.GroundObject previousGroundObject;
   public net.runelite.api.GameObject[] previousGameObjects;
   @ObfuscatedName("i")
   @ObfuscatedSignature(
      signature = "Lde;"
   )
   Tile bridge;
   @ObfuscatedName("y")
   boolean drawEntities;
   @ObfuscatedName("d")
   @ObfuscatedGetter(
      intValue = -1115844587
   )
   int wallCullOppositeDirection;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = 1458265213
   )
   int x;
   @ObfuscatedName("h")
   @ObfuscatedSignature(
      signature = "Leb;"
   )
   SceneTilePaint paint;
   @ObfuscatedName("u")
   boolean visible;
   @ObfuscatedName("g")
   @ObfuscatedGetter(
      intValue = -270087367
   )
   int y;

   static {
      lastGroundItems = new RSDeque[4][104][104];
   }

   Tile(int var1, int var2, int var3) {
      this.objects = new GameObject[5];
      this.gameObjectsChanged(-1);
      this.entityFlags = new int[5];
      this.flags = 0;
      this.renderLevel = this.level = var1;
      this.x = var2;
      this.y = var3;
      this.rl$$init();
   }

   public int getPlane() {
      return this.level;
   }

   public int getX() {
      return this.x;
   }

   public net.runelite.api.ItemLayer getItemLayer() {
      return this.itemLayer;
   }

   public net.runelite.api.WallObject getWallObject() {
      return this.wallObject;
   }

   public net.runelite.api.DecorativeObject getDecorativeObject() {
      return this.decorativeObject;
   }

   public net.runelite.api.GroundObject getGroundObject() {
      return this.groundObject;
   }

   public int getY() {
      return this.y;
   }

   public void gameObjectsChanged(int var1) {
      if(var1 != -1) {
         if(this.previousGameObjects == null) {
            this.previousGameObjects = new net.runelite.api.GameObject[5];
         }

         net.runelite.api.GameObject var2 = this.previousGameObjects[var1];
         RSGameObject var3 = (RSGameObject)this.getGameObjects()[var1];
         net.runelite.api.GameObject var4 = lastGameObject;
         lastGameObject = var3;
         this.previousGameObjects[var1] = var3;
         if(var3 == null || !var3.equals(var4)) {
            if(var3 == null || !(var3.getRenderable() instanceof Actor)) {
               if(var3 == null && var2 != null) {
                  GameObjectDespawned var7 = new GameObjectDespawned();
                  var7.setTile(this);
                  var7.setGameObject(var2);
                  ItemContainer.clientInstance.getCallbacks().post(var7);
               } else if(var3 != null && var2 == null) {
                  GameObjectSpawned var6 = new GameObjectSpawned();
                  var6.setTile(this);
                  var6.setGameObject(var3);
                  ItemContainer.clientInstance.getCallbacks().post(var6);
               } else if(var3 != null && var2 != null) {
                  GameObjectChanged var5 = new GameObjectChanged();
                  var5.setTile(this);
                  var5.setPrevious(var2);
                  var5.setGameObject(var3);
                  ItemContainer.clientInstance.getCallbacks().post(var5);
               }
            }

         }
      }
   }

   public net.runelite.api.GameObject[] getGameObjects() {
      return this.objects;
   }

   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1"
   )
   public void wallObjectChanged(int var1) {
      net.runelite.api.WallObject var2 = this.previousWallObject;
      net.runelite.api.WallObject var3 = this.getWallObject();
      this.previousWallObject = var3;
      if(var3 == null && var2 != null) {
         WallObjectDespawned var6 = new WallObjectDespawned();
         var6.setTile(this);
         var6.setWallObject(var2);
         ItemContainer.clientInstance.getCallbacks().post(var6);
      } else if(var3 != null && var2 == null) {
         WallObjectSpawned var5 = new WallObjectSpawned();
         var5.setTile(this);
         var5.setWallObject(var3);
         ItemContainer.clientInstance.getCallbacks().post(var5);
      } else if(var3 != null && var2 != null) {
         WallObjectChanged var4 = new WallObjectChanged();
         var4.setTile(this);
         var4.setPrevious(var2);
         var4.setWallObject(var3);
         ItemContainer.clientInstance.getCallbacks().post(var4);
      }

   }

   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1"
   )
   public void decorativeObjectChanged(int var1) {
      net.runelite.api.DecorativeObject var2 = this.previousDecorativeObject;
      net.runelite.api.DecorativeObject var3 = this.getDecorativeObject();
      this.previousDecorativeObject = var3;
      if(var3 == null && var2 != null) {
         DecorativeObjectDespawned var6 = new DecorativeObjectDespawned();
         var6.setTile(this);
         var6.setDecorativeObject(var2);
         ItemContainer.clientInstance.getCallbacks().post(var6);
      } else if(var3 != null && var2 == null) {
         DecorativeObjectSpawned var5 = new DecorativeObjectSpawned();
         var5.setTile(this);
         var5.setDecorativeObject(var3);
         ItemContainer.clientInstance.getCallbacks().post(var5);
      } else if(var3 != null && var2 != null) {
         DecorativeObjectChanged var4 = new DecorativeObjectChanged();
         var4.setTile(this);
         var4.setPrevious(var2);
         var4.setDecorativeObject(var3);
         ItemContainer.clientInstance.getCallbacks().post(var4);
      }

   }

   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1"
   )
   public void groundObjectChanged(int var1) {
      net.runelite.api.GroundObject var2 = this.previousGroundObject;
      net.runelite.api.GroundObject var3 = this.getGroundObject();
      this.previousGroundObject = var3;
      if(var3 == null && var2 != null) {
         GroundObjectDespawned var6 = new GroundObjectDespawned();
         var6.setTile(this);
         var6.setGroundObject(var2);
         ItemContainer.clientInstance.getCallbacks().post(var6);
      } else if(var3 != null && var2 == null) {
         GroundObjectSpawned var5 = new GroundObjectSpawned();
         var5.setTile(this);
         var5.setGroundObject(var3);
         ItemContainer.clientInstance.getCallbacks().post(var5);
      } else if(var3 != null && var2 != null) {
         GroundObjectChanged var4 = new GroundObjectChanged();
         var4.setTile(this);
         var4.setPrevious(var2);
         var4.setGroundObject(var3);
         ItemContainer.clientInstance.getCallbacks().post(var4);
      }

   }

   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1"
   )
   public void itemLayerChanged(int var1) {
      int var2 = this.getX();
      int var3 = this.getY();
      int var4 = ItemContainer.clientInstance.getPlane();
      RSDeque[][][] var5 = ItemContainer.clientInstance.getGroundItemDeque();
      RSDeque var6 = lastGroundItems[var4][var2][var3];
      RSDeque var7 = var5[var4][var2][var3];
      ItemDespawned var11;
      if(var6 != var7) {
         if(var6 != null) {
            RSNode var8 = var6.getHead();

            for(RSNode var9 = var8.getNext(); var9 != var8; var9 = var9.getNext()) {
               RSItem var10 = (RSItem)var9;
               var11 = new ItemDespawned(this, var10);
               ItemContainer.clientInstance.getCallbacks().post(var11);
            }
         }

         lastGroundItems[var4][var2][var3] = var7;
      }

      RSItem var18 = ItemContainer.clientInstance.getLastItemDespawn();
      if(var18 != null) {
         ItemContainer.clientInstance.setLastItemDespawn((RSItem)null);
      }

      RSItemLayer var19 = (RSItemLayer)this.getItemLayer();
      if(var19 == null) {
         if(var18 != null) {
            ItemDespawned var20 = new ItemDespawned(this, var18);
            ItemContainer.clientInstance.getCallbacks().post(var20);
         }

      } else if(var7 == null) {
         if(var18 != null) {
            var11 = new ItemDespawned(this, var18);
            ItemContainer.clientInstance.getCallbacks().post(var11);
         }

      } else {
         RSNode var21 = var7.getHead();
         Object var12 = null;
         RSNode var13 = var21.getPrevious();
         boolean var14 = false;
         if(var21 != var13) {
            RSItem var15 = (RSItem)var13;
            if(var2 != var15.getX() || var3 != var15.getY()) {
               var12 = var15;
            }
         }

         RSNode var22 = var21.getNext();
         RSItem var16;
         if(var12 == null && var21 != var22) {
            var16 = (RSItem)var22;
            if(var2 != var16.getX() || var3 != var16.getY()) {
               var12 = var16;
               var14 = true;
            }
         }

         if(var18 != null && var18 != var13 && var18 != var22) {
            ItemDespawned var23 = new ItemDespawned(this, var18);
            ItemContainer.clientInstance.getCallbacks().post(var23);
         }

         if(var12 != null) {
            do {
               var16 = (RSItem)var12;
               var16.setX(var2);
               var16.setY(var3);
               ItemSpawned var17 = new ItemSpawned(this, var16);
               ItemContainer.clientInstance.getCallbacks().post(var17);
               var12 = var14?((RSNode)var12).getNext():((RSNode)var12).getPrevious();
            } while(var12 != var21 && (((RSItem)var12).getX() != var2 || ((RSItem)var12).getY() != var3));

         }
      }
   }

   public Point getSceneLocation() {
      return new Point(this.getX(), this.getY());
   }

   private void rl$$init() {
   }

   public WorldPoint getWorldLocation() {
      return WorldPoint.fromScene(ItemContainer.clientInstance, this.getX(), this.getY(), this.getPlane());
   }

   public LocalPoint getLocalLocation() {
      return LocalPoint.fromScene(this.getX(), this.getY());
   }

   public boolean hasLineOfSightTo(net.runelite.api.Tile var1) {
      if(this.getPlane() != var1.getPlane()) {
         return false;
      } else {
         net.runelite.api.CollisionData[] var2 = ItemContainer.clientInstance.getCollisionMaps();
         if(var2 == null) {
            return false;
         } else {
            int var3 = this.getPlane();
            int[][] var4 = var2[var3].getFlags();
            Point var5 = this.getSceneLocation();
            Point var6 = var1.getSceneLocation();
            if(var5.getX() == var6.getX() && var5.getY() == var6.getY()) {
               return true;
            } else {
               int var7 = var6.getX() - var5.getX();
               int var8 = var6.getY() - var5.getY();
               int var9 = Math.abs(var7);
               int var10 = Math.abs(var8);
               int var11 = 131072;
               int var12 = 131072;
               if(var7 < 0) {
                  var11 |= 4096;
               } else {
                  var11 |= 65536;
               }

               if(var8 < 0) {
                  var12 |= 1024;
               } else {
                  var12 |= 16384;
               }

               int var13;
               int var14;
               int var15;
               int var16;
               int var17;
               int var18;
               if(var9 > var10) {
                  var13 = var5.getX();
                  var14 = var5.getY() << 16;
                  var15 = (var8 << 16) / var9;
                  var14 += 32768;
                  if(var8 < 0) {
                     --var14;
                  }

                  var16 = var7 < 0?-1:1;

                  while(var13 != var6.getX()) {
                     var13 += var16;
                     var17 = var14 >>> 16;
                     if((var4[var13][var17] & var11) != 0) {
                        return false;
                     }

                     var14 += var15;
                     var18 = var14 >>> 16;
                     if(var18 != var17 && (var4[var13][var18] & var12) != 0) {
                        return false;
                     }
                  }
               } else {
                  var13 = var5.getY();
                  var14 = var5.getX() << 16;
                  var15 = (var7 << 16) / var10;
                  var14 += 32768;
                  if(var7 < 0) {
                     --var14;
                  }

                  var16 = var8 < 0?-1:1;

                  while(var13 != var6.getY()) {
                     var13 += var16;
                     var17 = var14 >>> 16;
                     if((var4[var17][var13] & var12) != 0) {
                        return false;
                     }

                     var14 += var15;
                     var18 = var14 >>> 16;
                     if(var18 != var17 && (var4[var18][var13] & var11) != 0) {
                        return false;
                     }
                  }
               }

               return true;
            }
         }
      }
   }

   public List getGroundItems() {
      net.runelite.api.ItemLayer var1 = this.getItemLayer();
      if(var1 == null) {
         return null;
      } else {
         ArrayList var2 = new ArrayList();

         for(Object var3 = var1.getBottom(); var3 instanceof net.runelite.api.Item; var3 = ((net.runelite.api.Node)var3).getNext()) {
            var2.add((net.runelite.api.Item)var3);
         }

         return var2;
      }
   }

   public int getRenderLevel() {
      return this.renderLevel;
   }

   public net.runelite.api.SceneTilePaint getSceneTilePaint() {
      return this.paint;
   }

   public net.runelite.api.SceneTileModel getSceneTileModel() {
      return this.overlay;
   }

   public int getFlags() {
      return this.flags;
   }

   public int getPhysicalLevel() {
      return this.physicalLevel;
   }

   public void setDraw(boolean var1) {
      this.draw = var1;
   }

   public boolean isDraw() {
      return this.draw;
   }

   public void setVisible(boolean var1) {
      this.visible = var1;
   }

   public boolean isVisible() {
      return this.visible;
   }

   public void setDrawEntities(boolean var1) {
      this.drawEntities = var1;
   }

   public void setWallCullDirection(int var1) {
      this.wallCullDirection = var1;
   }

   public RSTile getBridge() {
      return this.bridge;
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "-120"
   )
   public static void method3823() {
      try {
         File var0 = new File(class69.homeDir, "random.dat");
         int var2;
         if(var0.exists()) {
            class75.uidDat = new CacheFile(new FileOnDisk(var0, "rw", 25L), 24, 0);
         } else {
            label39:
            for(int var1 = 0; var1 < class211.historicCacheDirectories.length; ++var1) {
               for(var2 = 0; var2 < class133.historicCacheLocations.length; ++var2) {
                  File var3 = new File(class133.historicCacheLocations[var2] + class211.historicCacheDirectories[var1] + File.separatorChar + "random.dat");
                  if(var3.exists()) {
                     class75.uidDat = new CacheFile(new FileOnDisk(var3, "rw", 25L), 24, 0);
                     break label39;
                  }
               }
            }
         }

         if(class75.uidDat == null) {
            RandomAccessFile var4 = new RandomAccessFile(var0, "rw");
            var2 = var4.read();
            var4.seek(0L);
            var4.write(var2);
            var4.seek(0L);
            var4.close();
            class75.uidDat = new CacheFile(new FileOnDisk(var0, "rw", 25L), 24, 0);
         }
      } catch (IOException var5) {
         ;
      }

   }

   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "([BB)V",
      garbageValue = "92"
   )
   static synchronized void method3822(byte[] var0) {
      if(var0.length == 100 && class235.field2428 < 1000) {
         class235.field2433[++class235.field2428 - 1] = var0;
      } else if(var0.length == 5000 && class235.field2425 < 250) {
         class235.field2429[++class235.field2425 - 1] = var0;
      } else if(var0.length == 30000 && class235.field2427 < 50) {
         class235.field2430[++class235.field2427 - 1] = var0;
      } else {
         if(class235.field2432 != null) {
            for(int var1 = 0; var1 < class235.field2431.length; ++var1) {
               if(var0.length == class235.field2431[var1] && class83.field1964[var1] < class235.field2432[var1].length) {
                  class235.field2432[var1][class83.field1964[var1]++] = var0;
                  return;
               }
            }
         }

      }
   }

   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "(IIB)Lcs;",
      garbageValue = "1"
   )
   static class314 method3824(int var0, int var1) {
      class314 var2 = (class314)class314.field1269.method635((long)(var0 << 16));
      if(var2 != null) {
         return var2;
      } else {
         String var3 = String.valueOf(var0);
         int var4 = class27.clientscripts.method4132(var3);
         if(var4 == -1) {
            return null;
         } else {
            byte[] var5 = class27.clientscripts.method4122(var4);
            if(var5 != null) {
               if(var5.length <= 1) {
                  return null;
               }

               var2 = class191.method3809(var5);
               if(var2 != null) {
                  class314.field1269.method628(var2, (long)(var0 << 16));
                  return var2;
               }
            }

            return null;
         }
      }
   }

   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "(CB)C",
      garbageValue = "-13"
   )
   static char method3825(char var0) {
      return var0 != 181 && var0 != 131?Character.toTitleCase(var0):var0;
   }
}
