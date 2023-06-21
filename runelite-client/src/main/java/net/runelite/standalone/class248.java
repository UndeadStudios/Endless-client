package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("d")
public enum class248 implements Enumerated {
   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "Ld;"
   )
   field157(2, (byte)0),
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "Ld;"
   )
   field161(3, (byte)1),
   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "Ld;"
   )
   field158(1, (byte)2),
   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "Ld;"
   )
   field159(0, (byte)3);

   @ObfuscatedName("rp")
   @ObfuscatedGetter(
      intValue = 662123079
   )
   static int field167;
   @ObfuscatedName("ee")
   static int[] previousLoginXteaKeys;
   @ObfuscatedName("f")
   final byte field164;
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      intValue = 1714622099
   )
   final int worldMapType;

   class248(int var3, byte var4) {
      this.worldMapType = var3;
      this.field164 = var4;
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "-303219076"
   )
   public int vmethod6373() {
      return this.field164;
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "(I)[Lis;",
      garbageValue = "-158553807"
   )
   public static ChatCrownType[] method4669() {
      return new ChatCrownType[]{ChatCrownType.HARDCORE_IRONMAN, ChatCrownType.STAFF_MOD, ChatCrownType.NONE, ChatCrownType.PLAYER_MOD, ChatCrownType.IRONMAN, ChatCrownType.ULTIMATE_IRONMAN, ChatCrownType.YOUTUBER, ChatCrownType.SUPPORT, ChatCrownType.GLOBAL_MOD, ChatCrownType.FORUM_MOD};
   }
}
