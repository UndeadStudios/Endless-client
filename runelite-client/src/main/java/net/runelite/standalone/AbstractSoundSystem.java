package net.runelite.standalone;

import java.util.concurrent.ScheduledExecutorService;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cz")
public class AbstractSoundSystem {
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = 1314449701
   )
   static int field1404;
   @ObfuscatedName("m")
   static ScheduledExecutorService field1386;
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "Ldo;"
   )
   TaskDataNode field1389;
   @ObfuscatedName("v")
   @ObfuscatedGetter(
      intValue = 1555639263
   )
   int field1394;
   @ObfuscatedName("k")
   @ObfuscatedGetter(
      intValue = -1959673417
   )
   int field1400;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = 1059470161
   )
   int field1396;
   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      signature = "[Ldo;"
   )
   TaskDataNode[] field1387;
   @ObfuscatedName("o")
   @ObfuscatedGetter(
      intValue = 1156813405
   )
   int field1390;
   @ObfuscatedName("z")
   boolean field1402;
   @ObfuscatedName("c")
   @ObfuscatedGetter(
      intValue = -1366297195
   )
   int field1393;
   @ObfuscatedName("t")
   protected int[] samples;
   @ObfuscatedName("ah")
   @ObfuscatedGetter(
      intValue = 1816555939
   )
   int field1401;
   @ObfuscatedName("an")
   @ObfuscatedSignature(
      signature = "[Ldo;"
   )
   TaskDataNode[] field1403;
   @ObfuscatedName("i")
   @ObfuscatedGetter(
      intValue = -1869318031
   )
   int field1397;
   @ObfuscatedName("y")
   @ObfuscatedGetter(
      intValue = -810290507
   )
   int offset;
   @ObfuscatedName("d")
   @ObfuscatedGetter(
      longValue = 5497426224088795273L
   )
   long field1405;
   @ObfuscatedName("j")
   @ObfuscatedGetter(
      longValue = 2364871167386266887L
   )
   long field1399;
   @ObfuscatedName("u")
   @ObfuscatedGetter(
      longValue = 5440291444380244465L
   )
   long field1391;

   protected AbstractSoundSystem() {
      this.field1390 = 32;
      this.field1391 = class318.method6317();
      this.field1405 = 0L;
      this.field1396 = 0;
      this.field1397 = 0;
      this.field1393 = 0;
      this.field1399 = 0L;
      this.field1402 = true;
      this.field1401 = 0;
      this.field1387 = new TaskDataNode[8];
      this.field1403 = new TaskDataNode[8];
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "31"
   )
   protected void vmethod6072() throws Exception {
   }

   @ObfuscatedName("ae")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "1836174330"
   )
   public final void method1748() {
      this.field1402 = true;
   }

   @ObfuscatedName("au")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "59"
   )
   public final synchronized void method1750() {
      if(class179.task != null) {
         boolean var1 = true;

         for(int var2 = 0; var2 < 2; ++var2) {
            if(this == class179.task.systems[var2]) {
               class179.task.systems[var2] = null;
            }

            if(class179.task.systems[var2] != null) {
               var1 = false;
            }
         }

         if(var1) {
            field1386.shutdownNow();
            field1386 = null;
            class179.task = null;
         }
      }

      this.vmethod6076();
      this.samples = null;
   }

   @ObfuscatedName("x")
   protected void vmethod6075() throws Exception {
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "1893251924"
   )
   final void method1751(int var1) {
      this.field1401 -= var1;
      if(this.field1401 < 0) {
         this.field1401 = 0;
      }

      if(this.field1389 != null) {
         this.field1389.vmethod5976(var1);
      }

   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "1700298966"
   )
   protected void vmethod6091() throws Exception {
   }

   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      signature = "(Ldo;II)V",
      garbageValue = "-2135610164"
   )
   final void method1766(TaskDataNode var1, int var2) {
      int var3 = var2 >> 5;
      TaskDataNode var4 = this.field1403[var3];
      if(var4 == null) {
         this.field1387[var3] = var1;
      } else {
         var4.field1469 = var1;
      }

      this.field1403[var3] = var1;
      var1.field1470 = var2;
   }

   @ObfuscatedName("av")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "1182916117"
   )
   public final synchronized void method1749() {
      this.field1402 = true;

      try {
         this.vmethod6072();
      } catch (Exception var2) {
         this.vmethod6076();
         this.field1405 = class318.method6317() + 2000L;
      }

   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      signature = "(Ldo;B)V",
      garbageValue = "-27"
   )
   public final synchronized void method1746(TaskDataNode var1) {
      this.field1389 = var1;
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1543739312"
   )
   public final synchronized void method1747() {
      if(this.samples != null) {
         long var1 = class318.method6317();

         try {
            if(0L != this.field1405) {
               if(var1 < this.field1405) {
                  return;
               }

               this.vmethod6071(this.offset);
               this.field1405 = 0L;
               this.field1402 = true;
            }

            int var3 = this.vmethod6074();
            if(this.field1393 - var3 > this.field1396) {
               this.field1396 = this.field1393 - var3;
            }

            int var4 = this.field1400 + this.field1394;
            if(var4 + 256 > 16384) {
               var4 = 16128;
            }

            if(var4 + 256 > this.offset) {
               this.offset += 1024;
               if(this.offset > 16384) {
                  this.offset = 16384;
               }

               this.vmethod6076();
               this.vmethod6071(this.offset);
               var3 = 0;
               this.field1402 = true;
               if(var4 + 256 > this.offset) {
                  var4 = this.offset - 256;
                  this.field1394 = var4 - this.field1400;
               }
            }

            while(var3 < var4) {
               this.method1752(this.samples, 256);
               this.vmethod6075();
               var3 += 256;
            }

            if(var1 > this.field1399) {
               if(!this.field1402) {
                  if(this.field1396 == 0 && this.field1397 == 0) {
                     this.vmethod6076();
                     this.field1405 = 2000L + var1;
                     return;
                  }

                  this.field1394 = Math.min(this.field1397, this.field1396);
                  this.field1397 = this.field1396;
               } else {
                  this.field1402 = false;
               }

               this.field1396 = 0;
               this.field1399 = var1 + 2000L;
            }

            this.field1393 = var3;
         } catch (Exception var7) {
            this.vmethod6076();
            this.field1405 = var1 + 2000L;
         }

         try {
            if(var1 > this.field1391 + 500000L) {
               var1 = this.field1391;
            }

            while(var1 > 5000L + this.field1391) {
               this.method1751(256);
               this.field1391 += (long)(256000 / MapIconReference.sampleRate);
            }
         } catch (Exception var6) {
            this.field1391 = var1;
         }

      }
   }

   @ObfuscatedName("as")
   final void method1752(int[] var1, int var2) {
      int var3 = var2;
      if(ContextMenuRow.audioHighMemory) {
         var3 = var2 << 1;
      }

      class11.method171(var1, 0, var3);
      this.field1401 -= var2;
      if(this.field1389 != null && this.field1401 <= 0) {
         this.field1401 += MapIconReference.sampleRate >> 4;
         class327.method6406(this.field1389);
         this.method1766(this.field1389, this.field1389.vmethod5966());
         int var4 = 0;
         int var5 = 255;

         int var6;
         TaskDataNode var10;
         label104:
         for(var6 = 7; var5 != 0; --var6) {
            int var7;
            int var8;
            if(var6 < 0) {
               var7 = var6 & 3;
               var8 = -(var6 >> 2);
            } else {
               var7 = var6;
               var8 = 0;
            }

            for(int var9 = var5 >>> var7 & 286331153; var9 != 0; var9 >>>= 4) {
               if((var9 & 1) != 0) {
                  var5 &= ~(1 << var7);
                  var10 = null;
                  TaskDataNode var11 = this.field1387[var7];

                  label98:
                  while(true) {
                     while(true) {
                        if(var11 == null) {
                           break label98;
                        }

                        AbstractIntegerNode0 var12 = var11.data;
                        if(var12 != null && var12.int1 > var8) {
                           var5 |= 1 << var7;
                           var10 = var11;
                           var11 = var11.field1469;
                        } else {
                           var11.field1472 = true;
                           int var13 = var11.vmethod5970();
                           var4 += var13;
                           if(var12 != null) {
                              var12.int1 += var13;
                           }

                           if(var4 >= this.field1390) {
                              break label104;
                           }

                           TaskDataNode var14 = var11.vmethod5968();
                           if(var14 != null) {
                              for(int var15 = var11.field1470; var14 != null; var14 = var11.vmethod5969()) {
                                 this.method1766(var14, var15 * var14.vmethod5966() >> 8);
                              }
                           }

                           TaskDataNode var18 = var11.field1469;
                           var11.field1469 = null;
                           if(var10 == null) {
                              this.field1387[var7] = var18;
                           } else {
                              var10.field1469 = var18;
                           }

                           if(var18 == null) {
                              this.field1403[var7] = var10;
                           }

                           var11 = var18;
                        }
                     }
                  }
               }

               var7 += 4;
               ++var8;
            }
         }

         for(var6 = 0; var6 < 8; ++var6) {
            TaskDataNode var16 = this.field1387[var6];
            TaskDataNode[] var17 = this.field1387;
            this.field1403[var6] = null;

            for(var17[var6] = null; var16 != null; var16 = var10) {
               var10 = var16.field1469;
               var16.field1469 = null;
            }
         }
      }

      if(this.field1401 < 0) {
         this.field1401 = 0;
      }

      if(this.field1389 != null) {
         this.field1389.vmethod5972(var1, 0, var2);
      }

      this.field1391 = class318.method6317();
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "1638303267"
   )
   protected void vmethod6071(int var1) throws Exception {
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1072337628"
   )
   protected void vmethod6076() {
   }

   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "-1071054090"
   )
   protected int vmethod6074() throws Exception {
      return this.offset;
   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "([BIILen;[Lfk;I)V",
      garbageValue = "455914340"
   )
   static final void method1802(byte[] var0, int var1, int var2, SceneManager var3, CollisionData[] var4) {
      Packet var5 = new Packet(var0);
      int var6 = -1;

      while(true) {
         int var7 = var5.method5088();
         if(var7 == 0) {
            return;
         }

         var6 += var7;
         int var8 = 0;

         while(true) {
            int var9 = var5.method5269();
            if(var9 == 0) {
               break;
            }

            var8 += var9 - 1;
            int var10 = var8 & 63;
            int var11 = var8 >> 6 & 63;
            int var12 = var8 >> 12;
            int var13 = var5.readUnsignedByte();
            int var14 = var13 >> 2;
            int var15 = var13 & 3;
            int var16 = var11 + var1;
            int var17 = var10 + var2;
            if(var16 > 0 && var17 > 0 && var16 < 103 && var17 < 103) {
               int var18 = var12;
               if((class91.tileSettings[1][var16][var17] & 2) == 2) {
                  var18 = var12 - 1;
               }

               CollisionData var19 = null;
               if(var18 >= 0) {
                  var19 = var4[var18];
               }

               class253.method4728(var12, var16, var17, var6, var15, var14, var3, var19);
            }
         }
      }
   }
}
