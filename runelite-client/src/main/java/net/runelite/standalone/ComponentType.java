package net.runelite.standalone;

import net.runelite.api.Point;
import net.runelite.api.WidgetNode;
import net.runelite.api.events.WidgetHiddenChanged;
import net.runelite.api.events.WidgetPositioned;
import net.runelite.api.widgets.Widget;
import net.runelite.api.widgets.WidgetInfo;
import net.runelite.api.widgets.WidgetItem;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.api.*;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

@ObfuscatedName("ia")
public class ComponentType extends Node implements RSWidget {
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "[[Lia;"
   )
   public static ComponentType[][] interfaces;
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "Lgp;"
   )
   static NodeCache field2686;
   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "Lgp;"
   )
   static NodeCache field2683;
   @ObfuscatedName("r")
   @ObfuscatedSignature(
      signature = "Lgp;"
   )
   static NodeCache componentModelCache;
   @ObfuscatedName("p")
   public static boolean[] validInterfaces;
   @ObfuscatedName("b")
   @ObfuscatedSignature(
      signature = "Liz;"
   )
   static Js5Index field2682;
   @ObfuscatedName("o")
   public static boolean field2740;
   @ObfuscatedName("t")
   @ObfuscatedSignature(
      signature = "Lgp;"
   )
   static NodeCache componentFontCache;
   // $FF: synthetic field
   public static boolean $assertionsDisabled;
   public static int rl$widgetLastPosChanged;
   @ObfuscatedName("ak")
   @ObfuscatedGetter(
      intValue = -211922531
   )
   public int lineWidth;
   @ObfuscatedName("ek")
   public Object[] onKeyListener;
   @ObfuscatedName("by")
   @ObfuscatedGetter(
      intValue = 141904677
   )
   public int zan2d;
   @ObfuscatedName("bh")
   @ObfuscatedGetter(
      intValue = 1955454009
   )
   public int offsetY2d;
   @ObfuscatedName("bn")
   @ObfuscatedGetter(
      intValue = -1240377769
   )
   int field2735;
   @ObfuscatedName("dn")
   public String targetVerb;
   @ObfuscatedName("fn")
   @ObfuscatedGetter(
      intValue = -1728331147
   )
   public int field2825;
   @ObfuscatedName("cq")
   public String[] if1Ops;
   @ObfuscatedName("aq")
   @ObfuscatedGetter(
      intValue = -1339085337
   )
   public int color;
   @ObfuscatedName("dh")
   public Object[] onTargetEnterListener;
   @ObfuscatedName("eq")
   @ObfuscatedGetter(
      intValue = 384592949
   )
   public int linkObjCount;
   @ObfuscatedName("bb")
   @ObfuscatedGetter(
      intValue = -1049312937
   )
   public int field2701;
   @ObfuscatedName("dy")
   public Object[] onDragListener;
   @ObfuscatedName("db")
   public Object[] onVarTransmitListener;
   @ObfuscatedName("ew")
   public Object[] onSubChangeListener;
   @ObfuscatedName("cw")
   public byte[][] opKeyModifiers;
   @ObfuscatedName("v")
   @ObfuscatedGetter(
      intValue = 2135617197
   )
   public int type;
   @ObfuscatedName("cp")
   public int[] field2720;
   @ObfuscatedName("di")
   public Object[] onStatTransmitListener;
   @ObfuscatedName("fz")
   public boolean noScrollThrough;
   @ObfuscatedName("bm")
   @ObfuscatedGetter(
      intValue = -705998701
   )
   public int fontId;
   @ObfuscatedName("af")
   @ObfuscatedGetter(
      intValue = -1313502419
   )
   public int posY;
   @ObfuscatedName("ef")
   public Object[] onStockTransmitListener;
   @ObfuscatedName("bs")
   public boolean orthogonal;
   @ObfuscatedName("al")
   @ObfuscatedGetter(
      intValue = -1470098041
   )
   public int field2811;
   @ObfuscatedName("ae")
   @ObfuscatedGetter(
      intValue = -1603514911
   )
   public int field2681;
   @ObfuscatedName("cv")
   public int[] opKeyRates;
   @ObfuscatedName("k")
   @ObfuscatedGetter(
      intValue = 519422761
   )
   public int index;
   @ObfuscatedName("dc")
   public Object[] onReleaseListener;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = -1559194133
   )
   public int clientcode;
   @ObfuscatedName("el")
   @ObfuscatedGetter(
      intValue = 517430305
   )
   public int linkObjType;
   @ObfuscatedName("bz")
   @ObfuscatedGetter(
      intValue = 583207351
   )
   public int outline;
   @ObfuscatedName("fm")
   @ObfuscatedGetter(
      intValue = 413573757
   )
   public int loopCycle;
   @ObfuscatedName("fg")
   @ObfuscatedGetter(
      intValue = 1772559523
   )
   public int field2822;
   @ObfuscatedName("bg")
   @ObfuscatedGetter(
      intValue = 1805175817
   )
   public int modelType;
   @ObfuscatedName("bt")
   @ObfuscatedGetter(
      intValue = -82311635
   )
   public int field2728;
   @ObfuscatedName("er")
   public Object[] onCamFinishedListener;
   @ObfuscatedName("ee")
   public int[] objCounts;
   @ObfuscatedName("dd")
   public Object[] onClickRepeatListener;
   @ObfuscatedName("ed")
   public String tooltip;
   @ObfuscatedName("br")
   @ObfuscatedGetter(
      intValue = 648741915
   )
   int field2716;
   @ObfuscatedName("du")
   public Object[] onMouseLeaveListener;
   @ObfuscatedName("bd")
   public boolean tile;
   @ObfuscatedName("au")
   public boolean isHidden;
   @ObfuscatedName("ea")
   public String spellName;
   @ObfuscatedName("cx")
   public boolean textShadow;
   @ObfuscatedName("ba")
   @ObfuscatedGetter(
      intValue = -768418655
   )
   public int objNumMode;
   @ObfuscatedName("ca")
   @ObfuscatedGetter(
      intValue = -1454280795
   )
   public int horizTextAlign;
   @ObfuscatedName("ag")
   @ObfuscatedGetter(
      intValue = -46278607
   )
   public int posX;
   @ObfuscatedName("em")
   public Object[] onFriendTransmitListener;
   @ObfuscatedName("cm")
   public String text;
   @ObfuscatedName("aj")
   @ObfuscatedGetter(
      intValue = 1841640021
   )
   public int scrollX;
   @ObfuscatedName("dr")
   public Object[] onLoadListener;
   @ObfuscatedName("aw")
   @ObfuscatedGetter(
      intValue = -670001097
   )
   public int width;
   @ObfuscatedName("bo")
   @ObfuscatedGetter(
      intValue = -159703791
   )
   public int field2736;
   @ObfuscatedName("ep")
   public Object[] onClanTransmitListener;
   @ObfuscatedName("bp")
   public boolean vflip;
   @ObfuscatedName("ai")
   @ObfuscatedGetter(
      intValue = 1584805923
   )
   public int scrollHeight;
   @ObfuscatedName("z")
   @ObfuscatedGetter(
      intValue = 1817591765
   )
   public int sizeYmode;
   @ObfuscatedName("df")
   public Object[] onTimerListener;
   @ObfuscatedName("ds")
   @ObfuscatedSignature(
      signature = "Lia;"
   )
   public ComponentType dragParent;
   @ObfuscatedName("av")
   @ObfuscatedGetter(
      intValue = -282758011
   )
   public int layer;
   @ObfuscatedName("cl")
   public String opBase;
   @ObfuscatedName("bc")
   @ObfuscatedGetter(
      intValue = 303174329
   )
   public int field2745;
   @ObfuscatedName("bq")
   @ObfuscatedGetter(
      intValue = 2013691035
   )
   public int yan2d;
   @ObfuscatedName("dg")
   @ObfuscatedGetter(
      intValue = -808787693
   )
   public int dragDeadZone;
   @ObfuscatedName("dt")
   public boolean hasHook;
   @ObfuscatedName("eb")
   public Object[] onOpListener;
   @ObfuscatedName("eo")
   public Object[] onMiscTransmitListener;
   @ObfuscatedName("fj")
   @ObfuscatedGetter(
      intValue = -1835158917
   )
   public int field2722;
   @ObfuscatedName("c")
   @ObfuscatedGetter(
      intValue = 79006091
   )
   public int posYmode;
   @ObfuscatedName("bk")
   @ObfuscatedGetter(
      intValue = -286899879
   )
   public int modelId;
   @ObfuscatedName("dk")
   public Object[] onDragCompleteListener;
   @ObfuscatedName("ay")
   @ObfuscatedGetter(
      intValue = -751500435
   )
   public int sizeX;
   @ObfuscatedName("cy")
   @ObfuscatedGetter(
      intValue = -160947907
   )
   public int vertTextAlign;
   @ObfuscatedName("ah")
   @ObfuscatedGetter(
      intValue = -659621809
   )
   public int y;
   @ObfuscatedName("an")
   @ObfuscatedGetter(
      intValue = -1657907411
   )
   public int height;
   public int rl$x;
   public int rl$y;
   public int rl$parentId;
   @ObfuscatedName("cn")
   public byte[][] opKeys;
   @ObfuscatedName("en")
   public Object[] onChatTransmitListener;
   @ObfuscatedName("be")
   @ObfuscatedGetter(
      intValue = 1728858633
   )
   public int angle2d;
   @ObfuscatedName("i")
   @ObfuscatedGetter(
      intValue = -1119875119
   )
   public int posXmode;
   @ObfuscatedName("de")
   public Object[] onInvTransmitListener;
   @ObfuscatedName("dv")
   public int[] invTransmitTriggers;
   @ObfuscatedName("bv")
   public boolean hflip;
   @ObfuscatedName("cc")
   @ObfuscatedGetter(
      intValue = -1147674915
   )
   public int paddingX;
   @ObfuscatedName("ec")
   @ObfuscatedSignature(
      signature = "[Lia;"
   )
   public ComponentType[] children;
   @ObfuscatedName("ct")
   @ObfuscatedGetter(
      intValue = 1183417793
   )
   public int paddingY;
   @ObfuscatedName("at")
   @ObfuscatedGetter(
      intValue = 324112871
   )
   public int field2766;
   @ObfuscatedName("y")
   @ObfuscatedGetter(
      intValue = 521895283
   )
   public int id;
   @ObfuscatedName("et")
   public boolean field2820;
   @ObfuscatedName("fe")
   @ObfuscatedGetter(
      intValue = -244573369
   )
   public int field2824;
   @ObfuscatedName("dw")
   public Object[] onTargetLeaveListener;
   @ObfuscatedName("dp")
   public int[] statTransmitTriggers;
   @ObfuscatedName("am")
   public boolean lineDirection;
   @ObfuscatedName("ez")
   public int[] tableActions;
   @ObfuscatedName("ff")
   public int[] opKeysIgnoreHeld;
   @ObfuscatedName("bf")
   @ObfuscatedGetter(
      intValue = -803778329
   )
   public int graphic;
   @ObfuscatedName("as")
   @ObfuscatedGetter(
      intValue = 1345120769
   )
   public int scrollY;
   @ObfuscatedName("es")
   public Object[] onResizeListener;
   @ObfuscatedName("ax")
   @ObfuscatedGetter(
      intValue = 1943802113
   )
   public int trans;
   @ObfuscatedName("dq")
   public boolean dragRenderBehavior;
   @ObfuscatedName("ch")
   public String string1;
   @ObfuscatedName("cb")
   public int[] xSprites;
   @ObfuscatedName("ey")
   public int[] objIds;
   @ObfuscatedName("d")
   @ObfuscatedGetter(
      intValue = -986355207
   )
   public int buttonType;
   @ObfuscatedName("dj")
   public Object[] onHoldListener;
   @ObfuscatedName("cd")
   public int[] field2760;
   @ObfuscatedName("fd")
   public boolean field2831;
   @ObfuscatedName("ar")
   @ObfuscatedGetter(
      intValue = -2136776307
   )
   public int scrollWidth;
   @ObfuscatedName("ad")
   @ObfuscatedSignature(
      signature = "Llp;"
   )
   public class225 field2719;
   @ObfuscatedName("j")
   @ObfuscatedGetter(
      intValue = 1413953597
   )
   public int sizeXmode;
   @ObfuscatedName("bu")
   @ObfuscatedGetter(
      intValue = -1903872069
   )
   public int zoom2d;
   @ObfuscatedName("cu")
   public int[] field2754;
   @ObfuscatedName("eu")
   @ObfuscatedGetter(
      intValue = 1113155467
   )
   public int field2817;
   @ObfuscatedName("da")
   public Object[] onMouseRepeatListener;
   @ObfuscatedName("aa")
   @ObfuscatedGetter(
      intValue = -1348302953
   )
   public int sizeY;
   @ObfuscatedName("ex")
   public int[][] dynamicValues;
   @ObfuscatedName("dx")
   public Object[] onMouseOverListener;
   @ObfuscatedName("ej")
   public int[] field2809;
   @ObfuscatedName("bx")
   public boolean field2747;
   @ObfuscatedName("fo")
   @ObfuscatedGetter(
      intValue = 1945546151
   )
   public int boundsIndex;
   @ObfuscatedName("dl")
   @ObfuscatedGetter(
      intValue = 861361223
   )
   public int dragDeadTime;
   @ObfuscatedName("bl")
   @ObfuscatedGetter(
      intValue = 1459062589
   )
   public int animation;
   @ObfuscatedName("az")
   @ObfuscatedGetter(
      intValue = 2049378189
   )
   public int field2819;
   @ObfuscatedName("eg")
   @ObfuscatedGetter(
      intValue = -924150949
   )
   public int field2810;
   @ObfuscatedName("cg")
   @ObfuscatedGetter(
      intValue = -783980927
   )
   public int lineHeight;
   @ObfuscatedName("do")
   public Object[] onClickListener;
   @ObfuscatedName("bw")
   @ObfuscatedGetter(
      intValue = 1264010429
   )
   public int offsetX2d;
   @ObfuscatedName("fp")
   public boolean field2723;
   @ObfuscatedName("ei")
   public Object[] onDialogAbortListener;
   @ObfuscatedName("ap")
   @ObfuscatedGetter(
      intValue = -1329302643
   )
   public int field2787;
   @ObfuscatedName("ac")
   @ObfuscatedGetter(
      intValue = -1321898327
   )
   public int field2717;
   @ObfuscatedName("bi")
   @ObfuscatedGetter(
      intValue = -1826249299
   )
   public int shadow;
   @ObfuscatedName("cf")
   @ObfuscatedGetter(
      intValue = -184106217
   )
   public int activeProperties;
   @ObfuscatedName("cs")
   public boolean field2763;
   @ObfuscatedName("ev")
   public Object[] onScrollWheelListener;
   @ObfuscatedName("u")
   public boolean isIf3;
   @ObfuscatedName("fq")
   public boolean noClickThrough;
   @ObfuscatedName("eh")
   @ObfuscatedGetter(
      intValue = 367712227
   )
   public int field2818;
   @ObfuscatedName("ab")
   @ObfuscatedGetter(
      intValue = -1653418885
   )
   public int x;
   @ObfuscatedName("ao")
   public boolean filled;
   @ObfuscatedName("dz")
   public String[] ops;
   @ObfuscatedName("dm")
   public int[] varTransmitTriggers;
   @ObfuscatedName("bj")
   @ObfuscatedGetter(
      intValue = -1384877877
   )
   public int xan2d;

   static {
      field2683 = new NodeCache(200);
      componentModelCache = new NodeCache(50);
      componentFontCache = new NodeCache(20);
      field2686 = new NodeCache(8);
      field2740 = false;
      rl$$clinit();
   }

   public ComponentType() {
      this.isIf3 = false;
      this.id = -1;
      this.index = -1;
      this.buttonType = 0;
      this.clientcode = 0;
      this.posXmode = 0;
      this.posYmode = 0;
      this.sizeXmode = 0;
      this.sizeYmode = 0;
      this.posX = 0;
      this.posY = 0;
      this.sizeX = 0;
      this.sizeY = 0;
      this.x = 0;
      this.y = 0;
      this.onPositionChanged(-1);
      this.width = 0;
      this.height = 0;
      this.field2766 = 1;
      this.field2681 = 1;
      this.layer = -1;
      this.isHidden = false;
      this.onHiddenChanged(-1);
      this.scrollX = 0;
      this.scrollY = 0;
      this.scrollWidth = 0;
      this.scrollHeight = 0;
      this.color = 0;
      this.field2811 = 0;
      this.field2819 = 0;
      this.field2717 = 0;
      this.filled = false;
      this.field2719 = class225.field3877;
      this.trans = 0;
      this.field2787 = 0;
      this.lineWidth = 1;
      this.lineDirection = false;
      this.graphic = -1;
      this.field2736 = -1;
      this.angle2d = 0;
      this.tile = false;
      this.outline = 0;
      this.shadow = 0;
      this.modelType = 1;
      this.modelId = -1;
      this.field2716 = 1;
      this.field2735 = -1;
      this.animation = -1;
      this.field2701 = -1;
      this.offsetX2d = 0;
      this.offsetY2d = 0;
      this.xan2d = 0;
      this.yan2d = 0;
      this.zan2d = 0;
      this.zoom2d = 100;
      this.field2728 = 0;
      this.field2745 = 0;
      this.orthogonal = false;
      this.field2747 = false;
      this.objNumMode = 2;
      this.fontId = -1;
      this.text = "";
      this.string1 = "";
      this.lineHeight = 0;
      this.horizTextAlign = 0;
      this.vertTextAlign = 0;
      this.textShadow = false;
      this.paddingX = 0;
      this.paddingY = 0;
      this.activeProperties = 0;
      this.field2763 = false;
      this.opBase = "";
      this.dragParent = null;
      this.dragDeadZone = 0;
      this.dragDeadTime = 0;
      this.dragRenderBehavior = false;
      this.targetVerb = "";
      this.hasHook = false;
      this.field2810 = -1;
      this.spellName = "";
      this.tooltip = "Ok";
      this.linkObjType = -1;
      this.linkObjCount = 0;
      this.field2817 = 0;
      this.field2818 = 0;
      this.field2820 = false;
      this.field2723 = false;
      this.field2822 = -1;
      this.field2722 = 0;
      this.field2824 = 0;
      this.field2825 = 0;
      this.boundsIndex = -1;
      this.loopCycle = -1;
      this.noClickThrough = false;
      this.noScrollThrough = false;
      this.field2831 = false;
      this.rl$$init();
      this.rl$$init1();
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(Lgx;B)V",
      garbageValue = "-3"
   )
   public void method5651(Packet var1) {
      var1.readUnsignedByte();
      this.isIf3 = true;
      this.type = var1.readUnsignedByte();
      this.clientcode = var1.readUnsignedShort();
      this.posX = var1.method5089();
      this.posY = var1.method5089();
      this.sizeX = var1.readUnsignedShort();
      if(this.type == 9) {
         this.sizeY = var1.method5089();
      } else {
         this.sizeY = var1.readUnsignedShort();
      }

      this.sizeXmode = var1.method5230();
      this.sizeYmode = var1.method5230();
      this.posXmode = var1.method5230();
      this.posYmode = var1.method5230();
      this.layer = var1.readUnsignedShort();
      if(this.layer == 65535) {
         this.layer = -1;
      } else {
         this.layer += this.id & -65536;
      }

      this.isHidden = var1.readUnsignedByte() == 1;
      this.onHiddenChanged(-1);
      if(this.type == 0) {
         this.scrollWidth = var1.readUnsignedShort();
         this.scrollHeight = var1.readUnsignedShort();
         this.noClickThrough = var1.readUnsignedByte() == 1;
      }

      if(this.type == 5) {
         this.graphic = var1.readInt();
         this.angle2d = var1.readUnsignedShort();
         this.tile = var1.readUnsignedByte() == 1;
         this.trans = var1.readUnsignedByte();
         this.outline = var1.readUnsignedByte();
         this.shadow = var1.readInt();
         this.vflip = var1.readUnsignedByte() == 1;
         this.hflip = var1.readUnsignedByte() == 1;
      }

      if(this.type == 6) {
         this.modelType = 1;
         this.modelId = var1.readUnsignedShort();
         if(this.modelId == 65535) {
            this.modelId = -1;
         }

         this.offsetX2d = var1.method5089();
         this.offsetY2d = var1.method5089();
         this.xan2d = var1.readUnsignedShort();
         this.yan2d = var1.readUnsignedShort();
         this.zan2d = var1.readUnsignedShort();
         this.zoom2d = var1.readUnsignedShort();
         this.animation = var1.readUnsignedShort();
         if(this.animation == 65535) {
            this.animation = -1;
         }

         this.orthogonal = var1.readUnsignedByte() == 1;
         var1.readUnsignedShort();
         if(this.sizeXmode != 0) {
            this.field2728 = var1.readUnsignedShort();
         }

         if(this.sizeYmode != 0) {
            var1.readUnsignedShort();
         }
      }

      if(this.type == 4) {
         this.fontId = var1.readUnsignedShort();
         if(this.fontId == 65535) {
            this.fontId = -1;
         }

         this.text = var1.readString();
         this.lineHeight = var1.readUnsignedByte();
         this.horizTextAlign = var1.readUnsignedByte();
         this.vertTextAlign = var1.readUnsignedByte();
         this.textShadow = var1.readUnsignedByte() == 1;
         this.color = var1.readInt();
      }

      if(this.type == 3) {
         this.color = var1.readInt();
         this.filled = var1.readUnsignedByte() == 1;
         this.trans = var1.readUnsignedByte();
      }

      if(this.type == 9) {
         this.lineWidth = var1.readUnsignedByte();
         this.color = var1.readInt();
         this.lineDirection = var1.readUnsignedByte() == 1;
      }

      this.activeProperties = var1.method5090();
      this.opBase = var1.readString();
      int var2 = var1.readUnsignedByte();
      if(var2 > 0) {
         this.ops = new String[var2];

         for(int var3 = 0; var3 < var2; ++var3) {
            this.ops[var3] = var1.readString();
         }
      }

      this.dragDeadZone = var1.readUnsignedByte();
      this.dragDeadTime = var1.readUnsignedByte();
      this.dragRenderBehavior = var1.readUnsignedByte() == 1;
      this.targetVerb = var1.readString();
      this.onLoadListener = this.method5647(var1);
      this.onMouseOverListener = this.method5647(var1);
      this.onMouseLeaveListener = this.method5647(var1);
      this.onTargetLeaveListener = this.method5647(var1);
      this.onTargetEnterListener = this.method5647(var1);
      this.onVarTransmitListener = this.method5647(var1);
      this.onInvTransmitListener = this.method5647(var1);
      this.onStatTransmitListener = this.method5647(var1);
      this.onTimerListener = this.method5647(var1);
      this.onOpListener = this.method5647(var1);
      this.onMouseRepeatListener = this.method5647(var1);
      this.onClickListener = this.method5647(var1);
      this.onClickRepeatListener = this.method5647(var1);
      this.onReleaseListener = this.method5647(var1);
      this.onHoldListener = this.method5647(var1);
      this.onDragListener = this.method5647(var1);
      this.onDragCompleteListener = this.method5647(var1);
      this.onScrollWheelListener = this.method5647(var1);
      this.varTransmitTriggers = this.method5648(var1);
      this.invTransmitTriggers = this.method5648(var1);
      this.statTransmitTriggers = this.method5648(var1);
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "(IB)Lld;",
      garbageValue = "16"
   )
   public SpritePixels method5644(int var1) {
      field2740 = false;
      if(var1 >= 0 && var1 < this.field2760.length) {
         int var2 = this.field2760[var1];
         if(var2 == -1) {
            return null;
         } else {
            SpritePixels var3 = (SpritePixels)field2683.method635((long)var2);
            if(var3 != null) {
               return var3;
            } else {
               var3 = IDKType.method5403(field2682, var2, 0, 1376775410);
               if(var3 != null) {
                  field2683.method628(var3, (long)var2);
               } else {
                  field2740 = true;
               }

               return var3;
            }
         }
      } else {
         return null;
      }
   }

   @ObfuscatedName("r")
   @ObfuscatedSignature(
      signature = "(Lju;IZLil;B)Ldv;",
      garbageValue = "-67"
   )
   public Model method5653(Sequence var1, int var2, boolean var3, PlayerComposition var4) {
      field2740 = false;
      int var5;
      int var6;
      if(var3) {
         var5 = this.field2716;
         var6 = this.field2735;
      } else {
         var5 = this.modelType;
         var6 = this.modelId;
      }

      if(var5 == 0) {
         return null;
      } else if(var5 == 1 && var6 == -1) {
         return null;
      } else {
         Model var7 = (Model)componentModelCache.method635((long)(var6 + (var5 << 16)));
         if(var7 == null) {
            ModelData var8;
            if(var5 == 1) {
               var8 = ModelData.method2779(LoginProt.field2329, var6, 0);
               if(var8 == null) {
                  field2740 = true;
                  return null;
               }

               var7 = var8.toModel(64, 768, -50, -10, -50);
            }

            if(var5 == 2) {
               var8 = ZoneProt.method374(var6).method4791();
               if(var8 == null) {
                  field2740 = true;
                  return null;
               }

               var7 = var8.toModel(64, 768, -50, -10, -50);
            }

            if(var5 == 3) {
               if(var4 == null) {
                  return null;
               }

               var8 = var4.method819();
               if(var8 == null) {
                  field2740 = true;
                  return null;
               }

               var7 = var8.toModel(64, 768, -50, -10, -50);
            }

            if(var5 == 4) {
               ObjType var9 = class79.method1074(var6);
               var8 = var9.method2219(10);
               if(var8 == null) {
                  field2740 = true;
                  return null;
               }

               var7 = var8.toModel(var9.ambient + 64, var9.contrast * 5 + 768, -50, -10, -50);
            }

            componentModelCache.method628(var7, (long)(var6 + (var5 << 16)));
         }

         if(var1 != null) {
            var7 = var1.method5013(var7, var2);
         }

         return var7;
      }
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "(III)V",
      garbageValue = "-400508768"
   )
   public void method5654(int var1, int var2) {
      int var3 = this.objIds[var2];
      this.objIds[var2] = this.objIds[var1];
      this.objIds[var1] = var3;
      var3 = this.objCounts[var2];
      this.objCounts[var2] = this.objCounts[var1];
      this.objCounts[var1] = var3;
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(Lgx;B)[I",
      garbageValue = "-3"
   )
   int[] method5648(Packet var1) {
      int var2 = var1.readUnsignedByte();
      if(var2 == 0) {
         return null;
      } else {
         int[] var3 = new int[var2];

         for(int var4 = 0; var4 < var2; ++var4) {
            var3[var4] = var1.readInt();
         }

         return var3;
      }
   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "(Lgx;I)[Ljava/lang/Object;",
      garbageValue = "-1629081563"
   )
   Object[] method5647(Packet var1) {
      int var2 = var1.readUnsignedByte();
      if(var2 == 0) {
         return null;
      } else {
         Object[] var3 = new Object[var2];

         for(int var4 = 0; var4 < var2; ++var4) {
            int var5 = var1.readUnsignedByte();
            if(var5 == 0) {
               var3[var4] = new Integer(var1.readInt());
            } else if(var5 == 1) {
               var3[var4] = var1.readString();
            }
         }

         this.hasHook = true;
         return var3;
      }
   }

   @ObfuscatedName("b")
   @ObfuscatedSignature(
      signature = "(ZB)Lld;"
   )
   public SpritePixels method5650(boolean var1, byte var2) {
      if(this.getSpriteId() != -1) {
         net.runelite.api.SpritePixels var3 = (net.runelite.api.SpritePixels) client.widgetSpriteOverrides.get(Integer.valueOf(this.getId()));
         if(var3 != null) {
            return (SpritePixels)((RSSpritePixels)var3);
         }
      }

      return (SpritePixels)this.copy$getWidgetSprite(var1, var2);
   }

   @ObfuscatedName("o")
   @ObfuscatedSignature(
      signature = "(ILjava/lang/String;I)V",
      garbageValue = "1736772243"
   )
   public void method5664(int var1, String var2) {
      if(this.ops == null || this.ops.length <= var1) {
         String[] var3 = new String[var1 + 1];
         if(this.ops != null) {
            for(int var4 = 0; var4 < this.ops.length; ++var4) {
               var3[var4] = this.ops[var4];
            }
         }

         this.ops = var3;
      }

      this.ops[var1] = var2;
   }

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      signature = "(I)Lkt;",
      garbageValue = "42859454"
   )
   public Font method5669() {
      field2740 = false;
      if(this.fontId == -1) {
         return null;
      } else {
         Font var1 = (Font)componentFontCache.method635((long)this.fontId);
         if(var1 != null) {
            return var1;
         } else {
            var1 = CacheFile.method5606(field2682, class192.field2478, this.fontId, 0);
            if(var1 != null) {
               componentFontCache.method628(var1, (long)this.fontId);
            } else {
               field2740 = true;
            }

            return var1;
         }
      }
   }

   @ObfuscatedName("t")
   @ObfuscatedSignature(
      signature = "(ZI)Lhk;",
      garbageValue = "1436900103"
   )
   public class186 method5675(boolean var1) {
      if(this.field2736 == -1) {
         var1 = false;
      }

      int var2 = var1?this.field2736:this.graphic;
      if(var2 == -1) {
         return null;
      } else {
         long var3 = ((this.hflip?1L:0L) << 39) + ((long)this.outline << 36) + (long)var2 + ((this.vflip?1L:0L) << 38) + ((long)this.shadow << 40);
         class186 var5 = (class186)field2686.method635(var3);
         if(var5 != null) {
            return var5;
         } else {
            SpritePixels var6 = this.method5650(var1, (byte)-28);
            if(var6 == null) {
               return null;
            } else {
               SpritePixels var7 = var6.method1301();
               int[] var8 = new int[var7.height];
               int[] var9 = new int[var7.height];

               for(int var10 = 0; var10 < var7.height; ++var10) {
                  int var11 = 0;
                  int var12 = var7.width;

                  int var13;
                  for(var13 = 0; var13 < var7.width; ++var13) {
                     if(var7.pixels[var13 + var10 * var7.width] == 0) {
                        var11 = var13;
                        break;
                     }
                  }

                  for(var13 = var7.width - 1; var13 >= var11; --var13) {
                     if(var7.pixels[var13 + var10 * var7.width] == 0) {
                        var12 = var13 + 1;
                        break;
                     }
                  }

                  var8[var10] = var11;
                  var9[var10] = var12 - var11;
               }

               var5 = new class186(var7.width, var7.height, var9, var8, var2);
               field2686.method628(var5, var3);
               return var5;
            }
         }
      }
   }

   public Rectangle getBounds() {
      Point var1 = this.getCanvasLocation();
      return new Rectangle(var1.getX(), var1.getY(), this.getWidth(), this.getHeight());
   }

   public String getRSText() {
      return this.text;
   }

   public String getRSName() {
      return this.opBase;
   }

   public int getParentId() {
      if(!$assertionsDisabled && !ItemContainer.clientInstance.isClientThread()) {
         throw new AssertionError();
      } else {
         int var1 = this.getRSParentId();
         if(var1 != -1) {
            return var1;
         } else {
            int var2 = this.getId();
            if(WidgetInfo.TO_GROUP(var2) == ItemContainer.clientInstance.getWidgetRoot()) {
               return -1;
            } else {
               int var3 = this.rl$parentId;
               if(var3 != -1) {
                  RSHashTable var4 = ItemContainer.clientInstance.getComponentTable();
                  WidgetNode var5 = (WidgetNode)var4.get((long)var3);
                  if(var5 != null && var5.getId() == WidgetInfo.TO_GROUP(var2)) {
                     return var3;
                  }

                  this.rl$parentId = -1;
               }

               int var13 = WidgetInfo.TO_GROUP(this.getId());
               RSHashTable var14 = ItemContainer.clientInstance.getComponentTable();
               RSNode[] var6 = var14.getBuckets();
               RSNode[] var7 = var6;
               int var8 = var6.length;

               for(int var9 = 0; var9 < var8; ++var9) {
                  RSNode var10 = var7[var9];

                  for(Object var11 = var10.getNext(); var11 != var10; var11 = ((net.runelite.api.Node)var11).getNext()) {
                     WidgetNode var12 = (WidgetNode)var11;
                     if(var13 == var12.getId()) {
                        return (int)var12.getHash();
                     }
                  }
               }

               return -1;
            }
         }
      }
   }

   public int[] getItemIds() {
      return this.objIds;
   }

   public Point getCanvasLocation() {
      return new Point(this.rl$x, this.rl$y);
   }

   public int getSpriteId() {
      return this.graphic;
   }

   public RSWidget[] getChildren() {
      return this.children;
   }

   public int getRSParentId() {
      return this.layer;
   }

   public int getId() {
      return this.id;
   }

   public void setRSName(String var1) {
      this.opBase = var1;
   }

   public int[] getItemQuantities() {
      return this.objCounts;
   }

   public boolean isSelfHidden() {
      return this.isHidden;
   }

   public Widget getParent() {
      int var1 = this.getParentId();
      return var1 == -1?null:ItemContainer.clientInstance.getWidget(WidgetInfo.TO_GROUP(var1), WidgetInfo.TO_CHILD(var1));
   }

   @ObfuscatedSignature(
      signature = "(ZB)Lld;"
   )
   public SpritePixels copy$getWidgetSprite(boolean var1, byte var2) {
      field2740 = false;
      int var3;
      if(var1) {
         var3 = this.field2736;
      } else {
         var3 = this.graphic;
      }

      if(var3 == -1) {
         return null;
      } else {
         long var4 = ((this.hflip?1L:0L) << 39) + ((this.vflip?1L:0L) << 38) + (long)var3 + ((long)this.outline << 36) + ((long)this.shadow << 40);
         SpritePixels var6 = (SpritePixels)field2683.method635(var4);
         if(var6 != null) {
            return var6;
         } else {
            var6 = IDKType.method5403(field2682, var3, 0, 1220657407);
            if(var6 == null) {
               field2740 = true;
               return null;
            } else {
               if(this.vflip) {
                  var6.method1306();
               }

               if(this.hflip) {
                  var6.method1305();
               }

               if(this.outline > 0) {
                  var6.method1304(this.outline);
               }

               if(this.outline >= 1) {
                  var6.method1307(1);
               }

               if(this.outline >= 2) {
                  var6.method1307(16777215);
               }

               if(this.shadow != 0) {
                  var6.method1308(this.shadow);
               }

               field2683.method628(var6, var4);
               return var6;
            }
         }
      }
   }

   public int getWidth() {
      return this.width;
   }

   public WidgetItem getWidgetItem(int var1) {
      int[] var2 = this.getItemIds();
      int[] var3 = this.getItemQuantities();
      if(var2 != null && var3 != null) {
         int var4 = this.getWidth();
         int var5 = this.getXPitch();
         int var6 = this.getYPitch();
         int var7 = var2[var1];
         int var8 = var3[var1];
         Point var9 = this.getCanvasLocation();
         if(var7 > 0 && var8 > 0 && var4 > 0) {
            int var10 = var1 / var4;
            int var11 = var1 % var4;
            int var12 = var9.getX() + (32 + var5) * var11;
            int var13 = var9.getY() + (32 + var6) * var10;
            Rectangle var14 = new Rectangle(var12 - 1, var13 - 1, 32, 32);
            return new WidgetItem(var7 - 1, var8, var1, var14, this);
         } else {
            return null;
         }
      } else {
         return null;
      }
   }

   public int getHeight() {
      return this.height;
   }

   public int getXPitch() {
      return this.paddingX;
   }

   public Widget[] getNestedChildren() {
      if(!$assertionsDisabled && !ItemContainer.clientInstance.isClientThread()) {
         throw new AssertionError();
      } else if(this.getRSParentId() == this.getId()) {
         return new Widget[0];
      } else {
         RSHashTable var1 = ItemContainer.clientInstance.getComponentTable();
         WidgetNode var2 = (WidgetNode)var1.get((long)this.getId());
         if(var2 == null) {
            return new ComponentType[0];
         } else {
            int var3 = var2.getId();
            ArrayList var4 = new ArrayList();
            RSWidget[] var5 = ItemContainer.clientInstance.getGroup(var3);
            int var6 = var5.length;

            for(int var7 = 0; var7 < var6; ++var7) {
               RSWidget var8 = var5[var7];
               if(var8 != null && var8.getRSParentId() == -1) {
                  var4.add(var8);
               }
            }

            return (Widget[])var4.toArray(new ComponentType[var4.size()]);
         }
      }
   }

   public int getYPitch() {
      return this.paddingY;
   }

   public void broadcastHidden(boolean var1) {
      WidgetHiddenChanged var2 = new WidgetHiddenChanged();
      var2.setWidget(this);
      var2.setHidden(var1);
      ItemContainer.clientInstance.getCallbacks().post(var2);
      RSWidget[] var3 = this.getChildren();
      int var6;
      if(var3 != null) {
         RSWidget[] var4 = var3;
         int var5 = var3.length;

         for(var6 = 0; var6 < var5; ++var6) {
            RSWidget var7 = var4[var6];
            if(var7 != null && !var7.isSelfHidden()) {
               var7.broadcastHidden(var1);
            }
         }
      }

      Widget[] var11 = this.getNestedChildren();
      Widget[] var9 = var11;
      var6 = var11.length;

      for(int var10 = 0; var10 < var6; ++var10) {
         Widget var8 = var9[var10];
         if(var8 != null && !var8.isSelfHidden()) {
            ((RSWidget)var8).broadcastHidden(var1);
         }
      }

   }

   public void setChildren(Widget[] var1) {
      this.children = (ComponentType[])var1;
   }

   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1"
   )
   public void onPositionChanged(int var1) {
      int var2 = this.getId();
      if(var2 != -1) {
         int var3 = ItemContainer.clientInstance.getGameCycle();
         if(var3 != rl$widgetLastPosChanged) {
            rl$widgetLastPosChanged = var3;
            ItemContainer.clientInstance.getLogger().trace("Posting widget position changed");
            WidgetPositioned var4 = new WidgetPositioned();
            ItemContainer.clientInstance.getCallbacks().postDeferred(var4);
         }
      }
   }

   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1"
   )
   public void onHiddenChanged(int var1) {
      int var2 = this.getId();
      if(var2 != -1) {
         Widget var3 = this.getParent();
         if(var3 != null) {
            if(var3.isHidden()) {
               return;
            }
         } else if(WidgetInfo.TO_GROUP(var2) != ItemContainer.clientInstance.getWidgetRoot()) {
            return;
         }

         this.broadcastHidden(this.isSelfHidden());
      }
   }

   private void rl$$init() {
      this.rl$parentId = -1;
      this.rl$x = -1;
      this.rl$y = -1;
   }

   private void rl$$init1() {
   }

   public void setRenderParentId(int var1) {
      this.rl$parentId = var1;
   }

   public void setRenderX(int var1) {
      this.rl$x = var1;
   }

   public void setRenderY(int var1) {
      this.rl$y = var1;
   }

   public String getText() {
      return this.getRSText().replace(' ', ' ');
   }

   public String getName() {
      return this.getRSName().replace(' ', ' ');
   }

   public void setName(String var1) {
      this.setRSName(var1.replace(' ', ' '));
   }

   public boolean isHidden() {
      if(!$assertionsDisabled && !ItemContainer.clientInstance.isClientThread()) {
         throw new AssertionError();
      } else if(this.isSelfHidden()) {
         return true;
      } else {
         Widget var1 = this.getParent();
         if(var1 == null) {
            if(WidgetInfo.TO_GROUP(this.getId()) != ItemContainer.clientInstance.getWidgetRoot()) {
               return true;
            }
         } else if(var1.isHidden()) {
            return true;
         }

         return false;
      }
   }

   public Collection getWidgetItems() {
      int[] var1 = this.getItemIds();
      if(var1 == null) {
         return null;
      } else {
         ArrayList var2 = new ArrayList(var1.length);

         for(int var3 = 0; var3 < var1.length; ++var3) {
            WidgetItem var4 = this.getWidgetItem(var3);
            if(var4 != null) {
               var2.add(var4);
            }
         }

         return var2;
      }
   }

   public Widget getChild(int var1) {
      RSWidget[] var2 = this.getChildren();
      return var2 != null && var2[var1] != null?var2[var1]:null;
   }

   public Widget[] getDynamicChildren() {
      RSWidget[] var1 = this.getChildren();
      if(var1 == null) {
         return new Widget[0];
      } else {
         ArrayList var2 = new ArrayList();
         RSWidget[] var3 = var1;
         int var4 = var1.length;

         for(int var5 = 0; var5 < var4; ++var5) {
            RSWidget var6 = var3[var5];
            if(var6 != null && var6.getRSParentId() == this.getId()) {
               var2.add(var6);
            }
         }

         return (Widget[])var2.toArray(new Widget[var2.size()]);
      }
   }

   public Widget[] getStaticChildren() {
      if(this.getRSParentId() == this.getId()) {
         return new Widget[0];
      } else {
         ArrayList var1 = new ArrayList();
         RSWidget[] var2 = ItemContainer.clientInstance.getGroup(WidgetInfo.TO_GROUP(this.getId()));
         int var3 = var2.length;

         for(int var4 = 0; var4 < var3; ++var4) {
            RSWidget var5 = var2[var4];
            if(var5 != null && var5.getRSParentId() == this.getId()) {
               var1.add(var5);
            }
         }

         return (Widget[])var1.toArray(new ComponentType[var1.size()]);
      }
   }

   public boolean contains(Point var1) {
      Rectangle var2 = this.getBounds();
      return var2 != null && var2.contains(new java.awt.Point(var1.getX(), var1.getY()));
   }

   public Widget createChild(int var1, int var2) {
      if(!$assertionsDisabled && !ItemContainer.clientInstance.isClientThread()) {
         throw new AssertionError();
      } else {
         RSWidget var3 = ItemContainer.clientInstance.createWidget();
         var3.setType(var2);
         var3.setParentId(this.getId());
         var3.setId(this.getId());
         var3.setIsIf3(true);
         Object var4 = this.getChildren();
         if(var1 < 0) {
            if(var4 == null) {
               var1 = 0;
            } else {
               var1 = 0;

               for(int var6 = ((Object[])var4).length - 1; var6 >= 0; --var6) {
                  if(((Object[])var4)[var6] != null) {
                     var1 = var6 + 1;
                     break;
                  }
               }
            }
         }

         if(var4 == null) {
            var4 = new ComponentType[var1 + 1];
            this.setChildren((Widget[])var4);
         } else if(((Object[])var4).length <= var1) {
            ComponentType[] var5 = new ComponentType[var1 + 1];
            System.arraycopy(var4, 0, var5, 0, ((Object[])var4).length);
            var4 = var5;
            this.setChildren(var5);
         }

         ((Object[])var4)[var1] = var3;
         var3.setIndex(var1);
         return var3;
      }
   }

   public void revalidate() {
      if(!$assertionsDisabled && !ItemContainer.clientInstance.isClientThread()) {
         throw new AssertionError();
      } else {
         ItemContainer.clientInstance.revalidateWidget(this);
      }
   }

   public void revalidateScroll() {
      if(!$assertionsDisabled && !ItemContainer.clientInstance.isClientThread()) {
         throw new AssertionError();
      } else {
         ItemContainer.clientInstance.revalidateWidget(this);
         ItemContainer.clientInstance.revalidateWidgetScroll(ItemContainer.clientInstance.getWidgets()[WidgetInfo.TO_GROUP(this.getId())], this, false);
      }
   }

   public void deleteAllChildren() {
      if(this.getChildren() != null) {
         Arrays.fill(this.getChildren(), (Object)null);
      }

   }

   public void setIsIf3(boolean var1) {
      this.isIf3 = var1;
   }

   public boolean isIf3() {
      return this.isIf3;
   }

   public void setId(int var1) {
      this.id = var1;
   }

   public void setIndex(int var1) {
      this.index = var1;
   }

   public int getIndex() {
      return this.index;
   }

   public void setType(int var1) {
      this.type = var1;
   }

   public int getType() {
      return this.type;
   }

   public void setContentType(int var1) {
      this.clientcode = var1;
   }

   public int getContentType() {
      return this.clientcode;
   }

   public void setXPositionMode(int var1) {
      this.posXmode = var1;
   }

   public int getXPositionMode() {
      return this.posXmode;
   }

   public void setYPositionMode(int var1) {
      this.posYmode = var1;
   }

   public int getYPositionMode() {
      return this.posYmode;
   }

   public void setWidthMode(int var1) {
      this.sizeXmode = var1;
   }

   public int getWidthMode() {
      return this.sizeXmode;
   }

   public void setHeightMode(int var1) {
      this.sizeYmode = var1;
   }

   public int getHeightMode() {
      return this.sizeYmode;
   }

   public void setOriginalX(int var1) {
      this.posX = var1;
   }

   public int getOriginalX() {
      return this.posX;
   }

   public void setOriginalY(int var1) {
      this.posY = var1;
   }

   public int getOriginalY() {
      return this.posY;
   }

   public void setOriginalWidth(int var1) {
      this.sizeX = var1;
   }

   public int getOriginalWidth() {
      return this.sizeX;
   }

   public void setOriginalHeight(int var1) {
      this.sizeY = var1;
   }

   public int getOriginalHeight() {
      return this.sizeY;
   }

   public void setRelativeX(int var1) {
      this.x = var1;
   }

   public int getRelativeX() {
      return this.x;
   }

   public void setRelativeY(int var1) {
      this.y = var1;
   }

   public int getRelativeY() {
      return this.y;
   }

   public void setWidth(int var1) {
      this.width = var1;
   }

   public void setHeight(int var1) {
      this.height = var1;
   }

   public void setParentId(int var1) {
      this.layer = var1;
   }

   public void setHidden(boolean var1) {
      this.isHidden = var1;
   }

   public void setScrollX(int var1) {
      this.scrollX = var1;
   }

   public int getScrollX() {
      return this.scrollX;
   }

   public void setScrollY(int var1) {
      this.scrollY = var1;
   }

   public int getScrollY() {
      return this.scrollY;
   }

   public void setScrollWidth(int var1) {
      this.scrollWidth = var1;
   }

   public int getScrollWidth() {
      return this.scrollWidth;
   }

   public void setScrollHeight(int var1) {
      this.scrollHeight = var1;
   }

   public int getScrollHeight() {
      return this.scrollHeight;
   }

   public void setTextColor(int var1) {
      this.color = var1;
   }

   public int getTextColor() {
      return this.color;
   }

   public void setFilled(boolean var1) {
      this.filled = var1;
   }

   public boolean isFilled() {
      return this.filled;
   }

   public void setOpacity(int var1) {
      this.trans = var1;
   }

   public int getOpacity() {
      return this.trans;
   }

   public void setSpriteId(int var1) {
      this.graphic = var1;
   }

   public void setBorderType(int var1) {
      this.outline = var1;
   }

   public int getBorderType() {
      return this.outline;
   }

   public int getModelType() {
      return this.modelType;
   }

   public int getModelId() {
      return this.modelId;
   }

   public int getRotationX() {
      return this.xan2d;
   }

   public int getRotationZ() {
      return this.yan2d;
   }

   public int getRotationY() {
      return this.zan2d;
   }

   public void setItemQuantityMode(int var1) {
      this.objNumMode = var1;
   }

   public int getItemQuantityMode() {
      return this.objNumMode;
   }

   public void setFontId(int var1) {
      this.fontId = var1;
   }

   public int getFontId() {
      return this.fontId;
   }

   public void setText(String var1) {
      this.text = var1;
   }

   public void setXTextAlignment(int var1) {
      this.horizTextAlign = var1;
   }

   public int getXTextAlignment() {
      return this.horizTextAlign;
   }

   public void setYTextAlignment(int var1) {
      this.vertTextAlign = var1;
   }

   public int getYTextAlignment() {
      return this.vertTextAlign;
   }

   public void setTextShadowed(boolean var1) {
      this.textShadow = var1;
   }

   public boolean getTextShadowed() {
      return this.textShadow;
   }

   public void setClickMask(int var1) {
      this.activeProperties = var1;
   }

   public int getClickMask() {
      return this.activeProperties;
   }

   public String[] getActions() {
      return this.ops;
   }

   public void setDragDeadZone(int var1) {
      this.dragDeadZone = var1;
   }

   public int getDragDeadZone() {
      return this.dragDeadZone;
   }

   public void setDragDeadTime(int var1) {
      this.dragDeadTime = var1;
   }

   public int getDragDeadTime() {
      return this.dragDeadTime;
   }

   public void setTargetVerb(String var1) {
      this.targetVerb = var1;
   }

   public String getTargetVerb() {
      return this.targetVerb;
   }

   public void setHasListener(boolean var1) {
      this.hasHook = var1;
   }

   public boolean hasListener() {
      return this.hasHook;
   }

   public Object[] getOnLoadListener() {
      return this.onLoadListener;
   }

   public void setOnMouseOverListener(Object[] var1) {
      this.onMouseOverListener = var1;
   }

   public void setOnMouseRepeatListener(Object[] var1) {
      this.onMouseRepeatListener = var1;
   }

   public void setOnMouseLeaveListener(Object[] var1) {
      this.onMouseLeaveListener = var1;
   }

   public void setOnTargetEnterListener(Object[] var1) {
      this.onTargetEnterListener = var1;
   }

   public void setOnTargetLeaveListener(Object[] var1) {
      this.onTargetLeaveListener = var1;
   }

   public void setOnTimerListener(Object[] var1) {
      this.onTimerListener = var1;
   }

   public void setOnOpListener(Object[] var1) {
      this.onOpListener = var1;
   }

   public void setOnKeyListener(Object[] var1) {
      this.onKeyListener = var1;
   }

   public Object[] getOnKeyListener() {
      return this.onKeyListener;
   }

   public void setOnDialogAbortListener(Object[] var1) {
      this.onDialogAbortListener = var1;
   }

   public void setItemId(int var1) {
      this.linkObjType = var1;
   }

   public int getItemId() {
      return this.linkObjType;
   }

   public void setItemQuantity(int var1) {
      this.linkObjCount = var1;
   }

   public int getItemQuantity() {
      return this.linkObjCount;
   }

   public int getBoundsIndex() {
      return this.boundsIndex;
   }

   public void setNoClickThrough(boolean var1) {
      this.noClickThrough = var1;
   }

   public boolean getNoClickThrough() {
      return this.noClickThrough;
   }

   public void setNoScrollThrough(boolean var1) {
      this.noScrollThrough = var1;
   }

   @Override
   public int getLineHeight() {
      return lineHeight;
   }

   @Override
   public void setLineHeight(int height) {
      lineHeight = height;
   }

   @Override
   public int getLineWidth() {
      return lineWidth;
   }

   @Override
   public void setLineWidth(int width) {
      lineWidth = width;
   }

   @Override
   public boolean getLineDirection() {
      return lineDirection;
   }

   @Override
   public void setLineDirection(boolean direction) {
      lineDirection = direction;
   }

   public boolean getNoScrollThrough() {
      return this.noScrollThrough;
   }

   public RSFontTypeFace getFont() {
      return this.method5669();
   }

   public void setAction(int var1, String var2) {
      this.method5664(var1, var2);
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      signature = "(Lgx;I)V",
      garbageValue = "-1392065342"
   )
   public void method5645(Packet var1) {
      this.isIf3 = false;
      this.type = var1.readUnsignedByte();
      this.buttonType = var1.readUnsignedByte();
      this.clientcode = var1.readUnsignedShort();
      this.posX = var1.method5089();
      this.posY = var1.method5089();
      this.sizeX = var1.readUnsignedShort();
      this.sizeY = var1.readUnsignedShort();
      this.trans = var1.readUnsignedByte();
      this.layer = var1.readUnsignedShort();
      if(this.layer == 65535) {
         this.layer = -1;
      } else {
         this.layer += this.id & -65536;
      }

      this.field2810 = var1.readUnsignedShort();
      if(this.field2810 == 65535) {
         this.field2810 = -1;
      }

      int var2 = var1.readUnsignedByte();
      int var3;
      if(var2 > 0) {
         this.tableActions = new int[var2];
         this.field2809 = new int[var2];

         for(var3 = 0; var3 < var2; ++var3) {
            this.tableActions[var3] = var1.readUnsignedByte();
            this.field2809[var3] = var1.readUnsignedShort();
         }
      }

      var3 = var1.readUnsignedByte();
      int var4;
      int var5;
      int var6;
      if(var3 > 0) {
         this.dynamicValues = new int[var3][];

         for(var4 = 0; var4 < var3; ++var4) {
            var5 = var1.readUnsignedShort();
            this.dynamicValues[var4] = new int[var5];

            for(var6 = 0; var6 < var5; ++var6) {
               this.dynamicValues[var4][var6] = var1.readUnsignedShort();
               if(this.dynamicValues[var4][var6] == 65535) {
                  this.dynamicValues[var4][var6] = -1;
               }
            }
         }
      }

      if(this.type == 0) {
         this.scrollHeight = var1.readUnsignedShort();
         this.isHidden = var1.readUnsignedByte() == 1;
         this.onHiddenChanged(-1);
      }

      if(this.type == 1) {
         var1.readUnsignedShort();
         var1.readUnsignedByte();
      }

      if(this.type == 2) {
         this.objIds = new int[this.sizeX * this.sizeY];
         this.objCounts = new int[this.sizeX * this.sizeY];
         var4 = var1.readUnsignedByte();
         if(var4 == 1) {
            this.activeProperties |= 268435456;
         }

         var5 = var1.readUnsignedByte();
         if(var5 == 1) {
            this.activeProperties |= 1073741824;
         }

         var6 = var1.readUnsignedByte();
         if(var6 == 1) {
            this.activeProperties |= Integer.MIN_VALUE;
         }

         int var7 = var1.readUnsignedByte();
         if(var7 == 1) {
            this.activeProperties |= 536870912;
         }

         this.paddingX = var1.readUnsignedByte();
         this.paddingY = var1.readUnsignedByte();
         this.xSprites = new int[20];
         this.field2720 = new int[20];
         this.field2760 = new int[20];

         int var8;
         for(var8 = 0; var8 < 20; ++var8) {
            int var9 = var1.readUnsignedByte();
            if(var9 == 1) {
               this.xSprites[var8] = var1.method5089();
               this.field2720[var8] = var1.method5089();
               this.field2760[var8] = var1.readInt();
            } else {
               this.field2760[var8] = -1;
            }
         }

         this.if1Ops = new String[5];

         for(var8 = 0; var8 < 5; ++var8) {
            String var11 = var1.readString();
            if(var11.length() > 0) {
               this.if1Ops[var8] = var11;
               this.activeProperties |= 1 << var8 + 23;
            }
         }
      }

      if(this.type == 3) {
         this.filled = var1.readUnsignedByte() == 1;
      }

      if(this.type == 4 || this.type == 1) {
         this.horizTextAlign = var1.readUnsignedByte();
         this.vertTextAlign = var1.readUnsignedByte();
         this.lineHeight = var1.readUnsignedByte();
         this.fontId = var1.readUnsignedShort();
         if(this.fontId == 65535) {
            this.fontId = -1;
         }

         this.textShadow = var1.readUnsignedByte() == 1;
      }

      if(this.type == 4) {
         this.text = var1.readString();
         this.string1 = var1.readString();
      }

      if(this.type == 1 || this.type == 3 || this.type == 4) {
         this.color = var1.readInt();
      }

      if(this.type == 3 || this.type == 4) {
         this.field2811 = var1.readInt();
         this.field2819 = var1.readInt();
         this.field2717 = var1.readInt();
      }

      if(this.type == 5) {
         this.graphic = var1.readInt();
         this.field2736 = var1.readInt();
      }

      if(this.type == 6) {
         this.modelType = 1;
         this.modelId = var1.readUnsignedShort();
         if(this.modelId == 65535) {
            this.modelId = -1;
         }

         this.field2716 = 1;
         this.field2735 = var1.readUnsignedShort();
         if(this.field2735 == 65535) {
            this.field2735 = -1;
         }

         this.animation = var1.readUnsignedShort();
         if(this.animation == 65535) {
            this.animation = -1;
         }

         this.field2701 = var1.readUnsignedShort();
         if(this.field2701 == 65535) {
            this.field2701 = -1;
         }

         this.zoom2d = var1.readUnsignedShort();
         this.xan2d = var1.readUnsignedShort();
         this.yan2d = var1.readUnsignedShort();
      }

      if(this.type == 7) {
         this.objIds = new int[this.sizeX * this.sizeY];
         this.objCounts = new int[this.sizeY * this.sizeX];
         this.horizTextAlign = var1.readUnsignedByte();
         this.fontId = var1.readUnsignedShort();
         if(this.fontId == 65535) {
            this.fontId = -1;
         }

         this.textShadow = var1.readUnsignedByte() == 1;
         this.color = var1.readInt();
         this.paddingX = var1.method5089();
         this.paddingY = var1.method5089();
         var4 = var1.readUnsignedByte();
         if(var4 == 1) {
            this.activeProperties |= 1073741824;
         }

         this.if1Ops = new String[5];

         for(var5 = 0; var5 < 5; ++var5) {
            String var10 = var1.readString();
            if(var10.length() > 0) {
               this.if1Ops[var5] = var10;
               this.activeProperties |= 1 << var5 + 23;
            }
         }
      }

      if(this.type == 8) {
         this.text = var1.readString();
      }

      if(this.buttonType == 2 || this.type == 2) {
         this.targetVerb = var1.readString();
         this.spellName = var1.readString();
         var4 = var1.readUnsignedShort() & 63;
         this.activeProperties |= var4 << 11;
      }

      if(this.buttonType == 1 || this.buttonType == 4 || this.buttonType == 5 || this.buttonType == 6) {
         this.tooltip = var1.readString();
         if(this.tooltip.length() == 0) {
            if(this.buttonType == 1) {
               this.tooltip = "Ok";
            }

            if(this.buttonType == 4) {
               this.tooltip = "Select";
            }

            if(this.buttonType == 5) {
               this.tooltip = "Select";
            }

            if(this.buttonType == 6) {
               this.tooltip = "Continue";
            }
         }
      }

      if(this.buttonType == 1 || this.buttonType == 4 || this.buttonType == 5) {
         this.activeProperties |= 4194304;
      }

      if(this.buttonType == 6) {
         this.activeProperties |= 1;
      }

   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "([BI)Ljava/lang/String;",
      garbageValue = "2075534604"
   )
   public static String method5691(byte[] var0) {
      int var2 = var0.length;
      StringBuilder var3 = new StringBuilder();

      for(int var4 = 0; var4 < var2 + 0; var4 += 3) {
         int var5 = var0[var4] & 255;
         var3.append(class52.field3807[var5 >>> 2]);
         if(var4 < var2 - 1) {
            int var6 = var0[var4 + 1] & 255;
            var3.append(class52.field3807[(var5 & 3) << 4 | var6 >>> 4]);
            if(var4 < var2 - 2) {
               int var7 = var0[var4 + 2] & 255;
               var3.append(class52.field3807[(var6 & 15) << 2 | var7 >>> 6]).append(class52.field3807[var7 & 63]);
            } else {
               var3.append(class52.field3807[(var6 & 15) << 2]).append("=");
            }
         } else {
            var3.append(class52.field3807[(var5 & 3) << 4]).append("==");
         }
      }

      String var1 = var3.toString();
      return var1;
   }

   private static void rl$$clinit() {
      $assertionsDisabled = !client.class.desiredAssertionStatus();
   }
}
