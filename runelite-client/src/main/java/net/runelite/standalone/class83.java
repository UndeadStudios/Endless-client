package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ee")
public class class83 extends class133 {
   @ObfuscatedName("q")
   static int[][] field1963;
   @ObfuscatedName("m")
   public static int[] field1964;
   @ObfuscatedName("a")
   final boolean field1966;

   public class83(boolean var1) {
      this.field1966 = var1;
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "(Lkl;Lkl;S)I",
      garbageValue = "1500"
   )
   int method1108(ChatPlayer var1, ChatPlayer var2) {
      if(var1.world != 0) {
         if(var2.world == 0) {
            return this.field1966?-1:1;
         }
      } else if(var2.world != 0) {
         return this.field1966?1:-1;
      }

      return this.method1960(var1, var2);
   }

   public int compare(Object var1, Object var2) {
      return this.method1108((ChatPlayer)var1, (ChatPlayer)var2);
   }

   @ObfuscatedName("fw")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "37"
   )
   static final void method1109() {
      int[] var0 = PlayerList.highResolutionPlayerIndexes;

      int var1;
      for(var1 = 0; var1 < PlayerList.highResolutionPlayerCount; ++var1) {
         PlayerEntity var2 = client.players[var0[var1]];
         if(var2 != null && var2.overheadTextCyclesRemaining > 0) {
            --var2.overheadTextCyclesRemaining;
            if(var2.overheadTextCyclesRemaining == 0) {
               var2.overhead = null;
               var2.overheadTextChanged(-1);
            }
         }
      }

      for(var1 = 0; var1 < client.highResolutionNpcCount; ++var1) {
         int var4 = client.highResolutionNpcIndexes[var1];
         NPCEntity var3 = client.npcs[var4];
         if(var3 != null && var3.overheadTextCyclesRemaining > 0) {
            --var3.overheadTextCyclesRemaining;
            if(var3.overheadTextCyclesRemaining == 0) {
               var3.overhead = null;
               var3.overheadTextChanged(-1);
            }
         }
      }

   }
}
