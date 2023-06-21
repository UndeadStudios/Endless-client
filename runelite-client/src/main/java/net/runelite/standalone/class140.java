package net.runelite.standalone;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fi")
public final class class140 extends class323 implements Runnable {
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "Lfn;"
   )
   Task field2073;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = 530912779
   )
   final int field2079;
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = -1735838885
   )
   int field2068;
   @ObfuscatedName("x")
   boolean field2071;
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      intValue = 1012555369
   )
   int field2075;
   @ObfuscatedName("p")
   byte[] field2072;
   @ObfuscatedName("b")
   boolean field2077;
   @ObfuscatedName("a")
   InputStream field2076;
   @ObfuscatedName("n")
   @ObfuscatedGetter(
      intValue = -487671753
   )
   final int field2078;
   @ObfuscatedName("s")
   OutputStream field2069;
   @ObfuscatedName("h")
   @ObfuscatedSignature(
      signature = "Lfo;"
   )
   Signlink field2074;
   @ObfuscatedName("g")
   Socket field2070;

   @ObfuscatedSignature(
      signature = "(Ljava/net/Socket;Lfo;I)V"
   )
   public class140(Socket var1, Signlink var2, int var3) throws IOException {
      this.field2071 = false;
      this.field2075 = 0;
      this.field2068 = 0;
      this.field2077 = false;
      this.field2074 = var2;
      this.field2070 = var1;
      this.field2078 = var3;
      this.field2079 = var3 - 100;
      this.field2070.setSoTimeout(30000);
      this.field2070.setTcpNoDelay(true);
      this.field2070.setReceiveBufferSize(65536);
      this.field2070.setSendBufferSize(65536);
      this.field2076 = this.field2070.getInputStream();
      this.field2069 = this.field2070.getOutputStream();
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "-9"
   )
   public void vmethod6355() {
      if(!this.field2071) {
         synchronized(this) {
            this.field2071 = true;
            this.notifyAll();
         }

         if(this.field2073 != null) {
            while(this.field2073.status == 0) {
               class36.method553(1L);
            }

            if(this.field2073.status == 1) {
               try {
                  ((Thread)this.field2073.value).join();
               } catch (InterruptedException var3) {
                  ;
               }
            }
         }

         this.field2073 = null;
      }
   }

   @ObfuscatedName("k")
   @ObfuscatedSignature(
      signature = "([BIII)V",
      garbageValue = "503954790"
   )
   void method1998(byte[] var1, int var2, int var3) throws IOException {
      if(!this.field2071) {
         if(this.field2077) {
            this.field2077 = false;
            throw new IOException();
         } else {
            if(this.field2072 == null) {
               this.field2072 = new byte[this.field2078];
            }

            synchronized(this) {
               for(int var5 = 0; var5 < var3; ++var5) {
                  this.field2072[this.field2068] = var1[var5 + var2];
                  this.field2068 = (this.field2068 + 1) % this.field2078;
                  if((this.field2075 + this.field2079) % this.field2078 == this.field2068) {
                     throw new IOException();
                  }
               }

               if(this.field2073 == null) {
                  this.field2073 = this.field2074.method5829(this, 3);
               }

               this.notifyAll();
            }
         }
      }
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "([BIIB)I",
      garbageValue = "1"
   )
   public int vmethod6362(byte[] var1, int var2, int var3) throws IOException {
      if(this.field2071) {
         return 0;
      } else {
         int var4;
         int var5;
         for(var4 = var3; var3 > 0; var3 -= var5) {
            var5 = this.field2076.read(var1, var2, var3);
            if(var5 <= 0) {
               throw new EOFException();
            }

            var2 += var5;
         }

         return var4;
      }
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "(II)Z",
      garbageValue = "1647181248"
   )
   public boolean vmethod6354(int var1) throws IOException {
      return this.field2071?false:this.field2076.available() >= var1;
   }

   protected void finalize() {
      this.vmethod6355();
   }

   protected void aak() {
      this.vmethod6355();
   }

   protected void aae() {
      this.vmethod6355();
   }

   protected void aau() {
      this.vmethod6355();
   }

   public void run() {
      try {
         while(true) {
            label84: {
               int var1;
               int var2;
               synchronized(this) {
                  if(this.field2075 == this.field2068) {
                     if(this.field2071) {
                        break label84;
                     }

                     try {
                        this.wait();
                     } catch (InterruptedException var10) {
                        ;
                     }
                  }

                  var2 = this.field2075;
                  if(this.field2068 >= this.field2075) {
                     var1 = this.field2068 - this.field2075;
                  } else {
                     var1 = this.field2078 - this.field2075;
                  }
               }

               if(var1 <= 0) {
                  continue;
               }

               try {
                  this.field2069.write(this.field2072, var2, var1);
               } catch (IOException var9) {
                  this.field2077 = true;
               }

               this.field2075 = (var1 + this.field2075) % this.field2078;

               try {
                  if(this.field2068 == this.field2075) {
                     this.field2069.flush();
                  }
               } catch (IOException var8) {
                  this.field2077 = true;
               }
               continue;
            }

            try {
               if(this.field2076 != null) {
                  this.field2076.close();
               }

               if(this.field2069 != null) {
                  this.field2069.close();
               }

               if(this.field2070 != null) {
                  this.field2070.close();
               }
            } catch (IOException var7) {
               ;
            }

            this.field2072 = null;
            break;
         }
      } catch (Exception var12) {
         VertexNormal.method4110((String)null, var12, (byte)-45);
      }

   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(B)I",
      garbageValue = "0"
   )
   public int vmethod6356() throws IOException {
      return this.field2071?0:this.field2076.available();
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      signature = "([BIII)V",
      garbageValue = "-1892812584"
   )
   public void vmethod6359(byte[] var1, int var2, int var3) throws IOException {
      this.method1998(var1, var2, var3);
   }

   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "-827937127"
   )
   public int vmethod6357() throws IOException {
      return this.field2071?0:this.field2076.read();
   }

   @ObfuscatedName("kw")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;B)V",
      garbageValue = "19"
   )
   static final void method2016(String var0) {
      if(!var0.equals("")) {
         TcpConnectionMessage var1 = class232.method4535(ClientProt.field2297, client.serverConnection.isaac);
         var1.packetBuffer.writeByte(OwnWorldComparator.method73(var0));
         var1.packetBuffer.writeString(var0);
         client.serverConnection.method18(var1);
      }
   }

   @ObfuscatedName("r")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;I)I",
      garbageValue = "-2141403474"
   )
   public static int method2018(String var0) {
      return var0.length() + 2;
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(IIIIIIB)I",
      garbageValue = "59"
   )
   public static int method2017(int var0, int var1, int var2, int var3, int var4, int var5) {
      if((var5 & 1) == 1) {
         int var6 = var3;
         var3 = var4;
         var4 = var6;
      }

      var2 &= 3;
      return var2 == 0?var1:(var2 == 1?7 - var0 - (var3 - 1):(var2 == 2?7 - var1 - (var4 - 1):var0));
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "(Lll;B)I",
      garbageValue = "-99"
   )
   public static final int method2019(JagexLoginType var0) {
      if(var0 == null) {
         return 12;
      } else {
         switch(var0.field4011) {
         case 1:
            return 20;
         default:
            return 12;
         }
      }
   }
}
