package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gb")
public final class Isaac {
   @ObfuscatedName("se")
   @ObfuscatedGetter(
      intValue = -10040823
   )
   static int field2467;
   @ObfuscatedName("f")
   int[] mem;
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = 1132465277
   )
   int field2466;
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = -816921805
   )
   int count;
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      intValue = -1935004419
   )
   int field2465;
   @ObfuscatedName("p")
   @ObfuscatedGetter(
      intValue = 487301423
   )
   int field2463;
   @ObfuscatedName("h")
   int[] rsl;

   public Isaac(int[] var1) {
      this.mem = new int[256];
      this.rsl = new int[256];

      for(int var2 = 0; var2 < var1.length; ++var2) {
         this.rsl[var2] = var1[var2];
      }

      this.method4217();
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1652692063"
   )
   final void method4217() {
      int var9 = -1640531527;
      int var8 = -1640531527;
      int var7 = -1640531527;
      int var6 = -1640531527;
      int var5 = -1640531527;
      int var4 = -1640531527;
      int var3 = -1640531527;
      int var2 = -1640531527;

      int var1;
      for(var1 = 0; var1 < 4; ++var1) {
         var2 ^= var3 << 11;
         var5 += var2;
         var3 += var4;
         var3 ^= var4 >>> 2;
         var6 += var3;
         var4 += var5;
         var4 ^= var5 << 8;
         var7 += var4;
         var5 += var6;
         var5 ^= var6 >>> 16;
         var8 += var5;
         var6 += var7;
         var6 ^= var7 << 10;
         var9 += var6;
         var7 += var8;
         var7 ^= var8 >>> 4;
         var2 += var7;
         var8 += var9;
         var8 ^= var9 << 8;
         var3 += var8;
         var9 += var2;
         var9 ^= var2 >>> 9;
         var4 += var9;
         var2 += var3;
      }

      for(var1 = 0; var1 < 256; var1 += 8) {
         var2 += this.rsl[var1];
         var3 += this.rsl[var1 + 1];
         var4 += this.rsl[var1 + 2];
         var5 += this.rsl[var1 + 3];
         var6 += this.rsl[var1 + 4];
         var7 += this.rsl[var1 + 5];
         var8 += this.rsl[var1 + 6];
         var9 += this.rsl[var1 + 7];
         var2 ^= var3 << 11;
         var5 += var2;
         var3 += var4;
         var3 ^= var4 >>> 2;
         var6 += var3;
         var4 += var5;
         var4 ^= var5 << 8;
         var7 += var4;
         var5 += var6;
         var5 ^= var6 >>> 16;
         var8 += var5;
         var6 += var7;
         var6 ^= var7 << 10;
         var9 += var6;
         var7 += var8;
         var7 ^= var8 >>> 4;
         var2 += var7;
         var8 += var9;
         var8 ^= var9 << 8;
         var3 += var8;
         var9 += var2;
         var9 ^= var2 >>> 9;
         var4 += var9;
         var2 += var3;
         this.mem[var1] = var2;
         this.mem[var1 + 1] = var3;
         this.mem[var1 + 2] = var4;
         this.mem[var1 + 3] = var5;
         this.mem[var1 + 4] = var6;
         this.mem[var1 + 5] = var7;
         this.mem[var1 + 6] = var8;
         this.mem[var1 + 7] = var9;
      }

      for(var1 = 0; var1 < 256; var1 += 8) {
         var2 += this.mem[var1];
         var3 += this.mem[var1 + 1];
         var4 += this.mem[var1 + 2];
         var5 += this.mem[var1 + 3];
         var6 += this.mem[var1 + 4];
         var7 += this.mem[var1 + 5];
         var8 += this.mem[var1 + 6];
         var9 += this.mem[var1 + 7];
         var2 ^= var3 << 11;
         var5 += var2;
         var3 += var4;
         var3 ^= var4 >>> 2;
         var6 += var3;
         var4 += var5;
         var4 ^= var5 << 8;
         var7 += var4;
         var5 += var6;
         var5 ^= var6 >>> 16;
         var8 += var5;
         var6 += var7;
         var6 ^= var7 << 10;
         var9 += var6;
         var7 += var8;
         var7 ^= var8 >>> 4;
         var2 += var7;
         var8 += var9;
         var8 ^= var9 << 8;
         var3 += var8;
         var9 += var2;
         var9 ^= var2 >>> 9;
         var4 += var9;
         var2 += var3;
         this.mem[var1] = var2;
         this.mem[var1 + 1] = var3;
         this.mem[var1 + 2] = var4;
         this.mem[var1 + 3] = var5;
         this.mem[var1 + 4] = var6;
         this.mem[var1 + 5] = var7;
         this.mem[var1 + 6] = var8;
         this.mem[var1 + 7] = var9;
      }

      this.method4223();
      this.count = 256;
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "(B)I",
      garbageValue = "1"
   )
   final int method4221() {
      if(0 == --this.count + 1) {
         this.method4223();
         this.count = 255;
      }

      return this.rsl[this.count];
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "99718613"
   )
   final int method4212() {
      if(this.count == 0) {
         this.method4223();
         this.count = 256;
      }

      return this.rsl[this.count - 1];
   }

   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "1230498181"
   )
   final void method4223() {
      this.field2465 += ++this.field2466;

      for(int var1 = 0; var1 < 256; ++var1) {
         int var2 = this.mem[var1];
         if((var1 & 2) == 0) {
            if((var1 & 1) == 0) {
               this.field2463 ^= this.field2463 << 13;
            } else {
               this.field2463 ^= this.field2463 >>> 6;
            }
         } else if((var1 & 1) == 0) {
            this.field2463 ^= this.field2463 << 2;
         } else {
            this.field2463 ^= this.field2463 >>> 16;
         }

         this.field2463 += this.mem[128 + var1 & 255];
         int var3;
         this.mem[var1] = var3 = this.mem[(var2 & 1020) >> 2] + this.field2463 + this.field2465;
         this.rsl[var1] = this.field2465 = this.mem[(var3 >> 8 & 1020) >> 2] + var2;
      }

   }
}
