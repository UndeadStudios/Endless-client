package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("l")
public class class31 {
    public static String[] field308;

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(III)I",
      garbageValue = "-660626399"
   )
   static final int method524(int var0, int var1) {
      int var2 = var1 * 57 + var0;
      var2 ^= var2 << 13;
      int var3 = var2 * (var2 * var2 * 15731 + 789221) + 1376312589 & Integer.MAX_VALUE;
      return var3 >> 19 & 255;
   }

   @ObfuscatedName("lg")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1845068165"
   )
   static void method522() {
      if(client.camModeType == 1) {
         client.field845 = true;
      }

   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(IIIII)V",
      garbageValue = "128616806"
   )
   static void method523(int var0, int var1, int var2, int var3) {
      ItemContainer var4 = (ItemContainer)ItemContainer.itemContainers.method6335((long)var0);
      if(var4 == null) {
         var4 = new ItemContainer();
         ItemContainer.itemContainers.method6344(var4, (long)var0);
      }

      if(var4.itemIds.length <= var1) {
         int[] var5 = new int[var1 + 1];
         int[] var6 = new int[var1 + 1];

         int var7;
         for(var7 = 0; var7 < var4.itemIds.length; ++var7) {
            var5[var7] = var4.itemIds[var7];
            var6[var7] = var4.stackSizes[var7];
         }

         for(var7 = var4.itemIds.length; var7 < var1; ++var7) {
            var5[var7] = -1;
            var6[var7] = 0;
         }

         var4.itemIds = var5;
         var4.stackSizes = var6;
         var4.stackSizesChanged(-1);
      }

      var4.itemIds[var1] = var2;
      var4.stackSizes[var1] = var3;
      var4.stackSizesChanged(var1);
   }

   @ObfuscatedName("go")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "-1179599101"
   )
   static int method520() {
      return client.isResized?2:1;
   }
}
