package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.api.RSDynamicObject;

@ObfuscatedName("co")
public class Location extends Entity implements RSDynamicObject {
   @ObfuscatedName("od")
   @ObfuscatedSignature(
      signature = "Lff;"
   )
   static class224 mouseWheel;
   @ObfuscatedName("ar")
   @ObfuscatedSignature(
      signature = "Llr;"
   )
   public static BufferProvider rasterProvider;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = 99477863
   )
   int sceneY;
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = 1071500809
   )
   int animCycleCount;
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = -1836194755
   )
   int level;
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      intValue = -267134163
   )
   int animFrame;
   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "Lju;"
   )
   Sequence animation;
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      intValue = -1934319317
   )
   int id;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = 1671892841
   )
   int type;
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      intValue = -1957562685
   )
   int sceneX;
   @ObfuscatedName("g")
   @ObfuscatedGetter(
      intValue = 1318398919
   )
   int orientation;

   @ObfuscatedSignature(
      signature = "(IIIIIIIZLem;)V"
   )
   Location(int var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean var8, Entity var9) {
      this.id = var1;
      this.type = var2;
      this.orientation = var3;
      this.level = var4;
      this.sceneX = var5;
      this.sceneY = var6;
      if(var7 != -1) {
         this.animation = AuthProt.method6374(var7);
         this.animFrame = 0;
         this.animCycleCount = client.gameCycle - 1;
         this.onAnimCycleCountChanged(-1);
         if(this.animation.replyMode == 0 && var9 != null && var9 instanceof Location) {
            Location var10 = (Location)var9;
            if(var10.animation == this.animation) {
               this.animFrame = var10.animFrame;
               this.animCycleCount = var10.animCycleCount;
               this.onAnimCycleCountChanged(-1);
               this.rl$$init();
               return;
            }
         }

         if(var8 && this.animation.frameStep != -1) {
            this.animFrame = (int)(Math.random() * (double)this.animation.frameIDs.length);
            this.animCycleCount -= (int)(Math.random() * (double)this.animation.frameLengths[this.animFrame]);
            this.onAnimCycleCountChanged(-1);
         }
      }

      this.rl$$init();
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "(I)Ldv;"
   )
   protected final Model vmethod6001(int var1) {
      boolean var8 = false;

      Model var3;
      try {
         var8 = true;
         int var2 = this.getAnimFrame();
         if(var2 < 0) {
            this.setAnimFrame((var2 ^ Integer.MIN_VALUE) & 65535);
         }

         var3 = this.copy$getModel(var1);
         var8 = false;
      } finally {
         if(var8) {
            int var6 = this.getAnimFrame();
            if(var6 < 0) {
               this.setAnimFrame((var6 ^ Integer.MIN_VALUE) & 65535);
            }

         }
      }

      int var4 = this.getAnimFrame();
      if(var4 < 0) {
         this.setAnimFrame((var4 ^ Integer.MIN_VALUE) & 65535);
      }

      return (Model)var3;
   }

   public int getAnimFrame() {
      return this.animFrame;
   }

   @ObfuscatedSignature(
      signature = "(I)Ldv;"
   )
   public final Model copy$getModel(int var1) {
      if(this.animation != null) {
         int var2 = client.gameCycle - this.animCycleCount;
         if(var2 > 100 && this.animation.frameStep > 0) {
            var2 = 100;
         }

         label54: {
            do {
               do {
                  if(var2 <= this.animation.frameLengths[this.animFrame]) {
                     break label54;
                  }

                  var2 -= this.animation.frameLengths[this.animFrame];
                  ++this.animFrame;
               } while(this.animFrame < this.animation.frameIDs.length);

               this.animFrame -= this.animation.frameStep;
            } while(this.animFrame >= 0 && this.animFrame < this.animation.frameIDs.length);

            this.animation = null;
         }

         this.animCycleCount = client.gameCycle - var2;
         this.onAnimCycleCountChanged(-1);
      }

      LocType var13 = GrandExchangeOffer.method1736(this.id);
      if(var13.multiLocs != null) {
         var13 = var13.method395();
      }

      if(var13 == null) {
         return null;
      } else {
         int var3;
         int var4;
         if(this.orientation != 1 && this.orientation != 3) {
            var3 = var13.width;
            var4 = var13.length;
         } else {
            var3 = var13.length;
            var4 = var13.width;
         }

         int var5 = (var3 >> 1) + this.sceneX;
         int var6 = (var3 + 1 >> 1) + this.sceneX;
         int var7 = (var4 >> 1) + this.sceneY;
         int var8 = (var4 + 1 >> 1) + this.sceneY;
         int[][] var9 = class91.tileHeights[this.level];
         int var10 = var9[var5][var7] + var9[var6][var7] + var9[var5][var8] + var9[var6][var8] >> 2;
         int var11 = (this.sceneX << 7) + (var3 << 6);
         int var12 = (this.sceneY << 7) + (var4 << 6);
         return var13.method389(this.type, this.orientation, var9, var11, var10, var12, this.animation, this.animFrame);
      }
   }

   public void setAnimFrame(int var1) {
      this.animFrame = var1;
   }

   public int getAnimCycleCount() {
      return this.animCycleCount;
   }

   private void rl$$init() {
   }

   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1"
   )
   public void onAnimCycleCountChanged(int var1) {
      if(ItemContainer.clientInstance.isInterpolateObjectAnimations()) {
         int var2 = ItemContainer.clientInstance.getGameCycle() - this.getAnimCycleCount();
         this.setAnimFrame(Integer.MIN_VALUE | var2 << 16 | this.getAnimFrame());
      }

   }

   public int getId() {
      return this.id;
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(I)Lbu;",
      garbageValue = "-1183654420"
   )
   static World method4651() {
      World.field1011 = 0;
      return class302.method6066();
   }
}
