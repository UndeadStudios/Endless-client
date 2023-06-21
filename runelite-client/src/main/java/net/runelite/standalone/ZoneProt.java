package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fh")
public class ZoneProt {
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "Lfh;"
   )
   public static final ZoneProt field2344;
   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "Lfh;"
   )
   public static final ZoneProt field2334;
   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "Lfh;"
   )
   public static final ZoneProt field2335;
   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "Lfh;"
   )
   public static final ZoneProt field2333;
   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "Lfh;"
   )
   public static final ZoneProt field2338;
   @ObfuscatedName("b")
   @ObfuscatedSignature(
      signature = "Lfh;"
   )
   public static final ZoneProt field2341;
   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "Lfh;"
   )
   public static final ZoneProt field2339;
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "Lfh;"
   )
   public static final ZoneProt field2337;
   @ObfuscatedName("h")
   @ObfuscatedSignature(
      signature = "Lfh;"
   )
   public static final ZoneProt field2332;
   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "Lfh;"
   )
   public static final ZoneProt field2340;

   static {
      field2339 = new ZoneProt(7);
      field2337 = new ZoneProt(15);
      field2340 = new ZoneProt(14);
      field2335 = new ZoneProt(6);
      field2332 = new ZoneProt(4);
      field2344 = new ZoneProt(5);
      field2338 = new ZoneProt(2);
      field2333 = new ZoneProt(3);
      field2334 = new ZoneProt(5);
      field2341 = new ZoneProt(4);
   }

   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "7"
   )
   ZoneProt(int var1) {
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-327415147"
   )
   public static void method372() {
      class242.classInfos = new CombatInfoList();
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(II)Ljg;",
      garbageValue = "-2132164720"
   )
   public static NPCType method374(int var0) {
      NPCType var1 = (NPCType)NPCType.npcTypeCache.method635((long)var0);
      if(var1 != null) {
         return var1;
      } else {
         byte[] var2 = class36.NpcDefinition_indexCache.method4115(9, var0, -306095305);
         var1 = new NPCType();
         var1.id = var0;
         if(var2 != null) {
            var1.method4778(new Packet(var2));
         }

         var1.method4776();
         NPCType.npcTypeCache.method628(var1, (long)var0);
         return var1;
      }
   }

   @ObfuscatedName("hs")
   @ObfuscatedSignature(
      signature = "(IIB)V",
      garbageValue = "0"
   )
   static final void method375(int var0, int var1) {
      if(client.menuOptionCount >= 2 || client.itemSelectionState != 0 || client.spellSelected) {
         if(client.field699) {
            int var2 = client.menuOptionCount - 1;
            String var4;
            if(client.itemSelectionState == 1 && client.menuOptionCount < 2) {
               var4 = "Use" + " " + client.lastSelectedItemName + " " + "->";
            } else if(client.spellSelected && client.menuOptionCount < 2) {
               var4 = client.targetVerb + " " + client.opBase + " " + "->";
            } else {
               var4 = MilliTimer.method1071(var2);
            }

            if(client.menuOptionCount > 2) {
               var4 = var4 + class308.method6152(16777215) + " " + '/' + " " + (client.menuOptionCount - 2) + " more options";
            }

            class191.fontBold12.method6173(var4, var0 + 4, var1 + 15, 16777215, 0, client.gameCycle / 1000);
         }
      }
   }
}
