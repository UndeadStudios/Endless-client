package net.runelite.standalone;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fj")
public class class171 implements Runnable {
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = 340283105
   )
   int field2014;
   @ObfuscatedName("x")
   byte[] field2012;
   @ObfuscatedName("p")
   IOException field2009;
   @ObfuscatedName("a")
   Thread field2017;
   @ObfuscatedName("s")
   InputStream field2010;
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      intValue = 1593898169
   )
   int field2013;
   @ObfuscatedName("g")
   @ObfuscatedGetter(
      intValue = 1017796057
   )
   int field2011;

   class171(InputStream var1, int var2) {
      this.field2013 = 0;
      this.field2014 = 0;
      this.field2010 = var1;
      this.field2011 = var2 + 1;
      this.field2012 = new byte[this.field2011];
      this.field2017 = new Thread(this);
      this.field2017.setDaemon(true);
      this.field2017.start();
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "([BIII)I",
      garbageValue = "-600194248"
   )
   int method2689(byte[] var1, int var2, int var3) throws IOException {
      if(var3 >= 0 && var2 >= 0 && var3 + var2 <= var1.length) {
         synchronized(this) {
            int var5;
            if(this.field2013 <= this.field2014) {
               var5 = this.field2014 - this.field2013;
            } else {
               var5 = this.field2011 - this.field2013 + this.field2014;
            }

            if(var3 > var5) {
               var3 = var5;
            }

            if(var3 == 0 && this.field2009 != null) {
               throw new IOException(this.field2009.toString());
            } else {
               if(var3 + this.field2013 <= this.field2011) {
                  System.arraycopy(this.field2012, this.field2013, var1, var2, var3);
               } else {
                  int var6 = this.field2011 - this.field2013;
                  System.arraycopy(this.field2012, this.field2013, var1, var2, var6);
                  System.arraycopy(this.field2012, 0, var1, var6 + var2, var3 - var6);
               }

               this.field2013 = (var3 + this.field2013) % this.field2011;
               this.notifyAll();
               return var3;
            }
         }
      } else {
         throw new IOException();
      }
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "(II)Z",
      garbageValue = "-1899763683"
   )
   boolean method2679(int var1) throws IOException {
      if(var1 == 0) {
         return true;
      } else if(var1 > 0 && var1 < this.field2011) {
         synchronized(this) {
            int var3;
            if(this.field2013 <= this.field2014) {
               var3 = this.field2014 - this.field2013;
            } else {
               var3 = this.field2011 - this.field2013 + this.field2014;
            }

            if(var3 < var1) {
               if(this.field2009 != null) {
                  throw new IOException(this.field2009.toString());
               } else {
                  this.notifyAll();
                  return false;
               }
            } else {
               return true;
            }
         }
      } else {
         throw new IOException();
      }
   }

   public void run() {
      while(true) {
         int var1;
         synchronized(this) {
            while(true) {
               if(this.field2009 != null) {
                  return;
               }

               if(this.field2013 == 0) {
                  var1 = this.field2011 - this.field2014 - 1;
               } else if(this.field2013 <= this.field2014) {
                  var1 = this.field2011 - this.field2014;
               } else {
                  var1 = this.field2013 - this.field2014 - 1;
               }

               if(var1 > 0) {
                  break;
               }

               try {
                  this.wait();
               } catch (InterruptedException var10) {
                  ;
               }
            }
         }

         int var7;
         try {
            var7 = this.field2010.read(this.field2012, this.field2014, var1);
            if(var7 == -1) {
               throw new EOFException();
            }
         } catch (IOException var11) {
            IOException var3 = var11;
            synchronized(this) {
               this.field2009 = var3;
               return;
            }
         }

         synchronized(this) {
            this.field2014 = (var7 + this.field2014) % this.field2011;
         }
      }
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(B)I",
      garbageValue = "1"
   )
   int method2678() throws IOException {
      synchronized(this) {
         int var2;
         if(this.field2013 <= this.field2014) {
            var2 = this.field2014 - this.field2013;
         } else {
            var2 = this.field2011 - this.field2013 + this.field2014;
         }

         if(var2 <= 0 && this.field2009 != null) {
            throw new IOException(this.field2009.toString());
         } else {
            this.notifyAll();
            return var2;
         }
      }
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "0"
   )
   void method2682() {
      synchronized(this) {
         if(this.field2009 == null) {
            this.field2009 = new IOException("");
         }

         this.notifyAll();
      }

      try {
         this.field2017.join();
      } catch (InterruptedException var3) {
         ;
      }

   }

   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "(B)I",
      garbageValue = "-16"
   )
   int method2680() throws IOException {
      synchronized(this) {
         if(this.field2014 == this.field2013) {
            if(this.field2009 != null) {
               throw new IOException(this.field2009.toString());
            } else {
               return -1;
            }
         } else {
            int var2 = this.field2012[this.field2013] & 255;
            this.field2013 = (this.field2013 + 1) % this.field2011;
            this.notifyAll();
            return var2;
         }
      }
   }

   @ObfuscatedName("ir")
   @ObfuscatedSignature(
      signature = "(IIB)V",
      garbageValue = "34"
   )
   static void method2694(int var0, int var1) {
      TcpConnectionMessage var2 = class232.method4535(ClientProt.field2257, client.serverConnection.isaac);
      var2.packetBuffer.method5132(var0);
      var2.packetBuffer.method5122(var1);
      client.serverConnection.method18(var2);
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "(Ljava/io/File;Ljava/io/File;I)V",
      garbageValue = "1097156357"
   )
   public static void method2692(File var0, File var1) {
      try {
         FileOnDisk var2 = new FileOnDisk(class75.cacheLocator, "rw", 10000L);
         Packet var3 = new Packet(500);
         var3.writeByte(3);
         var3.writeByte(var1 != null?1:0);
         var3.method5260(var0.getPath());
         if(var1 != null) {
            var3.method5260("");
         }

         var2.method5050(var3.payload, 0, var3.offset);
         var2.method5051();
      } catch (IOException var4) {
         var4.printStackTrace();
      }

   }

   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "(IIIIIIB)I",
      garbageValue = "-32"
   )
   public static int method2693(int var0, int var1, int var2, int var3, int var4, int var5) {
      if((var5 & 1) == 1) {
         int var6 = var3;
         var3 = var4;
         var4 = var6;
      }

      var2 &= 3;
      return var2 == 0?var0:(var2 == 1?var1:(var2 == 2?7 - var0 - (var3 - 1):7 - var1 - (var4 - 1)));
   }
}
