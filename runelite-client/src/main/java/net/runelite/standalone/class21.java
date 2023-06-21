package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gq")
public class class21 {
   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;IB)I",
      garbageValue = "33"
   )
   public static int method380(CharSequence var0, CharSequence var1, int var2) {
      int var3 = var0.length();
      int var4 = var1.length();
      int var5 = 0;
      int var6 = 0;
      char var7 = 0;
      char var8 = 0;

      while(var5 - var7 < var3 || var6 - var8 < var4) {
         if(var5 - var7 >= var3) {
            return -1;
         }

         if(var6 - var8 >= var4) {
            return 1;
         }

         char var9;
         if(var7 != 0) {
            var9 = var7;
            boolean var14 = false;
         } else {
            var9 = var0.charAt(var5++);
         }

         char var10;
         if(var8 != 0) {
            var10 = var8;
            boolean var15 = false;
         } else {
            var10 = var1.charAt(var6++);
         }

         var7 = WorldMapType1.method4908(var9);
         var8 = WorldMapType1.method4908(var10);
         var9 = class240.method4597(var9, var2);
         var10 = class240.method4597(var10, var2);
         if(var10 != var9 && Character.toUpperCase(var9) != Character.toUpperCase(var10)) {
            var9 = Character.toLowerCase(var9);
            var10 = Character.toLowerCase(var10);
            if(var9 != var10) {
               return client.method3207(var9, var2) - client.method3207(var10, var2);
            }
         }
      }

      int var16 = Math.min(var3, var4);

      char var12;
      int var17;
      for(var17 = 0; var17 < var16; ++var17) {
         char var11 = var0.charAt(var17);
         var12 = var1.charAt(var17);
         if(var11 != var12 && Character.toUpperCase(var11) != Character.toUpperCase(var12)) {
            var11 = Character.toLowerCase(var11);
            var12 = Character.toLowerCase(var12);
            if(var11 != var12) {
               return client.method3207(var11, var2) - client.method3207(var12, var2);
            }
         }
      }

      var17 = var3 - var4;
      if(var17 != 0) {
         return var17;
      } else {
         for(int var18 = 0; var18 < var16; ++var18) {
            var12 = var0.charAt(var18);
            char var13 = var1.charAt(var18);
            if(var13 != var12) {
               return client.method3207(var12, var2) - client.method3207(var13, var2);
            }
         }

         return 0;
      }
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      signature = "(IIB)I",
      garbageValue = "-124"
   )
   public static int method379(int var0, int var1) {
      int var2;
      for(var2 = 0; var1 > 0; --var1) {
         var2 = var2 << 1 | var0 & 1;
         var0 >>>= 1;
      }

      return var2;
   }

   @ObfuscatedName("kr")
   @ObfuscatedSignature(
      signature = "(IIIILld;Lhk;I)V",
      garbageValue = "-1418612472"
   )
   static final void method377(int var0, int var1, int var2, int var3, SpritePixels var4, class186 var5) {
      if(var4 != null) {
         int var6 = client.mapAngle & 2047;
         int var7 = var3 * var3 + var2 * var2;
         if(var7 <= 6400) {
            int var8 = Graphics3D.SINE[var6];
            int var9 = Graphics3D.COSINE[var6];
            int var10 = var9 * var2 + var3 * var8 >> 16;
            int var11 = var3 * var9 - var8 * var2 >> 16;
            if(var7 > 2500) {
               var4.method1314(var10 + var5.field2641 / 2 - var4.maxWidth / 2, var5.field2640 / 2 - var11 - var4.maxHeight / 2, var0, var1, var5.field2641, var5.field2640, var5.field2643, var5.field2642);
            } else {
               var4.method1311(var0 + var10 + var5.field2641 / 2 - var4.maxWidth / 2, var5.field2640 / 2 + var1 - var11 - var4.maxHeight / 2);
            }

         }
      }
   }
}
