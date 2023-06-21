package net.runelite.standalone;

import java.util.Comparator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kj")
public abstract class class133 implements Comparator {
   @ObfuscatedName("u")
   public static String[] historicCacheLocations;
   @ObfuscatedName("s")
   Comparator field3697;

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "(Lkn;Lkn;B)I",
      garbageValue = "-16"
   )
   protected final int method1960(Nameable var1, Nameable var2) {
      return this.field3697 == null?0:this.field3697.compare(var1, var2);
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(Ljava/util/Comparator;I)V",
      garbageValue = "-1986086346"
   )
   final void method1969(Comparator var1) {
      if(this.field3697 == null) {
         this.field3697 = var1;
      } else if(this.field3697 instanceof class133) {
         ((class133)this.field3697).method1969(var1);
      }

   }

   public boolean equals(Object var1) {
      return super.equals(var1);
   }
}
