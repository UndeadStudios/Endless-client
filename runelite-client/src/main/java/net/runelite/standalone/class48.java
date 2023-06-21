package net.runelite.standalone;

import java.io.File;
import java.util.Hashtable;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fz")
public class class48 {
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "Liz;"
   )
   public static Js5Index item_ref;
   @ObfuscatedName("a")
   static boolean field2055;
   @ObfuscatedName("s")
   static File field2056;
   @ObfuscatedName("g")
   static Hashtable field2057;

   static {
      field2055 = false;
      field2057 = new Hashtable(16);
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "(Llv;I)V",
      garbageValue = "-1261400776"
   )
   static final void method801(IndexedSprite var0) {
      short var1 = 256;

      int var2;
      for(var2 = 0; var2 < MouseInput.field498.length; ++var2) {
         MouseInput.field498[var2] = 0;
      }

      int var3;
      for(var2 = 0; var2 < 5000; ++var2) {
         var3 = (int)(Math.random() * 128.0D * (double)var1);
         MouseInput.field498[var3] = (int)(Math.random() * 256.0D);
      }

      int var4;
      int var5;
      for(var2 = 0; var2 < 20; ++var2) {
         for(var3 = 1; var3 < var1 - 1; ++var3) {
            for(var4 = 1; var4 < 127; ++var4) {
               var5 = var4 + (var3 << 7);
               class132.field3196[var5] = (MouseInput.field498[var5 + 128] + MouseInput.field498[var5 - 128] + MouseInput.field498[var5 + 1] + MouseInput.field498[var5 - 1]) / 4;
            }
         }

         int[] var8 = MouseInput.field498;
         MouseInput.field498 = class132.field3196;
         class132.field3196 = var8;
      }

      if(var0 != null) {
         var2 = 0;

         for(var3 = 0; var3 < var0.height; ++var3) {
            for(var4 = 0; var4 < var0.width; ++var4) {
               if(var0.pixels[var2++] != 0) {
                  var5 = var4 + var0.offsetX + 16;
                  int var6 = var3 + var0.offsetY + 16;
                  int var7 = var5 + (var6 << 7);
                  MouseInput.field498[var7] = 0;
               }
            }
         }
      }

   }
}
