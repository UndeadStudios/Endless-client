package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.api.RSRunException;
import net.runelite.rs.api.RSVertexNormal;

@ObfuscatedName("dp")
public class VertexNormal implements RSVertexNormal {
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = 384760089
   )
   int magnitude;
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      intValue = -487750023
   )
   int x;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = 409052541
   )
   int y;
   @ObfuscatedName("g")
   @ObfuscatedGetter(
      intValue = -1669185731
   )
   int z;

   VertexNormal() {
   }

   @ObfuscatedSignature(
      signature = "(Ldp;)V"
   )
   VertexNormal(VertexNormal var1) {
      this.x = var1.x;
      this.y = var1.y;
      this.z = var1.z;
      this.magnitude = var1.magnitude;
   }

   @ObfuscatedName("a")
   public static void method4110(String var0, Throwable var1, byte var2) {
      if(var1 != null) {
         Throwable var3 = var1;
         if(var1 instanceof RSRunException) {
            var3 = ((RSRunException)var1).getParent();
         }

         ItemContainer.clientInstance.getLogger().error("Game crash: {}", var0, var3);
         StackTraceElement[] var4 = var3.getStackTrace();
         StackTraceElement[] var5 = var4;
         int var6 = var4.length;

         for(int var7 = 0; var7 < var6; ++var7) {
            StackTraceElement var8 = var5[var7];
            if(var8.getClassName().contains("runelite")) {
               return;
            }
         }
      }

      client.copy$processClientError(var0, var1, var2);
   }

   @ObfuscatedName("gz")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "1745595489"
   )
   static void method4111() {
      if(class69.worldMap != null) {
         class69.worldMap.method2874(ServerProt.level, (class71.localPlayer.x * -1234429701 >> 7) + class53.baseX, (class71.localPlayer.y >> 7) + class312.baseY, false);
         class69.worldMap.method2965();
      }
   }

   @Override
   public int getX() {
      return x;
   }

   @Override
   public int getY() {
      return y;
   }

   @Override
   public int getZ() {
      return z;
   }
}
