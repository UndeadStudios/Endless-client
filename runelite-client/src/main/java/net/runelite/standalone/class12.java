package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ik")
public class class12 {
   @ObfuscatedName("hq")
   @ObfuscatedSignature(
      signature = "(Lfh;I)V",
      garbageValue = "-1237176758"
   )
   static final void method179(ZoneProt var0) {
      Bit var1 = client.serverConnection.clientPacket;
      int var3;
      int var5;
      int var6;
      int var7;
      int var8;
      int var9;
      int var37;
      int var38;
      if(ZoneProt.field2341 == var0) {
         var37 = var1.method5115();
         var3 = (var37 >> 4 & 7) + VarPlayerType.field3319;
         var38 = (var37 & 7) + class318.field115;
         var5 = var1.method5117();
         var6 = var5 >> 2;
         var7 = var5 & 3;
         var8 = client.field709[var6];
         var9 = var1.readUnsignedShort128();
         if(var3 >= 0 && var38 >= 0 && var3 < 104 && var38 < 104) {
            WorldMapType1.method4931(ServerProt.level, var3, var38, var8, var9, var6, var7, 0, -1);
         }

      } else if(ZoneProt.field2339 == var0) {
         var37 = var1.method5309();
         var3 = var1.method5281();
         var38 = var1.method5309();
         var5 = var1.method5115();
         var6 = (var5 >> 4 & 7) + VarPlayerType.field3319;
         var7 = (var5 & 7) + class318.field115;
         if(var6 >= 0 && var7 >= 0 && var6 < 104 && var7 < 104) {
            Deque var42 = client.groundItemDeque[ServerProt.level][var6][var7];
            if(var42 != null) {
               for(Item var32 = (Item)var42.method3930(); var32 != null; var32 = (Item)var42.method3924()) {
                  if((var37 & 32767) == var32.id && var38 == var32.quantity) {
                     var32.quantityChanged(var3);
                     var32.quantity = var3;
                     break;
                  }
               }

               class232.method4511(var6, var7);
            }
         }

      } else {
         int var10;
         int var12;
         byte var13;
         int var14;
         if(ZoneProt.field2340 == var0) {
            byte var2 = var1.method5119();
            var3 = var1.method5281();
            byte var4 = var1.method5119();
            var5 = var1.readUnsignedShort128();
            var6 = var1.readUnsignedShort();
            var7 = var1.method5115();
            var8 = var7 >> 2;
            var9 = var7 & 3;
            var10 = client.field709[var8];
            byte var11 = var1.method5118();
            var12 = var1.method5309();
            var13 = var1.method5119();
            var14 = var1.readUnsignedByteC();
            int var15 = (var14 >> 4 & 7) + VarPlayerType.field3319;
            int var16 = (var14 & 7) + class318.field115;
            PlayerEntity var17;
            if(var12 == client.localPlayerIndex) {
               var17 = class71.localPlayer;
            } else {
               var17 = client.players[var12];
            }

            if(var17 != null) {
               LocType var18 = GrandExchangeOffer.method1736(var5);
               int var19;
               int var20;
               if(var9 != 1 && var9 != 3) {
                  var19 = var18.width;
                  var20 = var18.length;
               } else {
                  var19 = var18.length;
                  var20 = var18.width;
               }

               int var21 = var15 + (var19 >> 1);
               int var22 = var15 + (var19 + 1 >> 1);
               int var23 = var16 + (var20 >> 1);
               int var24 = var16 + (var20 + 1 >> 1);
               int[][] var25 = class91.tileHeights[ServerProt.level];
               int var26 = var25[var21][var23] + var25[var22][var23] + var25[var21][var24] + var25[var22][var24] >> 2;
               int var27 = (var15 << 7) + (var19 << 6);
               int var28 = (var16 << 7) + (var20 << 6);
               Model var29 = var18.method388(var8, var9, var25, var27, var26, var28);
               if(var29 != null) {
                  WorldMapType1.method4931(ServerProt.level, var15, var16, var10, -1, 0, 0, var6 + 1, var3 + 1);
                  var17.animationCycleStart = var6 + client.gameCycle;
                  var17.animationCycleEnd = var3 + client.gameCycle;
                  var17.model = var29;
                  var17.field637 = var15 * 128 + var19 * 64;
                  var17.field622 = var16 * 128 + var20 * 64;
                  var17.field617 = var26;
                  byte var30;
                  if(var2 > var13) {
                     var30 = var2;
                     var2 = var13;
                     var13 = var30;
                  }

                  if(var11 > var4) {
                     var30 = var11;
                     var11 = var4;
                     var4 = var30;
                  }

                  var17.field630 = var2 + var15;
                  var17.field626 = var13 + var15;
                  var17.field625 = var11 + var16;
                  var17.field628 = var4 + var16;
               }
            }
         }

         if(ZoneProt.field2338 == var0) {
            var37 = var1.method5117();
            var3 = var37 >> 2;
            var38 = var37 & 3;
            var5 = client.field709[var3];
            var6 = var1.method5117();
            var7 = (var6 >> 4 & 7) + VarPlayerType.field3319;
            var8 = (var6 & 7) + class318.field115;
            if(var7 >= 0 && var8 >= 0 && var7 < 104 && var8 < 104) {
               WorldMapType1.method4931(ServerProt.level, var7, var8, var5, -1, var3, var38, 0, -1);
            }

         } else {
            int var39;
            if(ZoneProt.field2332 == var0) {
               var37 = var1.method5117();
               var3 = var37 >> 2;
               var38 = var37 & 3;
               var5 = client.field709[var3];
               var6 = var1.readUnsignedByteC();
               var7 = (var6 >> 4 & 7) + VarPlayerType.field3319;
               var8 = (var6 & 7) + class318.field115;
               var9 = var1.readUnsignedShort();
               if(var7 >= 0 && var8 >= 0 && var7 < 103 && var8 < 103) {
                  if(var5 == 0) {
                     WallObject var33 = class312.sceneManager.method3643(ServerProt.level, var7, var8);
                     if(var33 != null) {
                        var39 = Resampler.method143(var33.hash);
                        if(var3 == 2) {
                           var33.entity1 = new Location(var39, 2, var38 + 4, ServerProt.level, var7, var8, var9, false, var33.entity1);
                           var33.entity2 = new Location(var39, 2, var38 + 1 & 3, ServerProt.level, var7, var8, var9, false, var33.entity2);
                        } else {
                           var33.entity1 = new Location(var39, var3, var38, ServerProt.level, var7, var8, var9, false, var33.entity1);
                        }
                     }
                  }

                  if(var5 == 1) {
                     DecorativeObject var43 = class312.sceneManager.method3789(ServerProt.level, var7, var8);
                     if(var43 != null) {
                        var39 = Resampler.method143(var43.hash);
                        if(var3 != 4 && var3 != 5) {
                           if(var3 == 6) {
                              var43.entity1 = new Location(var39, 4, var38 + 4, ServerProt.level, var7, var8, var9, false, var43.entity1);
                           } else if(var3 == 7) {
                              var43.entity1 = new Location(var39, 4, (var38 + 2 & 3) + 4, ServerProt.level, var7, var8, var9, false, var43.entity1);
                           } else if(var3 == 8) {
                              var43.entity1 = new Location(var39, 4, var38 + 4, ServerProt.level, var7, var8, var9, false, var43.entity1);
                              var43.entity2 = new Location(var39, 4, (var38 + 2 & 3) + 4, ServerProt.level, var7, var8, var9, false, var43.entity2);
                           }
                        } else {
                           var43.entity1 = new Location(var39, 4, var38, ServerProt.level, var7, var8, var9, false, var43.entity1);
                        }
                     }
                  }

                  if(var5 == 2) {
                     GameObject var44 = class312.sceneManager.method3645(ServerProt.level, var7, var8);
                     if(var3 == 11) {
                        var3 = 10;
                     }

                     if(var44 != null) {
                        var44.entity = new Location(Resampler.method143(var44.hash), var3, var38, ServerProt.level, var7, var8, var9, false, var44.entity);
                     }
                  }

                  if(var5 == 3) {
                     GroundObject var45 = class312.sceneManager.method3646(ServerProt.level, var7, var8);
                     if(var45 != null) {
                        var45.entity = new Location(Resampler.method143(var45.hash), 22, var38, ServerProt.level, var7, var8, var9, false, var45.entity);
                     }
                  }
               }

            } else if(ZoneProt.field2335 == var0) {
               var37 = var1.readUnsignedShort();
               var3 = var1.method5115();
               var38 = var1.readUnsignedShort128();
               var5 = var1.readUnsignedByte();
               var6 = (var5 >> 4 & 7) + VarPlayerType.field3319;
               var7 = (var5 & 7) + class318.field115;
               if(var6 >= 0 && var7 >= 0 && var6 < 104 && var7 < 104) {
                  var6 = var6 * 128 + 64;
                  var7 = var7 * 128 + 64;
                  SpotAnimation var31 = new SpotAnimation(var37, ServerProt.level, var6, var7, TcpConnectionMessage.method5618(var6, var7, ServerProt.level) - var3, var38, client.gameCycle);
                  client.spotAnimationDeque.method3906(var31);
               }

            } else if(ZoneProt.field2337 == var0) {
               var37 = var1.method5117() * 4;
               var3 = var1.readUnsignedShort();
               var38 = var1.readUnsignedShort128();
               var5 = var1.method5117() * 4;
               var6 = var1.method5127();
               var7 = var1.readUnsignedByte();
               var8 = var1.method5117();
               var9 = var1.method5309();
               var10 = var1.method5115();
               var39 = (var10 >> 4 & 7) + VarPlayerType.field3319;
               var12 = (var10 & 7) + class318.field115;
               var13 = var1.method5118();
               byte var40 = var1.method5119();
               var14 = var40 + var39;
               int var41 = var13 + var12;
               if(var39 >= 0 && var12 >= 0 && var39 < 104 && var12 < 104 && var14 >= 0 && var41 >= 0 && var14 < 104 && var41 < 104 && var38 != 65535) {
                  var39 = var39 * 128 + 64;
                  var12 = var12 * 128 + 64;
                  var14 = var14 * 128 + 64;
                  var41 = var41 * 128 + 64;
                  ProjectileAnimation var34 = new ProjectileAnimation(var38, ServerProt.level, var39, var12, TcpConnectionMessage.method5618(var39, var12, ServerProt.level) - var5, var9 + client.gameCycle, var3 + client.gameCycle, var7, var8, var6, var37);
                  var34.method4012(var14, var41, TcpConnectionMessage.method5618(var14, var41, ServerProt.level) - var37, var9 + client.gameCycle);
                  client.projectiles.method3906(var34);
               }

            } else {
               Item var36;
               if(ZoneProt.field2333 != var0) {
                  if(ZoneProt.field2334 == var0) {
                     var37 = var1.readUnsignedShort128();
                     var3 = var1.method5281();
                     var38 = var1.method5115();
                     var5 = (var38 >> 4 & 7) + VarPlayerType.field3319;
                     var6 = (var38 & 7) + class318.field115;
                     if(var5 >= 0 && var6 >= 0 && var5 < 104 && var6 < 104) {
                        var36 = new Item();
                        var36.id = var3;
                        var36.quantityChanged(var37);
                        var36.quantity = var37;
                        if(client.groundItemDeque[ServerProt.level][var5][var6] == null) {
                           client.groundItemDeque[ServerProt.level][var5][var6] = new Deque();
                        }

                        client.groundItemDeque[ServerProt.level][var5][var6].method3906(var36);
                        class232.method4511(var5, var6);
                     }

                  } else {
                     if(ZoneProt.field2344 == var0) {
                        var37 = var1.readUnsignedByte();
                        var3 = (var37 >> 4 & 7) + VarPlayerType.field3319;
                        var38 = (var37 & 7) + class318.field115;
                        var5 = var1.method5117();
                        var6 = var1.method5115();
                        var7 = var6 >> 4 & 15;
                        var8 = var6 & 7;
                        var9 = var1.method5281();
                        if(var3 >= 0 && var38 >= 0 && var3 < 104 && var38 < 104) {
                           var10 = var7 + 1;
                           if(class71.localPlayer.pathX[0] >= var3 - var10 && class71.localPlayer.pathX[0] <= var3 + var10 && class71.localPlayer.pathY[0] >= var38 - var10 && class71.localPlayer.pathY[0] <= var38 + var10 && client.field886 != 0 && var8 > 0 && client.queuedSoundEffectCount < 50) {
                              client.queuedSoundEffectIDs[client.queuedSoundEffectCount] = var9;
                              client.unknownSoundValues1[client.queuedSoundEffectCount] = var8;
                              client.unknownSoundValues2[client.queuedSoundEffectCount] = var5;
                              client.audioEffects[client.queuedSoundEffectCount] = null;
                              client.soundLocations[client.queuedSoundEffectCount] = var7 + (var38 << 8) + (var3 << 16);
                              ++client.queuedSoundEffectCount;
                           }
                        }
                     }

                  }
               } else {
                  var37 = var1.method5115();
                  var3 = (var37 >> 4 & 7) + VarPlayerType.field3319;
                  var38 = (var37 & 7) + class318.field115;
                  var5 = var1.method5281();
                  if(var3 >= 0 && var38 >= 0 && var3 < 104 && var38 < 104) {
                     Deque var35 = client.groundItemDeque[ServerProt.level][var3][var38];
                     if(var35 != null) {
                        for(var36 = (Item)var35.method3930(); var36 != null; var36 = (Item)var35.method3924()) {
                           if((var5 & 32767) == var36.id) {
                              var36.method432();
                              break;
                           }
                        }

                        if(var35.method3930() == null) {
                           client.groundItemDeque[ServerProt.level][var3][var38] = null;
                        }

                        class232.method4511(var3, var38);
                     }
                  }

               }
            }
         }
      }
   }

   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "(Lge;I)V",
      garbageValue = "1244850771"
   )
   static final void method178(Bit var0) {
      int var1 = 0;
      var0.method2663();

      int var2;
      int var3;
      int var4;
      int var6;
      int var7;
      for(var2 = 0; var2 < PlayerList.highResolutionPlayerCount; ++var2) {
         var3 = PlayerList.highResolutionPlayerIndexes[var2];
         if((PlayerList.skipHistory[var3] & 1) == 0) {
            if(var1 > 0) {
               --var1;
               PlayerList.skipHistory[var3] = (byte)(PlayerList.skipHistory[var3] | 2);
            } else {
               var4 = var0.method2652(1);
               if(var4 == 0) {
                  var6 = var0.method2652(2);
                  if(var6 == 0) {
                     var7 = 0;
                  } else if(var6 == 1) {
                     var7 = var0.method2652(5);
                  } else if(var6 == 2) {
                     var7 = var0.method2652(8);
                  } else {
                     var7 = var0.method2652(11);
                  }

                  var1 = var7;
                  PlayerList.skipHistory[var3] = (byte)(PlayerList.skipHistory[var3] | 2);
               } else {
                  class125.method1852(var0, var3);
               }
            }
         }
      }

      var0.method2671();
      if(var1 != 0) {
         throw new RuntimeException();
      } else {
         var0.method2663();

         for(var2 = 0; var2 < PlayerList.highResolutionPlayerCount; ++var2) {
            var3 = PlayerList.highResolutionPlayerIndexes[var2];
            if((PlayerList.skipHistory[var3] & 1) != 0) {
               if(var1 > 0) {
                  --var1;
                  PlayerList.skipHistory[var3] = (byte)(PlayerList.skipHistory[var3] | 2);
               } else {
                  var4 = var0.method2652(1);
                  if(var4 == 0) {
                     var6 = var0.method2652(2);
                     if(var6 == 0) {
                        var7 = 0;
                     } else if(var6 == 1) {
                        var7 = var0.method2652(5);
                     } else if(var6 == 2) {
                        var7 = var0.method2652(8);
                     } else {
                        var7 = var0.method2652(11);
                     }

                     var1 = var7;
                     PlayerList.skipHistory[var3] = (byte)(PlayerList.skipHistory[var3] | 2);
                  } else {
                     class125.method1852(var0, var3);
                  }
               }
            }
         }

         var0.method2671();
         if(var1 != 0) {
            throw new RuntimeException();
         } else {
            var0.method2663();

            for(var2 = 0; var2 < PlayerList.lowResolutionPlayerCount; ++var2) {
               var3 = PlayerList.lowResolutionPlayerIndexes[var2];
               if((PlayerList.skipHistory[var3] & 1) != 0) {
                  if(var1 > 0) {
                     --var1;
                     PlayerList.skipHistory[var3] = (byte)(PlayerList.skipHistory[var3] | 2);
                  } else {
                     var4 = var0.method2652(1);
                     if(var4 == 0) {
                        var6 = var0.method2652(2);
                        if(var6 == 0) {
                           var7 = 0;
                        } else if(var6 == 1) {
                           var7 = var0.method2652(5);
                        } else if(var6 == 2) {
                           var7 = var0.method2652(8);
                        } else {
                           var7 = var0.method2652(11);
                        }

                        var1 = var7;
                        PlayerList.skipHistory[var3] = (byte)(PlayerList.skipHistory[var3] | 2);
                     } else if(MilliTimer.method1064(var0, var3)) {
                        PlayerList.skipHistory[var3] = (byte)(PlayerList.skipHistory[var3] | 2);
                     }
                  }
               }
            }

            var0.method2671();
            if(var1 != 0) {
               throw new RuntimeException();
            } else {
               var0.method2663();

               for(var2 = 0; var2 < PlayerList.lowResolutionPlayerCount; ++var2) {
                  var3 = PlayerList.lowResolutionPlayerIndexes[var2];
                  if((PlayerList.skipHistory[var3] & 1) == 0) {
                     if(var1 > 0) {
                        --var1;
                        PlayerList.skipHistory[var3] = (byte)(PlayerList.skipHistory[var3] | 2);
                     } else {
                        var4 = var0.method2652(1);
                        if(var4 == 0) {
                           var6 = var0.method2652(2);
                           if(var6 == 0) {
                              var7 = 0;
                           } else if(var6 == 1) {
                              var7 = var0.method2652(5);
                           } else if(var6 == 2) {
                              var7 = var0.method2652(8);
                           } else {
                              var7 = var0.method2652(11);
                           }

                           var1 = var7;
                           PlayerList.skipHistory[var3] = (byte)(PlayerList.skipHistory[var3] | 2);
                        } else if(MilliTimer.method1064(var0, var3)) {
                           PlayerList.skipHistory[var3] = (byte)(PlayerList.skipHistory[var3] | 2);
                        }
                     }
                  }
               }

               var0.method2671();
               if(var1 != 0) {
                  throw new RuntimeException();
               } else {
                  PlayerList.highResolutionPlayerCount = 0;
                  PlayerList.lowResolutionPlayerCount = 0;

                  for(var2 = 1; var2 < 2048; ++var2) {
                     PlayerList.skipHistory[var2] = (byte)(PlayerList.skipHistory[var2] >> 1);
                     PlayerEntity var8 = client.players[var2];
                     if(var8 != null) {
                        PlayerList.highResolutionPlayerIndexes[++PlayerList.highResolutionPlayerCount - 1] = var2;
                     } else {
                        PlayerList.lowResolutionPlayerIndexes[++PlayerList.lowResolutionPlayerCount - 1] = var2;
                     }
                  }

               }
            }
         }
      }
   }
}
