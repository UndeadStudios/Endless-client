package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("x")
public class class101 implements Enumerated {
   @ObfuscatedName("b")
   public static short[][] field10;
   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "Lx;"
   )
   static final class101 field15;
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "Lx;"
   )
   static final class101 field17;
   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "Lx;"
   )
   static final class101 field16;
   @ObfuscatedName("f")
   final Class field12;
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = -657392563
   )
   final int field13;
   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "La;"
   )
   final class143 field11;
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      intValue = -1135647025
   )
   public final int field14;

   static {
      field15 = new class101(0, 0, Integer.class, new class285());
      field17 = new class101(2, 1, Long.class, new class333());
      field16 = new class101(1, 2, String.class, new class312());
   }

   @ObfuscatedSignature(
      signature = "(IILjava/lang/Class;La;)V"
   )
   class101(int var1, int var2, Class var3, class143 var4) {
      this.field13 = var1;
      this.field14 = var2;
      this.field12 = var3;
      this.field11 = var4;
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "-303219076"
   )
   public int vmethod6373() {
      return this.field14;
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      signature = "(Lgx;I)Ljava/lang/Object;",
      garbageValue = "-738071612"
   )
   public Object method1443(Packet var1) {
      return this.field11.vmethod6422(var1);
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "(B)[Lx;",
      garbageValue = "-1"
   )
   public static class101[] method1451() {
      return new class101[]{field15, field16, field17};
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/Class;I)Lx;",
      garbageValue = "-1128344202"
   )
   public static class101 method1440(Class var0) {
      class101[] var1 = method1451();

      for(int var2 = 0; var2 < var1.length; ++var2) {
         class101 var3 = var1[var2];
         if(var3.field12 == var0) {
            return var3;
         }
      }

      return null;
   }

   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/Class;I)La;",
      garbageValue = "-426670667"
   )
   public static class143 method1448(Class var0) {
      class101 var1 = method1440(var0);
      if(var1 == null) {
         throw new IllegalArgumentException();
      } else {
         return var1.field11;
      }
   }
}
