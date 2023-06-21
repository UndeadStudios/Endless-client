package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("j")
public class WorldMapType1 implements WorldMapSectionBase {
   @ObfuscatedName("sk")
   @ObfuscatedSignature(
      signature = "Liq;"
   )
   public static class7 field216;
   @ObfuscatedName("db")
   @ObfuscatedSignature(
      signature = "Lin;"
   )
   static Js5 jingles;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = 759266465
   )
   int field213;
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = -89751177
   )
   int field210;
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = 1218050245
   )
   int field207;
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      intValue = -732185941
   )
   int field215;
   @ObfuscatedName("p")
   @ObfuscatedGetter(
      intValue = -1908347193
   )
   int field204;
   @ObfuscatedName("b")
   @ObfuscatedGetter(
      intValue = 1023412949
   )
   int field209;
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      intValue = 822317281
   )
   int field214;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = 1669145125
   )
   int field205;
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      intValue = -1653980999
   )
   int field208;
   @ObfuscatedName("g")
   @ObfuscatedGetter(
      intValue = 780633471
   )
   int field206;

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(Lgx;B)V",
      garbageValue = "46"
   )
   public void vmethod4912(Packet var1) {
      this.field214 = var1.readUnsignedByte();
      this.field205 = var1.readUnsignedByte();
      this.field206 = var1.readUnsignedShort();
      this.field207 = var1.readUnsignedShort();
      this.field208 = var1.readUnsignedShort();
      this.field213 = var1.readUnsignedShort();
      this.field204 = var1.readUnsignedShort();
      this.field215 = var1.readUnsignedShort();
      this.field210 = var1.readUnsignedShort();
      this.field209 = var1.readUnsignedShort();
      this.method4913();
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(IIIB)[I",
      garbageValue = "103"
   )
   public int[] vmethod4911(int var1, int var2, int var3) {
      if(!this.vmethod4930(var1, var2, var3)) {
         return null;
      } else {
         int[] var4 = new int[]{this.field204 * 64 - this.field206 * 64 + var2, var3 + (this.field215 * 64 - this.field207 * 64)};
         return var4;
      }
   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "-31"
   )
   void method4913() {
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "(Lag;B)V",
      garbageValue = "-123"
   )
   public void vmethod4925(WorldMapData var1) {
      if(var1.minX > this.field204) {
         var1.minX = this.field204;
      }

      if(var1.field232 < this.field210) {
         var1.field232 = this.field210;
      }

      if(var1.minY > this.field215) {
         var1.minY = this.field215;
      }

      if(var1.field236 < this.field209) {
         var1.field236 = this.field209;
      }

   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(IIII)Z",
      garbageValue = "-12219513"
   )
   public boolean vmethod4930(int var1, int var2, int var3) {
      return var1 >= this.field214 && var1 < this.field214 + this.field205?var2 >> 6 >= this.field206 && var2 >> 6 <= this.field208 && var3 >> 6 >= this.field207 && var3 >> 6 <= this.field213:false;
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      signature = "(III)Lif;",
      garbageValue = "-957800253"
   )
   public CoordGrid vmethod4935(int var1, int var2) {
      if(!this.vmethod4910(var1, var2)) {
         return null;
      } else {
         int var3 = this.field206 * 64 - this.field204 * 64 + var1;
         int var4 = this.field207 * 64 - this.field215 * 64 + var2;
         return new CoordGrid(this.field214, var3, var4);
      }
   }

   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "(III)Z",
      garbageValue = "1385272861"
   )
   public boolean vmethod4910(int var1, int var2) {
      return var1 >> 6 >= this.field204 && var1 >> 6 <= this.field210 && var2 >> 6 >= this.field215 && var2 >> 6 <= this.field209;
   }

   @ObfuscatedName("iq")
   @ObfuscatedSignature(
      signature = "(II)Ljava/lang/String;",
      garbageValue = "-1139870648"
   )
   static final String method4932(int var0) {
      String var1 = Integer.toString(var0);

      for(int var2 = var1.length() - 3; var2 > 0; var2 -= 3) {
         var1 = var1.substring(0, var2) + "," + var1.substring(var2);
      }

      return var1.length() > 9?" " + class308.method6152(65408) + var1.substring(0, var1.length() - 8) + "M" + " " + " (" + var1 + ")" + "</col>":(var1.length() > 6?" " + class308.method6152(16777215) + var1.substring(0, var1.length() - 4) + "K" + " " + " (" + var1 + ")" + "</col>":" " + class308.method6152(16776960) + var1 + "</col>");
   }

   @ObfuscatedName("hm")
   @ObfuscatedSignature(
      signature = "(IIIIIIIIIB)V",
      garbageValue = "24"
   )
   static final void method4931(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      PendingSpawn var9 = null;

      for(PendingSpawn var10 = (PendingSpawn) client.pendingSpawns.method3930(); var10 != null; var10 = (PendingSpawn) client.pendingSpawns.method3924()) {
         if(var0 == var10.level && var10.x == var1 && var2 == var10.y && var3 == var10.type) {
            var9 = var10;
            break;
         }
      }

      if(var9 == null) {
         var9 = new PendingSpawn();
         var9.level = var0;
         var9.type = var3;
         var9.x = var1;
         var9.y = var2;
         FileRequest.method1171(var9);
         client.pendingSpawns.method3906(var9);
      }

      var9.id = var4;
      var9.field935 = var5;
      var9.orientation = var6;
      var9.delay = var7;
      var9.hitpoints = var8;
   }

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      signature = "(B)Z",
      garbageValue = "0"
   )
   static final boolean method4933() {
      return class47.Viewport_containsMouse;
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(CI)Z",
      garbageValue = "-1041272142"
   )
   public static boolean method4928(char var0) {
      if((var0 <= 0 || var0 >= 128) && (var0 < 160 || var0 > 255)) {
         if(var0 != 0) {
            char[] var1 = class13.cp1252AsciiExtension;

            for(int var2 = 0; var2 < var1.length; ++var2) {
               char var3 = var1[var2];
               if(var0 == var3) {
                  return true;
               }
            }
         }

         return false;
      } else {
         return true;
      }
   }

   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "(CI)C",
      garbageValue = "-981963683"
   )
   static char method4908(char var0) {
      return (char)(var0 == 198?69:(var0 == 230?101:(var0 == 223?115:(var0 == 338?69:(var0 == 339?'e':'\u0000')))));
   }
}
