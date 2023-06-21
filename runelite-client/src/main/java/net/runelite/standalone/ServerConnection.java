package net.runelite.standalone;

import java.io.IOException;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ck")
public class ServerConnection {
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "Lge;"
   )
   Bit clientPacket;
   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "Lfc;"
   )
   ServerProt field1314;
   @ObfuscatedName("r")
   @ObfuscatedSignature(
      signature = "Lfc;"
   )
   ServerProt field1315;
   @ObfuscatedName("q")
   boolean field1303;
   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "Lgx;"
   )
   Packet serverPacket;
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      intValue = 233463175
   )
   int currentPacketSize;
   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "Lfc;"
   )
   ServerProt currentPacket;
   @ObfuscatedName("b")
   @ObfuscatedGetter(
      intValue = -1632797297
   )
   int field1305;
   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "Lfq;"
   )
   class323 rssocket;
   @ObfuscatedName("n")
   @ObfuscatedGetter(
      intValue = -1340854521
   )
   int field1313;
   @ObfuscatedName("t")
   @ObfuscatedSignature(
      signature = "Lfc;"
   )
   ServerProt field1316;
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "Lhj;"
   )
   CombatInfoList packetBufferNodes;
   @ObfuscatedName("h")
   @ObfuscatedSignature(
      signature = "Lgb;"
   )
   public Isaac isaac;
   @ObfuscatedName("g")
   @ObfuscatedGetter(
      intValue = -1498910999
   )
   int field1310;

   ServerConnection() {
      this.packetBufferNodes = new CombatInfoList();
      this.field1310 = 0;
      this.serverPacket = new Packet(5000);
      this.clientPacket = new Bit(40000);
      this.currentPacket = null;
      this.currentPacketSize = 0;
      this.field1303 = true;
      this.field1305 = 0;
      this.field1313 = 0;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "65"
   )
   void method36() {
      this.rssocket = null;
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(Lfq;I)V",
      garbageValue = "194480091"
   )
   void method19(class323 var1) {
      this.rssocket = var1;
   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "(B)Lfq;",
      garbageValue = "0"
   )
   class323 method38() {
      return this.rssocket;
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "1"
   )
   final void method22() {
      this.packetBufferNodes.method4698();
      this.field1310 = 0;
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "1"
   )
   final void method17() throws IOException {
      if(this.rssocket != null && this.field1310 > 0) {
         this.serverPacket.offset = 0;

         while(true) {
            TcpConnectionMessage var1 = (TcpConnectionMessage)this.packetBufferNodes.method4703();
            if(var1 == null || var1.field2346 > this.serverPacket.payload.length - this.serverPacket.offset) {
               this.rssocket.vmethod6359(this.serverPacket.payload, 0, this.serverPacket.offset);
               this.field1313 = 0;
               break;
            }

            this.serverPacket.method5080(var1.packetBuffer.payload, 0, var1.field2346);
            this.field1310 -= var1.field2346;
            var1.method432();
            var1.packetBuffer.method5069();
            var1.method5608();
         }
      }

   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "79"
   )
   void method20() {
      if(this.rssocket != null) {
         this.rssocket.vmethod6355();
         this.rssocket = null;
      }

   }

   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "(Lfa;I)V",
      garbageValue = "344974641"
   )
   public final void method18(TcpConnectionMessage var1) {
      this.packetBufferNodes.method4699(var1);
      var1.field2346 = var1.packetBuffer.offset;
      var1.packetBuffer.offset = 0;
      this.field1310 += var1.field2346;
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(IS)Z",
      garbageValue = "2047"
   )
   public static boolean method29(int var0) {
      return (var0 >> 31 & 1) != 0;
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "(Liz;Liz;I)V",
      garbageValue = "358321184"
   )
   public static void method21(Js5Index var0, Js5Index var1) {
      IDKType.identKit_ref = var0;
      IDKType.field3373 = var1;
      class43.field1230 = IDKType.identKit_ref.method4112(3);
   }
}
