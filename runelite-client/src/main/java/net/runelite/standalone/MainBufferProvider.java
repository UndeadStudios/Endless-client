package net.runelite.standalone;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.Shape;
import java.awt.color.ColorSpace;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;
import java.awt.image.DirectColorModel;
import java.awt.image.Raster;
import java.awt.image.WritableRaster;
import java.util.Hashtable;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.api.RSMainBufferProvider;

@ObfuscatedName("am")
public final class MainBufferProvider extends BufferProvider implements RSMainBufferProvider {
   @ObfuscatedName("a")
   Component field445;
   @ObfuscatedName("s")
   Image image;

   MainBufferProvider(int var1, int var2, Component var3) {
      super.width = var1;
      super.height = var2;
      super.pixels = new int[var2 * var1 + 1];
      DataBufferInt var4 = new DataBufferInt(super.pixels, super.pixels.length);
      DirectColorModel var5 = new DirectColorModel(32, 16711680, 65280, 255);
      WritableRaster var6 = Raster.createWritableRaster(var5.createCompatibleSampleModel(super.width, super.height), var4, (Point)null);
      this.image = new BufferedImage(var5, var6, false, new Hashtable());
      this.method4239(var3);
      this.method1872();
      this.rl$$init();
      this.init(var1, var2, var3);
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(Ljava/awt/Graphics;IIB)V",
      garbageValue = "0"
   )
   final void method4250(Graphics var1, int var2, int var3) {
      ItemContainer.clientInstance.getCallbacks().draw(this, var1, var2, var3);
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "(Ljava/awt/Component;B)V",
      garbageValue = "-16"
   )
   final void method4239(Component var1) {
      this.field445 = var1;
   }

   public void setImage(Image var1) {
      this.image = var1;
   }

   private void rl$$init() {
   }

   public void init(int var1, int var2, Component var3) {
      if(ItemContainer.clientInstance.isGpu()) {
         int[] var4 = this.getPixels();
         DataBufferInt var5 = new DataBufferInt(var4, var4.length);
         DirectColorModel var6 = new DirectColorModel(ColorSpace.getInstance(1000), 32, 16711680, 65280, 255, -16777216, true, 3);
         WritableRaster var7 = Raster.createWritableRaster(var6.createCompatibleSampleModel(var1, var2), var5, (Point)null);
         BufferedImage var8 = new BufferedImage(var6, var7, true, new Hashtable());
         this.setImage(var8);
      }
   }

   public Component getCanvas() {
      return this.field445;
   }

   public Image getImage() {
      return this.image;
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(IIB)V",
      garbageValue = "16"
   )
   public final void vmethod4241(int var1, int var2) {
      this.method4250(this.field445.getGraphics(), var1, var2);
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      signature = "(Ljava/awt/Graphics;IIIII)V",
      garbageValue = "1939953049"
   )
   final void method4244(Graphics var1, int var2, int var3, int var4, int var5) {
      try {
         Shape var6 = var1.getClip();
         var1.clipRect(var2, var3, var4, var5);
         var1.drawImage(this.image, 0, 0, this.field445);
         var1.setClip(var6);
      } catch (Exception var7) {
         this.field445.repaint();
      }

   }

   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "(IIIII)V",
      garbageValue = "-215892781"
   )
   public final void vmethod4242(int var1, int var2, int var3, int var4) {
      this.method4244(this.field445.getGraphics(), var1, var2, var3, var4);
   }
}
