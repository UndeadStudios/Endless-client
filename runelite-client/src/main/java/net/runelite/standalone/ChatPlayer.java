package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.api.RSChatPlayer;

@ObfuscatedName("kl")
public class ChatPlayer extends Nameable implements RSChatPlayer {
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = -2143445875
   )
   public int field3711;
   @ObfuscatedName("p")
   @ObfuscatedGetter(
      intValue = 1644405117
   )
   public int rank;
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      intValue = 2063532353
   )
   public int world;

   ChatPlayer() {
      this.world = -1;
   }

   @ObfuscatedName("bg")
   @ObfuscatedSignature(
      signature = "(B)Z",
      garbageValue = "1"
   )
   public boolean method2031() {
      return this.world > 0;
   }

   @ObfuscatedName("bp")
   @ObfuscatedSignature(
      signature = "(III)V",
      garbageValue = "-529904546"
   )
   void method2021(int var1, int var2) {
      this.world = var1;
      this.field3711 = var2;
   }

   public int getRSRank() {
      return this.rank;
   }

   public int getWorld() {
      return this.world;
   }

   @ObfuscatedName("bv")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "1635702531"
   )
   public int method2020() {
      return this.world;
   }
}
