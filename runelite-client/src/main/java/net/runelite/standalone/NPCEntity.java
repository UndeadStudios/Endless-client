package net.runelite.standalone;

import java.awt.Polygon;
import net.runelite.api.NPCComposition;
import net.runelite.api.Perspective;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.events.NpcDespawned;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.api.RSModel;
import net.runelite.rs.api.RSNPC;
import net.runelite.rs.api.RSNPCComposition;

@ObfuscatedName("cm")
public final class NPCEntity extends PathingEntity implements RSNPC {
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = 449731073
   )
   static int field1103;
   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "Ljg;"
   )
   NPCType type;
   public int npcIndex;
   public boolean dead;

   NPCEntity() {
      this.rl$$init();
   }

   @ObfuscatedName("r")
   @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "1474294283"
   )
   final boolean vmethod6005() {
      return this.type != null;
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "(I)Ldv;"
   )
   protected final Model vmethod6001(int var1) {
      if(ItemContainer.clientInstance.isInterpolateNpcAnimations() && this.getAnimation() != 6566) {
         int var2 = this.getActionFrame();
         int var3 = this.getPoseFrame();
         int var4 = this.getSpotAnimFrame();

         Model var5;
         try {
            this.setActionFrame(Integer.MIN_VALUE | this.getActionFrameCycle() << 16 | var2);
            this.setPoseFrame(Integer.MIN_VALUE | this.getPoseFrameCycle() << 16 | var3);
            this.setSpotAnimFrame(Integer.MIN_VALUE | this.getSpotAnimFrameCycle() << 16 | var4);
            var5 = this.copy$getModel(var1);
         } finally {
            this.setActionFrame(var2);
            this.setPoseFrame(var3);
            this.setSpotAnimFrame(var4);
         }

         return (Model)var5;
      } else {
         return (Model)this.copy$getModel(var1);
      }
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "(IBI)V",
      garbageValue = "-378421331"
   )
   final void method1821(int var1, byte var2) {
      int var3 = super.pathX[0];
      int var4 = super.pathY[0];
      if(var1 == 0) {
         --var3;
         ++var4;
      }

      if(var1 == 1) {
         ++var4;
      }

      if(var1 == 2) {
         ++var3;
         ++var4;
      }

      if(var1 == 3) {
         --var3;
      }

      if(var1 == 4) {
         ++var3;
      }

      if(var1 == 5) {
         --var3;
         --var4;
      }

      if(var1 == 6) {
         --var4;
      }

      if(var1 == 7) {
         ++var3;
         --var4;
      }

      if(super.animation != -1 && AuthProt.method6374(super.animation).priority == 1) {
         super.animation = -1;
         this.animationChanged(-1);
      }

      if(super.queueSize < 9) {
         ++super.queueSize;
      }

      for(int var5 = super.queueSize; var5 > 0; --var5) {
         super.pathX[var5] = super.pathX[var5 - 1];
         super.pathY[var5] = super.pathY[var5 - 1];
         super.pathTraversed[var5] = super.pathTraversed[var5 - 1];
      }

      super.pathX[0] = var3;
      super.pathY[0] = var4;
      super.pathTraversed[0] = var2;
   }

   public RSNPCComposition getComposition() {
      return this.type;
   }

   private void rl$$init() {
   }

   @ObfuscatedSignature(
      signature = "(I)Ldv;"
   )
   public final Model copy$getModel(int var1) {
      if(this.type == null) {
         return null;
      } else {
         Sequence var2 = super.animation != -1 && super.actionAnimationDisable == 0?AuthProt.method6374(super.animation):null;
         Sequence var3 = super.poseAnimation != -1 && (super.poseAnimation != super.idlePoseAnimation || var2 == null)?AuthProt.method6374(super.poseAnimation):null;
         Model var4 = this.type.method4811(var2, super.actionFrame, var3, super.poseFrame);
         if(var4 == null) {
            return null;
         } else {
            var4.method3833();
            super.logicalHeight = var4.modelHeight;
            if(super.graphic != -1 && super.spotAnimFrame != -1) {
               Model var5 = SoundTask.method6414(super.graphic).method358(super.spotAnimFrame);
               if(var5 != null) {
                  var5.method3889(0, -super.field992, 0);
                  Model[] var6 = new Model[]{var4, var5};
                  var4 = new Model(var6, 2);
               }
            }

            if(this.type.size == 1) {
               var4.field1696 = true;
            }

            return var4;
         }
      }
   }

   public void onCompositionChanged(RSNPCComposition var1) {
      if(var1 == null) {
         ItemContainer.clientInstance.getCallbacks().post(new NpcDespawned(this));
      }

   }

   public int getId() {
      RSNPCComposition var1 = this.getComposition();
      if(var1 != null && var1.getConfigs() != null) {
         var1 = var1.transform();
      }

      return var1 == null?-1:var1.getId();
   }

   public String getName() {
      RSNPCComposition var1 = this.getComposition();
      if(var1 != null && var1.getConfigs() != null) {
         var1 = var1.transform();
      }

      return var1 == null?null:var1.getName().replace(' ', ' ');
   }

   public int getCombatLevel() {
      RSNPCComposition var1 = this.getComposition();
      if(var1 != null && var1.getConfigs() != null) {
         var1 = var1.transform();
      }

      return var1 == null?-1:var1.getCombatLevel();
   }

   public int getIndex() {
      return this.npcIndex;
   }

   public void setIndex(int var1) {
      this.npcIndex = var1;
   }

   public NPCComposition getTransformedComposition() {
      RSNPCComposition var1 = this.getComposition();
      if(var1 != null && var1.getConfigs() != null) {
         var1 = var1.transform();
      }

      return var1;
   }

   public boolean isDead() {
      return this.dead;
   }

   public void setDead(boolean var1) {
      this.dead = var1;
   }

   public Polygon getConvexHull() {
      RSModel var1 = this.getModel();
      if(var1 == null) {
         return null;
      } else {
         int var2 = this.getComposition().getSize();
         LocalPoint var3 = new LocalPoint(var2 * 64 - 64 + this.getX(), var2 * 64 - 64 + this.getY());
         int var4 = Perspective.getTileHeight(ItemContainer.clientInstance, var3, ItemContainer.clientInstance.getPlane());
         return var1.getConvexHull(this.getX(), this.getY(), this.getOrientation(), var4);
      }
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(IIZI)V",
      garbageValue = "1378146881"
   )
   final void method1822(int var1, int var2, boolean var3) {
      if(super.animation != -1 && AuthProt.method6374(super.animation).priority == 1) {
         super.animation = -1;
         this.animationChanged(-1);
      }

      if(!var3) {
         int var4 = var1 - super.pathX[0];
         int var5 = var2 - super.pathY[0];
         if(var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
            if(super.queueSize < 9) {
               ++super.queueSize;
            }

            for(int var6 = super.queueSize; var6 > 0; --var6) {
               super.pathX[var6] = super.pathX[var6 - 1];
               super.pathY[var6] = super.pathY[var6 - 1];
               super.pathTraversed[var6] = super.pathTraversed[var6 - 1];
            }

            super.pathX[0] = var1;
            super.pathY[0] = var2;
            super.pathTraversed[0] = 1;
            return;
         }
      }

      super.queueSize = 0;
      super.field950 = 0;
      super.field997 = 0;
      super.pathX[0] = var1;
      super.pathY[0] = var2;
      super.x = super.size * -1198748480 + super.pathX[0] * 1897470336;
      super.y = super.size * 64 + super.pathY[0] * 128;
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "(III)I",
      garbageValue = "-474717136"
   )
   public static int method1834(int var0, int var1) {
      return (var0 << 8) + var1;
   }

   @ObfuscatedName("hd")
   @ObfuscatedSignature(
      signature = "(IIIIIIII)V",
      garbageValue = "-1999959678"
   )
   static final void method1833(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      if(var2 >= 1 && var3 >= 1 && var2 <= 102 && var3 <= 102) {
         if(client.lowMemory && var0 != ServerProt.level) {
            return;
         }

         long var7 = 0L;
         boolean var9 = true;
         boolean var10 = false;
         boolean var11 = false;
         if(var1 == 0) {
            var7 = class312.sceneManager.method3720(var0, var2, var3);
         }

         if(var1 == 1) {
            var7 = class312.sceneManager.method3648(var0, var2, var3);
         }

         if(var1 == 2) {
            var7 = class312.sceneManager.method3649(var0, var2, var3);
         }

         if(var1 == 3) {
            var7 = class312.sceneManager.method3713(var0, var2, var3);
         }

         int var12;
         if(0L != var7) {
            var12 = class312.sceneManager.method3651(var0, var2, var3, var7);
            int var39 = Resampler.method143(var7);
            int var40 = var12 & 31;
            int var41 = var12 >> 6 & 3;
            LocType var13;
            if(var1 == 0) {
               class312.sceneManager.method3638(var0, var2, var3);
               var13 = GrandExchangeOffer.method1736(var39);
               if(var13.clipType != 0) {
                  client.collisionMaps[var0].method3589(var2, var3, var40, var41, var13.blocksProjectile);
               }
            }

            if(var1 == 1) {
               class312.sceneManager.method3694(var0, var2, var3);
            }

            if(var1 == 2) {
               class312.sceneManager.method3640(var0, var2, var3);
               var13 = GrandExchangeOffer.method1736(var39);
               if(var2 + var13.width > 103 || var3 + var13.width > 103 || var2 + var13.length > 103 || var3 + var13.length > 103) {
                  return;
               }

               if(var13.clipType != 0) {
                  client.collisionMaps[var0].method3603(var2, var3, var13.width, var13.length, var41, var13.blocksProjectile);
               }
            }

            if(var1 == 3) {
               class312.sceneManager.method3794(var0, var2, var3);
               var13 = GrandExchangeOffer.method1736(var39);
               if(var13.clipType == 1) {
                  client.collisionMaps[var0].method3592(var2, var3);
               }
            }
         }

         if(var4 >= 0) {
            var12 = var0;
            if(var0 < 3 && (class91.tileSettings[1][var2][var3] & 2) == 2) {
               var12 = var0 + 1;
            }

            SceneManager var42 = class312.sceneManager;
            CollisionData var14 = client.collisionMaps[var0];
            LocType var15 = GrandExchangeOffer.method1736(var4);
            int var16;
            int var17;
            if(var5 != 1 && var5 != 3) {
               var16 = var15.width;
               var17 = var15.length;
            } else {
               var16 = var15.length;
               var17 = var15.width;
            }

            int var18;
            int var19;
            if(var16 + var2 <= 104) {
               var18 = (var16 >> 1) + var2;
               var19 = var2 + (var16 + 1 >> 1);
            } else {
               var18 = var2;
               var19 = var2 + 1;
            }

            int var20;
            int var21;
            if(var3 + var17 <= 104) {
               var20 = var3 + (var17 >> 1);
               var21 = var3 + (var17 + 1 >> 1);
            } else {
               var20 = var3;
               var21 = var3 + 1;
            }

            int[][] var22 = class91.tileHeights[var12];
            int var23 = var22[var18][var21] + var22[var18][var20] + var22[var19][var20] + var22[var19][var21] >> 2;
            int var24 = (var2 << 7) + (var16 << 6);
            int var25 = (var3 << 7) + (var17 << 6);
            long var26 = ChatHistory.method6263(var2, var3, 2, var15.field3471 == 0, var4);
            int var28 = (var5 << 6) + var6;
            if(var15.supportItems == 1) {
               var28 += 256;
            }

            Object var29;
            if(var6 == 22) {
               if(var15.animationId == -1 && var15.multiLocs == null) {
                  var29 = var15.method388(22, var5, var22, var24, var23, var25);
               } else {
                  var29 = new Location(var4, 22, var5, var12, var2, var3, var15.animationId, true, (Entity)null);
               }

               var42.method3627(var0, var2, var3, var23, (Entity)var29, var26, var28);
               if(var15.clipType == 1) {
                  var14.method3597(var2, var3);
               }
            } else if(var6 != 10 && var6 != 11) {
               if(var6 >= 12) {
                  if(var15.animationId == -1 && var15.multiLocs == null) {
                     var29 = var15.method388(var6, var5, var22, var24, var23, var25);
                  } else {
                     var29 = new Location(var4, var6, var5, var12, var2, var3, var15.animationId, true, (Entity)null);
                  }

                  var42.method3631(var0, var2, var3, var23, 1, 1, (Entity)var29, 0, var26, var28);
                  if(var15.clipType != 0) {
                     var14.method3586(var2, var3, var16, var17, var15.blocksProjectile);
                  }
               } else if(var6 == 0) {
                  if(var15.animationId == -1 && var15.multiLocs == null) {
                     var29 = var15.method388(0, var5, var22, var24, var23, var25);
                  } else {
                     var29 = new Location(var4, 0, var5, var12, var2, var3, var15.animationId, true, (Entity)null);
                  }

                  var42.method3629(var0, var2, var3, var23, (Entity)var29, (Entity)null, class91.field515[var5], 0, var26, var28);
                  if(var15.clipType != 0) {
                     var14.method3598(var2, var3, var6, var5, var15.blocksProjectile);
                  }
               } else if(var6 == 1) {
                  if(var15.animationId == -1 && var15.multiLocs == null) {
                     var29 = var15.method388(1, var5, var22, var24, var23, var25);
                  } else {
                     var29 = new Location(var4, 1, var5, var12, var2, var3, var15.animationId, true, (Entity)null);
                  }

                  var42.method3629(var0, var2, var3, var23, (Entity)var29, (Entity)null, class91.field518[var5], 0, var26, var28);
                  if(var15.clipType != 0) {
                     var14.method3598(var2, var3, var6, var5, var15.blocksProjectile);
                  }
               } else {
                  int var35;
                  if(var6 == 2) {
                     var35 = var5 + 1 & 3;
                     Object var30;
                     Object var31;
                     if(var15.animationId == -1 && var15.multiLocs == null) {
                        var30 = var15.method388(2, var5 + 4, var22, var24, var23, var25);
                        var31 = var15.method388(2, var35, var22, var24, var23, var25);
                     } else {
                        var30 = new Location(var4, 2, var5 + 4, var12, var2, var3, var15.animationId, true, (Entity)null);
                        var31 = new Location(var4, 2, var35, var12, var2, var3, var15.animationId, true, (Entity)null);
                     }

                     var42.method3629(var0, var2, var3, var23, (Entity)var30, (Entity)var31, class91.field515[var5], class91.field515[var35], var26, var28);
                     if(var15.clipType != 0) {
                        var14.method3598(var2, var3, var6, var5, var15.blocksProjectile);
                     }
                  } else if(var6 == 3) {
                     if(var15.animationId == -1 && var15.multiLocs == null) {
                        var29 = var15.method388(3, var5, var22, var24, var23, var25);
                     } else {
                        var29 = new Location(var4, 3, var5, var12, var2, var3, var15.animationId, true, (Entity)null);
                     }

                     var42.method3629(var0, var2, var3, var23, (Entity)var29, (Entity)null, class91.field518[var5], 0, var26, var28);
                     if(var15.clipType != 0) {
                        var14.method3598(var2, var3, var6, var5, var15.blocksProjectile);
                     }
                  } else if(var6 == 9) {
                     if(var15.animationId == -1 && var15.multiLocs == null) {
                        var29 = var15.method388(var6, var5, var22, var24, var23, var25);
                     } else {
                        var29 = new Location(var4, var6, var5, var12, var2, var3, var15.animationId, true, (Entity)null);
                     }

                     var42.method3631(var0, var2, var3, var23, 1, 1, (Entity)var29, 0, var26, var28);
                     if(var15.clipType != 0) {
                        var14.method3586(var2, var3, var16, var17, var15.blocksProjectile);
                     }
                  } else if(var6 == 4) {
                     if(var15.animationId == -1 && var15.multiLocs == null) {
                        var29 = var15.method388(4, var5, var22, var24, var23, var25);
                     } else {
                        var29 = new Location(var4, 4, var5, var12, var2, var3, var15.animationId, true, (Entity)null);
                     }

                     var42.method3630(var0, var2, var3, var23, (Entity)var29, (Entity)null, class91.field515[var5], 0, 0, 0, var26, var28);
                  } else {
                     Object var32;
                     long var36;
                     if(var6 == 5) {
                        var35 = 16;
                        var36 = var42.method3720(var0, var2, var3);
                        if(0L != var36) {
                           var35 = GrandExchangeOffer.method1736(Resampler.method143(var36)).decorDisplacement;
                        }

                        if(var15.animationId == -1 && var15.multiLocs == null) {
                           var32 = var15.method388(4, var5, var22, var24, var23, var25);
                        } else {
                           var32 = new Location(var4, 4, var5, var12, var2, var3, var15.animationId, true, (Entity)null);
                        }

                        var42.method3630(var0, var2, var3, var23, (Entity)var32, (Entity)null, class91.field515[var5], 0, var35 * class91.field516[var5], var35 * class91.field519[var5], var26, var28);
                     } else if(var6 == 6) {
                        var35 = 8;
                        var36 = var42.method3720(var0, var2, var3);
                        if(var36 != 0L) {
                           var35 = GrandExchangeOffer.method1736(Resampler.method143(var36)).decorDisplacement / 2;
                        }

                        if(var15.animationId == -1 && var15.multiLocs == null) {
                           var32 = var15.method388(4, var5 + 4, var22, var24, var23, var25);
                        } else {
                           var32 = new Location(var4, 4, var5 + 4, var12, var2, var3, var15.animationId, true, (Entity)null);
                        }

                        var42.method3630(var0, var2, var3, var23, (Entity)var32, (Entity)null, 256, var5, var35 * class91.field520[var5], var35 * class91.field510[var5], var26, var28);
                     } else if(var6 == 7) {
                        int var38 = var5 + 2 & 3;
                        if(var15.animationId == -1 && var15.multiLocs == null) {
                           var29 = var15.method388(4, var38 + 4, var22, var24, var23, var25);
                        } else {
                           var29 = new Location(var4, 4, var38 + 4, var12, var2, var3, var15.animationId, true, (Entity)null);
                        }

                        var42.method3630(var0, var2, var3, var23, (Entity)var29, (Entity)null, 256, var38, 0, 0, var26, var28);
                     } else if(var6 == 8) {
                        var35 = 8;
                        var36 = var42.method3720(var0, var2, var3);
                        if(var36 != 0L) {
                           var35 = GrandExchangeOffer.method1736(Resampler.method143(var36)).decorDisplacement / 2;
                        }

                        int var34 = var5 + 2 & 3;
                        Object var33;
                        if(var15.animationId == -1 && var15.multiLocs == null) {
                           var32 = var15.method388(4, var5 + 4, var22, var24, var23, var25);
                           var33 = var15.method388(4, var34 + 4, var22, var24, var23, var25);
                        } else {
                           var32 = new Location(var4, 4, var5 + 4, var12, var2, var3, var15.animationId, true, (Entity)null);
                           var33 = new Location(var4, 4, var34 + 4, var12, var2, var3, var15.animationId, true, (Entity)null);
                        }

                        var42.method3630(var0, var2, var3, var23, (Entity)var32, (Entity)var33, 256, var5, var35 * class91.field520[var5], var35 * class91.field510[var5], var26, var28);
                     }
                  }
               }
            } else {
               if(var15.animationId == -1 && var15.multiLocs == null) {
                  var29 = var15.method388(10, var5, var22, var24, var23, var25);
               } else {
                  var29 = new Location(var4, 10, var5, var12, var2, var3, var15.animationId, true, (Entity)null);
               }

               if(var29 != null) {
                  var42.method3631(var0, var2, var3, var23, var16, var17, (Entity)var29, var6 == 11?256:0, var26, var28);
               }

               if(var15.clipType != 0) {
                  var14.method3586(var2, var3, var16, var17, var15.blocksProjectile);
               }
            }
         }
      }

   }
}
