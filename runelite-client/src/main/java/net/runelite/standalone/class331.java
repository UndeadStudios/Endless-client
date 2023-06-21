package net.runelite.standalone;

import java.awt.image.BufferedImage;
import java.awt.image.PixelGrabber;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import javax.imageio.ImageIO;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gy")
public class class331 {
   @ObfuscatedName("gq")
   @ObfuscatedSignature(
      signature = "(Lbq;I)V",
      garbageValue = "1042070324"
   )
   static final void method6415(PathingEntity var0) {
      if(var0.field986 == client.gameCycle || var0.animation == -1 || var0.actionAnimationDisable != 0 || var0.actionFrameCycle + 1 > AuthProt.method6374(var0.animation).frameLengths[var0.actionFrame]) {
         int var1 = var0.field986 - var0.field985;
         int var2 = client.gameCycle - var0.field985;
         int var3 = var0.field981 * 128 + var0.size * 64;
         int var4 = var0.field983 * 128 + var0.size * 64;
         int var5 = var0.field943 * 128 + var0.size * 64;
         int var6 = var0.field984 * 128 + var0.size * 64;
         var0.x = (var5 * var2 + var3 * (var1 - var2)) / var1 * 451031603;
         var0.y = (var2 * var6 + var4 * (var1 - var2)) / var1;
      }

      var0.field997 = 0;
      var0.orientation = var0.field987;
      var0.angle = var0.orientation;
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "([BI)Lld;",
      garbageValue = "-1052677101"
   )
   public static final SpritePixels method6416(byte[] var0) {
      BufferedImage var1 = null;

      try {
         var1 = ImageIO.read(new ByteArrayInputStream(var0));
         int var2 = var1.getWidth();
         int var3 = var1.getHeight();
         int[] var4 = new int[var3 * var2];
         PixelGrabber var5 = new PixelGrabber(var1, 0, 0, var2, var3, var4, 0, var2);
         var5.grabPixels();
         return new SpritePixels(var4, var2, var3);
      } catch (IOException var7) {
         ;
      } catch (InterruptedException var8) {
         ;
      }

      return new SpritePixels(0, 0);
   }
}
