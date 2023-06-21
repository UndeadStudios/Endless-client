package net.runelite.standalone;

import java.io.File;
import java.io.RandomAccessFile;
import java.util.LinkedHashMap;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eh")
public enum AuthProt implements Enumerated {
   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "Leh;"
   )
   field1981(3, 0),
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "Leh;"
   )
   field1985(2, 1),
   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "Leh;"
   )
   field1982(1, 2),
   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "Leh;"
   )
   field1983(0, 3);

   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = -1312379937
   )
   final int field1980;
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      intValue = -2142086551
   )
   public final int field1984;

   AuthProt(int var3, int var4) {
      this.field1984 = var3;
      this.field1980 = var4;
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "-303219076"
   )
   public int vmethod6373() {
      return this.field1980;
   }

   @ObfuscatedName("ft")
   @ObfuscatedSignature(
      signature = "(ZS)V",
      garbageValue = "7464"
   )
   static final void method6377(boolean var0) {
      if(var0) {
         client.field914 = class203.field1182?field1985:field1983;
      } else {
         LinkedHashMap var1 = class312.options.authRememberTokens;
         String var3 = class203.username;
         int var4 = var3.length();
         int var5 = 0;

         for(int var6 = 0; var6 < var4; ++var6) {
            var5 = (var5 << 5) - var5 + var3.charAt(var6);
         }

         client.field914 = var1.containsKey(Integer.valueOf(var5))?field1981:field1982;
      }

   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "(II)Lju;",
      garbageValue = "-686750587"
   )
   public static Sequence method6374(int var0) {
      Sequence var1 = (Sequence)Sequence.sequences.method635((long)var0);
      if(var1 != null) {
         return var1;
      } else {
         byte[] var2 = Sequence.seq_ref.method4115(12, var0, -1250859727);
         var1 = new Sequence();
         if(var2 != null) {
            var1.method5006(new Packet(var2));
         }

         var1.method5032();
         Sequence.sequences.method628(var1, (long)var0);
         return var1;
      }
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(II)Lix;",
      garbageValue = "381202278"
   )
   public static ModeWhere method6378(int var0) {
      ModeWhere[] var1 = MouseInput.method1931();

      for(int var2 = 0; var2 < var1.length; ++var2) {
         ModeWhere var3 = var1[var2];
         if(var0 == var3.field3216) {
            return var3;
         }
      }

      return null;
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(Ljava/io/File;ZI)Z",
      garbageValue = "16711935"
   )
   public static boolean method6379(File var0, boolean var1) {
      try {
         RandomAccessFile var2 = new RandomAccessFile(var0, "rw");
         int var3 = var2.read();
         var2.seek(0L);
         var2.write(var3);
         var2.seek(0L);
         var2.close();
         if(var1) {
            var0.delete();
         }

         return true;
      } catch (Exception var4) {
         return false;
      }
   }
}
