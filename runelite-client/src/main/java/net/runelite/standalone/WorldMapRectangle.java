package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("i")
public final class WorldMapRectangle {
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = -197218667
   )
   int worldMapRegionY;
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      intValue = -243331811
   )
   int worldMapRegionWidth;
   // $FF: synthetic field
   @ObfuscatedSignature(
      signature = "Lav;"
   )
   final WorldMapManager this$0;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = 1916696597
   )
   int worldMapRegionHeight;
   @ObfuscatedName("g")
   @ObfuscatedGetter(
      intValue = -1963308613
   )
   int worldMapRegionX;

   @ObfuscatedSignature(
      signature = "(Lav;)V"
   )
   WorldMapRectangle(WorldMapManager var1) {
      this.this$0 = var1;
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;I)V",
      garbageValue = "2007427462"
   )
   static final void method3817(String var0) {
      class54.method868("Please remove " + var0 + " from your ignore list first");
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(II)I",
      garbageValue = "-2026467059"
   )
   static int method3819(int var0) {
      ChatLine var1 = (ChatLine)ChatHistory.messages.method2178((long)var0);
      return var1 == null?-1:(var1.previous == ChatHistory.field1261.sentinel?-1:((ChatLine)var1.previous).id);
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "(IB)Ljq;",
      garbageValue = "4"
   )
   public static StructType method3818(int var0) {
      StructType var1 = (StructType)StructType.structTypeCache.method635((long)var0);
      if(var1 != null) {
         return var1;
      } else {
         byte[] var2 = StructType.field3414.method4115(34, var0, 758467340);
         var1 = new StructType();
         if(var2 != null) {
            var1.method3055(new Packet(var2));
         }

         var1.method3067();
         StructType.structTypeCache.method628(var1, (long)var0);
         return var1;
      }
   }
}
