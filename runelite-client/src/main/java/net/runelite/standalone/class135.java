package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("o")
public class class135 extends class71 {
   @ObfuscatedName("pd")
   @ObfuscatedSignature(
      signature = "Lln;"
   )
   static class16 field106;
   @ObfuscatedName("es")
   static String host;

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "(Lgx;I)V",
      garbageValue = "-1919621281"
   )
   void method1975(Packet var1) {
      int var2 = var1.readUnsignedByte();
      if(var2 != class181.field273.field274) {
         throw new IllegalStateException("");
      } else {
         super.field172 = var1.readUnsignedByte();
         super.field168 = var1.readUnsignedByte();
         super.field173 = var1.readUnsignedShort();
         super.field169 = var1.readUnsignedShort();
         super.field170 = var1.readUnsignedShort();
         super.field171 = var1.readUnsignedShort();
         super.field174 = var1.method5287();
         super.field177 = var1.method5287();
      }
   }

   public boolean equals(Object var1) {
      if(!(var1 instanceof class135)) {
         return false;
      } else {
         class135 var2 = (class135)var1;
         return super.field170 == var2.field170 && var2.field171 == super.field171;
      }
   }

   public int hashCode() {
      return super.field170 | super.field171 << 8;
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(Lgx;I)V",
      garbageValue = "-1814574938"
   )
   void vmethod4505(Packet var1) {
      super.field168 = Math.min(super.field168, 4);
      super.field188 = new short[1][64][64];
      super.field185 = new short[super.field168][64][64];
      super.field178 = new byte[super.field168][64][64];
      super.field179 = new byte[super.field168][64][64];
      super.decorations = new WorldMapDecoration[super.field168][64][64][];
      int var2 = var1.readUnsignedByte();
      if(var2 != class327.field268.field270) {
         throw new IllegalStateException("");
      } else {
         int var3 = var1.readUnsignedByte();
         int var4 = var1.readUnsignedByte();
         if(var3 == super.field170 && var4 == super.field171) {
            for(int var5 = 0; var5 < 64; ++var5) {
               for(int var6 = 0; var6 < 64; ++var6) {
                  this.method1003(var5, var6, var1);
               }
            }

         } else {
            throw new IllegalStateException("");
         }
      }
   }

   @ObfuscatedName("hh")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "1750701572"
   )
   static final void method1990() {
      HeadbarType.method2072(false);
      client.field701 = 0;
      boolean var0 = true;

      int var1;
      for(var1 = 0; var1 < class336.field3640.length; ++var1) {
         if(class129.landMapFileIds[var1] != -1 && class336.field3640[var1] == null) {
            class336.field3640[var1] = class142.maps.method4115(class129.landMapFileIds[var1], 0, -1686636514);
            if(class336.field3640[var1] == null) {
               var0 = false;
               ++client.field701;
            }
         }

         if(WorldComparator.landRegionFileIds[var1] != -1 && GameObject.field1932[var1] == null) {
            GameObject.field1932[var1] = class142.maps.method4178(WorldComparator.landRegionFileIds[var1], 0, Varcs.xteaKeys[var1]);
            if(GameObject.field1932[var1] == null) {
               var0 = false;
               ++client.field701;
            }
         }
      }

      if(!var0) {
         client.field705 = 1;
      } else {
         client.field703 = 0;
         var0 = true;

         int var3;
         int var4;
         for(var1 = 0; var1 < class336.field3640.length; ++var1) {
            byte[] var2 = GameObject.field1932[var1];
            if(var2 != null) {
               var3 = (class82.mapRegions[var1] >> 8) * 64 - class53.baseX;
               var4 = (class82.mapRegions[var1] & 255) * 64 - class312.baseY;
               if(client.isDynamicRegion) {
                  var3 = 10;
                  var4 = 10;
               }

               var0 &= BufferProvider.method1881(var2, var3, var4);
            }
         }

         if(!var0) {
            client.field705 = 2;
         } else {
            if(client.field705 != 0) {
               Varcs.method351("Loading - please wait." + "<br>" + " (" + 100 + "%" + ")", true);
            }

            FontName.method513();
            class312.sceneManager.method3622();

            for(var1 = 0; var1 < 4; ++var1) {
               client.collisionMaps[var1].method3599();
            }

            int var13;
            for(var1 = 0; var1 < 4; ++var1) {
               for(var13 = 0; var13 < 104; ++var13) {
                  for(var3 = 0; var3 < 104; ++var3) {
                     class91.tileSettings[var1][var13][var3] = 0;
                  }
               }
            }

            FontName.method513();
            class124.method1839();
            var1 = class336.field3640.length;

            for(class61 var16 = (class61)class61.field1061.method3930(); var16 != null; var16 = (class61)class61.field1061.method3924()) {
               if(var16.field1058 != null) {
                  TotalQuantityComparator.field60.method3527(var16.field1058);
                  var16.field1058 = null;
               }

               if(var16.field1050 != null) {
                  TotalQuantityComparator.field60.method3527(var16.field1050);
                  var16.field1050 = null;
               }
            }

            class61.field1061.method3936();
            HeadbarType.method2072(true);
            int var15;
            if(!client.isDynamicRegion) {
               byte[] var5;
               for(var13 = 0; var13 < var1; ++var13) {
                  var3 = (class82.mapRegions[var13] >> 8) * 64 - class53.baseX;
                  var4 = (class82.mapRegions[var13] & 255) * 64 - class312.baseY;
                  var5 = class336.field3640[var13];
                  if(var5 != null) {
                     FontName.method513();
                     Signlink.method5842(var5, var3, var4, KeyFocusListener.field412 * 8 - 48, class308.field534 * 8 - 48, client.collisionMaps);
                  }
               }

               for(var13 = 0; var13 < var1; ++var13) {
                  var3 = (class82.mapRegions[var13] >> 8) * 64 - class53.baseX;
                  var4 = (class82.mapRegions[var13] & 255) * 64 - class312.baseY;
                  var5 = class336.field3640[var13];
                  if(var5 == null && class308.field534 < 800) {
                     FontName.method513();
                     SpotAnimation.method1584(var3, var4, 64, 64);
                  }
               }

               HeadbarType.method2072(true);

               for(var13 = 0; var13 < var1; ++var13) {
                  byte[] var14 = GameObject.field1932[var13];
                  if(var14 != null) {
                     var4 = (class82.mapRegions[var13] >> 8) * 64 - class53.baseX;
                     var15 = (class82.mapRegions[var13] & 255) * 64 - class312.baseY;
                     FontName.method513();
                     AbstractSoundSystem.method1802(var14, var4, var15, class312.sceneManager, client.collisionMaps);
                  }
               }
            }

            int var6;
            int var7;
            int var8;
            if(client.isDynamicRegion) {
               int var9;
               int var10;
               int var11;
               for(var13 = 0; var13 < 4; ++var13) {
                  FontName.method513();

                  for(var3 = 0; var3 < 13; ++var3) {
                     for(var4 = 0; var4 < 13; ++var4) {
                        boolean var18 = false;
                        var6 = client.instanceTemplateChunks[var13][var3][var4];
                        if(var6 != -1) {
                           var7 = var6 >> 24 & 3;
                           var8 = var6 >> 1 & 3;
                           var9 = var6 >> 14 & 1023;
                           var10 = var6 >> 3 & 2047;
                           var11 = (var9 / 8 << 8) + var10 / 8;

                           for(int var12 = 0; var12 < class82.mapRegions.length; ++var12) {
                              if(class82.mapRegions[var12] == var11 && class336.field3640[var12] != null) {
                                 GrandExchangeEvent.method1564(class336.field3640[var12], var13, var3 * 8, var4 * 8, var7, (var9 & 7) * 8, (var10 & 7) * 8, var8, client.collisionMaps);
                                 var18 = true;
                                 break;
                              }
                           }
                        }

                        if(!var18) {
                           var7 = var13;
                           var8 = var3 * 8;
                           var9 = var4 * 8;

                           for(var10 = 0; var10 < 8; ++var10) {
                              for(var11 = 0; var11 < 8; ++var11) {
                                 class91.tileHeights[var7][var8 + var10][var11 + var9] = 0;
                              }
                           }

                           if(var8 > 0) {
                              for(var10 = 1; var10 < 8; ++var10) {
                                 class91.tileHeights[var7][var8][var9 + var10] = class91.tileHeights[var7][var8 - 1][var9 + var10];
                              }
                           }

                           if(var9 > 0) {
                              for(var10 = 1; var10 < 8; ++var10) {
                                 class91.tileHeights[var7][var8 + var10][var9] = class91.tileHeights[var7][var10 + var8][var9 - 1];
                              }
                           }

                           if(var8 > 0 && class91.tileHeights[var7][var8 - 1][var9] != 0) {
                              class91.tileHeights[var7][var8][var9] = class91.tileHeights[var7][var8 - 1][var9];
                           } else if(var9 > 0 && class91.tileHeights[var7][var8][var9 - 1] != 0) {
                              class91.tileHeights[var7][var8][var9] = class91.tileHeights[var7][var8][var9 - 1];
                           } else if(var8 > 0 && var9 > 0 && class91.tileHeights[var7][var8 - 1][var9 - 1] != 0) {
                              class91.tileHeights[var7][var8][var9] = class91.tileHeights[var7][var8 - 1][var9 - 1];
                           }
                        }
                     }
                  }
               }

               for(var13 = 0; var13 < 13; ++var13) {
                  for(var3 = 0; var3 < 13; ++var3) {
                     var4 = client.instanceTemplateChunks[0][var13][var3];
                     if(var4 == -1) {
                        SpotAnimation.method1584(var13 * 8, var3 * 8, 8, 8);
                     }
                  }
               }

               HeadbarType.method2072(true);

               for(var13 = 0; var13 < 4; ++var13) {
                  FontName.method513();

                  for(var3 = 0; var3 < 13; ++var3) {
                     for(var4 = 0; var4 < 13; ++var4) {
                        var15 = client.instanceTemplateChunks[var13][var3][var4];
                        if(var15 != -1) {
                           var6 = var15 >> 24 & 3;
                           var7 = var15 >> 1 & 3;
                           var8 = var15 >> 14 & 1023;
                           var9 = var15 >> 3 & 2047;
                           var10 = (var8 / 8 << 8) + var9 / 8;

                           for(var11 = 0; var11 < class82.mapRegions.length; ++var11) {
                              if(class82.mapRegions[var11] == var10 && GameObject.field1932[var11] != null) {
                                 SpotAnimation.method1582(GameObject.field1932[var11], var13, var3 * 8, var4 * 8, var6, (var8 & 7) * 8, (var9 & 7) * 8, var7, class312.sceneManager, client.collisionMaps);
                                 break;
                              }
                           }
                        }
                     }
                  }
               }
            }

            HeadbarType.method2072(true);
            FontName.method513();
            GroundObject.method4109(class312.sceneManager, client.collisionMaps);
            HeadbarType.method2072(true);
            var13 = class91.field506;
            if(var13 > ServerProt.level) {
               var13 = ServerProt.level;
            }

            if(var13 < ServerProt.level - 1) {
               var13 = ServerProt.level - 1;
            }

            if(client.lowMemory) {
               class312.sceneManager.method3623(class91.field506);
            } else {
               class312.sceneManager.method3623(0);
            }

            for(var3 = 0; var3 < 104; ++var3) {
               for(var4 = 0; var4 < 104; ++var4) {
                  class232.method4511(var3, var4);
               }
            }

            FontName.method513();
            class29.method504();
            LocType.field3455.method629();
            TcpConnectionMessage var17;
            if(ItemContainer.clientInstance.method4389()) {
               var17 = class232.method4535(ClientProt.field2235, client.serverConnection.isaac);
               var17.packetBuffer.writeInt(1057001181);
               client.serverConnection.method18(var17);
            }

            if(!client.isDynamicRegion) {
               var3 = (KeyFocusListener.field412 - 6) / 8;
               var4 = (KeyFocusListener.field412 + 6) / 8;
               var15 = (class308.field534 - 6) / 8;
               var6 = (class308.field534 + 6) / 8;

               for(var7 = var3 - 1; var7 <= var4 + 1; ++var7) {
                  for(var8 = var15 - 1; var8 <= var6 + 1; ++var8) {
                     if(var7 < var3 || var7 > var4 || var8 < var15 || var8 > var6) {
                        class142.maps.method4138("m" + var7 + "_" + var8);
                        class142.maps.method4138("l" + var7 + "_" + var8);
                     }
                  }
               }
            }

            class124.method1843(30);
            FontName.method513();
            class91.tileUnderlayIds = null;
            class91.tileOverlayIds = null;
            class91.tileOverlayPath = null;
            class91.overlayRotations = null;
            InvType.field3314 = null;
            class91.field511 = null;
            class83.field1963 = null;
            class177.floorHues = null;
            class91.floorSaturations = null;
            ChatCrownType.field3209 = null;
            ChatLineBuffer.floorMultiplier = null;
            class91.field513 = null;
            var17 = class232.method4535(ClientProt.field2295, client.serverConnection.isaac);
            client.serverConnection.method18(var17);
            ClientOptions.method1077();
         }
      }
   }

   @ObfuscatedName("gx")
   @ObfuscatedSignature(
      signature = "(Lbw;III)V",
      garbageValue = "1808291048"
   )
   static void method1989(PlayerEntity var0, int var1, int var2) {
      if(var0.animation == var1 && var1 != -1) {
         int var3 = AuthProt.method6374(var1).replyMode;
         if(var3 == 1) {
            var0.actionFrame = 0;
            var0.actionFrameCycle = 0;
            var0.actionAnimationDisable = var2;
            var0.field975 = 0;
         }

         if(var3 == 2) {
            var0.field975 = 0;
         }
      } else if(var1 == -1 || var0.animation == -1 || AuthProt.method6374(var1).forcedPriority >= AuthProt.method6374(var0.animation).forcedPriority) {
         var0.animation = var1;
         var0.animationChanged(-1);
         var0.actionFrame = 0;
         var0.actionFrameCycle = 0;
         var0.actionAnimationDisable = var2;
         var0.field975 = 0;
         var0.field950 = var0.queueSize;
      }

   }
}
