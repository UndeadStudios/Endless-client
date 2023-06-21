package net.runelite.standalone;

import java.util.Iterator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gg")
public class class123 implements Iterator {
   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "Lhj;"
   )
   CombatInfoList field2491;
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "Lhy;"
   )
   Node field2492;
   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "Lhy;"
   )
   Node field2490;

   @ObfuscatedSignature(
      signature = "(Lhj;)V"
   )
   class123(CombatInfoList var1) {
      this.field2490 = null;
      this.field2491 = var1;
      this.field2492 = this.field2491.node.next;
      this.field2490 = null;
   }

   public Object next() {
      Node var1 = this.field2492;
      if(var1 == this.field2491.node) {
         var1 = null;
         this.field2492 = null;
      } else {
         this.field2492 = var1.next;
      }

      this.field2490 = var1;
      return var1;
   }

   public boolean hasNext() {
      return this.field2491.node != this.field2492;
   }

   public void remove() {
      if(this.field2490 == null) {
         throw new IllegalStateException();
      } else {
         this.field2490.method432();
         this.field2490 = null;
      }
   }
}
