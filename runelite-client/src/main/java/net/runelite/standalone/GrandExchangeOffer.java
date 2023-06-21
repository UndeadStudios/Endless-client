package net.runelite.standalone;

import net.runelite.api.GrandExchangeOfferState;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.api.RSGrandExchangeOffer;

@ObfuscatedName("b")
public class GrandExchangeOffer implements RSGrandExchangeOffer {
   @ObfuscatedName("ns")
   @ObfuscatedSignature(
      signature = "[Lia;"
   )
   static ComponentType[] field69;
   @ObfuscatedName("gs")
   @ObfuscatedSignature(
      signature = "[Lld;"
   )
   static SpritePixels[] crossSprites;
   @ObfuscatedName("c")
   @ObfuscatedGetter(
      intValue = -115235313
   )
   public static int canvasWidth;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = -868595835
   )
   public int spent;
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = 767275651
   )
   public int totalQuantity;
   @ObfuscatedName("a")
   byte state;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = -639745279
   )
   public int itemId;
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      intValue = 2001614177
   )
   public int quantitySold;
   @ObfuscatedName("g")
   @ObfuscatedGetter(
      intValue = 880192857
   )
   public int price;

   public GrandExchangeOffer() {
      this.rl$$init();
   }

   @ObfuscatedSignature(
      signature = "(Lgx;Z)V",
      garbageValue = "0"
   )
   public GrandExchangeOffer(Packet var1, boolean var2) {
      this.state = var1.method5230();
      this.itemId = var1.readUnsignedShort();
      this.price = var1.readInt();
      this.totalQuantity = var1.readInt();
      this.quantitySold = var1.readInt();
      this.spent = var1.readInt();
      this.rl$$init();
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(IS)V",
      garbageValue = "3864"
   )
   void method1728(int var1) {
      this.state &= -9;
      if(var1 == 1) {
         this.state = (byte)(this.state | 8);
      }

   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(B)I",
      garbageValue = "102"
   )
   public int method1735() {
      return (this.state & 8) == 8?1:0;
   }

   public byte getRSState() {
      return this.state;
   }

   private void rl$$init() {
   }

   public int getQuantitySold() {
      return this.quantitySold;
   }

   public int getTotalQuantity() {
      return this.totalQuantity;
   }

   public GrandExchangeOfferState getState() {
      byte var1 = this.getRSState();
      boolean var2 = (var1 & 8) == 8;
      boolean var3 = (var1 & 4) == 4;
      return var1 == 0?GrandExchangeOfferState.EMPTY:(var3 && this.getQuantitySold() < this.getTotalQuantity()?(var2?GrandExchangeOfferState.CANCELLED_SELL:GrandExchangeOfferState.CANCELLED_BUY):(var2?(var3?GrandExchangeOfferState.SOLD:GrandExchangeOfferState.SELLING):(var3?GrandExchangeOfferState.BOUGHT:GrandExchangeOfferState.BUYING)));
   }

   public int getItemId() {
      return this.itemId;
   }

   public int getPrice() {
      return this.price;
   }

   public int getSpent() {
      return this.spent;
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "-2113459447"
   )
   void method1721(int var1) {
      this.state &= -8;
      this.state = (byte)(this.state | var1 & 7);
   }

   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "(B)I",
      garbageValue = "0"
   )
   public int method1720() {
      return this.state & 7;
   }

   @ObfuscatedName("a")
   public static final int method1725(double var0, double var2, double var4) {
      double var6 = var4;
      double var8 = var4;
      double var10 = var4;
      if(var2 != 0.0D) {
         double var12;
         if(var4 < 0.5D) {
            var12 = var4 * (1.0D + var2);
         } else {
            var12 = var4 + var2 - var4 * var2;
         }

         double var14 = var4 * 2.0D - var12;
         double var16 = 0.3333333333333333D + var0;
         if(var16 > 1.0D) {
            --var16;
         }

         double var20 = var0 - 0.3333333333333333D;
         if(var20 < 0.0D) {
            ++var20;
         }

         if(6.0D * var16 < 1.0D) {
            var6 = (var12 - var14) * 6.0D * var16 + var14;
         } else if(2.0D * var16 < 1.0D) {
            var6 = var12;
         } else if(3.0D * var16 < 2.0D) {
            var6 = 6.0D * (0.6666666666666666D - var16) * (var12 - var14) + var14;
         } else {
            var6 = var14;
         }

         if(var0 * 6.0D < 1.0D) {
            var8 = 6.0D * (var12 - var14) * var0 + var14;
         } else if(2.0D * var0 < 1.0D) {
            var8 = var12;
         } else if(3.0D * var0 < 2.0D) {
            var8 = 6.0D * (var12 - var14) * (0.6666666666666666D - var0) + var14;
         } else {
            var8 = var14;
         }

         if(var20 * 6.0D < 1.0D) {
            var10 = var20 * 6.0D * (var12 - var14) + var14;
         } else if(2.0D * var20 < 1.0D) {
            var10 = var12;
         } else if(3.0D * var20 < 2.0D) {
            var10 = var14 + (0.6666666666666666D - var20) * (var12 - var14) * 6.0D;
         } else {
            var10 = var14;
         }
      }

      int var22 = (int)(var6 * 256.0D);
      int var13 = (int)(var8 * 256.0D);
      int var23 = (int)(256.0D * var10);
      int var15 = var23 + (var13 << 8) + (var22 << 16);
      return var15;
   }

   @ObfuscatedName("hk")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "25"
   )
   static void method1734() {
      TotalQuantityComparator.method1112();
      client.menuOptions[0] = "Cancel";
      client.menuTargets[0] = "";
      client.menuTypes[0] = 1006;
      client.menuBooleanArray[0] = false;
      client.menuOptionCount = 1;
      client.onMenuOptionsChanged(-1);
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(IB)Ljy;",
      garbageValue = "20"
   )
   public static LocType method1736(int var0) {
      LocType var1 = (LocType)LocType.objects.method635((long)var0);
      if(var1 != null) {
         return var1;
      } else {
         byte[] var2 = LocType.objects_ref.method4115(6, var0, 520317085);
         var1 = new LocType();
         var1.field3476 = var0;
         if(var2 != null) {
            var1.method383(new Packet(var2));
         }

         var1.method382();
         if(var1.isHollow) {
            var1.clipType = 0;
            var1.blocksProjectile = false;
         }

         LocType.objects.method628(var1, (long)var0);
         return var1;
      }
   }
}
