package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lf")
public class GraphicsDefaults {
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = -1684366731
   )
   public int field3823;
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = 822521699
   )
   public int field3821;
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = -2019109473
   )
   public int field3828;
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      intValue = -1669700025
   )
   public int field3825;
   @ObfuscatedName("p")
   @ObfuscatedGetter(
      intValue = 853063867
   )
   public int field3818;
   @ObfuscatedName("b")
   @ObfuscatedGetter(
      intValue = -1843108053
   )
   public int field3827;
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      intValue = 540491633
   )
   public int field3826;
   @ObfuscatedName("n")
   @ObfuscatedGetter(
      intValue = -1831295821
   )
   public int field3824;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = -2080478391
   )
   public int field3819;
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      intValue = 494661443
   )
   public int field3822;
   @ObfuscatedName("g")
   @ObfuscatedGetter(
      intValue = -2017959977
   )
   public int field3820;

   public GraphicsDefaults() {
      this.field3826 = -1;
      this.field3819 = -1;
      this.field3820 = -1;
      this.field3828 = -1;
      this.field3822 = -1;
      this.field3823 = -1;
      this.field3818 = -1;
      this.field3825 = -1;
      this.field3821 = -1;
      this.field3827 = -1;
      this.field3824 = -1;
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "(Liz;I)V",
      garbageValue = "81438250"
   )
   public void method2175(Js5Index var1) {
      byte[] var2 = var1.method4122(class154.field3815.group);
      Packet var3 = new Packet(var2);

      while(true) {
         int var4 = var3.readUnsignedByte();
         if(var4 == 0) {
            return;
         }

         switch(var4) {
         case 1:
            var3.method5090();
            break;
         case 2:
            this.field3826 = var3.method5287();
            this.field3819 = var3.method5287();
            this.field3820 = var3.method5287();
            this.field3828 = var3.method5287();
            this.field3822 = var3.method5287();
            this.field3823 = var3.method5287();
            this.field3818 = var3.method5287();
            this.field3825 = var3.method5287();
            this.field3821 = var3.method5287();
            this.field3827 = var3.method5287();
            this.field3824 = var3.method5287();
         }
      }
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "(B)[Llp;",
      garbageValue = "-28"
   )
   public static class225[] method2176() {
      return new class225[]{class225.field3871, class225.field3877, class225.field3873};
   }
}
