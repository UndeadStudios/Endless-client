package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.api.RSSpritePixels;

@ObfuscatedName("jx")
public class IDKType extends CacheableNode {
   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "Lgp;"
   )
   public static NodeCache identKits;
   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "Liz;"
   )
   static Js5Index identKit_ref;
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "Liz;"
   )
   static Js5Index field3373;
   @ObfuscatedName("f")
   int[] modelIds;
   @ObfuscatedName("e")
   public boolean nonSelectable;
   @ObfuscatedName("q")
   short[] retextureToFind;
   @ObfuscatedName("m")
   short[] recolorToReplace;
   @ObfuscatedName("p")
   short[] recolorToFind;
   @ObfuscatedName("b")
   short[] retextureToReplace;
   @ObfuscatedName("n")
   int[] models;
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      intValue = 415172277
   )
   public int bodyPartId;

   static {
      identKits = new NodeCache(64);
   }

   IDKType() {
      this.bodyPartId = -1;
      this.models = new int[]{-1, -1, -1, -1, -1};
      this.nonSelectable = false;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(B)Ldk;",
      garbageValue = "1"
   )
   public ModelData method5425() {
      if(this.modelIds == null) {
         return null;
      } else {
         ModelData[] var1 = new ModelData[this.modelIds.length];

         for(int var2 = 0; var2 < this.modelIds.length; ++var2) {
            var1[var2] = ModelData.method2779(field3373, this.modelIds[var2], 0);
         }

         ModelData var4;
         if(var1.length == 1) {
            var4 = var1[0];
         } else {
            var4 = new ModelData(var1, var1.length);
         }

         int var3;
         if(this.recolorToFind != null) {
            for(var3 = 0; var3 < this.recolorToFind.length; ++var3) {
               var4.method2801(this.recolorToFind[var3], this.recolorToReplace[var3]);
            }
         }

         if(this.retextureToFind != null) {
            for(var3 = 0; var3 < this.retextureToFind.length; ++var3) {
               var4.method2850(this.retextureToFind[var3], this.retextureToReplace[var3]);
            }
         }

         return var4;
      }
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(Lgx;IB)V",
      garbageValue = "-17"
   )
   void method5405(Packet var1, int var2) {
      if(var2 == 1) {
         this.bodyPartId = var1.readUnsignedByte();
      } else {
         int var3;
         int var4;
         if(var2 == 2) {
            var3 = var1.readUnsignedByte();
            this.modelIds = new int[var3];

            for(var4 = 0; var4 < var3; ++var4) {
               this.modelIds[var4] = var1.readUnsignedShort();
            }
         } else if(var2 == 3) {
            this.nonSelectable = true;
         } else if(var2 == 40) {
            var3 = var1.readUnsignedByte();
            this.recolorToFind = new short[var3];
            this.recolorToReplace = new short[var3];

            for(var4 = 0; var4 < var3; ++var4) {
               this.recolorToFind[var4] = (short)var1.readUnsignedShort();
               this.recolorToReplace[var4] = (short)var1.readUnsignedShort();
            }
         } else if(var2 == 41) {
            var3 = var1.readUnsignedByte();
            this.retextureToFind = new short[var3];
            this.retextureToReplace = new short[var3];

            for(var4 = 0; var4 < var3; ++var4) {
               this.retextureToFind[var4] = (short)var1.readUnsignedShort();
               this.retextureToReplace[var4] = (short)var1.readUnsignedShort();
            }
         } else if(var2 >= 60 && var2 < 70) {
            this.models[var2 - 60] = var1.readUnsignedShort();
         }
      }

   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(I)Ldk;",
      garbageValue = "-1339242269"
   )
   public ModelData method5408() {
      ModelData[] var1 = new ModelData[5];
      int var2 = 0;

      for(int var3 = 0; var3 < 5; ++var3) {
         if(this.models[var3] != -1) {
            var1[var2++] = ModelData.method2779(field3373, this.models[var3], 0);
         }
      }

      ModelData var5 = new ModelData(var1, var2);
      int var4;
      if(this.recolorToFind != null) {
         for(var4 = 0; var4 < this.recolorToFind.length; ++var4) {
            var5.method2801(this.recolorToFind[var4], this.recolorToReplace[var4]);
         }
      }

      if(this.retextureToFind != null) {
         for(var4 = 0; var4 < this.retextureToFind.length; ++var4) {
            var5.method2850(this.retextureToFind[var4], this.retextureToReplace[var4]);
         }
      }

      return var5;
   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "942136951"
   )
   public boolean method5407() {
      boolean var1 = true;

      for(int var2 = 0; var2 < 5; ++var2) {
         if(this.models[var2] != -1 && !field3373.method4117(this.models[var2], 0)) {
            var1 = false;
         }
      }

      return var1;
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "-1555038209"
   )
   public boolean method5413() {
      if(this.modelIds == null) {
         return true;
      } else {
         boolean var1 = true;

         for(int var2 = 0; var2 < this.modelIds.length; ++var2) {
            if(!field3373.method4117(this.modelIds[var2], 0)) {
               var1 = false;
            }
         }

         return var1;
      }
   }

   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "(Lgx;B)V",
      garbageValue = "22"
   )
   void method5404(Packet var1) {
      while(true) {
         int var2 = var1.readUnsignedByte();
         if(var2 == 0) {
            return;
         }

         this.method5405(var1, var2);
      }
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(Liz;III)Lld;"
   )
   public static SpritePixels method5403(Js5Index var0, int var1, int var2, int var3) {
      net.runelite.api.SpritePixels var4 = (net.runelite.api.SpritePixels) client.spriteOverrides.get(Integer.valueOf(var1));
      return var4 != null?(SpritePixels)((RSSpritePixels)var4):(SpritePixels) client.copy$getSpriteAsSpritePixels(var0, var1, var2, var3);
   }
}
