package net.runelite.standalone;

import java.math.BigInteger;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.api.RSBuffer;

@ObfuscatedName("gx")
public class Packet extends Node implements RSBuffer {
   @ObfuscatedName("h")
   static long[] crc64Table;
   @ObfuscatedName("g")
   static int[] crc32Table;
   @ObfuscatedName("a")
   public byte[] payload;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = -1555038209
   )
   public int offset;

   static {
      crc32Table = new int[256];

      int var2;
      for(int var1 = 0; var1 < 256; ++var1) {
         int var0 = var1;

         for(var2 = 0; var2 < 8; ++var2) {
            if((var0 & 1) == 1) {
               var0 = var0 >>> 1 ^ -306674912;
            } else {
               var0 >>>= 1;
            }
         }

         crc32Table[var1] = var0;
      }

      crc64Table = new long[256];

      for(var2 = 0; var2 < 256; ++var2) {
         long var4 = (long)var2;

         for(int var3 = 0; var3 < 8; ++var3) {
            if((var4 & 1L) == 1L) {
               var4 = var4 >>> 1 ^ -3932672073523589310L;
            } else {
               var4 >>>= 1;
            }
         }

         crc64Table[var2] = var4;
      }

   }

   public Packet(int var1) {
      this.payload = DecorativeObject.method911(var1);
      this.offset = 0;
   }

   public Packet(byte[] var1) {
      this.payload = var1;
      this.offset = 0;
   }

   @ObfuscatedName("ak")
   @ObfuscatedSignature(
      signature = "([IIII)V",
      garbageValue = "-81741600"
   )
   public void method5196(int[] var1, int var2, int var3) {
      int var4 = this.offset;
      this.offset = var2;
      int var5 = (var3 - var2) / 8;

      for(int var6 = 0; var6 < var5; ++var6) {
         int var7 = this.readInt();
         int var8 = this.readInt();
         int var9 = 0;
         int var10 = -1640531527;

         for(int var11 = 32; var11-- > 0; var8 += var7 + (var7 << 4 ^ var7 >>> 5) ^ var1[var9 >>> 11 & 3] + var9) {
            var7 += var8 + (var8 << 4 ^ var8 >>> 5) ^ var9 + var1[var9 & 3];
            var9 += var10;
         }

         this.offset -= 8;
         this.writeInt(var7);
         this.writeInt(var8);
      }

      this.offset = var4;
   }

   @ObfuscatedName("by")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "1509644456"
   )
   public int method5127() {
      this.offset += 2;
      int var1 = ((this.payload[this.offset - 1] & 255) << 8) + (this.payload[this.offset - 2] & 255);
      if(var1 > 32767) {
         var1 -= 65536;
      }

      return var1;
   }

   @ObfuscatedName("bh")
   @ObfuscatedSignature(
      signature = "(B)I",
      garbageValue = "10"
   )
   public int method5309() {
      this.offset += 2;
      return ((this.payload[this.offset - 1] & 255) << 8) + (this.payload[this.offset - 2] & 255);
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "2145981094"
   )
   public void writeMedium(int var1) {
      this.payload[++this.offset - 1] = (byte)(var1 >> 16);
      this.payload[++this.offset - 1] = (byte)(var1 >> 8);
      this.payload[++this.offset - 1] = (byte)var1;
   }

   @ObfuscatedName("bn")
   @ObfuscatedSignature(
      signature = "(I)B",
      garbageValue = "-1909504969"
   )
   public byte method5120() {
      return (byte)(128 - this.payload[++this.offset - 1]);
   }

   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "1964661825"
   )
   public int method5099() {
      int var1 = this.payload[this.offset] & 255;
      return var1 < 128?this.readUnsignedByte() - 64:this.readUnsignedShort() - 49152;
   }

   @ObfuscatedName("bb")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "430828356"
   )
   public void method5122(int var1) {
      this.payload[++this.offset - 1] = (byte)(var1 >> 8);
      this.payload[++this.offset - 1] = (byte)(var1 + 128);
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/CharSequence;I)V",
      garbageValue = "1898324738"
   )
   public void method5260(CharSequence var1) {
      int var3 = var1.length();
      int var4 = 0;

      for(int var5 = 0; var5 < var3; ++var5) {
         char var6 = var1.charAt(var5);
         if(var6 <= 127) {
            ++var4;
         } else if(var6 <= 2047) {
            var4 += 2;
         } else {
            var4 += 3;
         }
      }

      this.payload[++this.offset - 1] = 0;
      this.method5136(var4);
      this.offset += Signlink.method5843(this.payload, this.offset, var1);
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "1998664869"
   )
   public void method5084(int var1) {
      if(var1 >= 0 && var1 < 128) {
         this.writeByte(var1);
      } else if(var1 >= 0 && var1 < 32768) {
         this.writeShort(var1 + 32768);
      } else {
         throw new IllegalArgumentException();
      }
   }

   @ObfuscatedName("bm")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "321421287"
   )
   public int method5133() {
      this.offset += 4;
      return ((this.payload[this.offset - 2] & 255) << 24) + ((this.payload[this.offset - 4] & 255) << 8) + (this.payload[this.offset - 3] & 255) + ((this.payload[this.offset - 1] & 255) << 16);
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;I)V",
      garbageValue = "-1722297640"
   )
   public void writeString(String var1) {
      int var2 = var1.indexOf(0);
      if(var2 >= 0) {
         throw new IllegalArgumentException("");
      } else {
         this.offset += Varbit.method936(var1, 0, var1.length(), this.payload, this.offset);
         this.payload[++this.offset - 1] = 0;
      }
   }

   @ObfuscatedName("bs")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "-629999810"
   )
   public void method5131(int var1) {
      this.payload[++this.offset - 1] = (byte)(var1 >> 8);
      this.payload[++this.offset - 1] = (byte)var1;
      this.payload[++this.offset - 1] = (byte)(var1 >> 24);
      this.payload[++this.offset - 1] = (byte)(var1 >> 16);
   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      signature = "(B)I",
      garbageValue = "33"
   )
   public int method5269() {
      int var1 = this.payload[this.offset] & 255;
      return var1 < 128?this.readUnsignedByte():this.readUnsignedShort() - 32768;
   }

   @ObfuscatedName("ae")
   @ObfuscatedSignature(
      signature = "(B)J",
      garbageValue = "2"
   )
   public long method5299() {
      long var1 = (long)this.readInt() & 4294967295L;
      long var3 = (long)this.readInt() & 4294967295L;
      return (var1 << 32) + var3;
   }

   @ObfuscatedName("k")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "1476295516"
   )
   public void method5083(int var1) {
      this.payload[this.offset - var1 - 1] = (byte)var1;
   }

   @ObfuscatedName("bz")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "-2043800351"
   )
   public void method5232(int var1) {
      this.payload[++this.offset - 1] = (byte)(0 - var1);
   }

   @ObfuscatedName("bg")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "-1601224719"
   )
   public int method5117() {
      return 128 - this.payload[++this.offset - 1] & 255;
   }

   @ObfuscatedName("bt")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "1030223300"
   )
   public int method5129() {
      this.offset += 3;
      return (this.payload[this.offset - 3] & 255) + ((this.payload[this.offset - 2] & 255) << 8) + ((this.payload[this.offset - 1] & 255) << 16);
   }

   @ObfuscatedName("q")
   public void method5075(long var1) {
      this.payload[++this.offset - 1] = (byte)((int)(var1 >> 56));
      this.payload[++this.offset - 1] = (byte)((int)(var1 >> 48));
      this.payload[++this.offset - 1] = (byte)((int)(var1 >> 40));
      this.payload[++this.offset - 1] = (byte)((int)(var1 >> 32));
      this.payload[++this.offset - 1] = (byte)((int)(var1 >> 24));
      this.payload[++this.offset - 1] = (byte)((int)(var1 >> 16));
      this.payload[++this.offset - 1] = (byte)((int)(var1 >> 8));
      this.payload[++this.offset - 1] = (byte)((int)var1);
   }

   @ObfuscatedName("br")
   @ObfuscatedSignature(
      signature = "(I)B",
      garbageValue = "1597666721"
   )
   public byte method5119() {
      return (byte)(0 - this.payload[++this.offset - 1]);
   }

   @ObfuscatedName("bd")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "2056987270"
   )
   public void method5112(int var1) {
      this.payload[++this.offset - 1] = (byte)(var1 + 128);
   }

   @ObfuscatedName("au")
   @ObfuscatedSignature(
      signature = "(I)Ljava/lang/String;",
      garbageValue = "1888102756"
   )
   public String method5094() {
      if(this.payload[this.offset] == 0) {
         ++this.offset;
         return null;
      } else {
         return this.readString();
      }
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "182121546"
   )
   public void writeByte(int var1) {
      this.payload[++this.offset - 1] = (byte)var1;
   }

   @ObfuscatedName("m")
   public void method5273(long var1) {
      this.payload[++this.offset - 1] = (byte)((int)(var1 >> 40));
      this.payload[++this.offset - 1] = (byte)((int)(var1 >> 32));
      this.payload[++this.offset - 1] = (byte)((int)(var1 >> 24));
      this.payload[++this.offset - 1] = (byte)((int)(var1 >> 16));
      this.payload[++this.offset - 1] = (byte)((int)(var1 >> 8));
      this.payload[++this.offset - 1] = (byte)((int)var1);
   }

   @ObfuscatedName("ba")
   @ObfuscatedSignature(
      signature = "(B)I",
      garbageValue = "53"
   )
   public int method5314() {
      this.offset += 4;
      return (this.payload[this.offset - 4] & 255) + ((this.payload[this.offset - 3] & 255) << 8) + ((this.payload[this.offset - 2] & 255) << 16) + ((this.payload[this.offset - 1] & 255) << 24);
   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "(IB)V",
      garbageValue = "-32"
   )
   public void writeInt(int var1) {
      this.payload[++this.offset - 1] = (byte)(var1 >> 24);
      this.payload[++this.offset - 1] = (byte)(var1 >> 16);
      this.payload[++this.offset - 1] = (byte)(var1 >> 8);
      this.payload[++this.offset - 1] = (byte)var1;
   }

   @ObfuscatedName("b")
   @ObfuscatedSignature(
      signature = "(ZI)V",
      garbageValue = "-1958534509"
   )
   public void method5076(boolean var1) {
      this.writeByte(var1?1:0);
   }

   @ObfuscatedName("cm")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "-753313116"
   )
   public int method5134() {
      this.offset += 4;
      return ((this.payload[this.offset - 1] & 255) << 8) + ((this.payload[this.offset - 4] & 255) << 16) + (this.payload[this.offset - 2] & 255) + ((this.payload[this.offset - 3] & 255) << 24);
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      signature = "(S)Ljava/lang/String;",
      garbageValue = "13308"
   )
   public String readString() {
      int var1 = this.offset;

      while(this.payload[++this.offset - 1] != 0) {
         ;
      }

      int var2 = this.offset - var1 - 1;
      return var2 == 0?"":TradingPost.method1607(this.payload, var1, var2);
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "-2142523386"
   )
   public int method5089() {
      this.offset += 2;
      int var1 = (this.payload[this.offset - 1] & 255) + ((this.payload[this.offset - 2] & 255) << 8);
      if(var1 > 32767) {
         var1 -= 65536;
      }

      return var1;
   }

   @ObfuscatedName("bo")
   @ObfuscatedSignature(
      signature = "(II)I",
      garbageValue = "-1314528882"
   )
   public int method5110(int var1) {
      int var2 = class78.method1072(this.payload, var1, this.offset);
      this.writeInt(var2);
      return var2;
   }

   @ObfuscatedName("o")
   @ObfuscatedSignature(
      signature = "([BIII)V",
      garbageValue = "-1865782395"
   )
   public void method5080(byte[] var1, int var2, int var3) {
      for(int var4 = var2; var4 < var3 + var2; ++var4) {
         this.payload[++this.offset - 1] = var1[var4];
      }

   }

   @ObfuscatedName("bp")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "1278083524"
   )
   public int method5115() {
      return this.payload[++this.offset - 1] - 128 & 255;
   }

   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      signature = "([BIII)V",
      garbageValue = "-870605539"
   )
   public void method5098(byte[] var1, int var2, int var3) {
      for(int var4 = var2; var4 < var3 + var2; ++var4) {
         var1[var4] = this.payload[++this.offset - 1];
      }

   }

   @ObfuscatedName("av")
   @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "1869007682"
   )
   public boolean method5093() {
      return (this.readUnsignedByte() & 1) == 1;
   }

   @ObfuscatedName("bc")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "-2131355083"
   )
   public void method5130(int var1) {
      this.payload[++this.offset - 1] = (byte)var1;
      this.payload[++this.offset - 1] = (byte)(var1 >> 8);
      this.payload[++this.offset - 1] = (byte)(var1 >> 16);
      this.payload[++this.offset - 1] = (byte)(var1 >> 24);
   }

   @ObfuscatedName("bq")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "1359326700"
   )
   public int method5281() {
      this.offset += 2;
      return ((this.payload[this.offset - 1] & 255) << 8) + (this.payload[this.offset - 2] - 128 & 255);
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "323936680"
   )
   public void method5136(int var1) {
      if((var1 & -128) != 0) {
         if((var1 & -16384) != 0) {
            if((var1 & -2097152) != 0) {
               if((var1 & -268435456) != 0) {
                  this.writeByte(var1 >>> 28 | 128);
               }

               this.writeByte(var1 >>> 21 | 128);
            }

            this.writeByte(var1 >>> 14 | 128);
         }

         this.writeByte(var1 >>> 7 | 128);
      }

      this.writeByte(var1 & 127);
   }

   @ObfuscatedName("bk")
   @ObfuscatedSignature(
      signature = "(B)B",
      garbageValue = "28"
   )
   public byte method5118() {
      return (byte)(this.payload[++this.offset - 1] - 128);
   }

   @ObfuscatedName("t")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;I)V",
      garbageValue = "-997423168"
   )
   public void writeJAGString(String var1) {
      int var2 = var1.indexOf(0);
      if(var2 >= 0) {
         throw new IllegalArgumentException("");
      } else {
         this.payload[++this.offset - 1] = 0;
         this.offset += Varbit.method936(var1, 0, var1.length(), this.payload, this.offset);
         this.payload[++this.offset - 1] = 0;
      }
   }

   @ObfuscatedName("ah")
   @ObfuscatedSignature(
      signature = "(B)I",
      garbageValue = "16"
   )
   public int readUnsignedShort() {
      this.offset += 2;
      return (this.payload[this.offset - 1] & 255) + ((this.payload[this.offset - 2] & 255) << 8);
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      signature = "(B)I",
      garbageValue = "2"
   )
   public int method5090() {
      this.offset += 3;
      return ((this.payload[this.offset - 3] & 255) << 16) + (this.payload[this.offset - 1] & 255) + ((this.payload[this.offset - 2] & 255) << 8);
   }

   public byte[] getPayload() {
      return this.payload;
   }

   public int getOffset() {
      return this.offset;
   }

   @ObfuscatedName("be")
   @ObfuscatedSignature(
      signature = "(S)Z",
      garbageValue = "5766"
   )
   public boolean method5111() {
      this.offset -= 4;
      int var1 = class78.method1072(this.payload, 0, this.offset);
      int var2 = this.readInt();
      return var1 == var2;
   }

   @ObfuscatedName("bv")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "2103175908"
   )
   public int readUnsignedByteC() {
      return 0 - this.payload[++this.offset - 1] & 255;
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "2102302960"
   )
   public int readInt() {
      this.offset += 4;
      return ((this.payload[this.offset - 3] & 255) << 16) + (this.payload[this.offset - 1] & 255) + ((this.payload[this.offset - 2] & 255) << 8) + ((this.payload[this.offset - 4] & 255) << 24);
   }

   @ObfuscatedName("y")
   @ObfuscatedSignature(
      signature = "(IB)V",
      garbageValue = "34"
   )
   public void method5082(int var1) {
      this.payload[this.offset - var1 - 2] = (byte)(var1 >> 8);
      this.payload[this.offset - var1 - 1] = (byte)var1;
   }

   @ObfuscatedName("am")
   @ObfuscatedSignature(
      signature = "([IIIB)V",
      garbageValue = "-112"
   )
   public void method5108(int[] var1, int var2, int var3) {
      int var4 = this.offset;
      this.offset = var2;
      int var5 = (var3 - var2) / 8;

      for(int var6 = 0; var6 < var5; ++var6) {
         int var7 = this.readInt();
         int var8 = this.readInt();
         int var9 = -957401312;
         int var10 = -1640531527;

         for(int var11 = 32; var11-- > 0; var7 -= var8 + (var8 << 4 ^ var8 >>> 5) ^ var9 + var1[var9 & 3]) {
            var8 -= var7 + (var7 << 4 ^ var7 >>> 5) ^ var1[var9 >>> 11 & 3] + var9;
            var9 -= var10;
         }

         this.offset -= 8;
         this.writeInt(var7);
         this.writeInt(var8);
      }

      this.offset = var4;
   }

   @ObfuscatedName("bf")
   @ObfuscatedSignature(
      signature = "(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V",
      garbageValue = "-405190137"
   )
   public void method5109(BigInteger var1, BigInteger var2) {
      int var3 = this.offset;
      this.offset = 0;
      byte[] var4 = new byte[var3];
      this.method5098(var4, 0, var3);
      BigInteger var5 = new BigInteger(var4);
      BigInteger var6 = var5.modPow(var1, var2);
      byte[] var7 = var6.toByteArray();
      this.offset = 0;
      this.writeShort(var7.length);
      this.method5080(var7, 0, var7.length);
   }

   @ObfuscatedName("as")
   @ObfuscatedSignature(
      signature = "(I)Ljava/lang/String;",
      garbageValue = "1995630919"
   )
   public String method5096() {
      byte var1 = this.payload[++this.offset - 1];
      if(var1 != 0) {
         throw new IllegalStateException("");
      } else {
         int var2 = this.offset;

         while(this.payload[++this.offset - 1] != 0) {
            ;
         }

         int var3 = this.offset - var2 - 1;
         return var3 == 0?"":TradingPost.method1607(this.payload, var2, var3);
      }
   }

   @ObfuscatedName("ax")
   @ObfuscatedSignature(
      signature = "([II)V",
      garbageValue = "-1692260887"
   )
   public void method5105(int[] var1) {
      int var2 = this.offset / 8;
      this.offset = 0;

      for(int var3 = 0; var3 < var2; ++var3) {
         int var4 = this.readInt();
         int var5 = this.readInt();
         int var6 = 0;
         int var7 = -1640531527;

         for(int var8 = 32; var8-- > 0; var5 += var4 + (var4 << 4 ^ var4 >>> 5) ^ var1[var6 >>> 11 & 3] + var6) {
            var4 += var5 + (var5 << 4 ^ var5 >>> 5) ^ var6 + var1[var6 & 3];
            var6 += var7;
         }

         this.offset -= 8;
         this.writeInt(var4);
         this.writeInt(var5);
      }

   }

   @ObfuscatedName("ch")
   @ObfuscatedSignature(
      signature = "([BIII)V",
      garbageValue = "-2071710239"
   )
   public void method5135(byte[] var1, int var2, int var3) {
      for(int var4 = var2; var4 < var3 + var2; ++var4) {
         var1[var4] = (byte)(this.payload[++this.offset - 1] - 128);
      }

   }

   @ObfuscatedName("ar")
   @ObfuscatedSignature(
      signature = "(I)Ljava/lang/String;",
      garbageValue = "427232810"
   )
   public String method5223() {
      byte var1 = this.payload[++this.offset - 1];
      if(var1 != 0) {
         throw new IllegalStateException("");
      } else {
         int var2 = this.method5104();
         if(var2 + this.offset > this.payload.length) {
            throw new IllegalStateException("");
         } else {
            String var3 = WorldMapType3.method601(this.payload, this.offset, var2);
            this.offset += var2;
            return var3;
         }
      }
   }

   @ObfuscatedName("ad")
   @ObfuscatedSignature(
      signature = "(B)I",
      garbageValue = "-95"
   )
   public int method5104() {
      byte var1 = this.payload[++this.offset - 1];

      int var2;
      for(var2 = 0; var1 < 0; var1 = this.payload[++this.offset - 1]) {
         var2 = (var2 | var1 & 127) << 7;
      }

      return var2 | var1;
   }

   @ObfuscatedName("bu")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "-1616531632"
   )
   public int method5142() {
      this.offset += 2;
      int var1 = ((this.payload[this.offset - 1] & 255) << 8) + (this.payload[this.offset - 2] - 128 & 255);
      if(var1 > 32767) {
         var1 -= 65536;
      }

      return var1;
   }

   @ObfuscatedName("aa")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "578503855"
   )
   public int readUnsignedByte() {
      return this.payload[++this.offset - 1] & 255;
   }

   @ObfuscatedName("bx")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "-550957003"
   )
   public void method5132(int var1) {
      this.payload[++this.offset - 1] = (byte)(var1 >> 16);
      this.payload[++this.offset - 1] = (byte)(var1 >> 24);
      this.payload[++this.offset - 1] = (byte)var1;
      this.payload[++this.offset - 1] = (byte)(var1 >> 8);
   }

   @ObfuscatedName("bl")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "-1014162765"
   )
   public void method5121(int var1) {
      this.payload[++this.offset - 1] = (byte)var1;
      this.payload[++this.offset - 1] = (byte)(var1 >> 8);
   }

   @ObfuscatedName("az")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "-2083792238"
   )
   public int method5088() {
      int var1 = 0;

      int var2;
      for(var2 = this.method5269(); var2 == 32767; var2 = this.method5269()) {
         var1 += 32767;
      }

      var1 += var2;
      return var1;
   }

   @ObfuscatedName("bw")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "-1407085161"
   )
   public void method5123(int var1) {
      this.payload[++this.offset - 1] = (byte)(var1 + 128);
      this.payload[++this.offset - 1] = (byte)(var1 >> 8);
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      signature = "([II)V",
      garbageValue = "1749128377"
   )
   public void method5106(int[] var1) {
      int var2 = this.offset / 8;
      this.offset = 0;

      for(int var3 = 0; var3 < var2; ++var3) {
         int var4 = this.readInt();
         int var5 = this.readInt();
         int var6 = -957401312;
         int var7 = -1640531527;

         for(int var8 = 32; var8-- > 0; var4 -= var5 + (var5 << 4 ^ var5 >>> 5) ^ var6 + var1[var6 & 3]) {
            var5 -= var4 + (var4 << 4 ^ var4 >>> 5) ^ var1[var6 >>> 11 & 3] + var6;
            var6 -= var7;
         }

         this.offset -= 8;
         this.writeInt(var4);
         this.writeInt(var5);
      }

   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      signature = "(B)I",
      garbageValue = "-50"
   )
   public int method5102() {
      return this.payload[this.offset] < 0?this.readInt() & Integer.MAX_VALUE:this.readUnsignedShort();
   }

   @ObfuscatedName("bi")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "-1844045753"
   )
   public void method5307(int var1) {
      this.payload[++this.offset - 1] = (byte)(128 - var1);
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "-617620725"
   )
   public void writeShort(int var1) {
      this.payload[++this.offset - 1] = (byte)(var1 >> 8);
      this.payload[++this.offset - 1] = (byte)var1;
   }

   @ObfuscatedName("u")
   @ObfuscatedSignature(
      signature = "(IB)V",
      garbageValue = "93"
   )
   public void method5081(int var1) {
      this.payload[this.offset - var1 - 4] = (byte)(var1 >> 24);
      this.payload[this.offset - var1 - 3] = (byte)(var1 >> 16);
      this.payload[this.offset - var1 - 2] = (byte)(var1 >> 8);
      this.payload[this.offset - var1 - 1] = (byte)var1;
   }

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      signature = "(B)B",
      garbageValue = "107"
   )
   public byte method5230() {
      return this.payload[++this.offset - 1];
   }

   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "-1243549131"
   )
   public int method5287() {
      if(this.payload[this.offset] < 0) {
         return this.readInt() & Integer.MAX_VALUE;
      } else {
         int var1 = this.readUnsignedShort();
         return var1 == 32767?-1:var1;
      }
   }

   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-134910295"
   )
   public void method5069() {
      if(this.payload != null) {
         Tile.method3822(this.payload);
      }

      this.payload = null;
   }

   @ObfuscatedName("bj")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "101346749"
   )
   public int readUnsignedShort128() {
      this.offset += 2;
      return (this.payload[this.offset - 1] - 128 & 255) + ((this.payload[this.offset - 2] & 255) << 8);
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(IZI)Ljava/lang/String;",
      garbageValue = "582940071"
   )
   public static String method5116(int var0, boolean var1) {
      if(var1 && var0 >= 0) {
         int var3 = var0;
         String var2;
         if(var1 && var0 >= 0) {
            int var4 = 2;

            for(int var5 = var0 / 10; var5 != 0; ++var4) {
               var5 /= 10;
            }

            char[] var6 = new char[var4];
            var6[0] = '+';

            for(int var7 = var4 - 1; var7 > 0; --var7) {
               int var8 = var3;
               var3 /= 10;
               int var9 = var8 - var3 * 10;
               if(var9 >= 10) {
                  var6[var7] = (char)(var9 + 87);
               } else {
                  var6[var7] = (char)(var9 + 48);
               }
            }

            var2 = new String(var6);
         } else {
            var2 = Integer.toString(var0, 10);
         }

         return var2;
      } else {
         return Integer.toString(var0);
      }
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      signature = "(ZI)V",
      garbageValue = "1500256916"
   )
   static void method5318(boolean var0) {
      class203.loginMessage1 = "";
      class203.loginMessage2 = "Enter your username & password.";
      class203.loginMessage3 = "";
      class203.loginIndex = 2;
      if(var0) {
         class203.password = "";
      }

      CacheFile.method5601();
      if(client.Login_isUsernameRemembered && class203.username != null && class203.username.length() > 0) {
         class203.currentLoginField = 1;
      } else {
         class203.currentLoginField = 0;
      }

   }
}
