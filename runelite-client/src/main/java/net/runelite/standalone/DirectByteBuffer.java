package net.runelite.standalone;

import java.nio.ByteBuffer;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gu")
public class DirectByteBuffer extends AbstractByteBuffer {
   @ObfuscatedName("a")
   ByteBuffer buffer;

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "(I)[B",
      garbageValue = "-1652988831"
   )
   byte[] vmethod6380() {
      byte[] var1 = new byte[this.buffer.capacity()];
      this.buffer.position(0);
      this.buffer.get(var1);
      return var1;
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "([BB)V",
      garbageValue = "-120"
   )
   void vmethod6381(byte[] var1) {
      this.buffer = ByteBuffer.allocateDirect(var1.length);
      this.buffer.position(0);
      this.buffer.put(var1);
   }
}
