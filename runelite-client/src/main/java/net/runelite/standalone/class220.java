package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hp")
public class class220 {
   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "Lhh;"
   )
   class26 field2518;
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "Lhh;"
   )
   class26 field2519;

   public class220() {
      this.field2518 = new class26();
      this.field2518.field2520 = this.field2518;
      this.field2518.field2521 = this.field2518;
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "(Lhh;)V"
   )
   public void method4234(class26 var1) {
      if(var1.field2521 != null) {
         var1.method466();
      }

      var1.field2521 = this.field2518.field2521;
      var1.field2520 = this.field2518;
      var1.field2521.field2520 = var1;
      var1.field2520.field2521 = var1;
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "()Lhh;"
   )
   public class26 method4233() {
      class26 var1 = this.field2518.field2520;
      if(var1 == this.field2518) {
         this.field2519 = null;
         return null;
      } else {
         this.field2519 = var1.field2520;
         return var1;
      }
   }

   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "()Lhh;"
   )
   public class26 method4229() {
      class26 var1 = this.field2519;
      if(var1 == this.field2518) {
         this.field2519 = null;
         return null;
      } else {
         this.field2519 = var1.field2520;
         return var1;
      }
   }
}
