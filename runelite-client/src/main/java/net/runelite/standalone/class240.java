package net.runelite.standalone;

import java.math.BigInteger;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ch")
public class class240 {
   @ObfuscatedName("mn")
   @ObfuscatedGetter(
      intValue = -1292469279
   )
   static int ifTargetMask;
   @ObfuscatedName("f")
   static final BigInteger field1110;
   @ObfuscatedName("h")
   static final BigInteger field1109;

   static {
      field1109 = new BigInteger("80782894952180643741752986186714059433953886149239752893425047584684715842049");
      field1110 = new BigInteger("7237300117305667488707183861728052766358166655052137727439795191253340127955075499635575104901523446809299097934591732635674173519120047404024393881551683");
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;B)Ljava/lang/Class;",
      garbageValue = "0"
   )
   static Class method4595(String var0) throws ClassNotFoundException {
      return var0.equals("B")?Byte.TYPE:(var0.equals("I")?Integer.TYPE:(var0.equals("S")?Short.TYPE:(var0.equals("J")?Long.TYPE:(var0.equals("Z")?Boolean.TYPE:(var0.equals("F")?Float.TYPE:(var0.equals("D")?Double.TYPE:(var0.equals("C")?Character.TYPE:(var0.equals("void")?Void.TYPE:Class.forName(var0)))))))));
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      signature = "(ILcs;ZB)I",
      garbageValue = "-32"
   )
   static int method4601(int var0, class314 var1, boolean var2) {
      int var3;
      int var4;
      int var6;
      if(var0 == 3400) {
         class281.intStackSize -= 2;
         var3 = class281.intStack[class281.intStackSize];
         var4 = class281.intStack[class281.intStackSize + 1];
         Enum var5 = MouseInput.method1932(var3);
         if(var5.valType != 's') {
            ;
         }

         for(var6 = 0; var6 < var5.size; ++var6) {
            if(var4 == var5.keys[var6]) {
               class281.scriptStringStack[++class295.scriptStringStackSize - 1] = var5.stringVals[var6];
               var5 = null;
               break;
            }
         }

         if(var5 != null) {
            class281.scriptStringStack[++class295.scriptStringStackSize - 1] = var5.defaultString;
         }

         return 1;
      } else if(var0 != 3408) {
         if(var0 == 3411) {
            var3 = class281.intStack[--class281.intStackSize];
            Enum var10 = MouseInput.method1932(var3);
            class281.intStack[++class281.intStackSize - 1] = var10.method4348();
            return 1;
         } else {
            return 2;
         }
      } else {
         class281.intStackSize -= 4;
         var3 = class281.intStack[class281.intStackSize];
         var4 = class281.intStack[class281.intStackSize + 1];
         int var9 = class281.intStack[class281.intStackSize + 2];
         var6 = class281.intStack[class281.intStackSize + 3];
         Enum var7 = MouseInput.method1932(var9);
         if(var3 == var7.keyType && var4 == var7.valType) {
            for(int var8 = 0; var8 < var7.size; ++var8) {
               if(var6 == var7.keys[var8]) {
                  if(var4 == 115) {
                     class281.scriptStringStack[++class295.scriptStringStackSize - 1] = var7.stringVals[var8];
                  } else {
                     class281.intStack[++class281.intStackSize - 1] = var7.intVals[var8];
                  }

                  var7 = null;
                  break;
               }
            }

            if(var7 != null) {
               if(var4 == 115) {
                  class281.scriptStringStack[++class295.scriptStringStackSize - 1] = var7.defaultString;
               } else {
                  class281.intStack[++class281.intStackSize - 1] = var7.defaultInt;
               }
            }

            return 1;
         } else {
            if(var4 == 115) {
               class281.scriptStringStack[++class295.scriptStringStackSize - 1] = "null";
            } else {
               class281.intStack[++class281.intStackSize - 1] = 0;
            }

            return 1;
         }
      }
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(CII)C",
      garbageValue = "1742925831"
   )
   static char method4597(char var0, int var1) {
      if(var0 >= 192 && var0 <= 255) {
         if(var0 >= 192 && var0 <= 198) {
            return 'A';
         }

         if(var0 == 199) {
            return 'C';
         }

         if(var0 >= 200 && var0 <= 203) {
            return 'E';
         }

         if(var0 >= 204 && var0 <= 207) {
            return 'I';
         }

         if(var0 >= 210 && var0 <= 214) {
            return 'O';
         }

         if(var0 >= 217 && var0 <= 220) {
            return 'U';
         }

         if(var0 == 221) {
            return 'Y';
         }

         if(var0 == 223) {
            return 's';
         }

         if(var0 >= 224 && var0 <= 230) {
            return 'a';
         }

         if(var0 == 231) {
            return 'c';
         }

         if(var0 >= 232 && var0 <= 235) {
            return 'e';
         }

         if(var0 >= 236 && var0 <= 239) {
            return 'i';
         }

         if(var0 >= 242 && var0 <= 246) {
            return 'o';
         }

         if(var0 >= 249 && var0 <= 252) {
            return 'u';
         }

         if(var0 == 253 || var0 == 255) {
            return 'y';
         }
      }

      return var0 == 338?'O':(var0 == 339?'o':(var0 == 376?'Y':var0));
   }
}
