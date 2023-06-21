package net.runelite.standalone;

import java.util.Comparator;
import java.util.Iterator;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("r")
final class class54 implements Comparator {
   @ObfuscatedName("er")
   @ObfuscatedGetter(
      intValue = -1082272795
   )
   static int port2;
   @ObfuscatedName("aa")
   static java.awt.Font field87;

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "(Lm;Lm;I)I",
      garbageValue = "1092972650"
   )
   int method867(GrandExchangeEvent var1, GrandExchangeEvent var2) {
      return var1.field49 < var2.field49?-1:(var2.field49 == var1.field49?0:1);
   }

   public int compare(Object var1, Object var2) {
      return this.method867((GrandExchangeEvent)var1, (GrandExchangeEvent)var2);
   }

   public boolean equals(Object var1) {
      return super.equals(var1);
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;I)V",
      garbageValue = "-2138585237"
   )
   static final void method868(String var0) {
      KeyFocusListener.method5934(30, "", var0);
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "(I)Ljava/lang/String;",
      garbageValue = "108553486"
   )
   static String method878() {
      String var0 = "";

      ChatLine var2;
      for(Iterator var1 = ChatHistory.messages.iterator(); var1.hasNext(); var0 = var0 + var2.name + ':' + var2.value + '\n') {
         var2 = (ChatLine)var1.next();
      }

      return var0;
   }
}
