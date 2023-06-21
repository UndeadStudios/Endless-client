package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bp")
public class class142 {
   @ObfuscatedName("hq")
   @ObfuscatedGetter(
      intValue = 806214979
   )
   static int cameraYaw;
   @ObfuscatedName("da")
   @ObfuscatedSignature(
      signature = "Lin;"
   )
   static Js5 maps;
   @ObfuscatedName("dx")
   @ObfuscatedSignature(
      signature = "Lin;"
   )
   static Js5 synths;
   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "Lin;"
   )
   final Js5 field544;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = -1652610261
   )
   final int field538;
   @ObfuscatedName("g")
   @ObfuscatedGetter(
      intValue = 1280592929
   )
   int field539;

   @ObfuscatedSignature(
      signature = "(Lin;Ljava/lang/String;)V"
   )
   class142(Js5 var1, String var2) {
      this.field539 = 0;
      this.field544 = var1;
      this.field538 = var1.method4127();
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "-41022117"
   )
   boolean method2036() {
      this.field539 = 0;

      for(int var1 = 0; var1 < this.field538; ++var1) {
         if(!this.field544.method2726(var1) || this.field544.method2725(var1)) {
            ++this.field539;
         }
      }

      return this.field539 >= this.field538;
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "(II)Lln;",
      garbageValue = "671804644"
   )
   public static class16 method2033(int var0) {
      class16[] var1 = new class16[]{class16.field3814, class16.field3813, class16.field3812};
      class16[] var2 = var1;

      for(int var3 = 0; var3 < var2.length; ++var3) {
         class16 var4 = var2[var3];
         if(var0 == var4.field3811) {
            return var4;
         }
      }

      return null;
   }
}
