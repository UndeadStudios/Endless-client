package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.api.RSCacheableNode;
import net.runelite.rs.api.RSNodeCache;

@ObfuscatedName("gp")
public final class NodeCache implements RSNodeCache {
   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "Lht;"
   )
   HashTable table;
   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "Lho;"
   )
   CacheableNode field2495;
   @ObfuscatedName("s")
   int capacity;
   @ObfuscatedName("h")
   @ObfuscatedSignature(
      signature = "Lgd;"
   )
   Node2LinkedList list;
   @ObfuscatedName("g")
   int remainingCapacity;

   public NodeCache(int var1) {
      this.field2495 = new CacheableNode();
      this.list = new Node2LinkedList();
      this.capacity = var1;
      this.remainingCapacity = var1;

      int var2;
      for(var2 = 1; var2 + var2 < var1; var2 += var2) {
         ;
      }

      this.table = new HashTable(var2);
   }

   @ObfuscatedName("x")
   public void method629() {
      this.list.method1230();
      this.table.method6349();
      this.field2495 = new CacheableNode();
      this.remainingCapacity = this.capacity;
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "(J)Lho;"
   )
   public CacheableNode method635(long var1) {
      CacheableNode var3 = (CacheableNode)this.table.method6335(var1);
      if(var3 != null) {
         this.list.method1226(var3);
      }

      return var3;
   }

   public void setCapacity(int var1) {
      this.capacity = var1;
   }

   public void setRemainingCapacity(int var1) {
      this.remainingCapacity = var1;
   }

   public RSCacheableNode get(long var1) {
      return this.method635(var1);
   }

   public void reset() {
      this.method629();
   }

   @ObfuscatedName("s")
   public void method625(long var1) {
      CacheableNode var3 = (CacheableNode)this.table.method6335(var1);
      if(var3 != null) {
         var3.method432();
         var3.method1606();
         ++this.remainingCapacity;
      }

   }

   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "(Lho;J)V"
   )
   public void method628(CacheableNode var1, long var2) {
      if(this.remainingCapacity == 0) {
         CacheableNode var4 = this.list.method1244();
         var4.method432();
         var4.method1606();
         if(var4 == this.field2495) {
            var4 = this.list.method1244();
            var4.method432();
            var4.method1606();
         }
      } else {
         --this.remainingCapacity;
      }

      this.table.method6344(var1, var2);
      this.list.method1226(var1);
   }
}
