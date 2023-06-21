package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.api.RSPacketBuffer;

@ObfuscatedName("ge")
public final class Bit extends Packet implements RSPacketBuffer {
   @ObfuscatedName("b")
   static final int[] field2456;
   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "Lgb;"
   )
   Isaac cipher;
   @ObfuscatedName("n")
   @ObfuscatedGetter(
      intValue = 730712021
   )
   int bitPosition;

   static {
      field2456 = new int[]{0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1};
   }

   public Bit(int var1) {
      super(var1);
   }

   @ObfuscatedName("jh")
   @ObfuscatedSignature(
      signature = "(Lgb;I)V",
      garbageValue = "-827937127"
   )
   public void method2668(Isaac var1) {
      this.cipher = var1;
   }

   @ObfuscatedName("jz")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1692241579"
   )
   public void method2663() {
      this.bitPosition = super.offset * 8;
   }

   @ObfuscatedName("jt")
   @ObfuscatedSignature(
      signature = "([BIII)V",
      garbageValue = "543415141"
   )
   public void method2650(byte[] var1, int var2, int var3) {
      for(int var4 = 0; var4 < var3; ++var4) {
         var1[var4 + var2] = (byte)(super.payload[++super.offset - 1] - this.cipher.method4221());
      }

   }

   @ObfuscatedName("jr")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "814723695"
   )
   public int method2667() {
      int var1 = super.payload[++super.offset - 1] - this.cipher.method4221() & 255;
      return var1 < 128?var1:(var1 - 128 << 8) + (super.payload[++super.offset - 1] - this.cipher.method4221() & 255);
   }

   @ObfuscatedName("jo")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "-1643845477"
   )
   public void method2646(int var1) {
      super.payload[++super.offset - 1] = (byte)(var1 + this.cipher.method4221());
   }

   @ObfuscatedName("jp")
   @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "1286690468"
   )
   public boolean method2648() {
      int var1 = super.payload[super.offset] - this.cipher.method4212() & 255;
      return var1 >= 128;
   }

   @ObfuscatedName("jq")
   @ObfuscatedSignature(
      signature = "(II)I",
      garbageValue = "-1179850267"
   )
   public int method2652(int var1) {
      int var2 = this.bitPosition >> 3;
      int var3 = 8 - (this.bitPosition & 7);
      int var4 = 0;

      for(this.bitPosition += var1; var1 > var3; var3 = 8) {
         var4 += (super.payload[var2++] & field2456[var3]) << var1 - var3;
         var1 -= var3;
      }

      if(var3 == var1) {
         var4 += super.payload[var2] & field2456[var3];
      } else {
         var4 += super.payload[var2] >> var3 - var1 & field2456[var1];
      }

      return var4;
   }

   @ObfuscatedName("je")
   @ObfuscatedSignature(
      signature = "(II)I",
      garbageValue = "335662443"
   )
   public int method2654(int var1) {
      return var1 * 8 - this.bitPosition;
   }

   @ObfuscatedName("jl")
   @ObfuscatedSignature(
      signature = "([IB)V",
      garbageValue = "0"
   )
   public void method2644(int[] var1) {
      this.cipher = new Isaac(var1);
   }

   @ObfuscatedName("jf")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "578472626"
   )
   public void method2671() {
      super.offset = (this.bitPosition + 7) / 8;
   }

   @ObfuscatedName("jx")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "476171248"
   )
   public int method2647() {
      return super.payload[++super.offset - 1] - this.cipher.method4221() & 255;
   }

   @ObfuscatedName("b")
   static final void method2675(long var0) {
      class47.field1740[++class47.Viewport_entityCountAtMouse - 1] = var0;
   }

   @ObfuscatedName("kj")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1024721112"
   )
   static final void method2674() {
      TcpConnectionMessage var0 = class232.method4535(ClientProt.field2265, client.serverConnection.isaac);
      client.serverConnection.method18(var0);

      for(SubInterface var1 = (SubInterface) client.subInterfaces.method6338(); var1 != null; var1 = (SubInterface) client.subInterfaces.method6339()) {
         if(var1.mode == 0 || var1.mode == 3) {
            Overlay.method6405(var1, true);
         }
      }

      if(client.field793 != null) {
         WorldMapRegion.method5554(client.field793);
         client.field793 = null;
      }

   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "(Liz;IIB)[Lld;",
      garbageValue = "-34"
   )
   public static SpritePixels[] method2676(Js5Index var0, int var1, int var2) {
      if(!class205.method4006(var0, var1, var2)) {
         return null;
      } else {
         SpritePixels[] var4 = new SpritePixels[class96.indexedSpriteCount];

         for(int var5 = 0; var5 < class96.indexedSpriteCount; ++var5) {
            SpritePixels var6 = var4[var5] = new SpritePixels();
            var6.maxWidth = class96.indexedSpriteWidth;
            var6.maxHeight = class96.indexedSpriteHeight;
            var6.offsetX = class96.indexedSpriteOffsetXs[var5];
            var6.offsetY = GameCanvas.indexedSpriteOffsetYs[var5];
            var6.width = class96.indexSpriteWidths[var5];
            var6.height = class96.indexedSpriteHeights[var5];
            int var7 = var6.width * var6.height;
            byte[] var8 = class241.spritePixels[var5];
            var6.pixels = new int[var7];

            for(int var9 = 0; var9 < var7; ++var9) {
               var6.pixels[var9] = class96.indexedSpritePalette[var8[var9] & 255];
            }
         }

         class43.method648();
         return var4;
      }
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(II)Z",
      garbageValue = "2108672263"
   )
   public static boolean method2649(int var0) {
      return (var0 >> 20 & 1) != 0;
   }
}
