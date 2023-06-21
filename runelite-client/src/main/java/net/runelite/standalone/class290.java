package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cg")
public class class290 {
   @ObfuscatedName("r")
   @ObfuscatedSignature(
      signature = "Lia;"
   )
   static ComponentType field1119;

   @ObfuscatedName("ij")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;Ljava/lang/String;IIIII)V",
      garbageValue = "2003861513"
   )
   public static final void method5964(String var0, String var1, int var2, int var3, int var4, int var5) {
      ItemContainer.method3950(var0, var1, var2, var3, var4, var5, false);
   }

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      signature = "(IIIB)I",
      garbageValue = "4"
   )
   static int method5963(int var0, int var1, int var2) {
      return (class91.tileSettings[var0][var1][var2] & 8) != 0?0:(var0 > 0 && (class91.tileSettings[1][var1][var2] & 2) != 0?var0 - 1:var0);
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      signature = "(II)I",
      garbageValue = "-1199433318"
   )
   static int method5962(int var0) {
      ChatLineBuffer var1 = (ChatLineBuffer)ChatHistory.chatLineMap.get(Integer.valueOf(var0));
      return var1 == null?0:var1.method4818();
   }
}
