package net.runelite.standalone;

import net.runelite.api.events.WidgetLoaded;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.api.RSCombatInfo1;
import net.runelite.rs.api.RSWidget;

@ObfuscatedName("by")
public class CombatInfo1 extends Node implements RSCombatInfo1 {
   @ObfuscatedName("qk")
   @ObfuscatedSignature(
      signature = "Lcz;"
   )
   static AbstractSoundSystem soundSystem1;
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      intValue = -917563253
   )
   static int field1006;
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      intValue = 357083675
   )
   static int field1009;
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = 1553815911
   )
   int int2;
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      intValue = -1922137535
   )
   int cycle;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = -1554469757
   )
   int healthRatio;
   @ObfuscatedName("g")
   @ObfuscatedGetter(
      intValue = 1566650169
   )
   int health;

   CombatInfo1(int var1, int var2, int var3, int var4) {
      this.cycle = var1;
      this.healthRatio = var2;
      this.health = var3;
      this.int2 = var4;
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "(IIIIB)V",
      garbageValue = "118"
   )
   void method54(int var1, int var2, int var3, int var4) {
      this.cycle = var1;
      this.healthRatio = var2;
      this.health = var3;
      this.int2 = var4;
   }

   public int getHealthRatio() {
      return this.healthRatio;
   }

   public int getHealth() {
      return this.health;
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1154121261"
   )
   static void method58() {
      if(class57.method910()) {
         class203.worldSelectShown = true;
         class203.field1152 = 0;
         class203.field1153 = 0;
      }

   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "(IB)I",
      garbageValue = "1"
   )
   public static int method57(int var0) {
      Varbit var1 = SoundTask.method6413(var0);
      int var2 = var1.configId;
      int var3 = var1.leastSignificantBit;
      int var4 = var1.mostSignificantBit;
      int var5 = class313.varpsMasks[var4 - var3];
      return class313.clientVarps[var2] >> var3 & var5;
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "(Lfy;B)V",
      garbageValue = "8"
   )
   public static void method59(Huffman var0) {
      class202.huffman = var0;
   }

   @ObfuscatedName("ah")
   @ObfuscatedSignature(
      signature = "(IZII)V",
      garbageValue = "-1274402177"
   )
   public static final void method56(int var0, boolean var1, int var2) {
      if(var0 >= 8000 && var0 <= 48000) {
         MapIconReference.sampleRate = var0;
         ContextMenuRow.audioHighMemory = var1;
         AbstractSoundSystem.field1404 = var2;
      } else {
         throw new IllegalArgumentException();
      }
   }

   @ObfuscatedName("ad")
   static void method61(int var0, int var1) {
      client.copy$runWidgetOnLoadListener(var0, var1);
      RSWidget[][] var2 = ItemContainer.clientInstance.getWidgets();
      boolean var3 = var2 != null && var2[var0] != null;
      if(var3) {
         WidgetLoaded var4 = new WidgetLoaded();
         var4.setGroupId(var0);
         ItemContainer.clientInstance.getCallbacks().post(var4);
      }

   }
}
