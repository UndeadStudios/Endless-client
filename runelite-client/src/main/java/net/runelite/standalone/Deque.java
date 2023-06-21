package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.api.RSDeque;
import net.runelite.rs.api.RSNode;

@ObfuscatedName("hv")
public class Deque implements RSDeque {
   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "Lhy;"
   )
   public Node head;
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "Lhy;"
   )
   Node current;

   public Deque() {
      this.head = new Node();
      this.head.next = this.head;
      this.head.previous = this.head;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "()Lhy;"
   )
   public Node method3910() {
      Node var1 = this.head.previous;
      if(var1 == this.head) {
         return null;
      } else {
         var1.method432();
         return var1;
      }
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "()Lhy;"
   )
   public Node method3924() {
      Node var1 = this.current;
      if(var1 == this.head) {
         this.current = null;
         return null;
      } else {
         this.current = var1.next;
         return var1;
      }
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "()Lhy;"
   )
   public Node method3912() {
      Node var1 = this.head.previous;
      if(var1 == this.head) {
         this.current = null;
         return null;
      } else {
         this.current = var1.previous;
         return var1;
      }
   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "()Lhy;"
   )
   public Node method3930() {
      Node var1 = this.head.next;
      if(var1 == this.head) {
         this.current = null;
         return null;
      } else {
         this.current = var1.next;
         return var1;
      }
   }

   @ObfuscatedName("b")
   @ObfuscatedSignature(
      signature = "()Lhy;"
   )
   public Node method3929() {
      Node var1 = this.current;
      if(var1 == this.head) {
         this.current = null;
         return null;
      } else {
         this.current = var1.previous;
         return var1;
      }
   }

   @ObfuscatedName("a")
   public void method3936() {
      while(true) {
         Node var1 = this.head.next;
         if(var1 == this.head) {
            this.current = null;
            return;
         }

         var1.method432();
      }
   }

   public RSNode getHead() {
      return this.head;
   }

   public RSNode getCurrent() {
      return this.current;
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(Lhy;)V"
   )
   public void method3906(Node var1) {
      if(var1.previous != null) {
         var1.method432();
      }

      var1.previous = this.head.previous;
      var1.next = this.head;
      var1.previous.next = var1;
      var1.next.previous = var1;
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      signature = "()Lhy;"
   )
   public Node method3909() {
      Node var1 = this.head.next;
      if(var1 == this.head) {
         return null;
      } else {
         var1.method432();
         return var1;
      }
   }

   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "(Lhy;)V"
   )
   public void method3907(Node var1) {
      if(var1.previous != null) {
         var1.method432();
      }

      var1.previous = this.head;
      var1.next = this.head.next;
      var1.previous.next = var1;
      var1.next.previous = var1;
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(Lhy;Lhy;)V"
   )
   public static void method3913(Node var0, Node var1) {
      if(var0.previous != null) {
         var0.method432();
      }

      var0.previous = var1.previous;
      var0.next = var1;
      var0.previous.next = var0;
      var0.next.previous = var0;
   }
}
