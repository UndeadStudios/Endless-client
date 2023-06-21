package net.runelite.standalone;

import java.awt.Component;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gw")
public class class36 {
   @ObfuscatedName("fl")
   @ObfuscatedSignature(
      signature = "Lex;"
   )
   static UrlRequester urlRequester;
   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "Liz;"
   )
   static Js5Index NpcDefinition_indexCache;

   @ObfuscatedName("a")
   public static final void method553(long var0) {
      if(var0 > 0L) {
         if(0L == var0 % 10L) {
            long var2 = var0 - 1L;

            try {
               Thread.sleep(var2);
            } catch (InterruptedException var8) {
               ;
            }

            try {
               Thread.sleep(1L);
            } catch (InterruptedException var7) {
               ;
            }
         } else {
            try {
               Thread.sleep(var0);
            } catch (InterruptedException var6) {
               ;
            }
         }

      }
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "(I)[Lfh;",
      garbageValue = "-1651997320"
   )
   public static ZoneProt[] method556() {
      return new ZoneProt[]{ZoneProt.field2339, ZoneProt.field2337, ZoneProt.field2340, ZoneProt.field2335, ZoneProt.field2332, ZoneProt.field2344, ZoneProt.field2338, ZoneProt.field2333, ZoneProt.field2334, ZoneProt.field2341};
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(Ljava/awt/Component;B)V",
      garbageValue = "-74"
   )
   static void method555(Component var0) {
      var0.removeMouseListener(MouseInput.mouse);
      var0.removeMouseMotionListener(MouseInput.mouse);
      var0.removeFocusListener(MouseInput.mouse);
      MouseInput.MouseHandler_currentButton = 0;
   }
}
