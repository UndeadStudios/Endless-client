package net.runelite.standalone;

import java.util.zip.CRC32;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.api.RSIndexData;

@ObfuscatedName("in")
public class Js5 extends Js5Index implements RSIndexData {
   @ObfuscatedName("ay")
   static CRC32 crc32;
   @ObfuscatedName("af")
   volatile boolean[] loadedGroups;
   @ObfuscatedName("ag")
   boolean field3272;
   @ObfuscatedName("z")
   volatile boolean field3268;
   @ObfuscatedName("c")
   @ObfuscatedSignature(
      signature = "Lfb;"
   )
   IndexFile masterIndex;
   @ObfuscatedName("ah")
   @ObfuscatedGetter(
      intValue = -202943581
   )
   int field3273;
   @ObfuscatedName("i")
   @ObfuscatedSignature(
      signature = "Lfb;"
   )
   IndexFile index;
   @ObfuscatedName("j")
   @ObfuscatedGetter(
      intValue = 797557679
   )
   int id;
   @ObfuscatedName("aa")
   @ObfuscatedGetter(
      intValue = -1050514093
   )
   int crcValue;
   @ObfuscatedName("ab")
   @ObfuscatedGetter(
      intValue = 1797201163
   )
   int indexReferenceVersion;

   static {
      crc32 = new CRC32();
   }

   @ObfuscatedSignature(
      signature = "(Lfb;Lfb;IZZZ)V"
   )
   public Js5(IndexFile var1, IndexFile var2, int var3, boolean var4, boolean var5, boolean var6) {
      super(var4, var5);
      this.field3268 = false;
      this.field3272 = false;
      this.field3273 = -1;
      this.index = var1;
      this.masterIndex = var2;
      this.id = var3;
      this.field3272 = var6;
      PathingEntity.method2477(this, this.id);
   }

   @ObfuscatedName("dn")
   @ObfuscatedSignature(
      signature = "(II)Z",
      garbageValue = "1536737195"
   )
   public boolean method2726(int var1) {
      return this.method4126(var1) != null;
   }

   @ObfuscatedName("r")
   @ObfuscatedSignature(
      signature = "(IB)V",
      garbageValue = "16"
   )
   void vmethod4125(int var1) {
      if(this.index != null && this.loadedGroups != null && this.loadedGroups[var1]) {
         IndexFile var2 = this.index;
         byte[] var4 = null;
         Deque var5 = IndexStoreActionHandler.IndexStoreActionHandler_requestQueue;
         synchronized(IndexStoreActionHandler.IndexStoreActionHandler_requestQueue) {
            for(FileSystem var6 = (FileSystem)IndexStoreActionHandler.IndexStoreActionHandler_requestQueue.method3930(); var6 != null; var6 = (FileSystem)IndexStoreActionHandler.IndexStoreActionHandler_requestQueue.method3924()) {
               if((long)var1 == var6.hash && var2 == var6.index && var6.type == 0) {
                  var4 = var6.field3231;
                  break;
               }
            }
         }

         if(var4 != null) {
            this.method2722(var2, var1, var4, true);
         } else {
            byte[] var9 = var2.method541(var1);
            this.method2722(var2, var1, var9, true);
         }
      } else {
         MapLabel.method2857(this, this.id, var1, super.groupCrcs[var1], (byte)2, true);
      }

   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "(II)I",
      garbageValue = "1666771265"
   )
   int vmethod4121(int var1) {
      if(super.groups[var1] != null) {
         return 100;
      } else if(this.loadedGroups[var1]) {
         return 100;
      } else {
         int var3 = this.id;
         long var4 = (long)((var3 << 16) + var1);
         int var2;
         if(TotalQuantityComparator.currentRequest != null && var4 == TotalQuantityComparator.currentRequest.hash) {
            var2 = UrlRequester.NetCache_responseArchiveBuffer.offset * 99 / (UrlRequester.NetCache_responseArchiveBuffer.payload.length - TotalQuantityComparator.currentRequest.padding) + 1;
         } else {
            var2 = 0;
         }

         return var2;
      }
   }

   @ObfuscatedName("cz")
   @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "-1130311351"
   )
   public boolean method2716() {
      return this.field3268;
   }

   @ObfuscatedName("ds")
   @ObfuscatedSignature(
      signature = "(I[BZZI)V",
      garbageValue = "1058588984"
   )
   public void method2721(int var1, byte[] var2, boolean var3, boolean var4) {
      if(var3) {
         if(this.field3268) {
            throw new RuntimeException();
         }

         if(this.masterIndex != null) {
            class53.method852(this.id, var2, this.masterIndex);
         }

         this.method4113(var2);
         this.method2723();
      } else {
         var2[var2.length - 2] = (byte)(super.groupVersions[var1] >> 8);
         var2[var2.length - 1] = (byte)super.groupVersions[var1];
         if(this.index != null) {
            class53.method852(var1, var2, this.index);
            this.loadedGroups[var1] = true;
         }

         if(var4) {
            super.groups[var1] = World.method4978(var2, false);
         }
      }

   }

   @ObfuscatedName("cl")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "-1573276965"
   )
   public int method2743() {
      if(this.field3268) {
         return 100;
      } else if(super.groups != null) {
         return 99;
      } else {
         int var2 = this.id;
         long var3 = (long)(var2 + 16711680);
         int var1;
         if(TotalQuantityComparator.currentRequest != null && TotalQuantityComparator.currentRequest.hash == var3) {
            var1 = UrlRequester.NetCache_responseArchiveBuffer.offset * 99 / (UrlRequester.NetCache_responseArchiveBuffer.payload.length - TotalQuantityComparator.currentRequest.padding) + 1;
         } else {
            var1 = 0;
         }

         int var5 = var1;
         if(var1 >= 100) {
            var5 = 99;
         }

         return var5;
      }
   }

   @ObfuscatedName("dg")
   @ObfuscatedSignature(
      signature = "(Lfb;I[BZB)V",
      garbageValue = "1"
   )
   void method2722(IndexFile var1, int var2, byte[] var3, boolean var4) {
      int var5;
      if(var1 == this.masterIndex) {
         if(this.field3268) {
            throw new RuntimeException();
         }

         if(var3 == null) {
            MapLabel.method2857(this, 255, this.id, this.crcValue, (byte)0, true);
            return;
         }

         crc32.reset();
         crc32.update(var3, 0, var3.length);
         var5 = (int)crc32.getValue();
         if(var5 != this.crcValue) {
            MapLabel.method2857(this, 255, this.id, this.crcValue, (byte)0, true);
            return;
         }

         Packet var9 = new Packet(class61.method920(var3));
         int var7 = var9.readUnsignedByte();
         if(var7 != 5 && var7 != 6) {
            throw new RuntimeException(var7 + "," + this.id + "," + var2);
         }

         int var8 = 0;
         if(var7 >= 6) {
            var8 = var9.readInt();
         }

         if(var8 != this.indexReferenceVersion) {
            MapLabel.method2857(this, 255, this.id, this.crcValue, (byte)0, true);
            return;
         }

         this.method4113(var3);
         this.method2723();
      } else {
         if(!var4 && var2 == this.field3273) {
            this.field3268 = true;
         }

         if(var3 == null || var3.length <= 2) {
            this.loadedGroups[var2] = false;
            if(this.field3272 || var4) {
               MapLabel.method2857(this, this.id, var2, super.groupCrcs[var2], (byte)2, var4);
            }

            return;
         }

         crc32.reset();
         crc32.update(var3, 0, var3.length - 2);
         var5 = (int)crc32.getValue();
         int var6 = ((var3[var3.length - 2] & 255) << 8) + (var3[var3.length - 1] & 255);
         if(var5 != super.groupCrcs[var2] || var6 != super.groupVersions[var2]) {
            this.loadedGroups[var2] = false;
            if(this.field3272 || var4) {
               MapLabel.method2857(this, this.id, var2, super.groupCrcs[var2], (byte)2, var4);
            }

            return;
         }

         this.loadedGroups[var2] = true;
         if(var4) {
            super.groups[var2] = World.method4978(var3, false);
         }
      }

   }

   @ObfuscatedName("dt")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "1060192870"
   )
   public int method2731() {
      int var1 = 0;
      int var2 = 0;

      int var3;
      for(var3 = 0; var3 < super.groups.length; ++var3) {
         if(super.groupFileCount[var3] > 0) {
            var1 += 100;
            var2 += this.vmethod4121(var3);
         }
      }

      if(var1 == 0) {
         return 100;
      } else {
         var3 = var2 * 100 / var1;
         return var3;
      }
   }

   public int getIndex() {
      return this.id;
   }

   @ObfuscatedName("dq")
   @ObfuscatedSignature(
      signature = "(II)Z",
      garbageValue = "319531443"
   )
   public boolean method2725(int var1) {
      return this.loadedGroups[var1];
   }

   @ObfuscatedName("dl")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "-7"
   )
   void method2723() {
      this.loadedGroups = new boolean[super.groups.length];

      int var1;
      for(var1 = 0; var1 < this.loadedGroups.length; ++var1) {
         this.loadedGroups[var1] = false;
      }

      if(this.index == null) {
         this.field3268 = true;
      } else {
         this.field3273 = -1;

         for(var1 = 0; var1 < this.loadedGroups.length; ++var1) {
            if(super.groupFileCount[var1] > 0) {
               class153.method2204(var1, this.index, this);
               this.field3273 = var1;
            }
         }

         if(this.field3273 == -1) {
            this.field3268 = true;
         }

      }
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "1615515214"
   )
   void vmethod4114(int var1) {
      AttackOpPriority.method1553(this.id, var1);
   }

   @ObfuscatedName("dz")
   @ObfuscatedSignature(
      signature = "(III)V",
      garbageValue = "-1693261231"
   )
   public void method2733(int var1, int var2) {
      this.crcValue = var1;
      this.indexReferenceVersion = var2;
      if(this.masterIndex != null) {
         int var3 = this.id;
         IndexFile var4 = this.masterIndex;
         byte[] var6 = null;
         Deque var7 = IndexStoreActionHandler.IndexStoreActionHandler_requestQueue;
         synchronized(IndexStoreActionHandler.IndexStoreActionHandler_requestQueue) {
            for(FileSystem var8 = (FileSystem)IndexStoreActionHandler.IndexStoreActionHandler_requestQueue.method3930(); var8 != null; var8 = (FileSystem)IndexStoreActionHandler.IndexStoreActionHandler_requestQueue.method3924()) {
               if(var8.hash == (long)var3 && var4 == var8.index && var8.type == 0) {
                  var6 = var8.field3231;
                  break;
               }
            }
         }

         if(var6 != null) {
            this.method2722(var4, var3, var6, true);
         } else {
            byte[] var11 = var4.method541(var3);
            this.method2722(var4, var3, var11, true);
         }
      } else {
         MapLabel.method2857(this, 255, this.id, this.crcValue, (byte)0, true);
      }

   }
}
