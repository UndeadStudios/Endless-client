package net.runelite.standalone;

import java.awt.Component;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kw")
public class FontName {
   @ObfuscatedName("qb")
   @ObfuscatedGetter(
      intValue = 182890269
   )
   static int field3757;
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "Lkw;"
   )
   public static final FontName field3755;
   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "Lkw;"
   )
   public static final FontName field3747;
   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "Lkw;"
   )
   public static final FontName FontName_plain11;
   @ObfuscatedName("he")
   @ObfuscatedGetter(
      intValue = 1857263827
   )
   static int cameraY;
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "Lkw;"
   )
   public static final FontName FontName_plain12;
   @ObfuscatedName("h")
   @ObfuscatedSignature(
      signature = "Lkw;"
   )
   public static final FontName field3745;
   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "Lkw;"
   )
   public static final FontName FontName_bold12;
   @ObfuscatedName("p")
   String field3750;

   static {
      FontName_plain11 = new FontName("p11_full");
      FontName_plain12 = new FontName("p12_full");
      FontName_bold12 = new FontName("b12_full");
      field3747 = new FontName("verdana_11pt_regular");
      field3745 = new FontName("verdana_13pt_regular");
      field3755 = new FontName("verdana_15pt_regular");
   }

   FontName(String var1) {
      this.field3750 = var1;
   }

   @ObfuscatedName("fl")
   @ObfuscatedSignature(
      signature = "(IZZZB)Lin;",
      garbageValue = "26"
   )
   static Js5 method508(int var0, boolean var1, boolean var2, boolean var3) {
      IndexFile var4 = null;
      if(class75.cacheDat != null) {
         var4 = new IndexFile(var0, class75.cacheDat, MouseRecorder.cacheIndex[var0], 1000000);
      }

      return new Js5(var4, WorldMapType3.indexStore255, var0, var1, var2, var3);
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "(Ljava/awt/Component;I)V",
      garbageValue = "1891508884"
   )
   static void method512(Component var0) {
      var0.addMouseListener(MouseInput.mouse);
      var0.addMouseMotionListener(MouseInput.mouse);
      var0.addFocusListener(MouseInput.mouse);
   }

   @ObfuscatedName("a")
   public static String method517(long var0) {
      if(var0 > 0L && var0 < 6582952005840035281L) {
         if(0L == var0 % 37L) {
            return null;
         } else {
            int var2 = 0;

            for(long var3 = var0; var3 != 0L; var3 /= 37L) {
               ++var2;
            }

            StringBuilder var5 = new StringBuilder(var2);

            while(0L != var0) {
               long var6 = var0;
               var0 /= 37L;
               var5.append(class217.field3802[(int)(var6 - var0 * 37L)]);
            }

            return var5.reverse().toString();
         }
      } else {
         return null;
      }
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "(B)[Lkw;",
      garbageValue = "-75"
   )
   public static FontName[] method510() {
      return new FontName[]{FontName_bold12, field3755, field3745, FontName_plain12, field3747, FontName_plain11};
   }

   @ObfuscatedName("fk")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1149660355"
   )
   static final void method515() {
      if(client.field695 > 0) {
         class285.method5866();
      } else {
         client.field773.method1591();
         class124.method1843(40);
         class235.field2434 = client.serverConnection.method38();
         client.serverConnection.method36();
      }
   }

   @ObfuscatedName("fr")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "20"
   )
   static final void method513() {
      if(CombatInfo1.soundSystem1 != null) {
         CombatInfo1.soundSystem1.method1747();
      }

      if(class191.soundSystem0 != null) {
         class191.soundSystem0.method1747();
      }

   }

   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "(III)Lbl;",
      garbageValue = "-898018151"
   )
   static ChatLine method514(int var0, int var1) {
      ChatLineBuffer var2 = (ChatLineBuffer)ChatHistory.chatLineMap.get(Integer.valueOf(var0));
      return var2.method4819(var1);
   }

   @ObfuscatedName("jj")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "1"
   )
   static void method507() {
      for(SubInterface var0 = (SubInterface) client.subInterfaces.method6338(); var0 != null; var0 = (SubInterface) client.subInterfaces.method6339()) {
         int var1 = var0.id;
         if(ChatLine.method5915(var1)) {
            boolean var2 = true;
            ComponentType[] var3 = ComponentType.interfaces[var1];

            int var4;
            for(var4 = 0; var4 < var3.length; ++var4) {
               if(var3[var4] != null) {
                  var2 = var3[var4].isIf3;
                  break;
               }
            }

            if(!var2) {
               var4 = (int)var0.hash;
               ComponentType var5 = ChatHistory.method6246(var4);
               if(var5 != null) {
                  WorldMapRegion.method5554(var5);
               }
            }
         }
      }

   }
}
