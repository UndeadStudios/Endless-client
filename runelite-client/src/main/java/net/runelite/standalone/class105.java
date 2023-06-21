package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ha")
public final class class105 {
   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "Lhw;"
   )
   IterableDualNodeQueue field2501;
   @ObfuscatedName("a")
   int field2499;
   @ObfuscatedName("s")
   int field2500;
   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "Lgs;"
   )
   IterableHashTable field2498;

   public class105(int var1, int var2) {
      this.field2501 = new IterableDualNodeQueue();
      this.field2499 = var1;
      this.field2500 = var1;

      int var3;
      for(var3 = 1; var3 + var3 < var1 && var3 < var2; var3 += var3) {
         ;
      }

      this.field2498 = new IterableHashTable(var3);
   }

   @ObfuscatedName("f")
   public void method1514() {
      this.field2501.method4679();
      this.field2498.method2180();
      this.field2500 = this.field2499;
   }

   @ObfuscatedName("x")
   public void method1524(Object var1, long var2, int var4) {
      if(var4 > this.field2499) {
         throw new IllegalStateException();
      } else {
         this.method1510(var2);
         this.field2500 -= var4;

         while(this.field2500 < 0) {
            class260 var5 = (class260)this.field2501.method4673();
            this.method1511(var5);
         }

         class146 var6 = new class146(var1, var4);
         this.field2498.method2186(var6, var2);
         this.field2501.method4672(var6);
         var6.field2516 = 0L;
      }
   }

   @ObfuscatedName("a")
   public Object method1521(long var1) {
      class260 var3 = (class260)this.field2498.method2178(var1);
      if(var3 == null) {
         return null;
      } else {
         Object var4 = var3.vmethod4874();
         if(var4 == null) {
            var3.method432();
            var3.method1606();
            this.field2500 += var3.field2527;
            return null;
         } else {
            if(var3.vmethod4869()) {
               class146 var5 = new class146(var4, var3.field2527);
               this.field2498.method2186(var5, var3.hash);
               this.field2501.method4672(var5);
               var5.field2516 = 0L;
               var3.method432();
               var3.method1606();
            } else {
               this.field2501.method4672(var3);
               var3.field2516 = 0L;
            }

            return var4;
         }
      }
   }

   @ObfuscatedName("s")
   void method1510(long var1) {
      class260 var3 = (class260)this.field2498.method2178(var1);
      this.method1511(var3);
   }

   @ObfuscatedName("h")
   public void method1513(int var1) {
      for(class260 var2 = (class260)this.field2501.method4670(); var2 != null; var2 = (class260)this.field2501.method4671()) {
         if(var2.vmethod4869()) {
            if(var2.vmethod4874() == null) {
               var2.method432();
               var2.method1606();
               this.field2500 += var2.field2527;
            }
         } else if(++var2.field2516 > (long)var1) {
            class45 var3 = new class45(var2.vmethod4874(), var2.field2527);
            this.field2498.method2186(var3, var2.hash);
            Node2LinkedList.method1229(var3, var2);
            var2.method432();
            var2.method1606();
         }
      }

   }

   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "(Lhg;)V"
   )
   void method1511(class260 var1) {
      if(var1 != null) {
         var1.method432();
         var1.method1606();
         this.field2500 += var1.field2527;
      }

   }
}
