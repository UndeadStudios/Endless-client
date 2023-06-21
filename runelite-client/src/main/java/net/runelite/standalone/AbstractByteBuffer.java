package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gl")
public abstract class AbstractByteBuffer {
   @ObfuscatedName("s")
   static boolean directBufferUnavailable;

   static {
      directBufferUnavailable = false;
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "(I)[B",
      garbageValue = "-1652988831"
   )
   abstract byte[] vmethod6380();

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "([BB)V",
      garbageValue = "-120"
   )
   abstract void vmethod6381(byte[] var1);
}
