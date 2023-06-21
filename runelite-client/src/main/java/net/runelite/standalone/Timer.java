package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fl")
public abstract class Timer {
   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "42"
   )
   public abstract void vmethod6050();

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(III)I",
      garbageValue = "-87101012"
   )
   public abstract int vmethod6053(int var1, int var2);

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "(II)Lje;",
      garbageValue = "1931076582"
   )
   public static HitmarkType method1740(int var0) {
      HitmarkType var1 = (HitmarkType)HitmarkType.hitmarkTypeCache.method635((long)var0);
      if(var1 != null) {
         return var1;
      } else {
         byte[] var2 = HitmarkType.field3430.method4115(32, var0, -1289956579);
         var1 = new HitmarkType();
         if(var2 != null) {
            var1.method4019(new Packet(var2));
         }

         HitmarkType.hitmarkTypeCache.method628(var1, (long)var0);
         return var1;
      }
   }
}
