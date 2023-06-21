package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hs")
public class class313 {
   @ObfuscatedName("a")
   static int[] varpsMasks;
   @ObfuscatedName("s")
   public static int[] serverVarps;
   @ObfuscatedName("g")
   public static int[] clientVarps;

   static {
      varpsMasks = new int[32];
      int var0 = 2;

      for(int var1 = 0; var1 < 32; ++var1) {
         varpsMasks[var1] = var0 - 1;
         var0 += var0;
      }

      serverVarps = new int[4000];
      clientVarps = new int[4000];
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-2040686871"
   )
   public static void method6293() {
      VarPlayerType.varplayers.method629();
   }
}
