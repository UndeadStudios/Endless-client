package net.runelite.standalone;

import java.util.Iterator;
import java.util.LinkedList;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.api.RSWorldMapData;

@ObfuscatedName("ag")
public class WorldMapData implements RSWorldMapData {
   @ObfuscatedName("dy")
   @ObfuscatedSignature(
      signature = "Lin;"
   )
   static Js5 models;
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "Lif;"
   )
   CoordGrid field231;
   @ObfuscatedName("e")
   LinkedList field227;
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = -1053186251
   )
   int minY;
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = -449130723
   )
   int field230;
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      intValue = -340079057
   )
   int field232;
   @ObfuscatedName("p")
   @ObfuscatedGetter(
      intValue = 1515198533
   )
   int minX;
   @ObfuscatedName("b")
   @ObfuscatedGetter(
      intValue = -1758029463
   )
   int field236;
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      intValue = 83737119
   )
   int fileId;
   @ObfuscatedName("n")
   boolean field233;
   @ObfuscatedName("s")
   String identifier;
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      intValue = 2090188445
   )
   int initialMapSurfaceZoom;
   @ObfuscatedName("g")
   String name;

   public WorldMapData() {
      this.fileId = -1;
      this.field230 = -1;
      this.initialMapSurfaceZoom = -1;
      this.field231 = null;
      this.minX = Integer.MAX_VALUE;
      this.field232 = 0;
      this.minY = Integer.MAX_VALUE;
      this.field236 = 0;
      this.field233 = false;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(III)Lif;",
      garbageValue = "-435462727"
   )
   public CoordGrid method1697(int var1, int var2) {
      Iterator var3 = this.field227.iterator();

      WorldMapSectionBase var4;
      do {
         if(!var3.hasNext()) {
            return null;
         }

         var4 = (WorldMapSectionBase)var3.next();
      } while(!var4.vmethod4910(var1, var2));

      return var4.vmethod4935(var1, var2);
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "-2116560388"
   )
   public int method1658() {
      return this.field232;
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "-1266989614"
   )
   public int method1654() {
      return this.field231.y;
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "(B)I",
      garbageValue = "19"
   )
   int method1655() {
      return this.field230;
   }

   @ObfuscatedName("r")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "-488360324"
   )
   public int method1656() {
      return this.initialMapSurfaceZoom;
   }

   @ObfuscatedName("k")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "-2099156559"
   )
   public int method1662() {
      return this.field231.z;
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "-975596447"
   )
   public boolean method1680() {
      return this.field233;
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(IIS)Z",
      garbageValue = "-5986"
   )
   public boolean method1705(int var1, int var2) {
      int var3 = var1 / 64;
      int var4 = var2 / 64;
      if(var3 >= this.minX && var3 <= this.field232) {
         if(var4 >= this.minY && var4 <= this.field236) {
            Iterator var5 = this.field227.iterator();

            WorldMapSectionBase var6;
            do {
               if(!var5.hasNext()) {
                  return false;
               }

               var6 = (WorldMapSectionBase)var5.next();
            } while(!var6.vmethod4910(var1, var2));

            return true;
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(B)I",
      garbageValue = "-71"
   )
   public int method1682() {
      return this.fileId;
   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1011260827"
   )
   void method1650() {
      Iterator var1 = this.field227.iterator();

      while(var1.hasNext()) {
         WorldMapSectionBase var2 = (WorldMapSectionBase)var1.next();
         var2.vmethod4925(this);
      }

   }

   @ObfuscatedName("b")
   @ObfuscatedSignature(
      signature = "(B)Ljava/lang/String;",
      garbageValue = "3"
   )
   public String method1653() {
      return this.identifier;
   }

   @ObfuscatedName("o")
   @ObfuscatedSignature(
      signature = "(B)I",
      garbageValue = "1"
   )
   public int method1659() {
      return this.minY;
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "(Lgx;IB)V",
      garbageValue = "-85"
   )
   public void method1698(Packet var1, int var2) {
      this.fileId = var2;
      this.identifier = var1.readString();
      this.name = var1.readString();
      this.field231 = new CoordGrid(var1.readInt());
      this.field230 = var1.readInt();
      var1.readUnsignedByte();
      this.field233 = var1.readUnsignedByte() == 1;
      this.initialMapSurfaceZoom = var1.readUnsignedByte();
      int var3 = var1.readUnsignedByte();
      this.field227 = new LinkedList();

      for(int var4 = 0; var4 < var3; ++var4) {
         this.field227.add(this.method1645(var1));
      }

      this.method1650();
   }

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      signature = "(B)Ljava/lang/String;",
      garbageValue = "69"
   )
   public String method1706() {
      return this.name;
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      signature = "(I)Lif;",
      garbageValue = "1842014084"
   )
   public CoordGrid method1660() {
      return new CoordGrid(this.field231);
   }

   @ObfuscatedName("t")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "1525215100"
   )
   public int method1689() {
      return this.minX;
   }

   public boolean surfaceContainsPosition(int var1, int var2) {
      return this.method1705(var1, var2);
   }

   @ObfuscatedName("y")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "-2054459313"
   )
   public int method1661() {
      return this.field231.x;
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(Lgx;I)Lau;",
      garbageValue = "85183514"
   )
   WorldMapSectionBase method1645(Packet var1) {
      int var2 = var1.readUnsignedByte();
      class248[] var3 = new class248[]{class248.field158, class248.field157, class248.field161, class248.field159};
      class248 var4 = (class248)PlayerList.method4757(var3, var2);
      Object var5 = null;
      switch(var4.worldMapType) {
      case 0:
         var5 = new class24();
         break;
      case 1:
         var5 = new WorldMapType3();
         break;
      case 2:
         var5 = new WorldMapType1();
         break;
      case 3:
         var5 = new WorldMapType2();
         break;
      default:
         throw new IllegalStateException("");
      }

      ((WorldMapSectionBase)var5).vmethod4912(var1);
      return (WorldMapSectionBase)var5;
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      signature = "(IIII)[I",
      garbageValue = "-199162200"
   )
   public int[] method1648(int var1, int var2, int var3) {
      Iterator var4 = this.field227.iterator();

      WorldMapSectionBase var5;
      do {
         if(!var4.hasNext()) {
            return null;
         }

         var5 = (WorldMapSectionBase)var4.next();
      } while(!var5.vmethod4930(var1, var2, var3));

      return var5.vmethod4911(var1, var2, var3);
   }

   @ObfuscatedName("u")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "557418938"
   )
   public int method1694() {
      return this.field236;
   }

   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "(IIII)Z",
      garbageValue = "-620504072"
   )
   public boolean method1663(int var1, int var2, int var3) {
      Iterator var4 = this.field227.iterator();

      WorldMapSectionBase var5;
      do {
         if(!var4.hasNext()) {
            return false;
         }

         var5 = (WorldMapSectionBase)var4.next();
      } while(!var5.vmethod4930(var1, var2, var3));

      return true;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "293029613"
   )
   public static void method1715() {
      ParamType.paramTypeCache.method629();
   }

   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      signature = "(ILcs;ZB)I",
      garbageValue = "4"
   )
   static int method1716(int var0, class314 var1, boolean var2) {
      if(var0 == 5630) {
         client.field695 = 250;
         return 1;
      } else {
         return 2;
      }
   }
}
