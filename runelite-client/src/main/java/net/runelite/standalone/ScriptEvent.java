package net.runelite.standalone;

import net.runelite.api.widgets.Widget;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.api.RSScriptEvent;

@ObfuscatedName("br")
public class ScriptEvent extends Node implements RSScriptEvent {
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = 1496955721
   )
   int op;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = -599757907
   )
   int field581;
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = -2039703453
   )
   int typedKeyChar;
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = -1419270535
   )
   int mouseX;
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      intValue = -96271991
   )
   int typedKeyCode;
   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "Lia;"
   )
   ComponentType target;
   @ObfuscatedName("b")
   String opbase;
   @ObfuscatedName("a")
   Object[] params;
   @ObfuscatedName("n")
   @ObfuscatedGetter(
      intValue = -1169064191
   )
   int field582;
   @ObfuscatedName("s")
   boolean field573;
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      intValue = -988996033
   )
   int mouseY;
   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "Lia;"
   )
   ComponentType source;

   public ScriptEvent() {
      this.field581 = 76;
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "([Ljava/lang/Object;I)V",
      garbageValue = "760578548"
   )
   public void method1146(Object[] var1) {
      this.params = var1;
   }

   public void setArguments(Object[] var1) {
      this.params = var1;
   }

   public Object[] getArguments() {
      return this.params;
   }

   public Widget getSource() {
      return this.source;
   }

   public int getOp() {
      return this.op;
   }

   public String getOpbase() {
      return this.opbase;
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(IB)V",
      garbageValue = "15"
   )
   public void method1140(int var1) {
      this.field581 = var1;
   }

   @ObfuscatedName("kv")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;ZI)V",
      garbageValue = "1305519110"
   )
   static void method1139(String var0, boolean var1) {
      var0 = var0.toLowerCase();
      short[] var2 = new short[16];
      int var3 = 0;

      for(int var4 = 0; var4 < ObjType.field3508; ++var4) {
         ObjType var5 = class79.method1074(var4);
         if((!var1 || var5.stockmarket) && var5.certTemplate == -1 && var5.name.toLowerCase().indexOf(var0) != -1) {
            if(var3 >= 250) {
               Isaac.field2467 = -1;
               OwnWorldComparator.field640 = null;
               return;
            }

            if(var3 >= var2.length) {
               short[] var6 = new short[var2.length * 2];

               for(int var7 = 0; var7 < var3; ++var7) {
                  var6[var7] = var2[var7];
               }

               var2 = var6;
            }

            var2[var3++] = (short)var4;
         }
      }

      OwnWorldComparator.field640 = var2;
      class318.field114 = 0;
      Isaac.field2467 = var3;
      String[] var8 = new String[Isaac.field2467];

      for(int var9 = 0; var9 < Isaac.field2467; ++var9) {
         var8[var9] = class79.method1074(var2[var9]).name;
      }

      short[] var10 = OwnWorldComparator.field640;
      ChatHistory.method6264(var8, var10, 0, var8.length - 1);
   }

   @ObfuscatedName("gm")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-189012971"
   )
   static void method1145() {
      TcpConnectionMessage var0 = class232.method4535(ClientProt.field2313, client.serverConnection.isaac);
      var0.packetBuffer.writeByte(class31.method520());
      var0.packetBuffer.writeShort(GrandExchangeOffer.canvasWidth);
      var0.packetBuffer.writeShort(class258.canvasHeight);
      client.serverConnection.method18(var0);
   }
}
