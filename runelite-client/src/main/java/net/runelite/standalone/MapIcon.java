package net.runelite.standalone;

import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("at")
public abstract class MapIcon {
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = 599188537
   )
   int field296;
   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "Lif;"
   )
   public final CoordGrid field298;
   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "Lif;"
   )
   public final CoordGrid field297;
   @ObfuscatedName("b")
   @ObfuscatedGetter(
      intValue = -2109258973
   )
   int field299;

   @ObfuscatedSignature(
      signature = "(Lif;Lif;)V"
   )
   MapIcon(CoordGrid var1, CoordGrid var2) {
      this.field298 = var1;
      this.field297 = var2;
   }

   @ObfuscatedName("k")
   @ObfuscatedSignature(
      signature = "(III)Z",
      garbageValue = "-2142631117"
   )
   boolean method4077(int var1, int var2) {
      MapLabel var3 = this.vmethod4061();
      return var3 == null?false:(var1 >= this.field296 - var3.field247 / 2 && var1 <= var3.field247 / 2 + this.field296?var2 >= this.field299 && var2 <= var3.field248 + this.field299:false);
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(B)I",
      garbageValue = "105"
   )
   abstract int vmethod4058();

   @ObfuscatedName("o")
   @ObfuscatedSignature(
      signature = "(III)Z",
      garbageValue = "915702491"
   )
   boolean method4063(int var1, int var2) {
      return this.method4065(var1, var2)?true:this.method4077(var1, var2);
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "(B)I",
      garbageValue = "51"
   )
   public abstract int vmethod4060();

   @ObfuscatedName("y")
   @ObfuscatedSignature(
      signature = "(III)Z",
      garbageValue = "-1829858079"
   )
   boolean method4065(int var1, int var2) {
      if(!this.method4064()) {
         return false;
      } else {
         MapElementType var3 = MapLabel.method2858(this.vmethod4060());
         int var4 = this.vmethod4074();
         int var5 = this.vmethod4058();
         switch(var3.horizontalAlignment.field3562) {
         case 0:
            if(var1 < this.field296 - var4 / 2 || var1 > var4 / 2 + this.field296) {
               return false;
            }
            break;
         case 1:
            if(var1 >= this.field296 && var1 < var4 + this.field296) {
               break;
            }

            return false;
         case 2:
            if(var1 <= this.field296 - var4 || var1 > this.field296) {
               return false;
            }
         }

         switch(var3.verticalAlignment.field3305) {
         case 0:
            if(var2 < this.field299 - var5 / 2 || var2 > var5 / 2 + this.field299) {
               return false;
            }
            break;
         case 1:
            if(var2 <= this.field299 - var5 || var2 > this.field299) {
               return false;
            }
            break;
         case 2:
            if(var2 < this.field299 || var2 >= var5 + this.field299) {
               return false;
            }
         }

         return true;
      }
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(I)Lay;",
      garbageValue = "-937210224"
   )
   abstract MapLabel vmethod4061();

   @ObfuscatedName("u")
   @ObfuscatedSignature(
      signature = "(B)Z",
      garbageValue = "125"
   )
   boolean method4064() {
      return this.vmethod4060() >= 0;
   }

   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "-1729576697"
   )
   abstract int vmethod4074();

   @ObfuscatedName("hy")
   @ObfuscatedSignature(
      signature = "(III)I",
      garbageValue = "1679834786"
   )
   static int method4081(int var0, int var1) {
      int var2 = var1 - 334;
      if(var2 < 0) {
         var2 = 0;
      } else if(var2 > 100) {
         var2 = 100;
      }

      int var3 = (client.field902 - client.field901) * var2 / 100 + client.field901;
      return var0 * var3 / 256;
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "69178335"
   )
   public static void method4080() {
      MouseInput var0 = MouseInput.mouse;
      synchronized(MouseInput.mouse) {
         MouseInput.mouseCurrentButton = MouseInput.MouseHandler_currentButton;
         MouseInput.mouseLastX = MouseInput.mouseX;
         MouseInput.mouseLastY = MouseInput.mouseY;
         MouseInput.field492 = MouseInput.field485;
         MouseInput.mouseLastButton = MouseInput.MouseHandler_lastButton;
         MouseInput.mouseLastPressedX = MouseInput.MouseHandler_lastPressedX;
         MouseInput.mouseLastPressedY = MouseInput.MouseHandler_lastPressedY;
         MouseInput.mouseLastPressedTimeMillis = MouseInput.MouseHandler_lastPressedTimeMillis;
         MouseInput.MouseHandler_lastButton = 0;
      }
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      signature = "(Lfo;IIB)Lcz;",
      garbageValue = "-71"
   )
   public static final AbstractSoundSystem method4083(Signlink var0, int var1, int var2) {
      if(var1 >= 0 && var1 < 2) {
         if(var2 < 256) {
            var2 = 256;
         }

         try {
            AbstractSoundSystem var3 = SpotAnimation.field1095.vmethod6142();
            var3.samples = new int[256 * (ContextMenuRow.audioHighMemory?2:1)];
            var3.field1400 = var2;
            var3.vmethod6091();
            var3.offset = (var2 & -1024) + 1024;
            if(var3.offset > 16384) {
               var3.offset = 16384;
            }

            var3.vmethod6071(var3.offset);
            if(AbstractSoundSystem.field1404 > 0 && class179.task == null) {
               class179.task = new SoundTask();
               AbstractSoundSystem.field1386 = Executors.newScheduledThreadPool(1);
               AbstractSoundSystem.field1386.scheduleAtFixedRate(class179.task, 0L, 10L, TimeUnit.MILLISECONDS);
            }

            if(class179.task != null) {
               if(class179.task.systems[var1] != null) {
                  throw new IllegalArgumentException();
               }

               class179.task.systems[var1] = var3;
            }

            return var3;
         } catch (Throwable var4) {
            return new AbstractSoundSystem();
         }
      } else {
         throw new IllegalArgumentException();
      }
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "(I)[Ljb;",
      garbageValue = "-478138224"
   )
   public static Parameters[] method4082() {
      return new Parameters[]{Parameters.field3665, Parameters.field3663, Parameters.field3670, Parameters.field3673, Parameters.field3678, Parameters.field3664, Parameters.field3676, Parameters.field3671, Parameters.field3662, Parameters.field3668, Parameters.field3661, Parameters.field3666, Parameters.field3679, Parameters.field3675, Parameters.field3667, Parameters.field3674, Parameters.field3672, Parameters.field3669, Parameters.field3677};
   }
}
