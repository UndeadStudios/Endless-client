package net.runelite.standalone;

import java.util.Comparator;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lk")
public class class187 implements Comparator {
   @ObfuscatedName("qp")
   @ObfuscatedGetter(
      intValue = -1868141335
   )
   static int field3842;
   @ObfuscatedName("a")
   final boolean field3841;

   public class187(boolean var1) {
      this.field3841 = var1;
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "(Lkn;Lkn;B)I",
      garbageValue = "15"
   )
   int method3570(Nameable var1, Nameable var2) {
      return this.field3841?var1.vmethod6266(var2):var2.vmethod6266(var1);
   }

   public int compare(Object var1, Object var2) {
      return this.method3570((Nameable)var1, (Nameable)var2);
   }

   public boolean equals(Object var1) {
      return super.equals(var1);
   }
}
