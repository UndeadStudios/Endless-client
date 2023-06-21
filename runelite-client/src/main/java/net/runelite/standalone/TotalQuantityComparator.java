package net.runelite.standalone;

import java.util.Comparator;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("q")
final class TotalQuantityComparator implements Comparator {
   @ObfuscatedName("qv")
   @ObfuscatedSignature(
      signature = "Lcn;"
   )
   static class185 field60;
   @ObfuscatedName("v")
   @ObfuscatedSignature(
      signature = "Lgx;"
   )
   public static Packet NetCache_reference;
   @ObfuscatedName("n")
   @ObfuscatedSignature(
      signature = "Llv;"
   )
   static IndexedSprite field57;
   @ObfuscatedName("t")
   @ObfuscatedSignature(
      signature = "Lig;"
   )
   public static FileRequest currentRequest;
   @ObfuscatedName("kb")
   @ObfuscatedGetter(
      intValue = 1598381831
   )
   static int menuY;
   @ObfuscatedName("ez")
   @ObfuscatedGetter(
      intValue = 332825983
   )
   static int field59;

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "(Lm;Lm;I)I",
      garbageValue = "806214979"
   )
   int method1110(GrandExchangeEvent var1, GrandExchangeEvent var2) {
      return var1.grandExchangeOffer.totalQuantity < var2.grandExchangeOffer.totalQuantity?-1:(var2.grandExchangeOffer.totalQuantity == var1.grandExchangeOffer.totalQuantity?0:1);
   }

   public int compare(Object var1, Object var2) {
      return this.method1110((GrandExchangeEvent)var1, (GrandExchangeEvent)var2);
   }

   public boolean equals(Object var1) {
      return super.equals(var1);
   }

   @ObfuscatedName("hz")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "698596186"
   )
   static void method1112() {
      client.menuOptionCount = 0;
      client.onMenuOptionsChanged(-1);
      client.isMenuOpen = false;
   }

   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "(II)I",
      garbageValue = "289268086"
   )
   public static int method1122(int var0) {
      --var0;
      var0 |= var0 >>> 1;
      var0 |= var0 >>> 2;
      var0 |= var0 >>> 4;
      var0 |= var0 >>> 8;
      var0 |= var0 >>> 16;
      return var0 + 1;
   }
}
