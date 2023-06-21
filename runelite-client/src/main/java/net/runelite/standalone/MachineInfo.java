package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("li")
public class MachineInfo extends Node {
   @ObfuscatedName("ak")
   @ObfuscatedGetter(
      intValue = 1178383851
   )
   int field3928;
   @ObfuscatedName("al")
   @ObfuscatedGetter(
      intValue = -1737806495
   )
   int field3926;
   @ObfuscatedName("ae")
   @ObfuscatedGetter(
      intValue = -246402761
   )
   int javaVendorType;
   @ObfuscatedName("bz")
   @ObfuscatedGetter(
      intValue = -672502519
   )
   int field3939;
   @ObfuscatedName("bd")
   int[] field3938;
   @ObfuscatedName("au")
   @ObfuscatedGetter(
      intValue = -773146569
   )
   int javaVersionMinor;
   @ObfuscatedName("aj")
   @ObfuscatedGetter(
      intValue = -1371798001
   )
   int javaVersionPatch;
   @ObfuscatedName("aw")
   @ObfuscatedGetter(
      intValue = -954353821
   )
   int osType;
   @ObfuscatedName("bo")
   String field3936;
   @ObfuscatedName("ai")
   @ObfuscatedGetter(
      intValue = 1094623715
   )
   int field3925;
   @ObfuscatedName("av")
   @ObfuscatedGetter(
      intValue = -1133324349
   )
   int javaVersionMajor;
   @ObfuscatedName("an")
   boolean os64Bit;
   @ObfuscatedName("be")
   String field3912;
   @ObfuscatedName("at")
   @ObfuscatedGetter(
      intValue = -2022011321
   )
   int osVersionType;
   @ObfuscatedName("am")
   @ObfuscatedGetter(
      intValue = 87564309
   )
   int field3934;
   @ObfuscatedName("bf")
   @ObfuscatedGetter(
      intValue = 193012179
   )
   int field3908;
   @ObfuscatedName("as")
   boolean field3923;
   @ObfuscatedName("ax")
   String field3924;
   @ObfuscatedName("ar")
   @ObfuscatedGetter(
      intValue = -526326567
   )
   int maxMemoryMB;
   @ObfuscatedName("ad")
   String field3930;
   @ObfuscatedName("az")
   @ObfuscatedGetter(
      intValue = -1598160397
   )
   int field3931;
   @ObfuscatedName("ap")
   @ObfuscatedGetter(
      intValue = -1815618991
   )
   int field3932;
   @ObfuscatedName("ac")
   String field3929;
   @ObfuscatedName("bi")
   String field3940;
   @ObfuscatedName("ao")
   String field3915;

   MachineInfo(int var1, boolean var2, int var3, int var4, int var5, int var6, int var7, boolean var8, int var9, int var10, int var11, int var12, String var13, String var14, String var15, String var16, int var17, int var18, int var19, int var20, String var21, String var22, int[] var23, int var24, String var25) {
      this.field3938 = new int[3];
      this.osType = var1;
      this.os64Bit = var2;
      this.osVersionType = var3;
      this.javaVendorType = var4;
      this.javaVersionMajor = var5;
      this.javaVersionMinor = var6;
      this.javaVersionPatch = var7;
      this.field3923 = var8;
      this.maxMemoryMB = var9;
      this.field3925 = var10;
      this.field3926 = var11;
      this.field3931 = var12;
      this.field3929 = var13;
      this.field3915 = var14;
      this.field3930 = var15;
      this.field3924 = var16;
      this.field3932 = var17;
      this.field3928 = var18;
      this.field3934 = var19;
      this.field3908 = var20;
      this.field3936 = var21;
      this.field3912 = var22;
      this.field3938 = var23;
      this.field3939 = var24;
      this.field3940 = var25;
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "(Lgx;I)V",
      garbageValue = "-2031295527"
   )
   public void method882(Packet var1) {
      var1.writeByte(7);
      var1.writeByte(this.osType);
      var1.writeByte(this.os64Bit?1:0);
      var1.writeByte(this.osVersionType);
      var1.writeByte(this.javaVendorType);
      var1.writeByte(this.javaVersionMajor);
      var1.writeByte(this.javaVersionMinor);
      var1.writeByte(this.javaVersionPatch);
      var1.writeByte(this.field3923?1:0);
      var1.writeShort(this.maxMemoryMB);
      var1.writeByte(this.field3925);
      var1.writeMedium(this.field3926);
      var1.writeShort(this.field3931);
      var1.writeJAGString(this.field3929);
      var1.writeJAGString(this.field3915);
      var1.writeJAGString(this.field3930);
      var1.writeJAGString(this.field3924);
      var1.writeByte(this.field3928);
      var1.writeShort(this.field3932);
      var1.writeJAGString(this.field3936);
      var1.writeJAGString(this.field3912);
      var1.writeByte(this.field3934);
      var1.writeByte(this.field3908);

      for(int var2 = 0; var2 < this.field3938.length; ++var2) {
         var1.writeInt(this.field3938[var2]);
      }

      var1.writeInt(this.field3939);
      var1.writeJAGString(this.field3940);
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(B)I",
      garbageValue = "72"
   )
   public int method881() {
      byte var1 = 38;
      int var2 = var1 + class140.method2018(this.field3929);
      var2 += class140.method2018(this.field3915);
      var2 += class140.method2018(this.field3930);
      var2 += class140.method2018(this.field3924);
      var2 += class140.method2018(this.field3936);
      var2 += class140.method2018(this.field3912);
      var2 += class140.method2018(this.field3940);
      return var2;
   }
}
