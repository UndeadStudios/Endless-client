package net.runelite.standalone;

import java.util.zip.Inflater;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gn")
public class GZipDecompressor {
   @ObfuscatedName("hg")
   @ObfuscatedGetter(
      intValue = -355288643
   )
   static int cameraPitch;
   @ObfuscatedName("a")
   Inflater inflator;

   @ObfuscatedSignature(
      signature = "(III)V",
      garbageValue = "1000000"
   )
   GZipDecompressor(int var1, int var2, int var3) {
   }

   public GZipDecompressor() {
      this(-1, 1000000, 1000000);
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "(Lgx;[BI)V",
      garbageValue = "-1145459183"
   )
   public void method3615(Packet var1, byte[] var2) {
      if(var1.payload[var1.offset] == 31 && var1.payload[var1.offset + 1] == -117) {
         if(this.inflator == null) {
            this.inflator = new Inflater(true);
         }

         try {
            this.inflator.setInput(var1.payload, var1.offset + 10, var1.payload.length - (var1.offset + 8 + 10));
            this.inflator.inflate(var2);
         } catch (Exception var4) {
            this.inflator.reset();
            throw new RuntimeException("");
         }

         this.inflator.reset();
      } else {
         throw new RuntimeException("");
      }
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      signature = "(ILiz;IIIZI)V",
      garbageValue = "-570155493"
   )
   public static void method3620(int var0, Js5Index var1, int var2, int var3, int var4, boolean var5) {
      class262.field2557 = 1;
      class129.field278 = var1;
      class262.field2551 = var2;
      class262.field2552 = var3;
      class308.field536 = var4;
      class262.field2553 = var5;
      TextureProvider.field1525 = var0;
   }
}
