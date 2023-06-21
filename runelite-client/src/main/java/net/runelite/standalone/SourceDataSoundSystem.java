package net.runelite.standalone;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ap")
public class SourceDataSoundSystem extends AbstractSoundSystem {
   @ObfuscatedName("x")
   byte[] bytes;
   @ObfuscatedName("a")
   AudioFormat audioFormat;
   @ObfuscatedName("s")
   SourceDataLine source;
   @ObfuscatedName("g")
   @ObfuscatedGetter(
      intValue = 1111177813
   )
   int size;

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "31"
   )
   protected void vmethod6072() {
      this.source.flush();
   }

   @ObfuscatedName("x")
   protected void vmethod6075() {
      int var1 = 256;
      if(ContextMenuRow.audioHighMemory) {
         var1 <<= 1;
      }

      for(int var2 = 0; var2 < var1; ++var2) {
         int var3 = super.samples[var2];
         if((var3 + 8388608 & -16777216) != 0) {
            var3 = 8388607 ^ var3 >> 31;
         }

         this.bytes[var2 * 2] = (byte)(var3 >> 8);
         this.bytes[var2 * 2 + 1] = (byte)(var3 >> 16);
      }

      this.source.write(this.bytes, 0, var1 << 1);
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "1700298966"
   )
   protected void vmethod6091() {
      this.audioFormat = new AudioFormat((float)MapIconReference.sampleRate, 16, ContextMenuRow.audioHighMemory?2:1, true, false);
      this.bytes = new byte[256 << (ContextMenuRow.audioHighMemory?2:1)];
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "1638303267"
   )
   protected void vmethod6071(int var1) throws LineUnavailableException {
      try {
         Info var2 = new Info(SourceDataLine.class, this.audioFormat, var1 << (ContextMenuRow.audioHighMemory?2:1));
         this.source = (SourceDataLine)AudioSystem.getLine(var2);
         this.source.open();
         this.source.start();
         this.size = var1;
      } catch (LineUnavailableException var3) {
         if(World.method4980(var1) != 1) {
            this.vmethod6071(TotalQuantityComparator.method1122(var1));
         } else {
            this.source = null;
            throw var3;
         }
      }
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1072337628"
   )
   protected void vmethod6076() {
      if(this.source != null) {
         this.source.close();
         this.source = null;
      }

   }

   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "-1071054090"
   )
   protected int vmethod6074() {
      return this.size - (this.source.available() >> (ContextMenuRow.audioHighMemory?2:1));
   }
}
