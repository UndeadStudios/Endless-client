package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bz")
public class ScriptState {
    public class314 field740;
   public int[] field738;
   public String[] field741;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = -1508273535
   )
   int invokedFromPc;

   ScriptState() {
      this.invokedFromPc = -1;
   }

   @ObfuscatedName("jn")
   @ObfuscatedSignature(
      signature = "([Lia;Lia;ZI)V",
      garbageValue = "1459213909"
   )
   static void method1043(ComponentType[] var0, ComponentType var1, boolean var2) {
      int var3 = var1.scrollWidth != 0?var1.scrollWidth:var1.width;
      int var4 = var1.scrollHeight != 0?var1.scrollHeight:var1.height;
      Frames.method6063(var0, var1.id, var3, var4, var2);
      if(var1.children != null) {
         Frames.method6063(var1.children, var1.id, var3, var4, var2);
      }

      SubInterface var5 = (SubInterface) client.subInterfaces.method6335((long)var1.id);
      if(var5 != null) {
         int var6 = var5.id;
         if(ChatLine.method5915(var6)) {
            Frames.method6063(ComponentType.interfaces[var6], -1, var3, var4, var2);
         }
      }

      if(var1.clientcode == 1337) {
         ;
      }

   }

   @ObfuscatedName("t")
   @ObfuscatedSignature(
      signature = "(ILcs;ZB)I",
      garbageValue = "-39"
   )
   static int method1044(int var0, class314 var1, boolean var2) {
      ComponentType var3 = var2?ClientOptions.field1035:class290.field1119;
      if(var0 == 1600) {
         class281.intStack[++class281.intStackSize - 1] = var3.scrollX;
         return 1;
      } else if(var0 == 1601) {
         class281.intStack[++class281.intStackSize - 1] = var3.scrollY;
         return 1;
      } else if(var0 == 1602) {
         class281.scriptStringStack[++class295.scriptStringStackSize - 1] = var3.text;
         return 1;
      } else if(var0 == 1603) {
         class281.intStack[++class281.intStackSize - 1] = var3.scrollWidth;
         return 1;
      } else if(var0 == 1604) {
         class281.intStack[++class281.intStackSize - 1] = var3.scrollHeight;
         return 1;
      } else if(var0 == 1605) {
         class281.intStack[++class281.intStackSize - 1] = var3.zoom2d;
         return 1;
      } else if(var0 == 1606) {
         class281.intStack[++class281.intStackSize - 1] = var3.xan2d;
         return 1;
      } else if(var0 == 1607) {
         class281.intStack[++class281.intStackSize - 1] = var3.zan2d;
         return 1;
      } else if(var0 == 1608) {
         class281.intStack[++class281.intStackSize - 1] = var3.yan2d;
         return 1;
      } else if(var0 == 1609) {
         class281.intStack[++class281.intStackSize - 1] = var3.trans;
         return 1;
      } else if(var0 == 1610) {
         class281.intStack[++class281.intStackSize - 1] = var3.field2787;
         return 1;
      } else if(var0 == 1611) {
         class281.intStack[++class281.intStackSize - 1] = var3.color;
         return 1;
      } else if(var0 == 1612) {
         class281.intStack[++class281.intStackSize - 1] = var3.field2811;
         return 1;
      } else if(var0 == 1613) {
         class281.intStack[++class281.intStackSize - 1] = var3.field2719.vmethod6373();
         return 1;
      } else if(var0 == 1614) {
         class281.intStack[++class281.intStackSize - 1] = var3.field2747?1:0;
         return 1;
      } else {
         return 2;
      }
   }
}
