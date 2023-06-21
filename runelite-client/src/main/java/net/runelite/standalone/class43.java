package net.runelite.standalone;

import java.security.SecureRandom;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cp")
public class class43 {
   @ObfuscatedName("g")
   @ObfuscatedGetter(
      intValue = 1747641705
   )
   public static int field1230;
   @ObfuscatedName("a")
   ExecutorService field1227;
   @ObfuscatedName("s")
   Future field1226;

   class43() {
      this.field1227 = Executors.newSingleThreadExecutor();
      this.field1226 = this.field1227.submit(new class308());
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "2027143970"
   )
   void method645() {
      this.field1227.shutdown();
      this.field1227 = null;
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(S)Z",
      garbageValue = "-31703"
   )
   boolean method640() {
      return this.field1226.isDone();
   }

   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "(I)Ljava/security/SecureRandom;",
      garbageValue = "1334406452"
   )
   SecureRandom method639() {
      try {
         return (SecureRandom)this.field1226.get();
      } catch (Exception var2) {
         return ChatLineBuffer.method4824();
      }
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1815090329"
   )
   public static void method648() {
      class96.indexedSpriteOffsetXs = null;
      GameCanvas.indexedSpriteOffsetYs = null;
      class96.indexSpriteWidths = null;
      class96.indexedSpriteHeights = null;
      class96.indexedSpritePalette = null;
      class241.spritePixels = null;
   }

   @ObfuscatedName("je")
   @ObfuscatedSignature(
      signature = "(IIIIIIIB)V",
      garbageValue = "-11"
   )
   static final void method641(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      if(ChatLine.method5915(var0)) {
         SoundTaskDataProvider.method6145(ComponentType.interfaces[var0], -1, var1, var2, var3, var4, var5, var6);
      }
   }
}
