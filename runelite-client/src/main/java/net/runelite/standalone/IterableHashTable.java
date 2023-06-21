package net.runelite.standalone;

import java.util.Iterator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.api.RSIterableHashTable;
import net.runelite.rs.api.RSNode;

@ObfuscatedName("gs")
public final class IterableHashTable implements Iterable, RSIterableHashTable {
   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "Lhy;"
   )
   Node tail;
   @ObfuscatedName("a")
   int size;
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "[Lhy;"
   )
   Node[] buckets;
   @ObfuscatedName("h")
   int index;
   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "Lhy;"
   )
   Node head;

   public IterableHashTable(int var1) {
      this.index = 0;
      this.size = var1;
      this.buckets = new Node[var1];

      for(int var2 = 0; var2 < var1; ++var2) {
         Node var3 = this.buckets[var2] = new Node();
         var3.next = var3;
         var3.previous = var3;
      }

   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "()Lhy;"
   )
   public Node method2181() {
      this.index = 0;
      return this.method2190();
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "(J)Lhy;"
   )
   public Node method2178(long var1) {
      Node var3 = this.buckets[(int)(var1 & (long)(this.size - 1))];

      for(this.head = var3.next; var3 != this.head; this.head = this.head.next) {
         if(this.head.hash == var1) {
            Node var4 = this.head;
            this.head = this.head.next;
            return var4;
         }
      }

      this.head = null;
      return null;
   }

   public Iterator iterator() {
      return new HashTableIterator(this);
   }

   public RSNode get(long var1) {
      return this.method2178(var1);
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(Lhy;J)V"
   )
   public void method2186(Node var1, long var2) {
      if(var1.previous != null) {
         var1.method432();
      }

      Node var4 = this.buckets[(int)(var2 & (long)(this.size - 1))];
      var1.previous = var4.previous;
      var1.next = var4;
      var1.previous.next = var1;
      var1.next.previous = var1;
      var1.hash = var2;
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      signature = "()Lhy;"
   )
   public Node method2190() {
      Node var1;
      if(this.index > 0 && this.buckets[this.index - 1] != this.tail) {
         var1 = this.tail;
         this.tail = var1.next;
         return var1;
      } else {
         do {
            if(this.index >= this.size) {
               return null;
            }

            var1 = this.buckets[this.index++].next;
         } while(var1 == this.buckets[this.index - 1]);

         this.tail = var1.next;
         return var1;
      }
   }

   @ObfuscatedName("g")
   public void method2180() {
      for(int var1 = 0; var1 < this.size; ++var1) {
         Node var2 = this.buckets[var1];

         while(true) {
            Node var3 = var2.next;
            if(var3 == var2) {
               break;
            }

            var3.method432();
         }
      }

      this.head = null;
      this.tail = null;
   }
}
