package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.api.RSVarbit;

@ObfuscatedName("jt")
public class Varbit extends CacheableNode implements RSVarbit {
   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "Liz;"
   )
   static Js5Index varbit_ref;
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "Lgp;"
   )
   public static NodeCache varbits;
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = 111370627
   )
   public int leastSignificantBit;
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      intValue = -1702644217
   )
   public int mostSignificantBit;
   @ObfuscatedName("g")
   @ObfuscatedGetter(
      intValue = -2032962997
   )
   public int configId;

   static {
      varbits = new NodeCache(64);
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(Lgx;II)V",
      garbageValue = "1670252414"
   )
   void method925(Packet var1, int var2) {
      if(var2 == 1) {
         this.configId = var1.readUnsignedShort();
         this.leastSignificantBit = var1.readUnsignedByte();
         this.mostSignificantBit = var1.readUnsignedByte();
      }

   }

   public int getIndex() {
      return this.configId;
   }

   public int getLeastSignificantBit() {
      return this.leastSignificantBit;
   }

   public int getMostSignificantBit() {
      return this.mostSignificantBit;
   }

   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "(Lgx;I)V",
      garbageValue = "1529479554"
   )
   void method933(Packet var1) {
      while(true) {
         int var2 = var1.readUnsignedByte();
         if(var2 == 0) {
            return;
         }

         this.method925(var1, var2);
      }
   }

   @ObfuscatedName("k")
   @ObfuscatedSignature(
      signature = "(ILcs;ZB)I",
      garbageValue = "19"
   )
   static int method935(int var0, class314 var1, boolean var2) {
      ComponentType var3 = ChatHistory.method6246(class281.intStack[--class281.intStackSize]);
      if(var0 == 2600) {
         class281.intStack[++class281.intStackSize - 1] = var3.scrollX;
         return 1;
      } else if(var0 == 2601) {
         class281.intStack[++class281.intStackSize - 1] = var3.scrollY;
         return 1;
      } else if(var0 == 2602) {
         class281.scriptStringStack[++class295.scriptStringStackSize - 1] = var3.text;
         return 1;
      } else if(var0 == 2603) {
         class281.intStack[++class281.intStackSize - 1] = var3.scrollWidth;
         return 1;
      } else if(var0 == 2604) {
         class281.intStack[++class281.intStackSize - 1] = var3.scrollHeight;
         return 1;
      } else if(var0 == 2605) {
         class281.intStack[++class281.intStackSize - 1] = var3.zoom2d;
         return 1;
      } else if(var0 == 2606) {
         class281.intStack[++class281.intStackSize - 1] = var3.xan2d;
         return 1;
      } else if(var0 == 2607) {
         class281.intStack[++class281.intStackSize - 1] = var3.zan2d;
         return 1;
      } else if(var0 == 2608) {
         class281.intStack[++class281.intStackSize - 1] = var3.yan2d;
         return 1;
      } else if(var0 == 2609) {
         class281.intStack[++class281.intStackSize - 1] = var3.trans;
         return 1;
      } else if(var0 == 2610) {
         class281.intStack[++class281.intStackSize - 1] = var3.field2787;
         return 1;
      } else if(var0 == 2611) {
         class281.intStack[++class281.intStackSize - 1] = var3.color;
         return 1;
      } else if(var0 == 2612) {
         class281.intStack[++class281.intStackSize - 1] = var3.field2811;
         return 1;
      } else if(var0 == 2613) {
         class281.intStack[++class281.intStackSize - 1] = var3.field2719.vmethod6373();
         return 1;
      } else if(var0 == 2614) {
         class281.intStack[++class281.intStackSize - 1] = var3.field2747?1:0;
         return 1;
      } else {
         return 2;
      }
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/CharSequence;II[BII)I",
      garbageValue = "-1648858462"
   )
   public static int method936(CharSequence var0, int var1, int var2, byte[] var3, int var4) {
      int var5 = var2 - var1;

      for(int var6 = 0; var6 < var5; ++var6) {
         char var7 = var0.charAt(var6 + var1);
         if(var7 > 0 && var7 < 128 || var7 >= 160 && var7 <= 255) {
            var3[var6 + var4] = (byte)var7;
         } else if(var7 == 8364) {
            var3[var6 + var4] = -128;
         } else if(var7 == 8218) {
            var3[var6 + var4] = -126;
         } else if(var7 == 402) {
            var3[var6 + var4] = -125;
         } else if(var7 == 8222) {
            var3[var6 + var4] = -124;
         } else if(var7 == 8230) {
            var3[var6 + var4] = -123;
         } else if(var7 == 8224) {
            var3[var6 + var4] = -122;
         } else if(var7 == 8225) {
            var3[var6 + var4] = -121;
         } else if(var7 == 710) {
            var3[var6 + var4] = -120;
         } else if(var7 == 8240) {
            var3[var6 + var4] = -119;
         } else if(var7 == 352) {
            var3[var6 + var4] = -118;
         } else if(var7 == 8249) {
            var3[var6 + var4] = -117;
         } else if(var7 == 338) {
            var3[var6 + var4] = -116;
         } else if(var7 == 381) {
            var3[var6 + var4] = -114;
         } else if(var7 == 8216) {
            var3[var6 + var4] = -111;
         } else if(var7 == 8217) {
            var3[var6 + var4] = -110;
         } else if(var7 == 8220) {
            var3[var6 + var4] = -109;
         } else if(var7 == 8221) {
            var3[var6 + var4] = -108;
         } else if(var7 == 8226) {
            var3[var6 + var4] = -107;
         } else if(var7 == 8211) {
            var3[var6 + var4] = -106;
         } else if(var7 == 8212) {
            var3[var6 + var4] = -105;
         } else if(var7 == 732) {
            var3[var6 + var4] = -104;
         } else if(var7 == 8482) {
            var3[var6 + var4] = -103;
         } else if(var7 == 353) {
            var3[var6 + var4] = -102;
         } else if(var7 == 8250) {
            var3[var6 + var4] = -101;
         } else if(var7 == 339) {
            var3[var6 + var4] = -100;
         } else if(var7 == 382) {
            var3[var6 + var4] = -98;
         } else if(var7 == 376) {
            var3[var6 + var4] = -97;
         } else {
            var3[var6 + var4] = 63;
         }
      }

      return var5;
   }
}
