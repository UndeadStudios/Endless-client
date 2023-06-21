package net.runelite.standalone;

import java.io.IOException;
import java.util.Comparator;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bh")
public class OwnWorldComparator implements Comparator {
   @ObfuscatedName("sr")
   static short[] field640;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = -1727430177
   )
   public static int archiveCount;
   @ObfuscatedName("a")
   boolean field641;

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "(Lm;Lm;I)I",
      garbageValue = "-2088463494"
   )
   int method63(GrandExchangeEvent var1, GrandExchangeEvent var2) {
      if(var2.world == var1.world) {
         return 0;
      } else {
         if(this.field641) {
            if(client.world == var1.world) {
               return -1;
            }

            if(var2.world == client.world) {
               return 1;
            }
         }

         return var1.world < var2.world?-1:1;
      }
   }

   public int compare(Object var1, Object var2) {
      return this.method63((GrandExchangeEvent)var1, (GrandExchangeEvent)var2);
   }

   public boolean equals(Object var1) {
      return super.equals(var1);
   }

   @ObfuscatedName("gg")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1026205356"
   )
   static final void method69() {
      client.field763 = 0;
      int var0 = (class71.localPlayer.x * -1234429701 >> 7) + class53.baseX;
      int var1 = (class71.localPlayer.y >> 7) + class312.baseY;
      if(var0 >= 3053 && var0 <= 3156 && var1 >= 3056 && var1 <= 3136) {
         client.field763 = 1;
      }

      if(var0 >= 3072 && var0 <= 3118 && var1 >= 9492 && var1 <= 9535) {
         client.field763 = 1;
      }

      if(client.field763 == 1 && var0 >= 3139 && var0 <= 3199 && var1 >= 3008 && var1 <= 3062) {
         client.field763 = 0;
      }

   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "(Liz;Liz;B)V",
      garbageValue = "12"
   )
   public static void method75(Js5Index var0, Js5Index var1) {
      class36.NpcDefinition_indexCache = var0;
      NPCType.NpcDefinition_modelIndexCache = var1;
   }

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;I)I",
      garbageValue = "1376088595"
   )
   public static int method73(String var0) {
      return var0.length() + 1;
   }

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;I)V",
      garbageValue = "-787092074"
   )
   static final void method74(String var0) {
      class54.method868(var0 + " is already on your friend list");
   }

   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "(I)Lbt;",
      garbageValue = "-2096696077"
   )
   static ClientOptions method62() {
      FileOnDisk var0 = null;
      ClientOptions var1 = new ClientOptions();

      try {
         var0 = class244.method4645("", TradingPost.field38.name, false);
         byte[] var2 = new byte[(int)var0.method5053()];

         int var4;
         for(int var3 = 0; var3 < var2.length; var3 += var4) {
            var4 = var0.method5054(var2, var3, var2.length - var3);
            if(var4 == -1) {
               throw new IOException();
            }
         }

         var1 = new ClientOptions(new Packet(var2));
      } catch (Exception var6) {
         ;
      }

      try {
         if(var0 != null) {
            var0.method5051();
         }
      } catch (Exception var5) {
         ;
      }

      return var1;
   }
}
