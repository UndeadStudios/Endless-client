package net.runelite.standalone;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("aj")
public class class125 extends WorldMapData {
   @ObfuscatedName("eg")
   @ObfuscatedGetter(
      intValue = 1007381451
   )
   static int field330;
   @ObfuscatedName("l")
   List field332;
   @ObfuscatedName("r")
   HashSet field331;
   @ObfuscatedName("t")
   HashSet field335;

   @ObfuscatedName("ch")
   @ObfuscatedSignature(
      signature = "(Lgx;Lgx;IZB)V",
      garbageValue = "8"
   )
   void method1846(Packet var1, Packet var2, int var3, boolean var4) {
      this.method1698(var1, var3);
      int var5 = var2.readUnsignedShort();
      this.field331 = new HashSet(var5);

      int var6;
      for(var6 = 0; var6 < var5; ++var6) {
         class135 var7 = new class135();

         try {
            var7.method1975(var2);
         } catch (IllegalStateException var12) {
            continue;
         }

         this.field331.add(var7);
      }

      var6 = var2.readUnsignedShort();
      this.field335 = new HashSet(var6);

      for(int var10 = 0; var10 < var6; ++var10) {
         class232 var8 = new class232();

         try {
            var8.method4504(var2);
         } catch (IllegalStateException var11) {
            continue;
         }

         this.field335.add(var8);
      }

      this.method1847(var2, var4);
   }

   @ObfuscatedName("cg")
   @ObfuscatedSignature(
      signature = "(Lgx;ZI)V",
      garbageValue = "-1811560303"
   )
   void method1847(Packet var1, boolean var2) {
      this.field332 = new LinkedList();
      int var3 = var1.readUnsignedShort();

      for(int var4 = 0; var4 < var3; ++var4) {
         int var5 = var1.method5287();
         CoordGrid var6 = new CoordGrid(var1.readInt());
         boolean var7 = var1.readUnsignedByte() == 1;
         if(var2 || !var7) {
            this.field332.add(new class69((CoordGrid)null, var6, var5, (MapLabel)null));
         }
      }

   }

   @ObfuscatedName("kk")
   @ObfuscatedSignature(
      signature = "(Lia;I)Ljava/lang/String;",
      garbageValue = "-1359813963"
   )
   static String method1854(ComponentType var0) {
      return CacheFile.method5603(WorldComparator.method86(var0)) == 0?null:(var0.targetVerb != null && var0.targetVerb.trim().length() != 0?var0.targetVerb:null);
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(Lge;II)V",
      garbageValue = "-626520176"
   )
   static void method1852(Bit var0, int var1) {
      boolean var2 = var0.method2652(1) == 1;
      if(var2) {
         PlayerList.extendedInfoPlayerIndexes[++PlayerList.extendedInfoPlayerCount - 1] = var1;
      }

      int var3 = var0.method2652(2);
      PlayerEntity var4 = client.players[var1];
      if(var3 == 0) {
         if(var2) {
            var4.field635 = false;
         } else if(client.localPlayerIndex == var1) {
            throw new RuntimeException();
         } else {
            PlayerList.coords[var1] = (var4.field631 << 28) + (class53.baseX + var4.pathX[0] >> 13 << 14) + (class312.baseY + var4.pathY[0] >> 13);
            if(var4.facingCoord != -1) {
               PlayerList.facingCoords[var1] = var4.facingCoord;
            } else {
               PlayerList.facingCoords[var1] = var4.orientation;
            }

            PlayerList.facingEntities[var1] = var4.interacting;
            client.players[var1] = null;
            client.cachedPlayersChanged(var1);
            if(var0.method2652(1) != 0) {
               MilliTimer.method1064(var0, var1);
            }

         }
      } else {
         int var5;
         int var6;
         int var7;
         if(var3 == 1) {
            var5 = var0.method2652(3);
            var6 = var4.pathX[0];
            var7 = var4.pathY[0];
            if(var5 == 0) {
               --var6;
               --var7;
            } else if(var5 == 1) {
               --var7;
            } else if(var5 == 2) {
               ++var6;
               --var7;
            } else if(var5 == 3) {
               --var6;
            } else if(var5 == 4) {
               ++var6;
            } else if(var5 == 5) {
               --var6;
               ++var7;
            } else if(var5 == 6) {
               ++var7;
            } else if(var5 == 7) {
               ++var6;
               ++var7;
            }

            if(client.localPlayerIndex != var1 || var4.x * -1234429701 >= 1536 && var4.y >= 1536 && var4.x * -1234429701 < 11776 && var4.y < 11776) {
               if(var2) {
                  var4.field635 = true;
                  var4.xInScene = var6;
                  var4.yInScene = var7;
               } else {
                  var4.field635 = false;
                  var4.method6010(var6, var7, PlayerList.moveSpeeds[var1]);
               }
            } else {
               var4.method6011(var6, var7);
               var4.field635 = false;
            }

         } else if(var3 == 2) {
            var5 = var0.method2652(4);
            var6 = var4.pathX[0];
            var7 = var4.pathY[0];
            if(var5 == 0) {
               var6 -= 2;
               var7 -= 2;
            } else if(var5 == 1) {
               --var6;
               var7 -= 2;
            } else if(var5 == 2) {
               var7 -= 2;
            } else if(var5 == 3) {
               ++var6;
               var7 -= 2;
            } else if(var5 == 4) {
               var6 += 2;
               var7 -= 2;
            } else if(var5 == 5) {
               var6 -= 2;
               --var7;
            } else if(var5 == 6) {
               var6 += 2;
               --var7;
            } else if(var5 == 7) {
               var6 -= 2;
            } else if(var5 == 8) {
               var6 += 2;
            } else if(var5 == 9) {
               var6 -= 2;
               ++var7;
            } else if(var5 == 10) {
               var6 += 2;
               ++var7;
            } else if(var5 == 11) {
               var6 -= 2;
               var7 += 2;
            } else if(var5 == 12) {
               --var6;
               var7 += 2;
            } else if(var5 == 13) {
               var7 += 2;
            } else if(var5 == 14) {
               ++var6;
               var7 += 2;
            } else if(var5 == 15) {
               var6 += 2;
               var7 += 2;
            }

            if(client.localPlayerIndex == var1 && (var4.x * -1234429701 < 1536 || var4.y < 1536 || var4.x * -1234429701 >= 11776 || var4.y >= 11776)) {
               var4.method6011(var6, var7);
               var4.field635 = false;
            } else if(var2) {
               var4.field635 = true;
               var4.xInScene = var6;
               var4.yInScene = var7;
            } else {
               var4.field635 = false;
               var4.method6010(var6, var7, PlayerList.moveSpeeds[var1]);
            }

         } else {
            var5 = var0.method2652(1);
            int var8;
            int var9;
            int var10;
            int var11;
            if(var5 == 0) {
               var6 = var0.method2652(12);
               var7 = var6 >> 10;
               var8 = var6 >> 5 & 31;
               if(var8 > 15) {
                  var8 -= 32;
               }

               var9 = var6 & 31;
               if(var9 > 15) {
                  var9 -= 32;
               }

               var10 = var8 + var4.pathX[0];
               var11 = var9 + var4.pathY[0];
               if(client.localPlayerIndex != var1 || var4.x * -1234429701 >= 1536 && var4.y >= 1536 && var4.x * -1234429701 < 11776 && var4.y < 11776) {
                  if(var2) {
                     var4.field635 = true;
                     var4.xInScene = var10;
                     var4.yInScene = var11;
                  } else {
                     var4.field635 = false;
                     var4.method6010(var10, var11, PlayerList.moveSpeeds[var1]);
                  }
               } else {
                  var4.method6011(var10, var11);
                  var4.field635 = false;
               }

               var4.field631 = (byte)(var7 + var4.field631 & 3);
               if(client.localPlayerIndex == var1) {
                  ServerProt.level = var4.field631;
               }

            } else {
               var6 = var0.method2652(30);
               var7 = var6 >> 28;
               var8 = var6 >> 14 & 16383;
               var9 = var6 & 16383;
               var10 = (var8 + class53.baseX + var4.pathX[0] & 16383) - class53.baseX;
               var11 = (var9 + class312.baseY + var4.pathY[0] & 16383) - class312.baseY;
               if(client.localPlayerIndex == var1 && (var4.x * -1234429701 < 1536 || var4.y < 1536 || var4.x * -1234429701 >= 11776 || var4.y >= 11776)) {
                  var4.method6011(var10, var11);
                  var4.field635 = false;
               } else if(var2) {
                  var4.field635 = true;
                  var4.xInScene = var10;
                  var4.yInScene = var11;
               } else {
                  var4.field635 = false;
                  var4.method6010(var10, var11, PlayerList.moveSpeeds[var1]);
               }

               var4.field631 = (byte)(var7 + var4.field631 & 3);
               if(client.localPlayerIndex == var1) {
                  ServerProt.level = var4.field631;
               }

            }
         }
      }
   }

   @ObfuscatedName("jw")
   @ObfuscatedSignature(
      signature = "(Lia;III)V",
      garbageValue = "572830405"
   )
   static final void method1856(ComponentType var0, int var1, int var2) {
      if(client.draggedWidget == null && !client.isMenuOpen) {
         if(var0 != null && ChatLine.method5913(var0) != null) {
            client.draggedWidget = var0;
            client.field823 = ChatLine.method5913(var0);
            client.field824 = var1;
            client.field802 = var2;
            WorldMapRegion.field267 = 0;
            client.draggingWidget = false;
            client.draggingWidgetChanged(-1);
            int var3 = client.menuOptionCount - 1;
            if(var3 != -1) {
               class288.method5941(var3);
            }

         }
      }
   }
}
