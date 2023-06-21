package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ac")
public class SoundTaskDataProvider implements class39 {
   @ObfuscatedName("bn")
   @ObfuscatedGetter(
      intValue = 1427147269
   )
   static int authcode;
   @ObfuscatedName("i")
   static int[] field417;

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "(I)Lcz;",
      garbageValue = "-709651397"
   )
   public AbstractSoundSystem vmethod6142() {
      return new SourceDataSoundSystem();
   }

   @ObfuscatedName("jy")
   @ObfuscatedSignature(
      signature = "([Lia;IIIIIIIB)V",
      garbageValue = "32"
   )
   static final void method6145(ComponentType[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      for(int var8 = 0; var8 < var0.length; ++var8) {
         ComponentType var9 = var0[var8];
         if(var9 != null && var9.layer == var1 && (!var9.isIf3 || var9.type == 0 || var9.hasHook || WorldComparator.method86(var9) != 0 || var9 == client.field823 || var9.clientcode == 1338)) {
            if(var9.isIf3) {
               if(class91.method1200(var9)) {
                  continue;
               }
            } else if(var9.type == 0 && var9 != NPCType.field3585 && class91.method1200(var9)) {
               continue;
            }

            int var10 = var9.x + var6;
            int var11 = var7 + var9.y;
            int var12;
            int var13;
            int var14;
            int var15;
            int var17;
            int var18;
            if(var9.type == 2) {
               var12 = var2;
               var13 = var3;
               var14 = var4;
               var15 = var5;
            } else {
               int var16;
               if(var9.type == 9) {
                  var16 = var10;
                  var17 = var11;
                  var18 = var10 + var9.width;
                  int var19 = var11 + var9.height;
                  if(var18 < var10) {
                     var16 = var18;
                     var18 = var10;
                  }

                  if(var19 < var11) {
                     var17 = var19;
                     var19 = var11;
                  }

                  ++var18;
                  ++var19;
                  var12 = var16 > var2?var16:var2;
                  var13 = var17 > var3?var17:var3;
                  var14 = var18 < var4?var18:var4;
                  var15 = var19 < var5?var19:var5;
               } else {
                  var16 = var10 + var9.width;
                  var17 = var11 + var9.height;
                  var12 = var10 > var2?var10:var2;
                  var13 = var11 > var3?var11:var3;
                  var14 = var16 < var4?var16:var4;
                  var15 = var17 < var5?var17:var5;
               }
            }

            if(var9 == client.draggedWidget) {
               client.field830 = true;
               client.field831 = var10;
               client.field832 = var11;
            }

            boolean var32 = false;
            if(var9.field2763) {
               switch(client.field858) {
               case 0:
                  var32 = true;
               case 1:
               default:
                  break;
               case 2:
                  if(client.field812 == var9.id >>> 16) {
                     var32 = true;
                  }
                  break;
               case 3:
                  if(var9.id == client.field812) {
                     var32 = true;
                  }
               }
            }

            if(var32 || !var9.isIf3 || var12 < var14 && var13 < var15) {
               if(var9.isIf3) {
                  ScriptEvent var26;
                  if(var9.noClickThrough) {
                     if(MouseInput.mouseLastX >= var12 && MouseInput.mouseLastY >= var13 && MouseInput.mouseLastX < var14 && MouseInput.mouseLastY < var15) {
                        for(var26 = (ScriptEvent) client.field848.method3930(); var26 != null; var26 = (ScriptEvent) client.field848.method3924()) {
                           if(var26.field573) {
                              var26.method432();
                              var26.source.field2820 = false;
                           }
                        }

                        if(WorldMapRegion.field267 == 0) {
                           client.draggedWidget = null;
                           client.field823 = null;
                        }

                        if(!client.isMenuOpen) {
                           GrandExchangeOffer.method1734();
                        }
                     }
                  } else if(var9.noScrollThrough && MouseInput.mouseLastX >= var12 && MouseInput.mouseLastY >= var13 && MouseInput.mouseLastX < var14 && MouseInput.mouseLastY < var15) {
                     for(var26 = (ScriptEvent) client.field848.method3930(); var26 != null; var26 = (ScriptEvent) client.field848.method3924()) {
                        if(var26.field573 && var26.source.onScrollWheelListener == var26.params) {
                           var26.method432();
                        }
                     }
                  }
               }

               var17 = MouseInput.mouseLastX;
               var18 = MouseInput.mouseLastY;
               if(MouseInput.mouseLastButton != 0) {
                  var17 = MouseInput.mouseLastPressedX;
                  var18 = MouseInput.mouseLastPressedY;
               }

               boolean var33 = var17 >= var12 && var18 >= var13 && var17 < var14 && var18 < var15;
               if(var9.clientcode == 1337) {
                  if(!client.field663 && !client.isMenuOpen && var33) {
                     class172.method2695(var17, var18, var12, var13);
                  }
               } else if(var9.clientcode == 1338) {
                  MapLabel.method2855(var9, var10, var11);
               } else {
                  if(var9.clientcode == 1400) {
                     class69.worldMap.method2865(MouseInput.mouseLastX, MouseInput.mouseLastY, var33, var10, var11, var9.width, var9.height);
                  }

                  if(!client.isMenuOpen && var33) {
                     if(var9.clientcode == 1400) {
                        class69.worldMap.method2917(var10, var11, var9.width, var9.height, var17, var18);
                     } else {
                        TradingPost.method1616(var9, var17 - var10, var18 - var11);
                     }
                  }

                  boolean var21;
                  int var23;
                  if(var32) {
                     for(int var20 = 0; var20 < var9.opKeys.length; ++var20) {
                        var21 = false;
                        boolean var22 = false;
                        if(!var21 && var9.opKeys[var20] != null) {
                           for(var23 = 0; var23 < var9.opKeys[var20].length; ++var23) {
                              boolean var24 = false;
                              if(var9.opKeysIgnoreHeld != null) {
                                 var24 = KeyFocusListener.keyPressed[var9.opKeys[var20][var23]];
                              }

                              if(SubInterface.method2712(var9.opKeys[var20][var23]) || var24) {
                                 var21 = true;
                                 if(var9.opKeysIgnoreHeld != null && var9.opKeysIgnoreHeld[var20] > client.gameCycle) {
                                    break;
                                 }

                                 byte var25 = var9.opKeyModifiers[var20][var23];
                                 if(var25 == 0 || ((var25 & 8) == 0 || !KeyFocusListener.keyPressed[86] && !KeyFocusListener.keyPressed[82] && !KeyFocusListener.keyPressed[81]) && ((var25 & 2) == 0 || KeyFocusListener.keyPressed[86]) && ((var25 & 1) == 0 || KeyFocusListener.keyPressed[82]) && ((var25 & 4) == 0 || KeyFocusListener.keyPressed[81])) {
                                    var22 = true;
                                    break;
                                 }
                              }
                           }
                        }

                        if(var22) {
                           if(var20 < 10) {
                              Nameable.method2776(var20 + 1, var9.id, var9.index, var9.linkObjType, "");
                           } else if(var20 == 10) {
                              GameCanvas.method4866();
                              class191.method3801(var9.id, var9.index, CacheFile.method5603(WorldComparator.method86(var9)), var9.linkObjType);
                              client.targetVerb = class125.method1854(var9);
                              if(client.targetVerb == null) {
                                 client.targetVerb = "null";
                              }

                              client.opBase = var9.opBase + class308.method6152(16777215);
                           }

                           var23 = var9.opKeyRates[var20];
                           if(var9.opKeysIgnoreHeld == null) {
                              var9.opKeysIgnoreHeld = new int[var9.opKeys.length];
                           }

                           if(var9.field2754 == null) {
                              var9.field2754 = new int[var9.opKeys.length];
                           }

                           if(var23 != 0) {
                              if(var9.opKeysIgnoreHeld[var20] == 0) {
                                 var9.opKeysIgnoreHeld[var20] = var23 + client.gameCycle + var9.field2754[var20];
                              } else {
                                 var9.opKeysIgnoreHeld[var20] = var23 + client.gameCycle;
                              }
                           } else {
                              var9.opKeysIgnoreHeld[var20] = Integer.MAX_VALUE;
                           }
                        }

                        if(!var21 && var9.opKeysIgnoreHeld != null) {
                           var9.opKeysIgnoreHeld[var20] = 0;
                        }
                     }
                  }

                  if(var9.isIf3) {
                     if(MouseInput.mouseLastX >= var12 && MouseInput.mouseLastY >= var13 && MouseInput.mouseLastX < var14 && MouseInput.mouseLastY < var15) {
                        var33 = true;
                     } else {
                        var33 = false;
                     }

                     boolean var34 = false;
                     if((MouseInput.mouseCurrentButton == 1 || !TextureProvider.middleMouseMovesCamera && MouseInput.mouseCurrentButton == 4) && var33) {
                        var34 = true;
                     }

                     var21 = false;
                     if((MouseInput.mouseLastButton == 1 || !TextureProvider.middleMouseMovesCamera && MouseInput.mouseLastButton == 4) && MouseInput.mouseLastPressedX >= var12 && MouseInput.mouseLastPressedY >= var13 && MouseInput.mouseLastPressedX < var14 && MouseInput.mouseLastPressedY < var15) {
                        var21 = true;
                     }

                     if(var21) {
                        class125.method1856(var9, MouseInput.mouseLastPressedX - var10, MouseInput.mouseLastPressedY - var11);
                     }

                     if(var9.clientcode == 1400) {
                        class69.worldMap.method2866(var17, var18, var33 & var34, var33 & var21);
                     }

                     if(client.draggedWidget != null && var9 != client.draggedWidget && var33 && Bit.method2649(WorldComparator.method86(var9))) {
                        client.draggedOnWidget = var9;
                     }

                     if(var9 == client.field823) {
                        client.field904 = true;
                        client.field757 = var10;
                        client.field829 = var11;
                     }

                     if(var9.hasHook) {
                        ScriptEvent var27;
                        if(var33 && client.field847 != 0 && var9.onScrollWheelListener != null) {
                           var27 = new ScriptEvent();
                           var27.field573 = true;
                           var27.source = var9;
                           var27.mouseY = client.field847;
                           var27.params = var9.onScrollWheelListener;
                           client.field848.method3906(var27);
                        }

                        if(client.draggedWidget != null || GameCanvas.field420 != null || client.isMenuOpen) {
                           var21 = false;
                           var34 = false;
                           var33 = false;
                        }

                        if(!var9.field2723 && var21) {
                           var9.field2723 = true;
                           if(var9.onClickListener != null) {
                              var27 = new ScriptEvent();
                              var27.field573 = true;
                              var27.source = var9;
                              var27.mouseX = MouseInput.mouseLastPressedX - var10;
                              var27.mouseY = MouseInput.mouseLastPressedY - var11;
                              var27.params = var9.onClickListener;
                              client.field848.method3906(var27);
                           }
                        }

                        if(var9.field2723 && var34 && var9.onClickRepeatListener != null) {
                           var27 = new ScriptEvent();
                           var27.field573 = true;
                           var27.source = var9;
                           var27.mouseX = MouseInput.mouseLastX - var10;
                           var27.mouseY = MouseInput.mouseLastY - var11;
                           var27.params = var9.onClickRepeatListener;
                           client.field848.method3906(var27);
                        }

                        if(var9.field2723 && !var34) {
                           var9.field2723 = false;
                           if(var9.onReleaseListener != null) {
                              var27 = new ScriptEvent();
                              var27.field573 = true;
                              var27.source = var9;
                              var27.mouseX = MouseInput.mouseLastX - var10;
                              var27.mouseY = MouseInput.mouseLastY - var11;
                              var27.params = var9.onReleaseListener;
                              client.field850.method3906(var27);
                           }
                        }

                        if(var34 && var9.onHoldListener != null) {
                           var27 = new ScriptEvent();
                           var27.field573 = true;
                           var27.source = var9;
                           var27.mouseX = MouseInput.mouseLastX - var10;
                           var27.mouseY = MouseInput.mouseLastY - var11;
                           var27.params = var9.onHoldListener;
                           client.field848.method3906(var27);
                        }

                        if(!var9.field2820 && var33) {
                           var9.field2820 = true;
                           if(var9.onMouseOverListener != null) {
                              var27 = new ScriptEvent();
                              var27.field573 = true;
                              var27.source = var9;
                              var27.mouseX = MouseInput.mouseLastX - var10;
                              var27.mouseY = MouseInput.mouseLastY - var11;
                              var27.params = var9.onMouseOverListener;
                              client.field848.method3906(var27);
                           }
                        }

                        if(var9.field2820 && var33 && var9.onMouseRepeatListener != null) {
                           var27 = new ScriptEvent();
                           var27.field573 = true;
                           var27.source = var9;
                           var27.mouseX = MouseInput.mouseLastX - var10;
                           var27.mouseY = MouseInput.mouseLastY - var11;
                           var27.params = var9.onMouseRepeatListener;
                           client.field848.method3906(var27);
                        }

                        if(var9.field2820 && !var33) {
                           var9.field2820 = false;
                           if(var9.onMouseLeaveListener != null) {
                              var27 = new ScriptEvent();
                              var27.field573 = true;
                              var27.source = var9;
                              var27.mouseX = MouseInput.mouseLastX - var10;
                              var27.mouseY = MouseInput.mouseLastY - var11;
                              var27.params = var9.onMouseLeaveListener;
                              client.field850.method3906(var27);
                           }
                        }

                        if(var9.onTimerListener != null) {
                           var27 = new ScriptEvent();
                           var27.source = var9;
                           var27.params = var9.onTimerListener;
                           client.field921.method3906(var27);
                        }

                        ScriptEvent var30;
                        int var35;
                        int var36;
                        if(var9.onVarTransmitListener != null && client.field836 > var9.field2722) {
                           if(var9.varTransmitTriggers != null && client.field836 - var9.field2722 <= 32) {
                              label903:
                              for(var35 = var9.field2722; var35 < client.field836; ++var35) {
                                 var23 = client.field835[var35 & 31];

                                 for(var36 = 0; var36 < var9.varTransmitTriggers.length; ++var36) {
                                    if(var23 == var9.varTransmitTriggers[var36]) {
                                       var30 = new ScriptEvent();
                                       var30.source = var9;
                                       var30.params = var9.onVarTransmitListener;
                                       client.field848.method3906(var30);
                                       break label903;
                                    }
                                 }
                              }
                           } else {
                              var27 = new ScriptEvent();
                              var27.source = var9;
                              var27.params = var9.onVarTransmitListener;
                              client.field848.method3906(var27);
                           }

                           var9.field2722 = client.field836;
                        }

                        if(var9.onInvTransmitListener != null && client.field681 > var9.field2824) {
                           if(var9.invTransmitTriggers != null && client.field681 - var9.field2824 <= 32) {
                              label879:
                              for(var35 = var9.field2824; var35 < client.field681; ++var35) {
                                 var23 = client.field837[var35 & 31];

                                 for(var36 = 0; var36 < var9.invTransmitTriggers.length; ++var36) {
                                    if(var23 == var9.invTransmitTriggers[var36]) {
                                       var30 = new ScriptEvent();
                                       var30.source = var9;
                                       var30.params = var9.onInvTransmitListener;
                                       client.field848.method3906(var30);
                                       break label879;
                                    }
                                 }
                              }
                           } else {
                              var27 = new ScriptEvent();
                              var27.source = var9;
                              var27.params = var9.onInvTransmitListener;
                              client.field848.method3906(var27);
                           }

                           var9.field2824 = client.field681;
                        }

                        if(var9.onStatTransmitListener != null && client.changedSkillsCount > var9.field2825) {
                           if(var9.statTransmitTriggers != null && client.changedSkillsCount - var9.field2825 <= 32) {
                              label855:
                              for(var35 = var9.field2825; var35 < client.changedSkillsCount; ++var35) {
                                 var23 = client.changedSkills[var35 & 31];

                                 for(var36 = 0; var36 < var9.statTransmitTriggers.length; ++var36) {
                                    if(var23 == var9.statTransmitTriggers[var36]) {
                                       var30 = new ScriptEvent();
                                       var30.source = var9;
                                       var30.params = var9.onStatTransmitListener;
                                       client.field848.method3906(var30);
                                       break label855;
                                    }
                                 }
                              }
                           } else {
                              var27 = new ScriptEvent();
                              var27.source = var9;
                              var27.params = var9.onStatTransmitListener;
                              client.field848.method3906(var27);
                           }

                           var9.field2825 = client.changedSkillsCount;
                        }

                        if(client.chatCycle > var9.field2822 && var9.onChatTransmitListener != null) {
                           var27 = new ScriptEvent();
                           var27.source = var9;
                           var27.params = var9.onChatTransmitListener;
                           client.field848.method3906(var27);
                        }

                        if(client.lastFriendTransmit > var9.field2822 && var9.onFriendTransmitListener != null) {
                           var27 = new ScriptEvent();
                           var27.source = var9;
                           var27.params = var9.onFriendTransmitListener;
                           client.field848.method3906(var27);
                        }

                        if(client.field898 > var9.field2822 && var9.onClanTransmitListener != null) {
                           var27 = new ScriptEvent();
                           var27.source = var9;
                           var27.params = var9.onClanTransmitListener;
                           client.field848.method3906(var27);
                        }

                        if(client.field648 > var9.field2822 && var9.onStockTransmitListener != null) {
                           var27 = new ScriptEvent();
                           var27.source = var9;
                           var27.params = var9.onStockTransmitListener;
                           client.field848.method3906(var27);
                        }

                        if(client.field675 > var9.field2822 && var9.onCamFinishedListener != null) {
                           var27 = new ScriptEvent();
                           var27.source = var9;
                           var27.params = var9.onCamFinishedListener;
                           client.field848.method3906(var27);
                        }

                        if(client.lastMiscTransmit > var9.field2822 && var9.onMiscTransmitListener != null) {
                           var27 = new ScriptEvent();
                           var27.source = var9;
                           var27.params = var9.onMiscTransmitListener;
                           client.field848.method3906(var27);
                        }

                        var9.field2822 = client.cycleCntr;
                        if(var9.onKeyListener != null) {
                           for(var35 = 0; var35 < client.field870; ++var35) {
                              ScriptEvent var31 = new ScriptEvent();
                              var31.source = var9;
                              var31.typedKeyCode = client.field732[var35];
                              var31.typedKeyChar = client.field871[var35];
                              var31.params = var9.onKeyListener;
                              client.field848.method3906(var31);
                           }
                        }
                     }
                  }

                  if(!var9.isIf3) {
                     if(client.draggedWidget != null || GameCanvas.field420 != null || client.isMenuOpen) {
                        continue;
                     }

                     if((var9.field2810 >= 0 || var9.field2819 != 0) && MouseInput.mouseLastX >= var12 && MouseInput.mouseLastY >= var13 && MouseInput.mouseLastX < var14 && MouseInput.mouseLastY < var15) {
                        if(var9.field2810 >= 0) {
                           NPCType.field3585 = var0[var9.field2810];
                        } else {
                           NPCType.field3585 = var9;
                        }
                     }

                     if(var9.type == 8 && MouseInput.mouseLastX >= var12 && MouseInput.mouseLastY >= var13 && MouseInput.mouseLastX < var14 && MouseInput.mouseLastY < var15) {
                        class244.field1961 = var9;
                     }

                     if(var9.scrollHeight > var9.height) {
                        GameObject.method1097(var9, var10 + var9.width, var11, var9.height, var9.scrollHeight, MouseInput.mouseLastX, MouseInput.mouseLastY);
                     }
                  }

                  if(var9.type == 0) {
                     method6145(var0, var9.id, var12, var13, var14, var15, var10 - var9.scrollX, var11 - var9.scrollY);
                     if(var9.children != null) {
                        method6145(var9.children, var9.id, var12, var13, var14, var15, var10 - var9.scrollX, var11 - var9.scrollY);
                     }

                     SubInterface var28 = (SubInterface) client.subInterfaces.method6335((long)var9.id);
                     if(var28 != null) {
                        if(var28.mode == 0 && MouseInput.mouseLastX >= var12 && MouseInput.mouseLastY >= var13 && MouseInput.mouseLastX < var14 && MouseInput.mouseLastY < var15 && !client.isMenuOpen) {
                           for(ScriptEvent var29 = (ScriptEvent) client.field848.method3930(); var29 != null; var29 = (ScriptEvent) client.field848.method3924()) {
                              if(var29.field573) {
                                 var29.method432();
                                 var29.source.field2820 = false;
                              }
                           }

                           if(WorldMapRegion.field267 == 0) {
                              client.draggedWidget = null;
                              client.field823 = null;
                           }

                           if(!client.isMenuOpen) {
                              GrandExchangeOffer.method1734();
                           }
                        }

                        class43.method641(var28.id, var12, var13, var14, var15, var10, var11);
                     }
                  }
               }
            }
         }
      }

   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "972227878"
   )
   static void method6144(int var0) {
      ItemContainer var1 = (ItemContainer)ItemContainer.itemContainers.method6335((long)var0);
      if(var1 != null) {
         for(int var2 = 0; var2 < var1.itemIds.length; ++var2) {
            var1.itemIds[var2] = -1;
            var1.stackSizes[var2] = 0;
            var1.stackSizesChanged(var2);
         }

      }
   }

   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      signature = "(ILcs;ZI)I",
      garbageValue = "1440659399"
   )
   static int method6146(int var0, class314 var1, boolean var2) {
      int var3;
      if(var0 == 6600) {
         var3 = ServerProt.level;
         int var9 = (class71.localPlayer.x * -1234429701 >> 7) + class53.baseX;
         int var5 = (class71.localPlayer.y >> 7) + class312.baseY;
         WorldMapDataGroup.method959().method2874(var3, var9, var5, true);
         return 1;
      } else {
         WorldMapData var11;
         if(var0 == 6601) {
            var3 = class281.intStack[--class281.intStackSize];
            String var16 = "";
            var11 = WorldMapDataGroup.method959().method3040(var3);
            if(var11 != null) {
               var16 = var11.method1706();
            }

            class281.scriptStringStack[++class295.scriptStringStackSize - 1] = var16;
            return 1;
         } else if(var0 == 6602) {
            var3 = class281.intStack[--class281.intStackSize];
            WorldMapDataGroup.method959().method2935(var3);
            return 1;
         } else if(var0 == 6603) {
            class281.intStack[++class281.intStackSize - 1] = WorldMapDataGroup.method959().method2987();
            return 1;
         } else if(var0 == 6604) {
            var3 = class281.intStack[--class281.intStackSize];
            WorldMapDataGroup.method959().method2886(var3);
            return 1;
         } else if(var0 == 6605) {
            class281.intStack[++class281.intStackSize - 1] = WorldMapDataGroup.method959().method2891()?1:0;
            return 1;
         } else {
            CoordGrid var15;
            if(var0 == 6606) {
               var15 = new CoordGrid(class281.intStack[--class281.intStackSize]);
               WorldMapDataGroup.method959().method2893(var15.x, var15.y);
               return 1;
            } else if(var0 == 6607) {
               var15 = new CoordGrid(class281.intStack[--class281.intStackSize]);
               WorldMapDataGroup.method959().method3025(var15.x, var15.y);
               return 1;
            } else if(var0 == 6608) {
               var15 = new CoordGrid(class281.intStack[--class281.intStackSize]);
               WorldMapDataGroup.method959().method2895(var15.z, var15.x, var15.y);
               return 1;
            } else if(var0 == 6609) {
               var15 = new CoordGrid(class281.intStack[--class281.intStackSize]);
               WorldMapDataGroup.method959().method2939(var15.z, var15.x, var15.y);
               return 1;
            } else if(var0 == 6610) {
               class281.intStack[++class281.intStackSize - 1] = WorldMapDataGroup.method959().method2897();
               class281.intStack[++class281.intStackSize - 1] = WorldMapDataGroup.method959().method2898();
               return 1;
            } else {
               WorldMapData var13;
               if(var0 == 6611) {
                  var3 = class281.intStack[--class281.intStackSize];
                  var13 = WorldMapDataGroup.method959().method3040(var3);
                  if(var13 == null) {
                     class281.intStack[++class281.intStackSize - 1] = 0;
                  } else {
                     class281.intStack[++class281.intStackSize - 1] = var13.method1660().method886();
                  }

                  return 1;
               } else if(var0 == 6612) {
                  var3 = class281.intStack[--class281.intStackSize];
                  var13 = WorldMapDataGroup.method959().method3040(var3);
                  if(var13 == null) {
                     class281.intStack[++class281.intStackSize - 1] = 0;
                     class281.intStack[++class281.intStackSize - 1] = 0;
                  } else {
                     class281.intStack[++class281.intStackSize - 1] = (var13.method1658() - var13.method1689() + 1) * 64;
                     class281.intStack[++class281.intStackSize - 1] = (var13.method1694() - var13.method1659() + 1) * 64;
                  }

                  return 1;
               } else if(var0 == 6613) {
                  var3 = class281.intStack[--class281.intStackSize];
                  var13 = WorldMapDataGroup.method959().method3040(var3);
                  if(var13 == null) {
                     class281.intStack[++class281.intStackSize - 1] = 0;
                     class281.intStack[++class281.intStackSize - 1] = 0;
                     class281.intStack[++class281.intStackSize - 1] = 0;
                     class281.intStack[++class281.intStackSize - 1] = 0;
                  } else {
                     class281.intStack[++class281.intStackSize - 1] = var13.method1689() * 64;
                     class281.intStack[++class281.intStackSize - 1] = var13.method1659() * 64;
                     class281.intStack[++class281.intStackSize - 1] = var13.method1658() * 64 + 64 - 1;
                     class281.intStack[++class281.intStackSize - 1] = var13.method1694() * 64 + 64 - 1;
                  }

                  return 1;
               } else if(var0 == 6614) {
                  var3 = class281.intStack[--class281.intStackSize];
                  var13 = WorldMapDataGroup.method959().method3040(var3);
                  if(var13 == null) {
                     class281.intStack[++class281.intStackSize - 1] = -1;
                  } else {
                     class281.intStack[++class281.intStackSize - 1] = var13.method1656();
                  }

                  return 1;
               } else if(var0 == 6615) {
                  var15 = WorldMapDataGroup.method959().method2899();
                  if(var15 == null) {
                     class281.intStack[++class281.intStackSize - 1] = -1;
                     class281.intStack[++class281.intStackSize - 1] = -1;
                  } else {
                     class281.intStack[++class281.intStackSize - 1] = var15.x;
                     class281.intStack[++class281.intStackSize - 1] = var15.y;
                  }

                  return 1;
               } else if(var0 == 6616) {
                  class281.intStack[++class281.intStackSize - 1] = WorldMapDataGroup.method959().method2876();
                  return 1;
               } else if(var0 == 6617) {
                  var15 = new CoordGrid(class281.intStack[--class281.intStackSize]);
                  var13 = WorldMapDataGroup.method959().method3028();
                  if(var13 == null) {
                     class281.intStack[++class281.intStackSize - 1] = -1;
                     class281.intStack[++class281.intStackSize - 1] = -1;
                     return 1;
                  } else {
                     int[] var14 = var13.method1648(var15.z, var15.x, var15.y);
                     if(var14 == null) {
                        class281.intStack[++class281.intStackSize - 1] = -1;
                        class281.intStack[++class281.intStackSize - 1] = -1;
                     } else {
                        class281.intStack[++class281.intStackSize - 1] = var14[0];
                        class281.intStack[++class281.intStackSize - 1] = var14[1];
                     }

                     return 1;
                  }
               } else {
                  CoordGrid var7;
                  if(var0 == 6618) {
                     var15 = new CoordGrid(class281.intStack[--class281.intStackSize]);
                     var13 = WorldMapDataGroup.method959().method3028();
                     if(var13 == null) {
                        class281.intStack[++class281.intStackSize - 1] = -1;
                        class281.intStack[++class281.intStackSize - 1] = -1;
                        return 1;
                     } else {
                        var7 = var13.method1697(var15.x, var15.y);
                        if(var7 == null) {
                           class281.intStack[++class281.intStackSize - 1] = -1;
                        } else {
                           class281.intStack[++class281.intStackSize - 1] = var7.method886();
                        }

                        return 1;
                     }
                  } else {
                     CoordGrid var12;
                     if(var0 == 6619) {
                        class281.intStackSize -= 2;
                        var3 = class281.intStack[class281.intStackSize];
                        var12 = new CoordGrid(class281.intStack[class281.intStackSize + 1]);
                        WorldMapType2.method3096(var3, var12, false);
                        return 1;
                     } else if(var0 == 6620) {
                        class281.intStackSize -= 2;
                        var3 = class281.intStack[class281.intStackSize];
                        var12 = new CoordGrid(class281.intStack[class281.intStackSize + 1]);
                        WorldMapType2.method3096(var3, var12, true);
                        return 1;
                     } else if(var0 == 6621) {
                        class281.intStackSize -= 2;
                        var3 = class281.intStack[class281.intStackSize];
                        var12 = new CoordGrid(class281.intStack[class281.intStackSize + 1]);
                        var11 = WorldMapDataGroup.method959().method3040(var3);
                        if(var11 == null) {
                           class281.intStack[++class281.intStackSize - 1] = 0;
                           return 1;
                        } else {
                           class281.intStack[++class281.intStackSize - 1] = var11.method1663(var12.z, var12.x, var12.y)?1:0;
                           return 1;
                        }
                     } else if(var0 == 6622) {
                        class281.intStack[++class281.intStackSize - 1] = WorldMapDataGroup.method959().method2974();
                        class281.intStack[++class281.intStackSize - 1] = WorldMapDataGroup.method959().method3003();
                        return 1;
                     } else if(var0 == 6623) {
                        var15 = new CoordGrid(class281.intStack[--class281.intStackSize]);
                        var13 = WorldMapDataGroup.method959().method2873(var15.z, var15.x, var15.y);
                        if(var13 == null) {
                           class281.intStack[++class281.intStackSize - 1] = -1;
                        } else {
                           class281.intStack[++class281.intStackSize - 1] = var13.method1682();
                        }

                        return 1;
                     } else if(var0 == 6624) {
                        WorldMapDataGroup.method959().method2902(class281.intStack[--class281.intStackSize]);
                        return 1;
                     } else if(var0 == 6625) {
                        WorldMapDataGroup.method959().method3009();
                        return 1;
                     } else if(var0 == 6626) {
                        WorldMapDataGroup.method959().method2925(class281.intStack[--class281.intStackSize]);
                        return 1;
                     } else if(var0 == 6627) {
                        WorldMapDataGroup.method959().method2905();
                        return 1;
                     } else {
                        boolean var10;
                        if(var0 == 6628) {
                           var10 = class281.intStack[--class281.intStackSize] == 1;
                           WorldMapDataGroup.method959().method2906(var10);
                           return 1;
                        } else if(var0 == 6629) {
                           var3 = class281.intStack[--class281.intStackSize];
                           WorldMapDataGroup.method959().method2867(var3);
                           return 1;
                        } else if(var0 == 6630) {
                           var3 = class281.intStack[--class281.intStackSize];
                           WorldMapDataGroup.method959().method2998(var3);
                           return 1;
                        } else if(var0 == 6631) {
                           WorldMapDataGroup.method959().method2909();
                           return 1;
                        } else if(var0 == 6632) {
                           var10 = class281.intStack[--class281.intStackSize] == 1;
                           WorldMapDataGroup.method959().method2959(var10);
                           return 1;
                        } else {
                           boolean var4;
                           if(var0 == 6633) {
                              class281.intStackSize -= 2;
                              var3 = class281.intStack[class281.intStackSize];
                              var4 = class281.intStack[class281.intStackSize + 1] == 1;
                              WorldMapDataGroup.method959().method2896(var3, var4);
                              return 1;
                           } else if(var0 == 6634) {
                              class281.intStackSize -= 2;
                              var3 = class281.intStack[class281.intStackSize];
                              var4 = class281.intStack[class281.intStackSize + 1] == 1;
                              WorldMapDataGroup.method959().method2946(var3, var4);
                              return 1;
                           } else if(var0 == 6635) {
                              class281.intStack[++class281.intStackSize - 1] = WorldMapDataGroup.method959().method2913()?1:0;
                              return 1;
                           } else if(var0 == 6636) {
                              var3 = class281.intStack[--class281.intStackSize];
                              class281.intStack[++class281.intStackSize - 1] = WorldMapDataGroup.method959().method2914(var3)?1:0;
                              return 1;
                           } else if(var0 == 6637) {
                              var3 = class281.intStack[--class281.intStackSize];
                              class281.intStack[++class281.intStackSize - 1] = WorldMapDataGroup.method959().method2915(var3)?1:0;
                              return 1;
                           } else if(var0 == 6638) {
                              class281.intStackSize -= 2;
                              var3 = class281.intStack[class281.intStackSize];
                              var12 = new CoordGrid(class281.intStack[class281.intStackSize + 1]);
                              var7 = WorldMapDataGroup.method959().method2918(var3, var12);
                              if(var7 == null) {
                                 class281.intStack[++class281.intStackSize - 1] = -1;
                              } else {
                                 class281.intStack[++class281.intStackSize - 1] = var7.method886();
                              }

                              return 1;
                           } else {
                              MapIcon var8;
                              if(var0 == 6639) {
                                 var8 = WorldMapDataGroup.method959().method2920();
                                 if(var8 == null) {
                                    class281.intStack[++class281.intStackSize - 1] = -1;
                                    class281.intStack[++class281.intStackSize - 1] = -1;
                                 } else {
                                    class281.intStack[++class281.intStackSize - 1] = var8.vmethod4060();
                                    class281.intStack[++class281.intStackSize - 1] = var8.field297.method886();
                                 }

                                 return 1;
                              } else if(var0 == 6640) {
                                 var8 = WorldMapDataGroup.method959().method2921();
                                 if(var8 == null) {
                                    class281.intStack[++class281.intStackSize - 1] = -1;
                                    class281.intStack[++class281.intStackSize - 1] = -1;
                                 } else {
                                    class281.intStack[++class281.intStackSize - 1] = var8.vmethod4060();
                                    class281.intStack[++class281.intStackSize - 1] = var8.field297.method886();
                                 }

                                 return 1;
                              } else {
                                 MapElementType var6;
                                 if(var0 == 6693) {
                                    var3 = class281.intStack[--class281.intStackSize];
                                    var6 = MapLabel.method2858(var3);
                                    if(var6.text == null) {
                                       class281.scriptStringStack[++class295.scriptStringStackSize - 1] = "";
                                    } else {
                                       class281.scriptStringStack[++class295.scriptStringStackSize - 1] = var6.text;
                                    }

                                    return 1;
                                 } else if(var0 == 6694) {
                                    var3 = class281.intStack[--class281.intStackSize];
                                    var6 = MapLabel.method2858(var3);
                                    class281.intStack[++class281.intStackSize - 1] = var6.textSize;
                                    return 1;
                                 } else if(var0 == 6695) {
                                    var3 = class281.intStack[--class281.intStackSize];
                                    var6 = MapLabel.method2858(var3);
                                    if(var6 == null) {
                                       class281.intStack[++class281.intStackSize - 1] = -1;
                                    } else {
                                       class281.intStack[++class281.intStackSize - 1] = var6.category;
                                    }

                                    return 1;
                                 } else if(var0 == 6696) {
                                    var3 = class281.intStack[--class281.intStackSize];
                                    var6 = MapLabel.method2858(var3);
                                    if(var6 == null) {
                                       class281.intStack[++class281.intStackSize - 1] = -1;
                                    } else {
                                       class281.intStack[++class281.intStackSize - 1] = var6.spriteId;
                                    }

                                    return 1;
                                 } else if(var0 == 6697) {
                                    class281.intStack[++class281.intStackSize - 1] = class24.scriptMapIconReference.areaId;
                                    return 1;
                                 } else if(var0 == 6698) {
                                    class281.intStack[++class281.intStackSize - 1] = class24.scriptMapIconReference.field359.method886();
                                    return 1;
                                 } else if(var0 == 6699) {
                                    class281.intStack[++class281.intStackSize - 1] = class24.scriptMapIconReference.field360.method886();
                                    return 1;
                                 } else {
                                    return 2;
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
}
