package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hf")
public class class305 {
   @ObfuscatedName("b")
   static final byte[] field2617;
   @ObfuscatedName("f")
   int[] field2613;
   @ObfuscatedName("q")
   long field2616;
   @ObfuscatedName("x")
   int[] field2609;
   @ObfuscatedName("p")
   int field2611;
   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "Lgx;"
   )
   Packet field2618;
   @ObfuscatedName("s")
   int field2614;
   @ObfuscatedName("h")
   int[] field2612;
   @ObfuscatedName("g")
   int[] field2610;

   static {
      field2617 = new byte[]{(byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)0, (byte)1, (byte)2, (byte)1, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0};
   }

   class305(byte[] var1) {
      this.field2618 = new Packet((byte[])null);
      this.method6121(var1);
   }

   class305() {
      this.field2618 = new Packet((byte[])null);
   }

   @ObfuscatedName("f")
   void method6128(int var1) {
      this.field2609[var1] = this.field2618.offset;
   }

   @ObfuscatedName("l")
   void method6108(long var1) {
      this.field2616 = var1;
      int var3 = this.field2609.length;

      for(int var4 = 0; var4 < var3; ++var4) {
         this.field2612[var4] = 0;
         this.field2613[var4] = 0;
         this.field2618.offset = this.field2610[var4];
         this.method6100(var4);
         this.field2609[var4] = this.field2618.offset;
      }

   }

   @ObfuscatedName("e")
   long method6105(int var1) {
      return this.field2616 + (long)var1 * (long)this.field2611;
   }

   @ObfuscatedName("r")
   int method6106() {
      int var1 = this.field2609.length;
      int var2 = -1;
      int var3 = Integer.MAX_VALUE;

      for(int var4 = 0; var4 < var1; ++var4) {
         if(this.field2609[var4] >= 0 && this.field2612[var4] < var3) {
            var2 = var4;
            var3 = this.field2612[var4];
         }
      }

      return var2;
   }

   @ObfuscatedName("q")
   int method6102(int var1) {
      int var2 = this.method6103(var1);
      return var2;
   }

   @ObfuscatedName("x")
   int method6097() {
      return this.field2609.length;
   }

   @ObfuscatedName("m")
   void method6100(int var1) {
      int var2 = this.field2618.method5104();
      this.field2612[var1] += var2;
   }

   @ObfuscatedName("p")
   void method6124() {
      this.field2618.offset = -1;
   }

   @ObfuscatedName("b")
   int method6103(int var1) {
      byte var2 = this.field2618.payload[this.field2618.offset];
      int var5;
      if(var2 < 0) {
         var5 = var2 & 255;
         this.field2613[var1] = var5;
         ++this.field2618.offset;
      } else {
         var5 = this.field2613[var1];
      }

      if(var5 != 240 && var5 != 247) {
         return this.method6104(var1, var5);
      } else {
         int var3 = this.field2618.method5104();
         if(var5 == 247 && var3 > 0) {
            int var4 = this.field2618.payload[this.field2618.offset] & 255;
            if(var4 >= 241 && var4 <= 243 || var4 == 246 || var4 == 248 || var4 >= 250 && var4 <= 252 || var4 == 254) {
               ++this.field2618.offset;
               this.field2613[var1] = var4;
               return this.method6104(var1, var4);
            }
         }

         this.field2618.offset += var3;
         return 0;
      }
   }

   @ObfuscatedName("a")
   void method6121(byte[] var1) {
      this.field2618.payload = var1;
      this.field2618.offset = 10;
      int var2 = this.field2618.readUnsignedShort();
      this.field2614 = this.field2618.readUnsignedShort();
      this.field2611 = 500000;
      this.field2610 = new int[var2];

      int var3;
      int var5;
      for(var3 = 0; var3 < var2; this.field2618.offset += var5) {
         int var4 = this.field2618.readInt();
         var5 = this.field2618.readInt();
         if(var4 == 1297379947) {
            this.field2610[var3] = this.field2618.offset;
            ++var3;
         }
      }

      this.field2616 = 0L;
      this.field2609 = new int[var2];

      for(var3 = 0; var3 < var2; ++var3) {
         this.field2609[var3] = this.field2610[var3];
      }

      this.field2612 = new int[var2];
      this.field2613 = new int[var2];
   }

   @ObfuscatedName("n")
   int method6104(int var1, int var2) {
      int var4;
      if(var2 == 255) {
         int var7 = this.field2618.readUnsignedByte();
         var4 = this.field2618.method5104();
         if(var7 == 47) {
            this.field2618.offset += var4;
            return 1;
         } else if(var7 == 81) {
            int var5 = this.field2618.method5090();
            var4 -= 3;
            int var6 = this.field2612[var1];
            this.field2616 += (long)var6 * (long)(this.field2611 - var5);
            this.field2611 = var5;
            this.field2618.offset += var4;
            return 2;
         } else {
            this.field2618.offset += var4;
            return 3;
         }
      } else {
         byte var3 = field2617[var2 - 128];
         var4 = var2;
         if(var3 >= 1) {
            var4 = var2 | this.field2618.readUnsignedByte() << 8;
         }

         if(var3 >= 2) {
            var4 |= this.field2618.readUnsignedByte() << 16;
         }

         return var4;
      }
   }

   @ObfuscatedName("t")
   boolean method6107() {
      int var1 = this.field2609.length;

      for(int var2 = 0; var2 < var1; ++var2) {
         if(this.field2609[var2] >= 0) {
            return false;
         }
      }

      return true;
   }

   @ObfuscatedName("s")
   void method6101() {
      this.field2618.payload = null;
      this.field2610 = null;
      this.field2609 = null;
      this.field2612 = null;
      this.field2613 = null;
   }

   @ObfuscatedName("h")
   void method6098(int var1) {
      this.field2618.offset = this.field2609[var1];
   }

   @ObfuscatedName("g")
   boolean method6096() {
      return this.field2618.payload != null;
   }
}
