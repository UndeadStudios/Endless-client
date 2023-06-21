package net.runelite.standalone;

import net.runelite.api.events.ItemQuantityChanged;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.api.RSItem;
import net.runelite.rs.api.RSTile;

@ObfuscatedName("cb")
public final class Item extends Entity implements RSItem {
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = -148901199
   )
   public static int field1222;
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      intValue = 1683486297
   )
   int id;
   public int rl$sceneY;
   public int rl$sceneX;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = 729993939
   )
   int quantity;

   Item() {
      this.rl$$init();
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "(I)Ldv;"
   )
   protected final Model vmethod6001(int var1) {
      return class79.method1074(this.id).method2220(this.quantity);
   }

   public void onUnlink() {
      if(this.rl$sceneX != -1 && ItemContainer.clientInstance.getLastItemDespawn() == null) {
         ItemContainer.clientInstance.setLastItemDespawn(this);
      }

   }

   private void rl$$init() {
      this.rl$sceneX = -1;
      this.rl$sceneY = -1;
   }

   public int getId() {
      return this.id;
   }

   public int getQuantity() {
      return this.quantity;
   }

   public net.runelite.api.Tile getTile() {
      int var1 = this.rl$sceneX;
      int var2 = this.rl$sceneY;
      if(var1 != -1 && var2 != -1) {
         RSTile[][][] var3 = ItemContainer.clientInstance.getScene().getTiles();
         RSTile var4 = var3[ItemContainer.clientInstance.getPlane()][var1][var2];
         return var4;
      } else {
         return null;
      }
   }

   public void quantityChanged(int var1) {
      if(this.rl$sceneX != -1) {
         ItemContainer.clientInstance.getLogger().debug("Item quantity changed: {} ({} -> {})", new Object[]{Integer.valueOf(this.getId()), Integer.valueOf(this.getQuantity()), Integer.valueOf(var1)});
         ItemQuantityChanged var2 = new ItemQuantityChanged(this, this.getTile(), this.getQuantity(), var1);
         ItemContainer.clientInstance.getCallbacks().post(var2);
      }

   }

   public int getX() {
      return this.rl$sceneX;
   }

   public void setX(int var1) {
      this.rl$sceneX = var1;
   }

   public int getY() {
      return this.rl$sceneY;
   }

   public void setY(int var1) {
      this.rl$sceneY = var1;
   }

   public void setId(int var1) {
      this.id = var1;
   }

   public void setQuantity(int var1) {
      this.quantity = var1;
   }

   @ObfuscatedName("iz")
   @ObfuscatedSignature(
      signature = "(IIIIIIIII)V",
      garbageValue = "-1624521615"
   )
   static final void method4636(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      if(ChatLine.method5915(var0)) {
         GrandExchangeOffer.field69 = null;
         MouseRecorder.method128(ComponentType.interfaces[var0], -1, var1, var2, var3, var4, var5, var6, var7);
         if(GrandExchangeOffer.field69 != null) {
            MouseRecorder.method128(GrandExchangeOffer.field69, -1412584499, var1, var2, var3, var4, WorldMapType2.field286, MouseInput.field499, var7);
            GrandExchangeOffer.field69 = null;
         }

      } else {
         if(var7 != -1) {
            client.field795[var7] = true;
         } else {
            for(int var8 = 0; var8 < 100; ++var8) {
               client.field795[var8] = true;
            }
         }

      }
   }

   @ObfuscatedName("aa")
   @ObfuscatedSignature(
      signature = "(ILcs;ZI)I",
      garbageValue = "599221667"
   )
   static int method4638(int var0, class314 var1, boolean var2) {
      String var3;
      if(var0 == 3100) {
         var3 = class281.scriptStringStack[--class295.scriptStringStackSize];
         KeyFocusListener.method5934(0, "", var3);
         return 1;
      } else if(var0 == 3101) {
         class281.intStackSize -= 2;
         class135.method1989(class71.localPlayer, class281.intStack[class281.intStackSize], class281.intStack[class281.intStackSize + 1]);
         return 1;
      } else if(var0 == 3103) {
         if(!class281.field1079) {
            class281.field1078 = true;
         }

         return 1;
      } else {
         int var10;
         if(var0 == 3104) {
            var3 = class281.scriptStringStack[--class295.scriptStringStackSize];
            var10 = 0;
            if(Entity.method1813(var3)) {
               var10 = HeadbarType.method2073(var3);
            }

            TcpConnectionMessage var12 = class232.method4535(ClientProt.field2283, client.serverConnection.isaac);
            var12.packetBuffer.writeInt(var10);
            client.serverConnection.method18(var12);
            return 1;
         } else {
            TcpConnectionMessage var14;
            if(var0 == 3105) {
               var3 = class281.scriptStringStack[--class295.scriptStringStackSize];
               var14 = class232.method4535(ClientProt.field2314, client.serverConnection.isaac);
               var14.packetBuffer.writeByte(var3.length() + 1);
               var14.packetBuffer.writeString(var3);
               client.serverConnection.method18(var14);
               return 1;
            } else if(var0 == 3106) {
               var3 = class281.scriptStringStack[--class295.scriptStringStackSize];
               var14 = class232.method4535(ClientProt.field2227, client.serverConnection.isaac);
               var14.packetBuffer.writeByte(var3.length() + 1);
               var14.packetBuffer.writeString(var3);
               client.serverConnection.method18(var14);
               return 1;
            } else {
               String var7;
               int var15;
               if(var0 == 3107) {
                  var15 = class281.intStack[--class281.intStackSize];
                  var7 = class281.scriptStringStack[--class295.scriptStringStackSize];
                  VarClientType.method4267(var15, var7);
                  return 1;
               } else if(var0 == 3108) {
                  class281.intStackSize -= 3;
                  var15 = class281.intStack[class281.intStackSize];
                  var10 = class281.intStack[class281.intStackSize + 1];
                  int var9 = class281.intStack[class281.intStackSize + 2];
                  ComponentType var13 = ChatHistory.method6246(var9);
                  class125.method1856(var13, var15, var10);
                  return 1;
               } else if(var0 == 3109) {
                  class281.intStackSize -= 2;
                  var15 = class281.intStack[class281.intStackSize];
                  var10 = class281.intStack[class281.intStackSize + 1];
                  ComponentType var11 = var2?ClientOptions.field1035:class290.field1119;
                  class125.method1856(var11, var15, var10);
                  return 1;
               } else if(var0 == 3110) {
                  TextureProvider.middleMouseMovesCamera = class281.intStack[--class281.intStackSize] == 1;
                  return 1;
               } else if(var0 == 3111) {
                  class281.intStack[++class281.intStackSize - 1] = class312.options.hideRoofs?1:0;
                  return 1;
               } else if(var0 == 3112) {
                  class312.options.hideRoofs = class281.intStack[--class281.intStackSize] == 1;
                  class72.method1041();
                  return 1;
               } else if(var0 == 3113) {
                  var3 = class281.scriptStringStack[--class295.scriptStringStackSize];
                  boolean var4 = class281.intStack[--class281.intStackSize] == 1;
                  class129.method1898(var3, var4, false);
                  return 1;
               } else if(var0 == 3115) {
                  var15 = class281.intStack[--class281.intStackSize];
                  var14 = class232.method4535(ClientProt.field2261, client.serverConnection.isaac);
                  var14.packetBuffer.writeShort(var15);
                  client.serverConnection.method18(var14);
                  return 1;
               } else if(var0 == 3116) {
                  var15 = class281.intStack[--class281.intStackSize];
                  class295.scriptStringStackSize -= 2;
                  var7 = class281.scriptStringStack[class295.scriptStringStackSize];
                  String var5 = class281.scriptStringStack[class295.scriptStringStackSize + 1];
                  if(var7.length() > 500) {
                     return 1;
                  } else if(var5.length() > 500) {
                     return 1;
                  } else {
                     TcpConnectionMessage var6 = class232.method4535(ClientProt.field2320, client.serverConnection.isaac);
                     var6.packetBuffer.writeShort(1 + OwnWorldComparator.method73(var7) + OwnWorldComparator.method73(var5));
                     var6.packetBuffer.writeString(var7);
                     var6.packetBuffer.writeByte(var15);
                     var6.packetBuffer.writeString(var5);
                     client.serverConnection.method18(var6);
                     return 1;
                  }
               } else if(var0 == 3117) {
                  client.field660 = class281.intStack[--class281.intStackSize] == 1;
                  return 1;
               } else if(var0 == 3118) {
                  client.field699 = class281.intStack[--class281.intStackSize] == 1;
                  return 1;
               } else if(var0 == 3119) {
                  client.field768 = class281.intStack[--class281.intStackSize] == 1;
                  return 1;
               } else if(var0 == 3120) {
                  if(class281.intStack[--class281.intStackSize] == 1) {
                     client.playerNameMask |= 1;
                  } else {
                     client.playerNameMask &= -2;
                  }

                  return 1;
               } else if(var0 == 3121) {
                  if(class281.intStack[--class281.intStackSize] == 1) {
                     client.playerNameMask |= 2;
                  } else {
                     client.playerNameMask &= -3;
                  }

                  return 1;
               } else if(var0 == 3122) {
                  if(class281.intStack[--class281.intStackSize] == 1) {
                     client.playerNameMask |= 4;
                  } else {
                     client.playerNameMask &= -5;
                  }

                  return 1;
               } else if(var0 == 3123) {
                  if(class281.intStack[--class281.intStackSize] == 1) {
                     client.playerNameMask |= 8;
                  } else {
                     client.playerNameMask &= -9;
                  }

                  return 1;
               } else if(var0 == 3124) {
                  client.playerNameMask = 0;
                  return 1;
               } else if(var0 == 3125) {
                  client.field754 = class281.intStack[--class281.intStackSize] == 1;
                  return 1;
               } else if(var0 == 3126) {
                  client.field764 = class281.intStack[--class281.intStackSize] == 1;
                  return 1;
               } else if(var0 == 3127) {
                  class205.method4005(class281.intStack[--class281.intStackSize] == 1);
                  return 1;
               } else if(var0 == 3128) {
                  class281.intStack[++class281.intStackSize - 1] = class71.method1032()?1:0;
                  return 1;
               } else if(var0 == 3129) {
                  class281.intStackSize -= 2;
                  client.field788 = class281.intStack[class281.intStackSize];
                  client.field730 = class281.intStack[class281.intStackSize + 1];
                  return 1;
               } else if(var0 == 3130) {
                  class281.intStackSize -= 2;
                  return 1;
               } else if(var0 == 3131) {
                  --class281.intStackSize;
                  return 1;
               } else if(var0 == 3132) {
                  class281.intStack[++class281.intStackSize - 1] = GrandExchangeOffer.canvasWidth;
                  class281.intStack[++class281.intStackSize - 1] = class258.canvasHeight;
                  return 1;
               } else if(var0 == 3133) {
                  --class281.intStackSize;
                  return 1;
               } else if(var0 == 3134) {
                  return 1;
               } else if(var0 == 3135) {
                  class281.intStackSize -= 2;
                  return 1;
               } else if(var0 == 3136) {
                  client.field858 = 3;
                  client.field812 = class281.intStack[--class281.intStackSize];
                  return 1;
               } else if(var0 == 3137) {
                  client.field858 = 2;
                  client.field812 = class281.intStack[--class281.intStackSize];
                  return 1;
               } else if(var0 == 3138) {
                  client.field858 = 0;
                  return 1;
               } else if(var0 == 3139) {
                  client.field858 = 1;
                  return 1;
               } else if(var0 == 3140) {
                  client.field858 = 3;
                  client.field812 = var2?ClientOptions.field1035.id:class290.field1119.id;
                  return 1;
               } else {
                  boolean var8;
                  if(var0 == 3141) {
                     var8 = class281.intStack[--class281.intStackSize] == 1;
                     class312.options.hideUsername = var8;
                     class72.method1041();
                     return 1;
                  } else if(var0 == 3142) {
                     class281.intStack[++class281.intStackSize - 1] = class312.options.hideUsername?1:0;
                     return 1;
                  } else if(var0 == 3143) {
                     var8 = class281.intStack[--class281.intStackSize] == 1;
                     client.Login_isUsernameRemembered = var8;
                     if(!var8) {
                        class312.options.rememberedUsername = "";
                        class72.method1041();
                     }

                     return 1;
                  } else if(var0 == 3144) {
                     class281.intStack[++class281.intStackSize - 1] = client.Login_isUsernameRemembered?1:0;
                     return 1;
                  } else if(var0 == 3145) {
                     return 1;
                  } else if(var0 == 3146) {
                     var8 = class281.intStack[--class281.intStackSize] == 1;
                     if(var8 == class312.options.muted) {
                        class312.options.muted = !var8;
                        class72.method1041();
                     }

                     return 1;
                  } else if(var0 == 3147) {
                     class281.intStack[++class281.intStackSize - 1] = class312.options.muted?0:1;
                     return 1;
                  } else if(var0 == 3148) {
                     return 1;
                  } else if(var0 == 3149) {
                     class281.intStack[++class281.intStackSize - 1] = 0;
                     return 1;
                  } else if(var0 == 3150) {
                     class281.intStack[++class281.intStackSize - 1] = 0;
                     return 1;
                  } else if(var0 == 3151) {
                     class281.intStack[++class281.intStackSize - 1] = 0;
                     return 1;
                  } else if(var0 == 3152) {
                     class281.intStack[++class281.intStackSize - 1] = 0;
                     return 1;
                  } else {
                     return 2;
                  }
               }
            }
         }
      }
   }

   @ObfuscatedName("az")
   @ObfuscatedSignature(
      signature = "(ILcs;ZI)I",
      garbageValue = "-1971585838"
   )
   static int method4635(int var0, class314 var1, boolean var2) {
      if(var0 == 6200) {
         class281.intStackSize -= 2;
         client.field899 = (short)class44.method671(class281.intStack[class281.intStackSize]);
         if(client.field899 <= 0) {
            client.field899 = 256;
         }

         client.field900 = (short)class44.method671(class281.intStack[class281.intStackSize + 1]);
         if(client.field900 <= 0) {
            client.field900 = 256;
         }

         return 1;
      } else if(var0 == 6201) {
         class281.intStackSize -= 2;
         client.field901 = (short)class281.intStack[class281.intStackSize];
         if(client.field901 <= 0) {
            client.field901 = 256;
         }

         client.field902 = (short)class281.intStack[class281.intStackSize + 1];
         if(client.field902 <= 0) {
            client.field902 = 320;
         }

         return 1;
      } else if(var0 == 6202) {
         class281.intStackSize -= 4;
         client.field903 = (short)class281.intStack[class281.intStackSize];
         if(client.field903 <= 0) {
            client.field903 = 1;
         }

         client.field872 = (short)class281.intStack[class281.intStackSize + 1];
         if(client.field872 <= 0) {
            client.field872 = 32767;
         } else if(client.field872 < client.field903) {
            client.field872 = client.field903;
         }

         client.field905 = (short)class281.intStack[class281.intStackSize + 2];
         if(client.field905 <= 0) {
            client.field905 = 1;
         }

         client.field906 = (short)class281.intStack[class281.intStackSize + 3];
         if(client.field906 <= 0) {
            client.field906 = 32767;
         } else if(client.field906 < client.field905) {
            client.field906 = client.field905;
         }

         return 1;
      } else if(var0 == 6203) {
         if(client.field821 != null) {
            class7.method111(0, 0, client.field821.width, client.field821.height, false);
            class281.intStack[++class281.intStackSize - 1] = client.viewportWidth;
            class281.intStack[++class281.intStackSize - 1] = client.viewportHeight;
         } else {
            class281.intStack[++class281.intStackSize - 1] = -1;
            class281.intStack[++class281.intStackSize - 1] = -1;
         }

         return 1;
      } else if(var0 == 6204) {
         class281.intStack[++class281.intStackSize - 1] = client.field901;
         class281.intStack[++class281.intStackSize - 1] = client.field902;
         return 1;
      } else if(var0 == 6205) {
         class281.intStack[++class281.intStackSize - 1] = class69.method977(client.field899);
         class281.intStack[++class281.intStackSize - 1] = class69.method977(client.field900);
         return 1;
      } else {
         return 2;
      }
   }

   @ObfuscatedName("gy")
   @ObfuscatedSignature(
      signature = "(Lbq;I)V",
      garbageValue = "-1308361213"
   )
   static final void method4637(PathingEntity var0) {
      int var1 = var0.field985 - client.gameCycle;
      int var2 = var0.field981 * 128 + var0.size * 64;
      int var3 = var0.field983 * 128 + var0.size * 64;
      var0.x += (var2 - var0.x * -1234429701) / var1 * 451031603;
      var0.y += (var3 - var0.y) / var1;
      var0.field997 = 0;
      var0.orientation = var0.field987;
   }
}
