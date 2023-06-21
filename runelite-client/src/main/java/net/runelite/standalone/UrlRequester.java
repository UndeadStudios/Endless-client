package net.runelite.standalone;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.LinkedList;
import java.util.Queue;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ex")
public class UrlRequester implements Runnable {
   @ObfuscatedName("o")
   @ObfuscatedSignature(
      signature = "Lgx;"
   )
   public static Packet NetCache_responseArchiveBuffer;
   @ObfuscatedName("a")
   final Thread thread;
   @ObfuscatedName("s")
   volatile boolean isClosed;
   @ObfuscatedName("g")
   Queue requests;

   public UrlRequester() {
      this.requests = new LinkedList();
      this.thread = new Thread(this);
      this.thread.setPriority(1);
      this.thread.start();
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "(Ljava/net/URL;I)Lez;",
      garbageValue = "1962060263"
   )
   public UrlRequest method5564(URL var1) {
      UrlRequest var2 = new UrlRequest(var1);
      synchronized(this) {
         this.requests.add(var2);
         this.notify();
         return var2;
      }
   }

   public void run() {
      while(!this.isClosed) {
         try {
            UrlRequest var1;
            synchronized(this) {
               var1 = (UrlRequest)this.requests.poll();
               if(var1 == null) {
                  try {
                     this.wait();
                  } catch (InterruptedException var13) {
                     ;
                  }
                  continue;
               }
            }

            DataInputStream var2 = null;
            URLConnection var3 = null;

            try {
               var3 = var1.url.openConnection();
               var3.setConnectTimeout(5000);
               var3.setReadTimeout(5000);
               var3.setUseCaches(false);
               var3.setRequestProperty("Connection", "close");
               int var7 = var3.getContentLength();
               if(var7 >= 0) {
                  byte[] var5 = new byte[var7];
                  var2 = new DataInputStream(var3.getInputStream());
                  var2.readFully(var5);
                  var1.response0 = var5;
               }

               var1.isDone0 = true;
            } catch (IOException var14) {
               var1.isDone0 = true;
            } finally {
               if(var2 != null) {
                  var2.close();
               }

               if(var3 != null && var3 instanceof HttpURLConnection) {
                  ((HttpURLConnection)var3).disconnect();
               }

            }
         } catch (Exception var17) {
            VertexNormal.method4110((String)null, var17, (byte)-22);
         }
      }

   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "0"
   )
   public void method5562() {
      this.isClosed = true;

      try {
         synchronized(this) {
            this.notify();
         }

         this.thread.join();
      } catch (InterruptedException var4) {
         ;
      }

   }

   @ObfuscatedName("h")
   static int method5572(long var0) {
      return (int)(var0 >>> 14 & 3L);
   }
}
