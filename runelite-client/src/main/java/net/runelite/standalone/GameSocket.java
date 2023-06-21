package net.runelite.standalone;

import java.io.IOException;
import java.io.OutputStream;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fx")
public class GameSocket implements Runnable {
   @ObfuscatedName("qg")
   @ObfuscatedGetter(
      intValue = -881277661
   )
   static int field2100;
   @ObfuscatedName("ex")
   @ObfuscatedGetter(
      intValue = -1114384081
   )
   static int myWorldPort;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = -946154325
   )
   int field2096;
   @ObfuscatedName("x")
   byte[] field2091;
   @ObfuscatedName("m")
   boolean field2098;
   @ObfuscatedName("p")
   IOException field2094;
   @ObfuscatedName("a")
   Thread field2095;
   @ObfuscatedName("s")
   OutputStream field2092;
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      intValue = -1978751501
   )
   int field2093;
   @ObfuscatedName("g")
   @ObfuscatedGetter(
      intValue = 1074904079
   )
   int field2097;

   GameSocket(OutputStream var1, int var2) {
      this.field2093 = 0;
      this.field2096 = 0;
      this.field2092 = var1;
      this.field2097 = var2 + 1;
      this.field2091 = new byte[this.field2097];
      this.field2095 = new Thread(this);
      this.field2095.setDaemon(true);
      this.field2095.start();
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "(B)Z",
      garbageValue = "3"
   )
   boolean method1476() {
      if(this.field2098) {
         try {
            this.field2092.close();
            if(this.field2094 == null) {
               this.field2094 = new IOException("");
            }
         } catch (IOException var2) {
            if(this.field2094 == null) {
               this.field2094 = new IOException(var2);
            }
         }

         return true;
      } else {
         return false;
      }
   }

   public void run() {
      do {
         int var1;
         synchronized(this) {
            while(true) {
               if(this.field2094 != null) {
                  return;
               }

               if(this.field2093 <= this.field2096) {
                  var1 = this.field2096 - this.field2093;
               } else {
                  var1 = this.field2097 - this.field2093 + this.field2096;
               }

               if(var1 > 0) {
                  break;
               }

               try {
                  this.field2092.flush();
               } catch (IOException var11) {
                  this.field2094 = var11;
                  return;
               }

               if(this.method1476()) {
                  return;
               }

               try {
                  this.wait();
               } catch (InterruptedException var12) {
                  ;
               }
            }
         }

         try {
            if(var1 + this.field2093 <= this.field2097) {
               this.field2092.write(this.field2091, this.field2093, var1);
            } else {
               int var7 = this.field2097 - this.field2093;
               this.field2092.write(this.field2091, this.field2093, var7);
               this.field2092.write(this.field2091, 0, var1 - var7);
            }
         } catch (IOException var10) {
            IOException var2 = var10;
            synchronized(this) {
               this.field2094 = var2;
               return;
            }
         }

         synchronized(this) {
            this.field2093 = (var1 + this.field2093) % this.field2097;
         }
      } while(!this.method1476());

   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "([BIIB)V",
      garbageValue = "70"
   )
   void method1466(byte[] var1, int var2, int var3) throws IOException {
      if(var3 >= 0 && var2 >= 0 && var3 + var2 <= var1.length) {
         synchronized(this) {
            if(this.field2094 != null) {
               throw new IOException(this.field2094.toString());
            } else {
               int var5;
               if(this.field2093 <= this.field2096) {
                  var5 = this.field2097 - this.field2096 + this.field2093 - 1;
               } else {
                  var5 = this.field2093 - this.field2096 - 1;
               }

               if(var5 < var3) {
                  throw new IOException("");
               } else {
                  if(var3 + this.field2096 <= this.field2097) {
                     System.arraycopy(var1, var2, this.field2091, this.field2096, var3);
                  } else {
                     int var6 = this.field2097 - this.field2096;
                     System.arraycopy(var1, var2, this.field2091, this.field2096, var6);
                     System.arraycopy(var1, var6 + var2, this.field2091, 0, var3 - var6);
                  }

                  this.field2096 = (var3 + this.field2096) % this.field2097;
                  this.notifyAll();
               }
            }
         }
      } else {
         throw new IOException();
      }
   }

   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-619545803"
   )
   void method1467() {
      synchronized(this) {
         this.field2098 = true;
         this.notifyAll();
      }

      try {
         this.field2095.join();
      } catch (InterruptedException var3) {
         ;
      }

   }

   @ObfuscatedName("ar")
   @ObfuscatedSignature(
      signature = "(ILcs;ZI)I",
      garbageValue = "-882448821"
   )
   static int method1477(int var0, class314 var1, boolean var2) {
      int var3;
      if(var0 == 5504) {
         class281.intStackSize -= 2;
         var3 = class281.intStack[class281.intStackSize];
         int var4 = class281.intStack[class281.intStackSize + 1];
         if(!client.field893) {
            client.cameraPitchTarget = var3;
            client.onCameraPitchTargetChanged(-1);
            client.mapAngle = var4;
         }

         return 1;
      } else if(var0 == 5505) {
         class281.intStack[++class281.intStackSize - 1] = client.cameraPitchTarget;
         return 1;
      } else if(var0 == 5506) {
         class281.intStack[++class281.intStackSize - 1] = client.mapAngle;
         return 1;
      } else if(var0 == 5530) {
         var3 = class281.intStack[--class281.intStackSize];
         if(var3 < 0) {
            var3 = 0;
         }

         client.field724 = var3;
         return 1;
      } else if(var0 == 5531) {
         class281.intStack[++class281.intStackSize - 1] = client.field724;
         return 1;
      } else {
         return 2;
      }
   }
}
