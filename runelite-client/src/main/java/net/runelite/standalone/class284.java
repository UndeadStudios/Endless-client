package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("im")
public class class284 {
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/Throwable;Ljava/lang/String;)Lfe;"
   )
   public static JagException method5855(Throwable var0, String var1) {
      JagException var2;
      if(var0 instanceof JagException) {
         var2 = (JagException)var0;
         var2.field2021 = var2.field2021 + ' ' + var1;
      } else {
         var2 = new JagException(var0, var1);
      }

      return var2;
   }
}
