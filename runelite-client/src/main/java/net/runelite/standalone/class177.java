package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("t")
public class class177 {
   @ObfuscatedName("dc")
   @ObfuscatedSignature(
      signature = "Lin;"
   )
   static Js5 configs;
   @ObfuscatedName("b")
   static int[] floorHues;
   @ObfuscatedName("n")
   @ObfuscatedGetter(
      intValue = -536580295
   )
   static int field98;

   @ObfuscatedName("lf")
   @ObfuscatedSignature(
      signature = "(B)Z",
      garbageValue = "0"
   )
   public static boolean method2854() {
      return client.staffModLevel >= 2;
   }
}
