package net.runelite.standalone;

import java.util.Calendar;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bx")
public class class281 {
    public static int[] field3488;
   //public static Object[] field3488;
   @ObfuscatedName("po")
   @ObfuscatedSignature(
      signature = "Lld;"
   )
   static SpritePixels minimapSprite;
   @ObfuscatedName("f")
   static int[][] scriptArrays;
   @ObfuscatedName("l")
   static Calendar LOCAL_CALENDAR;
   @ObfuscatedName("v")
   @ObfuscatedGetter(
      intValue = 1950724761
   )
   static int field1080;
   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "[Lbz;"
   )
   static ScriptState[] scriptStack;
   @ObfuscatedName("k")
   static boolean field1079;
   @ObfuscatedName("q")
   static String[] scriptStringStack;
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      intValue = -2131355083
   )
   static int intStackSize;
   @ObfuscatedName("p")
   static int[] intStack;
   @ObfuscatedName("o")
   static final String[] field1070;
   @ObfuscatedName("n")
   @ObfuscatedGetter(
      intValue = 637491727
   )
   static int scriptStackCount;
   @ObfuscatedName("c")
   static final double field1081;
   @ObfuscatedName("y")
   static boolean field1078;
   @ObfuscatedName("h")
   static int[] scriptArrayLengths;

   static {
      scriptArrayLengths = new int[5];
      scriptArrays = new int[5][5000];
      intStack = new int[1000];
      scriptStringStack = new String[1000];
      scriptStackCount = 0;
      scriptStack = new ScriptState[50];
      LOCAL_CALENDAR = Calendar.getInstance();
      field1070 = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
      field1078 = false;
      field1079 = false;
      field1080 = 0;
      field1081 = Math.log(2.0D);
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "(Lia;I[B[BB)V",
      garbageValue = "89"
   )
   static final void method5820(ComponentType var0, int var1, byte[] var2, byte[] var3) {
      if(var0.opKeys == null) {
         if(var2 == null) {
            return;
         }

         var0.opKeys = new byte[11][];
         var0.opKeyModifiers = new byte[11][];
         var0.opKeyRates = new int[11];
         var0.field2754 = new int[11];
      }

      var0.opKeys[var1] = var2;
      if(var2 != null) {
         var0.field2763 = true;
      } else {
         var0.field2763 = false;

         for(int var4 = 0; var4 < var0.opKeys.length; ++var4) {
            if(var0.opKeys[var4] != null) {
               var0.field2763 = true;
               break;
            }
         }
      }

      var0.opKeyModifiers[var1] = var3;
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(IB)Ljx;",
      garbageValue = "20"
   )
   public static IDKType method5819(int var0) {
      IDKType var1 = (IDKType)IDKType.identKits.method635((long)var0);
      if(var1 != null) {
         return var1;
      } else {
         byte[] var2 = IDKType.identKit_ref.method4115(3, var0, -78698100);
         var1 = new IDKType();
         if(var2 != null) {
            var1.method5404(new Packet(var2));
         }

         IDKType.identKits.method628(var1, (long)var0);
         return var1;
      }
   }
}
