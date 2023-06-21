package net.runelite.standalone;

import net.runelite.api.kit.KitType;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.api.RSPlayerComposition;

@ObfuscatedName("il")
public class PlayerComposition implements RSPlayerComposition {
   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "Lgp;"
   )
   public static NodeCache field2662;
   @ObfuscatedName("q")
   public static short[] field2660;
   @ObfuscatedName("m")
   public static short[][] colorsToReplace;
   @ObfuscatedName("p")
   public static short[] colorsToFind;
   @ObfuscatedName("n")
   static final int[] field2661;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      longValue = -5550629652888001711L
   )
   long field2658;
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = 1192982463
   )
   public int transformedNpcId;
   @ObfuscatedName("a")
   int[] equipmentIds;
   @ObfuscatedName("s")
   int[] bodyPartColours;
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      longValue = -2050415532807345505L
   )
   long hash;
   @ObfuscatedName("g")
   public boolean isFemale;

   static {
      field2661 = new int[]{8, 11, 4, 6, 9, 7, 10};
      field2662 = new NodeCache(260);
   }

   public PlayerComposition() {
      this.rl$$init();
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "2073886776"
   )
   void method817() {
      long var1 = this.hash;
      int var3 = this.equipmentIds[5];
      int var4 = this.equipmentIds[9];
      this.equipmentIds[5] = var4;
      this.equipmentIds[9] = var3;
      this.hash = 0L;

      int var5;
      for(var5 = 0; var5 < 12; ++var5) {
         this.hash <<= 4;
         if(this.equipmentIds[var5] >= 256) {
            this.hash += (long)(this.equipmentIds[var5] - 256);
         }
      }

      if(this.equipmentIds[0] >= 256) {
         this.hash += (long)(this.equipmentIds[0] - 256 >> 4);
      }

      if(this.equipmentIds[1] >= 256) {
         this.hash += (long)(this.equipmentIds[1] - 256 >> 8);
      }

      for(var5 = 0; var5 < 5; ++var5) {
         this.hash <<= 3;
         this.hash += (long)this.bodyPartColours[var5];
      }

      this.hash <<= 1;
      this.hash += (long)(this.isFemale?1:0);
      this.equipmentIds[5] = var3;
      this.equipmentIds[9] = var4;
      if(0L != var1 && this.hash != var1) {
         field2662.method625(var1);
      }

   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "-2140133321"
   )
   public int method820() {
      return this.transformedNpcId == -1?(this.equipmentIds[0] << 15) + this.equipmentIds[1] + (this.equipmentIds[11] << 5) + (this.equipmentIds[8] << 10) + (this.bodyPartColours[0] << 25) + (this.bodyPartColours[4] << 20):305419896 + ZoneProt.method374(this.transformedNpcId).id;
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(ZI)V",
      garbageValue = "-860136758"
   )
   public void method815(boolean var1) {
      if(this.isFemale != var1) {
         this.method828((int[])null, this.bodyPartColours, var1, -1);
      }
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(I)Ldk;",
      garbageValue = "415779279"
   )
   ModelData method819() {
      if(this.transformedNpcId != -1) {
         return ZoneProt.method374(this.transformedNpcId).method4791();
      } else {
         boolean var1 = false;

         int var3;
         for(int var2 = 0; var2 < 12; ++var2) {
            var3 = this.equipmentIds[var2];
            if(var3 >= 256 && var3 < 512 && !class281.method5819(var3 - 256).method5407()) {
               var1 = true;
            }

            if(var3 >= 512 && !class79.method1074(var3 - 512).method2232(this.isFemale)) {
               var1 = true;
            }
         }

         if(var1) {
            return null;
         } else {
            ModelData[] var7 = new ModelData[12];
            var3 = 0;

            int var5;
            for(int var4 = 0; var4 < 12; ++var4) {
               var5 = this.equipmentIds[var4];
               ModelData var6;
               if(var5 >= 256 && var5 < 512) {
                  var6 = class281.method5819(var5 - 256).method5408();
                  if(var6 != null) {
                     var7[var3++] = var6;
                  }
               }

               if(var5 >= 512) {
                  var6 = class79.method1074(var5 - 512).method2225(this.isFemale);
                  if(var6 != null) {
                     var7[var3++] = var6;
                  }
               }
            }

            ModelData var8 = new ModelData(var7, var3);

            for(var5 = 0; var5 < 5; ++var5) {
               if(this.bodyPartColours[var5] < colorsToReplace[var5].length) {
                  var8.method2801(colorsToFind[var5], colorsToReplace[var5][this.bodyPartColours[var5]]);
               }

               if(this.bodyPartColours[var5] < class101.field10[var5].length) {
                  var8.method2801(field2660[var5], class101.field10[var5][this.bodyPartColours[var5]]);
               }
            }

            return var8;
         }
      }
   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "(Lju;ILju;IB)Ldv;",
      garbageValue = "0"
   )
   public Model method837(Sequence var1, int var2, Sequence var3, int var4) {
      if(this.transformedNpcId != -1) {
         return ZoneProt.method374(this.transformedNpcId).method4811(var1, var2, var3, var4);
      } else {
         long var5 = this.hash;
         int[] var7 = this.equipmentIds;
         if(var1 != null && (var1.leftHandItem >= 0 || var1.rightHandItem >= 0)) {
            var7 = new int[12];

            for(int var15 = 0; var15 < 12; ++var15) {
               var7[var15] = this.equipmentIds[var15];
            }

            if(var1.leftHandItem >= 0) {
               var5 += (long)(var1.leftHandItem - this.equipmentIds[5] << 40);
               var7[5] = var1.leftHandItem;
            }

            if(var1.rightHandItem >= 0) {
               var5 += (long)(var1.rightHandItem - this.equipmentIds[3] << 48);
               var7[3] = var1.rightHandItem;
            }
         }

         Model var8 = (Model)field2662.method635(var5);
         if(var8 == null) {
            boolean var9 = false;

            int var11;
            for(int var10 = 0; var10 < 12; ++var10) {
               var11 = var7[var10];
               if(var11 >= 256 && var11 < 512 && !class281.method5819(var11 - 256).method5413()) {
                  var9 = true;
               }

               if(var11 >= 512 && !class79.method1074(var11 - 512).method2222(this.isFemale)) {
                  var9 = true;
               }
            }

            if(var9) {
               if(-1L != this.field2658) {
                  var8 = (Model)field2662.method635(this.field2658);
               }

               if(var8 == null) {
                  return null;
               }
            }

            if(var8 == null) {
               ModelData[] var16 = new ModelData[12];
               var11 = 0;

               int var13;
               for(int var12 = 0; var12 < 12; ++var12) {
                  var13 = var7[var12];
                  ModelData var14;
                  if(var13 >= 256 && var13 < 512) {
                     var14 = class281.method5819(var13 - 256).method5425();
                     if(var14 != null) {
                        var16[var11++] = var14;
                     }
                  }

                  if(var13 >= 512) {
                     var14 = class79.method1074(var13 - 512).method2245(this.isFemale);
                     if(var14 != null) {
                        var16[var11++] = var14;
                     }
                  }
               }

               ModelData var18 = new ModelData(var16, var11);

               for(var13 = 0; var13 < 5; ++var13) {
                  if(this.bodyPartColours[var13] < colorsToReplace[var13].length) {
                     var18.method2801(colorsToFind[var13], colorsToReplace[var13][this.bodyPartColours[var13]]);
                  }

                  if(this.bodyPartColours[var13] < class101.field10[var13].length) {
                     var18.method2801(field2660[var13], class101.field10[var13][this.bodyPartColours[var13]]);
                  }
               }

               var8 = var18.toModel(64, 850, -30, -50, -30);
               field2662.method628(var8, var5);
               this.field2658 = var5;
            }
         }

         if(var1 == null && var3 == null) {
            return var8;
         } else {
            Model var17;
            if(var1 != null && var3 != null) {
               var17 = var1.method5025(var8, var2, var3, var4, 1211273008);
            } else if(var1 != null) {
               var17 = var1.method5009(var8, var2, -1682213593);
            } else {
               var17 = var3.method5009(var8, var4, -1682213593);
            }

            return var17;
         }
      }
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "([I[IZII)V",
      garbageValue = "2042401832"
   )
   public void method828(int[] var1, int[] var2, boolean var3, int var4) {
      if(var1 == null) {
         var1 = new int[12];

         for(int var5 = 0; var5 < 7; ++var5) {
            for(int var6 = 0; var6 < class43.field1230; ++var6) {
               IDKType var7 = class281.method5819(var6);
               if(var7 != null && !var7.nonSelectable && (var3?7:0) + var5 == var7.bodyPartId) {
                  var1[field2661[var5]] = var6 + 256;
                  break;
               }
            }
         }
      }

      this.equipmentIds = var1;
      this.bodyPartColours = var2;
      this.isFemale = var3;
      this.transformedNpcId = var4;
      this.method817();
   }

   public int[] getEquipmentIds() {
      return this.equipmentIds;
   }

   private void rl$$init() {
   }

   public int getEquipmentId(KitType var1) {
      int var2 = this.getEquipmentIds()[var1.getIndex()];
      return var2 < 512?-1:var2 - 512;
   }

   public int getKitId(KitType var1) {
      int var2 = this.getEquipmentIds()[var1.getIndex()];
      return var2 >= 256 && var2 < 512?var2 - 256:-1;
   }

   public int[] getBodyPartColours() {
      return this.bodyPartColours;
   }

   public boolean isFemale() {
      return this.isFemale;
   }

   public void setTransformedNpcId(int var1) {
      this.transformedNpcId = var1;
   }

   public void setHash() {
      this.method817();
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(IZI)V",
      garbageValue = "389311181"
   )
   public void method813(int var1, boolean var2) {
      if(var1 != 1 || !this.isFemale) {
         int var3 = this.equipmentIds[field2661[var1]];
         if(var3 != 0) {
            var3 -= 256;

            IDKType var4;
            do {
               if(!var2) {
                  --var3;
                  if(var3 < 0) {
                     var3 = class43.field1230 - 1;
                  }
               } else {
                  ++var3;
                  if(var3 >= class43.field1230) {
                     var3 = 0;
                  }
               }

               var4 = class281.method5819(var3);
            } while(var4 == null || var4.nonSelectable || (this.isFemale?7:0) + var1 != var4.bodyPartId);

            this.equipmentIds[field2661[var1]] = var3 + 256;
            this.method817();
         }
      }
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      signature = "(Lgx;B)V",
      garbageValue = "114"
   )
   public void method816(Packet var1) {
      var1.writeByte(this.isFemale?1:0);

      int var2;
      for(var2 = 0; var2 < 7; ++var2) {
         int var3 = this.equipmentIds[field2661[var2]];
         if(var3 == 0) {
            var1.writeByte(-1);
         } else {
            var1.writeByte(var3 - 256);
         }
      }

      for(var2 = 0; var2 < 5; ++var2) {
         var1.writeByte(this.bodyPartColours[var2]);
      }

   }

   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "(IZI)V",
      garbageValue = "771371782"
   )
   public void method840(int var1, boolean var2) {
      int var3 = this.bodyPartColours[var1];
      boolean var4;
      if(!var2) {
         do {
            --var3;
            if(var3 < 0) {
               var3 = colorsToReplace[var1].length - 1;
            }

            if(var1 == 4 && var3 >= 8) {
               var4 = false;
            } else {
               var4 = true;
            }
         } while(!var4);
      } else {
         do {
            ++var3;
            if(var3 >= colorsToReplace[var1].length) {
               var3 = 0;
            }

            if(var1 == 4 && var3 >= 8) {
               var4 = false;
            } else {
               var4 = true;
            }
         } while(!var4);
      }

      this.bodyPartColours[var1] = var3;
      this.method817();
   }

   @ObfuscatedName("he")
   @ObfuscatedSignature(
      signature = "(IIIIII)V",
      garbageValue = "-606675956"
   )
   static final void method814(int var0, int var1, int var2, int var3, int var4) {
      long var5 = class312.sceneManager.method3720(var0, var1, var2);
      int var7;
      int var8;
      int var9;
      int var10;
      int var13;
      int var14;
      if(var5 != 0L) {
         var7 = class312.sceneManager.method3651(var0, var1, var2, var5);
         var8 = var7 >> 6 & 3;
         var9 = var7 & 31;
         var10 = var3;
         boolean var11 = 0L != var5 && !class24.method465(var5);
         if(var11) {
            var10 = var4;
         }

         int[] var12 = class281.minimapSprite.pixels;
         var13 = var1 * 4 + (103 - var2) * 2048 + 24624;
         var14 = Resampler.method143(var5);
         LocType var15 = GrandExchangeOffer.method1736(var14);
         if(var15.mapSceneId != -1) {
            IndexedSprite var16 = SubInterface.mapscene[var15.mapSceneId];
            if(var16 != null) {
               int var17 = (var15.width * 4 - var16.width) / 2;
               int var18 = (var15.length * 4 - var16.height) / 2;
               var16.method4282(var1 * 4 + var17 + 48, (104 - var2 - var15.length) * 4 + var18 + 48);
            }
         } else {
            if(var9 == 0 || var9 == 2) {
               if(var8 == 0) {
                  var12[var13] = var10;
                  var12[var13 + 512] = var10;
                  var12[var13 + 1024] = var10;
                  var12[var13 + 1536] = var10;
               } else if(var8 == 1) {
                  var12[var13] = var10;
                  var12[var13 + 1] = var10;
                  var12[var13 + 2] = var10;
                  var12[var13 + 3] = var10;
               } else if(var8 == 2) {
                  var12[var13 + 3] = var10;
                  var12[var13 + 512 + 3] = var10;
                  var12[var13 + 1024 + 3] = var10;
                  var12[var13 + 1536 + 3] = var10;
               } else if(var8 == 3) {
                  var12[var13 + 1536] = var10;
                  var12[var13 + 1536 + 1] = var10;
                  var12[var13 + 1536 + 2] = var10;
                  var12[var13 + 1536 + 3] = var10;
               }
            }

            if(var9 == 3) {
               if(var8 == 0) {
                  var12[var13] = var10;
               } else if(var8 == 1) {
                  var12[var13 + 3] = var10;
               } else if(var8 == 2) {
                  var12[var13 + 1536 + 3] = var10;
               } else if(var8 == 3) {
                  var12[var13 + 1536] = var10;
               }
            }

            if(var9 == 2) {
               if(var8 == 3) {
                  var12[var13] = var10;
                  var12[var13 + 512] = var10;
                  var12[var13 + 1024] = var10;
                  var12[var13 + 1536] = var10;
               } else if(var8 == 0) {
                  var12[var13] = var10;
                  var12[var13 + 1] = var10;
                  var12[var13 + 2] = var10;
                  var12[var13 + 3] = var10;
               } else if(var8 == 1) {
                  var12[var13 + 3] = var10;
                  var12[var13 + 512 + 3] = var10;
                  var12[var13 + 1024 + 3] = var10;
                  var12[var13 + 1536 + 3] = var10;
               } else if(var8 == 2) {
                  var12[var13 + 1536] = var10;
                  var12[var13 + 1536 + 1] = var10;
                  var12[var13 + 1536 + 2] = var10;
                  var12[var13 + 1536 + 3] = var10;
               }
            }
         }
      }

      var5 = class312.sceneManager.method3649(var0, var1, var2);
      if(var5 != 0L) {
         var7 = class312.sceneManager.method3651(var0, var1, var2, var5);
         var8 = var7 >> 6 & 3;
         var9 = var7 & 31;
         var10 = Resampler.method143(var5);
         LocType var19 = GrandExchangeOffer.method1736(var10);
         if(var19.mapSceneId != -1) {
            IndexedSprite var26 = SubInterface.mapscene[var19.mapSceneId];
            if(var26 != null) {
               var13 = (var19.width * 4 - var26.width) / 2;
               var14 = (var19.length * 4 - var26.height) / 2;
               var26.method4282(var1 * 4 + var13 + 48, var14 + (104 - var2 - var19.length) * 4 + 48);
            }
         } else if(var9 == 9) {
            int var22 = 15658734;
            boolean var27 = 0L != var5 && !class24.method465(var5);
            if(var27) {
               var22 = 15597568;
            }

            int[] var23 = class281.minimapSprite.pixels;
            int var24 = var1 * 4 + (103 - var2) * 2048 + 24624;
            if(var8 != 0 && var8 != 2) {
               var23[var24] = var22;
               var23[var24 + 1 + 512] = var22;
               var23[var24 + 1024 + 2] = var22;
               var23[var24 + 1536 + 3] = var22;
            } else {
               var23[var24 + 1536] = var22;
               var23[var24 + 1 + 1024] = var22;
               var23[var24 + 512 + 2] = var22;
               var23[var24 + 3] = var22;
            }
         }
      }

      var5 = class312.sceneManager.method3713(var0, var1, var2);
      if(0L != var5) {
         var7 = Resampler.method143(var5);
         LocType var20 = GrandExchangeOffer.method1736(var7);
         if(var20.mapSceneId != -1) {
            IndexedSprite var21 = SubInterface.mapscene[var20.mapSceneId];
            if(var21 != null) {
               var10 = (var20.width * 4 - var21.width) / 2;
               int var25 = (var20.length * 4 - var21.height) / 2;
               var21.method4282(var1 * 4 + var10 + 48, (104 - var2 - var20.length) * 4 + var25 + 48);
            }
         }
      }

   }
}
