package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cx")
public enum AttackOpPriority implements Enumerated {
   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "Lcx;"
   )
   COMBAT_LEVEL_BASED(0),
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "Lcx;"
   )
   UNPRIORITISED(1),
   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "Lcx;"
   )
   PRIORITISED(2),
   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "Lcx;"
   )
   HIDDEN(3);

   @ObfuscatedName("h")
   @ObfuscatedGetter(
      intValue = 1462687381
   )
   final int id;

   AttackOpPriority(int var3) {
      this.id = var3;
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "-303219076"
   )
   public int vmethod6373() {
      return this.id;
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(B)Lld;",
      garbageValue = "104"
   )
   static SpritePixels method1554() {
      SpritePixels var0 = new SpritePixels();
      var0.maxWidth = class96.indexedSpriteWidth;
      var0.maxHeight = class96.indexedSpriteHeight;
      var0.offsetX = class96.indexedSpriteOffsetXs[0];
      var0.offsetY = GameCanvas.indexedSpriteOffsetYs[0];
      var0.width = class96.indexSpriteWidths[0];
      var0.height = class96.indexedSpriteHeights[0];
      int var1 = var0.height * var0.width;
      byte[] var2 = class241.spritePixels[0];
      var0.pixels = new int[var1];

      for(int var3 = 0; var3 < var1; ++var3) {
         var0.pixels[var3] = class96.indexedSpritePalette[var2[var3] & 255];
      }

      class43.method648();
      return var0;
   }

   @ObfuscatedName("s")
   public static double method1549(double var0, double var2, double var4) {
      return ProjectileAnimation.method4016((var0 - var2) / var4) / var4;
   }

   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "(III)V",
      garbageValue = "-238565961"
   )
   static void method1553(int var0, int var1) {
      long var2 = (long)((var0 << 16) + var1);
      FileRequest var4 = (FileRequest)class321.NetCache_pendingWrites.method6335(var2);
      if(var4 != null) {
         class321.NetCache_pendingWritesQueue.method1228(var4);
      }
   }
}
