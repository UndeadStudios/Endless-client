package net.runelite.standalone;

import java.util.Comparator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ej")
public class class280 implements Comparator {
   @ObfuscatedName("a")
   final boolean field1947;

   public class280(boolean var1) {
      this.field1947 = var1;
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "(Lkl;Lkl;I)I",
      garbageValue = "-2102445057"
   )
   int method5693(ChatPlayer var1, ChatPlayer var2) {
      return this.field1947?var1.field3711 - var2.field3711:var2.field3711 - var1.field3711;
   }

   public int compare(Object var1, Object var2) {
      return this.method5693((ChatPlayer)var1, (ChatPlayer)var2);
   }

   public boolean equals(Object var1) {
      return super.equals(var1);
   }

   @ObfuscatedName("gs")
   @ObfuscatedSignature(
      signature = "(Lbw;I)Z",
      garbageValue = "2133455997"
   )
   static boolean method5703(PlayerEntity var0) {
      if(client.playerNameMask == 0) {
         return false;
      } else {
         boolean var1;
         if(class71.localPlayer != var0) {
            var1 = (client.playerNameMask & 4) != 0;
            boolean var2 = var1;
            if(!var1) {
               boolean var3 = (client.playerNameMask & 1) != 0;
               var2 = var3 && var0.method6002();
            }

            return var2 || class129.method1897() && var0.method6025();
         } else {
            var1 = (client.playerNameMask & 8) != 0;
            return var1;
         }
      }
   }
}
