package net.runelite.standalone;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.Date;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.api.RSMouseInput;

@ObfuscatedName("bo")
public class MouseInput implements MouseListener, MouseMotionListener, FocusListener, RSMouseInput {
   @ObfuscatedName("nv")
   @ObfuscatedGetter(
      intValue = 429076041
   )
   static int field499;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = -645379741
   )
   public static volatile int mouseIdleTicks;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = -1553476921
   )
   static volatile int MouseHandler_lastPressedX;
   @ObfuscatedName("v")
   @ObfuscatedGetter(
      intValue = 1293941901
   )
   public static int mouseLastPressedY;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = -212410231
   )
   public static int mouseLastX;
   @ObfuscatedName("r")
   @ObfuscatedGetter(
      longValue = 3959986213311566259L
   )
   public static long field492;
   @ObfuscatedName("af")
   static int[] field498;
   @ObfuscatedName("k")
   @ObfuscatedGetter(
      intValue = 630458785
   )
   public static int mouseLastPressedX;
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = -1970742959
   )
   static volatile int mouseY;
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = 99718613
   )
   public static int mouseLastY;
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      intValue = 528107
   )
   static volatile int mouseX;
   @ObfuscatedName("p")
   @ObfuscatedGetter(
      intValue = 2102267483
   )
   static volatile int MouseHandler_currentButton;
   @ObfuscatedName("b")
   @ObfuscatedGetter(
      longValue = -5676223914397701093L
   )
   static volatile long field485;
   @ObfuscatedName("o")
   @ObfuscatedGetter(
      intValue = -227692653
   )
   static volatile int MouseHandler_lastPressedY;
   @ObfuscatedName("n")
   @ObfuscatedGetter(
      intValue = -315641075
   )
   public static int mouseCurrentButton;
   @ObfuscatedName("t")
   @ObfuscatedGetter(
      intValue = -1600629007
   )
   static volatile int MouseHandler_lastButton;
   @ObfuscatedName("y")
   @ObfuscatedGetter(
      intValue = -1875822011
   )
   public static int mouseLastButton;
   @ObfuscatedName("d")
   @ObfuscatedGetter(
      longValue = -9001158457678328183L
   )
   public static long mouseLastPressedTimeMillis;
   @ObfuscatedName("h")
   @ObfuscatedSignature(
      signature = "Lbo;"
   )
   static MouseInput mouse;
   @ObfuscatedName("u")
   @ObfuscatedGetter(
      longValue = -5319770607590789123L
   )
   static volatile long MouseHandler_lastPressedTimeMillis;
   public int isInEvent;

   static {
      mouse = new MouseInput();
      mouseIdleTicks = 0;
      MouseHandler_currentButton = 0;
      mouseX = -1;
      mouseY = -1;
      field485 = -1L;
      mouseCurrentButton = 0;
      mouseLastX = 0;
      mouseLastY = 0;
      field492 = 0L;
      MouseHandler_lastButton = 0;
      MouseHandler_lastPressedX = 0;
      MouseHandler_lastPressedY = 0;
      MouseHandler_lastPressedTimeMillis = 0L;
      mouseLastButton = 0;
      mouseLastPressedX = 0;
      mouseLastPressedY = 0;
      mouseLastPressedTimeMillis = 0L;
   }

   MouseInput() {
      this.rl$$init();
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(Ljava/awt/event/MouseEvent;I)I",
      garbageValue = "578646374"
   )
   final int method1900(MouseEvent var1) {
      int var2 = var1.getButton();
      return !var1.isAltDown() && var2 != 2?(!var1.isMetaDown() && var2 != 3?1:2):4;
   }

   public final synchronized void mouseMoved(MouseEvent var1) {
      if(this.isInEvent == 0) {
         var1 = ItemContainer.clientInstance.getCallbacks().mouseMoved(var1);
      }

      if(!var1.isConsumed()) {
         ++this.isInEvent;

         try {
            this.copy$mouseMoved(var1);
         } finally {
            --this.isInEvent;
         }
      }

   }

   private void rl$$init() {
   }

   public final void copy$mouseClicked(MouseEvent var1) {
      if(var1.isPopupTrigger()) {
         var1.consume();
      }

   }

   public final synchronized void copy$mousePressed(MouseEvent var1) {
      if(mouse != null) {
         mouseIdleTicks = 0;
         MouseHandler_lastPressedX = var1.getX();
         MouseHandler_lastPressedY = var1.getY();
         MouseHandler_lastPressedTimeMillis = class318.method6317();
         MouseHandler_lastButton = this.method1900(var1);
         if(MouseHandler_lastButton != 0) {
            MouseHandler_currentButton = MouseHandler_lastButton;
         }
      }

      if(var1.isPopupTrigger()) {
         var1.consume();
      }

   }

   public final synchronized void copy$mouseReleased(MouseEvent var1) {
      if(mouse != null) {
         mouseIdleTicks = 0;
         MouseHandler_currentButton = 0;
      }

      if(var1.isPopupTrigger()) {
         var1.consume();
      }

   }

   public final synchronized void copy$mouseEntered(MouseEvent var1) {
      this.mouseMoved(var1);
   }

   public final synchronized void copy$mouseExited(MouseEvent var1) {
      if(mouse != null) {
         mouseIdleTicks = 0;
         mouseX = -1;
         mouseY = -1;
         field485 = var1.getWhen();
      }

   }

   public final synchronized void copy$mouseDragged(MouseEvent var1) {
      this.mouseMoved(var1);
   }

   public final synchronized void copy$mouseMoved(MouseEvent var1) {
      if(mouse != null) {
         mouseIdleTicks = 0;
         mouseX = var1.getX();
         mouseY = var1.getY();
         field485 = var1.getWhen();
      }

   }

   public final synchronized void mousePressed(MouseEvent var1) {
      if(this.isInEvent == 0) {
         var1 = ItemContainer.clientInstance.getCallbacks().mousePressed(var1);
      }

      if(!var1.isConsumed()) {
         ++this.isInEvent;

         try {
            this.copy$mousePressed(var1);
         } finally {
            --this.isInEvent;
         }
      }

   }

   public final synchronized void mouseReleased(MouseEvent var1) {
      if(this.isInEvent == 0) {
         var1 = ItemContainer.clientInstance.getCallbacks().mouseReleased(var1);
      }

      if(!var1.isConsumed()) {
         ++this.isInEvent;

         try {
            this.copy$mouseReleased(var1);
         } finally {
            --this.isInEvent;
         }
      }

   }

   public final synchronized void mouseEntered(MouseEvent var1) {
      if(this.isInEvent == 0) {
         var1 = ItemContainer.clientInstance.getCallbacks().mouseEntered(var1);
      }

      if(!var1.isConsumed()) {
         ++this.isInEvent;

         try {
            this.copy$mouseEntered(var1);
         } finally {
            --this.isInEvent;
         }
      }

   }

   public final synchronized void mouseExited(MouseEvent var1) {
      if(this.isInEvent == 0) {
         var1 = ItemContainer.clientInstance.getCallbacks().mouseExited(var1);
      }

      if(!var1.isConsumed()) {
         ++this.isInEvent;

         try {
            this.copy$mouseExited(var1);
         } finally {
            --this.isInEvent;
         }
      }

   }

   public final synchronized void mouseDragged(MouseEvent var1) {
      if(this.isInEvent == 0) {
         var1 = ItemContainer.clientInstance.getCallbacks().mouseDragged(var1);
      }

      if(!var1.isConsumed()) {
         ++this.isInEvent;

         try {
            this.copy$mouseDragged(var1);
         } finally {
            --this.isInEvent;
         }
      }

   }

   public final void focusGained(FocusEvent var1) {
   }

   public final synchronized void focusLost(FocusEvent var1) {
      if(mouse != null) {
         MouseHandler_currentButton = 0;
      }

   }

   public final void mouseClicked(MouseEvent var1) {
      var1 = ItemContainer.clientInstance.getCallbacks().mouseClicked(var1);
      if(!var1.isConsumed()) {
         this.copy$mouseClicked(var1);
      }

   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(Lge;B)V",
      garbageValue = "20"
   )
   static final void method1911(Bit var0) {
      for(int var1 = 0; var1 < PlayerList.extendedInfoPlayerCount; ++var1) {
         int var2 = PlayerList.extendedInfoPlayerIndexes[var1];
         PlayerEntity var3 = client.players[var2];
         int var4 = var0.readUnsignedByte();
         if((var4 & 8) != 0) {
            var4 += var0.readUnsignedByte() << 8;
         }

         Sequence.method5035(var0, var2, var3, var4);
      }

   }

   @ObfuscatedName("il")
   @ObfuscatedSignature(
      signature = "(IIIII)V",
      garbageValue = "-829996718"
   )
   static final void method1914(int var0, int var1, int var2, int var3) {
      for(int var4 = 0; var4 < client.interfaceCount; ++var4) {
         if(client.widgetBoundsWidth[var4] + client.widgetPositionX[var4] > var0 && client.widgetPositionX[var4] < var0 + var2 && client.widgetBoundsHeight[var4] + client.widgetPositionY[var4] > var1 && client.widgetPositionY[var4] < var3 + var1) {
            client.field795[var4] = true;
         }
      }

   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "(IB)Ljf;",
      garbageValue = "64"
   )
   public static Enum method1932(int var0) {
      Enum var1 = (Enum)Enum.field3424.method635((long)var0);
      if(var1 != null) {
         return var1;
      } else {
         byte[] var2 = Enum.EnumDefinition_indexCache.method4115(8, var0, 1505280615);
         var1 = new Enum();
         if(var2 != null) {
            var1.method4347(new Packet(var2));
         }

         Enum.field3424.method628(var1, (long)var0);
         return var1;
      }
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "(B)[Lix;",
      garbageValue = "-42"
   )
   static ModeWhere[] method1931() {
      return new ModeWhere[]{ModeWhere.BUILDLIVE, ModeWhere.WIP, ModeWhere.LIVE, ModeWhere.RC};
   }

   @ObfuscatedName("av")
   @ObfuscatedSignature(
      signature = "(ILcs;ZI)I",
      garbageValue = "1297498020"
   )
   static int method1930(int var0, class314 var1, boolean var2) {
      String var3;
      int var4;
      if(var0 == 4100) {
         var3 = class281.scriptStringStack[--class295.scriptStringStackSize];
         var4 = class281.intStack[--class281.intStackSize];
         class281.scriptStringStack[++class295.scriptStringStackSize - 1] = var3 + var4;
         return 1;
      } else {
         String var9;
         if(var0 == 4101) {
            class295.scriptStringStackSize -= 2;
            var3 = class281.scriptStringStack[class295.scriptStringStackSize];
            var9 = class281.scriptStringStack[class295.scriptStringStackSize + 1];
            class281.scriptStringStack[++class295.scriptStringStackSize - 1] = var3 + var9;
            return 1;
         } else if(var0 == 4102) {
            var3 = class281.scriptStringStack[--class295.scriptStringStackSize];
            var4 = class281.intStack[--class281.intStackSize];
            class281.scriptStringStack[++class295.scriptStringStackSize - 1] = var3 + Packet.method5116(var4, true);
            return 1;
         } else if(var0 == 4103) {
            var3 = class281.scriptStringStack[--class295.scriptStringStackSize];
            class281.scriptStringStack[++class295.scriptStringStackSize - 1] = var3.toLowerCase();
            return 1;
         } else {
            int var6;
            int var10;
            if(var0 == 4104) {
               var10 = class281.intStack[--class281.intStackSize];
               long var11 = 86400000L * (11745L + (long)var10);
               class281.LOCAL_CALENDAR.setTime(new Date(var11));
               var6 = class281.LOCAL_CALENDAR.get(5);
               int var16 = class281.LOCAL_CALENDAR.get(2);
               int var8 = class281.LOCAL_CALENDAR.get(1);
               class281.scriptStringStack[++class295.scriptStringStackSize - 1] = var6 + "-" + class281.field1070[var16] + "-" + var8;
               return 1;
            } else if(var0 != 4105) {
               if(var0 == 4106) {
                  var10 = class281.intStack[--class281.intStackSize];
                  class281.scriptStringStack[++class295.scriptStringStackSize - 1] = Integer.toString(var10);
                  return 1;
               } else if(var0 == 4107) {
                  class295.scriptStringStackSize -= 2;
                  class281.intStack[++class281.intStackSize - 1] = WorldMapDataGroup.method960(class21.method380(class281.scriptStringStack[class295.scriptStringStackSize], class281.scriptStringStack[class295.scriptStringStackSize + 1], client.languageId));
                  return 1;
               } else {
                  int var5;
                  byte[] var13;
                  Font var14;
                  if(var0 == 4108) {
                     var3 = class281.scriptStringStack[--class295.scriptStringStackSize];
                     class281.intStackSize -= 2;
                     var4 = class281.intStack[class281.intStackSize];
                     var5 = class281.intStack[class281.intStackSize + 1];
                     var13 = KeyFocusListener.fontmetrics.method4115(var5, 0, -1775082836);
                     var14 = new Font(var13);
                     class281.intStack[++class281.intStackSize - 1] = var14.method6163(var3, var4);
                     return 1;
                  } else if(var0 == 4109) {
                     var3 = class281.scriptStringStack[--class295.scriptStringStackSize];
                     class281.intStackSize -= 2;
                     var4 = class281.intStack[class281.intStackSize];
                     var5 = class281.intStack[class281.intStackSize + 1];
                     var13 = KeyFocusListener.fontmetrics.method4115(var5, 0, 1075361030);
                     var14 = new Font(var13);
                     class281.intStack[++class281.intStackSize - 1] = var14.method6211(var3, var4);
                     return 1;
                  } else if(var0 == 4110) {
                     class295.scriptStringStackSize -= 2;
                     var3 = class281.scriptStringStack[class295.scriptStringStackSize];
                     var9 = class281.scriptStringStack[class295.scriptStringStackSize + 1];
                     if(class281.intStack[--class281.intStackSize] == 1) {
                        class281.scriptStringStack[++class295.scriptStringStackSize - 1] = var3;
                     } else {
                        class281.scriptStringStack[++class295.scriptStringStackSize - 1] = var9;
                     }

                     return 1;
                  } else if(var0 == 4111) {
                     var3 = class281.scriptStringStack[--class295.scriptStringStackSize];
                     class281.scriptStringStack[++class295.scriptStringStackSize - 1] = FontTypeFace.method6234(var3);
                     return 1;
                  } else if(var0 == 4112) {
                     var3 = class281.scriptStringStack[--class295.scriptStringStackSize];
                     var4 = class281.intStack[--class281.intStackSize];
                     class281.scriptStringStack[++class295.scriptStringStackSize - 1] = var3 + (char)var4;
                     return 1;
                  } else if(var0 == 4113) {
                     var10 = class281.intStack[--class281.intStackSize];
                     class281.intStack[++class281.intStackSize - 1] = class64.method956((char)var10)?1:0;
                     return 1;
                  } else if(var0 == 4114) {
                     var10 = class281.intStack[--class281.intStackSize];
                     class281.intStack[++class281.intStackSize - 1] = FileOnDisk.method5066((char)var10)?1:0;
                     return 1;
                  } else if(var0 == 4115) {
                     var10 = class281.intStack[--class281.intStackSize];
                     class281.intStack[++class281.intStackSize - 1] = HitmarkType.method4057((char)var10)?1:0;
                     return 1;
                  } else if(var0 == 4116) {
                     var10 = class281.intStack[--class281.intStackSize];
                     class281.intStack[++class281.intStackSize - 1] = class211.method4099((char)var10)?1:0;
                     return 1;
                  } else if(var0 == 4117) {
                     var3 = class281.scriptStringStack[--class295.scriptStringStackSize];
                     if(var3 != null) {
                        class281.intStack[++class281.intStackSize - 1] = var3.length();
                     } else {
                        class281.intStack[++class281.intStackSize - 1] = 0;
                     }

                     return 1;
                  } else if(var0 == 4118) {
                     var3 = class281.scriptStringStack[--class295.scriptStringStackSize];
                     class281.intStackSize -= 2;
                     var4 = class281.intStack[class281.intStackSize];
                     var5 = class281.intStack[class281.intStackSize + 1];
                     class281.scriptStringStack[++class295.scriptStringStackSize - 1] = var3.substring(var4, var5);
                     return 1;
                  } else if(var0 == 4119) {
                     var3 = class281.scriptStringStack[--class295.scriptStringStackSize];
                     StringBuilder var17 = new StringBuilder(var3.length());
                     boolean var15 = false;

                     for(var6 = 0; var6 < var3.length(); ++var6) {
                        char var7 = var3.charAt(var6);
                        if(var7 == '<') {
                           var15 = true;
                        } else if(var7 == '>') {
                           var15 = false;
                        } else if(!var15) {
                           var17.append(var7);
                        }
                     }

                     class281.scriptStringStack[++class295.scriptStringStackSize - 1] = var17.toString();
                     return 1;
                  } else if(var0 == 4120) {
                     var3 = class281.scriptStringStack[--class295.scriptStringStackSize];
                     var4 = class281.intStack[--class281.intStackSize];
                     class281.intStack[++class281.intStackSize - 1] = var3.indexOf(var4);
                     return 1;
                  } else if(var0 == 4121) {
                     class295.scriptStringStackSize -= 2;
                     var3 = class281.scriptStringStack[class295.scriptStringStackSize];
                     var9 = class281.scriptStringStack[class295.scriptStringStackSize + 1];
                     var5 = class281.intStack[--class281.intStackSize];
                     class281.intStack[++class281.intStackSize - 1] = var3.indexOf(var9, var5);
                     return 1;
                  } else if(var0 == 4122) {
                     var3 = class281.scriptStringStack[--class295.scriptStringStackSize];
                     class281.scriptStringStack[++class295.scriptStringStackSize - 1] = var3.toUpperCase();
                     return 1;
                  } else if(var0 == 4123) {
                     var3 = class281.scriptStringStack[--class295.scriptStringStackSize];
                     class281.intStack[++class281.intStackSize - 1] = Integer.parseInt(var3);
                     return 1;
                  } else {
                     return 2;
                  }
               }
            } else {
               class295.scriptStringStackSize -= 2;
               var3 = class281.scriptStringStack[class295.scriptStringStackSize];
               var9 = class281.scriptStringStack[class295.scriptStringStackSize + 1];
               if(class71.localPlayer.composition != null && class71.localPlayer.composition.isFemale) {
                  class281.scriptStringStack[++class295.scriptStringStackSize - 1] = var9;
               } else {
                  class281.scriptStringStack[++class295.scriptStringStackSize - 1] = var3;
               }

               return 1;
            }
         }
      }
   }
}
