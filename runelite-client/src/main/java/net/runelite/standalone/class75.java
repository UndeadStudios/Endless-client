package net.runelite.standalone;

import java.io.File;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fm")
public class class75 {
   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "Ldx;"
   )
   public static CacheFile uidDat;
   @ObfuscatedName("r")
   @ObfuscatedSignature(
      signature = "Ldx;"
   )
   public static CacheFile cacheDat;
   @ObfuscatedName("du")
   @ObfuscatedSignature(
      signature = "Lin;"
   )
   static Js5 music;
   @ObfuscatedName("x")
   public static File cacheLocator;
   @ObfuscatedName("t")
   @ObfuscatedSignature(
      signature = "Ldx;"
   )
   public static CacheFile masterIndex;
   @ObfuscatedName("h")
   public static File cacheDirectory;

   static {
      uidDat = null;
      cacheDat = null;
      masterIndex = null;
   }

   @ObfuscatedName("ht")
   @ObfuscatedSignature(
      signature = "(IIII)V",
      garbageValue = "1654140479"
   )
   static final void method1048(int var0, int var1, int var2) {
      if(var0 >= 128 && var1 >= 128 && var0 <= 13056 && var1 <= 13056) {
         int var3 = TcpConnectionMessage.method5618(var0, var1, ServerProt.level) - var2;
         var0 -= class258.cameraX;
         var3 -= class2.cameraZ;
         var1 -= FontName.cameraY;
         int var4 = Graphics3D.SINE[GZipDecompressor.cameraPitch];
         int var5 = Graphics3D.COSINE[GZipDecompressor.cameraPitch];
         int var6 = Graphics3D.SINE[class142.cameraYaw];
         int var7 = Graphics3D.COSINE[class142.cameraYaw];
         int var8 = var6 * var1 + var0 * var7 >> 16;
         var1 = var7 * var1 - var0 * var6 >> 16;
         var0 = var8;
         var8 = var3 * var5 - var4 * var1 >> 16;
         var1 = var4 * var3 + var5 * var1 >> 16;
         if(var1 >= 50) {
            client.screenX = var0 * client.scale / var1 + client.viewportWidth / 2;
            client.screenY = var8 * client.scale / var1 + client.viewportHeight / 2;
         } else {
            client.screenX = -1;
            client.screenY = -1;
         }

      } else {
         client.screenX = -1;
         client.screenY = -1;
      }
   }

   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "-8"
   )
   public static void method1055() {
      class3.field1860.method199();
      class262.field2557 = 1;
      class129.field278 = null;
   }
}
