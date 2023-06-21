package net.runelite.standalone;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import net.runelite.api.events.FocusChanged;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.api.RSKeyFocusListener;

@ObfuscatedName("az")
public final class KeyFocusListener implements KeyListener, FocusListener, RSKeyFocusListener {
   @ObfuscatedName("ck")
   public static int[] field404;
   @ObfuscatedName("cq")
   public static int[] field388;
   @ObfuscatedName("cw")
   @ObfuscatedGetter(
      intValue = 1159843057
   )
   public static int field406;
   @ObfuscatedName("cv")
   @ObfuscatedGetter(
      intValue = -731079815
   )
   public static int field382;
   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "Laz;"
   )
   public static KeyFocusListener keyboard;
   @ObfuscatedName("cn")
   @ObfuscatedGetter(
      intValue = -692028311
   )
   public static int field410;
   @ObfuscatedName("fv")
   @ObfuscatedGetter(
      intValue = 2023993573
   )
   static int field412;
   @ObfuscatedName("de")
   @ObfuscatedSignature(
      signature = "Lin;"
   )
   static Js5 fontmetrics;
   @ObfuscatedName("ci")
   @ObfuscatedGetter(
      intValue = 1818076513
   )
   public static volatile int keyboardIdleTicks;
   @ObfuscatedName("cb")
   public static boolean[] keyPressed;
   @ObfuscatedName("co")
   static char[] field402;
   @ObfuscatedName("cr")
   static int[] field403;
   @ObfuscatedName("cu")
   @ObfuscatedGetter(
      intValue = 595955195
   )
   public static int field408;
   @ObfuscatedName("bi")
   @ObfuscatedSignature(
      signature = "Lll;"
   )
   static JagexLoginType loginType;
   @ObfuscatedName("cf")
   @ObfuscatedGetter(
      intValue = -1396922597
   )
   public static int field400;
   @ObfuscatedName("cs")
   @ObfuscatedGetter(
      intValue = 2047808079
   )
   public static int field399;
   @ObfuscatedName("ce")
   static int[] KeyHandler_keyCodes;

   static {
      keyboard = new KeyFocusListener();
      keyPressed = new boolean[112];
      field388 = new int[128];
      field400 = 0;
      field399 = 0;
      field402 = new char[128];
      field403 = new int[128];
      field404 = new int[128];
      field410 = 0;
      field406 = 0;
      field382 = 0;
      field408 = 0;
      keyboardIdleTicks = 0;
      KeyHandler_keyCodes = new int[]{-1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
   }

   KeyFocusListener() {
      this.rl$$init();
   }

   public void onFocusLost(FocusEvent var1) {
      FocusChanged var2 = new FocusChanged();
      var2.setFocused(false);
      ItemContainer.clientInstance.getCallbacks().post(var2);
   }

   private void rl$$init() {
   }

   public final synchronized void copy$keyPressed(KeyEvent var1) {
      if(keyboard != null) {
         int var2 = var1.getKeyCode();
         if(var2 >= 0 && var2 < KeyHandler_keyCodes.length) {
            var2 = KeyHandler_keyCodes[var2];
            if((var2 & 128) != 0) {
               var2 = -1;
            }
         } else {
            var2 = -1;
         }

         if(field399 >= 0 && var2 >= 0) {
            field388[field399] = var2;
            field399 = field399 + 1 & 127;
            if(field400 == field399) {
               field399 = -1;
            }
         }

         int var3;
         if(var2 >= 0) {
            var3 = field382 + 1 & 127;
            if(var3 != field406) {
               field403[field382] = var2;
               field402[field382] = 0;
               field382 = var3;
            }
         }

         var3 = var1.getModifiers();
         if((var3 & 10) != 0 || var2 == 85 || var2 == 10) {
            var1.consume();
         }
      }

   }

   public final synchronized void copy$keyReleased(KeyEvent var1) {
      if(keyboard != null) {
         int var2 = var1.getKeyCode();
         if(var2 >= 0 && var2 < KeyHandler_keyCodes.length) {
            var2 = KeyHandler_keyCodes[var2] & -129;
         } else {
            var2 = -1;
         }

         if(field399 >= 0 && var2 >= 0) {
            field388[field399] = ~var2;
            field399 = field399 + 1 & 127;
            if(field399 == field400) {
               field399 = -1;
            }
         }
      }

      var1.consume();
   }

   public final void copy$keyTyped(KeyEvent var1) {
      if(keyboard != null) {
         char var2 = var1.getKeyChar();
         if(var2 != 0 && var2 != '\uffff' && WorldMapType1.method4928(var2)) {
            int var3 = field382 + 1 & 127;
            if(var3 != field406) {
               field403[field382] = -1;
               field402[field382] = var2;
               field382 = var3;
            }
         }
      }

      var1.consume();
   }

   public final synchronized void keyReleased(KeyEvent var1) {
      ItemContainer.clientInstance.getCallbacks().keyReleased(var1);
      if(!var1.isConsumed()) {
         this.copy$keyReleased(var1);
      }

   }

   public final void focusGained(FocusEvent var1) {
   }

   public final void keyTyped(KeyEvent var1) {
      ItemContainer.clientInstance.getCallbacks().keyTyped(var1);
      if(!var1.isConsumed()) {
         this.copy$keyTyped(var1);
      }

   }

   public final synchronized void keyPressed(KeyEvent var1) {
      ItemContainer.clientInstance.getCallbacks().keyPressed(var1);
      if(!var1.isConsumed()) {
         this.copy$keyPressed(var1);
      }

   }

   public final synchronized void focusLost(FocusEvent var1) {
      this.onFocusLost(var1);
      if(keyboard != null) {
         field399 = -1;
      }

   }

   @ObfuscatedName("k")
   @ObfuscatedSignature(
      signature = "(IIB)Z",
      garbageValue = "1"
   )
   static final boolean method5935(int var0, int var1) {
      LocType var2 = GrandExchangeOffer.method1736(var0);
      if(var1 == 11) {
         var1 = 10;
      }

      if(var1 >= 5 && var1 <= 8) {
         var1 = 4;
      }

      return var2.method406(var1);
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "(ILjava/lang/String;Ljava/lang/String;B)V",
      garbageValue = "1"
   )
   static void method5934(int var0, String var1, String var2) {
      class312.method6287(var0, var1, var2, (String)null);
   }

   @ObfuscatedName("jl")
   @ObfuscatedSignature(
      signature = "(Lia;IIZI)V",
      garbageValue = "321367859"
   )
   static void method5936(ComponentType var0, int var1, int var2, boolean var3) {
      int var4 = var0.width;
      int var5 = var0.height;
      if(var0.sizeXmode == 0) {
         var0.width = var0.sizeX;
      } else if(var0.sizeXmode == 1) {
         var0.width = var1 - var0.sizeX;
      } else if(var0.sizeXmode == 2) {
         var0.width = var0.sizeX * var1 >> 14;
      }

      if(var0.sizeYmode == 0) {
         var0.height = var0.sizeY;
      } else if(var0.sizeYmode == 1) {
         var0.height = var2 - var0.sizeY;
      } else if(var0.sizeYmode == 2) {
         var0.height = var2 * var0.sizeY >> 14;
      }

      if(var0.sizeXmode == 4) {
         var0.width = var0.height * var0.field2766 / var0.field2681;
      }

      if(var0.sizeYmode == 4) {
         var0.height = var0.width * var0.field2681 / var0.field2766;
      }

      if(var0.clientcode == 1337) {
         client.field821 = var0;
      }

      if(var3 && var0.onResizeListener != null && (var4 != var0.width || var5 != var0.height)) {
         ScriptEvent var6 = new ScriptEvent();
         var6.source = var0;
         var6.params = var0.onResizeListener;
         client.field848.method3906(var6);
      }

   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(III)I",
      garbageValue = "-1838139792"
   )
   static int method5933(int var0, int var1) {
      ItemContainer var2 = (ItemContainer)ItemContainer.itemContainers.method6335((long)var0);
      return var2 == null?0:(var1 >= 0 && var1 < var2.stackSizes.length?var2.stackSizes[var1]:0);
   }
}
