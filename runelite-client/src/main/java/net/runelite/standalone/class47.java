package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("di")
public class class47 {
   @ObfuscatedName("l")
   public static long[] field1740;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = -659235431
   )
   static int field1736;
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = -563984089
   )
   static int field1735;
   @ObfuscatedName("x")
   public static boolean Viewport_false0;
   @ObfuscatedName("p")
   @ObfuscatedGetter(
      intValue = 64187111
   )
   static int field1734;
   @ObfuscatedName("o")
   @ObfuscatedGetter(
      intValue = -339565939
   )
   public static int historicCacheId;
   @ObfuscatedName("a")
   public static boolean Viewport_containsMouse;
   @ObfuscatedName("t")
   @ObfuscatedGetter(
      intValue = 2116439793
   )
   public static int Viewport_entityCountAtMouse;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = -1036087683
   )
   public static int Viewport_mouseX;
   @ObfuscatedName("g")
   @ObfuscatedGetter(
      intValue = -577143005
   )
   public static int Viewport_mouseY;

   static {
      Viewport_containsMouse = false;
      Viewport_mouseX = 0;
      Viewport_mouseY = 0;
      Viewport_false0 = false;
      Viewport_entityCountAtMouse = 0;
      field1740 = new long[1000];
   }

   @ObfuscatedName("jr")
   @ObfuscatedSignature(
      signature = "(Lia;IB)I",
      garbageValue = "27"
   )
   static final int method797(ComponentType var0, int var1) {
      if(var0.dynamicValues != null && var1 < var0.dynamicValues.length) {
         try {
            int[] var2 = var0.dynamicValues[var1];
            int var3 = 0;
            int var4 = 0;
            byte var5 = 0;

            while(true) {
               int var6 = var2[var4++];
               int var7 = 0;
               byte var8 = 0;
               if(var6 == 0) {
                  return var3;
               }

               if(var6 == 1) {
                  var7 = client.skillLevels[var2[var4++]];
               }

               if(var6 == 2) {
                  var7 = client.skillBaseLevels[var2[var4++]];
               }

               if(var6 == 3) {
                  var7 = client.skillExperiences[var2[var4++]];
               }

               int var9;
               ComponentType var10;
               int var11;
               int var12;
               if(var6 == 4) {
                  var9 = var2[var4++] << 16;
                  var9 += var2[var4++];
                  var10 = ChatHistory.method6246(var9);
                  var11 = var2[var4++];
                  if(var11 != -1 && (!class79.method1074(var11).members || client.isMembers)) {
                     for(var12 = 0; var12 < var10.objIds.length; ++var12) {
                        if(var11 + 1 == var10.objIds[var12]) {
                           var7 += var10.objCounts[var12];
                        }
                     }
                  }
               }

               if(var6 == 5) {
                  var7 = class313.clientVarps[var2[var4++]];
               }

               if(var6 == 6) {
                  var7 = class95.field2864[client.skillBaseLevels[var2[var4++]] - 1];
               }

               if(var6 == 7) {
                  var7 = class313.clientVarps[var2[var4++]] * 100 / 46875;
               }

               if(var6 == 8) {
                  var7 = class71.localPlayer.combatLevel;
               }

               if(var6 == 9) {
                  for(var9 = 0; var9 < 25; ++var9) {
                     if(class95.field2865[var9]) {
                        var7 += client.skillBaseLevels[var9];
                     }
                  }
               }

               if(var6 == 10) {
                  var9 = var2[var4++] << 16;
                  var9 += var2[var4++];
                  var10 = ChatHistory.method6246(var9);
                  var11 = var2[var4++];
                  if(var11 != -1 && (!class79.method1074(var11).members || client.isMembers)) {
                     for(var12 = 0; var12 < var10.objIds.length; ++var12) {
                        if(var11 + 1 == var10.objIds[var12]) {
                           var7 = 999999999;
                           break;
                        }
                     }
                  }
               }

               if(var6 == 11) {
                  var7 = client.energy;
               }

               if(var6 == 12) {
                  var7 = client.weight;
               }

               if(var6 == 13) {
                  var9 = class313.clientVarps[var2[var4++]];
                  int var13 = var2[var4++];
                  var7 = (var9 & 1 << var13) != 0?1:0;
               }

               if(var6 == 14) {
                  var9 = var2[var4++];
                  var7 = CombatInfo1.method57(var9);
               }

               if(var6 == 15) {
                  var8 = 1;
               }

               if(var6 == 16) {
                  var8 = 2;
               }

               if(var6 == 17) {
                  var8 = 3;
               }

               if(var6 == 18) {
                  var7 = (class71.localPlayer.x * -1234429701 >> 7) + class53.baseX;
               }

               if(var6 == 19) {
                  var7 = (class71.localPlayer.y >> 7) + class312.baseY;
               }

               if(var6 == 20) {
                  var7 = var2[var4++];
               }

               if(var8 == 0) {
                  if(var5 == 0) {
                     var3 += var7;
                  }

                  if(var5 == 1) {
                     var3 -= var7;
                  }

                  if(var5 == 2 && var7 != 0) {
                     var3 /= var7;
                  }

                  if(var5 == 3) {
                     var3 *= var7;
                  }

                  var5 = 0;
               } else {
                  var5 = var8;
               }
            }
         } catch (Exception var14) {
            return -1;
         }
      } else {
         return -2;
      }
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "([Ljava/lang/CharSequence;III)Ljava/lang/String;",
      garbageValue = "-2144805642"
   )
   public static String method792(CharSequence[] var0, int var1, int var2) {
      if(var2 == 0) {
         return "";
      } else if(var2 == 1) {
         CharSequence var3 = var0[var1];
         return var3 == null?"null":var3.toString();
      } else {
         int var8 = var2 + var1;
         int var4 = 0;

         for(int var5 = var1; var5 < var8; ++var5) {
            CharSequence var6 = var0[var5];
            if(var6 == null) {
               var4 += 4;
            } else {
               var4 += var6.length();
            }
         }

         StringBuilder var9 = new StringBuilder(var4);

         for(int var10 = var1; var10 < var8; ++var10) {
            CharSequence var7 = var0[var10];
            if(var7 == null) {
               var9.append("null");
            } else {
               var9.append(var7);
            }
         }

         return var9.toString();
      }
   }

   @ObfuscatedName("y")
   @ObfuscatedSignature(
      signature = "(ILcs;ZI)I",
      garbageValue = "1635420646"
   )
   static int method795(int var0, class314 var1, boolean var2) {
      ComponentType var3 = ChatHistory.method6246(class281.intStack[--class281.intStackSize]);
      if(var0 == 2500) {
         class281.intStack[++class281.intStackSize - 1] = var3.x;
         return 1;
      } else if(var0 == 2501) {
         class281.intStack[++class281.intStackSize - 1] = var3.y;
         return 1;
      } else if(var0 == 2502) {
         class281.intStack[++class281.intStackSize - 1] = var3.width;
         return 1;
      } else if(var0 == 2503) {
         class281.intStack[++class281.intStackSize - 1] = var3.height;
         return 1;
      } else if(var0 == 2504) {
         class281.intStack[++class281.intStackSize - 1] = var3.isHidden?1:0;
         return 1;
      } else if(var0 == 2505) {
         class281.intStack[++class281.intStackSize - 1] = var3.layer;
         return 1;
      } else {
         return 2;
      }
   }

   @ObfuscatedName("ko")
   @ObfuscatedSignature(
      signature = "(Lia;IIII)V",
      garbageValue = "-529963254"
   )
   static final void method774(ComponentType var0, int var1, int var2, int var3) {
      class186 var4 = var0.method5675(false);
      if(var4 != null) {
         if(client.minimapRenderType < 3) {
            class232.compass.method1384(var1, var2, var4.field2641, var4.field2640, 25, 25, client.mapAngle, 256, var4.field2643, var4.field2642);
         } else {
            Rasterizer2D.method704(var1, var2, 0, var4.field2643, var4.field2642);
         }

      }
   }
}
