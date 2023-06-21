package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.api.RSMapElementConfig;
import net.runelite.rs.api.RSSpritePixels;

@ObfuscatedName("jd")
public class MapElementType extends CacheableNode implements RSMapElementConfig {
   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "Lgp;"
   )
   public static NodeCache areaSpriteCache;
   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "Liz;"
   )
   static Js5Index field3341;
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "[Ljd;"
   )
   static MapElementType[] mapElementTypes;
   @ObfuscatedName("g")
   @ObfuscatedGetter(
      intValue = -1629647817
   )
   public static int field3322;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = 829605459
   )
   public int spriteId;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = -1866925643
   )
   int field3334;
   @ObfuscatedName("v")
   @ObfuscatedSignature(
      signature = "Lip;"
   )
   public class302 verticalAlignment;
   @ObfuscatedName("e")
   public String[] ops;
   @ObfuscatedName("r")
   public String opbase;
   @ObfuscatedName("k")
   @ObfuscatedSignature(
      signature = "Lji;"
   )
   public class299 horizontalAlignment;
   @ObfuscatedName("w")
   byte[] field3323;
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = -1752028429
   )
   public int textColor;
   @ObfuscatedName("m")
   public String text;
   @ObfuscatedName("p")
   @ObfuscatedGetter(
      intValue = 516650577
   )
   int field3326;
   @ObfuscatedName("b")
   @ObfuscatedGetter(
      intValue = -1928126979
   )
   public int textSize;
   @ObfuscatedName("o")
   @ObfuscatedGetter(
      intValue = -1929248031
   )
   int field3335;
   @ObfuscatedName("t")
   int[] field3333;
   @ObfuscatedName("i")
   @ObfuscatedGetter(
      intValue = -837808071
   )
   public int category;
   @ObfuscatedName("y")
   @ObfuscatedGetter(
      intValue = -1665691375
   )
   int field3332;
   @ObfuscatedName("d")
   int[] field3340;
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      intValue = -1736910617
   )
   public final int id;
   @ObfuscatedName("u")
   @ObfuscatedGetter(
      intValue = 149117509
   )
   int field3336;

   static {
      areaSpriteCache = new NodeCache(256);
   }

   MapElementType(int var1) {
      this.spriteId = -1;
      this.field3326 = -1;
      this.textSize = 0;
      this.ops = new String[5];
      this.field3334 = Integer.MAX_VALUE;
      this.field3335 = Integer.MAX_VALUE;
      this.field3336 = Integer.MIN_VALUE;
      this.field3332 = Integer.MIN_VALUE;
      this.horizontalAlignment = class299.field3560;
      this.verticalAlignment = class302.field3303;
      this.category = -1;
      this.id = var1;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(ZI)Lld;",
      garbageValue = "-1658614587"
   )
   public SpritePixels method1483(boolean var1) {
      int var2 = var1?this.field3326:this.spriteId;
      return this.method1484(var2);
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(Lgx;II)V",
      garbageValue = "1453732130"
   )
   void method1498(Packet var1, int var2) {
      if(var2 == 1) {
         this.spriteId = var1.method5287();
      } else if(var2 == 2) {
         this.field3326 = var1.method5287();
      } else if(var2 == 3) {
         this.text = var1.readString();
      } else if(var2 == 4) {
         this.textColor = var1.method5090();
      } else if(var2 == 5) {
         var1.method5090();
      } else if(var2 == 6) {
         this.textSize = var1.readUnsignedByte();
      } else {
         int var3;
         if(var2 == 7) {
            var3 = var1.readUnsignedByte();
            if((var3 & 1) == 0) {
               ;
            }

            if((var3 & 2) == 2) {
               ;
            }
         } else if(var2 == 8) {
            var1.readUnsignedByte();
         } else if(var2 >= 10 && var2 <= 14) {
            this.ops[var2 - 10] = var1.readString();
         } else if(var2 == 15) {
            var3 = var1.readUnsignedByte();
            this.field3333 = new int[var3 * 2];

            int var4;
            for(var4 = 0; var4 < var3 * 2; ++var4) {
               this.field3333[var4] = var1.method5089();
            }

            var1.readInt();
            var4 = var1.readUnsignedByte();
            this.field3340 = new int[var4];

            int var5;
            for(var5 = 0; var5 < this.field3340.length; ++var5) {
               this.field3340[var5] = var1.readInt();
            }

            this.field3323 = new byte[var3];

            for(var5 = 0; var5 < var3; ++var5) {
               this.field3323[var5] = var1.method5230();
            }
         } else if(var2 != 16) {
            if(var2 == 17) {
               this.opbase = var1.readString();
            } else if(var2 == 18) {
               var1.method5287();
            } else if(var2 == 19) {
               this.category = var1.readUnsignedShort();
            } else if(var2 == 21) {
               var1.readInt();
            } else if(var2 == 22) {
               var1.readInt();
            } else if(var2 == 23) {
               var1.readUnsignedByte();
               var1.readUnsignedByte();
               var1.readUnsignedByte();
            } else if(var2 == 24) {
               var1.method5089();
               var1.method5089();
            } else if(var2 == 25) {
               var1.method5287();
            } else if(var2 == 28) {
               var1.readUnsignedByte();
            } else if(var2 == 29) {
               class299[] var6 = new class299[]{class299.field3560, class299.field3561, class299.field3564};
               this.horizontalAlignment = (class299)PlayerList.method4757(var6, var1.readUnsignedByte());
            } else if(var2 == 30) {
               class302[] var7 = new class302[]{class302.field3303, class302.field3302, class302.field3304};
               this.verticalAlignment = (class302)PlayerList.method4757(var7, var1.readUnsignedByte());
            }
         }
      }

   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "-917365689"
   )
   public int method1499() {
      return this.id;
   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "(II)Lld;",
      garbageValue = "1417985569"
   )
   SpritePixels method1484(int var1) {
      if(var1 < 0) {
         return null;
      } else {
         SpritePixels var2 = (SpritePixels)areaSpriteCache.method635((long)var1);
         if(var2 != null) {
            return var2;
         } else {
            var2 = IDKType.method5403(field3341, var1, 0, -1912396604);
            if(var2 != null) {
               areaSpriteCache.method628(var2, (long)var1);
            }

            return var2;
         }
      }
   }

   public RSSpritePixels getMapIcon(boolean var1) {
      return this.method1483(var1);
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "926188330"
   )
   void method1482() {
      if(this.field3333 != null) {
         for(int var1 = 0; var1 < this.field3333.length; var1 += 2) {
            if(this.field3333[var1] < this.field3334) {
               this.field3334 = this.field3333[var1];
            } else if(this.field3333[var1] > this.field3336) {
               this.field3336 = this.field3333[var1];
            }

            if(this.field3333[var1 + 1] < this.field3335) {
               this.field3335 = this.field3333[var1 + 1];
            } else if(this.field3333[var1 + 1] > this.field3332) {
               this.field3332 = this.field3333[var1 + 1];
            }
         }
      }

   }

   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "(Lgx;I)V",
      garbageValue = "1214647872"
   )
   void method1480(Packet var1) {
      while(true) {
         int var2 = var1.readUnsignedByte();
         if(var2 == 0) {
            return;
         }

         this.method1498(var1, var2);
      }
   }

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;B)Ljava/lang/String;",
      garbageValue = "121"
   )
   public static String method1507(String var0) {
      int var1 = var0.length();
      char[] var2 = new char[var1];
      byte var3 = 2;

      for(int var4 = 0; var4 < var1; ++var4) {
         char var5 = var0.charAt(var4);
         if(var3 == 0) {
            var5 = Character.toLowerCase(var5);
         } else if(var3 == 2 || Character.isUpperCase(var5)) {
            var5 = Tile.method3825(var5);
         }

         if(Character.isLetter(var5)) {
            var3 = 0;
         } else if(var5 != '.' && var5 != '?' && var5 != '!') {
            if(Character.isSpaceChar(var5)) {
               if(var3 != 2) {
                  var3 = 1;
               }
            } else {
               var3 = 1;
            }
         } else {
            var3 = 2;
         }

         var2[var4] = var5;
      }

      return new String(var2);
   }
}
