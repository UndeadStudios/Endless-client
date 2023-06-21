package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("id")
public class IndexStoreActionHandler implements Runnable {
   @ObfuscatedName("gk")
   @ObfuscatedSignature(
      signature = "[Lld;"
   )
   static SpritePixels[] headIconsPk;
   @ObfuscatedName("x")
   static Object IndexStoreActionHandler_lock;
   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "Lhv;"
   )
   static Deque IndexStoreActionHandler_requestQueue;
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "Lhv;"
   )
   static Deque IndexStoreActionHandler_responseQueue;
   @ObfuscatedName("h")
   static Thread IndexStoreActionHandler_thread;
   @ObfuscatedName("g")
   @ObfuscatedGetter(
      intValue = 1081660597
   )
   static int field3259;

   static {
      IndexStoreActionHandler_requestQueue = new Deque();
      IndexStoreActionHandler_responseQueue = new Deque();
      field3259 = 0;
      IndexStoreActionHandler_lock = new Object();
   }

   public void run() {
      try {
         while(true) {
            Deque var2 = IndexStoreActionHandler_requestQueue;
            FileSystem var1;
            synchronized(IndexStoreActionHandler_requestQueue) {
               var1 = (FileSystem)IndexStoreActionHandler_requestQueue.method3930();
            }

            Object var14;
            if(var1 != null) {
               if(var1.type == 0) {
                  var1.index.method542((int)var1.hash, var1.field3231, var1.field3231.length);
                  var2 = IndexStoreActionHandler_requestQueue;
                  synchronized(IndexStoreActionHandler_requestQueue) {
                     var1.method432();
                  }
               } else if(var1.type == 1) {
                  var1.field3231 = var1.index.method541((int)var1.hash);
                  var2 = IndexStoreActionHandler_requestQueue;
                  synchronized(IndexStoreActionHandler_requestQueue) {
                     IndexStoreActionHandler_responseQueue.method3906(var1);
                  }
               }

               var14 = IndexStoreActionHandler_lock;
               synchronized(IndexStoreActionHandler_lock) {
                  if(field3259 <= 1) {
                     field3259 = 0;
                     IndexStoreActionHandler_lock.notifyAll();
                     return;
                  }

                  field3259 = 600;
               }
            } else {
               class36.method553(100L);
               var14 = IndexStoreActionHandler_lock;
               synchronized(IndexStoreActionHandler_lock) {
                  if(field3259 <= 1) {
                     field3259 = 0;
                     IndexStoreActionHandler_lock.notifyAll();
                     return;
                  }

                  --field3259;
               }
            }
         }
      } catch (Exception var13) {
         VertexNormal.method4110((String)null, var13, (byte)-52);
      }
   }
}
