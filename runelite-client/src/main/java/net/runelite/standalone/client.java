package net.runelite.standalone;

import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import net.runelite.api.Point;
import net.runelite.api.*;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.*;
import net.runelite.api.hooks.Callbacks;
import net.runelite.api.hooks.DrawCallbacks;
import net.runelite.api.vars.AccountType;
import net.runelite.api.widgets.Widget;
import net.runelite.api.widgets.WidgetInfo;
import net.runelite.api.widgets.WidgetItem;
import net.runelite.client.callback.Hooks;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.api.*;
import netscape.javascript.JSObject;
import org.jetbrains.annotations.Nullable;
import org.slf4j.Logger;

import javax.inject.Inject;
import javax.inject.Named;
import java.awt.*;
import java.io.*;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.Socket;
import java.net.URL;
import java.util.List;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@ObfuscatedName("client")
public final class client extends GameEngine implements class245, RSClient {
   @ObfuscatedName("pn")
   @ObfuscatedSignature(
      signature = "[Lld;"
   )
   static SpritePixels[] mapIcons;
   @ObfuscatedName("nj")
   static int[] changedSkills;
   @ObfuscatedName("mu")
   @ObfuscatedGetter(
      intValue = -1318049485
   )
   static int energy;
   @ObfuscatedName("ml")
   @ObfuscatedGetter(
      intValue = 394154065
   )
   static int weight;
   @ObfuscatedName("re")
   @ObfuscatedGetter(
      intValue = 2112570043
   )
   static int Viewport_xOffset;
   @ObfuscatedName("ry")
   @ObfuscatedGetter(
      intValue = -1373665093
   )
   static int Viewport_yOffset;
   @ObfuscatedName("oq")
   @ObfuscatedGetter(
      intValue = -400556095
   )
   static int gameDrawingMode;
   @ObfuscatedName("sj")
   @ObfuscatedSignature(
      signature = "[Lb;"
   )
   static GrandExchangeOffer[] grandExchangeOffers;
   @ObfuscatedName("nb")
   @ObfuscatedGetter(
      intValue = 64506027
   )
   static int chatCycle;
   @ObfuscatedName("ri")
   @ObfuscatedGetter(
      intValue = 1091657233
   )
   static int viewportHeight;
   @ObfuscatedName("qi")
   static int[] queuedSoundEffectIDs;
   @ObfuscatedName("nc")
   static boolean draggingWidget;
   @ObfuscatedName("qh")
   @ObfuscatedSignature(
      signature = "[Lcu;"
   )
   static SoundEffect[] audioEffects;
   @ObfuscatedName("nw")
   @ObfuscatedGetter(
      intValue = 321367859
   )
   static int changedSkillsCount;
   @ObfuscatedName("qx")
   static int[] unknownSoundValues1;
   @ObfuscatedName("mt")
   @ObfuscatedSignature(
      signature = "Lia;"
   )
   static ComponentType draggedOnWidget;
   @ObfuscatedName("qq")
   static int[] soundLocations;
   @ObfuscatedName("rn")
   @ObfuscatedGetter(
      intValue = -1083000669
   )
   static int scale;
   @ObfuscatedName("ru")
   @ObfuscatedGetter(
      intValue = 1854847667
   )
   static int viewportWidth;
   @ObfuscatedName("ql")
   static int[] unknownSoundValues2;
   @ObfuscatedName("ot")
   static int[] widgetPositionY;
   @ObfuscatedName("oh")
   static int[] widgetPositionX;
   @ObfuscatedName("oi")
   @ObfuscatedSignature(
      signature = "Lht;"
   )
   static HashTable serverActiveProperties;
   @ObfuscatedName("nq")
   @ObfuscatedGetter(
      intValue = 1203340891
   )
   static int cycleCntr;
   @ObfuscatedName("om")
   static boolean isResized;
   @ObfuscatedName("my")
   @ObfuscatedGetter(
      intValue = -598595791
   )
   static int toplevel;
   @ObfuscatedName("pv")
   @ObfuscatedGetter(
      intValue = -215982147
   )
   static int destinationY;
   @ObfuscatedName("pb")
   @ObfuscatedGetter(
      intValue = 457912863
   )
   static int destinationX;
   @ObfuscatedName("mk")
   @ObfuscatedSignature(
      signature = "Lia;"
   )
   static ComponentType draggedWidget;
   @ObfuscatedName("qs")
   @ObfuscatedGetter(
      intValue = -2059524069
   )
   static int queuedSoundEffectCount;
   @ObfuscatedName("mh")
   @ObfuscatedSignature(
      signature = "Lht;"
   )
   static HashTable subInterfaces;
   @ObfuscatedName("ow")
   @ObfuscatedGetter(
      intValue = 299565847
   )
   static int interfaceCount;
   @ObfuscatedName("ok")
   @ObfuscatedGetter(
      intValue = -258941087
   )
   static int field658;
   @ObfuscatedName("ob")
   @ObfuscatedGetter(
      longValue = -7434693864354422283L
   )
   static long field700;
   @ObfuscatedName("sb")
   @ObfuscatedGetter(
      intValue = -459653449
   )
   public static int field797;
   @ObfuscatedName("of")
   static boolean[] field795;
   @ObfuscatedName("os")
   static boolean[] field856;
   @ObfuscatedName("op")
   static boolean[] field923;
   @ObfuscatedName("nd")
   static boolean field830;
   @ObfuscatedName("nh")
   static boolean field904;
   @ObfuscatedName("nl")
   @ObfuscatedGetter(
      intValue = 1045471387
   )
   static int lastFriendTransmit;
   @ObfuscatedName("qw")
   static boolean field884;
   @ObfuscatedName("mj")
   @ObfuscatedGetter(
      intValue = 119991981
   )
   static int field824;
   @ObfuscatedName("mw")
   @ObfuscatedSignature(
      signature = "Lia;"
   )
   static ComponentType field793;
   @ObfuscatedName("mx")
   @ObfuscatedGetter(
      intValue = 2068877137
   )
   static int field802;
   @ObfuscatedName("ng")
   @ObfuscatedGetter(
      intValue = 2105836291
   )
   static int field757;
   @ObfuscatedName("ms")
   @ObfuscatedSignature(
      signature = "Lia;"
   )
   static ComponentType field823;
   @ObfuscatedName("or")
   static int[] widgetBoundsWidth;
   @ObfuscatedName("ne")
   @ObfuscatedGetter(
      intValue = -214502211
   )
   static int field829;
   @ObfuscatedName("py")
   @ObfuscatedGetter(
      intValue = -470404991
   )
   static int publicChatMode;
   @ObfuscatedName("mb")
   @ObfuscatedSignature(
      signature = "Lia;"
   )
   static ComponentType field821;
   @ObfuscatedName("rq")
   @ObfuscatedSignature(
      signature = "Lil;"
   )
   static PlayerComposition field918;
   @ObfuscatedName("oa")
   static int[] widgetBoundsHeight;
   @ObfuscatedName("mm")
   @ObfuscatedGetter(
      intValue = 1911137227
   )
   static int staffModLevel;
   @ObfuscatedName("oy")
   @ObfuscatedGetter(
      intValue = 1124377519
   )
   static int field847;
   @ObfuscatedName("pl")
   @ObfuscatedGetter(
      intValue = 1578223623
   )
   static int tradeMode;
   @ObfuscatedName("oc")
   @ObfuscatedSignature(
      signature = "Lhv;"
   )
   static Deque field848;
   @ObfuscatedName("ta")
   @ObfuscatedSignature(
      signature = "Lbb;"
   )
   static final class29 field818;
   @ObfuscatedName("nn")
   @ObfuscatedGetter(
      intValue = -1140202281
   )
   static int field831;
   @ObfuscatedName("na")
   @ObfuscatedGetter(
      intValue = 980809521
   )
   static int field832;
   @ObfuscatedName("lz")
   @ObfuscatedGetter(
      intValue = -364435911
   )
   static int field853;
   @ObfuscatedName("tc")
   static int[] field922;
   @ObfuscatedName("tl")
   static int[] field876;
   @ObfuscatedName("mo")
   static String targetVerb;
   @ObfuscatedName("md")
   static String opBase;
   @ObfuscatedName("nx")
   static int[] field837;
   @ObfuscatedName("ni")
   @ObfuscatedGetter(
      intValue = -720054477
   )
   static int field681;
   @ObfuscatedName("mg")
   @ObfuscatedGetter(
      intValue = -216864955
   )
   static int field673;
   @ObfuscatedName("qj")
   @ObfuscatedGetter(
      intValue = -1794188809
   )
   static int field886;
   @ObfuscatedName("sm")
   @ObfuscatedGetter(
      intValue = 1789447311
   )
   static int field861;
   @ObfuscatedName("nf")
   @ObfuscatedGetter(
      intValue = -1260723993
   )
   static int field836;
   @ObfuscatedName("nu")
   static int[] field835;
   @ObfuscatedName("sl")
   @ObfuscatedGetter(
      intValue = -532610197
   )
   static int field908;
   @ObfuscatedName("pf")
   static long[] field755;
   @ObfuscatedName("so")
   static ArrayList field919;
   @ObfuscatedName("ss")
   @ObfuscatedGetter(
      intValue = 1507808255
   )
   static int field920;
   @ObfuscatedName("qa")
   @ObfuscatedGetter(
      intValue = -1044874545
   )
   static int field680;
   @ObfuscatedName("qz")
   @ObfuscatedGetter(
      intValue = -1070677413
   )
   static int field885;
   @ObfuscatedName("qn")
   @ObfuscatedGetter(
      intValue = 1016945401
   )
   static int field882;
   @ObfuscatedName("qo")
   @ObfuscatedGetter(
      intValue = 780008963
   )
   static int minimapRenderType;
   @ObfuscatedName("qt")
   static boolean field893;
   @ObfuscatedName("pi")
   @ObfuscatedGetter(
      intValue = -1451950867
   )
   static int field758;
   @ObfuscatedName("rm")
   static short field901;
   @ObfuscatedName("rf")
   static short field903;
   @ObfuscatedName("mp")
   static boolean playermod;
   @ObfuscatedName("rc")
   static short field899;
   @ObfuscatedName("ps")
   @ObfuscatedGetter(
      longValue = -5334363600316309153L
   )
   static long field682;
   @ObfuscatedName("rd")
   static short field900;
   @ObfuscatedName("rw")
   static short field905;
   @ObfuscatedName("rj")
   static short field902;
   @ObfuscatedName("ph")
   static String field789;
   @ObfuscatedName("mc")
   @ObfuscatedGetter(
      intValue = -185716563
   )
   static int field813;
   @ObfuscatedName("rr")
   static short field906;
   @ObfuscatedName("rs")
   static short field872;
   @ObfuscatedName("no")
   @ObfuscatedGetter(
      intValue = -1164018799
   )
   static int field898;
   @ObfuscatedName("sp")
   @ObfuscatedSignature(
      signature = "Lbh;"
   )
   static OwnWorldComparator field917;
   @ObfuscatedName("mr")
   @ObfuscatedGetter(
      intValue = -503828377
   )
   static int field814;
   @ObfuscatedName("mi")
   @ObfuscatedGetter(
      intValue = 1356307623
   )
   static int field858;
   @ObfuscatedName("pc")
   @ObfuscatedGetter(
      intValue = -204665459
   )
   static int field874;
   @ObfuscatedName("sw")
   @ObfuscatedSignature(
      signature = "Llx;"
   )
   static class274 field915;
   @ObfuscatedName("ny")
   @ObfuscatedGetter(
      intValue = 1835148581
   )
   static int field675;
   @ObfuscatedName("me")
   @ObfuscatedGetter(
      intValue = 345992687
   )
   static int field812;
   @ObfuscatedName("mv")
   @ObfuscatedGetter(
      intValue = -1901682117
   )
   static int field819;
   @ObfuscatedName("pu")
   @ObfuscatedGetter(
      intValue = -1927960511
   )
   static int field875;
   @ObfuscatedName("px")
   static int[] field712;
   @ObfuscatedName("pr")
   static int[] field805;
   @ObfuscatedName("pw")
   @ObfuscatedGetter(
      intValue = -402226337
   )
   static int field870;
   @ObfuscatedName("nm")
   @ObfuscatedGetter(
      intValue = 900688697
   )
   static int lastMiscTransmit;
   @ObfuscatedName("rl")
   static boolean[] field894;
   @ObfuscatedName("pk")
   static int[] field732;
   @ObfuscatedName("pe")
   static int[] field871;
   @ObfuscatedName("oj")
   @ObfuscatedSignature(
      signature = "Lhv;"
   )
   static Deque field921;
   @ObfuscatedName("ov")
   @ObfuscatedSignature(
      signature = "Lhv;"
   )
   static Deque field850;
   @ObfuscatedName("ro")
   static int[] field896;
   @ObfuscatedName("rx")
   static int[] field895;
   @ObfuscatedName("rv")
   static int[] field897;
   @ObfuscatedName("ra")
   static int[] field761;
   @ObfuscatedName("np")
   @ObfuscatedGetter(
      intValue = 927108697
   )
   static int field648;
   @ObfuscatedName("pz")
   static int[] field713;
   @ObfuscatedName("jn")
   @ObfuscatedGetter(
      intValue = 779145051
   )
   static int lastLeftClickY;
   @ObfuscatedName("ck")
   @ObfuscatedGetter(
      intValue = 181127397
   )
   static int hintArrowTargetType;
   @ObfuscatedName("iq")
   @ObfuscatedGetter(
      intValue = -58041941
   )
   static int screenX;
   @ObfuscatedName("kq")
   static int[] npcIndexesToRemove;
   @ObfuscatedName("dn")
   @ObfuscatedGetter(
      intValue = -360399881
   )
   static int js5State;
   @ObfuscatedName("ik")
   @ObfuscatedGetter(
      intValue = -1396376281
   )
   static int field733;
   @ObfuscatedName("kk")
   static boolean isMenuOpen;
   @ObfuscatedName("hn")
   @ObfuscatedGetter(
      intValue = 1076515377
   )
   static int field844;
   @ObfuscatedName("ln")
   @ObfuscatedGetter(
      intValue = 1576326627
   )
   static int menuOptionCount;
   @ObfuscatedName("cq")
   @ObfuscatedGetter(
      intValue = -279240331
   )
   static int field662;
   @ObfuscatedName("jh")
   static boolean field754;
   @ObfuscatedName("ly")
   static boolean field794;
   @ObfuscatedName("jy")
   static boolean field811;
   @ObfuscatedName("hy")
   @ObfuscatedGetter(
      intValue = -963711241
   )
   static int field714;
   @ObfuscatedName("lh")
   static String[] menuTargets;
   @ObfuscatedName("bb")
   static boolean field656;
   @ObfuscatedName("kw")
   @ObfuscatedSignature(
      signature = "Lhv;"
   )
   static Deque projectiles;
   @ObfuscatedName("fy")
   @ObfuscatedGetter(
      intValue = -37037319
   )
   static int field703;
   @ObfuscatedName("fb")
   @ObfuscatedSignature(
      signature = "Lkt;"
   )
   static Font fontPlain11;
   @ObfuscatedName("ew")
   @ObfuscatedSignature(
      signature = "Leh;"
   )
   static AuthProt field914;
   @ObfuscatedName("iw")
   static int[] field743;
   @ObfuscatedName("cw")
   @ObfuscatedGetter(
      intValue = 545121427
   )
   static int hintArrowPlayerTargetIdx;
   @ObfuscatedName("jz")
   @ObfuscatedGetter(
      intValue = 1927638763
   )
   static int field783;
   @ObfuscatedName("hb")
   @ObfuscatedGetter(
      intValue = 827173265
   )
   static int field725;
   @ObfuscatedName("lb")
   static boolean field660;
   @ObfuscatedName("fz")
   static boolean field697;
   @ObfuscatedName("bm")
   @ObfuscatedSignature(
      signature = "Llv;"
   )
   static IndexedSprite field925;
   @ObfuscatedName("li")
   @ObfuscatedGetter(
      intValue = 1804873401
   )
   static int field769;
   @ObfuscatedName("if")
   @ObfuscatedGetter(
      intValue = 1264010803
   )
   static int field728;
   @ObfuscatedName("hc")
   @ObfuscatedGetter(
      intValue = -2038841951
   )
   static int field724;
   @ObfuscatedName("cv")
   @ObfuscatedGetter(
      intValue = -37907065
   )
   static int hintArrowX;
   @ObfuscatedName("jm")
   @ObfuscatedSignature(
      signature = "[Lbw;"
   )
   static PlayerEntity[] players;
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "[Lfk;"
   )
   static CollisionData[] collisionMaps;
   @ObfuscatedName("el")
   static byte[] field688;
   @ObfuscatedName("lc")
   static boolean spellSelected;
   @ObfuscatedName("ie")
   static boolean field719;
   @ObfuscatedName("fg")
   @ObfuscatedGetter(
      intValue = 2080423453
   )
   static int extendedInfoNpcCount;
   @ObfuscatedName("ir")
   static int[] overheadTextsX;
   @ObfuscatedName("bg")
   @ObfuscatedGetter(
      intValue = -1336712397
   )
   static int languageId;
   @ObfuscatedName("ft")
   static HashMap fontsMap;
   @ObfuscatedName("lg")
   static String[] menuOptions;
   @ObfuscatedName("ed")
   @ObfuscatedSignature(
      signature = "Lcp;"
   )
   static class43 field687;
   @ObfuscatedName("ig")
   static int[] overheadTextsCyclesRemaining;
   @ObfuscatedName("bd")
   @ObfuscatedGetter(
      intValue = 1197033905
   )
   static int socketType;
   @ObfuscatedName("iu")
   @ObfuscatedGetter(
      intValue = 1539043517
   )
   static int field735;
   @ObfuscatedName("ld")
   @ObfuscatedGetter(
      intValue = -1156607981
   )
   static int field799;
   @ObfuscatedName("ea")
   static boolean Login_isUsernameRemembered;
   @ObfuscatedName("jd")
   @ObfuscatedGetter(
      intValue = 2039304517
   )
   static int field752;
   @ObfuscatedName("ha")
   @ObfuscatedGetter(
      intValue = 1653090657
   )
   static int field711;
   @ObfuscatedName("kx")
   static int[] npcFacingDirections;
   @ObfuscatedName("ja")
   @ObfuscatedGetter(
      intValue = 1345185859
   )
   static int lastLeftClickX;
   @ObfuscatedName("ho")
   @ObfuscatedGetter(
      intValue = -1284039775
   )
   static int field864;
   @ObfuscatedName("em")
   @ObfuscatedGetter(
      intValue = -895242893
   )
   static int loginState;
   @ObfuscatedName("hl")
   @ObfuscatedGetter(
      intValue = 1692348195
   )
   static int field722;
   @ObfuscatedName("lr")
   static boolean field796;
   @ObfuscatedName("bo")
   @ObfuscatedGetter(
      intValue = -2035474007
   )
   static int flags;
   @ObfuscatedName("cj")
   @ObfuscatedGetter(
      intValue = 324021795
   )
   static int hintArrowOffsetY;
   @ObfuscatedName("ij")
   static int[] overheadTextsOffsetY;
   @ObfuscatedName("ep")
   @ObfuscatedGetter(
      intValue = 724149945
   )
   static int field843;
   @ObfuscatedName("jb")
   static boolean field768;
   @ObfuscatedName("kz")
   static String[] playerOptions;
   @ObfuscatedName("ii")
   @ObfuscatedGetter(
      intValue = 1219875627
   )
   static int overheadTextCount;
   @ObfuscatedName("bp")
   public static boolean isMembers;
   @ObfuscatedName("jp")
   @ObfuscatedGetter(
      intValue = -194480927
   )
   static int pressedItemIndex;
   @ObfuscatedName("lf")
   static int[] menuActionParams1;
   @ObfuscatedName("ih")
   static int[] overheadTextsY;
   @ObfuscatedName("lt")
   static int[] menuActionParams0;
   @ObfuscatedName("iv")
   @ObfuscatedGetter(
      intValue = -186345625
   )
   static int field760;
   @ObfuscatedName("hm")
   @ObfuscatedGetter(
      intValue = -1187655507
   )
   static int cameraPitchTarget;
   @ObfuscatedName("jc")
   @ObfuscatedGetter(
      intValue = 776935403
   )
   static int itemPressedDuration;
   @ObfuscatedName("cl")
   @ObfuscatedSignature(
      signature = "Lcx;"
   )
   static AttackOpPriority playerAttackOpPriority;
   @ObfuscatedName("ky")
   @ObfuscatedSignature(
      signature = "[[[Lhv;"
   )
   static Deque[][][] groundItemDeque;
   @ObfuscatedName("dg")
   @ObfuscatedGetter(
      intValue = -1625536117
   )
   static int loadingStage;
   @ObfuscatedName("dt")
   @ObfuscatedGetter(
      intValue = 1304561175
   )
   static int field679;
   @ObfuscatedName("fw")
   @ObfuscatedGetter(
      intValue = -1173287257
   )
   static int field702;
   @ObfuscatedName("eo")
   @ObfuscatedGetter(
      intValue = -1577974335
   )
   static int field683;
   @ObfuscatedName("ge")
   @ObfuscatedGetter(
      intValue = -1327048493
   )
   static int field710;
   @ObfuscatedName("fj")
   static int[] extendedInfoNpcIndexes;
   @ObfuscatedName("in")
   static int[][] field746;
   @ObfuscatedName("lq")
   @ObfuscatedGetter(
      intValue = 217766879
   )
   static int itemSelectionState;
   @ObfuscatedName("jq")
   @ObfuscatedGetter(
      intValue = -1989185387
   )
   static int field685;
   public static int tickCount;
   public static boolean interpolatePlayerAnimations;
   public static boolean interpolateNpcAnimations;
   public static boolean interpolateObjectAnimations;
   public static RSItem lastItemDespawn;
   public static boolean stretchedFast;
   public static boolean stretchedKeepAspectRatio;
   public static boolean stretchedEnabled;
   public static boolean isHidingEntities;
   public static boolean hidePlayers;
   public static boolean hideFriends;
   public static boolean hideLocalPlayer;
   public static boolean hideLocalPlayer2D;
   public static boolean hideNPCs;
   public static boolean hideProjectiles;
   public static int inventoryDragDelay;
   public static boolean stretchedIntegerScaling;
   public static int skyboxColor;
   public static boolean hidePlayers2D;
   public static boolean hideClanMates;
   public static boolean hideNPCs2D;
   public static Map widgetSpriteOverrides;
   public static int[] rl$modelViewportXs;
   public static Dimension cachedStretchedDimensions;
   public static HealthBarOverride healthBarOverride;
   public static Map spriteOverrides;
   public static int oldMenuEntryCount;
   public static Dimension cachedRealDimensions;
   public static boolean hideAttackers;
   // $FF: synthetic field
   public static boolean $assertionsDisabled;
   public static boolean pitchRelaxEnabled;
   public static double scalingFactor;
   public static boolean oldIsResized;
   public static int[] rl$modelViewportYs;
   public static RSScript currentScript;
   public static int lastPitch;
   public static int itemPressedDurationBuffer;
   public static RSPlayer[] oldPlayers;
   public static int lastPitchTarget;
   public static int currentScriptPC;
   @ObfuscatedName("cn")
   @ObfuscatedGetter(
      intValue = -546759927
   )
   static int hintArrowNpcTargetIdx;
   @ObfuscatedName("hk")
   @ObfuscatedGetter(
      intValue = 744529599
   )
   static int field790;
   @ObfuscatedName("lk")
   static int[] menuIdentifiers;
   @ObfuscatedName("gn")
   @ObfuscatedGetter(
      intValue = -692625755
   )
   static int field800;
   @ObfuscatedName("en")
   @ObfuscatedGetter(
      intValue = 306506173
   )
   static int field737;
   @ObfuscatedName("hv")
   static boolean field715;
   @ObfuscatedName("kt")
   static int[] skillBaseLevels;
   @ObfuscatedName("it")
   static String lastSelectedItemName;
   @ObfuscatedName("bv")
   static boolean lowMemory;
   @ObfuscatedName("kc")
   @ObfuscatedGetter(
      intValue = -881947409
   )
   static int field784;
   @ObfuscatedName("cc")
   static boolean field663;
   @ObfuscatedName("ec")
   @ObfuscatedSignature(
      signature = "[Lcm;"
   )
   static NPCEntity[] npcs;
   @ObfuscatedName("ic")
   @ObfuscatedGetter(
      intValue = 2082081373
   )
   static int field730;
   @ObfuscatedName("ct")
   @ObfuscatedGetter(
      intValue = -523356653
   )
   static int gameCycle;
   @ObfuscatedName("je")
   @ObfuscatedGetter(
      intValue = -1167903951
   )
   static int field721;
   @ObfuscatedName("et")
   @ObfuscatedGetter(
      intValue = 860111793
   )
   static int highResolutionNpcCount;
   @ObfuscatedName("am")
   static boolean field827;
   @ObfuscatedName("jl")
   @ObfuscatedGetter(
      intValue = -578763473
   )
   static int cursorState;
   @ObfuscatedName("ff")
   @ObfuscatedGetter(
      intValue = -1944564321
   )
   static int field695;
   @ObfuscatedName("lp")
   static boolean field699;
   @ObfuscatedName("lv")
   @ObfuscatedGetter(
      intValue = 115558105
   )
   static int field798;
   @ObfuscatedName("ci")
   @ObfuscatedGetter(
      intValue = -136465419
   )
   static int field877;
   @ObfuscatedName("is")
   static int[] overheadTextsOffsetX;
   @ObfuscatedName("ki")
   static int[] skillLevels;
   @ObfuscatedName("jf")
   @ObfuscatedGetter(
      intValue = 498090213
   )
   static int field809;
   @ObfuscatedName("bf")
   @ObfuscatedGetter(
      intValue = -1631337851
   )
   public static int world;
   @ObfuscatedName("iy")
   @ObfuscatedGetter(
      intValue = -1054464475
   )
   static int field788;
   @ObfuscatedName("cb")
   @ObfuscatedGetter(
      longValue = -2910245912741037697L
   )
   static long mouseLastLastPressedTimeMillis;
   @ObfuscatedName("ko")
   static final int[] playerMenuTypes;
   @ObfuscatedName("co")
   static boolean displayFps;
   @ObfuscatedName("lw")
   @ObfuscatedGetter(
      intValue = -1745321725
   )
   static int field801;
   @ObfuscatedName("hw")
   @ObfuscatedGetter(
      intValue = -1843309621
   )
   static int mapAngle;
   @ObfuscatedName("hj")
   @ObfuscatedGetter(
      intValue = 194381521
   )
   static int field854;
   @ObfuscatedName("hu")
   @ObfuscatedGetter(
      intValue = 1457284743
   )
   static int field766;
   @ObfuscatedName("kg")
   @ObfuscatedSignature(
      signature = "Lhv;"
   )
   static Deque pendingSpawns;
   @ObfuscatedName("cd")
   @ObfuscatedGetter(
      intValue = -1460205461
   )
   static int field661;
   @ObfuscatedName("fd")
   @ObfuscatedSignature(
      signature = "Lka;"
   )
   static class112 field773;
   @ObfuscatedName("cr")
   @ObfuscatedGetter(
      intValue = 814843975
   )
   static int rebootTimer;
   @ObfuscatedName("id")
   static String[] overheadTexts;
   @ObfuscatedName("hd")
   @ObfuscatedGetter(
      intValue = 167955243
   )
   static int field720;
   @ObfuscatedName("cu")
   @ObfuscatedGetter(
      intValue = -76133787
   )
   static int hintArrowY;
   @ObfuscatedName("ku")
   @ObfuscatedGetter(
      intValue = 918080955
   )
   static int playerNameMask;
   @ObfuscatedName("kd")
   @ObfuscatedGetter(
      intValue = 1743205443
   )
   static int npcsToRemoveCount;
   @ObfuscatedName("jx")
   @ObfuscatedGetter(
      intValue = -1381016877
   )
   static int mouseCrosshair;
   @ObfuscatedName("fa")
   @ObfuscatedGetter(
      intValue = -537283973
   )
   static int field701;
   @ObfuscatedName("ga")
   @ObfuscatedGetter(
      intValue = -1487439669
   )
   static int field705;
   @ObfuscatedName("ia")
   @ObfuscatedGetter(
      intValue = -1741192279
   )
   public static int field731;
   @ObfuscatedName("fo")
   @ObfuscatedSignature(
      signature = "Lck;"
   )
   public static final ServerConnection serverConnection;
   @ObfuscatedName("im")
   static boolean field845;
   @ObfuscatedName("bl")
   @ObfuscatedGetter(
      intValue = -941989807
   )
   static int confClientType;
   @ObfuscatedName("gm")
   static int[][][] instanceTemplateChunks;
   @ObfuscatedName("lo")
   static int[] menuTypes;
   @ObfuscatedName("gj")
   static boolean isDynamicRegion;
   @ObfuscatedName("ib")
   static int[] field742;
   @ObfuscatedName("bw")
   @ObfuscatedGetter(
      intValue = -239871291
   )
   static int gameState;
   @ObfuscatedName("fp")
   static int[] highResolutionNpcIndexes;
   @ObfuscatedName("ji")
   @ObfuscatedGetter(
      intValue = 1185353675
   )
   static int field763;
   @ObfuscatedName("ei")
   @ObfuscatedGetter(
      intValue = 1183622671
   )
   static int field684;
   @ObfuscatedName("ip")
   @ObfuscatedGetter(
      intValue = -930877511
   )
   static int screenY;
   @ObfuscatedName("hf")
   @ObfuscatedGetter(
      intValue = -334967155
   )
   static int camModeType;
   @ObfuscatedName("jv")
   @ObfuscatedGetter(
      intValue = -306357203
   )
   static int field767;
   @ObfuscatedName("kf")
   static int[] skillExperiences;
   @ObfuscatedName("cf")
   @ObfuscatedGetter(
      longValue = 2384354849923795831L
   )
   static long field817;
   @ObfuscatedName("ks")
   @ObfuscatedGetter(
      intValue = -1633189555
   )
   static int field776;
   @ObfuscatedName("hs")
   @ObfuscatedGetter(
      intValue = 319925981
   )
   static int field727;
   @ObfuscatedName("cs")
   static boolean field782;
   @ObfuscatedName("la")
   static boolean[] menuBooleanArray;
   @ObfuscatedName("ce")
   @ObfuscatedGetter(
      intValue = -860300909
   )
   static int hintArrowOffsetX;
   @ObfuscatedName("io")
   @ObfuscatedGetter(
      intValue = 1950554197
   )
   static int field907;
   @ObfuscatedName("ht")
   @ObfuscatedGetter(
      intValue = 935994939
   )
   static int field734;
   @ObfuscatedName("fq")
   static boolean socketError;
   @ObfuscatedName("gl")
   static final int[] field709;
   @ObfuscatedName("jw")
   static boolean field764;
   @ObfuscatedName("dz")
   @ObfuscatedSignature(
      signature = "Lcx;"
   )
   static AttackOpPriority npcAttackOpPriority;
   @ObfuscatedName("ke")
   @ObfuscatedSignature(
      signature = "Lhv;"
   )
   static Deque spotAnimationDeque;
   @ObfuscatedName("kr")
   static boolean[] playerOptionsPriorities;
   @ObfuscatedName("jj")
   @ObfuscatedGetter(
      intValue = -1798081145
   )
   static int localPlayerIndex;
   public DrawCallbacks drawCallbacks;
   @Inject
   @Named("Core Logger")
   public Logger logger;
   public boolean gpu;
   @Inject
   public Callbacks callbacks;
   public Cache varbitCache;
   public Cache enumCache;

   static {
      field827 = true;
      world = 1;
      flags = 0;
      socketType = 0;
      isMembers = false;
      lowMemory = false;
      languageId = 0;
      confClientType = -1;
      field656 = false;
      gameState = 0;
      field663 = true;
      gameCycle = 0;
      mouseLastLastPressedTimeMillis = 1L;
      field661 = -1;
      field662 = -1;
      field817 = -1L;
      field782 = true;
      displayFps = false;
      rebootTimer = 0;
      hintArrowTargetType = 0;
      hintArrowNpcTargetIdx = 0;
      hintArrowPlayerTargetIdx = 0;
      hintArrowX = 0;
      hintArrowY = 0;
      field877 = 0;
      hintArrowOffsetX = 0;
      hintArrowOffsetY = 0;
      playerAttackOpPriority = AttackOpPriority.HIDDEN;
      npcAttackOpPriority = AttackOpPriority.HIDDEN;
      loadingStage = 0;
      js5State = 0;
      field679 = 0;
      field737 = 0;
      loginState = 0;
      field843 = 0;
      field683 = 0;
      field684 = 0;
      field914 = AuthProt.field1982;
      Login_isUsernameRemembered = false;
      field687 = new class43();
      field688 = null;
      npcs = new NPCEntity['耀'];
      highResolutionNpcCount = 0;
      highResolutionNpcIndexes = new int['耀'];
      extendedInfoNpcCount = 0;
      extendedInfoNpcIndexes = new int[250];
      serverConnection = new ServerConnection();
      field695 = 0;
      socketError = false;
      field697 = true;
      field773 = new class112();
      fontsMap = new HashMap();
      field701 = 0;
      field702 = 1;
      field703 = 0;
      field800 = 1;
      field705 = 0;
      collisionMaps = new CollisionData[4];
      isDynamicRegion = false;
      instanceTemplateChunks = new int[4][13][13];
      field709 = new int[]{0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3};
      field710 = 0;
      field711 = 2301979;
      field734 = 5063219;
      field854 = 3353893;
      field714 = 7759444;
      field715 = false;
      field864 = 0;
      cameraPitchTarget = 128;
      mapAngle = 0;
      field766 = 0;
      field720 = 0;
      field844 = 0;
      field722 = 0;
      camModeType = 0;
      field724 = 50;
      field790 = 0;
      field727 = 0;
      field728 = 0;
      field788 = 12;
      field730 = 6;
      field731 = 0;
      field845 = false;
      field733 = 0;
      field719 = false;
      field735 = 0;
      overheadTextCount = 0;
      field760 = 50;
      overheadTextsX = new int[field760];
      overheadTextsY = new int[field760];
      overheadTextsOffsetY = new int[field760];
      overheadTextsOffsetX = new int[field760];
      field742 = new int[field760];
      field743 = new int[field760];
      overheadTextsCyclesRemaining = new int[field760];
      overheadTexts = new String[field760];
      field746 = new int[104][104];
      field907 = 0;
      screenX = -1;
      screenY = -1;
      lastLeftClickX = 0;
      lastLeftClickY = 0;
      field752 = 0;
      cursorState = 0;
      field754 = true;
      mouseCrosshair = 0;
      pressedItemIndex = 0;
      field783 = 0;
      field685 = 0;
      field809 = 0;
      field721 = 0;
      field811 = false;
      itemPressedDuration = 0;
      field763 = 0;
      field764 = true;
      players = new PlayerEntity[2048];
      localPlayerIndex = -1;
      field767 = 0;
      field768 = true;
      playerNameMask = 0;
      npcsToRemoveCount = 0;
      npcIndexesToRemove = new int[1000];
      playerMenuTypes = new int[]{44, 45, 46, 47, 48, 49, 50, 51};
      playerOptions = new String[8];
      playerOptionsPriorities = new boolean[8];
      npcFacingDirections = new int[]{768, 1024, 1280, 512, 1536, 256, 0, 1792};
      field776 = -1;
      groundItemDeque = new Deque[4][104][104];
      pendingSpawns = new Deque();
      projectiles = new Deque();
      spotAnimationDeque = new Deque();
      skillLevels = new int[25];
      skillBaseLevels = new int[25];
      skillExperiences = new int[25];
      field784 = 0;
      isMenuOpen = false;
      menuOptionCount = 0;
      menuActionParams0 = new int[500];
      menuActionParams1 = new int[500];
      menuTypes = new int[500];
      menuIdentifiers = new int[500];
      menuOptions = new String[500];
      menuTargets = new String[500];
      menuBooleanArray = new boolean[500];
      field794 = false;
      field660 = false;
      field796 = false;
      field699 = true;
      field798 = -1;
      field799 = -1;
      field769 = 0;
      field801 = 50;
      itemSelectionState = 0;
      lastSelectedItemName = null;
      spellSelected = false;
      field853 = -1;
      field673 = -1;
      targetVerb = null;
      opBase = null;
      toplevel = -1;
      subInterfaces = new HashTable(8);
      field858 = 0;
      field812 = -1;
      field813 = 0;
      field814 = 0;
      field793 = null;
      energy = 0;
      weight = 0;
      staffModLevel = 0;
      field819 = -1;
      playermod = false;
      field821 = null;
      draggedWidget = null;
      field823 = null;
      field824 = 0;
      field802 = 0;
      draggedOnWidget = null;
      field904 = false;
      field757 = -1;
      field829 = -1;
      field830 = false;
      field831 = -1;
      field832 = -1;
      draggingWidget = false;
      cycleCntr = 1;
      field835 = new int[32];
      field836 = 0;
      field837 = new int[32];
      field681 = 0;
      changedSkills = new int[32];
      changedSkillsCount = 0;
      chatCycle = 0;
      lastFriendTransmit = 0;
      field898 = 0;
      field648 = 0;
      field675 = 0;
      lastMiscTransmit = 0;
      field847 = 0;
      field848 = new Deque();
      field921 = new Deque();
      field850 = new Deque();
      serverActiveProperties = new HashTable(512);
      interfaceCount = 0;
      field658 = -2;
      field795 = new boolean[100];
      field923 = new boolean[100];
      field856 = new boolean[100];
      widgetPositionX = new int[100];
      widgetPositionY = new int[100];
      widgetBoundsWidth = new int[100];
      widgetBoundsHeight = new int[100];
      gameDrawingMode = 0;
      field700 = 0L;
      isResized = true;
      field713 = new int[]{16776960, 16711680, 65280, 65535, 16711935, 16777215};
      publicChatMode = 0;
      tradeMode = 0;
      field789 = "";
      field755 = new long[100];
      field758 = 0;
      field870 = 0;
      field871 = new int[128];
      field732 = new int[128];
      field682 = -1L;
      field874 = -1;
      field875 = 0;
      field712 = new int[1000];
      field805 = new int[1000];
      mapIcons = new SpritePixels[1000];
      destinationX = 0;
      destinationY = 0;
      minimapRenderType = 0;
      field882 = 255;
      field680 = -1;
      field884 = false;
      field885 = 127;
      field886 = 127;
      queuedSoundEffectCount = 0;
      queuedSoundEffectIDs = new int[50];
      unknownSoundValues1 = new int[50];
      unknownSoundValues2 = new int[50];
      soundLocations = new int[50];
      audioEffects = new SoundEffect[50];
      field893 = false;
      field894 = new boolean[5];
      field895 = new int[5];
      field896 = new int[5];
      field897 = new int[5];
      field761 = new int[5];
      field899 = 256;
      field900 = 205;
      field901 = 256;
      field902 = 320;
      field903 = 1;
      field872 = 32767;
      field905 = 1;
      field906 = 32767;
      Viewport_xOffset = 0;
      Viewport_yOffset = 0;
      viewportWidth = 0;
      viewportHeight = 0;
      scale = 0;
      field918 = new PlayerComposition();
      field861 = -1;
      field908 = -1;
      field915 = new class317();
      grandExchangeOffers = new GrandExchangeOffer[8];
      field917 = new OwnWorldComparator();
      field797 = -1;
      field919 = new ArrayList(10);
      field920 = 0;
      field818 = new class29();
      field922 = new int[50];
      field876 = new int[50];
      rl$$clinit();
      rl$$clinit1();
      rl$$clinit2();
      rl$$clinit3();
      rl$$clinit4();
      rl$$clinit5();
   }

   public client() {
      this.rl$$init();
      this.rl$$init1();
      this.rl$$init2();
      this.rl$$init3();
      this.rl$$init4();
      this.rl$$init5();
      this.rl$$init6();
      this.rl$$init7();
      this.rl$$init8();
      this.rl$$init9();
      this.rl$$init10();
      this.rl$$init11();
      this.rl$$init12();
      this.rl$$init13();
   }

   @ObfuscatedName("ln")
   @ObfuscatedSignature(
      signature = "(I)Lkx;",
      garbageValue = "1724107397"
   )
   public Name vmethod4647() {
      return class71.localPlayer != null?class71.localPlayer.name:null;
   }

   @ObfuscatedName("r")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-2003103884"
   )
   protected final void vmethod4364() {
      field700 = class318.method6317() + 500L;
      this.method3113();
      if(toplevel != -1) {
         this.method3119(true);
      }

   }

   @ObfuscatedName("ae")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1835555150"
   )
   protected final void vmethod4381() {
      int[] var1 = new int[]{20, 260, 10000};
      int[] var2 = new int[]{1000, 100, 500};
      if(var1 != null && var2 != null) {
         class235.field2431 = var1;
         class83.field1964 = new int[var1.length];
         class235.field2432 = new byte[var1.length][][];

         for(int var5 = 0; var5 < class235.field2431.length; ++var5) {
            class235.field2432[var5] = new byte[var2[var5]][];
         }
      } else {
         class235.field2431 = null;
         class83.field1964 = null;
         class235.field2432 = null;
      }

      class323.port1 = socketType == 0?43594:world + 40000;
      class54.port2 = socketType == 0?443:world + 50000;
      GameSocket.myWorldPort = class323.port1;
      PlayerComposition.colorsToFind = class236.field2667;
      PlayerComposition.colorsToReplace = class236.field2668;
      PlayerComposition.field2660 = class236.field2666;
      class101.field10 = class236.field2665;
      class36.urlRequester = new UrlRequester();
      this.method4361();
      this.method4429();
      Location.mouseWheel = this.method4358();
      WorldMapType3.indexStore255 = new IndexFile(255, class75.cacheDat, class75.masterIndex, 500000);
      class312.options = OwnWorldComparator.method62();
      this.method4359();
      String var4 = MapIconReference.field362;
      class2.field443 = this;
      if(var4 != null) {
         class2.field436 = var4;
      }

      if(socketType != 0) {
         displayFps = true;
      }

      ClanMember.method1637(class312.options.screenType);
      class258.friendManager = new FriendManager(KeyFocusListener.loginType);
   }

   @ObfuscatedName("fm")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1888406471"
   )
   void method3108() {
      if(class321.field3288 >= 4) {
         this.method4413("js5crc");
         gameState = 1000;
         gameStateChanged(-1);
      } else {
         if(class321.field3294 >= 4) {
            if(gameState <= 5) {
               this.method4413("js5io");
               gameState = 1000;
               gameStateChanged(-1);
               return;
            }

            field679 = 3000;
            class321.field3294 = 3;
         }

         if(--field679 + 1 <= 0) {
            try {
               if(js5State == 0) {
                  GameCanvas.socket = class315.taskManager.method5825(class135.host, GameSocket.myWorldPort);
                  ++js5State;
               }

               if(js5State == 1) {
                  if(GameCanvas.socket.status == 2) {
                     this.method3109(-1);
                     return;
                  }

                  if(GameCanvas.socket.status == 1) {
                     ++js5State;
                  }
               }

               if(js5State == 2) {
                  if(field697) {
                     Socket var2 = (Socket)GameCanvas.socket.value;
                     class255 var1 = new class255(var2, 40000, 5000);
                     class258.rssocket = var1;
                  } else {
                     class258.rssocket = new class140((Socket)GameCanvas.socket.value, class315.taskManager, 5000);
                  }

                  Packet var13 = new Packet(5);
                  var13.writeByte(15);
                  var13.writeInt(180);
                  class258.rssocket.vmethod6359(var13.payload, 0, 5);
                  ++js5State;
                  FloorUnderlayDefinition.field3371 = class318.method6317();
               }

               if(js5State == 3) {
                  if(class258.rssocket.vmethod6356() <= 0 && (field697 || gameState > 5)) {
                     if(class318.method6317() - FloorUnderlayDefinition.field3371 > 30000L) {
                        this.method3109(-2);
                        return;
                     }
                  } else {
                     int var5 = class258.rssocket.vmethod6357();
                     if(var5 != 0) {
                        this.method3109(var5);
                        return;
                     }

                     ++js5State;
                  }
               }

               if(js5State == 4) {
                  class323 var14 = class258.rssocket;
                  boolean var6 = gameState > 20;
                  if(class321.NetCache_socket != null) {
                     try {
                        class321.NetCache_socket.vmethod6355();
                     } catch (Exception var11) {
                        ;
                     }

                     class321.NetCache_socket = null;
                  }

                  class321.NetCache_socket = var14;
                  Packet var3;
                  if(class321.NetCache_socket != null) {
                     try {
                        var3 = new Packet(4);
                        var3.writeByte(var6?2:3);
                        var3.writeMedium(0);
                        class321.NetCache_socket.vmethod6359(var3.payload, 0, 4);
                     } catch (IOException var10) {
                        try {
                           class321.NetCache_socket.vmethod6355();
                        } catch (Exception var9) {
                           ;
                        }

                        ++class321.field3294;
                        class321.NetCache_socket = null;
                     }
                  }

                  class321.NetCache_responseHeaderBuffer.offset = 0;
                  TotalQuantityComparator.currentRequest = null;
                  UrlRequester.NetCache_responseArchiveBuffer = null;
                  class321.field3275 = 0;

                  while(true) {
                     FileRequest var15 = (FileRequest)class321.NetCache_pendingPriorityResponses.method6338();
                     if(var15 == null) {
                        while(true) {
                           var15 = (FileRequest)class321.NetCache_pendingResponses.method6338();
                           if(var15 == null) {
                              if(class321.field3291 != 0) {
                                 try {
                                    var3 = new Packet(4);
                                    var3.writeByte(4);
                                    var3.writeByte(class321.field3291);
                                    var3.writeShort(0);
                                    class321.NetCache_socket.vmethod6359(var3.payload, 0, 4);
                                 } catch (IOException var8) {
                                    try {
                                       class321.NetCache_socket.vmethod6355();
                                    } catch (Exception var7) {
                                       ;
                                    }

                                    ++class321.field3294;
                                    class321.NetCache_socket = null;
                                 }
                              }

                              class321.field3289 = 0;
                              class321.field3276 = class318.method6317();
                              GameCanvas.socket = null;
                              class258.rssocket = null;
                              js5State = 0;
                              field737 = 0;
                              return;
                           }

                           class321.NetCache_pendingWritesQueue.method1228(var15);
                           class321.NetCache_pendingWrites.method6344(var15, var15.hash);
                           ++class321.NetCache_pendingWritesCount;
                           --class321.NetCache_pendingResponsesCount;
                        }
                     }

                     class321.NetCache_pendingPriorityWrites.method6344(var15, var15.hash);
                     ++class321.NetCache_pendingPriorityWritesCount;
                     --class321.NetCache_pendingPriorityResponsesCount;
                  }
               }
            } catch (IOException var12) {
               this.method3109(-3);
            }

         }
      }
   }

   @ObfuscatedName("fu")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "0"
   )
   final void method3111() {
      if(rebootTimer > 1) {
         --rebootTimer;
      }

      if(field695 > 0) {
         --field695;
      }

      if(socketError) {
         socketError = false;
         FontName.method515();
      } else {
         if(!isMenuOpen) {
            GrandExchangeOffer.method1734();
         }

         int var1;
         for(var1 = 0; var1 < 100 && this.method3115(serverConnection); ++var1) {
            ;
         }

         if(gameState == 30) {
            while(true) {
               ReflectionCheck var2 = (ReflectionCheck)class242.classInfos.method4703();
               boolean var29;
               if(var2 == null) {
                  var29 = false;
               } else {
                  var29 = true;
               }

               int var3;
               TcpConnectionMessage var30;
               if(!var29) {
                  TcpConnectionMessage var14;
                  int var15;
                  if(field773.field3683) {
                     var14 = class232.method4535(ClientProt.field2223, serverConnection.isaac);
                     var14.packetBuffer.writeByte(0);
                     var15 = var14.packetBuffer.offset;
                     field773.method1592(var14.packetBuffer);
                     var14.packetBuffer.method5083(var14.packetBuffer.offset - var15);
                     serverConnection.method18(var14);
                     field773.method1603();
                  }

                  Object var39 = class72.mouseRecorder.lock;
                  int var4;
                  int var5;
                  int var6;
                  int var7;
                  int var8;
                  int var9;
                  int var10;
                  int var11;
                  int var12;
                  synchronized(class72.mouseRecorder.lock) {
                     if(!field827) {
                        class72.mouseRecorder.index = 0;
                     } else if(MouseInput.mouseLastButton != 0 || class72.mouseRecorder.index >= 40) {
                        var30 = null;
                        var3 = 0;
                        var4 = 0;
                        var5 = 0;
                        var6 = 0;

                        for(var7 = 0; var7 < class72.mouseRecorder.index && (var30 == null || var30.packetBuffer.offset - var3 < 246); ++var7) {
                           var4 = var7;
                           var8 = class72.mouseRecorder.ys[var7];
                           if(var8 < -1) {
                              var8 = -1;
                           } else if(var8 > 65534) {
                              var8 = 65534;
                           }

                           var9 = class72.mouseRecorder.xs[var7];
                           if(var9 < -1) {
                              var9 = -1;
                           } else if(var9 > 65534) {
                              var9 = 65534;
                           }

                           if(var9 != field661 || var8 != field662) {
                              if(var30 == null) {
                                 var30 = class232.method4535(ClientProt.field2253, serverConnection.isaac);
                                 var30.packetBuffer.writeByte(0);
                                 var3 = var30.packetBuffer.offset;
                                 var30.packetBuffer.offset += 2;
                                 var5 = 0;
                                 var6 = 0;
                              }

                              if(-1L != field817) {
                                 var10 = var9 - field661;
                                 var11 = var8 - field662;
                                 var12 = (int)((class72.mouseRecorder.field590[var7] - field817) / 20L);
                                 var5 = (int)((long)var5 + (class72.mouseRecorder.field590[var7] - field817) % 20L);
                              } else {
                                 var10 = var9;
                                 var11 = var8;
                                 var12 = Integer.MAX_VALUE;
                              }

                              field661 = var9;
                              field662 = var8;
                              if(var12 < 8 && var10 >= -32 && var10 <= 31 && var11 >= -32 && var11 <= 31) {
                                 var10 += 32;
                                 var11 += 32;
                                 var30.packetBuffer.writeShort((var12 << 12) + var11 + (var10 << 6));
                              } else if(var12 < 32 && var10 >= -128 && var10 <= 127 && var11 >= -128 && var11 <= 127) {
                                 var10 += 128;
                                 var11 += 128;
                                 var30.packetBuffer.writeByte(var12 + 128);
                                 var30.packetBuffer.writeShort(var11 + (var10 << 8));
                              } else if(var12 < 32) {
                                 var30.packetBuffer.writeByte(var12 + 192);
                                 if(var9 != -1 && var8 != -1) {
                                    var30.packetBuffer.writeInt(var9 | var8 << 16);
                                 } else {
                                    var30.packetBuffer.writeInt(Integer.MIN_VALUE);
                                 }
                              } else {
                                 var30.packetBuffer.writeShort((var12 & 8191) + 57344);
                                 if(var9 != -1 && var8 != -1) {
                                    var30.packetBuffer.writeInt(var9 | var8 << 16);
                                 } else {
                                    var30.packetBuffer.writeInt(Integer.MIN_VALUE);
                                 }
                              }

                              ++var6;
                              field817 = class72.mouseRecorder.field590[var7];
                           }
                        }

                        if(var30 != null) {
                           var30.packetBuffer.method5083(var30.packetBuffer.offset - var3);
                           var7 = var30.packetBuffer.offset;
                           var30.packetBuffer.offset = var3;
                           var30.packetBuffer.writeByte(var5 / var6);
                           var30.packetBuffer.writeByte(var5 % var6);
                           var30.packetBuffer.offset = var7;
                           serverConnection.method18(var30);
                        }

                        if(var4 >= class72.mouseRecorder.index) {
                           class72.mouseRecorder.index = 0;
                        } else {
                           class72.mouseRecorder.index -= var4;
                           System.arraycopy(class72.mouseRecorder.xs, var4, class72.mouseRecorder.xs, 0, class72.mouseRecorder.index);
                           System.arraycopy(class72.mouseRecorder.ys, var4, class72.mouseRecorder.ys, 0, class72.mouseRecorder.index);
                           System.arraycopy(class72.mouseRecorder.field590, var4, class72.mouseRecorder.field590, 0, class72.mouseRecorder.index);
                        }
                     }
                  }

                  TcpConnectionMessage var18;
                  if(MouseInput.mouseLastButton == 1 || !TextureProvider.middleMouseMovesCamera && MouseInput.mouseLastButton == 4 || MouseInput.mouseLastButton == 2) {
                     long var16 = (MouseInput.mouseLastPressedTimeMillis - mouseLastLastPressedTimeMillis * -1L) / 50L;
                     if(var16 > 4095L) {
                        var16 = 4095L;
                     }

                     mouseLastLastPressedTimeMillis = MouseInput.mouseLastPressedTimeMillis * -1L;
                     var3 = MouseInput.mouseLastPressedY;
                     if(var3 < 0) {
                        var3 = 0;
                     } else if(var3 > class258.canvasHeight) {
                        var3 = class258.canvasHeight;
                     }

                     var4 = MouseInput.mouseLastPressedX;
                     if(var4 < 0) {
                        var4 = 0;
                     } else if(var4 > GrandExchangeOffer.canvasWidth) {
                        var4 = GrandExchangeOffer.canvasWidth;
                     }

                     var5 = (int)var16;
                     var18 = class232.method4535(ClientProt.field2260, serverConnection.isaac);
                     var18.packetBuffer.writeShort((MouseInput.mouseLastButton == 2?1:0) + (var5 << 1));
                     var18.packetBuffer.writeShort(var4);
                     var18.packetBuffer.writeShort(var3);
                     serverConnection.method18(var18);
                  }

                  if(KeyFocusListener.field410 > 0) {
                     var14 = class232.method4535(ClientProt.field2286, serverConnection.isaac);
                     var14.packetBuffer.writeShort(0);
                     var15 = var14.packetBuffer.offset;
                     long var19 = class318.method6317();

                     for(var5 = 0; var5 < KeyFocusListener.field410; ++var5) {
                        long var21 = var19 - field682;
                        if(var21 > 16777215L) {
                           var21 = 16777215L;
                        }

                        field682 = var19;
                        var14.packetBuffer.method5232(KeyFocusListener.field404[var5]);
                        var14.packetBuffer.writeMedium((int)var21);
                     }

                     var14.packetBuffer.method5082(var14.packetBuffer.offset - var15);
                     serverConnection.method18(var14);
                  }

                  if(field733 > 0) {
                     --field733;
                  }

                  if(KeyFocusListener.keyPressed[96] || KeyFocusListener.keyPressed[97] || KeyFocusListener.keyPressed[98] || KeyFocusListener.keyPressed[99]) {
                     field719 = true;
                  }

                  if(field719 && field733 <= 0) {
                     field733 = 20;
                     field719 = false;
                     var14 = class232.method4535(ClientProt.field2302, serverConnection.isaac);
                     var14.packetBuffer.method5123(cameraPitchTarget);
                     var14.packetBuffer.method5121(mapAngle);
                     serverConnection.method18(var14);
                  }

                  if(class57.field243 && !field782) {
                     field782 = true;
                     var14 = class232.method4535(ClientProt.field2315, serverConnection.isaac);
                     var14.packetBuffer.writeByte(1);
                     serverConnection.method18(var14);
                  }

                  if(!class57.field243 && field782) {
                     field782 = false;
                     var14 = class232.method4535(ClientProt.field2315, serverConnection.isaac);
                     var14.packetBuffer.writeByte(0);
                     serverConnection.method18(var14);
                  }

                  if(class69.worldMap != null) {
                     class69.worldMap.method3001();
                  }

                  if(WorldMapDecoration.field225) {
                     if(MapIconReference.clanMemberManager != null) {
                        MapIconReference.clanMemberManager.method5369();
                     }

                     for(var1 = 0; var1 < PlayerList.highResolutionPlayerCount; ++var1) {
                        PlayerEntity var31 = players[PlayerList.highResolutionPlayerIndexes[var1]];
                        var31.method6006();
                     }

                     WorldMapDecoration.field225 = false;
                  }

                  if(ServerProt.level != field874) {
                     field874 = ServerProt.level;
                     class179.method2861(ServerProt.level);
                  }

                  if(gameState != 30) {
                     return;
                  }

                  for(PendingSpawn var40 = (PendingSpawn)pendingSpawns.method3930(); var40 != null; var40 = (PendingSpawn)pendingSpawns.method3924()) {
                     if(var40.hitpoints > 0) {
                        --var40.hitpoints;
                     }

                     if(var40.hitpoints == 0) {
                        if(var40.field930 < 0 || KeyFocusListener.method5935(var40.field930, var40.field936)) {
                           NPCEntity.method1833(var40.level, var40.type, var40.x, var40.y, var40.field930, var40.field927, var40.field936);
                           var40.method432();
                        }
                     } else {
                        if(var40.delay > 0) {
                           --var40.delay;
                        }

                        if(var40.delay == 0 && var40.x >= 1 && var40.y >= 1 && var40.x <= 102 && var40.y <= 102 && (var40.id < 0 || KeyFocusListener.method5935(var40.id, var40.field935))) {
                           NPCEntity.method1833(var40.level, var40.type, var40.x, var40.y, var40.id, var40.orientation, var40.field935);
                           var40.delay = -1;
                           if(var40.id == var40.field930 && var40.field930 == -1) {
                              var40.method432();
                           } else if(var40.id == var40.field930 && var40.field927 == var40.orientation && var40.field935 == var40.field936) {
                              var40.method432();
                           }
                        }
                     }
                  }

                  for(var1 = 0; var1 < queuedSoundEffectCount; ++var1) {
                     --unknownSoundValues2[var1];
                     if(unknownSoundValues2[var1] >= -10) {
                        SoundEffect var32 = audioEffects[var1];
                        if(var32 == null) {
                           Object var10000 = null;
                           var32 = SoundEffect.method4985(class142.synths, queuedSoundEffectIDs[var1], 0);
                           if(var32 == null) {
                              continue;
                           }

                           unknownSoundValues2[var1] += var32.method4997();
                           audioEffects[var1] = var32;
                        }

                        if(unknownSoundValues2[var1] < 0) {
                           if(soundLocations[var1] != 0) {
                              var4 = (soundLocations[var1] & 255) * 128;
                              var5 = soundLocations[var1] >> 16 & 255;
                              var6 = var5 * 128 + 64 - class71.localPlayer.x * -1234429701;
                              if(var6 < 0) {
                                 var6 = -var6;
                              }

                              var7 = soundLocations[var1] >> 8 & 255;
                              var8 = var7 * 128 + 64 - class71.localPlayer.y;
                              if(var8 < 0) {
                                 var8 = -var8;
                              }

                              var9 = var6 + var8 - 128;
                              if(var9 > var4) {
                                 unknownSoundValues2[var1] = -100;
                                 continue;
                              }

                              if(var9 < 0) {
                                 var9 = 0;
                              }

                              var3 = (var4 - var9) * field886 / var4;
                           } else {
                              var3 = field885;
                           }

                           if(var3 > 0) {
                              RawAudioNode var23 = var32.method4998().method6320(WorldComparator.field36);
                              class166 var24 = class166.method2484(var23, 100, var3);
                              var24.method2487(unknownSoundValues1[var1] - 1);
                              TotalQuantityComparator.field60.method3531(var24);
                           }

                           unknownSoundValues2[var1] = -100;
                        }
                     } else {
                        --queuedSoundEffectCount;

                        for(var15 = var1; var15 < queuedSoundEffectCount; ++var15) {
                           queuedSoundEffectIDs[var15] = queuedSoundEffectIDs[var15 + 1];
                           audioEffects[var15] = audioEffects[var15 + 1];
                           unknownSoundValues1[var15] = unknownSoundValues1[var15 + 1];
                           unknownSoundValues2[var15] = unknownSoundValues2[var15 + 1];
                           soundLocations[var15] = soundLocations[var15 + 1];
                        }

                        --var1;
                     }
                  }

                  if(field884 && !CacheFile.method5602()) {
                     if(field882 != 0 && field680 != -1) {
                        WorldMapDataGroup.method957(class75.music, field680, 0, field882, false);
                     }

                     field884 = false;
                  }

                  ++serverConnection.field1305;
                  if(serverConnection.field1305 > 750) {
                     FontName.method515();
                     return;
                  }

                  var1 = PlayerList.highResolutionPlayerCount;
                  int[] var33 = PlayerList.highResolutionPlayerIndexes;

                  for(var3 = 0; var3 < var1; ++var3) {
                     PlayerEntity var42 = players[var33[var3]];
                     if(var42 != null) {
                        ClientOptions.method1095(var42, 1);
                     }
                  }

                  class295.method5996();
                  class83.method1109();
                  ++field710;
                  if(cursorState != 0) {
                     field752 += 20;
                     if(field752 >= 400) {
                        cursorState = 0;
                     }
                  }

                  if(class285.field1 != null) {
                     ++mouseCrosshair;
                     if(mouseCrosshair >= 15) {
                        WorldMapRegion.method5554(class285.field1);
                        class285.field1 = null;
                     }
                  }

                  ComponentType var41 = NPCType.field3585;
                  ComponentType var34 = class244.field1961;
                  NPCType.field3585 = null;
                  class244.field1961 = null;
                  draggedOnWidget = null;
                  field830 = false;
                  field904 = false;
                  field870 = 0;

                  while(HeadbarType.method2071() && field870 < 128) {
                     if(staffModLevel >= 2 && KeyFocusListener.keyPressed[82] && SocialState.currentPressedKey == 66) {
                        String var25 = class54.method878();
                        ItemContainer.clientInstance.method4360(var25);
                     } else if(camModeType != 1 || class129.currentTypedKey <= 0) {
                        field732[field870] = SocialState.currentPressedKey;
                        field871[field870] = class129.currentTypedKey;
                        ++field870;
                     }
                  }

                  if(class177.method2854() && KeyFocusListener.keyPressed[82] && KeyFocusListener.keyPressed[81] && field847 != 0) {
                     var3 = class71.localPlayer.field631 - field847;
                     if(var3 < 0) {
                        var3 = 0;
                     } else if(var3 > 3) {
                        var3 = 3;
                     }

                     if(var3 != class71.localPlayer.field631) {
                        var4 = class71.localPlayer.pathX[0] + class53.baseX;
                        var5 = class71.localPlayer.pathY[0] + class312.baseY;
                        var18 = class232.method4535(ClientProt.field2280, serverConnection.isaac);
                        var18.packetBuffer.method5131(0);
                        var18.packetBuffer.method5121(var5);
                        var18.packetBuffer.method5232(var3);
                        var18.packetBuffer.writeShort(var4);
                        serverConnection.method18(var18);
                     }

                     field847 = 0;
                  }

                  if(toplevel != -1) {
                     class43.method641(toplevel, 0, 0, GrandExchangeOffer.canvasWidth, class258.canvasHeight, 0, 0);
                  }

                  ++cycleCntr;
                  onCycleCntrChanged(-1);

                  while(true) {
                     ComponentType var43;
                     ComponentType var44;
                     ScriptEvent var45;
                     do {
                        var45 = (ScriptEvent)field921.method3909();
                        if(var45 == null) {
                           while(true) {
                              do {
                                 var45 = (ScriptEvent)field850.method3909();
                                 if(var45 == null) {
                                    while(true) {
                                       do {
                                          var45 = (ScriptEvent)field848.method3909();
                                          if(var45 == null) {
                                             this.method3116();
                                             VertexNormal.method4111();
                                             if(draggedWidget != null) {
                                                this.method3360();
                                             }

                                             if(GameCanvas.field420 != null) {
                                                WorldMapRegion.method5554(GameCanvas.field420);
                                                ++itemPressedDuration;
                                                itemPressedDurationChanged(-1);
                                                if(MouseInput.mouseCurrentButton == 0) {
                                                   if(field811) {
                                                      if(GameCanvas.field420 == SoundTask.field1417 && field783 != field721) {
                                                         ComponentType var48 = GameCanvas.field420;
                                                         byte var35 = 0;
                                                         if(field814 == 1 && var48.clientcode == 206) {
                                                            var35 = 1;
                                                         }

                                                         if(var48.objIds[field721] <= 0) {
                                                            var35 = 0;
                                                         }

                                                         var6 = WorldComparator.method86(var48);
                                                         boolean var36 = (var6 >> 29 & 1) != 0;
                                                         if(var36) {
                                                            var7 = field783;
                                                            var8 = field721;
                                                            var48.objIds[var8] = var48.objIds[var7];
                                                            var48.objCounts[var8] = var48.objCounts[var7];
                                                            var48.objIds[var7] = -1;
                                                            var48.objCounts[var7] = 0;
                                                         } else if(var35 == 1) {
                                                            var7 = field783;
                                                            var8 = field721;

                                                            while(var7 != var8) {
                                                               if(var7 > var8) {
                                                                  var48.method5654(var7 - 1, var7);
                                                                  --var7;
                                                               } else if(var7 < var8) {
                                                                  var48.method5654(var7 + 1, var7);
                                                                  ++var7;
                                                               }
                                                            }
                                                         } else {
                                                            var48.method5654(field721, field783);
                                                         }

                                                         TcpConnectionMessage var26 = class232.method4535(ClientProt.field2299, serverConnection.isaac);
                                                         var26.packetBuffer.writeShort(field721);
                                                         var26.packetBuffer.method5121(field783);
                                                         var26.packetBuffer.writeInt(GameCanvas.field420.id);
                                                         var26.packetBuffer.method5232(var35);
                                                         serverConnection.method18(var26);
                                                      }
                                                   } else if(this.method3117(2037131516)) {
                                                      this.method3487(field685, field809);
                                                   } else if(menuOptionCount > 0) {
                                                      var3 = field685;
                                                      var4 = field809;
                                                      ContextMenuRow var46 = class312.topContextMenuRow;
                                                      class24.method464(var46.param0, var46.param1, var46.type, var46.identifier, var46.option, var46.option, var3, var4, -637052079);
                                                      class312.topContextMenuRow = null;
                                                   }

                                                   mouseCrosshair = 10;
                                                   MouseInput.mouseLastButton = 0;
                                                   GameCanvas.field420 = null;
                                                } else if(itemPressedDuration >= 5 && (MouseInput.mouseLastX > field685 + 5 || MouseInput.mouseLastX < field685 - 5 || MouseInput.mouseLastY > field809 + 5 || MouseInput.mouseLastY < field809 - 5)) {
                                                   field811 = true;
                                                }
                                             }

                                             if(SceneManager.method3785()) {
                                                var3 = SceneManager.selectedRegionTileX;
                                                var4 = SceneManager.selectedRegionTileY;
                                                TcpConnectionMessage var47 = class232.method4535(ClientProt.field2318, serverConnection.isaac);
                                                var47.packetBuffer.writeByte(5);
                                                var47.packetBuffer.method5122(var4 + class312.baseY);
                                                var47.packetBuffer.method5122(var3 + class53.baseX);
                                                var47.packetBuffer.method5112(KeyFocusListener.keyPressed[82]?(KeyFocusListener.keyPressed[81]?2:1):0);
                                                serverConnection.method18(var47);
                                                SceneManager.method3670();
                                                lastLeftClickX = MouseInput.mouseLastPressedX;
                                                lastLeftClickY = MouseInput.mouseLastPressedY;
                                                cursorState = 1;
                                                field752 = 0;
                                                destinationX = var3;
                                                destinationY = var4;
                                             }

                                             if(var41 != NPCType.field3585) {
                                                if(var41 != null) {
                                                   WorldMapRegion.method5554(var41);
                                                }

                                                if(NPCType.field3585 != null) {
                                                   WorldMapRegion.method5554(NPCType.field3585);
                                                }
                                             }

                                             if(var34 != class244.field1961 && field769 == field801) {
                                                if(var34 != null) {
                                                   WorldMapRegion.method5554(var34);
                                                }

                                                if(class244.field1961 != null) {
                                                   WorldMapRegion.method5554(class244.field1961);
                                                }
                                             }

                                             if(class244.field1961 != null) {
                                                if(field769 < field801) {
                                                   ++field769;
                                                   if(field769 == field801) {
                                                      WorldMapRegion.method5554(class244.field1961);
                                                   }
                                                }
                                             } else if(field769 > 0) {
                                                --field769;
                                             }

                                             if(camModeType == 0) {
                                                var3 = class71.localPlayer.x * -1234429701;
                                                var4 = class71.localPlayer.y;
                                                if(field725 - var3 < -500 || field725 - var3 > 500 || class69.field135 - var4 < -500 || class69.field135 - var4 > 500) {
                                                   field725 = var3;
                                                   class69.field135 = var4;
                                                }

                                                if(var3 != field725) {
                                                   field725 += (var3 - field725) / 16;
                                                }

                                                if(var4 != class69.field135) {
                                                   class69.field135 += (var4 - class69.field135) / 16;
                                                }

                                                var5 = field725 >> 7;
                                                var6 = class69.field135 >> 7;
                                                var7 = TcpConnectionMessage.method5618(field725, class69.field135, ServerProt.level);
                                                var8 = 0;
                                                if(var5 > 3 && var6 > 3 && var5 < 100 && var6 < 100) {
                                                   for(var9 = var5 - 4; var9 <= var5 + 4; ++var9) {
                                                      for(var10 = var6 - 4; var10 <= var6 + 4; ++var10) {
                                                         var11 = ServerProt.level;
                                                         if(var11 < 3 && (class91.tileSettings[1][var9][var10] & 2) == 2) {
                                                            ++var11;
                                                         }

                                                         var12 = var7 - class91.tileHeights[var11][var9][var10];
                                                         if(var12 > var8) {
                                                            var8 = var12;
                                                         }
                                                      }
                                                   }
                                                }

                                                var9 = var8 * 192;
                                                if(var9 > 98048) {
                                                   var9 = 98048;
                                                }

                                                if(var9 < 32768) {
                                                   var9 = 32768;
                                                }

                                                if(var9 > field735) {
                                                   field735 += (var9 - field735) / 24;
                                                } else if(var9 < field735) {
                                                   field735 += (var9 - field735) / 80;
                                                }

                                                class252.field2538 = TcpConnectionMessage.method5618(class71.localPlayer.x * -1234429701, class71.localPlayer.y, ServerProt.level) - field724;
                                             } else if(camModeType == 1) {
                                                ServerProt.method6321();
                                                short var37 = -1;
                                                if(KeyFocusListener.keyPressed[33]) {
                                                   var37 = 0;
                                                } else if(KeyFocusListener.keyPressed[49]) {
                                                   var37 = 1024;
                                                }

                                                if(KeyFocusListener.keyPressed[48]) {
                                                   if(var37 == 0) {
                                                      var37 = 1792;
                                                   } else if(var37 == 1024) {
                                                      var37 = 1280;
                                                   } else {
                                                      var37 = 1536;
                                                   }
                                                } else if(KeyFocusListener.keyPressed[50]) {
                                                   if(var37 == 0) {
                                                      var37 = 256;
                                                   } else if(var37 == 1024) {
                                                      var37 = 768;
                                                   } else {
                                                      var37 = 512;
                                                   }
                                                }

                                                byte var38 = 0;
                                                if(KeyFocusListener.keyPressed[35]) {
                                                   var38 = -1;
                                                } else if(KeyFocusListener.keyPressed[51]) {
                                                   var38 = 1;
                                                }

                                                var5 = 0;
                                                if(var37 >= 0 || var38 != 0) {
                                                   var5 = KeyFocusListener.keyPressed[81]?field730:field788;
                                                   var5 *= 16;
                                                   field727 = var37;
                                                   field728 = var38;
                                                }

                                                if(field790 < var5) {
                                                   field790 += var5 / 8;
                                                   if(field790 > var5) {
                                                      field790 = var5;
                                                   }
                                                } else if(field790 > var5) {
                                                   field790 = field790 * 9 / 10;
                                                }

                                                if(field790 > 0) {
                                                   var6 = field790 / 16;
                                                   if(field727 >= 0) {
                                                      var3 = field727 - class142.cameraYaw & 2047;
                                                      var7 = Graphics3D.SINE[var3];
                                                      var8 = Graphics3D.COSINE[var3];
                                                      field725 += var6 * var7 / 65536;
                                                      class69.field135 += var8 * var6 / 65536;
                                                   }

                                                   if(field728 != 0) {
                                                      class252.field2538 += var6 * field728;
                                                      if(class252.field2538 > 0) {
                                                         class252.field2538 = 0;
                                                      }
                                                   }
                                                } else {
                                                   field727 = -1;
                                                   field728 = -1;
                                                }

                                                if(KeyFocusListener.keyPressed[13]) {
                                                   class79.method1075();
                                                }
                                             }

                                             if(MouseInput.mouseCurrentButton == 4 && TextureProvider.middleMouseMovesCamera) {
                                                var3 = MouseInput.mouseLastY - field722;
                                                field720 = var3 * 2;
                                                field722 = var3 != -1 && var3 != 1?(field722 + MouseInput.mouseLastY) / 2:MouseInput.mouseLastY;
                                                var4 = field844 - MouseInput.mouseLastX;
                                                field766 = var4 * 2;
                                                field844 = var4 != -1 && var4 != 1?(MouseInput.mouseLastX + field844) / 2:MouseInput.mouseLastX;
                                             } else {
                                                if(KeyFocusListener.keyPressed[96]) {
                                                   field766 += (-24 - field766) / 2;
                                                } else if(KeyFocusListener.keyPressed[97]) {
                                                   field766 += (24 - field766) / 2;
                                                } else {
                                                   field766 /= 2;
                                                }

                                                if(KeyFocusListener.keyPressed[98]) {
                                                   field720 += (12 - field720) / 2;
                                                } else if(KeyFocusListener.keyPressed[99]) {
                                                   field720 += (-12 - field720) / 2;
                                                } else {
                                                   field720 /= 2;
                                                }

                                                field722 = MouseInput.mouseLastY;
                                                field844 = MouseInput.mouseLastX;
                                             }

                                             mapAngle = field766 / 2 + mapAngle & 2047;
                                             cameraPitchTarget += field720 / 2;
                                             onCameraPitchTargetChanged(-1);
                                             if(cameraPitchTarget < 128) {
                                                cameraPitchTarget = 128;
                                                onCameraPitchTargetChanged(-1);
                                             }

                                             if(cameraPitchTarget > 383) {
                                                cameraPitchTarget = 383;
                                                onCameraPitchTargetChanged(-1);
                                             }

                                             if(field893) {
                                                WorldMapManager.method2330();
                                             }

                                             for(var3 = 0; var3 < 5; ++var3) {
                                                ++field761[var3];
                                             }

                                             WorldMapType3.varcs.method327();
                                             var3 = ItemContainer.method3964();
                                             var4 = KeyFocusListener.keyboardIdleTicks;
                                             if(var3 > 15000 && var4 > 15000) {
                                                field695 = 250;
                                                MouseInput.mouseIdleTicks = 14500;
                                                var18 = class232.method4535(ClientProt.field2268, serverConnection.isaac);
                                                serverConnection.method18(var18);
                                             }

                                             class258.friendManager.method2345();
                                             ++serverConnection.field1313;
                                             if(serverConnection.field1313 > 50) {
                                                var18 = class232.method4535(ClientProt.field2241, serverConnection.isaac);
                                                serverConnection.method18(var18);
                                             }

                                             try {
                                                serverConnection.method17();
                                             } catch (IOException var27) {
                                                FontName.method515();
                                             }

                                             return;
                                          }

                                          var43 = var45.source;
                                          if(var43.index < 0) {
                                             break;
                                          }

                                          var44 = ChatHistory.method6246(var43.layer);
                                       } while(var44 == null || var44.children == null || var43.index >= var44.children.length || var43 != var44.children[var43.index]);

                                       class192.method3810(var45);
                                    }
                                 }

                                 var43 = var45.source;
                                 if(var43.index < 0) {
                                    break;
                                 }

                                 var44 = ChatHistory.method6246(var43.layer);
                              } while(var44 == null || var44.children == null || var43.index >= var44.children.length || var43 != var44.children[var43.index]);

                              class192.method3810(var45);
                           }
                        }

                        var43 = var45.source;
                        if(var43.index < 0) {
                           break;
                        }

                        var44 = ChatHistory.method6246(var43.layer);
                     } while(var44 == null || var44.children == null || var43.index >= var44.children.length || var43 != var44.children[var43.index]);

                     class192.method3810(var45);
                  }
               }

               var30 = class232.method4535(ClientProt.field2310, serverConnection.isaac);
               var30.packetBuffer.writeByte(0);
               var3 = var30.packetBuffer.offset;
               class93.method1251(var30.packetBuffer);
               var30.packetBuffer.method5083(var30.packetBuffer.offset - var3);
               serverConnection.method18(var30);
            }
         }
      }
   }

   @ObfuscatedName("au")
   @ObfuscatedSignature(
      signature = "(ZB)V",
      garbageValue = "-68"
   )
   protected final void vmethod4460(boolean var1) {
      this.methodDraw(var1);

      boolean var2;
      label170: {
         try {
            if(class262.field2557 == 2) {
               if(WorldMapDataGroup.field302 == null) {
                  WorldMapDataGroup.field302 = Track1.method1295(class129.field278, class262.field2551, class262.field2552);
                  if(WorldMapDataGroup.field302 == null) {
                     var2 = false;
                     break label170;
                  }
               }

               if(class262.field2548 == null) {
                  class262.field2548 = new class152(class262.field2558, class262.field2547);
               }

               if(class3.field1860.method195(WorldMapDataGroup.field302, class262.field2550, class262.field2548, 22050)) {
                  class3.field1860.method264();
                  class3.field1860.method193(class308.field536);
                  class3.field1860.method198(WorldMapDataGroup.field302, class262.field2553);
                  class262.field2557 = 0;
                  WorldMapDataGroup.field302 = null;
                  class262.field2548 = null;
                  class129.field278 = null;
                  var2 = true;
                  break label170;
               }
            }
         } catch (Exception var6) {
            var6.printStackTrace();
            class3.field1860.method199();
            class262.field2557 = 0;
            WorldMapDataGroup.field302 = null;
            class262.field2548 = null;
            class129.field278 = null;
         }

         var2 = false;
      }

      if(var2 && field884 && class191.soundSystem0 != null) {
         class191.soundSystem0.method1749();
      }

      if((gameState == 10 || gameState == 20 || gameState == 30) && 0L != field700 && class318.method6317() > field700) {
         ClanMember.method1637(class31.method520());
      }

      int var4;
      if(var1) {
         for(var4 = 0; var4 < 100; ++var4) {
            field795[var4] = true;
         }
      }

      if(gameState == 0) {
         this.method4385(class203.loadingBarPercentage, class203.loadingText, var1);
      } else if(gameState == 5) {
         TcpConnectionMessage.method5617(class191.fontBold12, fontPlain11, Occluder.font_p12full, var1);
      } else if(gameState != 10 && gameState != 11) {
         if(gameState == 20) {
            TcpConnectionMessage.method5617(class191.fontBold12, fontPlain11, Occluder.font_p12full, var1);
         } else if(gameState == 25) {
            if(field705 == 1) {
               if(field701 > field702) {
                  field702 = field701;
               }

               var4 = (field702 * 50 - field701 * 50) / field702;
               Varcs.method351("Loading - please wait." + "<br>" + " (" + var4 + "%" + ")", false);
            } else if(field705 == 2) {
               if(field703 > field800) {
                  field800 = field703;
               }

               var4 = (field800 * 50 - field703 * 50) / field800 + 50;
               Varcs.method351("Loading - please wait." + "<br>" + " (" + var4 + "%" + ")", false);
            } else {
               Varcs.method351("Loading - please wait.", false);
            }
         } else if(gameState == 30) {
            this.method3114();
         } else if(gameState == 40) {
            Varcs.method351("Connection lost" + "<br>" + "Please wait - attempting to reestablish", false);
         } else if(gameState == 45) {
            Varcs.method351("Please wait...", false);
         }
      } else {
         TcpConnectionMessage.method5617(class191.fontBold12, fontPlain11, Occluder.font_p12full, var1);
      }

      if(gameState == 30 && gameDrawingMode == 0 && !var1 && !isResized) {
         for(var4 = 0; var4 < interfaceCount; ++var4) {
            if(field923[var4]) {
               Location.rasterProvider.vmethod4242(widgetPositionX[var4], widgetPositionY[var4], widgetBoundsWidth[var4], widgetBoundsHeight[var4]);
               field923[var4] = false;
            }
         }
      } else if(gameState > 0) {
         Location.rasterProvider.vmethod4241(0, 0);

         for(var4 = 0; var4 < interfaceCount; ++var4) {
            field923[var4] = false;
         }
      }

   }

   @ObfuscatedName("ja")
   @ObfuscatedSignature(
      signature = "(Lia;I)V",
      garbageValue = "-810225365"
   )
   void method3120(ComponentType var1) {
      ComponentType var2 = var1.layer == -1?null:ChatHistory.method6246(var1.layer);
      int var3;
      int var4;
      if(var2 == null) {
         var3 = GrandExchangeOffer.canvasWidth;
         var4 = class258.canvasHeight;
      } else {
         var3 = var2.width;
         var4 = var2.height;
      }

      KeyFocusListener.method5936(var1, var3, var4, false);
      class285.method5883(var1, var3, var4);
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1093400736"
   )
   protected final void vmethod4384() {
      if(WorldMapType3.varcs.method328()) {
         WorldMapType3.varcs.method316();
      }

      if(class72.mouseRecorder != null) {
         class72.mouseRecorder.isRunning = false;
      }

      class72.mouseRecorder = null;
      serverConnection.method20();
      if(KeyFocusListener.keyboard != null) {
         KeyFocusListener var1 = KeyFocusListener.keyboard;
         synchronized(KeyFocusListener.keyboard) {
            KeyFocusListener.keyboard = null;
         }
      }

      ProjectileAnimation.method4014();
      Location.mouseWheel = null;
      if(class191.soundSystem0 != null) {
         class191.soundSystem0.method1750();
      }

      if(CombatInfo1.soundSystem1 != null) {
         CombatInfo1.soundSystem1.method1750();
      }

      if(class321.NetCache_socket != null) {
         class321.NetCache_socket.vmethod6355();
      }

      ObjType.method2276();
      if(class36.urlRequester != null) {
         class36.urlRequester.method5562();
         class36.urlRequester = null;
      }

      PlayerEntity.method6048();
   }

   private byte[] getMACAddress() {
      InetAddress ip;
      try {
         ip = InetAddress.getLocalHost();
         NetworkInterface network = NetworkInterface.getByInetAddress(ip);
         byte[] hwaddress = network.getHardwareAddress();
         return hwaddress == null ? new byte[0] : hwaddress;
      } catch (Exception e) {
         e.printStackTrace();
      }
      return new byte[0];
   }

   @ObfuscatedName("fi")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "1412251553"
   )
   final void method3110() {
      Object var1 = serverConnection.method38();
      Bit var2 = serverConnection.clientPacket;

      try {
         if(loginState == 0) {
            if(LocType.field3502 == null && (field687.method640() || field843 > 250)) {
               LocType.field3502 = field687.method639();
               field687.method645();
               field687 = null;
            }

            if(LocType.field3502 != null) {
               if(var1 != null) {
                  ((class323)var1).vmethod6355();
                  var1 = null;
               }

               class79.field563 = null;
               socketError = false;
               field843 = 0;
               loginState = 1;
            }
         }

         if(loginState == 1) {
            if(class79.field563 == null) {
               class79.field563 = class315.taskManager.method5825(class135.host, GameSocket.myWorldPort);
            }

            if(class79.field563.status == 2) {
               throw new IOException();
            }

            if(class79.field563.status == 1) {
               if(field697) {
                  Socket var4 = (Socket)class79.field563.value;
                  class255 var3 = new class255(var4, 40000, 5000);
                  var1 = var3;
               } else {
                  var1 = new class140((Socket)class79.field563.value, class315.taskManager, 5000);
               }

               serverConnection.method19((class323)var1);
               class79.field563 = null;
               loginState = 2;
            }
         }

         if(loginState == 2) {
            serverConnection.method22();
            TcpConnectionMessage var21 = class307.method6147();
            var21.packetBuffer.writeByte(LoginProt.field2327.id);
            serverConnection.method18(var21);
            serverConnection.method17();
            var2.offset = 0;
            loginState = 3;
         }

         boolean var12;
         int var13;
         if(loginState == 3) {
            if(class191.soundSystem0 != null) {
               class191.soundSystem0.method1748();
            }

            if(CombatInfo1.soundSystem1 != null) {
               CombatInfo1.soundSystem1.method1748();
            }

            var12 = true;
            if(field697 && !((class323)var1).vmethod6354(1)) {
               var12 = false;
            }

            if(var12) {
               var13 = ((class323)var1).vmethod6357();
               if(class191.soundSystem0 != null) {
                  class191.soundSystem0.method1748();
               }

               if(CombatInfo1.soundSystem1 != null) {
                  CombatInfo1.soundSystem1.method1748();
               }

               if(var13 != 0) {
                  MapLabel.method2859(var13);
                  return;
               }

               var2.offset = 0;
               loginState = 4;
            }
         }

         int var34;
         if(loginState == 4) {
            if(var2.offset < 8) {
               var34 = ((class323)var1).vmethod6356();
               if(var34 > 8 - var2.offset) {
                  var34 = 8 - var2.offset;
               }

               if(var34 > 0) {
                  ((class323)var1).vmethod6362(var2.payload, var2.offset, var34);
                  var2.offset += var34;
               }
            }

            if(var2.offset == 8) {
               var2.offset = 0;
               WorldMapType3.field137 = var2.method5299();
               loginState = 5;
            }
         }

         int var7;
         int var9;
         int var14;
         if(loginState == 5) {
            serverConnection.clientPacket.offset = 0;
            serverConnection.method22();
            Bit var22 = new Bit(500);
            int[] var24 = new int[]{LocType.field3502.nextInt(), LocType.field3502.nextInt(), LocType.field3502.nextInt(), LocType.field3502.nextInt()};
            var22.offset = 0;
            var22.writeByte(1);
            var22.writeInt(var24[0]);
            var22.writeInt(var24[1]);
            var22.writeInt(var24[2]);
            var22.writeInt(var24[3]);
            var22.method5075(WorldMapType3.field137);
            int var10;
            if(gameState == 40) {
               var22.writeInt(class248.previousLoginXteaKeys[0]);
               var22.writeInt(class248.previousLoginXteaKeys[1]);
               var22.writeInt(class248.previousLoginXteaKeys[2]);
               var22.writeInt(class248.previousLoginXteaKeys[3]);
            } else {
               var22.writeByte(field914.vmethod6373());
               switch(field914.field1984) {
               case 0:
               case 2:
                  var22.writeMedium(SoundTaskDataProvider.authcode);
                  ++var22.offset;
                  break;
               case 1:
                  var22.offset += 4;
                  break;
               case 3:
                  LinkedHashMap var6 = class312.options.authRememberTokens;
                  String var8 = class203.username;
                  var9 = var8.length();
                  var10 = 0;

                  for(int var11 = 0; var11 < var9; ++var11) {
                     var10 = (var10 << 5) - var10 + var8.charAt(var11);
                  }

                  var22.writeInt(((Integer)var6.get(Integer.valueOf(var10))).intValue());
               }

               var22.writeByte(class294.field3837.vmethod6373());
               var22.writeString(class203.password);
            }

            var22.method5109(class179.RSA_EXPONENT, class179.RSA_MODULUS);
            class248.previousLoginXteaKeys = var24;
            TcpConnectionMessage var5 = class307.method6147();
            var5.packetBuffer.offset = 0;
            if(gameState == 40) {
               var5.packetBuffer.writeByte(LoginProt.field2321.id);
            } else {
               var5.packetBuffer.writeByte(LoginProt.field2323.id);
            }

            var5.packetBuffer.writeShort(0);
            var14 = var5.packetBuffer.offset;
            var5.packetBuffer.writeInt(180);
            var5.packetBuffer.writeInt(3);
             //var5.packetBuffer.writeByte(confClientType);
             byte[] mac = getMACAddress();
             var5.packetBuffer.writeByte(mac.length);
             for (int i = 0; i < mac.length; i++) {
                 var5.packetBuffer.writeByte(mac[i]);
             }
            var5.packetBuffer.method5080(var22.payload, 0, var22.offset);
            var7 = var5.packetBuffer.offset;
            var5.packetBuffer.writeString(class203.username);
            var5.packetBuffer.writeByte((isResized?1:0) << 1 | (lowMemory?1:0));
            var5.packetBuffer.writeShort(GrandExchangeOffer.canvasWidth);
            var5.packetBuffer.writeShort(class258.canvasHeight);
            class15.method311(var5.packetBuffer);
            var5.packetBuffer.writeString(class52.sessionToken);
            var5.packetBuffer.writeInt(ClientOptions.field1034);
            Packet var32 = new Packet(WorldMapType2.machineInfo.method881());
            WorldMapType2.machineInfo.method882(var32);
            var5.packetBuffer.method5080(var32.payload, 0, var32.payload.length);
            var5.packetBuffer.writeByte(confClientType);
            var5.packetBuffer.writeInt(0);
            var5.packetBuffer.writeInt(class181.anims.crc);
            var5.packetBuffer.writeInt(class87.bases.crc);
            var5.packetBuffer.writeInt(class177.configs.crc);
            var5.packetBuffer.writeInt(class129.interfacesArchive.crc);
            var5.packetBuffer.writeInt(class142.synths.crc);
            var5.packetBuffer.writeInt(class142.maps.crc);
            var5.packetBuffer.writeInt(class75.music.crc);
            var5.packetBuffer.writeInt(WorldMapData.models.crc);
            var5.packetBuffer.writeInt(ModeGame.sprites.crc);
            var5.packetBuffer.writeInt(class93.textures.crc);
            var5.packetBuffer.writeInt(class44.binary.crc);
            var5.packetBuffer.writeInt(WorldMapType1.jingles.crc);
            var5.packetBuffer.writeInt(class27.clientscripts.crc);
            var5.packetBuffer.writeInt(KeyFocusListener.fontmetrics.crc);
            var5.packetBuffer.writeInt(class211.vorbis.crc);
            var5.packetBuffer.writeInt(class333.instruments.crc);
            var5.packetBuffer.writeInt(678700152);
            var5.packetBuffer.writeInt(LoginProt.worldmapdata.crc);
            var5.packetBuffer.writeInt(PlayerEntity.defaults.crc);
            var5.packetBuffer.writeInt(Sequence.field3630.crc);
            var5.packetBuffer.writeInt(Size.field125.crc);
            var5.packetBuffer.method5196(var24, var7, var5.packetBuffer.offset);
            var5.packetBuffer.method5082(var5.packetBuffer.offset - var14);
            serverConnection.method18(var5);
            serverConnection.method17();
            serverConnection.isaac = new Isaac(var24);
            int[] var15 = new int[4];

            for(var10 = 0; var10 < 4; ++var10) {
               var15[var10] = var24[var10] + 50;
            }

            var2.method2644(var15);
            loginState = 6;
         }

         if(loginState == 6 && ((class323)var1).vmethod6356() > 0) {
            var34 = ((class323)var1).vmethod6357();
            if(var34 == 21 && gameState == 20) {
               loginState = 9;
            } else if(var34 == 2) {
               loginState = 11;
            } else if(var34 == 15 && gameState == 40) {
               serverConnection.currentPacketSize = -1;
               loginState = 16;
            } else if(var34 == 64) {
               loginState = 7;
            } else if(var34 == 23 && field683 < 1) {
               ++field683;
               loginState = 0;
            } else {
               if(var34 != 29) {
                  MapLabel.method2859(var34);
                  return;
               }

               loginState = 14;
            }
         }

         if(loginState == 7 && ((class323)var1).vmethod6356() > 0) {
            class172.field202 = ((class323)var1).vmethod6357();
            loginState = 8;
         }

         if(loginState == 8 && ((class323)var1).vmethod6356() >= class172.field202) {
            ((class323)var1).vmethod6362(var2.payload, 0, class172.field202);
            var2.offset = 0;
            loginState = 6;
         }

         if(loginState == 9 && ((class323)var1).vmethod6356() > 0) {
            field684 = (((class323)var1).vmethod6357() + 3) * 60;
            loginState = 10;
         }

         if(loginState == 10) {
            field843 = 0;
            TextureProvider.method1169("You have only just left another world.", "Your profile will be transferred in:", field684 / 60 + " seconds.");
            if(--field684 <= 0) {
               loginState = 0;
            }

         } else {
            if(loginState == 11 && ((class323)var1).vmethod6356() >= 1) {
               TotalQuantityComparator.field59 = ((class323)var1).vmethod6357();
               loginState = 12;
            }

            boolean var35;
            if(loginState == 12 && ((class323)var1).vmethod6356() >= TotalQuantityComparator.field59) {
               var12 = ((class323)var1).vmethod6357() == 1;
               ((class323)var1).vmethod6362(var2.payload, 0, 4);
               var2.offset = 0;
               var35 = false;
               if(var12) {
                  var13 = var2.method2647() << 24;
                  var13 |= var2.method2647() << 16;
                  var13 |= var2.method2647() << 8;
                  var13 |= var2.method2647();
                  String var31 = class203.username;
                  var7 = var31.length();
                  int var16 = 0;
                  var9 = 0;

                  while(true) {
                     if(var9 >= var7) {
                        if(class312.options.authRememberTokens.size() >= 10 && !class312.options.authRememberTokens.containsKey(Integer.valueOf(var16))) {
                           Iterator var33 = class312.options.authRememberTokens.entrySet().iterator();
                           var33.next();
                           var33.remove();
                        }

                        class312.options.authRememberTokens.put(Integer.valueOf(var16), Integer.valueOf(var13));
                        break;
                     }

                     var16 = (var16 << 5) - var16 + var31.charAt(var9);
                     ++var9;
                  }
               }

               if(Login_isUsernameRemembered) {
                  class312.options.rememberedUsername = class203.username;
               } else {
                  class312.options.rememberedUsername = null;
               }

               class72.method1041();
               staffModLevel = ((class323)var1).vmethod6357();
               playermod = ((class323)var1).vmethod6357() == 1;
               localPlayerIndex = ((class323)var1).vmethod6357();
               localPlayerIndex <<= 8;
               localPlayerIndex += ((class323)var1).vmethod6357();
               field767 = ((class323)var1).vmethod6357();
               ((class323)var1).vmethod6362(var2.payload, 0, 1);
               var2.offset = 0;
               ServerProt[] var28 = GameCanvas.method4867();
               var14 = var2.method2667();
               if(var14 < 0 || var14 >= var28.length) {
                  throw new IOException(var14 + " " + var2.offset);
               }

               serverConnection.currentPacket = var28[var14];
               serverConnection.currentPacketSize = serverConnection.currentPacket.size;
               ((class323)var1).vmethod6362(var2.payload, 0, 2);
               var2.offset = 0;
               serverConnection.currentPacketSize = var2.readUnsignedShort();

               try {
                  class328.method6407(ItemContainer.clientInstance, "zap");
               } catch (Throwable var19) {
                  ;
               }

               loginState = 13;
            }

            if(loginState == 13) {
               if(((class323)var1).vmethod6356() >= serverConnection.currentPacketSize) {
                  var2.offset = 0;
                  ((class323)var1).vmethod6362(var2.payload, 0, serverConnection.currentPacketSize);
                  field773.method1597();
                  mouseLastLastPressedTimeMillis = 1L;
                  for (NPCEntity var15 : npcs) {
                     if (var15 == null)
                        continue;
                     var15.type.changedOptions = new String[5];
                  }
                  class72.mouseRecorder.index = 0;
                  class57.field243 = true;
                  field782 = true;
                  field682 = -1L;
                  ZoneProt.method372();
                  serverConnection.method22();
                  serverConnection.clientPacket.offset = 0;
                  serverConnection.currentPacket = null;
                  serverConnection.field1314 = null;
                  serverConnection.field1315 = null;
                  serverConnection.field1316 = null;
                  serverConnection.currentPacketSize = 0;
                  serverConnection.field1305 = 0;
                  rebootTimer = 0;
                  field695 = 0;
                  hintArrowTargetType = 0;
                  TotalQuantityComparator.method1112();
                  MouseInput.mouseIdleTicks = 0;
                  ItemContainer.method3962();
                  itemSelectionState = 0;
                  spellSelected = false;
                  queuedSoundEffectCount = 0;
                  mapAngle = 0;
                  camModeType = 0;
                  WorldMapType1.field216 = null;
                  minimapRenderType = 0;
                  field874 = -1;
                  destinationX = 0;
                  destinationY = 0;
                  playerAttackOpPriority = AttackOpPriority.HIDDEN;
                  npcAttackOpPriority = AttackOpPriority.HIDDEN;
                  highResolutionNpcCount = 0;
                  WorldMapType2.method3087();

                  for(var34 = 0; var34 < 2048; ++var34) {
                     players[var34] = null;
                     cachedPlayersChanged(var34);
                  }

                  for(var34 = 0; var34 < 32768; ++var34) {
                     npcs[var34] = null;
                     cachedNPCsChanged(var34);
                  }

                  field776 = -1;
                  projectiles.method3936();
                  spotAnimationDeque.method3936();

                  int var17;
                  for(var34 = 0; var34 < 4; ++var34) {
                     for(var13 = 0; var13 < 104; ++var13) {
                        for(var17 = 0; var17 < 104; ++var17) {
                           groundItemDeque[var34][var13][var17] = null;
                        }
                     }
                  }

                  pendingSpawns = new Deque();
                  class258.friendManager.method2389();

                  for(var34 = 0; var34 < SoundTask.field1418; ++var34) {
                     VarPlayerType var27 = class288.method5942(var34);
                     if(var27 != null) {
                        class313.serverVarps[var34] = 0;
                        class313.clientVarps[var34] = 0;
                        settingsChanged(var34);
                     }
                  }

                  WorldMapType3.varcs.method331();
                  field819 = -1;
                  if(toplevel != -1) {
                     var34 = toplevel;
                     if(var34 != -1 && ComponentType.validInterfaces[var34]) {
                        class234.componentIndex.method4129(var34);
                        if(ComponentType.interfaces[var34] != null) {
                           var35 = true;

                           for(var17 = 0; var17 < ComponentType.interfaces[var34].length; ++var17) {
                              if(ComponentType.interfaces[var34][var17] != null) {
                                 if(ComponentType.interfaces[var34][var17].type != 2) {
                                    ComponentType.interfaces[var34][var17] = null;
                                 } else {
                                    var35 = false;
                                 }
                              }
                           }

                           if(var35) {
                              ComponentType.interfaces[var34] = null;
                           }

                           ComponentType.validInterfaces[var34] = false;
                        }
                     }
                  }

                  for(SubInterface var25 = (SubInterface)subInterfaces.method6338(); var25 != null; var25 = (SubInterface)subInterfaces.method6339()) {
                     Overlay.method6405(var25, true);
                  }

                  toplevel = -1;
                  subInterfaces = new HashTable(8);
                  field793 = null;
                  TotalQuantityComparator.method1112();
                  field918.method828((int[])null, new int[]{0, 0, 0, 0, 0}, false, -1);

                  for(var34 = 0; var34 < 8; ++var34) {
                     playerOptions[var34] = null;
                     playerOptionsChanged(var34);
                     playerOptionsPriorities[var34] = false;
                  }

                  FaceNormal.method2642();
                  field663 = true;

                  for(var34 = 0; var34 < 100; ++var34) {
                     field795[var34] = true;
                  }

                  ScriptEvent.method1145();
                  MapIconReference.clanMemberManager = null;
                  clanMemberManagerChanged(-1);

                  for(var34 = 0; var34 < 8; ++var34) {
                     grandExchangeOffers[var34] = new GrandExchangeOffer();
                     onGrandExchangeOffersChanged(var34);
                  }

                  GameCanvas.tradingPost = null;
                  MapLabel.method2856(var2);
                  KeyFocusListener.field412 = -1;
                  class53.method860(false, var2);
                  serverConnection.currentPacket = null;
               }

            } else {
               if(loginState == 14 && ((class323)var1).vmethod6356() >= 2) {
                  var2.offset = 0;
                  ((class323)var1).vmethod6362(var2.payload, 0, 2);
                  var2.offset = 0;
                  class125.field330 = var2.readUnsignedShort();
                  loginState = 15;
               }

               if(loginState == 15 && ((class323)var1).vmethod6356() >= class125.field330) {
                  var2.offset = 0;
                  ((class323)var1).vmethod6362(var2.payload, 0, class125.field330);
                  var2.offset = 0;
                  String var23 = var2.readString();
                  String var26 = var2.readString();
                  String var29 = var2.readString();
                  TextureProvider.method1169(var23, var26, var29);
                  class124.method1843(10);
               }

               if(loginState != 16) {
                  ++field843;
                  if(field843 > 2000) {
                     if(field683 < 1) {
                        if(class323.port1 == GameSocket.myWorldPort) {
                           GameSocket.myWorldPort = class54.port2;
                        } else {
                           GameSocket.myWorldPort = class323.port1;
                        }

                        ++field683;
                        loginState = 0;
                     } else {
                        MapLabel.method2859(-3);
                     }
                  }
               } else {
                  if(serverConnection.currentPacketSize == -1) {
                     if(((class323)var1).vmethod6356() < 2) {
                        return;
                     }

                     ((class323)var1).vmethod6362(var2.payload, 0, 2);
                     var2.offset = 0;
                     serverConnection.currentPacketSize = var2.readUnsignedShort();
                  }

                  if(((class323)var1).vmethod6356() >= serverConnection.currentPacketSize) {
                     ((class323)var1).vmethod6362(var2.payload, 0, serverConnection.currentPacketSize);
                     var2.offset = 0;
                     var34 = serverConnection.currentPacketSize;
                     field773.method1590();
                     serverConnection.method22();
                     serverConnection.clientPacket.offset = 0;
                     serverConnection.currentPacket = null;
                     serverConnection.field1314 = null;
                     serverConnection.field1315 = null;
                     serverConnection.field1316 = null;
                     serverConnection.currentPacketSize = 0;
                     serverConnection.field1305 = 0;
                     rebootTimer = 0;
                     menuOptionCount = 0;
                     onMenuOptionsChanged(-1);
                     isMenuOpen = false;
                     minimapRenderType = 0;
                     destinationX = 0;

                     for(var13 = 0; var13 < 2048; ++var13) {
                        players[var13] = null;
                        cachedPlayersChanged(var13);
                     }

                     class71.localPlayer = null;

                     for(var13 = 0; var13 < npcs.length; ++var13) {
                        NPCEntity var30 = npcs[var13];
                        if(var30 != null) {
                           var30.interacting = -1;
                           var30.interactingChanged(-1);
                           var30.field966 = false;
                        }
                     }

                     FaceNormal.method2642();
                     class124.method1843(30);

                     for(var13 = 0; var13 < 100; ++var13) {
                        field795[var13] = true;
                     }

                     ScriptEvent.method1145();
                     MapLabel.method2856(var2);
                     if(var34 != var2.offset) {
                        throw new RuntimeException();
                     }
                  }
               }
            }
         }
      } catch (IOException var20) {
         if(field683 < 1) {
            if(GameSocket.myWorldPort == class323.port1) {
               GameSocket.myWorldPort = class54.port2;
            } else {
               GameSocket.myWorldPort = class323.port1;
            }

            ++field683;
            loginState = 0;
         } else {
            MapLabel.method2859(-2);
         }
      }
   }

   @ObfuscatedName("av")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "119"
   )
   protected final void vmethod4377() {
      ++gameCycle;
      this.method3523();
      MouseRecorder.method130();
      class69.method978();
      FontName.method513();
      KeyFocusListener var1 = KeyFocusListener.keyboard;
      synchronized(KeyFocusListener.keyboard) {
         ++KeyFocusListener.keyboardIdleTicks;
         KeyFocusListener.field406 = KeyFocusListener.field408;
         KeyFocusListener.field410 = 0;
         int var2;
         if(KeyFocusListener.field399 >= 0) {
            while(KeyFocusListener.field399 != KeyFocusListener.field400) {
               var2 = KeyFocusListener.field388[KeyFocusListener.field400];
               KeyFocusListener.field400 = KeyFocusListener.field400 + 1 & 127;
               if(var2 < 0) {
                  KeyFocusListener.keyPressed[~var2] = false;
               } else {
                  if(!KeyFocusListener.keyPressed[var2] && KeyFocusListener.field410 < KeyFocusListener.field404.length - 1) {
                     KeyFocusListener.field404[++KeyFocusListener.field410 - 1] = var2;
                  }

                  KeyFocusListener.keyPressed[var2] = true;
               }
            }
         } else {
            for(var2 = 0; var2 < 112; ++var2) {
               KeyFocusListener.keyPressed[var2] = false;
            }

            KeyFocusListener.field399 = KeyFocusListener.field400;
         }

         if(KeyFocusListener.field410 > 0) {
            KeyFocusListener.keyboardIdleTicks = 0;
         }

         KeyFocusListener.field408 = KeyFocusListener.field382;
      }

      MapIcon.method4080();
      if(Location.mouseWheel != null) {
         int var4 = Location.mouseWheel.vmethod4271();
         field847 = var4;
      }

      if(gameState == 0) {
         WorldMapManager.method2327();
         ClientOptions.method1077();
      } else if(gameState == 5) {
         MouseRecorder.method121(this);
         WorldMapManager.method2327();
         ClientOptions.method1077();
      } else if(gameState != 10 && gameState != 11) {
         if(gameState == 20) {
            MouseRecorder.method121(this);
            this.method3110();
         } else if(gameState == 25) {
            class135.method1990();
         }
      } else {
         MouseRecorder.method121(this);
      }

      if(gameState == 30) {
         this.method3111();
      } else if(gameState == 40 || gameState == 45) {
         this.method3110();
      }

   }

   public RSSpritePixels drawInstanceMap(int var1) {
      RSSpritePixels var2 = this.createSpritePixels(new int[262144], 512, 512);
      RSSpritePixels var3 = this.getMinimapSprite();
      RSScene var4 = this.getScene();
      int[] var5 = var2.getPixels();
      byte[][][] var6 = this.getTileSettings();

      try {
         this.setMinimapSprite(var2);

         int var8;
         int var9;
         for(var8 = 1; var8 < 103; ++var8) {
            int var7 = (103 - var8) * 2048 + 24628;

            for(var9 = 1; var9 < 103; ++var9) {
               if((var6[var1][var9][var8] & 24) == 0) {
                  var4.drawTile(var5, var7, 512, var1, var9, var8);
               }

               if(var1 < 3 && (var6[var1 + 1][var9][var8] & 8) != 0) {
                  var4.drawTile(var5, var7, 512, var1 + 1, var9, var8);
               }

               var7 += 4;
            }
         }

         var8 = (238 + (int)(Math.random() * 20.0D) - 10 << 16) + (238 + (int)(Math.random() * 20.0D) - 10 << 8) + (238 + (int)(Math.random() * 20.0D) - 10);
         var9 = 238 + (int)(Math.random() * 20.0D) - 10 << 16;
         var2.setRaster();

         for(int var10 = 1; var10 < 103; ++var10) {
            for(int var11 = 1; var11 < 103; ++var11) {
               if((var6[var1][var11][var10] & 24) == 0) {
                  this.drawObject(var1, var11, var10, var8, var9);
               }

               if(var1 < 3 && (var6[var1 + 1][var11][var10] & 8) != 0) {
                  this.drawObject(var1 + 1, var11, var10, var8, var9);
               }
            }
         }
      } finally {
         this.getBufferProvider().setRaster();
         this.setMinimapSprite(var3);
      }

      return var2;
   }

   public void playSoundEffect(int var1, int var2, int var3, int var4) {
      int var5 = ((var2 & 255) << 16) + ((var3 & 255) << 8) + (var4 & 255);
      int[] var6 = this.getQueuedSoundEffectIDs();
      int[] var7 = this.getUnknownSoundValues1();
      int[] var8 = this.getQueuedSoundEffectDelays();
      RSSoundEffect[] var9 = this.getAudioEffects();
      int[] var10 = this.getSoundLocations();
      int var11 = this.getQueuedSoundEffectCount();
      var6[var11] = var1;
      var7[var11] = 0;
      var8[var11] = 0;
      var9[var11] = null;
      var10[var11] = var5;
      this.setQueuedSoundEffectCount(var11 + 1);
   }

   public RSItemContainer getItemContainer(InventoryID var1) {
      RSHashTable var2 = this.getItemContainers();
      return (RSItemContainer)var2.get((long)var1.getId());
   }

   public void methodDraw(boolean var1) {
      this.callbacks.clientMainLoop();
   }

   public RSSpritePixels[] getSprites(IndexDataBase var1, int var2, int var3) {
      RSIndexDataBase var4 = (RSIndexDataBase)var1;
      byte[] var5 = var4.getConfigData(var2, var3);
      if(var5 == null) {
         return null;
      } else {
         this.decodeSprite(var5);
         int var6 = this.getIndexedSpriteCount();
         int var7 = this.getIndexedSpriteWidth();
         int var8 = this.getIndexedSpriteHeight();
         int[] var9 = this.getIndexedSpriteOffsetXs();
         int[] var10 = this.getIndexedSpriteOffsetYs();
         int[] var11 = this.getIndexSpriteWidths();
         int[] var12 = this.getIndexedSpriteHeights();
         byte[][] var13 = this.getSpritePixels();
         int[] var14 = this.getIndexedSpritePalette();
         RSSpritePixels[] var15 = new SpritePixels[var6];

         for(int var16 = 0; var16 < var6; ++var16) {
            int var17 = var11[var16];
            int var18 = var12[var16];
            byte[] var19 = var13[var16];
            int[] var20 = new int[var17 * var18];
            RSSpritePixels var21 = this.createSpritePixels(var20, var17, var18);
            var21.setMaxHeight(var8);
            var21.setMaxWidth(var7);
            var21.setOffsetX(var9[var16]);
            var21.setOffsetY(var10[var16]);

            for(int var22 = 0; var22 < var17 * var18; ++var22) {
               var20[var22] = var14[var19[var22] & 255];
            }

            var15[var16] = var21;
         }

         this.setIndexedSpriteOffsetXs((int[])null);
         this.setIndexedSpriteOffsetYs((int[])null);
         this.setIndexSpriteWidths((int[])null);
         this.setIndexedSpriteHeights((int[])null);
         this.setIndexSpritePalette((int[])null);
         this.setSpritePixels((byte[][])null);
         return var15;
      }
   }

   public RSCollisionData[] getCollisionMaps() {
      if(this.isInInstancedRegion()) {
         return this._protect$getRsCollisionMaps();
      } else {
         RSPlayer var1 = this.getLocalPlayer();
         switch(var1.getWorldLocation().getRegionID()) {
         case 8280:
         case 8536:
            return this._protect$getRsCollisionMaps();
         default:
            return null;
         }
      }
   }

   public int getWidgetRoot() {
      return toplevel;
   }

   public int getCycleCntr() {
      return cycleCntr;
   }

   public int getDestinationX() {
      return destinationX;
   }

   public int getFlags() {
      return flags;
   }

   public void setLowMemory(boolean var1) {
      lowMemory = var1;
   }

   public int getRSGameState() {
      return gameState;
   }

   public int getNpcIndexesCount() {
      return highResolutionNpcCount;
   }

   public int[] getBoostedSkillLevels() {
      return skillLevels;
   }

   public int[] getRealSkillLevels() {
      return skillBaseLevels;
   }

   public void setRSModIcons(RSIndexedSprite[] var1) {
      FontTypeFace.modIcons = (IndexedSprite[])var1;
   }

   public int getSelectedSceneTileX() {
      return SceneManager.selectedRegionTileX;
   }

   public int getMenuX() {
      return class181.menuX;
   }

   public int getPlayerIndexesCount() {
      return PlayerList.highResolutionPlayerCount;
   }

   public boolean isStretchedEnabled() {
      return stretchedEnabled;
   }

   public boolean isInInstancedRegion() {
      return isDynamicRegion;
   }

   public RSHashTable getItemContainers() {
      return ItemContainer.itemContainers;
   }

   public RSJagexLoginType getLoginType() {
      return KeyFocusListener.loginType;
   }

   public int getMouseX() {
      return MouseInput.mouseX;
   }

   public HintArrowType getHintArrowType() {
      int var1 = ItemContainer.clientInstance.getHintArrowTargetType();
      return var1 == HintArrowType.NPC.getValue()?HintArrowType.NPC:(var1 == HintArrowType.PLAYER.getValue()?HintArrowType.PLAYER:(var1 == HintArrowType.WORLD_POSITION.getValue()?HintArrowType.WORLD_POSITION:HintArrowType.NONE));
   }

   public void menuOpened(int var1, int var2) {
      MenuOpened var3 = new MenuOpened();
      var3.setMenuEntries(this.getMenuEntries());
      this.callbacks.post(var3);
   }

   public int getVar(Varbits var1) {
      int var2 = var1.getId();
      return this.getVarbitValue(this.getVarps(), var2);
   }

   public int[] getSkillExperiences() {
      return skillExperiences;
   }

   public final boolean copy$shouldLeftClickOpenMenu(int var1) {
      int var2 = menuOptionCount - 1;
      return (field784 == 1 && menuOptionCount > 2 || Nameable.method2777(var2)) && !menuBooleanArray[var2];
   }

   public Map getVarcMap() {
      return this.getVarcs().getVarcMap();
   }

   public boolean isResized() {
      return isResized;
   }

   public RSWidget[][] getWidgets() {
      return ComponentType.interfaces;
   }

   public RSClanMemberManager getClanMemberManager() {
      return MapIconReference.clanMemberManager;
   }

   public RSVarcs getVarcs() {
      return WorldMapType3.varcs;
   }

   public RSFriendManager getFriendManager() {
      return class258.friendManager;
   }

   public RSSpritePixels createSpritePixels(int[] var1, int var2, int var3) {
      return new SpritePixels(var1, var2, var3);
   }

   public int[] getVarps() {
      return class313.clientVarps;
   }

   public int getMenuOptionCount() {
      return menuOptionCount;
   }

   public String[] _protect$getMenuOptions/* $FF was: _protect$getMenuOptions*/() {
      return menuOptions;
   }

   public RSDeque _protect$getProjectilesDeque/* $FF was: _protect$getProjectilesDeque*/() {
      return projectiles;
   }

   public RSDeque getGraphicsObjectDeque() {
      return spotAnimationDeque;
   }

   public void setMouseCanvasHoverPositionX(int var1) {
      SceneManager.mouseX2 = var1;
   }

   public void addChatMessage(int var1, String var2, String var3, String var4) {
      class312.method6287(var1, var2, var3, var4);
   }

   public MenuEntry[] getMenuEntries() {
      int var1 = this.getMenuOptionCount();
      String[] var2 = this._protect$getMenuOptions();
      String[] var3 = this._protect$getMenuTargets();
      int[] var4 = this._protect$getMenuIdentifiers();
      int[] var5 = this._protect$getMenuTypes();
      int[] var6 = this._protect$getMenuActionParams0();
      int[] var7 = this._protect$getMenuActionParams1();
      boolean[] var8 = this.getMenuForceLeftClick();
      MenuEntry[] var9 = new MenuEntry[var1];

      for(int var10 = 0; var10 < var1; ++var10) {
         MenuEntry var11 = var9[var10] = new MenuEntry();
         var11.setOption(var2[var10]);
         var11.setTarget(var3[var10]);
         var11.setIdentifier(var4[var10]);
         var11.setType(var5[var10]);
         var11.setParam0(var6[var10]);
         var11.setParam1(var7[var10]);
         var11.setForceLeftClick(var8[var10]);
      }

      return var9;
   }

   private void rl$$init() {
   }

   public int getDestinationY() {
      return destinationY;
   }

   public void setChatCycle(int var1) {
      chatCycle = var1;
   }

   public int[] getNpcIndices() {
      return highResolutionNpcIndexes;
   }

   public void setSceneLowMemory(boolean var1) {
      SceneManager.regionLowMemory = var1;
   }

   public int getSelectedSceneTileY() {
      return SceneManager.selectedRegionTileY;
   }

   public int getMenuY() {
      return TotalQuantityComparator.menuY;
   }

   public int[] getPlayerIndices() {
      return PlayerList.highResolutionPlayerIndexes;
   }

   public RSName createName(String var1, RSJagexLoginType var2) {
      return new Name(var1, (JagexLoginType)var2);
   }

   public int[] getQueuedSoundEffectIDs() {
      return queuedSoundEffectIDs;
   }

   public int get3dZoom() {
      return Graphics3D.Rasterizer3D_zoom;
   }

   public int getMouseY() {
      return MouseInput.mouseY;
   }

   public void decodeSprite(byte[] var1) {
      Occluder.method4536(var1);
   }

   public void _protect$menuAction/* $FF was: _protect$menuAction*/(int var1, int var2, int var3, int var4, String var5, String var6, int var7, int var8) {
      class24.method464(var1, var2, var3, var4, var5, var6, var7, var8, -637052079);
   }

   public RSSpritePixels getMinimapSprite() {
      return class281.minimapSprite;
   }

   public Widget getWidget(int var1, int var2) {
      RSWidget[][] var3 = this.getWidgets();
      if(var3 != null && var3.length > var1) {
         RSWidget[] var4 = var3[var1];
         return var4 != null && var4.length > var2?var4[var2]:null;
      } else {
         return null;
      }
   }

   public String[] _protect$getMenuTargets/* $FF was: _protect$getMenuTargets*/() {
      return menuTargets;
   }

   public void setVarbitValue(int[] var1, int var2, int var3) {
      RSVarbit var4 = (RSVarbit)this.varbitCache.getIfPresent(Integer.valueOf(var2));
      if(var4 == null) {
         ItemContainer.clientInstance.getVarbit(var2);
         RSNodeCache var5 = ItemContainer.clientInstance.getVarbitCache();
         var4 = (RSVarbit)var5.get((long)var2);
         this.varbitCache.put(Integer.valueOf(var2), var4);
      }

      int var8 = var4.getLeastSignificantBit();
      int var6 = var4.getMostSignificantBit();
      int var7 = (1 << var6 - var8 + 1) - 1;
      var1[var4.getIndex()] = var1[var4.getIndex()] & ~(var7 << var8) | (var3 & var7) << var8;
   }

   public RSPlayer getLocalPlayer() {
      return class71.localPlayer;
   }

   public Widget getWidget(WidgetInfo var1) {
      int var2 = var1.getGroupId();
      int var3 = var1.getChildId();
      return this.getWidget(var2, var3);
   }

   public int getVarbitValue(int[] var1, int var2) {
      if(!$assertionsDisabled && !ItemContainer.clientInstance.isClientThread()) {
         throw new AssertionError();
      } else {
         RSVarbit var3 = (RSVarbit)this.varbitCache.getIfPresent(Integer.valueOf(var2));
         if(var3 == null) {
            ItemContainer.clientInstance.getVarbit(var2);
            RSNodeCache var4 = ItemContainer.clientInstance.getVarbitCache();
            var3 = (RSVarbit)var4.get((long)var2);
            this.varbitCache.put(Integer.valueOf(var2), var3);
         }

         if(var3.getIndex() == 0 && var3.getLeastSignificantBit() == 0 && var3.getMostSignificantBit() == 0) {
            throw new IndexOutOfBoundsException("Varbit " + var2 + " does not exist");
         } else {
            int var8 = var1[var3.getIndex()];
            int var5 = var3.getLeastSignificantBit();
            int var6 = var3.getMostSignificantBit();
            int var7 = (1 << var6 - var5 + 1) - 1;
            return var8 >> var5 & var7;
         }
      }
   }

   public RSCollisionData[] _protect$getRsCollisionMaps/* $FF was: _protect$getRsCollisionMaps*/() {
      return collisionMaps;
   }

   private void rl$$init1() {
   }

   public RSNPC[] getCachedNPCs() {
      return npcs;
   }

   public RSPlayer[] getCachedPlayers() {
      return players;
   }

   public void setAudioHighMemory(boolean var1) {
      ContextMenuRow.audioHighMemory = var1;
   }

   public void setMouseCanvasHoverPositionY(int var1) {
      SceneManager.mouseY2 = var1;
   }

   public int getMenuWidth() {
      return class302.field3309;
   }

   public int[] getUnknownSoundValues1() {
      return unknownSoundValues1;
   }

   public int getIndexedSpriteCount() {
      return class96.indexedSpriteCount;
   }

   public RSScene getScene() {
      return class312.sceneManager;
   }

   public void set3dZoom(int var1) {
      Graphics3D.Rasterizer3D_zoom = var1;
   }

   public int[] _protect$getMenuIdentifiers/* $FF was: _protect$getMenuIdentifiers*/() {
      return menuIdentifiers;
   }

   public long getOverallExperience() {
      int[] var1 = this.getSkillExperiences();
      long var2 = 0L;
      int[] var4 = var1;
      int var5 = var1.length;

      for(int var6 = 0; var6 < var5; ++var6) {
         int var7 = var4[var6];
         var2 += (long)var7;
      }

      return var2;
   }

   private void rl$$init2() {
   }

   public RSEnum getRsEnum(int var1) {
      return MouseInput.method1932(var1);
   }

   public void setObjectCompositionLowDetail(boolean var1) {
      LocType.objectCompositionLowDetail = var1;
   }

   public int getMenuHeight() {
      return class288.field1949;
   }

   public int[] getQueuedSoundEffectDelays() {
      return unknownSoundValues2;
   }

   public RSSpritePixels createItemSprite(int var1, int var2, int var3, int var4, int var5, boolean var6) {
      return class139.method1992(var1, var2, var3, var4, var5, var6);
   }

   public int getIndexedSpriteWidth() {
      return class96.indexedSpriteWidth;
   }

   public int[] _protect$getMenuTypes/* $FF was: _protect$getMenuTypes*/() {
      return menuTypes;
   }

   public Dimension getRealDimensions() {
      if(!this.isStretchedEnabled()) {
         return this.getCanvas().getSize();
      } else {
         if(cachedRealDimensions == null) {
            if(this.isResized()) {
               Container var1 = this.getCanvas().getParent();
               int var2 = var1.getWidth();
               int var3 = var1.getHeight();
               int var4 = (int)((double)var2 / scalingFactor);
               int var5 = (int)((double)var3 / scalingFactor);
               if(var4 < 765 || var5 < 503) {
                  double var6 = (double)var2 / 765.0D;
                  double var8 = (double)var3 / 503.0D;
                  double var10 = Math.min(var6, var8);
                  var4 = (int)((double)var2 / var10);
                  var5 = (int)((double)var3 / var10);
               }

               cachedRealDimensions = new Dimension(var4, var5);
            } else {
               cachedRealDimensions = Constants.GAME_FIXED_SIZE;
            }
         }

         return cachedRealDimensions;
      }
   }

   public byte[][][] getTileSettings() {
      return class91.tileSettings;
   }

   private void rl$$init3() {
   }

   public RSScriptEvent createScriptEvent() {
      return new ScriptEvent();
   }

   public RSSoundEffect[] getAudioEffects() {
      return audioEffects;
   }

   public int getIndexedSpriteHeight() {
      return class96.indexedSpriteHeight;
   }

   public int[] _protect$getMenuActionParams0/* $FF was: _protect$getMenuActionParams0*/() {
      return menuActionParams0;
   }

   public int getPlane() {
      return ServerProt.level;
   }

   public RSBufferProvider getBufferProvider() {
      return Location.rasterProvider;
   }

   public void setMinimapSprite(net.runelite.api.SpritePixels var1) {
      class281.minimapSprite = (SpritePixels)var1;
   }

   public boolean boundingboxCheck(net.runelite.api.Model var1, int var2, int var3, int var4) {
      int var5 = ItemContainer.clientInstance.getCameraPitch();
      int var6 = ItemContainer.clientInstance.getCameraYaw();
      int var7 = Perspective.SINE[var5];
      int var8 = Perspective.COSINE[var5];
      int var9 = Perspective.SINE[var6];
      int var10 = Perspective.COSINE[var6];
      int var11 = ItemContainer.clientInstance.getCenterX();
      int var12 = ItemContainer.clientInstance.getCenterY();
      int var13 = ItemContainer.clientInstance.getViewportMouseX();
      int var14 = ItemContainer.clientInstance.getViewportMouseY();
      int var15 = ItemContainer.clientInstance.get3dZoom();
      int var16 = (var13 - var11) * 50 / var15;
      int var17 = (var14 - var12) * 50 / var15;
      int var18 = (var13 - var11) * 3500 / var15;
      int var19 = (var14 - var12) * 3500 / var15;
      int var20 = rl$rot1(var17, 50, var8, var7);
      int var21 = rl$rot2(var17, 50, var8, var7);
      var17 = var20;
      var20 = rl$rot1(var19, 3500, var8, var7);
      int var22 = rl$rot2(var19, 3500, var8, var7);
      var19 = var20;
      var20 = rl$rot3(var16, var21, var10, var9);
      var21 = rl$rot4(var16, var21, var10, var9);
      var16 = var20;
      var20 = rl$rot3(var18, var22, var10, var9);
      var22 = rl$rot4(var18, var22, var10, var9);
      int var23 = (var20 - var16) / 2;
      int var24 = (var19 - var17) / 2;
      int var25 = (var22 - var21) / 2;
      int var26 = Math.abs(var23);
      int var27 = Math.abs(var24);
      int var28 = Math.abs(var25);
      int var29 = var2 + var1.getCenterX();
      int var30 = var3 + var1.getCenterY();
      int var31 = var4 + var1.getCenterZ();
      int var32 = var1.getExtremeX();
      int var33 = var1.getExtremeY();
      int var34 = var1.getExtremeZ();
      int var35 = (var16 + var20) / 2;
      int var36 = (var17 + var19) / 2;
      int var37 = (var22 + var21) / 2;
      int var38 = var35 - var29;
      int var39 = var36 - var30;
      int var40 = var37 - var31;
      boolean var41;
      if(Math.abs(var38) > var32 + var26) {
         var41 = false;
      } else if(Math.abs(var39) > var33 + var27) {
         var41 = false;
      } else if(Math.abs(var40) > var34 + var28) {
         var41 = false;
      } else if(Math.abs(var40 * var24 - var39 * var25) > var33 * var28 + var34 * var27) {
         var41 = false;
      } else if(Math.abs(var38 * var25 - var40 * var23) > var34 * var26 + var32 * var28) {
         var41 = false;
      } else if(Math.abs(var39 * var23 - var38 * var24) > var33 * var26 + var32 * var27) {
         var41 = false;
      } else {
         var41 = true;
      }

      return var41;
   }

   private void rl$$init4() {
   }

   public int[] getSoundLocations() {
      return soundLocations;
   }

   public int[] getIndexedSpriteOffsetXs() {
      return class96.indexedSpriteOffsetXs;
   }

   public void RasterizerDrawHorizontalLine(int var1, int var2, int var3, int var4) {
      Rasterizer2D.method698(var1, var2, var3, var4);
   }

   public int[] _protect$getMenuActionParams1/* $FF was: _protect$getMenuActionParams1*/() {
      return menuActionParams1;
   }

   public void runScript(RSScriptEvent var1, int var2) {
      class258.method4859((ScriptEvent)var1, var2, -2128692103);
   }

   private void rl$$init5() {
   }

   public int getQueuedSoundEffectCount() {
      return queuedSoundEffectCount;
   }

   public int[] getIndexedSpriteOffsetYs() {
      return GameCanvas.indexedSpriteOffsetYs;
   }

   public boolean[] getMenuForceLeftClick() {
      return menuBooleanArray;
   }

   private void rl$$init6() {
   }

   public int[] getIndexSpriteWidths() {
      return class96.indexSpriteWidths;
   }

   public void setMenuOptionCount(int var1) {
      menuOptionCount = var1;
   }

   @Override
   public String[] getMenuOptions() {
      return menuOptions;
   }

   @Override
   public String[] getMenuTargets() {
      return menuTargets;
   }

   @Override
   public int[] getMenuIdentifiers() {
      return menuIdentifiers;
   }

   @Override
   public int[] getMenuTypes() {
      return menuTypes;
   }

   @Override
   public int[] getMenuActionParams0() {
      return menuActionParams0;
   }

   @Override
   public int[] getMenuActionParams1() {
      return menuActionParams1;
   }

   private void rl$$init7() {
      this.enumCache = CacheBuilder.newBuilder().maximumSize(64L).build();
   }

   public int[] getIndexedSpriteHeights() {
      return class96.indexedSpriteHeights;
   }

   private void rl$$init8() {
   }

   public byte[][] getSpritePixels() {
      return class241.spritePixels;
   }

   public void addHashAtMouse(long var1) {
      long[] var3 = ItemContainer.clientInstance.getEntitiesAtMouse();
      int var4 = ItemContainer.clientInstance.getEntitiesAtMouseCount();
      if(var4 < 1000) {
         var3[var4] = var1;
         ItemContainer.clientInstance.setEntitiesAtMouseCount(var4 + 1);
      }

   }

   private void rl$$init9() {
   }

   public void setQueuedSoundEffectCount(int var1) {
      queuedSoundEffectCount = var1;
   }

   public int[] getIndexedSpritePalette() {
      return class96.indexedSpritePalette;
   }

   public void RasterizerDrawVerticalLine(int var1, int var2, int var3, int var4) {
      Rasterizer2D.method757(var1, var2, var3, var4);
   }

   private void rl$$init10() {
   }

   public void setIndexedSpriteOffsetXs(int[] var1) {
      class96.indexedSpriteOffsetXs = var1;
   }

   private void rl$$init11() {
   }

   public void setIndexedSpriteOffsetYs(int[] var1) {
      GameCanvas.indexedSpriteOffsetYs = var1;
   }

   private void rl$$init12() {
      this.varbitCache = CacheBuilder.newBuilder().maximumSize(128L).build();
   }

   public void setIndexSpriteWidths(int[] var1) {
      class96.indexSpriteWidths = var1;
   }

   private void rl$$init13() {
   }

   public void setIndexedSpriteHeights(int[] var1) {
      class96.indexedSpriteHeights = var1;
   }

   public void setIndexSpritePalette(int[] var1) {
      class96.indexedSpritePalette = var1;
   }

   public void RasterizerDrawRectangle(int var1, int var2, int var3, int var4, int var5) {
      Rasterizer2D.method696(var1, var2, var3, var4, var5);
   }

   public void setSpritePixels(byte[][] var1) {
      class241.spritePixels = var1;
   }

   public void drawObject(int var1, int var2, int var3, int var4, int var5) {
      PlayerComposition.method814(var1, var2, var3, var4, var5);
   }

   public void RasterizerDrawCircle(int var1, int var2, int var3, int var4) {
      Rasterizer2D.method689(var1, var2, var3, var4);
   }

   public void RasterizerDrawGradient(int var1, int var2, int var3, int var4, int var5, int var6) {
      Rasterizer2D.method761(var1, var2, var3, var4, var5, var6);
   }

   public void RasterizerFillRectangle(int var1, int var2, int var3, int var4, int var5) {
      Rasterizer2D.method692(var1, var2, var3, var4, var5);
   }

   public RSFont getFontBold12() {
      return class191.fontBold12;
   }

   public void RasterizerFillRectangleAlpha(int var1, int var2, int var3, int var4, int var5, int var6) {
      Rasterizer2D.method691(var1, var2, var3, var4, var5, var6);
   }

   public final void init() {
      try {
         if(this.canUseHost()) {
            Parameters[] var1 = MapIcon.method4082();

            for(int var2 = 0; var2 < var1.length; ++var2) {
               Parameters var3 = var1[var2];
               String var4 = this.getParameter(var3.key);
               if(var4 != null) {
                  switch(Integer.parseInt(var3.key)) {
                  case 1:
                     field697 = Integer.parseInt(var4) != 0;
                  case 2:
                  case 11:
                  case 13:
                  case 16:
                  default:
                     break;
                  case 3:
                     if(var4.equalsIgnoreCase("true")) {
                        isMembers = true;
                     } else {
                        isMembers = false;
                     }
                     break;
                  case 4:
                     if(confClientType == -1) {
                        confClientType = Integer.parseInt(var4);
                     }
                     break;
                  case 5:
                     flags = Integer.parseInt(var4);
                     break;
                  case 6:
                     languageId = Integer.parseInt(var4);
                     break;
                  case 7:
                     WorldComparator.field33 = AuthProt.method6378(Integer.parseInt(var4));
                     break;
                  case 8:
                     if(var4.equalsIgnoreCase("true")) {
                        ;
                     }
                     break;
                  case 9:
                     class52.sessionToken = var4;
                     break;
                  case 10:
                     ModeGame[] var5 = new ModeGame[]{ModeGame.STELLARDAWN, ModeGame.GAME4, ModeGame.OLDSCAPE, ModeGame.GAME5, ModeGame.RUNESCAPE, ModeGame.GAME3};
                     TradingPost.field38 = (ModeGame)PlayerList.method4757(var5, Integer.parseInt(var4));
                     if(ModeGame.OLDSCAPE == TradingPost.field38) {
                        KeyFocusListener.loginType = JagexLoginType.field4016;
                     } else {
                        KeyFocusListener.loginType = JagexLoginType.field4017;
                     }
                     break;
                  case 12:
                     world = Integer.parseInt(var4);
                     break;
                  case 14:
                     ClientOptions.field1034 = Integer.parseInt(var4);
                     break;
                  case 15:
                     socketType = Integer.parseInt(var4);
                     break;
                  case 17:
                     class312.field31 = var4;
                  }
               }
            }

            SceneManager.regionLowMemory = false;
            lowMemory = false;
            class135.host = this.getCodeBase().getHost();
            String var31 = WorldComparator.field33.identifier;
            byte var32 = 0;

            try {
               OwnWorldComparator.archiveCount = 21;
               class47.historicCacheId = var32;

               try {
                  ChatLineBuffer.osNameRaw = System.getProperty("os.name");
               } catch (Exception var26) {
                  ChatLineBuffer.osNameRaw = "Unknown";
               }

               WorldMapDecoration.osName = ChatLineBuffer.osNameRaw.toLowerCase();

               try {
                  class69.homeDir = System.getProperty("user.home");
                  if(class69.homeDir != null) {
                     class69.homeDir = class69.homeDir + "/";
                  }
               } catch (Exception var25) {
                  ;
               }

               try {
                  if(WorldMapDecoration.osName.startsWith("win")) {
                     if(class69.homeDir == null) {
                        class69.homeDir = System.getenv("USERPROFILE");
                     }
                  } else if(class69.homeDir == null) {
                     class69.homeDir = System.getenv("HOME");
                  }

                  if(class69.homeDir != null) {
                     class69.homeDir = class69.homeDir + "/";
                  }
               } catch (Exception var24) {
                  ;
               }

               if(class69.homeDir == null) {
                  class69.homeDir = "~/";
               }

               class133.historicCacheLocations = new String[]{"c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", class69.homeDir, "/tmp/", ""};
               class211.historicCacheDirectories = new String[]{".zenyte_cache_" + class47.historicCacheId, ".file_store_" + class47.historicCacheId};
               int var17 = 0;

               label250:
               while(var17 < 4) {
                  String var34 = var17 == 0?"":"" + var17;
                  class75.cacheLocator = new File(class69.homeDir, "zenyte_cl_oldschool_" + var31 + var34 + ".dat");
                  String var6 = null;
                  String var7 = null;
                  boolean var8 = false;
                  File var37;
                  if(class75.cacheLocator.exists()) {
                     try {
                        FileOnDisk var9 = new FileOnDisk(class75.cacheLocator, "rw", 10000L);

                        Packet var10;
                        int var11;
                        for(var10 = new Packet((int)var9.method5053()); var10.offset < var10.payload.length; var10.offset += var11) {
                           var11 = var9.method5054(var10.payload, var10.offset, var10.payload.length - var10.offset);
                           if(var11 == -1) {
                              throw new IOException();
                           }
                        }

                        var10.offset = 0;
                        var11 = var10.readUnsignedByte();
                        if(var11 < 1 || var11 > 3) {
                           throw new IOException("" + var11);
                        }

                        int var12 = 0;
                        if(var11 > 1) {
                           var12 = var10.readUnsignedByte();
                        }

                        if(var11 <= 2) {
                           var6 = var10.method5096();
                           if(var12 == 1) {
                              var7 = var10.method5096();
                           }
                        } else {
                           var6 = var10.method5223();
                           if(var12 == 1) {
                              var7 = var10.method5223();
                           }
                        }

                        var9.method5051();
                     } catch (IOException var28) {
                        var28.printStackTrace();
                     }

                     if(var6 != null) {
                        var37 = new File(var6);
                        if(!var37.exists()) {
                           var6 = null;
                        }
                     }

                     if(var6 != null) {
                        var37 = new File(var6, "test.dat");
                        if(!AuthProt.method6379(var37, true)) {
                           var6 = null;
                        }
                     }
                  }
                  if(var6 == null && var17 == 0) {
                     label225:
                     for(int var18 = 0; var18 < class211.historicCacheDirectories.length; ++var18) {
                        for(int var19 = 0; var19 < class133.historicCacheLocations.length; ++var19) {
                           File var20 = new File(class133.historicCacheLocations[var19] + class211.historicCacheDirectories[var18] + File.separatorChar + "oldschool" + File.separatorChar);
                           if(var20.exists() && AuthProt.method6379(new File(var20, "test.dat"), true)) {
                              var6 = var20.toString();
                              var8 = true;
                              break label225;
                           }
                        }
                     }
                  }
                  if(var6 == null) {
                     var6 = class69.homeDir + File.separatorChar + ".zenyte" + var34 + File.separatorChar + "cache" + File.separatorChar;
                     var8 = true;
                  }

                  if(var7 != null) {
                     File var36 = new File(var7);
                     var37 = new File(var6);

                     try {
                        File[] var39 = var36.listFiles();
                        File[] var21 = var39;

                        for(int var13 = 0; var13 < var21.length; ++var13) {
                           File var14 = var21[var13];
                           File var15 = new File(var37, var14.getName());
                           boolean var16 = var14.renameTo(var15);
                           if(!var16) {
                              throw new IOException();
                           }
                        }
                     } catch (Exception var27) {
                        var27.printStackTrace();
                     }

                     var8 = true;
                  }

                  if(var8) {
                     class171.method2692(new File(var6), (File)null);
                  }

                  File var33 = new File(var6);
                  class75.cacheDirectory = var33;
                  if(!class75.cacheDirectory.exists()) {
                     class75.cacheDirectory.mkdirs();
                  }

                  File[] var35 = class75.cacheDirectory.listFiles();
                  if(var35 == null) {
                     break;
                  }

                  File[] var38 = var35;
                  int var22 = 0;

                  while(true) {
                     if(var22 >= var38.length) {
                        break label250;
                     }

                     File var23 = var38[var22];
                     if(!AuthProt.method6379(var23, false)) {
                        ++var17;
                        break;
                     }

                     ++var22;
                  }
               }

               Entity.method1814(class75.cacheDirectory);
               Tile.method3823();
               class75.cacheDat = new CacheFile(new FileOnDisk(class191.method3808("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
               class75.masterIndex = new CacheFile(new FileOnDisk(class191.method3808("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
               MouseRecorder.cacheIndex = new CacheFile[OwnWorldComparator.archiveCount];

               for(var17 = 0; var17 < OwnWorldComparator.archiveCount; ++var17) {
                  MouseRecorder.cacheIndex[var17] = new CacheFile(new FileOnDisk(class191.method3808("main_file_cache.idx" + var17), "rw", 1048576L), 6000, 0);
               }
            } catch (Exception var29) {
               VertexNormal.method4110((String)null, var29, (byte)-108);
            }

            ItemContainer.clientInstance = this;
            JagException.clientType = confClientType;
            this.method4417(765, 503, 179);
         }
      } catch (RuntimeException var30) {
         var30.printStackTrace();
         throw class284.method5855(var30, "client.init(" + ')');
      }
   }

   public void setCameraPitchRelaxerEnabled(boolean var1) {
      if(pitchRelaxEnabled != var1) {
         pitchRelaxEnabled = var1;
         if(!var1) {
            int var2 = ItemContainer.clientInstance.getCameraPitchTarget();
            if(var2 > 383) {
               ItemContainer.clientInstance.setCameraPitchTarget(383);
            }
         }

      }
   }

   public void checkClickbox(net.runelite.api.Model var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, long var10) {
      RSModel var12 = (RSModel)var1;
      boolean var13 = var10 != 0L && (int)(var10 >>> 16 & 1L) != 1;
      boolean var14 = ItemContainer.clientInstance.getViewportContainsMouse();
      if(var13 && var14 && ItemContainer.clientInstance.getOculusOrbState() == 0) {
         boolean var15 = this.boundingboxCheck(var12, var7, var8, var9);
         if(var15) {
            if(Math.sqrt((double)(var7 * var7 + var9 * var9)) <= 4480.0D) {
               if(var12.isClickable()) {
                  this.addHashAtMouse(var10);
               } else {
                  int var16 = var12.getVerticesCount();
                  int var17 = var12.getTrianglesCount();
                  int[] var18 = var12.getVerticesX();
                  int[] var19 = var12.getVerticesY();
                  int[] var20 = var12.getVerticesZ();
                  int[] var21 = var12.getTrianglesX();
                  int[] var22 = var12.getTrianglesY();
                  int[] var23 = var12.getTrianglesZ();
                  int[] var24 = var12.getFaceColors3();
                  int var25 = ItemContainer.clientInstance.get3dZoom();
                  int var26 = ItemContainer.clientInstance.getCenterX();
                  int var27 = ItemContainer.clientInstance.getCenterY();
                  int var28 = 0;
                  int var29 = 0;
                  if(var2 != 0) {
                     var28 = Perspective.SINE[var2];
                     var29 = Perspective.COSINE[var2];
                  }

                  int var30;
                  int var31;
                  int var32;
                  int var33;
                  int var34;
                  for(var30 = 0; var30 < var16; ++var30) {
                     var31 = var18[var30];
                     var32 = var19[var30];
                     var33 = var20[var30];
                     if(var2 != 0) {
                        var34 = var33 * var28 + var31 * var29 >> 16;
                        var33 = var33 * var29 - var31 * var28 >> 16;
                        var31 = var34;
                     }

                     var31 += var7;
                     var32 += var8;
                     var33 += var9;
                     var34 = var31 * var6 + var5 * var33 >> 16;
                     var33 = var33 * var6 - var5 * var31 >> 16;
                     var31 = var34;
                     var34 = var32 * var4 - var3 * var33 >> 16;
                     var33 = var33 * var4 + var3 * var32 >> 16;
                     if(var33 >= 50) {
                        rl$modelViewportYs[var30] = var31 * var25 / var33 + var26;
                        rl$modelViewportXs[var30] = var34 * var25 / var33 + var27;
                     } else {
                        rl$modelViewportYs[var30] = -5000;
                     }
                  }

                  var30 = ItemContainer.clientInstance.getViewportMouseX();
                  var31 = ItemContainer.clientInstance.getViewportMouseY();

                  for(var32 = 0; var32 < var17; ++var32) {
                     if(var24[var32] != -2) {
                        var33 = var21[var32];
                        var34 = var22[var32];
                        int var35 = var23[var32];
                        int var36 = rl$modelViewportYs[var33];
                        int var37 = rl$modelViewportYs[var34];
                        int var38 = rl$modelViewportYs[var35];
                        int var39 = rl$modelViewportXs[var33];
                        int var40 = rl$modelViewportXs[var34];
                        int var41 = rl$modelViewportXs[var35];
                        if(var36 != -5000 && var37 != -5000 && var38 != -5000) {
                           int var42 = var12.isClickable()?20:5;
                           int var43 = var42 + var31;
                           boolean var44;
                           if(var43 < var39 && var43 < var40 && var43 < var41) {
                              var44 = false;
                           } else {
                              var43 = var31 - var42;
                              if(var43 > var39 && var43 > var40 && var43 > var41) {
                                 var44 = false;
                              } else {
                                 var43 = var42 + var30;
                                 if(var43 < var36 && var43 < var37 && var43 < var38) {
                                    var44 = false;
                                 } else {
                                    var43 = var30 - var42;
                                    if(var43 > var36 && var43 > var37 && var43 > var38) {
                                       var44 = false;
                                    } else {
                                       var44 = true;
                                    }
                                 }
                              }
                           }

                           if(var44) {
                              this.addHashAtMouse(var10);
                              break;
                           }
                        }
                     }
                  }

               }
            }
         }
      }
   }

   public void setIsHidingEntities(boolean var1) {
      isHidingEntities = var1;
   }

   public void setPlayersHidden(boolean var1) {
      hidePlayers = var1;
   }

   public void setPlayersHidden2D(boolean var1) {
      hidePlayers2D = var1;
   }

   public void setFriendsHidden(boolean var1) {
      hideFriends = var1;
   }

   public void setClanMatesHidden(boolean var1) {
      hideClanMates = var1;
   }

   public void setLocalPlayerHidden(boolean var1) {
      hideLocalPlayer = var1;
   }

   public void setLocalPlayerHidden2D(boolean var1) {
      hideLocalPlayer2D = var1;
   }

   public void setNPCsHidden(boolean var1) {
      hideNPCs = var1;
   }

   public void setNPCsHidden2D(boolean var1) {
      hideNPCs2D = var1;
   }

   public void setAttackersHidden(boolean var1) {
      hideAttackers = var1;
   }

   public void setProjectilesHidden(boolean var1) {
      hideProjectiles = var1;
   }

   public void draw2010Menu() {
      int var1 = this.getMenuX();
      int var2 = this.getMenuY();
      int var3 = this.getMenuWidth();
      int var4 = this.getMenuHeight();
      this.RasterizerDrawHorizontalLine(var1 + 2, var2, var3 - 4, 7170651);
      this.RasterizerDrawHorizontalLine(var1 + 2, var2 + var4 - 1, var3 - 4, 7170651);
      this.RasterizerDrawVerticalLine(var1, var2 + 2, var4 - 4, 7170651);
      this.RasterizerDrawVerticalLine(var1 + var3 - 1, var2 + 2, var4 - 4, 7170651);
      this.RasterizerDrawRectangle(var1 + 1, var2 + 5, var3 - 2, var4 - 6, 2827810);
      this.RasterizerDrawHorizontalLine(var1 + 1, var2 + 17, var3 - 2, 2827810);
      this.RasterizerDrawCircle(var1 + 2, var2 + var4 - 3, 0, 2827810);
      this.RasterizerDrawCircle(var1 + var3 - 3, var2 + var4 - 3, 0, 2827810);
      this.RasterizerDrawGradient(var1 + 2, var2 + 1, var3 - 4, 16, 3288610, 592388);
      this.RasterizerFillRectangle(var1 + 1, var2 + 1, 2, 4, 2827810);
      this.RasterizerFillRectangle(var1 + var3 - 3, var2 + 1, 2, 4, 2827810);
      this.RasterizerDrawHorizontalLine(var1 + 2, var2 + 18, var3 - 4, 5392957);
      this.RasterizerDrawHorizontalLine(var1 + 3, var2 + var4 - 3, var3 - 6, 5392957);
      this.RasterizerDrawVerticalLine(var1 + 2, var2 + 18, var4 - 21, 5392957);
      this.RasterizerDrawVerticalLine(var1 + var3 - 3, var2 + 18, var4 - 21, 5392957);
      this.RasterizerFillRectangle(var1 + 3, var2 + 19, var3 - 6, var4 - 22, 2828060);
      this.RasterizerDrawCircle(var1 + 1, var2 + 1, 0, 7170651);
      this.RasterizerDrawCircle(var1 + var3 - 2, var2 + 1, 0, 7170651);
      this.RasterizerDrawCircle(var1 + 1, var2 + var4 - 2, 0, 7170651);
      this.RasterizerDrawCircle(var1 + var3 - 2, var2 + var4 - 2, 0, 7170651);
      RSFont var5 = this.getFontBold12();
      var5.drawTextLeftAligned("Choose Option", var1 + 3, var2 + 14, 13023381, -1);
      int var6 = this.getMouseX();
      int var7 = this.getMouseY();
      int var8 = this.getMenuOptionCount();
      String[] var9 = this._protect$getMenuTargets();
      String[] var10 = this._protect$getMenuOptions();

      for(int var11 = 0; var11 < var8; ++var11) {
         int var12 = (var8 - 1 - var11) * 15 + var2 + 31;
         String var13 = var10[var11];
         if(!var9[var11].isEmpty()) {
            var13 = var13 + " " + var9[var11];
         }

         var5.drawTextLeftAligned(var13, var1 + 3, var12, 13023381, -1);
         if(var6 > var1 && var6 < var3 + var1 && var7 > var12 - 13 && var7 < var12 + 3) {
            this.RasterizerFillRectangleAlpha(var1 + 3, var12 - 12, var3 - 6, 15, 16777215, 80);
         }
      }

   }

   public void playSoundEffect(int var1) {
      this.playSoundEffect(var1, 0, 0, 0);
   }

   public Callbacks getCallbacks() {
      return this.callbacks;
   }

   public DrawCallbacks getDrawCallbacks() {
      return this.drawCallbacks;
   }

   public void setDrawCallbacks(DrawCallbacks var1) {
      this.drawCallbacks = var1;
   }

   public Logger getLogger() {
      return this.logger;
   }

   public boolean isInterpolatePlayerAnimations() {
      return interpolatePlayerAnimations;
   }

   public void setInterpolatePlayerAnimations(boolean var1) {
      interpolatePlayerAnimations = var1;
   }

   public boolean isInterpolateNpcAnimations() {
      return interpolateNpcAnimations;
   }

   public void setInterpolateNpcAnimations(boolean var1) {
      interpolateNpcAnimations = var1;
   }

   public boolean isInterpolateObjectAnimations() {
      return interpolateObjectAnimations;
   }

   public void setInterpolateObjectAnimations(boolean var1) {
      interpolateObjectAnimations = var1;
   }

   public void setInventoryDragDelay(int var1) {
      inventoryDragDelay = var1;
   }

   public AccountType getAccountType() {
      int var1 = this.getVar(Varbits.ACCOUNT_TYPE);
      switch(var1) {
      case 1:
         return AccountType.IRONMAN;
      case 2:
         return AccountType.ULTIMATE_IRONMAN;
      case 3:
         return AccountType.HARDCORE_IRONMAN;
      default:
         return AccountType.NORMAL;
      }
   }

   public void setMouseCanvasHoverPosition(Point var1) {
      this.setMouseCanvasHoverPositionX(var1.getX());
      this.setMouseCanvasHoverPositionY(var1.getY());
   }

   public net.runelite.api.Tile getSelectedSceneTile() {
      int var1 = this.getSelectedSceneTileX();
      int var2 = this.getSelectedSceneTileY();
      return var1 != -1 && var2 != -1?this.getScene().getTiles()[this.getPlane()][var1][var2]:null;
   }

   public List getPlayers() {
      int var1 = this.getPlayerIndexesCount();
      int[] var2 = this.getPlayerIndices();
      RSPlayer[] var3 = this.getCachedPlayers();
      ArrayList var4 = new ArrayList(var1);

      for(int var5 = 0; var5 < var1; ++var5) {
         var4.add(var3[var2[var5]]);
      }

      return var4;
   }

   public List getNpcs() {
      int var1 = this.getNpcIndexesCount();
      int[] var2 = this.getNpcIndices();
      RSNPC[] var3 = this.getCachedNPCs();
      ArrayList var4 = new ArrayList(var1);

      for(int var5 = 0; var5 < var1; ++var5) {
         var4.add(var3[var2[var5]]);
      }

      return var4;
   }

   public int getBoostedSkillLevel(Skill var1) {
      int[] var2 = this.getBoostedSkillLevels();
      return var2[var1.ordinal()];
   }

   public int getRealSkillLevel(Skill var1) {
      int[] var2 = this.getRealSkillLevels();
      return var2[var1.ordinal()];
   }

   public int getTotalLevel() {
      int var1 = 0;
      int[] var2 = ItemContainer.clientInstance.getRealSkillLevels();
      int var3 = Skill.CONSTRUCTION.ordinal();

      for(int var4 = 0; var4 < var2.length; ++var4) {
         if(var4 <= var3) {
            var1 += var2[var4];
         }
      }

      return var1;
   }

   public void addChatMessage(ChatMessageType var1, String var2, String var3, String var4) {
      this.addChatMessage(var1.getType(), var2, var3, var4);
   }

   public GameState getGameState() {
      return GameState.of(this.getRSGameState());
   }

   public Point getMouseCanvasPosition() {
      return new Point(this.getMouseX(), this.getMouseY());
   }

   public Widget[] getWidgetRoots() {
      int var1 = this.getWidgetRoot();
      ArrayList var2 = new ArrayList();
      RSWidget[] var3 = this.getWidgets()[var1];
      int var4 = var3.length;

      for(int var5 = 0; var5 < var4; ++var5) {
         RSWidget var6 = var3[var5];
         if(var6 != null && var6.getRSParentId() == -1) {
            var2.add(var6);
         }
      }

      return (Widget[])var2.toArray(new Widget[var2.size()]);
   }

   public RSWidget[] getGroup(int var1) {
      RSWidget[][] var2 = this.getWidgets();
      return var2 != null && var1 >= 0 && var1 < var2.length && var2[var1] != null?var2[var1]:null;
   }

   public int getVar(VarPlayer var1) {
      int[] var2 = this.getVarps();
      return var2[var1.getId()];
   }

   public int getVarpValue(int[] var1, int var2) {
      return var1[var2];
   }

   /**
    * Test if a key is pressed
    *
    * @param keycode the keycode
    * @return
    * @see KeyCode
    */
   @Override
   public boolean isKeyPressed(int keycode) {
      return false;
   }

   public void setVarpValue(int[] var1, int var2, int var3) {
      var1[var2] = var3;
   }

   public boolean isPrayerActive(Prayer var1) {
      return this.getVar(var1.getVarbit()) == 1;
   }

   public int getSkillExperience(Skill var1) {
      int[] var2 = this.getSkillExperiences();
      if(var1 == Skill.OVERALL) {
         this.logger.debug("getSkillExperience called for {}!", var1);
         return (int)this.getOverallExperience();
      } else {
         int var3 = var1.ordinal();
         return var3 >= var2.length?-1:var2[var3];
      }
   }

   public void refreshChat() {
      this.setChatCycle(this.getCycleCntr());
   }

   public Widget getViewportWidget() {
      return this.isResized()?(this.getVar(Varbits.SIDE_PANELS) == 1?this.getWidget(WidgetInfo.RESIZABLE_VIEWPORT_BOTTOM_LINE):this.getWidget(WidgetInfo.RESIZABLE_VIEWPORT_OLD_SCHOOL_BOX)):this.getWidget(WidgetInfo.FIXED_VIEWPORT);
   }

   public void setMenuEntries(MenuEntry[] var1) {
      int var2 = 0;
      String[] var3 = this._protect$getMenuOptions();
      String[] var4 = this._protect$getMenuTargets();
      int[] var5 = this._protect$getMenuIdentifiers();
      int[] var6 = this._protect$getMenuTypes();
      int[] var7 = this._protect$getMenuActionParams0();
      int[] var8 = this._protect$getMenuActionParams1();
      boolean[] var9 = this.getMenuForceLeftClick();
      MenuEntry[] var10 = var1;
      int var11 = var1.length;

      for(int var12 = 0; var12 < var11; ++var12) {
         MenuEntry var13 = var10[var12];
         int var14 = var13.getType();
         if((var14 == MenuAction.NPC_THIRD_OPTION.getId() || var14 == MenuAction.NPC_FIFTH_OPTION.getId()) && var2 == var1.length - 1 && ItemContainer.clientInstance.getLocalPlayer().getWorldLocation().getRegionID() == 13358) {
            String var15 = var13.getOption().toLowerCase();
            if(var15.hashCode() == 974723797 || var15.hashCode() == -1108625161) {
               var14 = MenuAction.CANCEL.getId();
            }
         }

         var3[var2] = var13.getOption();
         var4[var2] = var13.getTarget();
         var5[var2] = var13.getIdentifier();
         var6[var2] = var14;
         var7[var2] = var13.getParam0();
         var8[var2] = var13.getParam1();
         var9[var2] = var13.isForceLeftClick();
         ++var2;
      }

      this.setMenuOptionCount(var2);
      oldMenuEntryCount = var2;
   }

   public List getProjectiles() {
      ArrayList var1 = new ArrayList();
      RSDeque var2 = this._protect$getProjectilesDeque();
      RSNode var3 = var2.getHead();
      net.runelite.api.Node var4 = var3.getNext();

      while(var4 != var3) {
         Projectile var5 = (Projectile)var4;
         switch(var5.getId()) {
         default:
            var1.add(var5);
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
         case 1481:
         case 1482:
         case 1483:
         case 1484:
         case 1555:
         case 1580:
         case 1583:
         case 1585:
         case 1586:
         case 1587:
         case 1593:
         case 1594:
         case 1596:
         case 1598:
         case 1601:
         case 1662:
         case 1663:
            var4 = var4.getNext();
         }
      }

      return var1;
   }

   public List getGraphicsObjects() {
      ArrayList var1 = new ArrayList();
      RSDeque var2 = this.getGraphicsObjectDeque();
      RSNode var3 = var2.getHead();

      for(net.runelite.api.Node var4 = var3.getNext(); var4 != var3; var4 = var4.getNext()) {
         var1.add((GraphicsObject)var4);
      }

      return var1;
   }

   public void setModIcons(net.runelite.api.IndexedSprite[] var1) {
      this.setRSModIcons((RSIndexedSprite[])((RSIndexedSprite[])var1));
   }

   public LocalPoint getLocalDestinationLocation() {
      int var1 = this.getDestinationX();
      int var2 = this.getDestinationY();
      return var1 != 0 && var2 != 0?LocalPoint.fromScene(var1, var2):null;
   }

   public void changeMemoryMode(boolean var1) {
      this.setLowMemory(var1);
      this.setSceneLowMemory(var1);
      this.setAudioHighMemory(true);
      this.setObjectCompositionLowDetail(var1);
   }

   public boolean isFriended(String var1, boolean var2) {
      RSName var3 = this.createName(var1, this.getLoginType());
      return this.getFriendManager().isFriended(var3, var2);
   }

   public int getClanChatCount() {
      RSClanMemberManager var1 = this.getClanMemberManager();
      return var1 != null?var1.getCount():0;
   }

   public net.runelite.api.ClanMember[] getClanMembers() {
      RSClanMemberManager var1 = this.getClanMemberManager();
      if(var1 == null) {
         return null;
      } else {
         int var2 = var1.getCount();
         return (net.runelite.api.ClanMember[])Arrays.copyOf(var1.getNameables(), var2);
      }
   }

   public String getClanOwner() {
      return this.getClanMemberManager().getClanOwner();
   }

   public String getClanChatName() {
      return this.getClanMemberManager().getClanChatName();
   }

   public net.runelite.api.Friend[] getFriends() {
      RSFriendManager var1 = this.getFriendManager();
      if(var1 == null) {
         return null;
      } else {
         RSFriendContainer var2 = var1.getFriendContainer();
         if(var2 == null) {
            return null;
         } else {
            int var3 = var2.getCount();
            return (net.runelite.api.Friend[])Arrays.copyOf(var2.getNameables(), var3);
         }
      }
   }

   public int getFriendsCount() {
      RSFriendManager var1 = this.getFriendManager();
      if(var1 == null) {
         return -1;
      } else {
         RSFriendContainer var2 = var1.getFriendContainer();
         return var2 == null?-1:var2.getCount();
      }
   }

   public net.runelite.api.Ignore[] getIgnores() {
      RSFriendManager var1 = this.getFriendManager();
      if(var1 == null) {
         return null;
      } else {
         RSIgnoreContainer var2 = var1.getIgnoreContainer();
         if(var2 == null) {
            return null;
         } else {
            int var3 = var2.getCount();
            return (net.runelite.api.Ignore[])Arrays.copyOf(var2.getNameables(), var3);
         }
      }
   }

   public int getIgnoreCount() {
      RSFriendManager var1 = this.getFriendManager();
      if(var1 == null) {
         return -1;
      } else {
         RSIgnoreContainer var2 = var1.getIgnoreContainer();
         return var2 == null?-1:var2.getCount();
      }
   }

   public boolean isClanMember(String var1) {
      RSClanMemberManager var2 = this.getClanMemberManager();
      return var2 != null && var2.isMember(this.createName(var1, this.getLoginType()));
   }

   public net.runelite.api.SpritePixels createItemSprite(int var1, int var2, int var3, int var4, int var5, boolean var6, int var7) {
      if(!$assertionsDisabled && !this.isClientThread()) {
         throw new AssertionError();
      } else {
         int var8 = this.get3dZoom();
         this.set3dZoom(var7);

         RSSpritePixels var9;
         try {
            var9 = this.createItemSprite(var1, var2, var3, var4, var5, var6);
         } finally {
            this.set3dZoom(var8);
         }

         return var9;
      }
   }

   public boolean hasHintArrow() {
      return ItemContainer.clientInstance.getHintArrowTargetType() != HintArrowType.NONE.getValue();
   }

   public void clearHintArrow() {
      ItemContainer.clientInstance.setHintArrowTargetType(HintArrowType.NONE.getValue());
   }

   public void setHintArrow(NPC var1) {
      ItemContainer.clientInstance.setHintArrowTargetType(HintArrowType.NPC.getValue());
      ItemContainer.clientInstance.setHintArrowNpcTargetIdx(var1.getIndex());
   }

   public void setHintArrow(Player var1) {
      ItemContainer.clientInstance.setHintArrowTargetType(HintArrowType.PLAYER.getValue());
      ItemContainer.clientInstance.setHintArrowPlayerTargetIdx(((RSPlayer)var1).getPlayerId());
   }

   public void setHintArrow(WorldPoint var1) {
      ItemContainer.clientInstance.setHintArrowTargetType(HintArrowType.WORLD_POSITION.getValue());
      ItemContainer.clientInstance.setHintArrowX(var1.getX());
      ItemContainer.clientInstance.setHintArrowY(var1.getY());
      ItemContainer.clientInstance.setHintArrowOffsetX(64);
      ItemContainer.clientInstance.setHintArrowOffsetY(64);
   }

   public WorldPoint getHintArrowPoint() {
      if(this.getHintArrowType() == HintArrowType.WORLD_POSITION) {
         int var1 = ItemContainer.clientInstance.getHintArrowX();
         int var2 = ItemContainer.clientInstance.getHintArrowY();
         return new WorldPoint(var1, var2, ItemContainer.clientInstance.getPlane());
      } else {
         return null;
      }
   }

   public Player getHintArrowPlayer() {
      if(this.getHintArrowType() == HintArrowType.PLAYER) {
         int var1 = ItemContainer.clientInstance.getHintArrowPlayerTargetIdx();
         RSPlayer[] var2 = ItemContainer.clientInstance.getCachedPlayers();
         return var1 >= 0 && var1 < var2.length?var2[var1]:null;
      } else {
         return null;
      }
   }

   public NPC getHintArrowNpc() {
      if(this.getHintArrowType() == HintArrowType.NPC) {
         int var1 = ItemContainer.clientInstance.getHintArrowNpcTargetIdx();
         RSNPC[] var2 = ItemContainer.clientInstance.getCachedNPCs();
         return var1 >= 0 && var1 < var2.length?var2[var1]:null;
      } else {
         return null;
      }
   }

   public void setHealthBarOverride(HealthBarOverride var1) {
      healthBarOverride = var1;
   }

   public int getTickCount() {
      return tickCount;
   }

   public void setTickCount(int var1) {
      tickCount = var1;
   }

   public EnumSet getWorldType() {
      int var1 = this.getFlags();
      return WorldType.fromMask(var1);
   }

   public RSItem getLastItemDespawn() {
      return lastItemDespawn;
   }

   public void setLastItemDespawn(RSItem var1) {
      lastItemDespawn = var1;
   }

   public boolean isGpu() {
      return this.gpu;
   }

   public void setGpu(boolean var1) {
      this.gpu = var1;
   }

   public void queueChangedSkill(Skill var1) {
      int[] var2 = ItemContainer.clientInstance.getChangedSkills();
      int var3 = ItemContainer.clientInstance.getChangedSkillsCount();
      ++var3;
      var2[var3 - 1 & 31] = var1.ordinal();
      ItemContainer.clientInstance.setChangedSkillsCount(var3);
   }

   public void setSkyboxColor(int var1) {
      skyboxColor = var1;
   }

   public int getSkyboxColor() {
      return skyboxColor;
   }

   public EnumComposition getEnum(int var1) {
      if(!$assertionsDisabled && !this.isClientThread()) {
         throw new AssertionError("getEnum must be called on client thread");
      } else {
         RSEnum var2 = (RSEnum)this.enumCache.getIfPresent(Integer.valueOf(var1));
         if(var2 != null) {
            return var2;
         } else {
            var2 = this.getRsEnum(var1);
            this.enumCache.put(Integer.valueOf(var1), var2);
            return var2;
         }
      }
   }

   public void runScript(int var1, Object... var2) {
      if(!$assertionsDisabled && !this.isClientThread()) {
         throw new AssertionError();
      } else if(!$assertionsDisabled && currentScript != null) {
         throw new AssertionError();
      } else {
         Object[] var3 = new Object[var2.length + 1];
         var3[0] = Integer.valueOf(var1);
         System.arraycopy(var2, 0, var3, 1, var2.length);
         RSScriptEvent var4 = this.createScriptEvent();
         var4.setArguments(var3);
         this.runScript(var4, 5000000);
      }
   }

   public Map getSpriteOverrides() {
      return spriteOverrides;
   }

   public Map getWidgetSpriteOverrides() {
      return widgetSpriteOverrides;
   }

   public void setStretchedEnabled(boolean var1) {
      stretchedEnabled = var1;
   }

   public boolean isStretchedFast() {
      return stretchedFast;
   }

   public void setStretchedFast(boolean var1) {
      stretchedFast = var1;
   }

   public void setStretchedIntegerScaling(boolean var1) {
      stretchedIntegerScaling = var1;
   }

   public void setStretchedKeepAspectRatio(boolean var1) {
      stretchedKeepAspectRatio = var1;
   }

   public void setScalingFactor(int var1) {
      scalingFactor = 1.0D + (double)var1 / 100.0D;
   }

   public Dimension getStretchedDimensions() {
      if(cachedStretchedDimensions == null) {
         Container var1 = this.getCanvas().getParent();
         int var2 = var1.getWidth();
         int var3 = var1.getHeight();
         Dimension var4 = this.getRealDimensions();
         if(stretchedKeepAspectRatio) {
            double var5 = var4.getWidth() / var4.getHeight();
            int var7 = (int)((double)var3 * var5);
            if(var7 > var2) {
               var3 = (int)((double)var2 / var5);
            } else {
               var2 = var7;
            }
         }

         if(stretchedIntegerScaling) {
            if(var2 > var4.width) {
               var2 -= var2 % var4.width;
            }

            if(var3 > var4.height) {
               var3 -= var3 % var4.height;
            }
         }

         cachedStretchedDimensions = new Dimension(var2, var3);
      }

      return cachedStretchedDimensions;
   }

   public void invalidateStretching(boolean var1) {
      cachedRealDimensions = null;
      cachedStretchedDimensions = null;
      if(var1 && this.isResized()) {
         this.setResizeCanvasNextFrame(true);
      }

   }

   public void setSetting(Varbits var1, int var2) {
      int var3 = var1.getId();
      this.setVarbitValue(this.getVarps(), var3, var2);
   }

   public int getVar(VarClientInt var1) {
      Map var2 = this.getVarcMap();
      Object var3 = var2.get(Integer.valueOf(var1.getIndex()));
      return var3 instanceof Integer?((Integer)var3).intValue():0;
   }

   public String getVar(VarClientStr var1) {
      Map var2 = this.getVarcMap();
      Object var3 = var2.get(Integer.valueOf(var1.getIndex()));
      return var3 instanceof String?(String)var3:"";
   }

   public void setVar(VarClientStr var1, String var2) {
      Map var3 = this.getVarcMap();
      var3.put(Integer.valueOf(var1.getIndex()), var2);
   }

   public void setVar(VarClientInt var1, int var2) {
      Map var3 = this.getVarcMap();
      var3.put(Integer.valueOf(var1.getIndex()), Integer.valueOf(var2));
   }

   public void openWorldHopper() {
      this._protect$menuAction(-1, WidgetInfo.WORLD_SWITCHER_BUTTON.getId(), MenuAction.WIDGET_DEFAULT.getId(), 1, "World Switcher", "", 658, 384);
   }

   public void hopToWorld(net.runelite.api.World var1) {
      int var2 = var1.getId();
      this._protect$menuAction(var2, WidgetInfo.WORLD_SWITCHER_LIST.getId(), MenuAction.WIDGET_DEFAULT.getId(), 1, "Switch", "<col=ff9040>" + (var2 - 300) + "</col>", 683, 244);
   }

   public RSIndexedSprite createIndexedSprite() {
      return new IndexedSprite();
   }

   public RSItem createItem() {
      return new Item();
   }

   public RSWidget createWidget() {
      return new ComponentType();
   }

   public RSWorld createWorld() {
      return new World();
   }

   public RSWidget getDraggedWidget() {
      return draggedWidget;
   }

   public RSHashTable getWidgetFlags() {
      return serverActiveProperties;
   }

   public RSHashTable getComponentTable() {
      return subInterfaces;
   }

   public void setGameDrawingMode(int var1) {
      gameDrawingMode = var1;
   }

   public int getGameDrawingMode() {
      return gameDrawingMode;
   }

   public int[] getWidgetPositionsX() {
      return widgetPositionX;
   }

   public int[] getWidgetPositionsY() {
      return widgetPositionY;
   }

   public int getEnergy() {
      return energy;
   }

   public int getWeight() {
      return weight;
   }

   public boolean isDraggingWidget() {
      return draggingWidget;
   }

   public void setDraggedOnWidget(Widget var1) {
      draggedOnWidget = (ComponentType)var1;
   }

   public RSWidget getDraggedOnWidget() {
      return draggedOnWidget;
   }

   public RSSpritePixels[] getMapIcons() {
      return mapIcons;
   }

   public int[] getChangedSkills() {
      return changedSkills;
   }

   public void setChangedSkillsCount(int var1) {
      changedSkillsCount = var1;
   }

   public int getChangedSkillsCount() {
      return changedSkillsCount;
   }

   public int getScale() {
      return scale;
   }

   public int getViewportWidth() {
      return viewportWidth;
   }

   public int getViewportHeight() {
      return viewportHeight;
   }

   public int getViewportXOffset() {
      return Viewport_xOffset;
   }

   public int getViewportYOffset() {
      return Viewport_yOffset;
   }

   public RSGrandExchangeOffer[] getGrandExchangeOffers() {
      return grandExchangeOffers;
   }

   public int getWorld() {
      return world;
   }

   public int getGameCycle() {
      return gameCycle;
   }

   public void setHintArrowTargetType(int var1) {
      hintArrowTargetType = var1;
   }

   public int getHintArrowTargetType() {
      return hintArrowTargetType;
   }

   public void setHintArrowNpcTargetIdx(int var1) {
      hintArrowNpcTargetIdx = var1;
   }

   public int getHintArrowNpcTargetIdx() {
      return hintArrowNpcTargetIdx;
   }

   public void setHintArrowPlayerTargetIdx(int var1) {
      hintArrowPlayerTargetIdx = var1;
   }

   public int getHintArrowPlayerTargetIdx() {
      return hintArrowPlayerTargetIdx;
   }

   public void setHintArrowX(int var1) {
      hintArrowX = var1;
   }

   public int getHintArrowX() {
      return hintArrowX;
   }

   public void setHintArrowY(int var1) {
      hintArrowY = var1;
   }

   public int getHintArrowY() {
      return hintArrowY;
   }

   public void setHintArrowOffsetX(int var1) {
      hintArrowOffsetX = var1;
   }

   public void setHintArrowOffsetY(int var1) {
      hintArrowOffsetY = var1;
   }

   public int[][][] getInstanceTemplateChunks() {
      return instanceTemplateChunks;
   }

   public void setCameraPitchTarget(int var1) {
      cameraPitchTarget = var1;
   }

   public int getCameraPitchTarget() {
      return cameraPitchTarget;
   }

   public int getMapAngle() {
      return mapAngle;
   }

   public void setOculusOrbState(int var1) {
      camModeType = var1;
   }

   public int getOculusOrbState() {
      return camModeType;
   }

   public int getOculusOrbFocalPointX() {
      return field725;
   }

   public void setOculusOrbNormalSpeed(int var1) {
      field788 = var1;
   }

   public int[][] getOccupiedTilesTick() {
      return field746;
   }

   public void setItemPressedDuration(int var1) {
      itemPressedDuration = var1;
   }

   public int getItemPressedDuration() {
      return itemPressedDuration;
   }

   public int getLocalInteractingIndex() {
      return localPlayerIndex;
   }

   public int[] getPlayerMenuTypes() {
      return playerMenuTypes;
   }

   public String[] getPlayerOptions() {
      return playerOptions;
   }

   public boolean[] getPlayerOptionsPriorities() {
      return playerOptionsPriorities;
   }

   public RSDeque[][][] getGroundItemDeque() {
      return groundItemDeque;
   }

   @Override
   public RSDeque getProjectilesDeque() {
      return projectiles;
   }

   public boolean isMenuOpen() {
      return isMenuOpen;
   }

   public void setSpellSelected(boolean var1) {
      spellSelected = var1;
   }

   public void packetHandler() {
      this.vmethod4377();
   }

   public void revalidateWidget(Widget var1) {
      this.method3120((ComponentType)var1);
   }

   public int getVarbit(int var1) {
      return CombatInfo1.method57(var1);
   }

   public int getCameraY() {
      return FontName.cameraY;
   }

   public RSIndexedSprite[] getModIcons() {
      return FontTypeFace.modIcons;
   }

   public void setCameraPitch(int var1) {
      GZipDecompressor.cameraPitch = var1;
   }

   public int getCameraPitch() {
      return GZipDecompressor.cameraPitch;
   }

   public int getFPS() {
      return GameEngine.FPS;
   }

   public int getCanvasWidth() {
      return GrandExchangeOffer.canvasWidth;
   }

   public RSObjectComposition getObjectDefinition(int var1) {
      return GrandExchangeOffer.method1736(var1);
   }

   public int getCenterX() {
      return Graphics3D.centerX;
   }

   public int getCenterY() {
      return Graphics3D.centerY;
   }

   public int getRasterizer3D_clipNegativeMidX() {
      return Graphics3D.Rasterizer3D_clipNegativeMidX;
   }

   public int getRasterizer3D_clipMidX2() {
      return Graphics3D.Rasterizer3D_clipMidX2;
   }

   public int getRasterizer3D_clipNegativeMidY() {
      return Graphics3D.Rasterizer3D_clipNegativeMidY;
   }

   public int getRasterizer3D_clipMidY2() {
      return Graphics3D.Rasterizer3D_clipMidY2;
   }

   public void changeWorld(net.runelite.api.World var1) {
      GroundObject.setWorldInfo((World)var1);
   }

   public RSNodeCache getHealthBarCache() {
      return HeadbarType.field3386;
   }
   public long rl$delayNanoTime;
   private boolean rl$unlockedFps;

   @Override
   public boolean isUnlockedFps() {
      return rl$unlockedFps;
   }

   @Override
   public long getUnlockedFpsTarget() {
      return rl$delayNanoTime;
   }

   @Override
   public void setUnlockedFps(boolean unlocked) {
      rl$unlockedFps = unlocked;

      if (unlocked)
      {
         //posToCameraAngle(client.getMapAngle(), client.getCameraPitch());
      }
      else
      {
         rl$delayNanoTime = 0L;
      }
   }

   @Override
   public void setUnlockedFpsTarget(int fps) {

   }
   /**
    * Get the local player's follower, such as a pet
    *
    * @return
    */
   @Nullable
   @Override
   public NPC getFollower() {
      return null;
   }

   public RSNodeCache getItemCompositionCache() {
      return ObjType.items;
   }

   public RSIndexDataBase getIndexSprites() {
      return ModeGame.sprites;
   }

   public int getKeyboardIdleTicks() {
      return KeyFocusListener.keyboardIdleTicks;
   }

   public RSMapElementConfig[] getMapElementConfigs() {
      return MapElementType.mapElementTypes;
   }

   public void setAnimOffsetX(int var1) {
      Model.animOffsetX = var1;
   }

   public void setAnimOffsetY(int var1) {
      Model.animOffsetY = var1;
   }

   public void setAnimOffsetZ(int var1) {
      Model.animOffsetZ = var1;
   }

   public int getMouseIdleTicks() {
      return MouseInput.mouseIdleTicks;
   }

   public int getMouseCurrentButton() {
      return MouseInput.mouseCurrentButton;
   }

   public long getMouseLastPressedMillis() {
      return MouseInput.mouseLastPressedTimeMillis;
   }

   public RSNodeCache getCachedModels2() {
      return LocType.field3457;
   }

   public int[] getGraphicsPixels() {
      return Rasterizer2D.graphicsPixels;
   }

   public int getGraphicsPixelsWidth() {
      return Rasterizer2D.graphicsPixelsWidth;
   }

   public int getGraphicsPixelsHeight() {
      return Rasterizer2D.graphicsPixelsHeight;
   }

   public int getStartY() {
      return Rasterizer2D.drawingAreaTop;
   }

   public int getEndY() {
      return Rasterizer2D.drawingAreaRight;
   }

   public int getStartX() {
      return Rasterizer2D.draw_region_x;
   }

   public int getEndX() {
      return Rasterizer2D.drawingAreaBottom;
   }

   public int getRevision() {
      return JagException.revision;
   }

   public void setTileUpdateCount(int var1) {
      SceneManager.tileUpdateCount = var1;
   }

   public int getTileUpdateCount() {
      return SceneManager.tileUpdateCount;
   }

   public void setScenePlane(int var1) {
      SceneManager.Scene_plane = var1;
   }

   public void setCycle(int var1) {
      SceneManager.cycle = var1;
   }

   public int getCycle() {
      return SceneManager.cycle;
   }

   public void setMinTileX(int var1) {
      SceneManager.minTileX = var1;
   }

   public void setMaxTileX(int var1) {
      SceneManager.maxTileX = var1;
   }

   public void setMinTileZ(int var1) {
      SceneManager.minTileZ = var1;
   }

   public void setMaxTileZ(int var1) {
      SceneManager.maxTileZ = var1;
   }

   public void setScreenCenterX(int var1) {
      SceneManager.screenCenterX = var1;
   }

   public void setScreenCenterZ(int var1) {
      SceneManager.screenCenterZ = var1;
   }

   public void setCameraX2(int var1) {
      SceneManager.cameraX2 = var1;
   }

   public int getCameraX2() {
      return SceneManager.cameraX2;
   }

   public void setCameraY2(int var1) {
      SceneManager.cameraY2 = var1;
   }

   public int getCameraY2() {
      return SceneManager.cameraY2;
   }

   public void setCameraZ2(int var1) {
      SceneManager.cameraZ2 = var1;
   }

   public int getCameraZ2() {
      return SceneManager.cameraZ2;
   }

   public void setPitchSin(int var1) {
      SceneManager.pitchSin = var1;
   }

   public void setPitchCos(int var1) {
      SceneManager.pitchCos = var1;
   }

   public void setYawSin(int var1) {
      SceneManager.yawSin = var1;
   }

   public void setYawCos(int var1) {
      SceneManager.yawCos = var1;
   }

   public void setCheckClick(boolean var1) {
      SceneManager.checkClick = var1;
   }

   public boolean isCheckClick() {
      return SceneManager.checkClick;
   }

   public int getMouseX2() {
      return SceneManager.mouseX2;
   }

   public int getMouseY2() {
      return SceneManager.mouseY2;
   }

   public void setSelectedSceneTileX(int var1) {
      SceneManager.selectedRegionTileX = var1;
   }

   public void setSelectedSceneTileY(int var1) {
      SceneManager.selectedRegionTileY = var1;
   }

   public boolean[][][][] getVisibilityMaps() {
      return SceneManager.visibilityMaps;
   }

   public void setRenderArea(boolean[][] var1) {
      SceneManager.renderArea = var1;
   }

   public boolean containsBounds(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      return SceneManager.method3667(var1, var2, var3, var4, var5, var6, var7, var8);
   }

   public void revalidateWidgetScroll(Widget[] var1, Widget var2, boolean var3) {
      ScriptState.method1043((ComponentType[])var1, (ComponentType)var2, var3);
   }

   @Override
   public void menuAction(int var0, int var1, int var2, int var3, String var4, String var5, int var6, int var7) {
      this.menuAction(var0, var1, var2, var3, var4, var5, var6, var7);
   }

   public RSNodeCache getVarbitCache() {
      return Varbit.varbits;
   }

   public int[][] getXteaKeys() {
      return Varcs.xteaKeys;
   }

   public RSFrames getFrames(int var1) {
      return WallObject.method1971(var1);
   }

   public RSNodeCache getWidgetSpriteCache() {
      return ComponentType.field2683;
   }

   public RSIndexedSprite[] getMapScene() {
      return SubInterface.mapscene;
   }

   public RSSpritePixels[] getMapDots() {
      return class285.mapDots;
   }

   public int getBaseX() {
      return class53.baseX;
   }

   public boolean getViewportContainsMouse() {
      return class47.Viewport_containsMouse;
   }

   public int getViewportMouseX() {
      return class47.Viewport_mouseX;
   }

   public int getViewportMouseY() {
      return class47.Viewport_mouseY;
   }

   public void setEntitiesAtMouseCount(int var1) {
      class47.Viewport_entityCountAtMouse = var1;
   }

   public int getEntitiesAtMouseCount() {
      return class47.Viewport_entityCountAtMouse;
   }

   public long[] getEntitiesAtMouse() {
      return class47.field1740;
   }

   public RSIndexDataBase getIndexScripts() {
      return class27.clientscripts;
   }

   public int[] getMapRegions() {
      return class82.mapRegions;
   }

   public RSNPCComposition getNpcDefinition(int var1) {
      return ZoneProt.method374(var1);
   }

   public RSRenderOverview getRenderOverview() {
      return class69.worldMap;
   }

   public int getOculusOrbFocalPointY() {
      return class69.field135;
   }

   public void setStringStackSize(int var1) {
      class295.scriptStringStackSize = var1;
   }

   public int getStringStackSize() {
      return class295.scriptStringStackSize;
   }

   public RSWorld[] getWorldList() {
      return class242.worldList;
   }

   public void setCompass(net.runelite.api.SpritePixels var1) {
      class232.compass = (SpritePixels)var1;
   }

   public RSPreferences getPreferences() {
      return class312.options;
   }

   public int getBaseY() {
      return class312.baseY;
   }

   public int getCanvasHeight() {
      return class258.canvasHeight;
   }

   public int getCameraX() {
      return class258.cameraX;
   }

   public int getCameraZ() {
      return class2.cameraZ;
   }

   @Override
   public byte[][][] getTileUnderlays() {
      return new byte[0][][];
   }

   @Override
   public byte[][][] getTileOverlays() {
      return new byte[0][][];
   }

   public int[][][] getTileHeights() {
      return class91.tileHeights;
   }

   public int getCameraYaw() {
      return class142.cameraYaw;
   }

   public RSItemComposition getItemDefinition(int var1) {
      return class79.method1074(var1);
   }

   public RSTextureProvider getTextureProvider() {
      return class29.field608;
   }

   public int[] getIntStack() {
      return class281.intStack;
   }

   public void setIntStackSize(int var1) {
      class281.intStackSize = var1;
   }

   public int getIntStackSize() {
      return class281.intStackSize;
   }

   public String[] getStringStack() {
      return class281.scriptStringStack;
   }

   public void setUsername(String var1) {
      class203.username = var1;
   }

   public String getUsername() {
      return class203.username;
   }

   public void setPassword(String var1) {
      class203.password = var1;
   }

   public int getCurrentLoginField() {
      return class203.currentLoginField;
   }

   public Map getChatLineMap() {
      return ChatHistory.chatLineMap;
   }

   public RSIterableHashTable getMessages() {
      return ChatHistory.messages;
   }

   @ObfuscatedName("ic")
   final boolean method3117(int var1) {
      if(this.copy$shouldLeftClickOpenMenu(var1)) {
         return true;
      } else {
         MenuShouldLeftClick var2 = new MenuShouldLeftClick();
         ItemContainer.clientInstance.getCallbacks().post(var2);
         if(var2.isForceRightClick()) {
            return true;
         } else {
            int var3 = this.getMenuOptionCount();
            if(var3 > 0) {
               int var4 = this._protect$getMenuTypes()[var3 - 1];
               return var4 == MenuAction.RUNELITE_OVERLAY.getId();
            } else {
               return false;
            }
         }
      }
   }

   @ObfuscatedName("ff")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "1815121317"
   )
   void method3109(int var1) {
      GameCanvas.socket = null;
      class258.rssocket = null;
      js5State = 0;
      if(GameSocket.myWorldPort == class323.port1) {
         GameSocket.myWorldPort = class54.port2;
      } else {
         GameSocket.myWorldPort = class323.port1;
      }

      ++field737;
      if(field737 >= 2 && (var1 == 7 || var1 == 9)) {
         if(gameState <= 5) {
            this.method4413("js5connect_full");
            gameState = 1000;
            gameStateChanged(-1);
         } else {
            field679 = 3000;
         }
      } else if(field737 >= 2 && var1 == 6) {
         this.method4413("js5connect_outofdate");
         gameState = 1000;
         gameStateChanged(-1);
      } else if(field737 >= 4) {
         if(gameState <= 5) {
            this.method4413("js5connect");
            gameState = 1000;
            gameStateChanged(-1);
         } else {
            field679 = 3000;
         }
      }

   }

   @ObfuscatedName("iy")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1401357959"
   )
   final void method3116() {
      boolean var1 = false;

      int var2;
      int var5;
      while(!var1) {
         var1 = true;

         for(var2 = 0; var2 < menuOptionCount - 1; ++var2) {
            if(menuTypes[var2] < 1000 && menuTypes[var2 + 1] > 1000) {
               String var3 = menuTargets[var2];
               menuTargets[var2] = menuTargets[var2 + 1];
               menuTargets[var2 + 1] = var3;
               String var4 = menuOptions[var2];
               menuOptions[var2] = menuOptions[var2 + 1];
               menuOptions[var2 + 1] = var4;
               var5 = menuTypes[var2];
               menuTypes[var2] = menuTypes[var2 + 1];
               menuTypes[var2 + 1] = var5;
               var5 = menuActionParams0[var2];
               menuActionParams0[var2] = menuActionParams0[var2 + 1];
               menuActionParams0[var2 + 1] = var5;
               var5 = menuActionParams1[var2];
               menuActionParams1[var2] = menuActionParams1[var2 + 1];
               menuActionParams1[var2 + 1] = var5;
               var5 = menuIdentifiers[var2];
               menuIdentifiers[var2] = menuIdentifiers[var2 + 1];
               menuIdentifiers[var2 + 1] = var5;
               boolean var6 = menuBooleanArray[var2];
               menuBooleanArray[var2] = menuBooleanArray[var2 + 1];
               menuBooleanArray[var2 + 1] = var6;
               var1 = false;
            }
         }
      }

      if(GameCanvas.field420 == null) {
         if(draggedWidget == null) {
            int var16 = MouseInput.mouseLastButton;
            int var9;
            int var14;
            int var17;
            if(isMenuOpen) {
               int var13;
               if(var16 != 1 && (TextureProvider.middleMouseMovesCamera || var16 != 4)) {
                  var2 = MouseInput.mouseLastX;
                  var13 = MouseInput.mouseLastY;
                  if(var2 < class181.menuX - 10 || var2 > class302.field3309 + class181.menuX + 10 || var13 < TotalQuantityComparator.menuY - 10 || var13 > TotalQuantityComparator.menuY + class288.field1949 + 10) {
                     isMenuOpen = false;
                     MouseInput.method1914(class181.menuX, TotalQuantityComparator.menuY, class302.field3309, class288.field1949);
                  }
               }

               if(var16 == 1 || !TextureProvider.middleMouseMovesCamera && var16 == 4) {
                  var2 = class181.menuX;
                  var13 = TotalQuantityComparator.menuY;
                  var14 = class302.field3309;
                  var5 = MouseInput.mouseLastPressedX;
                  var17 = MouseInput.mouseLastPressedY;
                  int var7 = -1;

                  for(int var18 = 0; var18 < menuOptionCount; ++var18) {
                     var9 = var13 + (menuOptionCount - 1 - var18) * 15 + 31;
                     if(var5 > var2 && var5 < var14 + var2 && var17 > var9 - 13 && var17 < var9 + 3) {
                        var7 = var18;
                     }
                  }

                  if(var7 != -1) {
                     class91.method1224(var7);
                  }

                  isMenuOpen = false;
                  MouseInput.method1914(class181.menuX, TotalQuantityComparator.menuY, class302.field3309, class288.field1949);
               }
            } else {
               int var11;
               label296: {
                  var2 = menuOptionCount - 1;
                  if((var16 == 1 || !TextureProvider.middleMouseMovesCamera && var16 == 4) && var2 >= 0) {
                     var14 = menuTypes[var2];
                     if(var14 == 39 || var14 == 40 || var14 == 41 || var14 == 42 || var14 == 43 || var14 == 33 || var14 == 34 || var14 == 35 || var14 == 36 || var14 == 37 || var14 == 38 || var14 == 1005) {
                        var5 = menuActionParams0[var2];
                        var17 = menuActionParams1[var2];
                        ComponentType var15 = ChatHistory.method6246(var17);
                        var9 = WorldComparator.method86(var15);
                        boolean var8 = (var9 >> 28 & 1) != 0;
                        if(var8) {
                           break label296;
                        }

                        var11 = WorldComparator.method86(var15);
                        boolean var10 = (var11 >> 29 & 1) != 0;
                        if(var10) {
                           break label296;
                        }
                     }
                  }

                  if((var16 == 1 || !TextureProvider.middleMouseMovesCamera && var16 == 4) && this.method3117(2085346696)) {
                     var16 = 2;
                  }

                  if((var16 == 1 || !TextureProvider.middleMouseMovesCamera && var16 == 4) && menuOptionCount > 0) {
                     class91.method1224(var2);
                  }

                  if(var16 == 2 && menuOptionCount > 0) {
                     this.method3487(MouseInput.mouseLastPressedX, MouseInput.mouseLastPressedY);
                  }

                  return;
               }

               if(GameCanvas.field420 != null && !field811 && menuOptionCount > 0 && !this.method3117(2086035491)) {
                  int var19 = field685;
                  var11 = field809;
                  ContextMenuRow var12 = class312.topContextMenuRow;
                  class24.method464(var12.param0, var12.param1, var12.type, var12.identifier, var12.option, var12.option, var19, var11, -1096821382);
                  class312.topContextMenuRow = null;
               }

               field811 = false;
               itemPressedDuration = 0;
               itemPressedDurationChanged(-1);
               if(GameCanvas.field420 != null) {
                  WorldMapRegion.method5554(GameCanvas.field420);
               }

               GameCanvas.field420 = ChatHistory.method6246(var17);
               field783 = var5;
               field685 = MouseInput.mouseLastPressedX;
               field809 = MouseInput.mouseLastPressedY;
               if(var2 >= 0) {
                  class288.method5941(var2);
               }

               WorldMapRegion.method5554(GameCanvas.field420);
               return;
            }

         }
      }
   }

   @ObfuscatedName("gh")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "115"
   )
   final void method3114() {
      if(toplevel != -1) {
         WorldMapDecoration.method2085(toplevel);
      }

      int var1;
      for(var1 = 0; var1 < interfaceCount; ++var1) {
         if(field795[var1]) {
            field923[var1] = true;
         }

         field856[var1] = field795[var1];
         field795[var1] = false;
      }

      field658 = gameCycle;
      field798 = -1;
      field799 = -1;
      SoundTask.field1417 = null;
      if(toplevel != -1) {
         interfaceCount = 0;
         Item.method4636(toplevel, 0, 0, GrandExchangeOffer.canvasWidth, class258.canvasHeight, 0, 0, -1);
      }

      Hooks.drawAfterWidgets();
      Rasterizer2D.method683();
      if(field754) {
         if(cursorState == 1) {
            GrandExchangeOffer.crossSprites[field752 / 100].method1311(lastLeftClickX - 8, lastLeftClickY - 8);
         }

         if(cursorState == 2) {
            GrandExchangeOffer.crossSprites[field752 / 100 + 4].method1311(lastLeftClickX - 8, lastLeftClickY - 8);
         }
      }

      if(!isMenuOpen) {
         if(field798 != -1) {
            ZoneProt.method375(field798, field799);
         }
      } else if(!Hooks.drawMenu()) {
         Size.method4085();
      }

      if(gameDrawingMode == 3) {
         for(var1 = 0; var1 < interfaceCount; ++var1) {
            if(field856[var1]) {
               Rasterizer2D.method691(widgetPositionX[var1], widgetPositionY[var1], widgetBoundsWidth[var1], widgetBoundsHeight[var1], 16711935, 128);
            } else if(field923[var1]) {
               Rasterizer2D.method691(widgetPositionX[var1], widgetPositionY[var1], widgetBoundsWidth[var1], widgetBoundsHeight[var1], 16711680, 128);
            }
         }
      }

      var1 = ServerProt.level;
      int var2 = class71.localPlayer.x * -1234429701;
      int var3 = class71.localPlayer.y;
      int var4 = field710;

      for(class61 var5 = (class61)class61.field1061.method3930(); var5 != null; var5 = (class61)class61.field1061.method3924()) {
         if(var5.field1053 != -1 || var5.field1054 != null) {
            int var6 = 0;
            if(var2 > var5.field1062) {
               var6 += var2 - var5.field1062;
            } else if(var2 < var5.field1052) {
               var6 += var5.field1052 - var2;
            }

            if(var3 > var5.field1055) {
               var6 += var3 - var5.field1055;
            } else if(var3 < var5.field1057) {
               var6 += var5.field1057 - var3;
            }

            if(var6 - 64 <= var5.field1056 && field886 != 0 && var1 == var5.field1051) {
               var6 -= 64;
               if(var6 < 0) {
                  var6 = 0;
               }

               int var7 = (var5.field1056 - var6) * field886 / var5.field1056;
               Object var10000;
               if(var5.field1058 == null) {
                  if(var5.field1053 >= 0) {
                     var10000 = null;
                     SoundEffect var8 = SoundEffect.method4985(class142.synths, var5.field1053, 0);
                     if(var8 != null) {
                        RawAudioNode var9 = var8.method4998().method6320(WorldComparator.field36);
                        class166 var10 = class166.method2484(var9, 100, var7);
                        var10.method2487(-1);
                        TotalQuantityComparator.field60.method3531(var10);
                        var5.field1058 = var10;
                     }
                  }
               } else {
                  var5.field1058.method2493(var7);
               }

               if(var5.field1050 == null) {
                  if(var5.field1054 != null && (var5.field1066 -= var4) <= 0) {
                     int var12 = (int)(Math.random() * (double)var5.field1054.length);
                     var10000 = null;
                     SoundEffect var13 = SoundEffect.method4985(class142.synths, var5.field1054[var12], 0);
                     if(var13 != null) {
                        RawAudioNode var14 = var13.method4998().method6320(WorldComparator.field36);
                        class166 var11 = class166.method2484(var14, 100, var7);
                        var11.method2487(0);
                        TotalQuantityComparator.field60.method3531(var11);
                        var5.field1050 = var11;
                        var5.field1066 = var5.field1059 + (int)(Math.random() * (double)(var5.field1063 - var5.field1059));
                     }
                  }
               } else {
                  var5.field1050.method2493(var7);
                  if(!var5.field1050.method433()) {
                     var5.field1050 = null;
                  }
               }
            } else {
               if(var5.field1058 != null) {
                  TotalQuantityComparator.field60.method3527(var5.field1058);
                  var5.field1058 = null;
               }

               if(var5.field1050 != null) {
                  TotalQuantityComparator.field60.method3527(var5.field1050);
                  var5.field1050 = null;
               }
            }
         }
      }

      field710 = 0;
   }

   @ObfuscatedName("hg")
   @ObfuscatedSignature(
      signature = "(Lck;I)Z",
      garbageValue = "141927851"
   )
   final boolean method3115(ServerConnection var1) {
      class323 var2 = var1.method38();
      Bit var3 = var1.clientPacket;
      if(var2 == null) {
         return false;
      } else {
         String var17;
         int var18;
         try {
            int var5;
            if(var1.currentPacket == null) {
               if(var1.field1303) {
                  if(!var2.vmethod6354(1)) {
                     return false;
                  }

                  var2.vmethod6362(var1.clientPacket.payload, 0, 1);
                  var1.field1305 = 0;
                  var1.field1303 = false;
               }

               var3.offset = 0;
               if(var3.method2648()) {
                  if(!var2.vmethod6354(1)) {
                     return false;
                  }

                  var2.vmethod6362(var1.clientPacket.payload, 1, 1);
                  var1.field1305 = 0;
               }

               var1.field1303 = true;
               ServerProt[] var4 = GameCanvas.method4867();
               var5 = var3.method2667();
               if(var5 < 0 || var5 >= var4.length) {
                  throw new IOException(var5 + " " + var3.offset);
               }

               var1.currentPacket = var4[var5];
               var1.currentPacketSize = var1.currentPacket.size;
            }

            if(var1.currentPacketSize == -1) {
               if(!var2.vmethod6354(1)) {
                  return false;
               }

               var1.method38().vmethod6362(var3.payload, 0, 1);
               var1.currentPacketSize = var3.payload[0] & 255;
            }

            if(var1.currentPacketSize == -2) {
               if(!var2.vmethod6354(2)) {
                  return false;
               }

               var1.method38().vmethod6362(var3.payload, 0, 2);
               var3.offset = 0;
               var1.currentPacketSize = var3.readUnsignedShort();
            }

            if(!var2.vmethod6354(var1.currentPacketSize)) {
               return false;
            }

            var3.offset = 0;
            var2.vmethod6362(var3.payload, 0, var1.currentPacketSize);
            var1.field1305 = 0;
            field773.method1587();
            var1.field1316 = var1.field1315;
            var1.field1315 = var1.field1314;
            var1.field1314 = var1.currentPacket;
            ComponentType var6;
            int var16;
            if(ServerProt.field2150 == var1.currentPacket) {
               var16 = var3.readInt();
               var17 = var3.readString();
               var6 = ChatHistory.method6246(var16);
               if(!var17.equals(var6.text)) {
                  var6.text = var17;
                  WorldMapRegion.method5554(var6);
               }

               var1.currentPacket = null;
               return true;
            }

            int var7;
            int var8;
            int var9;
            if(ServerProt.field2155 == var1.currentPacket) {
               var16 = var3.method5133();
               var5 = var3.readUnsignedShort128();
               var18 = var5 >> 10 & 31;
               var7 = var5 >> 5 & 31;
               var8 = var5 & 31;
               var9 = (var7 << 11) + (var18 << 19) + (var8 << 3);
               ComponentType var47 = ChatHistory.method6246(var16);
               if(var9 != var47.color) {
                  var47.color = var9;
                  WorldMapRegion.method5554(var47);
               }

               var1.currentPacket = null;
               return true;
            }

            if(ServerProt.field2211 == var1.currentPacket) {
               tradeMode = var3.readUnsignedByteC();
               publicChatMode = var3.readUnsignedByteC();
               var1.currentPacket = null;
               return true;
            }

            ComponentType var53;
            if(ServerProt.field2210 == var1.currentPacket) {
               var16 = var3.method5134();
               var53 = ChatHistory.method6246(var16);
               var53.modelType = 3;
               var53.modelId = class71.localPlayer.composition.method820();
               WorldMapRegion.method5554(var53);
               var1.currentPacket = null;
               return true;
            }

            if(ServerProt.field2212 == var1.currentPacket) {
               class302.method6070(true, var3);
               var1.currentPacket = null;
               return true;
            }

            if(ServerProt.field2182 == var1.currentPacket) {
               class53.method860(true, var1.clientPacket);
               var1.currentPacket = null;
               return true;
            }

            int var19;
            if(ServerProt.field2201 == var1.currentPacket) {
               var16 = var3.readInt();
               var5 = var3.readUnsignedShort();
               if(var16 < -70000) {
                  var5 += 32768;
               }

               if(var16 >= 0) {
                  var6 = ChatHistory.method6246(var16);
               } else {
                  var6 = null;
               }

               if(var6 != null) {
                  for(var7 = 0; var7 < var6.objIds.length; ++var7) {
                     var6.objIds[var7] = 0;
                     var6.objCounts[var7] = 0;
                  }
               }

               SoundTaskDataProvider.method6144(var5);
               var7 = var3.readUnsignedShort();

               for(var8 = 0; var8 < var7; ++var8) {
                  var9 = var3.readUnsignedShort();
                  var19 = var3.readUnsignedByte();
                  if(var19 == 255) {
                     var19 = var3.method5134();
                  }

                  if(var6 != null && var8 < var6.objIds.length) {
                     var6.objIds[var8] = var9;
                     var6.objCounts[var8] = var19;
                  }

                  class31.method523(var5, var8, var9 - 1, var19);
               }

               if(var6 != null) {
                  WorldMapRegion.method5554(var6);
               }

               FontName.method507();
               field837[++field681 - 1 & 31] = var5 & 32767;
               var1.currentPacket = null;
               return true;
            }

            long var12;
            long var20;
            long var22;
            long var24;
            String var37;
            if(ServerProt.field2187 == var1.currentPacket) {
               var37 = var3.readString();
               var20 = var3.method5299();
               var22 = (long)var3.readUnsignedShort();
               var24 = (long)var3.method5090();
               int compressed = var3.readUnsignedShort();
               int primary = (compressed) & 0x1F;
               int secondary = (compressed >> 5) & 0x1F;
               int tertiary = (compressed >> 10) & 0x1F;
               ChatCrownType staffRank = (ChatCrownType)PlayerList.method4757(class248.method4669(), primary);
               var12 = (var22 << 32) + var24;
               boolean var48 = false;

               for(int var15 = 0; var15 < 100; ++var15) {
                  if(var12 == field755[var15]) {
                     var48 = true;
                     break;
                  }
               }

               if(staffRank.ignorable && class258.friendManager.method2348(new Name(var37, KeyFocusListener.loginType))) {
                  var48 = true;
               }

               if(!var48 && field763 == 0) {
                  field755[field758] = var12;
                  field758 = (field758 + 1) % 100;
                  String var26 = FontTypeFace.method6234(MapElementType.method1507(ModeWhere.method1463(var3)));
                  class312.method6287(9, (staffRank.icon == -1 ? "" : class181.getModIcon(staffRank.icon)) + class181.getModIcon(secondary) + class181.getModIcon(tertiary) + var37, var26, MapIconReference.method2082(var20));
               }

               var1.currentPacket = null;
               return true;
            }

            if(ServerProt.field2169 == var1.currentPacket) {
               var37 = var3.readString();
               var17 = FontTypeFace.method6234(MapElementType.method1507(ModeWhere.method1463(var3)));
               KeyFocusListener.method5934(6, var37, var17);
               var1.currentPacket = null;
               return true;
            }

            if(ServerProt.field2204 == var1.currentPacket) {
               for(var16 = 0; var16 < class313.clientVarps.length; ++var16) {
                  if(class313.serverVarps[var16] != class313.clientVarps[var16]) {
                     class313.clientVarps[var16] = class313.serverVarps[var16];
                     settingsChanged(var16);
                     TradingPost.method1614(var16);
                     field835[++field836 - 1 & 31] = var16;
                  }
               }

               var1.currentPacket = null;
               return true;
            }

            if(ServerProt.field2183 == var1.currentPacket) {
               if(toplevel != -1) {
                  class61.method923(toplevel, 0);
               }

               var1.currentPacket = null;
               return true;
            }

            if(ServerProt.field2137 == var1.currentPacket) {
               class12.method179(ZoneProt.field2341);
               var1.currentPacket = null;
               return true;
            }

            if(ServerProt.field2156 == var1.currentPacket) {
               class12.method179(ZoneProt.field2340);
               var1.currentPacket = null;
               return true;
            }

            if(ServerProt.field2140 == var1.currentPacket) {
               class318.field115 = var3.readUnsignedByteC();
               VarPlayerType.field3319 = var3.readUnsignedByte();

               for(var16 = VarPlayerType.field3319; var16 < VarPlayerType.field3319 + 8; ++var16) {
                  for(var5 = class318.field115; var5 < class318.field115 + 8; ++var5) {
                     if(groundItemDeque[ServerProt.level][var16][var5] != null) {
                        groundItemDeque[ServerProt.level][var16][var5] = null;
                        class232.method4511(var16, var5);
                     }
                  }
               }

               for(PendingSpawn var40 = (PendingSpawn)pendingSpawns.method3930(); var40 != null; var40 = (PendingSpawn)pendingSpawns.method3924()) {
                  if(var40.x >= VarPlayerType.field3319 && var40.x < VarPlayerType.field3319 + 8 && var40.y >= class318.field115 && var40.y < class318.field115 + 8 && var40.level == ServerProt.level) {
                     var40.hitpoints = 0;
                  }
               }

               var1.currentPacket = null;
               return true;
            }

            if(ServerProt.field2143 == var1.currentPacket) {
               class12.method179(ZoneProt.field2344);
               var1.currentPacket = null;
               return true;
            }

            if(ServerProt.field2209 == var1.currentPacket) {
               for(var16 = 0; var16 < SoundTask.field1418; ++var16) {
                  VarPlayerType var54 = class288.method5942(var16);
                  if(var54 != null) {
                     class313.serverVarps[var16] = 0;
                     class313.clientVarps[var16] = 0;
                     settingsChanged(var16);
                  }
               }

               FontName.method507();
               field836 += 32;
               var1.currentPacket = null;
               return true;
            }

            if(ServerProt.field2174 == var1.currentPacket) {
               class12.method179(ZoneProt.field2332);
               var1.currentPacket = null;
               return true;
            }

            if(ServerProt.field2189 == var1.currentPacket) {
               class258.friendManager.method2344(var3, var1.currentPacketSize);
               lastFriendTransmit = cycleCntr;
               var1.currentPacket = null;
               return true;
            }

            if(ServerProt.field2138 == var1.currentPacket) {
               var16 = var3.method5134();
               var5 = var3.method5281();
               var6 = ChatHistory.method6246(var16);
               if(var6 != null && var6.type == 0) {
                  if(var5 > var6.scrollHeight - var6.height) {
                     var5 = var6.scrollHeight - var6.height;
                  }

                  if(var5 < 0) {
                     var5 = 0;
                  }

                  if(var5 != var6.scrollY) {
                     var6.scrollY = var5;
                     WorldMapRegion.method5554(var6);
                  }
               }

               var1.currentPacket = null;
               return true;
            }

            if(ServerProt.field2172 == var1.currentPacket) {
               var16 = var3.method5133();
               var53 = ChatHistory.method6246(var16);

               for(var18 = 0; var18 < var53.objIds.length; ++var18) {
                  var53.objIds[var18] = -1;
                  var53.objIds[var18] = 0;
               }

               WorldMapRegion.method5554(var53);
               var1.currentPacket = null;
               return true;
            }

            if(ServerProt.field2132 == var1.currentPacket) {
               class285.method5866();
               var1.currentPacket = null;
               return false;
            }

            if(ServerProt.field2175 == var1.currentPacket) {
               var16 = var3.readInt();
               var5 = var3.readUnsignedShort();
               if(var16 < -70000) {
                  var5 += 32768;
               }

               if(var16 >= 0) {
                  var6 = ChatHistory.method6246(var16);
               } else {
                  var6 = null;
               }

               for(; var3.offset < var1.currentPacketSize; class31.method523(var5, var7, var8 - 1, var9)) {
                  var7 = var3.method5269();
                  var8 = var3.readUnsignedShort();
                  var9 = 0;
                  if(var8 != 0) {
                     var9 = var3.readUnsignedByte();
                     if(var9 == 255) {
                        var9 = var3.readInt();
                     }
                  }

                  if(var6 != null && var7 >= 0 && var7 < var6.objIds.length) {
                     var6.objIds[var7] = var8;
                     var6.objCounts[var7] = var9;
                  }
               }

               if(var6 != null) {
                  WorldMapRegion.method5554(var6);
               }

               FontName.method507();
               field837[++field681 - 1 & 31] = var5 & 32767;
               var1.currentPacket = null;
               return true;
            }

            if(ServerProt.field2165 == var1.currentPacket) {
               var16 = var3.readUnsignedByte();
               class95.method1262(var16);
               var1.currentPacket = null;
               return true;
            }

            if(ServerProt.field2157 == var1.currentPacket) {
               class302.method6070(false, var3);
               var1.currentPacket = null;
               return true;
            }

            String var41;
            if(ServerProt.field2149 == var1.currentPacket) {
               byte[] var39 = new byte[var1.currentPacketSize];
               var3.method2650(var39, 0, var39.length);
               Packet var52 = new Packet(var39);
               var41 = var52.readString();
               class129.method1898(var41, true, false);
               var1.currentPacket = null;
               return true;
            }

            if(ServerProt.field2217 == var1.currentPacket) {
               Size.method4095(var3, var1.currentPacketSize);
               DState.method6065();
               /*LocType obj = GrandExchangeOffer.method1736(35007);
               obj.offsetX = -43;
               obj.offsetY = -78;
               obj.actions = new String[] { "View", null, null, null, null };*/
               var1.currentPacket = null;
               return true;
            }

            if(ServerProt.field2206 == var1.currentPacket) {
               field893 = true;
               WorldMapDecoration.field222 = var3.readUnsignedByte();
               FontName.field3757 = var3.readUnsignedByte();
               class312.field25 = var3.readUnsignedShort();
               class187.field3842 = var3.readUnsignedByte();
               GameSocket.field2100 = var3.readUnsignedByte();
               if(GameSocket.field2100 >= 100) {
                  class258.cameraX = WorldMapDecoration.field222 * 128 + 64;
                  FontName.cameraY = FontName.field3757 * 128 + 64;
                  class2.cameraZ = TcpConnectionMessage.method5618(class258.cameraX, FontName.cameraY, ServerProt.level) - class312.field25;
               }

               var1.currentPacket = null;
               return true;
            }

            if(ServerProt.field2168 == var1.currentPacket) {
               ProjectileAnimation.method4013(var3.readString());
               var1.currentPacket = null;
               return true;
            }

            if(ServerProt.field2148 == var1.currentPacket) {
               class318.field115 = var3.method5117();
               VarPlayerType.field3319 = var3.readUnsignedByteC();

               while(var3.offset < var1.currentPacketSize) {
                  var16 = var3.readUnsignedByte();
                  ZoneProt var51 = class36.method556()[var16];
                  class12.method179(var51);
               }

               var1.currentPacket = null;
               return true;
            }

            if(ServerProt.field2176 == var1.currentPacket) {
               if(MapIconReference.clanMemberManager != null) {
                  MapIconReference.clanMemberManager.method2422(var3);
               }

               CollisionData.method3613();
               var1.currentPacket = null;
               return true;
            }

            if(ServerProt.field2193 == var1.currentPacket) {
               var37 = var3.readString();
               Object[] var50 = new Object[var37.length() + 1];

               for(var18 = var37.length() - 1; var18 >= 0; --var18) {
                  if(var37.charAt(var18) == 's') {
                     var50[var18 + 1] = var3.readString();
                  } else {
                     var50[var18 + 1] = new Integer(var3.readInt());
                  }
               }

               var50[0] = new Integer(var3.readInt());
               ScriptEvent var44 = new ScriptEvent();
               var44.params = var50;
               class192.method3810(var44);
               var1.currentPacket = null;
               return true;
            }

            boolean var56;
            if(ServerProt.field2158 == var1.currentPacket) {
               var56 = var3.readUnsignedByte() == 1;
               if(var56) {
                  Overlay.field3614 = class318.method6317() - var3.method5299();
                  GameCanvas.tradingPost = new TradingPost(var3, true);
               } else {
                  GameCanvas.tradingPost = null;
               }

               field675 = cycleCntr;
               var1.currentPacket = null;
               return true;
            }

            if(ServerProt.field2215 == var1.currentPacket) {
               var16 = var3.method5281();
               toplevel = var16;
               this.method3119(false);
               UnitPriceComparator.method2288(var16);
               CombatInfo1.method61(toplevel, -1097363930);

               for(var5 = 0; var5 < 100; ++var5) {
                  field795[var5] = true;
               }

               var1.currentPacket = null;
               return true;
            }

            SubInterface var58;
            if(ServerProt.field2208 == var1.currentPacket) {
               var16 = var3.method5115();
               var5 = var3.method5133();
               var18 = var3.method5281();
               var58 = (SubInterface)subInterfaces.method6335((long)var5);
               if(var58 != null) {
                  Overlay.method6405(var58, var18 != var58.id);
               }

               SubInterface.method2711(var5, var18, var16);
               var1.currentPacket = null;
               return true;
            }

            if(ServerProt.field2144 == var1.currentPacket) {
               class53.method860(false, var1.clientPacket);
               var1.currentPacket = null;
               return true;
            }

            if(ServerProt.field2167 == var1.currentPacket) {
               hintArrowTargetType = var3.readUnsignedByte();
               if(hintArrowTargetType == 1) {
                  hintArrowNpcTargetIdx = var3.readUnsignedShort();
               }

               if(hintArrowTargetType >= 2 && hintArrowTargetType <= 6) {
                  if(hintArrowTargetType == 2) {
                     hintArrowOffsetX = 64;
                     hintArrowOffsetY = 64;
                  }

                  if(hintArrowTargetType == 3) {
                     hintArrowOffsetX = 0;
                     hintArrowOffsetY = 64;
                  }

                  if(hintArrowTargetType == 4) {
                     hintArrowOffsetX = 128;
                     hintArrowOffsetY = 64;
                  }

                  if(hintArrowTargetType == 5) {
                     hintArrowOffsetX = 64;
                     hintArrowOffsetY = 0;
                  }

                  if(hintArrowTargetType == 6) {
                     hintArrowOffsetX = 64;
                     hintArrowOffsetY = 128;
                  }

                  hintArrowTargetType = 2;
                  hintArrowX = var3.readUnsignedShort();
                  hintArrowY = var3.readUnsignedShort();
                  field877 = var3.readUnsignedByte();
               }

               if(hintArrowTargetType == 10) {
                  hintArrowPlayerTargetIdx = var3.readUnsignedShort();
               }

               var1.currentPacket = null;
               return true;
            }

            ComponentType var57;
            if(ServerProt.field2199 == var1.currentPacket) {
               var16 = var3.readUnsignedShort128();
               var5 = var3.method5309();
               var18 = var3.method5133();
               var57 = ChatHistory.method6246(var18);
               var57.field2745 = var16 + (var5 << 16);
               var1.currentPacket = null;
               return true;
            }

            ComponentType var28;
            if(ServerProt.field2213 == var1.currentPacket) {
               var16 = var3.readInt();
               var5 = var3.readInt();
               SubInterface var43 = (SubInterface)subInterfaces.method6335((long)var5);
               var58 = (SubInterface)subInterfaces.method6335((long)var16);
               if(var58 != null) {
                  Overlay.method6405(var58, var43 == null || var43.id != var58.id);
               }

               if(var43 != null) {
                  var43.method432();
                  subInterfaces.method6344(var43, (long)var16);
               }

               var28 = ChatHistory.method6246(var5);
               if(var28 != null) {
                  WorldMapRegion.method5554(var28);
               }

               var28 = ChatHistory.method6246(var16);
               if(var28 != null) {
                  WorldMapRegion.method5554(var28);
                  ScriptState.method1043(ComponentType.interfaces[var28.id >>> 16], var28, true);
               }

               if(toplevel != -1) {
                  class61.method923(toplevel, 1);
               }

               var1.currentPacket = null;
               return true;
            }

            if(ServerProt.field2166 == var1.currentPacket) {
               class12.method179(ZoneProt.field2334);
               var1.currentPacket = null;
               return true;
            }

            if(ServerProt.field2181 == var1.currentPacket) {
               var16 = var3.offset + var1.currentPacketSize;
               var5 = var3.readUnsignedShort();
               var18 = var3.readUnsignedShort();
               if(var5 != toplevel) {
                  toplevel = var5;
                  this.method3119(false);
                  UnitPriceComparator.method2288(toplevel);
                  CombatInfo1.method61(toplevel, -1463389166);

                  for(var7 = 0; var7 < 100; ++var7) {
                     field795[var7] = true;
                  }
               }

               SubInterface var10;
               for(; var18-- > 0; var10.field566 = true) {
                  var7 = var3.readInt();
                  var8 = var3.readUnsignedShort();
                  var9 = var3.readUnsignedByte();
                  var10 = (SubInterface)subInterfaces.method6335((long)var7);
                  if(var10 != null && var8 != var10.id) {
                     Overlay.method6405(var10, true);
                     var10 = null;
                  }

                  if(var10 == null) {
                     var10 = SubInterface.method2711(var7, var8, var9);
                  }
               }

               for(var58 = (SubInterface)subInterfaces.method6338(); var58 != null; var58 = (SubInterface)subInterfaces.method6339()) {
                  if(var58.field566) {
                     var58.field566 = false;
                  } else {
                     Overlay.method6405(var58, true);
                  }
               }

               serverActiveProperties = new HashTable(512);

               while(var3.offset < var16) {
                  var7 = var3.readInt();
                  var8 = var3.readUnsignedShort();
                  var9 = var3.readUnsignedShort();
                  var19 = var3.readInt();

                  for(int var29 = var8; var29 <= var9; ++var29) {
                     var12 = (long)var29 + ((long)var7 << 32);
                     serverActiveProperties.method6344(new IntegerNode(var19), var12);
                  }
               }

               var1.currentPacket = null;
               return true;
            }

            if(ServerProt.field2178 == var1.currentPacket) {
               World var38 = new World();
               var38.address = var3.readString();
               var38.id = var3.readUnsignedShort();
               var5 = var3.readInt();
               var38.mask = var5;
               class124.method1843(45);
               var2.vmethod6355();
               var2 = null;
               GroundObject.setWorldInfo(var38);
               var1.currentPacket = null;
               return false;
            }

            if(ServerProt.field2196 == var1.currentPacket) {
               var16 = var3.readUnsignedShort();
               var5 = var3.readUnsignedByte();
               var18 = var3.readUnsignedShort();
               ParamType.method609(var16, var5, var18);
               var1.currentPacket = null;
               return true;
            }

            if(ServerProt.field2197 == var1.currentPacket) {
               var16 = var3.method5115();
               var5 = var3.method5115();
               var41 = var3.readString();
               if(var5 >= 1 && var5 <= 8) {
                  if(var41.equalsIgnoreCase("null")) {
                     var41 = null;
                  }

                  playerOptions[var5 - 1] = var41;
                  playerOptionsChanged(var5 - 1);
                  playerOptionsPriorities[var5 - 1] = var16 == 0;
               }

               var1.currentPacket = null;
               return true;
            }

            if(ServerProt.field2163 == var1.currentPacket) {
               class258.friendManager.ignoreContainer.method5040(var3, var1.currentPacketSize);
               class333.method6434();
               lastFriendTransmit = cycleCntr;
               var1.currentPacket = null;
               return true;
            }

            if(ServerProt.field2159 == var1.currentPacket) {
               for(var16 = 0; var16 < players.length; ++var16) {
                  if(players[var16] != null) {
                     players[var16].animation = -1;
                     players[var16].animationChanged(-1);
                  }
               }

               for(var16 = 0; var16 < npcs.length; ++var16) {
                  if(npcs[var16] != null) {
                     npcs[var16].animation = -1;
                     npcs[var16].animationChanged(-1);
                  }
               }

               var1.currentPacket = null;
               return true;
            }

            if(ServerProt.field2135 == var1.currentPacket) {
               var16 = var3.readUnsignedShort();
               var5 = var3.readInt();
               class313.serverVarps[var16] = var5;
               if(class313.clientVarps[var16] != var5) {
                  class313.clientVarps[var16] = var5;
                  settingsChanged(var16);
               }

               TradingPost.method1614(var16);
               field835[++field836 - 1 & 31] = var16;
               var1.currentPacket = null;
               return true;
            }

            boolean var45;
            if(ServerProt.field2161 == var1.currentPacket) {
               var16 = var3.readInt();
               var45 = var3.readUnsignedByte() == 1;
               var6 = ChatHistory.method6246(var16);
               if(var45 != var6.isHidden) {
                  var6.isHidden = var45;
                  var6.onHiddenChanged(-1);
                  WorldMapRegion.method5554(var6);
               }

               var1.currentPacket = null;
               return true;
            }

            if(ServerProt.field2188 == var1.currentPacket) {
               var3.offset += 28;
               if(var3.method5111()) {
                  FriendContainer.method6439(var3, var3.offset - 28);
               }

               var1.currentPacket = null;
               return true;
            }

            if(ServerProt.field2162 == var1.currentPacket) {
               var16 = var3.method5134();
               var5 = var3.method5281();
               var6 = ChatHistory.method6246(var16);
               if(var6.modelType != 1 || var5 != var6.modelId) {
                  var6.modelType = 1;
                  var6.modelId = var5;
                  WorldMapRegion.method5554(var6);
               }

               var1.currentPacket = null;
               return true;
            }

            if(ServerProt.field2205 == var1.currentPacket) {
               minimapRenderType = var3.readUnsignedByte();
               var1.currentPacket = null;
               return true;
            }

            if(ServerProt.field2214 == var1.currentPacket) {
               field893 = true;
               Varcs.field1258 = var3.readUnsignedByte();
               class232.field339 = var3.readUnsignedByte();
               class248.field167 = var3.readUnsignedShort();
               Size.field119 = var3.readUnsignedByte();
               class235.field2436 = var3.readUnsignedByte();
               if(class235.field2436 >= 100) {
                  var16 = Varcs.field1258 * 128 + 64;
                  var5 = class232.field339 * 128 + 64;
                  var18 = TcpConnectionMessage.method5618(var16, var5, ServerProt.level) - class248.field167;
                  var7 = var16 - class258.cameraX;
                  var8 = var18 - class2.cameraZ;
                  var9 = var5 - FontName.cameraY;
                  var19 = (int)Math.sqrt((double)(var9 * var9 + var7 * var7));
                  GZipDecompressor.cameraPitch = (int)(Math.atan2((double)var8, (double)var19) * 325.949D) & 2047;
                  onCameraPitchChanged(-1);
                  class142.cameraYaw = (int)(Math.atan2((double)var7, (double)var9) * -325.949D) & 2047;
                  if(GZipDecompressor.cameraPitch < 128) {
                     GZipDecompressor.cameraPitch = 128;
                     onCameraPitchChanged(-1);
                  }

                  if(GZipDecompressor.cameraPitch > 383) {
                     GZipDecompressor.cameraPitch = 383;
                     onCameraPitchChanged(-1);
                  }
               }

               var1.currentPacket = null;
               return true;
            }

            if(ServerProt.field2139 == var1.currentPacket) {
               class12.method179(ZoneProt.field2335);
               var1.currentPacket = null;
               return true;
            }

            if(ServerProt.field2203 == var1.currentPacket) {
               rebootTimer = var3.readUnsignedShort() * 30;
               lastMiscTransmit = cycleCntr;
               var1.currentPacket = null;
               return true;
            }

            if(ServerProt.field2147 == var1.currentPacket) {
               var56 = var3.method5093();
               if(var56) {
                  if(WorldMapType1.field216 == null) {
                     WorldMapType1.field216 = new class7();
                  }
               } else {
                  WorldMapType1.field216 = null;
               }

               var1.currentPacket = null;
               return true;
            }

            if(ServerProt.field2133 == var1.currentPacket) {
               field893 = false;

               for(var16 = 0; var16 < 5; ++var16) {
                  field894[var16] = false;
               }

               var1.currentPacket = null;
               return true;
            }

            if(ServerProt.field2173 == var1.currentPacket) {
               class12.method179(ZoneProt.field2337);
               var1.currentPacket = null;
               return true;
            }

            if(ServerProt.field2153 == var1.currentPacket) {
               FontName.method507();
               var16 = var3.method5314();
               var5 = var3.readUnsignedByteC();
               var18 = var3.readUnsignedByte();
               skillExperiences[var5] = var16;
               experiencedChanged(var5);
               skillLevels[var5] = var18;
               boostedSkillLevelsChanged(var5);
               skillBaseLevels[var5] = 1;

               for(var7 = 0; var7 < 98; ++var7) {
                  if(var16 >= class95.field2864[var7]) {
                     skillBaseLevels[var5] = var7 + 2;
                  }
               }

               changedSkills[++changedSkillsCount - 1 & 31] = var5;
               var1.currentPacket = null;
               return true;
            }

            if(ServerProt.field2170 == var1.currentPacket) {
               class12.method179(ZoneProt.field2338);
               var1.currentPacket = null;
               return true;
            }

            if(ServerProt.field2180 == var1.currentPacket) {
               var16 = var3.method5281();
               var5 = var3.method5134();
               var6 = ChatHistory.method6246(var5);
               if(var6.modelType != 2 || var16 != var6.modelId) {
                  var6.modelType = 2;
                  var6.modelId = var16;
                  WorldMapRegion.method5554(var6);
               }

               var1.currentPacket = null;
               return true;
            }

            if(ServerProt.field2134 == var1.currentPacket) {
               var16 = var3.method5269();
               var45 = var3.readUnsignedByte() == 1;
               var41 = "";
               boolean var42 = false;
               if(var45) {
                  var41 = var3.readString();
                  if(class258.friendManager.method2348(new Name(var41, KeyFocusListener.loginType))) {
                     var42 = true;
                  }
               }

               String var60 = var3.readString();
               if(!var42) {
                  KeyFocusListener.method5934(var16, var41, var60);
               }

               var1.currentPacket = null;
               return true;
            }

            if(ServerProt.field2190 == var1.currentPacket) {
               var16 = var3.method5133();
               var5 = var3.method5142();
               var18 = var3.method5127();
               var57 = ChatHistory.method6246(var16);
               if(var18 != var57.posX || var5 != var57.posY || var57.posXmode != 0 || var57.posYmode != 0) {
                  var57.posX = var18;
                  var57.posY = var5;
                  var57.posXmode = 0;
                  var57.posYmode = 0;
                  WorldMapRegion.method5554(var57);
                  this.method3120(var57);
                  if(var57.type == 0) {
                     ScriptState.method1043(ComponentType.interfaces[var16 >> 16], var57, false);
                  }
               }

               var1.currentPacket = null;
               return true;
            }

            if(ServerProt.field2179 == var1.currentPacket) {
               var16 = var3.method5314();
               var5 = var3.readUnsignedShort128();
               if(var5 == 65535) {
                  var5 = -1;
               }

               var18 = var3.method5134();
               var7 = var3.readUnsignedShort();
               if(var7 == 65535) {
                  var7 = -1;
               }

               for(var8 = var7; var8 <= var5; ++var8) {
                  var24 = (long)var8 + ((long)var18 << 32);
                  Node var11 = serverActiveProperties.method6335(var24);
                  if(var11 != null) {
                     var11.method432();
                  }

                  serverActiveProperties.method6344(new IntegerNode(var16), var24);
               }

               var1.currentPacket = null;
               return true;
            }

            if(ServerProt.field2191 == var1.currentPacket) {
               var16 = var3.readInt();
               var5 = var3.readUnsignedShort();
               if(var5 == 65535) {
                  var5 = -1;
               }

               var18 = var3.method5134();
               var57 = ChatHistory.method6246(var16);
               ObjType var59;
               if(!var57.isIf3) {
                  if(var5 == -1) {
                     var57.modelType = 0;
                     var1.currentPacket = null;
                     return true;
                  }

                  var59 = class79.method1074(var5);
                  var57.modelType = 4;
                  var57.modelId = var5;
                  var57.xan2d = var59.xan2d;
                  var57.yan2d = var59.yan2d;
                  var57.zoom2d = var59.zoom2d * 100 / var18;
                  WorldMapRegion.method5554(var57);
               } else {
                  var57.linkObjType = var5;
                  var57.linkObjCount = var18;
                  var59 = class79.method1074(var5);
                  var57.xan2d = var59.xan2d;
                  var57.yan2d = var59.yan2d;
                  var57.zan2d = var59.zan2d;
                  var57.offsetX2d = var59.xof2d;
                  var57.offsetY2d = var59.yof2d;
                  var57.zoom2d = var59.zoom2d;
                  if(var59.stackable == 1) {
                     var57.objNumMode = 1;
                  } else {
                     var57.objNumMode = 2;
                  }

                  if(var57.field2728 > 0) {
                     var57.zoom2d = var57.zoom2d * 32 / var57.field2728;
                  } else if(var57.sizeX > 0) {
                     var57.zoom2d = var57.zoom2d * 32 / var57.sizeX;
                  }

                  WorldMapRegion.method5554(var57);
               }

               var1.currentPacket = null;
               return true;
            }

            if(ServerProt.field2160 == var1.currentPacket) {
               if(var1.currentPacketSize == 0) {
                  MapIconReference.clanMemberManager = null;
                  clanMemberManagerChanged(-1);
               } else {
                  if(MapIconReference.clanMemberManager == null) {
                     MapIconReference.clanMemberManager = new ClanMemberManager(KeyFocusListener.loginType, ItemContainer.clientInstance);
                     clanMemberManagerChanged(-1);
                  }

                  MapIconReference.clanMemberManager.method2450(var3);
               }

               CollisionData.method3613();
               var1.currentPacket = null;
               return true;
            }

            if(ServerProt.field2145 == var1.currentPacket) {
               class12.method179(ZoneProt.field2333);
               var1.currentPacket = null;
               return true;
            }

            if(ServerProt.field2141 == var1.currentPacket) {
               var37 = var3.readString();
               var20 = (long)var3.readUnsignedShort();
               var22 = (long)var3.method5090();
               int compressed = var3.readUnsignedShort();
               int primary = (compressed) & 0x1F;
               int secondary = (compressed >> 5) & 0x1F;
               int tertiary = (compressed >> 10) & 0x1F;
               ChatCrownType staffRank = (ChatCrownType)PlayerList.method4757(class248.method4669(), primary);
               long var31 = var22 + (var20 << 32);
               boolean var33 = false;

               for(int var13 = 0; var13 < 100; ++var13) {
                  if(field755[var13] == var31) {
                     var33 = true;
                     break;
                  }
               }

               if(class258.friendManager.method2348(new Name(var37, KeyFocusListener.loginType))) {
                  var33 = true;
               }

               if(!var33 && field763 == 0) {
                  field755[field758] = var31;
                  field758 = (field758 + 1) % 100;
                  String var34 = FontTypeFace.method6234(MapElementType.method1507(ModeWhere.method1463(var3)));
                  byte var14;
                  if(staffRank.staff) {
                     var14 = 7;
                  } else {
                     var14 = 3;
                  }
                  KeyFocusListener.method5934(var14, (staffRank.icon == -1 ? "" : class181.getModIcon(staffRank.icon)) + class181.getModIcon(secondary) + class181.getModIcon(tertiary) + var37, var34);
               }

               var1.currentPacket = null;
               return true;
            }

            if(ServerProt.field2164 == var1.currentPacket) {
               var16 = var3.method5281();
               var5 = var3.method5281();
               var18 = var3.method5281();
               var7 = var3.method5134();
               var28 = ChatHistory.method6246(var7);
               if(var16 != var28.xan2d || var18 != var28.yan2d || var5 != var28.zoom2d) {
                  var28.xan2d = var16;
                  var28.yan2d = var18;
                  var28.zoom2d = var5;
                  WorldMapRegion.method5554(var28);
               }

               var1.currentPacket = null;
               return true;
            }

            if(ServerProt.field2136 == var1.currentPacket) {
               var16 = var3.readInt();
               if(var16 != field731) {
                  field731 = var16;
                  class31.method522();
               }

               var1.currentPacket = null;
               return true;
            }

            if(ServerProt.field2142 == var1.currentPacket) {
               class258.friendManager.method2343();
               lastFriendTransmit = cycleCntr;
               var1.currentPacket = null;
               return true;
            }

            if(ServerProt.field2152 == var1.currentPacket) {
               class135.field106 = class142.method2033(var3.readUnsignedByte());
               var1.currentPacket = null;
               return true;
            }

            if(ServerProt.field2207 == var1.currentPacket) {
               byte var55 = var3.method5118();
               var5 = var3.readUnsignedShort128();
               class313.serverVarps[var5] = var55;
               if(class313.clientVarps[var5] != var55) {
                  class313.clientVarps[var5] = var55;
                  settingsChanged(var5);
               }

               TradingPost.method1614(var5);
               field835[++field836 - 1 & 31] = var5;
               var1.currentPacket = null;
               return true;
            }

            if(ServerProt.field2202 == var1.currentPacket) {
               FontName.method507();
               weight = var3.method5089();
               lastMiscTransmit = cycleCntr;
               var1.currentPacket = null;
               return true;
            }

            if(ServerProt.field2184 == var1.currentPacket) {
               WorldComparator.method76(var3, var1.currentPacketSize);
               var1.currentPacket = null;
               return true;
            }

            if(ServerProt.field2195 == var1.currentPacket) {
               VarPlayerType.field3319 = var3.readUnsignedByteC();
               class318.field115 = var3.method5117();
               var1.currentPacket = null;
               return true;
            }

            if(ServerProt.field2185 == var1.currentPacket) {
               var16 = var3.readInt();
               SubInterface var49 = (SubInterface)subInterfaces.method6335((long)var16);
               if(var49 != null) {
                  Overlay.method6405(var49, true);
               }

               if(field793 != null) {
                  WorldMapRegion.method5554(field793);
                  field793 = null;
               }

               var1.currentPacket = null;
               return true;
            }

            if(ServerProt.field2192 == var1.currentPacket) {
               var16 = var3.method5089();
               var5 = var3.method5134();
               var6 = ChatHistory.method6246(var5);
               if(var16 != var6.animation || var16 == -1) {
                  var6.animation = var16;
                  var6.field2817 = 0;
                  var6.field2818 = 0;
                  WorldMapRegion.method5554(var6);
               }

               var1.currentPacket = null;
               return true;
            }

            if(ServerProt.field2131 == var1.currentPacket) {
               var16 = var3.readUnsignedByte();
               if(var3.readUnsignedByte() == 0) {
                  grandExchangeOffers[var16] = new GrandExchangeOffer();
                  onGrandExchangeOffersChanged(var16);
                  var3.offset += 18;
               } else {
                  --var3.offset;
                  grandExchangeOffers[var16] = new GrandExchangeOffer(var3, false);
                  onGrandExchangeOffersChanged(var16);
               }

               field648 = cycleCntr;
               var1.currentPacket = null;
               return true;
            }

            if(ServerProt.field2146 == var1.currentPacket) {
               var16 = var3.method5281();
               if(var16 == 65535) {
                  var16 = -1;
               }

               class53.method866(var16);
               var1.currentPacket = null;
               return true;
            }

            if(ServerProt.field2151 == var1.currentPacket) {
               var16 = var3.method5129();
               var5 = var3.readUnsignedShort128();
               if(var5 == 65535) {
                  var5 = -1;
               }

               FileSystem.method570(var5, var16);
               var1.currentPacket = null;
               return true;
            }

            if(ServerProt.field2194 == var1.currentPacket) {
               class12.method179(ZoneProt.field2339);
               var1.currentPacket = null;
               return true;
            }

            if(ServerProt.field2171 == var1.currentPacket) {
               var16 = var3.readUnsignedByte();
               var5 = var3.readUnsignedByte();
               var18 = var3.readUnsignedByte();
               var7 = var3.readUnsignedByte();
               field894[var16] = true;
               field895[var16] = var5;
               field896[var16] = var18;
               field897[var16] = var7;
               field761[var16] = 0;
               var1.currentPacket = null;
               return true;
            }

            if(ServerProt.field2177 == var1.currentPacket) {
               var16 = var3.method5309();
               MapLabel.method2860(var16);
               field837[++field681 - 1 & 31] = var16 & 32767;
               var1.currentPacket = null;
               return true;
            }

            if(ServerProt.field2198 == var1.currentPacket) {
               destinationX = var3.readUnsignedByte();
               if(destinationX == 255) {
                  destinationX = 0;
               }

               destinationY = var3.readUnsignedByte();
               if(destinationY == 255) {
                  destinationY = 0;
               }

               var1.currentPacket = null;
               return true;
            }

            if(ServerProt.field2216 == var1.currentPacket) {
               FontName.method507();
               energy = var3.readUnsignedByte();
               lastMiscTransmit = cycleCntr;
               var1.currentPacket = null;
               return true;
            }

            if(ServerProt.field2200 == var1.currentPacket) {
               var16 = var3.readInt();
               var5 = var3.readInt();
               var18 = class285.method5882();
               TcpConnectionMessage var27 = class232.method4535(ClientProt.field2230, serverConnection.isaac);
               var27.packetBuffer.method5232(var18);
               var27.packetBuffer.writeByte(GameEngine.FPS);
               var27.packetBuffer.method5131(var16);
               var27.packetBuffer.method5130(var5);
               serverConnection.method18(var27);
               var1.currentPacket = null;
               return true;
            }

            VertexNormal.method4110("" + (var1.currentPacket != null?var1.currentPacket.id:-1) + "," + (var1.field1315 != null?var1.field1315.id:-1) + "," + (var1.field1316 != null?var1.field1316.id:-1) + "," + var1.currentPacketSize, (Throwable)null, (byte)-30);
            class285.method5866();
         } catch (IOException var35) {
            FontName.method515();
         } catch (Exception var36) {
            var17 = "" + (var1.currentPacket != null?var1.currentPacket.id:-1) + "," + (var1.field1315 != null?var1.field1315.id:-1) + "," + (var1.field1316 != null?var1.field1316.id:-1) + "," + var1.currentPacketSize + "," + (class71.localPlayer.pathX[0] + class53.baseX) + "," + (class71.localPlayer.pathY[0] + class312.baseY) + ",";

            for(var18 = 0; var18 < var1.currentPacketSize && var18 < 50; ++var18) {
               var17 = var17 + var3.payload[var18] + ",";
            }

            VertexNormal.method4110(var17, var36, (byte)-27);
            class285.method5866();
         }

         return true;
      }
   }

   @ObfuscatedName("ju")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-481641107"
   )
   final void method3360() {
      WorldMapRegion.method5554(draggedWidget);
      ++WorldMapRegion.field267;
      if(field830 && field904) {
         int var1 = MouseInput.mouseLastX;
         int var2 = MouseInput.mouseLastY;
         var1 -= field824;
         var2 -= field802;
         if(var1 < field757) {
            var1 = field757;
         }

         if(var1 + draggedWidget.width > field757 + field823.width) {
            var1 = field757 + field823.width - draggedWidget.width;
         }

         if(var2 < field829) {
            var2 = field829;
         }

         if(var2 + draggedWidget.height > field829 + field823.height) {
            var2 = field829 + field823.height - draggedWidget.height;
         }

         int var3 = var1 - field831;
         int var4 = var2 - field832;
         int var5 = draggedWidget.dragDeadZone;
         if(WorldMapRegion.field267 > draggedWidget.dragDeadTime && (var3 > var5 || var3 < -var5 || var4 > var5 || var4 < -var5)) {
            draggingWidget = true;
            draggingWidgetChanged(-1);
         }

         int var6 = var1 - field757 + field823.scrollX;
         int var7 = var2 - field829 + field823.scrollY;
         ScriptEvent var8;
         if(draggedWidget.onDragListener != null && draggingWidget) {
            var8 = new ScriptEvent();
            var8.source = draggedWidget;
            var8.mouseX = var6;
            var8.mouseY = var7;
            var8.params = draggedWidget.onDragListener;
            class192.method3810(var8);
         }

         if(MouseInput.mouseCurrentButton == 0) {
            if(draggingWidget) {
               if(draggedWidget.onDragCompleteListener != null) {
                  var8 = new ScriptEvent();
                  var8.source = draggedWidget;
                  var8.mouseX = var6;
                  var8.mouseY = var7;
                  var8.target = draggedOnWidget;
                  var8.params = draggedWidget.onDragCompleteListener;
                  class192.method3810(var8);
               }

               if(draggedOnWidget != null) {
                  ComponentType var9 = draggedWidget;
                  int var11 = WorldComparator.method86(var9);
                  int var10 = var11 >> 17 & 7;
                  int var12 = var10;
                  ComponentType var17;
                  if(var10 == 0) {
                     var17 = null;
                  } else {
                     int var13 = 0;

                     while(true) {
                        if(var13 >= var12) {
                           var17 = var9;
                           break;
                        }

                        var9 = ChatHistory.method6246(var9.layer);
                        if(var9 == null) {
                           var17 = null;
                           break;
                        }

                        ++var13;
                     }
                  }

                  System.out.println(var17);
                  if(var17 != null) {
                     TcpConnectionMessage var18 = class232.method4535(ClientProt.field2254, serverConnection.isaac);
                     var18.packetBuffer.method5122(draggedWidget.index);
                     var18.packetBuffer.method5122(draggedOnWidget.linkObjType);
                     var18.packetBuffer.writeShort(draggedOnWidget.index);
                     var18.packetBuffer.method5130(draggedWidget.id);
                     var18.packetBuffer.method5131(draggedOnWidget.id);
                     var18.packetBuffer.writeShort(draggedWidget.linkObjType);
                     serverConnection.method18(var18);
                  }
               }
            } else if(this.method3117(2050480115)) {
               this.method3487(field831 + field824, field802 + field832);
            } else if(menuOptionCount > 0) {
               int var15 = field824 + field831;
               int var16 = field832 + field802;
               ContextMenuRow var14 = class312.topContextMenuRow;
               class24.method464(var14.param0, var14.param1, var14.type, var14.identifier, var14.option, var14.option, var15, var16, -1885035218);
               class312.topContextMenuRow = null;
            }

            draggedWidget = null;
         }

      } else {
         if(WorldMapRegion.field267 > 1) {
            draggedWidget = null;
         }

      }
   }

   @ObfuscatedName("ia")
   @ObfuscatedSignature(
      signature = "(IIB)V",
      garbageValue = "-69"
   )
   final void method3487(int var1, int var2) {
      this.menuOpened(var1, var2);
      FriendManager.method2414(var1, var2);
      class312.sceneManager.method3658(ServerProt.level, var1, var2, false);
      isMenuOpen = true;
   }

   @ObfuscatedName("fo")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "122881234"
   )
   void method3523() {
      if(gameState != 1000) {
         long var2 = class318.method6317();
         int var4 = (int)(var2 - class321.field3276);
         class321.field3276 = var2;
         if(var4 > 200) {
            var4 = 200;
         }

         class321.field3289 += var4;
         boolean var1;
         if(class321.NetCache_pendingResponsesCount == 0 && class321.NetCache_pendingPriorityResponsesCount == 0 && class321.NetCache_pendingWritesCount == 0 && class321.NetCache_pendingPriorityWritesCount == 0) {
            var1 = true;
         } else if(class321.NetCache_socket == null) {
            var1 = false;
         } else {
            try {
               label241: {
                  if(class321.field3289 > 30000) {
                     throw new IOException();
                  }

                  FileRequest var5;
                  Packet var6;
                  while(class321.NetCache_pendingPriorityResponsesCount < 200 && class321.NetCache_pendingPriorityWritesCount > 0) {
                     var5 = (FileRequest)class321.NetCache_pendingPriorityWrites.method6338();
                     var6 = new Packet(4);
                     var6.writeByte(1);
                     var6.writeMedium((int)var5.hash);
                     class321.NetCache_socket.vmethod6359(var6.payload, 0, 4);
                     class321.NetCache_pendingPriorityResponses.method6344(var5, var5.hash);
                     --class321.NetCache_pendingPriorityWritesCount;
                     ++class321.NetCache_pendingPriorityResponsesCount;
                  }

                  while(class321.NetCache_pendingResponsesCount < 200 && class321.NetCache_pendingWritesCount > 0) {
                     var5 = (FileRequest)class321.NetCache_pendingWritesQueue.method1231();
                     var6 = new Packet(4);
                     var6.writeByte(0);
                     var6.writeMedium((int)var5.hash);
                     class321.NetCache_socket.vmethod6359(var6.payload, 0, 4);
                     var5.method1606();
                     class321.NetCache_pendingResponses.method6344(var5, var5.hash);
                     --class321.NetCache_pendingWritesCount;
                     ++class321.NetCache_pendingResponsesCount;
                  }

                  for(int var17 = 0; var17 < 100; ++var17) {
                     int var18 = class321.NetCache_socket.vmethod6356();
                     if(var18 < 0) {
                        throw new IOException();
                     }

                     if(var18 == 0) {
                        break;
                     }

                     class321.field3289 = 0;
                     byte var7 = 0;
                     if(TotalQuantityComparator.currentRequest == null) {
                        var7 = 8;
                     } else if(class321.field3275 == 0) {
                        var7 = 1;
                     }

                     int var8;
                     int var9;
                     int var10;
                     int var12;
                     if(var7 > 0) {
                        var8 = var7 - class321.NetCache_responseHeaderBuffer.offset;
                        if(var8 > var18) {
                           var8 = var18;
                        }

                        class321.NetCache_socket.vmethod6362(class321.NetCache_responseHeaderBuffer.payload, class321.NetCache_responseHeaderBuffer.offset, var8);
                        if(class321.field3291 != 0) {
                           for(var9 = 0; var9 < var8; ++var9) {
                              class321.NetCache_responseHeaderBuffer.payload[var9 + class321.NetCache_responseHeaderBuffer.offset] ^= class321.field3291;
                           }
                        }

                        class321.NetCache_responseHeaderBuffer.offset += var8;
                        if(class321.NetCache_responseHeaderBuffer.offset < var7) {
                           break;
                        }

                        if(TotalQuantityComparator.currentRequest == null) {
                           class321.NetCache_responseHeaderBuffer.offset = 0;
                           var9 = class321.NetCache_responseHeaderBuffer.readUnsignedByte();
                           var10 = class321.NetCache_responseHeaderBuffer.readUnsignedShort();
                           int var11 = class321.NetCache_responseHeaderBuffer.readUnsignedByte();
                           var12 = class321.NetCache_responseHeaderBuffer.readInt();
                           long var13 = (long)(var10 + (var9 << 16));
                           FileRequest var15 = (FileRequest)class321.NetCache_pendingPriorityResponses.method6335(var13);
                           class321.field3292 = true;
                           if(var15 == null) {
                              var15 = (FileRequest)class321.NetCache_pendingResponses.method6335(var13);
                              class321.field3292 = false;
                           }

                           if(var15 == null) {
                              throw new IOException();
                           }

                           int var16 = var11 == 0?5:9;
                           TotalQuantityComparator.currentRequest = var15;
                           UrlRequester.NetCache_responseArchiveBuffer = new Packet(var12 + var16 + TotalQuantityComparator.currentRequest.padding);
                           UrlRequester.NetCache_responseArchiveBuffer.writeByte(var11);
                           UrlRequester.NetCache_responseArchiveBuffer.writeInt(var12);
                           class321.field3275 = 8;
                           class321.NetCache_responseHeaderBuffer.offset = 0;
                        } else if(class321.field3275 == 0) {
                           if(class321.NetCache_responseHeaderBuffer.payload[0] == -1) {
                              class321.field3275 = 1;
                              class321.NetCache_responseHeaderBuffer.offset = 0;
                           } else {
                              TotalQuantityComparator.currentRequest = null;
                           }
                        }
                     } else {
                        var8 = UrlRequester.NetCache_responseArchiveBuffer.payload.length - TotalQuantityComparator.currentRequest.padding;
                        var9 = 512 - class321.field3275;
                        if(var9 > var8 - UrlRequester.NetCache_responseArchiveBuffer.offset) {
                           var9 = var8 - UrlRequester.NetCache_responseArchiveBuffer.offset;
                        }

                        if(var9 > var18) {
                           var9 = var18;
                        }

                        class321.NetCache_socket.vmethod6362(UrlRequester.NetCache_responseArchiveBuffer.payload, UrlRequester.NetCache_responseArchiveBuffer.offset, var9);
                        if(class321.field3291 != 0) {
                           for(var10 = 0; var10 < var9; ++var10) {
                              UrlRequester.NetCache_responseArchiveBuffer.payload[UrlRequester.NetCache_responseArchiveBuffer.offset + var10] ^= class321.field3291;
                           }
                        }

                        UrlRequester.NetCache_responseArchiveBuffer.offset += var9;
                        class321.field3275 += var9;
                        if(var8 == UrlRequester.NetCache_responseArchiveBuffer.offset) {
                           if(16711935L == TotalQuantityComparator.currentRequest.hash) {
                              TotalQuantityComparator.NetCache_reference = UrlRequester.NetCache_responseArchiveBuffer;

                              for(var10 = 0; var10 < 256; ++var10) {
                                 Js5 var19 = class321.NetCache_indexCaches[var10];
                                 if(var19 != null) {
                                    TotalQuantityComparator.NetCache_reference.offset = var10 * 8 + 5;
                                    var12 = TotalQuantityComparator.NetCache_reference.readInt();
                                    int var20 = TotalQuantityComparator.NetCache_reference.readInt();
                                    var19.method2733(var12, var20);
                                 }
                              }
                           } else {
                              class321.NetCache_crc.reset();
                              class321.NetCache_crc.update(UrlRequester.NetCache_responseArchiveBuffer.payload, 0, var8);
                              var10 = (int)class321.NetCache_crc.getValue();
                              if(var10 != TotalQuantityComparator.currentRequest.crc) {
                                 try {
                                    class321.NetCache_socket.vmethod6355();
                                 } catch (Exception var23) {
                                    ;
                                 }

                                 ++class321.field3288;
                                 class321.NetCache_socket = null;
                                 class321.field3291 = (byte)((int)(Math.random() * 255.0D + 1.0D));
                                 var1 = false;
                                 break label241;
                              }

                              class321.field3288 = 0;
                              class321.field3294 = 0;
                              TotalQuantityComparator.currentRequest.index.method2721((int)(TotalQuantityComparator.currentRequest.hash & 65535L), UrlRequester.NetCache_responseArchiveBuffer.payload, (TotalQuantityComparator.currentRequest.hash & 16711680L) == 16711680L, class321.field3292);
                           }

                           TotalQuantityComparator.currentRequest.method432();
                           if(class321.field3292) {
                              --class321.NetCache_pendingPriorityResponsesCount;
                           } else {
                              --class321.NetCache_pendingResponsesCount;
                           }

                           class321.field3275 = 0;
                           TotalQuantityComparator.currentRequest = null;
                           UrlRequester.NetCache_responseArchiveBuffer = null;
                        } else {
                           if(class321.field3275 != 512) {
                              break;
                           }

                           class321.field3275 = 0;
                        }
                     }
                  }

                  var1 = true;
               }
            } catch (IOException var24) {
               try {
                  class321.NetCache_socket.vmethod6355();
               } catch (Exception var22) {
                  ;
               }

               ++class321.field3294;
               class321.NetCache_socket = null;
               var1 = false;
            }
         }

         if(!var1) {
            this.method3108();
         }

      }
   }

   @ObfuscatedName("ip")
   @ObfuscatedSignature(
      signature = "(ZB)V",
      garbageValue = "0"
   )
   final void method3119(boolean var1) {
      int var2 = toplevel;
      int var3 = GrandExchangeOffer.canvasWidth;
      int var4 = class258.canvasHeight;
      if(ChatLine.method5915(var2)) {
         Frames.method6063(ComponentType.interfaces[var2], -1, var3, var4, var1);
      }

   }

   @ObfuscatedName("gl")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-265842676"
   )
   void method3113() {
      int var1 = GrandExchangeOffer.canvasWidth;
      int var2 = class258.canvasHeight;
      if(super.field457 < var1) {
         var1 = super.field457;
      }

      if(super.field458 < var2) {
         var2 = super.field458;
      }

      if(class312.options != null) {
         try {
            client var3 = ItemContainer.clientInstance;
            Object[] var4 = new Object[]{Integer.valueOf(class31.method520())};
            JSObject.getWindow(var3).call("resize", var4);
         } catch (Throwable var5) {
            ;
         }
      }

   }

   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1828164637"
   )
   protected final void vmethod4390() {
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(CII)I",
      garbageValue = "-470182001"
   )
   static int method3207(char var0, int var1) {
      int var2 = var0 << 4;
      if(Character.isUpperCase(var0) || Character.isTitleCase(var0)) {
         var0 = Character.toLowerCase(var0);
         var2 = (var0 << 4) + 1;
      }

      return var2;
   }

   public static void copy$processClientError(String var0, Throwable var1, byte var2) {
      try {
         String var3 = "";
         if(var1 != null) {
            Throwable var5 = var1;
            String var6;
            if(var1 instanceof JagException) {
               if(var2 >= 0) {
                  return;
               }

               JagException var7 = (JagException)var1;
               var6 = var7.field2021 + " | ";
               var5 = var7.parent;
            } else {
               var6 = "";
            }

            StringWriter var19 = new StringWriter();
            PrintWriter var8 = new PrintWriter(var19);
            var5.printStackTrace(var8);
            var8.close();
            String var9 = var19.toString();
            BufferedReader var10 = new BufferedReader(new StringReader(var9));
            String var11 = var10.readLine();

            while(true) {
               String var12 = var10.readLine();
               if(var12 == null) {
                  var6 = var6 + "| " + var11;
                  var3 = var6;
                  break;
               }

               int var13 = var12.indexOf(40);
               int var14 = var12.indexOf(41, var13 + 1);
               if(var13 >= 0 && var14 >= 0) {
                  String var15 = var12.substring(var13 + 1, var14);
                  int var16 = var15.indexOf(".java:");
                  if(var16 >= 0) {
                     if(var2 >= 0) {
                        return;
                     }

                     var15 = var15.substring(0, var16) + var15.substring(var16 + 5);
                     var6 = var6 + var15 + ' ';
                     continue;
                  }

                  var12 = var12.substring(0, var13);
               }

               var12 = var12.trim();
               var12 = var12.substring(var12.lastIndexOf(32) + 1);
               var12 = var12.substring(var12.lastIndexOf(9) + 1);
               var6 = var6 + var12 + ' ';
            }
         }

         if(var0 != null) {
            if(var1 != null) {
               var3 = var3 + " | ";
            }

            var3 = var3 + var0;
         }

         System.out.println("Error: " + var3);
         var3 = var3.replace(':', '.');
         var3 = var3.replace('@', '_');
         var3 = var3.replace('&', '_');
         var3 = var3.replace('#', '_');
         if(JagException.field2022 == null) {
            if(var2 >= 0) {
               return;
            }

            return;
         }

         URL var4 = new URL(JagException.field2022.getCodeBase(), "clienterror.ws?c=" + JagException.revision + "&u=" + JagException.localPlayerUsername + "&v1=" + Signlink.javaVendor + "&v2=" + Signlink.javaVersion + "&ct=" + JagException.clientType + "&e=" + var3);
         DataInputStream var18 = new DataInputStream(var4.openStream());
         var18.read();
         var18.close();
      } catch (Exception var17) {
         ;
      }

   }

   @ObfuscatedSignature(
      signature = "(Lbr;II)V"
   )
   public static void copy$runScript(ScriptEvent var0, int var1, int var2) {
      try {
         Object[] var3 = var0.params;
         Object var4;
         int var18;
         if(PendingSpawn.method6454(var0.field581)) {
            class24.scriptMapIconReference = (MapIconReference)var3[0];
            MapElementType var5 = MapLabel.method2858(class24.scriptMapIconReference.areaId);
            var4 = currentScript = GrandExchangeEvent.method1555(var0.field581, var5.id, var5.category);
         } else {
            var18 = currentScriptPC = ((Integer)var3[0]).intValue();
            var4 = currentScript = SpotAnimation.method1574(var18);
         }

         if(var4 != null) {
            class281.intStackSize = 0;
            class295.scriptStringStackSize = 0;
            currentScriptPC = -1;
            var18 = -1;
            int[] var6 = ((class314)var4).instructions;
            int[] var7 = ((class314)var4).intOperands;
            byte var8 = -1;
            class281.scriptStackCount = 0;
            class281.field1078 = false;
            boolean var29 = false;

            label940: {
               label941: {
                  try {
                     int var11;
                     try {
                        label942: {
                           var29 = true;
                           class281.field3488 = new int[((class314)var4).localIntCount];
                           int var9 = 0;
                           class31.field308 = new String[((class314)var4).localStringCount];
                           int var10 = 0;

                           int var12;
                           String var19;
                           for(var11 = 1; var11 < var3.length; ++var11) {
                              if(var3[var11] instanceof Integer) {
                                 var12 = ((Integer)var3[var11]).intValue();
                                 if(var12 == -2147483647) {
                                    if(var2 == 1598019255) {
                                       return;
                                    }

                                    var12 = var0.mouseX;
                                 }

                                 if(var12 == -2147483646) {
                                    if(var2 == 1598019255) {
                                       return;
                                    }

                                    var12 = var0.mouseY;
                                 }

                                 if(var12 == -2147483645) {
                                    var12 = var0.source != null?var0.source.id:-1;
                                 }

                                 if(var12 == -2147483644) {
                                    if(var2 == 1598019255) {
                                       return;
                                    }

                                    var12 = var0.op;
                                 }

                                 if(var12 == -2147483643) {
                                    var12 = var0.source != null?var0.source.index:-1;
                                 }

                                 if(var12 == -2147483642) {
                                    var12 = var0.target != null?var0.target.id:-1;
                                 }

                                 if(var12 == -2147483641) {
                                    var12 = var0.target != null?var0.target.index:-1;
                                 }

                                 if(var12 == -2147483640) {
                                    var12 = var0.typedKeyCode;
                                 }

                                 if(var12 == -2147483639) {
                                    var12 = var0.typedKeyChar;
                                 }

                                 class281.field3488[var9++] = var12;
                              } else if(var3[var11] instanceof String) {
                                 var19 = (String)var3[var11];
                                 if(var19.equals("event_opbase")) {
                                    if(var2 == 1598019255) {
                                       return;
                                    }

                                    var19 = var0.opbase;
                                 }

                                 class31.field308[var10++] = var19;
                              }
                           }

                           var11 = 0;
                           class281.field1080 = var0.field582;

                           while(true) {
                              ++var11;
                              if(var11 > var1) {
                                 throw new RuntimeException();
                              }

                              int var33;
                              do {
                                 ++var18;
                                 currentScriptPC = var18;
                                 var33 = var6[var18];
                              } while(vmExecuteOpcode(var33));

                              int var21;
                              if(var33 >= 100) {
                                 boolean var36;
                                 if(((class314)var4).intOperands[var18] == 1) {
                                    var36 = true;
                                 } else {
                                    var36 = false;
                                 }

                                 var21 = WorldComparator.method85(var33, (class314)var4, var36);
                                 switch(var21) {
                                 case 0:
                                    var29 = false;
                                    break label942;
                                 case 1:
                                 default:
                                    break;
                                 case 2:
                                    throw new IllegalStateException();
                                 }
                              } else if(var33 == 0) {
                                 class281.intStack[++class281.intStackSize - 1] = var7[var18];
                              } else if(var33 == 1) {
                                 var12 = var7[var18];
                                 class281.intStack[++class281.intStackSize - 1] = class313.clientVarps[var12];
                              } else if(var33 == 2) {
                                 var12 = var7[var18];
                                 class313.clientVarps[var12] = class281.intStack[--class281.intStackSize];
                                 settingsChanged(var12);
                                 TradingPost.method1614(var12);
                              } else if(var33 == 3) {
                                 class281.scriptStringStack[++class295.scriptStringStackSize - 1] = ((class314)var4).stringOperands[var18];
                              } else {
                                 int var10000;
                                 int var10001;
                                 if(var33 == 6) {
                                    if(var2 == 1598019255) {
                                       return;
                                    }

                                    var10001 = var7[var18];
                                    var10000 = var18 + var7[var18];
                                    currentScriptPC = var18 + var10001;
                                    var18 = var10000;
                                 } else if(var33 == 7) {
                                    class281.intStackSize -= 2;
                                    if(class281.intStack[class281.intStackSize] != class281.intStack[class281.intStackSize + 1]) {
                                       if(var2 == 1598019255) {
                                          return;
                                       }

                                       var10001 = var7[var18];
                                       var10000 = var18 + var7[var18];
                                       currentScriptPC = var18 + var10001;
                                       var18 = var10000;
                                    }
                                 } else if(var33 == 8) {
                                    if(var2 == 1598019255) {
                                       return;
                                    }

                                    class281.intStackSize -= 2;
                                    if(class281.intStack[class281.intStackSize] == class281.intStack[class281.intStackSize + 1]) {
                                       var10001 = var7[var18];
                                       var10000 = var18 + var7[var18];
                                       currentScriptPC = var18 + var10001;
                                       var18 = var10000;
                                    }
                                 } else if(var33 == 9) {
                                    if(var2 == 1598019255) {
                                       return;
                                    }

                                    class281.intStackSize -= 2;
                                    if(class281.intStack[class281.intStackSize] < class281.intStack[class281.intStackSize + 1]) {
                                       var10001 = var7[var18];
                                       var10000 = var18 + var7[var18];
                                       currentScriptPC = var18 + var10001;
                                       var18 = var10000;
                                    }
                                 } else if(var33 == 10) {
                                    class281.intStackSize -= 2;
                                    if(class281.intStack[class281.intStackSize] > class281.intStack[class281.intStackSize + 1]) {
                                       var10001 = var7[var18];
                                       var10000 = var18 + var7[var18];
                                       currentScriptPC = var18 + var10001;
                                       var18 = var10000;
                                    }
                                 } else if(var33 == 21) {
                                    if(class281.scriptStackCount == 0) {
                                       var29 = false;
                                       break label941;
                                    }

                                    ScriptState var38 = class281.scriptStack[--class281.scriptStackCount];
                                    var4 = currentScript = var38.field740;
                                    var6 = ((class314)var4).instructions;
                                    var7 = ((class314)var4).intOperands;
                                    var18 = currentScriptPC = var38.invokedFromPc;
                                    class281.field3488 = var38.field738;
                                    class31.field308 = var38.field741;
                                 } else if(var33 == 25) {
                                    var12 = var7[var18];
                                    class281.intStack[++class281.intStackSize - 1] = CombatInfo1.method57(var12);
                                 } else if(var33 == 27) {
                                    var12 = var7[var18];
                                    class266.method5004(var12, class281.intStack[--class281.intStackSize]);
                                 } else if(var33 == 31) {
                                    if(var2 == 1598019255) {
                                       return;
                                    }

                                    class281.intStackSize -= 2;
                                    if(class281.intStack[class281.intStackSize] <= class281.intStack[class281.intStackSize + 1]) {
                                       var10001 = var7[var18];
                                       var10000 = var18 + var7[var18];
                                       currentScriptPC = var18 + var10001;
                                       var18 = var10000;
                                    }
                                 } else if(var33 == 32) {
                                    class281.intStackSize -= 2;
                                    if(class281.intStack[class281.intStackSize] >= class281.intStack[class281.intStackSize + 1]) {
                                       var10001 = var7[var18];
                                       var10000 = var18 + var7[var18];
                                       currentScriptPC = var18 + var10001;
                                       var18 = var10000;
                                    }
                                 } else if(var33 == 33) {
                                    class281.intStack[++class281.intStackSize - 1] = class281.field3488[var7[var18]];
                                 } else if(var33 == 34) {
                                    class281.field3488[var7[var18]] = class281.intStack[--class281.intStackSize];
                                 } else if(var33 == 35) {
                                    class281.scriptStringStack[++class295.scriptStringStackSize - 1] = class31.field308[var7[var18]];
                                 } else if(var33 == 36) {
                                    if(var2 == 1598019255) {
                                       return;
                                    }

                                    class31.field308[var7[var18]] = class281.scriptStringStack[--class295.scriptStringStackSize];
                                 } else if(var33 == 37) {
                                    var12 = var7[var18];
                                    class295.scriptStringStackSize -= var12;
                                    String var35 = class47.method792(class281.scriptStringStack, class295.scriptStringStackSize, var12);
                                    class281.scriptStringStack[++class295.scriptStringStackSize - 1] = var35;
                                 } else if(var33 == 38) {
                                    if(var2 == 1598019255) {
                                       return;
                                    }

                                    --class281.intStackSize;
                                 } else if(var33 == 39) {
                                    --class295.scriptStringStackSize;
                                 } else {
                                    int var16;
                                    if(var33 != 40) {
                                       if(var33 == 42) {
                                          class281.intStack[++class281.intStackSize - 1] = WorldMapType3.varcs.method318(var7[var18]);
                                       } else if(var33 == 43) {
                                          if(var2 == 1598019255) {
                                             return;
                                          }

                                          WorldMapType3.varcs.method317(var7[var18], class281.intStack[--class281.intStackSize]);
                                       } else if(var33 == 44) {
                                          var12 = var7[var18] >> 16;
                                          var21 = var7[var18] & 65535;
                                          int var22 = class281.intStack[--class281.intStackSize];
                                          if(var22 < 0 || var22 > 5000) {
                                             throw new RuntimeException();
                                          }

                                          class281.scriptArrayLengths[var12] = var22;
                                          byte var23 = -1;
                                          if(var21 == 105) {
                                             var23 = 0;
                                          }

                                          for(var16 = 0; var16 < var22; ++var16) {
                                             class281.scriptArrays[var12][var16] = var23;
                                          }
                                       } else if(var33 == 45) {
                                          var12 = var7[var18];
                                          var21 = class281.intStack[--class281.intStackSize];
                                          if(var21 < 0) {
                                             break;
                                          }

                                          if(var2 == 1598019255) {
                                             return;
                                          }

                                          if(var21 >= class281.scriptArrayLengths[var12]) {
                                             if(var2 == 1598019255) {
                                                return;
                                             }
                                             break;
                                          }

                                          class281.intStack[++class281.intStackSize - 1] = class281.scriptArrays[var12][var21];
                                       } else if(var33 == 46) {
                                          var12 = var7[var18];
                                          class281.intStackSize -= 2;
                                          var21 = class281.intStack[class281.intStackSize];
                                          if(var21 < 0) {
                                             throw new RuntimeException();
                                          }

                                          if(var2 == 1598019255) {
                                             return;
                                          }

                                          if(var21 >= class281.scriptArrayLengths[var12]) {
                                             throw new RuntimeException();
                                          }

                                          class281.scriptArrays[var12][var21] = class281.intStack[class281.intStackSize + 1];
                                       } else if(var33 == 47) {
                                          var19 = WorldMapType3.varcs.method353(var7[var18]);
                                          if(var19 == null) {
                                             if(var2 == 1598019255) {
                                                return;
                                             }

                                             var19 = class200.field2329;
                                          }

                                          class281.scriptStringStack[++class295.scriptStringStackSize - 1] = var19;
                                       } else if(var33 == 48) {
                                          WorldMapType3.varcs.method321(var7[var18], class281.scriptStringStack[--class295.scriptStringStackSize]);
                                       } else if(var33 == 49) {
                                          var19 = WorldMapType3.varcs.method322(var7[var18]);
                                          class281.scriptStringStack[++class295.scriptStringStackSize - 1] = var19;
                                       } else if(var33 == 50) {
                                          if(var2 == 1598019255) {
                                             return;
                                          }

                                          WorldMapType3.varcs.method319(var7[var18], class281.scriptStringStack[--class295.scriptStringStackSize]);
                                       } else {
                                          if(var33 != 60) {
                                             throw new IllegalStateException();
                                          }

                                          IterableHashTable var37 = ((class314)var4).switches[var7[var18]];
                                          IntegerNode var34 = (IntegerNode)var37.method2178((long)class281.intStack[--class281.intStackSize]);
                                          if(var34 != null) {
                                             var18 = currentScriptPC = var18 + var34.value;
                                          }
                                       }
                                    } else {
                                       if(var2 == 1598019255) {
                                          return;
                                       }

                                       var12 = var7[var18];
                                       class314 var13 = SpotAnimation.method1574(var12);
                                       int[] var14 = new int[var13.localIntCount];
                                       String[] var15 = new String[var13.localStringCount];

                                       for(var16 = 0; var16 < var13.intStackCount; ++var16) {
                                          if(var2 == 1598019255) {
                                             return;
                                          }

                                          var14[var16] = class281.intStack[var16 + (class281.intStackSize - var13.intStackCount)];
                                       }

                                       for(var16 = 0; var16 < var13.stringStackCount; ++var16) {
                                          var15[var16] = class281.scriptStringStack[var16 + (class295.scriptStringStackSize - var13.stringStackCount)];
                                       }

                                       class281.intStackSize -= var13.intStackCount;
                                       class295.scriptStringStackSize -= var13.stringStackCount;
                                       ScriptState var20 = new ScriptState();
                                       var20.field740 = (class314)var4;
                                       var20.invokedFromPc = var18;
                                       var20.field738 = class281.field3488;
                                       var20.field741 = class31.field308;
                                       class281.scriptStack[++class281.scriptStackCount - 1] = var20;
                                       currentScript = var13;
                                       var4 = var13;
                                       var6 = var13.instructions;
                                       var7 = var13.intOperands;
                                       currentScriptPC = -1;
                                       var18 = -1;
                                       class281.field3488 = var14;
                                       class31.field308 = var15;
                                    }
                                 }
                              }
                           }

                           throw new RuntimeException();
                        }
                     } catch (Exception var30) {
                        StringBuilder var25 = new StringBuilder(30);
                        var25.append("").append(((Node)var4).hash).append(" ");

                        for(var11 = class281.scriptStackCount - 1; var11 >= 0; --var11) {
                           var25.append("").append(class281.scriptStack[var11].field740.hash).append(" ");
                        }

                        var25.append("").append(var8);
                        VertexNormal.method4110(var25.toString(), var30, (byte)-27);
                        var29 = false;
                        break label940;
                     }
                  } finally {
                     if(var29) {
                        if(class281.field1078) {
                           class281.field1079 = true;
                           Bit.method2674();
                           class281.field1079 = false;
                           class281.field1078 = false;
                        }

                     }
                  }

                  if(class281.field1078) {
                     class281.field1079 = true;
                     Bit.method2674();
                     class281.field1079 = false;
                     class281.field1078 = false;
                  }

                  return;
               }

               if(class281.field1078) {
                  class281.field1079 = true;
                  Bit.method2674();
                  class281.field1079 = false;
                  class281.field1078 = false;
               }

               return;
            }

            if(class281.field1078) {
               if(var2 == 1598019255) {
                  return;
               }

               class281.field1079 = true;
               Bit.method2674();
               class281.field1079 = false;
               class281.field1078 = false;
            }

         }
      } catch (RuntimeException var32) {
         throw class284.method5855(var32, "ar.s(" + ')');
      }
   }

   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1"
   )
   public static void canvasWidthChanged(int var0) {
      ItemContainer.clientInstance.getCallbacks().post(new CanvasSizeChanged());
   }

   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1"
   )
   public static void gameStateChanged(int var0) {
      GameStateChanged var1 = new GameStateChanged();
      var1.setGameState(ItemContainer.clientInstance.getGameState());
      ItemContainer.clientInstance.getCallbacks().post(var1);
   }

   @ObfuscatedSignature(
      signature = "(Liz;III)Lld;"
   )
   public static SpritePixels copy$getSpriteAsSpritePixels(Js5Index var0, int var1, int var2, int var3) {
      return !class205.method4006(var0, var1, var2)?null:AttackOpPriority.method1554();
   }

   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1"
   )
   public static void canvasHeightChanged(int var0) {
      ItemContainer.clientInstance.getCallbacks().post(new CanvasSizeChanged());
   }

   public static final void copy$menuAction(int var0, int var1, int var2, int var3, String var4, String var5, int var6, int var7, int var8) {
      if(var2 >= 2000) {
         var2 -= 2000;
      }

      TcpConnectionMessage var9;
      if(var2 == 1) {
         if(var8 == -1659892464) {
            return;
         }

         lastLeftClickX = var6;
         lastLeftClickY = var7;
         cursorState = 2;
         field752 = 0;
         destinationX = var0;
         destinationY = var1;
         var9 = class232.method4535(ClientProt.field2263, serverConnection.isaac);
         var9.packetBuffer.method5123(class312.baseY + var1);
         var9.packetBuffer.method5121(class29.selectedItemIndex);
         var9.packetBuffer.method5112(KeyFocusListener.keyPressed[82]?1:0);
         var9.packetBuffer.method5130(class132.field3198);
         var9.packetBuffer.method5123(var0 + class53.baseX);
         var9.packetBuffer.writeShort(var3);
         var9.packetBuffer.method5121(Resampler.field1438);
         serverConnection.method18(var9);
      } else if(var2 == 2) {
         lastLeftClickX = var6;
         lastLeftClickY = var7;
         cursorState = 2;
         field752 = 0;
         destinationX = var0;
         destinationY = var1;
         var9 = class232.method4535(ClientProt.field2300, serverConnection.isaac);
         var9.packetBuffer.writeByte(KeyFocusListener.keyPressed[82]?1:0);
         var9.packetBuffer.writeShort(var0 + class53.baseX);
         var9.packetBuffer.method5122(var3);
         var9.packetBuffer.method5132(class255.field2065);
         var9.packetBuffer.writeShort(field853);
         var9.packetBuffer.method5121(class312.baseY + var1);
         serverConnection.method18(var9);
      } else {
         Bit var10000;
         byte var10001;
         if(var2 == 3) {
            if(var8 == -1659892464) {
               return;
            }

            lastLeftClickX = var6;
            lastLeftClickY = var7;
            cursorState = 2;
            field752 = 0;
            destinationX = var0;
            destinationY = var1;
            var9 = class232.method4535(ClientProt.field2229, serverConnection.isaac);
            var9.packetBuffer.writeShort(class312.baseY + var1);
            var10000 = var9.packetBuffer;
            if(KeyFocusListener.keyPressed[82]) {
               if(var8 == -1659892464) {
                  return;
               }

               var10001 = 1;
            } else {
               var10001 = 0;
            }

            var10000.method5307(var10001);
            var9.packetBuffer.method5122(var3);
            var9.packetBuffer.method5123(var0 + class53.baseX);
            serverConnection.method18(var9);
         } else if(var2 == 4) {
            lastLeftClickX = var6;
            lastLeftClickY = var7;
            cursorState = 2;
            field752 = 0;
            destinationX = var0;
            destinationY = var1;
            var9 = class232.method4535(ClientProt.field2298, serverConnection.isaac);
            var9.packetBuffer.method5112(KeyFocusListener.keyPressed[82]?1:0);
            var9.packetBuffer.writeShort(var3);
            var9.packetBuffer.writeShort(class312.baseY + var1);
            var9.packetBuffer.writeShort(var0 + class53.baseX);
            serverConnection.method18(var9);
         } else if(var2 == 5) {
            lastLeftClickX = var6;
            lastLeftClickY = var7;
            cursorState = 2;
            field752 = 0;
            destinationX = var0;
            destinationY = var1;
            var9 = class232.method4535(ClientProt.field2312, serverConnection.isaac);
            var9.packetBuffer.method5123(var0 + class53.baseX);
            var9.packetBuffer.method5122(var3);
            var9.packetBuffer.method5123(class312.baseY + var1);
            var9.packetBuffer.method5112(KeyFocusListener.keyPressed[82]?1:0);
            serverConnection.method18(var9);
         } else if(var2 == 6) {
            lastLeftClickX = var6;
            lastLeftClickY = var7;
            cursorState = 2;
            field752 = 0;
            destinationX = var0;
            destinationY = var1;
            var9 = class232.method4535(ClientProt.field2222, serverConnection.isaac);
            var10000 = var9.packetBuffer;
            if(KeyFocusListener.keyPressed[82]) {
               if(var8 == -1659892464) {
                  return;
               }

               var10001 = 1;
            } else {
               var10001 = 0;
            }

            var10000.method5112(var10001);
            var9.packetBuffer.method5122(class312.baseY + var1);
            var9.packetBuffer.method5122(var0 + class53.baseX);
            var9.packetBuffer.method5121(var3);
            serverConnection.method18(var9);
         } else {
            TcpConnectionMessage var10;
            NPCEntity var14;
            if(var2 == 7) {
               var14 = npcs[var3];
               if(var14 != null) {
                  if(var8 == -1659892464) {
                     return;
                  }

                  lastLeftClickX = var6;
                  lastLeftClickY = var7;
                  cursorState = 2;
                  field752 = 0;
                  destinationX = var0;
                  destinationY = var1;
                  var10 = class232.method4535(ClientProt.field2242, serverConnection.isaac);
                  var10.packetBuffer.method5123(Resampler.field1438);
                  var10.packetBuffer.writeShort(class29.selectedItemIndex);
                  var10.packetBuffer.method5123(var3);
                  var10.packetBuffer.method5232(KeyFocusListener.keyPressed[82]?1:0);
                  var10.packetBuffer.writeInt(class132.field3198);
                  serverConnection.method18(var10);
               }
            } else if(var2 == 8) {
               var14 = npcs[var3];
               if(var14 != null) {
                  lastLeftClickX = var6;
                  lastLeftClickY = var7;
                  cursorState = 2;
                  field752 = 0;
                  destinationX = var0;
                  destinationY = var1;
                  var10 = class232.method4535(ClientProt.field2305, serverConnection.isaac);
                  var10.packetBuffer.method5123(var3);
                  var10.packetBuffer.method5232(KeyFocusListener.keyPressed[82]?1:0);
                  var10.packetBuffer.method5130(class255.field2065);
                  var10.packetBuffer.method5122(field853);
                  serverConnection.method18(var10);
               }
            } else {
               label1289: {
                  if(var2 == 9) {
                     var14 = npcs[var3];
                     if(var14 != null) {
                        lastLeftClickX = var6;
                        lastLeftClickY = var7;
                        cursorState = 2;
                        field752 = 0;
                        destinationX = var0;
                        destinationY = var1;
                        var10 = class232.method4535(ClientProt.field2308, serverConnection.isaac);
                        var10.packetBuffer.method5232(KeyFocusListener.keyPressed[82]?1:0);
                        var10.packetBuffer.method5121(var3);
                        serverConnection.method18(var10);
                     }
                  } else if(var2 == 10) {
                     if(var8 == -1659892464) {
                        return;
                     }

                     var14 = npcs[var3];
                     if(var14 != null) {
                        lastLeftClickX = var6;
                        lastLeftClickY = var7;
                        cursorState = 2;
                        field752 = 0;
                        destinationX = var0;
                        destinationY = var1;
                        var10 = class232.method4535(ClientProt.field2220, serverConnection.isaac);
                        var10.packetBuffer.method5122(var3);
                        var10.packetBuffer.writeByte(KeyFocusListener.keyPressed[82]?1:0);
                        serverConnection.method18(var10);
                     }
                  } else if(var2 == 11) {
                     if(var8 == -1659892464) {
                        return;
                     }

                     var14 = npcs[var3];
                     if(var14 != null) {
                        lastLeftClickX = var6;
                        lastLeftClickY = var7;
                        cursorState = 2;
                        field752 = 0;
                        destinationX = var0;
                        destinationY = var1;
                        var10 = class232.method4535(ClientProt.field2252, serverConnection.isaac);
                        var10.packetBuffer.method5123(var3);
                        var10.packetBuffer.writeByte(KeyFocusListener.keyPressed[82]?1:0);
                        serverConnection.method18(var10);
                     }
                  } else if(var2 == 12) {
                     if(var8 == -1659892464) {
                        return;
                     }

                     var14 = npcs[var3];
                     if(var14 != null) {
                        lastLeftClickX = var6;
                        lastLeftClickY = var7;
                        cursorState = 2;
                        field752 = 0;
                        destinationX = var0;
                        destinationY = var1;
                        var10 = class232.method4535(ClientProt.field2251, serverConnection.isaac);
                        var10.packetBuffer.writeShort(var3);
                        var10.packetBuffer.method5112(KeyFocusListener.keyPressed[82]?1:0);
                        serverConnection.method18(var10);
                     }
                  } else {
                     if(var2 == 13) {
                        if(var8 == -1659892464) {
                           return;
                        }

                        var14 = npcs[var3];
                        if(var14 != null) {
                           lastLeftClickX = var6;
                           lastLeftClickY = var7;
                           cursorState = 2;
                           field752 = 0;
                           destinationX = var0;
                           destinationY = var1;
                           var10 = class232.method4535(ClientProt.field2250, serverConnection.isaac);
                           var10.packetBuffer.writeByte(KeyFocusListener.keyPressed[82]?1:0);
                           var10.packetBuffer.method5122(var3);
                           serverConnection.method18(var10);
                        }
                        break label1289;
                     }

                     PlayerEntity var17;
                     if(var2 == 14) {
                        var17 = players[var3];
                        if(var17 != null) {
                           lastLeftClickX = var6;
                           lastLeftClickY = var7;
                           cursorState = 2;
                           field752 = 0;
                           destinationX = var0;
                           destinationY = var1;
                           var10 = class232.method4535(ClientProt.field2281, serverConnection.isaac);
                           var10.packetBuffer.method5123(class29.selectedItemIndex);
                           var10000 = var10.packetBuffer;
                           if(KeyFocusListener.keyPressed[82]) {
                              if(var8 == -1659892464) {
                                 return;
                              }

                              var10001 = 1;
                           } else {
                              var10001 = 0;
                           }

                           var10000.method5307(var10001);
                           var10.packetBuffer.method5131(class132.field3198);
                           var10.packetBuffer.writeShort(var3);
                           var10.packetBuffer.writeShort(Resampler.field1438);
                           serverConnection.method18(var10);
                        }
                        break label1289;
                     }

                     if(var2 == 15) {
                        var17 = players[var3];
                        if(var17 != null) {
                           if(var8 == -1659892464) {
                              return;
                           }

                           lastLeftClickX = var6;
                           lastLeftClickY = var7;
                           cursorState = 2;
                           field752 = 0;
                           destinationX = var0;
                           destinationY = var1;
                           var10 = class232.method4535(ClientProt.field2274, serverConnection.isaac);
                           var10.packetBuffer.method5132(class255.field2065);
                           var10.packetBuffer.method5307(KeyFocusListener.keyPressed[82]?1:0);
                           var10.packetBuffer.method5122(field853);
                           var10.packetBuffer.writeShort(var3);
                           serverConnection.method18(var10);
                        }
                        break label1289;
                     }

                     if(var2 == 16) {
                        lastLeftClickX = var6;
                        lastLeftClickY = var7;
                        cursorState = 2;
                        field752 = 0;
                        destinationX = var0;
                        destinationY = var1;
                        var9 = class232.method4535(ClientProt.field2270, serverConnection.isaac);
                        var9.packetBuffer.method5131(class132.field3198);
                        var9.packetBuffer.method5123(Resampler.field1438);
                        var9.packetBuffer.method5112(KeyFocusListener.keyPressed[82]?1:0);
                        var9.packetBuffer.method5121(class29.selectedItemIndex);
                        var9.packetBuffer.method5123(var3);
                        var9.packetBuffer.method5123(var0 + class53.baseX);
                        var9.packetBuffer.method5121(class312.baseY + var1);
                        serverConnection.method18(var9);
                        break label1289;
                     }

                     if(var2 == 17) {
                        if(var8 == -1659892464) {
                           return;
                        }

                        lastLeftClickX = var6;
                        lastLeftClickY = var7;
                        cursorState = 2;
                        field752 = 0;
                        destinationX = var0;
                        destinationY = var1;
                        var9 = class232.method4535(ClientProt.field2272, serverConnection.isaac);
                        var9.packetBuffer.method5131(class255.field2065);
                        var9.packetBuffer.writeShort(field853);
                        var9.packetBuffer.method5122(class312.baseY + var1);
                        var9.packetBuffer.method5122(var0 + class53.baseX);
                        var10000 = var9.packetBuffer;
                        if(KeyFocusListener.keyPressed[82]) {
                           if(var8 == -1659892464) {
                              return;
                           }

                           var10001 = 1;
                        } else {
                           var10001 = 0;
                        }

                        var10000.method5112(var10001);
                        var9.packetBuffer.method5121(var3);
                        serverConnection.method18(var9);
                        break label1289;
                     }

                     if(var2 == 18) {
                        lastLeftClickX = var6;
                        lastLeftClickY = var7;
                        cursorState = 2;
                        field752 = 0;
                        destinationX = var0;
                        destinationY = var1;
                        var9 = class232.method4535(ClientProt.field2224, serverConnection.isaac);
                        var9.packetBuffer.method5123(class312.baseY + var1);
                        var9.packetBuffer.method5121(var3);
                        var9.packetBuffer.method5121(var0 + class53.baseX);
                        var10000 = var9.packetBuffer;
                        if(KeyFocusListener.keyPressed[82]) {
                           if(var8 == -1659892464) {
                              return;
                           }

                           var10001 = 1;
                        } else {
                           var10001 = 0;
                        }

                        var10000.writeByte(var10001);
                        serverConnection.method18(var9);
                        break label1289;
                     }

                     if(var2 == 19) {
                        lastLeftClickX = var6;
                        lastLeftClickY = var7;
                        cursorState = 2;
                        field752 = 0;
                        destinationX = var0;
                        destinationY = var1;
                        var9 = class232.method4535(ClientProt.field2293, serverConnection.isaac);
                        var9.packetBuffer.method5123(var3);
                        var9.packetBuffer.method5122(var0 + class53.baseX);
                        var9.packetBuffer.writeShort(class312.baseY + var1);
                        var9.packetBuffer.writeByte(KeyFocusListener.keyPressed[82]?1:0);
                        serverConnection.method18(var9);
                     } else if(var2 == 20) {
                        if(var8 == -1659892464) {
                           return;
                        }

                        lastLeftClickX = var6;
                        lastLeftClickY = var7;
                        cursorState = 2;
                        field752 = 0;
                        destinationX = var0;
                        destinationY = var1;
                        var9 = class232.method4535(ClientProt.field2225, serverConnection.isaac);
                        var9.packetBuffer.method5121(class312.baseY + var1);
                        var10000 = var9.packetBuffer;
                        if(KeyFocusListener.keyPressed[82]) {
                           if(var8 == -1659892464) {
                              return;
                           }

                           var10001 = 1;
                        } else {
                           var10001 = 0;
                        }

                        var10000.method5307(var10001);
                        var9.packetBuffer.method5121(var0 + class53.baseX);
                        var9.packetBuffer.method5121(var3);
                        serverConnection.method18(var9);
                     } else {
                        if(var2 == 21) {
                           lastLeftClickX = var6;
                           lastLeftClickY = var7;
                           cursorState = 2;
                           field752 = 0;
                           destinationX = var0;
                           destinationY = var1;
                           var9 = class232.method4535(ClientProt.field2248, serverConnection.isaac);
                           var9.packetBuffer.method5122(class312.baseY + var1);
                           var9.packetBuffer.method5121(var3);
                           var9.packetBuffer.writeShort(var0 + class53.baseX);
                           var9.packetBuffer.method5307(KeyFocusListener.keyPressed[82]?1:0);
                           serverConnection.method18(var9);
                           break label1289;
                        }

                        if(var2 == 22) {
                           lastLeftClickX = var6;
                           lastLeftClickY = var7;
                           cursorState = 2;
                           field752 = 0;
                           destinationX = var0;
                           destinationY = var1;
                           var9 = class232.method4535(ClientProt.field2307, serverConnection.isaac);
                           var9.packetBuffer.writeByte(KeyFocusListener.keyPressed[82]?1:0);
                           var9.packetBuffer.method5123(var3);
                           var9.packetBuffer.method5122(class312.baseY + var1);
                           var9.packetBuffer.writeShort(var0 + class53.baseX);
                           serverConnection.method18(var9);
                           break label1289;
                        }

                        if(var2 == 23) {
                           if(isMenuOpen) {
                              class312.sceneManager.method3650();
                           } else {
                              class312.sceneManager.method3658(ServerProt.level, var0, var1, true);
                           }
                        } else {
                           TcpConnectionMessage var11;
                           ComponentType var16;
                           if(var2 == 24) {
                              var16 = ChatHistory.method6246(var1);
                              boolean var12 = true;
                              if(var16.clientcode > 0) {
                                 var12 = class285.method5884(var16);
                              }

                              if(var12) {
                                 var11 = class232.method4535(ClientProt.field2288, serverConnection.isaac);
                                 var11.packetBuffer.writeInt(var1);
                                 serverConnection.method18(var11);
                              }
                              break label1289;
                           }

                           if(var2 == 25) {
                              var16 = UnitPriceComparator.method2289(var1, var0);
                              if(var16 != null) {
                                 if(var8 == -1659892464) {
                                    return;
                                 }

                                 GameCanvas.method4866();
                                 class191.method3801(var1, var0, CacheFile.method5603(WorldComparator.method86(var16)), var16.linkObjType);
                                 itemSelectionState = 0;
                                 targetVerb = class125.method1854(var16);
                                 if(targetVerb == null) {
                                    targetVerb = "null";
                                 }

                                 if(var16.isIf3) {
                                    opBase = var16.opBase + class308.method6152(16777215);
                                 } else {
                                    opBase = class308.method6152(65280) + var16.spellName + class308.method6152(16777215);
                                 }
                              }

                              return;
                           }

                           if(var2 == 26) {
                              Bit.method2674();
                              break label1289;
                           }

                           int var13;
                           ComponentType var18;
                           if(var2 == 28) {
                              var9 = class232.method4535(ClientProt.field2288, serverConnection.isaac);
                              var9.packetBuffer.writeInt(var1);
                              serverConnection.method18(var9);
                              var18 = ChatHistory.method6246(var1);
                              if(var18.dynamicValues != null && var18.dynamicValues[0][0] == 5) {
                                 var13 = var18.dynamicValues[0][1];
                                 class313.clientVarps[var13] = 1 - class313.clientVarps[var13];
                                 settingsChanged(var13);
                                 TradingPost.method1614(var13);
                              }
                              break label1289;
                           }

                           if(var2 == 29) {
                              var9 = class232.method4535(ClientProt.field2288, serverConnection.isaac);
                              var9.packetBuffer.writeInt(var1);
                              serverConnection.method18(var9);
                              var18 = ChatHistory.method6246(var1);
                              if(var18.dynamicValues != null && var18.dynamicValues[0][0] == 5) {
                                 var13 = var18.dynamicValues[0][1];
                                 if(class313.clientVarps[var13] != var18.field2809[0]) {
                                    class313.clientVarps[var13] = var18.field2809[0];
                                    settingsChanged(var13);
                                    TradingPost.method1614(var13);
                                 }
                              }
                              break label1289;
                           }

                           if(var2 == 30) {
                              if(var8 == -1659892464) {
                                 return;
                              }

                              if(field793 == null) {
                                 class171.method2694(var1, var0);
                                 field793 = UnitPriceComparator.method2289(var1, var0);
                                 WorldMapRegion.method5554(field793);
                              }
                           } else {
                              if(var2 == 31) {
                                 if(var8 == -1659892464) {
                                    return;
                                 }

                                 var9 = class232.method4535(ClientProt.field2292, serverConnection.isaac);
                                 var9.packetBuffer.method5131(var1);
                                 var9.packetBuffer.method5132(class132.field3198);
                                 var9.packetBuffer.method5123(class29.selectedItemIndex);
                                 var9.packetBuffer.method5121(Resampler.field1438);
                                 var9.packetBuffer.method5121(var0);
                                 var9.packetBuffer.method5123(var3);
                                 serverConnection.method18(var9);
                                 mouseCrosshair = 0;
                                 class285.field1 = ChatHistory.method6246(var1);
                                 pressedItemIndex = var0;
                                 break label1289;
                              }

                              if(var2 == 32) {
                                 var9 = class232.method4535(ClientProt.field2221, serverConnection.isaac);
                                 var9.packetBuffer.method5131(class255.field2065);
                                 var9.packetBuffer.writeInt(var1);
                                 var9.packetBuffer.writeShort(var0);
                                 var9.packetBuffer.method5121(var3);
                                 var9.packetBuffer.method5121(field853);
                                 serverConnection.method18(var9);
                                 mouseCrosshair = 0;
                                 class285.field1 = ChatHistory.method6246(var1);
                                 pressedItemIndex = var0;
                                 break label1289;
                              }

                              if(var2 == 33) {
                                 var9 = class232.method4535(ClientProt.field2306, serverConnection.isaac);
                                 var9.packetBuffer.method5121(var3);
                                 var9.packetBuffer.method5131(var1);
                                 var9.packetBuffer.writeShort(var0);
                                 serverConnection.method18(var9);
                                 mouseCrosshair = 0;
                                 class285.field1 = ChatHistory.method6246(var1);
                                 pressedItemIndex = var0;
                                 break label1289;
                              }

                              if(var2 == 34) {
                                 var9 = class232.method4535(ClientProt.field2317, serverConnection.isaac);
                                 var9.packetBuffer.method5122(var3);
                                 var9.packetBuffer.method5132(var1);
                                 var9.packetBuffer.method5123(var0);
                                 serverConnection.method18(var9);
                                 mouseCrosshair = 0;
                                 class285.field1 = ChatHistory.method6246(var1);
                                 pressedItemIndex = var0;
                              } else if(var2 == 35) {
                                 if(var8 == -1659892464) {
                                    return;
                                 }

                                 var9 = class232.method4535(ClientProt.field2291, serverConnection.isaac);
                                 var9.packetBuffer.method5130(var1);
                                 var9.packetBuffer.method5123(var0);
                                 var9.packetBuffer.method5123(var3);
                                 serverConnection.method18(var9);
                                 mouseCrosshair = 0;
                                 class285.field1 = ChatHistory.method6246(var1);
                                 pressedItemIndex = var0;
                              } else if(var2 == 36) {
                                 var9 = class232.method4535(ClientProt.field2226, serverConnection.isaac);
                                 var9.packetBuffer.method5123(var3);
                                 var9.packetBuffer.writeInt(var1);
                                 var9.packetBuffer.method5123(var0);
                                 serverConnection.method18(var9);
                                 mouseCrosshair = 0;
                                 class285.field1 = ChatHistory.method6246(var1);
                                 pressedItemIndex = var0;
                              } else {
                                 if(var2 == 37) {
                                    var9 = class232.method4535(ClientProt.field2277, serverConnection.isaac);
                                    var9.packetBuffer.writeInt(var1);
                                    var9.packetBuffer.writeShort(var0);
                                    var9.packetBuffer.writeShort(var3);
                                    serverConnection.method18(var9);
                                    mouseCrosshair = 0;
                                    class285.field1 = ChatHistory.method6246(var1);
                                    pressedItemIndex = var0;
                                    break label1289;
                                 }

                                 if(var2 == 38) {
                                    if(var8 == -1659892464) {
                                       return;
                                    }

                                    GameCanvas.method4866();
                                    var16 = ChatHistory.method6246(var1);
                                    itemSelectionState = 1;
                                    class29.selectedItemIndex = var0;
                                    class132.field3198 = var1;
                                    Resampler.field1438 = var3;
                                    WorldMapRegion.method5554(var16);
                                    lastSelectedItemName = class308.method6152(16748608) + class79.method1074(var3).name + class308.method6152(16777215);
                                    if(lastSelectedItemName == null) {
                                       if(var8 == -1659892464) {
                                          return;
                                       }

                                       lastSelectedItemName = "null";
                                    }

                                    return;
                                 }

                                 if(var2 == 39) {
                                    var9 = class232.method4535(ClientProt.field2282, serverConnection.isaac);
                                    var9.packetBuffer.method5123(var3);
                                    var9.packetBuffer.method5132(var1);
                                    var9.packetBuffer.method5121(var0);
                                    serverConnection.method18(var9);
                                    mouseCrosshair = 0;
                                    class285.field1 = ChatHistory.method6246(var1);
                                    pressedItemIndex = var0;
                                 } else if(var2 == 40) {
                                    var9 = class232.method4535(ClientProt.field2245, serverConnection.isaac);
                                    var9.packetBuffer.method5132(var1);
                                    var9.packetBuffer.method5121(var0);
                                    var9.packetBuffer.method5122(var3);
                                    serverConnection.method18(var9);
                                    mouseCrosshair = 0;
                                    class285.field1 = ChatHistory.method6246(var1);
                                    pressedItemIndex = var0;
                                 } else {
                                    if(var2 == 41) {
                                       if(var8 == -1659892464) {
                                          return;
                                       }

                                       var9 = class232.method4535(ClientProt.field2284, serverConnection.isaac);
                                       var9.packetBuffer.method5130(var1);
                                       var9.packetBuffer.method5122(var0);
                                       var9.packetBuffer.writeShort(var3);
                                       serverConnection.method18(var9);
                                       mouseCrosshair = 0;
                                       class285.field1 = ChatHistory.method6246(var1);
                                       pressedItemIndex = var0;
                                       break label1289;
                                    }

                                    if(var2 == 42) {
                                       var9 = class232.method4535(ClientProt.field2269, serverConnection.isaac);
                                       var9.packetBuffer.writeInt(var1);
                                       var9.packetBuffer.method5122(var0);
                                       var9.packetBuffer.writeShort(var3);
                                       serverConnection.method18(var9);
                                       mouseCrosshair = 0;
                                       class285.field1 = ChatHistory.method6246(var1);
                                       pressedItemIndex = var0;
                                       break label1289;
                                    }

                                    if(var2 == 43) {
                                       var9 = class232.method4535(ClientProt.field2264, serverConnection.isaac);
                                       var9.packetBuffer.writeShort(var3);
                                       var9.packetBuffer.method5131(var1);
                                       var9.packetBuffer.writeShort(var0);
                                       serverConnection.method18(var9);
                                       mouseCrosshair = 0;
                                       class285.field1 = ChatHistory.method6246(var1);
                                       pressedItemIndex = var0;
                                       break label1289;
                                    }

                                    if(var2 == 44) {
                                       var17 = players[var3];
                                       if(var17 != null) {
                                          lastLeftClickX = var6;
                                          lastLeftClickY = var7;
                                          cursorState = 2;
                                          field752 = 0;
                                          destinationX = var0;
                                          destinationY = var1;
                                          var10 = class232.method4535(ClientProt.field2266, serverConnection.isaac);
                                          var10.packetBuffer.writeShort(var3);
                                          var10.packetBuffer.method5232(KeyFocusListener.keyPressed[82]?1:0);
                                          serverConnection.method18(var10);
                                       }
                                       break label1289;
                                    }

                                    if(var2 == 45) {
                                       var17 = players[var3];
                                       if(var17 != null) {
                                          lastLeftClickX = var6;
                                          lastLeftClickY = var7;
                                          cursorState = 2;
                                          field752 = 0;
                                          destinationX = var0;
                                          destinationY = var1;
                                          var10 = class232.method4535(ClientProt.field2275, serverConnection.isaac);
                                          var10000 = var10.packetBuffer;
                                          if(KeyFocusListener.keyPressed[82]) {
                                             if(var8 == -1659892464) {
                                                return;
                                             }

                                             var10001 = 1;
                                          } else {
                                             var10001 = 0;
                                          }

                                          var10000.method5112(var10001);
                                          var10.packetBuffer.method5122(var3);
                                          serverConnection.method18(var10);
                                       }
                                    } else {
                                       if(var2 == 46) {
                                          var17 = players[var3];
                                          if(var17 != null) {
                                             lastLeftClickX = var6;
                                             lastLeftClickY = var7;
                                             cursorState = 2;
                                             field752 = 0;
                                             destinationX = var0;
                                             destinationY = var1;
                                             var10 = class232.method4535(ClientProt.field2319, serverConnection.isaac);
                                             var10.packetBuffer.method5122(var3);
                                             var10000 = var10.packetBuffer;
                                             if(KeyFocusListener.keyPressed[82]) {
                                                if(var8 == -1659892464) {
                                                   return;
                                                }

                                                var10001 = 1;
                                             } else {
                                                var10001 = 0;
                                             }

                                             var10000.writeByte(var10001);
                                             serverConnection.method18(var10);
                                          }
                                          break label1289;
                                       }

                                       if(var2 == 47) {
                                          var17 = players[var3];
                                          if(var17 != null) {
                                             lastLeftClickX = var6;
                                             lastLeftClickY = var7;
                                             cursorState = 2;
                                             field752 = 0;
                                             destinationX = var0;
                                             destinationY = var1;
                                             var10 = class232.method4535(ClientProt.field2237, serverConnection.isaac);
                                             var10.packetBuffer.method5123(var3);
                                             var10.packetBuffer.method5232(KeyFocusListener.keyPressed[82]?1:0);
                                             serverConnection.method18(var10);
                                          }
                                       } else {
                                          if(var2 == 48) {
                                             var17 = players[var3];
                                             if(var17 != null) {
                                                lastLeftClickX = var6;
                                                lastLeftClickY = var7;
                                                cursorState = 2;
                                                field752 = 0;
                                                destinationX = var0;
                                                destinationY = var1;
                                                var10 = class232.method4535(ClientProt.field2289, serverConnection.isaac);
                                                var10.packetBuffer.method5112(KeyFocusListener.keyPressed[82]?1:0);
                                                var10.packetBuffer.method5122(var3);
                                                serverConnection.method18(var10);
                                             }
                                             break label1289;
                                          }

                                          if(var2 == 49) {
                                             var17 = players[var3];
                                             if(var17 != null) {
                                                lastLeftClickX = var6;
                                                lastLeftClickY = var7;
                                                cursorState = 2;
                                                field752 = 0;
                                                destinationX = var0;
                                                destinationY = var1;
                                                var10 = class232.method4535(ClientProt.field2258, serverConnection.isaac);
                                                var10.packetBuffer.method5122(var3);
                                                var10.packetBuffer.method5307(KeyFocusListener.keyPressed[82]?1:0);
                                                serverConnection.method18(var10);
                                             }
                                             break label1289;
                                          }

                                          if(var2 == 50) {
                                             if(var8 == -1659892464) {
                                                return;
                                             }

                                             var17 = players[var3];
                                             if(var17 != null) {
                                                lastLeftClickX = var6;
                                                lastLeftClickY = var7;
                                                cursorState = 2;
                                                field752 = 0;
                                                destinationX = var0;
                                                destinationY = var1;
                                                var10 = class232.method4535(ClientProt.field2294, serverConnection.isaac);
                                                var10.packetBuffer.method5307(KeyFocusListener.keyPressed[82]?1:0);
                                                var10.packetBuffer.method5121(var3);
                                                serverConnection.method18(var10);
                                             }
                                          } else if(var2 == 51) {
                                             var17 = players[var3];
                                             if(var17 != null) {
                                                if(var8 == -1659892464) {
                                                   return;
                                                }

                                                lastLeftClickX = var6;
                                                lastLeftClickY = var7;
                                                cursorState = 2;
                                                field752 = 0;
                                                destinationX = var0;
                                                destinationY = var1;
                                                var10 = class232.method4535(ClientProt.field2239, serverConnection.isaac);
                                                var10.packetBuffer.method5232(KeyFocusListener.keyPressed[82]?1:0);
                                                var10.packetBuffer.method5123(var3);
                                                serverConnection.method18(var10);
                                             }
                                          } else {
                                             label1274: {
                                                if(var2 != 57) {
                                                   if(var2 == 58) {
                                                      var16 = UnitPriceComparator.method2289(var1, var0);
                                                      if(var16 != null) {
                                                         if(var8 == -1659892464) {
                                                            return;
                                                         }

                                                         var10 = class232.method4535(ClientProt.field2301, serverConnection.isaac);
                                                         var10.packetBuffer.method5121(field853);
                                                         var10.packetBuffer.method5132(var1);
                                                         var10.packetBuffer.method5121(field673);
                                                         var10.packetBuffer.method5123(var0);
                                                         var10.packetBuffer.writeInt(class255.field2065);
                                                         var10.packetBuffer.method5123(var16.linkObjType);
                                                         serverConnection.method18(var10);
                                                      }
                                                      break label1289;
                                                   }

                                                   if(var2 == 1001) {
                                                      lastLeftClickX = var6;
                                                      lastLeftClickY = var7;
                                                      cursorState = 2;
                                                      field752 = 0;
                                                      destinationX = var0;
                                                      destinationY = var1;
                                                      var9 = class232.method4535(ClientProt.field2287, serverConnection.isaac);
                                                      var9.packetBuffer.writeShort(var3);
                                                      var9.packetBuffer.method5112(KeyFocusListener.keyPressed[82]?1:0);
                                                      var9.packetBuffer.method5122(var0 + class53.baseX);
                                                      var9.packetBuffer.method5123(class312.baseY + var1);
                                                      serverConnection.method18(var9);
                                                      break label1289;
                                                   }

                                                   if(var2 == 1002) {
                                                      if(var8 == -1659892464) {
                                                         return;
                                                      }

                                                      lastLeftClickX = var6;
                                                      lastLeftClickY = var7;
                                                      cursorState = 2;
                                                      field752 = 0;
                                                      var9 = class232.method4535(ClientProt.field2255, serverConnection.isaac);
                                                      var9.packetBuffer.method5122(var3);
                                                      serverConnection.method18(var9);
                                                      break label1274;
                                                   }

                                                   if(var2 == 1003) {
                                                      lastLeftClickX = var6;
                                                      lastLeftClickY = var7;
                                                      cursorState = 2;
                                                      field752 = 0;
                                                      var14 = npcs[var3];
                                                      if(var14 != null) {
                                                         NPCType var15 = var14.type;
                                                         if(var15.multiNpcs != null) {
                                                            var15 = var15.method4782();
                                                         }

                                                         if(var15 != null) {
                                                            if(var8 == -1659892464) {
                                                               return;
                                                            }

                                                            var11 = class232.method4535(ClientProt.field2249, serverConnection.isaac);
                                                            var11.packetBuffer.method5122(var15.id);
                                                            serverConnection.method18(var11);
                                                         }
                                                      }
                                                      break label1289;
                                                   }

                                                   if(var2 == 1004) {
                                                      lastLeftClickX = var6;
                                                      lastLeftClickY = var7;
                                                      cursorState = 2;
                                                      field752 = 0;
                                                      var9 = class232.method4535(ClientProt.field2243, serverConnection.isaac);
                                                      var9.packetBuffer.method5121(var3);
                                                      serverConnection.method18(var9);
                                                      break label1289;
                                                   }

                                                   if(var2 == 1005) {
                                                      label1068: {
                                                         var16 = ChatHistory.method6246(var1);
                                                         if(var16 != null) {
                                                            if(var8 == -1659892464) {
                                                               return;
                                                            }

                                                            if(var16.objCounts[var0] >= 100000) {
                                                               KeyFocusListener.method5934(27, "", var16.objCounts[var0] + " x " + class79.method1074(var3).name);
                                                               break label1068;
                                                            }
                                                         }

                                                         var10 = class232.method4535(ClientProt.field2243, serverConnection.isaac);
                                                         var10.packetBuffer.method5121(var3);
                                                         serverConnection.method18(var10);
                                                      }

                                                      mouseCrosshair = 0;
                                                      class285.field1 = ChatHistory.method6246(var1);
                                                      pressedItemIndex = var0;
                                                      break label1289;
                                                   }

                                                   if(var2 != 1007) {
                                                      if(var2 == 1008 || var2 == 1009 || var2 == 1011 || var2 == 1010 || var2 == 1012) {
                                                         class69.worldMap.method2919(var2, var3, new CoordGrid(var0), new CoordGrid(var1));
                                                         break label1289;
                                                      }
                                                      break label1274;
                                                   }
                                                }

                                                var16 = UnitPriceComparator.method2289(var1, var0);
                                                if(var16 != null) {
                                                   Nameable.method2776(var3, var1, var0, var16.linkObjType, var5);
                                                }
                                             }
                                          }
                                       }
                                    }
                                 }
                              }
                           }
                        }
                     }
                  }

                  if(var8 == -1659892464) {
                     return;
                  }
               }
            }
         }
      }

      if(itemSelectionState != 0) {
         itemSelectionState = 0;
         WorldMapRegion.method5554(ChatHistory.method6246(class132.field3198));
      }

      if(spellSelected) {
         GameCanvas.method4866();
      }

      if(class285.field1 != null && mouseCrosshair == 0) {
         if(var8 == -1659892464) {
            return;
         }

         WorldMapRegion.method5554(class285.field1);
      }

   }

   public static void onAddChatMessage(int var0, String var1, String var2, String var3) {
      Logger var4 = ItemContainer.clientInstance.getLogger();
      if(var4.isDebugEnabled()) {
         var4.debug("Chat message type {}: {}", ChatMessageType.of(var0), var2);
      }

      Map var5 = ItemContainer.clientInstance.getChatLineMap();
      RSChatLineBuffer var6 = (RSChatLineBuffer)var5.get(Integer.valueOf(var0));
      MessageNode var7 = var6.getLines()[0];
      ChatMessageType var8 = ChatMessageType.of(var0);
      ChatMessage var9 = new ChatMessage(var7, var8, var1, var2, var3, var7.getTimestamp());
      ItemContainer.clientInstance.getCallbacks().post(var9);
   }

   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1"
   )
   public static void onMenuOptionsChanged(int var0) {
      int var1 = oldMenuEntryCount;
      int var2 = ItemContainer.clientInstance.getMenuOptionCount();
      oldMenuEntryCount = var2;
      if(var2 == var1 + 1) {
         MenuEntryAdded var3 = new MenuEntryAdded(ItemContainer.clientInstance._protect$getMenuOptions()[var2 - 1], ItemContainer.clientInstance._protect$getMenuTargets()[var2 - 1], ItemContainer.clientInstance._protect$getMenuTypes()[var2 - 1], ItemContainer.clientInstance._protect$getMenuIdentifiers()[var2 - 1], ItemContainer.clientInstance._protect$getMenuActionParams0()[var2 - 1], ItemContainer.clientInstance._protect$getMenuActionParams1()[var2 - 1]);
         ItemContainer.clientInstance.getCallbacks().post(var3);
      }

   }

   public static void copy$raster2d7(int var0, int var1, int var2, int var3, int var4, int var5, byte[] var6, int var7, boolean var8) {
      if(var0 + var2 >= 0 && var3 + var1 >= 0) {
         if(var0 < Rasterizer2D.graphicsPixelsWidth && var1 < Rasterizer2D.graphicsPixelsHeight) {
            int var9 = 0;
            int var10 = 0;
            if(var0 < 0) {
               var9 -= var0;
               var2 += var0;
            }

            if(var1 < 0) {
               var10 -= var1;
               var3 += var1;
            }

            if(var0 + var2 > Rasterizer2D.graphicsPixelsWidth) {
               var2 = Rasterizer2D.graphicsPixelsWidth - var0;
            }

            if(var3 + var1 > Rasterizer2D.graphicsPixelsHeight) {
               var3 = Rasterizer2D.graphicsPixelsHeight - var1;
            }

            int var11 = var6.length / var7;
            int var12 = Rasterizer2D.graphicsPixelsWidth - var2;
            int var13 = var4 >>> 24;
            int var14 = var5 >>> 24;
            int var15;
            int var16;
            int var17;
            int var18;
            int var19;
            if(!var8 || var13 == 255 && var14 == 255) {
               var15 = var0 + var9 + (var10 + var1) * Rasterizer2D.graphicsPixelsWidth;

               for(var16 = var10 + var1; var16 < var3 + var10 + var1; ++var16) {
                  for(var17 = var0 + var9; var17 < var0 + var9 + var2; ++var17) {
                     var18 = (var16 - var1) % var11;
                     var19 = (var17 - var0) % var7;
                     if(var6[var19 + var18 * var7] != 0) {
                        Rasterizer2D.graphicsPixels[var15++] = var5;
                     } else {
                        Rasterizer2D.graphicsPixels[var15++] = var4;
                     }
                  }

                  var15 += var12;
               }
            } else {
               var15 = var0 + var9 + (var10 + var1) * Rasterizer2D.graphicsPixelsWidth;

               for(var16 = var10 + var1; var16 < var3 + var10 + var1; ++var16) {
                  for(var17 = var0 + var9; var17 < var0 + var9 + var2; ++var17) {
                     var18 = (var16 - var1) % var11;
                     var19 = (var17 - var0) % var7;
                     int var20 = var4;
                     if(var6[var19 + var18 * var7] != 0) {
                        var20 = var5;
                     }

                     int var21 = var20 >>> 24;
                     int var22 = 255 - var21;
                     int var23 = Rasterizer2D.graphicsPixels[var15];
                     int var24 = (var21 * (var20 & 65280) + var22 * (var23 & 65280) & 16711680) + ((var20 & 16711935) * var21 + (var23 & 16711935) * var22 & -16711936) >> 8;
                     Rasterizer2D.graphicsPixels[var15++] = var24;
                  }

                  var15 += var12;
               }
            }

         }
      }
   }

   public static int rl$rot1(int var0, int var1, int var2, int var3) {
      return var0 * var2 + var3 * var1 >> 16;
   }

   public static int rl$rot2(int var0, int var1, int var2, int var3) {
      return var2 * var1 - var3 * var0 >> 16;
   }

   public static void renderWidgetLayer(Widget[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      Callbacks var9 = ItemContainer.clientInstance.getCallbacks();
      RSHashTable var10 = ItemContainer.clientInstance.getComponentTable();
      Widget[] var11 = var0;
      int var12 = var0.length;

      for(int var13 = 0; var13 < var12; ++var13) {
         Widget var14 = var11[var13];
         RSWidget var15 = (RSWidget)var14;
         if(var15 != null && var15.getRSParentId() == var1 && !var15.isSelfHidden()) {
            if(var1 != -1) {
               var15.setRenderParentId(var1);
            }

            int var16 = var6 + var15.getRelativeX();
            int var17 = var7 + var15.getRelativeY();
            var15.setRenderX(var16);
            var15.setRenderY(var17);
            int var18 = var15.getType();
            if(var18 == 5 && var15.getItemId() != -1) {
               if(var16 >= var2 && var16 <= var4 && var17 >= var3 && var17 <= var5) {
                  WidgetItem var29 = new WidgetItem(var15.getItemId(), var15.getItemQuantity(), -1, var15.getBounds(), var15);
                  var9.drawItem(var15.getItemId(), var29);
               }
            } else if(var18 == 2) {
               Collection var19 = var15.getWidgetItems();
               Iterator var27 = var19.iterator();

               while(var27.hasNext()) {
                  WidgetItem var28 = (WidgetItem)var27.next();
                  var9.drawItem(var28.getId(), var28);
               }
            }

            WidgetNode var30 = (WidgetNode)var10.get((long)var15.getId());
            if(var30 != null) {
               int var20 = var15.getId();
               int var21 = var30.getId();
               RSWidget[] var22 = ItemContainer.clientInstance.getWidgets()[var21];
               RSWidget[] var23 = var22;
               int var24 = var22.length;

               for(int var25 = 0; var25 < var24; ++var25) {
                  RSWidget var26 = var23[var25];
                  if(var26.getRSParentId() == -1) {
                     var26.setRenderParentId(var20);
                  }
               }
            }
         }
      }

   }

   public static void drawAlpha(int[] var0, int var1, int var2, int var3) {
      if(ItemContainer.clientInstance.isGpu() && var0 == ItemContainer.clientInstance.getBufferProvider().getPixels()) {
         int var4 = var3 + ((var0[var1] >>> 24) * (255 - var3) * 32897 >>> 23);
         var0[var1] = var2 & 16777215 | var4 << 24;
      } else {
         var0[var1] = var2;
      }
   }

   public static int rl$rot3(int var0, int var1, int var2, int var3) {
      return var0 * var2 - var3 * var1 >> 16;
   }

   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1"
   )
   public static void itemPressedDurationChanged(int var0) {
      if(ItemContainer.clientInstance.getItemPressedDuration() > 0) {
         ++itemPressedDurationBuffer;
         if(itemPressedDurationBuffer >= inventoryDragDelay) {
            ItemContainer.clientInstance.setItemPressedDuration(itemPressedDurationBuffer);
         } else {
            ItemContainer.clientInstance.setItemPressedDuration(0);
         }
      } else {
         itemPressedDurationBuffer = 0;
      }

   }

   public static int rl$rot4(int var0, int var1, int var2, int var3) {
      return var2 * var1 + var3 * var0 >> 16;
   }

   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1"
   )
   public static void resizeChanged(int var0) {
      boolean var1 = ItemContainer.clientInstance.isResized();
      if(var1 != oldIsResized) {
         ResizeableChanged var2 = new ResizeableChanged();
         var2.setResized(var1);
         ItemContainer.clientInstance.getCallbacks().post(var2);
         oldIsResized = var1;
      }

   }

   public static boolean vmExecuteOpcode(int var0) {
      if(var0 == 6599) {
         if(!$assertionsDisabled && currentScript.getInstructions()[currentScriptPC] != 6599) {
            throw new AssertionError();
         } else {
            int var1 = ItemContainer.clientInstance.getStringStackSize();
            String[] var10000 = ItemContainer.clientInstance.getStringStack();
            --var1;
            String var2 = var10000[var1];
            ItemContainer.clientInstance.setStringStackSize(var1);
            if("debug".equals(var2)) {
               int var3 = ItemContainer.clientInstance.getIntStackSize();
               var10000 = ItemContainer.clientInstance.getStringStack();
               --var1;
               String var4 = var10000[var1];
               StringBuffer var5 = new StringBuffer();
               Matcher var6 = Pattern.compile("%(.)").matcher(var4);

               while(var6.find()) {
                  var6.appendReplacement(var5, "");
                  switch(var6.group(1).charAt(0)) {
                  case 'd':
                  case 'i':
                     int[] var8 = ItemContainer.clientInstance.getIntStack();
                     --var3;
                     var5.append(var8[var3]);
                     break;
                  case 's':
                     String[] var10001 = ItemContainer.clientInstance.getStringStack();
                     --var1;
                     var5.append(var10001[var1]);
                     break;
                  default:
                     var5.append(var6.group(0)).append("=unknown");
                  }
               }

               var6.appendTail(var5);
               ItemContainer.clientInstance.getLogger().debug(var5.toString());
               ItemContainer.clientInstance.setStringStackSize(var1);
               ItemContainer.clientInstance.setIntStackSize(var3);
               return true;
            } else {
               ScriptCallbackEvent var7 = new ScriptCallbackEvent();
               var7.setScript(currentScript);
               var7.setEventName(var2);
               ItemContainer.clientInstance.getCallbacks().post(var7);
               return true;
            }
         }
      } else {
         return false;
      }
   }

   public static void updateNpcs(boolean var0, PacketBuffer var1) {
      ItemContainer.clientInstance.getCallbacks().updateNpcs();
   }

   public static void settingsChanged(int var0) {
      VarbitChanged var1 = new VarbitChanged();
      var1.setIndex(var0);
      ItemContainer.clientInstance.getCallbacks().post(var1);
   }

   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1"
   )
   public static void draggingWidgetChanged(int var0) {
      DraggingWidgetChanged var1 = new DraggingWidgetChanged();
      var1.setDraggingWidget(ItemContainer.clientInstance.isDraggingWidget());
      ItemContainer.clientInstance.getCallbacks().post(var1);
   }

   public static void cachedNPCsChanged(int var0) {
      RSNPC[] var1 = ItemContainer.clientInstance.getCachedNPCs();
      if(var0 >= 0 && var0 < var1.length) {
         RSNPC var2 = var1[var0];
         if(var2 != null) {
            var2.setIndex(var0);
            ItemContainer.clientInstance.getCallbacks().postDeferred(new NpcSpawned(var2));
         }

      }
   }

   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1"
   )
   public static void onCameraPitchTargetChanged(int var0) {
      int var1 = ItemContainer.clientInstance.getCameraPitchTarget();
      int var2 = var1;
      if(pitchRelaxEnabled && lastPitchTarget > 383 && var1 == 383) {
         var2 = lastPitchTarget;
         if(var2 > 512) {
            var2 = 512;
         }

         ItemContainer.clientInstance.setCameraPitchTarget(var2);
      }

      lastPitchTarget = var2;
   }

   public static void copy$runWidgetOnLoadListener(int var0, int var1) {
      if(var0 != -1) {
         if(ChatLine.method5915(var0)) {
            ComponentType[] var2 = ComponentType.interfaces[var0];

            for(int var3 = 0; var3 < var2.length; ++var3) {
               if(var1 >= -264070301) {
                  return;
               }

               ComponentType var4 = var2[var3];
               if(var4.onLoadListener != null) {
                  ScriptEvent var5 = new ScriptEvent();
                  var5.source = var4;
                  var5.params = var4.onLoadListener;
                  class258.method4859(var5, 5000000, -1402776369);
               }
            }

         }
      }
   }

   public static void cachedPlayersChanged(int var0) {
      RSPlayer[] var1 = ItemContainer.clientInstance.getCachedPlayers();
      if(var0 >= 0 && var0 < var1.length) {
         RSPlayer var2 = var1[var0];
         RSPlayer var3 = oldPlayers[var0];
         oldPlayers[var0] = var2;
         if(var3 != null) {
            ItemContainer.clientInstance.getCallbacks().post(new PlayerDespawned(var3));
         }

         if(var2 != null) {
            ItemContainer.clientInstance.getCallbacks().postDeferred(new PlayerSpawned(var2));
         }

      }
   }

   public static void copy$drawGradientAlpha(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      if(var2 > 0 && var3 > 0) {
         int var8 = 0;
         int var9 = 65536 / var3;
         if(var0 < Rasterizer2D.draw_region_x) {
            var2 -= Rasterizer2D.draw_region_x - var0;
            var0 = Rasterizer2D.draw_region_x;
         }

         if(var1 < Rasterizer2D.drawingAreaTop) {
            var8 += (Rasterizer2D.drawingAreaTop - var1) * var9;
            var3 -= Rasterizer2D.drawingAreaTop - var1;
            var1 = Rasterizer2D.drawingAreaTop;
         }

         if(var0 + var2 > Rasterizer2D.drawingAreaBottom) {
            var2 = Rasterizer2D.drawingAreaBottom - var0;
         }

         if(var3 + var1 > Rasterizer2D.drawingAreaRight) {
            var3 = Rasterizer2D.drawingAreaRight - var1;
         }

         int var10 = Rasterizer2D.graphicsPixelsWidth - var2;
         int var11 = Rasterizer2D.graphicsPixelsWidth * var1 + var0;

         for(int var12 = -var3; var12 < 0; ++var12) {
            int var13 = 65536 - var8 >> 8;
            int var14 = var8 >> 8;
            int var15 = (var13 * var6 + var14 * var7 & 65280) >>> 8;
            if(var15 == 0) {
               var11 += Rasterizer2D.graphicsPixelsWidth;
               var8 += var9;
            } else {
               int var16 = (var13 * (var4 & 65280) + var14 * (var5 & 65280) & 16711680) + (var13 * (var4 & 16711935) + var14 * (var5 & 16711935) & -16711936) >>> 8;
               int var17 = 255 - var15;
               int var18 = ((var16 & 16711935) * var15 >> 8 & 16711935) + (var15 * (var16 & 65280) >> 8 & 65280);

               for(int var19 = -var2; var19 < 0; ++var19) {
                  int var20 = Rasterizer2D.graphicsPixels[var11];
                  if(var20 == 0) {
                     Rasterizer2D.graphicsPixels[var11++] = var18;
                  } else {
                     var20 = ((var20 & 16711935) * var17 >> 8 & 16711935) + (var17 * (var20 & 65280) >> 8 & 65280);
                     Rasterizer2D.graphicsPixels[var11++] = var18 + var20;
                  }
               }

               var11 += var10;
               var8 += var9;
            }
         }

      }
   }

   public static void playerOptionsChanged(int var0) {
      MenuAction[] var1 = new MenuAction[]{MenuAction.PLAYER_FIRST_OPTION, MenuAction.PLAYER_SECOND_OPTION, MenuAction.PLAYER_THIRD_OPTION, MenuAction.PLAYER_FOURTH_OPTION, MenuAction.PLAYER_FIFTH_OPTION, MenuAction.PLAYER_SIXTH_OPTION, MenuAction.PLAYER_SEVENTH_OPTION, MenuAction.PLAYER_EIGTH_OPTION};
      if(var0 >= 0 && var0 < var1.length) {
         MenuAction var2 = var1[var0];
         ItemContainer.clientInstance.getPlayerMenuTypes()[var0] = var2.getId();
      }

      PlayerMenuOptionsChanged var3 = new PlayerMenuOptionsChanged();
      var3.setIndex(var0);
      ItemContainer.clientInstance.getCallbacks().post(var3);
   }

   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1"
   )
   public static void onUsernameChanged(int var0) {
      ItemContainer.clientInstance.getCallbacks().post(new UsernameChanged());
   }

   public static void experiencedChanged(int var0) {
      ExperienceChanged var1 = new ExperienceChanged();
      Skill[] var2 = Skill.values();
      if(var0 < var2.length - 1) {
         Skill var3 = var2[var0];
         var1.setSkill(var3);
         ItemContainer.clientInstance.getCallbacks().post(var1);
      }

   }

   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1"
   )
   public static void onCycleCntrChanged(int var0) {
      ItemContainer.clientInstance.getCallbacks().post(new ClientTick());
   }

   public static void boostedSkillLevelsChanged(int var0) {
      Skill[] var1 = Skill.values();
      if(var0 >= 0 && var0 < var1.length - 1) {
         Skill var2 = var1[var0];
         BoostedLevelChanged var3 = new BoostedLevelChanged();
         var3.setSkill(var2);
         ItemContainer.clientInstance.getCallbacks().post(var3);
      }

   }

   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1"
   )
   public static void clanMemberManagerChanged(int var0) {
      ItemContainer.clientInstance.getCallbacks().post(new ClanChanged(ItemContainer.clientInstance.getClanMemberManager() != null));
   }

   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1"
   )
   public static void onCameraPitchChanged(int var0) {
      int var1 = ItemContainer.clientInstance.getCameraPitch();
      int var2 = var1;
      if(pitchRelaxEnabled && lastPitch > 383 && var1 == 383) {
         var2 = lastPitch;
         if(var2 > 512) {
            var2 = 512;
         }

         ItemContainer.clientInstance.setCameraPitch(var2);
      }

      lastPitch = var2;
   }

   public static void onGrandExchangeOffersChanged(int var0) {
      if(var0 != -1) {
         RSGrandExchangeOffer var1 = ItemContainer.clientInstance.getGrandExchangeOffers()[var0];
         if(var1 != null) {
            GrandExchangeOfferChanged var2 = new GrandExchangeOfferChanged();
            var2.setOffer(var1);
            var2.setSlot(var0);
            ItemContainer.clientInstance.getCallbacks().post(var2);
         }
      }
   }

   private static void rl$$clinit() {
      pitchRelaxEnabled = false;
      lastPitch = 128;
      lastPitchTarget = 128;
   }

   private static void rl$$clinit1() {
      rl$modelViewportXs = new int[4700];
      rl$modelViewportYs = new int[4700];
   }

   private static void rl$$clinit2() {
      $assertionsDisabled = !client.class.desiredAssertionStatus();
      oldPlayers = new PlayerEntity[2048];
   }

   private static void rl$$clinit3() {
      $assertionsDisabled = !client.class.desiredAssertionStatus();
   }

   private static void rl$$clinit4() {
      spriteOverrides = new HashMap();
      widgetSpriteOverrides = new HashMap();
   }

   private static void rl$$clinit5() {
      $assertionsDisabled = !client.class.desiredAssertionStatus();
   }

   static void aag() {
      if(camModeType == 1) {
         field845 = true;
      }

   }

   static void aaf() {
      if(field845 && class71.localPlayer != null) {
         int var0 = class71.localPlayer.pathX[0];
         int var1 = class71.localPlayer.pathY[0];
         if(var0 < 0 || var1 < 0 || var0 >= 104 || var1 >= 104) {
            return;
         }

         field725 = class71.localPlayer.x * -1234429701;
         int var2 = TcpConnectionMessage.method5618(class71.localPlayer.x * -1234429701, class71.localPlayer.y, ServerProt.level) - field724;
         if(var2 < class252.field2538) {
            class252.field2538 = var2;
         }

         class69.field135 = class71.localPlayer.y;
         field845 = false;
      }

   }

   static void aat() {
      if(camModeType == 1) {
         field845 = true;
      }

   }

   static void aar() {
      if(camModeType == 1) {
         field845 = true;
      }

   }

   static void aap() {
      if(field845 && class71.localPlayer != null) {
         int var0 = class71.localPlayer.pathX[0];
         int var1 = class71.localPlayer.pathY[0];
         if(var0 < 0 || var1 < 0 || var0 >= 104 || var1 >= 104) {
            return;
         }

         field725 = class71.localPlayer.x * -1234429701;
         int var2 = TcpConnectionMessage.method5618(class71.localPlayer.x * -1234429701, class71.localPlayer.y, ServerProt.level) - field724;
         if(var2 < class252.field2538) {
            class252.field2538 = var2;
         }

         class69.field135 = class71.localPlayer.y;
         field845 = false;
      }

   }

   static void aah() {
      if(field845 && class71.localPlayer != null) {
         int var0 = class71.localPlayer.pathX[0];
         int var1 = class71.localPlayer.pathY[0];
         if(var0 < 0 || var1 < 0 || var0 >= 104 || var1 >= 104) {
            return;
         }

         field725 = class71.localPlayer.x * -1234429701;
         int var2 = TcpConnectionMessage.method5618(class71.localPlayer.x * -1234429701, class71.localPlayer.y, ServerProt.level) - field724;
         if(var2 < class252.field2538) {
            class252.field2538 = var2;
         }

         class69.field135 = class71.localPlayer.y;
         field845 = false;
      }

   }

   static void aai() {
      if(WorldMapType1.field216 != null) {
         field797 = gameCycle * 1081757137;
         WorldMapType1.field216.method98();

         for(int var0 = 0; var0 < players.length; ++var0) {
            if(players[var0] != null) {
               WorldMapType1.field216.method91((players[var0].x * -1234429701 >> 7) + class53.baseX, (players[var0].y >> 7) + class312.baseY * -522465876);
            }
         }
      }

   }

   static void aaw() {
      if(WorldMapType1.field216 != null) {
         field797 = gameCycle * 1640021784;
         WorldMapType1.field216.method98();

         for(int var0 = 0; var0 < players.length; ++var0) {
            if(players[var0] != null) {
               WorldMapType1.field216.method91(class53.baseX * -256936659 + (players[var0].x * 909745681 >> 7), (players[var0].y >> 7) + class312.baseY);
            }
         }
      }

   }

   static void aad() {
      if(WorldMapType1.field216 != null) {
         field797 = gameCycle;
         WorldMapType1.field216.method98();

         for(int var0 = 0; var0 < players.length; ++var0) {
            if(players[var0] != null) {
               WorldMapType1.field216.method91((players[var0].x * -1234429701 >> 7) + class53.baseX, (players[var0].y >> 7) + class312.baseY);
            }
         }
      }

   }

   static void aac() {
      if(WorldMapType1.field216 != null) {
         field797 = gameCycle * -1952263305;
         WorldMapType1.field216.method98();

         for(int var0 = 0; var0 < players.length; ++var0) {
            if(players[var0] != null) {
               WorldMapType1.field216.method91((players[var0].x * -778275005 >> 7) + class53.baseX, class312.baseY * 824925509 + (players[var0].y >> 7));
            }
         }
      }

   }
}
