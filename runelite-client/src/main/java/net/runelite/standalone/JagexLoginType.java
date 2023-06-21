package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.api.RSJagexLoginType;

@ObfuscatedName("ll")
public class JagexLoginType implements RSJagexLoginType {
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "Lll;"
   )
   static final JagexLoginType field4014;
   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "Lll;"
   )
   public static final JagexLoginType field4017;
   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "Lll;"
   )
   static final JagexLoginType field4012;
   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "Lll;"
   )
   static final JagexLoginType field4019;
   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "Lll;"
   )
   static final JagexLoginType field4015;
   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "Lll;"
   )
   public static final JagexLoginType field4016;
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "Lll;"
   )
   static final JagexLoginType field4010;
   @ObfuscatedName("h")
   @ObfuscatedSignature(
      signature = "Lll;"
   )
   static final JagexLoginType field4013;
   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "Lll;"
   )
   static final JagexLoginType field4009;
   @ObfuscatedName("b")
   @ObfuscatedGetter(
      intValue = -1974663209
   )
   public final int field4011;
   @ObfuscatedName("n")
   final String identifier;

   static {
      field4016 = new JagexLoginType(3, 0, "", "");
      field4010 = new JagexLoginType(4, 1, "", "");
      field4009 = new JagexLoginType(7, 2, "", "");
      field4012 = new JagexLoginType(5, 3, "", "");
      field4013 = new JagexLoginType(6, 4, "", "");
      field4014 = new JagexLoginType(1, 5, "", "");
      field4015 = new JagexLoginType(8, 6, "", "");
      field4019 = new JagexLoginType(2, 7, "", "");
      field4017 = new JagexLoginType(0, -1, "", "", true, new JagexLoginType[]{field4016, field4010, field4009, field4013, field4012});
   }

   JagexLoginType(int var1, int var2, String var3, String var4) {
      this.field4011 = var1;
      this.identifier = var4;
   }

   @ObfuscatedSignature(
      signature = "(IILjava/lang/String;Ljava/lang/String;Z[Lll;)V"
   )
   JagexLoginType(int var1, int var2, String var3, String var4, boolean var5, JagexLoginType[] var6) {
      this.field4011 = var1;
      this.identifier = var4;
   }

   public String toString() {
      return this.identifier;
   }

   public String aal() {
      return this.identifier;
   }

   public String aas() {
      return this.identifier;
   }
}
