package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hb")
public class class44 extends TaskDataNode {
   @ObfuscatedName("dw")
   @ObfuscatedSignature(
      signature = "Lin;"
   )
   static Js5 binary;
   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "Lhn;"
   )
   class15 field2634;
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "Lhv;"
   )
   Deque field2633;
   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "Lcn;"
   )
   class185 field2635;

   @ObfuscatedSignature(
      signature = "(Lhn;)V"
   )
   class44(class15 var1) {
      this.field2633 = new Deque();
      this.field2635 = new class185();
      this.field2634 = var1;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "()Ldo;"
   )
   protected TaskDataNode vmethod5968() {
      class121 var1 = (class121)this.field2633.method3930();
      return (TaskDataNode)(var1 == null?null:(var1.field2605 != null?var1.field2605:this.vmethod5969()));
   }

   @ObfuscatedName("q")
   protected void vmethod5972(int[] var1, int var2, int var3) {
      this.field2635.vmethod5972(var1, var2, var3);

      for(class121 var6 = (class121)this.field2633.method3930(); var6 != null; var6 = (class121)this.field2633.method3924()) {
         if(!this.field2634.method219(var6)) {
            int var4 = var2;
            int var5 = var3;

            do {
               if(var5 <= var6.field2597) {
                  this.method655(var6, var1, var4, var5, var4 + var5);
                  var6.field2597 -= var5;
                  break;
               }

               this.method655(var6, var1, var4, var6.field2597, var5 + var4);
               var4 += var6.field2597;
               var5 -= var6.field2597;
            } while(!this.field2634.method227(var6, var1, var4, var5));
         }
      }

   }

   @ObfuscatedName("m")
   protected int vmethod5970() {
      return 0;
   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "()Ldo;"
   )
   protected TaskDataNode vmethod5969() {
      class121 var1;
      do {
         var1 = (class121)this.field2633.method3924();
         if(var1 == null) {
            return null;
         }
      } while(var1.field2605 == null);

      return var1.field2605;
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "(Lhl;[IIIII)V",
      garbageValue = "-1768217308"
   )
   void method655(class121 var1, int[] var2, int var3, int var4, int var5) {
      if((this.field2634.field2573[var1.field2601] & 4) != 0 && var1.field2588 < 0) {
         int var6 = this.field2634.field2577[var1.field2601] / MapIconReference.sampleRate;

         while(true) {
            int var7 = (var6 + 1048575 - var1.field2607) / var6;
            if(var7 > var4) {
               var1.field2607 += var6 * var4;
               break;
            }

            var1.field2605.vmethod5972(var2, var3, var7);
            var3 += var7;
            var4 -= var7;
            var1.field2607 += var7 * var6 - 1048576;
            int var8 = MapIconReference.sampleRate / 100;
            int var9 = 262144 / var6;
            if(var9 < var8) {
               var8 = var9;
            }

            class166 var10 = var1.field2605;
            if(this.field2634.field2559[var1.field2601] == 0) {
               var1.field2605 = class166.method2509(var1.field2598, var10.method2500(), var10.method2491(), var10.method2567());
            } else {
               var1.field2605 = class166.method2509(var1.field2598, var10.method2500(), 0, var10.method2567());
               this.field2634.method205(var1, var1.field2587.field2625[var1.field2603] < 0);
               var1.field2605.method2496(var8, var10.method2491());
            }

            if(var1.field2587.field2625[var1.field2603] < 0) {
               var1.field2605.method2487(-1);
            }

            var10.method2498(var8);
            var10.vmethod5972(var2, var3, var5 - var3);
            if(var10.method2502()) {
               this.field2635.method3531(var10);
            }
         }
      }

      var1.field2605.vmethod5972(var2, var3, var4);
   }

   @ObfuscatedName("n")
   protected void vmethod5976(int var1) {
      this.field2635.vmethod5976(var1);

      for(class121 var3 = (class121)this.field2633.method3930(); var3 != null; var3 = (class121)this.field2633.method3924()) {
         if(!this.field2634.method219(var3)) {
            int var2 = var1;

            do {
               if(var2 <= var3.field2597) {
                  this.method666(var3, var2);
                  var3.field2597 -= var2;
                  break;
               }

               this.method666(var3, var3.field2597);
               var2 -= var3.field2597;
            } while(!this.field2634.method227(var3, (int[])null, 0, var2));
         }
      }

   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(Lhl;II)V",
      garbageValue = "-1556891862"
   )
   void method666(class121 var1, int var2) {
      if((this.field2634.field2573[var1.field2601] & 4) != 0 && var1.field2588 < 0) {
         int var3 = this.field2634.field2577[var1.field2601] / MapIconReference.sampleRate;
         int var4 = (var3 + 1048575 - var1.field2607) / var3;
         var1.field2607 = var3 * var2 + var1.field2607 & 1048575;
         if(var4 <= var2) {
            if(this.field2634.field2559[var1.field2601] == 0) {
               var1.field2605 = class166.method2509(var1.field2598, var1.field2605.method2500(), var1.field2605.method2491(), var1.field2605.method2567());
            } else {
               var1.field2605 = class166.method2509(var1.field2598, var1.field2605.method2500(), 0, var1.field2605.method2567());
               this.field2634.method205(var1, var1.field2587.field2625[var1.field2603] < 0);
            }

            if(var1.field2587.field2625[var1.field2603] < 0) {
               var1.field2605.method2487(-1);
            }

            var2 = var1.field2607 / var3;
         }
      }

      var1.field2605.vmethod5976(var2);
   }

   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      signature = "(IB)I",
      garbageValue = "1"
   )
   static int method671(int var0) {
      return (int)Math.pow(2.0D, (double)((float)var0 / 256.0F + 7.0F));
   }

   @ObfuscatedName("hf")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "-50"
   )
   static final void method672() {
      Bit var0 = client.serverConnection.clientPacket;
      var0.method2663();
      int var1 = var0.method2652(8);
      int var2;
      if(var1 < client.highResolutionNpcCount) {
         for(var2 = var1; var2 < client.highResolutionNpcCount; ++var2) {
            client.npcIndexesToRemove[++client.npcsToRemoveCount - 1] = client.highResolutionNpcIndexes[var2];
         }
      }

      if(var1 > client.highResolutionNpcCount) {
         throw new RuntimeException("");
      } else {
         client.highResolutionNpcCount = 0;

         for(var2 = 0; var2 < var1; ++var2) {
            int var3 = client.highResolutionNpcIndexes[var2];
            NPCEntity var4 = client.npcs[var3];
            int var5 = var0.method2652(1);
            if(var5 == 0) {
               client.highResolutionNpcIndexes[++client.highResolutionNpcCount - 1] = var3;
               var4.lastUpdatedAt = client.gameCycle;
            } else {
               int var6 = var0.method2652(2);
               if(var6 == 0) {
                  client.highResolutionNpcIndexes[++client.highResolutionNpcCount - 1] = var3;
                  var4.lastUpdatedAt = client.gameCycle;
                  client.extendedInfoNpcIndexes[++client.extendedInfoNpcCount - 1] = var3;
               } else {
                  int var7;
                  int var8;
                  if(var6 == 1) {
                     client.highResolutionNpcIndexes[++client.highResolutionNpcCount - 1] = var3;
                     var4.lastUpdatedAt = client.gameCycle;
                     var7 = var0.method2652(3);
                     var4.method1821(var7, (byte)1);
                     var8 = var0.method2652(1);
                     if(var8 == 1) {
                        client.extendedInfoNpcIndexes[++client.extendedInfoNpcCount - 1] = var3;
                     }
                  } else if(var6 == 2) {
                     client.highResolutionNpcIndexes[++client.highResolutionNpcCount - 1] = var3;
                     var4.lastUpdatedAt = client.gameCycle;
                     var7 = var0.method2652(3);
                     var4.method1821(var7, (byte)2);
                     var8 = var0.method2652(3);
                     var4.method1821(var8, (byte)2);
                     int var9 = var0.method2652(1);
                     if(var9 == 1) {
                        client.extendedInfoNpcIndexes[++client.extendedInfoNpcCount - 1] = var3;
                     }
                  } else if(var6 == 3) {
                     client.npcIndexesToRemove[++client.npcsToRemoveCount - 1] = var3;
                  }
               }
            }
         }

      }
   }
}
