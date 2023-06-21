package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eu")
public class class266 extends class133 {
   @ObfuscatedName("q")
   static int[] field1977;
   @ObfuscatedName("a")
   final boolean field1978;

   public class266(boolean var1) {
      this.field1978 = var1;
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "(Lkl;Lkl;I)I",
      garbageValue = "-1065178306"
   )
   int method4999(ChatPlayer var1, ChatPlayer var2) {
      return var1.world != 0 && var2.world != 0?(this.field1978?var1.method2752().method1533(var2.method2752()):var2.method2752().method1533(var1.method2752())):this.method1960(var1, var2);
   }

   public int compare(Object var1, Object var2) {
      return this.method4999((ChatPlayer)var1, (ChatPlayer)var2);
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(III)V",
      garbageValue = "-1808152535"
   )
   public static void method5004(int var0, int var1) {
      Varbit var2 = SoundTask.method6413(var0);
      int var3 = var2.configId;
      int var4 = var2.leastSignificantBit;
      int var5 = var2.mostSignificantBit;
      int var6 = class313.varpsMasks[var5 - var4];
      if(var1 < 0 || var1 > var6) {
         var1 = 0;
      }

      var6 <<= var4;
      class313.clientVarps[var3] = class313.clientVarps[var3] & ~var6 | var1 << var4 & var6;
      client.settingsChanged(var3);
   }

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      signature = "(Lcw;I)V",
      garbageValue = "307543776"
   )
   public static final void method5005(class39 var0) {
      SpotAnimation.field1095 = var0;
   }
}
