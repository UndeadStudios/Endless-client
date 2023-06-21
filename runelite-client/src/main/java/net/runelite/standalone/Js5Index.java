package net.runelite.standalone;

import com.google.common.hash.HashCode;
import com.google.common.hash.Hashing;
import com.google.common.io.BaseEncoding;
import com.google.common.io.ByteStreams;
import com.google.common.io.CharStreams;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import net.runelite.api.overlay.OverlayIndex;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.api.RSIndexData;
import net.runelite.rs.api.RSIndexDataBase;
import org.slf4j.Logger;

@ObfuscatedName("iz")
public abstract class Js5Index implements RSIndexDataBase {
   @ObfuscatedName("t")
   @ObfuscatedSignature(
      signature = "Lgn;"
   )
   static GZipDecompressor gzip;
   @ObfuscatedName("y")
   @ObfuscatedGetter(
      intValue = 220234369
   )
   static int field3251;
   @ObfuscatedName("f")
   int[] groupCrcs;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = -2112807423
   )
   public int crc;
   @ObfuscatedName("e")
   Object[] groups;
   @ObfuscatedName("r")
   Object[][] files;
   @ObfuscatedName("q")
   int[][] groupFileIds;
   @ObfuscatedName("x")
   int[] groupNames;
   @ObfuscatedName("m")
   int[] groupFileCount;
   @ObfuscatedName("p")
   int[] groupVersions;
   @ObfuscatedName("b")
   int[][] groupFileNames;
   @ObfuscatedName("o")
   boolean releaseGroupBuffers;
   @ObfuscatedName("n")
   @ObfuscatedSignature(
      signature = "[Lgt;"
   )
   NameHashTable[] groupFilesNameTable;
   public boolean overlayOutdated;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = 109040445
   )
   int groupCount;
   @ObfuscatedName("h")
   @ObfuscatedSignature(
      signature = "Lgt;"
   )
   NameHashTable groupNameTable;
   @ObfuscatedName("u")
   boolean releaseFileBuffers;
   @ObfuscatedName("g")
   int[] groupIds;

   static {
      gzip = new GZipDecompressor();
      field3251 = 0;
   }

   Js5Index(boolean var1, boolean var2) {
      this.releaseGroupBuffers = var1;
      this.releaseFileBuffers = var2;
      this.rl$$init();
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(II)Z",
      garbageValue = "1796981255"
   )
   public boolean method4201(int var1) {
      if(this.files.length == 1) {
         return this.method4117(0, var1);
      } else if(this.files[var1].length == 1) {
         return this.method4117(var1, 0);
      } else {
         throw new RuntimeException();
      }
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(II)I",
      garbageValue = "2012289016"
   )
   public int method4112(int var1) {
      return this.files[var1].length;
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      signature = "(I[II)Z",
      garbageValue = "1074975386"
   )
   boolean method4154(int var1, int[] var2) {
      if(this.groups[var1] == null) {
         return false;
      } else {
         int var3 = this.groupFileCount[var1];
         int[] var4 = this.groupFileIds[var1];
         Object[] var5 = this.files[var1];
         boolean var6 = true;

         for(int var7 = 0; var7 < var3; ++var7) {
            if(var5[var4[var7]] == null) {
               var6 = false;
               break;
            }
         }

         if(var6) {
            return true;
         } else {
            byte[] var18;
            if(var2 == null || var2[0] == 0 && var2[1] == 0 && var2[2] == 0 && var2[3] == 0) {
               var18 = ChatLine.method5908(this.groups[var1], false);
            } else {
               var18 = ChatLine.method5908(this.groups[var1], true);
               Packet var8 = new Packet(var18);
               var8.method5108(var2, 5, var8.payload.length);
            }

            byte[] var20 = class61.method920(var18);
            if(this.releaseGroupBuffers) {
               this.groups[var1] = null;
            }

            if(var3 > 1) {
               int var9 = var20.length;
               --var9;
               int var10 = var20[var9] & 255;
               var9 -= var10 * var3 * 4;
               Packet var11 = new Packet(var20);
               int[] var12 = new int[var3];
               var11.offset = var9;

               int var14;
               int var15;
               for(int var13 = 0; var13 < var10; ++var13) {
                  var14 = 0;

                  for(var15 = 0; var15 < var3; ++var15) {
                     var14 += var11.readInt();
                     var12[var15] += var14;
                  }
               }

               byte[][] var19 = new byte[var3][];

               for(var14 = 0; var14 < var3; ++var14) {
                  var19[var14] = new byte[var12[var14]];
                  var12[var14] = 0;
               }

               var11.offset = var9;
               var14 = 0;

               for(var15 = 0; var15 < var10; ++var15) {
                  int var16 = 0;

                  for(int var17 = 0; var17 < var3; ++var17) {
                     var16 += var11.readInt();
                     System.arraycopy(var20, var14, var19[var17], var12[var17], var16);
                     var12[var17] += var16;
                     var14 += var16;
                  }
               }

               for(var15 = 0; var15 < var3; ++var15) {
                  if(!this.releaseFileBuffers) {
                     var5[var4[var15]] = World.method4978(var19[var15], false);
                  } else {
                     var5[var4[var15]] = var19[var15];
                  }
               }
            } else if(!this.releaseFileBuffers) {
               var5[var4[0]] = World.method4978(var20, false);
            } else {
               var5[var4[0]] = var20;
            }

            return true;
         }
      }
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "(II)[B",
      garbageValue = "-1348246497"
   )
   public byte[] method4124(int var1) {
      if(this.files.length == 1) {
         return this.method4123(0, var1);
      } else if(this.files[var1].length == 1) {
         return this.method4123(var1, 0);
      } else {
         throw new RuntimeException();
      }
   }

   @ObfuscatedName("r")
   @ObfuscatedSignature(
      signature = "(IB)V",
      garbageValue = "16"
   )
   void vmethod4125(int var1) {
   }

   @ObfuscatedName("ae")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;B)I",
      garbageValue = "116"
   )
   public int method4139(String var1) {
      var1 = var1.toLowerCase();
      int var2 = this.groupNameTable.method3942(class219.method4226(var1));
      return this.vmethod4121(var2);
   }

   @ObfuscatedName("k")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1594229630"
   )
   public void method4130() {
      for(int var1 = 0; var1 < this.files.length; ++var1) {
         if(this.files[var1] != null) {
            for(int var2 = 0; var2 < this.files[var1].length; ++var2) {
               this.files[var1][var2] = null;
            }
         }
      }

   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "(II)I",
      garbageValue = "1666771265"
   )
   int vmethod4121(int var1) {
      return this.groups[var1] != null?100:0;
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(II[II)[B",
      garbageValue = "-1730577384"
   )
   public byte[] method4178(int var1, int var2, int[] var3) {
      if(var1 >= 0 && var1 < this.files.length && this.files[var1] != null && var2 >= 0 && var2 < this.files[var1].length) {
         if(this.files[var1][var2] == null) {
            boolean var4 = this.method4154(var1, var3);
            if(!var4) {
               this.vmethod4125(var1);
               var4 = this.method4154(var1, var3);
               if(!var4) {
                  return null;
               }
            }
         }

         byte[] var5 = ChatLine.method5908(this.files[var1][var2], false);
         if(this.releaseFileBuffers) {
            this.files[var1][var2] = null;
         }

         return var5;
      } else {
         return null;
      }
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "35823373"
   )
   public boolean method4120() {
      boolean var1 = true;

      for(int var2 = 0; var2 < this.groupIds.length; ++var2) {
         int var3 = this.groupIds[var2];
         if(this.groups[var3] == null) {
            this.vmethod4125(var3);
            if(this.groups[var3] == null) {
               var1 = false;
            }
         }
      }

      return var1;
   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "(II)Z",
      garbageValue = "490184717"
   )
   public boolean method4159(int var1) {
      if(this.groups[var1] != null) {
         return true;
      } else {
         this.vmethod4125(var1);
         return this.groups[var1] != null;
      }
   }

   @ObfuscatedName("b")
   @ObfuscatedSignature(
      signature = "(II)[B",
      garbageValue = "1847641668"
   )
   public byte[] method4122(int var1) {
      if(this.files.length == 1) {
         return this.method4115(0, var1, 745018282);
      } else if(this.files[var1].length == 1) {
         return this.method4115(var1, 0, -1609294400);
      } else {
         throw new RuntimeException();
      }
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;Ljava/lang/String;I)Z",
      garbageValue = "1555564173"
   )
   public boolean method4136(String var1, String var2) {
      var1 = var1.toLowerCase();
      var2 = var2.toLowerCase();
      int var3 = this.groupNameTable.method3942(class219.method4226(var1));
      int var4 = this.groupFilesNameTable[var3].method3942(class219.method4226(var2));
      return this.method4117(var3, var4);
   }

   @ObfuscatedName("o")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "1263265184"
   )
   public int method4127() {
      return this.files.length;
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "([BB)V",
      garbageValue = "24"
   )
   void method4113(byte[] var1) {
      this.crc = class29.method506(var1, var1.length);
      Packet var2 = new Packet(class61.method920(var1));
      int var3 = var2.readUnsignedByte();
      if(var3 >= 5 && var3 <= 7) {
         if(var3 >= 6) {
            var2.readInt();
         }

         int var4 = var2.readUnsignedByte();
         if(var3 >= 7) {
            this.groupCount = var2.method5102();
         } else {
            this.groupCount = var2.readUnsignedShort();
         }

         int var5 = 0;
         int var6 = -1;
         this.groupIds = new int[this.groupCount];
         int var7;
         if(var3 >= 7) {
            for(var7 = 0; var7 < this.groupCount; ++var7) {
               this.groupIds[var7] = var5 += var2.method5102();
               if(this.groupIds[var7] > var6) {
                  var6 = this.groupIds[var7];
               }
            }
         } else {
            for(var7 = 0; var7 < this.groupCount; ++var7) {
               this.groupIds[var7] = var5 += var2.readUnsignedShort();
               if(this.groupIds[var7] > var6) {
                  var6 = this.groupIds[var7];
               }
            }
         }

         this.groupCrcs = new int[var6 + 1];
         this.groupVersions = new int[var6 + 1];
         this.groupFileCount = new int[var6 + 1];
         this.groupFileIds = new int[var6 + 1][];
         this.groups = new Object[var6 + 1];
         this.files = new Object[var6 + 1][];
         if(var4 != 0) {
            this.groupNames = new int[var6 + 1];

            for(var7 = 0; var7 < this.groupCount; ++var7) {
               this.groupNames[this.groupIds[var7]] = var2.readInt();
            }

            this.groupNameTable = new NameHashTable(this.groupNames);
         }

         for(var7 = 0; var7 < this.groupCount; ++var7) {
            this.groupCrcs[this.groupIds[var7]] = var2.readInt();
         }

         for(var7 = 0; var7 < this.groupCount; ++var7) {
            this.groupVersions[this.groupIds[var7]] = var2.readInt();
         }

         for(var7 = 0; var7 < this.groupCount; ++var7) {
            this.groupFileCount[this.groupIds[var7]] = var2.readUnsignedShort();
         }

         int var8;
         int var9;
         int var10;
         int var11;
         int var12;
         if(var3 >= 7) {
            for(var7 = 0; var7 < this.groupCount; ++var7) {
               var8 = this.groupIds[var7];
               var9 = this.groupFileCount[var8];
               var5 = 0;
               var10 = -1;
               this.groupFileIds[var8] = new int[var9];

               for(var11 = 0; var11 < var9; ++var11) {
                  var12 = this.groupFileIds[var8][var11] = var5 += var2.method5102();
                  if(var12 > var10) {
                     var10 = var12;
                  }
               }

               this.files[var8] = new Object[var10 + 1];
            }
         } else {
            for(var7 = 0; var7 < this.groupCount; ++var7) {
               var8 = this.groupIds[var7];
               var9 = this.groupFileCount[var8];
               var5 = 0;
               var10 = -1;
               this.groupFileIds[var8] = new int[var9];

               for(var11 = 0; var11 < var9; ++var11) {
                  var12 = this.groupFileIds[var8][var11] = var5 += var2.readUnsignedShort();
                  if(var12 > var10) {
                     var10 = var12;
                  }
               }

               this.files[var8] = new Object[var10 + 1];
            }
         }

         if(var4 != 0) {
            this.groupFileNames = new int[var6 + 1][];
            this.groupFilesNameTable = new NameHashTable[var6 + 1];

            for(var7 = 0; var7 < this.groupCount; ++var7) {
               var8 = this.groupIds[var7];
               var9 = this.groupFileCount[var8];
               this.groupFileNames[var8] = new int[this.files[var8].length];

               for(var10 = 0; var10 < var9; ++var10) {
                  this.groupFileNames[var8][this.groupFileIds[var8][var10]] = var2.readInt();
               }

               this.groupFilesNameTable[var8] = new NameHashTable(this.groupFileNames[var8]);
            }
         }

      } else {
         throw new RuntimeException("");
      }
   }

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      signature = "(III)[B",
      garbageValue = "294177390"
   )
   public byte[] method4123(int var1, int var2) {
      if(var1 >= 0 && var1 < this.files.length && this.files[var1] != null && var2 >= 0 && var2 < this.files[var1].length) {
         if(this.files[var1][var2] == null) {
            boolean var3 = this.method4154(var1, (int[])null);
            if(!var3) {
               this.vmethod4125(var1);
               var3 = this.method4154(var1, (int[])null);
               if(!var3) {
                  return null;
               }
            }
         }

         byte[] var4 = ChatLine.method5908(this.files[var1][var2], false);
         return var4;
      } else {
         return null;
      }
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;I)I",
      garbageValue = "-165916758"
   )
   public int method4132(String var1) {
      var1 = var1.toLowerCase();
      return this.groupNameTable.method3942(class219.method4226(var1));
   }

   @ObfuscatedName("t")
   @ObfuscatedSignature(
      signature = "(II)[I",
      garbageValue = "1008049619"
   )
   public int[] method4126(int var1) {
      return var1 >= 0 && var1 < this.groupFileIds.length?this.groupFileIds[var1]:null;
   }

   @ObfuscatedName("ah")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;Ljava/lang/String;I)[B",
      garbageValue = "1409372180"
   )
   public byte[] method4135(String var1, String var2) {
      var1 = var1.toLowerCase();
      var2 = var2.toLowerCase();
      int var3 = this.groupNameTable.method3942(class219.method4226(var1));
      int var4 = this.groupFilesNameTable[var3].method3942(class219.method4226(var2));
      return this.method4115(var3, var4, -1200488193);
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;B)Z",
      garbageValue = "-62"
   )
   public boolean method4157(String var1) {
      var1 = var1.toLowerCase();
      int var2 = this.groupNameTable.method3942(class219.method4226(var1));
      return this.method4159(var2);
   }

   public byte[] copy$getConfigData(int var1, int var2, int var3) {
      return this.method4178(var1, var2, (int[])null);
   }

   private void rl$$init() {
   }

   public boolean isOverlayOutdated() {
      return this.overlayOutdated;
   }

   public byte[] getConfigData(int var1, int var2) {
      return this.method4115(var1, var2, -1686636514);
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;I)V",
      garbageValue = "1477797331"
   )
   public void method4138(String var1) {
      var1 = var1.toLowerCase();
      int var2 = this.groupNameTable.method3942(class219.method4226(var1));
      if(var2 >= 0) {
         this.vmethod4114(var2);
      }
   }

   @ObfuscatedName("y")
   @ObfuscatedSignature(
      signature = "(IB)V",
      garbageValue = "-64"
   )
   public void method4129(int var1) {
      for(int var2 = 0; var2 < this.files[var1].length; ++var2) {
         this.files[var1][var2] = null;
      }

   }

   @ObfuscatedName("aa")
   @ObfuscatedSignature(
      signature = "(ILjava/lang/String;I)I",
      garbageValue = "-847972904"
   )
   public int method4137(int var1, String var2) {
      var2 = var2.toLowerCase();
      return this.groupFilesNameTable[var1].method3942(class219.method4226(var2));
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "1615515214"
   )
   void vmethod4114(int var1) {
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      signature = "(IIB)Z",
      garbageValue = "0"
   )
   public boolean method4117(int var1, int var2) {
      if(var1 >= 0 && var1 < this.files.length && this.files[var1] != null && var2 >= 0 && var2 < this.files[var1].length) {
         if(this.files[var1][var2] != null) {
            return true;
         } else if(this.groups[var1] != null) {
            return true;
         } else {
            this.vmethod4125(var1);
            return this.groups[var1] != null;
         }
      } else {
         return false;
      }
   }

   @ObfuscatedName("u")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1384754421"
   )
   public void method4198() {
      for(int var1 = 0; var1 < this.groups.length; ++var1) {
         this.groups[var1] = null;
      }

   }

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;Ljava/lang/String;I)Z",
      garbageValue = "-1014771276"
   )
   public boolean method4134(String var1, String var2) {
      var1 = var1.toLowerCase();
      var2 = var2.toLowerCase();
      int var3 = this.groupNameTable.method3942(class219.method4226(var1));
      if(var3 < 0) {
         return false;
      } else {
         int var4 = this.groupFilesNameTable[var3].method3942(class219.method4226(var2));
         return var4 >= 0;
      }
   }

   @ObfuscatedName("g")
   public byte[] method4115(int var1, int var2, int var3) {
      byte[] var4 = this.copy$getConfigData(var1, var2, var3);
      RSIndexData var5 = (RSIndexData)this;
      if(!OverlayIndex.hasOverlay(var5.getIndex(), var1)) {
         return var4;
      } else {
         Logger var6 = ItemContainer.clientInstance.getLogger();
         InputStream var7 = this.getClass().getResourceAsStream("/runelite/" + var5.getIndex() + "/" + var1);
         if(var7 == null) {
            var6.warn("Missing overlay data for {}/{}", Integer.valueOf(var5.getIndex()), Integer.valueOf(var1));
            return var4;
         } else {
            InputStream var8 = this.getClass().getResourceAsStream("/runelite/" + var5.getIndex() + "/" + var1 + ".hash");
            if(var4 == null) {
               if(var8 != null) {
                  var6.warn("Hash file for non existing archive {}/{}", Integer.valueOf(var5.getIndex()), Integer.valueOf(var1));
                  return null;
               } else {
                  var6.debug("Adding archive {}/{}", Integer.valueOf(var5.getIndex()), Integer.valueOf(var1));

                  try {
                     return ByteStreams.toByteArray(var7);
                  } catch (IOException var12) {
                     var6.warn("error loading archive replacement", var12);
                     return null;
                  }
               }
            } else if(var8 == null) {
               var6.warn("Missing hash file for {}/{}", Integer.valueOf(var5.getIndex()), Integer.valueOf(var1));
               return var4;
            } else {
               HashCode var9 = Hashing.sha256().hashBytes(var4);
               String var10 = BaseEncoding.base16().encode(var9.asBytes());

               try {
                  String var11 = CharStreams.toString(new InputStreamReader(var8));
                  if(var11.equals(var10)) {
                     var6.debug("Replacing archive {}/{}", Integer.valueOf(var5.getIndex()), Integer.valueOf(var1));
                     return ByteStreams.toByteArray(var7);
                  }

                  var6.warn("Mismatch in overlaid cache archive hash for {}/{}: {} != {}", new Object[]{Integer.valueOf(var5.getIndex()), Integer.valueOf(var1), var11, var10});
                  this.overlayOutdated = true;
               } catch (IOException var13) {
                  var6.warn("error checking hash", var13);
               }

               return var4;
            }
         }
      }
   }
}
