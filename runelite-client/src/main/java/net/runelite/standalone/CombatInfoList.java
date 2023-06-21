package net.runelite.standalone;

import java.util.Iterator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.api.RSCombatInfoList;
import net.runelite.rs.api.RSNode;

@ObfuscatedName("hj")
public class CombatInfoList implements Iterable, RSCombatInfoList {
   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "Lhy;"
   )
   Node node;
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "Lhy;"
   )
   Node current;

   public CombatInfoList() {
      this.node = new Node();
      this.node.next = this.node;
      this.node.previous = this.node;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(Lhy;)Lhy;"
   )
   Node method4726(Node var1) {
      Node var2;
      if(var1 == null) {
         var2 = this.node.next;
      } else {
         var2 = var1;
      }

      if(var2 == this.node) {
         this.current = null;
         return null;
      } else {
         this.current = var2.next;
         return var2;
      }
   }

   @ObfuscatedName("m")
   public boolean method4705() {
      return this.node.next == this.node;
   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "()Lhy;"
   )
   public Node method4704() {
      Node var1 = this.current;
      if(var1 == this.node) {
         this.current = null;
         return null;
      } else {
         this.current = var1.next;
         return var1;
      }
   }

   @ObfuscatedName("a")
   public void method4698() {
      while(this.node.next != this.node) {
         this.node.next.method432();
      }

   }

   public Iterator iterator() {
      return new class123(this);
   }

   public RSNode getNode() {
      return this.node;
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(Lhy;)V"
   )
   public void method4699(Node var1) {
      if(var1.previous != null) {
         var1.method432();
      }

      var1.previous = this.node.previous;
      var1.next = this.node;
      var1.previous.next = var1;
      var1.next.previous = var1;
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      signature = "()Lhy;"
   )
   public Node method4703() {
      return this.method4726((Node)null);
   }

   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "(Lhy;)V"
   )
   public void method4697(Node var1) {
      if(var1.previous != null) {
         var1.method432();
      }

      var1.previous = this.node;
      var1.next = this.node.next;
      var1.previous.next = var1;
      var1.next.previous = var1;
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(Lhy;Lhy;)V"
   )
   public static void method4701(Node var0, Node var1) {
      if(var0.previous != null) {
         var0.method432();
      }

      var0.previous = var1;
      var0.next = var1.next;
      var0.previous.next = var0;
      var0.next.previous = var0;
   }
}
