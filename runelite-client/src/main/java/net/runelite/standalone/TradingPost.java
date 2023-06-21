package net.runelite.standalone;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("p")
public class TradingPost {
   @ObfuscatedName("bz")
   @ObfuscatedSignature(
      signature = "Lib;"
   )
   static ModeGame field38;
   @ObfuscatedName("x")
   public static Comparator USERNAME_COMPARATOR;
   @ObfuscatedName("s")
   public static Comparator TIME_COMPARATOR;
   @ObfuscatedName("h")
   public static Comparator COUNT_COMPARATOR;
   @ObfuscatedName("g")
   public static Comparator PRICE_COMPARATOR;
   @ObfuscatedName("a")
   public final List offers;

   static {
      TIME_COMPARATOR = new class54();
      new WorldComparator();
      PRICE_COMPARATOR = new UnitPriceComparator();
      USERNAME_COMPARATOR = new class53();
      COUNT_COMPARATOR = new TotalQuantityComparator();
   }

   @ObfuscatedSignature(
      signature = "(Lgx;Z)V",
      garbageValue = "1"
   )
   public TradingPost(Packet var1, boolean var2) {
      int var3 = var1.readUnsignedShort();
      boolean var4 = var1.readUnsignedByte() == 1;
      byte var5;
      if(var4) {
         var5 = 1;
      } else {
         var5 = 0;
      }

      int var6 = var1.readUnsignedShort();
      this.offers = new ArrayList(var6);

      for(int var7 = 0; var7 < var6; ++var7) {
         this.offers.add(new GrandExchangeEvent(var1, var5, var3));
      }

   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "(Ljava/util/Comparator;ZB)V",
      garbageValue = "4"
   )
   public void method1612(Comparator var1, boolean var2) {
      if(var2) {
         Collections.sort(this.offers, var1);
      } else {
         Collections.sort(this.offers, Collections.reverseOrder(var1));
      }

   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "([BIIB)Ljava/lang/String;",
      garbageValue = "74"
   )
   public static String method1607(byte[] var0, int var1, int var2) {
      char[] var3 = new char[var2];
      int var4 = 0;

      for(int var5 = 0; var5 < var2; ++var5) {
         int var6 = var0[var5 + var1] & 255;
         if(var6 != 0) {
            if(var6 >= 128 && var6 < 160) {
               char var7 = class13.cp1252AsciiExtension[var6 - 128];
               if(var7 == 0) {
                  var7 = '?';
               }

               var6 = var7;
            }

            var3[var4++] = (char)var6;
         }
      }

      return new String(var3, 0, var4);
   }

   @ObfuscatedName("gk")
   @ObfuscatedSignature(
      signature = "(ZB)V",
      garbageValue = "5"
   )
   static final void method1608(boolean var0) {
      for(int var1 = 0; var1 < client.highResolutionNpcCount; ++var1) {
         NPCEntity var2 = client.npcs[client.highResolutionNpcIndexes[var1]];
         if(var2 != null && var2.vmethod6005() && var2.type.isVisible == var0 && var2.type.method4783()) {
            int var3 = var2.x * -1234429701 >> 7;
            int var4 = var2.y >> 7;
            if(var3 >= 0 && var3 < 104 && var4 >= 0 && var4 < 104) {
               if(var2.size == 1 && (var2.x * -1234429701 & 127) == 64 && (var2.y & 127) == 64) {
                  if(client.field746[var3][var4] == client.field907) {
                     continue;
                  }

                  client.field746[var3][var4] = client.field907;
               }

               long var5 = ChatHistory.method6263(0, 0, 1, !var2.type.isClickable, client.highResolutionNpcIndexes[var1]);
               var2.field960 = client.gameCycle;
               class312.sceneManager.method3754(ServerProt.level, var2.x * -1234429701, var2.y, TcpConnectionMessage.method5618(var2.x * -1234429701 + (var2.size * 64 - 64), var2.size * 64 - 64 + var2.y, ServerProt.level), var2.size * 64 - 64 + 60, var2, var2.angle, var5, var2.field941);
            }
         }
      }

   }

   @ObfuscatedName("jz")
   @ObfuscatedSignature(
      signature = "(Lia;III)V",
      garbageValue = "-1232547140"
   )
   static final void method1616(ComponentType var0, int var1, int var2) {
      if(var0.buttonType == 1) {
         class290.method5964(var0.tooltip, "", 24, 0, 0, var0.id);
      }

      String var3;
      if(var0.buttonType == 2 && !client.spellSelected) {
         var3 = class125.method1854(var0);
         if(var3 != null) {
            class290.method5964(var3, class308.method6152(65280) + var0.spellName, 25, 0, -1, var0.id);
         }
      }

      if(var0.buttonType == 3) {
         class290.method5964("Close", "", 26, 0, 0, var0.id);
      }

      if(var0.buttonType == 4) {
         class290.method5964(var0.tooltip, "", 28, 0, 0, var0.id);
      }

      if(var0.buttonType == 5) {
         class290.method5964(var0.tooltip, "", 29, 0, 0, var0.id);
      }

      if(var0.buttonType == 6 && client.field793 == null) {
         class290.method5964(var0.tooltip, "", 30, 0, -1, var0.id);
      }

      int var4;
      int var5;
      int var13;
      if(var0.type == 2) {
         var13 = 0;

         for(var4 = 0; var4 < var0.height; ++var4) {
            for(var5 = 0; var5 < var0.width; ++var5) {
               int var6 = (var0.paddingX + 32) * var5;
               int var7 = (var0.paddingY + 32) * var4;
               if(var13 < 20) {
                  var6 += var0.xSprites[var13];
                  var7 += var0.field2720[var13];
               }

               if(var1 >= var6 && var2 >= var7 && var1 < var6 + 32 && var2 < var7 + 32) {
                  client.field721 = var13;
                  SoundTask.field1417 = var0;
                  if(var0.objIds[var13] > 0) {
                     ObjType var8 = class79.method1074(var0.objIds[var13] - 1);
                     if(client.itemSelectionState == 1 && class252.method4727(WorldComparator.method86(var0))) {
                        if(var0.id != class132.field3198 || var13 != class29.selectedItemIndex) {
                           class290.method5964("Use", client.lastSelectedItemName + " " + "->" + " " + class308.method6152(16748608) + var8.name, 31, var8.id, var13, var0.id);
                        }
                     } else if(client.spellSelected && class252.method4727(WorldComparator.method86(var0))) {
                        if((class240.ifTargetMask & 16) == 16) {
                           class290.method5964(client.targetVerb, client.opBase + " " + "->" + " " + class308.method6152(16748608) + var8.name, 32, var8.id, var13, var0.id);
                        }
                     } else {
                        String[] var9 = var8.iops;
                        int var10 = -1;
                        if(client.field660) {
                           boolean var11 = client.field796 || KeyFocusListener.keyPressed[81];
                           if(var11) {
                              var10 = var8.method2228(-702567274);
                           }
                        }

                        int var17;
                        if(class252.method4727(WorldComparator.method86(var0))) {
                           for(var17 = 4; var17 >= 3; --var17) {
                              if(var10 != var17) {
                                 class124.method1842(var0, var8, var13, var17, false);
                              }
                           }
                        }

                        if(ServerConnection.method29(WorldComparator.method86(var0))) {
                           class290.method5964("Use", class308.method6152(16748608) + var8.name, 38, var8.id, var13, var0.id);
                        }

                        if(class252.method4727(WorldComparator.method86(var0))) {
                           for(var17 = 2; var17 >= 0; --var17) {
                              if(var17 != var10) {
                                 class124.method1842(var0, var8, var13, var17, false);
                              }
                           }

                           if(var10 >= 0) {
                              class124.method1842(var0, var8, var13, var10, true);
                           }
                        }

                        var9 = var0.if1Ops;
                        if(var9 != null) {
                           for(var17 = 4; var17 >= 0; --var17) {
                              if(var9[var17] != null) {
                                 byte var12 = 0;
                                 if(var17 == 0) {
                                    var12 = 39;
                                 }

                                 if(var17 == 1) {
                                    var12 = 40;
                                 }

                                 if(var17 == 2) {
                                    var12 = 41;
                                 }

                                 if(var17 == 3) {
                                    var12 = 42;
                                 }

                                 if(var17 == 4) {
                                    var12 = 43;
                                 }

                                 class290.method5964(var9[var17], class308.method6152(16748608) + var8.name, var12, var8.id, var13, var0.id);
                              }
                           }
                        }

                        class290.method5964("Examine", class308.method6152(16748608) + var8.name, 1005, var8.id, var13, var0.id);
                     }
                  }
               }

               ++var13;
            }
         }
      }

      if(var0.isIf3) {
         if(client.spellSelected) {
            var4 = WorldComparator.method86(var0);
            boolean var18 = (var4 >> 21 & 1) != 0;
            if(var18 && (class240.ifTargetMask & 32) == 32) {
               class290.method5964(client.targetVerb, client.opBase + " " + "->" + " " + var0.opBase, 58, 0, var0.index, var0.id);
            }
         } else {
            for(var13 = 9; var13 >= 5; --var13) {
               String var14 = class181.method3045(var0, var13);
               if(var14 != null) {
                  class290.method5964(var14, var0.opBase, 1007, var13 + 1, var0.index, var0.id);
               }
            }

            var3 = class125.method1854(var0);
            if(var3 != null) {
               class290.method5964(var3, var0.opBase, 25, 0, var0.index, var0.id);
            }

            for(var4 = 4; var4 >= 0; --var4) {
               String var15 = class181.method3045(var0, var4);
               if(var15 != null) {
                  ItemContainer.method3950(var15, var0.opBase, 57, var4 + 1, var0.index, var0.id, var0.field2831);
               }
            }

            var5 = WorldComparator.method86(var0);
            boolean var16 = (var5 & 1) != 0;
            if(var16) {
               class290.method5964("Continue", "", 30, 0, var0.index, var0.id);
            }
         }
      }

   }

   @ObfuscatedName("km")
   @ObfuscatedSignature(
      signature = "(IB)V",
      garbageValue = "1"
   )
   static final void method1614(int var0) {
      FontName.method507();

      for(class61 var1 = (class61)class61.field1061.method3930(); var1 != null; var1 = (class61)class61.field1061.method3924()) {
         if(var1.field1064 != null) {
            var1.method917();
         }
      }

      int var4 = class288.method5942(var0).clientCode;
      if(var4 != 0) {
         int var2 = class313.clientVarps[var0];
         if(var4 == 1) {
            if(var2 == 1) {
               Graphics3D.method2121(0.9D);
               ((TextureProvider)Graphics3D.textureLoader).method1149(0.9D);
            }

            if(var2 == 2) {
               Graphics3D.method2121(0.8D);
               ((TextureProvider)Graphics3D.textureLoader).method1149(0.8D);
            }

            if(var2 == 3) {
               Graphics3D.method2121(0.7D);
               ((TextureProvider)Graphics3D.textureLoader).method1149(0.7D);
            }

            if(var2 == 4) {
               Graphics3D.method2121(0.6D);
               ((TextureProvider)Graphics3D.textureLoader).method1149(0.6D);
            }

            ObjType.itemSpriteCache.method629();
         }

         if(var4 == 3) {
            short var3 = 0;
            if(var2 == 0) {
               var3 = 255;
            }

            if(var2 == 1) {
               var3 = 192;
            }

            if(var2 == 2) {
               var3 = 128;
            }

            if(var2 == 3) {
               var3 = 64;
            }

            if(var2 == 4) {
               var3 = 0;
            }

            if(var3 != client.field882) {
               if(client.field882 == 0 && client.field680 != -1) {
                  WorldMapDataGroup.method957(class75.music, client.field680, 0, var3, false);
                  client.field884 = false;
               } else if(var3 == 0) {
                  class75.method1055();
                  client.field884 = false;
               } else {
                  class167.method2641(var3);
               }

               client.field882 = var3;
            }
         }

         if(var4 == 4) {
            if(var2 == 0) {
               client.field885 = 127;
            }

            if(var2 == 1) {
               client.field885 = 96;
            }

            if(var2 == 2) {
               client.field885 = 64;
            }

            if(var2 == 3) {
               client.field885 = 32;
            }

            if(var2 == 4) {
               client.field885 = 0;
            }
         }

         if(var4 == 5) {
            client.field784 = var2;
         }

         if(var4 == 6) {
            client.field813 = var2;
         }

         if(var4 == 9) {
            client.field814 = var2;
         }

         if(var4 == 10) {
            if(var2 == 0) {
               client.field886 = 127;
            }

            if(var2 == 1) {
               client.field886 = 96;
            }

            if(var2 == 2) {
               client.field886 = 64;
            }

            if(var2 == 3) {
               client.field886 = 32;
            }

            if(var2 == 4) {
               client.field886 = 0;
            }
         }

         if(var4 == 17) {
            client.field819 = var2 & 65535;
         }

         AttackOpPriority[] var5;
         if(var4 == 18) {
            var5 = new AttackOpPriority[]{AttackOpPriority.COMBAT_LEVEL_BASED, AttackOpPriority.PRIORITISED, AttackOpPriority.UNPRIORITISED, AttackOpPriority.HIDDEN};
            client.playerAttackOpPriority = (AttackOpPriority)PlayerList.method4757(var5, var2);
            if(client.playerAttackOpPriority == null) {
               client.playerAttackOpPriority = AttackOpPriority.COMBAT_LEVEL_BASED;
            }
         }

         if(var4 == 19) {
            if(var2 == -1) {
               client.field776 = -1;
            } else {
               client.field776 = var2 & 2047;
            }
         }

         if(var4 == 22) {
            var5 = new AttackOpPriority[]{AttackOpPriority.COMBAT_LEVEL_BASED, AttackOpPriority.PRIORITISED, AttackOpPriority.UNPRIORITISED, AttackOpPriority.HIDDEN};
            client.npcAttackOpPriority = (AttackOpPriority)PlayerList.method4757(var5, var2);
            if(client.npcAttackOpPriority == null) {
               client.npcAttackOpPriority = AttackOpPriority.COMBAT_LEVEL_BASED;
            }
         }

      }
   }

   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "(II)I",
      garbageValue = "216912002"
   )
   public static int method1611(int var0) {
      long var2 = class47.field1740[var0];
      int var1 = (int)(var2 >>> 7 & 127L);
      return var1;
   }
}
