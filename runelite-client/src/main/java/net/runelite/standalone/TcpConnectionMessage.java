package net.runelite.standalone;

import net.runelite.client.RuneLite;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fa")
public class TcpConnectionMessage extends Node {
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = -759447941
   )
   static int field2348;
   @ObfuscatedName("gp")
   @ObfuscatedSignature(
      signature = "[Llv;"
   )
   static IndexedSprite[] modIconSprites;
   static IndexedSprite[] memberIconSprites;
   @ObfuscatedName("h")
   @ObfuscatedSignature(
      signature = "[Lfa;"
   )
   static TcpConnectionMessage[] packetBufferNodes;
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = -962645799
   )
   public int field2346;
   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "Lfs;"
   )
   ClientProt clientPacket;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = -631811573
   )
   int field2347;
   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "Lge;"
   )
   public Bit packetBuffer;

   static {
      packetBufferNodes = new TcpConnectionMessage[300];
      field2348 = 0;
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "-116"
   )
   public void method5608() {
      if(field2348 < packetBufferNodes.length) {
         packetBufferNodes[++field2348 - 1] = this;
      }
   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "(Lkt;Lkt;Lkt;ZB)V",
      garbageValue = "95"
   )
   static void method5617(Font var0, Font var1, Font var2, boolean var3) {
      if(var3) {
         class203.field1168 = (GrandExchangeOffer.canvasWidth - 765) / 2;
         class203.loginWindowX = class203.field1168 + 202;
         class203.field1176 = class203.loginWindowX + 180;
      }

      byte var4;
      int var5;
      int var7;
      int var8;
      int var10;
      int var12;
      int var13;
      int var14;
      int var30;
      int var32;
      int var34;
      int var35;
      if(class203.worldSelectShown) {
         if(class258.field357 == null) {
            class258.field357 = class72.method1035(ModeGame.sprites, "sl_back", "");
         }

         if(class211.slFlagSprites == null) {
            class211.slFlagSprites = WorldMapRegion.method5556(ModeGame.sprites, "sl_flags", "");
         }

         if(FriendManager.slArrowSprites == null) {
            FriendManager.slArrowSprites = WorldMapRegion.method5556(ModeGame.sprites, "sl_arrows", "");
         }

         if(ClientOptions.slStarSprites == null) {
            ClientOptions.slStarSprites = WorldMapRegion.method5556(ModeGame.sprites, "sl_stars", "");
         }

         if(FaceNormal.field1878 == null) {
            FaceNormal.field1878 = WorldMapRegion.method5496(ModeGame.sprites, "leftarrow", "");
         }

         if(client.field925 == null) {
            client.field925 = WorldMapRegion.method5496(ModeGame.sprites, "rightarrow", "");
         }

         Rasterizer2D.method692(class203.field1168, 23, 765, 480, 0);
         Rasterizer2D.method761(class203.field1168, 0, 125, 23, 12425273, 9135624);
         Rasterizer2D.method761(class203.field1168 + 125, 0, 640, 23, 5197647, 2697513);
         var0.method6222("Select a world", class203.field1168 + 62, 15, 0, -1);
         if(ClientOptions.slStarSprites != null) {
            ClientOptions.slStarSprites[1].method4282(class203.field1168 + 140, 1);
            var1.method6165("Members only world", class203.field1168 + 152, 10, 16777215, -1);
            ClientOptions.slStarSprites[0].method4282(class203.field1168 + 140, 12);
            var1.method6165("Free world", class203.field1168 + 152, 21, 16777215, -1);
         }

         if(FriendManager.slArrowSprites != null) {
            var30 = class203.field1168 + 280;
            if(World.field1018[0] == 0 && World.field1016[0] == 0) {
               FriendManager.slArrowSprites[2].method4282(var30, 4);
            } else {
               FriendManager.slArrowSprites[0].method4282(var30, 4);
            }

            if(World.field1018[0] == 0 && World.field1016[0] == 1) {
               FriendManager.slArrowSprites[3].method4282(var30 + 15, 4);
            } else {
               FriendManager.slArrowSprites[1].method4282(var30 + 15, 4);
            }

            var0.method6165("World", var30 + 32, 17, 16777215, -1);
            var5 = class203.field1168 + 390;
            if(World.field1018[0] == 1 && World.field1016[0] == 0) {
               FriendManager.slArrowSprites[2].method4282(var5, 4);
            } else {
               FriendManager.slArrowSprites[0].method4282(var5, 4);
            }

            if(World.field1018[0] == 1 && World.field1016[0] == 1) {
               FriendManager.slArrowSprites[3].method4282(var5 + 15, 4);
            } else {
               FriendManager.slArrowSprites[1].method4282(var5 + 15, 4);
            }

            var0.method6165("Players", var5 + 32, 17, 16777215, -1);
            var32 = class203.field1168 + 500;
            if(World.field1018[0] == 2 && World.field1016[0] == 0) {
               FriendManager.slArrowSprites[2].method4282(var32, 4);
            } else {
               FriendManager.slArrowSprites[0].method4282(var32, 4);
            }

            if(World.field1018[0] == 2 && World.field1016[0] == 1) {
               FriendManager.slArrowSprites[3].method4282(var32 + 15, 4);
            } else {
               FriendManager.slArrowSprites[1].method4282(var32 + 15, 4);
            }

            var0.method6165("Location", var32 + 32, 17, 16777215, -1);
            var7 = class203.field1168 + 610;
            if(World.field1018[0] == 3 && World.field1016[0] == 0) {
               FriendManager.slArrowSprites[2].method4282(var7, 4);
            } else {
               FriendManager.slArrowSprites[0].method4282(var7, 4);
            }

            if(World.field1018[0] == 3 && World.field1016[0] == 1) {
               FriendManager.slArrowSprites[3].method4282(var7 + 15, 4);
            } else {
               FriendManager.slArrowSprites[1].method4282(var7 + 15, 4);
            }

            var0.method6165("Type", var7 + 32, 17, 16777215, -1);
         }

         Rasterizer2D.method692(class203.field1168 + 708, 4, 50, 16, 0);
         var1.method6222("Cancel", class203.field1168 + 708 + 25, 16, 16777215, -1);
         class203.field1187 = -1;
         if(class258.field357 != null) {
            var4 = 88;
            byte var37 = 19;
            var32 = 765 / (var4 + 1) - 1;
            var7 = 480 / (var37 + 1);

            do {
               var8 = var7;
               var34 = var32;
               if(var7 * (var32 - 1) >= World.worldCount) {
                  --var32;
               }

               if(var32 * (var7 - 1) >= World.worldCount) {
                  --var7;
               }

               if(var32 * (var7 - 1) >= World.worldCount) {
                  --var7;
               }
            } while(var8 != var7 || var32 != var34);

            var8 = (765 - var4 * var32) / (var32 + 1);
            if(var8 > 5) {
               var8 = 5;
            }

            var34 = (480 - var37 * var7) / (var7 + 1);
            if(var34 > 5) {
               var34 = 5;
            }

            var10 = (765 - var4 * var32 - var8 * (var32 - 1)) / 2;
            var35 = (480 - var7 * var37 - var34 * (var7 - 1)) / 2;
            var12 = (var7 + World.worldCount - 1) / var7;
            class203.field1153 = var12 - var32;
            if(FaceNormal.field1878 != null && class203.field1152 > 0) {
               FaceNormal.field1878.method4282(8, class258.canvasHeight / 2 - FaceNormal.field1878.height / 2);
            }

            if(client.field925 != null && class203.field1152 < class203.field1153) {
               client.field925.method4282(GrandExchangeOffer.canvasWidth - client.field925.width - 8, class258.canvasHeight / 2 - client.field925.height / 2);
            }

            var13 = var35 + 23;
            var14 = var10 + class203.field1168;
            int var15 = 0;
            boolean var16 = false;
            int var17 = class203.field1152;

            int var18;
            for(var18 = var17 * var7; var18 < World.worldCount && var17 - class203.field1152 < var32; ++var18) {
               World var26 = class242.worldList[var18];
               boolean var20 = true;
               String var21 = Integer.toString(var26.playerCount);
               if(var26.playerCount == -1) {
                  var21 = "OFF";
                  var20 = false;
               } else if(var26.playerCount > 1980) {
                  var21 = "FULL";
                  var20 = false;
               }

               int var23 = 0;
               byte var22;
               if(var26.method4942()) {
                  if(var26.method4949()) {
                     var22 = 7;
                  } else {
                     var22 = 6;
                  }
               } else if(var26.method4941()) {
                  var23 = 16711680;
                  if(var26.method4949()) {
                     var22 = 5;
                  } else {
                     var22 = 4;
                  }
               } else if(var26.method4939()) {
                  if(var26.method4949()) {
                     var22 = 3;
                  } else {
                     var22 = 2;
                  }
               } else if(var26.method4949()) {
                  var22 = 1;
               } else {
                  var22 = 0;
               }

               if(MouseInput.mouseLastX >= var14 && MouseInput.mouseLastY >= var13 && MouseInput.mouseLastX < var14 + var4 && MouseInput.mouseLastY < var37 + var13 && var20) {
                  class203.field1187 = var18;
                  class258.field357[var22].method1333(var14, var13, 128, 16777215);
                  var16 = true;
               } else {
                  class258.field357[var22].method1331(var14, var13);
               }

               if(class211.slFlagSprites != null) {
                  class211.slFlagSprites[(var26.method4949()?8:0) + var26.location].method4282(var14 + 29, var13);
               }

               var0.method6222(Integer.toString(var26.id), var14 + 15, var37 / 2 + var13 + 5, var23, -1);
               var1.method6222(var21, var14 + 60, var37 / 2 + var13 + 5, 268435455, -1);
               var13 = var13 + var34 + var37;
               ++var15;
               if(var15 >= var7) {
                  var13 = var35 + 23;
                  var14 = var14 + var4 + var8;
                  var15 = 0;
                  ++var17;
               }
            }

            if(var16) {
               var18 = var1.method6160(class242.worldList[class203.field1187].activity) + 6;
               int var19 = var1.verticalSpace + 8;
               int var38 = MouseInput.mouseLastY + 25;
               if(var38 + var19 > 480) {
                  var38 = MouseInput.mouseLastY - 25 - var19;
               }

               Rasterizer2D.method692(MouseInput.mouseLastX - var18 / 2, var38, var18, var19, 16777120);
               Rasterizer2D.method696(MouseInput.mouseLastX - var18 / 2, var38, var18, var19, 0);
               var1.method6222(class242.worldList[class203.field1187].activity, MouseInput.mouseLastX, var38 + var1.verticalSpace + 4, 0, -1);
            }
         }

         Location.rasterProvider.vmethod4241(0, 0);
      } else {
         if(var3) {
            class302.leftBackground.method1331(class203.field1168, 0);
            //class203.rightBackground.method1331(class203.field1168 + 382, 0);
            //class203.logoSprite.method4282(class203.field1168 + 382 - class203.logoSprite.width / 2, 18);
         }

         if(client.gameState == 0 || client.gameState == 5) {
            var4 = 20;
            var0.method6222(RuneLite.SERVER_NAME + " is loading - please wait...", class203.loginWindowX + 180, 245 - var4, 16777215, -1);
            var5 = 253 - var4;
            Rasterizer2D.method696(class203.loginWindowX + 180 - 152, var5, 304, 34, 9179409);
            Rasterizer2D.method696(class203.loginWindowX + 180 - 151, var5 + 1, 302, 32, 0);
            Rasterizer2D.method692(class203.loginWindowX + 180 - 150, var5 + 2, class203.loadingBarPercentage * 3, 30, 9179409);
            Rasterizer2D.method692(class203.loadingBarPercentage * 3 + (class203.loginWindowX + 180 - 150), var5 + 2, 300 - class203.loadingBarPercentage * 3, 30, 0);
            var0.method6222(class203.loadingText, class203.loginWindowX + 180, 276 - var4, 16777215, -1);
         }

         String var24;
         String var25;
         short var29;
         short var31;
         if(client.gameState == 20) {
            class27.field1974.method4282(class203.loginWindowX + 180 - class27.field1974.width / 2, 271 - class27.field1974.height / 2);
            var29 = 201;
            var0.method6222(class203.loginMessage1, class203.loginWindowX + 180, var29, 16776960, 0);
            var30 = var29 + 15;
            var0.method6222(class203.loginMessage2, class203.loginWindowX + 180, var30, 16776960, 0);
            var30 += 15;
            var0.method6222(class203.loginMessage3, class203.loginWindowX + 180, var30, 16776960, 0);
            var30 += 15;
            var30 += 7;
            if(class203.loginIndex != 4) {
               var0.method6165("Login: ", class203.loginWindowX + 180 - 110, var30, 16777215, 0);
               var31 = 200;
               var24 = class312.options.hideUsername?NPCType.method4812(class203.username):class203.username;

               for(var25 = var24; var0.method6160(var25) > var31; var25 = var25.substring(0, var25.length() - 1)) {
                  ;
               }

               var0.method6165(FontTypeFace.method6234(var25), class203.loginWindowX + 180 - 70, var30, 16777215, 0);
               var30 += 15;
               var0.method6165("Password: " + NPCType.method4812(class203.password), class203.loginWindowX + 180 - 108, var30, 16777215, 0);
               var30 += 15;
            }
         }

         if(client.gameState == 10 || client.gameState == 11) {
            class27.field1974.method4282(class203.loginWindowX, 171);
            short var6;
            if(class203.loginIndex == 0) {
               var29 = 251;
               var0.method6222("Welcome to " + RuneLite.SERVER_NAME, class203.loginWindowX + 180, var29, 16776960, 0);
               var30 = var29 + 30;
               var5 = class203.loginWindowX + 180 - 80;
               var6 = 291;
               class203.field1175.method4282(var5 - 73, var6 - 20);
               var0.method6207("New User", var5 - 73, var6 - 20, 144, 40, 16777215, 0, 1, 1, 0);
               var5 = class203.loginWindowX + 180 + 80;
               class203.field1175.method4282(var5 - 73, var6 - 20);
               var0.method6207("Existing User", var5 - 73, var6 - 20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if(class203.loginIndex == 1) {
               var0.method6222(class203.Login_response0, class203.loginWindowX + 180, 201, 16776960, 0);
               var29 = 236;
               var0.method6222(class203.loginMessage1, class203.loginWindowX + 180, var29, 16777215, 0);
               var30 = var29 + 15;
               var0.method6222(class203.loginMessage2, class203.loginWindowX + 180, var30, 16777215, 0);
               var30 += 15;
               var0.method6222(class203.loginMessage3, class203.loginWindowX + 180, var30, 16777215, 0);
               var30 += 15;
               var5 = class203.loginWindowX + 180 - 80;
               var6 = 321;
               class203.field1175.method4282(var5 - 73, var6 - 20);
               var0.method6222("Continue", var5, var6 + 5, 16777215, 0);
               var5 = class203.loginWindowX + 180 + 80;
               class203.field1175.method4282(var5 - 73, var6 - 20);
               var0.method6222("Cancel", var5, var6 + 5, 16777215, 0);
            } else if(class203.loginIndex == 2) {
               var29 = 201;
               var0.method6222(class203.loginMessage1, class203.field1176, var29, 16776960, 0);
               var30 = var29 + 15;
               var0.method6222(class203.loginMessage2, class203.field1176, var30, 16776960, 0);
               var30 += 15;
               var0.method6222(class203.loginMessage3, class203.field1176, var30, 16776960, 0);
               var30 += 15;
               var30 += 7;
               var0.method6165("Login: ", class203.field1176 - 110, var30, 16777215, 0);
               var31 = 200;
               var24 = class312.options.hideUsername?NPCType.method4812(class203.username):class203.username;

               for(var25 = var24; var0.method6160(var25) > var31; var25 = var25.substring(1)) {
                  ;
               }

               var0.method6165(FontTypeFace.method6234(var25) + (class203.currentLoginField == 0 & client.gameCycle % 40 < 20?class308.method6152(16776960) + "|":""), class203.field1176 - 70, var30, 16777215, 0);
               var30 += 15;
               var0.method6165("Password: " + NPCType.method4812(class203.password) + (class203.currentLoginField == 1 & client.gameCycle % 40 < 20?class308.method6152(16776960) + "|":""), class203.field1176 - 108, var30, 16777215, 0);
               var30 += 15;
               var29 = 277;
               var8 = class203.field1176 + -117;
               IndexedSprite var28 = MouseRecorder.method125(client.Login_isUsernameRemembered, class203.field1180);
               var28.method4282(var8, var29);
               var8 = var8 + var28.width + 5;
               var1.method6165("Remember username", var8, var29 + 13, 16776960, 0);
               var8 = class203.field1176 + 24;
               var28 = MouseRecorder.method125(class312.options.hideUsername, class203.field1181);
               var28.method4282(var8, var29);
               var8 = var8 + var28.width + 5;
               var1.method6165("Hide username", var8, var29 + 13, 16776960, 0);
               var30 = var29 + 15;
               var10 = class203.field1176 - 80;
               short var11 = 321;
               class203.field1175.method4282(var10 - 73, var11 - 20);
               var0.method6222("Login", var10, var11 + 5, 16777215, 0);
               var10 = class203.field1176 + 80;
               class203.field1175.method4282(var10 - 73, var11 - 20);
               var0.method6222("Cancel", var10, var11 + 5, 16777215, 0);
               var29 = 357;
               switch(class203.field1172) {
               case 2:
                  ItemContainer.field553 = "Having trouble logging in?";
                  break;
               default:
                  ItemContainer.field553 = "Forgotten your password? <col=ffffff>Click here.";
               }

               ItemContainer.field551 = new Bounds(class203.field1176, var29, var1.method6160(ItemContainer.field553), 11);
               var1.method6222(ItemContainer.field553, class203.field1176, var29, 16777215, 0);
            } else if(class203.loginIndex == 3) {
               var29 = 201;
               var0.method6222("Invalid username or password.", class203.loginWindowX + 180, var29, 16776960, 0);
               /*var30 = var29 + 20;
               var1.method6222("For accounts created after 24th November 2010, please use your", class203.loginWindowX + 180, var30, 16776960, 0);
               var30 += 15;
               var1.method6222("email address to login. Otherwise please login with your username.", class203.loginWindowX + 180, var30, 16776960, 0);
               var30 += 15;*/
               var5 = class203.loginWindowX + 180;
               var6 = 276;
               class203.field1175.method4282(var5 - 73, var6 - 20);
               var2.method6222("Try again", var5, var6 + 5, 16777215, 0);
               var5 = class203.loginWindowX + 180;
               var6 = 326;
               class203.field1175.method4282(var5 - 73, var6 - 20);
               var2.method6222("Forgotten password?", var5, var6 + 5, 16777215, 0);
            } else {
               short var9;
               if(class203.loginIndex == 4) {
                  var0.method6222("Authenticator", class203.loginWindowX + 180, 201, 16776960, 0);
                  var29 = 236;
                  var0.method6222(class203.loginMessage1, class203.loginWindowX + 180, var29, 16777215, 0);
                  var30 = var29 + 15;
                  var0.method6222(class203.loginMessage2, class203.loginWindowX + 180, var30, 16777215, 0);
                  var30 += 15;
                  var0.method6222(class203.loginMessage3, class203.loginWindowX + 180, var30, 16777215, 0);
                  var30 += 15;
                  var0.method6165("PIN: " + NPCType.method4812(ClientOptions.field1037) + (client.gameCycle % 40 < 20?class308.method6152(16776960) + "|":""), class203.loginWindowX + 180 - 108, var30, 16777215, 0);
                  var30 -= 8;
                  var0.method6165("Trust this computer", class203.loginWindowX + 180 - 9, var30, 16776960, 0);
                  var30 += 15;
                  var0.method6165("for 30 days: ", class203.loginWindowX + 180 - 9, var30, 16776960, 0);
                  var5 = 180 + class203.loginWindowX - 9 + var0.method6160("for 30 days: ") + 15;
                  var32 = var30 - var0.verticalSpace;
                  IndexedSprite var39;
                  if(class203.field1182) {
                     var39 = class252.field2534;
                  } else {
                     var39 = class203.field1154;
                  }

                  var39.method4282(var5, var32);
                  var30 += 15;
                  var8 = class203.loginWindowX + 180 - 80;
                  var9 = 321;
                  class203.field1175.method4282(var8 - 73, var9 - 20);
                  var0.method6222("Continue", var8, var9 + 5, 16777215, 0);
                  var8 = class203.loginWindowX + 180 + 80;
                  class203.field1175.method4282(var8 - 73, var9 - 20);
                  var0.method6222("Cancel", var8, var9 + 5, 16777215, 0);
                  var1.method6222("<u=ff>Can\'t Log In?</u>", class203.loginWindowX + 180, var9 + 36, 255, 0);
               } else if(class203.loginIndex == 5) {
                  var0.method6222("Forgotten your password?", class203.loginWindowX + 180, 201, 16776960, 0);
                  var29 = 221;
                  var2.method6222(class203.loginMessage1, class203.loginWindowX + 180, var29, 16776960, 0);
                  var30 = var29 + 15;
                  var2.method6222(class203.loginMessage2, class203.loginWindowX + 180, var30, 16776960, 0);
                  var30 += 15;
                  var2.method6222(class203.loginMessage3, class203.loginWindowX + 180, var30, 16776960, 0);
                  var30 += 15;
                  var30 += 14;
                  var0.method6165("Username: ", class203.loginWindowX + 180 - 145, var30, 16777215, 0);
                  var31 = 174;
                  var24 = class312.options.hideUsername?NPCType.method4812(class203.username):class203.username;

                  for(var25 = var24; var0.method6160(var25) > var31; var25 = var25.substring(1)) {
                     ;
                  }

                  var0.method6165(FontTypeFace.method6234(var25) + (client.gameCycle % 40 < 20?class308.method6152(16776960) + "|":""), class203.loginWindowX + 180 - 34, var30, 16777215, 0);
                  var30 += 15;
                  var8 = class203.loginWindowX + 180 - 80;
                  var9 = 321;
                  class203.field1175.method4282(var8 - 73, var9 - 20);
                  var0.method6222("Recover", var8, var9 + 5, 16777215, 0);
                  var8 = class203.loginWindowX + 180 + 80;
                  class203.field1175.method4282(var8 - 73, var9 - 20);
                  var0.method6222("Back", var8, var9 + 5, 16777215, 0);
               } else if(class203.loginIndex == 6) {
                  var29 = 201;
                  var0.method6222(class203.loginMessage1, class203.loginWindowX + 180, var29, 16776960, 0);
                  var30 = var29 + 15;
                  var0.method6222(class203.loginMessage2, class203.loginWindowX + 180, var30, 16776960, 0);
                  var30 += 15;
                  var0.method6222(class203.loginMessage3, class203.loginWindowX + 180, var30, 16776960, 0);
                  var30 += 15;
                  var5 = class203.loginWindowX + 180;
                  var6 = 321;
                  class203.field1175.method4282(var5 - 73, var6 - 20);
                  var0.method6222("Back", var5, var6 + 5, 16777215, 0);
               } else if(class203.loginIndex == 7) {
                  var29 = 216;
                  var0.method6222("Your date of birth isn\'t set.", class203.loginWindowX + 180, var29, 16776960, 0);
                  var30 = var29 + 15;
                  var2.method6222("Please verify your account status by", class203.loginWindowX + 180, var30, 16776960, 0);
                  var30 += 15;
                  var2.method6222("setting your date of birth.", class203.loginWindowX + 180, var30, 16776960, 0);
                  var30 += 15;
                  var5 = class203.loginWindowX + 180 - 80;
                  var6 = 321;
                  class203.field1175.method4282(var5 - 73, var6 - 20);
                  var0.method6222("Set Date of Birth", var5, var6 + 5, 16777215, 0);
                  var5 = class203.loginWindowX + 180 + 80;
                  class203.field1175.method4282(var5 - 73, var6 - 20);
                  var0.method6222("Back", var5, var6 + 5, 16777215, 0);
               } else if(class203.loginIndex == 8) {
                  var29 = 216;
                  var0.method6222("Sorry, but your account is not eligible to play.", class203.loginWindowX + 180, var29, 16776960, 0);
                  var30 = var29 + 15;
                  var2.method6222("For more information, please take a look at", class203.loginWindowX + 180, var30, 16776960, 0);
                  var30 += 15;
                  var2.method6222("our privacy policy.", class203.loginWindowX + 180, var30, 16776960, 0);
                  var30 += 15;
                  var5 = class203.loginWindowX + 180 - 80;
                  var6 = 321;
                  class203.field1175.method4282(var5 - 73, var6 - 20);
                  var0.method6222("Privacy Policy", var5, var6 + 5, 16777215, 0);
                  var5 = class203.loginWindowX + 180 + 80;
                  class203.field1175.method4282(var5 - 73, var6 - 20);
                  var0.method6222("Back", var5, var6 + 5, 16777215, 0);
               } else if(class203.loginIndex == 12) {
                  var29 = 201;
                  String var27 = "";
                  var24 = "";
                  var25 = "";
                  switch(class203.field1170) {
                  case 0:
                     var27 = "Your account has been disabled.";
                     var24 = class200.field2931;
                     var25 = "";
                     break;
                  case 1:
                     var27 = "Account locked as we suspect it has been stolen.";
                     var24 = class200.field2970;
                     var25 = "";
                     break;
                  default:
                     Packet.method5318(false);
                  }

                  var0.method6222(var27, class203.loginWindowX + 180, var29, 16776960, 0);
                  var30 = var29 + 15;
                  var2.method6222(var24, class203.loginWindowX + 180, var30, 16776960, 0);
                  var30 += 15;
                  var2.method6222(var25, class203.loginWindowX + 180, var30, 16776960, 0);
                  var30 += 15;
                  var8 = class203.loginWindowX + 180;
                  var9 = 276;
                  class203.field1175.method4282(var8 - 73, var9 - 20);
                  var0.method6222("Support Page", var8, var9 + 5, 16777215, 0);
                  var8 = class203.loginWindowX + 180;
                  var9 = 326;
                  class203.field1175.method4282(var8 - 73, var9 - 20);
                  var0.method6222("Back", var8, var9 + 5, 16777215, 0);
               }
            }
         }

         /*if(class203.field1165 > 0) { flames
            var30 = class203.field1165;
            var31 = 256;
            class203.field1163 += var30 * 128;
            if(class203.field1163 > MouseInput.field498.length) {
               class203.field1163 -= MouseInput.field498.length;
               var32 = (int)(Math.random() * 12.0D);
               class48.method801(PathingEntity.runeSprites[var32]);
            }

            var32 = 0;
            var7 = var30 * 128;
            var8 = (var31 - var30) * 128;

            for(var34 = 0; var34 < var8; ++var34) {
               var10 = class203.field1164[var32 + var7] - var30 * MouseInput.field498[var32 + class203.field1163 & MouseInput.field498.length - 1] / 6;
               if(var10 < 0) {
                  var10 = 0;
               }

               class203.field1164[var32++] = var10;
            }

            for(var34 = var31 - var30; var34 < var31; ++var34) {
               var10 = var34 * 128;

               for(var35 = 0; var35 < 128; ++var35) {
                  var12 = (int)(Math.random() * 100.0D);
                  if(var12 < 50 && var35 > 10 && var35 < 118) {
                     class203.field1164[var35 + var10] = 255;
                  } else {
                     class203.field1164[var10 + var35] = 0;
                  }
               }
            }

            if(class203.field1160 > 0) {
               class203.field1160 -= var30 * 4;
            }

            if(class203.field1161 > 0) {
               class203.field1161 -= var30 * 4;
            }

            if(class203.field1160 == 0 && class203.field1161 == 0) {
               var34 = (int)(Math.random() * (double)(2000 / var30));
               if(var34 == 0) {
                  class203.field1160 = 1024;
               }

               if(var34 == 1) {
                  class203.field1161 = 1024;
               }
            }

            for(var34 = 0; var34 < var31 - var30; ++var34) {
               class203.field1159[var34] = class203.field1159[var30 + var34];
            }

            for(var34 = var31 - var30; var34 < var31; ++var34) {
               class203.field1159[var34] = (int)(Math.sin((double)class203.field1150 / 14.0D) * 16.0D + Math.sin((double)class203.field1150 / 15.0D) * 14.0D + Math.sin((double)class203.field1150 / 16.0D) * 12.0D);
               ++class203.field1150;
            }

            class203.field1183 += var30;
            var34 = (var30 + (Client.gameCycle & 1)) / 2;
            if(var34 > 0) {
               for(var10 = 0; var10 < class203.field1183 * 100; ++var10) {
                  var35 = (int)(Math.random() * 124.0D) + 2;
                  var12 = (int)(Math.random() * 128.0D) + 128;
                  class203.field1164[var35 + (var12 << 7)] = 192;
               }

               class203.field1183 = 0;
               var10 = 0;

               label720:
               while(true) {
                  if(var10 >= var31) {
                     var10 = 0;

                     while(true) {
                        if(var10 >= 128) {
                           break label720;
                        }

                        var35 = 0;

                        for(var12 = -var34; var12 < var31; ++var12) {
                           var13 = var12 * 128;
                           if(var12 + var34 < var31) {
                              var35 += WorldMapType3.field146[var13 + var10 + var34 * 128];
                           }

                           if(var12 - (var34 + 1) >= 0) {
                              var35 -= WorldMapType3.field146[var13 + var10 - (var34 + 1) * 128];
                           }

                           if(var12 >= 0) {
                              class203.field1164[var13 + var10] = var35 / (var34 * 2 + 1);
                           }
                        }

                        ++var10;
                     }
                  }

                  var35 = 0;
                  var12 = var10 * 128;

                  for(var13 = -var34; var13 < 128; ++var13) {
                     if(var13 + var34 < 128) {
                        var35 += class203.field1164[var34 + var13 + var12];
                     }

                     if(var13 - (var34 + 1) >= 0) {
                        var35 -= class203.field1164[var13 + var12 - (var34 + 1)];
                     }

                     if(var13 >= 0) {
                        WorldMapType3.field146[var13 + var12] = var35 / (var34 * 2 + 1);
                     }
                  }

                  ++var10;
               }
            }

            class203.field1165 = 0;
         }*/

         var29 = 256;
         if(class203.field1160 > 0) {
            for(var5 = 0; var5 < 256; ++var5) {
               if(class203.field1160 > 768) {
                  Size.field128[var5] = class318.method6319(SoundTaskDataProvider.field417[var5], WorldMapRegion.field266[var5], 1024 - class203.field1160);
               } else if(class203.field1160 > 256) {
                  Size.field128[var5] = WorldMapRegion.field266[var5];
               } else {
                  Size.field128[var5] = class318.method6319(WorldMapRegion.field266[var5], SoundTaskDataProvider.field417[var5], 256 - class203.field1160);
               }
            }
         } else if(class203.field1161 > 0) {
            for(var5 = 0; var5 < 256; ++var5) {
               if(class203.field1161 > 768) {
                  Size.field128[var5] = class318.method6319(SoundTaskDataProvider.field417[var5], MapLabel.field251[var5], 1024 - class203.field1161);
               } else if(class203.field1161 > 256) {
                  Size.field128[var5] = MapLabel.field251[var5];
               } else {
                  Size.field128[var5] = class318.method6319(MapLabel.field251[var5], SoundTaskDataProvider.field417[var5], 256 - class203.field1161);
               }
            }
         } else {
            for(var5 = 0; var5 < 256; ++var5) {
               Size.field128[var5] = SoundTaskDataProvider.field417[var5];
            }
         }

         Rasterizer2D.method684(class203.field1168, 9, class203.field1168 + 128, var29 + 7);
         class302.leftBackground.method1331(class203.field1168, 0);
         Rasterizer2D.method683();
         var5 = 0;
         var32 = Location.rasterProvider.width * 9 + class203.field1168;

         for(var7 = 1; var7 < var29 - 1; ++var7) {
            var8 = class203.field1159[var7] * (var29 - var7) / var29;
            var34 = var8 + 22;
            if(var34 < 0) {
               var34 = 0;
            }

            var5 += var34;

            for(var10 = var34; var10 < 128; ++var10) {
               var35 = class203.field1164[var5++];
               if(var35 != 0) {
                  var12 = var35;
                  var13 = 256 - var35;
                  var35 = Size.field128[var35];
                  var14 = Location.rasterProvider.pixels[var32];
                  Location.rasterProvider.pixels[var32++] = ((var35 & 16711935) * var12 + (var14 & 16711935) * var13 & -16711936) + (var12 * (var35 & 65280) + var13 * (var14 & 65280) & 16711680) >> 8;
               } else {
                  ++var32;
               }
            }

            var32 += var34 + Location.rasterProvider.width - 128;
         }

         Rasterizer2D.method684(class203.field1168 + 765 - 128, 9, class203.field1168 + 765, var29 + 7);
         //class203.rightBackground.method1331(class203.field1168 + 382, 0);
         Rasterizer2D.method683();
         var5 = 0;
         var32 = Location.rasterProvider.width * 9 + class203.field1168 + 637 + 24;

         for(var7 = 1; var7 < var29 - 1; ++var7) {
            var8 = class203.field1159[var7] * (var29 - var7) / var29;
            var34 = 103 - var8;
            var32 += var8;

            for(var10 = 0; var10 < var34; ++var10) {
               var35 = class203.field1164[var5++];
               if(var35 != 0) {
                  var12 = var35;
                  var13 = 256 - var35;
                  var35 = Size.field128[var35];
                  var14 = Location.rasterProvider.pixels[var32];
                  Location.rasterProvider.pixels[var32++] = ((var35 & 16711935) * var12 + (var14 & 16711935) * var13 & -16711936) + (var12 * (var35 & 65280) + var13 * (var14 & 65280) & 16711680) >> 8;
               } else {
                  ++var32;
               }
            }

            var5 += 128 - var34;
            var32 += Location.rasterProvider.width - var34 - var8;
         }

         class203.titlemuteSprite[class312.options.muted?1:0].method4282(class203.field1168 + 765 - 40, 463);
         if(client.gameState > 5 && client.languageId == 0) {
            if(WorldMapDataGroup.field308 != null) {
               var30 = class203.field1168 + 5;
               var31 = 463;
               byte var36 = 100;
               byte var33 = 35;
               WorldMapDataGroup.field308.method4282(var30, var31);
               var0.method6222("World" + " " + client.world, var36 / 2 + var30, var33 / 2 + var31 - 2, 16777215, 0);
               if(World.listFetcher != null) {
                  var1.method6222("Loading...", var36 / 2 + var30, var33 / 2 + var31 + 12, 16777215, 0);
               } else {
                  var1.method6222("Click to switch", var36 / 2 + var30, var33 / 2 + var31 + 12, 16777215, 0);
               }
            } else {
               WorldMapDataGroup.field308 = WorldMapRegion.method5496(ModeGame.sprites, "sl_button", "");
            }
         }

      }
   }

   @ObfuscatedName("hj")
   @ObfuscatedSignature(
      signature = "(IIII)I",
      garbageValue = "-1823232062"
   )
   static final int method5618(int var0, int var1, int var2) {
      int var3 = var0 >> 7;
      int var4 = var1 >> 7;
      if(var3 >= 0 && var4 >= 0 && var3 <= 103 && var4 <= 103) {
         int var5 = var2;
         if(var2 < 3 && (class91.tileSettings[1][var3][var4] & 2) == 2) {
            var5 = var2 + 1;
         }

         int var6 = var0 & 127;
         int var7 = var1 & 127;
         int var8 = class91.tileHeights[var5][var3 + 1][var4] * var6 + (128 - var6) * class91.tileHeights[var5][var3][var4] >> 7;
         int var9 = class91.tileHeights[var5][var3][var4 + 1] * (128 - var6) + class91.tileHeights[var5][var3 + 1][var4 + 1] * var6 >> 7;
         return var9 * var7 + var8 * (128 - var7) >> 7;
      } else {
         return 0;
      }
   }
}
