package net.runelite.standalone;

import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.net.URI;
import net.runelite.api.HeadIcon;
import net.runelite.api.events.NpcActionChanged;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.api.RSNPCComposition;

@ObfuscatedName("jg")
public class NPCType extends CacheableNode implements RSNPCComposition {
   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "Lgp;"
   )
   static NodeCache npcModelCache;
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "Liz;"
   )
   static Js5Index NpcDefinition_modelIndexCache;
   @ObfuscatedName("lm")
   @ObfuscatedSignature(
      signature = "Lia;"
   )
   static ComponentType field3585;
   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "Lgp;"
   )
   static NodeCache npcTypeCache;
   @ObfuscatedName("f")
   public String name;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = 114314099
   )
   public int rotate90Anim;
   @ObfuscatedName("v")
   short[] retexD;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = -1105957431
   )
   public int field3575;
   @ObfuscatedName("r")
   @ObfuscatedGetter(
      intValue = -1010554497
   )
   public int walkAnim;
   @ObfuscatedName("af")
   @ObfuscatedGetter(
      intValue = -1045379965
   )
   int contrast;
   @ObfuscatedName("ae")
   public boolean isLowPriorityOps;
   @ObfuscatedName("k")
   short[] retexS;
   @ObfuscatedName("w")
   public boolean isMinimapVisible;
   @ObfuscatedName("q")
   int[] headModels;
   @ObfuscatedName("m")
   int[] models;
   @ObfuscatedName("p")
   @ObfuscatedGetter(
      intValue = 1437029871
   )
   public int size;
   @ObfuscatedName("ag")
   @ObfuscatedGetter(
      intValue = -1978492343
   )
   int ambient;
   @ObfuscatedName("b")
   @ObfuscatedGetter(
      intValue = 68844873
   )
   public int idleAnim;
   @ObfuscatedName("aw")
   @ObfuscatedGetter(
      intValue = -979430983
   )
   int multiNpcVarp;
   @ObfuscatedName("o")
   @ObfuscatedGetter(
      intValue = 2054418871
   )
   public int rotate270Anim;
   @ObfuscatedName("z")
   public boolean isVisible;
   @ObfuscatedName("n")
   @ObfuscatedGetter(
      intValue = -2137059879
   )
   public int field3578;
   @ObfuscatedName("av")
   @ObfuscatedSignature(
      signature = "Lgs;"
   )
   IterableHashTable params;
   @ObfuscatedName("c")
   @ObfuscatedGetter(
      intValue = 1094226911
   )
   int widthScale;
   @ObfuscatedName("t")
   @ObfuscatedGetter(
      intValue = -785244257
   )
   public int rotate180Anim;
   @ObfuscatedName("ay")
   @ObfuscatedGetter(
      intValue = 1244245247
   )
   public int headIcon;
   @ObfuscatedName("ah")
   @ObfuscatedGetter(
      intValue = 1925581753
   )
   int multiNpcVarbit;
   @ObfuscatedName("an")
   public boolean isClickable;
   @ObfuscatedName("i")
   @ObfuscatedGetter(
      intValue = -928938457
   )
   public int level;
   @ObfuscatedName("at")
   public boolean isClippedMovement;
   @ObfuscatedName("y")
   short[] recolD;
   @ObfuscatedName("d")
   public String[] ops;
   @ObfuscatedName("j")
   @ObfuscatedGetter(
      intValue = 144967701
   )
   int heightScale;
   public String[] changedOptions = new String[5];
   @ObfuscatedName("aa")
   @ObfuscatedGetter(
      intValue = 1175281667
   )
   public int rotation;
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      intValue = 784635241
   )
   public int id;
   @ObfuscatedName("u")
   short[] recolS;
   @ObfuscatedName("ab")
   public int[] multiNpcs;

   static {
      npcTypeCache = new NodeCache(64);
      npcModelCache = new NodeCache(50);
   }

   NPCType() {
      this.name = "null";
      this.size = 1;
      this.idleAnim = -1;
      this.field3578 = -1;
      this.field3575 = -1;
      this.walkAnim = -1;
      this.rotate180Anim = -1;
      this.rotate90Anim = -1;
      this.rotate270Anim = -1;
      this.ops = new String[5];
      this.actionsHook(-1);
      this.isMinimapVisible = true;
      this.level = -1;
      this.widthScale = 128;
      this.heightScale = 128;
      this.isVisible = false;
      this.ambient = 0;
      this.contrast = 0;
      this.headIcon = -1;
      this.rotation = 32;
      this.multiNpcVarbit = -1;
      this.multiNpcVarp = -1;
      this.isClickable = true;
      this.isClippedMovement = true;
      this.isLowPriorityOps = false;
      this.rl$$init();
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(Lju;ILju;II)Ldv;",
      garbageValue = "-1214244404"
   )
   public final Model method4811(Sequence var1, int var2, Sequence var3, int var4) {
      if(this.multiNpcs != null) {
         NPCType var12 = this.method4782();
         return var12 == null?null:var12.method4811(var1, var2, var3, var4);
      } else {
         Model var5 = (Model)npcModelCache.method635((long)this.id);
         if(var5 == null) {
            boolean var6 = false;

            for(int var7 = 0; var7 < this.models.length; ++var7) {
               if(!NpcDefinition_modelIndexCache.method4117(this.models[var7], 0)) {
                  var6 = true;
               }
            }

            if(var6) {
               return null;
            }

            ModelData[] var8 = new ModelData[this.models.length];

            int var9;
            for(var9 = 0; var9 < this.models.length; ++var9) {
               var8[var9] = ModelData.method2779(NpcDefinition_modelIndexCache, this.models[var9], 0);
            }

            ModelData var11;
            if(var8.length == 1) {
               var11 = var8[0];
            } else {
               var11 = new ModelData(var8, var8.length);
            }

            if(this.recolS != null) {
               for(var9 = 0; var9 < this.recolS.length; ++var9) {
                  var11.method2801(this.recolS[var9], this.recolD[var9]);
               }
            }

            if(this.retexS != null) {
               for(var9 = 0; var9 < this.retexS.length; ++var9) {
                  var11.method2850(this.retexS[var9], this.retexD[var9]);
               }
            }

            var5 = var11.toModel(this.ambient + 64, this.contrast * 5 + 850, -30, -50, -30);
            npcModelCache.method628(var5, (long)this.id);
         }

         Model var10;
         if(var1 != null && var3 != null) {
            var10 = var1.method5025(var5, var2, var3, var4, 1211273008);
         } else if(var1 != null) {
            var10 = var1.method5009(var5, var2, -1682213593);
         } else if(var3 != null) {
            var10 = var3.method5009(var5, var4, -1682213593);
         } else {
            var10 = var5.method3828(true);
         }

         if(this.widthScale != 128 || this.heightScale != 128) {
            var10.method3843(this.widthScale, this.heightScale, this.widthScale);
         }

         return var10;
      }
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "(B)Z",
      garbageValue = "44"
   )
   public boolean method4783() {
      if(this.multiNpcs == null) {
         return true;
      } else {
         int var1 = -1;
         if(this.multiNpcVarbit != -1) {
            var1 = CombatInfo1.method57(this.multiNpcVarbit);
         } else if(this.multiNpcVarp != -1) {
            var1 = class313.clientVarps[this.multiNpcVarp];
         }

         return var1 >= 0 && var1 < this.multiNpcs.length?this.multiNpcs[var1] != -1:this.multiNpcs[this.multiNpcs.length - 1] != -1;
      }
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(Lgx;B)V",
      garbageValue = "11"
   )
   void method4778(Packet var1) {
      while(true) {
         int var2 = var1.readUnsignedByte();
         if(var2 == 0) {
            return;
         }

         this.method4788(var1, var2);
      }
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(B)Ljg;",
      garbageValue = "0"
   )
   public final NPCType method4782() {
      int var1 = -1;
      if(this.multiNpcVarbit != -1) {
         var1 = CombatInfo1.method57(this.multiNpcVarbit);
      } else if(this.multiNpcVarp != -1) {
         var1 = class313.clientVarps[this.multiNpcVarp];
      }

      int var2;
      if(var1 >= 0 && var1 < this.multiNpcs.length - 1) {
         var2 = this.multiNpcs[var1];
      } else {
         var2 = this.multiNpcs[this.multiNpcs.length - 1];
      }

      return var2 != -1?ZoneProt.method374(var2):null;
   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "(I)Ldk;",
      garbageValue = "-1383078947"
   )
   public final ModelData method4791() {
      if(this.multiNpcs != null) {
         NPCType var1 = this.method4782();
         return var1 == null?null:var1.method4791();
      } else if(this.headModels == null) {
         return null;
      } else {
         boolean var5 = false;

         for(int var2 = 0; var2 < this.headModels.length; ++var2) {
            if(!NpcDefinition_modelIndexCache.method4117(this.headModels[var2], 0)) {
               var5 = true;
            }
         }

         if(var5) {
            return null;
         } else {
            ModelData[] var6 = new ModelData[this.headModels.length];

            for(int var3 = 0; var3 < this.headModels.length; ++var3) {
               var6[var3] = ModelData.method2779(NpcDefinition_modelIndexCache, this.headModels[var3], 0);
            }

            ModelData var7;
            if(var6.length == 1) {
               var7 = var6[0];
            } else {
               var7 = new ModelData(var6, var6.length);
            }

            int var4;
            if(this.recolS != null) {
               for(var4 = 0; var4 < this.recolS.length; ++var4) {
                  var7.method2801(this.recolS[var4], this.recolD[var4]);
               }
            }

            if(this.retexS != null) {
               for(var4 = 0; var4 < this.retexS.length; ++var4) {
                  var7.method2850(this.retexS[var4], this.retexD[var4]);
               }
            }

            return var7;
         }
      }
   }

   @ObfuscatedName("b")
   @ObfuscatedSignature(
      signature = "(III)I",
      garbageValue = "-907547777"
   )
   public int method4784(int var1, int var2) {
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

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      signature = "(ILjava/lang/String;I)Ljava/lang/String;",
      garbageValue = "958019012"
   )
   public String method4785(int var1, String var2) {
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

   public int getRsOverheadIcon() {
      return this.headIcon;
   }

   public void actionsHook(int var1) {
      NpcActionChanged var2 = new NpcActionChanged();
      var2.setNpcComposition(this);
      var2.setIdx(var1);
      ItemContainer.clientInstance.getCallbacks().post(var2);
   }

   private void rl$$init() {
   }

   public HeadIcon getOverheadIcon() {
      switch(this.getRsOverheadIcon()) {
      case 0:
         return HeadIcon.MELEE;
      case 1:
         return HeadIcon.RANGED;
      case 2:
         return HeadIcon.MAGIC;
      case 3:
      case 4:
      case 5:
      default:
         return null;
      case 6:
         return HeadIcon.RANGE_MAGE;
      }
   }

   /**
    * If the npc is a follower, such as a pet. Is affected by the
    * "Move follower options lower down" setting.
    *
    * @return
    */
   @Override
   public boolean isFollower() {
      return false;
   }

   public int getId() {
      return this.id;
   }

   public String getName() {
      return this.name;
   }

   public int getSize() {
      return this.size;
   }

   public int[] getModels() {
      return this.models;
   }

   public String[] getActions() {
      return this.ops;
   }

   public boolean isMinimapVisible() {
      return this.isMinimapVisible;
   }

   public int getCombatLevel() {
      return this.level;
   }

   public boolean isVisible() {
      return this.isVisible;
   }

   public int[] getConfigs() {
      return this.multiNpcs;
   }

   public boolean isClickable() {
      return this.isClippedMovement;
   }

   public RSNPCComposition transform() {
      return this.method4782();
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      signature = "(Lgx;IB)V",
      garbageValue = "-119"
   )
   void method4788(Packet var1, int var2) {
      int var3;
      int var4;
      if(var2 == 1) {
         var3 = var1.readUnsignedByte();
         this.models = new int[var3];

         for(var4 = 0; var4 < var3; ++var4) {
            this.models[var4] = var1.readUnsignedShort();
         }
      } else if(var2 == 2) {
         this.name = var1.readString();
      } else if(var2 == 12) {
         this.size = var1.readUnsignedByte();
      } else if(var2 == 13) {
         this.idleAnim = var1.readUnsignedShort();
      } else if(var2 == 14) {
         this.walkAnim = var1.readUnsignedShort();
      } else if(var2 == 15) {
         this.field3578 = var1.readUnsignedShort();
      } else if(var2 == 16) {
         this.field3575 = var1.readUnsignedShort();
      } else if(var2 == 17) {
         this.walkAnim = var1.readUnsignedShort();
         this.rotate180Anim = var1.readUnsignedShort();
         this.rotate90Anim = var1.readUnsignedShort();
         this.rotate270Anim = var1.readUnsignedShort();
      } else if(var2 >= 30 && var2 < 35) {
         this.ops[var2 - 30] = var1.readString();
         this.actionsHook(var2 - 30);
         if(this.ops[var2 - 30].equalsIgnoreCase("Hidden")) {
            this.ops[var2 - 30] = null;
            this.actionsHook(var2 - 30);
         }
      } else if(var2 == 40) {
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
      } else if(var2 == 60) {
         var3 = var1.readUnsignedByte();
         this.headModels = new int[var3];

         for(var4 = 0; var4 < var3; ++var4) {
            this.headModels[var4] = var1.readUnsignedShort();
         }
      } else if(var2 == 93) {
         this.isMinimapVisible = false;
      } else if(var2 == 95) {
         this.level = var1.readUnsignedShort();
      } else if(var2 == 97) {
         this.widthScale = var1.readUnsignedShort();
      } else if(var2 == 98) {
         this.heightScale = var1.readUnsignedShort();
      } else if(var2 == 99) {
         this.isVisible = true;
      } else if(var2 == 100) {
         this.ambient = var1.method5230();
      } else if(var2 == 101) {
         this.contrast = var1.method5230();
      } else if(var2 == 102) {
         this.headIcon = var1.readUnsignedShort();
      } else if(var2 == 103) {
         this.rotation = var1.readUnsignedShort();
      } else if(var2 != 106 && var2 != 118) {
         if(var2 == 107) {
            this.isClickable = false;
         } else if(var2 == 109) {
            this.isClippedMovement = false;
         } else if(var2 == 111) {
            this.isLowPriorityOps = true;
         } else if(var2 == 249) {
            this.params = class51.method850(var1, this.params);
         }
      } else {
         this.multiNpcVarbit = var1.readUnsignedShort();
         if(this.multiNpcVarbit == 65535) {
            this.multiNpcVarbit = -1;
         }

         this.multiNpcVarp = var1.readUnsignedShort();
         if(this.multiNpcVarp == 65535) {
            this.multiNpcVarp = -1;
         }

         var3 = -1;
         if(var2 == 118) {
            var3 = var1.readUnsignedShort();
            if(var3 == 65535) {
               var3 = -1;
            }
         }

         var4 = var1.readUnsignedByte();
         this.multiNpcs = new int[var4 + 2];

         for(int var5 = 0; var5 <= var4; ++var5) {
            this.multiNpcs[var5] = var1.readUnsignedShort();
            if(this.multiNpcs[var5] == 65535) {
               this.multiNpcs[var5] = -1;
            }
         }

         this.multiNpcs[var4 + 1] = var3;
      }

   }

   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-896105625"
   )
   void method4776() {
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/CharSequence;I)Ljava/lang/String;",
      garbageValue = "1437775628"
   )
   public static String method4812(CharSequence var0) {
      int var2 = var0.length();
      char[] var3 = new char[var2];

      for(int var4 = 0; var4 < var2; ++var4) {
         var3[var4] = '*';
      }

      String var1 = new String(var3);
      return var1;
   }

   @ObfuscatedName("ah")
   @ObfuscatedSignature(
      signature = "(ILcs;ZI)I",
      garbageValue = "1238027485"
   )
   static int method4813(int var0, class314 var1, boolean var2) {
      if(var0 == 3300) {
         class281.intStack[++class281.intStackSize - 1] = client.gameCycle;
         return 1;
      } else {
         int var3;
         int var4;
         if(var0 == 3301) {
            class281.intStackSize -= 2;
            var3 = class281.intStack[class281.intStackSize];
            var4 = class281.intStack[class281.intStackSize + 1];
            class281.intStack[++class281.intStackSize - 1] = CacheFile.method5605(var3, var4);
            return 1;
         } else if(var0 == 3302) {
            class281.intStackSize -= 2;
            var3 = class281.intStack[class281.intStackSize];
            var4 = class281.intStack[class281.intStackSize + 1];
            class281.intStack[++class281.intStackSize - 1] = KeyFocusListener.method5933(var3, var4);
            return 1;
         } else if(var0 == 3303) {
            class281.intStackSize -= 2;
            var3 = class281.intStack[class281.intStackSize];
            var4 = class281.intStack[class281.intStackSize + 1];
            class281.intStack[++class281.intStackSize - 1] = LoginProt.method3821(var3, var4);
            return 1;
         } else if(var0 == 3304) {
            var3 = class281.intStack[--class281.intStackSize];
            class281.intStack[++class281.intStackSize - 1] = class236.method4548(var3).size;
            return 1;
         } else if(var0 == 3305) {
            var3 = class281.intStack[--class281.intStackSize];
            class281.intStack[++class281.intStackSize - 1] = client.skillLevels[var3];
            return 1;
         } else if(var0 == 3306) {
            var3 = class281.intStack[--class281.intStackSize];
            class281.intStack[++class281.intStackSize - 1] = client.skillBaseLevels[var3];
            return 1;
         } else if(var0 == 3307) {
            var3 = class281.intStack[--class281.intStackSize];
            class281.intStack[++class281.intStackSize - 1] = client.skillExperiences[var3];
            return 1;
         } else {
            int var5;
            if(var0 == 3308) {
               var3 = ServerProt.level;
               var4 = (class71.localPlayer.x * -1234429701 >> 7) + class53.baseX;
               var5 = (class71.localPlayer.y >> 7) + class312.baseY;
               class281.intStack[++class281.intStackSize - 1] = (var4 << 14) + var5 + (var3 << 28);
               return 1;
            } else if(var0 == 3309) {
               var3 = class281.intStack[--class281.intStackSize];
               class281.intStack[++class281.intStackSize - 1] = var3 >> 14 & 16383;
               return 1;
            } else if(var0 == 3310) {
               var3 = class281.intStack[--class281.intStackSize];
               class281.intStack[++class281.intStackSize - 1] = var3 >> 28;
               return 1;
            } else if(var0 == 3311) {
               var3 = class281.intStack[--class281.intStackSize];
               class281.intStack[++class281.intStackSize - 1] = var3 & 16383;
               return 1;
            } else if(var0 == 3312) {
               class281.intStack[++class281.intStackSize - 1] = client.isMembers?1:0;
               return 1;
            } else if(var0 == 3313) {
               class281.intStackSize -= 2;
               var3 = class281.intStack[class281.intStackSize] + 32768;
               var4 = class281.intStack[class281.intStackSize + 1];
               class281.intStack[++class281.intStackSize - 1] = CacheFile.method5605(var3, var4);
               return 1;
            } else if(var0 == 3314) {
               class281.intStackSize -= 2;
               var3 = class281.intStack[class281.intStackSize] + 32768;
               var4 = class281.intStack[class281.intStackSize + 1];
               class281.intStack[++class281.intStackSize - 1] = KeyFocusListener.method5933(var3, var4);
               return 1;
            } else if(var0 == 3315) {
               class281.intStackSize -= 2;
               var3 = class281.intStack[class281.intStackSize] + 32768;
               var4 = class281.intStack[class281.intStackSize + 1];
               class281.intStack[++class281.intStackSize - 1] = LoginProt.method3821(var3, var4);
               return 1;
            } else if(var0 == 3316) {
               if(client.staffModLevel >= 2) {
                  class281.intStack[++class281.intStackSize - 1] = client.staffModLevel;
               } else {
                  class281.intStack[++class281.intStackSize - 1] = 0;
               }

               return 1;
            } else if(var0 == 3317) {
               class281.intStack[++class281.intStackSize - 1] = client.rebootTimer;
               return 1;
            } else if(var0 == 3318) {
               class281.intStack[++class281.intStackSize - 1] = client.world;
               return 1;
            } else if(var0 == 3321) {
               class281.intStack[++class281.intStackSize - 1] = client.energy;
               return 1;
            } else if(var0 == 3322) {
               class281.intStack[++class281.intStackSize - 1] = client.weight;
               return 1;
            } else if(var0 == 3323) {
               if(client.playermod) {
                  class281.intStack[++class281.intStackSize - 1] = 1;
               } else {
                  class281.intStack[++class281.intStackSize - 1] = 0;
               }

               return 1;
            } else if(var0 == 3324) {
               class281.intStack[++class281.intStackSize - 1] = client.flags;
               return 1;
            } else if(var0 == 3325) {
               class281.intStackSize -= 4;
               var3 = class281.intStack[class281.intStackSize];
               var4 = class281.intStack[class281.intStackSize + 1];
               var5 = class281.intStack[class281.intStackSize + 2];
               int var6 = class281.intStack[class281.intStackSize + 3];
               var3 += var4 << 14;
               var3 += var5 << 28;
               var3 += var6;
               class281.intStack[++class281.intStackSize - 1] = var3;
               return 1;
            } else {
               return 2;
            }
         }
      }
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;ZLjava/lang/String;ZB)V",
      garbageValue = "-33"
   )
   static void method4806(String var0, boolean var1, String var2, boolean var3) {
      if(var1) {
         if(!var3 && Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
            try {
               Desktop.getDesktop().browse(new URI(var0));
               return;
            } catch (Exception var5) {
               ;
            }
         }

         if(class2.field436.startsWith("win") && !var3) {
            DecorativeObject.method916(var0, 0, "openjs");
            return;
         }

         if(class2.field436.startsWith("mac")) {
            DecorativeObject.method916(var0, 1, var2);
            return;
         }

         DecorativeObject.method916(var0, 2, "openjs");
      } else {
         DecorativeObject.method916(var0, 3, "openjs");
      }

   }
}
