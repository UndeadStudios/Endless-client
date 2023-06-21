package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("hq")
public class ByteArrayNode extends Node {
   @ObfuscatedName("a")
   public byte[] byteArray;

   public ByteArrayNode(byte[] var1) {
      this.byteArray = var1;
   }
}
