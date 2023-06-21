package net.runelite.standalone;

import java.util.HashMap;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ke")
public class Fonts {
   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "Liz;"
   )
   Js5Index field3758;
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "Liz;"
   )
   Js5Index field3759;
   @ObfuscatedName("g")
   HashMap map;

   @ObfuscatedSignature(
      signature = "(Liz;Liz;)V"
   )
   public Fonts(Js5Index var1, Js5Index var2) {
      this.field3758 = var1;
      this.field3759 = var2;
      this.map = new HashMap();
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "([Lkw;I)Ljava/util/HashMap;",
      garbageValue = "1733378551"
   )
   public HashMap method6418(FontName[] var1) {
      HashMap var2 = new HashMap();
      FontName[] var3 = var1;

      for(int var4 = 0; var4 < var3.length; ++var4) {
         FontName var5 = var3[var4];
         if(this.map.containsKey(var5)) {
            var2.put(var5, this.map.get(var5));
         } else {
            Js5Index var7 = this.field3758;
            Js5Index var8 = this.field3759;
            String var9 = var5.field3750;
            int var10 = var7.method4132(var9);
            int var11 = var7.method4137(var10, "");
            Font var6 = CacheFile.method5606(var7, var8, var10, var11);
            if(var6 != null) {
               this.map.put(var5, var6);
               var2.put(var5, var6);
            }
         }
      }

      return var2;
   }
}
