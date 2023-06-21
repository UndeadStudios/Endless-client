package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

import java.awt.*;

@ObfuscatedName("bn")
public class MouseRecorder implements Runnable {
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "[Ldx;"
   )
   public static CacheFile[] cacheIndex;
   @ObfuscatedName("f")
   long[] field590;
   @ObfuscatedName("x")
   int[] xs;
   @ObfuscatedName("a")
   boolean isRunning;
   @ObfuscatedName("s")
   Object lock;
   @ObfuscatedName("h")
   int[] ys;
   @ObfuscatedName("g")
   @ObfuscatedGetter(
      intValue = -1127531481
   )
   int index;

   MouseRecorder() {
      this.isRunning = true;
      this.lock = new Object();
      this.index = 0;
      this.xs = new int[500];
      this.ys = new int[500];
      this.field590 = new long[500];
   }

   public void run() {
      for(; this.isRunning; class36.method553(50L)) {
         Object var1 = this.lock;
         synchronized(this.lock) {
            if(this.index < 500) {
               this.xs[this.index] = MouseInput.mouseLastX;
               this.ys[this.index] = MouseInput.mouseLastY;
               this.field590[this.index] = MouseInput.field492;
               ++this.index;
            }
         }
      }

   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(Lbf;B)V",
      garbageValue = "29"
   )
   static void method121(GameEngine var0) {
      int var2;
      int var3;
      int var4;
      if(class203.worldSelectShown) {
         while(true) {
            if(!HeadbarType.method2071()) {
               if(MouseInput.mouseLastButton != 1 && (TextureProvider.middleMouseMovesCamera || MouseInput.mouseLastButton != 4)) {
                  break;
               }

               int var1 = class203.field1168 + 280;
               if(MouseInput.mouseLastPressedX >= var1 && MouseInput.mouseLastPressedX <= var1 + 14 && MouseInput.mouseLastPressedY >= 4 && MouseInput.mouseLastPressedY <= 18) {
                  WallObject.method1973(0, 0);
                  break;
               }

               if(MouseInput.mouseLastPressedX >= var1 + 15 && MouseInput.mouseLastPressedX <= var1 + 80 && MouseInput.mouseLastPressedY >= 4 && MouseInput.mouseLastPressedY <= 18) {
                  WallObject.method1973(0, 1);
                  break;
               }

               var2 = class203.field1168 + 390;
               if(MouseInput.mouseLastPressedX >= var2 && MouseInput.mouseLastPressedX <= var2 + 14 && MouseInput.mouseLastPressedY >= 4 && MouseInput.mouseLastPressedY <= 18) {
                  WallObject.method1973(1, 0);
                  break;
               }

               if(MouseInput.mouseLastPressedX >= var2 + 15 && MouseInput.mouseLastPressedX <= var2 + 80 && MouseInput.mouseLastPressedY >= 4 && MouseInput.mouseLastPressedY <= 18) {
                  WallObject.method1973(1, 1);
                  break;
               }

               var3 = class203.field1168 + 500;
               if(MouseInput.mouseLastPressedX >= var3 && MouseInput.mouseLastPressedX <= var3 + 14 && MouseInput.mouseLastPressedY >= 4 && MouseInput.mouseLastPressedY <= 18) {
                  WallObject.method1973(2, 0);
                  break;
               }

               if(MouseInput.mouseLastPressedX >= var3 + 15 && MouseInput.mouseLastPressedX <= var3 + 80 && MouseInput.mouseLastPressedY >= 4 && MouseInput.mouseLastPressedY <= 18) {
                  WallObject.method1973(2, 1);
                  break;
               }

               var4 = class203.field1168 + 610;
               if(MouseInput.mouseLastPressedX >= var4 && MouseInput.mouseLastPressedX <= var4 + 14 && MouseInput.mouseLastPressedY >= 4 && MouseInput.mouseLastPressedY <= 18) {
                  WallObject.method1973(3, 0);
                  break;
               }

               if(MouseInput.mouseLastPressedX >= var4 + 15 && MouseInput.mouseLastPressedX <= var4 + 80 && MouseInput.mouseLastPressedY >= 4 && MouseInput.mouseLastPressedY <= 18) {
                  WallObject.method1973(3, 1);
                  break;
               }

               if(MouseInput.mouseLastPressedX >= class203.field1168 + 708 && MouseInput.mouseLastPressedY >= 4 && MouseInput.mouseLastPressedX <= class203.field1168 + 708 + 50 && MouseInput.mouseLastPressedY <= 20) {
                  WorldMapDataGroup.method958();
                  break;
               }

               if(class203.field1187 != -1) {
                  World var15 = class242.worldList[class203.field1187];
                  GroundObject.setWorldInfo(var15);
                  WorldMapDataGroup.method958();
               } else {
                  if(class203.field1152 > 0 && FaceNormal.field1878 != null && MouseInput.mouseLastPressedX >= 0 && MouseInput.mouseLastPressedX <= FaceNormal.field1878.width && MouseInput.mouseLastPressedY >= class258.canvasHeight / 2 - 50 && MouseInput.mouseLastPressedY <= class258.canvasHeight / 2 + 50) {
                     --class203.field1152;
                  }

                  if(class203.field1152 < class203.field1153 && client.field925 != null && MouseInput.mouseLastPressedX >= GrandExchangeOffer.canvasWidth - client.field925.width - 5 && MouseInput.mouseLastPressedX <= GrandExchangeOffer.canvasWidth && MouseInput.mouseLastPressedY >= class258.canvasHeight / 2 - 50 && MouseInput.mouseLastPressedY <= class258.canvasHeight / 2 + 50) {
                     ++class203.field1152;
                  }
               }
               break;
            }

            if(SocialState.currentPressedKey == 13) {
               WorldMapDataGroup.method958();
               break;
            }

            if(SocialState.currentPressedKey == 96) {
               if(class203.field1152 > 0 && FaceNormal.field1878 != null) {
                  --class203.field1152;
               }
            } else if(SocialState.currentPressedKey == 97 && class203.field1152 < class203.field1153 && client.field925 != null) {
               ++class203.field1152;
            }
         }

      } else {
         if((MouseInput.mouseLastButton == 1 || !TextureProvider.middleMouseMovesCamera && MouseInput.mouseLastButton == 4) && MouseInput.mouseLastPressedX >= class203.field1168 + 765 - 50 && MouseInput.mouseLastPressedY >= 453) {
            class312.options.muted = !class312.options.muted;
            class72.method1041();
            if(!class312.options.muted) {
               Js5 var12 = class75.music;
               var2 = var12.method4132("scape main");
               var3 = var12.method4137(var2, "");
               WorldMapDataGroup.method957(var12, var2, var3, 255, false);
            } else {
               class75.method1055();
            }
         }

         if(client.gameState != 5) {
            if(-1L == class203.field1190) {
               class203.field1190 = class318.method6317() + 1000L;
            }

            long var13 = class318.method6317();
            boolean var18;
            if(client.field919 != null && client.field920 < client.field919.size()) {
               while(true) {
                  if(client.field920 >= client.field919.size()) {
                     var18 = true;
                     break;
                  }

                  class142 var16 = (class142) client.field919.get(client.field920);
                  if(!var16.method2036()) {
                     var18 = false;
                     break;
                  }

                  ++client.field920;
               }
            } else {
               var18 = true;
            }

            if(var18 && -1L == class203.field1191) {
               class203.field1191 = var13;
               if(class203.field1191 > class203.field1190) {
                  class203.field1190 = class203.field1191;
               }
            }

            ++class203.field1165;
            if(client.gameState == 10 || client.gameState == 11) {
               if(client.languageId == 0) {
                  if(MouseInput.mouseLastButton == 1 || !TextureProvider.middleMouseMovesCamera && MouseInput.mouseLastButton == 4) {
                     var4 = class203.field1168 + 5;
                     short var5 = 463;
                     byte var6 = 100;
                     byte var7 = 35;
                     if(MouseInput.mouseLastPressedX >= var4 && MouseInput.mouseLastPressedX <= var6 + var4 && MouseInput.mouseLastPressedY >= var5 && MouseInput.mouseLastPressedY <= var5 + var7) {
                        CombatInfo1.method58();
                        return;
                     }
                  }

                  if(World.listFetcher != null) {
                     CombatInfo1.method58();
                  }
               }

               var4 = MouseInput.mouseLastButton;
               int var19 = MouseInput.mouseLastPressedX;
               int var20 = MouseInput.mouseLastPressedY;
               if(var4 == 0) {
                  var19 = MouseInput.mouseLastX;
                  var20 = MouseInput.mouseLastY;
               }

               if(!TextureProvider.middleMouseMovesCamera && var4 == 4) {
                  var4 = 1;
               }

               int var8;
               short var9;
               if(class203.loginIndex == 0) {
                  boolean var21 = false;

                  while(HeadbarType.method2071()) {
                     if(SocialState.currentPressedKey == 84) {
                        var21 = true;
                     }
                  }

                  var8 = class203.field1176 - 80;
                  var9 = 291;
                  if(var4 == 1 && var19 >= var8 - 75 && var19 <= var8 + 75 && var20 >= var9 - 20 && var20 <= var9 + 20) {
                     class129.method1898("https://forums.zenyte.com/register/", true, false);
                  }

                  var8 = class203.field1176 + 80;
                  if(var4 == 1 && var19 >= var8 - 75 && var19 <= var8 + 75 && var20 >= var9 - 20 && var20 <= var9 + 20 || var21) {
                     if((client.flags & 33554432) != 0) {
                        class203.Login_response0 = "";
                        class203.loginMessage1 = "This is a <col=00ffff>Beta<col=ffffff> world.";
                        class203.loginMessage2 = "Your normal account will not be affected.";
                        class203.loginMessage3 = "";
                        class203.loginIndex = 1;
                        if(client.Login_isUsernameRemembered && class203.username != null && class203.username.length() > 0) {
                           class203.currentLoginField = 1;
                        } else {
                           class203.currentLoginField = 0;
                        }
                     } else if((client.flags & 4) != 0) {
                        if((client.flags & 1024) != 0) {
                           class203.loginMessage1 = "This is a <col=ffff00>High Risk <col=ff0000>PvP<col=ffffff> world.";
                           class203.loginMessage2 = "Players can attack each other almost everywhere";
                           class203.loginMessage3 = "and the Protect Item prayer won\'t work.";
                        } else {
                           class203.loginMessage1 = "This is a <col=ff0000>PvP<col=ffffff> world.";
                           class203.loginMessage2 = "Players can attack each other";
                           class203.loginMessage3 = "almost everywhere.";
                        }

                        class203.Login_response0 = "Warning!";
                        class203.loginIndex = 1;
                        if(client.Login_isUsernameRemembered && class203.username != null && class203.username.length() > 0) {
                           class203.currentLoginField = 1;
                        } else {
                           class203.currentLoginField = 0;
                        }
                     } else if((client.flags & 1024) != 0) {
                        class203.loginMessage1 = "This is a <col=ffff00>High Risk<col=ffffff> world.";
                        class203.loginMessage2 = "The Protect Item prayer will";
                        class203.loginMessage3 = "not work on this world.";
                        class203.Login_response0 = "Warning!";
                        class203.loginIndex = 1;
                        if(client.Login_isUsernameRemembered && class203.username != null && class203.username.length() > 0) {
                           class203.currentLoginField = 1;
                        } else {
                           class203.currentLoginField = 0;
                        }
                     } else {
                        Packet.method5318(false);
                     }
                  }
               } else {
                  int var22;
                  short var24;
                  if(class203.loginIndex != 1) {
                     short var23;
                     if(class203.loginIndex == 2) {
                        var23 = 201;
                        var22 = var23 + 52;
                        if(var4 == 1 && var20 >= var22 - 12 && var20 < var22 + 2) {
                           class203.currentLoginField = 0;
                        }

                        var22 += 15;
                        if(var4 == 1 && var20 >= var22 - 12 && var20 < var22 + 2) {
                           class203.currentLoginField = 1;
                        }

                        var22 += 15;
                        var23 = 361;
                        if(ItemContainer.field551 != null) {
                           var8 = ItemContainer.field551.field3846 / 2;
                           if(var4 == 1 && var19 >= ItemContainer.field551.field3844 - var8 && var19 <= var8 + ItemContainer.field551.field3844 && var20 >= var23 - 15 && var20 < var23) {
                              switch(class203.field1172) {
                              case 1:
                                 TextureProvider.method1169("Please enter your username.", "", "");
                                 class203.loginIndex = 5;
                                 return;
                              case 2:
                                 class129.method1898("https://support.runescape.com/hc/en-gb", true, false);
                              }
                           }
                        }

                        var8 = class203.field1176 - 80;
                        var9 = 321;
                        if(var4 == 1 && var19 >= var8 - 75 && var19 <= var8 + 75 && var20 >= var9 - 20 && var20 <= var9 + 20) {
                           class203.username = class203.username.trim();
                           client.onUsernameChanged(-1);
                           if(class203.username.length() == 0) {
                              TextureProvider.method1169("", "Please enter your username.", "");
                              return;
                           }

                           if(class203.password.length() == 0) {
                              TextureProvider.method1169("", "Please enter your password.", "");
                              return;
                           }

                           TextureProvider.method1169("", "Connecting to server...", "");
                           AuthProt.method6377(false);
                           class124.method1843(20);
                           return;
                        }

                        var8 = class203.loginWindowX + 180 + 80;
                        if(var4 == 1 && var19 >= var8 - 75 && var19 <= var8 + 75 && var20 >= var9 - 20 && var20 <= var9 + 20) {
                           class203.loginIndex = 0;
                           class203.username = "";
                           client.onUsernameChanged(-1);
                           class203.password = "";
                           SoundTaskDataProvider.authcode = 0;
                           ClientOptions.field1037 = "";
                           class203.field1182 = true;
                        }

                        var8 = class203.field1176 + -117;
                        var9 = 277;
                        class203.field1180 = var19 >= var8 && var19 < var8 + class132.field3195 && var20 >= var9 && var20 < var9 + class71.field187;
                        if(var4 == 1 && class203.field1180) {
                           client.Login_isUsernameRemembered = !client.Login_isUsernameRemembered;
                           if(!client.Login_isUsernameRemembered && class312.options.rememberedUsername != null) {
                              class312.options.rememberedUsername = null;
                              class72.method1041();
                           }
                        }

                        var8 = class203.field1176 + 24;
                        var9 = 277;
                        class203.field1181 = var19 >= var8 && var19 < var8 + class132.field3195 && var20 >= var9 && var20 < var9 + class71.field187;
                        if(var4 == 1 && class203.field1181) {
                           class312.options.hideUsername = !class312.options.hideUsername;
                           if(!class312.options.hideUsername) {
                              class203.username = "";
                              client.onUsernameChanged(-1);
                              class312.options.rememberedUsername = null;
                              if(client.Login_isUsernameRemembered && class203.username != null && class203.username.length() > 0) {
                                 class203.currentLoginField = 1;
                              } else {
                                 class203.currentLoginField = 0;
                              }
                           }

                           class72.method1041();
                        }

                        while(true) {
                           while(HeadbarType.method2071()) {
                              boolean var10 = false;

                              for(int var11 = 0; var11 < "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:\'@#~,<.>/?\\| ".length(); ++var11) {
                                 if(class129.currentTypedKey == "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:\'@#~,<.>/?\\| ".charAt(var11)) {
                                    var10 = true;
                                    break;
                                 }
                              }

                              if(SocialState.currentPressedKey == 13) {
                                 class203.loginIndex = 0;
                                 class203.username = "";
                                 client.onUsernameChanged(-1);
                                 class203.password = "";
                                 SoundTaskDataProvider.authcode = 0;
                                 ClientOptions.field1037 = "";
                                 class203.field1182 = true;
                              } else if(class203.currentLoginField == 0) {
                                 if(SocialState.currentPressedKey == 85 && class203.username.length() > 0) {
                                    class203.username = class203.username.substring(0, class203.username.length() - 1);
                                    client.onUsernameChanged(-1);
                                 }

                                 if(SocialState.currentPressedKey == 84 || SocialState.currentPressedKey == 80) {
                                    class203.currentLoginField = 1;
                                 }

                                 if(var10 && class203.username.length() < 320) {
                                    class203.username = class203.username + class129.currentTypedKey;
                                    client.onUsernameChanged(-1);
                                 }
                              } else if(class203.currentLoginField == 1) {
                                 if(SocialState.currentPressedKey == 85 && class203.password.length() > 0) {
                                    class203.password = class203.password.substring(0, class203.password.length() - 1);
                                 }

                                 if(SocialState.currentPressedKey == 84 || SocialState.currentPressedKey == 80) {
                                    class203.currentLoginField = 0;
                                 }

                                 if(SocialState.currentPressedKey == 84) {
                                    class203.username = class203.username.trim();
                                    client.onUsernameChanged(-1);
                                    if(class203.username.length() == 0) {
                                       TextureProvider.method1169("", "Please enter your username.", "");
                                       return;
                                    }

                                    if(class203.password.length() == 0) {
                                       TextureProvider.method1169("", "Please enter your password.", "");
                                       return;
                                    }

                                    TextureProvider.method1169("", "Connecting to server...", "");
                                    AuthProt.method6377(false);
                                    class124.method1843(20);
                                    return;
                                 }

                                 if(var10 && class203.password.length() < 20) {
                                    class203.password = class203.password + class129.currentTypedKey;
                                 }
                              }
                           }

                           return;
                        }
                     } else if(class203.loginIndex == 3) {
                        var22 = class203.loginWindowX + 180;
                        var24 = 276;
                        if(var4 == 1 && var19 >= var22 - 75 && var19 <= var22 + 75 && var20 >= var24 - 20 && var20 <= var24 + 20) {
                           Packet.method5318(false);
                        }

                        var22 = class203.loginWindowX + 180;
                        var24 = 326;
                        if(var4 == 1 && var19 >= var22 - 75 && var19 <= var22 + 75 && var20 >= var24 - 20 && var20 <= var24 + 20) {
                           TextureProvider.method1169("Please enter your username.", "", "");
                           class203.loginIndex = 5;
                           return;
                        }
                     } else {
                        boolean var25;
                        int var26;
                        if(class203.loginIndex == 4) {
                           var22 = class203.loginWindowX + 180 - 80;
                           var24 = 321;
                           if(var4 == 1 && var19 >= var22 - 75 && var19 <= var22 + 75 && var20 >= var24 - 20 && var20 <= var24 + 20) {
                              ClientOptions.field1037.trim();
                              if(ClientOptions.field1037.length() != 6) {
                                 TextureProvider.method1169("", "Please enter a 6-digit PIN.", "");
                                 return;
                              }

                              SoundTaskDataProvider.authcode = Integer.parseInt(ClientOptions.field1037);
                              ClientOptions.field1037 = "";
                              AuthProt.method6377(true);
                              TextureProvider.method1169("", "Connecting to server...", "");
                              class124.method1843(20);
                              return;
                           }

                           if(var4 == 1 && var19 >= class203.loginWindowX + 180 - 9 && var19 <= class203.loginWindowX + 180 + 130 && var20 >= 263 && var20 <= 296) {
                              class203.field1182 = !class203.field1182;
                           }

                           if(var4 == 1 && var19 >= class203.loginWindowX + 180 - 34 && var19 <= class203.loginWindowX + 34 + 180 && var20 >= 351 && var20 <= 363) {
                              class129.method1898(WorldComparator.method84("secure", true) + "m=totp-authenticator/disableTOTPRequest", true, false);
                           }

                           var22 = class203.loginWindowX + 180 + 80;
                           if(var4 == 1 && var19 >= var22 - 75 && var19 <= var22 + 75 && var20 >= var24 - 20 && var20 <= var24 + 20) {
                              class203.loginIndex = 0;
                              class203.username = "";
                              client.onUsernameChanged(-1);
                              class203.password = "";
                              SoundTaskDataProvider.authcode = 0;
                              ClientOptions.field1037 = "";
                           }

                           while(HeadbarType.method2071()) {
                              var25 = false;

                              for(var26 = 0; var26 < "1234567890".length(); ++var26) {
                                 if(class129.currentTypedKey == "1234567890".charAt(var26)) {
                                    var25 = true;
                                    break;
                                 }
                              }

                              if(SocialState.currentPressedKey == 13) {
                                 class203.loginIndex = 0;
                                 class203.username = "";
                                 client.onUsernameChanged(-1);
                                 class203.password = "";
                                 SoundTaskDataProvider.authcode = 0;
                                 ClientOptions.field1037 = "";
                              } else {
                                 if(SocialState.currentPressedKey == 85 && ClientOptions.field1037.length() > 0) {
                                    ClientOptions.field1037 = ClientOptions.field1037.substring(0, ClientOptions.field1037.length() - 1);
                                 }

                                 if(SocialState.currentPressedKey == 84) {
                                    ClientOptions.field1037.trim();
                                    if(ClientOptions.field1037.length() != 6) {
                                       TextureProvider.method1169("", "Please enter a 6-digit PIN.", "");
                                       return;
                                    }

                                    SoundTaskDataProvider.authcode = Integer.parseInt(ClientOptions.field1037);
                                    ClientOptions.field1037 = "";
                                    AuthProt.method6377(true);
                                    TextureProvider.method1169("", "Connecting to server...", "");
                                    class124.method1843(20);
                                    return;
                                 }

                                 if(var25 && ClientOptions.field1037.length() < 6) {
                                    ClientOptions.field1037 = ClientOptions.field1037 + class129.currentTypedKey;
                                 }
                              }
                           }
                        } else if(class203.loginIndex == 5) {
                           var22 = class203.loginWindowX + 180 - 80;
                           var24 = 321;
                           if(var4 == 1 && var19 >= var22 - 75 && var19 <= var22 + 75 && var20 >= var24 - 20 && var20 <= var24 + 20) {
                              class78.method1073();
                              return;
                           }

                           var22 = class203.loginWindowX + 180 + 80;
                           if(var4 == 1 && var19 >= var22 - 75 && var19 <= var22 + 75 && var20 >= var24 - 20 && var20 <= var24 + 20) {
                              Packet.method5318(true);
                           }

                           while(HeadbarType.method2071()) {
                              var25 = false;

                              for(var26 = 0; var26 < "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:\'@#~,<.>/?\\| ".length(); ++var26) {
                                 if(class129.currentTypedKey == "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:\'@#~,<.>/?\\| ".charAt(var26)) {
                                    var25 = true;
                                    break;
                                 }
                              }

                              if(SocialState.currentPressedKey == 13) {
                                 Packet.method5318(true);
                              } else {
                                 if(SocialState.currentPressedKey == 85 && class203.username.length() > 0) {
                                    class203.username = class203.username.substring(0, class203.username.length() - 1);
                                    client.onUsernameChanged(-1);
                                 }

                                 if(SocialState.currentPressedKey == 84) {
                                    class78.method1073();
                                    return;
                                 }

                                 if(var25 && class203.username.length() < 320) {
                                    class203.username = class203.username + class129.currentTypedKey;
                                    client.onUsernameChanged(-1);
                                 }
                              }
                           }
                        } else if(class203.loginIndex == 6) {
                           while(true) {
                              do {
                                 if(!HeadbarType.method2071()) {
                                    var23 = 321;
                                    if(var4 == 1 && var20 >= var23 - 20 && var20 <= var23 + 20) {
                                       Packet.method5318(true);
                                    }

                                    return;
                                 }
                              } while(SocialState.currentPressedKey != 84 && SocialState.currentPressedKey != 13);

                              Packet.method5318(true);
                           }
                        } else if(class203.loginIndex == 7) {
                           var22 = class203.loginWindowX + 180 - 80;
                           var24 = 321;
                           if(var4 == 1 && var19 >= var22 - 75 && var19 <= var22 + 75 && var20 >= var24 - 20 && var20 <= var24 + 20) {
                              class129.method1898(WorldComparator.method84("secure", true) + "m=dob/set_dob.ws", true, false);
                              TextureProvider.method1169("", "Page has opened in a new window.", "(Please check your popup blocker.)");
                              class203.loginIndex = 6;
                              return;
                           }

                           var22 = class203.loginWindowX + 180 + 80;
                           if(var4 == 1 && var19 >= var22 - 75 && var19 <= var22 + 75 && var20 >= var24 - 20 && var20 <= var24 + 20) {
                              Packet.method5318(true);
                           }
                        } else if(class203.loginIndex == 8) {
                           var22 = class203.loginWindowX + 180 - 80;
                           var24 = 321;
                           if(var4 == 1 && var19 >= var22 - 75 && var19 <= var22 + 75 && var20 >= var24 - 20 && var20 <= var24 + 20) {
                              class129.method1898("https://www.jagex.com/terms/privacy/#eight", true, false);
                              TextureProvider.method1169("", "Page has opened in a new window.", "(Please check your popup blocker.)");
                              class203.loginIndex = 6;
                              return;
                           }

                           var22 = class203.loginWindowX + 180 + 80;
                           if(var4 == 1 && var19 >= var22 - 75 && var19 <= var22 + 75 && var20 >= var24 - 20 && var20 <= var24 + 20) {
                              Packet.method5318(true);
                           }
                        } else if(class203.loginIndex == 12) {
                           String var17 = "";
                           switch(class203.field1170) {
                           case 0:
                              var17 = "https://support.runescape.com/hc/en-gb/articles/115002238729-Account-Bans";
                              break;
                           case 1:
                              var17 = "https://support.runescape.com/hc/en-gb/articles/206103939-My-account-is-locked";
                              break;
                           default:
                              Packet.method5318(false);
                           }

                           var8 = class203.loginWindowX + 180;
                           var9 = 276;
                           if(var4 == 1 && var19 >= var8 - 75 && var19 <= var8 + 75 && var20 >= var9 - 20 && var20 <= var9 + 20) {
                              class129.method1898(var17, true, false);
                              TextureProvider.method1169("", "Page has opened in a new window.", "(Please check your popup blocker.)");
                              class203.loginIndex = 6;
                              return;
                           }

                           var8 = class203.loginWindowX + 180;
                           var9 = 326;
                           if(var4 == 1 && var19 >= var8 - 75 && var19 <= var8 + 75 && var20 >= var9 - 20 && var20 <= var9 + 20) {
                              Packet.method5318(false);
                           }
                        }
                     }
                  } else {
                     while(HeadbarType.method2071()) {
                        if(SocialState.currentPressedKey == 84) {
                           Packet.method5318(false);
                        } else if(SocialState.currentPressedKey == 13) {
                           class203.loginIndex = 0;
                        }
                     }

                     var22 = class203.field1176 - 80;
                     var24 = 321;
                     if(var4 == 1 && var19 >= var22 - 75 && var19 <= var22 + 75 && var20 >= var24 - 20 && var20 <= var24 + 20) {
                        Packet.method5318(false);
                     }

                     var22 = class203.field1176 + 80;
                     if(var4 == 1 && var19 >= var22 - 75 && var19 <= var22 + 75 && var20 >= var24 - 20 && var20 <= var24 + 20) {
                        class203.loginIndex = 0;
                     }
                  }
               }

            }
         }
      }
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "(Ljava/awt/Component;I)V",
      garbageValue = "808851871"
   )
   static void method129(Component var0) {
      var0.setFocusTraversalKeysEnabled(false);
      var0.addKeyListener(KeyFocusListener.keyboard);
      var0.addFocusListener(KeyFocusListener.keyboard);
   }

   @ObfuscatedName("id")
   @ObfuscatedSignature(
      signature = "([Lia;IIIIIIIIB)V",
      garbageValue = "8"
   )
   static final void method128(ComponentType[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      client.renderWidgetLayer(var0, var1, var2, var3, var4, var5, var6, var7, var8);
      Rasterizer2D.method684(var2, var3, var4, var5);
      Graphics3D.method2087();

      for(int var9 = 0; var9 < var0.length; ++var9) {
         ComponentType var10 = var0[var9];
         if(var10 != null && (var10.layer == var1 || var1 == -1412584499 && var10 == client.draggedWidget)) {
            int var11;
            if(var8 == -1) {
               client.widgetPositionX[client.interfaceCount] = var10.x + var6;
               client.widgetPositionY[client.interfaceCount] = var7 + var10.y;
               client.widgetBoundsWidth[client.interfaceCount] = var10.width;
               client.widgetBoundsHeight[client.interfaceCount] = var10.height;
               var11 = ++client.interfaceCount - 1;
            } else {
               var11 = var8;
            }

            var10.boundsIndex = var11;
            var10.loopCycle = client.gameCycle;
            if(!var10.isIf3 || !class91.method1200(var10)) {
               if(var10.clientcode > 0) {
                  FriendContainer.method6441(var10);
               }

               int var12 = var10.x + var6;
               int var13 = var7 + var10.y;
               int var14 = var10.trans;
               int var15;
               int var16;
               if(var10 == client.draggedWidget) {
                  if(var1 != -1412584499 && !var10.dragRenderBehavior) {
                     GrandExchangeOffer.field69 = var0;
                     WorldMapType2.field286 = var6;
                     MouseInput.field499 = var7;
                     continue;
                  }

                  if(client.draggingWidget && client.field904) {
                     var15 = MouseInput.mouseLastX;
                     var16 = MouseInput.mouseLastY;
                     var15 -= client.field824;
                     var16 -= client.field802;
                     if(var15 < client.field757) {
                        var15 = client.field757;
                     }

                     if(var15 + var10.width > client.field757 + client.field823.width) {
                        var15 = client.field757 + client.field823.width - var10.width;
                     }

                     if(var16 < client.field829) {
                        var16 = client.field829;
                     }

                     if(var16 + var10.height > client.field829 + client.field823.height) {
                        var16 = client.field829 + client.field823.height - var10.height;
                     }

                     var12 = var15;
                     var13 = var16;
                  }

                  if(!var10.dragRenderBehavior) {
                     var14 = 128;
                  }
               }

               int var17;
               int var18;
               int var19;
               int var20;
               int var21;
               int var22;
               if(var10.type == 2) {
                  var15 = var2;
                  var16 = var3;
                  var17 = var4;
                  var18 = var5;
               } else if(var10.type == 9) {
                  var19 = var12;
                  var20 = var13;
                  var21 = var12 + var10.width;
                  var22 = var13 + var10.height;
                  if(var21 < var12) {
                     var19 = var21;
                     var21 = var12;
                  }

                  if(var22 < var13) {
                     var20 = var22;
                     var22 = var13;
                  }

                  ++var21;
                  ++var22;
                  var15 = var19 > var2?var19:var2;
                  var16 = var20 > var3?var20:var3;
                  var17 = var21 < var4?var21:var4;
                  var18 = var22 < var5?var22:var5;
               } else {
                  var19 = var12 + var10.width;
                  var20 = var13 + var10.height;
                  var15 = var12 > var2?var12:var2;
                  var16 = var13 > var3?var13:var3;
                  var17 = var19 < var4?var19:var4;
                  var18 = var20 < var5?var20:var5;
               }

               if(!var10.isIf3 || var15 < var17 && var16 < var18) {
                  if(var10.clientcode != 0) {
                     if(var10.clientcode == 1336) {
                        if(client.displayFps) {
                           var13 += 15;
                           Occluder.font_p12full.method6158("Fps:" + GameEngine.FPS, var12 + var10.width, var13, 16776960, -1);
                           var13 += 15;
                           Runtime var41 = Runtime.getRuntime();
                           var20 = (int)((var41.totalMemory() - var41.freeMemory()) / 1024L);
                           var21 = 16776960;
                           if(var20 > 327680 && !client.lowMemory) {
                              var21 = 16711680;
                           }

                           Occluder.font_p12full.method6158("Mem:" + var20 + "k", var12 + var10.width, var13, var21, -1);
                           var13 += 15;
                        }
                        continue;
                     }

                     if(var10.clientcode == 1337) {
                        client.field798 = var12;
                        client.field799 = var13;
                        class234.method4540(var12, var13, var10.width, var10.height);
                        client.field795[var10.boundsIndex] = true;
                        Rasterizer2D.method684(var2, var3, var4, var5);
                        continue;
                     }

                     if(var10.clientcode == 1338) {
                        Entity.method1811(var10, var12, var13, var11);
                        Rasterizer2D.method684(var2, var3, var4, var5);
                        continue;
                     }

                     if(var10.clientcode == 1339) {
                        class47.method774(var10, var12, var13, var11);
                        Rasterizer2D.method684(var2, var3, var4, var5);
                        continue;
                     }

                     if(var10.clientcode == 1400) {
                        class69.worldMap.method2882(var12, var13, var10.width, var10.height, client.gameCycle);
                     }

                     if(var10.clientcode == 1401) {
                        class69.worldMap.method2885(var12, var13, var10.width, var10.height);
                     }
                  }

                  if(var10.type == 0) {
                     if(!var10.isIf3 && class91.method1200(var10) && var10 != NPCType.field3585) {
                        continue;
                     }

                     if(!var10.isIf3) {
                        if(var10.scrollY > var10.scrollHeight - var10.height) {
                           var10.scrollY = var10.scrollHeight - var10.height;
                        }

                        if(var10.scrollY < 0) {
                           var10.scrollY = 0;
                        }
                     }

                     method128(var0, var10.id, var15, var16, var17, var18, var12 - var10.scrollX, var13 - var10.scrollY, var11);
                     if(var10.children != null) {
                        method128(var10.children, var10.id, var15, var16, var17, var18, var12 - var10.scrollX, var13 - var10.scrollY, var11);
                     }

                     SubInterface var30 = (SubInterface) client.subInterfaces.method6335((long)var10.id);
                     if(var30 != null) {
                        Item.method4636(var30.id, var15, var16, var17, var18, var12, var13, var11);
                     }

                     Rasterizer2D.method684(var2, var3, var4, var5);
                     Graphics3D.method2087();
                  }

                  if(client.isResized || client.field856[var11] || client.gameDrawingMode > 1) {
                     if(var10.type == 0 && !var10.isIf3 && var10.scrollHeight > var10.height) {
                        HitmarkType.method4056(var12 + var10.width, var13, var10.scrollY, var10.height, var10.scrollHeight);
                     }

                     if(var10.type != 1) {
                        int var23;
                        int var24;
                        int var25;
                        int var26;
                        if(var10.type == 2) {
                           var19 = 0;

                           for(var20 = 0; var20 < var10.sizeY; ++var20) {
                              for(var21 = 0; var21 < var10.sizeX; ++var21) {
                                 var22 = var12 + var21 * (var10.paddingX + 32);
                                 var23 = var13 + var20 * (var10.paddingY + 32);
                                 if(var19 < 20) {
                                    var22 += var10.xSprites[var19];
                                    var23 += var10.field2720[var19];
                                 }

                                 if(var10.objIds[var19] <= 0) {
                                    if(var10.field2760 != null && var19 < 20) {
                                       SpritePixels var43 = var10.method5644(var19);
                                       if(var43 != null) {
                                          var43.method1311(var22, var23);
                                       } else if(ComponentType.field2740) {
                                          WorldMapRegion.method5554(var10);
                                       }
                                    }
                                 } else {
                                    boolean var37 = false;
                                    boolean var38 = false;
                                    var26 = var10.objIds[var19] - 1;
                                    if(var22 + 32 > var2 && var22 < var4 && var23 + 32 > var3 && var23 < var5 || var10 == GameCanvas.field420 && var19 == client.field783) {
                                       SpritePixels var27;
                                       if(client.itemSelectionState == 1 && var19 == class29.selectedItemIndex && var10.id == class132.field3198) {
                                          var27 = class139.method1992(var26, var10.objCounts[var19], 2, 0, 2, false);
                                       } else {
                                          var27 = class139.method1992(var26, var10.objCounts[var19], 1, 3153952, 2, false);
                                       }

                                       if(var27 != null) {
                                          if(var10 == GameCanvas.field420 && var19 == client.field783) {
                                             var24 = MouseInput.mouseLastX - client.field685;
                                             var25 = MouseInput.mouseLastY - client.field809;
                                             if(var24 < 5 && var24 > -5) {
                                                var24 = 0;
                                             }

                                             if(var25 < 5 && var25 > -5) {
                                                var25 = 0;
                                             }

                                             if(client.itemPressedDuration < 5) {
                                                var24 = 0;
                                                var25 = 0;
                                             }

                                             var27.method1374(var24 + var22, var23 + var25, 128);
                                             if(var1 != -1) {
                                                ComponentType var28 = var0[var1 & 65535];
                                                int var29;
                                                if(var25 + var23 < Rasterizer2D.drawingAreaTop && var28.scrollY > 0) {
                                                   var29 = (Rasterizer2D.drawingAreaTop - var23 - var25) * client.field710 / 3;
                                                   if(var29 > client.field710 * 10) {
                                                      var29 = client.field710 * 10;
                                                   }

                                                   if(var29 > var28.scrollY) {
                                                      var29 = var28.scrollY;
                                                   }

                                                   var28.scrollY -= var29;
                                                   client.field809 += var29;
                                                   WorldMapRegion.method5554(var28);
                                                }

                                                if(var25 + var23 + 32 > Rasterizer2D.drawingAreaRight && var28.scrollY < var28.scrollHeight - var28.height) {
                                                   var29 = (var25 + var23 + 32 - Rasterizer2D.drawingAreaRight) * client.field710 / 3;
                                                   if(var29 > client.field710 * 10) {
                                                      var29 = client.field710 * 10;
                                                   }

                                                   if(var29 > var28.scrollHeight - var28.height - var28.scrollY) {
                                                      var29 = var28.scrollHeight - var28.height - var28.scrollY;
                                                   }

                                                   var28.scrollY += var29;
                                                   client.field809 -= var29;
                                                   WorldMapRegion.method5554(var28);
                                                }
                                             }
                                          } else if(var10 == class285.field1 && var19 == client.pressedItemIndex) {
                                             var27.method1374(var22, var23, 128);
                                          } else {
                                             var27.method1311(var22, var23);
                                          }
                                       } else {
                                          WorldMapRegion.method5554(var10);
                                       }
                                    }
                                 }

                                 ++var19;
                              }
                           }
                        } else if(var10.type == 3) {
                           if(ParamType.method618(var10)) {
                              var19 = var10.field2811;
                              if(var10 == NPCType.field3585 && var10.field2717 != 0) {
                                 var19 = var10.field2717;
                              }
                           } else {
                              var19 = var10.color;
                              if(var10 == NPCType.field3585 && var10.field2819 != 0) {
                                 var19 = var10.field2819;
                              }
                           }

                           if(var10.filled) {
                              switch(var10.field2719.field3874) {
                              case 1:
                                 Rasterizer2D.method761(var12, var13, var10.width, var10.height, var10.color, var10.field2811);
                                 break;
                              case 2:
                                 Rasterizer2D.method718(var12, var13, var10.width, var10.height, var10.color, var10.field2811, 255 - (var10.trans & 255), 255 - (var10.field2787 & 255));
                                 break;
                              default:
                                 if(var14 == 0) {
                                    Rasterizer2D.method692(var12, var13, var10.width, var10.height, var19);
                                 } else {
                                    Rasterizer2D.method691(var12, var13, var10.width, var10.height, var19, 256 - (var14 & 255));
                                 }
                              }
                           } else if(var14 == 0) {
                              Rasterizer2D.method696(var12, var13, var10.width, var10.height, var19);
                           } else {
                              Rasterizer2D.method697(var12, var13, var10.width, var10.height, var19, 256 - (var14 & 255));
                           }
                        } else {
                           Font var39;
                           if(var10.type == 4) {
                              var39 = var10.method5669();
                              if(var39 == null) {
                                 if(ComponentType.field2740) {
                                    WorldMapRegion.method5554(var10);
                                 }
                              } else {
                                 String var45 = var10.text;
                                 if(ParamType.method618(var10)) {
                                    var20 = var10.field2811;
                                    if(var10 == NPCType.field3585 && var10.field2717 != 0) {
                                       var20 = var10.field2717;
                                    }

                                    if(var10.string1.length() > 0) {
                                       var45 = var10.string1;
                                    }
                                 } else {
                                    var20 = var10.color;
                                    if(var10 == NPCType.field3585 && var10.field2819 != 0) {
                                       var20 = var10.field2819;
                                    }
                                 }

                                 if(var10.isIf3 && var10.linkObjType != -1) {
                                    ObjType var47 = class79.method1074(var10.linkObjType);
                                    var45 = var47.name;
                                    if(var45 == null) {
                                       var45 = "null";
                                    }

                                    if((var47.stackable == 1 || var10.linkObjCount != 1) && var10.linkObjCount != -1) {
                                       var45 = class308.method6152(16748608) + var45 + "</col>" + " " + 'x' + WorldMapType1.method4932(var10.linkObjCount);
                                    }
                                 }

                                 if(var10 == client.field793) {
                                    var45 = "Please wait...";
                                    var20 = var10.color;
                                 }

                                 if(!var10.isIf3) {
                                    var45 = method126(var45, var10);
                                 }

                                 var39.method6207(var45, var12, var13, var10.width, var10.height, var20, var10.textShadow?0:-1, var10.horizTextAlign, var10.vertTextAlign, var10.lineHeight);
                              }
                           } else if(var10.type == 5) {
                              SpritePixels var40;
                              if(!var10.isIf3) {
                                 var40 = var10.method5650(ParamType.method618(var10), (byte)-78);
                                 if(var40 != null) {
                                    var40.method1311(var12, var13);
                                 } else if(ComponentType.field2740) {
                                    WorldMapRegion.method5554(var10);
                                 }
                              } else {
                                 if(var10.linkObjType != -1) {
                                    var40 = class139.method1992(var10.linkObjType, var10.linkObjCount, var10.outline, var10.shadow, var10.objNumMode, false);
                                 } else {
                                    var40 = var10.method5650(false, (byte)-3);
                                 }

                                 if(var40 == null) {
                                    if(ComponentType.field2740) {
                                       WorldMapRegion.method5554(var10);
                                    }
                                 } else {
                                    var20 = var40.maxWidth;
                                    var21 = var40.maxHeight;
                                    if(!var10.tile) {
                                       var22 = var10.width * 4096 / var20;
                                       if(var10.angle2d != 0) {
                                          var40.method1299(var10.width / 2 + var12, var10.height / 2 + var13, var10.angle2d, var22);
                                       } else if(var14 != 0) {
                                          var40.method1319(var12, var13, var10.width, var10.height, 256 - (var14 & 255));
                                       } else if(var20 == var10.width && var21 == var10.height) {
                                          var40.method1311(var12, var13);
                                       } else {
                                          var40.method1313(var12, var13, var10.width, var10.height);
                                       }
                                    } else {
                                       Rasterizer2D.method685(var12, var13, var12 + var10.width, var13 + var10.height);
                                       var22 = (var20 - 1 + var10.width) / var20;
                                       var23 = (var21 - 1 + var10.height) / var21;

                                       for(var24 = 0; var24 < var22; ++var24) {
                                          for(var25 = 0; var25 < var23; ++var25) {
                                             if(var10.angle2d != 0) {
                                                var40.method1299(var20 / 2 + var12 + var24 * var20, var21 / 2 + var13 + var25 * var21, var10.angle2d, 4096);
                                             } else if(var14 != 0) {
                                                var40.method1374(var12 + var24 * var20, var13 + var21 * var25, 256 - (var14 & 255));
                                             } else {
                                                var40.method1311(var12 + var20 * var24, var13 + var25 * var21);
                                             }
                                          }
                                       }

                                       Rasterizer2D.method684(var2, var3, var4, var5);
                                    }
                                 }
                              }
                           } else {
                              ObjType var33;
                              if(var10.type == 6) {
                                 boolean var36 = ParamType.method618(var10);
                                 if(var36) {
                                    var20 = var10.field2701;
                                 } else {
                                    var20 = var10.animation;
                                 }

                                 Model var42 = null;
                                 var22 = 0;
                                 if(var10.linkObjType != -1) {
                                    var33 = class79.method1074(var10.linkObjType);
                                    if(var33 != null) {
                                       var33 = var33.method2221(var10.linkObjCount);
                                       var42 = var33.method2220(1);
                                       if(var42 != null) {
                                          var42.method3833();
                                          var22 = var42.modelHeight / 2;
                                       } else {
                                          WorldMapRegion.method5554(var10);
                                       }
                                    }
                                 } else if(var10.modelType == 5) {
                                    if(var10.modelId == 0) {
                                       var42 = client.field918.method837((Sequence)null, -1, (Sequence)null, -1);
                                    } else {
                                       var42 = class71.localPlayer.vmethod6001(-2033135869);
                                    }
                                 } else if(var20 == -1) {
                                    var42 = var10.method5653((Sequence)null, -1, var36, class71.localPlayer.composition);
                                    if(var42 == null && ComponentType.field2740) {
                                       WorldMapRegion.method5554(var10);
                                    }
                                 } else {
                                    Sequence var46 = AuthProt.method6374(var20);
                                    var42 = var10.method5653(var46, var10.field2817, var36, class71.localPlayer.composition);
                                    if(var42 == null && ComponentType.field2740) {
                                       WorldMapRegion.method5554(var10);
                                    }
                                 }

                                 Graphics3D.method2090(var10.width / 2 + var12, var10.height / 2 + var13);
                                 var23 = Graphics3D.SINE[var10.xan2d] * var10.zoom2d >> 16;
                                 var24 = Graphics3D.COSINE[var10.xan2d] * var10.zoom2d >> 16;
                                 if(var42 != null) {
                                    if(!var10.isIf3) {
                                       var42.method3844(0, var10.yan2d, 0, var10.xan2d, 0, var23, var24);
                                    } else {
                                       var42.method3833();
                                       if(var10.orthogonal) {
                                          var42.method3900(0, var10.yan2d, var10.zan2d, var10.xan2d, var10.offsetX2d, var22 + var23 + var10.offsetY2d, var24 + var10.offsetY2d, var10.zoom2d);
                                       } else {
                                          var42.method3844(0, var10.yan2d, var10.zan2d, var10.xan2d, var10.offsetX2d, var22 + var23 + var10.offsetY2d, var24 + var10.offsetY2d);
                                       }
                                    }
                                 }

                                 Graphics3D.method2139();
                              } else {
                                 if(var10.type == 7) {
                                    var39 = var10.method5669();
                                    if(var39 == null) {
                                       if(ComponentType.field2740) {
                                          WorldMapRegion.method5554(var10);
                                       }
                                       continue;
                                    }

                                    var20 = 0;

                                    for(var21 = 0; var21 < var10.sizeY; ++var21) {
                                       for(var22 = 0; var22 < var10.sizeX; ++var22) {
                                          if(var10.objIds[var20] > 0) {
                                             var33 = class79.method1074(var10.objIds[var20] - 1);
                                             String var31;
                                             if(var33.stackable != 1 && var10.objCounts[var20] == 1) {
                                                var31 = class308.method6152(16748608) + var33.name + "</col>";
                                             } else {
                                                var31 = class308.method6152(16748608) + var33.name + "</col>" + " " + 'x' + WorldMapType1.method4932(var10.objCounts[var20]);
                                             }

                                             var25 = var22 * (var10.paddingX + 115) + var12;
                                             var26 = var21 * (var10.paddingY + 12) + var13;
                                             if(var10.horizTextAlign == 0) {
                                                var39.method6165(var31, var25, var26, var10.color, var10.textShadow?0:-1);
                                             } else if(var10.horizTextAlign == 1) {
                                                var39.method6222(var31, var10.width / 2 + var25, var26, var10.color, var10.textShadow?0:-1);
                                             } else {
                                                var39.method6158(var31, var25 + var10.width - 1, var26, var10.color, var10.textShadow?0:-1);
                                             }
                                          }

                                          ++var20;
                                       }
                                    }
                                 }

                                 if(var10.type == 8 && var10 == class244.field1961 && client.field801 == client.field769) {
                                    var19 = 0;
                                    var20 = 0;
                                    Font var32 = Occluder.font_p12full;
                                    String var34 = var10.text;

                                    String var44;
                                    for(var34 = method126(var34, var10); var34.length() > 0; var20 = var20 + var32.verticalSpace + 1) {
                                       var24 = var34.indexOf("<br>");
                                       if(var24 != -1) {
                                          var44 = var34.substring(0, var24);
                                          var34 = var34.substring(var24 + 4);
                                       } else {
                                          var44 = var34;
                                          var34 = "";
                                       }

                                       var25 = var32.method6160(var44);
                                       if(var25 > var19) {
                                          var19 = var25;
                                       }
                                    }

                                    var19 += 6;
                                    var20 += 7;
                                    var24 = var12 + var10.width - 5 - var19;
                                    var25 = var13 + var10.height + 5;
                                    if(var24 < var12 + 5) {
                                       var24 = var12 + 5;
                                    }

                                    if(var19 + var24 > var4) {
                                       var24 = var4 - var19;
                                    }

                                    if(var25 + var20 > var5) {
                                       var25 = var5 - var20;
                                    }

                                    Rasterizer2D.method692(var24, var25, var19, var20, 16777120);
                                    Rasterizer2D.method696(var24, var25, var19, var20, 0);
                                    var34 = var10.text;
                                    var26 = var25 + var32.verticalSpace + 2;

                                    for(var34 = method126(var34, var10); var34.length() > 0; var26 = var26 + var32.verticalSpace + 1) {
                                       int var35 = var34.indexOf("<br>");
                                       if(var35 != -1) {
                                          var44 = var34.substring(0, var35);
                                          var34 = var34.substring(var35 + 4);
                                       } else {
                                          var44 = var34;
                                          var34 = "";
                                       }

                                       var32.method6165(var44, var24 + 3, var26, 0, -1);
                                    }
                                 }

                                 if(var10.type == 9) {
                                    if(var10.lineDirection) {
                                       var19 = var12;
                                       var20 = var13 + var10.height;
                                       var21 = var12 + var10.width;
                                       var22 = var13;
                                    } else {
                                       var19 = var12;
                                       var20 = var13;
                                       var21 = var12 + var10.width;
                                       var22 = var13 + var10.height;
                                    }

                                    if(var10.lineWidth == 1) {
                                       Rasterizer2D.method702(var19, var20, var21, var22, var10.color);
                                    } else {
                                       class71.method1013(var19, var20, var21, var22, var10.color, var10.lineWidth);
                                    }
                                 }
                              }
                           }
                        }
                     }
                  }
               }
            }
         }
      }

   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(ZZI)Llv;",
      garbageValue = "1052315582"
   )
   static IndexedSprite method125(boolean var0, boolean var1) {
      return var0?(var1?UnitPriceComparator.field78:class252.field2534):(var1?TotalQuantityComparator.field57:class203.field1154);
   }

   @ObfuscatedName("io")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;Lia;B)Ljava/lang/String;",
      garbageValue = "30"
   )
   static String method126(String var0, ComponentType var1) {
      if(var0.indexOf("%") != -1) {
         for(int var2 = 1; var2 <= 5; ++var2) {
            while(true) {
               int var3 = var0.indexOf("%" + var2);
               if(var3 == -1) {
                  break;
               }

               String var4 = var0.substring(0, var3);
               int var6 = class47.method797(var1, var2 - 1);
               String var5;
               if(var6 < 999999999) {
                  var5 = Integer.toString(var6);
               } else {
                  var5 = "*";
               }

               var0 = var4 + var5 + var0.substring(var3 + 2);
            }
         }
      }

      return var0;
   }

   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "1477367124"
   )
   public static void method130() {
      while(true) {
         Deque var1 = IndexStoreActionHandler.IndexStoreActionHandler_requestQueue;
         FileSystem var0;
         synchronized(IndexStoreActionHandler.IndexStoreActionHandler_requestQueue) {
            var0 = (FileSystem)IndexStoreActionHandler.IndexStoreActionHandler_responseQueue.method3909();
         }

         if(var0 == null) {
            return;
         }

         var0.data.method2722(var0.index, (int)var0.hash, var0.field3231, false);
      }
   }
}
