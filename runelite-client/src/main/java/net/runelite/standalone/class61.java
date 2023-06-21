package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bs")
public final class class61 extends Node {
   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "Lhv;"
   )
   static Deque field1061;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = -437401471
   )
   int field1062;
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "Ldt;"
   )
   class166 field1050;
   @ObfuscatedName("e")
   int[] field1054;
   @ObfuscatedName("r")
   @ObfuscatedSignature(
      signature = "Ljy;"
   )
   LocType field1064;
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = -807786543
   )
   int field1053;
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = 1613863125
   )
   int field1057;
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      intValue = -1314334491
   )
   int field1056;
   @ObfuscatedName("p")
   @ObfuscatedGetter(
      intValue = -1992310679
   )
   int field1055;
   @ObfuscatedName("b")
   @ObfuscatedSignature(
      signature = "Ldt;"
   )
   class166 field1058;
   @ObfuscatedName("n")
   @ObfuscatedGetter(
      intValue = -1014964059
   )
   int field1063;
   @ObfuscatedName("t")
   @ObfuscatedGetter(
      intValue = 66985199
   )
   int field1066;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = -312559283
   )
   int field1059;
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      intValue = 1536927781
   )
   int field1052;
   @ObfuscatedName("g")
   @ObfuscatedGetter(
      intValue = 1251333887
   )
   int field1051;

   static {
      field1061 = new Deque();
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1406079274"
   )
   void method917() {
      int var1 = this.field1053;
      LocType var2 = this.field1064.method395();
      if(var2 != null) {
         this.field1053 = var2.ambientSoundId;
         this.field1056 = var2.int4 * 128;
         this.field1059 = var2.int5;
         this.field1063 = var2.int6;
         this.field1054 = var2.field3451;
      } else {
         this.field1053 = -1;
         this.field1056 = 0;
         this.field1059 = 0;
         this.field1063 = 0;
         this.field1054 = null;
      }

      if(var1 != this.field1053 && this.field1058 != null) {
         TotalQuantityComparator.field60.method3527(this.field1058);
         this.field1058 = null;
      }

   }

   @ObfuscatedName("av")
   @ObfuscatedSignature(
      signature = "([BB)[B",
      garbageValue = "120"
   )
   static final byte[] method920(byte[] var0) {
      Packet var1 = new Packet(var0);
      int var2 = var1.readUnsignedByte();
      int var3 = var1.readInt();
      if(var3 < 0 || Js5Index.field3251 != 0 && var3 > Js5Index.field3251) {
         throw new RuntimeException();
      } else if(var2 == 0) {
         byte[] var4 = new byte[var3];
         var1.method5098(var4, 0, var3);
         return var4;
      } else {
         int var6 = var1.readInt();
         if(var6 < 0 || Js5Index.field3251 != 0 && var6 > Js5Index.field3251) {
            throw new RuntimeException();
         } else {
            byte[] var5 = new byte[var6];
            if(var2 == 1) {
               class278.method5620(var5, var6, var0, var3, 9);
            } else {
               Js5Index.gzip.method3615(var1, var5);
            }

            return var5;
         }
      }
   }

   @ObfuscatedName("ji")
   @ObfuscatedSignature(
      signature = "(III)V",
      garbageValue = "1695815218"
   )
   static final void method923(int var0, int var1) {
      if(ChatLine.method5915(var0)) {
         DecorativeObject.method912(ComponentType.interfaces[var0], var1);
      }
   }
}
