package net.runelite.standalone;

import java.util.Comparator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lg")
public class class85 implements Comparator {
   @ObfuscatedName("a")
   final boolean field3843;

   public class85(boolean var1) {
      this.field3843 = var1;
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "(Lkn;Lkn;B)I",
      garbageValue = "0"
   )
   int method1124(Nameable var1, Nameable var2) {
      return this.field3843?var1.method2752().method1533(var2.method2752()):var2.method2752().method1533(var1.method2752());
   }

   public int compare(Object var1, Object var2) {
      return this.method1124((Nameable)var1, (Nameable)var2);
   }

   public boolean equals(Object var1) {
      return super.equals(var1);
   }
}
