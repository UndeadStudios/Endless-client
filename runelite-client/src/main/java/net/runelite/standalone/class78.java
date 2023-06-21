package net.runelite.standalone;

import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import java.util.Random;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ir")
public class class78 {
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "1730580235"
   )
   static void method1073() {
      class203.username = class203.username.trim();
      client.onUsernameChanged(-1);
      if(class203.username.length() == 0) {
         TextureProvider.method1169("Please enter your username.", "", "");
      } else {
         class129.method1898("https://forums.zenyte.com/lostpassword/", true, false);
      }
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "([BIII)I",
      garbageValue = "132012231"
   )
   static int method1072(byte[] var0, int var1, int var2) {
      int var3 = -1;

      for(int var4 = var1; var4 < var2; ++var4) {
         var3 = var3 >>> 8 ^ Packet.crc32Table[(var3 ^ var0[var4]) & 255];
      }

      var3 = ~var3;
      return var3;
   }
}
