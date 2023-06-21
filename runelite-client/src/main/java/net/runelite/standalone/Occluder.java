package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("es")
public final class Occluder {
   @ObfuscatedName("fx")
   @ObfuscatedSignature(
      signature = "Lkt;"
   )
   static Font font_p12full;
   @ObfuscatedName("gf")
   @ObfuscatedSignature(
      signature = "[Lld;"
   )
   static SpritePixels[] mapMarkers;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = 1001198727
   )
   int minX;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = 1999293033
   )
   int minNormalX;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = 1101834461
   )
   int testDirection;
   @ObfuscatedName("r")
   @ObfuscatedGetter(
      intValue = 553866783
   )
   int field1896;
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = -1617358619
   )
   int maxZ;
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = 1650018735
   )
   int maxTileZ;
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      intValue = 1380168209
   )
   int minZ;
   @ObfuscatedName("p")
   @ObfuscatedGetter(
      intValue = -601042275
   )
   int maxX;
   @ObfuscatedName("b")
   @ObfuscatedGetter(
      intValue = 1963358269
   )
   int minY;
   @ObfuscatedName("o")
   @ObfuscatedGetter(
      intValue = -2044960001
   )
   int maxNormalX;
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      intValue = 682831251
   )
   int minTileX;
   @ObfuscatedName("n")
   @ObfuscatedGetter(
      intValue = 1124898469
   )
   int maxY;
   @ObfuscatedName("t")
   @ObfuscatedGetter(
      intValue = 1090105655
   )
   int field1894;
   @ObfuscatedName("y")
   @ObfuscatedGetter(
      intValue = 1619481095
   )
   int maxNormalY;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = -1180208517
   )
   int maxTIleX;
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      intValue = -1650121601
   )
   int type;
   @ObfuscatedName("u")
   @ObfuscatedGetter(
      intValue = 1125333031
   )
   int minNormalY;
   @ObfuscatedName("g")
   @ObfuscatedGetter(
      intValue = -41154101
   )
   int minTileZ;

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      signature = "([BI)V",
      garbageValue = "1711204802"
   )
   static void method4536(byte[] var0) {
      Packet var1 = new Packet(var0);
      var1.offset = var0.length - 2;
      class96.indexedSpriteCount = var1.readUnsignedShort();
      class96.indexedSpriteOffsetXs = new int[class96.indexedSpriteCount];
      GameCanvas.indexedSpriteOffsetYs = new int[class96.indexedSpriteCount];
      class96.indexSpriteWidths = new int[class96.indexedSpriteCount];
      class96.indexedSpriteHeights = new int[class96.indexedSpriteCount];
      class241.spritePixels = new byte[class96.indexedSpriteCount][];
      var1.offset = var0.length - 7 - class96.indexedSpriteCount * 8;
      class96.indexedSpriteWidth = var1.readUnsignedShort();
      class96.indexedSpriteHeight = var1.readUnsignedShort();
      int var2 = (var1.readUnsignedByte() & 255) + 1;

      int var3;
      for(var3 = 0; var3 < class96.indexedSpriteCount; ++var3) {
         class96.indexedSpriteOffsetXs[var3] = var1.readUnsignedShort();
      }

      for(var3 = 0; var3 < class96.indexedSpriteCount; ++var3) {
         GameCanvas.indexedSpriteOffsetYs[var3] = var1.readUnsignedShort();
      }

      for(var3 = 0; var3 < class96.indexedSpriteCount; ++var3) {
         class96.indexSpriteWidths[var3] = var1.readUnsignedShort();
      }

      for(var3 = 0; var3 < class96.indexedSpriteCount; ++var3) {
         class96.indexedSpriteHeights[var3] = var1.readUnsignedShort();
      }

      var1.offset = var0.length - 7 - class96.indexedSpriteCount * 8 - (var2 - 1) * 3;
      class96.indexedSpritePalette = new int[var2];

      for(var3 = 1; var3 < var2; ++var3) {
         class96.indexedSpritePalette[var3] = var1.method5090();
         if(class96.indexedSpritePalette[var3] == 0) {
            class96.indexedSpritePalette[var3] = 1;
         }
      }

      var1.offset = 0;

      for(var3 = 0; var3 < class96.indexedSpriteCount; ++var3) {
         int var4 = class96.indexSpriteWidths[var3];
         int var5 = class96.indexedSpriteHeights[var3];
         int var6 = var4 * var5;
         byte[] var7 = new byte[var6];
         class241.spritePixels[var3] = var7;
         int var8 = var1.readUnsignedByte();
         int var9;
         if(var8 == 0) {
            for(var9 = 0; var9 < var6; ++var9) {
               var7[var9] = var1.method5230();
            }
         } else if(var8 == 1) {
            for(var9 = 0; var9 < var4; ++var9) {
               for(int var10 = 0; var10 < var5; ++var10) {
                  var7[var9 + var10 * var4] = var1.method5230();
               }
            }
         }
      }

   }
}
