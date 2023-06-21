package net.runelite.standalone;

import java.util.Iterator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hw")
public class IterableDualNodeQueue implements Iterable {
   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "Lho;"
   )
   public CacheableNode sentinel;
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "Lho;"
   )
   CacheableNode field2533;

   public IterableDualNodeQueue() {
      this.sentinel = new CacheableNode();
      this.sentinel.previous = this.sentinel;
      this.sentinel.next = this.sentinel;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "()Lho;"
   )
   CacheableNode method4671() {
      CacheableNode var1 = this.field2533;
      if(var1 == this.sentinel) {
         this.field2533 = null;
         return null;
      } else {
         this.field2533 = var1.previous;
         return var1;
      }
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "()Lho;"
   )
   CacheableNode method4670() {
      return this.method4693((CacheableNode)null);
   }

   @ObfuscatedName("a")
   public void method4679() {
      while(this.sentinel.previous != this.sentinel) {
         this.sentinel.previous.method1606();
      }

   }

   public Iterator iterator() {
      return new class156(this);
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(Lho;)V"
   )
   public void method4672(CacheableNode var1) {
      if(var1.next != null) {
         var1.method1606();
      }

      var1.next = this.sentinel.next;
      var1.previous = this.sentinel;
      var1.next.previous = var1;
      var1.previous.next = var1;
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      signature = "(Lho;)Lho;"
   )
   CacheableNode method4693(CacheableNode var1) {
      CacheableNode var2;
      if(var1 == null) {
         var2 = this.sentinel.previous;
      } else {
         var2 = var1;
      }

      if(var2 == this.sentinel) {
         this.field2533 = null;
         return null;
      } else {
         this.field2533 = var2.previous;
         return var2;
      }
   }

   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "()Lho;"
   )
   CacheableNode method4673() {
      CacheableNode var1 = this.sentinel.previous;
      if(var1 == this.sentinel) {
         return null;
      } else {
         var1.method1606();
         return var1;
      }
   }
}
