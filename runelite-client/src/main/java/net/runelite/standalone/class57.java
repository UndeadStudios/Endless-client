package net.runelite.standalone;

import java.net.URL;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("af")
public final class class57 {
   @ObfuscatedName("ac")
   protected static boolean field243;
   @ObfuscatedName("s")
   final int[] field240;

   class57() {
      this.field240 = new int[4096];
   }

   class57(int[] var1) {
      this.field240 = var1;
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(IIB)I",
      garbageValue = "-50"
   )
   final int method905(int var1, int var2) {
      return this.field240[var1 + var2 * 64];
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "1107437883"
   )
   static boolean method910() {
      try {
         if(World.listFetcher == null) {
            World.listFetcher = class36.urlRequester.method5564(new URL(class312.field31));
         } else if(World.listFetcher.method4256()) {
            byte[] var0 = World.listFetcher.method4257();
            Packet var1 = new Packet(var0);
            var1.readInt();
            World.worldCount = var1.readUnsignedShort();
            class242.worldList = new World[World.worldCount];

            World var3;
            for(int var2 = 0; var2 < World.worldCount; var3.index = var2++) {
               var3 = class242.worldList[var2] = new World();
               var3.id = var1.readUnsignedShort();
               var3.mask = var1.readInt();
               var3.address = var1.readString();
               var3.activity = var1.readString();
               var3.location = var1.readUnsignedByte();
               var3.playerCount = var1.method5089();
               var3.playerCountChanged(-1);
            }

            CoordGrid.method901(class242.worldList, 0, class242.worldList.length - 1, World.field1018, World.field1016);
            World.listFetcher = null;
            return true;
         }
      } catch (Exception var4) {
         var4.printStackTrace();
         World.listFetcher = null;
      }

      return false;
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "(Liz;Liz;I)Z",
      garbageValue = "-1899763683"
   )
   public static boolean method903(Js5Index var0, Js5Index var1) {
      MapElementType.field3341 = var1;
      if(!var0.method4120()) {
         return false;
      } else {
         MapElementType.field3322 = var0.method4112(35);
         MapElementType.mapElementTypes = new MapElementType[MapElementType.field3322];

         for(int var2 = 0; var2 < MapElementType.field3322; ++var2) {
            byte[] var3 = var0.method4115(35, var2, -803299457);
            MapElementType.mapElementTypes[var2] = new MapElementType(var2);
            if(var3 != null) {
               MapElementType.mapElementTypes[var2].method1480(new Packet(var3));
               MapElementType.mapElementTypes[var2].method1482();
            }
         }

         return true;
      }
   }
}
