package net.runelite.standalone;

import java.applet.Applet;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.rs.api.RSRunException;

@ObfuscatedName("fe")
public class JagException extends RuntimeException implements RSRunException {
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = 1625014789
   )
   public static int clientType;
   @ObfuscatedName("a")
   public static Applet field2022;
   @ObfuscatedName("s")
   public static String localPlayerUsername;
   @ObfuscatedName("g")
   @ObfuscatedGetter(
      intValue = 1878282847
   )
   public static int revision;
   @ObfuscatedName("f")
   Throwable parent;
   @ObfuscatedName("h")
   String field2021;

   JagException(Throwable var1, String var2) {
      this.field2021 = var2;
      this.parent = var1;
   }

   public Throwable getParent() {
      return this.parent;
   }
}
