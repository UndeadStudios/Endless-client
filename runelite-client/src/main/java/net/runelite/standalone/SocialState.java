package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kz")
public class SocialState {
   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "Lkz;"
   )
   public static final SocialState UNSET;
   @ObfuscatedName("cd")
   @ObfuscatedGetter(
      intValue = 2034641555
   )
   public static int currentPressedKey;
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "Lkz;"
   )
   public static final SocialState CONTAINS;
   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "Lkz;"
   )
   public static final SocialState NOT_CONTAINS;

   static {
      UNSET = new SocialState();
      CONTAINS = new SocialState();
      NOT_CONTAINS = new SocialState();
   }
}
