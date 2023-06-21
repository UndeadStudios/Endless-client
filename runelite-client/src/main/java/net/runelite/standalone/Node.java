package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.api.RSNode;

@ObfuscatedName("hy")
public class Node implements RSNode {
   @ObfuscatedName("ck")
   @ObfuscatedSignature(
      signature = "Lhy;"
   )
   Node previous;
   @ObfuscatedName("co")
   public long hash;
   @ObfuscatedName("cr")
   @ObfuscatedSignature(
      signature = "Lhy;"
   )
   public Node next;

   protected Node() {
      this.rl$$init();
   }

   @ObfuscatedName("kl")
   public void method432() {
      this.rl$unlink();
      if(this.previous != null) {
         this.previous.next = this.next;
         this.next.previous = this.previous;
         this.next = null;
         this.previous = null;
      }
   }

   public void onUnlink() {
   }

   public void rl$unlink() {
      this.onUnlink();
   }

   private void rl$$init() {
   }

   public long getHash() {
      return this.hash;
   }

   public RSNode getNext() {
      return this.next;
   }

   public RSNode getPrevious() {
      return this.previous;
   }

   public void unlink() {
      this.method432();
   }

   @ObfuscatedName("ko")
   public boolean method433() {
      return this.previous != null;
   }
}
