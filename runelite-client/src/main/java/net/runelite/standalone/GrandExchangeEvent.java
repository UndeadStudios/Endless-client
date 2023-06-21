package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("m")
public class GrandExchangeEvent {
   @ObfuscatedName("x")
   String string1;
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      intValue = -1759845203
   )
   public final int world;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      longValue = -3414339192986390507L
   )
   public final long field49;
   @ObfuscatedName("h")
   String string2;
   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "Lb;"
   )
   public final GrandExchangeOffer grandExchangeOffer;

   @ObfuscatedSignature(
      signature = "(Lgx;BI)V"
   )
   GrandExchangeEvent(Packet var1, byte var2, int var3) {
      this.string1 = var1.readString();
      this.string2 = var1.readString();
      this.world = var1.readUnsignedShort();
      this.field49 = var1.method5299();
      int var4 = var1.readInt();
      int var5 = var1.readInt();
      this.grandExchangeOffer = new GrandExchangeOffer();
      this.grandExchangeOffer.method1721(2);
      this.grandExchangeOffer.method1728(var2);
      this.grandExchangeOffer.price = var4;
      this.grandExchangeOffer.totalQuantity = var5;
      this.grandExchangeOffer.quantitySold = 0;
      this.grandExchangeOffer.spent = 0;
      this.grandExchangeOffer.itemId = var3;
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "(B)Ljava/lang/String;",
      garbageValue = "84"
   )
   public String method1556() {
      return this.string1;
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(I)Ljava/lang/String;",
      garbageValue = "-177460240"
   )
   public String method1557() {
      return this.string2;
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "([BIIIIIII[Lfk;S)V",
      garbageValue = "-10810"
   )
   static final void method1564(byte[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, CollisionData[] var8) {
      int var10;
      for(int var9 = 0; var9 < 8; ++var9) {
         for(var10 = 0; var10 < 8; ++var10) {
            if(var9 + var2 > 0 && var9 + var2 < 103 && var3 + var10 > 0 && var3 + var10 < 103) {
               var8[var1].flags[var9 + var2][var3 + var10] &= -16777217;
            }
         }
      }

      Packet var13 = new Packet(var0);

      for(var10 = 0; var10 < 4; ++var10) {
         for(int var11 = 0; var11 < 64; ++var11) {
            for(int var12 = 0; var12 < 64; ++var12) {
               if(var10 == var4 && var11 >= var5 && var11 < var5 + 8 && var12 >= var6 && var12 < var6 + 8) {
                  Size.method4094(var13, var1, var2 + class192.method3813(var11 & 7, var12 & 7, var7), var3 + ClientOptions.method1076(var11 & 7, var12 & 7, var7), 0, 0, var7);
               } else {
                  Size.method4094(var13, 0, -1, -1, 0, 0, 0);
               }
            }
         }
      }

   }

   @ObfuscatedName("y")
   @ObfuscatedSignature(
      signature = "(IIIB)I",
      garbageValue = "-16"
   )
   static final int method1562(int var0, int var1, int var2) {
      if(var2 > 179) {
         var1 /= 2;
      }

      if(var2 > 192) {
         var1 /= 2;
      }

      if(var2 > 217) {
         var1 /= 2;
      }

      if(var2 > 243) {
         var1 /= 2;
      }

      int var3 = (var1 / 32 << 7) + (var0 / 4 << 10) + var2 / 2;
      return var3;
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(IIII)Lcs;",
      garbageValue = "-3560696"
   )
   static class314 method1555(int var0, int var1, int var2) {
      int var3 = NPCEntity.method1834(var1, var0);
      class314 var4 = Tile.method3824(var3, var0);
      if(var4 != null) {
         return var4;
      } else {
         int var5 = var0 + (var2 + 40000 << 8);
         var4 = Tile.method3824(var5, var0);
         return var4 != null?var4:null;
      }
   }
}
