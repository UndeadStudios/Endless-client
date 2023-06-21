package net.runelite.standalone;

import java.awt.Image;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("aw")
public class class129 {
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "Liz;"
   )
   public static Js5Index field278;
   @ObfuscatedName("cp")
   public static char currentTypedKey;
   @ObfuscatedName("at")
   static Image field280;
   @ObfuscatedName("dj")
   @ObfuscatedSignature(
      signature = "Lin;"
   )
   static Js5 interfacesArchive;
   @ObfuscatedName("gy")
   static int[] landMapFileIds;

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;ZZI)V",
      garbageValue = "-1788470211"
   )
   public static void method1898(String var0, boolean var1, boolean var2) {
      NPCType.method4806(var0, var1, "openjs", var2);
   }

   @ObfuscatedName("gf")
   @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "-25482427"
   )
   static boolean method1897() {
      return (client.playerNameMask & 2) != 0;
   }
}
