package net.runelite.standalone;

import java.util.Calendar;
import java.util.TimeZone;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gc")
public class class192 {
   @ObfuscatedName("a")
   static final String[][] MONTHS_ABBREVIATED;
   @ObfuscatedName("n")
   @ObfuscatedSignature(
      signature = "Liz;"
   )
   static Js5Index field2478;
   @ObfuscatedName("s")
   static final String[] DAYS_ABBREVIATED;
   @ObfuscatedName("g")
   static Calendar GMT_CALENDAR;

   static {
      MONTHS_ABBREVIATED = new String[][]{{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"}, {"Jan", "Feb", "Mär", "Apr", "Mai", "Jun", "Jul", "Aug", "Sep", "Okt", "Nov", "Dez"}};
      DAYS_ABBREVIATED = new String[]{"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
      Calendar.getInstance(TimeZone.getTimeZone("Europe/London"));
      GMT_CALENDAR = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "(Lbr;I)V",
      garbageValue = "418508405"
   )
   public static void method3810(ScriptEvent var0) {
      class258.method4859(var0, 500000, -2128692103);
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "(IIII)I",
      garbageValue = "-2062416964"
   )
   public static int method3813(int var0, int var1, int var2) {
      var2 &= 3;
      return var2 == 0?var0:(var2 == 1?var1:(var2 == 2?7 - var0:7 - var1));
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      signature = "(ILcs;ZB)I",
      garbageValue = "-19"
   )
   static int method3815(int var0, class314 var1, boolean var2) {
      ComponentType var3 = ChatHistory.method6246(class281.intStack[--class281.intStackSize]);
      if(var0 == 2800) {
         class281.intStack[++class281.intStackSize - 1] = CacheFile.method5603(WorldComparator.method86(var3));
         return 1;
      } else if(var0 != 2801) {
         if(var0 == 2802) {
            if(var3.opBase == null) {
               class281.scriptStringStack[++class295.scriptStringStackSize - 1] = "";
            } else {
               class281.scriptStringStack[++class295.scriptStringStackSize - 1] = var3.opBase;
            }

            return 1;
         } else {
            return 2;
         }
      } else {
         int var4 = class281.intStack[--class281.intStackSize];
         --var4;
         if(var3.ops != null && var4 < var3.ops.length && var3.ops[var4] != null) {
            class281.scriptStringStack[++class295.scriptStringStackSize - 1] = var3.ops[var4];
         } else {
            class281.scriptStringStack[++class295.scriptStringStackSize - 1] = "";
         }

         return 1;
      }
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      signature = "(IIIZIZB)V",
      garbageValue = "111"
   )
   static void method3814(int var0, int var1, int var2, boolean var3, int var4, boolean var5) {
      if(var0 < var1) {
         int var6 = (var0 + var1) / 2;
         int var7 = var0;
         World var8 = class242.worldList[var6];
         class242.worldList[var6] = class242.worldList[var1];
         class242.worldList[var1] = var8;

         for(int var9 = var0; var9 < var1; ++var9) {
            if(PathingEntity.method2470(class242.worldList[var9], var8, var2, var3, var4, var5) <= 0) {
               World var10 = class242.worldList[var9];
               class242.worldList[var9] = class242.worldList[var7];
               class242.worldList[var7++] = var10;
            }
         }

         class242.worldList[var1] = class242.worldList[var7];
         class242.worldList[var7] = var8;
         method3814(var0, var7 - 1, var2, var3, var4, var5);
         method3814(var7 + 1, var1, var2, var3, var4, var5);
      }

   }

   @ObfuscatedName("u")
   @ObfuscatedSignature(
      signature = "(III)I",
      garbageValue = "1050581304"
   )
   static final int method3816(int var0, int var1) {
      if(var0 == -2) {
         return 12345678;
      } else if(var0 == -1) {
         if(var1 < 2) {
            var1 = 2;
         } else if(var1 > 126) {
            var1 = 126;
         }

         return var1;
      } else {
         var1 = (var0 & 127) * var1 / 128;
         if(var1 < 2) {
            var1 = 2;
         } else if(var1 > 126) {
            var1 = 126;
         }

         return (var0 & 65408) + var1;
      }
   }
}
