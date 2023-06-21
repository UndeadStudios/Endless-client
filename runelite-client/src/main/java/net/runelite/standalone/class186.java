package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hk")
public class class186 extends CacheableNode {
   @ObfuscatedName("x")
   public final int[] field2643;
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      intValue = 456307015
   )
   public final int field2641;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = 190259019
   )
   public final int field2640;
   @ObfuscatedName("g")
   public final int[] field2642;

   class186(int var1, int var2, int[] var3, int[] var4, int var5) {
      this.field2641 = var1;
      this.field2640 = var2;
      this.field2642 = var3;
      this.field2643 = var4;
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "(III)Z",
      garbageValue = "-1390915948"
   )
   public boolean method3566(int var1, int var2) {
      if(var2 >= 0 && var2 < this.field2643.length) {
         int var3 = this.field2643[var2];
         if(var1 >= var3 && var1 <= var3 + this.field2642[var2]) {
            return true;
         }
      }

      return false;
   }

   @ObfuscatedName("b")
   @ObfuscatedSignature(
      signature = "(Lia;IIIB)V",
      garbageValue = "69"
   )
   static final void method3568(ComponentType var0, int var1, int var2, int var3) {
      if(var0.opKeyRates == null) {
         throw new RuntimeException();
      } else {
         var0.opKeyRates[var1] = var2;
         var0.field2754[var1] = var3;
      }
   }

   @ObfuscatedName("as")
   @ObfuscatedSignature(
      signature = "(Ljy;B)Z",
      garbageValue = "-128"
   )
   static boolean method3569(LocType var0) {
      if(var0.multiLocs != null) {
         int[] var1 = var0.multiLocs;

         for(int var2 = 0; var2 < var1.length; ++var2) {
            int var3 = var1[var2];
            LocType var4 = GrandExchangeOffer.method1736(var3);
            if(var4.mapelement != -1) {
               return true;
            }
         }
      } else if(var0.mapelement != -1) {
         return true;
      }

      return false;
   }
}
