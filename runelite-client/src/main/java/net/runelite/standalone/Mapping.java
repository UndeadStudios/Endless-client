package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("dd")
public class Mapping {
   @ObfuscatedName("x")
   int[] field1476;
   @ObfuscatedName("a")
   int field1475;
   @ObfuscatedName("s")
   int mux;
   @ObfuscatedName("g")
   int[] submapFloors;

   Mapping() {
      class227.method4306(16);
      this.field1475 = class227.method4305() != 0?class227.method4306(4) + 1:1;
      if(class227.method4305() != 0) {
         class227.method4306(8);
      }

      class227.method4306(2);
      if(this.field1475 > 1) {
         this.mux = class227.method4306(4);
      }

      this.submapFloors = new int[this.field1475];
      this.field1476 = new int[this.field1475];

      for(int var1 = 0; var1 < this.field1475; ++var1) {
         class227.method4306(8);
         this.submapFloors[var1] = class227.method4306(8);
         this.field1476[var1] = class227.method4306(8);
      }

   }
}
