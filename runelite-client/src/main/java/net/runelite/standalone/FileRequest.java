package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ig")
public class FileRequest extends CacheableNode {
   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "Lin;"
   )
   public Js5 index;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = 751928619
   )
   public int crc;
   @ObfuscatedName("g")
   public byte padding;

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1297014009"
   )
   public static void method1170() {
      HeadbarType.field3386.method629();
      HeadbarType.field3387.method629();
   }

   @ObfuscatedName("k")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1875544085"
   )
   static final void method1172() {
      class54.method868("You can\'t add yourself to your own ignore list");
   }

   @ObfuscatedName("hu")
   @ObfuscatedSignature(
      signature = "(Lbj;B)V",
      garbageValue = "33"
   )
   static final void method1171(PendingSpawn var0) {
      long var1 = 0L;
      int var3 = -1;
      int var4 = 0;
      int var5 = 0;
      if(var0.type == 0) {
         var1 = class312.sceneManager.method3720(var0.level, var0.x, var0.y);
      }

      if(var0.type == 1) {
         var1 = class312.sceneManager.method3648(var0.level, var0.x, var0.y);
      }

      if(var0.type == 2) {
         var1 = class312.sceneManager.method3649(var0.level, var0.x, var0.y);
      }

      if(var0.type == 3) {
         var1 = class312.sceneManager.method3713(var0.level, var0.x, var0.y);
      }

      if(0L != var1) {
         int var6 = class312.sceneManager.method3651(var0.level, var0.x, var0.y, var1);
         var3 = Resampler.method143(var1);
         var4 = var6 & 31;
         var5 = var6 >> 6 & 3;
      }

      var0.field930 = var3;
      var0.field936 = var4;
      var0.field927 = var5;
   }
}
