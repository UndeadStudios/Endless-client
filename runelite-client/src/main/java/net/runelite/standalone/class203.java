package net.runelite.standalone;

import java.text.DecimalFormat;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cc")
public class class203 {
   @ObfuscatedName("ak")
   static String loginMessage1;
   @ObfuscatedName("by")
   static boolean worldSelectShown;
   @ObfuscatedName("aq")
   @ObfuscatedGetter(
      intValue = -1014786149
   )
   static int field1170;
   @ObfuscatedName("bb")
   static boolean field1182;
   @ObfuscatedName("ae")
   @ObfuscatedGetter(
      intValue = -1831446739
   )
   static int loadingBarPercentage;
   @ObfuscatedName("k")
   @ObfuscatedGetter(
      intValue = -1693868597
   )
   static int field1176;
   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "[Llv;"
   )
   static IndexedSprite[] titlemuteSprite;
   @ObfuscatedName("br")
   static boolean field1181;
   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "Llv;"
   )
   static IndexedSprite field1175;
   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "Llv;"
   )
   static IndexedSprite logoSprite;
   @ObfuscatedName("ca")
   @ObfuscatedGetter(
      longValue = 2741211572456463589L
   )
   static long field1190;
   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "Lld;"
   )
   static SpritePixels rightBackground;
   @ObfuscatedName("ag")
   @ObfuscatedGetter(
      intValue = 444700065
   )
   static int field1161;
   @ObfuscatedName("b")
   @ObfuscatedSignature(
      signature = "Llv;"
   )
   static IndexedSprite field1154;
   @ObfuscatedName("cm")
   @ObfuscatedGetter(
      intValue = 1502022767
   )
   static int field1187;
   @ObfuscatedName("aw")
   @ObfuscatedGetter(
      intValue = 1042895367
   )
   static int field1183;
   @ObfuscatedName("bo")
   static String username;
   @ObfuscatedName("a")
   static boolean field1149;
   @ObfuscatedName("z")
   @ObfuscatedGetter(
      intValue = 1088124961
   )
   static int field1160;
   @ObfuscatedName("av")
   static String loadingText;
   @ObfuscatedName("bk")
   static boolean field1180;
   @ObfuscatedName("cy")
   @ObfuscatedGetter(
      longValue = 902822279460057009L
   )
   static long field1191;
   @ObfuscatedName("ah")
   @ObfuscatedGetter(
      intValue = -2070211379
   )
   static int field1163;
   @ObfuscatedName("an")
   @ObfuscatedGetter(
      intValue = -368728983
   )
   static int field1165;
   @ObfuscatedName("be")
   static String password;
   @ObfuscatedName("at")
   @ObfuscatedGetter(
      intValue = -312281389
   )
   static int field1150;
   @ObfuscatedName("y")
   @ObfuscatedGetter(
      intValue = -24166413
   )
   static int loginWindowX;
   @ObfuscatedName("am")
   static String loginMessage2;
   @ObfuscatedName("bf")
   static String loginMessage3;
   @ObfuscatedName("ax")
   @ObfuscatedGetter(
      intValue = 78635069
   )
   static int loginIndex;
   @ObfuscatedName("ch")
   @ObfuscatedGetter(
      intValue = -967946489
   )
   static int field1152;
   @ObfuscatedName("d")
   static int[] field1159;
   @ObfuscatedName("aa")
   static int[] field1164;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = 192153295
   )
   static int field1168;
   @ObfuscatedName("cg")
   @ObfuscatedGetter(
      intValue = 1445383135
   )
   static int field1153;
   @ObfuscatedName("bw")
   @ObfuscatedGetter(
      intValue = -1693261231
   )
   static int currentLoginField;
   @ObfuscatedName("ap")
   static String Login_response0;
   @ObfuscatedName("ac")
   @ObfuscatedGetter(
      intValue = -590991603
   )
   static int field1172;

   static {
      field1168 = 0;
      loginWindowX = field1168 + 202;
      field1159 = new int[256];
      field1160 = 0;
      field1161 = 0;
      field1163 = 0;
      field1183 = 0;
      field1165 = 0;
      field1150 = 0;
      loadingBarPercentage = 10;
      loadingText = "";
      field1170 = -1;
      field1172 = 1;
      loginIndex = 0;
      Login_response0 = "";
      loginMessage1 = "";
      loginMessage2 = "";
      loginMessage3 = "";
      username = "";
      password = "";
      field1180 = false;
      field1181 = false;
      field1182 = true;
      currentLoginField = 0;
      worldSelectShown = false;
      field1187 = -1;
      field1152 = 0;
      field1153 = 0;
      new DecimalFormat("##0.00");
      new class211();
      field1190 = -1L;
      field1191 = -1L;
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "-1534235560"
   )
   static final int method3976() {
      return class47.Viewport_mouseX;
   }
}
