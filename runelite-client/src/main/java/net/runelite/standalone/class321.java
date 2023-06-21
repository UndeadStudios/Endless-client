package net.runelite.standalone;

import java.util.zip.CRC32;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("io")
public class class321 {
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "Lht;"
   )
   public static HashTable NetCache_pendingPriorityResponses;
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "Lgx;"
   )
   public static Packet NetCache_responseHeaderBuffer;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = 1052911217
   )
   public static int NetCache_pendingResponsesCount;
   @ObfuscatedName("r")
   public static boolean field3292;
   @ObfuscatedName("k")
   public static CRC32 NetCache_crc;
   @ObfuscatedName("w")
   public static byte field3291;
   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "Lht;"
   )
   public static HashTable NetCache_pendingWrites;
   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "Lht;"
   )
   public static HashTable NetCache_pendingPriorityWrites;
   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "Lgd;"
   )
   public static Node2LinkedList NetCache_pendingWritesQueue;
   @ObfuscatedName("p")
   @ObfuscatedGetter(
      intValue = 266907923
   )
   public static int NetCache_pendingPriorityResponsesCount;
   @ObfuscatedName("b")
   @ObfuscatedGetter(
      intValue = 1939285225
   )
   public static int NetCache_pendingWritesCount;
   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "Lfq;"
   )
   public static class323 NetCache_socket;
   @ObfuscatedName("n")
   @ObfuscatedSignature(
      signature = "Lht;"
   )
   public static HashTable NetCache_pendingResponses;
   @ObfuscatedName("c")
   @ObfuscatedGetter(
      intValue = -690937663
   )
   public static int field3294;
   @ObfuscatedName("i")
   @ObfuscatedGetter(
      intValue = -151895777
   )
   public static int field3288;
   @ObfuscatedName("d")
   @ObfuscatedSignature(
      signature = "[Lin;"
   )
   public static Js5[] NetCache_indexCaches;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = -807616267
   )
   public static int field3289;
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      intValue = -1220574129
   )
   public static int NetCache_pendingPriorityWritesCount;
   @ObfuscatedName("u")
   @ObfuscatedGetter(
      intValue = -950419947
   )
   public static int field3275;
   @ObfuscatedName("g")
   @ObfuscatedGetter(
      longValue = 8231885883365805505L
   )
   public static long field3276;

   static {
      field3289 = 0;
      NetCache_pendingPriorityWrites = new HashTable(4096);
      NetCache_pendingPriorityWritesCount = 0;
      NetCache_pendingPriorityResponses = new HashTable(32);
      NetCache_pendingPriorityResponsesCount = 0;
      NetCache_pendingWritesQueue = new Node2LinkedList();
      NetCache_pendingWrites = new HashTable(4096);
      NetCache_pendingWritesCount = 0;
      NetCache_pendingResponses = new HashTable(4096);
      NetCache_pendingResponsesCount = 0;
      NetCache_responseHeaderBuffer = new Packet(8);
      field3275 = 0;
      NetCache_crc = new CRC32();
      NetCache_indexCaches = new Js5[256];
      field3291 = 0;
      field3288 = 0;
      field3294 = 0;
   }

   @ObfuscatedName("r")
   @ObfuscatedSignature(
      signature = "(IIIII)I",
      garbageValue = "-1557395407"
   )
   static final int method6327(int var0, int var1, int var2, int var3) {
      int var4 = 65536 - Graphics3D.COSINE[var2 * 1024 / var3] >> 1;
      return ((65536 - var4) * var0 >> 16) + (var4 * var1 >> 16);
   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "(ILcs;ZB)I",
      garbageValue = "1"
   )
   static int method6332(int var0, class314 var1, boolean var2) {
      ComponentType var3;
      if(var0 >= 2000) {
         var0 -= 1000;
         var3 = ChatHistory.method6246(class281.intStack[--class281.intStackSize]);
      } else {
         var3 = var2?ClientOptions.field1035:class290.field1119;
      }

      WorldMapRegion.method5554(var3);
      if(var0 != 1200 && var0 != 1205 && var0 != 1212) {
         if(var0 == 1201) {
            var3.modelType = 2;
            var3.modelId = class281.intStack[--class281.intStackSize];
            return 1;
         } else if(var0 == 1202) {
            var3.modelType = 3;
            var3.modelId = class71.localPlayer.composition.method820();
            return 1;
         } else {
            return 2;
         }
      } else {
         class281.intStackSize -= 2;
         int var4 = class281.intStack[class281.intStackSize];
         int var5 = class281.intStack[class281.intStackSize + 1];
         var3.linkObjType = var4;
         var3.linkObjCount = var5;
         ObjType var6 = class79.method1074(var4);
         var3.xan2d = var6.xan2d;
         var3.yan2d = var6.yan2d;
         var3.zan2d = var6.zan2d;
         var3.offsetX2d = var6.xof2d;
         var3.offsetY2d = var6.yof2d;
         var3.zoom2d = var6.zoom2d;
         if(var0 == 1205) {
            var3.objNumMode = 0;
         } else if(var0 == 1212 | 1 == var6.stackable) {
            var3.objNumMode = 1;
         } else {
            var3.objNumMode = 2;
         }

         if(var3.field2728 > 0) {
            var3.zoom2d = var3.zoom2d * 32 / var3.field2728;
         } else if(var3.sizeX > 0) {
            var3.zoom2d = var3.zoom2d * 32 / var3.sizeX;
         }

         return 1;
      }
   }
}
