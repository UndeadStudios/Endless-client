package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ek")
public class class3 {
   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "Lhn;"
   )
   public static class15 field1860;

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(IIILjy;II)V",
      garbageValue = "1666071871"
   )
   static void method52(int var0, int var1, int var2, LocType var3, int var4) {
      class61 var5 = new class61();
      var5.field1051 = var0;
      var5.field1052 = var1 * 128;
      var5.field1057 = var2 * 128;
      int var6 = var3.width;
      int var7 = var3.length;
      if(var4 == 1 || var4 == 3) {
         var6 = var3.length;
         var7 = var3.width;
      }

      var5.field1062 = (var6 + var1) * 128;
      var5.field1055 = (var7 + var2) * 128;
      var5.field1053 = var3.ambientSoundId;
      var5.field1056 = var3.int4 * 128;
      var5.field1059 = var3.int5;
      var5.field1063 = var3.int6;
      var5.field1054 = var3.field3451;
      if(var3.multiLocs != null) {
         var5.field1064 = var3;
         var5.method917();
      }

      class61.field1061.method3906(var5);
      if(var5.field1054 != null) {
         var5.field1066 = var5.field1059 + (int)(Math.random() * (double)(var5.field1063 - var5.field1059));
      }

   }

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;IS)V",
      garbageValue = "31725"
   )
   static final void method53(String var0, int var1) {
      TcpConnectionMessage var2 = class232.method4535(ClientProt.field2296, client.serverConnection.isaac);
      var2.packetBuffer.writeByte(OwnWorldComparator.method73(var0) + 1);
      var2.packetBuffer.writeString(var0);
      var2.packetBuffer.writeByte(var1);
      client.serverConnection.method18(var2);
   }
}
