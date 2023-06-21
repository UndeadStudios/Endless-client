package net.runelite.standalone;

import java.net.URL;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ez")
public class UrlRequest {
   @ObfuscatedName("a")
   final URL url;
   @ObfuscatedName("s")
   volatile boolean isDone0;
   @ObfuscatedName("g")
   volatile byte[] response0;

   UrlRequest(URL var1) {
      this.url = var1;
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "1332737787"
   )
   public boolean method4256() {
      return this.isDone0;
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(B)[B",
      garbageValue = "1"
   )
   public byte[] method4257() {
      return this.response0;
   }
}
