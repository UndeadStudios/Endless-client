package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("kv")
public class class52 {
   @ObfuscatedName("br")
   static String sessionToken;
   @ObfuscatedName("x")
   static int[] field3806;
   @ObfuscatedName("a")
   static char[] field3807;
   @ObfuscatedName("s")
   static char[] field3804;
   @ObfuscatedName("g")
   static char[] field3805;

   static {
      field3807 = new char[64];

      int var0;
      for(var0 = 0; var0 < 26; ++var0) {
         field3807[var0] = (char)(var0 + 65);
      }

      for(var0 = 26; var0 < 52; ++var0) {
         field3807[var0] = (char)(var0 + 97 - 26);
      }

      for(var0 = 52; var0 < 62; ++var0) {
         field3807[var0] = (char)(var0 + 48 - 52);
      }

      field3807[62] = '+';
      field3807[63] = '/';
      field3804 = new char[64];

      for(var0 = 0; var0 < 26; ++var0) {
         field3804[var0] = (char)(var0 + 65);
      }

      for(var0 = 26; var0 < 52; ++var0) {
         field3804[var0] = (char)(var0 + 97 - 26);
      }

      for(var0 = 52; var0 < 62; ++var0) {
         field3804[var0] = (char)(var0 + 48 - 52);
      }

      field3804[62] = '*';
      field3804[63] = '-';
      field3805 = new char[64];

      for(var0 = 0; var0 < 26; ++var0) {
         field3805[var0] = (char)(var0 + 65);
      }

      for(var0 = 26; var0 < 52; ++var0) {
         field3805[var0] = (char)(var0 + 97 - 26);
      }

      for(var0 = 52; var0 < 62; ++var0) {
         field3805[var0] = (char)(var0 + 48 - 52);
      }

      field3805[62] = '-';
      field3805[63] = '_';
      field3806 = new int[128];

      for(var0 = 0; var0 < field3806.length; ++var0) {
         field3806[var0] = -1;
      }

      for(var0 = 65; var0 <= 90; ++var0) {
         field3806[var0] = var0 - 65;
      }

      for(var0 = 97; var0 <= 122; ++var0) {
         field3806[var0] = var0 - 97 + 26;
      }

      for(var0 = 48; var0 <= 57; ++var0) {
         field3806[var0] = var0 - 48 + 52;
      }

      int[] var2 = field3806;
      field3806[43] = 62;
      var2[42] = 62;
      int[] var1 = field3806;
      field3806[47] = 63;
      var1[45] = 63;
   }
}
