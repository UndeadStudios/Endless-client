package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.api.RSNPCComposition;

@ObfuscatedName("ip")
public enum class302 implements Enumerated {
   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "Lip;"
   )
   field3302(1, 0),
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "Lip;"
   )
   field3303(0, 1),
   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "Lip;"
   )
   field3304(2, 2);

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "Lld;"
   )
   static SpritePixels leftBackground;
   @ObfuscatedName("kv")
   @ObfuscatedGetter(
      intValue = -1212826191
   )
   static int field3309;
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = 660354315
   )
   public final int field3305;
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      intValue = 1207301413
   )
   final int field3306;

   class302(int var3, int var4) {
      this.field3305 = var3;
      this.field3306 = var4;
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "-303219076"
   )
   public int vmethod6373() {
      return this.field3306;
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "(I)Lbu;",
      garbageValue = "1820483180"
   )
   static World method6066() {
      return World.field1011 < World.worldCount?class242.worldList[++World.field1011 - 1]:null;
   }

   @ObfuscatedName("hl")
   @ObfuscatedSignature(
      signature = "(ZLge;I)V",
      garbageValue = "2006083218"
   )
   static final void method6070(boolean var0, Bit var1) {
      client.updateNpcs(var0, var1);
      client.npcsToRemoveCount = 0;
      client.extendedInfoNpcCount = 0;
      class44.method672();
      DecorativeObject.method914(var0, var1);

      int var2;
      int var3;
      for(var2 = 0; var2 < client.extendedInfoNpcCount; ++var2) {
         var3 = client.extendedInfoNpcIndexes[var2];
         NPCEntity var4 = client.npcs[var3];
         int var5 = var1.readUnsignedByte();
         if((var5 & 1) != 0) {
            var4.interacting = var1.method5309();
            var4.interactingChanged(-1);
            if(var4.interacting == 65535) {
               var4.interacting = -1;
               var4.interactingChanged(-1);
            }
         }

         int var6;
         int var7;
         int var8;
         int var9;
         if((var5 & 64) != 0) {
            var6 = var1.method5281();
            var7 = var1.method5281();
            var8 = var4.x * -1234429701 - (var6 - class53.baseX - class53.baseX) * 64;
            var9 = var4.y - (var7 - class312.baseY - class312.baseY) * 64;
            if(var8 != 0 || var9 != 0) {
               var4.facingCoord = (int)(Math.atan2((double)var8, (double)var9) * 325.949D) & 2047;
            }
         }

         if((var5 & 32) != 0) {
            var6 = var1.readUnsignedShort();
            if(var6 == 65535) {
               var6 = -1;
            }

            var7 = var1.method5117();
            if(var6 == var4.animation && var6 != -1) {
               var8 = AuthProt.method6374(var6).replyMode;
               if(var8 == 1) {
                  var4.actionFrame = 0;
                  var4.actionFrameCycle = 0;
                  var4.actionAnimationDisable = var7;
                  var4.field975 = 0;
               }

               if(var8 == 2) {
                  var4.field975 = 0;
               }
            } else if(var6 == -1 || var4.animation == -1 || AuthProt.method6374(var6).forcedPriority >= AuthProt.method6374(var4.animation).forcedPriority) {
               var4.animation = var6;
               var4.animationChanged(-1);
               var4.actionFrame = 0;
               var4.actionFrameCycle = 0;
               var4.actionAnimationDisable = var7;
               var4.field975 = 0;
               var4.field950 = var4.queueSize;
            }
         }

         if((var5 & 4) != 0) {
            NPCType var10001 = ZoneProt.method374(var1.readUnsignedShort());
            var4.onCompositionChanged((RSNPCComposition)var10001);
            var4.type = var10001;
            var4.size = var4.type.size;
            var4.direction = var4.type.rotation;
            var4.walkAnim = var4.type.walkAnim;
            var4.rotate180Anim = var4.type.rotate180Anim;
            var4.rotate90Anim = var4.type.rotate90Anim;
            var4.rotate270Anim = var4.type.rotate270Anim;
            var4.idlePoseAnimation = var4.type.idleAnim;
            var4.field945 = var4.type.field3578;
            var4.field946 = var4.type.field3575;
         }

         if((var5 & 16) != 0) {
            var6 = var1.readUnsignedByteC();
            int var10;
            int var11;
            int var12;
            if(var6 > 0) {
               for(var7 = 0; var7 < var6; ++var7) {
                  var9 = -1;
                  var10 = -1;
                  var11 = -1;
                  var8 = var1.method5269();
                  if(var8 == 32767) {
                     var8 = var1.method5269();
                     var10 = var1.method5269();
                     var9 = var1.method5269();
                     var11 = var1.method5269();
                  } else if(var8 != 32766) {
                     var10 = var1.method5269();
                  } else {
                     var8 = -1;
                  }

                  var12 = var1.method5269();
                  var4.method2452(var8, var10, var9, var11, client.gameCycle, var12);
               }
            }

            var7 = var1.method5115();
            if(var7 > 0) {
               for(var8 = 0; var8 < var7; ++var8) {
                  var9 = var1.method5269();
                  var10 = var1.method5269();
                  if(var10 != 32767) {
                     var11 = var1.method5269();
                     var12 = var1.readUnsignedByte();
                     int var13 = var10 > 0?var1.method5117():var12;
                     var4.method2456(var9, client.gameCycle, var10, var11, var12, var13);
                  } else {
                     var4.method2457(var9);
                  }
               }
            }
         }

         if((var5 & 8) != 0) {
            var4.graphic = var1.method5309();
            var4.graphicChanged(-1);
            var6 = var1.method5133();
            var4.field992 = var6 >> 16;
            var4.graphicsDelay = (var6 & 65535) + client.gameCycle;
            var4.spotAnimFrame = 0;
            var4.spotAnimFrameCycle = 0;
            if(var4.graphicsDelay > client.gameCycle) {
               var4.spotAnimFrame = -1;
            }

            if(var4.graphic == 65535) {
               var4.graphic = -1;
               var4.graphicChanged(-1);
            }
         }

         if((var5 & 2) != 0) {
            var4.overhead = var1.readString();
            var4.overheadTextChanged(-1);
            var4.overheadTextCyclesRemaining = 100;
         }

         if ((var5 & 0x80) != 0) {//options
            int mask = var1.readUnsignedByte();//read unsigned byte
            String[] options = var4.type.changedOptions;
            for (int i = 0; i < 5; i++) {
               if ((mask >> i & 0x1) != 0) {
                  options[i] = var1.readString();//read string.
               }
            }
         }
      }

      for(var2 = 0; var2 < client.npcsToRemoveCount; ++var2) {
         var3 = client.npcIndexesToRemove[var2];
         if(client.npcs[var3].lastUpdatedAt != client.gameCycle) {
            NPCEntity var10000 = client.npcs[var3];
            client.npcs[var3].onCompositionChanged((RSNPCComposition)null);
            var10000.type = null;
            client.npcs[var3] = null;
            client.cachedNPCsChanged(var3);
         }
      }

      if(var1.offset != client.serverConnection.currentPacketSize) {
         throw new RuntimeException(var1.offset + "," + client.serverConnection.currentPacketSize);
      } else {
         for(var2 = 0; var2 < client.highResolutionNpcCount; ++var2) {
            if(client.npcs[client.highResolutionNpcIndexes[var2]] == null) {
               throw new RuntimeException(var2 + "," + client.highResolutionNpcCount);
            }
         }

      }
   }
}
