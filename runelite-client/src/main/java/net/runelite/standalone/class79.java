package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bg")
public class class79 {
   @ObfuscatedName("fn")
   @ObfuscatedSignature(
      signature = "Lfn;"
   )
   static Task field563;

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "(IS)Ljc;",
      garbageValue = "16982"
   )
   public static ObjType method1074(int var0) {
      ObjType var1 = (ObjType)ObjType.items.method635((long)var0);
      if(var1 != null) {
         return var1;
      } else {
         byte[] var2 = class48.item_ref.method4115(10, var0, 1470890922);
         var1 = new ObjType();
         var1.id = var0;
         if(var2 != null) {
            var1.method2215(new Packet(var2));
         }

         var1.method2226();
         if(var1.certTemplate != -1) {
            var1.method2217(method1074(var1.certTemplate), method1074(var1.certLink));
         }

         if(var1.boughtTemplate != -1) {
            var1.method2224(method1074(var1.boughtTemplate), method1074(var1.boughtLink));
         }

         if(var1.placeholderTemplate != -1) {
            var1.method2218(method1074(var1.placeholderTemplate), method1074(var1.placeholderLink));
         }

         if(!ObjType.isMembersWorld && var1.members) {
            var1.name = "Members object";
            var1.stockmarket = false;
            var1.ops = null;
            var1.iops = null;
            var1.shiftClickIndex = -1;
            var1.team = 0;
            if(var1.params != null) {
               boolean var3 = false;

               for(Node var4 = var1.params.method2181(); var4 != null; var4 = var1.params.method2190()) {
                  ParamType var5 = Overlay.method6404((int)var4.hash);
                  if(var5.autoDisable) {
                     var4.method432();
                  } else {
                     var3 = true;
                  }
               }

               if(!var3) {
                  var1.params = null;
               }
            }
         }

         ObjType.items.method628(var1, (long)var0);
         return var1;
      }
   }

   @ObfuscatedName("lk")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "1832000360"
   )
   static void method1075() {
      client.serverConnection.method18(class232.method4535(ClientProt.field2256, client.serverConnection.isaac));
      client.camModeType = 0;
   }
}
