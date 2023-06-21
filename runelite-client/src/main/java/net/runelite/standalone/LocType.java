package net.runelite.standalone;

import java.security.SecureRandom;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.api.RSObjectComposition;

@ObfuscatedName("jy")
public class LocType extends CacheableNode implements RSObjectComposition {
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "Lgp;"
   )
   public static NodeCache cachedModels;
   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "Lgp;"
   )
   public static NodeCache objects;
   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "[Ldk;"
   )
   static ModelData[] field3458;
   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "Lgp;"
   )
   public static NodeCache field3457;
   @ObfuscatedName("a")
   static boolean objectCompositionLowDetail;
   @ObfuscatedName("ey")
   static SecureRandom field3502;
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "Liz;"
   )
   static Js5Index objects_ref;
   @ObfuscatedName("h")
   @ObfuscatedSignature(
      signature = "Lgp;"
   )
   public static NodeCache field3455;
   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "Liz;"
   )
   static Js5Index field3453;
   @ObfuscatedName("ak")
   @ObfuscatedSignature(
      signature = "Lgs;"
   )
   IterableHashTable params;
   @ObfuscatedName("aq")
   public int[] multiLocs;
   @ObfuscatedName("l")
   short[] textureToFind;
   @ObfuscatedName("v")
   public boolean blocksProjectile;
   @ObfuscatedName("e")
   public String name;
   @ObfuscatedName("r")
   short[] recolorToFind;
   @ObfuscatedName("af")
   @ObfuscatedGetter(
      intValue = 1124676007
   )
   int contrast;
   @ObfuscatedName("al")
   @ObfuscatedGetter(
      intValue = -1798582853
   )
   int multiLocVarbit;
   @ObfuscatedName("ae")
   @ObfuscatedGetter(
      intValue = 1771229497
   )
   int modelSizeY;
   @ObfuscatedName("k")
   @ObfuscatedGetter(
      intValue = -2128219559
   )
   public int clipType;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = 1193889627
   )
   int contouredGround;
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = 662598067
   )
   public int field3476;
   @ObfuscatedName("au")
   @ObfuscatedGetter(
      intValue = -1709182887
   )
   int offsetHeight;
   @ObfuscatedName("ag")
   @ObfuscatedGetter(
      intValue = 1132504335
   )
   int ambient;
   @ObfuscatedName("b")
   int[] objectModels;
   @ObfuscatedName("aj")
   @ObfuscatedGetter(
      intValue = 1449724417
   )
   int offsetY;
   @ObfuscatedName("aw")
   public boolean clipped;
   @ObfuscatedName("o")
   short[] textureToReplace;
   @ObfuscatedName("ai")
   @ObfuscatedGetter(
      intValue = -1647074679
   )
   public int supportItems;
   @ObfuscatedName("z")
   @ObfuscatedGetter(
      intValue = -1292740305
   )
   public int decorDisplacement;
   @ObfuscatedName("n")
   int[] objectTypes;
   @ObfuscatedName("av")
   @ObfuscatedGetter(
      intValue = -1101816219
   )
   int offsetX;
   @ObfuscatedName("c")
   public boolean modelClipped;
   @ObfuscatedName("t")
   short[] recolorToReplace;
   @ObfuscatedName("ay")
   public String[] actions;
   @ObfuscatedName("ah")
   boolean isRotated;
   @ObfuscatedName("an")
   @ObfuscatedGetter(
      intValue = 955355193
   )
   int modelSizeX;
   @ObfuscatedName("i")
   boolean nonFlatShading;
   @ObfuscatedName("at")
   @ObfuscatedGetter(
      intValue = -1944211407
   )
   int modelSizeHeight;
   @ObfuscatedName("y")
   @ObfuscatedGetter(
      intValue = -923948831
   )
   public int length;
   @ObfuscatedName("as")
   public boolean obstructsGround;
   @ObfuscatedName("ax")
   @ObfuscatedGetter(
      intValue = -1314911205
   )
   public int int6;
   @ObfuscatedName("d")
   @ObfuscatedGetter(
      intValue = -1887157717
   )
   public int field3471;
   @ObfuscatedName("ar")
   boolean isHollow;
   @ObfuscatedName("ad")
   @ObfuscatedGetter(
      intValue = 2143235159
   )
   public int int5;
   @ObfuscatedName("j")
   @ObfuscatedGetter(
      intValue = -586981985
   )
   public int animationId;
   @ObfuscatedName("aa")
   @ObfuscatedGetter(
      intValue = -654726969
   )
   public int mapelement;
   @ObfuscatedName("az")
   @ObfuscatedGetter(
      intValue = -580402229
   )
   int multiLocVarp;
   @ObfuscatedName("ap")
   public int[] field3451;
   @ObfuscatedName("ac")
   @ObfuscatedGetter(
      intValue = -1427402837
   )
   public int ambientSoundId;
   @ObfuscatedName("u")
   @ObfuscatedGetter(
      intValue = -1053188599
   )
   public int width;
   @ObfuscatedName("ab")
   @ObfuscatedGetter(
      intValue = -274624611
   )
   public int mapSceneId;
   @ObfuscatedName("ao")
   @ObfuscatedGetter(
      intValue = 1902178129
   )
   public int int4;

   static {
      objectCompositionLowDetail = false;
      objects = new NodeCache(4096);
      field3455 = new NodeCache(500);
      cachedModels = new NodeCache(30);
      field3457 = new NodeCache(30);
      field3458 = new ModelData[4];
   }

   LocType() {
      this.name = "null";
      this.width = 1;
      this.length = 1;
      this.clipType = 2;
      this.blocksProjectile = true;
      this.field3471 = -1;
      this.contouredGround = -1;
      this.nonFlatShading = false;
      this.modelClipped = false;
      this.animationId = -1;
      this.decorDisplacement = 16;
      this.ambient = 0;
      this.contrast = 0;
      this.actions = new String[5];
      this.mapelement = -1;
      this.mapSceneId = -1;
      this.isRotated = false;
      this.clipped = true;
      this.modelSizeX = 128;
      this.modelSizeHeight = 128;
      this.modelSizeY = 128;
      this.offsetX = 0;
      this.offsetHeight = 0;
      this.offsetY = 0;
      this.obstructsGround = false;
      this.isHollow = false;
      this.supportItems = -1;
      this.multiLocVarbit = -1;
      this.multiLocVarp = -1;
      this.ambientSoundId = -1;
      this.int4 = 0;
      this.int5 = 0;
      this.int6 = 0;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(II)Z",
      garbageValue = "988863798"
   )
   public final boolean method406(int var1) {
      if(this.objectTypes != null) {
         for(int var4 = 0; var4 < this.objectTypes.length; ++var4) {
            if(this.objectTypes[var4] == var1) {
               return field3453.method4117(this.objectModels[var4] & 65535, 0);
            }
         }

         return true;
      } else if(this.objectModels == null) {
         return true;
      } else if(var1 != 10) {
         return true;
      } else {
         boolean var2 = true;

         for(int var3 = 0; var3 < this.objectModels.length; ++var3) {
            var2 &= field3453.method4117(this.objectModels[var3] & 65535, 0);
         }

         return var2;
      }
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "1490655478"
   )
   public boolean method410() {
      if(this.multiLocs == null) {
         return this.ambientSoundId != -1 || this.field3451 != null;
      } else {
         for(int var1 = 0; var1 < this.multiLocs.length; ++var1) {
            if(this.multiLocs[var1] != -1) {
               LocType var2 = GrandExchangeOffer.method1736(this.multiLocs[var1]);
               if(var2.ambientSoundId != -1 || var2.field3451 != null) {
                  return true;
               }
            }
         }

         return false;
      }
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "(I)Ljy;",
      garbageValue = "-2018005631"
   )
   public final LocType method395() {
      int var1 = -1;
      if(this.multiLocVarbit != -1) {
         var1 = CombatInfo1.method57(this.multiLocVarbit);
      } else if(this.multiLocVarp != -1) {
         var1 = class313.clientVarps[this.multiLocVarp];
      }

      int var2;
      if(var1 >= 0 && var1 < this.multiLocs.length - 1) {
         var2 = this.multiLocs[var1];
      } else {
         var2 = this.multiLocs[this.multiLocs.length - 1];
      }

      return var2 != -1?GrandExchangeOffer.method1736(var2):null;
   }

   @ObfuscatedName("r")
   @ObfuscatedSignature(
      signature = "(IIB)I",
      garbageValue = "-36"
   )
   public int method392(int var1, int var2) {
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

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "(II[[IIIIB)Ldv;",
      garbageValue = "84"
   )
   public final Model method388(int var1, int var2, int[][] var3, int var4, int var5, int var6) {
      long var7;
      if(this.objectTypes == null) {
         var7 = (long)(var2 + (this.field3476 << 10));
      } else {
         var7 = (long)(var2 + (var1 << 3) + (this.field3476 << 10));
      }

      Model var9 = (Model)field3457.method635(var7);
      if(var9 == null) {
         ModelData var10 = this.method390(var1, var2);
         if(var10 == null) {
            return null;
         }

         var9 = var10.toModel(this.ambient + 64, this.contrast + 768, -50, -10, -50);
         field3457.method628(var9, var7);
      }

      if(this.contouredGround >= 0) {
         var9 = var9.method3827(var3, var4, var5, var6, true, this.contouredGround);
      }

      return var9;
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(Lgx;I)V",
      garbageValue = "2097811163"
   )
   void method383(Packet var1) {
      while(true) {
         int var2 = var1.readUnsignedByte();
         if(var2 == 0) {
            return;
         }

         this.method430(var1, var2);
      }
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(II[[IIIII)Lem;",
      garbageValue = "836618577"
   )
   public final Entity method387(int var1, int var2, int[][] var3, int var4, int var5, int var6) {
      long var7;
      if(this.objectTypes == null) {
         var7 = (long)(var2 + (this.field3476 << 10));
      } else {
         var7 = (long)(var2 + (var1 << 3) + (this.field3476 << 10));
      }

      Object var9 = (Entity)cachedModels.method635(var7);
      if(var9 == null) {
         ModelData var10 = this.method390(var1, var2);
         if(var10 == null) {
            return null;
         }

         if(!this.nonFlatShading) {
            var9 = var10.toModel(this.ambient + 64, this.contrast + 768, -50, -10, -50);
         } else {
            var10.ambient = (short)(this.ambient + 64);
            var10.contrast = (short)(this.contrast + 768);
            var10.calculateVertexNormals();
            var9 = var10;
         }

         cachedModels.method628((CacheableNode)var9, var7);
      }

      if(this.nonFlatShading) {
         var9 = ((ModelData)var9).method2784();
      }

      if(this.contouredGround >= 0) {
         if(var9 instanceof Model) {
            var9 = ((Model)var9).method3827(var3, var4, var5, var6, true, this.contouredGround);
         } else if(var9 instanceof ModelData) {
            var9 = ((ModelData)var9).method2783(var3, var4, var5, var6, true, this.contouredGround);
         }
      }

      return (Entity)var9;
   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "(B)Z",
      garbageValue = "-7"
   )
   public final boolean method386() {
      if(this.objectModels == null) {
         return true;
      } else {
         boolean var1 = true;

         for(int var2 = 0; var2 < this.objectModels.length; ++var2) {
            var1 &= field3453.method4117(this.objectModels[var2] & 65535, 0);
         }

         return var1;
      }
   }

   @ObfuscatedName("b")
   @ObfuscatedSignature(
      signature = "(II[[IIIILju;II)Ldv;",
      garbageValue = "236198008"
   )
   public final Model method389(int var1, int var2, int[][] var3, int var4, int var5, int var6, Sequence var7, int var8) {
      long var9;
      if(this.objectTypes == null) {
         var9 = (long)(var2 + (this.field3476 << 10));
      } else {
         var9 = (long)(var2 + (var1 << 3) + (this.field3476 << 10));
      }

      Model var11 = (Model)field3457.method635(var9);
      if(var11 == null) {
         ModelData var12 = this.method390(var1, var2);
         if(var12 == null) {
            return null;
         }

         var11 = var12.toModel(this.ambient + 64, this.contrast + 768, -50, -10, -50);
         field3457.method628(var11, var9);
      }

      if(var7 == null && this.contouredGround == -1) {
         return var11;
      } else {
         if(var7 != null) {
            var11 = var7.method5010(var11, var8, var2, -601056534);
         } else {
            var11 = var11.method3828(true);
         }

         if(this.contouredGround >= 0) {
            var11 = var11.method3827(var3, var4, var5, var6, false, this.contouredGround);
         }

         return var11;
      }
   }

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      signature = "(III)Ldk;",
      garbageValue = "-192215718"
   )
   final ModelData method390(int var1, int var2) {
      ModelData var3 = null;
      boolean var4;
      int var5;
      int var7;
      if(this.objectTypes == null) {
         if(var1 != 10) {
            return null;
         }

         if(this.objectModels == null) {
            return null;
         }

         var4 = this.isRotated;
         if(var1 == 2 && var2 > 3) {
            var4 = !var4;
         }

         var5 = this.objectModels.length;

         for(int var6 = 0; var6 < var5; ++var6) {
            var7 = this.objectModels[var6];
            if(var4) {
               var7 += 65536;
            }

            var3 = (ModelData)field3455.method635((long)var7);
            if(var3 == null) {
               var3 = ModelData.method2779(field3453, var7 & 65535, 0);
               if(var3 == null) {
                  return null;
               }

               if(var4) {
                  var3.method2794();
               }

               field3455.method628(var3, (long)var7);
            }

            if(var5 > 1) {
               field3458[var6] = var3;
            }
         }

         if(var5 > 1) {
            var3 = new ModelData(field3458, var5);
         }
      } else {
         int var9 = -1;

         for(var5 = 0; var5 < this.objectTypes.length; ++var5) {
            if(this.objectTypes[var5] == var1) {
               var9 = var5;
               break;
            }
         }

         if(var9 == -1) {
            return null;
         }

         var5 = this.objectModels[var9];
         boolean var10 = this.isRotated ^ var2 > 3;
         if(var10) {
            var5 += 65536;
         }

         var3 = (ModelData)field3455.method635((long)var5);
         if(var3 == null) {
            var3 = ModelData.method2779(field3453, var5 & 65535, 0);
            if(var3 == null) {
               return null;
            }

            if(var10) {
               var3.method2794();
            }

            field3455.method628(var3, (long)var5);
         }
      }

      if(this.modelSizeX == 128 && this.modelSizeHeight == 128 && this.modelSizeY == 128) {
         var4 = false;
      } else {
         var4 = true;
      }

      boolean var11;
      if(this.offsetX == 0 && this.offsetHeight == 0 && this.offsetY == 0) {
         var11 = false;
      } else {
         var11 = true;
      }

      ModelData var8 = new ModelData(var3, var2 == 0 && !var4 && !var11, null == this.recolorToFind, null == this.textureToFind, true);
      if(var1 == 4 && var2 > 3) {
         var8.method2790(256);
         var8.method2814(45, 0, -45);
      }

      var2 &= 3;
      if(var2 == 1) {
         var8.method2787();
      } else if(var2 == 2) {
         var8.method2785();
      } else if(var2 == 3) {
         var8.method2789();
      }

      if(this.recolorToFind != null) {
         for(var7 = 0; var7 < this.recolorToFind.length; ++var7) {
            var8.method2801(this.recolorToFind[var7], this.recolorToReplace[var7]);
         }
      }

      if(this.textureToFind != null) {
         for(var7 = 0; var7 < this.textureToFind.length; ++var7) {
            var8.method2850(this.textureToFind[var7], this.textureToReplace[var7]);
         }
      }

      if(var4) {
         var8.method2795(this.modelSizeX, this.modelSizeHeight, this.modelSizeY);
      }

      if(var11) {
         var8.method2814(this.offsetX, this.offsetHeight, this.offsetY);
      }

      return var8;
   }

   @ObfuscatedName("t")
   @ObfuscatedSignature(
      signature = "(ILjava/lang/String;I)Ljava/lang/String;",
      garbageValue = "-1514364598"
   )
   public String method393(int var1, String var2) {
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

   public int getId() {
      return this.field3476;
   }

   public String getName() {
      return this.name;
   }

   public String[] getActions() {
      return this.actions;
   }

   public int getMapIconId() {
      return this.mapelement;
   }

   public int getMapSceneId() {
      return this.mapSceneId;
   }

   public int[] getImpostorIds() {
      return this.multiLocs;
   }

   public RSObjectComposition getImpostor() {
      return this.method395();
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      signature = "(Lgx;II)V",
      garbageValue = "-214526539"
   )
   void method430(Packet var1, int var2) {
      int var3;
      int var4;
      if(var2 == 1) {
         var3 = var1.readUnsignedByte();
         if(var3 > 0) {
            if(this.objectModels != null && !objectCompositionLowDetail) {
               var1.offset += var3 * 3;
            } else {
               this.objectTypes = new int[var3];
               this.objectModels = new int[var3];

               for(var4 = 0; var4 < var3; ++var4) {
                  this.objectModels[var4] = var1.readUnsignedShort();
                  this.objectTypes[var4] = var1.readUnsignedByte();
               }
            }
         }
      } else if(var2 == 2) {
         this.name = var1.readString();
      } else if(var2 == 5) {
         var3 = var1.readUnsignedByte();
         if(var3 > 0) {
            if(this.objectModels != null && !objectCompositionLowDetail) {
               var1.offset += 2 * var3;
            } else {
               this.objectTypes = null;
               this.objectModels = new int[var3];

               for(var4 = 0; var4 < var3; ++var4) {
                  this.objectModels[var4] = var1.readUnsignedShort();
               }
            }
         }
      } else if(var2 == 14) {
         this.width = var1.readUnsignedByte();
      } else if(var2 == 15) {
         this.length = var1.readUnsignedByte();
      } else if(var2 == 17) {
         this.clipType = 0;
         this.blocksProjectile = false;
      } else if(var2 == 18) {
         this.blocksProjectile = false;
      } else if(var2 == 19) {
         this.field3471 = var1.readUnsignedByte();
      } else if(var2 == 21) {
         this.contouredGround = 0;
      } else if(var2 == 22) {
         this.nonFlatShading = true;
      } else if(var2 == 23) {
         this.modelClipped = true;
      } else if(var2 == 24) {
         this.animationId = var1.readUnsignedShort();
         if(this.animationId == 65535) {
            this.animationId = -1;
         }
      } else if(var2 == 27) {
         this.clipType = 1;
      } else if(var2 == 28) {
         this.decorDisplacement = var1.readUnsignedByte();
      } else if(var2 == 29) {
         this.ambient = var1.method5230();
      } else if(var2 == 39) {
         this.contrast = var1.method5230() * 25;
      } else if(var2 >= 30 && var2 < 35) {
         this.actions[var2 - 30] = var1.readString();
         if(this.actions[var2 - 30].equalsIgnoreCase("Hidden")) {
            this.actions[var2 - 30] = null;
         }
      } else if(var2 == 40) {
         var3 = var1.readUnsignedByte();
         this.recolorToFind = new short[var3];
         this.recolorToReplace = new short[var3];

         for(var4 = 0; var4 < var3; ++var4) {
            this.recolorToFind[var4] = (short)var1.readUnsignedShort();
            this.recolorToReplace[var4] = (short)var1.readUnsignedShort();
         }
      } else if(var2 == 41) {
         var3 = var1.readUnsignedByte();
         this.textureToFind = new short[var3];
         this.textureToReplace = new short[var3];

         for(var4 = 0; var4 < var3; ++var4) {
            this.textureToFind[var4] = (short)var1.readUnsignedShort();
            this.textureToReplace[var4] = (short)var1.readUnsignedShort();
         }
      } else if(var2 == 62) {
         this.isRotated = true;
      } else if(var2 == 64) {
         this.clipped = false;
      } else if(var2 == 65) {
         this.modelSizeX = var1.readUnsignedShort();
      } else if(var2 == 66) {
         this.modelSizeHeight = var1.readUnsignedShort();
      } else if(var2 == 67) {
         this.modelSizeY = var1.readUnsignedShort();
      } else if(var2 == 68) {
         this.mapSceneId = var1.readUnsignedShort();
      } else if(var2 == 69) {
         var1.readUnsignedByte();
      } else if(var2 == 70) {
         this.offsetX = var1.method5089();
      } else if(var2 == 71) {
         this.offsetHeight = var1.method5089();
      } else if(var2 == 72) {
         this.offsetY = var1.method5089();
      } else if(var2 == 73) {
         this.obstructsGround = true;
      } else if(var2 == 74) {
         this.isHollow = true;
      } else if(var2 == 75) {
         this.supportItems = var1.readUnsignedByte();
      } else if(var2 != 77 && var2 != 92) {
         if(var2 == 78) {
            this.ambientSoundId = var1.readUnsignedShort();
            this.int4 = var1.readUnsignedByte();
         } else if(var2 == 79) {
            this.int5 = var1.readUnsignedShort();
            this.int6 = var1.readUnsignedShort();
            this.int4 = var1.readUnsignedByte();
            var3 = var1.readUnsignedByte();
            this.field3451 = new int[var3];

            for(var4 = 0; var4 < var3; ++var4) {
               this.field3451[var4] = var1.readUnsignedShort();
            }
         } else if(var2 == 81) {
            this.contouredGround = var1.readUnsignedByte() * 256;
         } else if(var2 == 82) {
            this.mapelement = var1.readUnsignedShort();
         } else if(var2 == 249) {
            this.params = class51.method850(var1, this.params);
         }
      } else {
         this.multiLocVarbit = var1.readUnsignedShort();
         if(this.multiLocVarbit == 65535) {
            this.multiLocVarbit = -1;
         }

         this.multiLocVarp = var1.readUnsignedShort();
         if(this.multiLocVarp == 65535) {
            this.multiLocVarp = -1;
         }

         var3 = -1;
         if(var2 == 92) {
            var3 = var1.readUnsignedShort();
            if(var3 == 65535) {
               var3 = -1;
            }
         }

         var4 = var1.readUnsignedByte();
         this.multiLocs = new int[var4 + 2];

         for(int var5 = 0; var5 <= var4; ++var5) {
            this.multiLocs[var5] = var1.readUnsignedShort();
            if(this.multiLocs[var5] == 65535) {
               this.multiLocs[var5] = -1;
            }
         }

         this.multiLocs[var4 + 1] = var3;
      }

   }

   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "(S)V",
      garbageValue = "8364"
   )
   void method382() {
      if(this.field3471 == -1) {
         this.field3471 = 0;
         if(this.objectModels != null && (this.objectTypes == null || this.objectTypes[0] == 10)) {
            this.field3471 = 1;
         }

         for(int var1 = 0; var1 < 5; ++var1) {
            if(this.actions[var1] != null) {
               this.field3471 = 1;
            }
         }
      }

      if(this.supportItems == -1) {
         this.supportItems = this.clipType != 0?1:0;
      }

   }
}
