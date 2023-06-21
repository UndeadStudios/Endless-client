package net.runelite.standalone;

import net.runelite.api.widgets.JavaScriptCallback;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ar")
public class class258 {
   @ObfuscatedName("rt")
   @ObfuscatedSignature(
      signature = "Lbc;"
   )
   public static FriendManager friendManager;
   @ObfuscatedName("hh")
   @ObfuscatedGetter(
      intValue = 1471454883
   )
   static int cameraX;
   @ObfuscatedName("dq")
   @ObfuscatedSignature(
      signature = "Lfq;"
   )
   static class323 rssocket;
   @ObfuscatedName("j")
   @ObfuscatedGetter(
      intValue = -1092194399
   )
   public static int canvasHeight;
   @ObfuscatedName("bu")
   @ObfuscatedSignature(
      signature = "[Lld;"
   )
   static SpritePixels[] field357;
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      intValue = 328778211
   )
   int field351;
   @ObfuscatedName("s")
   byte[][][] field348;

   class258(int var1) {
      this.field351 = var1;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "452761503"
   )
   void method4832() {
      byte[] var1 = new byte[this.field351 * this.field351];
      int var2 = 0;

      int var3;
      int var4;
      for(var3 = this.field351 - 1; var3 >= 0; --var3) {
         for(var4 = 0; var4 < this.field351; ++var4) {
            if(var4 <= var3 >> 1) {
               var1[var2] = -1;
            }

            ++var2;
         }
      }

      this.field348[1][0] = var1;
      var1 = new byte[this.field351 * this.field351];
      var2 = 0;

      for(var3 = 0; var3 < this.field351; ++var3) {
         for(var4 = 0; var4 < this.field351; ++var4) {
            if(var2 >= 0 && var2 < var1.length) {
               if(var4 >= var3 << 1) {
                  var1[var2] = -1;
               }

               ++var2;
            } else {
               ++var2;
            }
         }
      }

      this.field348[1][1] = var1;
      var1 = new byte[this.field351 * this.field351];
      var2 = 0;

      for(var3 = 0; var3 < this.field351; ++var3) {
         for(var4 = this.field351 - 1; var4 >= 0; --var4) {
            if(var4 <= var3 >> 1) {
               var1[var2] = -1;
            }

            ++var2;
         }
      }

      this.field348[1][2] = var1;
      var1 = new byte[this.field351 * this.field351];
      var2 = 0;

      for(var3 = this.field351 - 1; var3 >= 0; --var3) {
         for(var4 = this.field351 - 1; var4 >= 0; --var4) {
            if(var4 >= var3 << 1) {
               var1[var2] = -1;
            }

            ++var2;
         }
      }

      this.field348[1][3] = var1;
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "1437347489"
   )
   void method4840() {
      byte[] var1 = new byte[this.field351 * this.field351];
      boolean var2 = false;
      var1 = new byte[this.field351 * this.field351];
      int var5 = 0;

      int var3;
      int var4;
      for(var3 = 0; var3 < this.field351; ++var3) {
         for(var4 = 0; var4 < this.field351; ++var4) {
            if(var4 >= var3 - this.field351 / 2) {
               var1[var5] = -1;
            }

            ++var5;
         }
      }

      this.field348[7][0] = var1;
      var1 = new byte[this.field351 * this.field351];
      var5 = 0;

      for(var3 = this.field351 - 1; var3 >= 0; --var3) {
         for(var4 = 0; var4 < this.field351; ++var4) {
            if(var4 >= var3 - this.field351 / 2) {
               var1[var5] = -1;
            }

            ++var5;
         }
      }

      this.field348[7][1] = var1;
      var1 = new byte[this.field351 * this.field351];
      var5 = 0;

      for(var3 = this.field351 - 1; var3 >= 0; --var3) {
         for(var4 = this.field351 - 1; var4 >= 0; --var4) {
            if(var4 >= var3 - this.field351 / 2) {
               var1[var5] = -1;
            }

            ++var5;
         }
      }

      this.field348[7][2] = var1;
      var1 = new byte[this.field351 * this.field351];
      var5 = 0;

      for(var3 = 0; var3 < this.field351; ++var3) {
         for(var4 = this.field351 - 1; var4 >= 0; --var4) {
            if(var4 >= var3 - this.field351 / 2) {
               var1[var5] = -1;
            }

            ++var5;
         }
      }

      this.field348[7][3] = var1;
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-2081844166"
   )
   void method4837() {
      byte[] var1 = new byte[this.field351 * this.field351];
      int var2 = 0;

      int var3;
      int var4;
      for(var3 = this.field351 - 1; var3 >= 0; --var3) {
         for(var4 = this.field351 - 1; var4 >= 0; --var4) {
            if(var4 >= var3 >> 1) {
               var1[var2] = -1;
            }

            ++var2;
         }
      }

      this.field348[4][0] = var1;
      var1 = new byte[this.field351 * this.field351];
      var2 = 0;

      for(var3 = this.field351 - 1; var3 >= 0; --var3) {
         for(var4 = 0; var4 < this.field351; ++var4) {
            if(var4 <= var3 << 1) {
               var1[var2] = -1;
            }

            ++var2;
         }
      }

      this.field348[4][1] = var1;
      var1 = new byte[this.field351 * this.field351];
      var2 = 0;

      for(var3 = 0; var3 < this.field351; ++var3) {
         for(var4 = 0; var4 < this.field351; ++var4) {
            if(var4 >= var3 >> 1) {
               var1[var2] = -1;
            }

            ++var2;
         }
      }

      this.field348[4][2] = var1;
      var1 = new byte[this.field351 * this.field351];
      var2 = 0;

      for(var3 = 0; var3 < this.field351; ++var3) {
         for(var4 = this.field351 - 1; var4 >= 0; --var4) {
            if(var4 <= var3 << 1) {
               var1[var2] = -1;
            }

            ++var2;
         }
      }

      this.field348[4][3] = var1;
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "415023569"
   )
   void method4834() {
      if(this.field348 == null) {
         this.field348 = new byte[8][4][];
         this.method4851();
         this.method4832();
         this.method4835();
         this.method4853();
         this.method4837();
         this.method4838();
         this.method4848();
         this.method4840();
      }
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1266408027"
   )
   void method4853() {
      byte[] var1 = new byte[this.field351 * this.field351];
      int var2 = 0;

      int var3;
      int var4;
      for(var3 = this.field351 - 1; var3 >= 0; --var3) {
         for(var4 = 0; var4 < this.field351; ++var4) {
            if(var4 >= var3 >> 1) {
               var1[var2] = -1;
            }

            ++var2;
         }
      }

      this.field348[3][0] = var1;
      var1 = new byte[this.field351 * this.field351];
      var2 = 0;

      for(var3 = 0; var3 < this.field351; ++var3) {
         for(var4 = 0; var4 < this.field351; ++var4) {
            if(var4 <= var3 << 1) {
               var1[var2] = -1;
            }

            ++var2;
         }
      }

      this.field348[3][1] = var1;
      var1 = new byte[this.field351 * this.field351];
      var2 = 0;

      for(var3 = 0; var3 < this.field351; ++var3) {
         for(var4 = this.field351 - 1; var4 >= 0; --var4) {
            if(var4 >= var3 >> 1) {
               var1[var2] = -1;
            }

            ++var2;
         }
      }

      this.field348[3][2] = var1;
      var1 = new byte[this.field351 * this.field351];
      var2 = 0;

      for(var3 = this.field351 - 1; var3 >= 0; --var3) {
         for(var4 = this.field351 - 1; var4 >= 0; --var4) {
            if(var4 <= var3 << 1) {
               var1[var2] = -1;
            }

            ++var2;
         }
      }

      this.field348[3][3] = var1;
   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "53"
   )
   void method4835() {
      byte[] var1 = new byte[this.field351 * this.field351];
      int var2 = 0;

      int var3;
      int var4;
      for(var3 = this.field351 - 1; var3 >= 0; --var3) {
         for(var4 = this.field351 - 1; var4 >= 0; --var4) {
            if(var4 <= var3 >> 1) {
               var1[var2] = -1;
            }

            ++var2;
         }
      }

      this.field348[2][0] = var1;
      var1 = new byte[this.field351 * this.field351];
      var2 = 0;

      for(var3 = this.field351 - 1; var3 >= 0; --var3) {
         for(var4 = 0; var4 < this.field351; ++var4) {
            if(var4 >= var3 << 1) {
               var1[var2] = -1;
            }

            ++var2;
         }
      }

      this.field348[2][1] = var1;
      var1 = new byte[this.field351 * this.field351];
      var2 = 0;

      for(var3 = 0; var3 < this.field351; ++var3) {
         for(var4 = 0; var4 < this.field351; ++var4) {
            if(var4 <= var3 >> 1) {
               var1[var2] = -1;
            }

            ++var2;
         }
      }

      this.field348[2][2] = var1;
      var1 = new byte[this.field351 * this.field351];
      var2 = 0;

      for(var3 = 0; var3 < this.field351; ++var3) {
         for(var4 = this.field351 - 1; var4 >= 0; --var4) {
            if(var4 >= var3 << 1) {
               var1[var2] = -1;
            }

            ++var2;
         }
      }

      this.field348[2][3] = var1;
   }

   @ObfuscatedName("b")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-893794148"
   )
   void method4838() {
      byte[] var1 = new byte[this.field351 * this.field351];
      boolean var2 = false;
      var1 = new byte[this.field351 * this.field351];
      int var5 = 0;

      int var3;
      int var4;
      for(var3 = 0; var3 < this.field351; ++var3) {
         for(var4 = 0; var4 < this.field351; ++var4) {
            if(var4 <= this.field351 / 2) {
               var1[var5] = -1;
            }

            ++var5;
         }
      }

      this.field348[5][0] = var1;
      var1 = new byte[this.field351 * this.field351];
      var5 = 0;

      for(var3 = 0; var3 < this.field351; ++var3) {
         for(var4 = 0; var4 < this.field351; ++var4) {
            if(var3 <= this.field351 / 2) {
               var1[var5] = -1;
            }

            ++var5;
         }
      }

      this.field348[5][1] = var1;
      var1 = new byte[this.field351 * this.field351];
      var5 = 0;

      for(var3 = 0; var3 < this.field351; ++var3) {
         for(var4 = 0; var4 < this.field351; ++var4) {
            if(var4 >= this.field351 / 2) {
               var1[var5] = -1;
            }

            ++var5;
         }
      }

      this.field348[5][2] = var1;
      var1 = new byte[this.field351 * this.field351];
      var5 = 0;

      for(var3 = 0; var3 < this.field351; ++var3) {
         for(var4 = 0; var4 < this.field351; ++var4) {
            if(var3 >= this.field351 / 2) {
               var1[var5] = -1;
            }

            ++var5;
         }
      }

      this.field348[5][3] = var1;
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "(IIIIIIIII)V",
      garbageValue = "-2089759145"
   )
   void method4829(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      if(var7 != 0 && this.field351 != 0 && this.field348 != null) {
         var8 = this.method4830(var8, var7);
         var7 = this.method4831(var7);
         Rasterizer2D.method695(var1, var2, var5, var6, var3, var4, this.field348[var7 - 1][var8], this.field351, true);
      }
   }

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-58041941"
   )
   void method4848() {
      byte[] var1 = new byte[this.field351 * this.field351];
      boolean var2 = false;
      var1 = new byte[this.field351 * this.field351];
      int var5 = 0;

      int var3;
      int var4;
      for(var3 = 0; var3 < this.field351; ++var3) {
         for(var4 = 0; var4 < this.field351; ++var4) {
            if(var4 <= var3 - this.field351 / 2) {
               var1[var5] = -1;
            }

            ++var5;
         }
      }

      this.field348[6][0] = var1;
      var1 = new byte[this.field351 * this.field351];
      var5 = 0;

      for(var3 = this.field351 - 1; var3 >= 0; --var3) {
         for(var4 = 0; var4 < this.field351; ++var4) {
            if(var4 <= var3 - this.field351 / 2) {
               var1[var5] = -1;
            }

            ++var5;
         }
      }

      this.field348[6][1] = var1;
      var1 = new byte[this.field351 * this.field351];
      var5 = 0;

      for(var3 = this.field351 - 1; var3 >= 0; --var3) {
         for(var4 = this.field351 - 1; var4 >= 0; --var4) {
            if(var4 <= var3 - this.field351 / 2) {
               var1[var5] = -1;
            }

            ++var5;
         }
      }

      this.field348[6][2] = var1;
      var1 = new byte[this.field351 * this.field351];
      var5 = 0;

      for(var3 = 0; var3 < this.field351; ++var3) {
         for(var4 = this.field351 - 1; var4 >= 0; --var4) {
            if(var4 <= var3 - this.field351 / 2) {
               var1[var5] = -1;
            }

            ++var5;
         }
      }

      this.field348[6][3] = var1;
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(III)I",
      garbageValue = "-1944609355"
   )
   int method4830(int var1, int var2) {
      if(var2 == 9) {
         var1 = var1 + 1 & 3;
      }

      if(var2 == 10) {
         var1 = var1 + 3 & 3;
      }

      if(var2 == 11) {
         var1 = var1 + 3 & 3;
      }

      return var1;
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "302907833"
   )
   void method4851() {
      byte[] var1 = new byte[this.field351 * this.field351];
      int var2 = 0;

      int var3;
      int var4;
      for(var3 = 0; var3 < this.field351; ++var3) {
         for(var4 = 0; var4 < this.field351; ++var4) {
            if(var4 <= var3) {
               var1[var2] = -1;
            }

            ++var2;
         }
      }

      this.field348[0][0] = var1;
      var1 = new byte[this.field351 * this.field351];
      var2 = 0;

      for(var3 = this.field351 - 1; var3 >= 0; --var3) {
         for(var4 = 0; var4 < this.field351; ++var4) {
            if(var4 <= var3) {
               var1[var2] = -1;
            }

            ++var2;
         }
      }

      this.field348[0][1] = var1;
      var1 = new byte[this.field351 * this.field351];
      var2 = 0;

      for(var3 = 0; var3 < this.field351; ++var3) {
         for(var4 = 0; var4 < this.field351; ++var4) {
            if(var4 >= var3) {
               var1[var2] = -1;
            }

            ++var2;
         }
      }

      this.field348[0][2] = var1;
      var1 = new byte[this.field351 * this.field351];
      var2 = 0;

      for(var3 = this.field351 - 1; var3 >= 0; --var3) {
         for(var4 = 0; var4 < this.field351; ++var4) {
            if(var4 >= var3) {
               var1[var2] = -1;
            }

            ++var2;
         }
      }

      this.field348[0][3] = var1;
   }

   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "(II)I",
      garbageValue = "45462626"
   )
   int method4831(int var1) {
      return var1 != 9 && var1 != 10?(var1 == 11?8:var1):1;
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      signature = "(ILcs;ZI)I",
      garbageValue = "2066342746"
   )
   static int method4860(int var0, class314 var1, boolean var2) {
      if(var0 == 5000) {
         class281.intStack[++class281.intStackSize - 1] = client.publicChatMode;
         return 1;
      } else if(var0 == 5001) {
         class281.intStackSize -= 3;
         client.publicChatMode = class281.intStack[class281.intStackSize];
         class135.field106 = class142.method2033(class281.intStack[class281.intStackSize + 1]);
         if(class135.field106 == null) {
            class135.field106 = class16.field3812;
         }

         client.tradeMode = class281.intStack[class281.intStackSize + 2];
         TcpConnectionMessage var18 = class232.method4535(ClientProt.field2234, client.serverConnection.isaac);
         var18.packetBuffer.writeByte(client.publicChatMode);
         var18.packetBuffer.writeByte(class135.field106.field3811);
         var18.packetBuffer.writeByte(client.tradeMode);
         client.serverConnection.method18(var18);
         return 1;
      } else {
         String var3;
         int var4;
         if(var0 == 5002) {
            var3 = class281.scriptStringStack[--class295.scriptStringStackSize];
            class281.intStackSize -= 2;
            var4 = class281.intStack[class281.intStackSize];
            int var5 = class281.intStack[class281.intStackSize + 1];
            TcpConnectionMessage var6 = class232.method4535(ClientProt.field2246, client.serverConnection.isaac);
            var6.packetBuffer.writeByte(OwnWorldComparator.method73(var3) + 2);
            var6.packetBuffer.writeString(var3);
            var6.packetBuffer.writeByte(var4 - 1);
            var6.packetBuffer.writeByte(var5);
            client.serverConnection.method18(var6);
            return 1;
         } else {
            int var10;
            if(var0 == 5003) {
               class281.intStackSize -= 2;
               var10 = class281.intStack[class281.intStackSize];
               var4 = class281.intStack[class281.intStackSize + 1];
               ChatLine var15 = FontName.method514(var10, var4);
               if(var15 != null) {
                  class281.intStack[++class281.intStackSize - 1] = var15.id;
                  class281.intStack[++class281.intStackSize - 1] = var15.tick;
                  class281.scriptStringStack[++class295.scriptStringStackSize - 1] = var15.name != null?var15.name:"";
                  class281.scriptStringStack[++class295.scriptStringStackSize - 1] = var15.clan != null?var15.clan:"";
                  class281.scriptStringStack[++class295.scriptStringStackSize - 1] = var15.value != null?var15.value:"";
                  class281.intStack[++class281.intStackSize - 1] = var15.method5890()?1:(var15.method5893()?2:0);
               } else {
                  class281.intStack[++class281.intStackSize - 1] = -1;
                  class281.intStack[++class281.intStackSize - 1] = 0;
                  class281.scriptStringStack[++class295.scriptStringStackSize - 1] = "";
                  class281.scriptStringStack[++class295.scriptStringStackSize - 1] = "";
                  class281.scriptStringStack[++class295.scriptStringStackSize - 1] = "";
                  class281.intStack[++class281.intStackSize - 1] = 0;
               }

               return 1;
            } else if(var0 == 5004) {
               var10 = class281.intStack[--class281.intStackSize];
               ChatLine var16 = class318.method6318(var10);
               if(var16 != null) {
                  class281.intStack[++class281.intStackSize - 1] = var16.type;
                  class281.intStack[++class281.intStackSize - 1] = var16.tick;
                  class281.scriptStringStack[++class295.scriptStringStackSize - 1] = var16.name != null?var16.name:"";
                  class281.scriptStringStack[++class295.scriptStringStackSize - 1] = var16.clan != null?var16.clan:"";
                  class281.scriptStringStack[++class295.scriptStringStackSize - 1] = var16.value != null?var16.value:"";
                  class281.intStack[++class281.intStackSize - 1] = var16.method5890()?1:(var16.method5893()?2:0);
               } else {
                  class281.intStack[++class281.intStackSize - 1] = -1;
                  class281.intStack[++class281.intStackSize - 1] = 0;
                  class281.scriptStringStack[++class295.scriptStringStackSize - 1] = "";
                  class281.scriptStringStack[++class295.scriptStringStackSize - 1] = "";
                  class281.scriptStringStack[++class295.scriptStringStackSize - 1] = "";
                  class281.intStack[++class281.intStackSize - 1] = 0;
               }

               return 1;
            } else if(var0 == 5005) {
               if(class135.field106 == null) {
                  class281.intStack[++class281.intStackSize - 1] = -1;
               } else {
                  class281.intStack[++class281.intStackSize - 1] = class135.field106.field3811;
               }

               return 1;
            } else if(var0 == 5008) {
               var3 = class281.scriptStringStack[--class295.scriptStringStackSize];
               var4 = class281.intStack[--class281.intStackSize];
               String var14 = var3.toLowerCase();
               byte var17 = 0;
               if(var14.startsWith("yellow:")) {
                  var17 = 0;
                  var3 = var3.substring("yellow:".length());
               } else if(var14.startsWith("red:")) {
                  var17 = 1;
                  var3 = var3.substring("red:".length());
               } else if(var14.startsWith("green:")) {
                  var17 = 2;
                  var3 = var3.substring("green:".length());
               } else if(var14.startsWith("cyan:")) {
                  var17 = 3;
                  var3 = var3.substring("cyan:".length());
               } else if(var14.startsWith("purple:")) {
                  var17 = 4;
                  var3 = var3.substring("purple:".length());
               } else if(var14.startsWith("white:")) {
                  var17 = 5;
                  var3 = var3.substring("white:".length());
               } else if(var14.startsWith("flash1:")) {
                  var17 = 6;
                  var3 = var3.substring("flash1:".length());
               } else if(var14.startsWith("flash2:")) {
                  var17 = 7;
                  var3 = var3.substring("flash2:".length());
               } else if(var14.startsWith("flash3:")) {
                  var17 = 8;
                  var3 = var3.substring("flash3:".length());
               } else if(var14.startsWith("glow1:")) {
                  var17 = 9;
                  var3 = var3.substring("glow1:".length());
               } else if(var14.startsWith("glow2:")) {
                  var17 = 10;
                  var3 = var3.substring("glow2:".length());
               } else if(var14.startsWith("glow3:")) {
                  var17 = 11;
                  var3 = var3.substring("glow3:".length());
               } else if(client.languageId != 0) {
                  if(var14.startsWith("yellow:")) {
                     var17 = 0;
                     var3 = var3.substring("yellow:".length());
                  } else if(var14.startsWith("red:")) {
                     var17 = 1;
                     var3 = var3.substring("red:".length());
                  } else if(var14.startsWith("green:")) {
                     var17 = 2;
                     var3 = var3.substring("green:".length());
                  } else if(var14.startsWith("cyan:")) {
                     var17 = 3;
                     var3 = var3.substring("cyan:".length());
                  } else if(var14.startsWith("purple:")) {
                     var17 = 4;
                     var3 = var3.substring("purple:".length());
                  } else if(var14.startsWith("white:")) {
                     var17 = 5;
                     var3 = var3.substring("white:".length());
                  } else if(var14.startsWith("flash1:")) {
                     var17 = 6;
                     var3 = var3.substring("flash1:".length());
                  } else if(var14.startsWith("flash2:")) {
                     var17 = 7;
                     var3 = var3.substring("flash2:".length());
                  } else if(var14.startsWith("flash3:")) {
                     var17 = 8;
                     var3 = var3.substring("flash3:".length());
                  } else if(var14.startsWith("glow1:")) {
                     var17 = 9;
                     var3 = var3.substring("glow1:".length());
                  } else if(var14.startsWith("glow2:")) {
                     var17 = 10;
                     var3 = var3.substring("glow2:".length());
                  } else if(var14.startsWith("glow3:")) {
                     var17 = 11;
                     var3 = var3.substring("glow3:".length());
                  }
               }

               var14 = var3.toLowerCase();
               byte var7 = 0;
               if(var14.startsWith("wave:")) {
                  var7 = 1;
                  var3 = var3.substring("wave:".length());
               } else if(var14.startsWith("wave2:")) {
                  var7 = 2;
                  var3 = var3.substring("wave2:".length());
               } else if(var14.startsWith("shake:")) {
                  var7 = 3;
                  var3 = var3.substring("shake:".length());
               } else if(var14.startsWith("scroll:")) {
                  var7 = 4;
                  var3 = var3.substring("scroll:".length());
               } else if(var14.startsWith("slide:")) {
                  var7 = 5;
                  var3 = var3.substring("slide:".length());
               } else if(client.languageId != 0) {
                  if(var14.startsWith("wave:")) {
                     var7 = 1;
                     var3 = var3.substring("wave:".length());
                  } else if(var14.startsWith("wave2:")) {
                     var7 = 2;
                     var3 = var3.substring("wave2:".length());
                  } else if(var14.startsWith("shake:")) {
                     var7 = 3;
                     var3 = var3.substring("shake:".length());
                  } else if(var14.startsWith("scroll:")) {
                     var7 = 4;
                     var3 = var3.substring("scroll:".length());
                  } else if(var14.startsWith("slide:")) {
                     var7 = 5;
                     var3 = var3.substring("slide:".length());
                  }
               }

               TcpConnectionMessage var8 = class232.method4535(ClientProt.field2278, client.serverConnection.isaac);
               var8.packetBuffer.writeByte(0);
               int var9 = var8.packetBuffer.offset;
               var8.packetBuffer.writeByte(var4);
               var8.packetBuffer.writeByte(var17);
               var8.packetBuffer.writeByte(var7);
               InvType.method1565(var8.packetBuffer, var3);
               var8.packetBuffer.method5083(var8.packetBuffer.offset - var9);
               client.serverConnection.method18(var8);
               return 1;
            } else if(var0 == 5009) {
               class295.scriptStringStackSize -= 2;
               var3 = class281.scriptStringStack[class295.scriptStringStackSize];
               String var12 = class281.scriptStringStack[class295.scriptStringStackSize + 1];
               TcpConnectionMessage var11 = class232.method4535(ClientProt.field2244, client.serverConnection.isaac);
               var11.packetBuffer.writeShort(0);
               int var13 = var11.packetBuffer.offset;
               var11.packetBuffer.writeString(var3);
               InvType.method1565(var11.packetBuffer, var12);
               var11.packetBuffer.method5082(var11.packetBuffer.offset - var13);
               client.serverConnection.method18(var11);
               return 1;
            } else if(var0 != 5015) {
               if(var0 == 5016) {
                  class281.intStack[++class281.intStackSize - 1] = client.tradeMode;
                  return 1;
               } else if(var0 == 5017) {
                  var10 = class281.intStack[--class281.intStackSize];
                  class281.intStack[++class281.intStackSize - 1] = class290.method5962(var10);
                  return 1;
               } else if(var0 == 5018) {
                  var10 = class281.intStack[--class281.intStackSize];
                  class281.intStack[++class281.intStackSize - 1] = WorldMapRectangle.method3819(var10);
                  return 1;
               } else if(var0 == 5019) {
                  var10 = class281.intStack[--class281.intStackSize];
                  class281.intStack[++class281.intStackSize - 1] = Frames.method6064(var10);
                  return 1;
               } else if(var0 == 5020) {
                  var3 = class281.scriptStringStack[--class295.scriptStringStackSize];
                  WorldMapType3.method577(var3);
                  return 1;
               } else if(var0 == 5021) {
                  client.field789 = class281.scriptStringStack[--class295.scriptStringStackSize].toLowerCase().trim();
                  return 1;
               } else if(var0 == 5022) {
                  class281.scriptStringStack[++class295.scriptStringStackSize - 1] = client.field789;
                  return 1;
               } else if(var0 == 5023) {
                  var3 = class281.scriptStringStack[--class295.scriptStringStackSize];
                  return 1;
               } else {
                  return 2;
               }
            } else {
               if(class71.localPlayer != null && class71.localPlayer.name != null) {
                  var3 = class71.localPlayer.name.method1530();
               } else {
                  var3 = "";
               }

               class281.scriptStringStack[++class295.scriptStringStackSize - 1] = var3;
               return 1;
            }
         }
      }
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(Lbr;II)V"
   )
   static void method4859(ScriptEvent var0, int var1, int var2) {
      Object[] var3 = var0.getArguments();
      if(var3 != null && var3.length > 0 && var3[0] instanceof JavaScriptCallback) {
         try {
            ((JavaScriptCallback)var3[0]).run(var0);
         } catch (Exception var8) {
            ItemContainer.clientInstance.getLogger().error("Error in JavaScriptCallback", var8);
         }

      } else {
         try {
            client.copy$runScript(var0, var1, var2);
         } finally {
            client.currentScript = null;
         }

      }
   }
}
