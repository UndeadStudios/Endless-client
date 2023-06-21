package net.runelite.standalone;

import java.util.LinkedList;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("w")
public abstract class class71 {
   @ObfuscatedName("gw")
   @ObfuscatedSignature(
      signature = "Lld;"
   )
   static SpritePixels mapedge;
   @ObfuscatedName("bg")
   @ObfuscatedGetter(
      intValue = -107724485
   )
   static int field187;
   @ObfuscatedName("jk")
   @ObfuscatedSignature(
      signature = "Lbw;"
   )
   static PlayerEntity localPlayer;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = 380623437
   )
   int field168;
   @ObfuscatedName("l")
   boolean field182;
   @ObfuscatedName("e")
   byte[][][] field179;
   @ObfuscatedName("r")
   @ObfuscatedSignature(
      signature = "[[[[Lz;"
   )
   WorldMapDecoration[][][][] decorations;
   @ObfuscatedName("q")
   short[][][] field188;
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = 92465919
   )
   int field171;
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      intValue = -1228564803
   )
   int field177;
   @ObfuscatedName("p")
   @ObfuscatedGetter(
      intValue = 1961928471
   )
   int field174;
   @ObfuscatedName("b")
   short[][][] field185;
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      intValue = 1326141763
   )
   int field173;
   @ObfuscatedName("n")
   byte[][][] field178;
   @ObfuscatedName("t")
   boolean field181;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = 2034993075
   )
   int field169;
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      intValue = 1158264323
   )
   int field172;
   @ObfuscatedName("g")
   @ObfuscatedGetter(
      intValue = 1401518351
   )
   int field170;

   class71() {
      this.field174 = -1;
      this.field177 = -1;
      new LinkedList();
      this.field181 = false;
      this.field182 = false;
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "-1808199824"
   )
   int method1008() {
      return this.field171;
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "(IILgx;II)V",
      garbageValue = "-1001005003"
   )
   void method1004(int var1, int var2, Packet var3, int var4) {
      boolean var5 = (var4 & 2) != 0;
      if(var5) {
         this.field185[0][var1][var2] = (short)var3.readUnsignedByte();
      }

      this.field188[0][var1][var2] = (short)var3.readUnsignedByte();
   }

   @ObfuscatedName("r")
   @ObfuscatedSignature(
      signature = "(IILgx;II)V",
      garbageValue = "634086853"
   )
   void method1005(int var1, int var2, Packet var3, int var4) {
      int var5 = ((var4 & 24) >> 3) + 1;
      boolean var6 = (var4 & 2) != 0;
      boolean var7 = (var4 & 4) != 0;
      this.field188[0][var1][var2] = (short)var3.readUnsignedByte();
      int var8;
      int var9;
      int var11;
      if(var6) {
         var8 = var3.readUnsignedByte();

         for(var9 = 0; var9 < var8; ++var9) {
            int var10 = var3.readUnsignedByte();
            if(var10 != 0) {
               this.field185[var9][var1][var2] = (short)var10;
               var11 = var3.readUnsignedByte();
               this.field178[var9][var1][var2] = (byte)(var11 >> 2);
               this.field179[var9][var1][var2] = (byte)(var11 & 3);
            }
         }
      }

      if(var7) {
         for(var8 = 0; var8 < var5; ++var8) {
            var9 = var3.readUnsignedByte();
            if(var9 != 0) {
               WorldMapDecoration[] var14 = this.decorations[var8][var1][var2] = new WorldMapDecoration[var9];

               for(var11 = 0; var11 < var9; ++var11) {
                  int var12 = var3.method5287();
                  int var13 = var3.readUnsignedByte();
                  var14[var11] = new WorldMapDecoration(var12, var13 >> 2, var13 & 3);
               }
            }
         }
      }

   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "(Liz;I)V",
      garbageValue = "813443029"
   )
   void method999(Js5Index var1) {
      if(!this.method1000()) {
         byte[] var2 = var1.method4115(this.field174, this.field177, -477087277);
         if(var2 != null) {
            this.vmethod4505(new Packet(var2));
            this.field181 = true;
            this.field182 = true;
         }

      }
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "-1489394427"
   )
   boolean method1000() {
      return this.field181 && this.field182;
   }

   @ObfuscatedName("b")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "2017705586"
   )
   void method1002() {
      this.field188 = null;
      this.field185 = null;
      this.field178 = null;
      this.field179 = null;
      this.decorations = null;
      this.field181 = false;
      this.field182 = false;
   }

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      signature = "(IILgx;B)V",
      garbageValue = "1"
   )
   void method1003(int var1, int var2, Packet var3) {
      int var4 = var3.readUnsignedByte();
      if(var4 != 0) {
         if((var4 & 1) != 0) {
            this.method1004(var1, var2, var3, var4);
         } else {
            this.method1005(var1, var2, var3, var4);
         }

      }
   }

   @ObfuscatedName("t")
   @ObfuscatedSignature(
      signature = "(B)I",
      garbageValue = "-37"
   )
   int method1007() {
      return this.field170;
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(Lgx;I)V",
      garbageValue = "-1814574938"
   )
   abstract void vmethod4505(Packet var1);

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "(II)I",
      garbageValue = "1821835161"
   )
   public static int method1033(int var0) {
      return Resampler.method143(class47.field1740[var0]);
   }

   @ObfuscatedName("o")
   @ObfuscatedSignature(
      signature = "(III)I",
      garbageValue = "-1211256841"
   )
   static final int method1034(int var0, int var1) {
      if(var0 == -1) {
         return 12345678;
      } else {
         var1 = (var0 & 127) * var1 / 128;
         if(var1 < 2) {
            var1 = 2;
         } else if(var1 > 126) {
            var1 = 126;
         }

         return (var0 & 65408) + var1;
      }
   }

   @ObfuscatedName("in")
   @ObfuscatedSignature(
      signature = "(IIIIIIS)V",
      garbageValue = "-16518"
   )
   static final void method1013(int var0, int var1, int var2, int var3, int var4, int var5) {
      int var6 = var2 - var0;
      int var7 = var3 - var1;
      int var8 = var6 >= 0?var6:-var6;
      int var9 = var7 >= 0?var7:-var7;
      int var10 = var8;
      if(var8 < var9) {
         var10 = var9;
      }

      if(var10 != 0) {
         int var11 = (var6 << 16) / var10;
         int var12 = (var7 << 16) / var10;
         if(var12 <= var11) {
            var11 = -var11;
         } else {
            var12 = -var12;
         }

         int var13 = var5 * var12 >> 17;
         int var14 = var5 * var12 + 1 >> 17;
         int var15 = var5 * var11 >> 17;
         int var16 = var5 * var11 + 1 >> 17;
         var0 -= Rasterizer2D.draw_region_x;
         var1 -= Rasterizer2D.drawingAreaTop;
         int var17 = var0 + var13;
         int var18 = var0 - var14;
         int var19 = var0 + var6 - var14;
         int var20 = var0 + var13 + var6;
         int var21 = var15 + var1;
         int var22 = var1 - var16;
         int var23 = var7 + var1 - var16;
         int var24 = var7 + var15 + var1;
         Graphics3D.method2095(var17, var18, var19);
         Graphics3D.method2098(var21, var22, var23, var17, var18, var19, var4);
         Graphics3D.method2095(var17, var19, var20);
         Graphics3D.method2098(var21, var23, var24, var17, var19, var20, var4);
      }
   }

   @ObfuscatedName("jf")
   @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "-1940446669"
   )
   static boolean method1032() {
      return client.field796;
   }

   @ObfuscatedName("u")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "-101"
   )
   static final void method1014() {
      class54.method868("Your ignore list is full. Max of 100 for free users, and 400 for members");
   }
}
