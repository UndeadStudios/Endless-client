package net.runelite.standalone;

import net.runelite.api.coords.LocalPoint;
import net.runelite.api.events.GraphicsObjectCreated;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.api.RSGraphicsObject;

@ObfuscatedName("ba")
public final class SpotAnimation extends Entity implements RSGraphicsObject {
   @ObfuscatedName("r")
   @ObfuscatedSignature(
      signature = "Lcw;"
   )
   static class39 field1095;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = -867255925
   )
   int height;
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = 1058182045
   )
   int field1086;
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = 1424250479
   )
   int y;
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      intValue = 953575315
   )
   int field1091;
   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "Lju;"
   )
   Sequence field1088;
   @ObfuscatedName("b")
   boolean finished;
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      intValue = 1538944877
   )
   int id;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = 679010059
   )
   int startCycle;
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      intValue = 1605641487
   )
   int x;
   @ObfuscatedName("g")
   @ObfuscatedGetter(
      intValue = 1320502275
   )
   int level;

   SpotAnimation(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      this.field1091 = 0;
      this.field1086 = 0;
      this.finished = false;
      this.id = var1;
      this.level = var2;
      this.x = var3;
      this.y = var4;
      this.height = var5;
      this.startCycle = var7 + var6;
      int var8 = SoundTask.method6414(this.id).field3358;
      if(var8 != -1) {
         this.finished = false;
         this.field1088 = AuthProt.method6374(var8);
      } else {
         this.finished = true;
      }

      this.rl$$init();
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "(I)Ldv;"
   )
   protected final Model vmethod6001(int var1) {
      Spotanim var2 = SoundTask.method6414(this.id);
      Model var3;
      if(!this.finished) {
         var3 = var2.method358(this.field1091);
      } else {
         var3 = var2.method358(-1);
      }

      return var3 == null?null:var3;
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "-415622752"
   )
   final void method1572(int var1) {
      if(!this.finished) {
         this.field1086 += var1;

         while(this.field1086 > this.field1088.frameLengths[this.field1091]) {
            this.field1086 -= this.field1088.frameLengths[this.field1091];
            ++this.field1091;
            if(this.field1091 >= this.field1088.frameIDs.length) {
               this.finished = true;
               break;
            }
         }

      }
   }

   public int getX() {
      return this.x;
   }

   public int getY() {
      return this.y;
   }

   private void rl$$init() {
      GraphicsObjectCreated var1 = new GraphicsObjectCreated(this);
      ItemContainer.clientInstance.getCallbacks().post(var1);
   }

   public LocalPoint getLocation() {
      return new LocalPoint(this.getX(), this.getY());
   }

   public int getId() {
      return this.id;
   }

   public int getStartCycle() {
      return this.startCycle;
   }

   public int getLevel() {
      return this.level;
   }

   public int getHeight() {
      return this.height;
   }

   /**
    * Gets the z coordinate
    */
   @Override
   public int getZ() {
      return 0;
   }

   @Override
   public boolean finished() {
      return false;
   }

   /**
    * Set if this spotanim is done animating. If finished, the spotanim will despawn next frame.
    *
    * @param finished
    */
   @Override
   public void setFinished(boolean finished) {

   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "([BIIIIIIILen;[Lfk;S)V",
      garbageValue = "21207"
   )
   static final void method1582(byte[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, SceneManager var8, CollisionData[] var9) {
      Packet var10 = new Packet(var0);
      int var11 = -1;

      while(true) {
         int var12 = var10.method5088();
         if(var12 == 0) {
            return;
         }

         var11 += var12;
         int var13 = 0;

         while(true) {
            int var14 = var10.method5269();
            if(var14 == 0) {
               break;
            }

            var13 += var14 - 1;
            int var15 = var13 & 63;
            int var16 = var13 >> 6 & 63;
            int var17 = var13 >> 12;
            int var18 = var10.readUnsignedByte();
            int var19 = var18 >> 2;
            int var20 = var18 & 3;
            if(var17 == var4 && var16 >= var5 && var16 < var5 + 8 && var15 >= var6 && var15 < var6 + 8) {
               LocType var21 = GrandExchangeOffer.method1736(var11);
               int var22 = var2 + class171.method2693(var16 & 7, var15 & 7, var7, var21.width, var21.length, var20);
               int var23 = var3 + class140.method2017(var16 & 7, var15 & 7, var7, var21.width, var21.length, var20);
               if(var22 > 0 && var23 > 0 && var22 < 103 && var23 < 103) {
                  int var24 = var1;
                  if((class91.tileSettings[1][var22][var23] & 2) == 2) {
                     var24 = var1 - 1;
                  }

                  CollisionData var25 = null;
                  if(var24 >= 0) {
                     var25 = var9[var24];
                  }

                  class253.method4728(var1, var22, var23, var11, var20 + var7 & 3, var19, var8, var25);
               }
            }
         }
      }
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "(IB)Lcs;",
      garbageValue = "-74"
   )
   static class314 method1574(int var0) {
      class314 var1 = (class314)class314.field1269.method635((long)var0);
      if(var1 != null) {
         return var1;
      } else {
         byte[] var2 = class27.clientscripts.method4115(var0, 0, -1796617386);
         if(var2 == null) {
            return null;
         } else {
            var1 = class191.method3809(var2);
            class314.field1269.method628(var1, (long)var0);
            return var1;
         }
      }
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "([BB)Laf;",
      garbageValue = "1"
   )
   static class57 method1583(byte[] var0) {
      return var0 == null?new class57():new class57(class331.method6416(var0).pixels);
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(IIIIB)V",
      garbageValue = "-117"
   )
   static final void method1584(int var0, int var1, int var2, int var3) {
      for(int var4 = var1; var4 <= var3 + var1; ++var4) {
         for(int var5 = var0; var5 <= var0 + var2; ++var5) {
            if(var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) {
               class91.field511[0][var5][var4] = 127;
               if(var0 == var5 && var5 > 0) {
                  class91.tileHeights[0][var5][var4] = class91.tileHeights[0][var5 - 1][var4];
               }

               if(var5 == var0 + var2 && var5 < 103) {
                  class91.tileHeights[0][var5][var4] = class91.tileHeights[0][var5 + 1][var4];
               }

               if(var4 == var1 && var4 > 0) {
                  class91.tileHeights[0][var5][var4] = class91.tileHeights[0][var5][var4 - 1];
               }

               if(var4 == var3 + var1 && var4 < 103) {
                  class91.tileHeights[0][var5][var4] = class91.tileHeights[0][var5][var4 + 1];
               }
            }
         }
      }

   }
}
