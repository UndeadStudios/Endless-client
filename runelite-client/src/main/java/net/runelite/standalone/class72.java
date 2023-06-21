package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("el")
public class class72 extends class133 {
   @ObfuscatedName("cp")
   @ObfuscatedSignature(
      signature = "Lbn;"
   )
   static MouseRecorder mouseRecorder;
   @ObfuscatedName("a")
   final boolean field1971;

   public class72(boolean var1) {
      this.field1971 = var1;
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "(Lkl;Lkl;I)I",
      garbageValue = "-1753472867"
   )
   int method1042(ChatPlayer var1, ChatPlayer var2) {
      return var2.world != var1.world?(this.field1971?var1.world - var2.world:var2.world - var1.world):this.method1960(var1, var2);
   }

   public int compare(Object var1, Object var2) {
      return this.method1042((ChatPlayer)var1, (ChatPlayer)var2);
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(Liz;Ljava/lang/String;Ljava/lang/String;B)[Lld;",
      garbageValue = "53"
   )
   public static SpritePixels[] method1035(Js5Index var0, String var1, String var2) {
      int var3 = var0.method4132(var1);
      int var4 = var0.method4137(var3, var2);
      return Bit.method2676(var0, var3, var4);
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "412289791"
   )
   static void method1041() {
      FileOnDisk var0 = null;

      try {
         var0 = class244.method4645("", TradingPost.field38.name, true);
         Packet var1 = class312.options.method1079();
         var0.method5050(var1.payload, 0, var1.offset);
      } catch (Exception var3) {
         ;
      }

      try {
         if(var0 != null) {
            var0.method5052(true);
         }
      } catch (Exception var2) {
         ;
      }

   }
}
