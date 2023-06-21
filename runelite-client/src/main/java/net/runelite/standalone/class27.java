package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eq")
public class class27 extends class133 {
   @ObfuscatedName("dm")
   @ObfuscatedSignature(
      signature = "Lin;"
   )
   static Js5 clientscripts;
   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "Llv;"
   )
   static IndexedSprite field1974;
   @ObfuscatedName("a")
   final boolean field1973;

   public class27(boolean var1) {
      this.field1973 = var1;
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "(Lkl;Lkl;B)I",
      garbageValue = "-68"
   )
   int method471(ChatPlayer var1, ChatPlayer var2) {
      return var2.rank != var1.rank?(this.field1973?var1.rank - var2.rank:var2.rank - var1.rank):this.method1960(var1, var2);
   }

   public int compare(Object var1, Object var2) {
      return this.method471((ChatPlayer)var1, (ChatPlayer)var2);
   }
}
