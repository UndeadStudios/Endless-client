package net.runelite.standalone;

import java.applet.Applet;
import java.net.MalformedURLException;
import java.net.URL;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ak")
public class class2 {
   @ObfuscatedName("a")
   public static Applet field443;
   @ObfuscatedName("s")
   public static String field436;
   @ObfuscatedName("hr")
   @ObfuscatedGetter(
      intValue = 1843719487
   )
   static int cameraZ;

   static {
      field443 = null;
      field436 = "";
   }

   @ObfuscatedName("ki")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "-1090851287"
   )
   static void method39(int var0) {
      for(IntegerNode var1 = (IntegerNode) client.serverActiveProperties.method6338(); var1 != null; var1 = (IntegerNode) client.serverActiveProperties.method6339()) {
         if((long)var0 == (var1.hash >> 48 & 65535L)) {
            var1.method432();
         }
      }

   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;I)Z",
      garbageValue = "-718333846"
   )
   static boolean method51(String var0) {
      if(var0 == null) {
         return false;
      } else {
         try {
            new URL(var0);
            return true;
         } catch (MalformedURLException var2) {
            return false;
         }
      }
   }
}
