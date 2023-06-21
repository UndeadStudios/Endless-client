package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ah")
public class class181 {
   @ObfuscatedName("kp")
   @ObfuscatedGetter(
      intValue = 685372481
   )
   static int menuX;
   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "Lah;"
   )
   static final class181 field273;
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "Lah;"
   )
   static final class181 field272;
   @ObfuscatedName("do")
   @ObfuscatedSignature(
      signature = "Lin;"
   )
   static Js5 anims;
   @ObfuscatedName("g")
   @ObfuscatedGetter(
      intValue = 918834633
   )
   final int field274;

   static {
      field273 = new class181(0);
      field272 = new class181(1);
   }

   class181(int var1) {
      this.field274 = var1;
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "(IB)Ljava/lang/String;",
      garbageValue = "-30"
   )
   static String getModIcon(int var0) {
      return var0 == 31 ? "" : "<img=" + var0 + ">";
   }

   @ObfuscatedName("kc")
   @ObfuscatedSignature(
      signature = "(Lia;II)Ljava/lang/String;",
      garbageValue = "1681405499"
   )
   static String method3045(ComponentType var0, int var1) {
      int var3 = WorldComparator.method86(var0);
      boolean var2 = (var3 >> var1 + 1 & 1) != 0;
      return !var2 && var0.onOpListener == null?null:(var0.ops != null && var0.ops.length > var1 && var0.ops[var1] != null && var0.ops[var1].trim().length() != 0?var0.ops[var1]:null);
   }

   @ObfuscatedName("y")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;I)V",
      garbageValue = "-179278775"
   )
   static final void method3044(String var0) {
      class54.method868("Please remove " + var0 + " from your friend list first");
   }
}
