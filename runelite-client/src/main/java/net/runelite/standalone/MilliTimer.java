package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fg")
public class MilliTimer extends Timer {
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = 1998893585
   )
   int field2001;
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      longValue = -5588373986659017165L
   )
   long field1999;
   @ObfuscatedName("a")
   long[] field2005;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = -1712474251
   )
   int field1997;
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      intValue = -1319788187
   )
   int field2006;
   @ObfuscatedName("g")
   @ObfuscatedGetter(
      intValue = 453356517
   )
   int sleepTime;

   public MilliTimer() {
      this.field2005 = new long[10];
      this.field1997 = 256;
      this.sleepTime = 1;
      this.field2006 = 0;
      this.field1999 = class318.method6317();

      for(int var1 = 0; var1 < 10; ++var1) {
         this.field2005[var1] = this.field1999;
      }

   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "42"
   )
   public void vmethod6050() {
      for(int var1 = 0; var1 < 10; ++var1) {
         this.field2005[var1] = 0L;
      }

   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(III)I",
      garbageValue = "-87101012"
   )
   public int vmethod6053(int var1, int var2) {
      int var3 = this.field1997;
      int var4 = this.sleepTime;
      this.field1997 = 300;
      this.sleepTime = 1;
      this.field1999 = class318.method6317();
      if(0L == this.field2005[this.field2001]) {
         this.field1997 = var3;
         this.sleepTime = var4;
      } else if(this.field1999 > this.field2005[this.field2001]) {
         this.field1997 = (int)((long)(var1 * 2560) / (this.field1999 - this.field2005[this.field2001]));
      }

      if(this.field1997 < 25) {
         this.field1997 = 25;
      }

      if(this.field1997 > 256) {
         this.field1997 = 256;
         this.sleepTime = (int)((long)var1 - (this.field1999 - this.field2005[this.field2001]) / 10L);
      }

      if(this.sleepTime > var1) {
         this.sleepTime = var1;
      }

      this.field2005[this.field2001] = this.field1999;
      this.field2001 = (this.field2001 + 1) % 10;
      int var5;
      if(this.sleepTime > 1) {
         for(var5 = 0; var5 < 10; ++var5) {
            if(this.field2005[var5] != 0L) {
               this.field2005[var5] += (long)this.sleepTime;
            }
         }
      }

      if(this.sleepTime < var2) {
         this.sleepTime = var2;
      }

      class36.method553((long)this.sleepTime);

      for(var5 = 0; this.field2006 < 256; this.field2006 += this.field1997) {
         ++var5;
      }

      this.field2006 &= 255;
      return var5;
   }

   @ObfuscatedName("ix")
   @ObfuscatedSignature(
      signature = "(II)Ljava/lang/String;",
      garbageValue = "424482690"
   )
   static String method1071(int var0) {
      return var0 < 0?"":(client.menuTargets[var0].length() > 0? client.menuOptions[var0] + " " + client.menuTargets[var0]: client.menuOptions[var0]);
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "(S)Lfa;",
      garbageValue = "-13449"
   )
   static TcpConnectionMessage method1068() {
      return TcpConnectionMessage.field2348 == 0?new TcpConnectionMessage():TcpConnectionMessage.packetBufferNodes[--TcpConnectionMessage.field2348];
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      signature = "(Lge;II)Z",
      garbageValue = "-964225277"
   )
   static boolean method1064(Bit var0, int var1) {
      int var2 = var0.method2652(2);
      int var3;
      int var4;
      int var7;
      int var8;
      int var9;
      int var10;
      if(var2 == 0) {
         if(var0.method2652(1) != 0) {
            method1064(var0, var1);
         }

         var3 = var0.method2652(13);
         var4 = var0.method2652(13);
         boolean var12 = var0.method2652(1) == 1;
         if(var12) {
            PlayerList.extendedInfoPlayerIndexes[++PlayerList.extendedInfoPlayerCount - 1] = var1;
         }

         if(client.players[var1] != null) {
            throw new RuntimeException();
         } else {
            PlayerEntity var10000 = client.players[var1] = new PlayerEntity();
            client.cachedPlayersChanged(var1);
            PlayerEntity var6 = var10000;
            var6.playerId = var1;
            if(PlayerList.appearances[var1] != null) {
               var6.method6004(PlayerList.appearances[var1]);
            }

            var6.orientation = PlayerList.facingCoords[var1];
            var6.interacting = PlayerList.facingEntities[var1];
            var6.interactingChanged(-1);
            var7 = PlayerList.coords[var1];
            var8 = var7 >> 28;
            var9 = var7 >> 14 & 255;
            var10 = var7 & 255;
            var6.pathTraversed[0] = PlayerList.moveSpeeds[var1];
            var6.field631 = (byte)var8;
            var6.method6011((var9 << 13) + var3 - class53.baseX, (var10 << 13) + var4 - class312.baseY);
            var6.field635 = false;
            return true;
         }
      } else if(var2 == 1) {
         var3 = var0.method2652(2);
         var4 = PlayerList.coords[var1];
         PlayerList.coords[var1] = (var4 & 268435455) + (((var4 >> 28) + var3 & 3) << 28);
         return false;
      } else {
         int var5;
         int var11;
         if(var2 == 2) {
            var3 = var0.method2652(5);
            var4 = var3 >> 3;
            var5 = var3 & 7;
            var11 = PlayerList.coords[var1];
            var7 = (var11 >> 28) + var4 & 3;
            var8 = var11 >> 14 & 255;
            var9 = var11 & 255;
            if(var5 == 0) {
               --var8;
               --var9;
            }

            if(var5 == 1) {
               --var9;
            }

            if(var5 == 2) {
               ++var8;
               --var9;
            }

            if(var5 == 3) {
               --var8;
            }

            if(var5 == 4) {
               ++var8;
            }

            if(var5 == 5) {
               --var8;
               ++var9;
            }

            if(var5 == 6) {
               ++var9;
            }

            if(var5 == 7) {
               ++var8;
               ++var9;
            }

            PlayerList.coords[var1] = (var8 << 14) + var9 + (var7 << 28);
            return false;
         } else {
            var3 = var0.method2652(18);
            var4 = var3 >> 16;
            var5 = var3 >> 8 & 255;
            var11 = var3 & 255;
            var7 = PlayerList.coords[var1];
            var8 = (var7 >> 28) + var4 & 3;
            var9 = var5 + (var7 >> 14) & 255;
            var10 = var11 + var7 & 255;
            PlayerList.coords[var1] = (var9 << 14) + var10 + (var8 << 28);
            return false;
         }
      }
   }
}
