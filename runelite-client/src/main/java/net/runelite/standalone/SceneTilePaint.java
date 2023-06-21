package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.rs.api.RSSceneTilePaint;

@ObfuscatedName("eb")
public final class SceneTilePaint implements RSSceneTilePaint {
   @ObfuscatedName("f")
   boolean flatShade;
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = 994726533
   )
   int nwColor;
   @ObfuscatedName("p")
   @ObfuscatedGetter(
      intValue = 837082755
   )
   int rgb;
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      intValue = 772918589
   )
   int swColor;
   public int rl$paintModelBufferOffset;
   public int rl$paintModelUvBufferOffset;
   public int rl$paintModelBufferLen;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = 1505559839
   )
   int seColor;
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      intValue = -1130157059
   )
   int texture;
   @ObfuscatedName("g")
   @ObfuscatedGetter(
      intValue = -275155701
   )
   int neColor;

   SceneTilePaint(int var1, int var2, int var3, int var4, int var5, int var6, boolean var7) {
      this.flatShade = true;
      this.swColor = var1;
      this.seColor = var2;
      this.neColor = var3;
      this.nwColor = var4;
      this.texture = var5;
      this.rgb = var6;
      this.flatShade = var7;
      this.rl$$init();
   }

   private void rl$$init() {
   }

   public int getBufferOffset() {
      return this.rl$paintModelBufferOffset;
   }

   public void setBufferOffset(int var1) {
      this.rl$paintModelBufferOffset = var1;
   }

   public int getUvBufferOffset() {
      return this.rl$paintModelUvBufferOffset;
   }

   public void setUvBufferOffset(int var1) {
      this.rl$paintModelUvBufferOffset = var1;
   }

   public int getBufferLen() {
      return this.rl$paintModelBufferLen;
   }

   public void setBufferLen(int var1) {
      this.rl$paintModelBufferLen = var1;
   }

   public int getSwColor() {
      return this.swColor;
   }

   public int getSeColor() {
      return this.seColor;
   }

   public int getNeColor() {
      return this.neColor;
   }

   public int getNwColor() {
      return this.nwColor;
   }

   public int getTexture() {
      return this.texture;
   }

   public int getRBG() {
      return this.rgb;
   }
}
