package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jq")
public class StructType extends CacheableNode {
   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "Liz;"
   )
   public static Js5Index field3414;
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "Lgp;"
   )
   public static NodeCache structTypeCache;
   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "Lgs;"
   )
   IterableHashTable params;

   static {
      structTypeCache = new NodeCache(64);
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(ILjava/lang/String;S)Ljava/lang/String;",
      garbageValue = "-7097"
   )
   public String method3052(int var1, String var2) {
      IterableHashTable var4 = this.params;
      String var3;
      if(var4 == null) {
         var3 = var2;
      } else {
         ObjectNode var5 = (ObjectNode)var4.method2178((long)var1);
         if(var5 == null) {
            var3 = var2;
         } else {
            var3 = (String)var5.value;
         }
      }

      return var3;
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(Lgx;II)V",
      garbageValue = "1629312204"
   )
   void method3050(Packet var1, int var2) {
      if(var2 == 249) {
         this.params = class51.method850(var1, this.params);
      }

   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "877328517"
   )
   void method3067() {
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      signature = "(III)I",
      garbageValue = "-698436080"
   )
   public int method3048(int var1, int var2) {
      IterableHashTable var4 = this.params;
      int var3;
      if(var4 == null) {
         var3 = var2;
      } else {
         IntegerNode var5 = (IntegerNode)var4.method2178((long)var1);
         if(var5 == null) {
            var3 = var2;
         } else {
            var3 = var5.value;
         }
      }

      return var3;
   }

   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "(Lgx;B)V",
      garbageValue = "-43"
   )
   void method3055(Packet var1) {
      while(true) {
         int var2 = var1.readUnsignedByte();
         if(var2 == 0) {
            return;
         }

         this.method3050(var1, var2);
      }
   }

   @ObfuscatedName("au")
   @ObfuscatedSignature(
      signature = "(ILcs;ZI)I",
      garbageValue = "-733888147"
   )
   static int method3061(int var0, class314 var1, boolean var2) {
      int var3;
      if(var0 == 4200) {
         var3 = class281.intStack[--class281.intStackSize];
         class281.scriptStringStack[++class295.scriptStringStackSize - 1] = class79.method1074(var3).name;
         return 1;
      } else {
         int var4;
         ObjType var5;
         if(var0 == 4201) {
            class281.intStackSize -= 2;
            var3 = class281.intStack[class281.intStackSize];
            var4 = class281.intStack[class281.intStackSize + 1];
            var5 = class79.method1074(var3);
            if(var4 >= 1 && var4 <= 5 && var5.ops[var4 - 1] != null) {
               class281.scriptStringStack[++class295.scriptStringStackSize - 1] = var5.ops[var4 - 1];
            } else {
               class281.scriptStringStack[++class295.scriptStringStackSize - 1] = "";
            }

            return 1;
         } else if(var0 == 4202) {
            class281.intStackSize -= 2;
            var3 = class281.intStack[class281.intStackSize];
            var4 = class281.intStack[class281.intStackSize + 1];
            var5 = class79.method1074(var3);
            if(var4 >= 1 && var4 <= 5 && var5.iops[var4 - 1] != null) {
               class281.scriptStringStack[++class295.scriptStringStackSize - 1] = var5.iops[var4 - 1];
            } else {
               class281.scriptStringStack[++class295.scriptStringStackSize - 1] = "";
            }

            return 1;
         } else if(var0 == 4203) {
            var3 = class281.intStack[--class281.intStackSize];
            class281.intStack[++class281.intStackSize - 1] = class79.method1074(var3).cost;
            return 1;
         } else if(var0 == 4204) {
            var3 = class281.intStack[--class281.intStackSize];
            class281.intStack[++class281.intStackSize - 1] = class79.method1074(var3).stackable == 1?1:0;
            return 1;
         } else {
            ObjType var6;
            if(var0 == 4205) {
               var3 = class281.intStack[--class281.intStackSize];
               var6 = class79.method1074(var3);
               if(var6.certTemplate == -1 && var6.certLink >= 0) {
                  class281.intStack[++class281.intStackSize - 1] = var6.certLink;
               } else {
                  class281.intStack[++class281.intStackSize - 1] = var3;
               }

               return 1;
            } else if(var0 == 4206) {
               var3 = class281.intStack[--class281.intStackSize];
               var6 = class79.method1074(var3);
               if(var6.certTemplate >= 0 && var6.certLink >= 0) {
                  class281.intStack[++class281.intStackSize - 1] = var6.certLink;
               } else {
                  class281.intStack[++class281.intStackSize - 1] = var3;
               }

               return 1;
            } else if(var0 == 4207) {
               var3 = class281.intStack[--class281.intStackSize];
               class281.intStack[++class281.intStackSize - 1] = class79.method1074(var3).members?1:0;
               return 1;
            } else if(var0 == 4208) {
               var3 = class281.intStack[--class281.intStackSize];
               var6 = class79.method1074(var3);
               if(var6.placeholderTemplate == -1 && var6.placeholderLink >= 0) {
                  class281.intStack[++class281.intStackSize - 1] = var6.placeholderLink;
               } else {
                  class281.intStack[++class281.intStackSize - 1] = var3;
               }

               return 1;
            } else if(var0 == 4209) {
               var3 = class281.intStack[--class281.intStackSize];
               var6 = class79.method1074(var3);
               if(var6.placeholderTemplate >= 0 && var6.placeholderLink >= 0) {
                  class281.intStack[++class281.intStackSize - 1] = var6.placeholderLink;
               } else {
                  class281.intStack[++class281.intStackSize - 1] = var3;
               }

               return 1;
            } else if(var0 == 4210) {
               String var7 = class281.scriptStringStack[--class295.scriptStringStackSize];
               var4 = class281.intStack[--class281.intStackSize];
               ScriptEvent.method1139(var7, var4 == 1);
               class281.intStack[++class281.intStackSize - 1] = Isaac.field2467;
               return 1;
            } else if(var0 != 4211) {
               if(var0 == 4212) {
                  class318.field114 = 0;
                  return 1;
               } else {
                  return 2;
               }
            } else {
               if(OwnWorldComparator.field640 != null && class318.field114 < Isaac.field2467) {
                  class281.intStack[++class281.intStackSize - 1] = OwnWorldComparator.field640[++class318.field114 - 1] & '\uffff';
               } else {
                  class281.intStack[++class281.intStackSize - 1] = -1;
               }

               return 1;
            }
         }
      }
   }
}
