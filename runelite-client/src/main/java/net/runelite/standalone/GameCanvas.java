package net.runelite.standalone;

import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.event.FocusListener;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.api.RSGameCanvas;

@ObfuscatedName("ad")
public final class GameCanvas extends Canvas implements RSGameCanvas {
   @ObfuscatedName("sz")
   @ObfuscatedSignature(
      signature = "Lp;"
   )
   static TradingPost tradingPost;
   @ObfuscatedName("jr")
   @ObfuscatedSignature(
      signature = "Lia;"
   )
   static ComponentType field420;
   public static boolean shouldNotHaveFocus;
   @ObfuscatedName("dl")
   @ObfuscatedSignature(
      signature = "Lfn;"
   )
   static Task socket;
   @ObfuscatedName("h")
   public static int[] indexedSpriteOffsetYs;
   @ObfuscatedName("a")
   Component component;

   GameCanvas(Component var1) {
      this.component = var1;
      this.rl$$init();
   }

   private void rl$$init() {
   }

   public final void paint(Graphics var1) {
      this.component.paint(var1);
   }

   public final void update(Graphics var1) {
      this.component.update(var1);
   }

   public void removeFocusListener(FocusListener var1) {
      super.removeFocusListener(var1);
      shouldNotHaveFocus = !this.hasFocus();
   }

   public void requestFocus() {
      if(!shouldNotHaveFocus) {
         this.requestFocusInWindow();
      }

   }

   public void setSize(int var1, int var2) {
      if(ItemContainer.clientInstance.isStretchedEnabled()) {
         super.setSize(ItemContainer.clientInstance.getStretchedDimensions().width, ItemContainer.clientInstance.getStretchedDimensions().height);
      } else {
         super.setSize(var1, var2);
      }

   }

   public void setLocation(int var1, int var2) {
      if(ItemContainer.clientInstance.isStretchedEnabled()) {
         super.setLocation((this.getParent().getWidth() - ItemContainer.clientInstance.getStretchedDimensions().width) / 2, 0);
      } else {
         super.setLocation(var1, var2);
      }

   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "(S)[Lfc;",
      garbageValue = "31697"
   )
   public static ServerProt[] method4867() {
      return new ServerProt[]{ServerProt.field2144, ServerProt.field2132, ServerProt.field2133, ServerProt.field2134, ServerProt.field2135, ServerProt.field2136, ServerProt.field2137, ServerProt.field2172, ServerProt.field2139, ServerProt.field2185, ServerProt.field2141, ServerProt.field2173, ServerProt.field2143, ServerProt.field2170, ServerProt.field2145, ServerProt.field2194, ServerProt.field2147, ServerProt.field2148, ServerProt.field2149, ServerProt.field2150, ServerProt.field2191, ServerProt.field2161, ServerProt.field2153, ServerProt.field2146, ServerProt.field2155, ServerProt.field2140, ServerProt.field2166, ServerProt.field2158, ServerProt.field2159, ServerProt.field2142, ServerProt.field2210, ServerProt.field2162, ServerProt.field2163, ServerProt.field2157, ServerProt.field2165, ServerProt.field2180, ServerProt.field2167, ServerProt.field2168, ServerProt.field2169, ServerProt.field2171, ServerProt.field2151, ServerProt.field2199, ServerProt.field2156, ServerProt.field2160, ServerProt.field2175, ServerProt.field2176, ServerProt.field2177, ServerProt.field2178, ServerProt.field2179, ServerProt.field2174, ServerProt.field2164, ServerProt.field2182, ServerProt.field2183, ServerProt.field2184, ServerProt.field2187, ServerProt.field2131, ServerProt.field2181, ServerProt.field2188, ServerProt.field2189, ServerProt.field2190, ServerProt.field2216, ServerProt.field2192, ServerProt.field2193, ServerProt.field2207, ServerProt.field2195, ServerProt.field2196, ServerProt.field2197, ServerProt.field2198, ServerProt.field2152, ServerProt.field2200, ServerProt.field2201, ServerProt.field2202, ServerProt.field2203, ServerProt.field2204, ServerProt.field2205, ServerProt.field2206, ServerProt.field2138, ServerProt.field2208, ServerProt.field2209, ServerProt.field2217, ServerProt.field2211, ServerProt.field2212, ServerProt.field2213, ServerProt.field2214, ServerProt.field2215 };
   }

   @ObfuscatedName("hv")
   @ObfuscatedSignature(
      signature = "(IIIIIIII)V",
      garbageValue = "115217343"
   )
   static final void method4865(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      var5 = MapIcon.method4081(var5, var6);
      int var7 = 2048 - var3 & 2047;
      int var8 = 2048 - var4 & 2047;
      int var9 = 0;
      int var10 = 0;
      int var11 = var5;
      int var12;
      int var13;
      int var14;
      if(var7 != 0) {
         var12 = Graphics3D.SINE[var7];
         var13 = Graphics3D.COSINE[var7];
         var14 = var10 * var13 - var5 * var12 >> 16;
         var11 = var10 * var12 + var5 * var13 >> 16;
         var10 = var14;
      }

      if(var8 != 0) {
         var12 = Graphics3D.SINE[var8];
         var13 = Graphics3D.COSINE[var8];
         var14 = var12 * var11 + var9 * var13 >> 16;
         var11 = var13 * var11 - var12 * var9 >> 16;
         var9 = var14;
      }

      class258.cameraX = var0 - var9;
      class2.cameraZ = var1 - var10;
      FontName.cameraY = var2 - var11;
      GZipDecompressor.cameraPitch = var3;
      client.onCameraPitchChanged(-1);
      class142.cameraYaw = var4;
      if(client.camModeType == 1 && client.staffModLevel >= 2 && client.gameCycle % 50 == 0 && (class71.localPlayer.x * -1234429701 >> 7 != client.field725 >> 7 || class69.field135 >> 7 != class71.localPlayer.y >> 7)) {
         var12 = class71.localPlayer.field631;
         var13 = (client.field725 >> 7) + class53.baseX;
         var14 = (class69.field135 >> 7) + class312.baseY;
         WorldMapManager.method2322(var13, var14, var12, true);
      }

   }

   @ObfuscatedName("it")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1480716398"
   )
   static void method4866() {
      if(client.spellSelected) {
         ComponentType var0 = UnitPriceComparator.method2289(class255.field2065, client.field853);
         if(var0 != null && var0.onTargetLeaveListener != null) {
            ScriptEvent var1 = new ScriptEvent();
            var1.source = var0;
            var1.params = var0.onTargetLeaveListener;
            class192.method3810(var1);
         }

         client.spellSelected = false;
         WorldMapRegion.method5554(var0);
      }
   }
}
