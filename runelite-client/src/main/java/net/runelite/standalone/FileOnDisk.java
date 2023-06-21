package net.runelite.standalone;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.SyncFailedException;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.api.RSFileOnDisk;

@ObfuscatedName("da")
public final class FileOnDisk implements RSFileOnDisk {
   @ObfuscatedName("a")
   RandomAccessFile file;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      longValue = 5301123448086758809L
   )
   long length;
   @ObfuscatedName("g")
   @ObfuscatedGetter(
      longValue = 8108136151641546007L
   )
   long position;

   public FileOnDisk(File var1, String var2, long var3) throws IOException {
      if(-1L == var3) {
         var3 = Long.MAX_VALUE;
      }

      if(var1.length() >= var3) {
         var1.delete();
      }

      this.file = new RandomAccessFile(var1, var2);
      this.length = var3;
      this.position = 0L;
      int var5 = this.file.read();
      if(var5 != -1 && !var2.equals("r")) {
         this.file.seek(0L);
         this.file.write(var5);
      }

      this.file.seek(0L);
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "([BIII)I",
      garbageValue = "2112137565"
   )
   public final int method5054(byte[] var1, int var2, int var3) throws IOException {
      int var4 = this.file.read(var1, var2, var3);
      if(var4 > 0) {
         this.position += (long)var4;
      }

      return var4;
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(ZI)V",
      garbageValue = "1675345209"
   )
   public final void method5052(boolean var1) throws IOException {
      if(this.file != null) {
         if(var1) {
            try {
               this.file.getFD().sync();
            } catch (SyncFailedException var3) {
               ;
            }
         }

         this.file.close();
         this.file = null;
      }

   }

   @ObfuscatedName("a")
   final void method5049(long var1) throws IOException {
      this.file.seek(var1);
      this.position = var1;
   }

   protected void aae() throws Throwable {
      if(this.file != null) {
         System.out.println("");
         this.method5051();
      }

   }

   protected void finalize() throws Throwable {
      if(this.file != null) {
         System.out.println("");
         this.method5051();
      }

   }

   protected void aak() throws Throwable {
      if(this.file != null) {
         System.out.println("");
         this.method5051();
      }

   }

   protected void aau() throws Throwable {
      if(this.file != null) {
         System.out.println("");
         this.method5051();
      }

   }

   public RandomAccessFile getFile() {
      return this.file;
   }

   public long getLength() {
      return this.length;
   }

   public long getPosition() {
      return this.position;
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "([BIIB)V",
      garbageValue = "-63"
   )
   public final void method5050(byte[] var1, int var2, int var3) throws IOException {
      if((long)var3 + this.position > this.length) {
         this.file.seek(1L + this.length);
         this.file.write(1);
         throw new EOFException();
      } else {
         this.file.write(var1, var2, var3);
         this.position += (long)var3;
      }
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      signature = "(I)J",
      garbageValue = "1478500850"
   )
   public final long method5053() throws IOException {
      return this.file.length();
   }

   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "(S)V",
      garbageValue = "23823"
   )
   public final void method5051() throws IOException {
      this.method5052(false);
   }

   @ObfuscatedName("b")
   @ObfuscatedSignature(
      signature = "(CB)Z",
      garbageValue = "1"
   )
   public static boolean method5066(char var0) {
      return var0 >= '0' && var0 <= '9' || var0 >= 'A' && var0 <= 'Z' || var0 >= 'a' && var0 <= 'z';
   }
}
