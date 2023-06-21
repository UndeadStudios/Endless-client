package net.runelite.standalone;

import java.util.Iterator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hr")
public class HashTableIterator implements Iterator {
   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "Lhy;"
   )
   Node head;
   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "Lgs;"
   )
   IterableHashTable table;
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "Lhy;"
   )
   Node tail;
   @ObfuscatedName("g")
   int index;

   @ObfuscatedSignature(
      signature = "(Lgs;)V"
   )
   HashTableIterator(IterableHashTable var1) {
      this.head = null;
      this.table = var1;
      this.method5948();
   }

   public Object next() {
      Node var1;
      if(this.table.buckets[this.index - 1] != this.tail) {
         var1 = this.tail;
         this.tail = var1.next;
         this.head = var1;
         return var1;
      } else {
         do {
            if(this.index >= this.table.size) {
               return null;
            }

            var1 = this.table.buckets[this.index++].next;
         } while(var1 == this.table.buckets[this.index - 1]);

         this.tail = var1.next;
         this.head = var1;
         return var1;
      }
   }

   public boolean hasNext() {
      if(this.table.buckets[this.index - 1] != this.tail) {
         return true;
      } else {
         while(this.index < this.table.size) {
            if(this.table.buckets[this.index++].next != this.table.buckets[this.index - 1]) {
               this.tail = this.table.buckets[this.index - 1].next;
               return true;
            }

            this.tail = this.table.buckets[this.index - 1];
         }

         return false;
      }
   }

   public void remove() {
      if(this.head == null) {
         throw new IllegalStateException();
      } else {
         this.head.method432();
         this.head = null;
      }
   }

   @ObfuscatedName("h")
   void method5948() {
      this.tail = this.table.buckets[0].next;
      this.index = 1;
      this.head = null;
   }
}
