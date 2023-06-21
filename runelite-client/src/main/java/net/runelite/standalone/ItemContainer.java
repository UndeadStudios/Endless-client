package net.runelite.standalone;

import net.runelite.api.events.ItemContainerChanged;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.api.RSItem;
import net.runelite.rs.api.RSItemContainer;

@ObfuscatedName("bv")
public class ItemContainer extends Node implements RSItemContainer {
   @ObfuscatedName("ak")
   @ObfuscatedSignature(
      signature = "Lclient;"
   )
   public static client clientInstance;
   @ObfuscatedName("gd")
   @ObfuscatedSignature(
      signature = "[Lld;"
   )
   static SpritePixels[] headIconsPrayer;
   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "Lht;"
   )
   static HashTable itemContainers;
   @ObfuscatedName("ad")
   @ObfuscatedSignature(
      signature = "Llh;"
   )
   static Bounds field551;
   @ObfuscatedName("ao")
   static String field553;
   public int rl$lastCycle;
   @ObfuscatedName("s")
   int[] itemIds;
   @ObfuscatedName("g")
   int[] stackSizes;

   static {
      itemContainers = new HashTable(32);
   }

   ItemContainer() {
      this.itemIds = new int[]{-1};
      this.stackSizes = new int[]{0};
      this.stackSizesChanged(-1);
      this.rl$$init();
   }

   public int[] getItemIds() {
      return this.itemIds;
   }

   public int[] getStackSizes() {
      return this.stackSizes;
   }

   public void stackSizesChanged(int var1) {
      int var2 = clientInstance.getGameCycle();
      if(var2 != this.rl$lastCycle) {
         this.rl$lastCycle = var2;
         ItemContainerChanged var3 = new ItemContainerChanged(this);
         clientInstance.getCallbacks().postDeferred(var3);
      }
   }

   private void rl$$init() {
   }

   public net.runelite.api.Item[] getItems() {
      int[] var1 = this.getItemIds();
      int[] var2 = this.getStackSizes();
      net.runelite.api.Item[] var3 = new net.runelite.api.Item[var1.length];

      for(int var4 = 0; var4 < var1.length; ++var4) {
         RSItem var5 = clientInstance.createItem();
         var5.setId(var1[var4]);
         var5.setQuantity(var2[var4]);
         var3[var4] = var5;
      }

      return var3;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "-85"
   )
   static void method3962() {
      ChatHistory.chatLineMap.clear();
      ChatHistory.messages.method2180();
      ChatHistory.field1261.method4679();
      ChatHistory.field1262 = 0;
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "1118589205"
   )
   static void method3963() {
      class266.field1977 = new int[2000];
      int var0 = 0;
      int var1 = 240;

      int var3;
      for(byte var2 = 12; var0 < 16; var1 -= var2) {
         var3 = GrandExchangeOffer.method1725((double)((float)var1 / 360.0F), 0.9998999834060669D, (double)(0.075F + 0.425F * (float)var0 / 16.0F));
         class266.field1977[var0] = var3;
         ++var0;
      }

      var1 = 48;

      for(int var5 = var1 / 6; var0 < class266.field1977.length; var1 -= var5) {
         var3 = var0 * 2;

         for(int var4 = GrandExchangeOffer.method1725((double)((float)var1 / 360.0F), 0.9998999834060669D, 0.5D); var0 < var3 && var0 < class266.field1977.length; ++var0) {
            class266.field1977[var0] = var4;
         }
      }

   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "(Liz;Liz;Liz;Liz;I)V",
      garbageValue = "1597297308"
   )
   public static void method3965(Js5Index var0, Js5Index var1, Js5Index var2, Js5Index var3) {
      class234.componentIndex = var0;
      LoginProt.field2329 = var1;
      ComponentType.field2682 = var2;
      class192.field2478 = var3;
      ComponentType.interfaces = new ComponentType[class234.componentIndex.method4127()][];
      ComponentType.validInterfaces = new boolean[class234.componentIndex.method4127()];
   }

   @ObfuscatedName("is")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;Ljava/lang/String;IIIIZI)V",
      garbageValue = "1505601881"
   )
   static final void method3950(String var0, String var1, int var2, int var3, int var4, int var5, boolean var6) {
      if(!client.isMenuOpen) {
         if(client.menuOptionCount < 500) {
            client.menuOptions[client.menuOptionCount] = var0;
            client.menuTargets[client.menuOptionCount] = var1;
            client.menuTypes[client.menuOptionCount] = var2;
            client.menuIdentifiers[client.menuOptionCount] = var3;
            client.menuActionParams0[client.menuOptionCount] = var4;
            client.menuActionParams1[client.menuOptionCount] = var5;
            client.menuBooleanArray[client.menuOptionCount] = var6;
            ++client.menuOptionCount;
            client.onMenuOptionsChanged(-1);
         }

      }
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      signature = "(S)I",
      garbageValue = "32767"
   )
   public static int method3964() {
      return ++MouseInput.mouseIdleTicks - 1;
   }
}
