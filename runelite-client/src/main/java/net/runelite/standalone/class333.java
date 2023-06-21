package net.runelite.standalone;

import java.util.Iterator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("g")
final class class333 implements class143 {
   @ObfuscatedName("di")
   @ObfuscatedSignature(
      signature = "Lin;"
   )
   static Js5 instruments;

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/Object;Lgx;B)V",
      garbageValue = "7"
   )
   public void vmethod6420(Object var1, Packet var2) {
      this.method6421((Long)var1, var2);
   }

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/Long;Lgx;B)V",
      garbageValue = "-68"
   )
   void method6421(Long var1, Packet var2) {
      var2.method5075(var1.longValue());
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(Lgx;B)Ljava/lang/Object;",
      garbageValue = "4"
   )
   public Object vmethod6422(Packet var1) {
      return Long.valueOf(var1.method5299());
   }

   @ObfuscatedName("kx")
   @ObfuscatedSignature(
      signature = "(S)V",
      garbageValue = "-6693"
   )
   static final void method6434() {
      Iterator var0 = ChatHistory.messages.iterator();

      while(var0.hasNext()) {
         ChatLine var1 = (ChatLine)var0.next();
         var1.method5892();
      }

      if(MapIconReference.clanMemberManager != null) {
         MapIconReference.clanMemberManager.method2424();
      }

   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "(IIII)Lld;",
      garbageValue = "886887983"
   )
   static SpritePixels method6435(int var0, int var1, int var2) {
      class105 var3 = WorldMapRegion.field255;
      long var4 = (long)(var2 << 16 | var0 << 8 | var1);
      return (SpritePixels)var3.method1521(var4);
   }
}
