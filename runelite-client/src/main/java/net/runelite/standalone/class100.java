package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ea")
public class class100 extends class133 {
   @ObfuscatedName("a")
   final boolean field1953;

   public class100(boolean var1) {
      this.field1953 = var1;
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "(Lkl;Lkl;I)I",
      garbageValue = "-2049072557"
   )
   int method1433(ChatPlayer var1, ChatPlayer var2) {
      if(client.world == var1.world) {
         if(var2.world != client.world) {
            return this.field1953?-1:1;
         }
      } else if(var2.world == client.world) {
         return this.field1953?1:-1;
      }

      return this.method1960(var1, var2);
   }

   public int compare(Object var1, Object var2) {
      return this.method1433((ChatPlayer)var1, (ChatPlayer)var2);
   }
}
