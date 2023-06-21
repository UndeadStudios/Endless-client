package net.runelite.standalone;

import net.runelite.api.events.PostItemComposition;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.api.RSItemComposition;

@ObfuscatedName("jc")
public class ObjType extends CacheableNode implements RSItemComposition {
   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "Lgp;"
   )
   public static NodeCache itemSpriteCache;
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = -2024720123
   )
   public static int field3508;
   @ObfuscatedName("m")
   public static boolean isMembersWorld;
   @ObfuscatedName("b")
   @ObfuscatedSignature(
      signature = "Lgp;"
   )
   static NodeCache items;
   @ObfuscatedName("n")
   @ObfuscatedSignature(
      signature = "Lgp;"
   )
   static NodeCache itemModelCache;
   @ObfuscatedName("ak")
   @ObfuscatedGetter(
      intValue = -636666147
   )
   int resizeY;
   @ObfuscatedName("aq")
   @ObfuscatedGetter(
      intValue = -77129911
   )
   int manHead2;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = -1420925049
   )
   int inventoryModel;
   @ObfuscatedName("v")
   short[] retexD;
   @ObfuscatedName("af")
   @ObfuscatedGetter(
      intValue = -240283457
   )
   public int cost;
   @ObfuscatedName("al")
   @ObfuscatedGetter(
      intValue = 1946712565
   )
   int womanHead;
   @ObfuscatedName("ae")
   @ObfuscatedGetter(
      intValue = -522053309
   )
   int maleOffset;
   @ObfuscatedName("k")
   short[] retexS;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = 1464734291
   )
   public int xan2d;
   @ObfuscatedName("bz")
   public boolean stockmarket;
   @ObfuscatedName("bg")
   @ObfuscatedGetter(
      intValue = -691708769
   )
   public int placeholderTemplate;
   @ObfuscatedName("bd")
   @ObfuscatedSignature(
      signature = "Lgs;"
   )
   IterableHashTable params;
   @ObfuscatedName("au")
   @ObfuscatedGetter(
      intValue = -515749673
   )
   int femaleModel1;
   @ObfuscatedName("ag")
   @ObfuscatedGetter(
      intValue = 1014870201
   )
   public int stackable;
   @ObfuscatedName("aj")
   @ObfuscatedGetter(
      intValue = -410003891
   )
   int femaleOffset;
   @ObfuscatedName("aw")
   @ObfuscatedGetter(
      intValue = -1728655245
   )
   int shiftClickIndex;
   @ObfuscatedName("bo")
   @ObfuscatedGetter(
      intValue = -2025634101
   )
   public int contrast;
   @ObfuscatedName("o")
   public String name;
   @ObfuscatedName("bp")
   @ObfuscatedGetter(
      intValue = -742207739
   )
   int boughtTemplate;
   @ObfuscatedName("ai")
   @ObfuscatedGetter(
      intValue = 1147738563
   )
   int manHead;
   @ObfuscatedName("z")
   @ObfuscatedGetter(
      intValue = -45453355
   )
   public int yof2d;
   @ObfuscatedName("av")
   @ObfuscatedGetter(
      intValue = -796459901
   )
   int femaleModel;
   @ObfuscatedName("c")
   @ObfuscatedGetter(
      intValue = 41322359
   )
   public int zan2d;
   @ObfuscatedName("t")
   @ObfuscatedGetter(
      intValue = 1567373911
   )
   public int id;
   @ObfuscatedName("ay")
   public boolean members;
   @ObfuscatedName("an")
   @ObfuscatedGetter(
      intValue = 738599493
   )
   int maleModel;
   public int shiftClickActionIndex;
   @ObfuscatedName("be")
   @ObfuscatedGetter(
      intValue = -1461842305
   )
   public int team;
   @ObfuscatedName("i")
   @ObfuscatedGetter(
      intValue = -61123767
   )
   public int yan2d;
   @ObfuscatedName("bv")
   @ObfuscatedGetter(
      intValue = 1676762263
   )
   public int placeholderLink;
   @ObfuscatedName("at")
   @ObfuscatedGetter(
      intValue = -1393904297
   )
   int maleModel1;
   @ObfuscatedName("y")
   short[] recolD;
   @ObfuscatedName("am")
   @ObfuscatedGetter(
      intValue = -496370405
   )
   int resizeZ;
   @ObfuscatedName("bf")
   @ObfuscatedGetter(
      intValue = 1783276773
   )
   public int ambient;
   @ObfuscatedName("as")
   @ObfuscatedGetter(
      intValue = -581420823
   )
   int maleModel2;
   @ObfuscatedName("ax")
   @ObfuscatedGetter(
      intValue = 944846259
   )
   public int certTemplate;
   @ObfuscatedName("d")
   @ObfuscatedGetter(
      intValue = 1339319927
   )
   public int zoom2d;
   @ObfuscatedName("ar")
   @ObfuscatedGetter(
      intValue = 953273737
   )
   int femaleModel2;
   @ObfuscatedName("ad")
   @ObfuscatedGetter(
      intValue = -1652485973
   )
   public int certLink;
   @ObfuscatedName("j")
   @ObfuscatedGetter(
      intValue = -1408460323
   )
   public int xof2d;
   @ObfuscatedName("aa")
   public String[] ops;
   @ObfuscatedName("az")
   @ObfuscatedGetter(
      intValue = 81686335
   )
   int womanHead2;
   @ObfuscatedName("ap")
   @ObfuscatedGetter(
      intValue = -1594097723
   )
   int resizeX;
   @ObfuscatedName("ac")
   int[] countObj;
   @ObfuscatedName("bi")
   @ObfuscatedGetter(
      intValue = 2058235193
   )
   int boughtLink;
   @ObfuscatedName("u")
   short[] recolS;
   @ObfuscatedName("ab")
   public String[] iops;
   @ObfuscatedName("ao")
   int[] countCo;

   static {
      items = new NodeCache(64);
      itemModelCache = new NodeCache(50);
      itemSpriteCache = new NodeCache(200);
   }

   ObjType() {
      this.name = "null";
      this.zoom2d = 2000;
      this.xan2d = 0;
      this.yan2d = 0;
      this.zan2d = 0;
      this.xof2d = 0;
      this.yof2d = 0;
      this.stackable = 0;
      this.cost = 1;
      this.members = false;
      this.ops = new String[]{null, null, "Take", null, null};
      this.iops = new String[]{null, null, null, null, "Drop"};
      this.shiftClickIndex = -2;
      this.maleModel = -1;
      this.maleModel1 = -1;
      this.maleOffset = 0;
      this.femaleModel = -1;
      this.femaleModel1 = -1;
      this.femaleOffset = 0;
      this.maleModel2 = -1;
      this.femaleModel2 = -1;
      this.manHead = -1;
      this.manHead2 = -1;
      this.womanHead = -1;
      this.womanHead2 = -1;
      this.certLink = -1;
      this.certTemplate = -1;
      this.resizeX = 128;
      this.resizeY = 128;
      this.resizeZ = 128;
      this.ambient = 0;
      this.contrast = 0;
      this.team = 0;
      this.stockmarket = false;
      this.boughtLink = -1;
      this.boughtTemplate = -1;
      this.placeholderLink = -1;
      this.placeholderTemplate = -1;
      this.rl$$init();
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(Ljc;Ljc;I)V",
      garbageValue = "924288364"
   )
   void method2224(ObjType var1, ObjType var2) {
      this.inventoryModel = var1.inventoryModel;
      this.zoom2d = var1.zoom2d;
      this.xan2d = var1.xan2d;
      this.yan2d = var1.yan2d;
      this.zan2d = var1.zan2d;
      this.xof2d = var1.xof2d;
      this.yof2d = var1.yof2d;
      this.recolS = var2.recolS;
      this.recolD = var2.recolD;
      this.retexS = var2.retexS;
      this.retexD = var2.retexD;
      this.name = var2.name;
      this.members = var2.members;
      this.stackable = var2.stackable;
      this.maleModel = var2.maleModel;
      this.maleModel1 = var2.maleModel1;
      this.maleModel2 = var2.maleModel2;
      this.femaleModel = var2.femaleModel;
      this.femaleModel1 = var2.femaleModel1;
      this.femaleModel2 = var2.femaleModel2;
      this.manHead = var2.manHead;
      this.manHead2 = var2.manHead2;
      this.womanHead = var2.womanHead;
      this.womanHead2 = var2.womanHead2;
      this.team = var2.team;
      this.ops = var2.ops;
      this.iops = new String[5];
      if(var2.iops != null) {
         for(int var3 = 0; var3 < 4; ++var3) {
            this.iops[var3] = var2.iops[var3];
         }
      }

      this.iops[4] = "Discard";
      this.cost = 0;
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(ZI)Ldk;",
      garbageValue = "-665171259"
   )
   public final ModelData method2225(boolean var1) {
      int var2 = this.manHead;
      int var3 = this.manHead2;
      if(var1) {
         var2 = this.womanHead;
         var3 = this.womanHead2;
      }

      if(var2 == -1) {
         return null;
      } else {
         ModelData var4 = ModelData.method2779(class60.ItemDefinition_modelIndexCache, var2, 0);
         if(var3 != -1) {
            ModelData var5 = ModelData.method2779(class60.ItemDefinition_modelIndexCache, var3, 0);
            ModelData[] var6 = new ModelData[]{var4, var5};
            var4 = new ModelData(var6, 2);
         }

         int var7;
         if(this.recolS != null) {
            for(var7 = 0; var7 < this.recolS.length; ++var7) {
               var4.method2801(this.recolS[var7], this.recolD[var7]);
            }
         }

         if(this.retexS != null) {
            for(var7 = 0; var7 < this.retexS.length; ++var7) {
               var4.method2850(this.retexS[var7], this.retexD[var7]);
            }
         }

         return var4;
      }
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "(ZI)Z",
      garbageValue = "-790138685"
   )
   public final boolean method2222(boolean var1) {
      int var2 = this.maleModel;
      int var3 = this.maleModel1;
      int var4 = this.maleModel2;
      if(var1) {
         var2 = this.femaleModel;
         var3 = this.femaleModel1;
         var4 = this.femaleModel2;
      }

      if(var2 == -1) {
         return true;
      } else {
         boolean var5 = true;
         if(!class60.ItemDefinition_modelIndexCache.method4117(var2, 0)) {
            var5 = false;
         }

         if(var3 != -1 && !class60.ItemDefinition_modelIndexCache.method4117(var3, 0)) {
            var5 = false;
         }

         if(var4 != -1 && !class60.ItemDefinition_modelIndexCache.method4117(var4, 0)) {
            var5 = false;
         }

         return var5;
      }
   }

   @ObfuscatedName("r")
   @ObfuscatedSignature(
      signature = "(ZB)Ldk;",
      garbageValue = "79"
   )
   public final ModelData method2245(boolean var1) {
      int var2 = this.maleModel;
      int var3 = this.maleModel1;
      int var4 = this.maleModel2;
      if(var1) {
         var2 = this.femaleModel;
         var3 = this.femaleModel1;
         var4 = this.femaleModel2;
      }

      if(var2 == -1) {
         return null;
      } else {
         ModelData var5 = ModelData.method2779(class60.ItemDefinition_modelIndexCache, var2, 0);
         if(var3 != -1) {
            ModelData var6 = ModelData.method2779(class60.ItemDefinition_modelIndexCache, var3, 0);
            if(var4 != -1) {
               ModelData var7 = ModelData.method2779(class60.ItemDefinition_modelIndexCache, var4, 0);
               ModelData[] var8 = new ModelData[]{var5, var6, var7};
               var5 = new ModelData(var8, 3);
            } else {
               ModelData[] var10 = new ModelData[]{var5, var6};
               var5 = new ModelData(var10, 2);
            }
         }

         if(!var1 && this.maleOffset != 0) {
            var5.method2814(0, this.maleOffset, 0);
         }

         if(var1 && this.femaleOffset != 0) {
            var5.method2814(0, this.femaleOffset, 0);
         }

         int var9;
         if(this.recolS != null) {
            for(var9 = 0; var9 < this.recolS.length; ++var9) {
               var5.method2801(this.recolS[var9], this.recolD[var9]);
            }
         }

         if(this.retexS != null) {
            for(var9 = 0; var9 < this.retexS.length; ++var9) {
               var5.method2850(this.retexS[var9], this.retexD[var9]);
            }
         }

         return var5;
      }
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "(IB)Ldv;",
      garbageValue = "4"
   )
   public final Model method2220(int var1) {
      if(this.countObj != null && var1 > 1) {
         int var2 = -1;

         for(int var3 = 0; var3 < 10; ++var3) {
            if(var1 >= this.countCo[var3] && this.countCo[var3] != 0) {
               var2 = this.countObj[var3];
            }
         }

         if(var2 != -1) {
            return class79.method1074(var2).method2220(1);
         }
      }

      Model var5 = (Model)itemModelCache.method635((long)this.id);
      if(var5 != null) {
         return var5;
      } else {
         ModelData var6 = ModelData.method2779(class60.ItemDefinition_modelIndexCache, this.inventoryModel, 0);
         if(var6 == null) {
            return null;
         } else {
            if(this.resizeX != 128 || this.resizeY != 128 || this.resizeZ != 128) {
               var6.method2795(this.resizeX, this.resizeY, this.resizeZ);
            }

            int var4;
            if(this.recolS != null) {
               for(var4 = 0; var4 < this.recolS.length; ++var4) {
                  var6.method2801(this.recolS[var4], this.recolD[var4]);
               }
            }

            if(this.retexS != null) {
               for(var4 = 0; var4 < this.retexS.length; ++var4) {
                  var6.method2850(this.retexS[var4], this.retexD[var4]);
               }
            }

            var5 = var6.toModel(this.ambient + 64, this.contrast * 5 + 768, -50, -10, -50);
            var5.field1696 = true;
            itemModelCache.method628(var5, (long)this.id);
            return var5;
         }
      }
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(Lgx;IB)V",
      garbageValue = "0"
   )
   void method2216(Packet var1, int var2) {
      if(var2 == 1) {
         this.inventoryModel = var1.readUnsignedShort();
      } else if(var2 == 2) {
         this.name = var1.readString();
      } else if(var2 == 4) {
         this.zoom2d = var1.readUnsignedShort();
      } else if(var2 == 5) {
         this.xan2d = var1.readUnsignedShort();
      } else if(var2 == 6) {
         this.yan2d = var1.readUnsignedShort();
      } else if(var2 == 7) {
         this.xof2d = var1.readUnsignedShort();
         if(this.xof2d > 32767) {
            this.xof2d -= 65536;
         }
      } else if(var2 == 8) {
         this.yof2d = var1.readUnsignedShort();
         if(this.yof2d > 32767) {
            this.yof2d -= 65536;
         }
      } else if(var2 == 11) {
         this.stackable = 1;
      } else if(var2 == 12) {
         this.cost = var1.readInt();
      } else if(var2 == 16) {
         this.members = true;
      } else if(var2 == 23) {
         this.maleModel = var1.readUnsignedShort();
         this.maleOffset = var1.readUnsignedByte();
      } else if(var2 == 24) {
         this.maleModel1 = var1.readUnsignedShort();
      } else if(var2 == 25) {
         this.femaleModel = var1.readUnsignedShort();
         this.femaleOffset = var1.readUnsignedByte();
      } else if(var2 == 26) {
         this.femaleModel1 = var1.readUnsignedShort();
      } else if(var2 >= 30 && var2 < 35) {
         this.ops[var2 - 30] = var1.readString();
         if(this.ops[var2 - 30].equalsIgnoreCase("Hidden")) {
            this.ops[var2 - 30] = null;
         }
      } else if(var2 >= 35 && var2 < 40) {
         this.iops[var2 - 35] = var1.readString();
      } else {
         int var3;
         int var4;
         if(var2 == 40) {
            var3 = var1.readUnsignedByte();
            this.recolS = new short[var3];
            this.recolD = new short[var3];

            for(var4 = 0; var4 < var3; ++var4) {
               this.recolS[var4] = (short)var1.readUnsignedShort();
               this.recolD[var4] = (short)var1.readUnsignedShort();
            }
         } else if(var2 == 41) {
            var3 = var1.readUnsignedByte();
            this.retexS = new short[var3];
            this.retexD = new short[var3];

            for(var4 = 0; var4 < var3; ++var4) {
               this.retexS[var4] = (short)var1.readUnsignedShort();
               this.retexD[var4] = (short)var1.readUnsignedShort();
            }
         } else if(var2 == 42) {
            this.shiftClickIndex = var1.method5230();
         } else if(var2 == 65) {
            this.stockmarket = true;
         } else if(var2 == 78) {
            this.maleModel2 = var1.readUnsignedShort();
         } else if(var2 == 79) {
            this.femaleModel2 = var1.readUnsignedShort();
         } else if(var2 == 90) {
            this.manHead = var1.readUnsignedShort();
         } else if(var2 == 91) {
            this.womanHead = var1.readUnsignedShort();
         } else if(var2 == 92) {
            this.manHead2 = var1.readUnsignedShort();
         } else if(var2 == 93) {
            this.womanHead2 = var1.readUnsignedShort();
         } else if(var2 == 95) {
            this.zan2d = var1.readUnsignedShort();
         } else if(var2 == 97) {
            this.certLink = var1.readUnsignedShort();
         } else if(var2 == 98) {
            this.certTemplate = var1.readUnsignedShort();
         } else if(var2 >= 100 && var2 < 110) {
            if(this.countObj == null) {
               this.countObj = new int[10];
               this.countCo = new int[10];
            }

            this.countObj[var2 - 100] = var1.readUnsignedShort();
            this.countCo[var2 - 100] = var1.readUnsignedShort();
         } else if(var2 == 110) {
            this.resizeX = var1.readUnsignedShort();
         } else if(var2 == 111) {
            this.resizeY = var1.readUnsignedShort();
         } else if(var2 == 112) {
            this.resizeZ = var1.readUnsignedShort();
         } else if(var2 == 113) {
            this.ambient = var1.method5230();
         } else if(var2 == 114) {
            this.contrast = var1.method5230();
         } else if(var2 == 115) {
            this.team = var1.readUnsignedByte();
         } else if(var2 == 139) {
            this.boughtLink = var1.readUnsignedShort();
         } else if(var2 == 140) {
            this.boughtTemplate = var1.readUnsignedShort();
         } else if(var2 == 148) {
            this.placeholderLink = var1.readUnsignedShort();
         } else if(var2 == 149) {
            this.placeholderTemplate = var1.readUnsignedShort();
         } else if(var2 == 249) {
            this.params = class51.method850(var1, this.params);
         }
      }

   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(II)Ldk;",
      garbageValue = "-573893718"
   )
   public final ModelData method2219(int var1) {
      int var3;
      if(this.countObj != null && var1 > 1) {
         int var2 = -1;

         for(var3 = 0; var3 < 10; ++var3) {
            if(var1 >= this.countCo[var3] && this.countCo[var3] != 0) {
               var2 = this.countObj[var3];
            }
         }

         if(var2 != -1) {
            return class79.method1074(var2).method2219(1);
         }
      }

      ModelData var4 = ModelData.method2779(class60.ItemDefinition_modelIndexCache, this.inventoryModel, 0);
      if(var4 == null) {
         return null;
      } else {
         if(this.resizeX != 128 || this.resizeY != 128 || this.resizeZ != 128) {
            var4.method2795(this.resizeX, this.resizeY, this.resizeZ);
         }

         if(this.recolS != null) {
            for(var3 = 0; var3 < this.recolS.length; ++var3) {
               var4.method2801(this.recolS[var3], this.recolD[var3]);
            }
         }

         if(this.retexS != null) {
            for(var3 = 0; var3 < this.retexS.length; ++var3) {
               var4.method2850(this.retexS[var3], this.retexD[var3]);
            }
         }

         return var4;
      }
   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "(Ljc;Ljc;I)V",
      garbageValue = "-585719410"
   )
   void method2218(ObjType var1, ObjType var2) {
      this.inventoryModel = var1.inventoryModel;
      this.zoom2d = var1.zoom2d;
      this.xan2d = var1.xan2d;
      this.yan2d = var1.yan2d;
      this.zan2d = var1.zan2d;
      this.xof2d = var1.xof2d;
      this.yof2d = var1.yof2d;
      this.recolS = var1.recolS;
      this.recolD = var1.recolD;
      this.retexS = var1.retexS;
      this.retexD = var1.retexD;
      this.stackable = var1.stackable;
      this.name = var2.name;
      this.cost = 0;
      this.members = false;
      this.stockmarket = false;
   }

   @ObfuscatedName("b")
   @ObfuscatedSignature(
      signature = "(II)Ljc;",
      garbageValue = "96183287"
   )
   public ObjType method2221(int var1) {
      if(this.countObj != null && var1 > 1) {
         int var2 = -1;

         for(int var3 = 0; var3 < 10; ++var3) {
            if(var1 >= this.countCo[var3] && this.countCo[var3] != 0) {
               var2 = this.countObj[var3];
            }
         }

         if(var2 != -1) {
            return class79.method1074(var2);
         }
      }

      return this;
   }

   @ObfuscatedName("o")
   @ObfuscatedSignature(
      signature = "(IIS)I",
      garbageValue = "-24705"
   )
   public int method2256(int var1, int var2) {
      IterableHashTable var4 = this.params;
      int var3;
      if(var4 == null) {
         var3 = var2;
      } else {
         IntegerNode var5 = (IntegerNode)var4.method2178((long)var1);
         if(var5 == null) {
            var3 = var2;
         } else {
            var3 = var5.value;
         }
      }

      return var3;
   }

   @ObfuscatedName("t")
   @ObfuscatedSignature(
      signature = "(ZI)Z",
      garbageValue = "1934878119"
   )
   public final boolean method2232(boolean var1) {
      int var2 = this.manHead;
      int var3 = this.manHead2;
      if(var1) {
         var2 = this.womanHead;
         var3 = this.womanHead2;
      }

      if(var2 == -1) {
         return true;
      } else {
         boolean var4 = true;
         if(!class60.ItemDefinition_modelIndexCache.method4117(var2, 0)) {
            var4 = false;
         }

         if(var3 != -1 && !class60.ItemDefinition_modelIndexCache.method4117(var3, 0)) {
            var4 = false;
         }

         return var4;
      }
   }

   public int getIsStackable() {
      return this.stackable;
   }

   public void post() {
      PostItemComposition var1 = new PostItemComposition();
      var1.setItemComposition(this);
      ItemContainer.clientInstance.getCallbacks().post(var1);
   }

   public int copy$getShiftClickActionIndex(int var1) {
      return this.shiftClickIndex != -1 && this.iops != null?(this.shiftClickIndex >= 0?(this.iops[this.shiftClickIndex] != null?this.shiftClickIndex:-1):("Drop".equalsIgnoreCase(this.iops[4])?4:-1)):-1;
   }

   private void rl$$init() {
      this.shiftClickActionIndex = -2;
   }

   public boolean isStackable() {
      return this.getIsStackable() != 0;
   }

   public void setShiftClickActionIndex(int var1) {
      this.shiftClickActionIndex = var1;
   }

   public void resetShiftClickActionIndex() {
      this.shiftClickActionIndex = -2;
   }

   public int getId() {
      return this.id;
   }

   public String getName() {
      return this.name;
   }

   public int getPrice() {
      return this.cost;
   }

   public boolean isMembers() {
      return this.members;
   }

   public String[] getInventoryActions() {
      return this.iops;
   }

   public int getMaleModel() {
      return this.maleModel;
   }

   public int getLinkedNoteId() {
      return this.certLink;
   }

   public int getNote() {
      return this.certTemplate;
   }

   public boolean isTradeable() {
      return this.stockmarket;
   }

   public int getPlaceholderId() {
      return this.placeholderLink;
   }

   public int getPlaceholderTemplateId() {
      return this.placeholderTemplate;
   }

   public int getShiftClickActionIndex() {
      return this.method2228(-702567274);
   }

   @ObfuscatedName("y")
   public int method2228(int var1) {
      return this.shiftClickActionIndex == -2?this.copy$getShiftClickActionIndex(var1):this.shiftClickActionIndex;
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "127"
   )
   void method2226() {
      this.post();
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      signature = "(Ljc;Ljc;I)V",
      garbageValue = "478555269"
   )
   void method2217(ObjType var1, ObjType var2) {
      this.inventoryModel = var1.inventoryModel;
      this.zoom2d = var1.zoom2d;
      this.xan2d = var1.xan2d;
      this.yan2d = var1.yan2d;
      this.zan2d = var1.zan2d;
      this.xof2d = var1.xof2d;
      this.yof2d = var1.yof2d;
      this.recolS = var1.recolS;
      this.recolD = var1.recolD;
      this.retexS = var1.retexS;
      this.retexD = var1.retexD;
      this.name = var2.name;
      this.members = var2.members;
      this.cost = var2.cost;
      this.stackable = 1;
   }

   @ObfuscatedName("u")
   @ObfuscatedSignature(
      signature = "(ILjava/lang/String;I)Ljava/lang/String;",
      garbageValue = "2067108094"
   )
   public String method2227(int var1, String var2) {
      IterableHashTable var4 = this.params;
      String var3;
      if(var4 == null) {
         var3 = var2;
      } else {
         ObjectNode var5 = (ObjectNode)var4.method2178((long)var1);
         if(var5 == null) {
            var3 = var2;
         } else {
            var3 = (String)var5.value;
         }
      }

      return var3;
   }

   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "(Lgx;I)V",
      garbageValue = "-1429982553"
   )
   void method2215(Packet var1) {
      while(true) {
         int var2 = var1.readUnsignedByte();
         if(var2 == 0) {
            return;
         }

         this.method2216(var1, var2);
      }
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "263162128"
   )
   public static void method2276() {
      Object var0 = IndexStoreActionHandler.IndexStoreActionHandler_lock;
      synchronized(IndexStoreActionHandler.IndexStoreActionHandler_lock) {
         if(IndexStoreActionHandler.field3259 != 0) {
            IndexStoreActionHandler.field3259 = 1;

            try {
               IndexStoreActionHandler.IndexStoreActionHandler_lock.wait();
            } catch (InterruptedException var3) {
               ;
            }
         }

      }
   }
}
