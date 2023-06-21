package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("iu")
public class class95 {
   @ObfuscatedName("s")
   public static final boolean[] field2865;
   @ObfuscatedName("g")
   public static int[] field2864;

   static {
      field2865 = new boolean[]{true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false, false};
      field2864 = new int[99];
      int var0 = 0;

      for(int var1 = 0; var1 < 99; ++var1) {
         int var2 = var1 + 1;
         int var3 = (int)((double)var2 + 300.0D * Math.pow(2.0D, (double)var2 / 7.0D));
         var0 += var3;
         field2864[var1] = var0 / 4;
      }

   }

   @ObfuscatedName("ig")
   @ObfuscatedSignature(
      signature = "(Lbw;IIII)V",
      garbageValue = "-1423109813"
   )
   static final void method1263(PlayerEntity var0, int var1, int var2, int var3) {
      if(class71.localPlayer != var0) {
         if(client.menuOptionCount < 400) {
            String var4;
            int var7;
            if(var0.totalLevel == 0) {
               String var5 = var0.tagFragments[0] + var0.name + var0.tagFragments[1];
               var7 = var0.combatLevel;
               int var8 = class71.localPlayer.combatLevel;
               int var9 = var8 - var7;
               String var6;
               if(var9 < -9) {
                  var6 = class308.method6152(16711680);
               } else if(var9 < -6) {
                  var6 = class308.method6152(16723968);
               } else if(var9 < -3) {
                  var6 = class308.method6152(16740352);
               } else if(var9 < 0) {
                  var6 = class308.method6152(16756736);
               } else if(var9 > 9) {
                  var6 = class308.method6152(65280);
               } else if(var9 > 6) {
                  var6 = class308.method6152(4259584);
               } else if(var9 > 3) {
                  var6 = class308.method6152(8453888);
               } else if(var9 > 0) {
                  var6 = class308.method6152(12648192);
               } else {
                  var6 = class308.method6152(16776960);
               }

               var4 = var5 + var6 + " " + " (" + "level-" + var0.combatLevel + ")" + var0.tagFragments[2];
            } else {
               var4 = var0.tagFragments[0] + var0.name + var0.tagFragments[1] + " " + " (" + "skill-" + var0.totalLevel + ")" + var0.tagFragments[2];
            }

            int var10;
            if(client.itemSelectionState == 1) {
               class290.method5964("Use", client.lastSelectedItemName + " " + "->" + " " + class308.method6152(16777215) + var4, 14, var1, var2, var3);
            } else if(client.spellSelected) {
               if((class240.ifTargetMask & 8) == 8) {
                  class290.method5964(client.targetVerb, client.opBase + " " + "->" + " " + class308.method6152(16777215) + var4, 15, var1, var2, var3);
               }
            } else {
               for(var10 = 7; var10 >= 0; --var10) {
                  if(client.playerOptions[var10] != null) {
                     short var11 = 0;
                     if(client.playerOptions[var10].equalsIgnoreCase("Attack")) {
                        if(AttackOpPriority.HIDDEN == client.playerAttackOpPriority) {
                           continue;
                        }

                        if(client.playerAttackOpPriority == AttackOpPriority.UNPRIORITISED || client.playerAttackOpPriority == AttackOpPriority.COMBAT_LEVEL_BASED && var0.combatLevel > class71.localPlayer.combatLevel) {
                           var11 = 2000;
                        }

                        if(class71.localPlayer.team != 0 && var0.team != 0) {
                           if(var0.team == class71.localPlayer.team) {
                              var11 = 2000;
                           } else {
                              var11 = 0;
                           }
                        }
                     } else if(client.playerOptionsPriorities[var10]) {
                        var11 = 2000;
                     }

                     boolean var12 = false;
                     var7 = client.playerMenuTypes[var10] + var11;
                     class290.method5964(client.playerOptions[var10], class308.method6152(16777215) + var4, var7, var1, var2, var3);
                  }
               }
            }

            for(var10 = 0; var10 < client.menuOptionCount; ++var10) {
               if(client.menuTypes[var10] == 23) {
                  client.menuTargets[var10] = class308.method6152(16777215) + var4;
                  break;
               }
            }

         }
      }
   }

   @ObfuscatedName("kz")
   @ObfuscatedSignature(
      signature = "(IIIILld;Lhk;B)V",
      garbageValue = "8"
   )
   static final void method1264(int var0, int var1, int var2, int var3, SpritePixels var4, class186 var5) {
      int var6 = var3 * var3 + var2 * var2;
      if(var6 > 4225 && var6 < 90000) {
         int var7 = client.mapAngle & 2047;
         int var8 = Graphics3D.SINE[var7];
         int var9 = Graphics3D.COSINE[var7];
         int var10 = var9 * var2 + var3 * var8 >> 16;
         int var11 = var3 * var9 - var8 * var2 >> 16;
         double var12 = Math.atan2((double)var10, (double)var11);
         int var14 = var5.field2641 / 2 - 25;
         int var15 = (int)(Math.sin(var12) * (double)var14);
         int var16 = (int)(Math.cos(var12) * (double)var14);
         byte var17 = 20;
         class71.mapedge.method1405(var15 + (var0 + var5.field2641 / 2 - var17 / 2), var5.field2640 / 2 + var1 - var17 / 2 - var16 - 10, var17, var17, 15, 15, var12, 256);
      } else {
         class21.method377(var0, var1, var2, var3, var4, var5);
      }

   }

   @ObfuscatedName("lo")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "-631018208"
   )
   static void method1262(int var0) {
      client.camModeType = var0;
   }
}
