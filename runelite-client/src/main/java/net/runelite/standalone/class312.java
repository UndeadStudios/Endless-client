package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("h")
final class class312 implements class143 {
   @ObfuscatedName("sq")
   @ObfuscatedSignature(
      signature = "Lbt;"
   )
   static ClientOptions options;
   @ObfuscatedName("qu")
   @ObfuscatedGetter(
      intValue = 1933594241
   )
   static int field25;
   @ObfuscatedName("fs")
   @ObfuscatedGetter(
      intValue = 10887811
   )
   static int baseY;
   @ObfuscatedName("lu")
   @ObfuscatedSignature(
      signature = "Lca;"
   )
   static ContextMenuRow topContextMenuRow;
   @ObfuscatedName("bk")
   static String field31;
   @ObfuscatedName("go")
   @ObfuscatedSignature(
      signature = "Len;"
   )
   static SceneManager sceneManager;

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/Object;Lgx;B)V",
      garbageValue = "7"
   )
   public void vmethod6420(Object var1, Packet var2) {
      this.method6275((String)var1, var2);
   }

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;Lgx;I)V",
      garbageValue = "368926898"
   )
   void method6275(String var1, Packet var2) {
      var2.writeString(var1);
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(Lgx;B)Ljava/lang/Object;",
      garbageValue = "4"
   )
   public Object vmethod6422(Packet var1) {
      return var1.readString();
   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "(Lbu;Lbu;IZI)I",
      garbageValue = "-1748952325"
   )
   static int method6288(World var0, World var1, int var2, boolean var3) {
      if(var2 == 1) {
         int var4 = var0.playerCount;
         int var5 = var1.playerCount;
         if(!var3) {
            if(var4 == -1) {
               var4 = 2001;
            }

            if(var5 == -1) {
               var5 = 2001;
            }
         }

         return var4 - var5;
      } else {
         return var2 == 2?var0.location - var1.location:(var2 == 3?(var0.activity.equals("-")?(var1.activity.equals("-")?0:(var3?-1:1)):(var1.activity.equals("-")?(var3?1:-1):var0.activity.compareTo(var1.activity))):(var2 == 4?(var0.method4940()?(var1.method4940()?0:1):(var1.method4940()?-1:0)):(var2 == 5?(var0.method4971()?(var1.method4971()?0:1):(var1.method4971()?-1:0)):(var2 == 6?(var0.method4939()?(var1.method4939()?0:1):(var1.method4939()?-1:0)):(var2 == 7?(var0.method4949()?(var1.method4949()?0:1):(var1.method4949()?-1:0)):var0.id - var1.id)))));
      }
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V",
      garbageValue = "512495857"
   )
   static void method6287(int var0, String var1, String var2, String var3) {
      ChatLineBuffer var4 = (ChatLineBuffer)ChatHistory.chatLineMap.get(Integer.valueOf(var0));
      if(var4 == null) {
         var4 = new ChatLineBuffer();
         ChatHistory.chatLineMap.put(Integer.valueOf(var0), var4);
      }

      ChatLine var5 = var4.method4816(var0, var1, var2, var3);
      ChatHistory.messages.method2186(var5, (long)var5.id);
      ChatHistory.field1261.method4672(var5);
      client.chatCycle = client.cycleCntr;
      client.onAddChatMessage(var0, var1, var2, var3);
   }
}
