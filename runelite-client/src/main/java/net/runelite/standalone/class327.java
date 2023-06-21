package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ab")
public class class327 {
   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "Lab;"
   )
   static final class327 field268;
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "Lab;"
   )
   static final class327 field269;
   @ObfuscatedName("g")
   @ObfuscatedGetter(
      intValue = 1166337619
   )
   final int field270;

   static {
      field268 = new class327(0);
      field269 = new class327(1);
   }

   class327(int var1) {
      this.field270 = var1;
   }

   @ObfuscatedName("ar")
   @ObfuscatedSignature(
      signature = "(Ldo;I)V",
      garbageValue = "-1176858873"
   )
   static final void method6406(TaskDataNode var0) {
      var0.field1472 = false;
      if(var0.data != null) {
         var0.data.int1 = 0;
      }

      for(TaskDataNode var1 = var0.vmethod5968(); var1 != null; var1 = var0.vmethod5969()) {
         method6406(var1);
      }

   }
}
