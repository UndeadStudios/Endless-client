package net.runelite.standalone;

import java.security.SecureRandom;
import net.runelite.api.MessageNode;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.api.RSCacheableNode;
import net.runelite.rs.api.RSChatLineBuffer;

@ObfuscatedName("cr")
public class ChatLineBuffer implements RSChatLineBuffer {
   @ObfuscatedName("r")
   static int[] floorMultiplier;
   @ObfuscatedName("w")
   public static String osNameRaw;
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "[Lbl;"
   )
   ChatLine[] lines;
   @ObfuscatedName("g")
   @ObfuscatedGetter(
      intValue = 1313704483
   )
   int length;

   ChatLineBuffer() {
      this.lines = new ChatLine[100];
      this.rl$$init();
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;B)Lbl;",
      garbageValue = "1"
   )
   ChatLine method4816(int var1, String var2, String var3, String var4) {
      ChatLine var5 = this.lines[99];

      for(int var6 = this.length; var6 > 0; --var6) {
         if(var6 != 100) {
            this.lines[var6] = this.lines[var6 - 1];
         }
      }

      if(var5 == null) {
         var5 = new ChatLine(var1, var2, var4, var3);
      } else {
         var5.method432();
         var5.method1606();
         var5.method5888(var1, var2, var4, var3);
      }

      this.lines[0] = var5;
      if(this.length < 100) {
         ++this.length;
      }

      return var5;
   }

   public MessageNode[] getLines() {
      return this.lines;
   }

   public int getLength() {
      return this.length;
   }

   private void rl$$init() {
   }

   public void setLength(int var1) {
      this.length = var1;
   }

   public void removeMessageNode(MessageNode var1) {
      MessageNode[] var2 = this.getLines();
      int var3 = this.getLength();
      int var4 = -1;

      int var5;
      for(var5 = 0; var5 < var3; ++var5) {
         if(var2[var5] == var1) {
            var4 = var5;
            break;
         }
      }

      if(var4 != -1) {
         for(var5 = var4; var5 < var3 - 1; ++var5) {
            var2[var5] = var2[var5 + 1];
         }

         var2[var3 - 1] = null;
         this.setLength(var3 - 1);
         RSCacheableNode var6 = (RSCacheableNode)var1;
         var6.unlink();
         var6.unlinkDual();
      }
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(II)Lbl;",
      garbageValue = "-1909335531"
   )
   ChatLine method4819(int var1) {
      return var1 >= 0 && var1 < this.length?this.lines[var1]:null;
   }

   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "-644070578"
   )
   int method4818() {
      return this.length;
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "(I)Ljava/security/SecureRandom;",
      garbageValue = "-1981976046"
   )
   static SecureRandom method4824() {
      SecureRandom var0 = new SecureRandom();
      var0.nextInt();
      return var0;
   }
}
