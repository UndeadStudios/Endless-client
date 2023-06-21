package net.runelite.standalone;

import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.util.Date;
import java.util.Iterator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("s")
final class class285 implements class143 {
   @ObfuscatedName("jo")
   @ObfuscatedSignature(
      signature = "Lia;"
   )
   static ComponentType field1;
   @ObfuscatedName("gt")
   @ObfuscatedSignature(
      signature = "[Lld;"
   )
   static SpritePixels[] mapDots;

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/Object;Lgx;B)V",
      garbageValue = "7"
   )
   public void vmethod6420(Object var1, Packet var2) {
      this.method5872((Integer)var1, var2);
   }

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/Integer;Lgx;B)V",
      garbageValue = "100"
   )
   void method5872(Integer var1, Packet var2) {
      var2.writeInt(var1.intValue());
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(Lgx;B)Ljava/lang/Object;",
      garbageValue = "4"
   )
   public Object vmethod6422(Packet var1) {
      return Integer.valueOf(var1.readInt());
   }

   @ObfuscatedName("kq")
   @ObfuscatedSignature(
      signature = "(Lia;I)Z",
      garbageValue = "-1017775700"
   )
   static final boolean method5884(ComponentType var0) {
      int var1 = var0.clientcode;
      if(var1 == 205) {
         client.field695 = 250;
         return true;
      } else {
         int var2;
         int var3;
         if(var1 >= 300 && var1 <= 313) {
            var2 = (var1 - 300) / 2;
            var3 = var1 & 1;
            client.field918.method813(var2, var3 == 1);
         }

         if(var1 >= 314 && var1 <= 323) {
            var2 = (var1 - 314) / 2;
            var3 = var1 & 1;
            client.field918.method840(var2, var3 == 1);
         }

         if(var1 == 324) {
            client.field918.method815(false);
         }

         if(var1 == 325) {
            client.field918.method815(true);
         }

         if(var1 == 326) {
            TcpConnectionMessage var4 = class232.method4535(ClientProt.field2231, client.serverConnection.isaac);
            client.field918.method816(var4.packetBuffer);
            client.serverConnection.method18(var4);
            return true;
         } else {
            return false;
         }
      }
   }

   @ObfuscatedName("jh")
   @ObfuscatedSignature(
      signature = "(Lia;III)V",
      garbageValue = "-978691265"
   )
   static void method5883(ComponentType var0, int var1, int var2) {
      if(var0.posXmode == 0) {
         var0.x = var0.posX;
      } else if(var0.posXmode == 1) {
         var0.x = var0.posX + (var1 - var0.width) / 2;
      } else if(var0.posXmode == 2) {
         var0.x = var1 - var0.width - var0.posX;
      } else if(var0.posXmode == 3) {
         var0.x = var0.posX * var1 >> 14;
      } else if(var0.posXmode == 4) {
         var0.x = (var1 - var0.width) / 2 + (var0.posX * var1 >> 14);
      } else {
         var0.x = var1 - var0.width - (var0.posX * var1 >> 14);
      }

      if(var0.posYmode == 0) {
         var0.y = var0.posY;
         var0.onPositionChanged(-1);
      } else if(var0.posYmode == 1) {
         var0.y = (var2 - var0.height) / 2 + var0.posY;
         var0.onPositionChanged(-1);
      } else if(var0.posYmode == 2) {
         var0.y = var2 - var0.height - var0.posY;
         var0.onPositionChanged(-1);
      } else if(var0.posYmode == 3) {
         var0.y = var2 * var0.posY >> 14;
         var0.onPositionChanged(-1);
      } else if(var0.posYmode == 4) {
         var0.y = (var2 - var0.height) / 2 + (var2 * var0.posY >> 14);
         var0.onPositionChanged(-1);
      } else {
         var0.y = var2 - var0.height - (var2 * var0.posY >> 14);
         var0.onPositionChanged(-1);
      }

   }

   @ObfuscatedName("fx")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "-45"
   )
   static final void method5866() {
      client.serverConnection.method20();
      Overlay.overlays.method629();
      FloorUnderlayDefinition.underlays.method629();
      IDKType.identKits.method629();
      LocType.objects.method629();
      LocType.field3455.method629();
      LocType.cachedModels.method629();
      LocType.field3457.method629();
      MapIconReference.method2083();
      ParamType.method623();
      Sequence.sequences.method629();
      Sequence.skeletons.method629();
      WorldMapRegion.method5555();
      Varbit.varbits.method629();
      class313.method6293();
      HitmarkType.hitmarkTypeCache.method629();
      HitmarkType.field3432.method629();
      HitmarkType.field3433.method629();
      FileRequest.method1170();
      StructType.structTypeCache.method629();
      WorldMapData.method1715();
      MapElementType.areaSpriteCache.method629();
      PlayerComposition.field2662.method629();
      class205.method4004();
      ((TextureProvider)Graphics3D.textureLoader).method1148();
      class314.field1269.method629();
      class181.anims.method4130();
      class87.bases.method4130();
      class129.interfacesArchive.method4130();
      class142.synths.method4130();
      class142.maps.method4130();
      class75.music.method4130();
      WorldMapData.models.method4130();
      ModeGame.sprites.method4130();
      class93.textures.method4130();
      class44.binary.method4130();
      WorldMapType1.jingles.method4130();
      class27.clientscripts.method4130();
      class312.sceneManager.method3622();

      for(int var0 = 0; var0 < 4; ++var0) {
         client.collisionMaps[var0].method3599();
      }

      System.gc();
      Entity.method1812(2);
      client.field680 = -1;
      client.field884 = false;

      for(class61 var1 = (class61)class61.field1061.method3930(); var1 != null; var1 = (class61)class61.field1061.method3924()) {
         if(var1.field1058 != null) {
            TotalQuantityComparator.field60.method3527(var1.field1058);
            var1.field1058 = null;
         }

         if(var1.field1050 != null) {
            TotalQuantityComparator.field60.method3527(var1.field1050);
            var1.field1050 = null;
         }
      }

      class61.field1061.method3936();
      class124.method1843(10);
   }

   @ObfuscatedName("a")
   public static String method5886(long var0) {
      class192.GMT_CALENDAR.setTime(new Date(var0));
      int var2 = class192.GMT_CALENDAR.get(7);
      int var3 = class192.GMT_CALENDAR.get(5);
      int var4 = class192.GMT_CALENDAR.get(2);
      int var5 = class192.GMT_CALENDAR.get(1);
      int var6 = class192.GMT_CALENDAR.get(11);
      int var7 = class192.GMT_CALENDAR.get(12);
      int var8 = class192.GMT_CALENDAR.get(13);
      return class192.DAYS_ABBREVIATED[var2 - 1] + ", " + var3 / 10 + var3 % 10 + "-" + class192.MONTHS_ABBREVIATED[0][var4] + "-" + var5 + " " + var6 / 10 + var6 % 10 + ":" + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + " GMT";
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "756871814"
   )
   protected static int method5882() {
      int var0 = 0;
      if(class235.field2426 == null || !class235.field2426.isValid()) {
         try {
            Iterator var1 = ManagementFactory.getGarbageCollectorMXBeans().iterator();

            while(var1.hasNext()) {
               GarbageCollectorMXBean var2 = (GarbageCollectorMXBean)var1.next();
               if(var2.isValid()) {
                  class235.field2426 = var2;
                  GameEngine.garbageCollectorLastCheckTimeMs = -1L;
                  GameEngine.garbageCollectorLastCollectionTime = -1L;
               }
            }
         } catch (Throwable var11) {
            ;
         }
      }

      if(class235.field2426 != null) {
         long var9 = class318.method6317();
         long var3 = class235.field2426.getCollectionTime();
         if(GameEngine.garbageCollectorLastCollectionTime != -1L) {
            long var5 = var3 - GameEngine.garbageCollectorLastCollectionTime;
            long var7 = var9 - GameEngine.garbageCollectorLastCheckTimeMs;
            if(0L != var7) {
               var0 = (int)(100L * var5 / var7);
            }
         }

         GameEngine.garbageCollectorLastCollectionTime = var3;
         GameEngine.garbageCollectorLastCheckTimeMs = var9;
      }

      return var0;
   }
}
