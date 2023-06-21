package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jv")
public class class307 {
   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "(B)Lfa;",
      garbageValue = "-5"
   )
   public static TcpConnectionMessage method6147() {
      TcpConnectionMessage var0;
      if(TcpConnectionMessage.field2348 == 0) {
         var0 = new TcpConnectionMessage();
      } else {
         var0 = TcpConnectionMessage.packetBufferNodes[--TcpConnectionMessage.field2348];
      }

      var0.clientPacket = null;
      var0.field2347 = 0;
      var0.packetBuffer = new Bit(5000);
      return var0;
   }
}
