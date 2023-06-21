package net.runelite.standalone;

import java.util.Random;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.api.RSFontTypeFace;

@ObfuscatedName("kf")
public abstract class FontTypeFace extends Rasterizer2D implements RSFontTypeFace {
   @ObfuscatedName("l")
   static int shadow;
   @ObfuscatedName("v")
   static int field3778;
   @ObfuscatedName("e")
   static int strikeRGB;
   @ObfuscatedName("r")
   static int underlineRGB;
   @ObfuscatedName("k")
   static int field3775;
   @ObfuscatedName("w")
   static String[] field3791;
   @ObfuscatedName("b")
   @ObfuscatedSignature(
      signature = "[Llv;"
   )
   public static IndexedSprite[] modIcons;
   public static IndexedSprite[] memberIcons;
   @ObfuscatedName("o")
   static int prevColorRGB;
   @ObfuscatedName("t")
   static int prevShadeRGB;
   @ObfuscatedName("y")
   static int field3787;
   @ObfuscatedName("d")
   static Random field3773;
   @ObfuscatedName("u")
   static int color;
   @ObfuscatedName("f")
   int[] verticalOffsets;
   @ObfuscatedName("q")
   public int maxSpacing;
   @ObfuscatedName("x")
   int[] glyphWidths;
   @ObfuscatedName("m")
   public int minSpacing;
   @ObfuscatedName("p")
   public int verticalSpace;
   @ObfuscatedName("a")
   byte[][] gylphs;
   @ObfuscatedName("n")
   byte[] field3780;
   @ObfuscatedName("s")
   int[] field3789;
   @ObfuscatedName("h")
   int[] horizontalOffsets;
   @ObfuscatedName("g")
   int[] gylphHeights;

   static {
      strikeRGB = -1;
      underlineRGB = -1;
      prevShadeRGB = -1;
      shadow = -1;
      prevColorRGB = 0;
      color = 0;
      field3787 = 256;
      field3775 = 0;
      field3778 = 0;
      field3773 = new Random();
      field3791 = new String[100];
   }

   FontTypeFace(byte[] var1, int[] var2, int[] var3, int[] var4, int[] var5, int[] var6, byte[][] var7) {
      this.gylphs = new byte[256][];
      this.verticalSpace = 0;
      this.horizontalOffsets = var2;
      this.verticalOffsets = var3;
      this.gylphHeights = var4;
      this.glyphWidths = var5;
      this.method6156(var1);
      this.gylphs = var7;
      int var8 = Integer.MAX_VALUE;
      int var9 = Integer.MIN_VALUE;

      for(int var10 = 0; var10 < 256; ++var10) {
         if(this.verticalOffsets[var10] < var8 && this.glyphWidths[var10] != 0) {
            var8 = this.verticalOffsets[var10];
         }

         if(this.verticalOffsets[var10] + this.glyphWidths[var10] > var9) {
            var9 = this.verticalOffsets[var10] + this.glyphWidths[var10];
         }
      }

      this.minSpacing = this.verticalSpace - var8;
      this.maxSpacing = var9 - this.verticalSpace;
   }

   FontTypeFace(byte[] var1) {
      this.gylphs = new byte[256][];
      this.verticalSpace = 0;
      this.method6156(var1);
   }

   @ObfuscatedName("l")
   public void method6158(String var1, int var2, int var3, int var4, int var5) {
      if(var1 != null) {
         this.method6174(var4, var5);
         this.method6161(var1, var2 - this.method6160(var1), var3);
      }
   }

   @ObfuscatedName("v")
   public void method6172(String var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      if(var1 != null) {
         this.method6174(var4, var5);
         double var8 = 7.0D - (double)var7 / 8.0D;
         if(var8 < 0.0D) {
            var8 = 0.0D;
         }

         int[] var10 = new int[var1.length()];

         for(int var11 = 0; var11 < var1.length(); ++var11) {
            var10[var11] = (int)(Math.sin((double)var11 / 1.5D + (double)var6 / 1.0D) * var8);
         }

         this.method6178(var1, var2 - this.method6160(var1) / 2, var3, (int[])null, var10);
      }
   }

   @ObfuscatedName("r")
   public void method6165(String var1, int var2, int var3, int var4, int var5) {
      if(var1 != null) {
         this.method6174(var4, var5);
         this.method6161(var1, var2, var3);
      }
   }

   @ObfuscatedName("k")
   public void method6171(String var1, int var2, int var3, int var4, int var5, int var6) {
      if(var1 != null) {
         this.method6174(var4, var5);
         int[] var7 = new int[var1.length()];
         int[] var8 = new int[var1.length()];

         for(int var9 = 0; var9 < var1.length(); ++var9) {
            var7[var9] = (int)(Math.sin((double)var9 / 5.0D + (double)var6 / 5.0D) * 5.0D);
            var8[var9] = (int)(Math.sin((double)var9 / 3.0D + (double)var6 / 5.0D) * 5.0D);
         }

         this.method6178(var1, var2 - this.method6160(var1) / 2, var3, var7, var8);
      }
   }

   @ObfuscatedName("q")
   public int method6240(String var1, int[] var2, String[] var3) {
      if(var1 == null) {
         return 0;
      } else {
         int var4 = 0;
         int var5 = 0;
         StringBuilder var6 = new StringBuilder(100);
         int var7 = -1;
         int var8 = 0;
         byte var9 = 0;
         int var10 = -1;
         char var11 = 0;
         int var12 = 0;
         int var13 = var1.length();

         for(int var14 = 0; var14 < var13; ++var14) {
            char var15 = var1.charAt(var14);
            if(var15 == '<') {
               var10 = var14;
            } else {
               if(var15 == '>' && var10 != -1) {
                  String var16 = var1.substring(var10 + 1, var14);
                  var10 = -1;
                  var6.append('<');
                  var6.append(var16);
                  var6.append('>');
                  if(var16.equals("br")) {
                     var3[var12] = var6.toString().substring(var5, var6.length());
                     ++var12;
                     var5 = var6.length();
                     var4 = 0;
                     var7 = -1;
                     var11 = 0;
                  } else if(var16.equals("lt")) {
                     var4 += this.method6159('<');
                     if(this.field3780 != null && var11 != -1) {
                        var4 += this.field3780[(var11 << '\b') + 60];
                     }

                     var11 = '<';
                  } else if(var16.equals("gt")) {
                     var4 += this.method6159('>');
                     if(this.field3780 != null && var11 != -1) {
                        var4 += this.field3780[(var11 << '\b') + 62];
                     }

                     var11 = '>';
                  } else if(var16.startsWith("img=") || var16.startsWith("irm=")) {
                     try {
                        int var17 = HeadbarType.method2073(var16.substring(4));
                        var4 += modIcons[var17].originalWidth;
                        var11 = 0;
                     } catch (Exception var20) {
                        ;
                     }
                  } else if(var16.startsWith("member=")) {
                     try {
                        int var17 = HeadbarType.method2073(var16.substring(7));
                        var4 += memberIcons[var17].originalWidth;
                        var11 = 0;
                     } catch (Exception var20) {
                        ;
                     }
                  }

                  var15 = 0;
               }

               if(var10 == -1) {
                  if(var15 != 0) {
                     var6.append(var15);
                     var4 += this.method6159(var15);
                     if(this.field3780 != null && var11 != -1) {
                        var4 += this.field3780[var15 + (var11 << '\b')];
                     }

                     var11 = var15;
                  }

                  if(var15 == ' ') {
                     var7 = var6.length();
                     var8 = var4;
                     var9 = 1;
                  }

                  if(var2 != null && var4 > var2[var12 < var2.length?var12:var2.length - 1] && var7 >= 0) {
                     var3[var12] = var6.toString().substring(var5, var7 - var9);
                     ++var12;
                     var5 = var7;
                     var7 = -1;
                     var4 -= var8;
                     var11 = 0;
                  }

                  if(var15 == '-') {
                     var7 = var6.length();
                     var8 = var4;
                     var9 = 0;
                  }
               }
            }
         }

         String var19 = var6.toString();
         if(var19.length() > var5) {
            var3[var12++] = var19.substring(var5, var19.length());
         }

         return var12;
      }
   }

   @ObfuscatedName("m")
   public int method6160(String var1) {
      if(var1 == null) {
         return 0;
      } else {
         int var2 = -1;
         int var3 = -1;
         int var4 = 0;

         for(int var5 = 0; var5 < var1.length(); ++var5) {
            char var6 = var1.charAt(var5);
            if(var6 == '<') {
               var2 = var5;
            } else {
               if(var6 == '>' && var2 != -1) {
                  String var7 = var1.substring(var2 + 1, var5);
                  var2 = -1;
                  if(var7.equals("lt")) {
                     var6 = '<';
                  } else {
                     if(!var7.equals("gt")) {
                        if(var7.startsWith("img=") || var7.startsWith("irm=")) {
                           try {
                              int var8 = HeadbarType.method2073(var7.substring(4));
                              var4 += modIcons[var8].originalWidth;
                              var3 = -1;
                           } catch (Exception var10) {
                              ;
                           }
                        } else if (var7.startsWith("member=")) {
                           try {
                              int var8 = HeadbarType.method2073(var7.substring(7));
                              var4 += memberIcons[var8].originalWidth;
                              var3 = -1;
                           } catch (Exception var10) {
                              ;
                           }
                        }
                        continue;
                     }

                     var6 = '>';
                  }
               }

               if(var6 == 160) {
                  var6 = ' ';
               }

               if(var2 == -1) {
                  var4 += this.field3789[(char)(ChatLine.method5916(var6) & 255)];
                  if(this.field3780 != null && var3 != -1) {
                     var4 += this.field3780[var6 + (var3 << 8)];
                  }

                  var3 = var6;
               }
            }
         }

         return var4;
      }
   }

   @ObfuscatedName("p")
   int method6159(char var1) {
      if(var1 == 160) {
         var1 = ' ';
      }

      return this.field3789[ChatLine.method5916(var1) & 255];
   }

   @ObfuscatedName("b")
   public int method6211(String var1, int var2) {
      int var3 = this.method6240(var1, new int[]{var2}, field3791);
      int var4 = 0;

      for(int var5 = 0; var5 < var3; ++var5) {
         int var6 = this.method6160(field3791[var5]);
         if(var6 > var4) {
            var4 = var6;
         }
      }

      return var4;
   }

   @ObfuscatedName("aw")
   void method6161(String var1, int var2, int var3) {
      var3 -= this.verticalSpace;
      int var4 = -1;
      int var5 = -1;

      for(int var6 = 0; var6 < var1.length(); ++var6) {
         if(var1.charAt(var6) != 0) {
            char var7 = (char)(ChatLine.method5916(var1.charAt(var6)) & 255);
            if(var7 == '<') {
               var4 = var6;
            } else {
               int var9;
               if(var7 == '>' && var4 != -1) {
                  String var8 = var1.substring(var4 + 1, var6);
                  var4 = -1;
                  if(var8.equals("lt")) {
                     var7 = '<';
                  } else {
                     if(!var8.equals("gt")) {
                        if(var8.startsWith("img=") || var8.startsWith("irm=")) {
                           try {
                              var9 = HeadbarType.method2073(var8.substring(4));
                              IndexedSprite var10 = modIcons[var9];
                              var10.method4282(var2, var3 + this.verticalSpace - var10.originalHeight);
                              var2 += var10.originalWidth;
                              var5 = -1;
                           } catch (Exception var14) {
                              ;
                           }
                        } else if (var8.startsWith("member=")) {
                           try {
                              var9 = HeadbarType.method2073(var8.substring(7));
                              IndexedSprite var10 = memberIcons[var9];
                              var10.method4282(var2, var3 + this.verticalSpace - var10.originalHeight);
                              var2 += var10.originalWidth;
                              var5 = -1;
                           } catch (Exception var14) {
                              ;
                           }
                        } else {
                           this.method6175(var8);
                        }
                        continue;
                     }

                     var7 = '>';
                  }
               }

               if(var7 == 160) {
                  var7 = ' ';
               }

               if(var4 == -1) {
                  if(this.field3780 != null && var5 != -1) {
                     var2 += this.field3780[var7 + (var5 << 8)];
                  }

                  int var12 = this.gylphHeights[var7];
                  var9 = this.glyphWidths[var7];
                  if(var7 != ' ') {
                     if(field3787 == 256) {
                        if(shadow != -1) {
                           method6181(this.gylphs[var7], var2 + this.horizontalOffsets[var7] + 1, var3 + this.verticalOffsets[var7] + 1, var12, var9, shadow);
                        }

                        this.vmethod6179(this.gylphs[var7], var2 + this.horizontalOffsets[var7], var3 + this.verticalOffsets[var7], var12, var9, color);
                     } else {
                        if(shadow != -1) {
                           method6183(this.gylphs[var7], var2 + this.horizontalOffsets[var7] + 1, var3 + this.verticalOffsets[var7] + 1, var12, var9, shadow, field3787);
                        }

                        this.vmethod6224(this.gylphs[var7], var2 + this.horizontalOffsets[var7], var3 + this.verticalOffsets[var7], var12, var9, color, field3787);
                     }
                  } else if(field3775 > 0) {
                     field3778 += field3775;
                     var2 += field3778 >> 8;
                     field3778 &= 255;
                  }

                  int var13 = this.field3789[var7];
                  if(strikeRGB != -1) {
                     Rasterizer2D.method698(var2, var3 + (int)((double)this.verticalSpace * 0.7D), var13, strikeRGB);
                  }

                  if(underlineRGB != -1) {
                     Rasterizer2D.method698(var2, var3 + this.verticalSpace + 1, var13, underlineRGB);
                  }

                  var2 += var13;
                  var5 = var7;
               }
            }
         }
      }

   }

   @ObfuscatedName("o")
   public void method6222(String var1, int var2, int var3, int var4, int var5) {
      if(var1 != null) {
         this.method6174(var4, var5);
         this.method6161(var1, var2 - this.method6160(var1) / 2, var3);
      }
   }

   @ObfuscatedName("a")
   abstract void vmethod6179(byte[] var1, int var2, int var3, int var4, int var5, int var6);

   @ObfuscatedName("n")
   public int method6163(String var1, int var2) {
      return this.method6240(var1, new int[]{var2}, field3791);
   }

   @ObfuscatedName("c")
   public void method6173(String var1, int var2, int var3, int var4, int var5, int var6) {
      if(var1 != null) {
         this.method6174(var4, var5);
         field3773.setSeed((long)var6);
         field3787 = 192 + (field3773.nextInt() & 31);
         int[] var7 = new int[var1.length()];
         int var8 = 0;

         for(int var9 = 0; var9 < var1.length(); ++var9) {
            var7[var9] = var8;
            if((field3773.nextInt() & 3) == 0) {
               ++var8;
            }
         }

         this.method6178(var1, var2, var3, var7, (int[])null);
      }
   }

   @ObfuscatedName("t")
   public void method6191(String var1, int var2, int var3, int var4, int var5, int var6) {
      if(var1 != null) {
         this.method6174(var4, var5);
         field3787 = var6;
         this.method6161(var1, var2, var3);
      }
   }

   @ObfuscatedName("ah")
   void method6176(String var1, int var2) {
      int var3 = 0;
      boolean var4 = false;

      for(int var5 = 0; var5 < var1.length(); ++var5) {
         char var6 = var1.charAt(var5);
         if(var6 == '<') {
            var4 = true;
         } else if(var6 == '>') {
            var4 = false;
         } else if(!var4 && var6 == ' ') {
            ++var3;
         }
      }

      if(var3 > 0) {
         field3775 = (var2 - this.method6160(var1) << 8) / var3;
      }

   }

   @ObfuscatedName("an")
   void method6178(String var1, int var2, int var3, int[] var4, int[] var5) {
      var3 -= this.verticalSpace;
      int var6 = -1;
      int var7 = -1;
      int var8 = 0;

      for(int var9 = 0; var9 < var1.length(); ++var9) {
         if(var1.charAt(var9) != 0) {
            char var10 = (char)(ChatLine.method5916(var1.charAt(var9)) & 255);
            if(var10 == '<') {
               var6 = var9;
            } else {
               int var12;
               int var13;
               int var14;
               if(var10 == '>' && var6 != -1) {
                  String var11 = var1.substring(var6 + 1, var9);
                  var6 = -1;
                  if(var11.equals("lt")) {
                     var10 = '<';
                  } else {
                     if(!var11.equals("gt")) {
                        if(var11.startsWith("img=") || var11.startsWith("irm=")) {
                           try {
                              if(var4 != null) {
                                 var12 = var4[var8];
                              } else {
                                 var12 = 0;
                              }

                              if(var5 != null) {
                                 var13 = var5[var8];
                              } else {
                                 var13 = 0;
                              }

                              ++var8;
                              var14 = HeadbarType.method2073(var11.substring(4));
                              IndexedSprite var15 = modIcons[var14];
                              var15.method4282(var12 + var2, var13 + (var3 + this.verticalSpace - var15.originalHeight));
                              var2 += var15.originalWidth;
                              var7 = -1;
                           } catch (Exception var19) {
                              ;
                           }
                        } else if(var11.startsWith("member=")) {
                           try {
                              if(var4 != null) {
                                 var12 = var4[var8];
                              } else {
                                 var12 = 0;
                              }

                              if(var5 != null) {
                                 var13 = var5[var8];
                              } else {
                                 var13 = 0;
                              }

                              ++var8;
                              var14 = HeadbarType.method2073(var11.substring(7));
                              IndexedSprite var15 = memberIcons[var14];
                              var15.method4282(var12 + var2, var13 + (var3 + this.verticalSpace - var15.originalHeight));
                              var2 += var15.originalWidth;
                              var7 = -1;
                           } catch (Exception var19) {
                              ;
                           }
                        } else {
                           this.method6175(var11);
                        }
                        continue;
                     }

                     var10 = '>';
                  }
               }

               if(var10 == 160) {
                  var10 = ' ';
               }

               if(var6 == -1) {
                  if(this.field3780 != null && var7 != -1) {
                     var2 += this.field3780[var10 + (var7 << 8)];
                  }

                  int var17 = this.gylphHeights[var10];
                  var12 = this.glyphWidths[var10];
                  if(var4 != null) {
                     var13 = var4[var8];
                  } else {
                     var13 = 0;
                  }

                  if(var5 != null) {
                     var14 = var5[var8];
                  } else {
                     var14 = 0;
                  }

                  ++var8;
                  if(var10 != ' ') {
                     if(field3787 == 256) {
                        if(shadow != -1) {
                           method6181(this.gylphs[var10], var13 + var2 + this.horizontalOffsets[var10] + 1, var3 + var14 + this.verticalOffsets[var10] + 1, var17, var12, shadow);
                        }

                        this.vmethod6179(this.gylphs[var10], var13 + var2 + this.horizontalOffsets[var10], var3 + var14 + this.verticalOffsets[var10], var17, var12, color);
                     } else {
                        if(shadow != -1) {
                           method6183(this.gylphs[var10], var13 + var2 + this.horizontalOffsets[var10] + 1, var3 + var14 + this.verticalOffsets[var10] + 1, var17, var12, shadow, field3787);
                        }

                        this.vmethod6224(this.gylphs[var10], var13 + var2 + this.horizontalOffsets[var10], var3 + var14 + this.verticalOffsets[var10], var17, var12, color, field3787);
                     }
                  } else if(field3775 > 0) {
                     field3778 += field3775;
                     var2 += field3778 >> 8;
                     field3778 &= 255;
                  }

                  int var18 = this.field3789[var10];
                  if(strikeRGB != -1) {
                     Rasterizer2D.method698(var2, var3 + (int)((double)this.verticalSpace * 0.7D), var18, strikeRGB);
                  }

                  if(underlineRGB != -1) {
                     Rasterizer2D.method698(var2, var3 + this.verticalSpace, var18, underlineRGB);
                  }

                  var2 += var18;
                  var7 = var10;
               }
            }
         }
      }

   }

   public int getBaseline() {
      return this.verticalSpace;
   }

   public int getTextWidth(String var1) {
      return this.method6160(var1);
   }

   public void drawTextLeftAligned(String var1, int var2, int var3, int var4, int var5) {
      this.method6165(var1, var2, var3, var4, var5);
   }

   @ObfuscatedName("y")
   public void method6170(String var1, int var2, int var3, int var4, int var5, int var6) {
      if(var1 != null) {
         this.method6174(var4, var5);
         int[] var7 = new int[var1.length()];

         for(int var8 = 0; var8 < var1.length(); ++var8) {
            var7[var8] = (int)(Math.sin((double)var8 / 2.0D + (double)var6 / 5.0D) * 5.0D);
         }

         this.method6178(var1, var2 - this.method6160(var1) / 2, var3, (int[])null, var7);
      }
   }

   @ObfuscatedName("aa")
   void method6174(int var1, int var2) {
      strikeRGB = -1;
      underlineRGB = -1;
      prevShadeRGB = var2;
      shadow = var2;
      prevColorRGB = var1;
      color = var1;
      field3787 = 256;
      field3775 = 0;
      field3778 = 0;
   }

   @ObfuscatedName("s")
   abstract void vmethod6224(byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7);

   @ObfuscatedName("h")
   void method6156(byte[] var1) {
      this.field3789 = new int[256];
      int var2;
      if(var1.length == 257) {
         for(var2 = 0; var2 < this.field3789.length; ++var2) {
            this.field3789[var2] = var1[var2] & 255;
         }

         this.verticalSpace = var1[256] & 255;
      } else {
         var2 = 0;

         for(int var3 = 0; var3 < 256; ++var3) {
            this.field3789[var3] = var1[var2++] & 255;
         }

         int[] var10 = new int[256];
         int[] var4 = new int[256];

         int var5;
         for(var5 = 0; var5 < 256; ++var5) {
            var10[var5] = var1[var2++] & 255;
         }

         for(var5 = 0; var5 < 256; ++var5) {
            var4[var5] = var1[var2++] & 255;
         }

         byte[][] var11 = new byte[256][];

         int var8;
         for(int var6 = 0; var6 < 256; ++var6) {
            var11[var6] = new byte[var10[var6]];
            byte var7 = 0;

            for(var8 = 0; var8 < var11[var6].length; ++var8) {
               var7 += var1[var2++];
               var11[var6][var8] = var7;
            }
         }

         byte[][] var12 = new byte[256][];

         int var13;
         for(var13 = 0; var13 < 256; ++var13) {
            var12[var13] = new byte[var10[var13]];
            byte var14 = 0;

            for(int var9 = 0; var9 < var12[var13].length; ++var9) {
               var14 += var1[var2++];
               var12[var13][var9] = var14;
            }
         }

         this.field3780 = new byte[65536];

         for(var13 = 0; var13 < 256; ++var13) {
            if(var13 != 32 && var13 != 160) {
               for(var8 = 0; var8 < 256; ++var8) {
                  if(var8 != 32 && var8 != 160) {
                     this.field3780[var8 + (var13 << 8)] = (byte)method6225(var11, var12, var4, this.field3789, var10, var13, var8);
                  }
               }
            }
         }

         this.verticalSpace = var4[32] + var10[32];
      }

   }

   @ObfuscatedName("u")
   public int method6207(String var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
      if(var1 == null) {
         return 0;
      } else {
         this.method6174(var6, var7);
         if(var10 == 0) {
            var10 = this.verticalSpace;
         }

         int[] var11 = new int[]{var4};
         if(var5 < var10 + this.minSpacing + this.maxSpacing && var5 < var10 + var10) {
            var11 = null;
         }

         int var12 = this.method6240(var1, var11, field3791);
         if(var9 == 3 && var12 == 1) {
            var9 = 1;
         }

         int var13;
         int var14;
         if(var9 == 0) {
            var13 = var3 + this.minSpacing;
         } else if(var9 == 1) {
            var13 = var3 + (var5 - this.minSpacing - this.maxSpacing - var10 * (var12 - 1)) / 2 + this.minSpacing;
         } else if(var9 == 2) {
            var13 = var3 + var5 - this.maxSpacing - var10 * (var12 - 1);
         } else {
            var14 = (var5 - this.minSpacing - this.maxSpacing - var10 * (var12 - 1)) / (var12 + 1);
            if(var14 < 0) {
               var14 = 0;
            }

            var13 = var3 + var14 + this.minSpacing;
            var10 += var14;
         }

         for(var14 = 0; var14 < var12; ++var14) {
            if(var8 == 0) {
               this.method6161(field3791[var14], var2, var13);
            } else if(var8 == 1) {
               this.method6161(field3791[var14], var2 + (var4 - this.method6160(field3791[var14])) / 2, var13);
            } else if(var8 == 2) {
               this.method6161(field3791[var14], var2 + var4 - this.method6160(field3791[var14]), var13);
            } else if(var14 == var12 - 1) {
               this.method6161(field3791[var14], var2, var13);
            } else {
               this.method6176(field3791[var14], var4);
               this.method6161(field3791[var14], var2, var13);
               field3775 = 0;
            }

            var13 += var10;
         }

         return var12;
      }
   }

   @ObfuscatedName("ab")
   void method6175(String var1) {
      try {
         if(var1.startsWith("col=")) {
            color = class314.method6302(var1.substring(4), 16);
         } else if(var1.equals("/col")) {
            color = prevColorRGB;
         } else if(var1.startsWith("str=")) {
            strikeRGB = class314.method6302(var1.substring(4), 16);
         } else if(var1.equals("str")) {
            strikeRGB = 8388608;
         } else if(var1.equals("/str")) {
            strikeRGB = -1;
         } else if(var1.startsWith("u=")) {
            underlineRGB = class314.method6302(var1.substring(2), 16);
         } else if(var1.equals("u")) {
            underlineRGB = 0;
         } else if(var1.equals("/u")) {
            underlineRGB = -1;
         } else if(var1.startsWith("shad=")) {
            shadow = class314.method6302(var1.substring(5), 16);
         } else if(var1.equals("shad")) {
            shadow = 0;
         } else if(var1.equals("/shad")) {
            shadow = prevShadeRGB;
         } else if(var1.equals("br")) {
            this.method6174(prevColorRGB, prevShadeRGB);
         }
      } catch (Exception var3) {
         ;
      }

   }

   @ObfuscatedName("f")
   static int method6225(byte[][] var0, byte[][] var1, int[] var2, int[] var3, int[] var4, int var5, int var6) {
      int var7 = var2[var5];
      int var8 = var7 + var4[var5];
      int var9 = var2[var6];
      int var10 = var9 + var4[var6];
      int var11 = var7;
      if(var9 > var7) {
         var11 = var9;
      }

      int var12 = var8;
      if(var10 < var8) {
         var12 = var10;
      }

      int var13 = var3[var5];
      if(var3[var6] < var13) {
         var13 = var3[var6];
      }

      byte[] var14 = var1[var5];
      byte[] var15 = var0[var6];
      int var16 = var11 - var7;
      int var17 = var11 - var9;

      for(int var18 = var11; var18 < var12; ++var18) {
         int var19 = var14[var16++] + var15[var17++];
         if(var19 < var13) {
            var13 = var19;
         }
      }

      return -var13;
   }

   @ObfuscatedName("e")
   public static String method6234(String var0) {
      int var1 = var0.length();
      int var2 = 0;

      for(int var3 = 0; var3 < var1; ++var3) {
         char var4 = var0.charAt(var3);
         if(var4 == '<' || var4 == '>') {
            var2 += 3;
         }
      }

      StringBuilder var6 = new StringBuilder(var1 + var2);

      for(int var7 = 0; var7 < var1; ++var7) {
         char var5 = var0.charAt(var7);
         if(var5 == '<') {
            var6.append("<lt>");
         } else if(var5 == '>') {
            var6.append("<gt>");
         } else {
            var6.append(var5);
         }
      }

      return var6.toString();
   }

   @ObfuscatedName("ae")
   static void method6182(int[] var0, byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      int var9 = -(var5 >> 2);
      var5 = -(var5 & 3);

      for(int var10 = -var6; var10 < 0; ++var10) {
         int var11;
         for(var11 = var9; var11 < 0; ++var11) {
            if(var1[var3++] != 0) {
               var0[var4++] = var2 | -16777216;
            } else {
               ++var4;
            }

            if(var1[var3++] != 0) {
               var0[var4++] = var2 | -16777216;
            } else {
               ++var4;
            }

            if(var1[var3++] != 0) {
               var0[var4++] = var2 | -16777216;
            } else {
               ++var4;
            }

            if(var1[var3++] != 0) {
               var0[var4++] = var2 | -16777216;
            } else {
               ++var4;
            }
         }

         for(var11 = var5; var11 < 0; ++var11) {
            if(var1[var3++] != 0) {
               var0[var4++] = var2 | -16777216;
            } else {
               ++var4;
            }
         }

         var4 += var7;
         var3 += var8;
      }

   }

   @ObfuscatedName("au")
   static void method6184(int[] var0, byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      var2 = ((var2 & 65280) * var9 & 16711680) + (var9 * (var2 & 16711935) & -16711936) >> 8;
      var9 = 256 - var9;

      for(int var10 = -var6; var10 < 0; ++var10) {
         for(int var11 = -var5; var11 < 0; ++var11) {
            if(var1[var3++] != 0) {
               int var12 = var0[var4];
               client.drawAlpha(var0, var4++, (((var12 & 65280) * var9 & 16711680) + ((var12 & 16711935) * var9 & -16711936) >> 8) + var2, 255 - var9);
            } else {
               ++var4;
            }
         }

         var4 += var7;
         var3 += var8;
      }

   }

   @ObfuscatedName("av")
   static void method6183(byte[] var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      int var7 = var1 + var2 * Rasterizer2D.graphicsPixelsWidth;
      int var8 = Rasterizer2D.graphicsPixelsWidth - var3;
      int var9 = 0;
      int var10 = 0;
      int var11;
      if(var2 < Rasterizer2D.drawingAreaTop) {
         var11 = Rasterizer2D.drawingAreaTop - var2;
         var4 -= var11;
         var2 = Rasterizer2D.drawingAreaTop;
         var10 += var3 * var11;
         var7 += var11 * Rasterizer2D.graphicsPixelsWidth;
      }

      if(var2 + var4 > Rasterizer2D.drawingAreaRight) {
         var4 -= var2 + var4 - Rasterizer2D.drawingAreaRight;
      }

      if(var1 < Rasterizer2D.draw_region_x) {
         var11 = Rasterizer2D.draw_region_x - var1;
         var3 -= var11;
         var1 = Rasterizer2D.draw_region_x;
         var10 += var11;
         var7 += var11;
         var9 += var11;
         var8 += var11;
      }

      if(var3 + var1 > Rasterizer2D.drawingAreaBottom) {
         var11 = var3 + var1 - Rasterizer2D.drawingAreaBottom;
         var3 -= var11;
         var9 += var11;
         var8 += var11;
      }

      if(var3 > 0 && var4 > 0) {
         method6184(Rasterizer2D.graphicsPixels, var0, var5, var10, var7, var3, var4, var8, var9, var6);
      }
   }

   @ObfuscatedName("at")
   static void method6181(byte[] var0, int var1, int var2, int var3, int var4, int var5) {
      int var6 = var1 + var2 * Rasterizer2D.graphicsPixelsWidth;
      int var7 = Rasterizer2D.graphicsPixelsWidth - var3;
      int var8 = 0;
      int var9 = 0;
      int var10;
      if(var2 < Rasterizer2D.drawingAreaTop) {
         var10 = Rasterizer2D.drawingAreaTop - var2;
         var4 -= var10;
         var2 = Rasterizer2D.drawingAreaTop;
         var9 += var3 * var10;
         var6 += var10 * Rasterizer2D.graphicsPixelsWidth;
      }

      if(var2 + var4 > Rasterizer2D.drawingAreaRight) {
         var4 -= var2 + var4 - Rasterizer2D.drawingAreaRight;
      }

      if(var1 < Rasterizer2D.draw_region_x) {
         var10 = Rasterizer2D.draw_region_x - var1;
         var3 -= var10;
         var1 = Rasterizer2D.draw_region_x;
         var9 += var10;
         var6 += var10;
         var8 += var10;
         var7 += var10;
      }

      if(var3 + var1 > Rasterizer2D.drawingAreaBottom) {
         var10 = var3 + var1 - Rasterizer2D.drawingAreaBottom;
         var3 -= var10;
         var8 += var10;
         var7 += var10;
      }

      if(var3 > 0 && var4 > 0) {
         method6182(Rasterizer2D.graphicsPixels, var0, var5, var9, var6, var3, var4, var7, var8);
      }
   }
}
