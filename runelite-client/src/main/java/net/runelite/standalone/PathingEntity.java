package net.runelite.standalone;

import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.image.BufferedImage;
import net.runelite.api.Actor;
import net.runelite.api.Hitsplat;
import net.runelite.api.NPC;
import net.runelite.api.NPCComposition;
import net.runelite.api.Perspective;
import net.runelite.api.Point;
import net.runelite.api.Hitsplat.HitsplatType;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.AnimationChanged;
import net.runelite.api.events.GraphicChanged;
import net.runelite.api.events.HitsplatApplied;
import net.runelite.api.events.InteractingChanged;
import net.runelite.api.events.LocalPlayerDeath;
import net.runelite.api.events.OverheadTextChanged;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.api.RSActor;
import net.runelite.rs.api.RSCombatInfo1;
import net.runelite.rs.api.RSCombatInfoList;
import net.runelite.rs.api.RSCombatInfoListHolder;
import net.runelite.rs.api.RSHealthBar;
import net.runelite.rs.api.RSNPC;
import net.runelite.rs.api.RSNode;
import net.runelite.rs.api.RSPlayer;

@ObfuscatedName("bq")
public abstract class PathingEntity extends Entity implements RSActor {
   @ObfuscatedName("h")
   @ObfuscatedSignature(
      signature = "[Llv;"
   )
   static IndexedSprite[] runeSprites;
   @ObfuscatedName("ak")
   byte field958;
   @ObfuscatedName("by")
   @ObfuscatedGetter(
      intValue = -706448991
   )
   int spotAnimFrameCycle;
   @ObfuscatedName("bh")
   @ObfuscatedGetter(
      intValue = -765100633
   )
   int field975;
   @ObfuscatedName("bn")
   @ObfuscatedGetter(
      intValue = -319378323
   )
   int animation;
   @ObfuscatedName("cq")
   @ObfuscatedGetter(
      intValue = 1068430487
   )
   int field997;
   @ObfuscatedName("aq")
   @ObfuscatedGetter(
      intValue = -1732730569
   )
   int field968;
   @ObfuscatedName("bb")
   @ObfuscatedGetter(
      intValue = -1370039961
   )
   int actionFrameCycle;
   @ObfuscatedName("cp")
   int[] pathY;
   @ObfuscatedName("bm")
   @ObfuscatedGetter(
      intValue = 1357876641
   )
   int field985;
   @ObfuscatedName("bs")
   @ObfuscatedGetter(
      intValue = -889714255
   )
   int field943;
   @ObfuscatedName("al")
   String overhead;
   @ObfuscatedName("ae")
   @ObfuscatedGetter(
      intValue = -121701009
   )
   int idlePoseAnimation;
   @ObfuscatedName("bz")
   @ObfuscatedSignature(
      signature = "Lhj;"
   )
   CombatInfoList combatInfoList;
   @ObfuscatedName("bg")
   @ObfuscatedGetter(
      intValue = -153239745
   )
   int poseAnimation;
   @ObfuscatedName("bt")
   @ObfuscatedGetter(
      intValue = 895752093
   )
   int field992;
   @ObfuscatedName("br")
   @ObfuscatedGetter(
      intValue = -718435821
   )
   int field970;
   @ObfuscatedName("bd")
   int[] field963;
   @ObfuscatedName("au")
   @ObfuscatedGetter(
      intValue = -112176649
   )
   int field946;
   @ObfuscatedName("cx")
   @ObfuscatedGetter(
      intValue = 959033621
   )
   int field991;
   @ObfuscatedName("ba")
   @ObfuscatedGetter(
      intValue = -1657595709
   )
   int field984;
   @ObfuscatedName("ca")
   @ObfuscatedGetter(
      intValue = 685164573
   )
   int logicalHeight;
   @ObfuscatedName("cm")
   @ObfuscatedGetter(
      intValue = -29901391
   )
   int field986;
   @ObfuscatedName("aj")
   @ObfuscatedGetter(
      intValue = -305543637
   )
   int walkAnim;
   @ObfuscatedName("aw")
   boolean field941;
   @ObfuscatedName("bo")
   int[] hitsplatCycles;
   @ObfuscatedName("bp")
   boolean field966;
   @ObfuscatedName("ai")
   @ObfuscatedGetter(
      intValue = 1401491189
   )
   int rotate270Anim;
   @ObfuscatedName("av")
   @ObfuscatedGetter(
      intValue = -2023022381
   )
   int field945;
   @ObfuscatedName("bc")
   @ObfuscatedGetter(
      intValue = -645429661
   )
   int field981;
   @ObfuscatedName("bq")
   @ObfuscatedGetter(
      intValue = 1050412339
   )
   int spotAnimFrame;
   @ObfuscatedName("bk")
   @ObfuscatedGetter(
      intValue = 1407567875
   )
   int poseFrame;
   @ObfuscatedName("cy")
   @ObfuscatedGetter(
      intValue = 626883897
   )
   int orientation;
   @ObfuscatedName("ah")
   @ObfuscatedGetter(
      intValue = 832489571
   )
   int angle;
   @ObfuscatedName("an")
   @ObfuscatedGetter(
      intValue = -1322552639
   )
   int size;
   @ObfuscatedName("be")
   int[] field962;
   @ObfuscatedName("bv")
   @ObfuscatedGetter(
      intValue = -1393318171
   )
   int facingCoord;
   @ObfuscatedName("cc")
   @ObfuscatedGetter(
      intValue = 1110409789
   )
   int direction;
   @ObfuscatedName("ct")
   @ObfuscatedGetter(
      intValue = -1560785533
   )
   int queueSize;
   @ObfuscatedName("at")
   @ObfuscatedGetter(
      intValue = -1667088189
   )
   int field960;
   @ObfuscatedName("am")
   int[] hitsplatTypes;
   @ObfuscatedName("bf")
   int[] hitsplatValues;
   @ObfuscatedName("as")
   @ObfuscatedGetter(
      intValue = 529424019
   )
   int rotate180Anim;
   @ObfuscatedName("ax")
   @ObfuscatedGetter(
      intValue = 1527954605
   )
   int field957;
   @ObfuscatedName("ch")
   @ObfuscatedGetter(
      intValue = -2049705409
   )
   int field987;
   @ObfuscatedName("cb")
   int[] pathX;
   @ObfuscatedName("cd")
   byte[] pathTraversed;
   @ObfuscatedName("ar")
   @ObfuscatedGetter(
      intValue = -835556093
   )
   int rotate90Anim;
   @ObfuscatedName("ad")
   @ObfuscatedGetter(
      intValue = 1214946269
   )
   int field956;
   @ObfuscatedName("bu")
   @ObfuscatedGetter(
      intValue = -942376823
   )
   int graphicsDelay;
   @ObfuscatedName("aa")
   int x;
   @ObfuscatedName("bx")
   @ObfuscatedGetter(
      intValue = -998815435
   )
   int field983;
   @ObfuscatedName("bl")
   @ObfuscatedGetter(
      intValue = 1278509105
   )
   int actionFrame;
   @ObfuscatedName("az")
   boolean field953;
   @ObfuscatedName("cg")
   @ObfuscatedGetter(
      intValue = -2123022555
   )
   int lastUpdatedAt;
   @ObfuscatedName("bw")
   @ObfuscatedGetter(
      intValue = 397052649
   )
   int actionAnimationDisable;
   @ObfuscatedName("ac")
   boolean overheadFiltered;
   @ObfuscatedName("bi")
   @ObfuscatedGetter(
      intValue = -1157261129
   )
   int interacting;
   @ObfuscatedName("cf")
   @ObfuscatedGetter(
      intValue = -1251865369
   )
   int field950;
   @ObfuscatedName("ab")
   @ObfuscatedGetter(
      intValue = 1597666721
   )
   int y;
   @ObfuscatedName("ao")
   @ObfuscatedGetter(
      intValue = 849184353
   )
   int overheadTextCyclesRemaining;
   @ObfuscatedName("bj")
   @ObfuscatedGetter(
      intValue = -1484984709
   )
   int graphic;

   PathingEntity() {
      this.field941 = false;
      this.size = 1;
      this.idlePoseAnimation = -1;
      this.field945 = -1;
      this.field946 = -1;
      this.walkAnim = -1;
      this.rotate180Anim = -1;
      this.rotate90Anim = -1;
      this.rotate270Anim = -1;
      this.field968 = -1;
      this.overhead = null;
      this.overheadTextChanged(-1);
      this.overheadFiltered = false;
      this.overheadTextCyclesRemaining = 100;
      this.field956 = 0;
      this.field957 = 0;
      this.field958 = 0;
      this.hitsplatTypes = new int[4];
      this.hitsplatValues = new int[4];
      this.hitsplatCycles = new int[4];
      this.field962 = new int[4];
      this.field963 = new int[4];
      this.combatInfoList = new CombatInfoList();
      this.interacting = -1;
      this.interactingChanged(-1);
      this.field966 = false;
      this.facingCoord = -1;
      this.poseAnimation = -1;
      this.poseFrame = 0;
      this.field970 = 0;
      this.animation = -1;
      this.animationChanged(-1);
      this.actionFrame = 0;
      this.actionFrameCycle = 0;
      this.actionAnimationDisable = 0;
      this.field975 = 0;
      this.graphic = -1;
      this.graphicChanged(-1);
      this.spotAnimFrame = 0;
      this.spotAnimFrameCycle = 0;
      this.lastUpdatedAt = 0;
      this.logicalHeight = 200;
      this.field991 = 0;
      this.direction = 32;
      this.queueSize = 0;
      this.pathX = new int[10];
      this.pathY = new int[10];
      this.pathTraversed = new byte[10];
      this.field997 = 0;
      this.field950 = 0;
      this.rl$$init();
   }

   @ObfuscatedName("r")
   @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "1474294283"
   )
   boolean vmethod6005() {
      return false;
   }

   @ObfuscatedName("bz")
   @ObfuscatedSignature(
      signature = "(IIIIIII)V",
      garbageValue = "2124449712"
   )
   final void method2456(int var1, int var2, int var3, int var4, int var5, int var6) {
      this.setCombatInfo(var1, var2, var3, var4, var5, var6);
      HeadbarType var8 = (HeadbarType)HeadbarType.field3386.method635((long)var1);
      HeadbarType var7;
      if(var8 != null) {
         var7 = var8;
      } else {
         byte[] var9 = HeadbarType.field3397.method4115(33, var1, -233214501);
         var8 = new HeadbarType();
         if(var9 != null) {
            var8.method2056(new Packet(var9));
         }

         HeadbarType.field3386.method628(var8, (long)var1);
         var7 = var8;
      }

      var8 = var7;
      CombatInfoListHolder var14 = null;
      CombatInfoListHolder var10 = null;
      int var11 = var7.field3391;
      int var12 = 0;

      CombatInfoListHolder var13;
      for(var13 = (CombatInfoListHolder)this.combatInfoList.method4703(); var13 != null; var13 = (CombatInfoListHolder)this.combatInfoList.method4704()) {
         ++var12;
         if(var13.headbar.field3400 == var8.field3400) {
            var13.method804(var2 + var4, var5, var6, var3);
            return;
         }

         if(var13.headbar.field3396 <= var8.field3396) {
            var14 = var13;
         }

         if(var13.headbar.field3391 > var11) {
            var10 = var13;
            var11 = var13.headbar.field3391;
         }
      }

      if(var10 != null || var12 < 4) {
         var13 = new CombatInfoListHolder(var8);
         if(var14 == null) {
            this.combatInfoList.method4697(var13);
         } else {
            CombatInfoList.method4701(var13, var14);
         }

         var13.method804(var2 + var4, var5, var6, var3);
         if(var12 >= 4) {
            var10.method432();
         }

      }
   }

   @ObfuscatedName("bd")
   @ObfuscatedSignature(
      signature = "(IIIIIII)V",
      garbageValue = "292266945"
   )
   final void method2452(int var1, int var2, int var3, int var4, int var5, int var6) {
      boolean var7 = true;
      boolean var8 = true;

      int var9;
      for(var9 = 0; var9 < 4; ++var9) {
         if(this.hitsplatCycles[var9] > var5) {
            var7 = false;
         } else {
            var8 = false;
         }
      }

      var9 = -1;
      int var10 = -1;
      int var11 = 0;
      if(var1 >= 0) {
         HitmarkType var12 = Timer.method1740(var1);
         var10 = var12.field3429;
         var11 = var12.field3437;
      }

      int var14;
      if(var8) {
         if(var10 == -1) {
            this.applyActorHitsplat(var1, var2, var3, var4, var5, var6);
            return;
         }

         var9 = 0;
         var14 = 0;
         if(var10 == 0) {
            var14 = this.hitsplatCycles[0];
         } else if(var10 == 1) {
            var14 = this.hitsplatValues[0];
         }

         for(int var13 = 1; var13 < 4; ++var13) {
            if(var10 == 0) {
               if(this.hitsplatCycles[var13] < var14) {
                  var9 = var13;
                  var14 = this.hitsplatCycles[var13];
               }
            } else if(var10 == 1 && this.hitsplatValues[var13] < var14) {
               var9 = var13;
               var14 = this.hitsplatValues[var13];
            }
         }

         if(var10 == 1 && var14 >= var2) {
            this.applyActorHitsplat(var1, var2, var3, var4, var5, var6);
            return;
         }
      } else {
         if(var7) {
            this.field958 = 0;
         }

         for(var14 = 0; var14 < 4; ++var14) {
            byte var15 = this.field958;
            this.field958 = (byte)((this.field958 + 1) % 4);
            if(this.hitsplatCycles[var15] <= var5) {
               var9 = var15;
               break;
            }
         }
      }

      if(var9 < 0) {
         this.applyActorHitsplat(var1, var2, var3, var4, var5, var6);
      } else {
         this.hitsplatTypes[var9] = var1;
         this.hitsplatValues[var9] = var2;
         this.field962[var9] = var3;
         this.field963[var9] = var4;
         this.hitsplatCycles[var9] = var5 + var11 + var6;
         this.applyActorHitsplat(var1, var2, var3, var4, var5, var6);
      }
   }

   public void setCombatInfo(int var1, int var2, int var3, int var4, int var5, int var6) {
      if(var5 == 0) {
         if(this == ItemContainer.clientInstance.getLocalPlayer()) {
            ItemContainer.clientInstance.getLogger().debug("You died!");
            LocalPlayerDeath var7 = new LocalPlayerDeath();
            ItemContainer.clientInstance.getCallbacks().post(var7);
         } else if(this instanceof RSNPC) {
            ((RSNPC)this).setDead(true);
         }
      }

   }

   public RSCombatInfoList getCombatInfoList() {
      return this.combatInfoList;
   }

   public int getRSInteracting() {
      return this.interacting;
   }

   public int _protect$getRsAnimation/* $FF was: 1protect$getRsAnimation*/() {
      return this.animation;
   }

   public String getOverheadText() {
      return this.overhead;
   }

   public Actor getInteracting() {
      int var1 = this.getRSInteracting();
      if(var1 != -1 && var1 != 65535) {
         if(var1 < 32768) {
            RSNPC[] var3 = ItemContainer.clientInstance.getCachedNPCs();
            return var3[var1];
         } else {
            var1 -= 32768;
            RSPlayer[] var2 = ItemContainer.clientInstance.getCachedPlayers();
            return var2[var1];
         }
      } else {
         return null;
      }
   }

   public int getX() {
      return this.x * -1234429701;
   }

   public int[] getPathX() {
      return this.pathX;
   }

   public WorldPoint getWorldLocation() {
      return WorldPoint.fromLocal(ItemContainer.clientInstance, this.getPathX()[0] * 128 + 64, this.getPathY()[0] * 128 + 64, ItemContainer.clientInstance.getPlane());
   }

   public LocalPoint getLocalLocation() {
      return new LocalPoint(this.getX(), this.getY());
   }

   public int getY() {
      return this.y;
   }

   public int getAnimation() {
      int var1 = this._protect$getRsAnimation();
      switch(var1) {
      case 7592:
      case 7593:
      case 7949:
      case 7950:
      case 7951:
      case 7952:
      case 7957:
      case 7960:
      case 8059:
      case 8123:
      case 8124:
      case 8125:
      case 8126:
      case 8127:
      case 8234:
      case 8235:
      case 8236:
      case 8237:
      case 8238:
      case 8241:
      case 8242:
      case 8243:
      case 8244:
      case 8245:
      case 8248:
      case 8249:
      case 8250:
      case 8251:
      case 8252:
      case 8255:
      case 8256:
      case 8257:
      case 8258:
         return -1;
      default:
         return var1;
      }
   }

   public int getActionFrame() {
      return this.actionFrame;
   }

   public void applyActorHitsplat(int var1, int var2, int var3, int var4, int var5, int var6) {
      Hitsplat var7 = new Hitsplat(HitsplatType.fromInteger(var1), var2, var5 + var6);
      HitsplatApplied var8 = new HitsplatApplied();
      var8.setActor(this);
      var8.setHitsplat(var7);
      ItemContainer.clientInstance.getCallbacks().post(var8);
   }

   public int[] getPathY() {
      return this.pathY;
   }

   public int getPoseFrame() {
      return this.poseFrame;
   }

   public int getOrientation() {
      return this.orientation;
   }

   public int getSpotAnimFrame() {
      return this.spotAnimFrame;
   }

   public int getActionFrameCycle() {
      return this.actionFrameCycle;
   }

   public void setActionFrame(int var1) {
      this.actionFrame = var1;
   }

   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1"
   )
   public void animationChanged(int var1) {
      if(this instanceof RSNPC) {
         int var2 = ((RSNPC)this).getId();
         switch(var2) {
         case 8615:
         case 8616:
         case 8617:
         case 8618:
         case 8619:
         case 8620:
         case 8621:
         case 8622:
            return;
         }
      }

      AnimationChanged var3 = new AnimationChanged();
      var3.setActor(this);
      ItemContainer.clientInstance.getCallbacks().post(var3);
   }

   public void setPoseFrame(int var1) {
      this.poseFrame = var1;
   }

   public int getPoseFrameCycle() {
      return this.field970;
   }

   public void setSpotAnimFrame(int var1) {
      this.spotAnimFrame = var1;
   }

   public int getSpotAnimFrameCycle() {
      return this.spotAnimFrameCycle;
   }

   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1"
   )
   public void overheadTextChanged(int var1) {
      String var2 = this.getOverheadText();
      if(var2 != null) {
         OverheadTextChanged var3 = new OverheadTextChanged(this, var2);
         ItemContainer.clientInstance.getCallbacks().post(var3);
      }

   }

   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1"
   )
   public void interactingChanged(int var1) {
      InteractingChanged var2 = new InteractingChanged(this, this.getInteracting());
      ItemContainer.clientInstance.getCallbacks().post(var2);
   }

   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1"
   )
   public void graphicChanged(int var1) {
      if(this == ItemContainer.clientInstance.getLocalPlayer()) {
         GraphicChanged var2 = new GraphicChanged();
         var2.setActor(this);
         ItemContainer.clientInstance.getCallbacks().post(var2);
      }
   }

   private void rl$$init() {
   }

   public int getHealthRatio() {
      RSCombatInfoList var1 = this.getCombatInfoList();
      if(var1 != null) {
         RSNode var2 = var1.getNode();
         RSNode var3 = var2.getNext();
         if(var3 instanceof RSCombatInfoListHolder) {
            RSCombatInfoListHolder var4 = (RSCombatInfoListHolder)var3;
            RSCombatInfoList var5 = var4.getCombatInfo1();
            RSNode var6 = var5.getNode();
            RSNode var7 = var6.getNext();
            if(var7 instanceof RSCombatInfo1) {
               RSCombatInfo1 var8 = (RSCombatInfo1)var7;
               return var8.getHealthRatio();
            }
         }
      }

      return -1;
   }

   public int getHealth() {
      RSCombatInfoList var1 = this.getCombatInfoList();
      if(var1 != null) {
         RSNode var2 = var1.getNode();
         RSNode var3 = var2.getNext();
         if(var3 instanceof RSCombatInfoListHolder) {
            RSCombatInfoListHolder var4 = (RSCombatInfoListHolder)var3;
            RSHealthBar var5 = var4.getHealthBar();
            return var5.getHealthScale();
         }
      }

      return -1;
   }

   public Polygon getCanvasTilePoly() {
      return Perspective.getCanvasTilePoly(ItemContainer.clientInstance, this.getLocalLocation());
   }

   public Point getCanvasTextLocation(Graphics2D var1, String var2, int var3) {
      return Perspective.getCanvasTextLocation(ItemContainer.clientInstance, var1, this.getLocalLocation(), var2, var3);
   }

   public Point getCanvasImageLocation(BufferedImage var1, int var2) {
      return Perspective.getCanvasImageLocation(ItemContainer.clientInstance, this.getLocalLocation(), var1, var2);
   }

   public Point getCanvasSpriteLocation(net.runelite.api.SpritePixels var1, int var2) {
      return Perspective.getCanvasSpriteLocation(ItemContainer.clientInstance, this.getLocalLocation(), var1, var2);
   }

   public Point getMinimapLocation() {
      return Perspective.localToMinimap(ItemContainer.clientInstance, this.getLocalLocation());
   }

   public WorldArea getWorldArea() {
      int var1 = 1;
      if(this instanceof NPC) {
         NPCComposition var2 = ((NPC)this).getComposition();
         if(var2 != null && var2.getConfigs() != null) {
            var2 = var2.transform();
         }

         if(var2 != null) {
            var1 = var2.getSize();
         }
      }

      return new WorldArea(this.getWorldLocation(), var1, var1);
   }

   public void setIdlePoseAnimation(int var1) {
      this.idlePoseAnimation = var1;
   }

   public void setOverheadText(String var1) {
      this.overhead = var1;
   }

   public int[] getHitsplatTypes() {
      return this.hitsplatTypes;
   }

   public int[] getHitsplatValues() {
      return this.hitsplatValues;
   }

   public int[] getHitsplatCycles() {
      return this.hitsplatCycles;
   }

   public void setPoseAnimation(int var1) {
      this.poseAnimation = var1;
   }

   public void setAnimation(int var1) {
      this.animation = var1;
   }

   public void setGraphic(int var1) {
      this.graphic = var1;
   }

   public int getGraphic() {
      return this.graphic;
   }

   public int getLogicalHeight() {
      return this.logicalHeight;
   }

   @ObfuscatedName("be")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "16711935"
   )
   final void method2453() {
      this.queueSize = 0;
      this.field950 = 0;
   }

   @ObfuscatedName("bi")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "-883827812"
   )
   final void method2457(int var1) {
      HeadbarType var3 = (HeadbarType)HeadbarType.field3386.method635((long)var1);
      HeadbarType var2;
      if(var3 != null) {
         var2 = var3;
      } else {
         byte[] var4 = HeadbarType.field3397.method4115(33, var1, 1753034153);
         var3 = new HeadbarType();
         if(var4 != null) {
            var3.method2056(new Packet(var4));
         }

         HeadbarType.field3386.method628(var3, (long)var1);
         var2 = var3;
      }

      var3 = var2;

      for(CombatInfoListHolder var5 = (CombatInfoListHolder)this.combatInfoList.method4703(); var5 != null; var5 = (CombatInfoListHolder)this.combatInfoList.method4704()) {
         if(var3 == var5.headbar) {
            var5.method432();
            return;
         }
      }

   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(ILcs;ZI)I",
      garbageValue = "-572206750"
   )
   static int method2476(int var0, class314 var1, boolean var2) {
      int var4 = -1;
      ComponentType var3;
      if(var0 >= 2000) {
         var0 -= 1000;
         var4 = class281.intStack[--class281.intStackSize];
         var3 = ChatHistory.method6246(var4);
      } else {
         var3 = var2?ClientOptions.field1035:class290.field1119;
      }

      if(var0 == 1100) {
         class281.intStackSize -= 2;
         var3.scrollX = class281.intStack[class281.intStackSize];
         if(var3.scrollX > var3.scrollWidth - var3.width) {
            var3.scrollX = var3.scrollWidth - var3.width;
         }

         if(var3.scrollX < 0) {
            var3.scrollX = 0;
         }

         var3.scrollY = class281.intStack[class281.intStackSize + 1];
         if(var3.scrollY > var3.scrollHeight - var3.height) {
            var3.scrollY = var3.scrollHeight - var3.height;
         }

         if(var3.scrollY < 0) {
            var3.scrollY = 0;
         }

         WorldMapRegion.method5554(var3);
         return 1;
      } else if(var0 == 1101) {
         var3.color = class281.intStack[--class281.intStackSize];
         WorldMapRegion.method5554(var3);
         return 1;
      } else if(var0 == 1102) {
         var3.filled = class281.intStack[--class281.intStackSize] == 1;
         WorldMapRegion.method5554(var3);
         return 1;
      } else if(var0 == 1103) {
         var3.trans = class281.intStack[--class281.intStackSize];
         WorldMapRegion.method5554(var3);
         return 1;
      } else if(var0 == 1104) {
         var3.lineWidth = class281.intStack[--class281.intStackSize];
         WorldMapRegion.method5554(var3);
         return 1;
      } else if(var0 == 1105) {
         var3.graphic = class281.intStack[--class281.intStackSize];
         WorldMapRegion.method5554(var3);
         return 1;
      } else if(var0 == 1106) {
         var3.angle2d = class281.intStack[--class281.intStackSize];
         WorldMapRegion.method5554(var3);
         return 1;
      } else if(var0 == 1107) {
         var3.tile = class281.intStack[--class281.intStackSize] == 1;
         WorldMapRegion.method5554(var3);
         return 1;
      } else if(var0 == 1108) {
         var3.modelType = 1;
         var3.modelId = class281.intStack[--class281.intStackSize];
         WorldMapRegion.method5554(var3);
         return 1;
      } else if(var0 == 1109) {
         class281.intStackSize -= 6;
         var3.offsetX2d = class281.intStack[class281.intStackSize];
         var3.offsetY2d = class281.intStack[class281.intStackSize + 1];
         var3.xan2d = class281.intStack[class281.intStackSize + 2];
         var3.yan2d = class281.intStack[class281.intStackSize + 3];
         var3.zan2d = class281.intStack[class281.intStackSize + 4];
         var3.zoom2d = class281.intStack[class281.intStackSize + 5];
         WorldMapRegion.method5554(var3);
         return 1;
      } else {
         int var8;
         if(var0 == 1110) {
            var8 = class281.intStack[--class281.intStackSize];
            if(var8 != var3.animation) {
               var3.animation = var8;
               var3.field2817 = 0;
               var3.field2818 = 0;
               WorldMapRegion.method5554(var3);
            }

            return 1;
         } else if(var0 == 1111) {
            var3.orthogonal = class281.intStack[--class281.intStackSize] == 1;
            WorldMapRegion.method5554(var3);
            return 1;
         } else if(var0 == 1112) {
            String var7 = class281.scriptStringStack[--class295.scriptStringStackSize];
            if(!var7.equals(var3.text)) {
               var3.text = var7;
               WorldMapRegion.method5554(var3);
            }

            return 1;
         } else if(var0 == 1113) {
            var3.fontId = class281.intStack[--class281.intStackSize];
            WorldMapRegion.method5554(var3);
            return 1;
         } else if(var0 == 1114) {
            class281.intStackSize -= 3;
            var3.horizTextAlign = class281.intStack[class281.intStackSize];
            var3.vertTextAlign = class281.intStack[class281.intStackSize + 1];
            var3.lineHeight = class281.intStack[class281.intStackSize + 2];
            WorldMapRegion.method5554(var3);
            return 1;
         } else if(var0 == 1115) {
            var3.textShadow = class281.intStack[--class281.intStackSize] == 1;
            WorldMapRegion.method5554(var3);
            return 1;
         } else if(var0 == 1116) {
            var3.outline = class281.intStack[--class281.intStackSize];
            WorldMapRegion.method5554(var3);
            return 1;
         } else if(var0 == 1117) {
            var3.shadow = class281.intStack[--class281.intStackSize];
            WorldMapRegion.method5554(var3);
            return 1;
         } else if(var0 == 1118) {
            var3.vflip = class281.intStack[--class281.intStackSize] == 1;
            WorldMapRegion.method5554(var3);
            return 1;
         } else if(var0 == 1119) {
            var3.hflip = class281.intStack[--class281.intStackSize] == 1;
            WorldMapRegion.method5554(var3);
            return 1;
         } else if(var0 == 1120) {
            class281.intStackSize -= 2;
            var3.scrollWidth = class281.intStack[class281.intStackSize];
            var3.scrollHeight = class281.intStack[class281.intStackSize + 1];
            WorldMapRegion.method5554(var3);
            if(var4 != -1 && var3.type == 0) {
               ScriptState.method1043(ComponentType.interfaces[var4 >> 16], var3, false);
            }

            return 1;
         } else if(var0 == 1121) {
            class171.method2694(var3.id, var3.index);
            client.field793 = var3;
            WorldMapRegion.method5554(var3);
            return 1;
         } else if(var0 == 1122) {
            var3.field2736 = class281.intStack[--class281.intStackSize];
            WorldMapRegion.method5554(var3);
            return 1;
         } else if(var0 == 1123) {
            var3.field2811 = class281.intStack[--class281.intStackSize];
            WorldMapRegion.method5554(var3);
            return 1;
         } else if(var0 == 1124) {
            var3.field2787 = class281.intStack[--class281.intStackSize];
            WorldMapRegion.method5554(var3);
            return 1;
         } else if(var0 == 1125) {
            var8 = class281.intStack[--class281.intStackSize];
            class225 var6 = (class225)PlayerList.method4757(GraphicsDefaults.method2176(), var8);
            if(var6 != null) {
               var3.field2719 = var6;
               WorldMapRegion.method5554(var3);
            }

            return 1;
         } else {
            boolean var5;
            if(var0 == 1126) {
               var5 = class281.intStack[--class281.intStackSize] == 1;
               var3.lineDirection = var5;
               return 1;
            } else if(var0 == 1127) {
               var5 = class281.intStack[--class281.intStackSize] == 1;
               var3.field2747 = var5;
               return 1;
            } else {
               return 2;
            }
         }
      }
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(Lbu;Lbu;IZIZI)I",
      garbageValue = "-1970671686"
   )
   static int method2470(World var0, World var1, int var2, boolean var3, int var4, boolean var5) {
      int var6 = class312.method6288(var0, var1, var2, var3);
      if(var6 != 0) {
         return var3?-var6:var6;
      } else if(var4 == -1) {
         return 0;
      } else {
         int var7 = class312.method6288(var0, var1, var4, var5);
         return var5?-var7:var7;
      }
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "(Lin;II)V",
      garbageValue = "-903183861"
   )
   static void method2477(Js5 var0, int var1) {
      if(TotalQuantityComparator.NetCache_reference != null) {
         TotalQuantityComparator.NetCache_reference.offset = var1 * 8 + 5;
         int var2 = TotalQuantityComparator.NetCache_reference.readInt();
         int var3 = TotalQuantityComparator.NetCache_reference.readInt();
         var0.method2733(var2, var3);
      } else {
         MapLabel.method2857((Js5)null, 255, 255, 0, (byte)0, true);
         class321.NetCache_indexCaches[var1] = var0;
      }
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      signature = "(ILcs;ZB)I",
      garbageValue = "-71"
   )
   static int method2472(int var0, class314 var1, boolean var2) {
      int var3 = -1;
      ComponentType var4;
      if(var0 >= 2000) {
         var0 -= 1000;
         var3 = class281.intStack[--class281.intStackSize];
         var4 = ChatHistory.method6246(var3);
      } else {
         var4 = var2?ClientOptions.field1035:class290.field1119;
      }

      if(var0 == 1000) {
         class281.intStackSize -= 4;
         var4.posX = class281.intStack[class281.intStackSize];
         var4.posY = class281.intStack[class281.intStackSize + 1];
         var4.posXmode = class281.intStack[class281.intStackSize + 2];
         var4.posYmode = class281.intStack[class281.intStackSize + 3];
         WorldMapRegion.method5554(var4);
         ItemContainer.clientInstance.method3120(var4);
         if(var3 != -1 && var4.type == 0) {
            ScriptState.method1043(ComponentType.interfaces[var3 >> 16], var4, false);
         }

         return 1;
      } else if(var0 == 1001) {
         class281.intStackSize -= 4;
         var4.sizeX = class281.intStack[class281.intStackSize];
         var4.sizeY = class281.intStack[class281.intStackSize + 1];
         var4.sizeXmode = class281.intStack[class281.intStackSize + 2];
         var4.sizeYmode = class281.intStack[class281.intStackSize + 3];
         WorldMapRegion.method5554(var4);
         ItemContainer.clientInstance.method3120(var4);
         if(var3 != -1 && var4.type == 0) {
            ScriptState.method1043(ComponentType.interfaces[var3 >> 16], var4, false);
         }

         return 1;
      } else if(var0 == 1003) {
         boolean var5 = class281.intStack[--class281.intStackSize] == 1;
         if(var5 != var4.isHidden) {
            var4.isHidden = var5;
            var4.onHiddenChanged(-1);
            WorldMapRegion.method5554(var4);
         }

         return 1;
      } else if(var0 == 1005) {
         var4.noClickThrough = class281.intStack[--class281.intStackSize] == 1;
         return 1;
      } else if(var0 == 1006) {
         var4.noScrollThrough = class281.intStack[--class281.intStackSize] == 1;
         return 1;
      } else {
         return 2;
      }
   }
}
