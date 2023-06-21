package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dz")
public class SoundTask implements Runnable {
   @ObfuscatedName("jt")
   @ObfuscatedSignature(
      signature = "Lia;"
   )
   static ComponentType field1417;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = -183199
   )
   public static int field1418;
   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "[Lcz;"
   )
   volatile AbstractSoundSystem[] systems;

   SoundTask() {
      this.systems = new AbstractSoundSystem[2];
   }

   public void run() {
      try {
         for(int var1 = 0; var1 < 2; ++var1) {
            AbstractSoundSystem var2 = this.systems[var1];
            if(var2 != null) {
               var2.method1747();
            }
         }
      } catch (Exception var4) {
         VertexNormal.method4110((String)null, var4, (byte)-87);
      }

   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(II)Ljt;",
      garbageValue = "1853214968"
   )
   public static Varbit method6413(int var0) {
      Varbit var1 = (Varbit)Varbit.varbits.method635((long)var0);
      if(var1 != null) {
         return var1;
      } else {
         byte[] var2 = Varbit.varbit_ref.method4115(14, var0, 1062597372);
         var1 = new Varbit();
         if(var2 != null) {
            var1.method933(new Packet(var2));
         }

         Varbit.varbits.method628(var1, (long)var0);
         return var1;
      }
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(II)Ljh;",
      garbageValue = "819592038"
   )
   public static Spotanim method6414(int var0) {
      Spotanim var1 = (Spotanim)Spotanim.spotanims.method635((long)var0);
      if(var1 != null) {
         return var1;
      } else {
         byte[] var2 = Spotanim.SpotAnimationDefinition_indexCache.method4115(13, var0, 243114690);
         var1 = new Spotanim();
         var1.id = var0;
         if(var2 != null) {
            var1.method359(new Packet(var2));
         }

         Spotanim.spotanims.method628(var1, (long)var0);
         return var1;
      }
   }
}
