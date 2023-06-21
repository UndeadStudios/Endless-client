package net.runelite.standalone;

import java.io.IOException;
import java.util.Arrays;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jr")
public class class124 {
   @ObfuscatedName("fn")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "-1893789506"
   )
   static void method1843(int var0) {
      if(var0 != client.gameState) {
         if(client.gameState == 0) {
            ItemContainer.clientInstance.method4386();
         }

         if(var0 == 20 || var0 == 40 || var0 == 45) {
            client.loginState = 0;
            client.field843 = 0;
            client.field683 = 0;
            client.field773.method1589(var0);
            if(var0 != 20) {
               AuthProt.method6377(false);
            }
         }

         if(var0 != 20 && var0 != 40 && class235.field2434 != null) {
            class235.field2434.vmethod6355();
            class235.field2434 = null;
         }

         if(client.gameState == 25) {
            client.field705 = 0;
            client.field701 = 0;
            client.field702 = 1;
            client.field703 = 0;
            client.field800 = 1;
         }

         if(var0 != 5 && var0 != 10) {
            if(var0 == 20) {
               LoginProt.method3820(class44.binary, ModeGame.sprites, true, client.gameState == 11?4:0);
            } else if(var0 == 11) {
               LoginProt.method3820(class44.binary, ModeGame.sprites, false, 4);
            } else if(class203.field1149) {
               class27.field1974 = null;
               class203.field1175 = null;
               PathingEntity.runeSprites = null;
               class302.leftBackground = null;
               class203.rightBackground = null;
               class203.logoSprite = null;
               class203.titlemuteSprite = null;
               class203.field1154 = null;
               class252.field2534 = null;
               class258.field357 = null;
               class211.slFlagSprites = null;
               FriendManager.slArrowSprites = null;
               ClientOptions.slStarSprites = null;
               WorldMapDataGroup.field308 = null;
               SoundTaskDataProvider.field417 = null;
               WorldMapRegion.field266 = null;
               MapLabel.field251 = null;
               Size.field128 = null;
               MouseInput.field498 = null;
               class132.field3196 = null;
               class203.field1164 = null;
               WorldMapType3.field146 = null;
               Entity.method1812(2);
               if(class321.NetCache_socket != null) {
                  try {
                     Packet var1 = new Packet(4);
                     var1.writeByte(2);
                     var1.writeMedium(0);
                     class321.NetCache_socket.vmethod6359(var1.payload, 0, 4);
                  } catch (IOException var4) {
                     try {
                        class321.NetCache_socket.vmethod6355();
                     } catch (Exception var3) {
                        ;
                     }

                     ++class321.field3294;
                     class321.NetCache_socket = null;
                  }
               }

               class203.field1149 = false;
            }
         } else {
            LoginProt.method3820(class44.binary, ModeGame.sprites, true, 0);
         }

         client.gameState = var0;
         client.gameStateChanged(-1);
      }
   }

   @ObfuscatedName("jt")
   @ObfuscatedSignature(
      signature = "(Lia;Ljc;IIZI)V",
      garbageValue = "346243723"
   )
   static final void method1842(ComponentType var0, ObjType var1, int var2, int var3, boolean var4) {
      String[] var5 = var1.iops;
      byte var6 = -1;
      String var7 = null;
      if(var5 != null && var5[var3] != null) {
         if(var3 == 0) {
            var6 = 33;
         } else if(var3 == 1) {
            var6 = 34;
         } else if(var3 == 2) {
            var6 = 35;
         } else if(var3 == 3) {
            var6 = 36;
         } else {
            var6 = 37;
         }

         var7 = var5[var3];
      } else if(var3 == 4) {
         var6 = 37;
         var7 = "Drop";
      }

      if(var6 != -1 && var7 != null) {
         ItemContainer.method3950(var7, class308.method6152(16748608) + var1.name, var6, var1.id, var2, var0.id, var4);
      }

   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1095623162"
   )
   static void method1839() {
      class91.field506 = 99;
      class91.tileUnderlayIds = new byte[4][104][104];
      class91.tileOverlayIds = new byte[4][104][104];
      class91.tileOverlayPath = new byte[4][104][104];
      class91.overlayRotations = new byte[4][104][104];
      InvType.field3314 = new int[4][105][105];
      class91.field511 = new byte[4][105][105];
      class83.field1963 = new int[105][105];
      class177.floorHues = new int[104];
      class91.floorSaturations = new int[104];
      ChatCrownType.field3209 = new int[104];
      ChatLineBuffer.floorMultiplier = new int[104];
      class91.field513 = new int[104];
      SceneManager scene = class312.sceneManager;
      byte[][][] underlays = class91.tileUnderlayIds;
      byte[][][] overlays = class91.tileOverlayIds;
      scene.setUnderlayIds(Arrays.copyOf(underlays, underlays.length));
      scene.setOverlayIds(Arrays.copyOf(overlays, overlays.length));
   }

   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/CharSequence;B)Ljava/lang/String;",
      garbageValue = "-80"
   )
   public static String method1844(CharSequence var0) {
      long var3 = 0L;
      int var5 = var0.length();

      for(int var6 = 0; var6 < var5; ++var6) {
         var3 *= 37L;
         char var7 = var0.charAt(var6);
         if(var7 >= 'A' && var7 <= 'Z') {
            var3 += (long)(var7 + 1 - 65);
         } else if(var7 >= 'a' && var7 <= 'z') {
            var3 += (long)(var7 + 1 - 97);
         } else if(var7 >= '0' && var7 <= '9') {
            var3 += (long)(var7 + 27 - 48);
         }

         if(var3 >= 177917621779460413L) {
            break;
         }
      }

      while(var3 % 37L == 0L && var3 != 0L) {
         var3 /= 37L;
      }

      String var8 = MapIconReference.method2082(var3);
      if(var8 == null) {
         var8 = "";
      }

      return var8;
   }
}
