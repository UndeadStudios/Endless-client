package net.runelite.standalone;

import java.io.IOException;
import java.net.Socket;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fd")
public class class255 extends class323 {
   @ObfuscatedName("le")
   @ObfuscatedGetter(
      intValue = -88234083
   )
   static int field2065;
   @ObfuscatedName("a")
   Socket field2066;
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "Lfj;"
   )
   class171 field2064;
   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "Lfx;"
   )
   GameSocket field2063;

   public class255(Socket var1, int var2, int var3) throws IOException {
      this.field2066 = var1;
      this.field2066.setSoTimeout(30000);
      this.field2066.setTcpNoDelay(true);
      this.field2066.setReceiveBufferSize(65536);
      this.field2066.setSendBufferSize(65536);
      this.field2064 = new class171(this.field2066.getInputStream(), var2);
      this.field2063 = new GameSocket(this.field2066.getOutputStream(), var3);
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "-9"
   )
   public void vmethod6355() {
      this.field2063.method1467();

      try {
         this.field2066.close();
      } catch (IOException var2) {
         ;
      }

      this.field2064.method2682();
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "([BIIB)I",
      garbageValue = "1"
   )
   public int vmethod6362(byte[] var1, int var2, int var3) throws IOException {
      return this.field2064.method2689(var1, var2, var3);
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "(II)Z",
      garbageValue = "1647181248"
   )
   public boolean vmethod6354(int var1) throws IOException {
      return this.field2064.method2679(var1);
   }

   protected void aak() {
      this.vmethod6355();
   }

   protected void finalize() {
      this.vmethod6355();
   }

   protected void aae() {
      this.vmethod6355();
   }

   protected void aau() {
      this.vmethod6355();
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(B)I",
      garbageValue = "0"
   )
   public int vmethod6356() throws IOException {
      return this.field2064.method2678();
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      signature = "([BIII)V",
      garbageValue = "-1892812584"
   )
   public void vmethod6359(byte[] var1, int var2, int var3) throws IOException {
      this.field2063.method1466(var1, var2, var3);
   }

   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "-827937127"
   )
   public int vmethod6357() throws IOException {
      return this.field2064.method2680();
   }
}
