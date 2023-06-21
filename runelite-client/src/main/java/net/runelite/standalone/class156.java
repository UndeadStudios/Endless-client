package net.runelite.standalone;

import java.util.Iterator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hm")
public class class156 implements Iterator {
   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "Lhw;"
   )
   IterableDualNodeQueue field2530;
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "Lho;"
   )
   CacheableNode field2529;
   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "Lho;"
   )
   CacheableNode field2531;

   @ObfuscatedSignature(
      signature = "(Lhw;)V"
   )
   class156(IterableDualNodeQueue var1) {
      this.field2531 = null;
      this.field2530 = var1;
      this.field2529 = this.field2530.sentinel.previous;
      this.field2531 = null;
   }

   public Object next() {
      CacheableNode var1 = this.field2529;
      if(var1 == this.field2530.sentinel) {
         var1 = null;
         this.field2529 = null;
      } else {
         this.field2529 = var1.previous;
      }

      this.field2531 = var1;
      return var1;
   }

   public void remove() {
      if(this.field2531 == null) {
         throw new IllegalStateException();
      } else {
         this.field2531.method1606();
         this.field2531 = null;
      }
   }

   public boolean hasNext() {
      return this.field2530.sentinel != this.field2529;
   }
}
