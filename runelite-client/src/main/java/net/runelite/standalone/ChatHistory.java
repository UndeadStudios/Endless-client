package net.runelite.standalone;

import java.util.HashMap;
import java.util.Map;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cf")
public class ChatHistory {
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = 729779417
   )
   static int field1262;
   @ObfuscatedName("a")
   static final Map chatLineMap;
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "Lgs;"
   )
   static final IterableHashTable messages;
   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "Lhw;"
   )
   static final IterableDualNodeQueue field1261;

   static {
      chatLineMap = new HashMap();
      messages = new IterableHashTable(1024);
      field1261 = new IterableDualNodeQueue();
      field1262 = 0;
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "(IIIZII)J",
      garbageValue = "1150248030"
   )
   public static long method6263(int var0, int var1, int var2, boolean var3, int var4) {
      long var5 = (long)((var0 & 127) << 0 | (var1 & 127) << 7 | (var2 & 3) << 14) | ((long)var4 & 4294967295L) << 17;
      if(var3) {
         var5 |= 65536L;
      }

      return var5;
   }

   @ObfuscatedName("a")
   static boolean method6262(long var0) {
      return UrlRequester.method5572(var0) == 2;
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "([Ljava/lang/String;[SIIB)V",
      garbageValue = "82"
   )
   public static void method6264(String[] var0, short[] var1, int var2, int var3) {
      if(var2 < var3) {
         int var4 = (var3 + var2) / 2;
         int var5 = var2;
         String var6 = var0[var4];
         var0[var4] = var0[var3];
         var0[var3] = var6;
         short var7 = var1[var4];
         var1[var4] = var1[var3];
         var1[var3] = var7;

         for(int var8 = var2; var8 < var3; ++var8) {
            if(var6 == null || var0[var8] != null && var0[var8].compareTo(var6) < (var8 & 1)) {
               String var9 = var0[var8];
               var0[var8] = var0[var5];
               var0[var5] = var9;
               short var10 = var1[var8];
               var1[var8] = var1[var5];
               var1[var5++] = var10;
            }
         }

         var0[var3] = var0[var5];
         var0[var5] = var6;
         var1[var3] = var1[var5];
         var1[var5] = var7;
         method6264(var0, var1, var2, var5 - 1);
         method6264(var0, var1, var5 + 1, var3);
      }

   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(IB)Lia;",
      garbageValue = "-2"
   )
   public static ComponentType method6246(int var0) {
      int var1 = var0 >> 16;
      int var2 = var0 & 65535;
      if(ComponentType.interfaces[var1] == null || ComponentType.interfaces[var1][var2] == null) {
         boolean var3 = ChatLine.method5915(var1);
         if(!var3) {
            return null;
         }
      }

      return ComponentType.interfaces[var1][var2];
   }
}
