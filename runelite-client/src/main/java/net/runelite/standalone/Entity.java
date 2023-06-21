package net.runelite.standalone;

import java.io.File;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.api.RSModel;
import net.runelite.rs.api.RSRenderable;

@ObfuscatedName("em")
public abstract class Entity extends CacheableNode implements RSRenderable {
   @ObfuscatedName("cs")
   @ObfuscatedGetter(
      intValue = -460629523
   )
   public int modelHeight;

   protected Entity() {
      this.modelHeight = 1000;
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "(I)Ldv;"
   )
   protected Model vmethod6001(int var1) {
      return null;
   }

   public RSModel getModel() {
      return this.vmethod6001(-2033135869);
   }

   public void setModelHeight(int var1) {
      this.modelHeight = var1;
   }

   public int getModelHeight() {
      return this.modelHeight;
   }

   public void draw(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, long var9) {
      this.vmethod3846(var1, var2, var3, var4, var5, var6, var7, var8, var9);
   }

   @ObfuscatedName("cb")
   void vmethod3846(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, long var9) {
      Model var11 = this.vmethod6001(-1037406049);
      if(var11 != null) {
         this.modelHeight = var11.modelHeight;
         var11.vmethod3846(var1, var2, var3, var4, var5, var6, var7, var8, var9);
      }

   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "1140324016"
   )
   public static void method1812(int var0) {
      class262.field2557 = 1;
      class129.field278 = null;
      class262.field2551 = -1;
      class262.field2552 = -1;
      class308.field536 = 0;
      class262.field2553 = false;
      TextureProvider.field1525 = var0;
   }

   @ObfuscatedName("kl")
   @ObfuscatedSignature(
      signature = "(Lia;IIII)V",
      garbageValue = "-1232450169"
   )
   static final void method1811(ComponentType var0, int var1, int var2, int var3) {
      FontName.method513();
      class186 var4 = var0.method5675(false);
      if(var4 != null) {
         Rasterizer2D.method684(var1, var2, var4.field2641 + var1, var2 + var4.field2640);
         if(client.minimapRenderType != 2 && client.minimapRenderType != 5) {
            int var5 = client.mapAngle & 2047;
            int var6 = class71.localPlayer.x * -1234429701 / 32 + 48;
            int var7 = 464 - class71.localPlayer.y / 32;
            class281.minimapSprite.method1384(var1, var2, var4.field2641, var4.field2640, var6, var7, var5, 256, var4.field2643, var4.field2642);

            int var8;
            int var9;
            int var10;
            for(var8 = 0; var8 < client.field875; ++var8) {
               var9 = client.field712[var8] * 4 + 2 - class71.localPlayer.x * -1234429701 / 32;
               var10 = client.field805[var8] * 4 + 2 - class71.localPlayer.y / 32;
               class21.method377(var1, var2, var9, var10, client.mapIcons[var8], var4);
            }

            int var11;
            int var12;
            for(var8 = 0; var8 < 104; ++var8) {
               for(var9 = 0; var9 < 104; ++var9) {
                  Deque var15 = client.groundItemDeque[ServerProt.level][var8][var9];
                  if(var15 != null) {
                     var11 = var8 * 4 + 2 - class71.localPlayer.x * -1234429701 / 32;
                     var12 = var9 * 4 + 2 - class71.localPlayer.y / 32;
                     class21.method377(var1, var2, var11, var12, class285.mapDots[0], var4);
                  }
               }
            }

            for(var8 = 0; var8 < client.highResolutionNpcCount; ++var8) {
               NPCEntity var16 = client.npcs[client.highResolutionNpcIndexes[var8]];
               if(var16 != null && var16.vmethod6005()) {
                  NPCType var18 = var16.type;
                  if(var18 != null && var18.multiNpcs != null) {
                     var18 = var18.method4782();
                  }

                  if(var18 != null && var18.isMinimapVisible && var18.isClickable) {
                     var11 = var16.x * -1234429701 / 32 - class71.localPlayer.x * -1234429701 / 32;
                     var12 = var16.y / 32 - class71.localPlayer.y / 32;
                     class21.method377(var1, var2, var11, var12, class285.mapDots[1], var4);
                  }
               }
            }

            var8 = PlayerList.highResolutionPlayerCount;
            int[] var19 = PlayerList.highResolutionPlayerIndexes;

            for(var10 = 0; var10 < var8; ++var10) {
               PlayerEntity var17 = client.players[var19[var10]];
               if(var17 != null && var17.vmethod6005() && !var17.hidden && var17 != class71.localPlayer) {
                  var12 = var17.x * -1234429701 / 32 - class71.localPlayer.x * -1234429701 / 32;
                  int var13 = var17.y / 32 - class71.localPlayer.y / 32;
                  boolean var14 = false;
                  if(class71.localPlayer.team != 0 && var17.team != 0 && var17.team == class71.localPlayer.team) {
                     var14 = true;
                  }

                  if(var17.method6002()) {
                     class21.method377(var1, var2, var12, var13, class285.mapDots[3], var4);
                  } else if(var14) {
                     class21.method377(var1, var2, var12, var13, class285.mapDots[4], var4);
                  } else if(var17.method6025()) {
                     class21.method377(var1, var2, var12, var13, class285.mapDots[5], var4);
                  } else {
                     class21.method377(var1, var2, var12, var13, class285.mapDots[2], var4);
                  }
               }
            }

            if(client.hintArrowTargetType != 0 && client.gameCycle % 20 < 10) {
               if(client.hintArrowTargetType == 1 && client.hintArrowNpcTargetIdx >= 0 && client.hintArrowNpcTargetIdx < client.npcs.length) {
                  NPCEntity var20 = client.npcs[client.hintArrowNpcTargetIdx];
                  if(var20 != null) {
                     var11 = var20.x * -1234429701 / 32 - class71.localPlayer.x * -1234429701 / 32;
                     var12 = var20.y / 32 - class71.localPlayer.y / 32;
                     class95.method1264(var1, var2, var11, var12, Occluder.mapMarkers[1], var4);
                  }
               }

               if(client.hintArrowTargetType == 2) {
                  var10 = client.hintArrowX * 4 - class53.baseX * 4 + 2 - class71.localPlayer.x * -1234429701 / 32;
                  var11 = client.hintArrowY * 4 - class312.baseY * 4 + 2 - class71.localPlayer.y / 32;
                  class95.method1264(var1, var2, var10, var11, Occluder.mapMarkers[1], var4);
               }

               if(client.hintArrowTargetType == 10 && client.hintArrowPlayerTargetIdx >= 0 && client.hintArrowPlayerTargetIdx < client.players.length) {
                  PlayerEntity var21 = client.players[client.hintArrowPlayerTargetIdx];
                  if(var21 != null) {
                     var11 = var21.x * -1234429701 / 32 - class71.localPlayer.x * -1234429701 / 32;
                     var12 = var21.y / 32 - class71.localPlayer.y / 32;
                     class95.method1264(var1, var2, var11, var12, Occluder.mapMarkers[1], var4);
                  }
               }
            }

            if(client.destinationX != 0) {
               var10 = client.destinationX * 4 + 2 - class71.localPlayer.x * -1234429701 / 32;
               var11 = client.destinationY * 4 + 2 - class71.localPlayer.y / 32;
               class21.method377(var1, var2, var10, var11, Occluder.mapMarkers[0], var4);
            }

            if(!class71.localPlayer.hidden) {
               Rasterizer2D.method692(var4.field2641 / 2 + var1 - 1, var4.field2640 / 2 + var2 - 1, 3, 3, 16777215);
            }
         } else {
            Rasterizer2D.method704(var1, var2, 0, var4.field2643, var4.field2642);
         }

         client.field923[var3] = true;
      }
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "(Ljava/io/File;I)V",
      garbageValue = "-919664594"
   )
   public static void method1814(File var0) {
      class48.field2056 = var0;
      if(!class48.field2056.exists()) {
         throw new RuntimeException("");
      } else {
         class48.field2055 = true;
      }
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/CharSequence;I)Z",
      garbageValue = "1390459077"
   )
   public static boolean method1813(CharSequence var0) {
      boolean var2 = false;
      boolean var3 = false;
      int var4 = 0;
      int var5 = var0.length();
      int var6 = 0;

      boolean var1;
      while(true) {
         if(var6 >= var5) {
            var1 = var3;
            break;
         }

         label82: {
            char var7 = var0.charAt(var6);
            if(var6 == 0) {
               if(var7 == '-') {
                  var2 = true;
                  break label82;
               }

               if(var7 == '+') {
                  break label82;
               }
            }

            int var9;
            if(var7 >= '0' && var7 <= '9') {
               var9 = var7 - '0';
            } else if(var7 >= 'A' && var7 <= 'Z') {
               var9 = var7 - '7';
            } else {
               if(var7 < 'a' || var7 > 'z') {
                  var1 = false;
                  break;
               }

               var9 = var7 - 'W';
            }

            if(var9 >= 10) {
               var1 = false;
               break;
            }

            if(var2) {
               var9 = -var9;
            }

            int var8 = var4 * 10 + var9;
            if(var4 != var8 / 10) {
               var1 = false;
               break;
            }

            var4 = var8;
            var3 = true;
         }

         ++var6;
      }

      return var1;
   }
}
