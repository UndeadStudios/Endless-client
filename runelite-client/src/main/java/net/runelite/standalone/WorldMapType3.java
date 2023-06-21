package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("v")
public class WorldMapType3 implements WorldMapSectionBase {
   @ObfuscatedName("ox")
   @ObfuscatedSignature(
      signature = "Lcq;"
   )
   static Varcs varcs;
   @ObfuscatedName("sh")
   @ObfuscatedSignature(
      signature = "Lfb;"
   )
   static IndexFile indexStore255;
   @ObfuscatedName("fe")
   @ObfuscatedGetter(
      longValue = -5715982567008898473L
   )
   static long field137;
   @ObfuscatedName("ab")
   static int[] field146;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = 1002264543
   )
   int field142;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = 97318001
   )
   int field148;
   @ObfuscatedName("r")
   @ObfuscatedGetter(
      intValue = -579170277
   )
   int field149;
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = -1893926923
   )
   int field145;
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = -710075067
   )
   int field140;
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      intValue = 6176523
   )
   int field144;
   @ObfuscatedName("p")
   @ObfuscatedGetter(
      intValue = 999990857
   )
   int field143;
   @ObfuscatedName("b")
   @ObfuscatedGetter(
      intValue = -2039396665
   )
   int field150;
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      intValue = 695461503
   )
   int field139;
   @ObfuscatedName("n")
   @ObfuscatedGetter(
      intValue = 1766272803
   )
   int field147;
   @ObfuscatedName("t")
   @ObfuscatedGetter(
      intValue = 2046412045
   )
   int field138;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = 1135050285
   )
   int field151;
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      intValue = -1556447169
   )
   int field141;
   @ObfuscatedName("g")
   @ObfuscatedGetter(
      intValue = 1116313163
   )
   int field152;

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(Lgx;B)V",
      garbageValue = "46"
   )
   public void vmethod4912(Packet var1) {
      this.field139 = var1.readUnsignedByte();
      this.field151 = var1.readUnsignedByte();
      this.field152 = var1.readUnsignedShort();
      this.field143 = var1.readUnsignedByte();
      this.field145 = var1.readUnsignedByte();
      this.field140 = var1.readUnsignedShort();
      this.field144 = var1.readUnsignedByte();
      this.field150 = var1.readUnsignedByte();
      this.field141 = var1.readUnsignedShort();
      this.field147 = var1.readUnsignedByte();
      this.field149 = var1.readUnsignedByte();
      this.field142 = var1.readUnsignedShort();
      this.field148 = var1.readUnsignedByte();
      this.field138 = var1.readUnsignedByte();
      this.method580();
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(IIIB)[I",
      garbageValue = "103"
   )
   public int[] vmethod4911(int var1, int var2, int var3) {
      if(!this.vmethod4930(var1, var2, var3)) {
         return null;
      } else {
         int[] var4 = new int[]{this.field141 * 64 - this.field152 * 64 + var2 + (this.field147 * 8 - this.field143 * 8), var3 + (this.field142 * 64 - this.field140 * 64) + (this.field148 * 8 - this.field144 * 8)};
         return var4;
      }
   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "-28"
   )
   void method580() {
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "(Lag;B)V",
      garbageValue = "-123"
   )
   public void vmethod4925(WorldMapData var1) {
      if(var1.minX > this.field141) {
         var1.minX = this.field141;
      }

      if(var1.field232 < this.field141) {
         var1.field232 = this.field141;
      }

      if(var1.minY > this.field142) {
         var1.minY = this.field142;
      }

      if(var1.field236 < this.field142) {
         var1.field236 = this.field142;
      }

   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(IIII)Z",
      garbageValue = "-12219513"
   )
   public boolean vmethod4930(int var1, int var2, int var3) {
      return var1 >= this.field139 && var1 < this.field151 + this.field139?var2 >= (this.field152 << 6) + (this.field143 << 3) && var2 <= (this.field152 << 6) + (this.field145 << 3) + 7 && var3 >= (this.field140 << 6) + (this.field144 << 3) && var3 <= (this.field140 << 6) + (this.field150 << 3) + 7:false;
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      signature = "(III)Lif;",
      garbageValue = "-957800253"
   )
   public CoordGrid vmethod4935(int var1, int var2) {
      if(!this.vmethod4910(var1, var2)) {
         return null;
      } else {
         int var3 = this.field152 * 64 - this.field141 * 64 + (this.field143 * 8 - this.field147 * 8) + var1;
         int var4 = this.field140 * 64 - this.field142 * 64 + var2 + (this.field144 * 8 - this.field148 * 8);
         return new CoordGrid(this.field139, var3, var4);
      }
   }

   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "(III)Z",
      garbageValue = "1385272861"
   )
   public boolean vmethod4910(int var1, int var2) {
      return var1 >= (this.field141 << 6) + (this.field147 << 3) && var1 <= (this.field141 << 6) + (this.field149 << 3) + 7 && var2 >= (this.field142 << 6) + (this.field148 << 3) && var2 <= (this.field142 << 6) + (this.field138 << 3) + 7;
   }

   @ObfuscatedName("fy")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;I)V",
      garbageValue = "-1566932382"
   )
   static final void method577(String var0) {
      if(var0.equalsIgnoreCase("toggleroof")) {
         class312.options.hideRoofs = !class312.options.hideRoofs;
         class72.method1041();
         if(class312.options.hideRoofs) {
            KeyFocusListener.method5934(99, "", "Roofs are now all hidden");
         } else {
            KeyFocusListener.method5934(99, "", "Roofs will only be removed selectively");
         }
      }

      if(var0.equalsIgnoreCase("displayfps")) {
         client.displayFps = !client.displayFps;
      }

      if(var0.equalsIgnoreCase("renderself")) {
         client.field768 = !client.field768;
      }

      if(var0.equalsIgnoreCase("mouseovertext")) {
         client.field699 = !client.field699;
      }

      if(client.staffModLevel >= 2) {
         if(var0.equalsIgnoreCase("errortest")) {
            throw new RuntimeException();
         }

         if(var0.equalsIgnoreCase("showcoord")) {
            class69.worldMap.field3967 = !class69.worldMap.field3967;
         }

         if(var0.equalsIgnoreCase("fpson")) {
            client.displayFps = true;
         }

         if(var0.equalsIgnoreCase("fpsoff")) {
            client.displayFps = false;
         }

         if(var0.equalsIgnoreCase("gc")) {
            System.gc();
         }

         if(var0.equalsIgnoreCase("clientdrop")) {
            FontName.method515();
         }
      }

      TcpConnectionMessage var1 = class232.method4535(ClientProt.field2279, client.serverConnection.isaac);
      var1.packetBuffer.writeByte(var0.length() + 1);
      var1.packetBuffer.writeString(var0);
      client.serverConnection.method18(var1);
   }

   @ObfuscatedName("gw")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "9"
   )
   static void method600() {
      int var0 = PlayerList.highResolutionPlayerCount;
      int[] var1 = PlayerList.highResolutionPlayerIndexes;

      for(int var2 = 0; var2 < var0; ++var2) {
         if(var1[var2] != client.field776 && var1[var2] != client.localPlayerIndex) {
            class82.method1102(client.players[var1[var2]], true);
         }
      }

   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "([BIII)Ljava/lang/String;",
      garbageValue = "-1271220419"
   )
   public static String method601(byte[] var0, int var1, int var2) {
      char[] var3 = new char[var2];
      int var4 = 0;
      int var5 = var1;

      int var8;
      for(int var6 = var2 + var1; var5 < var6; var3[var4++] = (char)var8) {
         int var7 = var0[var5++] & 255;
         if(var7 < 128) {
            if(var7 == 0) {
               var8 = 65533;
            } else {
               var8 = var7;
            }
         } else if(var7 < 192) {
            var8 = 65533;
         } else if(var7 < 224) {
            if(var5 < var6 && (var0[var5] & 192) == 128) {
               var8 = (var7 & 31) << 6 | var0[var5++] & 63;
               if(var8 < 128) {
                  var8 = 65533;
               }
            } else {
               var8 = 65533;
            }
         } else if(var7 < 240) {
            if(var5 + 1 < var6 && (var0[var5] & 192) == 128 && (var0[var5 + 1] & 192) == 128) {
               var8 = (var7 & 15) << 12 | (var0[var5++] & 63) << 6 | var0[var5++] & 63;
               if(var8 < 2048) {
                  var8 = 65533;
               }
            } else {
               var8 = 65533;
            }
         } else if(var7 < 248) {
            if(var5 + 2 < var6 && (var0[var5] & 192) == 128 && (var0[var5 + 1] & 192) == 128 && (var0[var5 + 2] & 192) == 128) {
               var8 = (var7 & 7) << 18 | (var0[var5++] & 63) << 12 | (var0[var5++] & 63) << 6 | var0[var5++] & 63;
               if(var8 >= 65536 && var8 <= 1114111) {
                  var8 = 65533;
               } else {
                  var8 = 65533;
               }
            } else {
               var8 = 65533;
            }
         } else {
            var8 = 65533;
         }
      }

      return new String(var3, 0, var4);
   }
}
