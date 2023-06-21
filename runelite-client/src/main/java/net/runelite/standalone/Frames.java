package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.api.RSFrame;
import net.runelite.rs.api.RSFrames;

@ObfuscatedName("ei")
public class Frames extends CacheableNode implements RSFrames {
   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "Liz;"
   )
   public static Js5Index skin_ref;
   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "[Ldm;"
   )
   Frame[] skeletons;

   @ObfuscatedSignature(
      signature = "(Liz;Liz;IZ)V",
      garbageValue = "0"
   )
   public Frames(Js5Index var1, Js5Index var2, int var3, boolean var4) {
      Deque var5 = new Deque();
      int var6 = var1.method4112(var3);
      this.skeletons = new Frame[var6];
      int[] var7 = var1.method4126(var3);

      for(int var8 = 0; var8 < var7.length; ++var8) {
         byte[] var9 = var1.method4115(var3, var7[var8], 984553520);
         FrameMap var10 = null;
         int var11 = (var9[0] & 255) << 8 | var9[1] & 255;

         for(FrameMap var12 = (FrameMap)var5.method3930(); var12 != null; var12 = (FrameMap)var5.method3924()) {
            if(var11 == var12.id) {
               var10 = var12;
               break;
            }
         }

         if(var10 == null) {
            byte[] var13 = var2.method4123(var11, 0);
            var10 = new FrameMap(var11, var13);
            var5.method3906(var10);
         }

         this.skeletons[var7[var8]] = new Frame(var9, var10);
      }

   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "(IB)Z",
      garbageValue = "49"
   )
   public boolean method6060(int var1) {
      return this.skeletons[var1].showing;
   }

   public RSFrame[] getFrames() {
      return this.skeletons;
   }

   @ObfuscatedName("jd")
   @ObfuscatedSignature(
      signature = "([Lia;IIIZI)V",
      garbageValue = "-2059684266"
   )
   static void method6063(ComponentType[] var0, int var1, int var2, int var3, boolean var4) {
      for(int var5 = 0; var5 < var0.length; ++var5) {
         ComponentType var6 = var0[var5];
         if(var6 != null && var6.layer == var1) {
            KeyFocusListener.method5936(var6, var2, var3, var4);
            class285.method5883(var6, var2, var3);
            if(var6.scrollX > var6.scrollWidth - var6.width) {
               var6.scrollX = var6.scrollWidth - var6.width;
            }

            if(var6.scrollX < 0) {
               var6.scrollX = 0;
            }

            if(var6.scrollY > var6.scrollHeight - var6.height) {
               var6.scrollY = var6.scrollHeight - var6.height;
            }

            if(var6.scrollY < 0) {
               var6.scrollY = 0;
            }

            if(var6.type == 0) {
               ScriptState.method1043(var0, var6, var4);
            }
         }
      }

   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "(II)I",
      garbageValue = "1569769951"
   )
   static int method6064(int var0) {
      ChatLine var1 = (ChatLine)ChatHistory.messages.method2178((long)var0);
      return var1 == null?-1:(var1.next == ChatHistory.field1261.sentinel?-1:((ChatLine)var1.next).id);
   }
}
