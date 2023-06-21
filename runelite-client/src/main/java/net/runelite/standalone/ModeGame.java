package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ib")
public enum ModeGame implements Enumerated {
   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "Lib;"
   )
   RUNESCAPE("runescape", "RuneScape", 0),
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "Lib;"
   )
   STELLARDAWN("stellardawn", "Stellar Dawn", 1),
   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "Lib;"
   )
   GAME3("game3", "Game 3", 2),
   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "Lib;"
   )
   GAME4("game4", "Game 4", 3),
   @ObfuscatedName("h")
   @ObfuscatedSignature(
      signature = "Lib;"
   )
   GAME5("game5", "Game 5", 4),
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "Lib;"
   )
   OLDSCAPE("oldscape", "RuneScape 2007", 5);

   @ObfuscatedName("ek")
   @ObfuscatedSignature(
      signature = "Llf;"
   )
   static GraphicsDefaults field3227;
   @ObfuscatedName("dk")
   @ObfuscatedSignature(
      signature = "Lin;"
   )
   static Js5 sprites;
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      intValue = -821473595
   )
   final int id;
   @ObfuscatedName("p")
   public final String name;

   ModeGame(String var3, String var4, int var5) {
      this.name = var3;
      this.id = var5;
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "-303219076"
   )
   public int vmethod6373() {
      return this.id;
   }
}
