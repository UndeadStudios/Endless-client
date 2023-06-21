package net.runelite.standalone;

import java.io.IOException;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hn")
public class class15 extends TaskDataNode {
   @ObfuscatedName("f")
   int[] field2564;
   @ObfuscatedName("v")
   int[] field2573;
   @ObfuscatedName("e")
   int[] field2570;
   @ObfuscatedName("af")
   @ObfuscatedSignature(
      signature = "Lhf;"
   )
   class305 field2580;
   @ObfuscatedName("w")
   int[] field2579;
   @ObfuscatedName("q")
   int[] field2567;
   @ObfuscatedName("x")
   int[] field2562;
   @ObfuscatedName("m")
   int[] field2566;
   @ObfuscatedName("p")
   int[] field2565;
   @ObfuscatedName("ag")
   @ObfuscatedSignature(
      signature = "[[Lhl;"
   )
   class121[][] field2584;
   @ObfuscatedName("b")
   int[] field2582;
   @ObfuscatedName("aw")
   @ObfuscatedGetter(
      longValue = -8032164791710535309L
   )
   long field2585;
   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "Lht;"
   )
   HashTable field2568;
   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "[[Lhl;"
   )
   class121[][] field2578;
   @ObfuscatedName("n")
   int[] field2569;
   @ObfuscatedName("c")
   int[] field2576;
   @ObfuscatedName("ay")
   boolean field2581;
   @ObfuscatedName("ah")
   @ObfuscatedGetter(
      longValue = -4638524786880878329L
   )
   long field2571;
   @ObfuscatedName("an")
   @ObfuscatedSignature(
      signature = "Lhb;"
   )
   class44 field2572;
   @ObfuscatedName("i")
   int[] field2559;
   @ObfuscatedName("d")
   int[] field2575;
   @ObfuscatedName("j")
   int[] field2577;
   @ObfuscatedName("aa")
   @ObfuscatedGetter(
      intValue = 1647160153
   )
   int field2574;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = 1381649205
   )
   int field2560;
   @ObfuscatedName("h")
   int[] field2563;
   @ObfuscatedName("ab")
   @ObfuscatedGetter(
      intValue = -1676533057
   )
   int field2583;
   @ObfuscatedName("g")
   @ObfuscatedGetter(
      intValue = -1205600737
   )
   int field2561;

   public class15() {
      this.field2560 = 256;
      this.field2561 = 1000000;
      this.field2562 = new int[16];
      this.field2563 = new int[16];
      this.field2564 = new int[16];
      this.field2565 = new int[16];
      this.field2566 = new int[16];
      this.field2567 = new int[16];
      this.field2582 = new int[16];
      this.field2569 = new int[16];
      this.field2570 = new int[16];
      this.field2573 = new int[16];
      this.field2575 = new int[16];
      this.field2579 = new int[16];
      this.field2559 = new int[16];
      this.field2576 = new int[16];
      this.field2577 = new int[16];
      this.field2578 = new class121[16][128];
      this.field2584 = new class121[16][128];
      this.field2580 = new class305();
      this.field2572 = new class44(this);
      this.field2568 = new HashTable(128);
      this.method232();
   }

   @ObfuscatedName("ak")
   @ObfuscatedSignature(
      signature = "(Lhl;I)I",
      garbageValue = "1953289212"
   )
   int method297(class121 var1) {
      class252 var2 = var1.field2590;
      int var3 = this.field2564[var1.field2601] * this.field2562[var1.field2601] + 4096 >> 13;
      var3 = var3 * var3 + 16384 >> 15;
      var3 = var3 * var1.field2593 + 16384 >> 15;
      var3 = var3 * this.field2560 + 128 >> 8;
      if(var2.field2546 > 0) {
         var3 = (int)((double)var3 * Math.pow(0.5D, (double)var2.field2546 * (double)var1.field2606 * 1.953125E-5D) + 0.5D);
      }

      int var4;
      int var5;
      int var6;
      int var7;
      if(var2.field2539 != null) {
         var4 = var1.field2599;
         var5 = var2.field2539[var1.field2600 + 1];
         if(var1.field2600 < var2.field2539.length - 2) {
            var6 = (var2.field2539[var1.field2600] & 255) << 8;
            var7 = (var2.field2539[var1.field2600 + 2] & 255) << 8;
            var5 += (var4 - var6) * (var2.field2539[var1.field2600 + 3] - var5) / (var7 - var6);
         }

         var3 = var5 * var3 + 32 >> 6;
      }

      if(var1.field2588 > 0 && var2.field2535 != null) {
         var4 = var1.field2588;
         var5 = var2.field2535[var1.field2602 + 1];
         if(var1.field2602 < var2.field2535.length - 2) {
            var6 = (var2.field2535[var1.field2602] & 255) << 8;
            var7 = (var2.field2535[var1.field2602 + 2] & 255) << 8;
            var5 += (var2.field2535[var1.field2602 + 3] - var5) * (var4 - var6) / (var7 - var6);
         }

         var3 = var3 * var5 + 32 >> 6;
      }

      return var3;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "()Ldo;"
   )
   protected synchronized TaskDataNode vmethod5968() {
      return this.field2572;
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(III)V",
      garbageValue = "1095350832"
   )
   void method308(int var1, int var2) {
      this.field2565[var1] = var2;
      this.field2567[var1] = var2 & -128;
      this.method293(var1, var2);
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      signature = "(IIII)V",
      garbageValue = "1891871881"
   )
   void method194(int var1, int var2, int var3) {
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-792904725"
   )
   public synchronized void method199() {
      this.field2580.method6101();
      this.method232();
   }

   @ObfuscatedName("r")
   @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "-1235834492"
   )
   synchronized boolean method309() {
      return this.field2580.method6096();
   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "-1408057836"
   )
   void method215(int var1) {
      if((this.field2573[var1] & 4) != 0) {
         for(class121 var2 = (class121)this.field2572.field2633.method3930(); var2 != null; var2 = (class121)this.field2572.field2633.method3924()) {
            if(var2.field2601 == var1) {
               var2.field2607 = 0;
            }
         }
      }

   }

   @ObfuscatedName("k")
   @ObfuscatedSignature(
      signature = "(IIIB)V",
      garbageValue = "1"
   )
   void method229(int var1, int var2, int var3) {
      class121 var4 = this.field2578[var1][var2];
      if(var4 != null) {
         this.field2578[var1][var2] = null;
         if((this.field2573[var1] & 2) != 0) {
            for(class121 var5 = (class121)this.field2572.field2633.method3930(); var5 != null; var5 = (class121)this.field2572.field2633.method3924()) {
               if(var4.field2601 == var5.field2601 && var5.field2588 < 0 && var4 != var5) {
                  var4.field2588 = 0;
                  break;
               }
            }
         } else {
            var4.field2588 = 0;
         }

      }
   }

   @ObfuscatedName("q")
   protected synchronized void vmethod5972(int[] var1, int var2, int var3) {
      if(this.field2580.method6096()) {
         int var4 = this.field2580.field2614 * this.field2561 / MapIconReference.sampleRate;

         do {
            long var5 = this.field2571 + (long)var4 * (long)var3;
            if(this.field2585 - var5 >= 0L) {
               this.field2571 = var5;
               break;
            }

            int var7 = (int)((this.field2585 - this.field2571 + (long)var4 - 1L) / (long)var4);
            this.field2571 += (long)var4 * (long)var7;
            this.field2572.vmethod5972(var1, var2, var7);
            var2 += var7;
            var3 -= var7;
            this.method225();
         } while(this.field2580.method6096());
      }

      this.field2572.vmethod5972(var1, var2, var3);
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "0"
   )
   public synchronized void method264() {
      for(class64 var1 = (class64)this.field2568.method6338(); var1 != null; var1 = (class64)this.field2568.method6339()) {
         var1.method950();
      }

   }

   @ObfuscatedName("m")
   protected synchronized int vmethod5970() {
      return 0;
   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "()Ldo;"
   )
   protected synchronized TaskDataNode vmethod5969() {
      return null;
   }

   @ObfuscatedName("b")
   @ObfuscatedSignature(
      signature = "(Lhx;ZI)V",
      garbageValue = "1655522361"
   )
   public synchronized void method198(Track1 var1, boolean var2) {
      this.method199();
      this.field2580.method6121(var1.field2639);
      this.field2581 = var2;
      this.field2571 = 0L;
      int var3 = this.field2580.method6097();

      for(int var4 = 0; var4 < var3; ++var4) {
         this.field2580.method6098(var4);
         this.field2580.method6100(var4);
         this.field2580.method6128(var4);
      }

      this.field2574 = this.field2580.method6106();
      this.field2583 = this.field2580.field2612[this.field2574];
      this.field2585 = this.field2580.method6105(this.field2583);
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "492626945"
   )
   void method216(int var1) {
      for(class121 var2 = (class121)this.field2572.field2633.method3930(); var2 != null; var2 = (class121)this.field2572.field2633.method3924()) {
         if((var1 < 0 || var2.field2601 == var1) && var2.field2588 < 0) {
            this.field2578[var2.field2601][var2.field2603] = null;
            var2.field2588 = 0;
         }
      }

   }

   @ObfuscatedName("bo")
   @ObfuscatedSignature(
      signature = "(Lhl;I)Z",
      garbageValue = "1592628248"
   )
   boolean method219(class121 var1) {
      if(var1.field2605 == null) {
         if(var1.field2588 >= 0) {
            var1.method432();
            if(var1.field2591 > 0 && var1 == this.field2584[var1.field2601][var1.field2591]) {
               this.field2584[var1.field2601][var1.field2591] = null;
            }
         }

         return true;
      } else {
         return false;
      }
   }

   @ObfuscatedName("o")
   @ObfuscatedSignature(
      signature = "(III)V",
      garbageValue = "-1809313423"
   )
   void method293(int var1, int var2) {
      if(var2 != this.field2566[var1]) {
         this.field2566[var1] = var2;

         for(int var3 = 0; var3 < 128; ++var3) {
            this.field2584[var1][var3] = null;
         }
      }

   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "(IB)V",
      garbageValue = "2"
   )
   public synchronized void method193(int var1) {
      this.field2560 = var1;
   }

   @ObfuscatedName("n")
   protected synchronized void vmethod5976(int var1) {
      if(this.field2580.method6096()) {
         int var2 = this.field2580.field2614 * this.field2561 / MapIconReference.sampleRate;

         do {
            long var3 = (long)var2 * (long)var1 + this.field2571;
            if(this.field2585 - var3 >= 0L) {
               this.field2571 = var3;
               break;
            }

            int var5 = (int)((this.field2585 - this.field2571 + (long)var2 - 1L) / (long)var2);
            this.field2571 += (long)var5 * (long)var2;
            this.field2572.vmethod5976(var5);
            var1 -= var5;
            this.method225();
         } while(this.field2580.method6096());
      }

      this.field2572.vmethod5976(var1);
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      signature = "(IIB)V",
      garbageValue = "-7"
   )
   void method208(int var1, int var2) {
   }

   @ObfuscatedName("t")
   @ObfuscatedSignature(
      signature = "(III)V",
      garbageValue = "1493827259"
   )
   public synchronized void method201(int var1, int var2) {
      this.method308(var1, var2);
   }

   @ObfuscatedName("ah")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "-1345756874"
   )
   void method211(int var1) {
      if(var1 >= 0) {
         this.field2562[var1] = 12800;
         this.field2563[var1] = 8192;
         this.field2564[var1] = 16383;
         this.field2582[var1] = 8192;
         this.field2569[var1] = 0;
         this.field2570[var1] = 8192;
         this.method255(var1);
         this.method215(var1);
         this.field2573[var1] = 0;
         this.field2575[var1] = 32767;
         this.field2579[var1] = 256;
         this.field2559[var1] = 0;
         this.method217(var1, 8192);
      } else {
         for(var1 = 0; var1 < 16; ++var1) {
            this.method211(var1);
         }

      }
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-137789345"
   )
   void method232() {
      this.method210(-1);
      this.method211(-1);

      int var1;
      for(var1 = 0; var1 < 16; ++var1) {
         this.field2566[var1] = this.field2565[var1];
      }

      for(var1 = 0; var1 < 16; ++var1) {
         this.field2567[var1] = this.field2565[var1] & -128;
      }

   }

   @ObfuscatedName("be")
   @ObfuscatedSignature(
      signature = "(Lhl;[IIII)Z",
      garbageValue = "60879760"
   )
   boolean method227(class121 var1, int[] var2, int var3, int var4) {
      var1.field2597 = MapIconReference.sampleRate / 100;
      if(var1.field2588 < 0 || var1.field2605 != null && !var1.field2605.method2501()) {
         int var5 = var1.field2594;
         if(var5 > 0) {
            var5 -= (int)(16.0D * Math.pow(2.0D, (double)this.field2570[var1.field2601] * 4.921259842519685E-4D) + 0.5D);
            if(var5 < 0) {
               var5 = 0;
            }

            var1.field2594 = var5;
         }

         var1.field2605.method2499(this.method218(var1));
         class252 var6 = var1.field2590;
         boolean var7 = false;
         ++var1.field2592;
         var1.field2604 += var6.field2541;
         double var8 = (double)((var1.field2603 - 60 << 8) + (var1.field2596 * var1.field2594 >> 12)) * 5.086263020833333E-6D;
         if(var6.field2546 > 0) {
            if(var6.field2543 > 0) {
               var1.field2606 += (int)(128.0D * Math.pow(2.0D, var8 * (double)var6.field2543) + 0.5D);
            } else {
               var1.field2606 += 128;
            }
         }

         if(var6.field2539 != null) {
            if(var6.field2537 > 0) {
               var1.field2599 += (int)(128.0D * Math.pow(2.0D, (double)var6.field2537 * var8) + 0.5D);
            } else {
               var1.field2599 += 128;
            }

            while(var1.field2600 < var6.field2539.length - 2 && var1.field2599 > (var6.field2539[var1.field2600 + 2] & 255) << 8) {
               var1.field2600 += 2;
            }

            if(var6.field2539.length - 2 == var1.field2600 && var6.field2539[var1.field2600 + 1] == 0) {
               var7 = true;
            }
         }

         if(var1.field2588 >= 0 && var6.field2535 != null && (this.field2573[var1.field2601] & 1) == 0 && (var1.field2591 < 0 || var1 != this.field2584[var1.field2601][var1.field2591])) {
            if(var6.field2536 > 0) {
               var1.field2588 += (int)(128.0D * Math.pow(2.0D, (double)var6.field2536 * var8) + 0.5D);
            } else {
               var1.field2588 += 128;
            }

            while(var1.field2602 < var6.field2535.length - 2 && var1.field2588 > (var6.field2535[var1.field2602 + 2] & 255) << 8) {
               var1.field2602 += 2;
            }

            if(var6.field2535.length - 2 == var1.field2602) {
               var7 = true;
            }
         }

         if(var7) {
            var1.field2605.method2498(var1.field2597);
            if(var2 != null) {
               var1.field2605.vmethod5972(var2, var3, var4);
            } else {
               var1.field2605.vmethod5976(var4);
            }

            if(var1.field2605.method2502()) {
               this.field2572.field2635.method3531(var1.field2605);
            }

            var1.method1816();
            if(var1.field2588 >= 0) {
               var1.method432();
               if(var1.field2591 > 0 && var1 == this.field2584[var1.field2601][var1.field2591]) {
                  this.field2584[var1.field2601][var1.field2591] = null;
               }
            }

            return true;
         } else {
            var1.field2605.method2497(var1.field2597, this.method297(var1), this.method220(var1));
            return false;
         }
      } else {
         var1.method1816();
         var1.method432();
         if(var1.field2591 > 0 && var1 == this.field2584[var1.field2601][var1.field2591]) {
            this.field2584[var1.field2601][var1.field2591] = null;
         }

         return true;
      }
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      signature = "(IB)V",
      garbageValue = "60"
   )
   void method255(int var1) {
      if((this.field2573[var1] & 2) != 0) {
         for(class121 var2 = (class121)this.field2572.field2633.method3930(); var2 != null; var2 = (class121)this.field2572.field2633.method3924()) {
            if(var2.field2601 == var1 && this.field2578[var1][var2.field2603] == null && var2.field2588 < 0) {
               var2.field2588 = 0;
            }
         }
      }

   }

   @ObfuscatedName("y")
   @ObfuscatedSignature(
      signature = "(Lhl;ZB)V",
      garbageValue = "62"
   )
   void method205(class121 var1, boolean var2) {
      int var3 = var1.field2598.audioBuffer.length;
      int var4;
      if(var2 && var1.field2598.field1373) {
         int var5 = var3 + var3 - var1.field2598.startPosition;
         var4 = (int)((long)var5 * (long)this.field2559[var1.field2601] >> 6);
         var3 <<= 8;
         if(var4 >= var3) {
            var4 = var3 + var3 - 1 - var4;
            var1.field2605.method2494();
         }
      } else {
         var4 = (int)((long)this.field2559[var1.field2601] * (long)var3 >> 6);
      }

      var1.field2605.method2601(var4);
   }

   @ObfuscatedName("am")
   @ObfuscatedSignature(
      signature = "(Lhl;I)I",
      garbageValue = "-347672026"
   )
   int method220(class121 var1) {
      int var2 = this.field2563[var1.field2601];
      return var2 < 8192?var2 * var1.field2589 + 32 >> 6:16384 - ((128 - var1.field2589) * (16384 - var2) + 32 >> 6);
   }

   @ObfuscatedName("bf")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "1"
   )
   void method225() {
      int var1 = this.field2574;
      int var2 = this.field2583;

      long var3;
      for(var3 = this.field2585; var2 == this.field2583; var3 = this.field2580.method6105(var2)) {
         while(var2 == this.field2580.field2612[var1]) {
            this.field2580.method6098(var1);
            int var5 = this.field2580.method6102(var1);
            if(var5 == 1) {
               this.field2580.method6124();
               this.field2580.method6128(var1);
               if(this.field2580.method6107()) {
                  if(!this.field2581 || var2 == 0) {
                     this.method232();
                     this.field2580.method6101();
                     return;
                  }

                  this.field2580.method6108(var3);
               }
               break;
            }

            if((var5 & 128) != 0) {
               this.method212(var5);
            }

            this.field2580.method6100(var1);
            this.field2580.method6128(var1);
         }

         var1 = this.field2580.method6106();
         var2 = this.field2580.field2612[var1];
      }

      this.field2574 = var1;
      this.field2583 = var2;
      this.field2585 = var3;
   }

   @ObfuscatedName("ax")
   @ObfuscatedSignature(
      signature = "(Lhl;I)I",
      garbageValue = "1031879646"
   )
   int method218(class121 var1) {
      int var2 = (var1.field2594 * var1.field2596 >> 12) + var1.field2595;
      var2 += (this.field2582[var1.field2601] - 8192) * this.field2579[var1.field2601] >> 12;
      class252 var3 = var1.field2590;
      int var4;
      if(var3.field2541 > 0 && (var3.field2540 > 0 || this.field2569[var1.field2601] > 0)) {
         var4 = var3.field2540 << 2;
         int var5 = var3.field2542 << 1;
         if(var1.field2592 < var5) {
            var4 = var4 * var1.field2592 / var5;
         }

         var4 += this.field2569[var1.field2601] >> 7;
         double var6 = Math.sin((double)(var1.field2604 & 511) * 0.01227184630308513D);
         var2 += (int)((double)var4 * var6);
      }

      var4 = (int)((double)(var1.field2598.sampleRate * 256) * Math.pow(2.0D, (double)var2 * 3.255208333333333E-4D) / (double)MapIconReference.sampleRate + 0.5D);
      return var4 < 1?1:var4;
   }

   @ObfuscatedName("ad")
   @ObfuscatedSignature(
      signature = "(III)V",
      garbageValue = "1968937542"
   )
   void method217(int var1, int var2) {
      this.field2576[var1] = var2;
      this.field2577[var1] = (int)(2097152.0D * Math.pow(2.0D, (double)var2 * 5.4931640625E-4D) + 0.5D);
   }

   @ObfuscatedName("aa")
   @ObfuscatedSignature(
      signature = "(III)V",
      garbageValue = "2072321308"
   )
   void method288(int var1, int var2) {
      this.field2582[var1] = var2;
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "1408032443"
   )
   int method306() {
      return this.field2560;
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "2139447047"
   )
   synchronized void method197() {
      for(class64 var1 = (class64)this.field2568.method6338(); var1 != null; var1 = (class64)this.field2568.method6339()) {
         var1.method432();
      }

   }

   @ObfuscatedName("u")
   @ObfuscatedSignature(
      signature = "(IIII)V",
      garbageValue = "1605398893"
   )
   void method204(int var1, int var2, int var3) {
      this.method229(var1, var2, 64);
      if((this.field2573[var1] & 2) != 0) {
         for(class121 var4 = (class121)this.field2572.field2633.method3912(); var4 != null; var4 = (class121)this.field2572.field2633.method3929()) {
            if(var4.field2601 == var1 && var4.field2588 < 0) {
               this.field2578[var1][var4.field2603] = null;
               this.field2578[var1][var2] = var4;
               int var5 = (var4.field2594 * var4.field2596 >> 12) + var4.field2595;
               var4.field2595 += var2 - var4.field2603 << 8;
               var4.field2596 = var5 - var4.field2595;
               var4.field2594 = 4096;
               var4.field2603 = var2;
               return;
            }
         }
      }

      class64 var9 = (class64)this.field2568.method6335((long)this.field2566[var1]);
      if(var9 != null) {
         RawAudioNode var8 = var9.field2622[var2];
         if(var8 != null) {
            class121 var6 = new class121();
            var6.field2601 = var1;
            var6.field2587 = var9;
            var6.field2598 = var8;
            var6.field2590 = var9.field2627[var2];
            var6.field2591 = var9.field2624[var2];
            var6.field2603 = var2;
            var6.field2593 = var3 * var3 * var9.field2623[var2] * var9.field2628 + 1024 >> 11;
            var6.field2589 = var9.field2626[var2] & 255;
            var6.field2595 = (var2 << 8) - (var9.field2625[var2] & 32767);
            var6.field2606 = 0;
            var6.field2599 = 0;
            var6.field2600 = 0;
            var6.field2588 = -1;
            var6.field2602 = 0;
            if(this.field2559[var1] == 0) {
               var6.field2605 = class166.method2509(var8, this.method218(var6), this.method297(var6), this.method220(var6));
            } else {
               var6.field2605 = class166.method2509(var8, this.method218(var6), 0, this.method220(var6));
               this.method205(var6, var9.field2625[var2] < 0);
            }

            if(var9.field2625[var2] < 0) {
               var6.field2605.method2487(-1);
            }

            if(var6.field2591 >= 0) {
               class121 var7 = this.field2584[var1][var6.field2591];
               if(var7 != null && var7.field2588 < 0) {
                  this.field2578[var1][var7.field2603] = null;
                  var7.field2588 = 0;
               }

               this.field2584[var1][var6.field2591] = var6;
            }

            this.field2572.field2633.method3906(var6);
            this.field2578[var1][var2] = var6;
         }
      }
   }

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "-36819028"
   )
   void method210(int var1) {
      for(class121 var2 = (class121)this.field2572.field2633.method3930(); var2 != null; var2 = (class121)this.field2572.field2633.method3924()) {
         if(var1 < 0 || var2.field2601 == var1) {
            if(var2.field2605 != null) {
               var2.field2605.method2498(MapIconReference.sampleRate / 100);
               if(var2.field2605.method2502()) {
                  this.field2572.field2635.method3531(var2.field2605);
               }

               var2.method1816();
            }

            if(var2.field2588 < 0) {
               this.field2578[var2.field2601][var2.field2603] = null;
            }

            var2.method432();
         }
      }

   }

   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      signature = "(IS)V",
      garbageValue = "128"
   )
   void method212(int var1) {
      int var2 = var1 & 240;
      int var3;
      int var4;
      int var5;
      if(var2 == 128) {
         var3 = var1 & 15;
         var4 = var1 >> 8 & 127;
         var5 = var1 >> 16 & 127;
         this.method229(var3, var4, var5);
      } else if(var2 == 144) {
         var3 = var1 & 15;
         var4 = var1 >> 8 & 127;
         var5 = var1 >> 16 & 127;
         if(var5 > 0) {
            this.method204(var3, var4, var5);
         } else {
            this.method229(var3, var4, 64);
         }

      } else if(var2 == 160) {
         var3 = var1 & 15;
         var4 = var1 >> 8 & 127;
         var5 = var1 >> 16 & 127;
         this.method194(var3, var4, var5);
      } else if(var2 == 176) {
         var3 = var1 & 15;
         var4 = var1 >> 8 & 127;
         var5 = var1 >> 16 & 127;
         if(var4 == 0) {
            this.field2567[var3] = (var5 << 14) + (this.field2567[var3] & -2080769);
         }

         if(var4 == 32) {
            this.field2567[var3] = (var5 << 7) + (this.field2567[var3] & -16257);
         }

         if(var4 == 1) {
            this.field2569[var3] = (var5 << 7) + (this.field2569[var3] & -16257);
         }

         if(var4 == 33) {
            this.field2569[var3] = var5 + (this.field2569[var3] & -128);
         }

         if(var4 == 5) {
            this.field2570[var3] = (var5 << 7) + (this.field2570[var3] & -16257);
         }

         if(var4 == 37) {
            this.field2570[var3] = var5 + (this.field2570[var3] & -128);
         }

         if(var4 == 7) {
            this.field2562[var3] = (var5 << 7) + (this.field2562[var3] & -16257);
         }

         if(var4 == 39) {
            this.field2562[var3] = var5 + (this.field2562[var3] & -128);
         }

         if(var4 == 10) {
            this.field2563[var3] = (var5 << 7) + (this.field2563[var3] & -16257);
         }

         if(var4 == 42) {
            this.field2563[var3] = var5 + (this.field2563[var3] & -128);
         }

         if(var4 == 11) {
            this.field2564[var3] = (var5 << 7) + (this.field2564[var3] & -16257);
         }

         if(var4 == 43) {
            this.field2564[var3] = var5 + (this.field2564[var3] & -128);
         }

         if(var4 == 64) {
            if(var5 >= 64) {
               this.field2573[var3] |= 1;
            } else {
               this.field2573[var3] &= -2;
            }
         }

         if(var4 == 65) {
            if(var5 >= 64) {
               this.field2573[var3] |= 2;
            } else {
               this.method255(var3);
               this.field2573[var3] &= -3;
            }
         }

         if(var4 == 99) {
            this.field2575[var3] = (var5 << 7) + (this.field2575[var3] & 127);
         }

         if(var4 == 98) {
            this.field2575[var3] = (this.field2575[var3] & 16256) + var5;
         }

         if(var4 == 101) {
            this.field2575[var3] = (var5 << 7) + (this.field2575[var3] & 127) + 16384;
         }

         if(var4 == 100) {
            this.field2575[var3] = (this.field2575[var3] & 16256) + var5 + 16384;
         }

         if(var4 == 120) {
            this.method210(var3);
         }

         if(var4 == 121) {
            this.method211(var3);
         }

         if(var4 == 123) {
            this.method216(var3);
         }

         int var6;
         if(var4 == 6) {
            var6 = this.field2575[var3];
            if(var6 == 16384) {
               this.field2579[var3] = (var5 << 7) + (this.field2579[var3] & -16257);
            }
         }

         if(var4 == 38) {
            var6 = this.field2575[var3];
            if(var6 == 16384) {
               this.field2579[var3] = var5 + (this.field2579[var3] & -128);
            }
         }

         if(var4 == 16) {
            this.field2559[var3] = (var5 << 7) + (this.field2559[var3] & -16257);
         }

         if(var4 == 48) {
            this.field2559[var3] = var5 + (this.field2559[var3] & -128);
         }

         if(var4 == 81) {
            if(var5 >= 64) {
               this.field2573[var3] |= 4;
            } else {
               this.method215(var3);
               this.field2573[var3] &= -5;
            }
         }

         if(var4 == 17) {
            this.method217(var3, (var5 << 7) + (this.field2576[var3] & -16257));
         }

         if(var4 == 49) {
            this.method217(var3, var5 + (this.field2576[var3] & -128));
         }

      } else if(var2 == 192) {
         var3 = var1 & 15;
         var4 = var1 >> 8 & 127;
         this.method293(var3, var4 + this.field2567[var3]);
      } else if(var2 == 208) {
         var3 = var1 & 15;
         var4 = var1 >> 8 & 127;
         this.method208(var3, var4);
      } else if(var2 == 224) {
         var3 = var1 & 15;
         var4 = (var1 >> 8 & 127) + (var1 >> 9 & 16256);
         this.method288(var3, var4);
      } else {
         var2 = var1 & 255;
         if(var2 == 255) {
            this.method232();
         }
      }
   }

   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "(Lhx;Liz;Lds;II)Z",
      garbageValue = "429167597"
   )
   public synchronized boolean method195(Track1 var1, Js5Index var2, class152 var3, int var4) {
      var1.method1294();
      boolean var5 = true;
      int[] var6 = null;
      if(var4 > 0) {
         var6 = new int[]{var4};
      }

      for(ByteArrayNode var7 = (ByteArrayNode)var1.field2638.method6338(); var7 != null; var7 = (ByteArrayNode)var1.field2638.method6339()) {
         int var8 = (int)var7.hash;
         class64 var9 = (class64)this.field2568.method6335((long)var8);
         if(var9 == null) {
            byte[] var11 = var2.method4122(var8);
            class64 var10;
            if(var11 == null) {
               var10 = null;
            } else {
               var10 = new class64(var11);
            }

            var9 = var10;
            if(var10 == null) {
               var5 = false;
               continue;
            }

            this.field2568.method6344(var10, (long)var8);
         }

         if(!var9.method955(var3, var7.byteArray, var6)) {
            var5 = false;
         }
      }

      if(var5) {
         var1.method1292();
      }

      return var5;
   }

   @ObfuscatedName("b")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1695973542"
   )
   static final void method312() {
      class54.method868("Your friend list is full. Max of 200 for free users, and 400 for members");
   }

   @ObfuscatedName("ls")
   @ObfuscatedSignature(
      signature = "(Lgx;I)V",
      garbageValue = "19907189"
   )
   static void method311(Packet var0) {
      if(client.field688 != null) {
         var0.method5080(client.field688, 0, client.field688.length);
      } else {
         byte[] var2 = new byte[24];

         try {
            class75.uidDat.method5575(0L);
            class75.uidDat.method5577(var2);

            int var3;
            for(var3 = 0; var3 < 24 && var2[var3] == 0; ++var3) {
               ;
            }

            if(var3 >= 24) {
               throw new IOException();
            }
         } catch (Exception var6) {
            for(int var4 = 0; var4 < 24; ++var4) {
               var2[var4] = -1;
            }
         }

         var0.method5080(var2, 0, var2.length);
      }
   }
}
