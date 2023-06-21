package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gz")
public final class DState {
   @ObfuscatedName("j")
   static int[] tt;
   @ObfuscatedName("f")
   final int field2379;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = -247978423
   )
   int out_len;
   @ObfuscatedName("v")
   @ObfuscatedGetter(
      intValue = 1583714189
   )
   int tPos;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = 1905079051
   )
   int field2390;
   @ObfuscatedName("r")
   @ObfuscatedGetter(
      intValue = 1220057931
   )
   int total_out_hi32;
   @ObfuscatedName("af")
   boolean[] field2406;
   @ObfuscatedName("ae")
   int[][] field2414;
   @ObfuscatedName("k")
   @ObfuscatedGetter(
      intValue = -922061599
   )
   int field2397;
   @ObfuscatedName("w")
   int[] field2400;
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = -1267061859
   )
   int total_out_lo32;
   @ObfuscatedName("au")
   int[] field2407;
   @ObfuscatedName("x")
   final int field2382;
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      intValue = -84172855
   )
   int next_in;
   @ObfuscatedName("p")
   byte[] strm;
   @ObfuscatedName("ag")
   boolean[] inUse;
   @ObfuscatedName("b")
   byte[] out;
   @ObfuscatedName("aj")
   @ObfuscatedGetter(
      intValue = -1753825139
   )
   int field2417;
   @ObfuscatedName("aw")
   byte[] field2411;
   @ObfuscatedName("o")
   @ObfuscatedGetter(
      intValue = 646868241
   )
   int total_in_hi32;
   @ObfuscatedName("a")
   final int field2416;
   @ObfuscatedName("z")
   @ObfuscatedGetter(
      intValue = -1095209005
   )
   int nInUse;
   @ObfuscatedName("n")
   @ObfuscatedGetter(
      intValue = 495447083
   )
   int next_out;
   @ObfuscatedName("av")
   int[][] field2415;
   @ObfuscatedName("c")
   int[] field2402;
   @ObfuscatedName("t")
   byte out_ch;
   @ObfuscatedName("ay")
   byte[] seqToUnseq;
   @ObfuscatedName("ah")
   byte[] field2410;
   @ObfuscatedName("an")
   byte[][] field2412;
   @ObfuscatedName("i")
   @ObfuscatedGetter(
      intValue = 403238131
   )
   int nblock_used;
   @ObfuscatedName("at")
   int[][] field2384;
   @ObfuscatedName("y")
   @ObfuscatedGetter(
      intValue = -152351767
   )
   int blockSize100k;
   @ObfuscatedName("d")
   @ObfuscatedGetter(
      intValue = -604946491
   )
   int k0;
   @ObfuscatedName("aa")
   byte[] field2408;
   @ObfuscatedName("s")
   final int field2380;
   @ObfuscatedName("h")
   final int field2399;
   @ObfuscatedName("u")
   @ObfuscatedGetter(
      intValue = -738226065
   )
   int total_in_lo32;
   @ObfuscatedName("ab")
   int[] field2409;
   @ObfuscatedName("g")
   final int field2389;

   DState() {
      this.field2416 = 4096;
      this.field2380 = 16;
      this.field2389 = 258;
      this.field2382 = 6;
      this.field2399 = 50;
      this.field2379 = 18002;
      this.next_in = 0;
      this.next_out = 0;
      this.field2400 = new int[256];
      this.field2402 = new int[257];
      this.inUse = new boolean[256];
      this.field2406 = new boolean[16];
      this.seqToUnseq = new byte[256];
      this.field2408 = new byte[4096];
      this.field2409 = new int[16];
      this.field2410 = new byte[18002];
      this.field2411 = new byte[18002];
      this.field2412 = new byte[6][258];
      this.field2384 = new int[6][258];
      this.field2414 = new int[6][258];
      this.field2415 = new int[6][258];
      this.field2407 = new int[6];
   }

   @ObfuscatedName("ly")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "1003337958"
   )
   static void method6065() {
      if(WorldMapType1.field216 != null) {
         client.field797 = client.gameCycle;
         WorldMapType1.field216.method98();

         for(int var0 = 0; var0 < client.players.length; ++var0) {
            if(client.players[var0] != null) {
               WorldMapType1.field216.method91((client.players[var0].x * -1234429701 >> 7) + class53.baseX, (client.players[var0].y >> 7) + class312.baseY);
            }
         }
      }

   }
}
