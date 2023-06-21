package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("if")
public class CoordGrid {
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      intValue = 272303259
   )
   public int z;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = -574898193
   )
   public int x;
   @ObfuscatedName("g")
   @ObfuscatedGetter(
      intValue = 460058505
   )
   public int y;

   @ObfuscatedSignature(
      signature = "(Lif;)V"
   )
   public CoordGrid(CoordGrid var1) {
      this.z = var1.z;
      this.x = var1.x;
      this.y = var1.y;
   }

   public CoordGrid(int var1, int var2, int var3) {
      this.z = var1;
      this.x = var2;
      this.y = var3;
   }

   public CoordGrid(int var1) {
      if(var1 == -1) {
         this.z = -1;
      } else {
         this.z = var1 >> 28 & 3;
         this.x = var1 >> 14 & 16383;
         this.y = var1 & 16383;
      }

   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "463455646"
   )
   public int method886() {
      return this.z << 28 | this.x << 14 | this.y;
   }

   public boolean equals(Object var1) {
      return this == var1?true:(!(var1 instanceof CoordGrid)?false:this.method887((CoordGrid)var1));
   }

   public int hashCode() {
      return this.method886();
   }

   public String toString() {
      return this.method889(",");
   }

   public String aal() {
      return this.method889(",");
   }

   public String aas() {
      return this.method889(",");
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(Lif;I)Z",
      garbageValue = "657125561"
   )
   boolean method887(CoordGrid var1) {
      return this.z != var1.z?false:(this.x != var1.x?false:this.y == var1.y);
   }

   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;B)Ljava/lang/String;",
      garbageValue = "58"
   )
   String method889(String var1) {
      return this.z + var1 + (this.x >> 6) + var1 + (this.y >> 6) + var1 + (this.x & 63) + var1 + (this.y & 63);
   }

   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "([Lbu;II[I[II)V",
      garbageValue = "1369283776"
   )
   static void method901(World[] var0, int var1, int var2, int[] var3, int[] var4) {
      if(var1 < var2) {
         int var5 = var1 - 1;
         int var6 = var2 + 1;
         int var7 = (var2 + var1) / 2;
         World var8 = var0[var7];
         var0[var7] = var0[var1];
         var0[var1] = var8;

         while(var5 < var6) {
            boolean var9 = true;

            int var10;
            int var11;
            int var12;
            do {
               --var6;

               for(var10 = 0; var10 < 4; ++var10) {
                  if(var3[var10] == 2) {
                     var11 = var0[var6].index;
                     var12 = var8.index;
                  } else if(var3[var10] == 1) {
                     var11 = var0[var6].playerCount;
                     var12 = var8.playerCount;
                     if(var11 == -1 && var4[var10] == 1) {
                        var11 = 2001;
                     }

                     if(var12 == -1 && var4[var10] == 1) {
                        var12 = 2001;
                     }
                  } else if(var3[var10] == 3) {
                     var11 = var0[var6].method4949()?1:0;
                     var12 = var8.method4949()?1:0;
                  } else {
                     var11 = var0[var6].id;
                     var12 = var8.id;
                  }

                  if(var12 != var11) {
                     if((var4[var10] != 1 || var11 <= var12) && (var4[var10] != 0 || var11 >= var12)) {
                        var9 = false;
                     }
                     break;
                  }

                  if(var10 == 3) {
                     var9 = false;
                  }
               }
            } while(var9);

            var9 = true;

            do {
               ++var5;

               for(var10 = 0; var10 < 4; ++var10) {
                  if(var3[var10] == 2) {
                     var11 = var0[var5].index;
                     var12 = var8.index;
                  } else if(var3[var10] == 1) {
                     var11 = var0[var5].playerCount;
                     var12 = var8.playerCount;
                     if(var11 == -1 && var4[var10] == 1) {
                        var11 = 2001;
                     }

                     if(var12 == -1 && var4[var10] == 1) {
                        var12 = 2001;
                     }
                  } else if(var3[var10] == 3) {
                     var11 = var0[var5].method4949()?1:0;
                     var12 = var8.method4949()?1:0;
                  } else {
                     var11 = var0[var5].id;
                     var12 = var8.id;
                  }

                  if(var12 != var11) {
                     if((var4[var10] != 1 || var11 >= var12) && (var4[var10] != 0 || var11 <= var12)) {
                        var9 = false;
                     }
                     break;
                  }

                  if(var10 == 3) {
                     var9 = false;
                  }
               }
            } while(var9);

            if(var5 < var6) {
               World var13 = var0[var5];
               var0[var5] = var0[var6];
               var0[var6] = var13;
            }
         }

         method901(var0, var1, var6, var3, var4);
         method901(var0, var6 + 1, var2, var3, var4);
      }

   }
}
