package net.runelite.standalone;

import java.io.IOException;
import net.runelite.api.events.PostHealthBar;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.api.RSBuffer;
import net.runelite.rs.api.RSHealthBar;
import net.runelite.rs.api.RSSpritePixels;

@ObfuscatedName("jp")
public class HeadbarType extends CacheableNode implements RSHealthBar {
   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "Lgp;"
   )
   static NodeCache field3387;
   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "Liz;"
   )
   public static Js5Index field3397;
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "Liz;"
   )
   static Js5Index field3385;
   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "Lgp;"
   )
   public static NodeCache field3386;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = -837920445
   )
   public int healthScale;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = 372450145
   )
   public int field3394;
   @ObfuscatedName("r")
   @ObfuscatedGetter(
      intValue = -1679460201
   )
   int field3389;
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = 84424049
   )
   public int field3391;
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      intValue = -128708993
   )
   public int field3396;
   @ObfuscatedName("b")
   @ObfuscatedGetter(
      intValue = 1298817893
   )
   public int field3392;
   @ObfuscatedName("o")
   @ObfuscatedGetter(
      intValue = 1473541421
   )
   public int field3398;
   @ObfuscatedName("n")
   @ObfuscatedGetter(
      intValue = -121711597
   )
   public int field3393;
   @ObfuscatedName("t")
   @ObfuscatedGetter(
      intValue = -1333320733
   )
   int field3384;
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      intValue = -597048601
   )
   public int field3400;

   static {
      field3386 = new NodeCache(64);
      field3387 = new NodeCache(64);
   }

   public HeadbarType() {
      this.field3396 = 255;
      this.field3391 = 255;
      this.field3392 = -1;
      this.field3393 = 1;
      this.field3394 = 70;
      this.field3389 = -1;
      this.field3384 = -1;
      this.healthScale = 30;
      this.field3398 = 0;
      this.rl$$init();
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(B)Lld;"
   )
   public SpritePixels method2049(byte var1) {
      SpritePixels var2 = this.copy$getHealthBarFrontSprite(var1);
      return var2 != null?(SpritePixels)var2:(client.healthBarOverride == null?null:(SpritePixels)(this.getHealthScale() == 30?(RSSpritePixels) client.healthBarOverride.frontSprite:(RSSpritePixels) client.healthBarOverride.frontSpriteLarge));
   }

   @ObfuscatedSignature(
      signature = "(I)Lld;"
   )
   public SpritePixels copy$getHealthBarBackSprite(int var1) {
      if(this.field3384 < 0) {
         return null;
      } else {
         SpritePixels var2 = (SpritePixels)field3387.method635((long)this.field3384);
         if(var2 != null) {
            return var2;
         } else {
            var2 = IDKType.method5403(field3385, this.field3384, 0, 779668259);
            if(var2 != null) {
               field3387.method628(var2, (long)this.field3384);
            }

            return var2;
         }
      }
   }

   @ObfuscatedSignature(
      signature = "(B)Lld;"
   )
   public SpritePixels copy$getHealthBarFrontSprite(byte var1) {
      if(this.field3389 < 0) {
         return null;
      } else {
         SpritePixels var2 = (SpritePixels)field3387.method635((long)this.field3389);
         if(var2 != null) {
            return var2;
         } else {
            var2 = IDKType.method5403(field3385, this.field3389, 0, 893471558);
            if(var2 != null) {
               field3387.method628(var2, (long)this.field3389);
            }

            return var2;
         }
      }
   }

   public void onRead(RSBuffer var1) {
      PostHealthBar var2 = new PostHealthBar();
      var2.setHealthBar(this);
      ItemContainer.clientInstance.getCallbacks().post(var2);
   }

   public int getHealthScale() {
      return this.healthScale;
   }

   private void rl$$init() {
   }

   public void setPadding(int var1) {
      this.field3398 = var1;
   }

   public RSSpritePixels getHealthBarFrontSprite() {
      return this.method2049((byte)-36);
   }

   public RSSpritePixels getHealthBarBackSprite() {
      return this.method2050(72714445);
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(Lgx;B)V",
      garbageValue = "40"
   )
   public void method2056(Packet var1) {
      while(true) {
         int var2 = var1.readUnsignedByte();
         if(var2 == 0) {
            this.onRead(var1);
            return;
         }

         this.method2048(var1, var2);
      }
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      signature = "(I)Lld;"
   )
   public SpritePixels method2050(int var1) {
      SpritePixels var2 = this.copy$getHealthBarBackSprite(var1);
      return var2 != null?(SpritePixels)var2:(client.healthBarOverride == null?null:(SpritePixels)(this.getHealthScale() == 30?(RSSpritePixels) client.healthBarOverride.backSprite:(RSSpritePixels) client.healthBarOverride.backSpriteLarge));
   }

   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "(Lgx;II)V",
      garbageValue = "-990034819"
   )
   void method2048(Packet var1, int var2) {
      if(var2 == 1) {
         var1.readUnsignedShort();
      } else if(var2 == 2) {
         this.field3396 = var1.readUnsignedByte();
      } else if(var2 == 3) {
         this.field3391 = var1.readUnsignedByte();
      } else if(var2 == 4) {
         this.field3392 = 0;
      } else if(var2 == 5) {
         this.field3394 = var1.readUnsignedShort();
      } else if(var2 == 6) {
         var1.readUnsignedByte();
      } else if(var2 == 7) {
         this.field3389 = var1.method5287();
      } else if(var2 == 8) {
         this.field3384 = var1.method5287();
      } else if(var2 == 11) {
         this.field3392 = var1.readUnsignedShort();
      } else if(var2 == 14) {
         this.healthScale = var1.readUnsignedByte();
      } else if(var2 == 15) {
         this.field3398 = var1.readUnsignedByte();
      }

   }

   @ObfuscatedName("hp")
   @ObfuscatedSignature(
      signature = "(ZI)V",
      garbageValue = "1093187746"
   )
   static final void method2072(boolean var0) {
      FontName.method513();
      ++client.serverConnection.field1313;
      if(client.serverConnection.field1313 >= 50 || var0) {
         client.serverConnection.field1313 = 0;
         if(!client.socketError && client.serverConnection.method38() != null) {
            TcpConnectionMessage var1 = class232.method4535(ClientProt.field2241, client.serverConnection.isaac);
            client.serverConnection.method18(var1);

            try {
               client.serverConnection.method17();
            } catch (IOException var3) {
               client.socketError = true;
            }
         }

      }
   }

   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/CharSequence;I)I",
      garbageValue = "683895931"
   )
   public static int method2073(CharSequence var0) {
      return ItemLayer.method525(var0, 10, true);
   }

   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "1088043575"
   )
   public static final boolean method2071() {
      KeyFocusListener var0 = KeyFocusListener.keyboard;
      synchronized(KeyFocusListener.keyboard) {
         if(KeyFocusListener.field406 == KeyFocusListener.field408) {
            return false;
         } else {
            SocialState.currentPressedKey = KeyFocusListener.field403[KeyFocusListener.field406];
            class129.currentTypedKey = KeyFocusListener.field402[KeyFocusListener.field406];
            KeyFocusListener.field406 = KeyFocusListener.field406 + 1 & 127;
            return true;
         }
      }
   }
}
