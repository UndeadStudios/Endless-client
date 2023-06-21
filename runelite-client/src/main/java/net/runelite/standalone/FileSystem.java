package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("iw")
public class FileSystem extends Node {
   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "Lin;"
   )
   Js5 data;
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      intValue = 610796045
   )
   int type;
   @ObfuscatedName("s")
   byte[] field3231;
   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "Lfb;"
   )
   IndexFile index;

   @ObfuscatedName("fh")
   @ObfuscatedSignature(
      signature = "(IIB)V",
      garbageValue = "64"
   )
   static void method570(int var0, int var1) {
      if(client.field882 != 0 && var0 != -1) {
         WorldMapDataGroup.method957(WorldMapType1.jingles, var0, 0, client.field882, false);
         client.field884 = true;
      }

   }
}
