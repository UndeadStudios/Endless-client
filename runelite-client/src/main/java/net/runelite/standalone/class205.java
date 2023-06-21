package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ic")
public class class205 {
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "64"
   )
   public static void method4004() {
      ComponentType.field2683.method629();
      ComponentType.componentModelCache.method629();
      ComponentType.componentFontCache.method629();
      ComponentType.field2686.method629();
   }

   @ObfuscatedName("b")
   @ObfuscatedSignature(
      signature = "(Liz;IIB)Z",
      garbageValue = "-72"
   )
   public static boolean method4006(Js5Index var0, int var1, int var2) {
      byte[] var3 = var0.method4115(var1, var2, -440530718);
      if(var3 == null) {
         return false;
      } else {
         Occluder.method4536(var3);
         return true;
      }
   }

   @ObfuscatedName("jq")
   @ObfuscatedSignature(
      signature = "(ZB)V",
      garbageValue = "116"
   )
   static void method4005(boolean var0) {
      client.field796 = var0;
   }
}
