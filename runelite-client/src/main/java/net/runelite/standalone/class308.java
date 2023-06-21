package net.runelite.standalone;

import java.security.SecureRandom;
import java.util.concurrent.Callable;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bi")
public class class308 implements Callable {
   @ObfuscatedName("fh")
   @ObfuscatedGetter(
      intValue = 2108672263
   )
   static int field534;
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = 1399707023
   )
   public static int field536;

   public Object call() {
      SecureRandom var2 = new SecureRandom();
      var2.nextInt();
      return var2;
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "(ILcs;ZI)I",
      garbageValue = "-1073407294"
   )
   static int method6153(int var0, class314 var1, boolean var2) {
      ComponentType var3;
      if(var0 >= 2000) {
         var0 -= 1000;
         var3 = ChatHistory.method6246(class281.intStack[--class281.intStackSize]);
      } else {
         var3 = var2?ClientOptions.field1035:class290.field1119;
      }

      String var4 = class281.scriptStringStack[--class295.scriptStringStackSize];
      int[] var5 = null;
      if(var4.length() > 0 && var4.charAt(var4.length() - 1) == 'Y') {
         int var6 = class281.intStack[--class281.intStackSize];
         if(var6 > 0) {
            for(var5 = new int[var6]; var6-- > 0; var5[var6] = class281.intStack[--class281.intStackSize]) {
               ;
            }
         }

         var4 = var4.substring(0, var4.length() - 1);
      }

      Object[] var8 = new Object[var4.length() + 1];

      int var7;
      for(var7 = var8.length - 1; var7 >= 1; --var7) {
         if(var4.charAt(var7 - 1) == 's') {
            var8[var7] = class281.scriptStringStack[--class295.scriptStringStackSize];
         } else {
            var8[var7] = new Integer(class281.intStack[--class281.intStackSize]);
         }
      }

      var7 = class281.intStack[--class281.intStackSize];
      if(var7 != -1) {
         var8[0] = new Integer(var7);
      } else {
         var8 = null;
      }

      if(var0 == 1400) {
         var3.onClickListener = var8;
      } else if(var0 == 1401) {
         var3.onHoldListener = var8;
      } else if(var0 == 1402) {
         var3.onReleaseListener = var8;
      } else if(var0 == 1403) {
         var3.onMouseOverListener = var8;
      } else if(var0 == 1404) {
         var3.onMouseLeaveListener = var8;
      } else if(var0 == 1405) {
         var3.onDragListener = var8;
      } else if(var0 == 1406) {
         var3.onTargetLeaveListener = var8;
      } else if(var0 == 1407) {
         var3.onVarTransmitListener = var8;
         var3.varTransmitTriggers = var5;
      } else if(var0 == 1408) {
         var3.onTimerListener = var8;
      } else if(var0 == 1409) {
         var3.onOpListener = var8;
      } else if(var0 == 1410) {
         var3.onDragCompleteListener = var8;
      } else if(var0 == 1411) {
         var3.onClickRepeatListener = var8;
      } else if(var0 == 1412) {
         var3.onMouseRepeatListener = var8;
      } else if(var0 == 1414) {
         var3.onInvTransmitListener = var8;
         var3.invTransmitTriggers = var5;
      } else if(var0 == 1415) {
         var3.onStatTransmitListener = var8;
         var3.statTransmitTriggers = var5;
      } else if(var0 == 1416) {
         var3.onTargetEnterListener = var8;
      } else if(var0 == 1417) {
         var3.onScrollWheelListener = var8;
      } else if(var0 == 1418) {
         var3.onChatTransmitListener = var8;
      } else if(var0 == 1419) {
         var3.onKeyListener = var8;
      } else if(var0 == 1420) {
         var3.onFriendTransmitListener = var8;
      } else if(var0 == 1421) {
         var3.onClanTransmitListener = var8;
      } else if(var0 == 1422) {
         var3.onMiscTransmitListener = var8;
      } else if(var0 == 1423) {
         var3.onDialogAbortListener = var8;
      } else if(var0 == 1424) {
         var3.onSubChangeListener = var8;
      } else if(var0 == 1425) {
         var3.onStockTransmitListener = var8;
      } else if(var0 == 1426) {
         var3.onCamFinishedListener = var8;
      } else {
         if(var0 != 1427) {
            return 2;
         }

         var3.onResizeListener = var8;
      }

      var3.hasHook = true;
      return 1;
   }

   @ObfuscatedName("gd")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-2128676579"
   )
   static final void method6155() {
      for(ProjectileAnimation var0 = (ProjectileAnimation) client.projectiles.method3930(); var0 != null; var0 = (ProjectileAnimation) client.projectiles.method3924()) {
         if(var0.floor == ServerProt.level && client.gameCycle <= var0.endCycle) {
            if(client.gameCycle >= var0.startMovementCycle) {
               if(var0.interacting > 0) {
                  NPCEntity var1 = client.npcs[var0.interacting - 1];
                  if(var1 != null && var1.x * -1234429701 >= 0 && var1.x * -1234429701 < 13312 && var1.y >= 0 && var1.y < 13312) {
                     var0.method4012(var1.x * -1234429701, var1.y, TcpConnectionMessage.method5618(var1.x * -1234429701, var1.y, var0.floor) - var0.endHeight, client.gameCycle);
                  }
               }

               if(var0.interacting < 0) {
                  int var2 = -var0.interacting - 1;
                  PlayerEntity var3;
                  if(var2 == client.localPlayerIndex) {
                     var3 = class71.localPlayer;
                  } else {
                     var3 = client.players[var2];
                  }

                  if(var3 != null && var3.x * -1234429701 >= 0 && var3.x * -1234429701 < 13312 && var3.y >= 0 && var3.y < 13312) {
                     var0.method4012(var3.x * -1234429701, var3.y, TcpConnectionMessage.method5618(var3.x * -1234429701, var3.y, var0.floor) - var0.endHeight, client.gameCycle);
                  }
               }

               var0.method4015(client.field710);
               class312.sceneManager.method3754(ServerProt.level, (int)var0.x, (int)var0.y, (int)var0.z, 60, var0, var0.rotationX, -1L, false);
            }
         } else {
            var0.method432();
         }
      }

   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(II)Ljava/lang/String;",
      garbageValue = "974633709"
   )
   static String method6152(int var0) {
      return "<col=" + Integer.toHexString(var0) + ">";
   }
}
