package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hl")
public class class121 extends Node {
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = -229900307
   )
   int field2603;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = -1858366799
   )
   int field2588;
   @ObfuscatedName("v")
   @ObfuscatedGetter(
      intValue = -1833312363
   )
   int field2597;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = 995603801
   )
   int field2606;
   @ObfuscatedName("r")
   @ObfuscatedGetter(
      intValue = 1838662135
   )
   int field2599;
   @ObfuscatedName("k")
   @ObfuscatedSignature(
      signature = "Ldt;"
   )
   class166 field2605;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = -1597518325
   )
   int field2607;
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = -342704077
   )
   int field2595;
   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "Lhu;"
   )
   class252 field2590;
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      intValue = -906745587
   )
   int field2589;
   @ObfuscatedName("p")
   @ObfuscatedGetter(
      intValue = -2138249593
   )
   int field2593;
   @ObfuscatedName("b")
   @ObfuscatedGetter(
      intValue = -214546419
   )
   int field2596;
   @ObfuscatedName("o")
   @ObfuscatedGetter(
      intValue = -1803037001
   )
   int field2602;
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      intValue = -1522239135
   )
   int field2601;
   @ObfuscatedName("n")
   @ObfuscatedGetter(
      intValue = 2005278339
   )
   int field2594;
   @ObfuscatedName("t")
   @ObfuscatedGetter(
      intValue = 847034569
   )
   int field2600;
   @ObfuscatedName("y")
   @ObfuscatedGetter(
      intValue = 1220200273
   )
   int field2604;
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "Lhc;"
   )
   class64 field2587;
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      intValue = -1013212729
   )
   int field2591;
   @ObfuscatedName("u")
   @ObfuscatedGetter(
      intValue = 613974745
   )
   int field2592;
   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "Lce;"
   )
   RawAudioNode field2598;

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "1931755950"
   )
   void method1816() {
      this.field2587 = null;
      this.field2598 = null;
      this.field2590 = null;
      this.field2605 = null;
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(ILcs;ZI)I",
      garbageValue = "-1964928093"
   )
   static int method1819(int var0, class314 var1, boolean var2) {
      int var3;
      int var4;
      if(var0 == 100) {
         class281.intStackSize -= 3;
         var3 = class281.intStack[class281.intStackSize];
         var4 = class281.intStack[class281.intStackSize + 1];
         int var5 = class281.intStack[class281.intStackSize + 2];
         if(var4 == 0) {
            throw new RuntimeException();
         } else {
            ComponentType var6 = ChatHistory.method6246(var3);
            if(var6.children == null) {
               var6.children = new ComponentType[var5 + 1];
            }

            if(var6.children.length <= var5) {
               ComponentType[] var7 = new ComponentType[var5 + 1];

               for(int var8 = 0; var8 < var6.children.length; ++var8) {
                  var7[var8] = var6.children[var8];
               }

               var6.children = var7;
            }

            if(var5 > 0 && var6.children[var5 - 1] == null) {
               throw new RuntimeException("" + (var5 - 1));
            } else {
               ComponentType var12 = new ComponentType();
               var12.type = var4;
               var12.layer = var12.id = var6.id;
               var12.index = var5;
               var12.isIf3 = true;
               var6.children[var5] = var12;
               if(var2) {
                  ClientOptions.field1035 = var12;
               } else {
                  class290.field1119 = var12;
               }

               WorldMapRegion.method5554(var6);
               return 1;
            }
         }
      } else {
         ComponentType var9;
         if(var0 == 101) {
            var9 = var2?ClientOptions.field1035:class290.field1119;
            ComponentType var10 = ChatHistory.method6246(var9.id);
            var10.children[var9.index] = null;
            WorldMapRegion.method5554(var10);
            return 1;
         } else if(var0 == 102) {
            var9 = ChatHistory.method6246(class281.intStack[--class281.intStackSize]);
            var9.children = null;
            WorldMapRegion.method5554(var9);
            return 1;
         } else if(var0 != 200) {
            if(var0 == 201) {
               var9 = ChatHistory.method6246(class281.intStack[--class281.intStackSize]);
               if(var9 != null) {
                  class281.intStack[++class281.intStackSize - 1] = 1;
                  if(var2) {
                     ClientOptions.field1035 = var9;
                  } else {
                     class290.field1119 = var9;
                  }
               } else {
                  class281.intStack[++class281.intStackSize - 1] = 0;
               }

               return 1;
            } else {
               return 2;
            }
         } else {
            class281.intStackSize -= 2;
            var3 = class281.intStack[class281.intStackSize];
            var4 = class281.intStack[class281.intStackSize + 1];
            ComponentType var11 = UnitPriceComparator.method2289(var3, var4);
            if(var11 != null && var4 != -1) {
               class281.intStack[++class281.intStackSize - 1] = 1;
               if(var2) {
                  ClientOptions.field1035 = var11;
               } else {
                  class290.field1119 = var11;
               }
            } else {
               class281.intStack[++class281.intStackSize - 1] = 0;
            }

            return 1;
         }
      }
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      signature = "(ILcs;ZI)I",
      garbageValue = "2120660143"
   )
   static int method1818(int var0, class314 var1, boolean var2) {
      if(var0 == 3600) {
         if(class258.friendManager.state == 0) {
            class281.intStack[++class281.intStackSize - 1] = -2;
         } else if(class258.friendManager.state == 1) {
            class281.intStack[++class281.intStackSize - 1] = -1;
         } else {
            class281.intStack[++class281.intStackSize - 1] = class258.friendManager.friendContainer.method5322();
         }

         return 1;
      } else {
         int var3;
         if(var0 == 3601) {
            var3 = class281.intStack[--class281.intStackSize];
            if(class258.friendManager.method2342() && var3 >= 0 && var3 < class258.friendManager.friendContainer.method5322()) {
               Friend var8 = (Friend)class258.friendManager.friendContainer.method5397(var3);
               class281.scriptStringStack[++class295.scriptStringStackSize - 1] = var8.method2763();
               class281.scriptStringStack[++class295.scriptStringStackSize - 1] = var8.method2754();
            } else {
               class281.scriptStringStack[++class295.scriptStringStackSize - 1] = "";
               class281.scriptStringStack[++class295.scriptStringStackSize - 1] = "";
            }

            return 1;
         } else if(var0 == 3602) {
            var3 = class281.intStack[--class281.intStackSize];
            if(class258.friendManager.method2342() && var3 >= 0 && var3 < class258.friendManager.friendContainer.method5322()) {
               class281.intStack[++class281.intStackSize - 1] = ((ChatPlayer)class258.friendManager.friendContainer.method5397(var3)).world;
            } else {
               class281.intStack[++class281.intStackSize - 1] = 0;
            }

            return 1;
         } else if(var0 == 3603) {
            var3 = class281.intStack[--class281.intStackSize];
            if(class258.friendManager.method2342() && var3 >= 0 && var3 < class258.friendManager.friendContainer.method5322()) {
               class281.intStack[++class281.intStackSize - 1] = ((ChatPlayer)class258.friendManager.friendContainer.method5397(var3)).rank;
            } else {
               class281.intStack[++class281.intStackSize - 1] = 0;
            }

            return 1;
         } else {
            String var5;
            if(var0 == 3604) {
               var5 = class281.scriptStringStack[--class295.scriptStringStackSize];
               int var6 = class281.intStack[--class281.intStackSize];
               class3.method53(var5, var6);
               return 1;
            } else if(var0 == 3605) {
               var5 = class281.scriptStringStack[--class295.scriptStringStackSize];
               class258.friendManager.method2349(var5);
               return 1;
            } else if(var0 == 3606) {
               var5 = class281.scriptStringStack[--class295.scriptStringStackSize];
               class258.friendManager.method2375(var5);
               return 1;
            } else if(var0 == 3607) {
               var5 = class281.scriptStringStack[--class295.scriptStringStackSize];
               class258.friendManager.method2385(var5);
               return 1;
            } else if(var0 == 3608) {
               var5 = class281.scriptStringStack[--class295.scriptStringStackSize];
               class258.friendManager.method2353(var5);
               return 1;
            } else if(var0 == 3609) {
               var5 = class281.scriptStringStack[--class295.scriptStringStackSize];
               var5 = VarPlayerType.method10(var5);
               class281.intStack[++class281.intStackSize - 1] = class258.friendManager.method2347(new Name(var5, KeyFocusListener.loginType), false)?1:0;
               return 1;
            } else if(var0 == 3611) {
               if(MapIconReference.clanMemberManager != null) {
                  class281.scriptStringStack[++class295.scriptStringStackSize - 1] = MapIconReference.clanMemberManager.name;
               } else {
                  class281.scriptStringStack[++class295.scriptStringStackSize - 1] = "";
               }

               return 1;
            } else if(var0 == 3612) {
               if(MapIconReference.clanMemberManager != null) {
                  class281.intStack[++class281.intStackSize - 1] = MapIconReference.clanMemberManager.method5322();
               } else {
                  class281.intStack[++class281.intStackSize - 1] = 0;
               }

               return 1;
            } else if(var0 == 3613) {
               var3 = class281.intStack[--class281.intStackSize];
               if(MapIconReference.clanMemberManager != null && var3 < MapIconReference.clanMemberManager.method5322()) {
                  class281.scriptStringStack[++class295.scriptStringStackSize - 1] = MapIconReference.clanMemberManager.method5397(var3).method2752().method1530();
               } else {
                  class281.scriptStringStack[++class295.scriptStringStackSize - 1] = "";
               }

               return 1;
            } else if(var0 == 3614) {
               var3 = class281.intStack[--class281.intStackSize];
               if(MapIconReference.clanMemberManager != null && var3 < MapIconReference.clanMemberManager.method5322()) {
                  class281.intStack[++class281.intStackSize - 1] = ((ChatPlayer)MapIconReference.clanMemberManager.method5397(var3)).method2020();
               } else {
                  class281.intStack[++class281.intStackSize - 1] = 0;
               }

               return 1;
            } else if(var0 == 3615) {
               var3 = class281.intStack[--class281.intStackSize];
               if(MapIconReference.clanMemberManager != null && var3 < MapIconReference.clanMemberManager.method5322()) {
                  class281.intStack[++class281.intStackSize - 1] = ((ChatPlayer)MapIconReference.clanMemberManager.method5397(var3)).rank;
               } else {
                  class281.intStack[++class281.intStackSize - 1] = 0;
               }

               return 1;
            } else if(var0 == 3616) {
               class281.intStack[++class281.intStackSize - 1] = MapIconReference.clanMemberManager != null?MapIconReference.clanMemberManager.field3738:0;
               return 1;
            } else if(var0 == 3617) {
               var5 = class281.scriptStringStack[--class295.scriptStringStackSize];
               PlayerEntity.method6041(var5);
               return 1;
            } else if(var0 == 3618) {
               class281.intStack[++class281.intStackSize - 1] = MapIconReference.clanMemberManager != null?MapIconReference.clanMemberManager.field3739:0;
               return 1;
            } else if(var0 == 3619) {
               var5 = class281.scriptStringStack[--class295.scriptStringStackSize];
               class140.method2016(var5);
               return 1;
            } else if(var0 == 3620) {
               WorldMapManager.method2329();
               return 1;
            } else if(var0 == 3621) {
               if(!class258.friendManager.method2342()) {
                  class281.intStack[++class281.intStackSize - 1] = -1;
               } else {
                  class281.intStack[++class281.intStackSize - 1] = class258.friendManager.ignoreContainer.method5322();
               }

               return 1;
            } else if(var0 == 3622) {
               var3 = class281.intStack[--class281.intStackSize];
               if(class258.friendManager.method2342() && var3 >= 0 && var3 < class258.friendManager.ignoreContainer.method5322()) {
                  Ignore var4 = (Ignore)class258.friendManager.ignoreContainer.method5397(var3);
                  class281.scriptStringStack[++class295.scriptStringStackSize - 1] = var4.method2763();
                  class281.scriptStringStack[++class295.scriptStringStackSize - 1] = var4.method2754();
               } else {
                  class281.scriptStringStack[++class295.scriptStringStackSize - 1] = "";
                  class281.scriptStringStack[++class295.scriptStringStackSize - 1] = "";
               }

               return 1;
            } else if(var0 == 3623) {
               var5 = class281.scriptStringStack[--class295.scriptStringStackSize];
               var5 = VarPlayerType.method10(var5);
               class281.intStack[++class281.intStackSize - 1] = class258.friendManager.method2348(new Name(var5, KeyFocusListener.loginType))?1:0;
               return 1;
            } else if(var0 == 3624) {
               var3 = class281.intStack[--class281.intStackSize];
               if(MapIconReference.clanMemberManager != null && var3 < MapIconReference.clanMemberManager.method5322() && MapIconReference.clanMemberManager.method5397(var3).method2752().equals(class71.localPlayer.name)) {
                  class281.intStack[++class281.intStackSize - 1] = 1;
               } else {
                  class281.intStack[++class281.intStackSize - 1] = 0;
               }

               return 1;
            } else if(var0 == 3625) {
               if(MapIconReference.clanMemberManager != null && MapIconReference.clanMemberManager.owner != null) {
                  class281.scriptStringStack[++class295.scriptStringStackSize - 1] = MapIconReference.clanMemberManager.owner;
               } else {
                  class281.scriptStringStack[++class295.scriptStringStackSize - 1] = "";
               }

               return 1;
            } else if(var0 == 3626) {
               var3 = class281.intStack[--class281.intStackSize];
               if(MapIconReference.clanMemberManager != null && var3 < MapIconReference.clanMemberManager.method5322() && ((ClanMember)MapIconReference.clanMemberManager.method5397(var3)).method1620()) {
                  class281.intStack[++class281.intStackSize - 1] = 1;
               } else {
                  class281.intStack[++class281.intStackSize - 1] = 0;
               }

               return 1;
            } else if(var0 != 3627) {
               if(var0 == 3628) {
                  class258.friendManager.friendContainer.method5396();
                  return 1;
               } else {
                  boolean var7;
                  if(var0 == 3629) {
                     var7 = class281.intStack[--class281.intStackSize] == 1;
                     class258.friendManager.friendContainer.method5343(new class187(var7));
                     return 1;
                  } else if(var0 == 3630) {
                     var7 = class281.intStack[--class281.intStackSize] == 1;
                     class258.friendManager.friendContainer.method5343(new class85(var7));
                     return 1;
                  } else if(var0 == 3631) {
                     var7 = class281.intStack[--class281.intStackSize] == 1;
                     class258.friendManager.friendContainer.method5343(new class72(var7));
                     return 1;
                  } else if(var0 == 3632) {
                     var7 = class281.intStack[--class281.intStackSize] == 1;
                     class258.friendManager.friendContainer.method5343(new class280(var7));
                     return 1;
                  } else if(var0 == 3633) {
                     var7 = class281.intStack[--class281.intStackSize] == 1;
                     class258.friendManager.friendContainer.method5343(new class83(var7));
                     return 1;
                  } else if(var0 == 3634) {
                     var7 = class281.intStack[--class281.intStackSize] == 1;
                     class258.friendManager.friendContainer.method5343(new class266(var7));
                     return 1;
                  } else if(var0 == 3635) {
                     var7 = class281.intStack[--class281.intStackSize] == 1;
                     class258.friendManager.friendContainer.method5343(new class244(var7));
                     return 1;
                  } else if(var0 == 3636) {
                     var7 = class281.intStack[--class281.intStackSize] == 1;
                     class258.friendManager.friendContainer.method5343(new class100(var7));
                     return 1;
                  } else if(var0 == 3637) {
                     var7 = class281.intStack[--class281.intStackSize] == 1;
                     class258.friendManager.friendContainer.method5343(new class288(var7));
                     return 1;
                  } else if(var0 == 3638) {
                     var7 = class281.intStack[--class281.intStackSize] == 1;
                     class258.friendManager.friendContainer.method5343(new class87(var7));
                     return 1;
                  } else if(var0 == 3639) {
                     class258.friendManager.friendContainer.method5369();
                     return 1;
                  } else if(var0 == 3640) {
                     class258.friendManager.ignoreContainer.method5396();
                     return 1;
                  } else if(var0 == 3641) {
                     var7 = class281.intStack[--class281.intStackSize] == 1;
                     class258.friendManager.ignoreContainer.method5343(new class187(var7));
                     return 1;
                  } else if(var0 == 3642) {
                     var7 = class281.intStack[--class281.intStackSize] == 1;
                     class258.friendManager.ignoreContainer.method5343(new class85(var7));
                     return 1;
                  } else if(var0 == 3643) {
                     class258.friendManager.ignoreContainer.method5369();
                     return 1;
                  } else if(var0 == 3644) {
                     if(MapIconReference.clanMemberManager != null) {
                        MapIconReference.clanMemberManager.method5396();
                     }

                     return 1;
                  } else if(var0 == 3645) {
                     var7 = class281.intStack[--class281.intStackSize] == 1;
                     if(MapIconReference.clanMemberManager != null) {
                        MapIconReference.clanMemberManager.method5343(new class187(var7));
                     }

                     return 1;
                  } else if(var0 == 3646) {
                     var7 = class281.intStack[--class281.intStackSize] == 1;
                     if(MapIconReference.clanMemberManager != null) {
                        MapIconReference.clanMemberManager.method5343(new class85(var7));
                     }

                     return 1;
                  } else if(var0 == 3647) {
                     var7 = class281.intStack[--class281.intStackSize] == 1;
                     if(MapIconReference.clanMemberManager != null) {
                        MapIconReference.clanMemberManager.method5343(new class72(var7));
                     }

                     return 1;
                  } else if(var0 == 3648) {
                     var7 = class281.intStack[--class281.intStackSize] == 1;
                     if(MapIconReference.clanMemberManager != null) {
                        MapIconReference.clanMemberManager.method5343(new class280(var7));
                     }

                     return 1;
                  } else if(var0 == 3649) {
                     var7 = class281.intStack[--class281.intStackSize] == 1;
                     if(MapIconReference.clanMemberManager != null) {
                        MapIconReference.clanMemberManager.method5343(new class83(var7));
                     }

                     return 1;
                  } else if(var0 == 3650) {
                     var7 = class281.intStack[--class281.intStackSize] == 1;
                     if(MapIconReference.clanMemberManager != null) {
                        MapIconReference.clanMemberManager.method5343(new class266(var7));
                     }

                     return 1;
                  } else if(var0 == 3651) {
                     var7 = class281.intStack[--class281.intStackSize] == 1;
                     if(MapIconReference.clanMemberManager != null) {
                        MapIconReference.clanMemberManager.method5343(new class244(var7));
                     }

                     return 1;
                  } else if(var0 == 3652) {
                     var7 = class281.intStack[--class281.intStackSize] == 1;
                     if(MapIconReference.clanMemberManager != null) {
                        MapIconReference.clanMemberManager.method5343(new class100(var7));
                     }

                     return 1;
                  } else if(var0 == 3653) {
                     var7 = class281.intStack[--class281.intStackSize] == 1;
                     if(MapIconReference.clanMemberManager != null) {
                        MapIconReference.clanMemberManager.method5343(new class288(var7));
                     }

                     return 1;
                  } else if(var0 == 3654) {
                     var7 = class281.intStack[--class281.intStackSize] == 1;
                     if(MapIconReference.clanMemberManager != null) {
                        MapIconReference.clanMemberManager.method5343(new class87(var7));
                     }

                     return 1;
                  } else if(var0 == 3655) {
                     if(MapIconReference.clanMemberManager != null) {
                        MapIconReference.clanMemberManager.method5369();
                     }

                     return 1;
                  } else if(var0 == 3656) {
                     var7 = class281.intStack[--class281.intStackSize] == 1;
                     class258.friendManager.friendContainer.method5343(new class27(var7));
                     return 1;
                  } else if(var0 == 3657) {
                     var7 = class281.intStack[--class281.intStackSize] == 1;
                     if(MapIconReference.clanMemberManager != null) {
                        MapIconReference.clanMemberManager.method5343(new class27(var7));
                     }

                     return 1;
                  } else {
                     return 2;
                  }
               }
            } else {
               var3 = class281.intStack[--class281.intStackSize];
               if(MapIconReference.clanMemberManager != null && var3 < MapIconReference.clanMemberManager.method5322() && ((ClanMember)MapIconReference.clanMemberManager.method5397(var3)).method1623()) {
                  class281.intStack[++class281.intStackSize - 1] = 1;
               } else {
                  class281.intStack[++class281.intStackSize - 1] = 0;
               }

               return 1;
            }
         }
      }
   }
}
