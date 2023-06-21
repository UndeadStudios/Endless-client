package net.runelite.standalone;

import net.runelite.api.MenuAction;
import net.runelite.api.events.MenuOptionClicked;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("aq")
public class class24 implements WorldMapSectionBase {
   @ObfuscatedName("u")
   @ObfuscatedSignature(
      signature = "Lai;"
   )
   static MapIconReference scriptMapIconReference;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = -1161060141
   )
   int field370;
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = 2062936797
   )
   int field379;
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = -1010655039
   )
   int field380;
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      intValue = -348215523
   )
   int field374;
   @ObfuscatedName("p")
   @ObfuscatedGetter(
      intValue = 1285948983
   )
   int field373;
   @ObfuscatedName("b")
   @ObfuscatedGetter(
      intValue = 1773785027
   )
   int field372;
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      intValue = 2081917621
   )
   int field367;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = 970753025
   )
   int field368;
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      intValue = 1321512583
   )
   int field371;
   @ObfuscatedName("g")
   @ObfuscatedGetter(
      intValue = 1730483659
   )
   int field369;

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(Lgx;B)V",
      garbageValue = "46"
   )
   public void vmethod4912(Packet var1) {
      this.field367 = var1.readUnsignedByte();
      this.field368 = var1.readUnsignedByte();
      this.field369 = var1.readUnsignedShort();
      this.field373 = var1.readUnsignedByte();
      this.field380 = var1.readUnsignedShort();
      this.field374 = var1.readUnsignedByte();
      this.field371 = var1.readUnsignedShort();
      this.field379 = var1.readUnsignedByte();
      this.field370 = var1.readUnsignedShort();
      this.field372 = var1.readUnsignedByte();
      this.method443();
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(IIIB)[I",
      garbageValue = "103"
   )
   public int[] vmethod4911(int var1, int var2, int var3) {
      if(!this.vmethod4930(var1, var2, var3)) {
         return null;
      } else {
         int[] var4 = new int[]{this.field371 * 64 - this.field369 * 64 + var2 + (this.field379 * 8 - this.field373 * 8), var3 + (this.field370 * 64 - this.field380 * 64) + (this.field372 * 8 - this.field374 * 8)};
         return var4;
      }
   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1960424399"
   )
   void method443() {
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "(Lag;B)V",
      garbageValue = "-123"
   )
   public void vmethod4925(WorldMapData var1) {
      if(var1.minX > this.field371) {
         var1.minX = this.field371;
      }

      if(var1.field232 < this.field371) {
         var1.field232 = this.field371;
      }

      if(var1.minY > this.field370) {
         var1.minY = this.field370;
      }

      if(var1.field236 < this.field370) {
         var1.field236 = this.field370;
      }

   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(IIII)Z",
      garbageValue = "-12219513"
   )
   public boolean vmethod4930(int var1, int var2, int var3) {
      return var1 >= this.field367 && var1 < this.field368 + this.field367?var2 >= (this.field369 << 6) + (this.field373 << 3) && var2 <= (this.field369 << 6) + (this.field373 << 3) + 7 && var3 >= (this.field380 << 6) + (this.field374 << 3) && var3 <= (this.field380 << 6) + (this.field374 << 3) + 7:false;
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      signature = "(III)Lif;",
      garbageValue = "-957800253"
   )
   public CoordGrid vmethod4935(int var1, int var2) {
      if(!this.vmethod4910(var1, var2)) {
         return null;
      } else {
         int var3 = this.field369 * 64 - this.field371 * 64 + (this.field373 * 8 - this.field379 * 8) + var1;
         int var4 = this.field380 * 64 - this.field370 * 64 + var2 + (this.field374 * 8 - this.field372 * 8);
         return new CoordGrid(this.field367, var3, var4);
      }
   }

   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "(III)Z",
      garbageValue = "1385272861"
   )
   public boolean vmethod4910(int var1, int var2) {
      return var1 >= (this.field371 << 6) + (this.field379 << 3) && var1 <= (this.field371 << 6) + (this.field379 << 3) + 7 && var2 >= (this.field370 << 6) + (this.field372 << 3) && var2 <= (this.field370 << 6) + (this.field372 << 3) + 7;
   }

   @ObfuscatedName("f")
   public static boolean method465(long var0) {
      return (int)(var0 >>> 16 & 1L) == 1;
   }

   @ObfuscatedName("iu")
   static final void method464(int var0, int var1, int var2, int var3, String var4, String var5, int var6, int var7, int var8) {
      if(var2 >= 2000) {
         var2 -= 2000;
      }

      MenuOptionClicked var9 = new MenuOptionClicked();
      var9.setActionParam(var0);
      var9.setMenuOption(var4);
      var9.setMenuTarget(var5);
      var9.setMenuAction(MenuAction.of(var2));
      var9.setId(var3);
      var9.setWidgetId(var1);
      ItemContainer.clientInstance.getCallbacks().post(var9);
      if(!var9.isConsumed()) {
         client.copy$menuAction(var0, var1, var2, var3, var4, var5, var6, var7, var8);
      }
   }
}
