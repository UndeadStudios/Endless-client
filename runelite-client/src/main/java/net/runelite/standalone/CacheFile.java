package net.runelite.standalone;

import java.io.EOFException;
import java.io.IOException;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dx")
public class CacheFile {
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      longValue = 4118804273345043159L
   )
   long field1509;
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      longValue = 8900813318100807425L
   )
   long length;
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = 1529466497
   )
   int field1506;
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      longValue = -7495971393692368667L
   )
   long position;
   @ObfuscatedName("p")
   @ObfuscatedGetter(
      intValue = 1377119707
   )
   int field1510;
   @ObfuscatedName("b")
   @ObfuscatedGetter(
      longValue = 7625560096165464275L
   )
   long capacity;
   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "Lda;"
   )
   FileOnDisk accessFile;
   @ObfuscatedName("n")
   @ObfuscatedGetter(
      longValue = -2543243651016552385L
   )
   long field1505;
   @ObfuscatedName("s")
   byte[] readPayload;
   @ObfuscatedName("h")
   byte[] writePayload;
   @ObfuscatedName("g")
   @ObfuscatedGetter(
      longValue = 3783110478113031363L
   )
   long field1514;

   @ObfuscatedSignature(
      signature = "(Lda;II)V"
   )
   public CacheFile(FileOnDisk var1, int var2, int var3) throws IOException {
      this.field1514 = -1L;
      this.field1509 = -1L;
      this.field1510 = 0;
      this.accessFile = var1;
      this.capacity = this.length = var1.method5053();
      this.readPayload = new byte[var2];
      this.writePayload = new byte[var3];
      this.position = 0L;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "964125546"
   )
   void method5579() throws IOException {
      this.field1506 = 0;
      if(this.position != this.field1505) {
         this.accessFile.method5049(this.position);
         this.field1505 = this.position;
      }

      int var1;
      for(this.field1514 = this.position; this.field1506 < this.readPayload.length; this.field1506 += var1) {
         var1 = this.accessFile.method5054(this.readPayload, this.field1506, this.readPayload.length - this.field1506);
         if(var1 == -1) {
            break;
         }

         this.field1505 += (long)var1;
      }

   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "([BI)V",
      garbageValue = "1946104322"
   )
   public void method5577(byte[] var1) throws IOException {
      this.method5576(var1, 0, var1.length);
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "15"
   )
   void method5581() throws IOException {
      if(-1L != this.field1509) {
         if(this.field1509 != this.field1505) {
            this.accessFile.method5049(this.field1509);
            this.field1505 = this.field1509;
         }

         this.accessFile.method5050(this.writePayload, 0, this.field1510);
         this.field1505 += 1377119707L * (long)(this.field1510 * 1255999059);
         if(this.field1505 > this.length) {
            this.length = this.field1505;
         }

         long var1 = -1L;
         long var3 = -1L;
         if(this.field1509 >= this.field1514 && this.field1509 < this.field1514 + (long)this.field1506) {
            var1 = this.field1509;
         } else if(this.field1514 >= this.field1509 && this.field1514 < (long)this.field1510 + this.field1509) {
            var1 = this.field1514;
         }

         if((long)this.field1510 + this.field1509 > this.field1514 && this.field1509 + (long)this.field1510 <= (long)this.field1506 + this.field1514) {
            var3 = (long)this.field1510 + this.field1509;
         } else if((long)this.field1506 + this.field1514 > this.field1509 && (long)this.field1506 + this.field1514 <= this.field1509 + (long)this.field1510) {
            var3 = this.field1514 + (long)this.field1506;
         }

         if(var1 > -1L && var3 > var1) {
            int var5 = (int)(var3 - var1);
            System.arraycopy(this.writePayload, (int)(var1 - this.field1509), this.readPayload, (int)(var1 - this.field1514), var5);
         }

         this.field1509 = -1L;
         this.field1510 = 0;
      }

   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "([BIIB)V",
      garbageValue = "-47"
   )
   public void method5583(byte[] var1, int var2, int var3) throws IOException {
      try {
         if(this.position + (long)var3 > this.capacity) {
            this.capacity = (long)var3 + this.position;
         }

         if(this.field1509 != -1L && (this.position < this.field1509 || this.position > this.field1509 + (long)this.field1510)) {
            this.method5581();
         }

         if(this.field1509 != -1L && this.position + (long)var3 > (long)this.writePayload.length + this.field1509) {
            int var4 = (int)((long)this.writePayload.length - (this.position - this.field1509));
            System.arraycopy(var1, var2, this.writePayload, (int)(this.position - this.field1509), var4);
            this.position += (long)var4;
            var2 += var4;
            var3 -= var4;
            this.field1510 = this.writePayload.length;
            this.method5581();
         }

         if(var3 <= this.writePayload.length) {
            if(var3 > 0) {
               if(-1L == this.field1509) {
                  this.field1509 = this.position;
               }

               System.arraycopy(var1, var2, this.writePayload, (int)(this.position - this.field1509), var3);
               this.position += (long)var3;
               if(this.position - this.field1509 > (long)this.field1510) {
                  this.field1510 = (int)(this.position - this.field1509);
               }

            }
         } else {
            if(this.position != this.field1505) {
               this.accessFile.method5049(this.position);
               this.field1505 = this.position;
            }

            this.accessFile.method5050(var1, var2, var3);
            this.field1505 += (long)var3;
            if(this.field1505 > this.length) {
               this.length = this.field1505;
            }

            long var9 = -1L;
            long var6 = -1L;
            if(this.position >= this.field1514 && this.position < this.field1514 + (long)this.field1506) {
               var9 = this.position;
            } else if(this.field1514 >= this.position && this.field1514 < (long)var3 + this.position) {
               var9 = this.field1514;
            }

            if(this.position + (long)var3 > this.field1514 && this.position + (long)var3 <= this.field1514 + (long)this.field1506) {
               var6 = (long)var3 + this.position;
            } else if((long)this.field1506 + this.field1514 > this.position && this.field1514 + (long)this.field1506 <= (long)var3 + this.position) {
               var6 = this.field1514 + (long)this.field1506;
            }

            if(var9 > -1L && var6 > var9) {
               int var8 = (int)(var6 - var9);
               System.arraycopy(var1, (int)((long)var2 + var9 - this.position), this.readPayload, (int)(var9 - this.field1514), var8);
            }

            this.position += (long)var3;
         }
      } catch (IOException var12) {
         this.field1505 = -1L;
         throw var12;
      }
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "1028754693"
   )
   public void method5574() throws IOException {
      this.method5581();
      this.accessFile.method5051();
   }

   @ObfuscatedName("s")
   public void method5575(long var1) throws IOException {
      if(var1 < 0L) {
         throw new IOException("");
      } else {
         this.position = var1;
      }
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      signature = "([BIIB)V",
      garbageValue = "-42"
   )
   public void method5576(byte[] var1, int var2, int var3) throws IOException {
      try {
         if(var3 + var2 > var1.length) {
            throw new ArrayIndexOutOfBoundsException(var3 + var2 - var1.length);
         }

         if(-1L != this.field1509 && this.position >= this.field1509 && this.position + (long)var3 <= (long)this.field1510 + this.field1509) {
            System.arraycopy(this.writePayload, (int)(this.position - this.field1509), var1, var2, var3);
            this.position += (long)var3;
            return;
         }

         long var4 = this.position;
         int var7 = var3;
         int var8;
         if(this.position >= this.field1514 && this.position < this.field1514 + (long)this.field1506) {
            var8 = (int)((long)this.field1506 - (this.position - this.field1514));
            if(var8 > var3) {
               var8 = var3;
            }

            System.arraycopy(this.readPayload, (int)(this.position - this.field1514), var1, var2, var8);
            this.position += (long)var8;
            var2 += var8;
            var3 -= var8;
         }

         if(var3 > this.readPayload.length) {
            this.accessFile.method5049(this.position);

            for(this.field1505 = this.position; var3 > 0; var3 -= var8) {
               var8 = this.accessFile.method5054(var1, var2, var3);
               if(var8 == -1) {
                  break;
               }

               this.field1505 += (long)var8;
               this.position += (long)var8;
               var2 += var8;
            }
         } else if(var3 > 0) {
            this.method5579();
            var8 = var3;
            if(var3 > this.field1506) {
               var8 = this.field1506;
            }

            System.arraycopy(this.readPayload, 0, var1, var2, var8);
            var2 += var8;
            var3 -= var8;
            this.position += (long)var8;
         }

         if(this.field1509 != -1L) {
            if(this.field1509 > this.position && var3 > 0) {
               var8 = var2 + (int)(this.field1509 - this.position);
               if(var8 > var3 + var2) {
                  var8 = var3 + var2;
               }

               while(var2 < var8) {
                  var1[var2++] = 0;
                  --var3;
                  ++this.position;
               }
            }

            long var13 = -1L;
            long var10 = -1L;
            if(this.field1509 >= var4 && this.field1509 < (long)var7 + var4) {
               var13 = this.field1509;
            } else if(var4 >= this.field1509 && var4 < this.field1509 + (long)this.field1510) {
               var13 = var4;
            }

            if(this.field1509 + (long)this.field1510 > var4 && (long)this.field1510 + this.field1509 <= (long)var7 + var4) {
               var10 = this.field1509 + (long)this.field1510;
            } else if(var4 + (long)var7 > this.field1509 && (long)var7 + var4 <= this.field1509 + (long)this.field1510) {
               var10 = (long)var7 + var4;
            }

            if(var13 > -1L && var10 > var13) {
               int var12 = (int)(var10 - var13);
               System.arraycopy(this.writePayload, (int)(var13 - this.field1509), var1, (int)(var13 - var4) + var2, var12);
               if(var10 > this.position) {
                  var3 = (int)((long)var3 - (var10 - this.position));
                  this.position = var10;
               }
            }
         }
      } catch (IOException var16) {
         this.field1505 = -1L;
         throw var16;
      }

      if(var3 > 0) {
         throw new EOFException();
      }
   }

   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "(S)J",
      garbageValue = "2725"
   )
   public long method5604() {
      return this.capacity;
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(II)I",
      garbageValue = "-1459426456"
   )
   public static int method5580(int var0) {
      return UrlRequester.method5572(class47.field1740[var0]);
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(Lgx;J)V"
   )
   static void method5578(Packet var0, long var1) {
      var1 /= 10L;
      if(var1 < 0L) {
         var1 = 0L;
      } else if(var1 > 65535L) {
         var1 = 65535L;
      }

      var0.writeShort((int)var1);
   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "-1976780537"
   )
   public static boolean method5602() {
      return class262.field2557 != 0?true:class3.field1860.method309();
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "(II)I",
      garbageValue = "137846791"
   )
   public static int method5603(int var0) {
      return var0 >> 11 & 63;
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "(IIS)I",
      garbageValue = "1763"
   )
   static int method5605(int var0, int var1) {
      ItemContainer var2 = (ItemContainer)ItemContainer.itemContainers.method6335((long)var0);
      return var2 == null?-1:(var1 >= 0 && var1 < var2.itemIds.length?var2.itemIds[var1]:-1);
   }

   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "(Liz;Liz;III)Lkt;",
      garbageValue = "1152119571"
   )
   public static Font method5606(Js5Index var0, Js5Index var1, int var2, int var3) {
      return !class205.method4006(var0, var2, var3)?null:class288.method5947(var1.method4115(var2, var3, 1600198682));
   }

   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1550843987"
   )
   static void method5601() {
      if(class203.username == null || class203.username.length() <= 0) {
         if(class312.options.rememberedUsername != null) {
            class203.username = class312.options.rememberedUsername;
            client.onUsernameChanged(-1);
            client.Login_isUsernameRemembered = true;
         } else {
            client.Login_isUsernameRemembered = false;
         }

      }
   }
}
