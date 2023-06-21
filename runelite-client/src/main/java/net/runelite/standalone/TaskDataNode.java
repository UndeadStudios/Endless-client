package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("do")
public abstract class TaskDataNode extends Node {
   @ObfuscatedName("k")
   volatile boolean field1472;
   @ObfuscatedName("o")
   @ObfuscatedSignature(
      signature = "Ldo;"
   )
   TaskDataNode field1469;
   @ObfuscatedName("y")
   @ObfuscatedSignature(
      signature = "Ldj;"
   )
   AbstractIntegerNode0 data;
   @ObfuscatedName("u")
   int field1470;

   protected TaskDataNode() {
      this.field1472 = true;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "()Ldo;"
   )
   protected abstract TaskDataNode vmethod5968();

   @ObfuscatedName("fn")
   final void method5971(int[] var1, int var2, int var3) {
      if(this.field1472) {
         this.vmethod5972(var1, var2, var3);
      } else {
         this.vmethod5976(var3);
      }

   }

   @ObfuscatedName("q")
   protected abstract void vmethod5972(int[] var1, int var2, int var3);

   @ObfuscatedName("m")
   protected abstract int vmethod5970();

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "()Ldo;"
   )
   protected abstract TaskDataNode vmethod5969();

   @ObfuscatedName("n")
   protected abstract void vmethod5976(int var1);

   @ObfuscatedName("ap")
   int vmethod5966() {
      return 255;
   }
}
