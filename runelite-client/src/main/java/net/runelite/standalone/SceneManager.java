package net.runelite.standalone;

import net.runelite.api.Perspective;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.hooks.DrawCallbacks;
import net.runelite.client.callback.Hooks;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.api.RSDecorativeObject;
import net.runelite.rs.api.RSGameObject;
import net.runelite.rs.api.RSGroundObject;
import net.runelite.rs.api.RSItemLayer;
import net.runelite.rs.api.RSNPC;
import net.runelite.rs.api.RSPlayer;
import net.runelite.rs.api.RSProjectile;
import net.runelite.rs.api.RSScene;
import net.runelite.rs.api.RSSceneTileModel;
import net.runelite.rs.api.RSTile;
import net.runelite.rs.api.RSWallObject;

@ObfuscatedName("en")
public class SceneManager implements RSScene {
   private static byte[][][] rl$underlayIds;
   private static byte[][][] rl$overlayIds;
   @ObfuscatedName("ak")
   static final int[] WALL_UNCULL_FLAGS_1;
   @ObfuscatedName("bn")
   static int field1824;
   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      signature = "[[Les;"
   )
   static Occluder[][] levelOccluders;
   @ObfuscatedName("bb")
   static int field1858;
   @ObfuscatedName("l")
   static int tileUpdateCount;
   @ObfuscatedName("v")
   static int minTileZ;
   @ObfuscatedName("af")
   static int pitchCos;
   @ObfuscatedName("al")
   static int field1836;
   @ObfuscatedName("ae")
   public static int selectedRegionTileX;
   @ObfuscatedName("k")
   static int maxTileX;
   @ObfuscatedName("w")
   static int screenCenterX;
   @ObfuscatedName("bg")
   static boolean[][] renderArea;
   @ObfuscatedName("br")
   static int field1854;
   @ObfuscatedName("au")
   static boolean viewportWalking;
   @ObfuscatedName("ag")
   static int pitchSin;
   @ObfuscatedName("aw")
   static int field1825;
   @ObfuscatedName("o")
   static int Scene_plane;
   @ObfuscatedName("a")
   public static boolean regionLowMemory;
   @ObfuscatedName("ai")
   static int[] levelOccluderCount;
   @ObfuscatedName("z")
   static int cameraZ2;
   @ObfuscatedName("av")
   public static int selectedRegionTileY;
   @ObfuscatedName("c")
   static int cameraX2;
   @ObfuscatedName("bk")
   static int field1856;
   @ObfuscatedName("ay")
   static int yawSin;
   @ObfuscatedName("ah")
   static boolean checkClick;
   @ObfuscatedName("an")
   static int mouseX2;
   public static int rl$drawDistance;
   public static int[] tmpX;
   public static int[] tmpY;
   @ObfuscatedName("i")
   static int screenCenterZ;
   @ObfuscatedName("bv")
   static boolean[][][][] visibilityMaps;
   @ObfuscatedName("at")
   static int mouseY2;
   @ObfuscatedName("y")
   static int minTileX;
   @ObfuscatedName("am")
   static final int[] WALL_UNCULL_FLAGS_2;
   @ObfuscatedName("bf")
   static final int[] WALL_UNCULL_FLAGS_3;
   @ObfuscatedName("ax")
   static final int[] TILE_WALL_DRAW_FLAGS_1;
   @ObfuscatedName("d")
   static int maxTileZ;
   @ObfuscatedName("ar")
   static int MAX_OCCLUDER_LEVELS;
   @ObfuscatedName("ad")
   static final int[] field1832;
   @ObfuscatedName("j")
   static int cameraY2;
   @ObfuscatedName("aa")
   static int yawCos;
   @ObfuscatedName("bl")
   static int field1857;
   @ObfuscatedName("az")
   @ObfuscatedSignature(
      signature = "[Les;"
   )
   static Occluder[] field1837;
   @ObfuscatedName("bw")
   static int field1859;
   @ObfuscatedName("ap")
   static final int[] WALL_UNCULL_FLAGS_0;
   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      signature = "Lhv;"
   )
   static Deque tileDeque;
   @ObfuscatedName("u")
   static int cycle;
   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      signature = "[Ler;"
   )
   static GameObject[] entityBuffer;
   @ObfuscatedName("ao")
   static final int[] field1835;
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "[[[Lde;"
   )
   Tile[][][] tiles;
   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "[Ler;"
   )
   GameObject[] objects;
   @ObfuscatedName("x")
   int maxZ;
   @ObfuscatedName("m")
   int entityCount;
   @ObfuscatedName("p")
   int minLevel;
   @ObfuscatedName("b")
   int[][][] tileCycles;
   @ObfuscatedName("bp")
   int[][] TILE_ROTATION_2D;
   @ObfuscatedName("s")
   int maxY;
   @ObfuscatedName("bi")
   int[][] TILE_MASK_2D;
   @ObfuscatedName("h")
   int[][][] tileHeights;
   @ObfuscatedName("g")
   int maxX;

   static {
      regionLowMemory = true;
      tileUpdateCount = 0;
      Scene_plane = 0;
      entityBuffer = new GameObject[100];
      checkClick = false;
      field1825 = 0;
      mouseX2 = 0;
      mouseY2 = 0;
      selectedRegionTileX = -1;
      selectedRegionTileY = -1;
      viewportWalking = false;
      MAX_OCCLUDER_LEVELS = 4;
      levelOccluderCount = new int[MAX_OCCLUDER_LEVELS];
      levelOccluders = new Occluder[MAX_OCCLUDER_LEVELS][500];
      field1836 = 0;
      field1837 = new Occluder[500];
      tileDeque = new Deque();
      field1835 = new int[]{19, 55, 38, 155, 255, 110, 137, 205, 76};
      field1832 = new int[]{160, 192, 80, 96, 0, 144, 80, 48, 160};
      TILE_WALL_DRAW_FLAGS_1 = new int[]{76, 8, 137, 4, 0, 1, 38, 2, 19};
      WALL_UNCULL_FLAGS_0 = new int[]{0, 0, 2, 0, 0, 2, 1, 1, 0};
      WALL_UNCULL_FLAGS_1 = new int[]{2, 0, 0, 2, 0, 0, 0, 4, 4};
      WALL_UNCULL_FLAGS_2 = new int[]{0, 4, 4, 8, 0, 0, 8, 0, 0};
      WALL_UNCULL_FLAGS_3 = new int[]{1, 1, 0, 0, 0, 8, 0, 0, 8};
      visibilityMaps = new boolean[8][32][51][51];
      rl$$clinit();
   }

   public SceneManager(int var1, int var2, int var3, int[][][] var4) {
      this.minLevel = 0;
      this.entityCount = 0;
      this.objects = new GameObject[5000];
      this.TILE_MASK_2D = new int[][]{{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, {1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1}, {1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0}, {0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1}, {0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, {1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1}, {1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0}, {1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1}, {1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1}};
      this.TILE_ROTATION_2D = new int[][]{{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15}, {12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3}, {15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0}, {3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12}};
      this.maxY = var1;
      this.maxX = var2;
      this.maxZ = var3;
      this.tiles = new Tile[var1][var2][var3];
      this.tileCycles = new int[var1][var2 + 1][var3 + 1];
      this.tileHeights = var4;
      this.method3622();
      this.rl$$init();
      this.rl$$init1();
   }

   @ObfuscatedName("ak")
   @ObfuscatedSignature(
      signature = "(Lde;Z)V"
   )
   void method3641(Tile var1, boolean var2) {
      tileDeque.method3906(var1);

      while(true) {
         Tile var3;
         int var4;
         int var5;
         int var6;
         int var7;
         Tile[][] var8;
         Tile var9;
         int var11;
         int var14;
         int var15;
         int var16;
         int var24;
         int var25;
         do {
            do {
               do {
                  do {
                     do {
                        do {
                           while(true) {
                              WallObject var10;
                              GameObject var12;
                              int var17;
                              int var18;
                              boolean var20;
                              int var21;
                              Tile var36;
                              while(true) {
                                 do {
                                    var3 = (Tile)tileDeque.method3909();
                                    if(var3 == null) {
                                       return;
                                    }
                                 } while(!var3.visible);

                                 var4 = var3.x;
                                 var5 = var3.y;
                                 var6 = var3.level;
                                 var7 = var3.renderLevel;
                                 var8 = this.tiles[var6];
                                 if(!var3.draw) {
                                    break;
                                 }

                                 if(var2) {
                                    if(var6 > 0) {
                                       var9 = this.tiles[var6 - 1][var4][var5];
                                       if(var9 != null && var9.visible) {
                                          continue;
                                       }
                                    }

                                    if(var4 <= screenCenterX && var4 > minTileX) {
                                       var9 = var8[var4 - 1][var5];
                                       if(var9 != null && var9.visible && (var9.draw || (var3.flags & 1) == 0)) {
                                          continue;
                                       }
                                    }

                                    if(var4 >= screenCenterX && var4 < maxTileX - 1) {
                                       var9 = var8[var4 + 1][var5];
                                       if(var9 != null && var9.visible && (var9.draw || (var3.flags & 4) == 0)) {
                                          continue;
                                       }
                                    }

                                    if(var5 <= screenCenterZ && var5 > minTileZ) {
                                       var9 = var8[var4][var5 - 1];
                                       if(var9 != null && var9.visible && (var9.draw || (var3.flags & 8) == 0)) {
                                          continue;
                                       }
                                    }

                                    if(var5 >= screenCenterZ && var5 < maxTileZ - 1) {
                                       var9 = var8[var4][var5 + 1];
                                       if(var9 != null && var9.visible && (var9.draw || (var3.flags & 2) == 0)) {
                                          continue;
                                       }
                                    }
                                 } else {
                                    var2 = true;
                                 }

                                 var3.draw = false;
                                 if(var3.bridge != null) {
                                    var9 = var3.bridge;
                                    if(var9.paint != null) {
                                       if(!this.method3669(0, var4, var5)) {
                                          this.method3712(var9.paint, 0, pitchSin, pitchCos, yawSin, yawCos, var4, var5);
                                       }
                                    } else if(var9.overlay != null && !this.method3669(0, var4, var5)) {
                                       this.method3665(var9.overlay, pitchSin, pitchCos, yawSin, yawCos, var4, var5);
                                    }

                                    var10 = var9.wallObject;
                                    if(var10 != null) {
                                       Hooks.renderDraw(var10.entity1, 0, pitchSin, pitchCos, yawSin, yawCos, var10.x - cameraX2, var10.floor - cameraY2, var10.y - cameraZ2, var10.hash);
                                    }

                                    for(var11 = 0; var11 < var9.entityCount; ++var11) {
                                       var12 = var9.objects[var11];
                                       if(var12 != null) {
                                          Hooks.renderDraw(var12.entity, var12.orientation, pitchSin, pitchCos, yawSin, yawCos, var12.x - cameraX2, var12.height - cameraY2, var12.y - cameraZ2, var12.hash);
                                       }
                                    }
                                 }

                                 var20 = false;
                                 if(var3.paint != null) {
                                    if(!this.method3669(var7, var4, var5)) {
                                       var20 = true;
                                       if(var3.paint.neColor != 12345678 || checkClick && var6 <= field1825) {
                                          this.method3712(var3.paint, var7, pitchSin, pitchCos, yawSin, yawCos, var4, var5);
                                       }
                                    }
                                 } else if(var3.overlay != null && !this.method3669(var7, var4, var5)) {
                                    var20 = true;
                                    this.method3665(var3.overlay, pitchSin, pitchCos, yawSin, yawCos, var4, var5);
                                 }

                                 var21 = 0;
                                 var11 = 0;
                                 WallObject var31 = var3.wallObject;
                                 DecorativeObject var13 = var3.decorativeObject;
                                 if(var31 != null || var13 != null) {
                                    if(var4 == screenCenterX) {
                                       ++var21;
                                    } else if(screenCenterX < var4) {
                                       var21 += 2;
                                    }

                                    if(var5 == screenCenterZ) {
                                       var21 += 3;
                                    } else if(screenCenterZ > var5) {
                                       var21 += 6;
                                    }

                                    var11 = field1835[var21];
                                    var3.wallDrawFlags = TILE_WALL_DRAW_FLAGS_1[var21];
                                 }

                                 if(var31 != null) {
                                    if((var31.orientationA & field1832[var21]) != 0) {
                                       if(var31.orientationA == 16) {
                                          var3.wallCullDirection = 3;
                                          var3.wallUncullDirection = WALL_UNCULL_FLAGS_0[var21];
                                          var3.wallCullOppositeDirection = 3 - var3.wallUncullDirection;
                                       } else if(var31.orientationA == 32) {
                                          var3.wallCullDirection = 6;
                                          var3.wallUncullDirection = WALL_UNCULL_FLAGS_1[var21];
                                          var3.wallCullOppositeDirection = 6 - var3.wallUncullDirection;
                                       } else if(var31.orientationA == 64) {
                                          var3.wallCullDirection = 12;
                                          var3.wallUncullDirection = WALL_UNCULL_FLAGS_2[var21];
                                          var3.wallCullOppositeDirection = 12 - var3.wallUncullDirection;
                                       } else {
                                          var3.wallCullDirection = 9;
                                          var3.wallUncullDirection = WALL_UNCULL_FLAGS_3[var21];
                                          var3.wallCullOppositeDirection = 9 - var3.wallUncullDirection;
                                       }
                                    } else {
                                       var3.wallCullDirection = 0;
                                    }

                                    if((var31.orientationA & var11) != 0 && !this.method3727(var7, var4, var5, var31.orientationA)) {
                                       Hooks.renderDraw(var31.entity1, 0, pitchSin, pitchCos, yawSin, yawCos, var31.x - cameraX2, var31.floor - cameraY2, var31.y - cameraZ2, var31.hash);
                                    }

                                    if((var31.orientationB & var11) != 0 && !this.method3727(var7, var4, var5, var31.orientationB)) {
                                       Hooks.renderDraw(var31.entity2, 0, pitchSin, pitchCos, yawSin, yawCos, var31.x - cameraX2, var31.floor - cameraY2, var31.y - cameraZ2, var31.hash);
                                    }
                                 }

                                 if(var13 != null && !this.method3660(var7, var4, var5, var13.entity1.modelHeight)) {
                                    if((var13.renderFlag & var11) != 0) {
                                       Hooks.renderDraw(var13.entity1, 0, pitchSin, pitchCos, yawSin, yawCos, var13.x - cameraX2 + var13.offsetX, var13.floor - cameraY2, var13.y - cameraZ2 + var13.offsetY, var13.hash);
                                    } else if(var13.renderFlag == 256) {
                                       var14 = var13.x - cameraX2;
                                       var15 = var13.floor - cameraY2;
                                       var16 = var13.y - cameraZ2;
                                       var17 = var13.rotation;
                                       if(var17 != 1 && var17 != 2) {
                                          var18 = var14;
                                       } else {
                                          var18 = -var14;
                                       }

                                       int var19;
                                       if(var17 != 2 && var17 != 3) {
                                          var19 = var16;
                                       } else {
                                          var19 = -var16;
                                       }

                                       if(var19 < var18) {
                                          Hooks.renderDraw(var13.entity1, 0, pitchSin, pitchCos, yawSin, yawCos, var14 + var13.offsetX, var15, var16 + var13.offsetY, var13.hash);
                                       } else if(var13.entity2 != null) {
                                          Hooks.renderDraw(var13.entity2, 0, pitchSin, pitchCos, yawSin, yawCos, var14, var15, var16, var13.hash);
                                       }
                                    }
                                 }

                                 if(var20) {
                                    GroundObject var22 = var3.groundObject;
                                    if(var22 != null) {
                                       Hooks.renderDraw(var22.entity, 0, pitchSin, pitchCos, yawSin, yawCos, var22.x - cameraX2, var22.floor - cameraY2, var22.y - cameraZ2, var22.hash);
                                    }

                                    ItemLayer var23 = var3.itemLayer;
                                    if(var23 != null && var23.height == 0) {
                                       if(var23.middle != null) {
                                          Hooks.renderDraw(var23.middle, 0, pitchSin, pitchCos, yawSin, yawCos, var23.x - cameraX2, var23.tileHeight - cameraY2, var23.y - cameraZ2, var23.hash);
                                       }

                                       if(var23.top != null) {
                                          Hooks.renderDraw(var23.top, 0, pitchSin, pitchCos, yawSin, yawCos, var23.x - cameraX2, var23.tileHeight - cameraY2, var23.y - cameraZ2, var23.hash);
                                       }

                                       if(var23.bottom != null) {
                                          Hooks.renderDraw(var23.bottom, 0, pitchSin, pitchCos, yawSin, yawCos, var23.x - cameraX2, var23.tileHeight - cameraY2, var23.y - cameraZ2, var23.hash);
                                       }
                                    }
                                 }

                                 var14 = var3.flags;
                                 if(var14 != 0) {
                                    if(var4 < screenCenterX && (var14 & 4) != 0) {
                                       var36 = var8[var4 + 1][var5];
                                       if(var36 != null && var36.visible) {
                                          tileDeque.method3906(var36);
                                       }
                                    }

                                    if(var5 < screenCenterZ && (var14 & 2) != 0) {
                                       var36 = var8[var4][var5 + 1];
                                       if(var36 != null && var36.visible) {
                                          tileDeque.method3906(var36);
                                       }
                                    }

                                    if(var4 > screenCenterX && (var14 & 1) != 0) {
                                       var36 = var8[var4 - 1][var5];
                                       if(var36 != null && var36.visible) {
                                          tileDeque.method3906(var36);
                                       }
                                    }

                                    if(var5 > screenCenterZ && (var14 & 8) != 0) {
                                       var36 = var8[var4][var5 - 1];
                                       if(var36 != null && var36.visible) {
                                          tileDeque.method3906(var36);
                                       }
                                    }
                                 }
                                 break;
                              }

                              if(var3.wallCullDirection != 0) {
                                 var20 = true;

                                 for(var21 = 0; var21 < var3.entityCount; ++var21) {
                                    if(var3.objects[var21].cycle != cycle && (var3.entityFlags[var21] & var3.wallCullDirection) == var3.wallUncullDirection) {
                                       var20 = false;
                                       break;
                                    }
                                 }

                                 if(var20) {
                                    var10 = var3.wallObject;
                                    if(!this.method3727(var7, var4, var5, var10.orientationA)) {
                                       Hooks.renderDraw(var10.entity1, 0, pitchSin, pitchCos, yawSin, yawCos, var10.x - cameraX2, var10.floor - cameraY2, var10.y - cameraZ2, var10.hash);
                                    }

                                    var3.wallCullDirection = 0;
                                 }
                              }

                              if(!var3.drawEntities) {
                                 break;
                              }

                              try {
                                 int var34 = var3.entityCount;
                                 var3.drawEntities = false;
                                 var21 = 0;

                                 label563:
                                 for(var11 = 0; var11 < var34; ++var11) {
                                    var12 = var3.objects[var11];
                                    if(var12.cycle != cycle) {
                                       for(var24 = var12.relativeX; var24 <= var12.offsetX; ++var24) {
                                          for(var14 = var12.relativeY; var14 <= var12.offsetY; ++var14) {
                                             var36 = var8[var24][var14];
                                             if(var36.draw) {
                                                var3.drawEntities = true;
                                                continue label563;
                                             }

                                             if(var36.wallCullDirection != 0) {
                                                var16 = 0;
                                                if(var24 > var12.relativeX) {
                                                   ++var16;
                                                }

                                                if(var24 < var12.offsetX) {
                                                   var16 += 4;
                                                }

                                                if(var14 > var12.relativeY) {
                                                   var16 += 8;
                                                }

                                                if(var14 < var12.offsetY) {
                                                   var16 += 2;
                                                }

                                                if((var16 & var36.wallCullDirection) == var3.wallCullOppositeDirection) {
                                                   var3.drawEntities = true;
                                                   continue label563;
                                                }
                                             }
                                          }
                                       }

                                       entityBuffer[var21++] = var12;
                                       var24 = screenCenterX - var12.relativeX;
                                       var14 = var12.offsetX - screenCenterX;
                                       if(var14 > var24) {
                                          var24 = var14;
                                       }

                                       var15 = screenCenterZ - var12.relativeY;
                                       var16 = var12.offsetY - screenCenterZ;
                                       if(var16 > var15) {
                                          var12.drawPriority = var24 + var16;
                                       } else {
                                          var12.drawPriority = var24 + var15;
                                       }
                                    }
                                 }

                                 while(var21 > 0) {
                                    var11 = -50;
                                    var25 = -1;

                                    for(var24 = 0; var24 < var21; ++var24) {
                                       GameObject var35 = entityBuffer[var24];
                                       if(var35.cycle != cycle) {
                                          if(var35.drawPriority > var11) {
                                             var11 = var35.drawPriority;
                                             var25 = var24;
                                          } else if(var11 == var35.drawPriority) {
                                             var15 = var35.x - cameraX2;
                                             var16 = var35.y - cameraZ2;
                                             var17 = entityBuffer[var25].x - cameraX2;
                                             var18 = entityBuffer[var25].y - cameraZ2;
                                             if(var15 * var15 + var16 * var16 > var17 * var17 + var18 * var18) {
                                                var25 = var24;
                                             }
                                          }
                                       }
                                    }

                                    if(var25 == -1) {
                                       break;
                                    }

                                    GameObject var33 = entityBuffer[var25];
                                    var33.cycle = cycle;
                                    if(!this.method3724(var7, var33.relativeX, var33.offsetX, var33.relativeY, var33.offsetY, var33.entity.modelHeight)) {
                                       Hooks.renderDraw(var33.entity, var33.orientation, pitchSin, pitchCos, yawSin, yawCos, var33.x - cameraX2, var33.height - cameraY2, var33.y - cameraZ2, var33.hash);
                                    }

                                    for(var14 = var33.relativeX; var14 <= var33.offsetX; ++var14) {
                                       for(var15 = var33.relativeY; var15 <= var33.offsetY; ++var15) {
                                          Tile var26 = var8[var14][var15];
                                          if(var26.wallCullDirection != 0) {
                                             tileDeque.method3906(var26);
                                          } else if((var14 != var4 || var15 != var5) && var26.visible) {
                                             tileDeque.method3906(var26);
                                          }
                                       }
                                    }
                                 }

                                 if(!var3.drawEntities) {
                                    break;
                                 }
                              } catch (Exception var28) {
                                 var3.drawEntities = false;
                                 break;
                              }
                           }
                        } while(!var3.visible);
                     } while(var3.wallCullDirection != 0);

                     if(var4 > screenCenterX || var4 <= minTileX) {
                        break;
                     }

                     var9 = var8[var4 - 1][var5];
                  } while(var9 != null && var9.visible);

                  if(var4 < screenCenterX || var4 >= maxTileX - 1) {
                     break;
                  }

                  var9 = var8[var4 + 1][var5];
               } while(var9 != null && var9.visible);

               if(var5 > screenCenterZ || var5 <= minTileZ) {
                  break;
               }

               var9 = var8[var4][var5 - 1];
            } while(var9 != null && var9.visible);

            if(var5 < screenCenterZ || var5 >= maxTileZ - 1) {
               break;
            }

            var9 = var8[var4][var5 + 1];
         } while(var9 != null && var9.visible);

         var3.visible = false;
         --tileUpdateCount;
         ItemLayer var32 = var3.itemLayer;
         if(var32 != null && var32.height != 0) {
            if(var32.middle != null) {
               Hooks.renderDraw(var32.middle, 0, pitchSin, pitchCos, yawSin, yawCos, var32.x - cameraX2, var32.tileHeight - cameraY2 - var32.height, var32.y - cameraZ2, var32.hash);
            }

            if(var32.top != null) {
               Hooks.renderDraw(var32.top, 0, pitchSin, pitchCos, yawSin, yawCos, var32.x - cameraX2, var32.tileHeight - cameraY2 - var32.height, var32.y - cameraZ2, var32.hash);
            }

            if(var32.bottom != null) {
               Hooks.renderDraw(var32.bottom, 0, pitchSin, pitchCos, yawSin, yawCos, var32.x - cameraX2, var32.tileHeight - cameraY2 - var32.height, var32.y - cameraZ2, var32.hash);
            }
         }

         if(var3.wallDrawFlags != 0) {
            DecorativeObject var29 = var3.decorativeObject;
            if(var29 != null && !this.method3660(var7, var4, var5, var29.entity1.modelHeight)) {
               if((var29.renderFlag & var3.wallDrawFlags) != 0) {
                  Hooks.renderDraw(var29.entity1, 0, pitchSin, pitchCos, yawSin, yawCos, var29.x - cameraX2 + var29.offsetX, var29.floor - cameraY2, var29.y - cameraZ2 + var29.offsetY, var29.hash);
               } else if(var29.renderFlag == 256) {
                  var11 = var29.x - cameraX2;
                  var25 = var29.floor - cameraY2;
                  var24 = var29.y - cameraZ2;
                  var14 = var29.rotation;
                  if(var14 != 1 && var14 != 2) {
                     var15 = var11;
                  } else {
                     var15 = -var11;
                  }

                  if(var14 != 2 && var14 != 3) {
                     var16 = var24;
                  } else {
                     var16 = -var24;
                  }

                  if(var16 >= var15) {
                     Hooks.renderDraw(var29.entity1, 0, pitchSin, pitchCos, yawSin, yawCos, var11 + var29.offsetX, var25, var24 + var29.offsetY, var29.hash);
                  } else if(var29.entity2 != null) {
                     Hooks.renderDraw(var29.entity2, 0, pitchSin, pitchCos, yawSin, yawCos, var11, var25, var24, var29.hash);
                  }
               }
            }

            WallObject var27 = var3.wallObject;
            if(var27 != null) {
               if((var27.orientationB & var3.wallDrawFlags) != 0 && !this.method3727(var7, var4, var5, var27.orientationB)) {
                  Hooks.renderDraw(var27.entity2, 0, pitchSin, pitchCos, yawSin, yawCos, var27.x - cameraX2, var27.floor - cameraY2, var27.y - cameraZ2, var27.hash);
               }

               if((var27.orientationA & var3.wallDrawFlags) != 0 && !this.method3727(var7, var4, var5, var27.orientationA)) {
                  Hooks.renderDraw(var27.entity1, 0, pitchSin, pitchCos, yawSin, yawCos, var27.x - cameraX2, var27.floor - cameraY2, var27.y - cameraZ2, var27.hash);
               }
            }
         }

         Tile var30;
         if(var6 < this.maxY - 1) {
            var30 = this.tiles[var6 + 1][var4][var5];
            if(var30 != null && var30.visible) {
               tileDeque.method3906(var30);
            }
         }

         if(var4 < screenCenterX) {
            var30 = var8[var4 + 1][var5];
            if(var30 != null && var30.visible) {
               tileDeque.method3906(var30);
            }
         }

         if(var5 < screenCenterZ) {
            var30 = var8[var4][var5 + 1];
            if(var30 != null && var30.visible) {
               tileDeque.method3906(var30);
            }
         }

         if(var4 > screenCenterX) {
            var30 = var8[var4 - 1][var5];
            if(var30 != null && var30.visible) {
               tileDeque.method3906(var30);
            }
         }

         if(var5 > screenCenterZ) {
            var30 = var8[var4][var5 - 1];
            if(var30 != null && var30.visible) {
               tileDeque.method3906(var30);
            }
         }
      }
   }

   @ObfuscatedName("f")
   public void method3637(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19, int var20) {
      SceneTilePaint var21;
      int var22;
      if(var4 == 0) {
         var21 = new SceneTilePaint(var11, var12, var13, var14, -1, var19, false);

         for(var22 = var1; var22 >= 0; --var22) {
            if(this.tiles[var22][var2][var3] == null) {
               this.tiles[var22][var2][var3] = new Tile(var22, var2, var3);
            }
         }

         this.tiles[var1][var2][var3].paint = var21;
      } else if(var4 != 1) {
         SceneTileModel var23 = new SceneTileModel(var4, var5, var6, var2, var3, var7, var8, var9, var10, var11, var12, var13, var14, var15, var16, var17, var18, var19, var20);

         for(var22 = var1; var22 >= 0; --var22) {
            if(this.tiles[var22][var2][var3] == null) {
               this.tiles[var22][var2][var3] = new Tile(var22, var2, var3);
            }
         }

         this.tiles[var1][var2][var3].overlay = var23;
      } else {
         var21 = new SceneTilePaint(var15, var16, var17, var18, var6, var20, var8 == var7 && var7 == var9 && var10 == var7);

         for(var22 = var1; var22 >= 0; --var22) {
            if(this.tiles[var22][var2][var3] == null) {
               this.tiles[var22][var2][var3] = new Tile(var22, var2, var3);
            }
         }

         this.tiles[var1][var2][var3].paint = var21;
      }
   }

   @ObfuscatedName("aq")
   public void method3737(int[] var1, int var2, int var3, int var4, int var5, int var6) {
      Tile var7 = this.tiles[var4][var5][var6];
      if(var7 != null) {
         SceneTilePaint var8 = var7.paint;
         int var10;
         if(var8 != null) {
            int var9 = var8.rgb;
            if(var9 != 0) {
               for(var10 = 0; var10 < 4; ++var10) {
                  var1[var2] = var9;
                  var1[var2 + 1] = var9;
                  var1[var2 + 2] = var9;
                  var1[var2 + 3] = var9;
                  var2 += var3;
               }

            }
         } else {
            SceneTileModel var18 = var7.overlay;
            if(var18 != null) {
               var10 = var18.shape;
               int var11 = var18.rotation;
               int var12 = var18.underlay;
               int var13 = var18.overlay;
               int[] var14 = this.TILE_MASK_2D[var10];
               int[] var15 = this.TILE_ROTATION_2D[var11];
               int var16 = 0;
               int var17;
               if(var12 != 0) {
                  for(var17 = 0; var17 < 4; ++var17) {
                     var1[var2] = var14[var15[var16++]] == 0?var12:var13;
                     var1[var2 + 1] = var14[var15[var16++]] == 0?var12:var13;
                     var1[var2 + 2] = var14[var15[var16++]] == 0?var12:var13;
                     var1[var2 + 3] = var14[var15[var16++]] == 0?var12:var13;
                     var2 += var3;
                  }
               } else {
                  for(var17 = 0; var17 < 4; ++var17) {
                     if(var14[var15[var16++]] != 0) {
                        var1[var2] = var13;
                     }

                     if(var14[var15[var16++]] != 0) {
                        var1[var2 + 1] = var13;
                     }

                     if(var14[var15[var16++]] != 0) {
                        var1[var2 + 2] = var13;
                     }

                     if(var14[var15[var16++]] != 0) {
                        var1[var2 + 3] = var13;
                     }

                     var2 += var3;
                  }
               }

            }
         }
      }
   }

   @ObfuscatedName("l")
   public void method3635() {
      for(int var1 = 0; var1 < this.entityCount; ++var1) {
         GameObject var2 = this.objects[var1];
         this.method3655(var2);
         this.objects[var1] = null;
      }

      this.entityCount = 0;
   }

   @ObfuscatedName("v")
   public void method3640(int var1, int var2, int var3) {
      Tile var4 = this.tiles[var1][var2][var3];
      if(var4 != null) {
         for(int var5 = 0; var5 < var4.entityCount; ++var5) {
            GameObject var6 = var4.objects[var5];
            if(ChatHistory.method6262(var6.hash) && var2 == var6.relativeX && var3 == var6.relativeY) {
               this.method3655(var6);
               return;
            }
         }

      }
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "(IIIIILem;IJZ)Z"
   )
   public boolean method3754(int var1, int var2, int var3, int var4, int var5, Entity var6, int var7, long var8, boolean var10) {
      if(var6 == null) {
         return true;
      } else {
         int var11 = var2 - var5;
         int var12 = var3 - var5;
         int var13 = var5 + var2;
         int var14 = var3 + var5;
         if(var10) {
            if(var7 > 640 && var7 < 1408) {
               var14 += 128;
            }

            if(var7 > 1152 && var7 < 1920) {
               var13 += 128;
            }

            if(var7 > 1664 || var7 < 384) {
               var12 -= 128;
            }

            if(var7 > 128 && var7 < 896) {
               var11 -= 128;
            }
         }

         var11 /= 128;
         var12 /= 128;
         var13 /= 128;
         var14 /= 128;
         return this.method3634(var1, var11, var12, var13 - var11 + 1, var14 - var12 + 1, var2, var3, var4, var6, var7, true, var8, 0);
      }
   }

   @ObfuscatedName("r")
   @ObfuscatedSignature(
      signature = "(IIIIILem;IJIIII)Z"
   )
   public boolean method3783(int var1, int var2, int var3, int var4, int var5, Entity var6, int var7, long var8, int var10, int var11, int var12, int var13) {
      return var6 == null?true:this.method3634(var1, var10, var11, var12 - var10 + 1, var13 - var11 + 1, var2, var3, var4, var6, var7, true, var8, 0);
   }

   @ObfuscatedName("ae")
   public long method3648(int var1, int var2, int var3) {
      Tile var4 = this.tiles[var1][var2][var3];
      return var4 != null && var4.decorativeObject != null?var4.decorativeObject.hash:0L;
   }

   @ObfuscatedName("k")
   public void method3694(int var1, int var2, int var3) {
      Tile var4 = this.tiles[var1][var2][var3];
      if(var4 != null) {
         var4.decorativeObject = null;
         var4.decorativeObjectChanged(-1);
      }
   }

   @ObfuscatedName("bz")
   boolean method3669(int var1, int var2, int var3) {
      int var4 = this.tileCycles[var1][var2][var3];
      if(var4 == -cycle) {
         return false;
      } else if(var4 == cycle) {
         return true;
      } else {
         int var5 = var2 << 7;
         int var6 = var3 << 7;
         if(this.method3639(var5 + 1, this.tileHeights[var1][var2][var3], var6 + 1) && this.method3639(var5 + 128 - 1, this.tileHeights[var1][var2 + 1][var3], var6 + 1) && this.method3639(var5 + 128 - 1, this.tileHeights[var1][var2 + 1][var3 + 1], var6 + 128 - 1) && this.method3639(var5 + 1, this.tileHeights[var1][var2][var3 + 1], var6 + 128 - 1)) {
            this.tileCycles[var1][var2][var3] = cycle;
            return true;
         } else {
            this.tileCycles[var1][var2][var3] = -cycle;
            return false;
         }
      }
   }

   @ObfuscatedName("bg")
   boolean method3639(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < field1836; ++var4) {
         Occluder var5 = field1837[var4];
         int var6;
         int var7;
         int var8;
         int var9;
         int var10;
         if(var5.testDirection == 1) {
            var6 = var5.minX - var1;
            if(var6 > 0) {
               var7 = (var6 * var5.minNormalX >> 8) + var5.minZ;
               var8 = (var6 * var5.maxNormalX >> 8) + var5.maxZ;
               var9 = (var6 * var5.minNormalY >> 8) + var5.minY;
               var10 = (var6 * var5.maxNormalY >> 8) + var5.maxY;
               if(var3 >= var7 && var3 <= var8 && var2 >= var9 && var2 <= var10) {
                  return true;
               }
            }
         } else if(var5.testDirection == 2) {
            var6 = var1 - var5.minX;
            if(var6 > 0) {
               var7 = (var6 * var5.minNormalX >> 8) + var5.minZ;
               var8 = (var6 * var5.maxNormalX >> 8) + var5.maxZ;
               var9 = (var6 * var5.minNormalY >> 8) + var5.minY;
               var10 = (var6 * var5.maxNormalY >> 8) + var5.maxY;
               if(var3 >= var7 && var3 <= var8 && var2 >= var9 && var2 <= var10) {
                  return true;
               }
            }
         } else if(var5.testDirection == 3) {
            var6 = var5.minZ - var3;
            if(var6 > 0) {
               var7 = (var6 * var5.field1896 >> 8) + var5.minX;
               var8 = (var6 * var5.field1894 >> 8) + var5.maxX;
               var9 = (var6 * var5.minNormalY >> 8) + var5.minY;
               var10 = (var6 * var5.maxNormalY >> 8) + var5.maxY;
               if(var1 >= var7 && var1 <= var8 && var2 >= var9 && var2 <= var10) {
                  return true;
               }
            }
         } else if(var5.testDirection == 4) {
            var6 = var3 - var5.minZ;
            if(var6 > 0) {
               var7 = (var6 * var5.field1896 >> 8) + var5.minX;
               var8 = (var6 * var5.field1894 >> 8) + var5.maxX;
               var9 = (var6 * var5.minNormalY >> 8) + var5.minY;
               var10 = (var6 * var5.maxNormalY >> 8) + var5.maxY;
               if(var1 >= var7 && var1 <= var8 && var2 >= var9 && var2 <= var10) {
                  return true;
               }
            }
         } else if(var5.testDirection == 5) {
            var6 = var2 - var5.minY;
            if(var6 > 0) {
               var7 = (var6 * var5.field1896 >> 8) + var5.minX;
               var8 = (var6 * var5.field1894 >> 8) + var5.maxX;
               var9 = (var6 * var5.minNormalX >> 8) + var5.minZ;
               var10 = (var6 * var5.maxNormalX >> 8) + var5.maxZ;
               if(var1 >= var7 && var1 <= var8 && var3 >= var9 && var3 <= var10) {
                  return true;
               }
            }
         }
      }

      return false;
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "(IIIILem;Lem;IIJI)V"
   )
   public void method3629(int var1, int var2, int var3, int var4, Entity var5, Entity var6, int var7, int var8, long var9, int var11) {
      this.copy$addBoundary(var1, var2, var3, var4, var5, var6, var7, var8, var9, var11);
      RSTile var12 = this.getTiles()[var1][var2][var3];
      if(var12 != null) {
         RSWallObject var13 = (RSWallObject)var12.getWallObject();
         if(var13 != null) {
            var13.setPlane(var1);
         }
      }

   }

   @ObfuscatedName("bd")
   void method3654() {
      int var1 = levelOccluderCount[Scene_plane];
      Occluder[] var2 = levelOccluders[Scene_plane];
      field1836 = 0;

      for(int var3 = 0; var3 < var1; ++var3) {
         Occluder var4 = var2[var3];
         int var5;
         int var6;
         int var7;
         int var9;
         boolean var13;
         if(var4.type == 1) {
            var5 = var4.minTileX - screenCenterX + 90;
            if(var5 >= 0 && var5 <= 50) {
               var6 = var4.minTileZ - screenCenterZ + 90;
               if(var6 < 0) {
                  var6 = 0;
               }

               var7 = var4.maxTileZ - screenCenterZ + 90;
               if(var7 > 50) {
                  var7 = 50;
               }

               var13 = false;

               while(var6 <= var7) {
                  if(renderArea[var5][var6++]) {
                     var13 = true;
                     break;
                  }
               }

               if(var13) {
                  var9 = cameraX2 - var4.minX;
                  if(var9 > 32) {
                     var4.testDirection = 1;
                  } else {
                     if(var9 >= -32) {
                        continue;
                     }

                     var4.testDirection = 2;
                     var9 = -var9;
                  }

                  var4.minNormalX = (var4.minZ - cameraZ2 << 8) / var9;
                  var4.maxNormalX = (var4.maxZ - cameraZ2 << 8) / var9;
                  var4.minNormalY = (var4.minY - cameraY2 << 8) / var9;
                  var4.maxNormalY = (var4.maxY - cameraY2 << 8) / var9;
                  field1837[field1836++] = var4;
               }
            }
         } else if(var4.type == 2) {
            var5 = var4.minTileZ - screenCenterZ + 90;
            if(var5 >= 0 && var5 <= 50) {
               var6 = var4.minTileX - screenCenterX + 90;
               if(var6 < 0) {
                  var6 = 0;
               }

               var7 = var4.maxTIleX - screenCenterX + 90;
               if(var7 > 50) {
                  var7 = 50;
               }

               var13 = false;

               while(var6 <= var7) {
                  if(renderArea[var6++][var5]) {
                     var13 = true;
                     break;
                  }
               }

               if(var13) {
                  var9 = cameraZ2 - var4.minZ;
                  if(var9 > 32) {
                     var4.testDirection = 3;
                  } else {
                     if(var9 >= -32) {
                        continue;
                     }

                     var4.testDirection = 4;
                     var9 = -var9;
                  }

                  var4.field1896 = (var4.minX - cameraX2 << 8) / var9;
                  var4.field1894 = (var4.maxX - cameraX2 << 8) / var9;
                  var4.minNormalY = (var4.minY - cameraY2 << 8) / var9;
                  var4.maxNormalY = (var4.maxY - cameraY2 << 8) / var9;
                  field1837[field1836++] = var4;
               }
            }
         } else if(var4.type == 4) {
            var5 = var4.minY - cameraY2;
            if(var5 > 128) {
               var6 = var4.minTileZ - screenCenterZ + 90;
               if(var6 < 0) {
                  var6 = 0;
               }

               var7 = var4.maxTileZ - screenCenterZ + 90;
               if(var7 > 50) {
                  var7 = 50;
               }

               if(var6 <= var7) {
                  int var8 = var4.minTileX - screenCenterX + 90;
                  if(var8 < 0) {
                     var8 = 0;
                  }

                  var9 = var4.maxTIleX - screenCenterX + 90;
                  if(var9 > 50) {
                     var9 = 50;
                  }

                  boolean var10 = false;

                  label144:
                  for(int var11 = var8; var11 <= var9; ++var11) {
                     for(int var12 = var6; var12 <= var7; ++var12) {
                        if(renderArea[var11][var12]) {
                           var10 = true;
                           break label144;
                        }
                     }
                  }

                  if(var10) {
                     var4.testDirection = 5;
                     var4.field1896 = (var4.minX - cameraX2 << 8) / var5;
                     var4.field1894 = (var4.maxX - cameraX2 << 8) / var5;
                     var4.minNormalX = (var4.minZ - cameraZ2 << 8) / var5;
                     var4.maxNormalX = (var4.maxZ - cameraZ2 << 8) / var5;
                     field1837[field1836++] = var4;
                  }
               }
            }
         }
      }

   }

   @ObfuscatedName("au")
   public long method3713(int var1, int var2, int var3) {
      Tile var4 = this.tiles[var1][var2][var3];
      return var4 != null && var4.groundObject != null?var4.groundObject.hash:0L;
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(IIIILem;JLem;Lem;)V"
   )
   public void method3628(int var1, int var2, int var3, int var4, Entity var5, long var6, Entity var8, Entity var9) {
      this.copy$addItemPile(var1, var2, var3, var4, var5, var6, var8, var9);
      RSTile var10 = this.getTiles()[var1][var2][var3];
      if(var10 != null) {
         RSItemLayer var11 = (RSItemLayer)var10.getItemLayer();
         if(var11 != null) {
            var11.setPlane(var1);
         }
      }

   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "(IIIILem;JI)V"
   )
   public void method3627(int var1, int var2, int var3, int var4, Entity var5, long var6, int var8) {
      this.copy$groundObjectSpawned(var1, var2, var3, var4, var5, var6, var8);
      RSTile var9 = this.getTiles()[var1][var2][var3];
      if(var9 != null) {
         RSGroundObject var10 = (RSGroundObject)var9.getGroundObject();
         if(var10 != null) {
            var10.setPlane(var1);
         }
      }

   }

   @ObfuscatedName("b")
   @ObfuscatedSignature(
      signature = "(IIIILem;Lem;IIIIJI)V"
   )
   public void method3630(int var1, int var2, int var3, int var4, Entity var5, Entity var6, int var7, int var8, int var9, int var10, long var11, int var13) {
      this.copy$addBoundaryDecoration(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var13);
      RSTile var14 = this.getTiles()[var1][var2][var3];
      if(var14 != null) {
         RSDecorativeObject var15 = (RSDecorativeObject)var14.getDecorativeObject();
         if(var15 != null) {
            var15.setPlane(var1);
         }
      }

   }

   @ObfuscatedName("aj")
   public int method3651(int var1, int var2, int var3, long var4) {
      Tile var6 = this.tiles[var1][var2][var3];
      if(var6 == null) {
         return -1;
      } else if(var6.wallObject != null && var6.wallObject.hash == var4) {
         return var6.wallObject.config & 255;
      } else if(var6.decorativeObject != null && var6.decorativeObject.hash == var4) {
         return var6.decorativeObject.renderInfoBitPacked & 255;
      } else if(var6.groundObject != null && var6.groundObject.hash == var4) {
         return var6.groundObject.renderInfoBitPacked & 255;
      } else {
         for(int var7 = 0; var7 < var6.entityCount; ++var7) {
            if(var6.objects[var7].hash == var4) {
               return var6.objects[var7].flags & 255;
            }
         }

         return -1;
      }
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      signature = "(III)Ler;"
   )
   public GameObject method3645(int var1, int var2, int var3) {
      Tile var4 = this.tiles[var1][var2][var3];
      if(var4 == null) {
         return null;
      } else {
         for(int var5 = 0; var5 < var4.entityCount; ++var5) {
            GameObject var6 = var4.objects[var5];
            if(ChatHistory.method6262(var6.hash) && var2 == var6.relativeX && var3 == var6.relativeY) {
               return var6;
            }
         }

         return null;
      }
   }

   @ObfuscatedName("o")
   @ObfuscatedSignature(
      signature = "(Ler;)V"
   )
   void method3655(GameObject var1) {
      for(int var2 = var1.relativeX; var2 <= var1.offsetX; ++var2) {
         for(int var3 = var1.relativeY; var3 <= var1.offsetY; ++var3) {
            Tile var4 = this.tiles[var1.plane][var2][var3];
            if(var4 != null) {
               int var5;
               for(var5 = 0; var5 < var4.entityCount; ++var5) {
                  if(var4.objects[var5] == var1) {
                     --var4.entityCount;

                     for(int var6 = var5; var6 < var4.entityCount; ++var6) {
                        var4.objects[var6] = var4.objects[var6 + 1];
                        var4.gameObjectsChanged(var6);
                        var4.entityFlags[var6] = var4.entityFlags[var6 + 1];
                     }

                     var4.objects[var4.entityCount] = null;
                     var4.gameObjectsChanged(var4.entityCount);
                     break;
                  }
               }

               var4.flags = 0;

               for(var5 = 0; var5 < var4.entityCount; ++var5) {
                  var4.flags |= var4.entityFlags[var5];
               }
            }
         }
      }

   }

   @ObfuscatedName("bp")
   boolean method3660(int var1, int var2, int var3, int var4) {
      if(!this.method3669(var1, var2, var3)) {
         return false;
      } else {
         int var5 = var2 << 7;
         int var6 = var3 << 7;
         return this.method3639(var5 + 1, this.tileHeights[var1][var2][var3] - var4, var6 + 1) && this.method3639(var5 + 128 - 1, this.tileHeights[var1][var2 + 1][var3] - var4, var6 + 1) && this.method3639(var5 + 128 - 1, this.tileHeights[var1][var2 + 1][var3 + 1] - var4, var6 + 128 - 1) && this.method3639(var5 + 1, this.tileHeights[var1][var2][var3 + 1] - var4, var6 + 128 - 1);
      }
   }

   @ObfuscatedName("a")
   public void method3622() {
      int var1;
      int var2;
      for(var1 = 0; var1 < this.maxY; ++var1) {
         for(var2 = 0; var2 < this.maxX; ++var2) {
            for(int var3 = 0; var3 < this.maxZ; ++var3) {
               this.tiles[var1][var2][var3] = null;
            }
         }
      }

      for(var1 = 0; var1 < MAX_OCCLUDER_LEVELS; ++var1) {
         for(var2 = 0; var2 < levelOccluderCount[var1]; ++var2) {
            levelOccluders[var1][var2] = null;
         }

         levelOccluderCount[var1] = 0;
      }

      for(var1 = 0; var1 < this.entityCount; ++var1) {
         this.objects[var1] = null;
      }

      this.entityCount = 0;

      for(var1 = 0; var1 < entityBuffer.length; ++var1) {
         entityBuffer[var1] = null;
      }

   }

   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      signature = "(Ldk;IIIII)V"
   )
   void method3753(ModelData var1, int var2, int var3, int var4, int var5, int var6) {
      boolean var7 = true;
      int var8 = var3;
      int var9 = var3 + var5;
      int var10 = var4 - 1;
      int var11 = var4 + var6;

      for(int var12 = var2; var12 <= var2 + 1; ++var12) {
         if(var12 != this.maxY) {
            for(int var13 = var8; var13 <= var9; ++var13) {
               if(var13 >= 0 && var13 < this.maxX) {
                  for(int var14 = var10; var14 <= var11; ++var14) {
                     if(var14 >= 0 && var14 < this.maxZ && (!var7 || var13 >= var9 || var14 >= var11 || var14 < var4 && var3 != var13)) {
                        Tile var15 = this.tiles[var12][var13][var14];
                        if(var15 != null) {
                           int var16 = (this.tileHeights[var12][var13 + 1][var14] + this.tileHeights[var12][var13 + 1][var14 + 1] + this.tileHeights[var12][var13][var14] + this.tileHeights[var12][var13][var14 + 1]) / 4 - (this.tileHeights[var2][var3 + 1][var4] + this.tileHeights[var2][var3][var4] + this.tileHeights[var2][var3 + 1][var4 + 1] + this.tileHeights[var2][var3][var4 + 1]) / 4;
                           WallObject var17 = var15.wallObject;
                           if(var17 != null) {
                              ModelData var18;
                              if(var17.entity1 instanceof ModelData) {
                                 var18 = (ModelData)var17.entity1;
                                 ModelData.method2788(var1, var18, (1 - var5) * 64 + (var13 - var3) * 128, var16, (var14 - var4) * 128 + (1 - var6) * 64, var7);
                              }

                              if(var17.entity2 instanceof ModelData) {
                                 var18 = (ModelData)var17.entity2;
                                 ModelData.method2788(var1, var18, (1 - var5) * 64 + (var13 - var3) * 128, var16, (var14 - var4) * 128 + (1 - var6) * 64, var7);
                              }
                           }

                           for(int var23 = 0; var23 < var15.entityCount; ++var23) {
                              GameObject var19 = var15.objects[var23];
                              if(var19 != null && var19.entity instanceof ModelData) {
                                 ModelData var20 = (ModelData)var19.entity;
                                 int var21 = var19.offsetX - var19.relativeX + 1;
                                 int var22 = var19.offsetY - var19.relativeY + 1;
                                 ModelData.method2788(var1, var20, (var21 - var5) * 64 + (var19.relativeX - var3) * 128, var16, (var19.relativeY - var4) * 128 + (var22 - var6) * 64, var7);
                              }
                           }
                        }
                     }
                  }
               }
            }

            --var8;
            var7 = false;
         }
      }

   }

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      signature = "(IIIIIILem;IJI)Z"
   )
   public boolean method3631(int var1, int var2, int var3, int var4, int var5, int var6, Entity var7, int var8, long var9, int var11) {
      if(var7 == null) {
         return true;
      } else {
         int var12 = var5 * 64 + var2 * 128;
         int var13 = var6 * 64 + var3 * 128;
         return this.method3634(var1, var2, var3, var5, var6, var12, var13, var4, var7, var8, false, var9, var11);
      }
   }

   @ObfuscatedName("av")
   public long method3649(int var1, int var2, int var3) {
      Tile var4 = this.tiles[var1][var2][var3];
      if(var4 == null) {
         return 0L;
      } else {
         for(int var5 = 0; var5 < var4.entityCount; ++var5) {
            GameObject var6 = var4.objects[var5];
            if(ChatHistory.method6262(var6.hash) && var2 == var6.relativeX && var3 == var6.relativeY) {
               return var6.hash;
            }
         }

         return 0L;
      }
   }

   @ObfuscatedName("c")
   public void method3794(int var1, int var2, int var3) {
      Tile var4 = this.tiles[var1][var2][var3];
      if(var4 != null) {
         var4.groundObject = null;
         var4.groundObjectChanged(-1);
      }
   }

   @ObfuscatedName("t")
   @ObfuscatedSignature(
      signature = "(IIIIIIIILem;IZJI)Z"
   )
   boolean method3634(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, Entity var9, int var10, boolean var11, long var12, int var14) {
      boolean var15 = shouldDraw(var9, false);
      if(!var15) {
         int var16 = var6 >> 7;
         int var17 = var7 >> 7;
         ItemContainer.clientInstance.getOccupiedTilesTick()[var16][var17] = -1;
      }

      return var15 && this.copy$addEntityMarker(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var14);
   }

   @ObfuscatedName("ah")
   @ObfuscatedSignature(
      signature = "(III)Lef;"
   )
   public DecorativeObject method3789(int var1, int var2, int var3) {
      Tile var4 = this.tiles[var1][var2][var3];
      return var4 == null?null:var4.decorativeObject;
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      signature = "(III)Ldw;"
   )
   public GroundObject method3646(int var1, int var2, int var3) {
      Tile var4 = this.tiles[var1][var2][var3];
      return var4 != null && var4.groundObject != null?var4.groundObject:null;
   }

   @ObfuscatedSignature(
      signature = "(IIIILem;JLem;Lem;)V"
   )
   public void copy$addItemPile(int var1, int var2, int var3, int var4, Entity var5, long var6, Entity var8, Entity var9) {
      ItemLayer var10 = new ItemLayer();
      var10.bottom = var5;
      var10.x = var2 * 128 + 64;
      var10.y = var3 * 128 + 64;
      var10.tileHeight = var4;
      var10.hash = var6;
      var10.middle = var8;
      var10.top = var9;
      int var11 = 0;
      Tile var12 = this.tiles[var1][var2][var3];
      if(var12 != null) {
         for(int var13 = 0; var13 < var12.entityCount; ++var13) {
            if((var12.objects[var13].flags & 256) == 256 && var12.objects[var13].entity instanceof Model) {
               Model var14 = (Model)var12.objects[var13].entity;
               var14.method3833();
               if(var14.modelHeight > var11) {
                  var11 = var14.modelHeight;
               }
            }
         }
      }

      var10.height = var11;
      if(this.tiles[var1][var2][var3] == null) {
         this.tiles[var1][var2][var3] = new Tile(var1, var2, var3);
      }

      this.tiles[var1][var2][var3].itemLayer = var10;
      this.tiles[var1][var2][var3].itemLayerChanged(-1);
   }

   @ObfuscatedSignature(
      signature = "(IIIILem;JI)V"
   )
   public void copy$groundObjectSpawned(int var1, int var2, int var3, int var4, Entity var5, long var6, int var8) {
      if(var5 != null) {
         GroundObject var9 = new GroundObject();
         var9.entity = var5;
         var9.x = var2 * 128 + 64;
         var9.y = var3 * 128 + 64;
         var9.floor = var4;
         var9.hash = var6;
         var9.renderInfoBitPacked = var8;
         if(this.tiles[var1][var2][var3] == null) {
            this.tiles[var1][var2][var3] = new Tile(var1, var2, var3);
         }

         this.tiles[var1][var2][var3].groundObject = var9;
         this.tiles[var1][var2][var3].groundObjectChanged(-1);
      }
   }

   @ObfuscatedSignature(
      signature = "(IIIILem;Lem;IIJI)V"
   )
   public void copy$addBoundary(int var1, int var2, int var3, int var4, Entity var5, Entity var6, int var7, int var8, long var9, int var11) {
      if(var5 != null || var6 != null) {
         WallObject var12 = new WallObject();
         var12.hash = var9;
         var12.config = var11;
         var12.x = var2 * 128 + 64;
         var12.y = var3 * 128 + 64;
         var12.floor = var4;
         var12.entity1 = var5;
         var12.entity2 = var6;
         var12.orientationA = var7;
         var12.orientationB = var8;

         for(int var13 = var1; var13 >= 0; --var13) {
            if(this.tiles[var13][var2][var3] == null) {
               this.tiles[var13][var2][var3] = new Tile(var13, var2, var3);
            }
         }

         this.tiles[var1][var2][var3].wallObject = var12;
         this.tiles[var1][var2][var3].wallObjectChanged(-1);
      }
   }

   @ObfuscatedSignature(
      signature = "(IIIILem;Lem;IIIIJI)V"
   )
   public void copy$addBoundaryDecoration(int var1, int var2, int var3, int var4, Entity var5, Entity var6, int var7, int var8, int var9, int var10, long var11, int var13) {
      if(var5 != null) {
         DecorativeObject var14 = new DecorativeObject();
         var14.hash = var11;
         var14.renderInfoBitPacked = var13;
         var14.x = var2 * 128 + 64;
         var14.y = var3 * 128 + 64;
         var14.floor = var4;
         var14.entity1 = var5;
         var14.entity2 = var6;
         var14.renderFlag = var7;
         var14.rotation = var8;
         var14.offsetX = var9;
         var14.offsetY = var10;

         for(int var15 = var1; var15 >= 0; --var15) {
            if(this.tiles[var15][var2][var3] == null) {
               this.tiles[var15][var2][var3] = new Tile(var15, var2, var3);
            }
         }

         this.tiles[var1][var2][var3].decorativeObject = var14;
         this.tiles[var1][var2][var3].decorativeObjectChanged(-1);
      }
   }

   public RSTile[][][] getTiles() {
      return this.tiles;
   }

   @ObfuscatedSignature(
      signature = "(Ldh;IIIIII)V"
   )
   public void copy$drawTileOverlay(SceneTileModel var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      int var8 = var1.vertexX.length;

      int var9;
      int var10;
      int var11;
      int var12;
      int var13;
      for(var9 = 0; var9 < var8; ++var9) {
         var10 = var1.vertexX[var9] - cameraX2;
         var11 = var1.vertexY[var9] - cameraY2;
         var12 = var1.vertexZ[var9] - cameraZ2;
         var13 = var12 * var4 + var5 * var10 >> 16;
         var12 = var5 * var12 - var10 * var4 >> 16;
         var10 = var13;
         var13 = var3 * var11 - var12 * var2 >> 16;
         var12 = var11 * var2 + var3 * var12 >> 16;
         if(var12 < 50) {
            return;
         }

         if(var1.triangleTextureId != null) {
            SceneTileModel.vertexSceneX[var9] = var10;
            SceneTileModel.vertexSceneY[var9] = var13;
            SceneTileModel.vertexSceneZ[var9] = var12;
         }

         SceneTileModel.tmpScreenX[var9] = var10 * Graphics3D.Rasterizer3D_zoom / var12 + Graphics3D.centerX;
         SceneTileModel.tmpScreenY[var9] = var13 * Graphics3D.Rasterizer3D_zoom / var12 + Graphics3D.centerY;
      }

      Graphics3D.rasterAlpha = 0;
      var8 = var1.field1585.length;

      for(var9 = 0; var9 < var8; ++var9) {
         var10 = var1.field1585[var9];
         var11 = var1.field1594[var9];
         var12 = var1.field1579[var9];
         var13 = SceneTileModel.tmpScreenX[var10];
         int var14 = SceneTileModel.tmpScreenX[var11];
         int var15 = SceneTileModel.tmpScreenX[var12];
         int var16 = SceneTileModel.tmpScreenY[var10];
         int var17 = SceneTileModel.tmpScreenY[var11];
         int var18 = SceneTileModel.tmpScreenY[var12];
         if((var13 - var14) * (var18 - var17) - (var16 - var17) * (var15 - var14) > 0) {
            Graphics3D.rasterClipEnable = false;
            if(var13 < 0 || var14 < 0 || var15 < 0 || var13 > Graphics3D.rasterClipX || var14 > Graphics3D.rasterClipX || var15 > Graphics3D.rasterClipX) {
               Graphics3D.rasterClipEnable = true;
            }

            if(checkClick && method3667(mouseX2, mouseY2, var16, var17, var18, var13, var14, var15)) {
               selectedRegionTileX = var6;
               selectedRegionTileY = var7;
            }

            if(var1.triangleTextureId != null && var1.triangleTextureId[var9] != -1) {
               if(!regionLowMemory) {
                  if(var1.flatShade) {
                     Graphics3D.method2102(var16, var17, var18, var13, var14, var15, var1.triangleColorA[var9], var1.triangleColorB[var9], var1.triangleColorC[var9], SceneTileModel.vertexSceneX[0], SceneTileModel.vertexSceneX[1], SceneTileModel.vertexSceneX[3], SceneTileModel.vertexSceneY[0], SceneTileModel.vertexSceneY[1], SceneTileModel.vertexSceneY[3], SceneTileModel.vertexSceneZ[0], SceneTileModel.vertexSceneZ[1], SceneTileModel.vertexSceneZ[3], var1.triangleTextureId[var9]);
                  } else {
                     Graphics3D.method2102(var16, var17, var18, var13, var14, var15, var1.triangleColorA[var9], var1.triangleColorB[var9], var1.triangleColorC[var9], SceneTileModel.vertexSceneX[var10], SceneTileModel.vertexSceneX[var11], SceneTileModel.vertexSceneX[var12], SceneTileModel.vertexSceneY[var10], SceneTileModel.vertexSceneY[var11], SceneTileModel.vertexSceneY[var12], SceneTileModel.vertexSceneZ[var10], SceneTileModel.vertexSceneZ[var11], SceneTileModel.vertexSceneZ[var12], var1.triangleTextureId[var9]);
                  }
               } else {
                  int var19 = Graphics3D.textureLoader.vmethod1151(var1.triangleTextureId[var9]);
                  Graphics3D.method2159(var16, var17, var18, var13, var14, var15, method3798(var19, var1.triangleColorA[var9]), method3798(var19, var1.triangleColorB[var9]), method3798(var19, var1.triangleColorC[var9]));
               }
            } else if(var1.triangleColorA[var9] != 12345678) {
               Graphics3D.method2159(var16, var17, var18, var13, var14, var15, var1.triangleColorA[var9], var1.triangleColorB[var9], var1.triangleColorC[var9]);
            }
         }
      }

   }

   @ObfuscatedSignature(
      signature = "(Leb;IIIIIII)V"
   )
   public void copy$drawTileUnderlay(SceneTilePaint var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      int var9;
      int var10 = var9 = (var7 << 7) - cameraX2;
      int var11;
      int var12 = var11 = (var8 << 7) - cameraZ2;
      int var13;
      int var14 = var13 = var10 + 128;
      int var15;
      int var16 = var15 = var12 + 128;
      int var17 = this.tileHeights[var2][var7][var8] - cameraY2;
      int var18 = this.tileHeights[var2][var7 + 1][var8] - cameraY2;
      int var19 = this.tileHeights[var2][var7 + 1][var8 + 1] - cameraY2;
      int var20 = this.tileHeights[var2][var7][var8 + 1] - cameraY2;
      int var21 = var10 * var6 + var5 * var12 >> 16;
      var12 = var12 * var6 - var5 * var10 >> 16;
      var10 = var21;
      var21 = var17 * var4 - var3 * var12 >> 16;
      var12 = var12 * var4 + var3 * var17 >> 16;
      var17 = var21;
      if(var12 >= 50) {
         var21 = var14 * var6 + var5 * var11 >> 16;
         var11 = var11 * var6 - var5 * var14 >> 16;
         var14 = var21;
         var21 = var18 * var4 - var3 * var11 >> 16;
         var11 = var11 * var4 + var3 * var18 >> 16;
         var18 = var21;
         if(var11 >= 50) {
            var21 = var13 * var6 + var5 * var16 >> 16;
            var16 = var16 * var6 - var5 * var13 >> 16;
            var13 = var21;
            var21 = var19 * var4 - var3 * var16 >> 16;
            var16 = var16 * var4 + var3 * var19 >> 16;
            var19 = var21;
            if(var16 >= 50) {
               var21 = var9 * var6 + var5 * var15 >> 16;
               var15 = var15 * var6 - var5 * var9 >> 16;
               var9 = var21;
               var21 = var20 * var4 - var3 * var15 >> 16;
               var15 = var15 * var4 + var3 * var20 >> 16;
               if(var15 >= 50) {
                  int var22 = var10 * Graphics3D.Rasterizer3D_zoom / var12 + Graphics3D.centerX;
                  int var23 = var17 * Graphics3D.Rasterizer3D_zoom / var12 + Graphics3D.centerY;
                  int var24 = var14 * Graphics3D.Rasterizer3D_zoom / var11 + Graphics3D.centerX;
                  int var25 = var18 * Graphics3D.Rasterizer3D_zoom / var11 + Graphics3D.centerY;
                  int var26 = var13 * Graphics3D.Rasterizer3D_zoom / var16 + Graphics3D.centerX;
                  int var27 = var19 * Graphics3D.Rasterizer3D_zoom / var16 + Graphics3D.centerY;
                  int var28 = var9 * Graphics3D.Rasterizer3D_zoom / var15 + Graphics3D.centerX;
                  int var29 = var21 * Graphics3D.Rasterizer3D_zoom / var15 + Graphics3D.centerY;
                  Graphics3D.rasterAlpha = 0;
                  int var30;
                  if((var26 - var28) * (var25 - var29) - (var27 - var29) * (var24 - var28) > 0) {
                     Graphics3D.rasterClipEnable = false;
                     if(var26 < 0 || var28 < 0 || var24 < 0 || var26 > Graphics3D.rasterClipX || var28 > Graphics3D.rasterClipX || var24 > Graphics3D.rasterClipX) {
                        Graphics3D.rasterClipEnable = true;
                     }

                     if(checkClick && method3667(mouseX2, mouseY2, var27, var29, var25, var26, var28, var24)) {
                        selectedRegionTileX = var7;
                        selectedRegionTileY = var8;
                     }

                     if(var1.texture == -1) {
                        if(var1.neColor != 12345678) {
                           Graphics3D.method2159(var27, var29, var25, var26, var28, var24, var1.neColor, var1.nwColor, var1.seColor);
                        }
                     } else if(!regionLowMemory) {
                        if(var1.flatShade) {
                           Graphics3D.method2102(var27, var29, var25, var26, var28, var24, var1.neColor, var1.nwColor, var1.seColor, var10, var14, var9, var17, var18, var21, var12, var11, var15, var1.texture);
                        } else {
                           Graphics3D.method2102(var27, var29, var25, var26, var28, var24, var1.neColor, var1.nwColor, var1.seColor, var13, var9, var14, var19, var21, var18, var16, var15, var11, var1.texture);
                        }
                     } else {
                        var30 = Graphics3D.textureLoader.vmethod1151(var1.texture);
                        Graphics3D.method2159(var27, var29, var25, var26, var28, var24, method3798(var30, var1.neColor), method3798(var30, var1.nwColor), method3798(var30, var1.seColor));
                     }
                  }

                  if((var22 - var24) * (var29 - var25) - (var23 - var25) * (var28 - var24) > 0) {
                     Graphics3D.rasterClipEnable = false;
                     if(var22 < 0 || var24 < 0 || var28 < 0 || var22 > Graphics3D.rasterClipX || var24 > Graphics3D.rasterClipX || var28 > Graphics3D.rasterClipX) {
                        Graphics3D.rasterClipEnable = true;
                     }

                     if(checkClick && method3667(mouseX2, mouseY2, var23, var25, var29, var22, var24, var28)) {
                        selectedRegionTileX = var7;
                        selectedRegionTileY = var8;
                     }

                     if(var1.texture == -1) {
                        if(var1.swColor != 12345678) {
                           Graphics3D.method2159(var23, var25, var29, var22, var24, var28, var1.swColor, var1.seColor, var1.nwColor);
                        }
                     } else if(!regionLowMemory) {
                        Graphics3D.method2102(var23, var25, var29, var22, var24, var28, var1.swColor, var1.seColor, var1.nwColor, var10, var14, var9, var17, var18, var21, var12, var11, var15, var1.texture);
                     } else {
                        var30 = Graphics3D.textureLoader.vmethod1151(var1.texture);
                        Graphics3D.method2159(var23, var25, var29, var22, var24, var28, method3798(var30, var1.swColor), method3798(var30, var1.seColor), method3798(var30, var1.nwColor));
                     }
                  }

               }
            }
         }
      }
   }

   @ObfuscatedSignature(
      signature = "(IIIIIIIILem;IZJI)Z"
   )
   public boolean copy$addEntityMarker(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, Entity var9, int var10, boolean var11, long var12, int var14) {
      int var16;
      for(int var15 = var2; var15 < var2 + var4; ++var15) {
         for(var16 = var3; var16 < var3 + var5; ++var16) {
            if(var15 < 0 || var16 < 0 || var15 >= this.maxX || var16 >= this.maxZ) {
               return false;
            }

            Tile var17 = this.tiles[var1][var15][var16];
            if(var17 != null && var17.entityCount >= 5) {
               return false;
            }
         }
      }

      GameObject var21 = new GameObject();
      var21.hash = var12;
      var21.flags = var14;
      var21.plane = var1;
      var21.x = var6;
      var21.y = var7;
      var21.height = var8;
      var21.entity = var9;
      var21.orientation = var10;
      var21.relativeX = var2;
      var21.relativeY = var3;
      var21.offsetX = var2 + var4 - 1;
      var21.offsetY = var3 + var5 - 1;

      for(var16 = var2; var16 < var2 + var4; ++var16) {
         for(int var22 = var3; var22 < var3 + var5; ++var22) {
            int var18 = 0;
            if(var16 > var2) {
               ++var18;
            }

            if(var16 < var2 + var4 - 1) {
               var18 += 4;
            }

            if(var22 > var3) {
               var18 += 8;
            }

            if(var22 < var3 + var5 - 1) {
               var18 += 2;
            }

            for(int var19 = var1; var19 >= 0; --var19) {
               if(this.tiles[var19][var16][var22] == null) {
                  this.tiles[var19][var16][var22] = new Tile(var19, var16, var22);
               }
            }

            Tile var23 = this.tiles[var1][var16][var22];
            var23.objects[var23.entityCount] = var21;
            var23.gameObjectsChanged(var23.entityCount);
            var23.entityFlags[var23.entityCount] = var18;
            var23.flags |= var18;
            ++var23.entityCount;
         }
      }

      if(var11) {
         this.objects[this.entityCount++] = var21;
      }

      return true;
   }

   public int[][][] getTileHeights() {
      return this.tileHeights;
   }

   public int getMaxX() {
      return this.maxX;
   }

   public int getMaxY() {
      return this.maxY;
   }

   public int getMaxZ() {
      return this.maxZ;
   }

   public int getMinLevel() {
      return this.minLevel;
   }

   public void updateOccluders() {
      this.method3654();
   }

   public void draw(net.runelite.api.Tile var1, boolean var2) {
      this.method3641((Tile)var1, var2);
   }

   private void rl$$init() {
   }

   private void rl$$init1() {
   }

   public int getDrawDistance() {
      return rl$drawDistance;
   }

   public void setDrawDistance(int var1) {
      rl$drawDistance = var1;
   }

   @Override
   public byte[][][] getUnderlayIds() {
      return rl$underlayIds;
   }

   @Override
   public void setUnderlayIds(byte[][][] underlayIds) {
      rl$underlayIds = underlayIds;
   }

   @Override
   public byte[][][] getOverlayIds() {
      return rl$overlayIds;
   }

   @Override
   public void setOverlayIds(byte[][][] overlayIds) {
      rl$overlayIds = overlayIds;
   }

   public RSGameObject[] getObjects() {
      return this.objects;
   }

   public void drawTile(int[] var1, int var2, int var3, int var4, int var5, int var6) {
      this.method3737(var1, var2, var3, var4, var5, var6);
   }

   @ObfuscatedName("bv")
   boolean method3724(int var1, int var2, int var3, int var4, int var5, int var6) {
      int var7;
      int var8;
      if(var3 == var2 && var5 == var4) {
         if(!this.method3669(var1, var2, var4)) {
            return false;
         } else {
            var7 = var2 << 7;
            var8 = var4 << 7;
            return this.method3639(var7 + 1, this.tileHeights[var1][var2][var4] - var6, var8 + 1) && this.method3639(var7 + 128 - 1, this.tileHeights[var1][var2 + 1][var4] - var6, var8 + 1) && this.method3639(var7 + 128 - 1, this.tileHeights[var1][var2 + 1][var4 + 1] - var6, var8 + 128 - 1) && this.method3639(var7 + 1, this.tileHeights[var1][var2][var4 + 1] - var6, var8 + 128 - 1);
         }
      } else {
         for(var7 = var2; var7 <= var3; ++var7) {
            for(var8 = var4; var8 <= var5; ++var8) {
               if(this.tileCycles[var1][var7][var8] == -cycle) {
                  return false;
               }
            }
         }

         var7 = (var2 << 7) + 1;
         var8 = (var4 << 7) + 2;
         int var9 = this.tileHeights[var1][var2][var4] - var6;
         if(!this.method3639(var7, var9, var8)) {
            return false;
         } else {
            int var10 = (var3 << 7) - 1;
            if(!this.method3639(var10, var9, var8)) {
               return false;
            } else {
               int var11 = (var5 << 7) - 1;
               if(!this.method3639(var7, var9, var11)) {
                  return false;
               } else if(!this.method3639(var10, var9, var11)) {
                  return false;
               } else {
                  return true;
               }
            }
         }
      }
   }

   @ObfuscatedName("at")
   public long method3720(int var1, int var2, int var3) {
      Tile var4 = this.tiles[var1][var2][var3];
      return var4 != null && var4.wallObject != null?var4.wallObject.hash:0L;
   }

   @ObfuscatedName("y")
   public void method3638(int var1, int var2, int var3) {
      Tile var4 = this.tiles[var1][var2][var3];
      if(var4 != null) {
         var4.wallObject = null;
         var4.wallObjectChanged(-1);
      }
   }

   @ObfuscatedName("am")
   @ObfuscatedSignature(
      signature = "(Leb;IIIIIII)V"
   )
   void method3712(SceneTilePaint var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      if(!ItemContainer.clientInstance.isGpu()) {
         try {
            this.copy$drawTileUnderlay(var1, var2, var3, var4, var5, var6, var7, var8);
         } catch (Exception var41) {
            ItemContainer.clientInstance.getLogger().warn("error during tile underlay rendering", var41);
         }

      } else {
         DrawCallbacks var9 = ItemContainer.clientInstance.getDrawCallbacks();
         if(var9 != null) {
            try {
               int[][][] var10 = this.getTileHeights();
               int var11 = ItemContainer.clientInstance.getCameraX2();
               int var12 = ItemContainer.clientInstance.getCameraY2();
               int var13 = ItemContainer.clientInstance.getCameraZ2();
               int var14 = ItemContainer.clientInstance.get3dZoom();
               int var15 = ItemContainer.clientInstance.getCenterX();
               int var16 = ItemContainer.clientInstance.getCenterY();
               int var17 = ItemContainer.clientInstance.getMouseX2();
               int var18 = ItemContainer.clientInstance.getMouseY2();
               boolean var19 = ItemContainer.clientInstance.isCheckClick();
               int var20;
               int var21 = var20 = (var7 << 7) - var11;
               int var22;
               int var23 = var22 = (var8 << 7) - var13;
               int var24;
               int var25 = var24 = var21 + 128;
               int var26;
               int var27 = var26 = var23 + 128;
               int var28 = var10[var2][var7][var8] - var12;
               int var29 = var10[var2][var7 + 1][var8] - var12;
               int var30 = var10[var2][var7 + 1][var8 + 1] - var12;
               int var31 = var10[var2][var7][var8 + 1] - var12;
               int var32 = var21 * var6 + var5 * var23 >> 16;
               var23 = var23 * var6 - var5 * var21 >> 16;
               var21 = var32;
               var32 = var28 * var4 - var3 * var23 >> 16;
               var23 = var23 * var4 + var3 * var28 >> 16;
               var28 = var32;
               if(var23 >= 50) {
                  var32 = var25 * var6 + var5 * var22 >> 16;
                  var22 = var22 * var6 - var5 * var25 >> 16;
                  var25 = var32;
                  var32 = var29 * var4 - var3 * var22 >> 16;
                  var22 = var22 * var4 + var3 * var29 >> 16;
                  var29 = var32;
                  if(var22 >= 50) {
                     var32 = var24 * var6 + var5 * var27 >> 16;
                     var27 = var27 * var6 - var5 * var24 >> 16;
                     var24 = var32;
                     var32 = var30 * var4 - var3 * var27 >> 16;
                     var27 = var27 * var4 + var3 * var30 >> 16;
                     var30 = var32;
                     if(var27 >= 50) {
                        var32 = var20 * var6 + var5 * var26 >> 16;
                        var26 = var26 * var6 - var5 * var20 >> 16;
                        var20 = var32;
                        var32 = var31 * var4 - var3 * var26 >> 16;
                        var26 = var26 * var4 + var3 * var31 >> 16;
                        if(var26 >= 50) {
                           int var33 = var21 * var14 / var23 + var15;
                           int var34 = var28 * var14 / var23 + var16;
                           int var35 = var25 * var14 / var22 + var15;
                           int var36 = var29 * var14 / var22 + var16;
                           int var37 = var24 * var14 / var27 + var15;
                           int var38 = var30 * var14 / var27 + var16;
                           int var39 = var20 * var14 / var26 + var15;
                           int var40 = var32 * var14 / var26 + var16;
                           var9.drawScenePaint(0, var3, var4, var5, var6, -var11, -var12, -var13, var1, var2, var7, var8, var14, var15, var16);
                           if((var37 - var39) * (var36 - var40) - (var38 - var40) * (var35 - var39) > 0 && var19 && ItemContainer.clientInstance.containsBounds(var17, var18, var38, var40, var36, var37, var39, var35)) {
                              setTargetTile(var7, var8);
                           }

                           if((var33 - var35) * (var40 - var36) - (var34 - var36) * (var39 - var35) > 0 && var19 && ItemContainer.clientInstance.containsBounds(var17, var18, var34, var36, var40, var33, var35, var39)) {
                              setTargetTile(var7, var8);
                           }
                        }
                     }
                  }
               }
            } catch (Exception var42) {
               ItemContainer.clientInstance.getLogger().warn("error during underlay rendering", var42);
            }

         }
      }
   }

   @ObfuscatedName("bf")
   @ObfuscatedSignature(
      signature = "(Ldh;IIIIII)V"
   )
   void method3665(SceneTileModel var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      if(!ItemContainer.clientInstance.isGpu()) {
         this.copy$drawTileOverlay(var1, var2, var3, var4, var5, var6, var7);
      } else {
         DrawCallbacks var8 = ItemContainer.clientInstance.getDrawCallbacks();
         if(var8 != null) {
            try {
               int var9 = ItemContainer.clientInstance.getCameraX2();
               int var10 = ItemContainer.clientInstance.getCameraY2();
               int var11 = ItemContainer.clientInstance.getCameraZ2();
               int var12 = ItemContainer.clientInstance.get3dZoom();
               int var13 = ItemContainer.clientInstance.getCenterX();
               int var14 = ItemContainer.clientInstance.getCenterY();
               var8.drawSceneModel(0, var2, var3, var4, var5, -var9, -var10, -var11, var1, ItemContainer.clientInstance.getPlane(), var6, var7, var12, var13, var14);
               boolean var15 = ItemContainer.clientInstance.isCheckClick();
               if(!var15) {
                  return;
               }

               RSSceneTileModel var16 = (RSSceneTileModel)var1;
               int[] var17 = var16.getFaceX();
               int[] var18 = var16.getFaceY();
               int[] var19 = var16.getFaceZ();
               int[] var20 = var16.getVertexX();
               int[] var21 = var16.getVertexY();
               int[] var22 = var16.getVertexZ();
               int var23 = var20.length;
               int var24 = var17.length;
               int var25 = ItemContainer.clientInstance.getMouseX2();
               int var26 = ItemContainer.clientInstance.getMouseY2();

               int var27;
               int var28;
               int var29;
               int var30;
               int var31;
               int var32;
               int var33;
               int var34;
               int var35;
               int var36;
               for(var27 = 0; var27 < var23; ++var27) {
                  var28 = var20[var27] - var9;
                  var29 = var21[var27] - var10;
                  var30 = var22[var27] - var11;
                  var31 = var30 * var4 + var5 * var28 >> 16;
                  var32 = var5 * var30 - var28 * var4 >> 16;
                  var33 = var3 * var29 - var32 * var2 >> 16;
                  var34 = var29 * var2 + var3 * var32 >> 16;
                  if(var34 < 50) {
                     return;
                  }

                  var35 = var31 * var12 / var34 + var13;
                  var36 = var33 * var12 / var34 + var14;
                  tmpX[var27] = var35;
                  tmpY[var27] = var36;
               }

               for(var27 = 0; var27 < var24; ++var27) {
                  var28 = var17[var27];
                  var29 = var18[var27];
                  var30 = var19[var27];
                  var31 = tmpX[var28];
                  var32 = tmpX[var29];
                  var33 = tmpX[var30];
                  var34 = tmpY[var28];
                  var35 = tmpY[var29];
                  var36 = tmpY[var30];
                  if((var31 - var32) * (var36 - var35) - (var34 - var35) * (var33 - var32) > 0 && ItemContainer.clientInstance.containsBounds(var25, var26, var34, var35, var36, var31, var32, var33)) {
                     setTargetTile(var6, var7);
                     break;
                  }
               }
            } catch (Exception var38) {
               ItemContainer.clientInstance.getLogger().warn("error during overlay rendering", var38);
            }

         }
      }
   }

   @ObfuscatedName("as")
   public void method3652(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.maxY; ++var4) {
         for(int var5 = 0; var5 < this.maxX; ++var5) {
            for(int var6 = 0; var6 < this.maxZ; ++var6) {
               Tile var7 = this.tiles[var4][var5][var6];
               if(var7 != null) {
                  WallObject var8 = var7.wallObject;
                  ModelData var10;
                  if(var8 != null && var8.entity1 instanceof ModelData) {
                     ModelData var9 = (ModelData)var8.entity1;
                     this.method3753(var9, var4, var5, var6, 1, 1);
                     if(var8.entity2 instanceof ModelData) {
                        var10 = (ModelData)var8.entity2;
                        this.method3753(var10, var4, var5, var6, 1, 1);
                        ModelData.method2788(var9, var10, 0, 0, 0, false);
                        var8.entity2 = var10.toModel(var10.ambient, var10.contrast, var1, var2, var3);
                     }

                     var8.entity1 = var9.toModel(var9.ambient, var9.contrast, var1, var2, var3);
                  }

                  for(int var12 = 0; var12 < var7.entityCount; ++var12) {
                     GameObject var14 = var7.objects[var12];
                     if(var14 != null && var14.entity instanceof ModelData) {
                        ModelData var11 = (ModelData)var14.entity;
                        this.method3753(var11, var4, var5, var6, var14.offsetX - var14.relativeX + 1, var14.offsetY - var14.relativeY + 1);
                        var14.entity = var11.toModel(var11.ambient, var11.contrast, var1, var2, var3);
                     }
                  }

                  GroundObject var13 = var7.groundObject;
                  if(var13 != null && var13.entity instanceof ModelData) {
                     var10 = (ModelData)var13.entity;
                     this.method3653(var10, var4, var5, var6);
                     var13.entity = var10.toModel(var10.ambient, var10.contrast, var1, var2, var3);
                  }
               }
            }
         }
      }

   }

   @ObfuscatedName("ar")
   @ObfuscatedSignature(
      signature = "(Ldk;III)V"
   )
   void method3653(ModelData var1, int var2, int var3, int var4) {
      Tile var5;
      ModelData var6;
      if(var3 < this.maxX) {
         var5 = this.tiles[var2][var3 + 1][var4];
         if(var5 != null && var5.groundObject != null && var5.groundObject.entity instanceof ModelData) {
            var6 = (ModelData)var5.groundObject.entity;
            ModelData.method2788(var1, var6, 128, 0, 0, true);
         }
      }

      if(var4 < this.maxX) {
         var5 = this.tiles[var2][var3][var4 + 1];
         if(var5 != null && var5.groundObject != null && var5.groundObject.entity instanceof ModelData) {
            var6 = (ModelData)var5.groundObject.entity;
            ModelData.method2788(var1, var6, 0, 0, 128, true);
         }
      }

      if(var3 < this.maxX && var4 < this.maxZ) {
         var5 = this.tiles[var2][var3 + 1][var4 + 1];
         if(var5 != null && var5.groundObject != null && var5.groundObject.entity instanceof ModelData) {
            var6 = (ModelData)var5.groundObject.entity;
            ModelData.method2788(var1, var6, 128, 0, 128, true);
         }
      }

      if(var3 < this.maxX && var4 > 0) {
         var5 = this.tiles[var2][var3 + 1][var4 - 1];
         if(var5 != null && var5.groundObject != null && var5.groundObject.entity instanceof ModelData) {
            var6 = (ModelData)var5.groundObject.entity;
            ModelData.method2788(var1, var6, 128, 0, -128, true);
         }
      }

   }

   @ObfuscatedName("aa")
   public void method3642(int var1, int var2, int var3) {
      Tile var4 = this.tiles[var1][var2][var3];
      if(var4 != null) {
         var4.itemLayer = null;
         var4.itemLayerChanged(-1);
      }
   }

   @ObfuscatedName("s")
   public void method3623(int var1) {
      this.minLevel = var1;

      for(int var2 = 0; var2 < this.maxX; ++var2) {
         for(int var3 = 0; var3 < this.maxZ; ++var3) {
            if(this.tiles[var1][var2][var3] == null) {
               this.tiles[var1][var2][var3] = new Tile(var1, var2, var3);
            }
         }
      }

   }

   @ObfuscatedName("ap")
   public void method3704(int var1, int var2, int var3, int var4, int var5, int var6) {
      DrawCallbacks var7 = ItemContainer.clientInstance.getDrawCallbacks();
      if(var7 != null) {
         var7.drawScene(var1, var2, var3, var4, var5, var6);
      }

      boolean var8 = ItemContainer.clientInstance.isGpu();
      if(!var8 && client.skyboxColor != 0) {
         ItemContainer.clientInstance.RasterizerFillRectangle(ItemContainer.clientInstance.getViewportXOffset(), ItemContainer.clientInstance.getViewportYOffset(), ItemContainer.clientInstance.getViewportWidth(), ItemContainer.clientInstance.getViewportHeight(), client.skyboxColor);
      }

      int var9 = this.getMaxX();
      int var10 = this.getMaxY();
      int var11 = this.getMaxZ();
      int var12 = this.getMinLevel();
      RSTile[][][] var13 = this.getTiles();
      int var14 = var8?rl$drawDistance:25;
      if(var1 < 0) {
         var1 = 0;
      } else if(var1 >= var9 * 128) {
         var1 = var9 * 128 - 1;
      }

      if(var3 < 0) {
         var3 = 0;
      } else if(var3 >= var11 * 128) {
         var3 = var11 * 128 - 1;
      }

      int var15 = var4;
      if(var4 < 128) {
         var4 = 128;
      } else if(var4 > 383) {
         var4 = 383;
      }

      if(!client.pitchRelaxEnabled) {
         var15 = var4;
      }

      ItemContainer.clientInstance.setCycle(ItemContainer.clientInstance.getCycle() + 1);
      ItemContainer.clientInstance.setPitchSin(Perspective.SINE[var15]);
      ItemContainer.clientInstance.setPitchCos(Perspective.COSINE[var15]);
      ItemContainer.clientInstance.setYawSin(Perspective.SINE[var5]);
      ItemContainer.clientInstance.setYawCos(Perspective.COSINE[var5]);
      int[][][] var16 = ItemContainer.clientInstance.getTileHeights();
      boolean[][] var17 = ItemContainer.clientInstance.getVisibilityMaps()[(var4 - 128) / 32][var5 / 64];
      ItemContainer.clientInstance.setRenderArea(var17);
      ItemContainer.clientInstance.setCameraX2(var1);
      ItemContainer.clientInstance.setCameraY2(var2);
      ItemContainer.clientInstance.setCameraZ2(var3);
      int var18 = var1 / 128;
      int var19 = var3 / 128;
      ItemContainer.clientInstance.setScreenCenterX(var18);
      ItemContainer.clientInstance.setScreenCenterZ(var19);
      ItemContainer.clientInstance.setScenePlane(var6);
      int var20 = var18 - var14;
      if(var20 < 0) {
         var20 = 0;
      }

      int var21 = var19 - var14;
      if(var21 < 0) {
         var21 = 0;
      }

      int var22 = var18 + var14;
      if(var22 > var9) {
         var22 = var9;
      }

      int var23 = var19 + var14;
      if(var23 > var11) {
         var23 = var11;
      }

      ItemContainer.clientInstance.setMinTileX(var20);
      ItemContainer.clientInstance.setMinTileZ(var21);
      ItemContainer.clientInstance.setMaxTileX(var22);
      ItemContainer.clientInstance.setMaxTileZ(var23);
      this.updateOccluders();
      ItemContainer.clientInstance.setTileUpdateCount(0);

      int var24;
      RSTile[][] var25;
      int var26;
      int var27;
      for(var24 = var12; var24 < var10; ++var24) {
         var25 = var13[var24];

         for(var26 = var20; var26 < var22; ++var26) {
            for(var27 = var21; var27 < var23; ++var27) {
               RSTile var28 = var25[var26][var27];
               if(var28 != null) {
                  if(var28.getPhysicalLevel() <= var6 && (var8 || var17[var26 - var18 + 25][var27 - var19 + 25] || var16[var24][var26][var27] - var2 >= 2000)) {
                     var28.setDraw(true);
                     var28.setVisible(true);
                     var28.setDrawEntities(true);
                     ItemContainer.clientInstance.setTileUpdateCount(ItemContainer.clientInstance.getTileUpdateCount() + 1);
                  } else {
                     var28.setDraw(false);
                     var28.setVisible(false);
                     var28.setWallCullDirection(0);
                  }
               }
            }
         }
      }

      int var29;
      int var30;
      int var31;
      RSTile var32;
      int var33;
      for(var24 = var12; var24 < var10; ++var24) {
         var25 = var13[var24];

         for(var26 = -var14; var26 <= 0; ++var26) {
            var27 = var26 + var18;
            var33 = var18 - var26;
            if(var27 >= var20 || var33 < var22) {
               for(var29 = -var14; var29 <= 0; ++var29) {
                  var30 = var29 + var19;
                  var31 = var19 - var29;
                  if(var27 >= var20) {
                     if(var30 >= var21) {
                        var32 = var25[var27][var30];
                        if(var32 != null && var32.isDraw()) {
                           this.draw(var32, true);
                        }
                     }

                     if(var31 < var23) {
                        var32 = var25[var27][var31];
                        if(var32 != null && var32.isDraw()) {
                           this.draw(var32, true);
                        }
                     }
                  }

                  if(var33 < var22) {
                     if(var30 >= var21) {
                        var32 = var25[var33][var30];
                        if(var32 != null && var32.isDraw()) {
                           this.draw(var32, true);
                        }
                     }

                     if(var31 < var23) {
                        var32 = var25[var33][var31];
                        if(var32 != null && var32.isDraw()) {
                           this.draw(var32, true);
                        }
                     }
                  }

                  if(ItemContainer.clientInstance.getTileUpdateCount() == 0) {
                     if(!var8 && ItemContainer.clientInstance.getOculusOrbState() != 0) {
                        ItemContainer.clientInstance.setEntitiesAtMouseCount(0);
                     }

                     ItemContainer.clientInstance.setCheckClick(false);
                     ItemContainer.clientInstance.getCallbacks().drawScene();
                     if (ItemContainer.clientInstance.getDrawCallbacks() != null)
                     {
                        ItemContainer.clientInstance.getDrawCallbacks().postDrawScene();
                     }
                     return;
                  }
               }
            }
         }
      }

      for(var24 = var12; var24 < var10; ++var24) {
         var25 = var13[var24];

         for(var26 = -var14; var26 <= 0; ++var26) {
            var27 = var26 + var18;
            var33 = var18 - var26;
            if(var27 >= var20 || var33 < var22) {
               for(var29 = -var14; var29 <= 0; ++var29) {
                  var30 = var29 + var19;
                  var31 = var19 - var29;
                  if(var27 >= var20) {
                     if(var30 >= var21) {
                        var32 = var25[var27][var30];
                        if(var32 != null && var32.isDraw()) {
                           this.draw(var32, false);
                        }
                     }

                     if(var31 < var23) {
                        var32 = var25[var27][var31];
                        if(var32 != null && var32.isDraw()) {
                           this.draw(var32, false);
                        }
                     }
                  }

                  if(var33 < var22) {
                     if(var30 >= var21) {
                        var32 = var25[var33][var30];
                        if(var32 != null && var32.isDraw()) {
                           this.draw(var32, false);
                        }
                     }

                     if(var31 < var23) {
                        var32 = var25[var33][var31];
                        if(var32 != null && var32.isDraw()) {
                           this.draw(var32, false);
                        }
                     }
                  }

                  if(ItemContainer.clientInstance.getTileUpdateCount() == 0) {
                     if(!var8 && ItemContainer.clientInstance.getOculusOrbState() != 0) {
                        ItemContainer.clientInstance.setEntitiesAtMouseCount(0);
                     }

                     ItemContainer.clientInstance.setCheckClick(false);
                     ItemContainer.clientInstance.getCallbacks().drawScene();
                     if (ItemContainer.clientInstance.getDrawCallbacks() != null)
                     {
                        ItemContainer.clientInstance.getDrawCallbacks().postDrawScene();
                     }
                     return;
                  }
               }
            }
         }
      }

      if(!var8 && ItemContainer.clientInstance.getOculusOrbState() != 0) {
         ItemContainer.clientInstance.setEntitiesAtMouseCount(0);
      }

      ItemContainer.clientInstance.setCheckClick(false);
      ItemContainer.clientInstance.getCallbacks().drawScene();
      if (ItemContainer.clientInstance.getDrawCallbacks() != null)
      {
         ItemContainer.clientInstance.getDrawCallbacks().postDrawScene();
      }
   }

   @ObfuscatedName("ac")
   public void method3658(int var1, int var2, int var3, boolean var4) {
      if(!method3785() || var4) {
         checkClick = true;
         viewportWalking = var4;
         field1825 = var1;
         mouseX2 = var2;
         mouseY2 = var3;
         selectedRegionTileX = -1;
         selectedRegionTileY = -1;
      }
   }

   @ObfuscatedName("bi")
   boolean method3727(int var1, int var2, int var3, int var4) {
      if(!this.method3669(var1, var2, var3)) {
         return false;
      } else {
         int var5 = var2 << 7;
         int var6 = var3 << 7;
         int var7 = this.tileHeights[var1][var2][var3] - 1;
         int var8 = var7 - 120;
         int var9 = var7 - 230;
         int var10 = var7 - 238;
         if(var4 < 16) {
            if(var4 == 1) {
               if(var5 > cameraX2) {
                  if(!this.method3639(var5, var7, var6)) {
                     return false;
                  }

                  if(!this.method3639(var5, var7, var6 + 128)) {
                     return false;
                  }
               }

               if(var1 > 0) {
                  if(!this.method3639(var5, var8, var6)) {
                     return false;
                  }

                  if(!this.method3639(var5, var8, var6 + 128)) {
                     return false;
                  }
               }

               if(!this.method3639(var5, var9, var6)) {
                  return false;
               }

               if(!this.method3639(var5, var9, var6 + 128)) {
                  return false;
               }

               return true;
            }

            if(var4 == 2) {
               if(var6 < cameraZ2) {
                  if(!this.method3639(var5, var7, var6 + 128)) {
                     return false;
                  }

                  if(!this.method3639(var5 + 128, var7, var6 + 128)) {
                     return false;
                  }
               }

               if(var1 > 0) {
                  if(!this.method3639(var5, var8, var6 + 128)) {
                     return false;
                  }

                  if(!this.method3639(var5 + 128, var8, var6 + 128)) {
                     return false;
                  }
               }

               if(!this.method3639(var5, var9, var6 + 128)) {
                  return false;
               }

               if(!this.method3639(var5 + 128, var9, var6 + 128)) {
                  return false;
               }

               return true;
            }

            if(var4 == 4) {
               if(var5 < cameraX2) {
                  if(!this.method3639(var5 + 128, var7, var6)) {
                     return false;
                  }

                  if(!this.method3639(var5 + 128, var7, var6 + 128)) {
                     return false;
                  }
               }

               if(var1 > 0) {
                  if(!this.method3639(var5 + 128, var8, var6)) {
                     return false;
                  }

                  if(!this.method3639(var5 + 128, var8, var6 + 128)) {
                     return false;
                  }
               }

               if(!this.method3639(var5 + 128, var9, var6)) {
                  return false;
               }

               if(!this.method3639(var5 + 128, var9, var6 + 128)) {
                  return false;
               }

               return true;
            }

            if(var4 == 8) {
               if(var6 > cameraZ2) {
                  if(!this.method3639(var5, var7, var6)) {
                     return false;
                  }

                  if(!this.method3639(var5 + 128, var7, var6)) {
                     return false;
                  }
               }

               if(var1 > 0) {
                  if(!this.method3639(var5, var8, var6)) {
                     return false;
                  }

                  if(!this.method3639(var5 + 128, var8, var6)) {
                     return false;
                  }
               }

               if(!this.method3639(var5, var9, var6)) {
                  return false;
               }

               if(!this.method3639(var5 + 128, var9, var6)) {
                  return false;
               }

               return true;
            }
         }

         return !this.method3639(var5 + 64, var10, var6 + 64)?false:(var4 == 16?this.method3639(var5, var9, var6 + 128):(var4 == 32?this.method3639(var5 + 128, var9, var6 + 128):(var4 == 64?this.method3639(var5 + 128, var9, var6):(var4 == 128?this.method3639(var5, var9, var6):true))));
      }
   }

   @ObfuscatedName("h")
   public void method3782(int var1, int var2, int var3, int var4) {
      Tile var5 = this.tiles[var1][var2][var3];
      if(var5 != null) {
         this.tiles[var1][var2][var3].physicalLevel = var4;
      }
   }

   @ObfuscatedName("u")
   public void method3797(int var1, int var2, int var3, int var4) {
      Tile var5 = this.tiles[var1][var2][var3];
      if(var5 != null) {
         DecorativeObject var6 = var5.decorativeObject;
         if(var6 != null) {
            var6.offsetX = var4 * var6.offsetX / 16;
            var6.offsetY = var4 * var6.offsetY / 16;
         }
      }
   }

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      signature = "(III)Lep;"
   )
   public WallObject method3643(int var1, int var2, int var3) {
      Tile var4 = this.tiles[var1][var2][var3];
      return var4 == null?null:var4.wallObject;
   }

   @ObfuscatedName("ao")
   public void method3650() {
      viewportWalking = true;
   }

   @ObfuscatedName("g")
   public void method3764(int var1, int var2) {
      Tile var3 = this.tiles[0][var1][var2];

      for(int var4 = 0; var4 < 3; ++var4) {
         Tile var5 = this.tiles[var4][var1][var2] = this.tiles[var4 + 1][var1][var2];
         if(var5 != null) {
            --var5.level;

            for(int var6 = 0; var6 < var5.entityCount; ++var6) {
               GameObject var7 = var5.objects[var6];
               if(ChatHistory.method6262(var7.hash) && var7.relativeX == var1 && var2 == var7.relativeY) {
                  --var7.plane;
               }
            }
         }
      }

      if(this.tiles[0][var1][var2] == null) {
         this.tiles[0][var1][var2] = new Tile(0, var1, var2);
      }

      this.tiles[0][var1][var2].bridge = var3;
      this.tiles[3][var1][var2] = null;
   }

   @ObfuscatedName("al")
   public static void method3656(int[] var0, int var1, int var2, int var3, int var4) {
      field1824 = 0;
      field1857 = 0;
      field1858 = var3;
      field1859 = var4;
      field1856 = var3 / 2;
      field1854 = var4 / 2;
      boolean[][][][] var5 = new boolean[var0.length][32][53][53];

      int var6;
      int var7;
      int var8;
      int var9;
      int var11;
      int var12;
      for(var6 = 128; var6 <= 383; var6 += 32) {
         for(var7 = 0; var7 < 2048; var7 += 64) {
            pitchSin = Graphics3D.SINE[var6];
            pitchCos = Graphics3D.COSINE[var6];
            yawSin = Graphics3D.SINE[var7];
            yawCos = Graphics3D.COSINE[var7];
            var8 = (var6 - 128) / 32;
            var9 = var7 / 64;

            for(int var10 = -26; var10 < 26; ++var10) {
               for(var11 = -26; var11 < 26; ++var11) {
                  var12 = var10 * 128;
                  int var13 = var11 * 128;
                  boolean var14 = false;

                  for(int var15 = -var1; var15 <= var2; var15 += 128) {
                     if(method3657(var12, var0[var8] + var15, var13)) {
                        var14 = true;
                        break;
                     }
                  }

                  var5[var8][var9][var10 + 1 + 25][var11 + 1 + 25] = var14;
               }
            }
         }
      }

      for(var6 = 0; var6 < 8; ++var6) {
         for(var7 = 0; var7 < 32; ++var7) {
            for(var8 = -25; var8 < 25; ++var8) {
               for(var9 = -25; var9 < 25; ++var9) {
                  boolean var16 = false;

                  label76:
                  for(var11 = -1; var11 <= 1; ++var11) {
                     for(var12 = -1; var12 <= 1; ++var12) {
                        if(var5[var6][var7][var8 + var11 + 1 + 25][var9 + var12 + 1 + 25]) {
                           var16 = true;
                           break label76;
                        }

                        if(var5[var6][(var7 + 1) % 31][var8 + var11 + 1 + 25][var9 + var12 + 1 + 25]) {
                           var16 = true;
                           break label76;
                        }

                        if(var5[var6 + 1][var7][var8 + var11 + 1 + 25][var9 + var12 + 1 + 25]) {
                           var16 = true;
                           break label76;
                        }

                        if(var5[var6 + 1][(var7 + 1) % 31][var8 + var11 + 1 + 25][var9 + var12 + 1 + 25]) {
                           var16 = true;
                           break label76;
                        }
                     }
                  }

                  visibilityMaps[var6][var7][var8 + 25][var9 + 25] = var16;
               }
            }
         }
      }

   }

   @ObfuscatedName("x")
   public static void method3624(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      Occluder var8 = new Occluder();
      var8.minTileX = var2 / 128;
      var8.maxTIleX = var3 / 128;
      var8.minTileZ = var4 / 128;
      var8.maxTileZ = var5 / 128;
      var8.type = var1;
      var8.minX = var2;
      var8.maxX = var3;
      var8.minZ = var4;
      var8.maxZ = var5;
      var8.minY = var6;
      var8.maxY = var7;
      levelOccluders[var0][levelOccluderCount[var0]++] = var8;
   }

   @ObfuscatedName("bo")
   static final int method3798(int var0, int var1) {
      var1 = (var0 & 127) * var1 >> 7;
      if(var1 < 2) {
         var1 = 2;
      } else if(var1 > 126) {
         var1 = 126;
      }

      return (var0 & 65408) + var1;
   }

   public static boolean shouldDraw(Object var0, boolean var1) {
      if(!client.isHidingEntities) {
         return true;
      } else {
         boolean var4;
         label94: {
            if(var0 instanceof RSPlayer) {
               boolean var2 = var1? client.hideLocalPlayer2D: client.hideLocalPlayer;
               boolean var3 = var1? client.hidePlayers2D: client.hidePlayers;
               var4 = var0 == ItemContainer.clientInstance.getLocalPlayer();
               if(var4) {
                  if(var2) {
                     break label94;
                  }
               } else if(var3) {
                  break label94;
               }
            } else {
               if(var0 instanceof RSNPC) {
                  RSNPC var6 = (RSNPC)var0;
                  if(!client.hideAttackers && var6.getInteracting() == ItemContainer.clientInstance.getLocalPlayer()) {
                     return true;
                  }

                  return var1?!client.hideNPCs2D:!client.hideNPCs;
               }

               if(var0 instanceof RSProjectile) {
                  return !client.hideProjectiles;
               }
            }

            return true;
         }

         RSPlayer var5 = (RSPlayer)var0;
         return !client.hideAttackers && var5.getInteracting() == ItemContainer.clientInstance.getLocalPlayer()?true:(var5.getName() == null?false:!client.hideFriends && var5.isFriend() || !var4 && !client.hideClanMates && var5.isClanMember());
      }
   }

   public static void setTargetTile(int var0, int var1) {
      LocalPoint var2 = ItemContainer.clientInstance.getLocalPlayer().getLocalLocation();
      int var3 = var2.getSceneX();
      int var4 = var2.getSceneY();
      boolean var7 = true;
      int var8 = (int)Math.hypot((double)(var3 - var0), (double)(var4 - var1)) - 45;
      int var9 = var0;
      int var10 = var1;
      if(var8 > 0) {
         var9 = (var8 * var3 + var0 * 45) / (var8 + 45);
         var10 = (var8 * var4 + var1 * 45) / (var8 + 45);
      }

      ItemContainer.clientInstance.setSelectedSceneTileX(var9);
      ItemContainer.clientInstance.setSelectedSceneTileY(var10);
   }

   private static void rl$$clinit() {
      tmpX = new int[6];
      tmpY = new int[6];
   }

   @ObfuscatedSignature(
      signature = "(Lbq;IIIIII)V"
   )
   public static final void copy$draw2DExtras(PathingEntity var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      if(var0 != null && var0.vmethod6005()) {
         if(var0 instanceof NPCEntity) {
            NPCType var7 = ((NPCEntity)var0).type;
            if(var7.multiNpcs != null) {
               if(var6 == -845922967) {
                  return;
               }

               var7 = var7.method4782();
            }

            if(var7 == null) {
               return;
            }
         }

         int var76 = PlayerList.highResolutionPlayerCount;
         int[] var8 = PlayerList.highResolutionPlayerIndexes;
         byte var9 = 0;
         if(var1 < var76 && var0.field960 == client.gameCycle) {
            if(var6 == -845922967) {
               return;
            }

            if(class280.method5703((PlayerEntity)var0)) {
               PlayerEntity var10 = (PlayerEntity)var0;
               if(var1 < var76) {
                  DecorativeObject.method913(var0, var0.logicalHeight + 15);
                  FontTypeFace var11 = (FontTypeFace) client.fontsMap.get(FontName.FontName_plain12);
                  byte var12 = 9;
                  var11.method6222(var10.name.method1530(), var2 + client.screenX, var3 + client.screenY - var12, 16777215, 0);
                  var9 = 18;
               }
            }
         }

         int var77 = -2;
         int var16;
         int var23;
         int var24;
         if(!var0.combatInfoList.method4705()) {
            DecorativeObject.method913(var0, var0.logicalHeight + 15);

            for(CombatInfoListHolder var88 = (CombatInfoListHolder)var0.combatInfoList.method4703(); var88 != null; var88 = (CombatInfoListHolder)var0.combatInfoList.method4704()) {
               CombatInfo1 var78 = var88.method805(client.gameCycle);
               if(var78 == null) {
                  if(var88.method806()) {
                     var88.method432();
                  }
               } else {
                  HeadbarType var13 = var88.headbar;
                  SpritePixels var14 = var13.method2050(72714445);
                  SpritePixels var15 = var13.method2049((byte)-36);
                  int var17 = 0;
                  if(var14 != null && var15 != null) {
                     if(var6 == -845922967) {
                        return;
                     }

                     if(var13.field3398 * 2 < var15.width) {
                        var17 = var13.field3398;
                     }

                     var16 = var15.width - var17 * 2;
                  } else {
                     var16 = var13.healthScale;
                  }

                  int var18 = 255;
                  boolean var19 = true;
                  int var20 = client.gameCycle - var78.cycle;
                  int var21 = var16 * var78.health / var13.healthScale;
                  int var22;
                  int var93;
                  if(var78.int2 > var20) {
                     int var10000;
                     if(var13.field3393 == 0) {
                        if(var6 == -845922967) {
                           return;
                        }

                        var10000 = 0;
                     } else {
                        var10000 = var13.field3393 * (var20 / var13.field3393);
                     }

                     var22 = var10000;
                     var23 = var16 * var78.healthRatio / var13.healthScale;
                     var93 = var22 * (var21 - var23) / var78.int2 + var23;
                  } else {
                     var93 = var21;
                     var22 = var78.int2 + var13.field3394 - var20;
                     if(var13.field3392 >= 0) {
                        var18 = (var22 << 8) / (var13.field3394 - var13.field3392);
                     }
                  }

                  if(var78.health > 0 && var93 < 1) {
                     var93 = 1;
                  }

                  if(var14 != null) {
                     if(var6 == -845922967) {
                        return;
                     }

                     if(var15 != null) {
                        if(var93 == var16) {
                           var93 += var17 * 2;
                        } else {
                           var93 += var17;
                        }

                        var22 = var14.height;
                        var77 += var22;
                        var23 = var2 + client.screenX - (var16 >> 1);
                        var24 = var3 + client.screenY - var77;
                        var23 -= var17;
                        if(var18 >= 0 && var18 < 255) {
                           var14.method1374(var23, var24, var18);
                           Rasterizer2D.method685(var23, var24, var23 + var93, var24 + var22);
                           var15.method1374(var23, var24, var18);
                        } else {
                           var14.method1311(var23, var24);
                           Rasterizer2D.method685(var23, var24, var93 + var23, var24 + var22);
                           var15.method1311(var23, var24);
                        }

                        Rasterizer2D.method684(var2, var3, var2 + var4, var3 + var5);
                        var77 += 2;
                        continue;
                     }
                  }

                  var77 += 5;
                  if(client.screenX > -1) {
                     var22 = var2 + client.screenX - (var16 >> 1);
                     var23 = var3 + client.screenY - var77;
                     Rasterizer2D.method692(var22, var23, var93, 5, 65280);
                     Rasterizer2D.method692(var93 + var22, var23, var16 - var93, 5, 16711680);
                  }

                  var77 += 2;
               }
            }
         }

         if(var77 == -2) {
            var77 += 7;
         }

         var77 += var9;
         if(var1 < var76) {
            PlayerEntity var89 = (PlayerEntity)var0;
            if(var89.hidden) {
               return;
            }

            label720: {
               if(var89.skullIcon == -1) {
                  if(var89.overheadIcon == -1) {
                     break label720;
                  }

                  if(var6 == -845922967) {
                     return;
                  }
               }

               DecorativeObject.method913(var0, var0.logicalHeight + 15);
               if(client.screenX > -1) {
                  if(var89.skullIcon != -1) {
                     var77 += 25;
                     IndexStoreActionHandler.headIconsPk[var89.skullIcon].method1311(var2 + client.screenX - 12, var3 + client.screenY - var77);
                  }

                  if(var89.overheadIcon != -1) {
                     var77 += 25;
                     ItemContainer.headIconsPrayer[var89.overheadIcon].method1311(var2 + client.screenX - 12, var3 + client.screenY - var77);
                  }
               }
            }

            if(var1 >= 0 && client.hintArrowTargetType == 10) {
               if(var6 == -845922967) {
                  return;
               }

               if(var8[var1] == client.hintArrowPlayerTargetIdx) {
                  DecorativeObject.method913(var0, var0.logicalHeight + 15);
                  if(client.screenX > -1) {
                     if(var6 == -845922967) {
                        return;
                     }

                     var77 += WorldMapDecoration.headIconsHint[1].height;
                     WorldMapDecoration.headIconsHint[1].method1311(var2 + client.screenX - 12, var3 + client.screenY - var77);
                  }
               }
            }
         } else {
            NPCType var90 = ((NPCEntity)var0).type;
            if(var90.multiNpcs != null) {
               var90 = var90.method4782();
            }

            if(var90.headIcon >= 0 && var90.headIcon < ItemContainer.headIconsPrayer.length) {
               DecorativeObject.method913(var0, var0.logicalHeight + 15);
               if(client.screenX > -1) {
                  ItemContainer.headIconsPrayer[var90.headIcon].method1311(var2 + client.screenX - 12, var3 + client.screenY - 30);
               }
            }

            if(client.hintArrowTargetType == 1 && client.highResolutionNpcIndexes[var1 - var76] == client.hintArrowNpcTargetIdx) {
               if(var6 == -845922967) {
                  return;
               }

               if(client.gameCycle % 20 < 10) {
                  DecorativeObject.method913(var0, var0.logicalHeight + 15);
                  if(client.screenX > -1) {
                     WorldMapDecoration.headIconsHint[0].method1311(var2 + client.screenX - 12, var3 + client.screenY - 28);
                  }
               }
            }
         }

         if(var0.overhead != null) {
            label765: {
               if(var6 == -845922967) {
                  return;
               }

               if(var1 < var76) {
                  if(var0.overheadFiltered) {
                     break label765;
                  }

                  if(var6 == -845922967) {
                     return;
                  }

                  if(client.publicChatMode != 4) {
                     if(var0.field953) {
                        break label765;
                     }

                     if(client.publicChatMode != 0 && client.publicChatMode != 3) {
                        if(client.publicChatMode != 1) {
                           break label765;
                        }

                        if(var6 == -845922967) {
                           return;
                        }

                        if(!((PlayerEntity)var0).method6002()) {
                           break label765;
                        }
                     }
                  }
               }

               DecorativeObject.method913(var0, var0.logicalHeight);
               if(client.screenX > -1 && client.overheadTextCount < client.field760) {
                  client.overheadTextsOffsetX[client.overheadTextCount] = class191.fontBold12.method6160(var0.overhead) / 2;
                  client.overheadTextsOffsetY[client.overheadTextCount] = class191.fontBold12.verticalSpace;
                  client.overheadTextsX[client.overheadTextCount] = client.screenX;
                  client.overheadTextsY[client.overheadTextCount] = client.screenY;
                  client.field742[client.overheadTextCount] = var0.field956;
                  client.field743[client.overheadTextCount] = var0.field957;
                  client.overheadTextsCyclesRemaining[client.overheadTextCount] = var0.overheadTextCyclesRemaining;
                  client.overheadTexts[client.overheadTextCount] = var0.overhead;
                  ++client.overheadTextCount;
               }
            }
         }

         for(int var79 = 0; var79 < 4; ++var79) {
            int var91 = var0.hitsplatCycles[var79];
            int var80 = var0.hitsplatTypes[var79];
            HitmarkType var92 = null;
            int var81 = 0;
            if(var80 >= 0) {
               if(var91 <= client.gameCycle) {
                  continue;
               }

               var92 = Timer.method1740(var0.hitsplatTypes[var79]);
               var81 = var92.field3437;
               if(var92 != null && var92.multiMark != null) {
                  var92 = var92.method4021();
                  if(var92 == null) {
                     var0.hitsplatCycles[var79] = -1;
                     continue;
                  }
               }
            } else if(var91 < 0) {
               if(var6 == -845922967) {
                  return;
               }
               continue;
            }

            var16 = var0.field962[var79];
            HitmarkType var82 = null;
            if(var16 >= 0) {
               var82 = Timer.method1740(var16);
               if(var82 != null && var82.multiMark != null) {
                  var82 = var82.method4021();
               }
            }

            if(var91 - var81 <= client.gameCycle) {
               if(var92 == null) {
                  if(var6 == -845922967) {
                     return;
                  }

                  var0.hitsplatCycles[var79] = -1;
               } else {
                  DecorativeObject.method913(var0, var0.logicalHeight / 2);
                  if(client.screenX > -1) {
                     if(var6 == -845922967) {
                        return;
                     }

                     if(var79 == 1) {
                        if(var6 == -845922967) {
                           return;
                        }

                        client.screenY -= 20;
                     }

                     if(var79 == 2) {
                        client.screenX -= 15;
                        client.screenY -= 10;
                     }

                     if(var79 == 3) {
                        client.screenX += 15;
                        client.screenY -= 10;
                     }

                     SpritePixels var83 = null;
                     SpritePixels var84 = null;
                     SpritePixels var85 = null;
                     SpritePixels var86 = null;
                     var23 = 0;
                     var24 = 0;
                     int var25 = 0;
                     int var26 = 0;
                     int var27 = 0;
                     int var28 = 0;
                     int var29 = 0;
                     int var30 = 0;
                     SpritePixels var31 = null;
                     SpritePixels var32 = null;
                     SpritePixels var33 = null;
                     SpritePixels var34 = null;
                     int var35 = 0;
                     int var36 = 0;
                     int var37 = 0;
                     int var38 = 0;
                     int var39 = 0;
                     int var40 = 0;
                     int var41 = 0;
                     int var42 = 0;
                     int var43 = 0;
                     var83 = var92.method4022();
                     int var44;
                     if(var83 != null) {
                        var23 = var83.width;
                        var44 = var83.height;
                        if(var44 > var43) {
                           var43 = var44;
                        }

                        var27 = var83.offsetX;
                     }

                     var84 = var92.method4023();
                     if(var84 != null) {
                        var24 = var84.width;
                        var44 = var84.height;
                        if(var44 > var43) {
                           if(var6 == -845922967) {
                              return;
                           }

                           var43 = var44;
                        }

                        var28 = var84.offsetX;
                     }

                     var85 = var92.method4051();
                     if(var85 != null) {
                        var25 = var85.width;
                        var44 = var85.height;
                        if(var44 > var43) {
                           var43 = var44;
                        }

                        var29 = var85.offsetX;
                     }

                     var86 = var92.method4046();
                     if(var86 != null) {
                        var26 = var86.width;
                        var44 = var86.height;
                        if(var44 > var43) {
                           var43 = var44;
                        }

                        var30 = var86.offsetX;
                     }

                     if(var82 != null) {
                        var31 = var82.method4022();
                        if(var31 != null) {
                           var35 = var31.width;
                           var44 = var31.height;
                           if(var44 > var43) {
                              var43 = var44;
                           }

                           var39 = var31.offsetX;
                        }

                        var32 = var82.method4023();
                        if(var32 != null) {
                           var36 = var32.width;
                           var44 = var32.height;
                           if(var44 > var43) {
                              var43 = var44;
                           }

                           var40 = var32.offsetX;
                        }

                        var33 = var82.method4051();
                        if(var33 != null) {
                           if(var6 == -845922967) {
                              return;
                           }

                           var37 = var33.width;
                           var44 = var33.height;
                           if(var44 > var43) {
                              var43 = var44;
                           }

                           var41 = var33.offsetX;
                        }

                        var34 = var82.method4046();
                        if(var34 != null) {
                           var38 = var34.width;
                           var44 = var34.height;
                           if(var44 > var43) {
                              var43 = var44;
                           }

                           var42 = var34.offsetX;
                        }
                     }

                     Font var87 = var92.method4024();
                     if(var87 == null) {
                        var87 = client.fontPlain11;
                     }

                     Font var45;
                     if(var82 != null) {
                        var45 = var82.method4024();
                        if(var45 == null) {
                           var45 = client.fontPlain11;
                        }
                     } else {
                        var45 = client.fontPlain11;
                     }

                     String var46 = null;
                     String var47 = null;
                     boolean var48 = false;
                     int var49 = 0;
                     var46 = var92.method4054(var0.hitsplatValues[var79]);
                     int var94 = var87.method6160(var46);
                     if(var82 != null) {
                        var47 = var82.method4054(var0.field963[var79]);
                        var49 = var45.method6160(var47);
                     }

                     int var50 = 0;
                     int var51 = 0;
                     if(var24 > 0) {
                        if(var85 == null && var86 == null) {
                           var50 = 1;
                        } else {
                           var50 = var94 / var24 + 1;
                        }
                     }

                     if(var82 != null && var36 > 0) {
                        label666: {
                           if(var33 == null) {
                              if(var6 == -845922967) {
                                 return;
                              }

                              if(var34 == null) {
                                 var51 = 1;
                                 break label666;
                              }
                           }

                           var51 = var49 / var36 + 1;
                        }
                     }

                     int var52 = 0;
                     int var53 = var52;
                     if(var23 > 0) {
                        var52 += var23;
                     }

                     var52 += 2;
                     int var54 = var52;
                     if(var25 > 0) {
                        var52 += var25;
                     }

                     int var55 = var52;
                     int var56 = var52;
                     int var57;
                     if(var24 > 0) {
                        var57 = var24 * var50;
                        var52 += var57;
                        var56 += (var57 - var94) / 2;
                     } else {
                        var52 += var94;
                     }

                     var57 = var52;
                     if(var26 > 0) {
                        var52 += var26;
                     }

                     int var58 = 0;
                     int var59 = 0;
                     int var60 = 0;
                     int var61 = 0;
                     int var62 = 0;
                     int var63;
                     if(var82 != null) {
                        var52 += 2;
                        var58 = var52;
                        if(var35 > 0) {
                           var52 += var35;
                        }

                        var52 += 2;
                        var59 = var52;
                        if(var37 > 0) {
                           var52 += var37;
                        }

                        var60 = var52;
                        var62 = var52;
                        if(var36 > 0) {
                           var63 = var36 * var51;
                           var52 += var63;
                           var62 += (var63 - var49) / 2;
                        } else {
                           var52 += var49;
                        }

                        var61 = var52;
                        if(var38 > 0) {
                           var52 += var38;
                        }
                     }

                     var63 = var0.hitsplatCycles[var79] - client.gameCycle;
                     int var64 = var92.field3442 - var63 * var92.field3442 / var92.field3437;
                     int var65 = var63 * var92.field3443 / var92.field3437 + -var92.field3443;
                     int var66 = var64 + (var2 + client.screenX - (var52 >> 1));
                     int var67 = var65 + (var3 + client.screenY - 12);
                     int var68 = var67;
                     int var69 = var67 + var43;
                     int var70 = var67 + var92.field3444 + 15;
                     int var71 = var70 - var87.minSpacing;
                     int var72 = var70 + var87.maxSpacing;
                     if(var71 < var67) {
                        var68 = var71;
                     }

                     if(var72 > var69) {
                        var69 = var72;
                     }

                     int var73 = 0;
                     int var74;
                     int var75;
                     if(var82 != null) {
                        var73 = var67 + var82.field3444 + 15;
                        var74 = var73 - var45.minSpacing;
                        var75 = var73 + var45.maxSpacing;
                        if(var74 < var68) {
                           ;
                        }

                        if(var75 > var69) {
                           ;
                        }
                     }

                     var74 = 255;
                     if(var92.field3446 >= 0) {
                        var74 = (var63 << 8) / (var92.field3437 - var92.field3446);
                     }

                     if(var74 >= 0) {
                        if(var6 == -845922967) {
                           return;
                        }

                        if(var74 < 255) {
                           if(var6 == -845922967) {
                              return;
                           }

                           if(var83 != null) {
                              var83.method1374(var66 + var53 - var27, var67, var74);
                           }

                           if(var85 != null) {
                              if(var6 == -845922967) {
                                 return;
                              }

                              var85.method1374(var66 + var54 - var29, var67, var74);
                           }

                           if(var84 != null) {
                              for(var75 = 0; var75 < var50; ++var75) {
                                 var84.method1374(var24 * var75 + (var55 + var66 - var28), var67, var74);
                              }
                           }

                           if(var86 != null) {
                              var86.method1374(var57 + var66 - var30, var67, var74);
                           }

                           var87.method6191(var46, var56 + var66, var70, var92.field3440, 0, var74);
                           if(var82 == null) {
                              continue;
                           }

                           if(var6 == -845922967) {
                              return;
                           }

                           if(var31 != null) {
                              var31.method1374(var58 + var66 - var39, var67, var74);
                           }

                           if(var33 != null) {
                              if(var6 == -845922967) {
                                 return;
                              }

                              var33.method1374(var59 + var66 - var41, var67, var74);
                           }

                           if(var32 != null) {
                              for(var75 = 0; var75 < var51; ++var75) {
                                 var32.method1374(var36 * var75 + (var60 + var66 - var40), var67, var74);
                              }
                           }

                           if(var34 != null) {
                              if(var6 == -845922967) {
                                 return;
                              }

                              var34.method1374(var66 + var61 - var42, var67, var74);
                           }

                           var45.method6191(var47, var62 + var66, var73, var82.field3440, 0, var74);
                           continue;
                        }
                     }

                     if(var83 != null) {
                        var83.method1311(var66 + var53 - var27, var67);
                     }

                     if(var85 != null) {
                        var85.method1311(var54 + var66 - var29, var67);
                     }

                     if(var84 != null) {
                        for(var75 = 0; var75 < var50; ++var75) {
                           if(var6 == -845922967) {
                              return;
                           }

                           var84.method1311(var75 * var24 + (var55 + var66 - var28), var67);
                        }
                     }

                     if(var86 != null) {
                        var86.method1311(var57 + var66 - var30, var67);
                     }

                     var87.method6165(var46, var56 + var66, var70, var92.field3440 | -16777216, 0);
                     if(var82 != null) {
                        if(var31 != null) {
                           if(var6 == -845922967) {
                              return;
                           }

                           var31.method1311(var66 + var58 - var39, var67);
                        }

                        if(var33 != null) {
                           var33.method1311(var66 + var59 - var41, var67);
                        }

                        if(var32 != null) {
                           if(var6 == -845922967) {
                              return;
                           }

                           for(var75 = 0; var75 < var51; ++var75) {
                              if(var6 == -845922967) {
                                 return;
                              }

                              var32.method1311(var36 * var75 + (var66 + var60 - var40), var67);
                           }
                        }

                        if(var34 != null) {
                           if(var6 == -845922967) {
                              return;
                           }

                           var34.method1311(var61 + var66 - var42, var67);
                        }

                        var45.method6165(var47, var66 + var62, var73, var82.field3440 | -16777216, 0);
                     }
                  }
               }
            }
         }

      }
   }

   @ObfuscatedName("be")
   static boolean method3667(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      if(var1 < var2 && var1 < var3 && var1 < var4) {
         return false;
      } else if(var1 > var2 && var1 > var3 && var1 > var4) {
         return false;
      } else if(var0 < var5 && var0 < var6 && var0 < var7) {
         return false;
      } else if(var0 > var5 && var0 > var6 && var0 > var7) {
         return false;
      } else {
         int var8 = (var1 - var2) * (var6 - var5) - (var0 - var5) * (var3 - var2);
         int var9 = (var7 - var6) * (var1 - var3) - (var0 - var6) * (var4 - var3);
         int var10 = (var5 - var7) * (var1 - var4) - (var2 - var4) * (var0 - var7);
         return var8 == 0?(var9 != 0?(var9 < 0?var10 <= 0:var10 >= 0):true):(var8 < 0?var9 <= 0 && var10 <= 0:var9 >= 0 && var10 >= 0);
      }
   }

   @ObfuscatedName("ax")
   public static void method3670() {
      selectedRegionTileX = -1;
      viewportWalking = false;
   }

   @ObfuscatedName("ad")
   public static boolean method3785() {
      return viewportWalking && selectedRegionTileX != -1;
   }

   @ObfuscatedName("az")
   static boolean method3657(int var0, int var1, int var2) {
      int var3 = var0 * yawCos + var2 * yawSin >> 16;
      int var4 = var2 * yawCos - var0 * yawSin >> 16;
      int var5 = var4 * pitchCos + pitchSin * var1 >> 16;
      int var6 = pitchCos * var1 - var4 * pitchSin >> 16;
      if(var5 >= 50 && var5 <= 3500) {
         int var7 = var3 * 128 / var5 + field1856;
         int var8 = var6 * 128 / var5 + field1854;
         return var7 >= field1824 && var7 <= field1858 && var8 >= field1857 && var8 <= field1859;
      } else {
         return false;
      }
   }
}
