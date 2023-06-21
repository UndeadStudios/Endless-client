package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("as")
public class class232 extends class71 {
   @ObfuscatedName("rk")
   @ObfuscatedGetter(
      intValue = -686303295
   )
   static int field339;
   @ObfuscatedName("gb")
   @ObfuscatedSignature(
      signature = "Lld;"
   )
   static SpritePixels compass;
   @ObfuscatedName("k")
   @ObfuscatedGetter(
      intValue = 903618475
   )
   int field336;
   @ObfuscatedName("o")
   @ObfuscatedGetter(
      intValue = 1763585501
   )
   int field341;
   @ObfuscatedName("y")
   @ObfuscatedGetter(
      intValue = -1916620109
   )
   int field338;
   @ObfuscatedName("u")
   @ObfuscatedGetter(
      intValue = 855924313
   )
   int field337;

   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "-331975432"
   )
   int method4508() {
      return this.field338;
   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "1066966394"
   )
   int method4509() {
      return this.field336;
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "330560644"
   )
   int method4507() {
      return this.field337;
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "(Lgx;I)V",
      garbageValue = "-2080896362"
   )
   void method4504(Packet var1) {
      int var2 = var1.readUnsignedByte();
      if(var2 != class181.field272.field274) {
         throw new IllegalStateException("");
      } else {
         super.field172 = var1.readUnsignedByte();
         super.field168 = var1.readUnsignedByte();
         super.field173 = var1.readUnsignedShort();
         super.field169 = var1.readUnsignedShort();
         this.field341 = var1.readUnsignedByte();
         this.field337 = var1.readUnsignedByte();
         super.field170 = var1.readUnsignedShort();
         super.field171 = var1.readUnsignedShort();
         this.field338 = var1.readUnsignedByte();
         this.field336 = var1.readUnsignedByte();
         super.field174 = var1.method5287();
         super.field177 = var1.method5287();
      }
   }

   public boolean equals(Object var1) {
      if(!(var1 instanceof class232)) {
         return false;
      } else {
         class232 var2 = (class232)var1;
         return var2.field170 == super.field170 && var2.field171 == super.field171?var2.field338 == this.field338 && var2.field336 == this.field336:false;
      }
   }

   public int hashCode() {
      return super.field170 | super.field171 << 8 | this.field338 << 16 | this.field336 << 24;
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(Lgx;I)V",
      garbageValue = "-1814574938"
   )
   void vmethod4505(Packet var1) {
      super.field168 = Math.min(super.field168, 4);
      super.field188 = new short[1][64][64];
      super.field185 = new short[super.field168][64][64];
      super.field178 = new byte[super.field168][64][64];
      super.field179 = new byte[super.field168][64][64];
      super.decorations = new WorldMapDecoration[super.field168][64][64][];
      int var2 = var1.readUnsignedByte();
      if(var2 != class327.field269.field270) {
         throw new IllegalStateException("");
      } else {
         int var3 = var1.readUnsignedByte();
         int var4 = var1.readUnsignedByte();
         int var5 = var1.readUnsignedByte();
         int var6 = var1.readUnsignedByte();
         if(var3 == super.field170 && var4 == super.field171 && var5 == this.field338 && var6 == this.field336) {
            for(int var7 = 0; var7 < 8; ++var7) {
               for(int var8 = 0; var8 < 8; ++var8) {
                  this.method1003(var7 + this.field338 * 8, var8 + this.field336 * 8, var1);
               }
            }

         } else {
            throw new IllegalStateException("");
         }
      }
   }

   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "376863121"
   )
   int method4506() {
      return this.field341;
   }

   @ObfuscatedName("hn")
   @ObfuscatedSignature(
      signature = "(III)V",
      garbageValue = "384190356"
   )
   static final void method4511(int var0, int var1) {
      Deque var2 = client.groundItemDeque[ServerProt.level][var0][var1];
      if(var2 == null) {
         class312.sceneManager.method3642(ServerProt.level, var0, var1);
      } else {
         long var3 = -99999999L;
         Item var5 = null;

         Item var6;
         for(var6 = (Item)var2.method3930(); var6 != null; var6 = (Item)var2.method3924()) {
            ObjType var7 = class79.method1074(var6.id);
            long var8 = (long)var7.cost;
            if(var7.stackable == 1) {
               var8 *= (long)(var6.quantity + 1);
            }

            if(var8 > var3) {
               var3 = var8;
               var5 = var6;
            }
         }

         if(var5 == null) {
            class312.sceneManager.method3642(ServerProt.level, var0, var1);
         } else {
            var2.method3907(var5);
            Item var12 = null;
            Item var11 = null;

            for(var6 = (Item)var2.method3930(); var6 != null; var6 = (Item)var2.method3924()) {
               if(var6.id != var5.id) {
                  if(var12 == null) {
                     var12 = var6;
                  }

                  if(var6.id != var12.id && var11 == null) {
                     var11 = var6;
                  }
               }
            }

            long var9 = ChatHistory.method6263(var0, var1, 3, false, 0);
            class312.sceneManager.method3628(ServerProt.level, var0, var1, TcpConnectionMessage.method5618(var0 * 128 + 64, var1 * 128 + 64, ServerProt.level), var5, var9, var12, var11);
         }
      }
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(Lfs;Lgb;I)Lfa;",
      garbageValue = "-1821381109"
   )
   public static TcpConnectionMessage method4535(ClientProt var0, Isaac var1) {
      TcpConnectionMessage var2 = MilliTimer.method1068();
      var2.clientPacket = var0;
      var2.field2347 = var0.size;
      if(var2.field2347 == -1) {
         var2.packetBuffer = new Bit(260);
      } else if(var2.field2347 == -2) {
         var2.packetBuffer = new Bit(10000);
      } else if(var2.field2347 <= 18) {
         var2.packetBuffer = new Bit(20);
      } else if(var2.field2347 <= 98) {
         var2.packetBuffer = new Bit(100);
      } else {
         var2.packetBuffer = new Bit(260);
      }

      var2.packetBuffer.method2668(var1);
      var2.packetBuffer.method2646(var2.clientPacket.id);
      var2.field2346 = 0;
      return var2;
   }
}
