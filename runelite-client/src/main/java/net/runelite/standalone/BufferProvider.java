package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.api.RSBufferProvider;

@ObfuscatedName("lr")
public abstract class BufferProvider implements RSBufferProvider {
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = 1926491113
   )
   public int width;
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      intValue = -1014058049
   )
   public int height;
   @ObfuscatedName("g")
   public int[] pixels;

   public int[] getPixels() {
      return this.pixels;
   }

   public int getWidth() {
      return this.width;
   }

   public int getHeight() {
      return this.height;
   }

   public void setRaster() {
      this.method1872();
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(IIB)V",
      garbageValue = "16"
   )
   public abstract void vmethod4241(int var1, int var2);

   @ObfuscatedName("u")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "30"
   )
   public final void method1872() {
      Rasterizer2D.method701(this.pixels, this.width, this.height);
   }

   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "(IIIII)V",
      garbageValue = "-215892781"
   )
   public abstract void vmethod4242(int var1, int var2, int var3, int var4);

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "([BIIB)Z",
      garbageValue = "1"
   )
   static final boolean method1881(byte[] var0, int var1, int var2) {
      boolean var3 = true;
      Packet var4 = new Packet(var0);
      int var5 = -1;

      label68:
      while(true) {
         int var6 = var4.method5088();
         if(var6 == 0) {
            return var3;
         }

         var5 += var6;
         int var7 = 0;
         boolean var8 = false;

         while(true) {
            int var9;
            while(!var8) {
               var9 = var4.method5269();
               if(var9 == 0) {
                  continue label68;
               }

               var7 += var9 - 1;
               int var10 = var7 & 63;
               int var11 = var7 >> 6 & 63;
               int var12 = var4.readUnsignedByte() >> 2;
               int var13 = var11 + var1;
               int var14 = var10 + var2;
               if(var13 > 0 && var14 > 0 && var13 < 103 && var14 < 103) {
                  LocType var15 = GrandExchangeOffer.method1736(var5);
                  if(var12 != 22 || !client.lowMemory || var15.field3471 != 0 || var15.clipType == 1 || var15.obstructsGround) {
                     if(!var15.method386()) {
                        ++client.field703;
                        var3 = false;
                     }

                     var8 = true;
                  }
               }
            }

            var9 = var4.method5269();
            if(var9 == 0) {
               break;
            }

            var4.readUnsignedByte();
         }
      }
   }
}
