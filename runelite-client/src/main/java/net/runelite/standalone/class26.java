package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hh")
public class class26 {
   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "Lhh;"
   )
   class26 field2520;
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "Lhh;"
   )
   class26 field2521;

   @ObfuscatedName("a")
   public void method466() {
      if(this.field2521 != null) {
         this.field2521.field2520 = this.field2520;
         this.field2520.field2521 = this.field2521;
         this.field2520 = null;
         this.field2521 = null;
      }
   }
}
