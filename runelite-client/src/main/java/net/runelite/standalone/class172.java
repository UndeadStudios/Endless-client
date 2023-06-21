package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("c")
public class class172 extends MapIcon {
   @ObfuscatedName("ej")
   @ObfuscatedGetter(
      intValue = 452175157
   )
   static int field202;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = 114444835
   )
   int field199;
   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "Lay;"
   )
   MapLabel field197;
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      intValue = 540736045
   )
   final int field195;
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "Laa;"
   )
   final WorldMapRegion field194;
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      intValue = -256381101
   )
   int field198;
   @ObfuscatedName("g")
   @ObfuscatedGetter(
      intValue = 1355038263
   )
   int field201;

   @ObfuscatedSignature(
      signature = "(Lif;Lif;ILaa;)V"
   )
   class172(CoordGrid var1, CoordGrid var2, int var3, WorldMapRegion var4) {
      super(var1, var2);
      this.field195 = var3;
      this.field194 = var4;
      this.method2696();
   }

   @ObfuscatedName("r")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "249035244"
   )
   void method2696() {
      this.field201 = GrandExchangeOffer.method1736(this.field195).method395().mapelement;
      this.field197 = this.field194.method5459(MapLabel.method2858(this.field201));
      MapElementType var1 = MapLabel.method2858(this.vmethod4060());
      SpritePixels var2 = var1.method1483(false);
      if(var2 != null) {
         this.field198 = var2.width;
         this.field199 = var2.height;
      } else {
         this.field198 = 0;
         this.field199 = 0;
      }

   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(B)I",
      garbageValue = "105"
   )
   int vmethod4058() {
      return this.field199;
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "(B)I",
      garbageValue = "51"
   )
   public int vmethod4060() {
      return this.field201;
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(I)Lay;",
      garbageValue = "-937210224"
   )
   MapLabel vmethod4061() {
      return this.field197;
   }

   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "-1729576697"
   )
   int vmethod4074() {
      return this.field198;
   }

   @ObfuscatedName("ib")
   @ObfuscatedSignature(
      signature = "(IIIII)V",
      garbageValue = "946517733"
   )
   static final void method2695(int var0, int var1, int var2, int var3) {
      if(client.itemSelectionState == 0 && !client.spellSelected) {
         class290.method5964("Walk here", "", 23, 0, var0 - var2, var1 - var3);
      }

      long var4 = -1L;
      long var6 = -1L;
      int var8 = 0;

      while(true) {
         int var10 = class47.Viewport_entityCountAtMouse;
         if(var8 >= var10) {
            if(-1L != var4) {
               var8 = (int)(var4 >>> 0 & 127L);
               var10 = (int)(var4 >>> 7 & 127L);
               PlayerEntity var12 = client.players[client.field776];
               class95.method1263(var12, client.field776, var8, var10);
            }

            return;
         }

         long var24 = SubInterface.method2714(var8);
         if(var24 != var6) {
            label325: {
               var6 = var24;
               long var15 = class47.field1740[var8];
               int var14 = (int)(var15 >>> 0 & 127L);
               var14 = var14;
               int var26 = TradingPost.method1611(var8);
               int var16 = CacheFile.method5580(var8);
               int var17 = class71.method1033(var8);
               if(var16 == 2 && class312.sceneManager.method3651(ServerProt.level, var14, var26, var24) >= 0) {
                  LocType var18 = GrandExchangeOffer.method1736(var17);
                  if(var18.multiLocs != null) {
                     var18 = var18.method395();
                  }

                  if(var18 == null) {
                     break label325;
                  }

                  if(client.itemSelectionState == 1) {
                     class290.method5964("Use", client.lastSelectedItemName + " " + "->" + " " + class308.method6152(65535) + var18.name, 1, var17, var14, var26);
                  } else if(client.spellSelected) {
                     if((class240.ifTargetMask & 4) == 4) {
                        class290.method5964(client.targetVerb, client.opBase + " " + "->" + " " + class308.method6152(65535) + var18.name, 2, var17, var14, var26);
                     }
                  } else {
                     String[] var27 = var18.actions;
                     if(var27 != null) {
                        for(int var28 = 4; var28 >= 0; --var28) {
                           if(var27[var28] != null) {
                              short var21 = 0;
                              if(var28 == 0) {
                                 var21 = 3;
                              }

                              if(var28 == 1) {
                                 var21 = 4;
                              }

                              if(var28 == 2) {
                                 var21 = 5;
                              }

                              if(var28 == 3) {
                                 var21 = 6;
                              }

                              if(var28 == 4) {
                                 var21 = 1001;
                              }

                              class290.method5964(var27[var28], class308.method6152(65535) + var18.name, var21, var17, var14, var26);
                           }
                        }
                     }

                     class290.method5964("Examine", class308.method6152(65535) + var18.name, 1002, var18.field3476, var14, var26);
                  }
               }

               int var19;
               NPCEntity var20;
               PlayerEntity var22;
               int[] var34;
               int var36;
               if(var16 == 1) {
                  NPCEntity var31 = client.npcs[var17];
                  if(var31 == null) {
                     break label325;
                  }

                  if(var31.type.size == 1 && (var31.x * -1234429701 & 127) == 64 && (var31.y & 127) == 64) {
                     for(var19 = 0; var19 < client.highResolutionNpcCount; ++var19) {
                        var20 = client.npcs[client.highResolutionNpcIndexes[var19]];
                        if(var20 != null && var20 != var31 && var20.type.size == 1 && var31.x * -1234429701 == var20.x * -1234429701 && var20.y == var31.y) {
                           WorldMapType2.method3094(var20.type, client.highResolutionNpcIndexes[var19], var14, var26);
                        }
                     }

                     var19 = PlayerList.highResolutionPlayerCount;
                     var34 = PlayerList.highResolutionPlayerIndexes;

                     for(var36 = 0; var36 < var19; ++var36) {
                        var22 = client.players[var34[var36]];
                        if(var22 != null && var31.x * -1234429701 == var22.x * -1234429701 && var31.y == var22.y) {
                           class95.method1263(var22, var34[var36], var14, var26);
                        }
                     }
                  }

                  WorldMapType2.method3094(var31.type, var17, var14, var26);
               }

               if(var16 == 0) {
                  PlayerEntity var32 = client.players[var17];
                  if(var32 == null) {
                     break label325;
                  }

                  if((var32.x * -1234429701 & 127) == 64 && (var32.y & 127) == 64) {
                     for(var19 = 0; var19 < client.highResolutionNpcCount; ++var19) {
                        var20 = client.npcs[client.highResolutionNpcIndexes[var19]];
                        if(var20 != null && var20.type.size == 1 && var32.x * -1234429701 == var20.x * -1234429701 && var32.y == var20.y) {
                           WorldMapType2.method3094(var20.type, client.highResolutionNpcIndexes[var19], var14, var26);
                        }
                     }

                     var19 = PlayerList.highResolutionPlayerCount;
                     var34 = PlayerList.highResolutionPlayerIndexes;

                     for(var36 = 0; var36 < var19; ++var36) {
                        var22 = client.players[var34[var36]];
                        if(var22 != null && var22 != var32 && var22.x * -1234429701 == var32.x * -1234429701 && var32.y == var22.y) {
                           class95.method1263(var22, var34[var36], var14, var26);
                        }
                     }
                  }

                  if(var17 != client.field776) {
                     class95.method1263(var32, var17, var14, var26);
                  } else {
                     var4 = var24;
                  }
               }

               if(var16 == 3) {
                  Deque var33 = client.groundItemDeque[ServerProt.level][var14][var26];
                  if(var33 != null) {
                     for(Item var37 = (Item)var33.method3912(); var37 != null; var37 = (Item)var33.method3929()) {
                        ObjType var35 = class79.method1074(var37.id);
                        if(client.itemSelectionState == 1) {
                           class290.method5964("Use", client.lastSelectedItemName + " " + "->" + " " + class308.method6152(16748608) + var35.name, 16, var37.id, var14, var26);
                        } else if(client.spellSelected) {
                           if((class240.ifTargetMask & 1) == 1) {
                              class290.method5964(client.targetVerb, client.opBase + " " + "->" + " " + class308.method6152(16748608) + var35.name, 17, var37.id, var14, var26);
                           }
                        } else {
                           String[] var29 = var35.ops;

                           for(int var30 = 4; var30 >= 0; --var30) {
                              if(var29 != null && var29[var30] != null) {
                                 byte var23 = 0;
                                 if(var30 == 0) {
                                    var23 = 18;
                                 }

                                 if(var30 == 1) {
                                    var23 = 19;
                                 }

                                 if(var30 == 2) {
                                    var23 = 20;
                                 }

                                 if(var30 == 3) {
                                    var23 = 21;
                                 }

                                 if(var30 == 4) {
                                    var23 = 22;
                                 }

                                 class290.method5964(var29[var30], class308.method6152(16748608) + var35.name, var23, var37.id, var14, var26);
                              } else if(var30 == 2) {
                                 class290.method5964("Take", class308.method6152(16748608) + var35.name, 20, var37.id, var14, var26);
                              }
                           }

                           class290.method5964("Examine", class308.method6152(16748608) + var35.name, 1004, var37.id, var14, var26);
                        }
                     }
                  }
               }
            }
         }

         ++var8;
      }
   }
}
