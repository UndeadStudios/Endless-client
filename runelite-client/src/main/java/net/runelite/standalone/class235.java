package net.runelite.standalone;

import java.lang.management.GarbageCollectorMXBean;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("go")
public class class235 {
   @ObfuscatedName("rh")
   @ObfuscatedGetter(
      intValue = 505522001
   )
   static int field2436;
   @ObfuscatedName("f")
   static byte[][] field2430;
   @ObfuscatedName("fm")
   @ObfuscatedSignature(
      signature = "Lfq;"
   )
   static class323 field2434;
   @ObfuscatedName("q")
   public static byte[][][] field2432;
   @ObfuscatedName("x")
   static byte[][] field2433;
   @ObfuscatedName("p")
   public static int[] field2431;
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      intValue = -37333117
   )
   static int field2428;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = 1124255007
   )
   static int field2425;
   @ObfuscatedName("h")
   static byte[][] field2429;
   @ObfuscatedName("ao")
   static GarbageCollectorMXBean field2426;
   @ObfuscatedName("g")
   @ObfuscatedGetter(
      intValue = -1721552049
   )
   static int field2427;

   static {
      field2428 = 0;
      field2425 = 0;
      field2427 = 0;
      field2433 = new byte[1000][];
      field2429 = new byte[250][];
      field2430 = new byte[50][];
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "(IZI)[B",
      garbageValue = "-1296589171"
   )
   static synchronized byte[] method4546(int var0, boolean var1) {
      byte[] var2;
      if(var0 != 100) {
         if(var0 < 100) {
            ;
         }
      } else if(field2428 > 0) {
         var2 = field2433[--field2428];
         field2433[field2428] = null;
         return var2;
      }

      if(var0 != 5000) {
         if(var0 < 5000) {
            ;
         }
      } else if(field2425 > 0) {
         var2 = field2429[--field2425];
         field2429[field2425] = null;
         return var2;
      }

      if(var0 != 30000) {
         if(var0 < 30000) {
            ;
         }
      } else if(field2427 > 0) {
         var2 = field2430[--field2427];
         field2430[field2427] = null;
         return var2;
      }

      if(field2432 != null) {
         for(int var4 = 0; var4 < field2431.length; ++var4) {
            if(field2431[var4] != var0) {
               if(var0 < field2431[var4]) {
                  ;
               }
            } else if(class83.field1964[var4] > 0) {
               byte[] var3 = field2432[var4][--class83.field1964[var4]];
               field2432[var4][class83.field1964[var4]] = null;
               return var3;
            }
         }
      }

      return new byte[var0];
   }
}
