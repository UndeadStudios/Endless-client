package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ce")
public class RawAudioNode extends AbstractIntegerNode0 {
   @ObfuscatedName("x")
   int endPosition;
   @ObfuscatedName("a")
   public int sampleRate;
   @ObfuscatedName("s")
   public byte[] audioBuffer;
   @ObfuscatedName("h")
   public boolean field1373;
   @ObfuscatedName("g")
   public int startPosition;

   RawAudioNode(int var1, byte[] var2, int var3, int var4) {
      this.sampleRate = var1;
      this.audioBuffer = var2;
      this.startPosition = var3;
      this.endPosition = var4;
   }

   RawAudioNode(int var1, byte[] var2, int var3, int var4, boolean var5) {
      this.sampleRate = var1;
      this.audioBuffer = var2;
      this.startPosition = var3;
      this.endPosition = var4;
      this.field1373 = var5;
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "(Ldn;)Lce;"
   )
   public RawAudioNode method6320(Resampler var1) {
      this.audioBuffer = var1.method142(this.audioBuffer);
      this.sampleRate = var1.method132(this.sampleRate);
      if(this.startPosition == this.endPosition) {
         this.startPosition = this.endPosition = var1.method133(this.startPosition);
      } else {
         this.startPosition = var1.method133(this.startPosition);
         this.endPosition = var1.method133(this.endPosition);
         if(this.startPosition == this.endPosition) {
            --this.startPosition;
         }
      }

      return this;
   }
}
