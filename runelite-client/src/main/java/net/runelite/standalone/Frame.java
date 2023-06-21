package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.api.RSFrame;
import net.runelite.rs.api.RSFrameMap;

@ObfuscatedName("dm")
public class Frame implements RSFrame {
   @ObfuscatedName("x")
   static int[] field1635;
   @ObfuscatedName("a")
   static int[] field1629;
   @ObfuscatedName("s")
   static int[] field1627;
   @ObfuscatedName("g")
   static int[] field1628;
   @ObfuscatedName("f")
   int transformCount;
   @ObfuscatedName("q")
   int[] translator_y;
   @ObfuscatedName("m")
   int[] translator_x;
   @ObfuscatedName("p")
   int[] transformTypes;
   @ObfuscatedName("b")
   int[] translator_z;
   @ObfuscatedName("n")
   boolean showing;
   @ObfuscatedName("h")
   @ObfuscatedSignature(
      signature = "Lev;"
   )
   FrameMap skin;

   static {
      field1629 = new int[500];
      field1627 = new int[500];
      field1628 = new int[500];
      field1635 = new int[500];
   }

   @ObfuscatedSignature(
      signature = "([BLev;)V"
   )
   Frame(byte[] var1, FrameMap var2) {
      this.skin = null;
      this.transformCount = -1;
      this.showing = false;
      this.skin = var2;
      Packet var3 = new Packet(var1);
      Packet var4 = new Packet(var1);
      var3.offset = 2;
      int var5 = var3.readUnsignedByte();
      int var6 = -1;
      int var7 = 0;
      var4.offset = var5 + var3.offset;

      int var8;
      for(var8 = 0; var8 < var5; ++var8) {
         int var9 = var3.readUnsignedByte();
         if(var9 > 0) {
            if(this.skin.types[var8] != 0) {
               for(int var10 = var8 - 1; var10 > var6; --var10) {
                  if(this.skin.types[var10] == 0) {
                     field1629[var7] = var10;
                     field1627[var7] = 0;
                     field1628[var7] = 0;
                     field1635[var7] = 0;
                     ++var7;
                     break;
                  }
               }
            }

            field1629[var7] = var8;
            short var11 = 0;
            if(this.skin.types[var8] == 3) {
               var11 = 128;
            }

            if((var9 & 1) != 0) {
               field1627[var7] = var4.method5099();
            } else {
               field1627[var7] = var11;
            }

            if((var9 & 2) != 0) {
               field1628[var7] = var4.method5099();
            } else {
               field1628[var7] = var11;
            }

            if((var9 & 4) != 0) {
               field1635[var7] = var4.method5099();
            } else {
               field1635[var7] = var11;
            }

            var6 = var8;
            ++var7;
            if(this.skin.types[var8] == 5) {
               this.showing = true;
            }
         }
      }

      if(var1.length != var4.offset) {
         throw new RuntimeException();
      } else {
         this.transformCount = var7;
         this.transformTypes = new int[var7];
         this.translator_x = new int[var7];
         this.translator_y = new int[var7];
         this.translator_z = new int[var7];

         for(var8 = 0; var8 < var7; ++var8) {
            this.transformTypes[var8] = field1629[var8];
            this.translator_x[var8] = field1627[var8];
            this.translator_y[var8] = field1628[var8];
            this.translator_z[var8] = field1635[var8];
         }

      }
   }

   public RSFrameMap getSkin() {
      return this.skin;
   }

   public int getTransformCount() {
      return this.transformCount;
   }

   public int[] getTransformTypes() {
      return this.transformTypes;
   }

   public int[] getTranslatorX() {
      return this.translator_x;
   }

   public int[] getTranslatorY() {
      return this.translator_y;
   }

   public int[] getTranslatorZ() {
      return this.translator_z;
   }

   public boolean isShowing() {
      return this.showing;
   }
}
