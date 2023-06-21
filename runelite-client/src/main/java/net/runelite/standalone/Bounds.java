package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lh")
public class Bounds {
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = -1694776703
   )
   public int field3847;
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      intValue = 1276157069
   )
   public int field3844;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = 1562129035
   )
   public int field3845;
   @ObfuscatedName("g")
   @ObfuscatedGetter(
      intValue = 845191259
   )
   public int field3846;

   public Bounds(int var1, int var2, int var3, int var4) {
      this.method478(var1, var2);
      this.method477(var3, var4);
   }

   public Bounds(int var1, int var2) {
      this(0, 0, var1, var2);
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(B)I",
      garbageValue = "-1"
   )
   int method482() {
      return this.field3844 + this.field3846;
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(Llh;Llh;I)V",
      garbageValue = "1976659149"
   )
   void method489(Bounds var1, Bounds var2) {
      var2.field3844 = this.field3844;
      var2.field3846 = this.field3846;
      if(this.field3844 < var1.field3844) {
         var2.field3846 -= var1.field3844 - this.field3844;
         var2.field3844 = var1.field3844;
      }

      if(var2.method482() > var1.method482()) {
         var2.field3846 -= var2.method482() - var1.method482();
      }

      if(var2.field3846 < 0) {
         var2.field3846 = 0;
      }

   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "-1922771504"
   )
   int method483() {
      return this.field3845 + this.field3847;
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "(III)V",
      garbageValue = "1888943780"
   )
   public void method478(int var1, int var2) {
      this.field3844 = var1;
      this.field3845 = var2;
   }

   public String toString() {
      return null;
   }

   public String aal() {
      return null;
   }

   public String aas() {
      return null;
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(IIB)V",
      garbageValue = "-39"
   )
   public void method477(int var1, int var2) {
      this.field3846 = var1;
      this.field3847 = var2;
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      signature = "(Llh;Llh;I)V",
      garbageValue = "679391064"
   )
   void method479(Bounds var1, Bounds var2) {
      var2.field3845 = this.field3845;
      var2.field3847 = this.field3847;
      if(this.field3845 < var1.field3845) {
         var2.field3847 -= var1.field3845 - this.field3845;
         var2.field3845 = var1.field3845;
      }

      if(var2.method483() > var1.method483()) {
         var2.field3847 -= var2.method483() - var1.method483();
      }

      if(var2.field3847 < 0) {
         var2.field3847 = 0;
      }

   }

   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "(Llh;Llh;I)V",
      garbageValue = "399654881"
   )
   public void method496(Bounds var1, Bounds var2) {
      this.method489(var1, var2);
      this.method479(var1, var2);
   }
}
