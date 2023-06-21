package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ed")
public class class87 extends class133 {
   @ObfuscatedName("dd")
   @ObfuscatedSignature(
      signature = "Lin;"
   )
   static Js5 bases;
   @ObfuscatedName("a")
   final boolean field1958;

   public class87(boolean var1) {
      this.field1958 = var1;
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "(Lkl;Lkl;I)I",
      garbageValue = "-1959354955"
   )
   int method1133(ChatPlayer var1, ChatPlayer var2) {
      return client.world == var1.world && var2.world == client.world?(this.field1958?var1.field3711 - var2.field3711:var2.field3711 - var1.field3711):this.method1960(var1, var2);
   }

   public int compare(Object var1, Object var2) {
      return this.method1133((ChatPlayer)var1, (ChatPlayer)var2);
   }

   @ObfuscatedName("gt")
   @ObfuscatedSignature(
      signature = "(Lbq;IIIIII)V"
   )
   static final void method1134(PathingEntity var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      if(SceneManager.shouldDraw(var0, true)) {
         SceneManager.copy$draw2DExtras(var0, var1, var2, var3, var4, var5, var6);
      }

   }
}
