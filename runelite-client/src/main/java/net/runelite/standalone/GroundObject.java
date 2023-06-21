package net.runelite.standalone;

import net.runelite.api.Perspective;
import net.runelite.api.Point;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.coords.WorldPoint;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.api.RSGroundObject;
import net.runelite.rs.api.RSRenderable;

import java.awt.*;
import java.awt.geom.Area;

@ObfuscatedName("dw")
public final class GroundObject implements RSGroundObject {
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = 1275172067
   )
   int renderInfoBitPacked;
   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "Lem;"
   )
   public Entity entity;
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      intValue = 64699151
   )
   int floor;
   public int groundObjectPlane;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = 1267567225
   )
   int x;
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      longValue = -7746942760389518379L
   )
   public long hash;
   @ObfuscatedName("g")
   @ObfuscatedGetter(
      intValue = 1290086305
   )
   int y;

   GroundObject() {
      this.rl$$init();
      this.rl$$init1();
   }

   public Point getCanvasLocation(int var1) {
      return Perspective.localToCanvas(ItemContainer.clientInstance, this.getLocalLocation(), this.getPlane(), var1);
   }

   public long getHash() {
      return this.hash;
   }

   public RSRenderable getRenderable() {
      return this.entity;
   }

   @Override
   public int getConfig() {
      return 0;
   }

   public int getX() {
      return this.x;
   }

   private void rl$$init() {
   }

   public net.runelite.api.Model getModel() {
      RSRenderable var1 = this.getRenderable();
      return var1 == null?null:(var1 instanceof net.runelite.api.Model?(net.runelite.api.Model)var1:var1.getModel());
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
      return this.groundObjectPlane;
   }

   public void setPlane(int var1) {
      this.groundObjectPlane = var1;
   }

   public Area getClickbox() {
      return Perspective.getClickbox(ItemContainer.clientInstance, this.getModel(), 0, this.getLocalLocation());
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

   @ObfuscatedName("b")
   @ObfuscatedSignature(
      signature = "(Len;[Lfk;I)V",
      garbageValue = "-1754850306"
   )
   static final void method4109(SceneManager var0, CollisionData[] var1) {
      int var2;
      int var3;
      int var4;
      int var5;
      for(var2 = 0; var2 < 4; ++var2) {
         for(var3 = 0; var3 < 104; ++var3) {
            for(var4 = 0; var4 < 104; ++var4) {
               if((class91.tileSettings[var2][var3][var4] & 1) == 1) {
                  var5 = var2;
                  if((class91.tileSettings[1][var3][var4] & 2) == 2) {
                     var5 = var2 - 1;
                  }

                  if(var5 >= 0) {
                     var1[var5].method3587(var3, var4);
                  }
               }
            }
         }
      }

      class91.field514 += (int)(Math.random() * 5.0D) - 2;
      if(class91.field514 < -8) {
         class91.field514 = -8;
      }

      if(class91.field514 > 8) {
         class91.field514 = 8;
      }

      class91.field521 += (int)(Math.random() * 5.0D) - 2;
      if(class91.field521 < -16) {
         class91.field521 = -16;
      }

      if(class91.field521 > 16) {
         class91.field521 = 16;
      }

      int var9;
      int var10;
      int var11;
      int var12;
      int var13;
      int var14;
      int var15;
      int var16;
      int var17;
      int var18;
      for(var2 = 0; var2 < 4; ++var2) {
         byte[][] var44 = class91.field511[var2];
         var9 = (int)Math.sqrt(5100.0D);
         var10 = var9 * 768 >> 8;

         int var19;
         int var20;
         for(var11 = 1; var11 < 103; ++var11) {
            for(var12 = 1; var12 < 103; ++var12) {
               var13 = class91.tileHeights[var2][var12 + 1][var11] - class91.tileHeights[var2][var12 - 1][var11];
               var14 = class91.tileHeights[var2][var12][var11 + 1] - class91.tileHeights[var2][var12][var11 - 1];
               var15 = (int)Math.sqrt((double)(var13 * var13 + var14 * var14 + 65536));
               var16 = (var13 << 8) / var15;
               var17 = 65536 / var15;
               var18 = (var14 << 8) / var15;
               var19 = (var16 * -50 + var18 * -50 + var17 * -10) / var10 + 96;
               var20 = (var44[var12 - 1][var11] >> 2) + (var44[var12][var11 - 1] >> 2) + (var44[var12 + 1][var11] >> 3) + (var44[var12][var11 + 1] >> 3) + (var44[var12][var11] >> 1);
               class83.field1963[var12][var11] = var19 - var20;
            }
         }

         for(var11 = 0; var11 < 104; ++var11) {
            class177.floorHues[var11] = 0;
            class91.floorSaturations[var11] = 0;
            ChatCrownType.field3209[var11] = 0;
            ChatLineBuffer.floorMultiplier[var11] = 0;
            class91.field513[var11] = 0;
         }

         for(var11 = -5; var11 < 109; ++var11) {
            for(var12 = 0; var12 < 104; ++var12) {
               var13 = var11 + 5;
               if(var13 >= 0 && var13 < 104) {
                  var14 = class91.tileUnderlayIds[var2][var13][var12] & 255;
                  if(var14 > 0) {
                     var16 = var14 - 1;
                     FloorUnderlayDefinition var45 = (FloorUnderlayDefinition)FloorUnderlayDefinition.underlays.method635((long)var16);
                     FloorUnderlayDefinition var46;
                     if(var45 != null) {
                        var46 = var45;
                     } else {
                        byte[] var47 = FloorUnderlayDefinition.underlay_ref.method4115(1, var16, 1841473394);
                        var45 = new FloorUnderlayDefinition();
                        if(var47 != null) {
                           var45.method1893(new Packet(var47), var16);
                        }

                        var45.method1883();
                        FloorUnderlayDefinition.underlays.method628(var45, (long)var16);
                        var46 = var45;
                     }

                     class177.floorHues[var12] += var46.hue;
                     class91.floorSaturations[var12] += var46.saturation;
                     ChatCrownType.field3209[var12] += var46.lightness;
                     ChatLineBuffer.floorMultiplier[var12] += var46.hueMultiplier;
                     ++class91.field513[var12];
                  }
               }

               var14 = var11 - 5;
               if(var14 >= 0 && var14 < 104) {
                  var15 = class91.tileUnderlayIds[var2][var14][var12] & 255;
                  if(var15 > 0) {
                     var17 = var15 - 1;
                     FloorUnderlayDefinition var56 = (FloorUnderlayDefinition)FloorUnderlayDefinition.underlays.method635((long)var17);
                     FloorUnderlayDefinition var48;
                     if(var56 != null) {
                        var48 = var56;
                     } else {
                        byte[] var49 = FloorUnderlayDefinition.underlay_ref.method4115(1, var17, -1381486102);
                        var56 = new FloorUnderlayDefinition();
                        if(var49 != null) {
                           var56.method1893(new Packet(var49), var17);
                        }

                        var56.method1883();
                        FloorUnderlayDefinition.underlays.method628(var56, (long)var17);
                        var48 = var56;
                     }

                     class177.floorHues[var12] -= var48.hue;
                     class91.floorSaturations[var12] -= var48.saturation;
                     ChatCrownType.field3209[var12] -= var48.lightness;
                     ChatLineBuffer.floorMultiplier[var12] -= var48.hueMultiplier;
                     --class91.field513[var12];
                  }
               }
            }

            if(var11 >= 1 && var11 < 103) {
               var12 = 0;
               var13 = 0;
               var14 = 0;
               var15 = 0;
               var16 = 0;

               for(var17 = -5; var17 < 109; ++var17) {
                  var18 = var17 + 5;
                  if(var18 >= 0 && var18 < 104) {
                     var12 += class177.floorHues[var18];
                     var13 += class91.floorSaturations[var18];
                     var14 += ChatCrownType.field3209[var18];
                     var15 += ChatLineBuffer.floorMultiplier[var18];
                     var16 += class91.field513[var18];
                  }

                  var19 = var17 - 5;
                  if(var19 >= 0 && var19 < 104) {
                     var12 -= class177.floorHues[var19];
                     var13 -= class91.floorSaturations[var19];
                     var14 -= ChatCrownType.field3209[var19];
                     var15 -= ChatLineBuffer.floorMultiplier[var19];
                     var16 -= class91.field513[var19];
                  }

                  if(var17 >= 1 && var17 < 103 && (!client.lowMemory || (class91.tileSettings[0][var11][var17] & 2) != 0 || (class91.tileSettings[var2][var11][var17] & 16) == 0)) {
                     if(var2 < class91.field506) {
                        class91.field506 = var2;
                     }

                     var20 = class91.tileUnderlayIds[var2][var11][var17] & 255;
                     int var21 = class91.tileOverlayIds[var2][var11][var17] & 255;
                     if(var20 > 0 || var21 > 0) {
                        int var22 = class91.tileHeights[var2][var11][var17];
                        int var23 = class91.tileHeights[var2][var11 + 1][var17];
                        int var24 = class91.tileHeights[var2][var11 + 1][var17 + 1];
                        int var25 = class91.tileHeights[var2][var11][var17 + 1];
                        int var26 = class83.field1963[var11][var17];
                        int var27 = class83.field1963[var11 + 1][var17];
                        int var28 = class83.field1963[var11 + 1][var17 + 1];
                        int var29 = class83.field1963[var11][var17 + 1];
                        int var30 = -1;
                        int var31 = -1;
                        int var32;
                        int var33;
                        int var34;
                        if(var20 > 0) {
                           var32 = var12 * 256 / var15;
                           var33 = var13 / var16;
                           var34 = var14 / var16;
                           var30 = GrandExchangeEvent.method1562(var32, var33, var34);
                           var32 = var32 + class91.field514 & 255;
                           var34 += class91.field521;
                           if(var34 < 0) {
                              var34 = 0;
                           } else if(var34 > 255) {
                              var34 = 255;
                           }

                           var31 = GrandExchangeEvent.method1562(var32, var33, var34);
                        }

                        Overlay var35;
                        if(var2 > 0) {
                           boolean var54 = true;
                           if(var20 == 0 && class91.tileOverlayPath[var2][var11][var17] != 0) {
                              var54 = false;
                           }

                           if(var21 > 0) {
                              var34 = var21 - 1;
                              var35 = (Overlay)Overlay.overlays.method635((long)var34);
                              Overlay var50;
                              if(var35 != null) {
                                 var50 = var35;
                              } else {
                                 byte[] var52 = Overlay.overlay_ref.method4115(4, var34, -2125054885);
                                 var35 = new Overlay();
                                 if(var52 != null) {
                                    var35.method6389(new Packet(var52), var34);
                                 }

                                 var35.method6395();
                                 Overlay.overlays.method628(var35, (long)var34);
                                 var50 = var35;
                              }

                              if(!var50.isHidden) {
                                 var54 = false;
                              }
                           }

                           if(var54 && var23 == var22 && var24 == var22 && var22 == var25) {
                              InvType.field3314[var2][var11][var17] |= 2340;
                           }
                        }

                        var32 = 0;
                        if(var31 != -1) {
                           var32 = Graphics3D.colorPalette[class71.method1034(var31, 96)];
                        }

                        if(var21 == 0) {
                           var0.method3637(var2, var11, var17, 0, 0, -1, var22, var23, var24, var25, class71.method1034(var30, var26), class71.method1034(var30, var27), class71.method1034(var30, var28), class71.method1034(var30, var29), 0, 0, 0, 0, var32, 0);
                        } else {
                           var33 = class91.tileOverlayPath[var2][var11][var17] + 1;
                           byte var55 = class91.overlayRotations[var2][var11][var17];
                           int var36 = var21 - 1;
                           Overlay var37 = (Overlay)Overlay.overlays.method635((long)var36);
                           if(var37 != null) {
                              var35 = var37;
                           } else {
                              byte[] var51 = Overlay.overlay_ref.method4115(4, var36, 125758268);
                              var37 = new Overlay();
                              if(var51 != null) {
                                 var37.method6389(new Packet(var51), var36);
                              }

                              var37.method6395();
                              Overlay.overlays.method628(var37, (long)var36);
                              var35 = var37;
                           }

                           int var38 = var35.texture;
                           int var39;
                           int var40;
                           int var41;
                           int var42;
                           if(var38 >= 0) {
                              var40 = Graphics3D.textureLoader.vmethod1151(var38);
                              var39 = -1;
                           } else if(var35.color == 16711935) {
                              var39 = -2;
                              var38 = -1;
                              var40 = -2;
                           } else {
                              var39 = GrandExchangeEvent.method1562(var35.hue, var35.saturation, var35.lightness);
                              var41 = var35.hue + class91.field514 & 255;
                              var42 = var35.lightness + class91.field521;
                              if(var42 < 0) {
                                 var42 = 0;
                              } else if(var42 > 255) {
                                 var42 = 255;
                              }

                              var40 = GrandExchangeEvent.method1562(var41, var35.saturation, var42);
                           }

                           var41 = 0;
                           if(var40 != -2) {
                              var41 = Graphics3D.colorPalette[class192.method3816(var40, 96)];
                           }

                           if(var35.otherRgbColor != -1) {
                              var42 = var35.otherHue + class91.field514 & 255;
                              int var43 = var35.otherLightness + class91.field521;
                              if(var43 < 0) {
                                 var43 = 0;
                              } else if(var43 > 255) {
                                 var43 = 255;
                              }

                              var40 = GrandExchangeEvent.method1562(var42, var35.otherSaturation, var43);
                              var41 = Graphics3D.colorPalette[class192.method3816(var40, 96)];
                           }

                           var0.method3637(var2, var11, var17, var33, var55, var38, var22, var23, var24, var25, class71.method1034(var30, var26), class71.method1034(var30, var27), class71.method1034(var30, var28), class71.method1034(var30, var29), class192.method3816(var39, var26), class192.method3816(var39, var27), class192.method3816(var39, var28), class192.method3816(var39, var29), var32, var41);
                        }
                     }
                  }
               }
            }
         }

         for(var11 = 1; var11 < 103; ++var11) {
            for(var12 = 1; var12 < 103; ++var12) {
               var0.method3782(var2, var12, var11, class290.method5963(var2, var12, var11));
            }
         }

         class91.tileUnderlayIds[var2] = null;
         class91.tileOverlayIds[var2] = null;
         class91.tileOverlayPath[var2] = null;
         class91.overlayRotations[var2] = null;
         class91.field511[var2] = null;
      }

      var0.method3652(-50, -10, -50);

      for(var2 = 0; var2 < 104; ++var2) {
         for(var3 = 0; var3 < 104; ++var3) {
            if((class91.tileSettings[1][var2][var3] & 2) == 2) {
               var0.method3764(var2, var3);
            }
         }
      }

      var2 = 1;
      var3 = 2;
      var4 = 4;

      for(var5 = 0; var5 < 4; ++var5) {
         if(var5 > 0) {
            var2 <<= 3;
            var3 <<= 3;
            var4 <<= 3;
         }

         for(int var6 = 0; var6 <= var5; ++var6) {
            for(int var7 = 0; var7 <= 104; ++var7) {
               for(int var8 = 0; var8 <= 104; ++var8) {
                  short var53;
                  if((InvType.field3314[var6][var8][var7] & var2) != 0) {
                     var9 = var7;
                     var10 = var7;
                     var11 = var6;

                     for(var12 = var6; var9 > 0 && (InvType.field3314[var6][var8][var9 - 1] & var2) != 0; --var9) {
                        ;
                     }

                     while(var10 < 104 && (InvType.field3314[var6][var8][var10 + 1] & var2) != 0) {
                        ++var10;
                     }

                     label519:
                     while(var11 > 0) {
                        for(var13 = var9; var13 <= var10; ++var13) {
                           if((InvType.field3314[var11 - 1][var8][var13] & var2) == 0) {
                              break label519;
                           }
                        }

                        --var11;
                     }

                     label508:
                     while(var12 < var5) {
                        for(var13 = var9; var13 <= var10; ++var13) {
                           if((InvType.field3314[var12 + 1][var8][var13] & var2) == 0) {
                              break label508;
                           }
                        }

                        ++var12;
                     }

                     var13 = (var10 - var9 + 1) * (var12 + 1 - var11);
                     if(var13 >= 8) {
                        var53 = 240;
                        var15 = class91.tileHeights[var12][var8][var9] - var53;
                        var16 = class91.tileHeights[var11][var8][var9];
                        SceneManager.method3624(var5, 1, var8 * 128, var8 * 128, var9 * 128, var10 * 128 + 128, var15, var16);

                        for(var17 = var11; var17 <= var12; ++var17) {
                           for(var18 = var9; var18 <= var10; ++var18) {
                              InvType.field3314[var17][var8][var18] &= ~var2;
                           }
                        }
                     }
                  }

                  if((InvType.field3314[var6][var8][var7] & var3) != 0) {
                     var9 = var8;
                     var10 = var8;
                     var11 = var6;

                     for(var12 = var6; var9 > 0 && (InvType.field3314[var6][var9 - 1][var7] & var3) != 0; --var9) {
                        ;
                     }

                     while(var10 < 104 && (InvType.field3314[var6][var10 + 1][var7] & var3) != 0) {
                        ++var10;
                     }

                     label572:
                     while(var11 > 0) {
                        for(var13 = var9; var13 <= var10; ++var13) {
                           if((InvType.field3314[var11 - 1][var13][var7] & var3) == 0) {
                              break label572;
                           }
                        }

                        --var11;
                     }

                     label561:
                     while(var12 < var5) {
                        for(var13 = var9; var13 <= var10; ++var13) {
                           if((InvType.field3314[var12 + 1][var13][var7] & var3) == 0) {
                              break label561;
                           }
                        }

                        ++var12;
                     }

                     var13 = (var10 - var9 + 1) * (var12 + 1 - var11);
                     if(var13 >= 8) {
                        var53 = 240;
                        var15 = class91.tileHeights[var12][var9][var7] - var53;
                        var16 = class91.tileHeights[var11][var9][var7];
                        SceneManager.method3624(var5, 2, var9 * 128, var10 * 128 + 128, var7 * 128, var7 * 128, var15, var16);

                        for(var17 = var11; var17 <= var12; ++var17) {
                           for(var18 = var9; var18 <= var10; ++var18) {
                              InvType.field3314[var17][var18][var7] &= ~var3;
                           }
                        }
                     }
                  }

                  if((InvType.field3314[var6][var8][var7] & var4) != 0) {
                     var9 = var8;
                     var10 = var8;
                     var11 = var7;

                     for(var12 = var7; var11 > 0 && (InvType.field3314[var6][var8][var11 - 1] & var4) != 0; --var11) {
                        ;
                     }

                     while(var12 < 104 && (InvType.field3314[var6][var8][var12 + 1] & var4) != 0) {
                        ++var12;
                     }

                     label625:
                     while(var9 > 0) {
                        for(var13 = var11; var13 <= var12; ++var13) {
                           if((InvType.field3314[var6][var9 - 1][var13] & var4) == 0) {
                              break label625;
                           }
                        }

                        --var9;
                     }

                     label614:
                     while(var10 < 104) {
                        for(var13 = var11; var13 <= var12; ++var13) {
                           if((InvType.field3314[var6][var10 + 1][var13] & var4) == 0) {
                              break label614;
                           }
                        }

                        ++var10;
                     }

                     if((var12 - var11 + 1) * (var10 - var9 + 1) >= 4) {
                        var13 = class91.tileHeights[var6][var9][var11];
                        SceneManager.method3624(var5, 4, var9 * 128, var10 * 128 + 128, var11 * 128, var12 * 128 + 128, var13, var13);

                        for(var14 = var9; var14 <= var10; ++var14) {
                           for(var15 = var11; var15 <= var12; ++var15) {
                              InvType.field3314[var6][var14][var15] &= ~var4;
                           }
                        }
                     }
                  }
               }
            }
         }
      }

   }

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      signature = "(Lbu;B)V",
      garbageValue = "-54"
   )
   static void setWorldInfo(World var0) {
      if(var0.method4949() != client.isMembers) {
         client.isMembers = var0.method4949();
         boolean var1 = var0.method4949();
         if(var1 != ObjType.isMembersWorld) {
            ParamType.method623();
            ObjType.isMembersWorld = var1;
         }
      }

      class135.host = var0.address;
      client.world = var0.id;
      client.flags = var0.mask;
      class323.port1 = client.socketType == 0?43594:var0.id + 40000;
      class54.port2 = client.socketType == 0?443:var0.id + 50000;
      GameSocket.myWorldPort = class323.port1;
   }
}
