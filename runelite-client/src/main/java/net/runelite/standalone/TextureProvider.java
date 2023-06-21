package net.runelite.standalone;

import net.runelite.api.IndexDataBase;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.api.RSTexture;
import net.runelite.rs.api.RSTextureProvider;

@ObfuscatedName("du")
public class TextureProvider implements ITextureLoader, RSTextureProvider {
   @ObfuscatedName("b")
   @ObfuscatedGetter(
      intValue = -827781513
   )
   static int field1525;
   @ObfuscatedName("cz")
   static boolean middleMouseMovesCamera;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = 956040443
   )
   int width;
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = -2014379947
   )
   int size;
   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "Liz;"
   )
   Js5Index sprites;
   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "[Ldb;"
   )
   Texture[] textures;
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "Lhv;"
   )
   Deque deque;
   @ObfuscatedName("h")
   double brightness;
   @ObfuscatedName("g")
   @ObfuscatedGetter(
      intValue = -1519057499
   )
   int maxSize;

   @ObfuscatedSignature(
      signature = "(Liz;Liz;IDI)V"
   )
   public TextureProvider(Js5Index var1, Js5Index var2, int var3, double var4, int var6) {
      this.deque = new Deque();
      this.size = 0;
      this.brightness = 1.0D;
      this.width = 128;
      this.sprites = var2;
      this.maxSize = var3;
      this.size = this.maxSize;
      this.brightness = var4;
      this.width = var6;
      int[] var7 = var1.method4126(0);
      int var8 = var7.length;
      this.textures = new Texture[var1.method4112(0)];

      for(int var9 = 0; var9 < var8; ++var9) {
         Packet var10 = new Packet(var1.method4115(0, var7[var9], 364663651));
         this.textures[var7[var9]] = new Texture(var10);
      }

      this.rl$$init();
      this.rl$init(var1, var2, var3, var4, var6);
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(II)Z",
      garbageValue = "-159952212"
   )
   public boolean vmethod1153(int var1) {
      return this.width == 64;
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(II)I",
      garbageValue = "-1592582549"
   )
   public int vmethod1151(int var1) {
      return this.textures[var1] != null?this.textures[var1].field1615:0;
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(IB)V",
      garbageValue = "0"
   )
   public void method1155(int var1) {
      for(int var2 = 0; var2 < this.textures.length; ++var2) {
         Texture var3 = this.textures[var2];
         if(var3 != null && var3.field1612 != 0 && var3.loaded) {
            var3.method536(var1);
            var3.loaded = false;
         }
      }

      this.checkTextures(var1);
   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "674605951"
   )
   public void method1148() {
      for(int var1 = 0; var1 < this.textures.length; ++var1) {
         if(this.textures[var1] != null) {
            this.textures[var1].method533();
         }
      }

      this.deque = new Deque();
      this.size = this.maxSize;
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "1521912619"
   )
   public int method1158() {
      int var1 = 0;
      int var2 = 0;
      Texture[] var3 = this.textures;

      for(int var4 = 0; var4 < var3.length; ++var4) {
         Texture var5 = var3[var4];
         if(var5 != null && var5.fileIds != null) {
            var1 += var5.fileIds.length;
            int[] var6 = var5.fileIds;

            for(int var7 = 0; var7 < var6.length; ++var7) {
               int var8 = var6[var7];
               if(this.sprites.method4201(var8)) {
                  ++var2;
               }
            }
         }
      }

      if(var1 == 0) {
         return 0;
      } else {
         return var2 * 100 / var1;
      }
   }

   public void setMaxSize(int var1) {
      this.maxSize = var1;
   }

   public void checkTextures(int var1) {
      ItemContainer.clientInstance.getCallbacks().drawAboveOverheads();
   }

   public void setSize(int var1) {
      this.size = var1;
   }

   private void rl$$init() {
   }

   public void rl$init(IndexDataBase var1, IndexDataBase var2, int var3, double var4, int var6) {
      this.setMaxSize(64);
      this.setSize(64);
   }

   public RSTexture[] getTextures() {
      return this.textures;
   }

   public double getBrightness() {
      return this.brightness;
   }

   public void setBrightness(double var1) {
      this.method1149(var1);
   }

   public int[] load(int var1) {
      return this.vmethod1150(var1);
   }

   @ObfuscatedName("s")
   public void method1149(double var1) {
      this.brightness = var1;
      this.method1148();
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      signature = "(IB)Z",
      garbageValue = "-36"
   )
   public boolean vmethod1152(int var1) {
      return this.textures[var1].field1617;
   }

   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "(II)[I",
      garbageValue = "1412569886"
   )
   public int[] vmethod1150(int var1) {
      Texture var2 = this.textures[var1];
      if(var2 != null) {
         if(var2.pixels != null) {
            this.deque.method3907(var2);
            var2.loaded = true;
            return var2.pixels;
         }

         boolean var3 = var2.method534(this.brightness, this.width, this.sprites);
         if(var3) {
            if(this.size == 0) {
               Texture var4 = (Texture)this.deque.method3910();
               var4.method533();
            } else {
               --this.size;
            }

            this.deque.method3907(var2);
            var2.loaded = true;
            return var2.pixels;
         }
      }

      return null;
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V",
      garbageValue = "-350827543"
   )
   static void method1169(String var0, String var1, String var2) {
      class203.loginMessage1 = var0;
      class203.loginMessage2 = var1;
      class203.loginMessage3 = var2;
   }
}
