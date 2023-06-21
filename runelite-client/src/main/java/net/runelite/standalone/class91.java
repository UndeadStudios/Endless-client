package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bd")
public final class class91 {
   @ObfuscatedName("f")
   static byte[][][] tileOverlayPath;
   @ObfuscatedName("v")
   static final int[] field518;
   @ObfuscatedName("k")
   static final int[] field515;
   @ObfuscatedName("w")
   static final int[] field519;
   @ObfuscatedName("x")
   static byte[][][] tileUnderlayIds;
   @ObfuscatedName("m")
   static byte[][][] field511;
   @ObfuscatedName("p")
   static byte[][][] overlayRotations;
   @ObfuscatedName("a")
   static int[][][] tileHeights;
   @ObfuscatedName("z")
   @ObfuscatedGetter(
      intValue = -790124765
   )
   static int field521;
   @ObfuscatedName("n")
   static int[] floorSaturations;
   @ObfuscatedName("c")
   static final int[] field510;
   @ObfuscatedName("t")
   static int[] field513;
   @ObfuscatedName("i")
   static final int[] field520;
   @ObfuscatedName("d")
   static final int[] field516;
   @ObfuscatedName("j")
   @ObfuscatedGetter(
      intValue = -548424781
   )
   static int field514;
   @ObfuscatedName("s")
   static byte[][][] tileSettings;
   @ObfuscatedName("h")
   static byte[][][] tileOverlayIds;
   @ObfuscatedName("g")
   @ObfuscatedGetter(
      intValue = -1882260411
   )
   static int field506;

   static {
      tileHeights = new int[4][105][105];
      tileSettings = new byte[4][104][104];
      field506 = 99;
      field515 = new int[]{1, 2, 4, 8};
      field518 = new int[]{16, 32, 64, 128};
      field516 = new int[]{1, 0, -1, 0};
      field519 = new int[]{0, -1, 0, 1};
      field520 = new int[]{1, -1, -1, 1};
      field510 = new int[]{-1, -1, 1, 1};
      field514 = (int)(Math.random() * 17.0D) - 8;
      field521 = (int)(Math.random() * 33.0D) - 16;
   }

   @ObfuscatedName("ie")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "-2088177910"
   )
   static final void method1224(int var0) {
      if(var0 >= 0) {
         int var1 = client.menuActionParams0[var0];
         int var2 = client.menuActionParams1[var0];
         int var3 = client.menuTypes[var0];
         int var4 = client.menuIdentifiers[var0];
         String var5 = client.menuOptions[var0];
         String var6 = client.menuTargets[var0];
         class24.method464(var1, var2, var3, var4, var5, var6, MouseInput.mouseLastPressedX, MouseInput.mouseLastPressedY, 59694331);
      }
   }

   @ObfuscatedName("o")
   @ObfuscatedSignature(
      signature = "(ILcs;ZI)I",
      garbageValue = "-520710532"
   )
   static int method1223(int var0, class314 var1, boolean var2) {
      ComponentType var3 = var2?ClientOptions.field1035:class290.field1119;
      if(var0 == 1800) {
         class281.intStack[++class281.intStackSize - 1] = CacheFile.method5603(WorldComparator.method86(var3));
         return 1;
      } else if(var0 != 1801) {
         if(var0 == 1802) {
            if(var3.opBase == null) {
               class281.scriptStringStack[++class295.scriptStringStackSize - 1] = "";
            } else {
               class281.scriptStringStack[++class295.scriptStringStackSize - 1] = var3.opBase;
            }

            return 1;
         } else {
            return 2;
         }
      } else {
         int var4 = class281.intStack[--class281.intStackSize];
         --var4;
         if(var3.ops != null && var4 < var3.ops.length && var3.ops[var4] != null) {
            class281.scriptStringStack[++class295.scriptStringStackSize - 1] = var3.ops[var4];
         } else {
            class281.scriptStringStack[++class295.scriptStringStackSize - 1] = "";
         }

         return 1;
      }
   }

   @ObfuscatedName("kf")
   @ObfuscatedSignature(
      signature = "(Lia;I)Z",
      garbageValue = "-2142676401"
   )
   static boolean method1200(ComponentType var0) {
      return var0.isHidden;
   }
}
