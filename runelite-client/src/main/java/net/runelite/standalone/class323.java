package net.runelite.standalone;

import java.io.IOException;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fq")
public abstract class class323 {
   @ObfuscatedName("ef")
   @ObfuscatedGetter(
      intValue = -280256619
   )
   static int port1;

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "-9"
   )
   public abstract void vmethod6355();

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "([BIIB)I",
      garbageValue = "1"
   )
   public abstract int vmethod6362(byte[] var1, int var2, int var3) throws IOException;

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "(II)Z",
      garbageValue = "1647181248"
   )
   public abstract boolean vmethod6354(int var1) throws IOException;

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(B)I",
      garbageValue = "0"
   )
   public abstract int vmethod6356() throws IOException;

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      signature = "([BIII)V",
      garbageValue = "-1892812584"
   )
   public abstract void vmethod6359(byte[] var1, int var2, int var3) throws IOException;

   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "-827937127"
   )
   public abstract int vmethod6357() throws IOException;

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(III)I",
      garbageValue = "620961949"
   )
   public static int method6372(int var0, int var1) {
      int var2 = var0 >>> 31;
      return (var0 + var2) / var1 - var2;
   }
}
