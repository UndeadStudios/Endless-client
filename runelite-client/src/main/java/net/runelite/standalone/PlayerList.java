package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cd")
public class PlayerList {
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = 966947845
   )
   static int highResolutionPlayerCount;
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "Lgx;"
   )
   static Packet messageBuffer;
   @ObfuscatedName("e")
   static int[] facingEntities;
   @ObfuscatedName("r")
   @ObfuscatedGetter(
      intValue = 1502976845
   )
   static int extendedInfoPlayerCount;
   @ObfuscatedName("q")
   static int[] lowResolutionPlayerIndexes;
   @ObfuscatedName("x")
   static byte[] moveSpeeds;
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      intValue = -974264609
   )
   static int lowResolutionPlayerCount;
   @ObfuscatedName("p")
   static int[] highResolutionPlayerIndexes;
   @ObfuscatedName("b")
   static int[] coords;
   @ObfuscatedName("gg")
   @ObfuscatedSignature(
      signature = "[Llv;"
   )
   static IndexedSprite[] scrollbarSprites;
   @ObfuscatedName("n")
   static int[] facingCoords;
   @ObfuscatedName("t")
   static int[] extendedInfoPlayerIndexes;
   @ObfuscatedName("h")
   @ObfuscatedSignature(
      signature = "[Lgx;"
   )
   static Packet[] appearances;
   @ObfuscatedName("g")
   static byte[] skipHistory;

   static {
      skipHistory = new byte[2048];
      moveSpeeds = new byte[2048];
      appearances = new Packet[2048];
      highResolutionPlayerCount = 0;
      highResolutionPlayerIndexes = new int[2048];
      lowResolutionPlayerCount = 0;
      lowResolutionPlayerIndexes = new int[2048];
      coords = new int[2048];
      facingCoords = new int[2048];
      facingEntities = new int[2048];
      extendedInfoPlayerCount = 0;
      extendedInfoPlayerIndexes = new int[2048];
      messageBuffer = new Packet(new byte[5000]);
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "([Lgr;IB)Lgr;",
      garbageValue = "8"
   )
   public static Enumerated method4757(Enumerated[] var0, int var1) {
      Enumerated[] var2 = var0;

      for(int var3 = 0; var3 < var2.length; ++var3) {
         Enumerated var4 = var2[var3];
         if(var1 == var4.vmethod6373()) {
            return var4;
         }
      }

      return null;
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "485081138"
   )
   public static void method4739() {
      WorldMapRegion.field255.method1513(5);
   }
}
