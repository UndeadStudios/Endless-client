package net.runelite.standalone;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.api.RSPreferences;

@ObfuscatedName("bt")
public class ClientOptions implements RSPreferences {
   @ObfuscatedName("bn")
   @ObfuscatedGetter(
      intValue = -1549777479
   )
   static int field1034;
   @ObfuscatedName("bs")
   @ObfuscatedSignature(
      signature = "[Llv;"
   )
   static IndexedSprite[] slStarSprites;
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      intValue = 2096624113
   )
   static int field1039;
   @ObfuscatedName("t")
   @ObfuscatedSignature(
      signature = "Lia;"
   )
   static ComponentType field1035;
   @ObfuscatedName("bl")
   static String field1037;
   @ObfuscatedName("f")
   String rememberedUsername;
   @ObfuscatedName("x")
   boolean muted;
   @ObfuscatedName("m")
   LinkedHashMap authRememberTokens;
   @ObfuscatedName("p")
   boolean hideUsername;
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      intValue = -668421335
   )
   int screenType;
   @ObfuscatedName("g")
   boolean hideRoofs;

   static {
      field1039 = 6;
   }

   ClientOptions() {
      this.screenType = 1;
      this.rememberedUsername = null;
      this.hideUsername = false;
      this.authRememberTokens = new LinkedHashMap();
      this.method1093(true);
   }

   @ObfuscatedSignature(
      signature = "(Lgx;)V"
   )
   ClientOptions(Packet var1) {
      this.screenType = 1;
      this.rememberedUsername = null;
      this.hideUsername = false;
      this.authRememberTokens = new LinkedHashMap();
      if(var1 != null && var1.payload != null) {
         int var2 = var1.readUnsignedByte();
         if(var2 >= 0 && var2 <= field1039) {
            if(var1.readUnsignedByte() == 1) {
               this.hideRoofs = true;
            }

            if(var2 > 1) {
               this.muted = var1.readUnsignedByte() == 1;
            }

            if(var2 > 3) {
               this.screenType = var1.readUnsignedByte();
            }

            if(var2 > 2) {
               int var3 = var1.readUnsignedByte();

               for(int var4 = 0; var4 < var3; ++var4) {
                  int var5 = var1.readInt();
                  int var6 = var1.readInt();
                  this.authRememberTokens.put(Integer.valueOf(var5), Integer.valueOf(var6));
               }
            }

            if(var2 > 4) {
               this.rememberedUsername = var1.method5094();
            }

            if(var2 > 5) {
               this.hideUsername = var1.method5093();
            }
         } else {
            this.method1093(true);
         }
      } else {
         this.method1093(true);
      }

   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "(ZB)V",
      garbageValue = "37"
   )
   void method1093(boolean var1) {
   }

   public void setRememberedUsername(String var1) {
      this.rememberedUsername = var1;
   }

   public String getRememberedUsername() {
      return this.rememberedUsername;
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(I)Lgx;",
      garbageValue = "823293216"
   )
   Packet method1079() {
      Packet var1 = new Packet(100);
      var1.writeByte(field1039);
      var1.writeByte(this.hideRoofs?1:0);
      var1.writeByte(this.muted?1:0);
      var1.writeByte(this.screenType);
      var1.writeByte(this.authRememberTokens.size());
      Iterator var2 = this.authRememberTokens.entrySet().iterator();

      while(var2.hasNext()) {
         Entry var3 = (Entry)var2.next();
         var1.writeInt(((Integer)var3.getKey()).intValue());
         var1.writeInt(((Integer)var3.getValue()).intValue());
      }

      var1.writeString(this.rememberedUsername != null?this.rememberedUsername:"");
      var1.method5076(this.hideUsername);
      return var1;
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      signature = "(ILcs;ZB)I",
      garbageValue = "110"
   )
   static int method1088(int var0, class314 var1, boolean var2) {
      ComponentType var3;
      if(var0 == 2700) {
         var3 = ChatHistory.method6246(class281.intStack[--class281.intStackSize]);
         class281.intStack[++class281.intStackSize - 1] = var3.linkObjType;
         return 1;
      } else if(var0 == 2701) {
         var3 = ChatHistory.method6246(class281.intStack[--class281.intStackSize]);
         if(var3.linkObjType != -1) {
            class281.intStack[++class281.intStackSize - 1] = var3.linkObjCount;
         } else {
            class281.intStack[++class281.intStackSize - 1] = 0;
         }

         return 1;
      } else if(var0 == 2702) {
         int var5 = class281.intStack[--class281.intStackSize];
         SubInterface var4 = (SubInterface) client.subInterfaces.method6335((long)var5);
         if(var4 != null) {
            class281.intStack[++class281.intStackSize - 1] = 1;
         } else {
            class281.intStack[++class281.intStackSize - 1] = 0;
         }

         return 1;
      } else if(var0 == 2706) {
         class281.intStack[++class281.intStackSize - 1] = client.toplevel;
         return 1;
      } else {
         return 2;
      }
   }

   @ObfuscatedName("gp")
   @ObfuscatedSignature(
      signature = "(IIIII)V",
      garbageValue = "-207542285"
   )
   static final void method1092(int var0, int var1, int var2, int var3) {
      OwnWorldComparator.method69();
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "(Liz;B)V",
      garbageValue = "-77"
   )
   public static void method1094(Js5Index var0) {
      Overlay.overlay_ref = var0;
   }

   @ObfuscatedName("t")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;I)V",
      garbageValue = "2111120092"
   )
   static final void method1090(String var0) {
      TcpConnectionMessage var1 = class232.method4535(ClientProt.field2228, client.serverConnection.isaac);
      var1.packetBuffer.writeByte(OwnWorldComparator.method73(var0));
      var1.packetBuffer.writeString(var0);
      client.serverConnection.method18(var1);
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1933982131"
   )
   protected static final void method1077() {
      class236.timer.vmethod6050();

      int var0;
      for(var0 = 0; var0 < 32; ++var0) {
         GameEngine.field455[var0] = 0L;
      }

      for(var0 = 0; var0 < 32; ++var0) {
         GameEngine.field456[var0] = 0L;
      }

      GameEngine.field463 = 0;
   }

   @ObfuscatedName("gi")
   @ObfuscatedSignature(
      signature = "(Lbq;II)V",
      garbageValue = "-1695132399"
   )
   static final void method1095(PathingEntity var0, int var1) {
      Sequence var2;
      int var11;
      if(var0.field985 > client.gameCycle) {
         Item.method4637(var0);
      } else if(var0.field986 >= client.gameCycle) {
         class331.method6415(var0);
      } else {
         var0.poseAnimation = var0.idlePoseAnimation;
         if(var0.queueSize == 0) {
            var0.field997 = 0;
         } else {
            label404: {
               if(var0.animation != -1 && var0.actionAnimationDisable == 0) {
                  var2 = AuthProt.method6374(var0.animation);
                  if(var0.field950 > 0 && var2.precedenceAnimating == 0) {
                     ++var0.field997;
                     break label404;
                  }

                  if(var0.field950 <= 0 && var2.priority == 0) {
                     ++var0.field997;
                     break label404;
                  }
               }

               var11 = var0.x * -1234429701;
               int var12 = var0.y;
               int var4 = var0.pathX[var0.queueSize - 1] * 128 + var0.size * 64;
               int var5 = var0.pathY[var0.queueSize - 1] * 128 + var0.size * 64;
               if(var11 < var4) {
                  if(var12 < var5) {
                     var0.orientation = 1280;
                  } else if(var12 > var5) {
                     var0.orientation = 1792;
                  } else {
                     var0.orientation = 1536;
                  }
               } else if(var11 > var4) {
                  if(var12 < var5) {
                     var0.orientation = 768;
                  } else if(var12 > var5) {
                     var0.orientation = 256;
                  } else {
                     var0.orientation = 512;
                  }
               } else if(var12 < var5) {
                  var0.orientation = 1024;
               } else if(var12 > var5) {
                  var0.orientation = 0;
               }

               byte var6 = var0.pathTraversed[var0.queueSize - 1];
               if(var4 - var11 <= 256 && var4 - var11 >= -256 && var5 - var12 <= 256 && var5 - var12 >= -256) {
                  int var7 = var0.orientation - var0.angle & 2047;
                  if(var7 > 1024) {
                     var7 -= 2048;
                  }

                  int var8 = var0.rotate180Anim;
                  if(var7 >= -256 && var7 <= 256) {
                     var8 = var0.walkAnim;
                  } else if(var7 >= 256 && var7 < 768) {
                     var8 = var0.rotate270Anim;
                  } else if(var7 >= -768 && var7 <= -256) {
                     var8 = var0.rotate90Anim;
                  }

                  if(var8 == -1) {
                     var8 = var0.walkAnim;
                  }

                  var0.poseAnimation = var8;
                  int var9 = 4;
                  boolean var10 = true;
                  if(var0 instanceof NPCEntity) {
                     var10 = ((NPCEntity)var0).type.isClippedMovement;
                  }

                  if(var10) {
                     if(var0.angle != var0.orientation && var0.interacting == -1 && var0.direction != 0) {
                        var9 = 2;
                     }

                     if(var0.queueSize > 2) {
                        var9 = 6;
                     }

                     if(var0.queueSize > 3) {
                        var9 = 8;
                     }

                     if(var0.field997 > 0 && var0.queueSize > 1) {
                        var9 = 8;
                        --var0.field997;
                     }
                  } else {
                     if(var0.queueSize > 1) {
                        var9 = 6;
                     }

                     if(var0.queueSize > 2) {
                        var9 = 8;
                     }

                     if(var0.field997 > 0 && var0.queueSize > 1) {
                        var9 = 8;
                        --var0.field997;
                     }
                  }

                  if(var6 == 2) {
                     var9 <<= 1;
                  }

                  if(var9 >= 8 && var0.poseAnimation == var0.walkAnim && var0.field968 != -1) {
                     var0.poseAnimation = var0.field968;
                  }

                  if(var4 != var11 || var12 != var5) {
                     if(var11 < var4) {
                        var0.x += 451031603 * var9;
                        if(var0.x * -1234429701 > var4) {
                           var0.x = var4 * 451031603;
                        }
                     } else if(var11 > var4) {
                        var0.x -= var9 * 451031603;
                        if(var0.x * -1234429701 < var4) {
                           var0.x = var4 * 451031603;
                        }
                     }

                     if(var12 < var5) {
                        var0.y += var9;
                        if(var0.y > var5) {
                           var0.y = var5;
                        }
                     } else if(var12 > var5) {
                        var0.y -= var9;
                        if(var0.y < var5) {
                           var0.y = var5;
                        }
                     }
                  }

                  if(var0.x * -1234429701 == var4 && var5 == var0.y) {
                     --var0.queueSize;
                     if(var0.field950 > 0) {
                        --var0.field950;
                     }
                  }
               } else {
                  var0.x = var4 * 451031603;
                  var0.y = var5;
                  --var0.queueSize;
                  if(var0.field950 > 0) {
                     --var0.field950;
                  }
               }
            }
         }
      }

      if(var0.x * -1234429701 < 128 || var0.y < 128 || var0.x * -1234429701 >= 13184 || var0.y >= 13184) {
         var0.animation = -1;
         var0.animationChanged(-1);
         var0.graphic = -1;
         var0.graphicChanged(-1);
         var0.field985 = 0;
         var0.field986 = 0;
         var0.x = var0.pathX[0] * 1897470336 + var0.size * -1198748480;
         var0.y = var0.pathY[0] * 128 + var0.size * 64;
         var0.method2453();
      }

      if(class71.localPlayer == var0 && (var0.x * -1234429701 < 1536 || var0.y < 1536 || var0.x * -1234429701 >= 11776 || var0.y >= 11776)) {
         var0.animation = -1;
         var0.animationChanged(-1);
         var0.graphic = -1;
         var0.graphicChanged(-1);
         var0.field985 = 0;
         var0.field986 = 0;
         var0.x = var0.pathX[0] * 1897470336 + var0.size * -1198748480;
         var0.y = var0.pathY[0] * 128 + var0.size * 64;
         var0.method2453();
      }

      SubInterface.method2713(var0);
      var0.field941 = false;
      if(var0.poseAnimation != -1) {
         var2 = AuthProt.method6374(var0.poseAnimation);
         if(var2 != null && var2.frameIDs != null) {
            ++var0.field970;
            if(var0.poseFrame < var2.frameIDs.length && var0.field970 > var2.frameLengths[var0.poseFrame]) {
               var0.field970 = 1;
               ++var0.poseFrame;
               WorldMapDecoration.method2084(var2, var0.poseFrame, var0.x * -1234429701, var0.y);
            }

            if(var0.poseFrame >= var2.frameIDs.length) {
               var0.field970 = 0;
               var0.poseFrame = 0;
               WorldMapDecoration.method2084(var2, var0.poseFrame, var0.x * -1234429701, var0.y);
            }
         } else {
            var0.poseAnimation = -1;
         }
      }

      if(var0.graphic != -1 && client.gameCycle >= var0.graphicsDelay) {
         if(var0.spotAnimFrame < 0) {
            var0.spotAnimFrame = 0;
         }

         var11 = SoundTask.method6414(var0.graphic).field3358;
         if(var11 != -1) {
            Sequence var3 = AuthProt.method6374(var11);
            if(var3 != null && var3.frameIDs != null) {
               ++var0.spotAnimFrameCycle;
               if(var0.spotAnimFrame < var3.frameIDs.length && var0.spotAnimFrameCycle > var3.frameLengths[var0.spotAnimFrame]) {
                  var0.spotAnimFrameCycle = 1;
                  ++var0.spotAnimFrame;
                  WorldMapDecoration.method2084(var3, var0.spotAnimFrame, var0.x * -1234429701, var0.y);
               }

               if(var0.spotAnimFrame >= var3.frameIDs.length && (var0.spotAnimFrame < 0 || var0.spotAnimFrame >= var3.frameIDs.length)) {
                  var0.graphic = -1;
                  var0.graphicChanged(-1);
               }
            } else {
               var0.graphic = -1;
               var0.graphicChanged(-1);
            }
         } else {
            var0.graphic = -1;
            var0.graphicChanged(-1);
         }
      }

      if(var0.animation != -1 && var0.actionAnimationDisable <= 1) {
         var2 = AuthProt.method6374(var0.animation);
         if(var2.precedenceAnimating == 1 && var0.field950 > 0 && var0.field985 <= client.gameCycle && var0.field986 < client.gameCycle) {
            var0.actionAnimationDisable = 1;
            return;
         }
      }

      if(var0.animation != -1 && var0.actionAnimationDisable == 0) {
         var2 = AuthProt.method6374(var0.animation);
         if(var2 != null && var2.frameIDs != null) {
            ++var0.actionFrameCycle;
            if(var0.actionFrame < var2.frameIDs.length && var0.actionFrameCycle > var2.frameLengths[var0.actionFrame]) {
               var0.actionFrameCycle = 1;
               ++var0.actionFrame;
               WorldMapDecoration.method2084(var2, var0.actionFrame, var0.x * -1234429701, var0.y);
            }

            if(var0.actionFrame >= var2.frameIDs.length) {
               var0.actionFrame -= var2.frameStep;
               ++var0.field975;
               if(var0.field975 >= var2.maxLoops) {
                  var0.animation = -1;
                  var0.animationChanged(-1);
               } else if(var0.actionFrame >= 0 && var0.actionFrame < var2.frameIDs.length) {
                  WorldMapDecoration.method2084(var2, var0.actionFrame, var0.x * -1234429701, var0.y);
               } else {
                  var0.animation = -1;
                  var0.animationChanged(-1);
               }
            }

            var0.field941 = var2.stretches;
         } else {
            var0.animation = -1;
            var0.animationChanged(-1);
         }
      }

      if(var0.actionAnimationDisable > 0) {
         --var0.actionAnimationDisable;
      }

   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(IIII)I",
      garbageValue = "1686363362"
   )
   public static int method1076(int var0, int var1, int var2) {
      var2 &= 3;
      return var2 == 0?var1:(var2 == 1?7 - var0:(var2 == 2?7 - var1:var0));
   }
}
