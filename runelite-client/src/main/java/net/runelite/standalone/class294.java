package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lo")
public enum class294 implements Enumerated {
   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "Llo;"
   )
   field3837(6, 0),
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "Llo;"
   )
   field3830(7, 1),
   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "Llo;"
   )
   field3831(0, 2),
   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "Llo;"
   )
   field3832(4, 3),
   @ObfuscatedName("h")
   @ObfuscatedSignature(
      signature = "Llo;"
   )
   field3833(2, 4),
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "Llo;"
   )
   field3835(5, 5),
   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "Llo;"
   )
   field3836(1, 6),
   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "Llo;"
   )
   field3829(3, 7),
   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "Llo;"
   )
   field3834(8, 8);

   @ObfuscatedName("b")
   @ObfuscatedGetter(
      intValue = 1542794005
   )
   final int field3838;
   @ObfuscatedName("n")
   @ObfuscatedGetter(
      intValue = 979563861
   )
   final int field3839;

   class294(int var3, int var4) {
      this.field3838 = var3;
      this.field3839 = var4;
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "-303219076"
   )
   public int vmethod6373() {
      return this.field3839;
   }

   @ObfuscatedName("ae")
   @ObfuscatedSignature(
      signature = "(ILcs;ZI)I",
      garbageValue = "491075880"
   )
   static int method5993(int var0, class314 var1, boolean var2) {
      int var3;
      int var4;
      if(var0 == 4000) {
         class281.intStackSize -= 2;
         var3 = class281.intStack[class281.intStackSize];
         var4 = class281.intStack[class281.intStackSize + 1];
         class281.intStack[++class281.intStackSize - 1] = var4 + var3;
         return 1;
      } else if(var0 == 4001) {
         class281.intStackSize -= 2;
         var3 = class281.intStack[class281.intStackSize];
         var4 = class281.intStack[class281.intStackSize + 1];
         class281.intStack[++class281.intStackSize - 1] = var3 - var4;
         return 1;
      } else if(var0 == 4002) {
         class281.intStackSize -= 2;
         var3 = class281.intStack[class281.intStackSize];
         var4 = class281.intStack[class281.intStackSize + 1];
         class281.intStack[++class281.intStackSize - 1] = var3 * var4;
         return 1;
      } else if(var0 == 4003) {
         class281.intStackSize -= 2;
         var3 = class281.intStack[class281.intStackSize];
         var4 = class281.intStack[class281.intStackSize + 1];
         class281.intStack[++class281.intStackSize - 1] = var3 / var4;
         return 1;
      } else if(var0 == 4004) {
         var3 = class281.intStack[--class281.intStackSize];
         class281.intStack[++class281.intStackSize - 1] = (int)(Math.random() * (double)var3);
         return 1;
      } else if(var0 == 4005) {
         var3 = class281.intStack[--class281.intStackSize];
         class281.intStack[++class281.intStackSize - 1] = (int)(Math.random() * (double)(var3 + 1));
         return 1;
      } else if(var0 == 4006) {
         class281.intStackSize -= 5;
         var3 = class281.intStack[class281.intStackSize];
         var4 = class281.intStack[class281.intStackSize + 1];
         int var5 = class281.intStack[class281.intStackSize + 2];
         int var6 = class281.intStack[class281.intStackSize + 3];
         int var7 = class281.intStack[class281.intStackSize + 4];
         class281.intStack[++class281.intStackSize - 1] = var3 + (var7 - var5) * (var4 - var3) / (var6 - var5);
         return 1;
      } else if(var0 == 4007) {
         class281.intStackSize -= 2;
         var3 = class281.intStack[class281.intStackSize];
         var4 = class281.intStack[class281.intStackSize + 1];
         class281.intStack[++class281.intStackSize - 1] = var3 + var3 * var4 / 100;
         return 1;
      } else if(var0 == 4008) {
         class281.intStackSize -= 2;
         var3 = class281.intStack[class281.intStackSize];
         var4 = class281.intStack[class281.intStackSize + 1];
         class281.intStack[++class281.intStackSize - 1] = var3 | 1 << var4;
         return 1;
      } else if(var0 == 4009) {
         class281.intStackSize -= 2;
         var3 = class281.intStack[class281.intStackSize];
         var4 = class281.intStack[class281.intStackSize + 1];
         class281.intStack[++class281.intStackSize - 1] = var3 & -1 - (1 << var4);
         return 1;
      } else if(var0 == 4010) {
         class281.intStackSize -= 2;
         var3 = class281.intStack[class281.intStackSize];
         var4 = class281.intStack[class281.intStackSize + 1];
         class281.intStack[++class281.intStackSize - 1] = (var3 & 1 << var4) != 0?1:0;
         return 1;
      } else if(var0 == 4011) {
         class281.intStackSize -= 2;
         var3 = class281.intStack[class281.intStackSize];
         var4 = class281.intStack[class281.intStackSize + 1];
         class281.intStack[++class281.intStackSize - 1] = var3 % var4;
         return 1;
      } else if(var0 == 4012) {
         class281.intStackSize -= 2;
         var3 = class281.intStack[class281.intStackSize];
         var4 = class281.intStack[class281.intStackSize + 1];
         if(var3 == 0) {
            class281.intStack[++class281.intStackSize - 1] = 0;
         } else {
            class281.intStack[++class281.intStackSize - 1] = (int)Math.pow((double)var3, (double)var4);
         }

         return 1;
      } else if(var0 == 4013) {
         class281.intStackSize -= 2;
         var3 = class281.intStack[class281.intStackSize];
         var4 = class281.intStack[class281.intStackSize + 1];
         if(var3 == 0) {
            class281.intStack[++class281.intStackSize - 1] = 0;
            return 1;
         } else {
            switch(var4) {
            case 0:
               class281.intStack[++class281.intStackSize - 1] = Integer.MAX_VALUE;
               break;
            case 1:
               class281.intStack[++class281.intStackSize - 1] = var3;
               break;
            case 2:
               class281.intStack[++class281.intStackSize - 1] = (int)Math.sqrt((double)var3);
               break;
            case 3:
               class281.intStack[++class281.intStackSize - 1] = (int)Math.cbrt((double)var3);
               break;
            case 4:
               class281.intStack[++class281.intStackSize - 1] = (int)Math.sqrt(Math.sqrt((double)var3));
               break;
            default:
               class281.intStack[++class281.intStackSize - 1] = (int)Math.pow((double)var3, 1.0D / (double)var4);
            }

            return 1;
         }
      } else if(var0 == 4014) {
         class281.intStackSize -= 2;
         var3 = class281.intStack[class281.intStackSize];
         var4 = class281.intStack[class281.intStackSize + 1];
         class281.intStack[++class281.intStackSize - 1] = var3 & var4;
         return 1;
      } else if(var0 == 4015) {
         class281.intStackSize -= 2;
         var3 = class281.intStack[class281.intStackSize];
         var4 = class281.intStack[class281.intStackSize + 1];
         class281.intStack[++class281.intStackSize - 1] = var3 | var4;
         return 1;
      } else if(var0 == 4018) {
         class281.intStackSize -= 3;
         long var9 = (long)class281.intStack[class281.intStackSize];
         long var11 = (long)class281.intStack[class281.intStackSize + 1];
         long var13 = (long)class281.intStack[class281.intStackSize + 2];
         class281.intStack[++class281.intStackSize - 1] = (int)(var13 * var9 / var11);
         return 1;
      } else {
         return 2;
      }
   }
}
