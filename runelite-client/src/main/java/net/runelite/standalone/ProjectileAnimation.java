package net.runelite.standalone;

import net.runelite.api.coords.LocalPoint;
import net.runelite.api.events.ProjectileMoved;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.api.RSProjectile;
import netscape.javascript.JSObject;

@ObfuscatedName("ct")
public final class ProjectileAnimation extends Entity implements RSProjectile {
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = -204280907
   )
   int endHeight;
   @ObfuscatedName("l")
   double z;
   @ObfuscatedName("v")
   double heightOffset;
   @ObfuscatedName("e")
   boolean isMoving;
   @ObfuscatedName("r")
   double x;
   @ObfuscatedName("k")
   double velocityZ;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = -77331817
   )
   int rotationY;
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = 2028992299
   )
   int slope;
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = -142241487
   )
   int y1;
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      intValue = 506418453
   )
   int endCycle;
   @ObfuscatedName("p")
   @ObfuscatedGetter(
      intValue = -1432275439
   )
   int startMovementCycle;
   @ObfuscatedName("b")
   @ObfuscatedGetter(
      intValue = 1443812039
   )
   int startHeight;
   @ObfuscatedName("o")
   double velocityX;
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      intValue = 595928693
   )
   int id;
   @ObfuscatedName("n")
   @ObfuscatedGetter(
      intValue = -1655053057
   )
   int interacting;
   @ObfuscatedName("c")
   @ObfuscatedGetter(
      intValue = -455933117
   )
   int int7;
   @ObfuscatedName("t")
   double y;
   @ObfuscatedName("i")
   @ObfuscatedSignature(
      signature = "Lju;"
   )
   Sequence animationSequence;
   @ObfuscatedName("y")
   double scalar;
   @ObfuscatedName("d")
   @ObfuscatedGetter(
      intValue = -412451625
   )
   int rotationX;
   @ObfuscatedName("j")
   @ObfuscatedGetter(
      intValue = -44715143
   )
   int int6;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = 1964390021
   )
   int floor;
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      intValue = -2091027413
   )
   int height;
   @ObfuscatedName("u")
   double velocityY;
   @ObfuscatedName("g")
   @ObfuscatedGetter(
      intValue = 1259021119
   )
   int x1;

   ProjectileAnimation(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
      this.isMoving = false;
      this.int7 = 0;
      this.int6 = 0;
      this.id = var1;
      this.floor = var2;
      this.x1 = var3;
      this.y1 = var4;
      this.height = var5;
      this.startMovementCycle = var6;
      this.endCycle = var7;
      this.slope = var8;
      this.startHeight = var9;
      this.interacting = var10;
      this.endHeight = var11;
      this.isMoving = false;
      int var12 = SoundTask.method6414(this.id).field3358;
      if(var12 != -1) {
         this.animationSequence = AuthProt.method6374(var12);
      } else {
         this.animationSequence = null;
      }

      this.rl$$init();
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "(I)Ldv;"
   )
   protected final Model vmethod6001(int var1) {
      Spotanim var2 = SoundTask.method6414(this.id);
      Model var3 = var2.method358(this.int7);
      if(var3 == null) {
         return null;
      } else {
         var3.method3887(this.rotationY);
         return var3;
      }
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "(IIIII)V",
      garbageValue = "-1749204692"
   )
   final void method4012(int var1, int var2, int var3, int var4) {
      this.projectileMoved(var1, var2, var3, var4);
      double var5;
      if(!this.isMoving) {
         var5 = (double)(var1 - this.x1);
         double var7 = (double)(var2 - this.y1);
         double var9 = Math.sqrt(var5 * var5 + var7 * var7);
         this.x = (double)this.startHeight * var5 / var9 + (double)this.x1;
         this.y = (double)this.y1 + var7 * (double)this.startHeight / var9;
         this.z = (double)this.height;
      }

      var5 = (double)(this.endCycle + 1 - var4);
      this.velocityX = ((double)var1 - this.x) / var5;
      this.velocityY = ((double)var2 - this.y) / var5;
      this.scalar = Math.sqrt(this.velocityY * this.velocityY + this.velocityX * this.velocityX);
      if(!this.isMoving) {
         this.velocityZ = -this.scalar * Math.tan(0.02454369D * (double)this.slope);
      }

      this.heightOffset = 2.0D * ((double)var3 - this.z - this.velocityZ * var5) / (var5 * var5);
   }

   public int getId() {
      return this.id;
   }

   public void projectileMoved(int var1, int var2, int var3, int var4) {
      int var5 = this.getId();
      switch(var5) {
      case 280:
      case 315:
      case 319:
      case 366:
      case 501:
      case 551:
      case 660:
      case 1260:
      case 1293:
      case 1324:
      case 1327:
      case 1329:
      case 1435:
      case 1445:
      case 1481:
      case 1482:
      case 1483:
      case 1484:
      case 1491:
      case 1495:
      case 1583:
      case 1596:
      case 1598:
      case 1662:
      case 1663:
         return;
      default:
         LocalPoint var6 = new LocalPoint(var1, var2);
         ProjectileMoved var7 = new ProjectileMoved();
         var7.setProjectile(this);
         var7.setPosition(var6);
         var7.setZ(var3);
         ItemContainer.clientInstance.getCallbacks().post(var7);
      }
   }

   public int getEndCycle() {
      return this.endCycle;
   }

   private void rl$$init() {
   }

   public int getRemainingCycles() {
      int var1 = ItemContainer.clientInstance.getGameCycle();
      return this.getEndCycle() - var1;
   }

   public int getFloor() {
      return this.floor;
   }

   public int getX1() {
      return this.x1;
   }

   public int getY1() {
      return this.y1;
   }

   public int getHeight() {
      return this.height;
   }

   public int getEndHeight() {
      return this.endHeight;
   }

   public int getStartMovementCycle() {
      return this.startMovementCycle;
   }

   public int getSlope() {
      return this.slope;
   }

   public int getStartHeight() {
      return this.startHeight;
   }

   public double getX() {
      return this.x;
   }

   public double getY() {
      return this.y;
   }

   public double getZ() {
      return this.z;
   }

   public double getVelocityX() {
      return this.velocityX;
   }

   public double getVelocityY() {
      return this.velocityY;
   }

   public double getScalar() {
      return this.scalar;
   }

   public double getVelocityZ() {
      return this.velocityZ;
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "1852528324"
   )
   final void method4015(int var1) {
      this.isMoving = true;
      this.x += this.velocityX * (double)var1;
      this.y += (double)var1 * this.velocityY;
      this.z += (double)var1 * this.heightOffset * 0.5D * (double)var1 + this.velocityZ * (double)var1;
      this.velocityZ += this.heightOffset * (double)var1;
      this.rotationX = (int)(Math.atan2(this.velocityX, this.velocityY) * 325.949D) + 1024 & 2047;
      this.rotationY = (int)(Math.atan2(this.velocityZ, this.scalar) * 325.949D) & 2047;
      if(this.animationSequence != null) {
         this.int6 += var1;

         while(true) {
            do {
               do {
                  if(this.int6 <= this.animationSequence.frameLengths[this.int7]) {
                     return;
                  }

                  this.int6 -= this.animationSequence.frameLengths[this.int7];
                  ++this.int7;
               } while(this.int7 < this.animationSequence.frameIDs.length);

               this.int7 -= this.animationSequence.frameStep;
            } while(this.int7 >= 0 && this.int7 < this.animationSequence.frameIDs.length);

            this.int7 = 0;
         }
      }
   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "(Liz;II)Llv;",
      garbageValue = "78600032"
   )
   public static IndexedSprite method4007(Js5Index var0, int var1) {
      byte[] var3 = var0.method4122(var1);
      boolean var2;
      if(var3 == null) {
         var2 = false;
      } else {
         Occluder.method4536(var3);
         var2 = true;
      }

      if(!var2) {
         return null;
      } else {
         IndexedSprite var4 = new IndexedSprite();
         var4.originalWidth = class96.indexedSpriteWidth;
         var4.originalHeight = class96.indexedSpriteHeight;
         var4.offsetX = class96.indexedSpriteOffsetXs[0];
         var4.offsetY = GameCanvas.indexedSpriteOffsetYs[0];
         var4.width = class96.indexSpriteWidths[0];
         var4.height = class96.indexedSpriteHeights[0];
         var4.palette = class96.indexedSpritePalette;
         var4.pixels = class241.spritePixels[0];
         class43.method648();
         return var4;
      }
   }

   @ObfuscatedName("a")
   static double method4016(double var0) {
      return Math.exp(-var0 * var0 / 2.0D) / Math.sqrt(6.283185307179586D);
   }

   @ObfuscatedName("kb")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;I)V",
      garbageValue = "-1290325002"
   )
   static void method4013(String var0) {
      class52.sessionToken = var0;

      try {
         String var1 = ItemContainer.clientInstance.getParameter(Parameters.field3673.key);
         String var2 = ItemContainer.clientInstance.getParameter(Parameters.field3674.key);
         String var3 = var1 + "settings=" + var0 + "; version=1; path=/; domain=" + var2;
         if(var0.length() == 0) {
            var3 = var3 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
         } else {
            var3 = var3 + "; Expires=" + class285.method5886(class318.method6317() + 94608000000L) + "; Max-Age=" + 94608000L;
         }

         client var4 = ItemContainer.clientInstance;
         String var5 = "document.cookie=\"" + var3 + "\"";
         JSObject.getWindow(var4).eval(var5);
      } catch (Throwable var6) {
         ;
      }

   }

   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "2019467883"
   )
   public static void method4014() {
      if(MouseInput.mouse != null) {
         MouseInput var0 = MouseInput.mouse;
         synchronized(MouseInput.mouse) {
            MouseInput.mouse = null;
         }
      }

   }
}
