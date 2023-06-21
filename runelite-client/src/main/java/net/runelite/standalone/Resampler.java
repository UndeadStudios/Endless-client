package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dn")
public class Resampler {
   @ObfuscatedName("iz")
   @ObfuscatedGetter(
      intValue = 412126871
   )
   static int field1438;
   @ObfuscatedName("f")
   int[][] resampleTable;
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = -1689769765
   )
   int storedSampleRateRatio;
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      intValue = -1300300777
   )
   int playbackSampleRateRatio;

   public Resampler(int var1, int var2) {
      if(var2 != var1) {
         int var3 = World.method4975(var1, var2);
         var1 /= var3;
         var2 /= var3;
         this.storedSampleRateRatio = var1;
         this.playbackSampleRateRatio = var2;
         this.resampleTable = new int[var1][14];

         for(int var4 = 0; var4 < var1; ++var4) {
            int[] var5 = this.resampleTable[var4];
            double var6 = 6.0D + (double)var4 / (double)var1;
            int var8 = (int)Math.floor(1.0D + (var6 - 7.0D));
            if(var8 < 0) {
               var8 = 0;
            }

            int var9 = (int)Math.ceil(7.0D + var6);
            if(var9 > 14) {
               var9 = 14;
            }

            for(double var10 = (double)var2 / (double)var1; var8 < var9; ++var8) {
               double var12 = 3.141592653589793D * ((double)var8 - var6);
               double var14 = var10;
               if(var12 < -1.0E-4D || var12 > 1.0E-4D) {
                  var14 = var10 * (Math.sin(var12) / var12);
               }

               var14 *= 0.54D + 0.46D * Math.cos(((double)var8 - var6) * 0.2243994752564138D);
               var5[var8] = (int)Math.floor(0.5D + var14 * 65536.0D);
            }
         }

      }
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "([BI)[B",
      garbageValue = "-657751917"
   )
   byte[] method142(byte[] var1) {
      if(this.resampleTable != null) {
         int var2 = (int)((long)var1.length * (long)this.playbackSampleRateRatio / (long)this.storedSampleRateRatio) + 14;
         int[] var3 = new int[var2];
         int var4 = 0;
         int var5 = 0;

         int var6;
         for(var6 = 0; var6 < var1.length; ++var6) {
            byte var7 = var1[var6];
            int[] var8 = this.resampleTable[var5];

            int var9;
            for(var9 = 0; var9 < 14; ++var9) {
               var3[var9 + var4] += var8[var9] * var7;
            }

            var5 += this.playbackSampleRateRatio;
            var9 = var5 / this.storedSampleRateRatio;
            var4 += var9;
            var5 -= var9 * this.storedSampleRateRatio;
         }

         var1 = new byte[var2];

         for(var6 = 0; var6 < var2; ++var6) {
            int var10 = var3[var6] + 32768 >> 16;
            if(var10 < -128) {
               var1[var6] = -128;
            } else if(var10 > 127) {
               var1[var6] = 127;
            } else {
               var1[var6] = (byte)var10;
            }
         }
      }

      return var1;
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(IS)I",
      garbageValue = "16010"
   )
   int method132(int var1) {
      if(this.resampleTable != null) {
         var1 = (int)((long)this.playbackSampleRateRatio * (long)var1 / (long)this.storedSampleRateRatio);
      }

      return var1;
   }

   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "(II)I",
      garbageValue = "-1511668277"
   )
   int method133(int var1) {
      if(this.resampleTable != null) {
         var1 = (int)((long)var1 * (long)this.playbackSampleRateRatio / (long)this.storedSampleRateRatio) + 6;
      }

      return var1;
   }

   @ObfuscatedName("m")
   public static int method143(long var0) {
      return (int)(var0 >>> 17 & 4294967295L);
   }

   @ObfuscatedName("ka")
   @ObfuscatedSignature(
      signature = "([Lia;II)V",
      garbageValue = "-1089845728"
   )
   static final void method144(ComponentType[] var0, int var1) {
      for(int var2 = 0; var2 < var0.length; ++var2) {
         ComponentType var3 = var0[var2];
         if(var3 != null && var3.layer == var1 && (!var3.isIf3 || !class91.method1200(var3))) {
            if(var3.type == 0) {
               if(!var3.isIf3 && class91.method1200(var3) && var3 != NPCType.field3585) {
                  continue;
               }

               method144(var0, var3.id);
               if(var3.children != null) {
                  method144(var3.children, var3.id);
               }

               SubInterface var4 = (SubInterface) client.subInterfaces.method6335((long)var3.id);
               if(var4 != null) {
                  WorldMapDecoration.method2085(var4.id);
               }
            }

            if(var3.type == 6) {
               int var5;
               if(var3.animation != -1 || var3.field2701 != -1) {
                  boolean var7 = ParamType.method618(var3);
                  if(var7) {
                     var5 = var3.field2701;
                  } else {
                     var5 = var3.animation;
                  }

                  if(var5 != -1) {
                     Sequence var6 = AuthProt.method6374(var5);

                     for(var3.field2818 += client.field710; var3.field2818 > var6.frameLengths[var3.field2817]; WorldMapRegion.method5554(var3)) {
                        var3.field2818 -= var6.frameLengths[var3.field2817];
                        ++var3.field2817;
                        if(var3.field2817 >= var6.frameIDs.length) {
                           var3.field2817 -= var6.frameStep;
                           if(var3.field2817 < 0 || var3.field2817 >= var6.frameIDs.length) {
                              var3.field2817 = 0;
                           }
                        }
                     }
                  }
               }

               if(var3.field2745 != 0 && !var3.isIf3) {
                  int var8 = var3.field2745 >> 16;
                  var5 = var3.field2745 << 16 >> 16;
                  var8 *= client.field710;
                  var5 *= client.field710;
                  var3.xan2d = var8 + var3.xan2d & 2047;
                  var3.yan2d = var5 + var3.yan2d & 2047;
                  WorldMapRegion.method5554(var3);
               }
            }
         }
      }

   }
}
