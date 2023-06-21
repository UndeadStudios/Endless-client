package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jw")
public class Overlay extends CacheableNode {
   @ObfuscatedName("sg")
   @ObfuscatedGetter(
      longValue = -6858018479485301323L
   )
   static long field3614;
   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "Liz;"
   )
   public static Js5Index overlay_ref;
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "Lgp;"
   )
   public static NodeCache overlays;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = -1567994693
   )
   public int otherRgbColor;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = 1479659459
   )
   public int otherLightness;
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = -1220142471
   )
   public int lightness;
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = 215202175
   )
   public int texture;
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      intValue = 1997769193
   )
   public int saturation;
   @ObfuscatedName("p")
   @ObfuscatedGetter(
      intValue = -1316198325
   )
   public int hue;
   @ObfuscatedName("b")
   @ObfuscatedGetter(
      intValue = -1810245119
   )
   public int otherHue;
   @ObfuscatedName("n")
   @ObfuscatedGetter(
      intValue = -1663697453
   )
   public int otherSaturation;
   @ObfuscatedName("h")
   public boolean isHidden;
   @ObfuscatedName("g")
   @ObfuscatedGetter(
      intValue = -1099346071
   )
   public int color;

   static {
      overlays = new NodeCache(64);
   }

   public Overlay() {
      this.color = 0;
      this.texture = -1;
      this.isHidden = true;
      this.otherRgbColor = -1;
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(Lgx;III)V",
      garbageValue = "909984576"
   )
   void method6390(Packet var1, int var2, int var3) {
      if(var2 == 1) {
         this.color = var1.method5090();
      } else if(var2 == 2) {
         this.texture = var1.readUnsignedByte();
      } else if(var2 == 5) {
         this.isHidden = false;
      } else if(var2 == 7) {
         this.otherRgbColor = var1.method5090();
      } else if(var2 == 8) {
         ;
      }

   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1264189152"
   )
   public void method6395() {
      if(this.otherRgbColor != -1) {
         this.method6391(this.otherRgbColor);
         this.otherHue = this.hue;
         this.otherSaturation = this.saturation;
         this.otherLightness = this.lightness;
      }

      this.method6391(this.color);
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "-89150727"
   )
   void method6391(int var1) {
      double var2 = (double)(var1 >> 16 & 255) / 256.0D;
      double var4 = (double)(var1 >> 8 & 255) / 256.0D;
      double var6 = (double)(var1 & 255) / 256.0D;
      double var8 = var2;
      if(var4 < var2) {
         var8 = var4;
      }

      if(var6 < var8) {
         var8 = var6;
      }

      double var10 = var2;
      if(var4 > var2) {
         var10 = var4;
      }

      if(var6 > var10) {
         var10 = var6;
      }

      double var12 = 0.0D;
      double var14 = 0.0D;
      double var16 = (var8 + var10) / 2.0D;
      if(var10 != var8) {
         if(var16 < 0.5D) {
            var14 = (var10 - var8) / (var8 + var10);
         }

         if(var16 >= 0.5D) {
            var14 = (var10 - var8) / (2.0D - var10 - var8);
         }

         if(var2 == var10) {
            var12 = (var4 - var6) / (var10 - var8);
         } else if(var10 == var4) {
            var12 = (var6 - var2) / (var10 - var8) + 2.0D;
         } else if(var6 == var10) {
            var12 = (var2 - var4) / (var10 - var8) + 4.0D;
         }
      }

      var12 /= 6.0D;
      this.hue = (int)(256.0D * var12);
      this.saturation = (int)(256.0D * var14);
      this.lightness = (int)(var16 * 256.0D);
      if(this.saturation < 0) {
         this.saturation = 0;
      } else if(this.saturation > 255) {
         this.saturation = 255;
      }

      if(this.lightness < 0) {
         this.lightness = 0;
      } else if(this.lightness > 255) {
         this.lightness = 255;
      }

   }

   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "(Lgx;II)V",
      garbageValue = "-1905412796"
   )
   public void method6389(Packet var1, int var2) {
      while(true) {
         int var3 = var1.readUnsignedByte();
         if(var3 == 0) {
            return;
         }

         this.method6390(var1, var3, var2);
      }
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "(II)Ljz;",
      garbageValue = "-1925374163"
   )
   public static ParamType method6404(int var0) {
      ParamType var1 = (ParamType)ParamType.paramTypeCache.method635((long)var0);
      if(var1 != null) {
         return var1;
      } else {
         byte[] var2 = ParamType.field3411.method4115(11, var0, -312012757);
         var1 = new ParamType();
         if(var2 != null) {
            var1.method604(new Packet(var2));
         }

         var1.method603();
         ParamType.paramTypeCache.method628(var1, (long)var0);
         return var1;
      }
   }

   @ObfuscatedName("kd")
   @ObfuscatedSignature(
      signature = "(Lbk;ZI)V",
      garbageValue = "1120058640"
   )
   static final void method6405(SubInterface var0, boolean var1) {
      int var2 = var0.id;
      int var3 = (int)var0.hash;
      var0.method432();
      int var5;
      if(var1 && var2 != -1 && ComponentType.validInterfaces[var2]) {
         class234.componentIndex.method4129(var2);
         if(ComponentType.interfaces[var2] != null) {
            boolean var9 = true;

            for(var5 = 0; var5 < ComponentType.interfaces[var2].length; ++var5) {
               if(ComponentType.interfaces[var2][var5] != null) {
                  if(ComponentType.interfaces[var2][var5].type != 2) {
                     ComponentType.interfaces[var2][var5] = null;
                  } else {
                     var9 = false;
                  }
               }
            }

            if(var9) {
               ComponentType.interfaces[var2] = null;
            }

            ComponentType.validInterfaces[var2] = false;
         }
      }

      class2.method39(var2);
      ComponentType var4 = ChatHistory.method6246(var3);
      if(var4 != null) {
         WorldMapRegion.method5554(var4);
      }

      for(var5 = 0; var5 < client.menuOptionCount; ++var5) {
         int var7 = client.menuTypes[var5];
         boolean var6 = var7 == 57 || var7 == 58 || var7 == 1007 || var7 == 25 || var7 == 30;
         if(var6) {
            if(var5 < client.menuOptionCount - 1) {
               for(int var8 = var5; var8 < client.menuOptionCount - 1; ++var8) {
                  client.menuOptions[var8] = client.menuOptions[var8 + 1];
                  client.menuTargets[var8] = client.menuTargets[var8 + 1];
                  client.menuTypes[var8] = client.menuTypes[var8 + 1];
                  client.menuIdentifiers[var8] = client.menuIdentifiers[var8 + 1];
                  client.menuActionParams0[var8] = client.menuActionParams0[var8 + 1];
                  client.menuActionParams1[var8] = client.menuActionParams1[var8 + 1];
                  client.menuBooleanArray[var8] = client.menuBooleanArray[var8 + 1];
               }
            }

            --var5;
            --client.menuOptionCount;
            client.onMenuOptionsChanged(-1);
         }
      }

      FriendManager.method2414(class302.field3309 / 2 + class181.menuX, TotalQuantityComparator.menuY);
      if(client.toplevel != -1) {
         class61.method923(client.toplevel, 1);
      }

   }
}
