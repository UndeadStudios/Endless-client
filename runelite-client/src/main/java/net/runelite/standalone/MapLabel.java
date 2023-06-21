package net.runelite.standalone;

import net.runelite.client.RuneLite;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ay")
public class MapLabel {
   @ObfuscatedName("j")
   static int[] field251;
   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "Ly;"
   )
   Size fontSize;
   @ObfuscatedName("a")
   String text;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = 110876147
   )
   int field247;
   @ObfuscatedName("g")
   @ObfuscatedGetter(
      intValue = 65766785
   )
   int field248;

   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;IILy;)V"
   )
   MapLabel(String var1, int var2, int var3, Size var4) {
      this.text = var1;
      this.field247 = var2;
      this.field248 = var3;
      this.fontSize = var4;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "1931545943"
   )
   static void method2860(int var0) {
      ItemContainer var1 = (ItemContainer)ItemContainer.itemContainers.method6335((long)var0);
      if(var1 != null) {
         var1.method432();
      }
   }

   @ObfuscatedName("fb")
   @ObfuscatedSignature(
      signature = "(IB)V",
      garbageValue = "-58"
   )
   static void method2859(int var0) {
      if(var0 == -3) {
         TextureProvider.method1169("Connection timed out.", "Please try using a different world.", "");
      } else if(var0 == -2) {
         TextureProvider.method1169("", "Error connecting to server.", "");
      } else if(var0 == -1) {
         TextureProvider.method1169("No response from server.", "Please try using a different world.", "");
      } else if(var0 == 3) {
         class203.loginIndex = 3;
         class203.field1172 = 1;
      } else if(var0 == 4) {
         class203.loginIndex = 12;
         class203.field1170 = 0;
      } else if(var0 == 5) {
         class203.field1172 = 2;
         TextureProvider.method1169("Your account has not logged out from its last", "session or the server is too busy right now.", "Please try again in a few minutes.");
      } else if(var0 == 68 || !client.field656 && var0 == 6) {
         TextureProvider.method1169(RuneLite.SERVER_NAME + " has been updated!", "Please reload this page.", "");
      } else if(var0 == 7) {
         TextureProvider.method1169("This world is full.", "Please use a different world.", "");
      } else if(var0 == 8) {
         TextureProvider.method1169("Unable to connect.", "Login server offline.", "");
      } else if(var0 == 9) {
         TextureProvider.method1169("Login limit exceeded.", "Too many connections from your address.", "");
      } else if(var0 == 10) {
         TextureProvider.method1169("Unable to connect.", "Bad session id.", "");
      } else if(var0 == 11) {
         TextureProvider.method1169("We suspect someone knows your password.", "Press \'change your password\' on front page.", "");
      } else if(var0 == 12) {
         TextureProvider.method1169("You need a members account to login to this world.", "Please subscribe, or use a different world.", "");
      } else if(var0 == 13) {
         TextureProvider.method1169("Could not complete login.", "Please try using a different world.", "");
      } else if(var0 == 14) {
         TextureProvider.method1169("The server is being updated.", "Please wait 1 minute and try again.", "");
      } else if(var0 == 16) {
         TextureProvider.method1169("Too many login attempts.", "Please wait a few minutes before trying again.", "");
      } else if(var0 == 17) {
         TextureProvider.method1169("You are standing in a members-only area.", "To play on this world move to a free area first", "");
      } else if(var0 == 18) {
         class203.loginIndex = 12;
         class203.field1170 = 1;
      } else if(var0 == 19) {
         TextureProvider.method1169("This world is running a closed Beta.", "Sorry invited players only.", "Please use a different world.");
      } else if(var0 == 20) {
         TextureProvider.method1169("Invalid loginserver requested.", "Please try using a different world.", "");
      } else if(var0 == 22) {
         TextureProvider.method1169("Malformed login packet.", "Please try again.", "");
      } else if(var0 == 23) {
         TextureProvider.method1169("No reply from loginserver.", "Please wait 1 minute and try again.", "");
      } else if(var0 == 24) {
         TextureProvider.method1169("Error loading your profile.", "Please contact customer support.", "");
      } else if(var0 == 25) {
         TextureProvider.method1169("Unexpected loginserver response.", "Please try using a different world.", "");
      } else if(var0 == 26) {
         TextureProvider.method1169("This computers address has been blocked", "as it was used to break our rules.", "");
      } else if(var0 == 27) {
         TextureProvider.method1169("", "Service unavailable.", "");
      } else if(var0 == 31) {
         TextureProvider.method1169("Your account must have a displayname set", "in order to play the game.  Please set it", "via the website, or the main game.");
      } else if(var0 == 32) {
         TextureProvider.method1169("Your attempt to log into your account was", "unsuccessful.  Don\'t worry, you can sort", "this out by visiting the billing system.");
      } else if(var0 == 37) {
         TextureProvider.method1169("Your account is currently inaccessible.", "Please try again in a few minutes.", "");
      } else if(var0 == 38) {
         TextureProvider.method1169("You need to vote to play!", "Visit Odin-os.com and vote,", "and then come back here!");
      } else if (var0 == 39) {
         TextureProvider.method1169(RuneLite.SERVER_NAME + " has been updated!", "Please download the new client from discord.", "");
      } else if (var0 == 40) {
         TextureProvider.method1169("An account by that name does not exist!", "Register it at Odin-os.com today!", "");
      } else if (var0 == 41) {
         TextureProvider.method1169("The tournament has already ended!", "Come back when there's a new tournament.", "");
      } else if(var0 == 55) {
         class203.loginIndex = 8;
      } else {
         if(var0 == 56) {
            TextureProvider.method1169("Enter the 6-digit code generated by your", "authenticator app.", "");
            class124.method1843(11);
            return;
         }

         if(var0 == 57) {
            TextureProvider.method1169("The code you entered was incorrect.", "Please try again.", "");
            class124.method1843(11);
            return;
         }

         if(var0 == 61) {
            class203.loginIndex = 7;
         } else {
            TextureProvider.method1169("Unexpected server response", "Please try using a different world.", "");
         }
      }

      class124.method1843(10);
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "(Lge;I)V",
      garbageValue = "524938207"
   )
   static final void method2856(Bit var0) {
      var0.method2663();
      int var1 = client.localPlayerIndex;
      PlayerEntity var10000 = client.players[var1] = new PlayerEntity();
      client.cachedPlayersChanged(var1);
      class71.localPlayer = var10000;
      PlayerEntity var2 = var10000;
      var2.playerId = var1;
      int var3 = var0.method2652(30);
      byte var4 = (byte)(var3 >> 28);
      int var5 = var3 >> 14 & 16383;
      int var6 = var3 & 16383;
      var2.pathX[0] = var5 - class53.baseX;
      var2.x = ((var2.pathX[0] << 7) + (var2.method6008() << 6)) * 451031603;
      var2.pathY[0] = var6 - class312.baseY;
      var2.y = (var2.pathY[0] << 7) + (var2.method6008() << 6);
      ServerProt.level = var2.field631 = var4;
      if(PlayerList.appearances[var1] != null) {
         var2.method6004(PlayerList.appearances[var1]);
      }

      PlayerList.highResolutionPlayerCount = 0;
      PlayerList.highResolutionPlayerIndexes[++PlayerList.highResolutionPlayerCount - 1] = var1;
      PlayerList.skipHistory[var1] = 0;
      PlayerList.lowResolutionPlayerCount = 0;

      for(int var7 = 1; var7 < 2048; ++var7) {
         if(var7 != var1) {
            int var8 = var0.method2652(18);
            int var9 = var8 >> 16;
            int var10 = var8 >> 8 & 597;
            int var11 = var8 & 597;
            PlayerList.coords[var7] = (var10 << 14) + var11 + (var9 << 28);
            PlayerList.facingCoords[var7] = 0;
            PlayerList.facingEntities[var7] = -1;
            PlayerList.lowResolutionPlayerIndexes[++PlayerList.lowResolutionPlayerCount - 1] = var7;
            PlayerList.skipHistory[var7] = 0;
         }
      }

      var0.method2671();
   }

   @ObfuscatedName("fa")
   @ObfuscatedSignature(
      signature = "(Lia;III)V",
      garbageValue = "1082843241"
   )
   static final void method2855(ComponentType var0, int var1, int var2) {
      if(client.minimapRenderType == 0 || client.minimapRenderType == 3) {
         if(!client.isMenuOpen && (MouseInput.mouseLastButton == 1 || !TextureProvider.middleMouseMovesCamera && MouseInput.mouseLastButton == 4)) {
            class186 var3 = var0.method5675(true);
            if(var3 == null) {
               return;
            }

            int var4 = MouseInput.mouseLastPressedX - var1;
            int var5 = MouseInput.mouseLastPressedY - var2;
            if(var3.method3566(var4, var5)) {
               var4 -= var3.field2641 / 2;
               var5 -= var3.field2640 / 2;
               int var6 = client.mapAngle & 2047;
               int var7 = Graphics3D.SINE[var6];
               int var8 = Graphics3D.COSINE[var6];
               int var9 = var5 * var7 + var8 * var4 >> 11;
               int var10 = var5 * var8 - var7 * var4 >> 11;
               int var11 = class71.localPlayer.x * -1234429701 + var9 >> 7;
               int var12 = class71.localPlayer.y - var10 >> 7;
               TcpConnectionMessage var13 = class232.method4535(ClientProt.field2271, client.serverConnection.isaac);
               var13.packetBuffer.writeByte(18);
               var13.packetBuffer.method5122(var12 + class312.baseY);
               var13.packetBuffer.method5122(var11 + class53.baseX);
               var13.packetBuffer.method5112(KeyFocusListener.keyPressed[82]?(KeyFocusListener.keyPressed[81]?2:1):0);
               var13.packetBuffer.writeByte(var4);
               var13.packetBuffer.writeByte(var5);
               var13.packetBuffer.writeShort(client.mapAngle);
               var13.packetBuffer.writeByte(57);
               var13.packetBuffer.writeByte(0);
               var13.packetBuffer.writeByte(0);
               var13.packetBuffer.writeByte(89);
               var13.packetBuffer.writeShort(class71.localPlayer.x * -1234429701);
               var13.packetBuffer.writeShort(class71.localPlayer.y);
               var13.packetBuffer.writeByte(63);
               client.serverConnection.method18(var13);
               client.destinationX = var11;
               client.destinationY = var12;
            }
         }

      }
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(II)Ljd;",
      garbageValue = "256302879"
   )
   public static MapElementType method2858(int var0) {
      return var0 >= 0 && var0 < MapElementType.mapElementTypes.length && MapElementType.mapElementTypes[var0] != null?MapElementType.mapElementTypes[var0]:new MapElementType(var0);
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(Lin;IIIBZI)V",
      garbageValue = "488112187"
   )
   static void method2857(Js5 var0, int var1, int var2, int var3, byte var4, boolean var5) {
      long var6 = (long)((var1 << 16) + var2);
      FileRequest var8 = (FileRequest)class321.NetCache_pendingPriorityWrites.method6335(var6);
      if(var8 == null) {
         var8 = (FileRequest)class321.NetCache_pendingPriorityResponses.method6335(var6);
         if(var8 == null) {
            var8 = (FileRequest)class321.NetCache_pendingWrites.method6335(var6);
            if(var8 != null) {
               if(var5) {
                  var8.method1606();
                  class321.NetCache_pendingPriorityWrites.method6344(var8, var6);
                  --class321.NetCache_pendingWritesCount;
                  ++class321.NetCache_pendingPriorityWritesCount;
               }

            } else {
               if(!var5) {
                  var8 = (FileRequest)class321.NetCache_pendingResponses.method6335(var6);
                  if(var8 != null) {
                     return;
                  }
               }

               var8 = new FileRequest();
               var8.index = var0;
               var8.crc = var3;
               var8.padding = var4;
               if(var5) {
                  class321.NetCache_pendingPriorityWrites.method6344(var8, var6);
                  ++class321.NetCache_pendingPriorityWritesCount;
               } else {
                  class321.NetCache_pendingWritesQueue.method1226(var8);
                  class321.NetCache_pendingWrites.method6344(var8, var6);
                  ++class321.NetCache_pendingWritesCount;
               }

            }
         }
      }
   }
}
