package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.api.RSWidgetNode;

@ObfuscatedName("bk")
public class SubInterface extends Node implements RSWidgetNode {
   @ObfuscatedName("gc")
   @ObfuscatedSignature(
      signature = "[Llv;"
   )
   static IndexedSprite[] mapscene;
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      intValue = -912519809
   )
   int id;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = -1353246179
   )
   int mode;
   @ObfuscatedName("g")
   boolean field566;

   SubInterface() {
      this.field566 = false;
   }

   public int getId() {
      return this.id;
   }

   @ObfuscatedName("gu")
   @ObfuscatedSignature(
      signature = "(Lbq;I)V",
      garbageValue = "-1947807294"
   )
   static final void method2713(PathingEntity var0) {
      if(var0.direction != 0) {
         if(var0.interacting != -1) {
            Object var1 = null;
            if(var0.interacting < 32768) {
               var1 = client.npcs[var0.interacting];
            } else if(var0.interacting >= 32768) {
               var1 = client.players[var0.interacting - 32768];
            }

            if(var1 != null) {
               int var2 = var0.x * -1234429701 - ((PathingEntity)var1).x * -1234429701;
               int var3 = var0.y - ((PathingEntity)var1).y;
               if(var2 != 0 || var3 != 0) {
                  var0.orientation = (int)(Math.atan2((double)var2, (double)var3) * 325.949D) & 2047;
               }
            } else if(var0.field966) {
               var0.interacting = -1;
               var0.interactingChanged(-1);
               var0.field966 = false;
            }
         }

         if(var0.facingCoord != -1 && (var0.queueSize == 0 || var0.field997 > 0)) {
            var0.orientation = var0.facingCoord;
            var0.facingCoord = -1;
         }

         int var4 = var0.orientation - var0.angle & 2047;
         if(var4 == 0 && var0.field966) {
            var0.interacting = -1;
            var0.interactingChanged(-1);
            var0.field966 = false;
         }

         if(var4 != 0) {
            ++var0.field991;
            boolean var6;
            if(var4 > 1024) {
               var0.angle -= var0.direction;
               var6 = true;
               if(var4 < var0.direction || var4 > 2048 - var0.direction) {
                  var0.angle = var0.orientation;
                  var6 = false;
               }

               if(var0.poseAnimation == var0.idlePoseAnimation && (var0.field991 > 25 || var6)) {
                  if(var0.field945 != -1) {
                     var0.poseAnimation = var0.field945;
                  } else {
                     var0.poseAnimation = var0.walkAnim;
                  }
               }
            } else {
               var0.angle += var0.direction;
               var6 = true;
               if(var4 < var0.direction || var4 > 2048 - var0.direction) {
                  var0.angle = var0.orientation;
                  var6 = false;
               }

               if(var0.idlePoseAnimation == var0.poseAnimation && (var0.field991 > 25 || var6)) {
                  if(var0.field946 != -1) {
                     var0.poseAnimation = var0.field946;
                  } else {
                     var0.poseAnimation = var0.walkAnim;
                  }
               }
            }

            var0.angle &= 2047;
         } else {
            var0.field991 = 0;
         }

      }
   }

   @ObfuscatedName("jc")
   @ObfuscatedSignature(
      signature = "(II)Z",
      garbageValue = "843292779"
   )
   static boolean method2712(int var0) {
      for(int var1 = 0; var1 < client.field870; ++var1) {
         if(client.field732[var1] == var0) {
            return true;
         }
      }

      return false;
   }

   @ObfuscatedName("ku")
   @ObfuscatedSignature(
      signature = "(IIII)Lbk;",
      garbageValue = "657209037"
   )
   static final SubInterface method2711(int var0, int var1, int var2) {
      SubInterface var3 = new SubInterface();
      var3.id = var1;
      var3.mode = var2;
      client.subInterfaces.method6344(var3, (long)var0);
      UnitPriceComparator.method2288(var1);
      ComponentType var4 = ChatHistory.method6246(var0);
      WorldMapRegion.method5554(var4);
      if(client.field793 != null) {
         WorldMapRegion.method5554(client.field793);
         client.field793 = null;
      }

      for(int var5 = 0; var5 < client.menuOptionCount; ++var5) {
         int var7 = client.menuTypes[var5];
         boolean var6 = var7 == 57 || var7 == 58 || var7 == 1007 || var7 == 25 || var7 == 30;
         if(var6) {
            if(var5 < client.menuOptionCount - 1) {
               for(int var8 = var5; var8 < client.menuOptionCount - 1; ++var8) {
                  client.menuOptions[var8] = client.menuOptions[var8 + 1];
                  client.menuTargets[var8] = client.menuTargets[var8 + 1];
                  client.menuTypes[var8] = client.menuTypes[var8 + 1];
                  client.menuIdentifiers[var8] = client.menuIdentifiers[var8 + 1];
                  client.menuActionParams0[var8] = client.menuActionParams0[var8 + 1];
                  client.menuActionParams1[var8] = client.menuActionParams1[var8 + 1];
                  client.menuBooleanArray[var8] = client.menuBooleanArray[var8 + 1];
               }
            }

            --var5;
            --client.menuOptionCount;
            client.onMenuOptionsChanged(-1);
         }
      }

      FriendManager.method2414(class302.field3309 / 2 + class181.menuX, TotalQuantityComparator.menuY);
      ScriptState.method1043(ComponentType.interfaces[var0 >> 16], var4, false);
      CombatInfo1.method61(var1, -1150060619);
      if(client.toplevel != -1) {
         class61.method923(client.toplevel, 1);
      }

      return var3;
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(IB)J",
      garbageValue = "-42"
   )
   public static long method2714(int var0) {
      return class47.field1740[var0];
   }
}
