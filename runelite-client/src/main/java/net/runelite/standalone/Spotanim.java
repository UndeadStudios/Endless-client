package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jh")
public class Spotanim extends CacheableNode {
   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "Lgp;"
   )
   static NodeCache SpotAnimationDefinition_cachedModels;
   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "Liz;"
   )
   static Js5Index SpotAnimationDefinition_indexCache;
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "Liz;"
   )
   static Js5Index SpotAnimationDefinition_modelIndexCache;
   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "Lgp;"
   )
   static NodeCache spotanims;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = 19920877
   )
   int field3352;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = 577867669
   )
   int field3361;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = 1468698369
   )
   int widthScale;
   @ObfuscatedName("r")
   @ObfuscatedGetter(
      intValue = 188811895
   )
   int heightScale;
   @ObfuscatedName("q")
   short[] field3351;
   @ObfuscatedName("m")
   short[] field3354;
   @ObfuscatedName("p")
   @ObfuscatedGetter(
      intValue = 2704803
   )
   public int field3358;
   @ObfuscatedName("b")
   short[] field3347;
   @ObfuscatedName("o")
   @ObfuscatedGetter(
      intValue = 1177990595
   )
   int field3362;
   @ObfuscatedName("n")
   short[] field3357;
   @ObfuscatedName("t")
   @ObfuscatedGetter(
      intValue = 1674463065
   )
   int orientation;
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      intValue = 63283905
   )
   int id;

   static {
      spotanims = new NodeCache(64);
      SpotAnimationDefinition_cachedModels = new NodeCache(30);
   }

   Spotanim() {
      this.field3358 = -1;
      this.widthScale = 128;
      this.heightScale = 128;
      this.orientation = 0;
      this.field3361 = 0;
      this.field3362 = 0;
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(Lgx;II)V",
      garbageValue = "-972042923"
   )
   void method361(Packet var1, int var2) {
      if(var2 == 1) {
         this.field3352 = var1.readUnsignedShort();
      } else if(var2 == 2) {
         this.field3358 = var1.readUnsignedShort();
      } else if(var2 == 4) {
         this.widthScale = var1.readUnsignedShort();
      } else if(var2 == 5) {
         this.heightScale = var1.readUnsignedShort();
      } else if(var2 == 6) {
         this.orientation = var1.readUnsignedShort();
      } else if(var2 == 7) {
         this.field3361 = var1.readUnsignedByte();
      } else if(var2 == 8) {
         this.field3362 = var1.readUnsignedByte();
      } else {
         int var3;
         int var4;
         if(var2 == 40) {
            var3 = var1.readUnsignedByte();
            this.field3354 = new short[var3];
            this.field3351 = new short[var3];

            for(var4 = 0; var4 < var3; ++var4) {
               this.field3354[var4] = (short)var1.readUnsignedShort();
               this.field3351[var4] = (short)var1.readUnsignedShort();
            }
         } else if(var2 == 41) {
            var3 = var1.readUnsignedByte();
            this.field3347 = new short[var3];
            this.field3357 = new short[var3];

            for(var4 = 0; var4 < var3; ++var4) {
               this.field3347[var4] = (short)var1.readUnsignedShort();
               this.field3357[var4] = (short)var1.readUnsignedShort();
            }
         }
      }

   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      signature = "(IB)Ldv;",
      garbageValue = "41"
   )
   public final Model method358(int var1) {
      Model var2 = (Model)SpotAnimationDefinition_cachedModels.method635((long)this.id);
      if(var2 == null) {
         ModelData var3 = ModelData.method2779(SpotAnimationDefinition_modelIndexCache, this.field3352, 0);
         if(var3 == null) {
            return null;
         }

         int var4;
         if(this.field3354 != null) {
            for(var4 = 0; var4 < this.field3354.length; ++var4) {
               var3.method2801(this.field3354[var4], this.field3351[var4]);
            }
         }

         if(this.field3347 != null) {
            for(var4 = 0; var4 < this.field3347.length; ++var4) {
               var3.method2850(this.field3347[var4], this.field3357[var4]);
            }
         }

         var2 = var3.toModel(this.field3361 + 64, this.field3362 + 850, -30, -50, -30);
         SpotAnimationDefinition_cachedModels.method628(var2, (long)this.id);
      }

      Model var5;
      if(this.field3358 != -1 && var1 != -1) {
         var5 = AuthProt.method6374(this.field3358).method5011(var2, var1, -1538877257);
      } else {
         var5 = var2.method3829(true);
      }

      if(this.widthScale != 128 || this.heightScale != 128) {
         var5.method3843(this.widthScale, this.heightScale, this.widthScale);
      }

      if(this.orientation != 0) {
         if(this.orientation == 90) {
            var5.method3842();
         }

         if(this.orientation == 180) {
            var5.method3842();
            var5.method3842();
         }

         if(this.orientation == 270) {
            var5.method3842();
            var5.method3842();
            var5.method3842();
         }
      }

      return var5;
   }

   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "(Lgx;I)V",
      garbageValue = "-1788479923"
   )
   void method359(Packet var1) {
      while(true) {
         int var2 = var1.readUnsignedByte();
         if(var2 == 0) {
            return;
         }

         this.method361(var1, var2);
      }
   }
}
