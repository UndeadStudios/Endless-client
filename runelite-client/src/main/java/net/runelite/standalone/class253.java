package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kg")
public class class253 extends class26 {
   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "Lkx;"
   )
   public Name field3741;
   @ObfuscatedName("h")
   public short field3742;
   @ObfuscatedName("g")
   @ObfuscatedGetter(
      intValue = -1833392209
   )
   public int field3743;

   @ObfuscatedSignature(
      signature = "(Lkx;I)V"
   )
   class253(Name var1, int var2) {
      this.field3743 = (int)(class318.method6317() / 1000L);
      this.field3741 = var1;
      this.field3742 = (short)var2;
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "(IIIIIILen;Lfk;I)V",
      garbageValue = "1648545588"
   )
   static final void method4728(int var0, int var1, int var2, int var3, int var4, int var5, SceneManager var6, CollisionData var7) {
      if(!client.lowMemory || (class91.tileSettings[0][var1][var2] & 2) != 0 || (class91.tileSettings[var0][var1][var2] & 16) == 0) {
         if(var0 < class91.field506) {
            class91.field506 = var0;
         }

         LocType var8 = GrandExchangeOffer.method1736(var3);
         int var9;
         int var10;
         if(var4 != 1 && var4 != 3) {
            var9 = var8.width;
            var10 = var8.length;
         } else {
            var9 = var8.length;
            var10 = var8.width;
         }

         int var11;
         int var12;
         if(var9 + var1 <= 104) {
            var11 = (var9 >> 1) + var1;
            var12 = (var9 + 1 >> 1) + var1;
         } else {
            var11 = var1;
            var12 = var1 + 1;
         }

         int var13;
         int var14;
         if(var10 + var2 <= 104) {
            var13 = (var10 >> 1) + var2;
            var14 = var2 + (var10 + 1 >> 1);
         } else {
            var13 = var2;
            var14 = var2 + 1;
         }

         int[][] var15 = class91.tileHeights[var0];
         int var16 = var15[var12][var14] + var15[var11][var14] + var15[var11][var13] + var15[var12][var13] >> 2;
         int var17 = (var1 << 7) + (var9 << 6);
         int var18 = (var2 << 7) + (var10 << 6);
         long var19 = ChatHistory.method6263(var1, var2, 2, var8.field3471 == 0, var3);
         int var21 = var5 + (var4 << 6);
         if(var8.supportItems == 1) {
            var21 += 256;
         }

         if(var8.method410()) {
            class3.method52(var0, var1, var2, var8, var4);
         }

         Object var22;
         if(var5 == 22) {
            if(!client.lowMemory || var8.field3471 != 0 || var8.clipType == 1 || var8.obstructsGround) {
               if(var8.animationId == -1 && var8.multiLocs == null) {
                  var22 = var8.method387(22, var4, var15, var17, var16, var18);
               } else {
                  var22 = new Location(var3, 22, var4, var0, var1, var2, var8.animationId, true, (Entity)null);
               }

               var6.method3627(var0, var1, var2, var16, (Entity)var22, var19, var21);
               if(var8.clipType == 1 && var7 != null) {
                  var7.method3597(var1, var2);
               }

            }
         } else {
            int var23;
            if(var5 != 10 && var5 != 11) {
               if(var5 >= 12) {
                  if(var8.animationId == -1 && var8.multiLocs == null) {
                     var22 = var8.method387(var5, var4, var15, var17, var16, var18);
                  } else {
                     var22 = new Location(var3, var5, var4, var0, var1, var2, var8.animationId, true, (Entity)null);
                  }

                  var6.method3631(var0, var1, var2, var16, 1, 1, (Entity)var22, 0, var19, var21);
                  if(var5 >= 12 && var5 <= 17 && var5 != 13 && var0 > 0) {
                     InvType.field3314[var0][var1][var2] |= 2340;
                  }

                  if(var8.clipType != 0 && var7 != null) {
                     var7.method3586(var1, var2, var9, var10, var8.blocksProjectile);
                  }

               } else if(var5 == 0) {
                  if(var8.animationId == -1 && var8.multiLocs == null) {
                     var22 = var8.method387(0, var4, var15, var17, var16, var18);
                  } else {
                     var22 = new Location(var3, 0, var4, var0, var1, var2, var8.animationId, true, (Entity)null);
                  }

                  var6.method3629(var0, var1, var2, var16, (Entity)var22, (Entity)null, class91.field515[var4], 0, var19, var21);
                  if(var4 == 0) {
                     if(var8.clipped) {
                        class91.field511[var0][var1][var2] = 50;
                        class91.field511[var0][var1][var2 + 1] = 50;
                     }

                     if(var8.modelClipped) {
                        InvType.field3314[var0][var1][var2] |= 585;
                     }
                  } else if(var4 == 1) {
                     if(var8.clipped) {
                        class91.field511[var0][var1][var2 + 1] = 50;
                        class91.field511[var0][var1 + 1][var2 + 1] = 50;
                     }

                     if(var8.modelClipped) {
                        InvType.field3314[var0][var1][var2 + 1] |= 1170;
                     }
                  } else if(var4 == 2) {
                     if(var8.clipped) {
                        class91.field511[var0][var1 + 1][var2] = 50;
                        class91.field511[var0][var1 + 1][var2 + 1] = 50;
                     }

                     if(var8.modelClipped) {
                        InvType.field3314[var0][var1 + 1][var2] |= 585;
                     }
                  } else if(var4 == 3) {
                     if(var8.clipped) {
                        class91.field511[var0][var1][var2] = 50;
                        class91.field511[var0][var1 + 1][var2] = 50;
                     }

                     if(var8.modelClipped) {
                        InvType.field3314[var0][var1][var2] |= 1170;
                     }
                  }

                  if(var8.clipType != 0 && var7 != null) {
                     var7.method3598(var1, var2, var5, var4, var8.blocksProjectile);
                  }

                  if(var8.decorDisplacement != 16) {
                     var6.method3797(var0, var1, var2, var8.decorDisplacement);
                  }

               } else if(var5 == 1) {
                  if(var8.animationId == -1 && var8.multiLocs == null) {
                     var22 = var8.method387(1, var4, var15, var17, var16, var18);
                  } else {
                     var22 = new Location(var3, 1, var4, var0, var1, var2, var8.animationId, true, (Entity)null);
                  }

                  var6.method3629(var0, var1, var2, var16, (Entity)var22, (Entity)null, class91.field518[var4], 0, var19, var21);
                  if(var8.clipped) {
                     if(var4 == 0) {
                        class91.field511[var0][var1][var2 + 1] = 50;
                     } else if(var4 == 1) {
                        class91.field511[var0][var1 + 1][var2 + 1] = 50;
                     } else if(var4 == 2) {
                        class91.field511[var0][var1 + 1][var2] = 50;
                     } else if(var4 == 3) {
                        class91.field511[var0][var1][var2] = 50;
                     }
                  }

                  if(var8.clipType != 0 && var7 != null) {
                     var7.method3598(var1, var2, var5, var4, var8.blocksProjectile);
                  }

               } else {
                  int var28;
                  if(var5 == 2) {
                     var28 = var4 + 1 & 3;
                     Object var29;
                     Object var30;
                     if(var8.animationId == -1 && var8.multiLocs == null) {
                        var29 = var8.method387(2, var4 + 4, var15, var17, var16, var18);
                        var30 = var8.method387(2, var28, var15, var17, var16, var18);
                     } else {
                        var29 = new Location(var3, 2, var4 + 4, var0, var1, var2, var8.animationId, true, (Entity)null);
                        var30 = new Location(var3, 2, var28, var0, var1, var2, var8.animationId, true, (Entity)null);
                     }

                     var6.method3629(var0, var1, var2, var16, (Entity)var29, (Entity)var30, class91.field515[var4], class91.field515[var28], var19, var21);
                     if(var8.modelClipped) {
                        if(var4 == 0) {
                           InvType.field3314[var0][var1][var2] |= 585;
                           InvType.field3314[var0][var1][var2 + 1] |= 1170;
                        } else if(var4 == 1) {
                           InvType.field3314[var0][var1][1 + var2] |= 1170;
                           InvType.field3314[var0][var1 + 1][var2] |= 585;
                        } else if(var4 == 2) {
                           InvType.field3314[var0][var1 + 1][var2] |= 585;
                           InvType.field3314[var0][var1][var2] |= 1170;
                        } else if(var4 == 3) {
                           InvType.field3314[var0][var1][var2] |= 1170;
                           InvType.field3314[var0][var1][var2] |= 585;
                        }
                     }

                     if(var8.clipType != 0 && var7 != null) {
                        var7.method3598(var1, var2, var5, var4, var8.blocksProjectile);
                     }

                     if(var8.decorDisplacement != 16) {
                        var6.method3797(var0, var1, var2, var8.decorDisplacement);
                     }

                  } else if(var5 == 3) {
                     if(var8.animationId == -1 && var8.multiLocs == null) {
                        var22 = var8.method387(3, var4, var15, var17, var16, var18);
                     } else {
                        var22 = new Location(var3, 3, var4, var0, var1, var2, var8.animationId, true, (Entity)null);
                     }

                     var6.method3629(var0, var1, var2, var16, (Entity)var22, (Entity)null, class91.field518[var4], 0, var19, var21);
                     if(var8.clipped) {
                        if(var4 == 0) {
                           class91.field511[var0][var1][var2 + 1] = 50;
                        } else if(var4 == 1) {
                           class91.field511[var0][var1 + 1][var2 + 1] = 50;
                        } else if(var4 == 2) {
                           class91.field511[var0][var1 + 1][var2] = 50;
                        } else if(var4 == 3) {
                           class91.field511[var0][var1][var2] = 50;
                        }
                     }

                     if(var8.clipType != 0 && var7 != null) {
                        var7.method3598(var1, var2, var5, var4, var8.blocksProjectile);
                     }

                  } else if(var5 == 9) {
                     if(var8.animationId == -1 && var8.multiLocs == null) {
                        var22 = var8.method387(var5, var4, var15, var17, var16, var18);
                     } else {
                        var22 = new Location(var3, var5, var4, var0, var1, var2, var8.animationId, true, (Entity)null);
                     }

                     var6.method3631(var0, var1, var2, var16, 1, 1, (Entity)var22, 0, var19, var21);
                     if(var8.clipType != 0 && var7 != null) {
                        var7.method3586(var1, var2, var9, var10, var8.blocksProjectile);
                     }

                     if(var8.decorDisplacement != 16) {
                        var6.method3797(var0, var1, var2, var8.decorDisplacement);
                     }

                  } else if(var5 == 4) {
                     if(var8.animationId == -1 && var8.multiLocs == null) {
                        var22 = var8.method387(4, var4, var15, var17, var16, var18);
                     } else {
                        var22 = new Location(var3, 4, var4, var0, var1, var2, var8.animationId, true, (Entity)null);
                     }

                     var6.method3630(var0, var1, var2, var16, (Entity)var22, (Entity)null, class91.field515[var4], 0, 0, 0, var19, var21);
                  } else {
                     long var31;
                     Object var33;
                     if(var5 == 5) {
                        var28 = 16;
                        var31 = var6.method3720(var0, var1, var2);
                        if(var31 != 0L) {
                           var28 = GrandExchangeOffer.method1736(Resampler.method143(var31)).decorDisplacement;
                        }

                        if(var8.animationId == -1 && var8.multiLocs == null) {
                           var33 = var8.method387(4, var4, var15, var17, var16, var18);
                        } else {
                           var33 = new Location(var3, 4, var4, var0, var1, var2, var8.animationId, true, (Entity)null);
                        }

                        var6.method3630(var0, var1, var2, var16, (Entity)var33, (Entity)null, class91.field515[var4], 0, var28 * class91.field516[var4], var28 * class91.field519[var4], var19, var21);
                     } else if(var5 == 6) {
                        var28 = 8;
                        var31 = var6.method3720(var0, var1, var2);
                        if(0L != var31) {
                           var28 = GrandExchangeOffer.method1736(Resampler.method143(var31)).decorDisplacement / 2;
                        }

                        if(var8.animationId == -1 && var8.multiLocs == null) {
                           var33 = var8.method387(4, var4 + 4, var15, var17, var16, var18);
                        } else {
                           var33 = new Location(var3, 4, var4 + 4, var0, var1, var2, var8.animationId, true, (Entity)null);
                        }

                        var6.method3630(var0, var1, var2, var16, (Entity)var33, (Entity)null, 256, var4, var28 * class91.field520[var4], var28 * class91.field510[var4], var19, var21);
                     } else if(var5 == 7) {
                        var23 = var4 + 2 & 3;
                        if(var8.animationId == -1 && var8.multiLocs == null) {
                           var22 = var8.method387(4, var23 + 4, var15, var17, var16, var18);
                        } else {
                           var22 = new Location(var3, 4, var23 + 4, var0, var1, var2, var8.animationId, true, (Entity)null);
                        }

                        var6.method3630(var0, var1, var2, var16, (Entity)var22, (Entity)null, 256, var23, 0, 0, var19, var21);
                     } else if(var5 == 8) {
                        var28 = 8;
                        var31 = var6.method3720(var0, var1, var2);
                        if(var31 != 0L) {
                           var28 = GrandExchangeOffer.method1736(Resampler.method143(var31)).decorDisplacement / 2;
                        }

                        int var27 = var4 + 2 & 3;
                        Object var26;
                        if(var8.animationId == -1 && var8.multiLocs == null) {
                           var33 = var8.method387(4, var4 + 4, var15, var17, var16, var18);
                           var26 = var8.method387(4, var27 + 4, var15, var17, var16, var18);
                        } else {
                           var33 = new Location(var3, 4, var4 + 4, var0, var1, var2, var8.animationId, true, (Entity)null);
                           var26 = new Location(var3, 4, var27 + 4, var0, var1, var2, var8.animationId, true, (Entity)null);
                        }

                        var6.method3630(var0, var1, var2, var16, (Entity)var33, (Entity)var26, 256, var4, var28 * class91.field520[var4], var28 * class91.field510[var4], var19, var21);
                     }
                  }
               }
            } else {
               if(var8.animationId == -1 && var8.multiLocs == null) {
                  var22 = var8.method387(10, var4, var15, var17, var16, var18);
               } else {
                  var22 = new Location(var3, 10, var4, var0, var1, var2, var8.animationId, true, (Entity)null);
               }

               if(var22 != null && var6.method3631(var0, var1, var2, var16, var9, var10, (Entity)var22, var5 == 11?256:0, var19, var21) && var8.clipped) {
                  var23 = 15;
                  if(var22 instanceof Model) {
                     var23 = ((Model)var22).method3867() / 4;
                     if(var23 > 30) {
                        var23 = 30;
                     }
                  }

                  for(int var24 = 0; var24 <= var9; ++var24) {
                     for(int var25 = 0; var25 <= var10; ++var25) {
                        if(var23 > class91.field511[var0][var24 + var1][var25 + var2]) {
                           class91.field511[var0][var24 + var1][var25 + var2] = (byte)var23;
                        }
                     }
                  }
               }

               if(var8.clipType != 0 && var7 != null) {
                  var7.method3586(var1, var2, var9, var10, var8.blocksProjectile);
               }

            }
         }
      }
   }
}
