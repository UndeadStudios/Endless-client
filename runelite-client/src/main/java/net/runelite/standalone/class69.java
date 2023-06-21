package net.runelite.standalone;

import java.awt.Component;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("k")
public class class69 extends MapIcon {
   @ObfuscatedName("sa")
   @ObfuscatedSignature(
      signature = "Llq;"
   )
   static WorldMap worldMap;
   @ObfuscatedName("hz")
   @ObfuscatedGetter(
      intValue = -47086145
   )
   static int field135;
   @ObfuscatedName("i")
   public static String homeDir;
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = -1954196195
   )
   final int field132;
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      intValue = 973204081
   )
   final int field134;
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "Lay;"
   )
   final MapLabel field129;
   @ObfuscatedName("g")
   @ObfuscatedGetter(
      intValue = -1717211973
   )
   final int field131;

   @ObfuscatedSignature(
      signature = "(Lif;Lif;ILay;)V"
   )
   class69(CoordGrid var1, CoordGrid var2, int var3, MapLabel var4) {
      super(var1, var2);
      this.field134 = var3;
      this.field129 = var4;
      MapElementType var5 = MapLabel.method2858(this.vmethod4060());
      SpritePixels var6 = var5.method1483(false);
      if(var6 != null) {
         this.field131 = var6.width;
         this.field132 = var6.height;
      } else {
         this.field131 = 0;
         this.field132 = 0;
      }

   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(B)I",
      garbageValue = "105"
   )
   int vmethod4058() {
      return this.field132;
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "(B)I",
      garbageValue = "51"
   )
   public int vmethod4060() {
      return this.field134;
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(I)Lay;",
      garbageValue = "-937210224"
   )
   MapLabel vmethod4061() {
      return this.field129;
   }

   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "-1729576697"
   )
   int vmethod4074() {
      return this.field131;
   }

   @ObfuscatedName("hb")
   @ObfuscatedSignature(
      signature = "(Lbw;IIBI)V",
      garbageValue = "417229347"
   )
   static final void method986(PlayerEntity var0, int var1, int var2, byte var3) {
      int var4 = var0.pathX[0];
      int var5 = var0.pathY[0];
      int var6 = var0.method6008();
      if(var4 >= var6 && var4 < 104 - var6 && var5 >= var6 && var5 < 104 - var6) {
         if(var1 >= var6 && var1 < 104 - var6 && var2 >= var6 && var2 < 104 - var6) {
            int var8 = var0.method6008();
            class93 var9 = Size.method4089(var1, var2);
            CollisionData var10 = client.collisionMaps[var0.field631];
            int[] var11 = client.field922;
            int[] var12 = client.field876;

            int var13;
            int var14;
            for(var13 = 0; var13 < 128; ++var13) {
               for(var14 = 0; var14 < 128; ++var14) {
                  class82.field2117[var13][var14] = 0;
                  class82.field2115[var13][var14] = 99999999;
               }
            }

            int var15;
            int var16;
            byte var17;
            byte var18;
            int var19;
            int var20;
            byte var21;
            int var22;
            int[][] var23;
            int var24;
            int var25;
            int var26;
            int var27;
            boolean var33;
            boolean var34;
            int var35;
            int var36;
            int var38;
            if(var8 == 1) {
               var15 = var4;
               var16 = var5;
               var17 = 64;
               var18 = 64;
               var19 = var4 - var17;
               var20 = var5 - var18;
               class82.field2117[var17][var18] = 99;
               class82.field2115[var17][var18] = 0;
               var21 = 0;
               var22 = 0;
               class82.field2121[var21] = var4;
               var38 = var21 + 1;
               class82.field2122[var21] = var5;
               var23 = var10.flags;

               while(true) {
                  if(var38 == var22) {
                     class82.field2119 = var15;
                     Item.field1222 = var16;
                     var34 = false;
                     break;
                  }

                  var15 = class82.field2121[var22];
                  var16 = class82.field2122[var22];
                  var22 = var22 + 1 & 4095;
                  var35 = var15 - var19;
                  var36 = var16 - var20;
                  var24 = var15 - var10.x;
                  var25 = var16 - var10.y;
                  if(var9.vmethod1252(1, var15, var16, var10)) {
                     class82.field2119 = var15;
                     Item.field1222 = var16;
                     var34 = true;
                     break;
                  }

                  var26 = class82.field2115[var35][var36] + 1;
                  if(var35 > 0 && class82.field2117[var35 - 1][var36] == 0 && (var23[var24 - 1][var25] & 19136776) == 0) {
                     class82.field2121[var38] = var15 - 1;
                     class82.field2122[var38] = var16;
                     var38 = var38 + 1 & 4095;
                     class82.field2117[var35 - 1][var36] = 2;
                     class82.field2115[var35 - 1][var36] = var26;
                  }

                  if(var35 < 127 && class82.field2117[var35 + 1][var36] == 0 && (var23[var24 + 1][var25] & 19136896) == 0) {
                     class82.field2121[var38] = var15 + 1;
                     class82.field2122[var38] = var16;
                     var38 = var38 + 1 & 4095;
                     class82.field2117[var35 + 1][var36] = 8;
                     class82.field2115[var35 + 1][var36] = var26;
                  }

                  if(var36 > 0 && class82.field2117[var35][var36 - 1] == 0 && (var23[var24][var25 - 1] & 19136770) == 0) {
                     class82.field2121[var38] = var15;
                     class82.field2122[var38] = var16 - 1;
                     var38 = var38 + 1 & 4095;
                     class82.field2117[var35][var36 - 1] = 1;
                     class82.field2115[var35][var36 - 1] = var26;
                  }

                  if(var36 < 127 && class82.field2117[var35][var36 + 1] == 0 && (var23[var24][var25 + 1] & 19136800) == 0) {
                     class82.field2121[var38] = var15;
                     class82.field2122[var38] = var16 + 1;
                     var38 = var38 + 1 & 4095;
                     class82.field2117[var35][var36 + 1] = 4;
                     class82.field2115[var35][var36 + 1] = var26;
                  }

                  if(var35 > 0 && var36 > 0 && class82.field2117[var35 - 1][var36 - 1] == 0 && (var23[var24 - 1][var25 - 1] & 19136782) == 0 && (var23[var24 - 1][var25] & 19136776) == 0 && (var23[var24][var25 - 1] & 19136770) == 0) {
                     class82.field2121[var38] = var15 - 1;
                     class82.field2122[var38] = var16 - 1;
                     var38 = var38 + 1 & 4095;
                     class82.field2117[var35 - 1][var36 - 1] = 3;
                     class82.field2115[var35 - 1][var36 - 1] = var26;
                  }

                  if(var35 < 127 && var36 > 0 && class82.field2117[var35 + 1][var36 - 1] == 0 && (var23[var24 + 1][var25 - 1] & 19136899) == 0 && (var23[var24 + 1][var25] & 19136896) == 0 && (var23[var24][var25 - 1] & 19136770) == 0) {
                     class82.field2121[var38] = var15 + 1;
                     class82.field2122[var38] = var16 - 1;
                     var38 = var38 + 1 & 4095;
                     class82.field2117[var35 + 1][var36 - 1] = 9;
                     class82.field2115[var35 + 1][var36 - 1] = var26;
                  }

                  if(var35 > 0 && var36 < 127 && class82.field2117[var35 - 1][var36 + 1] == 0 && (var23[var24 - 1][var25 + 1] & 19136824) == 0 && (var23[var24 - 1][var25] & 19136776) == 0 && (var23[var24][var25 + 1] & 19136800) == 0) {
                     class82.field2121[var38] = var15 - 1;
                     class82.field2122[var38] = var16 + 1;
                     var38 = var38 + 1 & 4095;
                     class82.field2117[var35 - 1][var36 + 1] = 6;
                     class82.field2115[var35 - 1][var36 + 1] = var26;
                  }

                  if(var35 < 127 && var36 < 127 && class82.field2117[var35 + 1][var36 + 1] == 0 && (var23[var24 + 1][var25 + 1] & 19136992) == 0 && (var23[var24 + 1][var25] & 19136896) == 0 && (var23[var24][var25 + 1] & 19136800) == 0) {
                     class82.field2121[var38] = var15 + 1;
                     class82.field2122[var38] = var16 + 1;
                     var38 = var38 + 1 & 4095;
                     class82.field2117[var35 + 1][var36 + 1] = 12;
                     class82.field2115[var35 + 1][var36 + 1] = var26;
                  }
               }

               var33 = var34;
            } else if(var8 == 2) {
               var33 = PlayerEntity.method6047(var4, var5, var9, var10);
            } else {
               var15 = var4;
               var16 = var5;
               var17 = 64;
               var18 = 64;
               var19 = var4 - var17;
               var20 = var5 - var18;
               class82.field2117[var17][var18] = 99;
               class82.field2115[var17][var18] = 0;
               var21 = 0;
               var22 = 0;
               class82.field2121[var21] = var4;
               var38 = var21 + 1;
               class82.field2122[var21] = var5;
               var23 = var10.flags;

               label640:
               while(true) {
                  label638:
                  while(true) {
                     do {
                        do {
                           do {
                              label615:
                              do {
                                 if(var22 == var38) {
                                    class82.field2119 = var15;
                                    Item.field1222 = var16;
                                    var34 = false;
                                    break label640;
                                 }

                                 var15 = class82.field2121[var22];
                                 var16 = class82.field2122[var22];
                                 var22 = var22 + 1 & 4095;
                                 var35 = var15 - var19;
                                 var36 = var16 - var20;
                                 var24 = var15 - var10.x;
                                 var25 = var16 - var10.y;
                                 if(var9.vmethod1252(var8, var15, var16, var10)) {
                                    class82.field2119 = var15;
                                    Item.field1222 = var16;
                                    var34 = true;
                                    break label640;
                                 }

                                 var26 = class82.field2115[var35][var36] + 1;
                                 if(var35 > 0 && class82.field2117[var35 - 1][var36] == 0 && (var23[var24 - 1][var25] & 19136782) == 0 && (var23[var24 - 1][var8 + var25 - 1] & 19136824) == 0) {
                                    var27 = 1;

                                    while(true) {
                                       if(var27 >= var8 - 1) {
                                          class82.field2121[var38] = var15 - 1;
                                          class82.field2122[var38] = var16;
                                          var38 = var38 + 1 & 4095;
                                          class82.field2117[var35 - 1][var36] = 2;
                                          class82.field2115[var35 - 1][var36] = var26;
                                          break;
                                       }

                                       if((var23[var24 - 1][var27 + var25] & 19136830) != 0) {
                                          break;
                                       }

                                       ++var27;
                                    }
                                 }

                                 if(var35 < 128 - var8 && class82.field2117[var35 + 1][var36] == 0 && (var23[var24 + var8][var25] & 19136899) == 0 && (var23[var24 + var8][var8 + var25 - 1] & 19136992) == 0) {
                                    var27 = 1;

                                    while(true) {
                                       if(var27 >= var8 - 1) {
                                          class82.field2121[var38] = var15 + 1;
                                          class82.field2122[var38] = var16;
                                          var38 = var38 + 1 & 4095;
                                          class82.field2117[var35 + 1][var36] = 8;
                                          class82.field2115[var35 + 1][var36] = var26;
                                          break;
                                       }

                                       if((var23[var8 + var24][var25 + var27] & 19136995) != 0) {
                                          break;
                                       }

                                       ++var27;
                                    }
                                 }

                                 if(var36 > 0 && class82.field2117[var35][var36 - 1] == 0 && (var23[var24][var25 - 1] & 19136782) == 0 && (var23[var8 + var24 - 1][var25 - 1] & 19136899) == 0) {
                                    var27 = 1;

                                    while(true) {
                                       if(var27 >= var8 - 1) {
                                          class82.field2121[var38] = var15;
                                          class82.field2122[var38] = var16 - 1;
                                          var38 = var38 + 1 & 4095;
                                          class82.field2117[var35][var36 - 1] = 1;
                                          class82.field2115[var35][var36 - 1] = var26;
                                          break;
                                       }

                                       if((var23[var24 + var27][var25 - 1] & 19136911) != 0) {
                                          break;
                                       }

                                       ++var27;
                                    }
                                 }

                                 if(var36 < 128 - var8 && class82.field2117[var35][var36 + 1] == 0 && (var23[var24][var8 + var25] & 19136824) == 0 && (var23[var8 + var24 - 1][var8 + var25] & 19136992) == 0) {
                                    var27 = 1;

                                    while(true) {
                                       if(var27 >= var8 - 1) {
                                          class82.field2121[var38] = var15;
                                          class82.field2122[var38] = var16 + 1;
                                          var38 = var38 + 1 & 4095;
                                          class82.field2117[var35][var36 + 1] = 4;
                                          class82.field2115[var35][var36 + 1] = var26;
                                          break;
                                       }

                                       if((var23[var27 + var24][var8 + var25] & 19137016) != 0) {
                                          break;
                                       }

                                       ++var27;
                                    }
                                 }

                                 if(var35 > 0 && var36 > 0 && class82.field2117[var35 - 1][var36 - 1] == 0 && (var23[var24 - 1][var25 - 1] & 19136782) == 0) {
                                    var27 = 1;

                                    while(true) {
                                       if(var27 >= var8) {
                                          class82.field2121[var38] = var15 - 1;
                                          class82.field2122[var38] = var16 - 1;
                                          var38 = var38 + 1 & 4095;
                                          class82.field2117[var35 - 1][var36 - 1] = 3;
                                          class82.field2115[var35 - 1][var36 - 1] = var26;
                                          break;
                                       }

                                       if((var23[var24 - 1][var27 + (var25 - 1)] & 19136830) != 0 || (var23[var27 + (var24 - 1)][var25 - 1] & 19136911) != 0) {
                                          break;
                                       }

                                       ++var27;
                                    }
                                 }

                                 if(var35 < 128 - var8 && var36 > 0 && class82.field2117[var35 + 1][var36 - 1] == 0 && (var23[var24 + var8][var25 - 1] & 19136899) == 0) {
                                    var27 = 1;

                                    while(true) {
                                       if(var27 >= var8) {
                                          class82.field2121[var38] = var15 + 1;
                                          class82.field2122[var38] = var16 - 1;
                                          var38 = var38 + 1 & 4095;
                                          class82.field2117[var35 + 1][var36 - 1] = 9;
                                          class82.field2115[var35 + 1][var36 - 1] = var26;
                                          break;
                                       }

                                       if((var23[var24 + var8][var27 + (var25 - 1)] & 19136995) != 0 || (var23[var24 + var27][var25 - 1] & 19136911) != 0) {
                                          break;
                                       }

                                       ++var27;
                                    }
                                 }

                                 if(var35 > 0 && var36 < 128 - var8 && class82.field2117[var35 - 1][var36 + 1] == 0 && (var23[var24 - 1][var25 + var8] & 19136824) == 0) {
                                    for(var27 = 1; var27 < var8; ++var27) {
                                       if((var23[var24 - 1][var25 + var27] & 19136830) != 0 || (var23[var27 + (var24 - 1)][var8 + var25] & 19137016) != 0) {
                                          continue label615;
                                       }
                                    }

                                    class82.field2121[var38] = var15 - 1;
                                    class82.field2122[var38] = var16 + 1;
                                    var38 = var38 + 1 & 4095;
                                    class82.field2117[var35 - 1][var36 + 1] = 6;
                                    class82.field2115[var35 - 1][var36 + 1] = var26;
                                 }
                              } while(var35 >= 128 - var8);
                           } while(var36 >= 128 - var8);
                        } while(class82.field2117[var35 + 1][var36 + 1] != 0);
                     } while((var23[var8 + var24][var25 + var8] & 19136992) != 0);

                     for(var27 = 1; var27 < var8; ++var27) {
                        if((var23[var27 + var24][var8 + var25] & 19137016) != 0 || (var23[var24 + var8][var25 + var27] & 19136995) != 0) {
                           continue label638;
                        }
                     }

                     class82.field2121[var38] = var15 + 1;
                     class82.field2122[var38] = var16 + 1;
                     var38 = var38 + 1 & 4095;
                     class82.field2117[var35 + 1][var36 + 1] = 12;
                     class82.field2115[var35 + 1][var36 + 1] = var26;
                  }
               }

               var33 = var34;
            }

            int var7;
            label696: {
               var14 = var4 - 64;
               var15 = var5 - 64;
               var16 = class82.field2119;
               var35 = Item.field1222;
               if(!var33) {
                  var36 = Integer.MAX_VALUE;
                  var19 = Integer.MAX_VALUE;
                  byte var37 = 10;
                  var38 = var9.field2127;
                  var22 = var9.field2126;
                  int var32 = var9.field2130;
                  var24 = var9.field2129;

                  for(var25 = var38 - var37; var25 <= var38 + var37; ++var25) {
                     for(var26 = var22 - var37; var26 <= var22 + var37; ++var26) {
                        var27 = var25 - var14;
                        int var28 = var26 - var15;
                        if(var27 >= 0 && var28 >= 0 && var27 < 128 && var28 < 128 && class82.field2115[var27][var28] < 100) {
                           int var29 = 0;
                           if(var25 < var38) {
                              var29 = var38 - var25;
                           } else if(var25 > var32 + var38 - 1) {
                              var29 = var25 - (var32 + var38 - 1);
                           }

                           int var30 = 0;
                           if(var26 < var22) {
                              var30 = var22 - var26;
                           } else if(var26 > var22 + var24 - 1) {
                              var30 = var26 - (var24 + var22 - 1);
                           }

                           int var31 = var29 * var29 + var30 * var30;
                           if(var31 < var36 || var36 == var31 && class82.field2115[var27][var28] < var19) {
                              var36 = var31;
                              var19 = class82.field2115[var27][var28];
                              var16 = var25;
                              var35 = var26;
                           }
                        }
                     }
                  }

                  if(var36 == Integer.MAX_VALUE) {
                     var7 = -1;
                     break label696;
                  }
               }

               if(var4 == var16 && var35 == var5) {
                  var7 = 0;
               } else {
                  var18 = 0;
                  class82.field2121[var18] = var16;
                  var36 = var18 + 1;
                  class82.field2122[var18] = var35;

                  for(var19 = var20 = class82.field2117[var16 - var14][var35 - var15]; var4 != var16 || var35 != var5; var19 = class82.field2117[var16 - var14][var35 - var15]) {
                     if(var20 != var19) {
                        var20 = var19;
                        class82.field2121[var36] = var16;
                        class82.field2122[var36++] = var35;
                     }

                     if((var19 & 2) != 0) {
                        ++var16;
                     } else if((var19 & 8) != 0) {
                        --var16;
                     }

                     if((var19 & 1) != 0) {
                        ++var35;
                     } else if((var19 & 4) != 0) {
                        --var35;
                     }
                  }

                  var38 = 0;

                  while(var36-- > 0) {
                     var11[var38] = class82.field2121[var36];
                     var12[var38++] = class82.field2122[var36];
                     if(var38 >= var11.length) {
                        break;
                     }
                  }

                  var7 = var38;
               }
            }

            var13 = var7;
            if(var7 >= 1) {
               for(var14 = 0; var14 < var13 - 1; ++var14) {
                  var0.method6012(client.field922[var14], client.field876[var14], var3);
               }

            }
         }
      }
   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      signature = "(II)I",
      garbageValue = "940608554"
   )
   static int method977(int var0) {
      return (int)((Math.log((double)var0) / class281.field1081 - 7.0D) * 256.0D);
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "2"
   )
   public static void method978() {
      try {
         if(class262.field2557 == 1) {
            int var0 = class3.field1860.method306();
            if(var0 > 0 && class3.field1860.method309()) {
               var0 -= TextureProvider.field1525;
               if(var0 < 0) {
                  var0 = 0;
               }

               class3.field1860.method193(var0);
               return;
            }

            class3.field1860.method199();
            class3.field1860.method197();
            if(class129.field278 != null) {
               class262.field2557 = 2;
            } else {
               class262.field2557 = 0;
            }

            WorldMapDataGroup.field302 = null;
            class262.field2548 = null;
         }
      } catch (Exception var2) {
         var2.printStackTrace();
         class3.field1860.method199();
         class262.field2557 = 0;
         WorldMapDataGroup.field302 = null;
         class262.field2548 = null;
         class129.field278 = null;
      }

   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(Ljava/awt/Component;I)V",
      garbageValue = "377036626"
   )
   static void method987(Component var0) {
      var0.removeKeyListener(KeyFocusListener.keyboard);
      var0.removeFocusListener(KeyFocusListener.keyboard);
      KeyFocusListener.field399 = -1;
   }
}
