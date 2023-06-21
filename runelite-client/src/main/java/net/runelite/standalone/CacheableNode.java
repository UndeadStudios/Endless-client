package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.api.RSCacheableNode;

@ObfuscatedName("ho")
public class CacheableNode extends Node implements RSCacheableNode {
   @ObfuscatedName("cw")
   @ObfuscatedSignature(
      signature = "Lho;"
   )
   public CacheableNode previous;
   @ObfuscatedName("cv")
   @ObfuscatedSignature(
      signature = "Lho;"
   )
   public CacheableNode next;
   @ObfuscatedName("cn")
   long field2516;

   @ObfuscatedName("cv")
   public void method1606() {
      if(this.next != null) {
         this.next.previous = this.previous;
         this.previous.next = this.next;
         this.previous = null;
         this.next = null;
      }
   }

   public void unlinkDual() {
      this.method1606();
   }
}
