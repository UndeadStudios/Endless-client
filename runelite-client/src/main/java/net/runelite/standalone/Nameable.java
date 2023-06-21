package net.runelite.standalone;

import net.runelite.api.events.NameableNameChanged;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.api.RSName;
import net.runelite.rs.api.RSNameable;

@ObfuscatedName("kn")
public class Nameable implements Comparable, RSNameable {
   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "Lkx;"
   )
   Name prevName;
   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "Lkx;"
   )
   Name name;

   Nameable() {
      this.rl$$init();
   }

   @ObfuscatedName("ae")
   @ObfuscatedSignature(
      signature = "(I)Ljava/lang/String;",
      garbageValue = "1600014077"
   )
   public String method2754() {
      return this.prevName == null?"":this.prevName.method1530();
   }

   @ObfuscatedName("au")
   @ObfuscatedSignature(
      signature = "(Lkn;I)I",
      garbageValue = "-665156315"
   )
   public int vmethod6266(Nameable var1) {
      return this.name.method1533(var1.name);
   }

   @ObfuscatedName("av")
   @ObfuscatedSignature(
      signature = "(Lkx;Lkx;I)V",
      garbageValue = "275778859"
   )
   void method2765(Name var1, Name var2) {
      if(var1 == null) {
         throw new NullPointerException();
      } else {
         this.name = var1;
         this.prevName = var2;
         this.onPrevNameChanged(-1);
      }
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      signature = "(I)Lkx;",
      garbageValue = "1725814046"
   )
   public Name method2752() {
      return this.name;
   }

   public RSName getRsPrevName() {
      return this.prevName;
   }

   public RSName getRsName() {
      return this.name;
   }

   private void rl$$init() {
   }

   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1"
   )
   public void onPrevNameChanged(int var1) {
      NameableNameChanged var2 = new NameableNameChanged(this);
      ItemContainer.clientInstance.getCallbacks().post(var2);
   }

   public int compareTo(Object var1) {
      return this.vmethod6266((Nameable)var1);
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      signature = "(I)Ljava/lang/String;",
      garbageValue = "-182933370"
   )
   public String method2763() {
      return this.name == null?"":this.name.method1530();
   }

   @ObfuscatedName("ik")
   @ObfuscatedSignature(
      signature = "(II)Z",
      garbageValue = "-725468391"
   )
   static final boolean method2777(int var0) {
      if(var0 < 0) {
         return false;
      } else {
         int var1 = client.menuTypes[var0];
         if(var1 >= 2000) {
            var1 -= 2000;
         }

         return var1 == 1007;
      }
   }

   @ObfuscatedName("ih")
   @ObfuscatedSignature(
      signature = "(IIIILjava/lang/String;I)V",
      garbageValue = "-1114536787"
   )
   static void method2776(int var0, int var1, int var2, int var3, String var4) {
      ComponentType var5 = UnitPriceComparator.method2289(var1, var2);
      if(var5 != null) {
         if(var5.onOpListener != null) {
            ScriptEvent var6 = new ScriptEvent();
            var6.source = var5;
            var6.op = var0;
            var6.opbase = var4;
            var6.params = var5.onOpListener;
            class192.method3810(var6);
         }

         boolean var11 = true;
         if(var5.clientcode > 0) {
            var11 = class285.method5884(var5);
         }

         if(var11) {
            int var8 = WorldComparator.method86(var5);
            int var9 = var0 - 1;
            boolean var7 = (var8 >> var9 + 1 & 1) != 0;
            if(var7) {
               TcpConnectionMessage var10;
               if(var0 == 1) {
                  var10 = class232.method4535(ClientProt.field2262, client.serverConnection.isaac);
                  var10.packetBuffer.writeInt(var1);
                  var10.packetBuffer.writeShort(var2);
                  var10.packetBuffer.writeShort(var3);
                  client.serverConnection.method18(var10);
               }

               if(var0 == 2) {
                  var10 = class232.method4535(ClientProt.field2311, client.serverConnection.isaac);
                  var10.packetBuffer.writeInt(var1);
                  var10.packetBuffer.writeShort(var2);
                  var10.packetBuffer.writeShort(var3);
                  client.serverConnection.method18(var10);
               }

               if(var0 == 3) {
                  var10 = class232.method4535(ClientProt.field2267, client.serverConnection.isaac);
                  var10.packetBuffer.writeInt(var1);
                  var10.packetBuffer.writeShort(var2);
                  var10.packetBuffer.writeShort(var3);
                  client.serverConnection.method18(var10);
               }

               if(var0 == 4) {
                  var10 = class232.method4535(ClientProt.field2238, client.serverConnection.isaac);
                  var10.packetBuffer.writeInt(var1);
                  var10.packetBuffer.writeShort(var2);
                  var10.packetBuffer.writeShort(var3);
                  client.serverConnection.method18(var10);
               }

               if(var0 == 5) {
                  var10 = class232.method4535(ClientProt.field2259, client.serverConnection.isaac);
                  var10.packetBuffer.writeInt(var1);
                  var10.packetBuffer.writeShort(var2);
                  var10.packetBuffer.writeShort(var3);
                  client.serverConnection.method18(var10);
               }

               if(var0 == 6) {
                  var10 = class232.method4535(ClientProt.field2285, client.serverConnection.isaac);
                  var10.packetBuffer.writeInt(var1);
                  var10.packetBuffer.writeShort(var2);
                  var10.packetBuffer.writeShort(var3);
                  client.serverConnection.method18(var10);
               }

               if(var0 == 7) {
                  var10 = class232.method4535(ClientProt.field2304, client.serverConnection.isaac);
                  var10.packetBuffer.writeInt(var1);
                  var10.packetBuffer.writeShort(var2);
                  var10.packetBuffer.writeShort(var3);
                  client.serverConnection.method18(var10);
               }

               if(var0 == 8) {
                  var10 = class232.method4535(ClientProt.field2233, client.serverConnection.isaac);
                  var10.packetBuffer.writeInt(var1);
                  var10.packetBuffer.writeShort(var2);
                  var10.packetBuffer.writeShort(var3);
                  client.serverConnection.method18(var10);
               }

               if(var0 == 9) {
                  var10 = class232.method4535(ClientProt.field2303, client.serverConnection.isaac);
                  var10.packetBuffer.writeInt(var1);
                  var10.packetBuffer.writeShort(var2);
                  var10.packetBuffer.writeShort(var3);
                  client.serverConnection.method18(var10);
               }

               if(var0 == 10) {
                  var10 = class232.method4535(ClientProt.field2316, client.serverConnection.isaac);
                  var10.packetBuffer.writeInt(var1);
                  var10.packetBuffer.writeShort(var2);
                  var10.packetBuffer.writeShort(var3);
                  client.serverConnection.method18(var10);
               }

            }
         }
      }
   }
}
