package net.runelite.standalone;

import java.util.EnumSet;
import net.runelite.api.WorldType;
import net.runelite.api.events.WorldListLoad;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.api.RSWorld;

@ObfuscatedName("bu")
public class World implements RSWorld {
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = 779901565
   )
   static int worldCount;
   @ObfuscatedName("q")
   static int[] field1018;
   @ObfuscatedName("m")
   static int[] field1016;
   @ObfuscatedName("p")
   @ObfuscatedGetter(
      intValue = -997808101
   )
   static int field1011;
   @ObfuscatedName("b")
   @ObfuscatedSignature(
      signature = "Lez;"
   )
   static UrlRequest listFetcher;
   @ObfuscatedName("l")
   String activity;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = -1056458959
   )
   int mask;
   @ObfuscatedName("r")
   @ObfuscatedGetter(
      intValue = -1720648033
   )
   int playerCount;
   @ObfuscatedName("o")
   @ObfuscatedGetter(
      intValue = 914192843
   )
   int location;
   @ObfuscatedName("n")
   @ObfuscatedGetter(
      intValue = -302226347
   )
   int id;
   @ObfuscatedName("t")
   String address;
   @ObfuscatedName("u")
   @ObfuscatedGetter(
      intValue = 1757323849
   )
   int index;

   static {
      worldCount = 0;
      field1011 = 0;
      field1016 = new int[]{1, 1, 1, 1};
      field1018 = new int[]{0, 1, 2, 3};
   }

   World() {
      this.rl$$init();
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "-2112963870"
   )
   boolean method4942() {
      return (33554432 & this.mask) != 0;
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "621822199"
   )
   boolean method4939() {
      return (4 & this.mask) != 0;
   }

   @ObfuscatedName("r")
   @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "-1542602873"
   )
   boolean method4940() {
      return (8 & this.mask) != 0;
   }

   @ObfuscatedName("b")
   @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "585105738"
   )
   boolean method4949() {
      return (1 & this.mask) != 0;
   }

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "-756240687"
   )
   boolean method4971() {
      return (2 & this.mask) != 0;
   }

   @ObfuscatedName("t")
   @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "1791550373"
   )
   boolean method4941() {
      return (536870912 & this.mask) != 0;
   }

   public int getMask() {
      return this.mask;
   }

   public void setMask(int var1) {
      this.mask = var1;
   }

   private void rl$$init() {
   }

   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1"
   )
   public void playerCountChanged(int var1) {
      RSWorld[] var2 = ItemContainer.clientInstance.getWorldList();
      if(var2 != null && var2.length > 0 && this == var2[var2.length - 1]) {
         WorldListLoad var3 = new WorldListLoad(var2);
         ItemContainer.clientInstance.getCallbacks().post(var3);
      }

   }

   public EnumSet getTypes() {
      return WorldType.fromMask(this.getMask());
   }

   public void setTypes(EnumSet var1) {
      this.setMask(WorldType.toMask(var1));
   }

   public void setId(int var1) {
      this.id = var1;
   }

   public int getId() {
      return this.id;
   }

   public void setPlayerCount(int var1) {
      this.playerCount = var1;
   }

   public int getPlayerCount() {
      return this.playerCount;
   }

   public void setAddress(String var1) {
      this.address = var1;
   }

   public String getAddress() {
      return this.address;
   }

   public void setActivity(String var1) {
      this.activity = var1;
   }

   public String getActivity() {
      return this.activity;
   }

   public void setLocation(int var1) {
      this.location = var1;
   }

   public int getLocation() {
      return this.location;
   }

   public void setIndex(int var1) {
      this.index = var1;
   }

   public int getIndex() {
      return this.index;
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "(IIB)I",
      garbageValue = "-11"
   )
   public static int method4975(int var0, int var1) {
      int var2;
      if(var1 > var0) {
         var2 = var0;
         var0 = var1;
         var1 = var2;
      }

      while(var1 != 0) {
         var2 = var0 % var1;
         var0 = var1;
         var1 = var2;
      }

      return var0;
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "(Liz;B)V",
      garbageValue = "0"
   )
   public static void method4938(Js5Index var0) {
      FloorUnderlayDefinition.underlay_ref = var0;
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(II)I",
      garbageValue = "-795213495"
   )
   public static int method4980(int var0) {
      var0 = (var0 & 1431655765) + (var0 >>> 1 & 1431655765);
      var0 = (var0 >>> 2 & 858993459) + (var0 & 858993459);
      var0 = var0 + (var0 >>> 4) & 252645135;
      var0 += var0 >>> 8;
      var0 += var0 >>> 16;
      return var0 & 255;
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      signature = "([BZI)Ljava/lang/Object;",
      garbageValue = "-1781111480"
   )
   public static Object method4978(byte[] var0, boolean var1) {
      if(var0 == null) {
         return null;
      } else {
         if(var0.length > 136 && !AbstractByteBuffer.directBufferUnavailable) {
            try {
               DirectByteBuffer var2 = new DirectByteBuffer();
               var2.vmethod6381(var0);
               return var2;
            } catch (Throwable var3) {
               AbstractByteBuffer.directBufferUnavailable = true;
            }
         }

         return var0;
      }
   }
}
