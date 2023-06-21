package net.runelite.standalone;

import java.awt.Polygon;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import net.runelite.api.HeadIcon;
import net.runelite.api.Perspective;
import net.runelite.api.Point;
import net.runelite.api.SkullIcon;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.model.Triangle;
import net.runelite.api.model.Vertex;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.api.RSModel;
import net.runelite.rs.api.RSName;
import net.runelite.rs.api.RSPlayer;
import net.runelite.rs.api.RSPlayerComposition;

@ObfuscatedName("bw")
public final class PlayerEntity extends PathingEntity implements RSPlayer {
   @ObfuscatedName("df")
   @ObfuscatedSignature(
      signature = "Lin;"
   )
   static Js5 defaults;
   @ObfuscatedName("f")
   String[] tagFragments;
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "Ldv;"
   )
   Model model;
   @ObfuscatedName("v")
   boolean isLowDetail;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = 1007197773
   )
   int field637;
   @ObfuscatedName("r")
   @ObfuscatedGetter(
      intValue = 1646896689
   )
   int field617;
   @ObfuscatedName("af")
   @ObfuscatedGetter(
      intValue = -169880463
   )
   int xInScene;
   @ObfuscatedName("k")
   @ObfuscatedGetter(
      intValue = 2058832411
   )
   int field628;
   @ObfuscatedName("w")
   boolean hidden;
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = -676759193
   )
   int field633;
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = 841091679
   )
   int overheadIcon;
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      intValue = -507227167
   )
   int totalLevel;
   @ObfuscatedName("p")
   @ObfuscatedGetter(
      intValue = 130093369
   )
   int combatLevel;
   @ObfuscatedName("ag")
   boolean field635;
   @ObfuscatedName("b")
   @ObfuscatedGetter(
      intValue = -666305427
   )
   int animationCycleStart;
   @ObfuscatedName("o")
   @ObfuscatedGetter(
      intValue = -647731317
   )
   int field630;
   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "Lkx;"
   )
   Name name;
   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "Lkz;"
   )
   SocialState field634;
   @ObfuscatedName("n")
   @ObfuscatedGetter(
      intValue = -1372159177
   )
   int animationCycleEnd;
   @ObfuscatedName("c")
   @ObfuscatedGetter(
      intValue = 85931753
   )
   int playerId;
   @ObfuscatedName("t")
   @ObfuscatedGetter(
      intValue = -429766051
   )
   int field622;
   @ObfuscatedName("ay")
   @ObfuscatedGetter(
      intValue = 1778383835
   )
   int yInScene;
   @ObfuscatedName("i")
   @ObfuscatedGetter(
      intValue = 1598019255
   )
   int field631;
   @ObfuscatedName("y")
   @ObfuscatedGetter(
      intValue = -258556587
   )
   int field626;
   @ObfuscatedName("d")
   @ObfuscatedGetter(
      intValue = 1580341907
   )
   int team;
   @ObfuscatedName("j")
   @ObfuscatedSignature(
      signature = "Lkz;"
   )
   SocialState field620;
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "Lil;"
   )
   PlayerComposition composition;
   @ObfuscatedName("u")
   @ObfuscatedGetter(
      intValue = 1193024319
   )
   int field625;
   @ObfuscatedName("g")
   @ObfuscatedGetter(
      intValue = -225579375
   )
   int skullIcon;

   PlayerEntity() {
      this.skullIcon = -1;
      this.overheadIcon = -1;
      this.tagFragments = new String[3];

      for(int var1 = 0; var1 < 3; ++var1) {
         this.tagFragments[var1] = "";
      }

      this.combatLevel = 0;
      this.totalLevel = 0;
      this.animationCycleStart = 0;
      this.animationCycleEnd = 0;
      this.isLowDetail = false;
      this.team = 0;
      this.hidden = false;
      this.field620 = SocialState.UNSET;
      this.field634 = SocialState.UNSET;
      this.field635 = false;
      this.rl$$init();
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1432688130"
   )
   void method6006() {
      this.field634 = SocialState.UNSET;
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "(IIBB)V",
      garbageValue = "-68"
   )
   final void method6012(int var1, int var2, byte var3) {
      if(super.queueSize < 9) {
         ++super.queueSize;
      }

      for(int var4 = super.queueSize; var4 > 0; --var4) {
         super.pathX[var4] = super.pathX[var4 - 1];
         super.pathY[var4] = super.pathY[var4 - 1];
         super.pathTraversed[var4] = super.pathTraversed[var4 - 1];
      }

      super.pathX[0] = var1;
      super.pathY[0] = var2;
      super.pathTraversed[0] = var3;
   }

   @ObfuscatedName("r")
   @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "1474294283"
   )
   final boolean vmethod6005() {
      return this.composition != null;
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "(I)Ldv;"
   )
   protected final Model vmethod6001(int var1) {
      if(!ItemContainer.clientInstance.isInterpolatePlayerAnimations()) {
         return (Model)this.copy$getModel(var1);
      } else {
         int var2 = this.getActionFrame();
         int var3 = this.getPoseFrame();
         int var4 = this.getSpotAnimFrame();

         Model var5;
         try {
            this.setActionFrame(Integer.MIN_VALUE | this.getActionFrameCycle() << 16 | var2);
            this.setPoseFrame(Integer.MIN_VALUE | this.getPoseFrameCycle() << 16 | var3);
            this.setSpotAnimFrame(Integer.MIN_VALUE | this.getSpotAnimFrameCycle() << 16 | var4);
            var5 = this.copy$getModel(var1);
         } finally {
            this.setActionFrame(var2);
            this.setPoseFrame(var3);
            this.setSpotAnimFrame(var4);
         }

         return (Model)var5;
      }
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "100"
   )
   void method6046() {
      this.field620 = class258.friendManager.method2355(this.name)?SocialState.CONTAINS:SocialState.NOT_CONTAINS;
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(B)I",
      garbageValue = "43"
   )
   int method6008() {
      return this.composition != null && this.composition.transformedNpcId != -1?ZoneProt.method374(this.composition.transformedNpcId).size:1;
   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "8"
   )
   void method6000() {
      this.field634 = MapIconReference.clanMemberManager != null && MapIconReference.clanMemberManager.method5333(this.name)?SocialState.CONTAINS:SocialState.NOT_CONTAINS;
   }

   @ObfuscatedName("b")
   @ObfuscatedSignature(
      signature = "(IIBI)V",
      garbageValue = "1431274386"
   )
   final void method6010(int var1, int var2, byte var3) {
      if(super.animation != -1 && AuthProt.method6374(super.animation).priority == 1) {
         super.animation = -1;
         this.animationChanged(-1);
      }

      super.facingCoord = -1;
      if(var1 >= 0 && var1 < 104 && var2 >= 0 && var2 < 104) {
         if(super.pathX[0] >= 0 && super.pathX[0] < 104 && super.pathY[0] >= 0 && super.pathY[0] < 104) {
            if(var3 == 2) {
               class69.method986(this, var1, var2, (byte)2);
            }

            this.method6012(var1, var2, var3);
         } else {
            this.method6011(var1, var2);
         }
      } else {
         this.method6011(var1, var2);
      }

   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "(Lgx;B)V",
      garbageValue = "47"
   )
   final void method6004(Packet var1) {
      var1.offset = 0;
      int var2 = var1.readUnsignedByte();
      this.skullIcon = var1.method5230();
      this.overheadIcon = var1.method5230();
      int var3 = -1;
      this.team = 0;
      int[] var4 = new int[12];

      int var6;
      int var7;
      for(int var5 = 0; var5 < 12; ++var5) {
         var6 = var1.readUnsignedByte();
         if(var6 == 0) {
            var4[var5] = 0;
         } else {
            var7 = var1.readUnsignedByte();
            var4[var5] = var7 + (var6 << 8);
            if(var5 == 0 && var4[0] == 65535) {
               var3 = var1.readUnsignedShort();
               break;
            }

            if(var4[var5] >= 512) {
               int var8 = class79.method1074(var4[var5] - 512).team;
               if(var8 != 0) {
                  this.team = var8;
               }
            }
         }
      }

      int[] var9 = new int[5];

      for(var6 = 0; var6 < 5; ++var6) {
         var7 = var1.readUnsignedByte();
         if(var7 < 0 || var7 >= PlayerComposition.colorsToReplace[var6].length) {
            var7 = 0;
         }

         var9[var6] = var7;
      }

      super.idlePoseAnimation = var1.readUnsignedShort();
      if(super.idlePoseAnimation == 65535) {
         super.idlePoseAnimation = -1;
      }

      super.field945 = var1.readUnsignedShort();
      if(super.field945 == 65535) {
         super.field945 = -1;
      }

      super.field946 = super.field945;
      super.walkAnim = var1.readUnsignedShort();
      if(super.walkAnim == 65535) {
         super.walkAnim = -1;
      }

      super.rotate180Anim = var1.readUnsignedShort();
      if(super.rotate180Anim == 65535) {
         super.rotate180Anim = -1;
      }

      super.rotate90Anim = var1.readUnsignedShort();
      if(super.rotate90Anim == 65535) {
         super.rotate90Anim = -1;
      }

      super.rotate270Anim = var1.readUnsignedShort();
      if(super.rotate270Anim == 65535) {
         super.rotate270Anim = -1;
      }

      super.field968 = var1.readUnsignedShort();
      if(super.field968 == 65535) {
         super.field968 = -1;
      }

      this.name = new Name(var1.readString(), KeyFocusListener.loginType);
      this.method6023();
      this.method6006();
      if(this == class71.localPlayer) {
         JagException.localPlayerUsername = this.name.method1530();
      }

      this.combatLevel = var1.readUnsignedByte();
      this.totalLevel = var1.readUnsignedShort();
      this.hidden = var1.readUnsignedByte() == 1;
      if(client.socketType == 0 && client.staffModLevel >= 2) {
         this.hidden = false;
      }

      if(this.composition == null) {
         this.composition = new PlayerComposition();
      }

      this.composition.method828(var4, var9, var2 == 1, var3);
   }

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      signature = "(III)V",
      garbageValue = "-62129218"
   )
   void method6011(int var1, int var2) {
      super.queueSize = 0;
      super.field950 = 0;
      super.field997 = 0;
      super.pathX[0] = var1;
      super.pathY[0] = var2;
      int var3 = this.method6008();
      super.x = super.pathX[0] * 1897470336 + var3 * -1198748480;
      super.y = var3 * 64 + super.pathY[0] * 128;
   }

   public RSName getRsName() {
      return this.name;
   }

   public int getRsOverheadIcon() {
      return this.overheadIcon;
   }

   @Override
   public int getRsSkullIcon() {
      return this.skullIcon;
   }

   public int _protect$getRsSkullIcon/* $FF was: 1protect$getRsSkullIcon*/() {
      return this.skullIcon;
   }

   @ObfuscatedSignature(
      signature = "(I)Ldv;"
   )
   public final Model copy$getModel(int var1) {
      if(this.composition == null) {
         return null;
      } else {
         Sequence var2 = super.animation != -1 && super.actionAnimationDisable == 0?AuthProt.method6374(super.animation):null;
         Sequence var3 = super.poseAnimation != -1 && !this.isLowDetail && (super.idlePoseAnimation != super.poseAnimation || var2 == null)?AuthProt.method6374(super.poseAnimation):null;
         Model var4 = this.composition.method837(var2, super.actionFrame, var3, super.poseFrame);
         if(var4 == null) {
            return null;
         } else {
            var4.method3833();
            super.logicalHeight = var4.modelHeight;
            Model var5;
            Model[] var6;
            if(!this.isLowDetail && super.graphic != -1 && super.spotAnimFrame != -1) {
               var5 = SoundTask.method6414(super.graphic).method358(super.spotAnimFrame);
               if(var5 != null) {
                  var5.method3889(0, -super.field992, 0);
                  var6 = new Model[]{var4, var5};
                  var4 = new Model(var6, 2);
               }
            }

            if(!this.isLowDetail && this.model != null) {
               if(client.gameCycle >= this.animationCycleEnd) {
                  this.model = null;
               }

               if(client.gameCycle >= this.animationCycleStart && client.gameCycle < this.animationCycleEnd) {
                  var5 = this.model;
                  var5.method3889(this.field637 - super.x * -1234429701, this.field617 - this.field633, this.field622 - super.y);
                  if(super.orientation == 512) {
                     var5.method3842();
                     var5.method3842();
                     var5.method3842();
                  } else if(super.orientation == 1024) {
                     var5.method3842();
                     var5.method3842();
                  } else if(super.orientation == 1536) {
                     var5.method3842();
                  }

                  var6 = new Model[]{var4, var5};
                  var4 = new Model(var6, 2);
                  if(super.orientation == 512) {
                     var5.method3842();
                  } else if(super.orientation == 1024) {
                     var5.method3842();
                     var5.method3842();
                  } else if(super.orientation == 1536) {
                     var5.method3842();
                     var5.method3842();
                     var5.method3842();
                  }

                  var5.method3889(super.x * -1234429701 - this.field637, this.field633 - this.field617, super.y - this.field622);
               }
            }

            var4.field1696 = true;
            return var4;
         }
      }
   }

   public List rotate(List var1, int var2) {
      ArrayList var3 = new ArrayList();
      Iterator var4 = var1.iterator();

      while(var4.hasNext()) {
         Triangle var5 = (Triangle)var4.next();
         Vertex var6 = var5.getA();
         Vertex var7 = var5.getB();
         Vertex var8 = var5.getC();
         Triangle var9 = new Triangle(var6.rotate(var2), var7.rotate(var2), var8.rotate(var2));
         var3.add(var9);
      }

      return var3;
   }

   private void rl$$init() {
   }

   public String getName() {
      RSName var1 = this.getRsName();
      if(var1 == null) {
         return null;
      } else {
         String var2 = var1.getName();
         return var2 == null?null:var2.replace(' ', ' ');
      }
   }

   public HeadIcon getOverheadIcon() {
      switch(this.getRsOverheadIcon()) {
      case 0:
         return HeadIcon.MELEE;
      case 1:
         return HeadIcon.RANGED;
      case 2:
         return HeadIcon.MAGIC;
      case 3:
         return HeadIcon.RETRIBUTION;
      case 4:
         return HeadIcon.SMITE;
      case 5:
         return HeadIcon.REDEMPTION;
      default:
         return null;
      }
   }

   public SkullIcon getSkullIcon() {
      if(this != ItemContainer.clientInstance.getLocalPlayer()) {
         return null;
      } else {
         switch(this._protect$getRsSkullIcon()) {
         case 0:
            return SkullIcon.SKULL;
         case 1:
            return SkullIcon.SKULL_FIGHT_PIT;
         case 2:
         case 3:
         case 4:
         case 5:
         case 6:
         case 7:
         default:
            return null;
         case 8:
            return SkullIcon.DEAD_MAN_FIVE;
         case 9:
            return SkullIcon.DEAD_MAN_FOUR;
         case 10:
            return SkullIcon.DEAD_MAN_THREE;
         case 11:
            return SkullIcon.DEAD_MAN_TWO;
         case 12:
            return SkullIcon.DEAD_MAN_ONE;
         }
      }
   }

   public Polygon[] getPolygons() {
      RSModel var1 = this.getModel();
      if(var1 == null) {
         return null;
      } else {
         int var2 = this.getX();
         int var3 = this.getY();
         int var4 = this.getOrientation();
         int var5 = Perspective.getTileHeight(ItemContainer.clientInstance, new LocalPoint(var2, var3), ItemContainer.clientInstance.getPlane());
         List var6 = var1.getTriangles();
         var6 = this.rotate(var6, var4);
         ArrayList var7 = new ArrayList();
         Iterator var8 = var6.iterator();

         while(var8.hasNext()) {
            Triangle var9 = (Triangle)var8.next();
            Vertex var10 = var9.getA();
            Vertex var11 = var9.getB();
            Vertex var12 = var9.getC();
            Point var13 = Perspective.localToCanvas(ItemContainer.clientInstance, var2 - var10.getX(), var3 - var10.getZ(), var5 + var10.getY());
            Point var14 = Perspective.localToCanvas(ItemContainer.clientInstance, var2 - var11.getX(), var3 - var11.getZ(), var5 + var11.getY());
            Point var15 = Perspective.localToCanvas(ItemContainer.clientInstance, var2 - var12.getX(), var3 - var12.getZ(), var5 + var12.getY());
            int[] var16 = new int[]{var13.getX(), var14.getX(), var15.getX()};
            int[] var17 = new int[]{var13.getY(), var14.getY(), var15.getY()};
            var7.add(new Polygon(var16, var17, 3));
         }

         return (Polygon[])var7.toArray(new Polygon[var7.size()]);
      }
   }

   public Polygon getConvexHull() {
      RSModel var1 = this.getModel();
      if(var1 == null) {
         return null;
      } else {
         int var2 = Perspective.getTileHeight(ItemContainer.clientInstance, new LocalPoint(this.getX(), this.getY()), ItemContainer.clientInstance.getPlane());
         return var1.getConvexHull(this.getX(), this.getY(), this.getOrientation(), var2);
      }
   }

   public RSPlayerComposition getPlayerComposition() {
      return this.composition;
   }

   public int getCombatLevel() {
      return this.combatLevel;
   }

   public int getTotalLevel() {
      return this.totalLevel;
   }

   public int getTeam() {
      return this.team;
   }

   public int getPlayerId() {
      return this.playerId;
   }

   public boolean isFriend() {
      return this.method6002();
   }

   public boolean isClanMember() {
      return this.method6025();
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(B)Z",
      garbageValue = "9"
   )
   boolean method6002() {
      if(this.field620 == SocialState.UNSET) {
         this.method6046();
      }

      return this.field620 == SocialState.CONTAINS;
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "1459208315"
   )
   boolean method6025() {
      if(this.field634 == SocialState.UNSET) {
         this.method6000();
      }

      return this.field634 == SocialState.CONTAINS;
   }

   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-2131355083"
   )
   void method6023() {
      this.field620 = SocialState.UNSET;
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "(IILfu;Lfk;I)Z",
      garbageValue = "-1712172848"
   )
   public static final boolean method6047(int var0, int var1, class93 var2, CollisionData var3) {
      int var4 = var0;
      int var5 = var1;
      byte var6 = 64;
      byte var7 = 64;
      int var8 = var0 - var6;
      int var9 = var1 - var7;
      class82.field2117[var6][var7] = 99;
      class82.field2115[var6][var7] = 0;
      byte var10 = 0;
      int var11 = 0;
      class82.field2121[var10] = var0;
      byte var10001 = var10;
      int var18 = var10 + 1;
      class82.field2122[var10001] = var1;
      int[][] var12 = var3.flags;

      while(var18 != var11) {
         var4 = class82.field2121[var11];
         var5 = class82.field2122[var11];
         var11 = var11 + 1 & 4095;
         int var16 = var4 - var8;
         int var17 = var5 - var9;
         int var13 = var4 - var3.x;
         int var14 = var5 - var3.y;
         if(var2.vmethod1252(2, var4, var5, var3)) {
            class82.field2119 = var4;
            Item.field1222 = var5;
            return true;
         }

         int var15 = class82.field2115[var16][var17] + 1;
         if(var16 > 0 && class82.field2117[var16 - 1][var17] == 0 && (var12[var13 - 1][var14] & 19136782) == 0 && (var12[var13 - 1][var14 + 1] & 19136824) == 0) {
            class82.field2121[var18] = var4 - 1;
            class82.field2122[var18] = var5;
            var18 = var18 + 1 & 4095;
            class82.field2117[var16 - 1][var17] = 2;
            class82.field2115[var16 - 1][var17] = var15;
         }

         if(var16 < 126 && class82.field2117[var16 + 1][var17] == 0 && (var12[var13 + 2][var14] & 19136899) == 0 && (var12[var13 + 2][var14 + 1] & 19136992) == 0) {
            class82.field2121[var18] = var4 + 1;
            class82.field2122[var18] = var5;
            var18 = var18 + 1 & 4095;
            class82.field2117[var16 + 1][var17] = 8;
            class82.field2115[var16 + 1][var17] = var15;
         }

         if(var17 > 0 && class82.field2117[var16][var17 - 1] == 0 && (var12[var13][var14 - 1] & 19136782) == 0 && (var12[var13 + 1][var14 - 1] & 19136899) == 0) {
            class82.field2121[var18] = var4;
            class82.field2122[var18] = var5 - 1;
            var18 = var18 + 1 & 4095;
            class82.field2117[var16][var17 - 1] = 1;
            class82.field2115[var16][var17 - 1] = var15;
         }

         if(var17 < 126 && class82.field2117[var16][var17 + 1] == 0 && (var12[var13][var14 + 2] & 19136824) == 0 && (var12[var13 + 1][var14 + 2] & 19136992) == 0) {
            class82.field2121[var18] = var4;
            class82.field2122[var18] = var5 + 1;
            var18 = var18 + 1 & 4095;
            class82.field2117[var16][var17 + 1] = 4;
            class82.field2115[var16][var17 + 1] = var15;
         }

         if(var16 > 0 && var17 > 0 && class82.field2117[var16 - 1][var17 - 1] == 0 && (var12[var13 - 1][var14] & 19136830) == 0 && (var12[var13 - 1][var14 - 1] & 19136782) == 0 && (var12[var13][var14 - 1] & 19136911) == 0) {
            class82.field2121[var18] = var4 - 1;
            class82.field2122[var18] = var5 - 1;
            var18 = var18 + 1 & 4095;
            class82.field2117[var16 - 1][var17 - 1] = 3;
            class82.field2115[var16 - 1][var17 - 1] = var15;
         }

         if(var16 < 126 && var17 > 0 && class82.field2117[var16 + 1][var17 - 1] == 0 && (var12[var13 + 1][var14 - 1] & 19136911) == 0 && (var12[var13 + 2][var14 - 1] & 19136899) == 0 && (var12[var13 + 2][var14] & 19136995) == 0) {
            class82.field2121[var18] = var4 + 1;
            class82.field2122[var18] = var5 - 1;
            var18 = var18 + 1 & 4095;
            class82.field2117[var16 + 1][var17 - 1] = 9;
            class82.field2115[var16 + 1][var17 - 1] = var15;
         }

         if(var16 > 0 && var17 < 126 && class82.field2117[var16 - 1][var17 + 1] == 0 && (var12[var13 - 1][var14 + 1] & 19136830) == 0 && (var12[var13 - 1][var14 + 2] & 19136824) == 0 && (var12[var13][var14 + 2] & 19137016) == 0) {
            class82.field2121[var18] = var4 - 1;
            class82.field2122[var18] = var5 + 1;
            var18 = var18 + 1 & 4095;
            class82.field2117[var16 - 1][var17 + 1] = 6;
            class82.field2115[var16 - 1][var17 + 1] = var15;
         }

         if(var16 < 126 && var17 < 126 && class82.field2117[var16 + 1][var17 + 1] == 0 && (var12[var13 + 1][var14 + 2] & 19137016) == 0 && (var12[var13 + 2][var14 + 2] & 19136992) == 0 && (var12[var13 + 2][var14 + 1] & 19136995) == 0) {
            class82.field2121[var18] = var4 + 1;
            class82.field2122[var18] = var5 + 1;
            var18 = var18 + 1 & 4095;
            class82.field2117[var16 + 1][var17 + 1] = 12;
            class82.field2115[var16 + 1][var17 + 1] = var15;
         }
      }

      class82.field2119 = var4;
      Item.field1222 = var5;
      return false;
   }

   @ObfuscatedName("kg")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;I)V",
      garbageValue = "1139788778"
   )
   static final void method6041(String var0) {
      if(MapIconReference.clanMemberManager != null) {
         TcpConnectionMessage var1 = class232.method4535(ClientProt.field2232, client.serverConnection.isaac);
         var1.packetBuffer.writeByte(OwnWorldComparator.method73(var0));
         var1.packetBuffer.writeString(var0);
         client.serverConnection.method18(var1);
      }
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "126"
   )
   public static void method6048() {
      try {
         class75.cacheDat.method5574();

         for(int var0 = 0; var0 < OwnWorldComparator.archiveCount; ++var0) {
            MouseRecorder.cacheIndex[var0].method5574();
         }

         class75.masterIndex.method5574();
         class75.uidDat.method5574();
      } catch (Exception var2) {
         ;
      }

   }
}
