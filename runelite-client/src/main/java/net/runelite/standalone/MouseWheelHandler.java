package net.runelite.standalone;

import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.api.RSMouseWheelHandler;

@ObfuscatedName("al")
public final class MouseWheelHandler implements class224, MouseWheelListener, RSMouseWheelHandler {
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      intValue = -1114257373
   )
   int rotation;

   MouseWheelHandler() {
      this.rotation = 0;
      this.rl$$init();
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "(Ljava/awt/Component;I)V",
      garbageValue = "-1339676129"
   )
   void method938(Component var1) {
      var1.addMouseWheelListener(this);
   }

   private void rl$$init() {
   }

   public synchronized void copy$mouseWheelMoved(MouseWheelEvent var1) {
      this.rotation += var1.getWheelRotation();
   }

   public synchronized void mouseWheelMoved(MouseWheelEvent var1) {
      var1 = ItemContainer.clientInstance.getCallbacks().mouseWheelMoved(var1);
      if(!var1.isConsumed()) {
         this.copy$mouseWheelMoved(var1);
      }

   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(Ljava/awt/Component;I)V",
      garbageValue = "2102150784"
   )
   void method939(Component var1) {
      var1.removeMouseWheelListener(this);
   }

   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "(B)I",
      garbageValue = "-52"
   )
   public synchronized int vmethod4271() {
      int var1 = this.rotation;
      this.rotation = 0;
      return var1;
   }
}
