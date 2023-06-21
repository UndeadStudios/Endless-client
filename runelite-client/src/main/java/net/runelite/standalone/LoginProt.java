package net.runelite.standalone;

import java.io.IOException;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fv")
public class LoginProt implements class291 {
   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "Liz;"
   )
   static Js5Index field2329;
   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "Lfv;"
   )
   public static final LoginProt field2321;
   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "[Lfv;"
   )
   static final LoginProt[] field2330;
   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "Lfv;"
   )
   public static final LoginProt field2327;
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "Lfv;"
   )
   static final LoginProt field2322;
   @ObfuscatedName("h")
   @ObfuscatedSignature(
      signature = "Lfv;"
   )
   static final LoginProt field2325;
   @ObfuscatedName("ev")
   @ObfuscatedSignature(
      signature = "Lin;"
   )
   static Js5 worldmapdata;
   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "Lfv;"
   )
   public static final LoginProt field2323;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = -1772519349
   )
   public final int id;

   static {
      field2327 = new LoginProt(14, 0);
      field2322 = new LoginProt(15, 4);
      field2323 = new LoginProt(16, -2);
      field2321 = new LoginProt(18, -2);
      field2325 = new LoginProt(27, 0);
      field2330 = new LoginProt[32];
      LoginProt[] var0 = new LoginProt[]{field2323, field2325, field2327, field2321, field2322};
      LoginProt[] var1 = var0;

      for(int var2 = 0; var2 < var1.length; ++var2) {
         field2330[var1[var2].id] = var1[var2];
      }

   }

   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "0"
   )
   LoginProt(int var1, int var2) {
      this.id = var1;
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "(Liz;Liz;ZII)V",
      garbageValue = "1551800401"
   )
   static void method3820(Js5Index var0, Js5Index var1, boolean var2, int var3) {
      if(class203.field1149) {
         if(var3 == 4) {
            class203.loginIndex = 4;
         }

      } else {
         class203.loginIndex = var3;
         Rasterizer2D.method688();
         byte[] var4 = var0.method4135("title.jpg", "");
         class302.leftBackground = class331.method6416(var4);
         //class203.rightBackground = class302.leftBackground.method1300();
         if((client.flags & 536870912) != 0) {
            class203.logoSprite = WorldMapRegion.method5496(var1, "logo_deadman_mode", "");
         } else {
            class203.logoSprite = WorldMapRegion.method5496(var1, "logo", "");
         }

         class27.field1974 = WorldMapRegion.method5496(var1, "titlebox", "");
         class203.field1175 = WorldMapRegion.method5496(var1, "titlebutton", "");
         PathingEntity.runeSprites = WorldMapRegion.method5556(var1, "runes", "");
         class203.titlemuteSprite = WorldMapRegion.method5556(var1, "title_mute", "");
         class203.field1154 = WorldMapRegion.method5496(var1, "options_radio_buttons,0", "");
         TotalQuantityComparator.field57 = WorldMapRegion.method5496(var1, "options_radio_buttons,4", "");
         class252.field2534 = WorldMapRegion.method5496(var1, "options_radio_buttons,2", "");
         UnitPriceComparator.field78 = WorldMapRegion.method5496(var1, "options_radio_buttons,6", "");
         class132.field3195 = class203.field1154.width;
         class71.field187 = class203.field1154.height;
         SoundTaskDataProvider.field417 = new int[256];

         int var5;
         for(var5 = 0; var5 < 64; ++var5) {
            SoundTaskDataProvider.field417[var5] = var5 * 262144;
         }

         for(var5 = 0; var5 < 64; ++var5) {
            SoundTaskDataProvider.field417[var5 + 64] = var5 * 1024 + 16711680;
         }

         for(var5 = 0; var5 < 64; ++var5) {
            SoundTaskDataProvider.field417[var5 + 128] = var5 * 4 + 16776960;
         }

         for(var5 = 0; var5 < 64; ++var5) {
            SoundTaskDataProvider.field417[var5 + 192] = 16777215;
         }

         WorldMapRegion.field266 = new int[256];

         for(var5 = 0; var5 < 64; ++var5) {
            WorldMapRegion.field266[var5] = var5 * 1024;
         }

         for(var5 = 0; var5 < 64; ++var5) {
            WorldMapRegion.field266[var5 + 64] = var5 * 4 + 65280;
         }

         for(var5 = 0; var5 < 64; ++var5) {
            WorldMapRegion.field266[var5 + 128] = var5 * 262144 + 65535;
         }

         for(var5 = 0; var5 < 64; ++var5) {
            WorldMapRegion.field266[var5 + 192] = 16777215;
         }

         MapLabel.field251 = new int[256];

         for(var5 = 0; var5 < 64; ++var5) {
            MapLabel.field251[var5] = var5 * 4;
         }

         for(var5 = 0; var5 < 64; ++var5) {
            MapLabel.field251[var5 + 64] = var5 * 262144 + 255;
         }

         for(var5 = 0; var5 < 64; ++var5) {
            MapLabel.field251[var5 + 128] = var5 * 1024 + 16711935;
         }

         for(var5 = 0; var5 < 64; ++var5) {
            MapLabel.field251[var5 + 192] = 16777215;
         }

         Size.field128 = new int[256];
         MouseInput.field498 = new int['耀'];
         class132.field3196 = new int['耀'];
         class48.method801((IndexedSprite)null);
         class203.field1164 = new int['耀'];
         WorldMapType3.field146 = new int['耀'];
         if(var2) {
            class203.username = "";
            client.onUsernameChanged(-1);
            class203.password = "";
         }

         SoundTaskDataProvider.authcode = 0;
         ClientOptions.field1037 = "";
         class203.field1182 = true;
         class203.worldSelectShown = false;
         if(!class312.options.muted) {
            class82.method1101(2, class75.music, "scape main", "", 255, false);
         } else {
            Entity.method1812(2);
         }

         if(class321.NetCache_socket != null) {
            try {
               Packet var7 = new Packet(4);
               var7.writeByte(3);
               var7.writeMedium(0);
               class321.NetCache_socket.vmethod6359(var7.payload, 0, 4);
            } catch (IOException var9) {
               try {
                  class321.NetCache_socket.vmethod6355();
               } catch (Exception var8) {
                  ;
               }

               ++class321.field3294;
               class321.NetCache_socket = null;
            }
         }

         class203.field1149 = true;
         class203.field1168 = (GrandExchangeOffer.canvasWidth - 765) / 2;
         class203.loginWindowX = class203.field1168 + 202;
         class203.field1176 = class203.loginWindowX + 180;
         class302.leftBackground.method1331(class203.field1168, 0);
         //class203.rightBackground.method1331(class203.field1168 + 382, 0);
         //class203.logoSprite.method4282(class203.field1168 + 382 - class203.logoSprite.width / 2, 18);
      }
   }

   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "(IIB)I",
      garbageValue = "-89"
   )
   static int method3821(int var0, int var1) {
      ItemContainer var2 = (ItemContainer)ItemContainer.itemContainers.method6335((long)var0);
      if(var2 == null) {
         return 0;
      } else if(var1 == -1) {
         return 0;
      } else {
         int var3 = 0;

         for(int var4 = 0; var4 < var2.stackSizes.length; ++var4) {
            if(var2.itemIds[var4] == var1) {
               var3 += var2.stackSizes[var4];
            }
         }

         return var3;
      }
   }
}
