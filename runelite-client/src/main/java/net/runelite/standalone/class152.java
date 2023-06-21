package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ds")
public class class152 {
   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "Lht;"
   )
   HashTable field1423;
   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "Liz;"
   )
   Js5Index sfx_index;
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "Liz;"
   )
   Js5Index vorbis_index;
   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "Lht;"
   )
   HashTable field1421;

   @ObfuscatedSignature(
      signature = "(Liz;Liz;)V"
   )
   public class152(Js5Index var1, Js5Index var2) {
      this.field1421 = new HashTable(256);
      this.field1423 = new HashTable(256);
      this.sfx_index = var1;
      this.vorbis_index = var2;
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(I[IB)Lce;",
      garbageValue = "-65"
   )
   public RawAudioNode method2198(int var1, int[] var2) {
      if(this.vorbis_index.method4127() == 1) {
         return this.method2196(0, var1, var2);
      } else if(this.vorbis_index.method4112(var1) == 1) {
         return this.method2196(var1, 0, var2);
      } else {
         throw new RuntimeException();
      }
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "(II[II)Lce;",
      garbageValue = "-2079723063"
   )
   RawAudioNode method2202(int var1, int var2, int[] var3) {
      int var4 = var2 ^ (var1 << 4 & 65535 | var1 >>> 12);
      var4 |= var1 << 16;
      long var5 = (long)var4;
      RawAudioNode var7 = (RawAudioNode)this.field1423.method6335(var5);
      if(var7 != null) {
         return var7;
      } else if(var3 != null && var3[0] <= 0) {
         return null;
      } else {
         SoundEffect var8 = SoundEffect.method4985(this.sfx_index, var1, var2);
         if(var8 == null) {
            return null;
         } else {
            var7 = var8.method4998();
            this.field1423.method6344(var7, var5);
            if(var3 != null) {
               var3[0] -= var7.audioBuffer.length;
            }

            return var7;
         }
      }
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(II[II)Lce;",
      garbageValue = "36371229"
   )
   RawAudioNode method2196(int var1, int var2, int[] var3) {
      int var4 = var2 ^ (var1 << 4 & 65535 | var1 >>> 12);
      var4 |= var1 << 16;
      long var5 = (long)var4 ^ 4294967296L;
      RawAudioNode var7 = (RawAudioNode)this.field1423.method6335(var5);
      if(var7 != null) {
         return var7;
      } else if(var3 != null && var3[0] <= 0) {
         return null;
      } else {
         class227 var8 = (class227)this.field1421.method6335(var5);
         if(var8 == null) {
            var8 = class227.method4311(this.vorbis_index, var1, var2);
            if(var8 == null) {
               return null;
            }

            this.field1421.method6344(var8, var5);
         }

         var7 = var8.method4313(var3);
         if(var7 == null) {
            return null;
         } else {
            var8.method432();
            this.field1423.method6344(var7, var5);
            return var7;
         }
      }
   }

   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "(I[II)Lce;",
      garbageValue = "-915277422"
   )
   public RawAudioNode method2197(int var1, int[] var2) {
      if(this.sfx_index.method4127() == 1) {
         return this.method2202(0, var1, var2);
      } else if(this.sfx_index.method4112(var1) == 1) {
         return this.method2202(var1, 0, var2);
      } else {
         throw new RuntimeException();
      }
   }
}
