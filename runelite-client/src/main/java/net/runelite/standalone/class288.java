package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eg")
public class class288 extends class133 {
   @ObfuscatedName("kh")
   @ObfuscatedGetter(
      intValue = 1803129185
   )
   static int field1949;
   @ObfuscatedName("a")
   final boolean field1948;

   public class288(boolean var1) {
      this.field1948 = var1;
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "(Lkl;Lkl;I)I",
      garbageValue = "54344777"
   )
   int method5938(ChatPlayer var1, ChatPlayer var2) {
      return client.world == var1.world && var2.world == client.world?(this.field1948?var1.method2752().method1533(var2.method2752()):var2.method2752().method1533(var1.method2752())):this.method1960(var1, var2);
   }

   public int compare(Object var1, Object var2) {
      return this.method5938((ChatPlayer)var1, (ChatPlayer)var2);
   }

   @ObfuscatedName("jm")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "-1118567326"
   )
   static void method5941(int var0) {
      class312.topContextMenuRow = new ContextMenuRow();
      class312.topContextMenuRow.param0 = client.menuActionParams0[var0];
      class312.topContextMenuRow.param1 = client.menuActionParams1[var0];
      class312.topContextMenuRow.type = client.menuTypes[var0];
      class312.topContextMenuRow.identifier = client.menuIdentifiers[var0];
      class312.topContextMenuRow.option = client.menuOptions[var0];
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "([BI)Lkt;",
      garbageValue = "286810361"
   )
   static Font method5947(byte[] var0) {
      if(var0 == null) {
         return null;
      } else {
         Font var1 = new Font(var0, class96.indexedSpriteOffsetXs, GameCanvas.indexedSpriteOffsetYs, class96.indexSpriteWidths, class96.indexedSpriteHeights, class96.indexedSpritePalette, class241.spritePixels);
         class43.method648();
         return var1;
      }
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(IB)Ljn;",
      garbageValue = "8"
   )
   public static VarPlayerType method5942(int var0) {
      VarPlayerType var1 = (VarPlayerType)VarPlayerType.varplayers.method635((long)var0);
      if(var1 != null) {
         return var1;
      } else {
         byte[] var2 = WorldComparator.varplayer_ref.method4115(16, var0, -1851649055);
         var1 = new VarPlayerType();
         if(var2 != null) {
            var1.method1(new Packet(var2));
         }

         VarPlayerType.varplayers.method628(var1, (long)var0);
         return var1;
      }
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      signature = "(ILcs;ZB)I",
      garbageValue = "127"
   )
   static int method5945(int var0, class314 var1, boolean var2) {
      if(var0 == 6500) {
         class281.intStack[++class281.intStackSize - 1] = class57.method910()?1:0;
         return 1;
      } else {
         World var3;
         if(var0 == 6501) {
            var3 = Location.method4651();
            if(var3 != null) {
               class281.intStack[++class281.intStackSize - 1] = var3.id;
               class281.intStack[++class281.intStackSize - 1] = var3.mask;
               class281.scriptStringStack[++class295.scriptStringStackSize - 1] = var3.activity;
               class281.intStack[++class281.intStackSize - 1] = var3.location;
               class281.intStack[++class281.intStackSize - 1] = var3.playerCount;
               class281.scriptStringStack[++class295.scriptStringStackSize - 1] = var3.address;
            } else {
               class281.intStack[++class281.intStackSize - 1] = -1;
               class281.intStack[++class281.intStackSize - 1] = 0;
               class281.scriptStringStack[++class295.scriptStringStackSize - 1] = "";
               class281.intStack[++class281.intStackSize - 1] = 0;
               class281.intStack[++class281.intStackSize - 1] = 0;
               class281.scriptStringStack[++class295.scriptStringStackSize - 1] = "";
            }

            return 1;
         } else if(var0 == 6502) {
            var3 = class302.method6066();
            if(var3 != null) {
               class281.intStack[++class281.intStackSize - 1] = var3.id;
               class281.intStack[++class281.intStackSize - 1] = var3.mask;
               class281.scriptStringStack[++class295.scriptStringStackSize - 1] = var3.activity;
               class281.intStack[++class281.intStackSize - 1] = var3.location;
               class281.intStack[++class281.intStackSize - 1] = var3.playerCount;
               class281.scriptStringStack[++class295.scriptStringStackSize - 1] = var3.address;
            } else {
               class281.intStack[++class281.intStackSize - 1] = -1;
               class281.intStack[++class281.intStackSize - 1] = 0;
               class281.scriptStringStack[++class295.scriptStringStackSize - 1] = "";
               class281.intStack[++class281.intStackSize - 1] = 0;
               class281.intStack[++class281.intStackSize - 1] = 0;
               class281.scriptStringStack[++class295.scriptStringStackSize - 1] = "";
            }

            return 1;
         } else {
            World var4;
            int var5;
            int var7;
            if(var0 == 6506) {
               var7 = class281.intStack[--class281.intStackSize];
               var4 = null;

               for(var5 = 0; var5 < World.worldCount; ++var5) {
                  if(var7 == class242.worldList[var5].id) {
                     var4 = class242.worldList[var5];
                     break;
                  }
               }

               if(var4 != null) {
                  class281.intStack[++class281.intStackSize - 1] = var4.id;
                  class281.intStack[++class281.intStackSize - 1] = var4.mask;
                  class281.scriptStringStack[++class295.scriptStringStackSize - 1] = var4.activity;
                  class281.intStack[++class281.intStackSize - 1] = var4.location;
                  class281.intStack[++class281.intStackSize - 1] = var4.playerCount;
                  class281.scriptStringStack[++class295.scriptStringStackSize - 1] = var4.address;
               } else {
                  class281.intStack[++class281.intStackSize - 1] = -1;
                  class281.intStack[++class281.intStackSize - 1] = 0;
                  class281.scriptStringStack[++class295.scriptStringStackSize - 1] = "";
                  class281.intStack[++class281.intStackSize - 1] = 0;
                  class281.intStack[++class281.intStackSize - 1] = 0;
                  class281.scriptStringStack[++class295.scriptStringStackSize - 1] = "";
               }

               return 1;
            } else if(var0 == 6507) {
               class281.intStackSize -= 4;
               var7 = class281.intStack[class281.intStackSize];
               boolean var10 = class281.intStack[class281.intStackSize + 1] == 1;
               var5 = class281.intStack[class281.intStackSize + 2];
               boolean var6 = class281.intStack[class281.intStackSize + 3] == 1;
               DecorativeObject.method915(var7, var10, var5, var6);
               return 1;
            } else if(var0 != 6511) {
               if(var0 == 6512) {
                  client.field794 = class281.intStack[--class281.intStackSize] == 1;
                  return 1;
               } else {
                  int var8;
                  ParamType var9;
                  if(var0 == 6513) {
                     class281.intStackSize -= 2;
                     var7 = class281.intStack[class281.intStackSize];
                     var8 = class281.intStack[class281.intStackSize + 1];
                     var9 = Overlay.method6404(var8);
                     if(var9.method606()) {
                        class281.scriptStringStack[++class295.scriptStringStackSize - 1] = ZoneProt.method374(var7).method4785(var8, var9.defaultStr);
                     } else {
                        class281.intStack[++class281.intStackSize - 1] = ZoneProt.method374(var7).method4784(var8, var9.defaultInt);
                     }

                     return 1;
                  } else if(var0 == 6514) {
                     class281.intStackSize -= 2;
                     var7 = class281.intStack[class281.intStackSize];
                     var8 = class281.intStack[class281.intStackSize + 1];
                     var9 = Overlay.method6404(var8);
                     if(var9.method606()) {
                        class281.scriptStringStack[++class295.scriptStringStackSize - 1] = GrandExchangeOffer.method1736(var7).method393(var8, var9.defaultStr);
                     } else {
                        class281.intStack[++class281.intStackSize - 1] = GrandExchangeOffer.method1736(var7).method392(var8, var9.defaultInt);
                     }

                     return 1;
                  } else if(var0 == 6515) {
                     class281.intStackSize -= 2;
                     var7 = class281.intStack[class281.intStackSize];
                     var8 = class281.intStack[class281.intStackSize + 1];
                     var9 = Overlay.method6404(var8);
                     if(var9.method606()) {
                        class281.scriptStringStack[++class295.scriptStringStackSize - 1] = class79.method1074(var7).method2227(var8, var9.defaultStr);
                     } else {
                        class281.intStack[++class281.intStackSize - 1] = class79.method1074(var7).method2256(var8, var9.defaultInt);
                     }

                     return 1;
                  } else if(var0 == 6516) {
                     class281.intStackSize -= 2;
                     var7 = class281.intStack[class281.intStackSize];
                     var8 = class281.intStack[class281.intStackSize + 1];
                     var9 = Overlay.method6404(var8);
                     if(var9.method606()) {
                        class281.scriptStringStack[++class295.scriptStringStackSize - 1] = WorldMapRectangle.method3818(var7).method3052(var8, var9.defaultStr);
                     } else {
                        class281.intStack[++class281.intStackSize - 1] = WorldMapRectangle.method3818(var7).method3048(var8, var9.defaultInt);
                     }

                     return 1;
                  } else if(var0 == 6518) {
                     class281.intStack[++class281.intStackSize - 1] = client.field656?1:0;
                     return 1;
                  } else if(var0 == 6519) {
                     class281.intStack[++class281.intStackSize - 1] = client.confClientType & 3;
                     return 1;
                  } else if(var0 == 6520) {
                     return 1;
                  } else if(var0 == 6521) {
                     return 1;
                  } else if(var0 == 6522) {
                     --class295.scriptStringStackSize;
                     --class281.intStackSize;
                     return 1;
                  } else if(var0 == 6523) {
                     --class295.scriptStringStackSize;
                     --class281.intStackSize;
                     return 1;
                  } else if(var0 == 6524) {
                     class281.intStack[++class281.intStackSize - 1] = -1;
                     return 1;
                  } else if(var0 == 6525) {
                     class281.intStack[++class281.intStackSize - 1] = 1;
                     return 1;
                  } else if(var0 == 6526) {
                     class281.intStack[++class281.intStackSize - 1] = 1;
                     return 1;
                  } else {
                     return 2;
                  }
               }
            } else {
               var7 = class281.intStack[--class281.intStackSize];
               if(var7 >= 0 && var7 < World.worldCount) {
                  var4 = class242.worldList[var7];
                  class281.intStack[++class281.intStackSize - 1] = var4.id;
                  class281.intStack[++class281.intStackSize - 1] = var4.mask;
                  class281.scriptStringStack[++class295.scriptStringStackSize - 1] = var4.activity;
                  class281.intStack[++class281.intStackSize - 1] = var4.location;
                  class281.intStack[++class281.intStackSize - 1] = var4.playerCount;
                  class281.scriptStringStack[++class295.scriptStringStackSize - 1] = var4.address;
               } else {
                  class281.intStack[++class281.intStackSize - 1] = -1;
                  class281.intStack[++class281.intStackSize - 1] = 0;
                  class281.scriptStringStack[++class295.scriptStringStackSize - 1] = "";
                  class281.intStack[++class281.intStackSize - 1] = 0;
                  class281.intStack[++class281.intStackSize - 1] = 0;
                  class281.scriptStringStack[++class295.scriptStringStackSize - 1] = "";
               }

               return 1;
            }
         }
      }
   }
}
