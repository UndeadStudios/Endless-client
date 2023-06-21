package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ih")
public class class153 {
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(ILfb;Lin;I)V",
      garbageValue = "-188376895"
   )
   static void method2204(int var0, IndexFile var1, Js5 var2) {
      FileSystem var3 = new FileSystem();
      var3.type = 1;
      var3.hash = (long)var0;
      var3.index = var1;
      var3.data = var2;
      Deque var4 = IndexStoreActionHandler.IndexStoreActionHandler_requestQueue;
      synchronized(IndexStoreActionHandler.IndexStoreActionHandler_requestQueue) {
         IndexStoreActionHandler.IndexStoreActionHandler_requestQueue.method3906(var3);
      }

      Object var9 = IndexStoreActionHandler.IndexStoreActionHandler_lock;
      synchronized(IndexStoreActionHandler.IndexStoreActionHandler_lock) {
         if(IndexStoreActionHandler.field3259 == 0) {
            IndexStoreActionHandler.IndexStoreActionHandler_thread = new Thread(new IndexStoreActionHandler());
            IndexStoreActionHandler.IndexStoreActionHandler_thread.setDaemon(true);
            IndexStoreActionHandler.IndexStoreActionHandler_thread.start();
            IndexStoreActionHandler.IndexStoreActionHandler_thread.setPriority(5);
         }

         IndexStoreActionHandler.field3259 = 600;
      }
   }
}
