package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gh")
public class class241 {
   @ObfuscatedName("q")
   public static byte[][] spritePixels;

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(ILcs;ZB)I",
      garbageValue = "123"
   )
   static int method4623(int var0, class314 var1, boolean var2) {
      ComponentType var3 = var2?ClientOptions.field1035:class290.field1119;
      if(var0 == 1700) {
         class281.intStack[++class281.intStackSize - 1] = var3.linkObjType;
         return 1;
      } else if(var0 == 1701) {
         if(var3.linkObjType != -1) {
            class281.intStack[++class281.intStackSize - 1] = var3.linkObjCount;
         } else {
            class281.intStack[++class281.intStackSize - 1] = 0;
         }

         return 1;
      } else if(var0 == 1702) {
         class281.intStack[++class281.intStackSize - 1] = var3.index;
         return 1;
      } else {
         return 2;
      }
   }
}
