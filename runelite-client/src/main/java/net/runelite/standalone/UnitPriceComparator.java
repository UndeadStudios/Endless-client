package net.runelite.standalone;

import java.util.Comparator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("n")
final class UnitPriceComparator implements Comparator {
   @ObfuscatedName("r")
   @ObfuscatedSignature(
      signature = "Llv;"
   )
   static IndexedSprite field78;

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "(Lm;Lm;I)I",
      garbageValue = "965460013"
   )
   int method2278(GrandExchangeEvent var1, GrandExchangeEvent var2) {
      return var1.grandExchangeOffer.price < var2.grandExchangeOffer.price?-1:(var2.grandExchangeOffer.price == var1.grandExchangeOffer.price?0:1);
   }

   public int compare(Object var1, Object var2) {
      return this.method2278((GrandExchangeEvent)var1, (GrandExchangeEvent)var2);
   }

   public boolean equals(Object var1) {
      return super.equals(var1);
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "(Liz;B)V",
      garbageValue = "66"
   )
   public static void method2283(Js5Index var0) {
      Varbit.varbit_ref = var0;
   }

   @ObfuscatedName("jk")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "-2052973203"
   )
   static final void method2288(int var0) {
      if(ChatLine.method5915(var0)) {
         ComponentType[] var1 = ComponentType.interfaces[var0];

         for(int var2 = 0; var2 < var1.length; ++var2) {
            ComponentType var3 = var1[var2];
            if(var3 != null) {
               var3.field2817 = 0;
               var3.field2818 = 0;
            }
         }

      }
   }

   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "(III)Lia;",
      garbageValue = "1364610049"
   )
   public static ComponentType method2289(int var0, int var1) {
      ComponentType var2 = ChatHistory.method6246(var0);
      return var1 == -1?var2:(var2 != null && var2.children != null && var1 < var2.children.length?var2.children[var1]:null);
   }
}
