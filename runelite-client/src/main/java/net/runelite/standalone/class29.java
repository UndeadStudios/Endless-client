package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bb")
public class class29 extends class93 {
   @ObfuscatedName("jg")
   @ObfuscatedSignature(
      signature = "Ldu;"
   )
   static TextureProvider field608;
   @ObfuscatedName("ll")
   @ObfuscatedGetter(
      intValue = 1274406465
   )
   static int selectedItemIndex;

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "(IIILfk;I)Z",
      garbageValue = "1138939457"
   )
   public boolean vmethod1252(int var1, int var2, int var3, CollisionData var4) {
      return var2 == super.field2127 && var3 == super.field2126;
   }

   @ObfuscatedName("hw")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "-39"
   )
   static final void method504() {
      for(PendingSpawn var0 = (PendingSpawn) client.pendingSpawns.method3930(); var0 != null; var0 = (PendingSpawn) client.pendingSpawns.method3924()) {
         if(var0.hitpoints == -1) {
            var0.delay = 0;
            FileRequest.method1171(var0);
         } else {
            var0.method432();
         }
      }

   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "([BII)I",
      garbageValue = "-2049034811"
   )
   public static int method506(byte[] var0, int var1) {
      return class78.method1072(var0, 0, var1);
   }
}
