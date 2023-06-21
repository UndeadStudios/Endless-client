package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.api.RSFrameMap;

@ObfuscatedName("ev")
public class FrameMap extends Node implements RSFrameMap {
   @ObfuscatedName("x")
   int[][] list;
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      intValue = -1289791215
   )
   int id;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = -534781423
   )
   int count;
   @ObfuscatedName("g")
   int[] types;

   FrameMap(int var1, byte[] var2) {
      this.id = var1;
      Packet var3 = new Packet(var2);
      this.count = var3.readUnsignedByte();
      this.types = new int[this.count];
      this.list = new int[this.count][];

      int var4;
      for(var4 = 0; var4 < this.count; ++var4) {
         this.types[var4] = var3.readUnsignedByte();
      }

      for(var4 = 0; var4 < this.count; ++var4) {
         this.list[var4] = new int[var3.readUnsignedByte()];
      }

      for(var4 = 0; var4 < this.count; ++var4) {
         for(int var5 = 0; var5 < this.list[var4].length; ++var5) {
            this.list[var4][var5] = var3.readUnsignedByte();
         }
      }

   }

   public int getCount() {
      return this.count;
   }

   public int[] getTypes() {
      return this.types;
   }

   public int[][] getList() {
      return this.list;
   }

   @ObfuscatedName("hi")
   @ObfuscatedSignature(
      signature = "(IIZB)V",
      garbageValue = "18"
   )
   static final void method6312(int var0, int var1, boolean var2) {
      if(!var2 || var0 != KeyFocusListener.field412 || class308.field534 != var1) {
         KeyFocusListener.field412 = var0;
         class308.field534 = var1;
         class124.method1843(25);
         Varcs.method351("Loading - please wait.", true);
         int var3 = class53.baseX;
         int var4 = class312.baseY;
         class53.baseX = (var0 - 6) * 8;
         class312.baseY = (var1 - 6) * 8;
         int var5 = class53.baseX - var3;
         int var6 = class312.baseY - var4;
         var3 = class53.baseX;
         var4 = class312.baseY;

         int var7;
         int var9;
         for(var7 = 0; var7 < 32768; ++var7) {
            NPCEntity var8 = client.npcs[var7];
            if(var8 != null) {
               for(var9 = 0; var9 < 10; ++var9) {
                  var8.pathX[var9] -= var5;
                  var8.pathY[var9] -= var6;
               }

               var8.x -= var5 * 1897470336;
               var8.y -= var6 * 128;
            }
         }

         for(var7 = 0; var7 < 2048; ++var7) {
            PlayerEntity var21 = client.players[var7];
            if(var21 != null) {
               for(var9 = 0; var9 < 10; ++var9) {
                  var21.pathX[var9] -= var5;
                  var21.pathY[var9] -= var6;
               }

               var21.x -= var5 * 1897470336;
               var21.y -= var6 * 128;
            }
         }

         byte var20 = 0;
         byte var18 = 104;
         byte var22 = 1;
         if(var5 < 0) {
            var20 = 103;
            var18 = -1;
            var22 = -1;
         }

         byte var10 = 0;
         byte var11 = 104;
         byte var12 = 1;
         if(var6 < 0) {
            var10 = 103;
            var11 = -1;
            var12 = -1;
         }

         int var14;
         for(int var13 = var20; var13 != var18; var13 += var22) {
            for(var14 = var10; var11 != var14; var14 += var12) {
               int var15 = var13 + var5;
               int var16 = var6 + var14;

               for(int var17 = 0; var17 < 4; ++var17) {
                  if(var15 >= 0 && var16 >= 0 && var15 < 104 && var16 < 104) {
                     client.groundItemDeque[var17][var13][var14] = client.groundItemDeque[var17][var15][var16];
                  } else {
                     client.groundItemDeque[var17][var13][var14] = null;
                  }
               }
            }
         }

         for(PendingSpawn var19 = (PendingSpawn) client.pendingSpawns.method3930(); var19 != null; var19 = (PendingSpawn) client.pendingSpawns.method3924()) {
            var19.x -= var5;
            var19.y -= var6;
            if(var19.x < 0 || var19.y < 0 || var19.x >= 104 || var19.y >= 104) {
               var19.method432();
            }
         }

         if(client.destinationX != 0) {
            client.destinationX -= var5;
            client.destinationY -= var6;
         }

         client.queuedSoundEffectCount = 0;
         client.field893 = false;
         class258.cameraX -= var5 << 7;
         FontName.cameraY -= var6 << 7;
         client.field725 -= var5 << 7;
         class69.field135 -= var6 << 7;
         client.field874 = -1;
         client.spotAnimationDeque.method3936();
         client.projectiles.method3936();

         for(var14 = 0; var14 < 4; ++var14) {
            client.collisionMaps[var14].method3599();
         }

      }
   }
}
