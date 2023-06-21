package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("an")
public class WorldMapType2 implements WorldMapSectionBase {
   @ObfuscatedName("nr")
   @ObfuscatedGetter(
      intValue = -2006679537
   )
   static int field286;
   @ObfuscatedName("sd")
   @ObfuscatedSignature(
      signature = "Lli;"
   )
   static MachineInfo machineInfo;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = 1166178053
   )
   int field291;
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = 1863463455
   )
   int field290;
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      intValue = -184754843
   )
   int field292;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = 623001821
   )
   int field289;
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      intValue = 1971572017
   )
   int field287;
   @ObfuscatedName("g")
   @ObfuscatedGetter(
      intValue = -488123313
   )
   int field288;

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(Lgx;B)V",
      garbageValue = "46"
   )
   public void vmethod4912(Packet var1) {
      this.field292 = var1.readUnsignedByte();
      this.field289 = var1.readUnsignedByte();
      this.field288 = var1.readUnsignedShort();
      this.field290 = var1.readUnsignedShort();
      this.field287 = var1.readUnsignedShort();
      this.field291 = var1.readUnsignedShort();
      this.method3075();
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(IIIB)[I",
      garbageValue = "103"
   )
   public int[] vmethod4911(int var1, int var2, int var3) {
      if(!this.vmethod4930(var1, var2, var3)) {
         return null;
      } else {
         int[] var4 = new int[]{this.field287 * 64 - this.field288 * 64 + var2, var3 + (this.field291 * 64 - this.field290 * 64)};
         return var4;
      }
   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "3"
   )
   void method3075() {
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "(Lag;B)V",
      garbageValue = "-123"
   )
   public void vmethod4925(WorldMapData var1) {
      if(var1.minX > this.field287) {
         var1.minX = this.field287;
      }

      if(var1.field232 < this.field287) {
         var1.field232 = this.field287;
      }

      if(var1.minY > this.field291) {
         var1.minY = this.field291;
      }

      if(var1.field236 < this.field291) {
         var1.field236 = this.field291;
      }

   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(IIII)Z",
      garbageValue = "-12219513"
   )
   public boolean vmethod4930(int var1, int var2, int var3) {
      return var1 >= this.field292 && var1 < this.field292 + this.field289?var2 >> 6 == this.field288 && var3 >> 6 == this.field290:false;
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      signature = "(III)Lif;",
      garbageValue = "-957800253"
   )
   public CoordGrid vmethod4935(int var1, int var2) {
      if(!this.vmethod4910(var1, var2)) {
         return null;
      } else {
         int var3 = this.field288 * 64 - this.field287 * 64 + var1;
         int var4 = this.field290 * 64 - this.field291 * 64 + var2;
         return new CoordGrid(this.field292, var3, var4);
      }
   }

   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "(III)Z",
      garbageValue = "1385272861"
   )
   public boolean vmethod4910(int var1, int var2) {
      return var1 >> 6 == this.field287 && var2 >> 6 == this.field291;
   }

   @ObfuscatedName("iw")
   @ObfuscatedSignature(
      signature = "(Ljg;IIIS)V",
      garbageValue = "1400"
   )
   static final void method3094(NPCType var0, int var1, int var2, int var3) {
      if(client.menuOptionCount < 400) {
         NPCType old = var0;
         if(var0.multiNpcs != null) {
            var0 = var0.method4782();
         }

         if(var0 != null) {
            if(var0.isClickable) {
               if(!var0.isLowPriorityOps || client.field819 == var1) {
                  String var4 = var0.name;
                  int var7;
                  int var8;
                  if(var0.level != 0) {
                     var7 = var0.level;
                     var8 = class71.localPlayer.combatLevel;
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

                     var4 = var4 + var6 + " " + " (" + "level-" + var0.level + ")";
                  }

                  if(var0.isLowPriorityOps && client.field794) {
                     class290.method5964("Examine", class308.method6152(16776960) + var4, 1003, var1, var2, var3);
                  }

                  if(client.itemSelectionState == 1) {
                     class290.method5964("Use", client.lastSelectedItemName + " " + "->" + " " + class308.method6152(16776960) + var4, 7, var1, var2, var3);
                  } else if(client.spellSelected) {
                     if((class240.ifTargetMask & 2) == 2) {
                        class290.method5964(client.targetVerb, client.opBase + " " + "->" + " " + class308.method6152(16776960) + var4, 8, var1, var2, var3);
                     }
                  } else {
                     int var10 = var0.isLowPriorityOps && client.field794?2000:0;
                     String[] var11 = var0.ops;
                     String[] oldVar11 = old.changedOptions;
                     if(var11 != null) {
                        for(var7 = 4; var7 >= 0; --var7) {
                           String option = oldVar11[var7] != null ? (oldVar11[var7].isEmpty() ? null : oldVar11[var7]) : var11[var7];
                           if(option != null && !option.equalsIgnoreCase("Attack")) {
                              var8 = 0;
                              if(var7 == 0) {
                                 var8 = var10 + 9;
                              }

                              if(var7 == 1) {
                                 var8 = var10 + 10;
                              }

                              if(var7 == 2) {
                                 var8 = var10 + 11;
                              }

                              if(var7 == 3) {
                                 var8 = var10 + 12;
                              }

                              if(var7 == 4) {
                                 var8 = var10 + 13;
                              }

                              class290.method5964(option, class308.method6152(16776960) + var4, var8, var1, var2, var3);
                           }
                        }
                     }

                     if(var11 != null) {
                        for(var7 = 4; var7 >= 0; --var7) {
                           if(var11[var7] != null && var11[var7].equalsIgnoreCase("Attack")) {
                              short var12 = 0;
                              if(AttackOpPriority.HIDDEN != client.npcAttackOpPriority) {
                                 if(client.npcAttackOpPriority == AttackOpPriority.UNPRIORITISED || client.npcAttackOpPriority == AttackOpPriority.COMBAT_LEVEL_BASED && var0.level > class71.localPlayer.combatLevel) {
                                    var12 = 2000;
                                 }

                                 var8 = 0;
                                 if(var7 == 0) {
                                    var8 = var12 + 9;
                                 }

                                 if(var7 == 1) {
                                    var8 = var12 + 10;
                                 }

                                 if(var7 == 2) {
                                    var8 = var12 + 11;
                                 }

                                 if(var7 == 3) {
                                    var8 = var12 + 12;
                                 }

                                 if(var7 == 4) {
                                    var8 = var12 + 13;
                                 }

                                 class290.method5964(var11[var7], class308.method6152(16776960) + var4, var8, var1, var2, var3);
                              }
                           }
                        }
                     }

                     if(!var0.isLowPriorityOps || !client.field794) {
                        class290.method5964("Examine", class308.method6152(16776960) + var4, 1003, var1, var2, var3);
                     }
                  }

               }
            }
         }
      }
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "572594852"
   )
   static void method3087() {
      PlayerList.highResolutionPlayerCount = 0;

      for(int var0 = 0; var0 < 2048; ++var0) {
         PlayerList.appearances[var0] = null;
         PlayerList.moveSpeeds[var0] = 1;
      }

   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      signature = "(ILcs;ZI)I",
      garbageValue = "-742121491"
   )
   static int method3095(int var0, class314 var1, boolean var2) {
      int var3;
      if(var0 == 3903) {
         var3 = class281.intStack[--class281.intStackSize];
         class281.intStack[++class281.intStackSize - 1] = client.grandExchangeOffers[var3].method1735();
         return 1;
      } else if(var0 == 3904) {
         var3 = class281.intStack[--class281.intStackSize];
         class281.intStack[++class281.intStackSize - 1] = client.grandExchangeOffers[var3].itemId;
         return 1;
      } else if(var0 == 3905) {
         var3 = class281.intStack[--class281.intStackSize];
         class281.intStack[++class281.intStackSize - 1] = client.grandExchangeOffers[var3].price;
         return 1;
      } else if(var0 == 3906) {
         var3 = class281.intStack[--class281.intStackSize];
         class281.intStack[++class281.intStackSize - 1] = client.grandExchangeOffers[var3].totalQuantity;
         return 1;
      } else if(var0 == 3907) {
         var3 = class281.intStack[--class281.intStackSize];
         class281.intStack[++class281.intStackSize - 1] = client.grandExchangeOffers[var3].quantitySold;
         return 1;
      } else if(var0 == 3908) {
         var3 = class281.intStack[--class281.intStackSize];
         class281.intStack[++class281.intStackSize - 1] = client.grandExchangeOffers[var3].spent;
         return 1;
      } else {
         int var12;
         if(var0 == 3910) {
            var3 = class281.intStack[--class281.intStackSize];
            var12 = client.grandExchangeOffers[var3].method1720();
            class281.intStack[++class281.intStackSize - 1] = var12 == 0?1:0;
            return 1;
         } else if(var0 == 3911) {
            var3 = class281.intStack[--class281.intStackSize];
            var12 = client.grandExchangeOffers[var3].method1720();
            class281.intStack[++class281.intStackSize - 1] = var12 == 2?1:0;
            return 1;
         } else if(var0 == 3912) {
            var3 = class281.intStack[--class281.intStackSize];
            var12 = client.grandExchangeOffers[var3].method1720();
            class281.intStack[++class281.intStackSize - 1] = var12 == 5?1:0;
            return 1;
         } else if(var0 == 3913) {
            var3 = class281.intStack[--class281.intStackSize];
            var12 = client.grandExchangeOffers[var3].method1720();
            class281.intStack[++class281.intStackSize - 1] = var12 == 1?1:0;
            return 1;
         } else {
            boolean var13;
            if(var0 == 3914) {
               var13 = class281.intStack[--class281.intStackSize] == 1;
               if(GameCanvas.tradingPost != null) {
                  GameCanvas.tradingPost.method1612(TradingPost.USERNAME_COMPARATOR, var13);
               }

               return 1;
            } else if(var0 == 3915) {
               var13 = class281.intStack[--class281.intStackSize] == 1;
               if(GameCanvas.tradingPost != null) {
                  GameCanvas.tradingPost.method1612(TradingPost.PRICE_COMPARATOR, var13);
               }

               return 1;
            } else if(var0 == 3916) {
               class281.intStackSize -= 2;
               var13 = class281.intStack[class281.intStackSize] == 1;
               boolean var4 = class281.intStack[class281.intStackSize + 1] == 1;
               if(GameCanvas.tradingPost != null) {
                  client.field917.field641 = var4;
                  GameCanvas.tradingPost.method1612(client.field917, var13);
               }

               return 1;
            } else if(var0 == 3917) {
               var13 = class281.intStack[--class281.intStackSize] == 1;
               if(GameCanvas.tradingPost != null) {
                  GameCanvas.tradingPost.method1612(TradingPost.TIME_COMPARATOR, var13);
               }

               return 1;
            } else if(var0 == 3918) {
               var13 = class281.intStack[--class281.intStackSize] == 1;
               if(GameCanvas.tradingPost != null) {
                  GameCanvas.tradingPost.method1612(TradingPost.COUNT_COMPARATOR, var13);
               }

               return 1;
            } else if(var0 == 3919) {
               class281.intStack[++class281.intStackSize - 1] = GameCanvas.tradingPost == null?0:GameCanvas.tradingPost.offers.size();
               return 1;
            } else {
               GrandExchangeEvent var11;
               if(var0 == 3920) {
                  var3 = class281.intStack[--class281.intStackSize];
                  var11 = (GrandExchangeEvent)GameCanvas.tradingPost.offers.get(var3);
                  class281.intStack[++class281.intStackSize - 1] = var11.world;
                  return 1;
               } else if(var0 == 3921) {
                  var3 = class281.intStack[--class281.intStackSize];
                  var11 = (GrandExchangeEvent)GameCanvas.tradingPost.offers.get(var3);
                  class281.scriptStringStack[++class295.scriptStringStackSize - 1] = var11.method1556();
                  return 1;
               } else if(var0 == 3922) {
                  var3 = class281.intStack[--class281.intStackSize];
                  var11 = (GrandExchangeEvent)GameCanvas.tradingPost.offers.get(var3);
                  class281.scriptStringStack[++class295.scriptStringStackSize - 1] = var11.method1557();
                  return 1;
               } else if(var0 == 3923) {
                  var3 = class281.intStack[--class281.intStackSize];
                  var11 = (GrandExchangeEvent)GameCanvas.tradingPost.offers.get(var3);
                  long var5 = class318.method6317() - Overlay.field3614 - var11.field49;
                  int var7 = (int)(var5 / 3600000L);
                  int var8 = (int)((var5 - (long)(var7 * 3600000)) / 60000L);
                  int var9 = (int)((var5 - (long)(var7 * 3600000) - (long)(var8 * 60000)) / 1000L);
                  String var10 = var7 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10;
                  class281.scriptStringStack[++class295.scriptStringStackSize - 1] = var10;
                  return 1;
               } else if(var0 == 3924) {
                  var3 = class281.intStack[--class281.intStackSize];
                  var11 = (GrandExchangeEvent)GameCanvas.tradingPost.offers.get(var3);
                  class281.intStack[++class281.intStackSize - 1] = var11.grandExchangeOffer.totalQuantity;
                  return 1;
               } else if(var0 == 3925) {
                  var3 = class281.intStack[--class281.intStackSize];
                  var11 = (GrandExchangeEvent)GameCanvas.tradingPost.offers.get(var3);
                  class281.intStack[++class281.intStackSize - 1] = var11.grandExchangeOffer.price;
                  return 1;
               } else if(var0 == 3926) {
                  var3 = class281.intStack[--class281.intStackSize];
                  var11 = (GrandExchangeEvent)GameCanvas.tradingPost.offers.get(var3);
                  class281.intStack[++class281.intStackSize - 1] = var11.grandExchangeOffer.itemId;
                  return 1;
               } else {
                  return 2;
               }
            }
         }
      }
   }

   @ObfuscatedName("ax")
   @ObfuscatedSignature(
      signature = "(ILif;ZI)V",
      garbageValue = "565034549"
   )
   static void method3096(int var0, CoordGrid var1, boolean var2) {
      WorldMapData var3 = WorldMapDataGroup.method959().method3040(var0);
      int var4 = class71.localPlayer.field631;
      int var5 = (class71.localPlayer.x * -1234429701 >> 7) + class53.baseX;
      int var6 = (class71.localPlayer.y >> 7) + class312.baseY;
      CoordGrid var7 = new CoordGrid(var4, var5, var6);
      WorldMapDataGroup.method959().method2880(var3, var7, var1, var2);
   }

   @ObfuscatedName("ks")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "-49"
   )
   static final void method3089() {
      client.lastFriendTransmit = client.cycleCntr;
   }
}
