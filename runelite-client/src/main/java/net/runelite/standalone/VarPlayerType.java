package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jn")
public class VarPlayerType extends CacheableNode {
   @ObfuscatedName("gh")
   @ObfuscatedGetter(
      intValue = -845922967
   )
   static int field3319;
   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "Lgp;"
   )
   static NodeCache varplayers;
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = 1819484817
   )
   public int clientCode;

   static {
      varplayers = new NodeCache(64);
   }

   VarPlayerType() {
      this.clientCode = 0;
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(Lgx;II)V",
      garbageValue = "-1850197339"
   )
   void method4(Packet var1, int var2) {
      if(var2 == 5) {
         this.clientCode = var1.readUnsignedShort();
      }

   }

   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "(Lgx;I)V",
      garbageValue = "96183287"
   )
   void method1(Packet var1) {
      while(true) {
         int var2 = var1.readUnsignedByte();
         if(var2 == 0) {
            return;
         }

         this.method4(var1, var2);
      }
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "(Liz;Liz;B)V",
      garbageValue = "-99"
   )
   public static void method13(Js5Index var0, Js5Index var1) {
      HeadbarType.field3397 = var0;
      HeadbarType.field3385 = var1;
   }

   @ObfuscatedName("la")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;I)Ljava/lang/String;",
      garbageValue = "1004906589"
   )
   static String method10(String var0) {
      /*ChatCrownType[] var1 = class248.method4669();
      for(int var2 = 0; var2 < var1.length; ++var2) {
         ChatCrownType var3 = var1[var2];
         if(var3.icon != -1 && var0.startsWith(class181.getModIcon(var3.icon))) {
            var0 = var0.substring(6 + Integer.toString(var3.icon).length());
            break;
         }
      }
      return var0;*/
      return var0.replaceAll("<img=.*>", "");
   }
}
