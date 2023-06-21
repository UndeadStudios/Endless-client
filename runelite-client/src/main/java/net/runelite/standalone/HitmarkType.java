package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("je")
public class HitmarkType extends CacheableNode {
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "Lgp;"
   )
   public static NodeCache field3433;
   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "Lgp;"
   )
   public static NodeCache hitmarkTypeCache;
   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "Liz;"
   )
   public static Js5Index field3430;
   @ObfuscatedName("h")
   @ObfuscatedSignature(
      signature = "Lgp;"
   )
   public static NodeCache field3432;
   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "Liz;"
   )
   public static Js5Index field3438;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = -1098348433
   )
   int field3450;
   @ObfuscatedName("v")
   @ObfuscatedGetter(
      intValue = 1472476449
   )
   public int field3443;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = 2140896517
   )
   int field3435;
   @ObfuscatedName("r")
   @ObfuscatedGetter(
      intValue = 1782291691
   )
   public int field3440;
   @ObfuscatedName("k")
   @ObfuscatedGetter(
      intValue = 1459415255
   )
   public int field3442;
   @ObfuscatedName("w")
   String field3445;
   @ObfuscatedName("ag")
   @ObfuscatedGetter(
      intValue = 324000633
   )
   int multiMarkVarp;
   @ObfuscatedName("o")
   @ObfuscatedGetter(
      intValue = -352581087
   )
   int field3439;
   @ObfuscatedName("z")
   @ObfuscatedGetter(
      intValue = -1219180571
   )
   int multiMarkVarbit;
   @ObfuscatedName("c")
   @ObfuscatedGetter(
      intValue = 121552627
   )
   public int field3444;
   @ObfuscatedName("t")
   @ObfuscatedGetter(
      intValue = 1999103551
   )
   public int field3437;
   @ObfuscatedName("i")
   @ObfuscatedGetter(
      intValue = 363980907
   )
   public int field3429;
   @ObfuscatedName("y")
   @ObfuscatedGetter(
      intValue = 1180576785
   )
   int field3447;
   @ObfuscatedName("d")
   @ObfuscatedGetter(
      intValue = 235856813
   )
   public int field3446;
   @ObfuscatedName("j")
   public int[] multiMark;
   @ObfuscatedName("u")
   @ObfuscatedGetter(
      intValue = 631099461
   )
   int field3436;

   static {
      hitmarkTypeCache = new NodeCache(64);
      field3432 = new NodeCache(64);
      field3433 = new NodeCache(20);
   }

   HitmarkType() {
      this.field3435 = -1;
      this.field3440 = 16777215;
      this.field3437 = 70;
      this.field3450 = -1;
      this.field3439 = -1;
      this.field3436 = -1;
      this.field3447 = -1;
      this.field3442 = 0;
      this.field3443 = 0;
      this.field3446 = -1;
      this.field3445 = "";
      this.field3429 = -1;
      this.field3444 = 0;
      this.multiMarkVarbit = -1;
      this.multiMarkVarp = -1;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(B)Lld;",
      garbageValue = "102"
   )
   public SpritePixels method4022() {
      if(this.field3450 < 0) {
         return null;
      } else {
         SpritePixels var1 = (SpritePixels)field3432.method635((long)this.field3450);
         if(var1 != null) {
            return var1;
         } else {
            var1 = IDKType.method5403(class211.field1991, this.field3450, 0, -753216892);
            if(var1 != null) {
               field3432.method628(var1, (long)this.field3450);
            }

            return var1;
         }
      }
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "(I)Lld;",
      garbageValue = "1532201276"
   )
   public SpritePixels method4046() {
      if(this.field3447 < 0) {
         return null;
      } else {
         SpritePixels var1 = (SpritePixels)field3432.method635((long)this.field3447);
         if(var1 != null) {
            return var1;
         } else {
            var1 = IDKType.method5403(class211.field1991, this.field3447, 0, -1231766365);
            if(var1 != null) {
               field3432.method628(var1, (long)this.field3447);
            }

            return var1;
         }
      }
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(I)Lje;",
      garbageValue = "-89408991"
   )
   public final HitmarkType method4021() {
      int var1 = -1;
      if(this.multiMarkVarbit != -1) {
         var1 = CombatInfo1.method57(this.multiMarkVarbit);
      } else if(this.multiMarkVarp != -1) {
         var1 = class313.clientVarps[this.multiMarkVarp];
      }

      int var2;
      if(var1 >= 0 && var1 < this.multiMark.length - 1) {
         var2 = this.multiMark[var1];
      } else {
         var2 = this.multiMark[this.multiMark.length - 1];
      }

      return var2 != -1?Timer.method1740(var2):null;
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(I)Lld;",
      garbageValue = "-1976855252"
   )
   public SpritePixels method4051() {
      if(this.field3436 < 0) {
         return null;
      } else {
         SpritePixels var1 = (SpritePixels)field3432.method635((long)this.field3436);
         if(var1 != null) {
            return var1;
         } else {
            var1 = IDKType.method5403(class211.field1991, this.field3436, 0, 803426054);
            if(var1 != null) {
               field3432.method628(var1, (long)this.field3436);
            }

            return var1;
         }
      }
   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "(I)Lld;",
      garbageValue = "1960036274"
   )
   public SpritePixels method4023() {
      if(this.field3439 < 0) {
         return null;
      } else {
         SpritePixels var1 = (SpritePixels)field3432.method635((long)this.field3439);
         if(var1 != null) {
            return var1;
         } else {
            var1 = IDKType.method5403(class211.field1991, this.field3439, 0, -1042462610);
            if(var1 != null) {
               field3432.method628(var1, (long)this.field3439);
            }

            return var1;
         }
      }
   }

   @ObfuscatedName("b")
   @ObfuscatedSignature(
      signature = "(I)Lkt;",
      garbageValue = "-2100241902"
   )
   public Font method4024() {
      if(this.field3435 == -1) {
         return null;
      } else {
         Font var1 = (Font)field3433.method635((long)this.field3435);
         if(var1 != null) {
            return var1;
         } else {
            var1 = CacheFile.method5606(class211.field1991, field3438, this.field3435, 0);
            if(var1 != null) {
               field3433.method628(var1, (long)this.field3435);
            }

            return var1;
         }
      }
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(Lgx;B)V",
      garbageValue = "-24"
   )
   void method4019(Packet var1) {
      while(true) {
         int var2 = var1.readUnsignedByte();
         if(var2 == 0) {
            return;
         }

         this.method4020(var1, var2);
      }
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      signature = "(IB)Ljava/lang/String;",
      garbageValue = "-79"
   )
   public String method4054(int var1) {
      String var2 = this.field3445;

      while(true) {
         int var3 = var2.indexOf("%1");
         if(var3 < 0) {
            return var2;
         }

         var2 = var2.substring(0, var3) + Packet.method5116(var1, false) + var2.substring(var3 + 2);
      }
   }

   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "(Lgx;IB)V",
      garbageValue = "33"
   )
   void method4020(Packet var1, int var2) {
      if(var2 == 1) {
         this.field3435 = var1.method5287();
      } else if(var2 == 2) {
         this.field3440 = var1.method5090();
      } else if(var2 == 3) {
         this.field3450 = var1.method5287();
      } else if(var2 == 4) {
         this.field3436 = var1.method5287();
      } else if(var2 == 5) {
         this.field3439 = var1.method5287();
      } else if(var2 == 6) {
         this.field3447 = var1.method5287();
      } else if(var2 == 7) {
         this.field3442 = var1.method5089();
      } else if(var2 == 8) {
         this.field3445 = var1.method5096();
      } else if(var2 == 9) {
         this.field3437 = var1.readUnsignedShort();
      } else if(var2 == 10) {
         this.field3443 = var1.method5089();
      } else if(var2 == 11) {
         this.field3446 = 0;
      } else if(var2 == 12) {
         this.field3429 = var1.readUnsignedByte();
      } else if(var2 == 13) {
         this.field3444 = var1.method5089();
      } else if(var2 == 14) {
         this.field3446 = var1.readUnsignedShort();
      } else if(var2 == 17 || var2 == 18) {
         this.multiMarkVarbit = var1.readUnsignedShort();
         if(this.multiMarkVarbit == 65535) {
            this.multiMarkVarbit = -1;
         }

         this.multiMarkVarp = var1.readUnsignedShort();
         if(this.multiMarkVarp == 65535) {
            this.multiMarkVarp = -1;
         }

         int var3 = -1;
         if(var2 == 18) {
            var3 = var1.readUnsignedShort();
            if(var3 == 65535) {
               var3 = -1;
            }
         }

         int var4 = var1.readUnsignedByte();
         this.multiMark = new int[var4 + 2];

         for(int var5 = 0; var5 <= var4; ++var5) {
            this.multiMark[var5] = var1.readUnsignedShort();
            if(this.multiMark[var5] == 65535) {
               this.multiMark[var5] = -1;
            }
         }

         this.multiMark[var4 + 1] = var3;
      }

   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(CI)Z",
      garbageValue = "-543025330"
   )
   public static boolean method4057(char var0) {
      return var0 >= 'A' && var0 <= 'Z' || var0 >= 'a' && var0 <= 'z';
   }

   @ObfuscatedName("jx")
   @ObfuscatedSignature(
      signature = "(IIIIII)V",
      garbageValue = "759462616"
   )
   static final void method4056(int var0, int var1, int var2, int var3, int var4) {
      PlayerList.scrollbarSprites[0].method4282(var0, var1);
      PlayerList.scrollbarSprites[1].method4282(var0, var3 + var1 - 16);
      Rasterizer2D.method692(var0, var1 + 16, 16, var3 - 32, client.field711);
      int var5 = var3 * (var3 - 32) / var4;
      if(var5 < 8) {
         var5 = 8;
      }

      int var6 = (var3 - 32 - var5) * var2 / (var4 - var3);
      Rasterizer2D.method692(var0, var6 + var1 + 16, 16, var5, client.field734);
      Rasterizer2D.method757(var0, var6 + var1 + 16, var5, client.field714);
      Rasterizer2D.method757(var0 + 1, var6 + var1 + 16, var5, client.field714);
      Rasterizer2D.method698(var0, var6 + var1 + 16, 16, client.field714);
      Rasterizer2D.method698(var0, var6 + var1 + 17, 16, client.field714);
      Rasterizer2D.method757(var0 + 15, var6 + var1 + 16, var5, client.field854);
      Rasterizer2D.method757(var0 + 14, var6 + var1 + 17, var5 - 1, client.field854);
      Rasterizer2D.method698(var0, var5 + var6 + var1 + 15, 16, client.field854);
      Rasterizer2D.method698(var0 + 1, var6 + var5 + var1 + 14, 15, client.field854);
   }
}
