package net.runelite.standalone;

import java.util.Comparator;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("e")
final class class53 implements Comparator {
   @ObfuscatedName("fc")
   @ObfuscatedGetter(
      intValue = 115658669
   )
   static int baseX;

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "(Lm;Lm;B)I",
      garbageValue = "-99"
   )
   int method864(GrandExchangeEvent var1, GrandExchangeEvent var2) {
      return var1.method1556().compareTo(var2.method1556());
   }

   public int compare(Object var1, Object var2) {
      return this.method864((GrandExchangeEvent)var1, (GrandExchangeEvent)var2);
   }

   public boolean equals(Object var1) {
      return super.equals(var1);
   }

   @ObfuscatedName("fz")
   @ObfuscatedSignature(
      signature = "(IIB)V",
      garbageValue = "0"
   )
   static void method856(int var0, int var1) {
      int[] var2 = new int[9];

      for(int var3 = 0; var3 < var2.length; ++var3) {
         int var4 = var3 * 32 + 15 + 128;
         int var5 = var4 * 3 + 600;
         int var7 = Graphics3D.SINE[var4];
         int var6 = MapIcon.method4081(var5, var1);
         var2[var3] = var7 * var6 >> 16;
      }

      SceneManager.method3656(var2, 500, 800, var0 * 334 / var1, 334);
   }

   @ObfuscatedName("r")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "102"
   )
   static final void method865() {
      class54.method868("You can\'t add yourself to your own friend list");
   }

   @ObfuscatedName("ho")
   @ObfuscatedSignature(
      signature = "(ZLge;I)V",
      garbageValue = "-610393002"
   )
   static final void method860(boolean var0, Bit var1) {
      client.isDynamicRegion = var0;
      int var2;
      int var3;
      int var5;
      int var6;
      int var7;
      int var8;
      if(!client.isDynamicRegion) {
         var2 = var1.method5281();
         var3 = var1.readUnsignedShort128();
         int var4 = var1.readUnsignedShort();
         Varcs.xteaKeys = new int[var4][4];

         for(var5 = 0; var5 < var4; ++var5) {
            for(var6 = 0; var6 < 4; ++var6) {
               Varcs.xteaKeys[var5][var6] = var1.readInt();
            }
         }

         class82.mapRegions = new int[var4];
         class129.landMapFileIds = new int[var4];
         WorldComparator.landRegionFileIds = new int[var4];
         class336.field3640 = new byte[var4][];
         GameObject.field1932 = new byte[var4][];
         boolean var16 = false;
         if((var3 / 8 == 48 || var3 / 8 == 49) && var2 / 8 == 48) {
            var16 = true;
         }

         if(var3 / 8 == 48 && var2 / 8 == 148) {
            var16 = true;
         }

         var4 = 0;

         for(var6 = (var3 - 6) / 8; var6 <= (var3 + 6) / 8; ++var6) {
            for(var7 = (var2 - 6) / 8; var7 <= (var2 + 6) / 8; ++var7) {
               var8 = var7 + (var6 << 8);
               if(!var16 || var7 != 49 && var7 != 149 && var7 != 147 && var6 != 50 && (var6 != 49 || var7 != 47)) {
                  class82.mapRegions[var4] = var8;
                  class129.landMapFileIds[var4] = class142.maps.method4132("m" + var6 + "_" + var7);
                  WorldComparator.landRegionFileIds[var4] = class142.maps.method4132("l" + var6 + "_" + var7);
                  ++var4;
               }
            }
         }

         FrameMap.method6312(var3, var2, true);
      } else {
         var2 = var1.readUnsignedShort128();
         var3 = var1.method5281();
         boolean var15 = var1.readUnsignedByte() == 1;
         var5 = var1.readUnsignedShort();
         var1.method2663();

         int var9;
         for(var6 = 0; var6 < 4; ++var6) {
            for(var7 = 0; var7 < 13; ++var7) {
               for(var8 = 0; var8 < 13; ++var8) {
                  var9 = var1.method2652(1);
                  if(var9 == 1) {
                     client.instanceTemplateChunks[var6][var7][var8] = var1.method2652(26);
                  } else {
                     client.instanceTemplateChunks[var6][var7][var8] = -1;
                  }
               }
            }
         }

         var1.method2671();
         Varcs.xteaKeys = new int[var5][4];

         for(var6 = 0; var6 < var5; ++var6) {
            for(var7 = 0; var7 < 4; ++var7) {
               Varcs.xteaKeys[var6][var7] = var1.readInt();
            }
         }

         class82.mapRegions = new int[var5];
         class129.landMapFileIds = new int[var5];
         WorldComparator.landRegionFileIds = new int[var5];
         class336.field3640 = new byte[var5][];
         GameObject.field1932 = new byte[var5][];
         var5 = 0;

         for(var6 = 0; var6 < 4; ++var6) {
            for(var7 = 0; var7 < 13; ++var7) {
               for(var8 = 0; var8 < 13; ++var8) {
                  var9 = client.instanceTemplateChunks[var6][var7][var8];
                  if(var9 != -1) {
                     int var10 = var9 >> 14 & 1023;
                     int var11 = var9 >> 3 & 2047;
                     int var12 = (var10 / 8 << 8) + var11 / 8;

                     int var13;
                     for(var13 = 0; var13 < var5; ++var13) {
                        if(class82.mapRegions[var13] == var12) {
                           var12 = -1;
                           break;
                        }
                     }

                     if(var12 != -1) {
                        class82.mapRegions[var5] = var12;
                        var13 = var12 >> 8 & 255;
                        int var14 = var12 & 255;
                        class129.landMapFileIds[var5] = class142.maps.method4132("m" + var13 + "_" + var14);
                        WorldComparator.landRegionFileIds[var5] = class142.maps.method4132("l" + var13 + "_" + var14);
                        ++var5;
                     }
                  }
               }
            }
         }

         FrameMap.method6312(var3, var2, !var15);
      }

   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "(I[BLfb;B)V",
      garbageValue = "-100"
   )
   static void method852(int var0, byte[] var1, IndexFile var2) {
      FileSystem var3 = new FileSystem();
      var3.type = 0;
      var3.hash = (long)var0;
      var3.field3231 = var1;
      var3.index = var2;
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

   @ObfuscatedName("fv")
   @ObfuscatedSignature(
      signature = "(IB)V",
      garbageValue = "29"
   )
   static void method866(int var0) {
      if(var0 == -1 && !client.field884) {
         class75.method1055();
      } else if(var0 != -1 && var0 != client.field680 && client.field882 != 0 && !client.field884) {
         GZipDecompressor.method3620(2, class75.music, var0, 0, client.field882, false);
      }

      client.field680 = var0;
   }
}
