package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gj")
public class class295 {
   @ObfuscatedName("b")
   @ObfuscatedGetter(
      intValue = 96183287
   )
   static int scriptStringStackSize;
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      longValue = 1670260844569960435L
   )
   static long field2439;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      longValue = -9006316027097542279L
   )
   static long field2437;

   @ObfuscatedName("ga")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1501146909"
   )
   static final void method5996() {
      for(int var0 = 0; var0 < client.highResolutionNpcCount; ++var0) {
         int var1 = client.highResolutionNpcIndexes[var0];
         NPCEntity var2 = client.npcs[var1];
         if(var2 != null) {
            ClientOptions.method1095(var2, var2.type.size);
         }
      }

   }
}
