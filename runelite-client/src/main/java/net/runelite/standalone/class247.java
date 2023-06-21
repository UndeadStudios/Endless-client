package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lw")
public class class247 {
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "Liz;"
   )
   Js5Index field3945;
   @ObfuscatedName("m")
   boolean loaded;
   @ObfuscatedName("p")
   @ObfuscatedGetter(
      intValue = -233880955
   )
   int field3946;
   @ObfuscatedName("h")
   String field3944;

   @ObfuscatedSignature(
      signature = "(Liz;)V"
   )
   class247(Js5Index var1) {
      this.field3946 = 0;
      this.loaded = false;
      this.field3945 = var1;
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "-1395461702"
   )
   int method4656() {
      return this.field3946;
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;B)V",
      garbageValue = "0"
   )
   void method4653(String var1) {
      if(var1 != null && !var1.isEmpty()) {
         if(var1 != this.field3944) {
            this.field3944 = var1;
            this.field3946 = 0;
            this.loaded = false;
            this.method4664();
         }
      }
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(B)I",
      garbageValue = "13"
   )
   int method4664() {
      if(this.field3946 < 33) {
         if(!this.field3945.method4136(WorldMapDataGroup.field303.name, this.field3944)) {
            return this.field3946;
         }

         this.field3946 = 33;
      }

      if(this.field3946 == 33) {
         if(this.field3945.method4134(WorldMapDataGroup.field304.name, this.field3944) && !this.field3945.method4136(WorldMapDataGroup.field304.name, this.field3944)) {
            return this.field3946;
         }

         this.field3946 = 66;
      }

      if(this.field3946 == 66) {
         if(!this.field3945.method4136(this.field3944, WorldMapDataGroup.field306.name)) {
            return this.field3946;
         }

         this.field3946 = 100;
         this.loaded = true;
      }

      return this.field3946;
   }

   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "-410531808"
   )
   boolean method4663() {
      return this.loaded;
   }
}
