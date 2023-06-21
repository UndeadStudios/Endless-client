package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("z")
public class WorldMapDecoration {
   @ObfuscatedName("qy")
   @ObfuscatedGetter(
      intValue = -310179935
   )
   static int field222;
   @ObfuscatedName("pm")
   static boolean field225;
   @ObfuscatedName("gv")
   @ObfuscatedSignature(
      signature = "[Lld;"
   )
   static SpritePixels[] headIconsHint;
   @ObfuscatedName("d")
   public static String osName;
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      intValue = 583557743
   )
   final int objectDefinitionId;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = -2047493595
   )
   final int decoration;
   @ObfuscatedName("g")
   @ObfuscatedGetter(
      intValue = -1582625725
   )
   final int rotation;

   WorldMapDecoration(int var1, int var2, int var3) {
      this.objectDefinitionId = var1;
      this.decoration = var2;
      this.rotation = var3;
   }

   @ObfuscatedName("jb")
   @ObfuscatedSignature(
      signature = "(IB)V",
      garbageValue = "68"
   )
   static final void method2085(int var0) {
      if(ChatLine.method5915(var0)) {
         Resampler.method144(ComponentType.interfaces[var0], -1);
      }
   }

   @ObfuscatedName("fc")
   @ObfuscatedSignature(
      signature = "(Lju;IIII)V",
      garbageValue = "2091066043"
   )
   static void method2084(Sequence var0, int var1, int var2, int var3) {
      if(client.queuedSoundEffectCount < 50 && client.field886 != 0) {
         if(var0.field3628 != null && var1 < var0.field3628.length) {
            int var4 = var0.field3628[var1];
            if(var4 != 0) {
               int var5 = var4 >> 8;
               int var6 = var4 >> 4 & 7;
               int var7 = var4 & 15;
               client.queuedSoundEffectIDs[client.queuedSoundEffectCount] = var5;
               client.unknownSoundValues1[client.queuedSoundEffectCount] = var6;
               client.unknownSoundValues2[client.queuedSoundEffectCount] = 0;
               client.audioEffects[client.queuedSoundEffectCount] = null;
               int var8 = (var2 - 64) / 128;
               int var9 = (var3 - 64) / 128;
               client.soundLocations[client.queuedSoundEffectCount] = var7 + (var9 << 8) + (var8 << 16);
               ++client.queuedSoundEffectCount;
            }
         }
      }
   }
}
