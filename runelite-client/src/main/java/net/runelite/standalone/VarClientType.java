package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jl")
public class VarClientType extends CacheableNode {
   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "Liz;"
   )
   public static Js5Index field3346;
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "Lgp;"
   )
   public static NodeCache field3343;
   @ObfuscatedName("g")
   public boolean serialize;

   static {
      field3343 = new NodeCache(64);
   }

   public VarClientType() {
      this.serialize = false;
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "(Lgx;B)V",
      garbageValue = "5"
   )
   public void method4262(Packet var1) {
      while(true) {
         int var2 = var1.readUnsignedByte();
         if(var2 == 0) {
            return;
         }

         this.method4269(var1, var2);
      }
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(Lgx;II)V",
      garbageValue = "14985114"
   )
   void method4269(Packet var1, int var2) {
      if(var2 == 2) {
         this.serialize = true;
      }

   }

   @ObfuscatedName("ii")
   @ObfuscatedSignature(
      signature = "(ILjava/lang/String;I)V",
      garbageValue = "-2100772038"
   )
   static void method4267(int var0, String var1) {
      int var2 = PlayerList.highResolutionPlayerCount;
      int[] var3 = PlayerList.highResolutionPlayerIndexes;
      boolean var4 = false;
      Name var5 = new Name(var1, KeyFocusListener.loginType);

      for(int var6 = 0; var6 < var2; ++var6) {
         PlayerEntity var7 = client.players[var3[var6]];
         if(var7 != null && var7 != class71.localPlayer && var7.name != null && var7.name.equals(var5)) {
            TcpConnectionMessage var8;
            if(var0 == 1) {
               var8 = class232.method4535(ClientProt.field2266, client.serverConnection.isaac);
               var8.packetBuffer.writeShort(var3[var6]);
               var8.packetBuffer.method5232(0);
               client.serverConnection.method18(var8);
            } else if(var0 == 4) {
               var8 = class232.method4535(ClientProt.field2237, client.serverConnection.isaac);
               var8.packetBuffer.method5123(var3[var6]);
               var8.packetBuffer.method5232(0);
               client.serverConnection.method18(var8);
            } else if(var0 == 6) {
               var8 = class232.method4535(ClientProt.field2258, client.serverConnection.isaac);
               var8.packetBuffer.method5122(var3[var6]);
               var8.packetBuffer.method5307(0);
               client.serverConnection.method18(var8);
            } else if(var0 == 7) {
               var8 = class232.method4535(ClientProt.field2294, client.serverConnection.isaac);
               var8.packetBuffer.method5307(0);
               var8.packetBuffer.method5121(var3[var6]);
               client.serverConnection.method18(var8);
            }

            var4 = true;
            break;
         }
      }

      if(!var4) {
         KeyFocusListener.method5934(4, "", "Unable to find " + var1);
      }

   }
}
