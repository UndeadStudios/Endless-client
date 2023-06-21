package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ft")
public class class82 {
   @ObfuscatedName("q")
   public static int[] field2122;
   @ObfuscatedName("x")
   public static int[][] field2115;
   @ObfuscatedName("m")
   public static int[] field2121;
   @ObfuscatedName("gi")
   static int[] mapRegions;
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      intValue = 1988086563
   )
   public static int field2119;
   @ObfuscatedName("g")
   public static int[][] field2117;

   static {
      field2117 = new int[128][128];
      field2115 = new int[128][128];
      field2121 = new int[4096];
      field2122 = new int[4096];
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(ILiz;Ljava/lang/String;Ljava/lang/String;IZI)V",
      garbageValue = "379187693"
   )
   public static void method1101(int var0, Js5Index var1, String var2, String var3, int var4, boolean var5) {
      int var6 = var1.method4132(var2);
      int var7 = var1.method4137(var6, var3);
      GZipDecompressor.method3620(var0, var1, var6, var7, var4, var5);
   }

   @ObfuscatedName("gc")
   @ObfuscatedSignature(
      signature = "(Lbw;ZS)V",
      garbageValue = "2072"
   )
   static void method1102(PlayerEntity var0, boolean var1) {
      if(var0 != null && var0.vmethod6005() && !var0.hidden) {
         var0.isLowDetail = false;
         if((client.lowMemory && PlayerList.highResolutionPlayerCount > 50 || PlayerList.highResolutionPlayerCount > 200) && var1 && var0.poseAnimation == var0.idlePoseAnimation) {
            var0.isLowDetail = true;
         }

         int var2 = var0.x * -1234429701 >> 7;
         int var3 = var0.y >> 7;
         if(var2 >= 0 && var2 < 104 && var3 >= 0 && var3 < 104) {
            long var4 = ChatHistory.method6263(0, 0, 0, false, var0.playerId);
            if(var0.model != null && client.gameCycle >= var0.animationCycleStart && client.gameCycle < var0.animationCycleEnd) {
               var0.isLowDetail = false;
               var0.field633 = TcpConnectionMessage.method5618(var0.x * -1234429701, var0.y, ServerProt.level);
               var0.field960 = client.gameCycle;
               class312.sceneManager.method3783(ServerProt.level, var0.x * -1234429701, var0.y, var0.field633, 60, var0, var0.angle, var4, var0.field630, var0.field625, var0.field626, var0.field628);
            } else {
               if((var0.x * -1234429701 & 127) == 64 && (var0.y & 127) == 64) {
                  if(client.field746[var2][var3] == client.field907) {
                     return;
                  }

                  client.field746[var2][var3] = client.field907;
               }

               var0.field633 = TcpConnectionMessage.method5618(var0.x * -1234429701, var0.y, ServerProt.level);
               var0.field960 = client.gameCycle;
               class312.sceneManager.method3754(ServerProt.level, var0.x * -1234429701, var0.y, var0.field633, 60, var0, var0.angle, var4, var0.field941);
            }
         }
      }

   }
}
