package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.api.RSEnum;

@ObfuscatedName("jf")
public class Enum extends CacheableNode implements RSEnum {
   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "Liz;"
   )
   public static Js5Index EnumDefinition_indexCache;
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "Lgp;"
   )
   static NodeCache field3424;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = -1768409015
   )
   public int defaultInt;
   @ObfuscatedName("q")
   public int[] intVals;
   @ObfuscatedName("x")
   public char valType;
   @ObfuscatedName("m")
   public int[] keys;
   @ObfuscatedName("p")
   @ObfuscatedGetter(
      intValue = -1311220831
   )
   public int size;
   @ObfuscatedName("b")
   public String[] stringVals;
   @ObfuscatedName("h")
   public String defaultString;
   @ObfuscatedName("g")
   public char keyType;

   static {
      field3424 = new NodeCache(64);
   }

   Enum() {
      this.defaultString = "null";
      this.size = 0;
      this.rl$$init();
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "2053892206"
   )
   public int method4348() {
      return this.size;
   }

   public int[] getKeys() {
      return this.keys;
   }

   public String getDefaultString() {
      return this.defaultString;
   }

   public int getDefaultInt() {
      return this.defaultInt;
   }

   private void rl$$init() {
   }

   public int[] getIntVals() {
      return this.intVals;
   }

   public String[] getStringVals() {
      return this.stringVals;
   }

   public int getIntValue(int var1) {
      int[] var2 = this.getKeys();
      if(var2 == null) {
         return this.getDefaultInt();
      } else {
         for(int var3 = 0; var3 < var2.length; ++var3) {
            if(var2[var3] == var1) {
               int[] var4 = this.getIntVals();
               return var4[var3];
            }
         }

         return this.getDefaultInt();
      }
   }

   public String getStringValue(int var1) {
      int[] var2 = this.getKeys();
      if(var2 == null) {
         return this.getDefaultString();
      } else {
         for(int var3 = 0; var3 < var2.length; ++var3) {
            if(var2[var3] == var1) {
               String[] var4 = this.getStringVals();
               return var4[var3];
            }
         }

         return this.getDefaultString();
      }
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(Lgx;B)V",
      garbageValue = "32"
   )
   void method4347(Packet var1) {
      while(true) {
         int var2 = var1.readUnsignedByte();
         if(var2 == 0) {
            return;
         }

         this.method4353(var1, var2);
      }
   }

   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "(Lgx;II)V",
      garbageValue = "214023150"
   )
   void method4353(Packet var1, int var2) {
      if(var2 == 1) {
         this.keyType = (char)var1.readUnsignedByte();
      } else if(var2 == 2) {
         this.valType = (char)var1.readUnsignedByte();
      } else if(var2 == 3) {
         this.defaultString = var1.readString();
      } else if(var2 == 4) {
         this.defaultInt = var1.readInt();
      } else {
         int var3;
         if(var2 == 5) {
            this.size = var1.readUnsignedShort();
            this.keys = new int[this.size];
            this.stringVals = new String[this.size];

            for(var3 = 0; var3 < this.size; ++var3) {
               this.keys[var3] = var1.readInt();
               this.stringVals[var3] = var1.readString();
            }
         } else if(var2 == 6) {
            this.size = var1.readUnsignedShort();
            this.keys = new int[this.size];
            this.intVals = new int[this.size];

            for(var3 = 0; var3 < this.size; ++var3) {
               this.keys[var3] = var1.readInt();
               this.intVals[var3] = var1.readInt();
            }
         }
      }

   }
}
