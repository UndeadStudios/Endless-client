package net.runelite.standalone;

import net.runelite.api.events.FocusChanged;
import net.runelite.api.hooks.DrawCallbacks;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.api.RSGameEngine;

import java.applet.Applet;
import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.*;
import java.net.URL;

@ObfuscatedName("bf")
public abstract class GameEngine extends Applet implements Runnable, FocusListener, WindowListener, RSGameEngine {
   @ObfuscatedName("f")
   static boolean field449;
   @ObfuscatedName("ae")
   @ObfuscatedGetter(
      intValue = -851112671
   )
   static int field469;
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = 2064969169
   )
   static int field477;
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      intValue = 1693242635
   )
   static int field463;
   @ObfuscatedName("b")
   @ObfuscatedGetter(
      intValue = -1405095629
   )
   static int field462;
   @ObfuscatedName("o")
   static long[] field456;
   @ObfuscatedName("n")
   @ObfuscatedGetter(
      intValue = -689075277
   )
   protected static int FPS;
   @ObfuscatedName("t")
   static long[] field455;
   @ObfuscatedName("ax")
   @ObfuscatedGetter(
      longValue = -5124857986524201693L
   )
   static long garbageCollectorLastCheckTimeMs;
   @ObfuscatedName("ad")
   @ObfuscatedGetter(
      longValue = 4493268428812309865L
   )
   static long garbageCollectorLastCollectionTime;
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "Lbf;"
   )
   static GameEngine shell;
   @ObfuscatedName("az")
   static volatile boolean focused;
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      longValue = 2200593536258227471L
   )
   static long field448;
   @ObfuscatedName("ab")
   static FontMetrics field446;
   @ObfuscatedName("g")
   @ObfuscatedGetter(
      intValue = -724394045
   )
   static int shellCount;
   @ObfuscatedName("aq")
   Clipboard clipboard;
   @ObfuscatedName("v")
   @ObfuscatedGetter(
      intValue = -115409751
   )
   protected int field458;
   @ObfuscatedName("af")
   @ObfuscatedGetter(
      intValue = 1759103007
   )
   int field473;
   @ObfuscatedName("al")
   final EventQueue eventQueue;
   @ObfuscatedName("k")
   @ObfuscatedGetter(
      intValue = -1412716173
   )
   protected int field457;
   @ObfuscatedName("au")
   volatile boolean field471;
   @ObfuscatedName("p")
   boolean hasErrored;
   @ObfuscatedName("ag")
   @ObfuscatedGetter(
      intValue = -1394216331
   )
   int field451;
   @ObfuscatedName("aj")
   @ObfuscatedGetter(
      longValue = -1598657648971181769L
   )
   volatile long field472;
   @ObfuscatedName("aw")
   Canvas canvas;
   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      signature = "Lal;"
   )
   MouseWheelHandler mouseWheelHandler;
   @ObfuscatedName("z")
   @ObfuscatedGetter(
      intValue = 1305585803
   )
   int field461;
   @ObfuscatedName("av")
   boolean field470;
   @ObfuscatedName("ay")
   @ObfuscatedGetter(
      intValue = -245156879
   )
   int field464;
   @ObfuscatedName("ah")
   java.awt.Frame frame;
   @ObfuscatedName("an")
   volatile boolean field468;
   public Thread thread;
   @ObfuscatedName("i")
   @ObfuscatedGetter(
      intValue = -2122739505
   )
   int field460;
   @ObfuscatedName("d")
   @ObfuscatedGetter(
      intValue = -436883039
   )
   int field459;

   static {
      shell = null;
      shellCount = 0;
      field448 = 0L;
      field449 = false;
      field477 = 20;
      field462 = 1;
      FPS = 0;
      field455 = new long[32];
      field456 = new long[32];
      field469 = 500;
      focused = true;
      garbageCollectorLastCollectionTime = -1L;
      garbageCollectorLastCheckTimeMs = -1L;
   }

   protected GameEngine() {
      this.hasErrored = false;
      this.field459 = 0;
      this.field460 = 0;
      this.field468 = true;
      this.field470 = false;
      this.field471 = false;
      this.onReplaceCanvasNextFrameChanged(-1);
      this.field472 = 0L;
      EventQueue var1 = null;

      try {
         var1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
      } catch (Throwable var3) {
      }

      this.eventQueue = var1;
      class266.method5005(new SoundTaskDataProvider());
      this.rl$$init();
      this.rl$$init1();
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/Object;I)V",
      garbageValue = "721091452"
   )
   final void method4380(Object var1) {
      this.onPost(var1);
      if(this.eventQueue != null) {
         for(int var2 = 0; var2 < 50 && this.eventQueue.peekEvent() != null; ++var2) {
            class36.method553(1L);
         }

         if(var1 != null) {
            this.eventQueue.postEvent(new ActionEvent(var1, 1001, "dummy"));
         }

      }
   }

   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      signature = "(B)Ljava/awt/Container;",
      garbageValue = "90"
   )
   Container method4387() {
      return this.frame != null ? this.frame : this;
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "36"
   )
   final void method4366() {
      class69.method987(this.canvas);
      class36.method555(this.canvas);
      if(this.mouseWheelHandler != null) {
         this.mouseWheelHandler.method939(this.canvas);
      }

      this.method4368();
      MouseRecorder.method129(this.canvas);
      FontName.method512(this.canvas);
      if(this.mouseWheelHandler != null) {
         this.mouseWheelHandler.method938(this.canvas);
      }

      this.method4400();
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "1918835835"
   )
   final synchronized void method4368() {
      Container var1 = this.method4387();
      if(this.canvas != null) {
         this.canvas.removeFocusListener(this);
         var1.remove(this.canvas);
      }

      GrandExchangeOffer.canvasWidth = Math.max(var1.getWidth(), this.field461);
      client.canvasWidthChanged(-1);
      class258.canvasHeight = Math.max(var1.getHeight(), this.field451);
      client.canvasHeightChanged(-1);
      Insets var2;
      if(this.frame != null) {
         var2 = this.frame.getInsets();
         GrandExchangeOffer.canvasWidth -= var2.right + var2.left;
         client.canvasWidthChanged(-1);
         class258.canvasHeight -= var2.top + var2.bottom;
         client.canvasHeightChanged(-1);
      }

      this.canvas = new GameCanvas(this);
      var1.setBackground(Color.BLACK);
      var1.setLayout(null);
      var1.add(this.canvas);
      this.canvas.setSize(GrandExchangeOffer.canvasWidth, class258.canvasHeight);
      this.canvas.setVisible(true);
      this.canvas.setBackground(Color.BLACK);
      if(var1 == this.frame) {
         var2 = this.frame.getInsets();
         this.canvas.setLocation(this.field459 + var2.left, var2.top + this.field460);
      } else {
         this.canvas.setLocation(this.field459, this.field460);
      }

      this.canvas.addFocusListener(this);
      this.canvas.requestFocus();
      this.field468 = true;
      if(Location.rasterProvider != null && GrandExchangeOffer.canvasWidth == Location.rasterProvider.width && class258.canvasHeight == Location.rasterProvider.height) {
         ((MainBufferProvider)Location.rasterProvider).method4239(this.canvas);
         Location.rasterProvider.vmethod4241(0, 0);
      } else {
         Location.rasterProvider = new MainBufferProvider(GrandExchangeOffer.canvasWidth, class258.canvasHeight, this.canvas);
      }

      this.field471 = false;
      this.onReplaceCanvasNextFrameChanged(-1);
      this.field472 = class318.method6317();
   }

   @ObfuscatedName("e")
   final void method4363(int var1) {
      if(ItemContainer.clientInstance.isStretchedEnabled()) {
         ItemContainer.clientInstance.invalidateStretching(false);
         if(ItemContainer.clientInstance.isResized()) {
            Dimension var2 = ItemContainer.clientInstance.getRealDimensions();
            this.setMaxCanvasWidth(var2.width);
            this.setMaxCanvasHeight(var2.height);
         }
      }

      this.copy$resizeCanvas(var1);
   }

   @ObfuscatedName("r")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-2003103884"
   )
   protected abstract void vmethod4364();

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      signature = "(I)Llh;",
      garbageValue = "-1432486026"
   )
   Bounds method4488() {
      Container var1 = this.method4387();
      int var2 = Math.max(var1.getWidth(), this.field461);
      int var3 = Math.max(var1.getHeight(), this.field451);
      if(this.frame != null) {
         Insets var4 = this.frame.getInsets();
         var2 -= var4.right + var4.left;
         var3 -= var4.top + var4.bottom;
      }

      return new Bounds(var2, var3);
   }

   @ObfuscatedName("ae")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1835555150"
   )
   protected abstract void vmethod4381();

   @ObfuscatedName("k")
   @ObfuscatedSignature(
      signature = "(IIIB)V",
      garbageValue = "1"
   )
   protected final void method4417(int var1, int var2, int var3) {
      try {
         if(shell != null) {
            ++shellCount;
            if(shellCount >= 3) {
               this.method4413("alreadyloaded");
               return;
            }

            this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
            return;
         }

         shell = this;
         GrandExchangeOffer.canvasWidth = var1;
         client.canvasWidthChanged(-1);
         class258.canvasHeight = var2;
         client.canvasHeightChanged(-1);
         JagException.revision = var3;
         JagException.field2022 = this;
         if(class315.taskManager == null) {
            class315.taskManager = new Signlink();
         }

         class315.taskManager.method5829(this, 1);
      } catch (Exception var5) {
         VertexNormal.method4110(null, var5, (byte) -38);
         this.method4413("crash");
      }

   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;I)V",
      garbageValue = "1979001925"
   )
   protected void method4360(String var1) {
      this.clipboard.setContents(new StringSelection(var1), null);
   }

   @ObfuscatedName("au")
   @ObfuscatedSignature(
      signature = "(ZB)V",
      garbageValue = "-68"
   )
   protected abstract void vmethod4460(boolean var1);

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "1317459983"
   )
   protected void method4359() {
      this.clipboard = this.getToolkit().getSystemClipboard();
   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "(B)Lff;",
      garbageValue = "-85"
   )
   protected class224 method4358() {
      if(this.mouseWheelHandler == null) {
         this.mouseWheelHandler = new MouseWheelHandler();
         this.mouseWheelHandler.method938(this.canvas);
      }

      return this.mouseWheelHandler;
   }

   @ObfuscatedName("b")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "1374956059"
   )
   protected final void method4361() {
      if(Signlink.javaVendor.toLowerCase().indexOf("microsoft") != -1) {
         KeyFocusListener.KeyHandler_keyCodes[186] = 57;
         KeyFocusListener.KeyHandler_keyCodes[187] = 27;
         KeyFocusListener.KeyHandler_keyCodes[188] = 71;
         KeyFocusListener.KeyHandler_keyCodes[189] = 26;
         KeyFocusListener.KeyHandler_keyCodes[190] = 72;
         KeyFocusListener.KeyHandler_keyCodes[191] = 73;
         KeyFocusListener.KeyHandler_keyCodes[192] = 58;
         KeyFocusListener.KeyHandler_keyCodes[219] = 42;
         KeyFocusListener.KeyHandler_keyCodes[220] = 74;
         KeyFocusListener.KeyHandler_keyCodes[221] = 43;
         KeyFocusListener.KeyHandler_keyCodes[222] = 59;
         KeyFocusListener.KeyHandler_keyCodes[223] = 28;
      } else {
         KeyFocusListener.KeyHandler_keyCodes[44] = 71;
         KeyFocusListener.KeyHandler_keyCodes[45] = 26;
         KeyFocusListener.KeyHandler_keyCodes[46] = 72;
         KeyFocusListener.KeyHandler_keyCodes[47] = 73;
         KeyFocusListener.KeyHandler_keyCodes[59] = 57;
         KeyFocusListener.KeyHandler_keyCodes[61] = 27;
         KeyFocusListener.KeyHandler_keyCodes[91] = 42;
         KeyFocusListener.KeyHandler_keyCodes[92] = 74;
         KeyFocusListener.KeyHandler_keyCodes[93] = 43;
         KeyFocusListener.KeyHandler_keyCodes[192] = 28;
         KeyFocusListener.KeyHandler_keyCodes[222] = 58;
         KeyFocusListener.KeyHandler_keyCodes[520] = 59;
      }

      MouseRecorder.method129(this.canvas);
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1093400736"
   )
   protected abstract void vmethod4384();

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "164494039"
   )
   final void method4400() {
      this.field470 = true;
   }

   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;I)V",
      garbageValue = "-549683560"
   )
   protected void method4413(String var1) {
      if(!this.hasErrored) {
         this.hasErrored = true;
         System.out.println("error_game_" + var1);

         try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + var1 + ".ws"), "_self");
         } catch (Exception var3) {
         }

      }
   }

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "65280"
   )
   protected final void method4429() {
      FontName.method512(this.canvas);
   }

   @ObfuscatedName("av")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "119"
   )
   protected abstract void vmethod4377();

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "-1495158229"
   )
   protected final boolean canUseHost() {
      return true;
   }

   @ObfuscatedName("t")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1101149948"
   )
   void method4486() {
      int var1 = this.field459;
      int var2 = this.field460;
      int var3 = this.field457 - GrandExchangeOffer.canvasWidth - var1;
      int var4 = this.field458 - class258.canvasHeight - var2;
      if(var1 > 0 || var3 > 0 || var2 > 0 || var4 > 0) {
         try {
            Container var5 = this.method4387();
            int var6 = 0;
            int var7 = 0;
            if(var5 == this.frame) {
               Insets var8 = this.frame.getInsets();
               var6 = var8.left;
               var7 = var8.top;
            }

            Graphics var10 = var5.getGraphics();
            var10.setColor(Color.black);
            if(var1 > 0) {
               var10.fillRect(var6, var7, var1, this.field458);
            }

            if(var2 > 0) {
               var10.fillRect(var6, var7, this.field457, var2);
            }

            if(var3 > 0) {
               var10.fillRect(var6 + this.field457 - var3, var7, var3, this.field458);
            }

            if(var4 > 0) {
               var10.fillRect(var6, var7 + this.field458 - var4, this.field457, var4);
            }
         } catch (Exception var9) {
         }
      }

   }

   @ObfuscatedName("ah")
   @ObfuscatedSignature(
      signature = "(S)V",
      garbageValue = "-12922"
   )
   final void method4467() {
      Bounds var1 = this.method4488();
      if(var1.field3846 != this.field457 || var1.field3847 != this.field458 || this.field470) {
         this.method4363(-213292424);
         this.field470 = false;
      }

   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-668210151"
   )
   final synchronized void method4374() {
      if(!field449) {
         field449 = true;

         try {
            this.canvas.removeFocusListener(this);
         } catch (Exception var5) {
         }

         try {
            this.vmethod4384();
         } catch (Exception var4) {
         }

         if(this.frame != null) {
            try {
               System.exit(0);
            } catch (Throwable var3) {
            }
         }

         if(class315.taskManager != null) {
            try {
               class315.taskManager.method5822();
            } catch (Exception var2) {
            }
         }

         this.vmethod4390();
      }
   }

   public final synchronized void paint(Graphics var1) {
      if(this == shell && !field449) {
         this.field468 = true;
         if(class318.method6317() - this.field472 > 1000L) {
            Rectangle var2 = var1.getClipBounds();
            if(var2 == null || var2.width >= GrandExchangeOffer.canvasWidth && var2.height >= class258.canvasHeight) {
               this.field471 = true;
               this.onReplaceCanvasNextFrameChanged(-1);
            }
         }

      }
   }

   public final void destroy() {
      if(this == shell && !field449) {
         field448 = class318.method6317();
         class36.method553(5000L);
         this.method4374();
      }
   }

   public void onRun() {
      this.thread = Thread.currentThread();
      this.thread.setName("Client");
   }

   public void onFocusGained(FocusEvent var1) {
      FocusChanged var2 = new FocusChanged();
      var2.setFocused(true);
      ItemContainer.clientInstance.getCallbacks().post(var2);
   }

   public void onPost(Object var1) {
      DrawCallbacks var2 = ItemContainer.clientInstance.getDrawCallbacks();
      if(var2 != null) {
         var2.draw();
      }

   }

   public boolean isClientThread() {
      return this.thread == Thread.currentThread();
   }

   public Canvas getCanvas() {
      return this.canvas;
   }

   public final void copy$setMaxCanvasSize(int var1, int var2, int var3) {
      label16: {
         if(this.field473 == var1) {
            if(var3 == -508854097) {
               return;
            }

            if(var2 == this.field464) {
               break label16;
            }
         }

         this.method4400();
      }

      this.field473 = var1;
      this.field464 = var2;
   }

   public final void copy$resizeCanvas(int var1) {
      Container var2 = this.method4387();
      if(var2 == null) {
         if(var1 != -721353868) {
         }
      } else {
         Bounds var3 = this.method4488();
         this.field457 = Math.max(var3.field3846, this.field461);
         this.field458 = Math.max(var3.field3847, this.field451);
         if(this.field457 <= 0) {
            this.field457 = 1;
         }

         if(this.field458 <= 0) {
            this.field458 = 1;
         }

         GrandExchangeOffer.canvasWidth = Math.min(this.field457, this.field473);
         client.canvasWidthChanged(-1);
         class258.canvasHeight = Math.min(this.field458, this.field464);
         client.canvasHeightChanged(-1);
         this.field459 = (this.field457 - GrandExchangeOffer.canvasWidth) / 2;
         this.field460 = 0;
         this.canvas.setSize(GrandExchangeOffer.canvasWidth, class258.canvasHeight);
         Location.rasterProvider = new MainBufferProvider(GrandExchangeOffer.canvasWidth, class258.canvasHeight, this.canvas);
         if(var2 == this.frame) {
            Insets var4 = this.frame.getInsets();
            this.canvas.setLocation(this.field459 + var4.left, this.field460 + var4.top);
         } else {
            this.canvas.setLocation(this.field459, this.field460);
         }

         this.field468 = true;
         this.vmethod4364();
      }
   }

   public boolean isReplaceCanvasNextFrame() {
      return this.field471;
   }

   public void setReplaceCanvasNextFrame(boolean var1) {
      this.field471 = var1;
   }

   public void setResizeCanvasNextFrame(boolean var1) {
      this.field470 = var1;
   }

   public void setMaxCanvasWidth(int var1) {
      this.field473 = var1;
   }

   public void setMaxCanvasHeight(int var1) {
      this.field464 = var1;
   }

   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1"
   )
   public void onReplaceCanvasNextFrameChanged(int var1) {
      if(ItemContainer.clientInstance != null && ItemContainer.clientInstance.isGpu() && this.isReplaceCanvasNextFrame()) {
         this.setReplaceCanvasNextFrame(false);
         this.setResizeCanvasNextFrame(true);
      }

   }

   private void rl$$init() {
   }

   private void rl$$init1() {
   }

   public void run() {
      this.onRun();

      try {
         if(Signlink.javaVendor != null) {
            String var1 = Signlink.javaVendor.toLowerCase();
            if(var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
               String var2 = Signlink.javaVersion;
               if(var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
                  this.method4413("wrongjava");
                  return;
               }

               if(var2.startsWith("1.6.0_")) {
                  int var3;
                  for(var3 = 6; var3 < var2.length() && class211.method4099(var2.charAt(var3)); ++var3) {
                  }

                  String var4 = var2.substring(6, var3);
                  if(Entity.method1813(var4) && HeadbarType.method2073(var4) < 10) {
                     this.method4413("wrongjava");
                     return;
                  }
               }

               field462 = 5;
            }
         }

         this.setFocusCycleRoot(true);
         this.method4368();
         this.vmethod4381();

         Object var8;
         try {
            var8 = new NanoTimer();
         } catch (Throwable var6) {
            var8 = new MilliTimer();
         }

         class236.timer = (Timer)var8;

         while(0L == field448 || class318.method6317() < field448) {
            field463 = class236.timer.vmethod6053(field477, field462);

            for(int var5 = 0; var5 < field463; ++var5) {
               this.method4393();
            }

            this.method4371();
            this.method4380(this.canvas);
         }
      } catch (Exception var7) {
         VertexNormal.method4110(null, var7, (byte) -118);
         this.method4413("crash");
      }

      this.method4374();
   }

   public final void start() {
      if(this == shell && !field449) {
         field448 = 0L;
      }
   }

   public final void stop() {
      if(this == shell && !field449) {
         field448 = class318.method6317() + 4000L;
      }
   }

   public final void focusGained(FocusEvent var1) {
      this.onFocusGained(var1);
      focused = true;
      this.field468 = true;
   }

   public final void windowClosed(WindowEvent var1) {
   }

   public final void windowActivated(WindowEvent var1) {
   }

   public abstract void init();

   public final void windowDeactivated(WindowEvent var1) {
   }

   public final void windowDeiconified(WindowEvent var1) {
   }

   public final void windowOpened(WindowEvent var1) {
   }

   public final void focusLost(FocusEvent var1) {
      focused = false;
   }

   public final void update(Graphics var1) {
      this.paint(var1);
   }

   public final void windowClosing(WindowEvent var1) {
      this.destroy();
   }

   public final void windowIconified(WindowEvent var1) {
   }

   public Thread getClientThread() {
      return this.thread;
   }

   public boolean isResizeCanvasNextFrame() {
      return this.field470;
   }

   public void post(Object var1) {
      this.method4380(var1);
   }

   public void resizeCanvas() {
      this.method4363(-213292424);
   }

   @ObfuscatedName("as")
   @ObfuscatedSignature(
      signature = "(ILjava/lang/String;ZI)V",
      garbageValue = "616972514"
   )
   protected final void method4385(int var1, String var2, boolean var3) {
      try {
         Graphics var4 = this.canvas.getGraphics();
         if(class54.field87 == null) {
            class54.field87 = new java.awt.Font("Helvetica", 1, 13);
            field446 = this.canvas.getFontMetrics(class54.field87);
         }

         if(var3) {
            var4.setColor(Color.black);
            var4.fillRect(0, 0, GrandExchangeOffer.canvasWidth, class258.canvasHeight);
         }

         Color var5 = new Color(140, 17, 17);

         try {
            if(class129.field280 == null) {
               class129.field280 = this.canvas.createImage(304, 34);
            }

            Graphics var6 = class129.field280.getGraphics();
            var6.setColor(var5);
            var6.drawRect(0, 0, 303, 33);
            var6.fillRect(2, 2, var1 * 3, 30);
            var6.setColor(Color.black);
            var6.drawRect(1, 1, 301, 31);
            var6.fillRect(var1 * 3 + 2, 2, 300 - var1 * 3, 30);
            var6.setFont(class54.field87);
            var6.setColor(Color.white);
            var6.drawString(var2, (304 - field446.stringWidth(var2)) / 2, 22);
            var4.drawImage(class129.field280, GrandExchangeOffer.canvasWidth / 2 - 152, class258.canvasHeight / 2 - 18, null);
         } catch (Exception var9) {
            int var7 = GrandExchangeOffer.canvasWidth / 2 - 152;
            int var8 = class258.canvasHeight / 2 - 18;
            var4.setColor(var5);
            var4.drawRect(var7, var8, 303, 33);
            var4.fillRect(var7 + 2, var8 + 2, var1 * 3, 30);
            var4.setColor(Color.black);
            var4.drawRect(var7 + 1, var8 + 1, 301, 31);
            var4.fillRect(var1 * 3 + var7 + 2, var8 + 2, 300 - var1 * 3, 30);
            var4.setFont(class54.field87);
            var4.setColor(Color.white);
            var4.drawString(var2, var7 + (304 - field446.stringWidth(var2)) / 2, var8 + 22);
         }
      } catch (Exception var10) {
         this.canvas.repaint();
      }

   }

   @ObfuscatedName("ar")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1400307001"
   )
   protected final void method4386() {
      class129.field280 = null;
      class54.field87 = null;
      field446 = null;
   }

   @ObfuscatedName("aa")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "112"
   )
   void method4393() {
      long var1 = class318.method6317();
      long var3 = field456[ContextMenuRow.field1133];
      field456[ContextMenuRow.field1133] = var1;
      ContextMenuRow.field1133 = ContextMenuRow.field1133 + 1 & 31;
      if(0L != var3 && var1 > var3) {
      }

      synchronized(this) {
         class57.field243 = focused;
      }

      this.vmethod4377();
   }

   @ObfuscatedName("az")
   @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "-1157399867"
   )
   protected final boolean method4389() {
      return this.frame != null;
   }

   @ObfuscatedName("h")
   protected final void method4356(int var1, int var2, int var3) {
      if(!ItemContainer.clientInstance.isStretchedEnabled() || !ItemContainer.clientInstance.isResized()) {
         this.copy$setMaxCanvasSize(var1, var2, var3);
      }
   }

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "142936820"
   )
   void method4371() {
      Container var1 = this.method4387();
      long var2 = class318.method6317();
      long var4 = field455[WorldComparator.field35];
      field455[WorldComparator.field35] = var2;
      WorldComparator.field35 = WorldComparator.field35 + 1 & 31;
      if(0L != var4 && var2 > var4) {
         int var6 = (int)(var2 - var4);
         FPS = ((var6 >> 1) + 32000) / var6;
      }

      if(++field469 - 1 > 50) {
         field469 -= 50;
         this.field468 = true;
         this.canvas.setSize(GrandExchangeOffer.canvasWidth, class258.canvasHeight);
         this.canvas.setVisible(true);
         if(var1 == this.frame) {
            Insets var7 = this.frame.getInsets();
            this.canvas.setLocation(var7.left + this.field459, this.field460 + var7.top);
         } else {
            this.canvas.setLocation(this.field459, this.field460);
         }
      }

      if(this.field471) {
         this.method4366();
      }

      this.method4467();
      this.vmethod4460(this.field468);
      if(this.field468) {
         this.method4486();
      }

      this.field468 = false;
   }

   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1828164637"
   )
   protected abstract void vmethod4390();
}
