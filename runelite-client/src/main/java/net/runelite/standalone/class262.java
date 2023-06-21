package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hd")
public class class262 {
   @ObfuscatedName("r")
   @ObfuscatedSignature(
      signature = "Lds;"
   )
   public static class152 field2548;
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      intValue = -1729655047
   )
   public static int field2552;
   @ObfuscatedName("p")
   @ObfuscatedGetter(
      intValue = 1582336385
   )
   public static int field2551;
   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "Liz;"
   )
   public static Js5Index field2550;
   @ObfuscatedName("n")
   public static boolean field2553;
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "Liz;"
   )
   public static Js5Index field2547;
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      intValue = -243495611
   )
   public static int field2557;
   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "Liz;"
   )
   public static Js5Index field2558;

   static {
      field2557 = 0;
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "(IIII)I",
      garbageValue = "-2115225115"
   )
   static final int method4905(int var0, int var1, int var2) {
      int var3 = var0 / var2;
      int var4 = var0 & var2 - 1;
      int var5 = var1 / var2;
      int var6 = var1 & var2 - 1;
      int var7 = WorldMapRegion.method5553(var3, var5);
      int var8 = WorldMapRegion.method5553(var3 + 1, var5);
      int var9 = WorldMapRegion.method5553(var3, var5 + 1);
      int var10 = WorldMapRegion.method5553(var3 + 1, var5 + 1);
      int var11 = class321.method6327(var7, var8, var4, var2);
      int var12 = class321.method6327(var9, var10, var4, var2);
      return class321.method6327(var11, var12, var6, var2);
   }
}
