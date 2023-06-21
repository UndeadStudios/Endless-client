package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fn")
public class Task {
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = 57507535
   )
   int type;
   @ObfuscatedName("q")
   public volatile Object value;
   @ObfuscatedName("m")
   Object objectArgument;
   @ObfuscatedName("p")
   public int intArgument;
   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "Lfn;"
   )
   Task task;
   @ObfuscatedName("h")
   public volatile int status;

   Task() {
      this.status = 0;
   }
}
