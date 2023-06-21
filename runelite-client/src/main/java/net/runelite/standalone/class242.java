package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lj")
public class class242 {
   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "Lhj;"
   )
   public static CombatInfoList classInfos;
   @ObfuscatedName("h")
   @ObfuscatedSignature(
      signature = "[Lbu;"
   )
   static World[] worldList;

   static {
      classInfos = new CombatInfoList();
   }
}
