package net.runelite.standalone;

import net.runelite.api.Perspective;
import net.runelite.api.Point;
import net.runelite.api.hooks.DrawCallbacks;
import net.runelite.api.model.Jarvis;
import net.runelite.api.model.Triangle;
import net.runelite.api.model.Vertex;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.api.RSFrame;
import net.runelite.rs.api.RSFrameMap;
import net.runelite.rs.api.RSFrames;
import net.runelite.rs.api.RSModel;

import java.awt.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@ObfuscatedName("dv")
public class Model extends Entity implements RSModel {
   @ObfuscatedName("ak")
   static int[] field1722;
   @ObfuscatedName("bh")
   static int[] field1710;
   @ObfuscatedName("aq")
   static int[] modelViewportXs;
   @ObfuscatedName("bb")
   static int[] Model_cosine;
   @ObfuscatedName("al")
   static int[] field1681;
   @ObfuscatedName("bz")
   static int[] field1716;
   @ObfuscatedName("bg")
   static int animOffsetZ;
   @ObfuscatedName("bd")
   static int[] field1705;
   @ObfuscatedName("x")
   static byte[] field1663;
   @ObfuscatedName("bo")
   static int[] field1713;
   @ObfuscatedName("bp")
   static int animOffsetX;
   @ObfuscatedName("a")
   @ObfuscatedSignature(
           signature = "Ldv;"
   )
   static Model field1665;
   @ObfuscatedName("ai")
   static int[] modelViewportYs;
   @ObfuscatedName("bk")
   static boolean useBoundingBoxes3D;
   @ObfuscatedName("be")
   static int[] field1700;
   @ObfuscatedName("bv")
   static int animOffsetY;
   @ObfuscatedName("am")
   static int[][] field1715;
   @ObfuscatedName("bf")
   static int[] field1712;
   @ObfuscatedName("as")
   static boolean[] field1699;
   @ObfuscatedName("ax")
   static int[] field1708;
   @ObfuscatedName("ar")
   static boolean[] field1679;
   @ObfuscatedName("s")
   static byte[] field1661;
   @ObfuscatedName("bl")
   static int[] Model_sine;
   @ObfuscatedName("az")
   static int[] yViewportBuffer;
   @ObfuscatedName("bw")
   static int[] field1726;
   @ObfuscatedName("ap")
   static int[][] field1709;
   @ObfuscatedName("ac")
   static int[] field1662;
   @ObfuscatedName("bi")
   static int[] xViewportBuffer;
   @ObfuscatedName("ao")
   static int[] field1703;
   @ObfuscatedName("g")
   @ObfuscatedSignature(
           signature = "Ldv;"
   )
   static Model field1690;
   @ObfuscatedName("f")
   int[] verticesX;
   @ObfuscatedName("l")
   int[] field1674;
   @ObfuscatedName("v")
   byte field1671;
   @ObfuscatedName("e")
   int[] indices3;
   @ObfuscatedName("r")
   int[] field1672;
   @ObfuscatedName("af")
   int boundsType;
   @ObfuscatedName("ae")
   int extremeX;
   @ObfuscatedName("k")
   short[] field1678;
   @ObfuscatedName("w")
   int[] field1728;
   @ObfuscatedName("q")
   int indicesCount;
   @ObfuscatedName("au")
   int extremeZ;
   @ObfuscatedName("m")
   int[] verticesZ;
   @ObfuscatedName("p")
   int[] verticesY;
   @ObfuscatedName("ag")
   public boolean field1696;
   @ObfuscatedName("b")
   int[] indices1;
   @ObfuscatedName("aw")
   int centerX;
   @ObfuscatedName("o")
   byte[] field1675;
   @ObfuscatedName("z")
   int[][] field1685;
   @ObfuscatedName("n")
   int[] indices2;
   @ObfuscatedName("av")
   int extremeY;
   @ObfuscatedName("c")
   int[] field1683;
   @ObfuscatedName("t")
   int[] field1673;
   @ObfuscatedName("ay")
   int bottomY;
   @ObfuscatedName("ah")
   int radius;
   @ObfuscatedName("an")
   int centerY;
   public int rl$sceneId;
   public int rl$bufferOffset;
   public int rl$uvBufferOffset;
   public float[][] rl$faceTextureUCoordinates;
   public float[][] rl$faceTextureVCoordinates;
   @ObfuscatedName("i")
   int[] field1682;
   @ObfuscatedName("at")
   int centerZ;
   @ObfuscatedName("y")
   byte[] field1729;
   @ObfuscatedName("d")
   int field1689;
   @ObfuscatedName("j")
   int[][] vertexGroups;
   @ObfuscatedName("aa")
   int XYZMag;
   @ObfuscatedName("h")
   int verticesCount;
   @ObfuscatedName("u")
   byte[] field1676;
   @ObfuscatedName("ab")
   int diameter;

   static {
      field1665 = new Model();
      field1661 = new byte[1];
      field1690 = new Model();
      field1663 = new byte[1];
      field1699 = new boolean[4700];
      field1679 = new boolean[4700];
      modelViewportYs = new int[4700];
      modelViewportXs = new int[4700];
      field1681 = new int[4700];
      yViewportBuffer = new int[4700];
      field1662 = new int[4700];
      field1703 = new int[4700];
      field1708 = new int[1600];
      field1709 = new int[1600][512];
      field1722 = new int[12];
      field1715 = new int[12][2000];
      field1712 = new int[2000];
      field1713 = new int[2000];
      field1700 = new int[12];
      field1705 = new int[10];
      field1716 = new int[10];
      xViewportBuffer = new int[10];
      useBoundingBoxes3D = true;
      Model_sine = Graphics3D.SINE;
      Model_cosine = Graphics3D.COSINE;
      field1726 = Graphics3D.colorPalette;
      field1710 = Graphics3D.field1777;
   }

   Model() {
      this.verticesCount = 0;
      this.indicesCount = 0;
      this.field1671 = 0;
      this.field1689 = 0;
      this.field1696 = false;
      this.extremeX = -1;
      this.extremeY = -1;
      this.extremeZ = -1;
      this.rl$$init();
   }

   @ObfuscatedSignature(
           signature = "([Ldv;I)V"
   )
   public Model(Model[] var1, int var2) {
      this.verticesCount = 0;
      this.indicesCount = 0;
      this.field1671 = 0;
      this.field1689 = 0;
      this.field1696 = false;
      this.extremeX = -1;
      this.extremeY = -1;
      this.extremeZ = -1;
      boolean var3 = false;
      boolean var4 = false;
      boolean var5 = false;
      boolean var6 = false;
      this.verticesCount = 0;
      this.indicesCount = 0;
      this.field1689 = 0;
      this.field1671 = -1;

      int var7;
      Model var8;
      for(var7 = 0; var7 < var2; ++var7) {
         var8 = var1[var7];
         if(var8 != null) {
            this.verticesCount += var8.verticesCount;
            this.indicesCount += var8.indicesCount;
            this.field1689 += var8.field1689;
            if(var8.field1675 != null) {
               var3 = true;
            } else {
               if(this.field1671 == -1) {
                  this.field1671 = var8.field1671;
               }

               if(this.field1671 != var8.field1671) {
                  var3 = true;
               }
            }

            var4 |= var8.field1676 != null;
            var5 |= var8.field1678 != null;
            var6 |= var8.field1729 != null;
         }
      }

      this.verticesX = new int[this.verticesCount];
      this.verticesY = new int[this.verticesCount];
      this.verticesZ = new int[this.verticesCount];
      this.indices1 = new int[this.indicesCount]; // triangle X
      this.indices2 = new int[this.indicesCount]; // triangle Y
      this.indices3 = new int[this.indicesCount]; // triangle Z
      this.field1672 = new int[this.indicesCount];
      this.field1673 = new int[this.indicesCount];
      this.field1674 = new int[this.indicesCount];
      if(var3) {
         this.field1675 = new byte[this.indicesCount];
      }

      if(var4) {
         this.field1676 = new byte[this.indicesCount];
      }

      if(var5) {
         this.field1678 = new short[this.indicesCount];
      }

      if(var6) {
         this.field1729 = new byte[this.indicesCount];
      }

      if(this.field1689 > 0) {
         this.field1728 = new int[this.field1689];
         this.field1682 = new int[this.field1689];
         this.field1683 = new int[this.field1689];
      }

      this.verticesCount = 0;
      this.indicesCount = 0;
      this.field1689 = 0;

      for(var7 = 0; var7 < var2; ++var7) {
         var8 = var1[var7];
         if(var8 != null) {
            int var9;
            for(var9 = 0; var9 < var8.indicesCount; ++var9) {
               this.indices1[this.indicesCount] = this.verticesCount + var8.indices1[var9];
               this.indices2[this.indicesCount] = this.verticesCount + var8.indices2[var9];
               this.indices3[this.indicesCount] = this.verticesCount + var8.indices3[var9];
               this.field1672[this.indicesCount] = var8.field1672[var9];
               this.field1673[this.indicesCount] = var8.field1673[var9];
               this.field1674[this.indicesCount] = var8.field1674[var9];
               if(var3) {
                  if(var8.field1675 != null) {
                     this.field1675[this.indicesCount] = var8.field1675[var9];
                  } else {
                     this.field1675[this.indicesCount] = var8.field1671;
                  }
               }

               if(var4 && var8.field1676 != null) {
                  this.field1676[this.indicesCount] = var8.field1676[var9];
               }

               if(var5) {
                  if(var8.field1678 != null) {
                     this.field1678[this.indicesCount] = var8.field1678[var9];
                  } else {
                     this.field1678[this.indicesCount] = -1;
                  }
               }

               if(var6) {
                  if(var8.field1729 != null && var8.field1729[var9] != -1) {
                     this.field1729[this.indicesCount] = (byte)(this.field1689 + var8.field1729[var9]);
                  } else {
                     this.field1729[this.indicesCount] = -1;
                  }
               }

               ++this.indicesCount;
            }

            for(var9 = 0; var9 < var8.field1689; ++var9) {
               this.field1728[this.field1689] = this.verticesCount + var8.field1728[var9];
               this.field1682[this.field1689] = this.verticesCount + var8.field1682[var9];
               this.field1683[this.field1689] = this.verticesCount + var8.field1683[var9];
               ++this.field1689;
            }

            for(var9 = 0; var9 < var8.verticesCount; ++var9) {
               this.verticesX[this.verticesCount] = var8.verticesX[var9];
               this.verticesY[this.verticesCount] = var8.verticesY[var9];
               this.verticesZ[this.verticesCount] = var8.verticesZ[var9];
               ++this.verticesCount;
            }
         }
      }

      this.rl$$init();
      this.rl$init(var1, var2);
   }

   @ObfuscatedName("f")
   public void method3833() {
      if(this.boundsType != 1) {
         this.boundsType = 1;
         super.modelHeight = 0;
         this.bottomY = 0;
         this.XYZMag = 0;

         for(int var1 = 0; var1 < this.verticesCount; ++var1) {
            int var2 = this.verticesX[var1];
            int var3 = this.verticesY[var1];
            int var4 = this.verticesZ[var1];
            if(-var3 > super.modelHeight) {
               super.modelHeight = -var3;
            }

            if(var3 > this.bottomY) {
               this.bottomY = var3;
            }

            int var5 = var2 * var2 + var4 * var4;
            if(var5 > this.XYZMag) {
               this.XYZMag = var5;
            }
         }

         this.XYZMag = (int)(Math.sqrt((double)this.XYZMag) + 0.99D);
         this.radius = (int)(Math.sqrt((double)(this.XYZMag * this.XYZMag + super.modelHeight * super.modelHeight)) + 0.99D);
         this.diameter = this.radius + (int)(Math.sqrt((double)(this.XYZMag * this.XYZMag + this.bottomY * this.bottomY)) + 0.99D);
      }
   }

   @ObfuscatedName("l")
   public void method3839() {
      for(int var1 = 0; var1 < this.verticesCount; ++var1) {
         this.verticesX[var1] = -this.verticesX[var1];
         this.verticesZ[var1] = -this.verticesZ[var1];
      }

      this.method3826();
   }

   @ObfuscatedName("v")
   public final void method3844(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      field1708[0] = -1;
      if(this.boundsType != 2 && this.boundsType != 1) {
         this.method3859();
      }

      int var8 = Graphics3D.centerX;
      int var9 = Graphics3D.centerY;
      int var10 = Model_sine[var1];
      int var11 = Model_cosine[var1];
      int var12 = Model_sine[var2];
      int var13 = Model_cosine[var2];
      int var14 = Model_sine[var3];
      int var15 = Model_cosine[var3];
      int var16 = Model_sine[var4];
      int var17 = Model_cosine[var4];
      int var18 = var16 * var6 + var17 * var7 >> 16;

      for(int var19 = 0; var19 < this.verticesCount; ++var19) {
         int var20 = this.verticesX[var19];
         int var21 = this.verticesY[var19];
         int var22 = this.verticesZ[var19];
         int var23;
         if(var3 != 0) {
            var23 = var21 * var14 + var20 * var15 >> 16;
            var21 = var21 * var15 - var20 * var14 >> 16;
            var20 = var23;
         }

         if(var1 != 0) {
            var23 = var21 * var11 - var22 * var10 >> 16;
            var22 = var21 * var10 + var22 * var11 >> 16;
            var21 = var23;
         }

         if(var2 != 0) {
            var23 = var22 * var12 + var20 * var13 >> 16;
            var22 = var22 * var13 - var20 * var12 >> 16;
            var20 = var23;
         }

         var20 += var5;
         var21 += var6;
         var22 += var7;
         var23 = var21 * var17 - var22 * var16 >> 16;
         var22 = var21 * var16 + var22 * var17 >> 16;
         field1681[var19] = var22 - var18;
         modelViewportYs[var19] = var20 * Graphics3D.Rasterizer3D_zoom / var22 + var8;
         modelViewportXs[var19] = var23 * Graphics3D.Rasterizer3D_zoom / var22 + var9;
         if(this.field1689 > 0) {
            yViewportBuffer[var19] = var20;
            field1662[var19] = var23;
            field1703[var19] = var22;
         }
      }

      try {
         this.method3847(false, false, false, 0L);
      } catch (Exception var25) {
         ;
      }

   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
           signature = "(Lei;ILei;I[I)V"
   )
   public void method3832(Frames var1, int var2, Frames var3, int var4, int[] var5) {
      if(var2 != -1) {
         if(var5 != null && var4 != -1) {
            Frame var6 = var1.skeletons[var2];
            Frame var7 = var3.skeletons[var4];
            FrameMap var8 = var6.skin;
            animOffsetX = 0;
            animOffsetY = 0;
            animOffsetZ = 0;
            byte var9 = 0;
            int var13 = var9 + 1;
            int var10 = var5[var9];

            int var11;
            int var12;
            for(var11 = 0; var11 < var6.transformCount; ++var11) {
               for(var12 = var6.transformTypes[var11]; var12 > var10; var10 = var5[var13++]) {
                  ;
               }

               if(var12 != var10 || var8.types[var12] == 0) {
                  this.method3837(var8.types[var12], var8.list[var12], var6.translator_x[var11], var6.translator_y[var11], var6.translator_z[var11]);
               }
            }

            animOffsetX = 0;
            animOffsetY = 0;
            animOffsetZ = 0;
            var9 = 0;
            var13 = var9 + 1;
            var10 = var5[var9];

            for(var11 = 0; var11 < var7.transformCount; ++var11) {
               for(var12 = var7.transformTypes[var11]; var12 > var10; var10 = var5[var13++]) {
                  ;
               }

               if(var12 == var10 || var8.types[var12] == 0) {
                  this.method3837(var8.types[var12], var8.list[var12], var7.translator_x[var11], var7.translator_y[var11], var7.translator_z[var11]);
               }
            }

            this.method3826();
         } else {
            this.method3835(var1, var2);
         }
      }
   }

   @ObfuscatedName("r")
   void method3837(int var1, int[] var2, int var3, int var4, int var5) {
      int var6 = var2.length;
      int var7;
      int var8;
      int var11;
      int var12;
      if(var1 == 0) {
         var7 = 0;
         animOffsetX = 0;
         animOffsetY = 0;
         animOffsetZ = 0;

         for(var8 = 0; var8 < var6; ++var8) {
            int var9 = var2[var8];
            if(var9 < this.vertexGroups.length) {
               int[] var10 = this.vertexGroups[var9];

               for(var11 = 0; var11 < var10.length; ++var11) {
                  var12 = var10[var11];
                  animOffsetX += this.verticesX[var12];
                  animOffsetY += this.verticesY[var12];
                  animOffsetZ += this.verticesZ[var12];
                  ++var7;
               }
            }
         }

         if(var7 > 0) {
            animOffsetX = var3 + animOffsetX / var7;
            animOffsetY = var4 + animOffsetY / var7;
            animOffsetZ = var5 + animOffsetZ / var7;
         } else {
            animOffsetX = var3;
            animOffsetY = var4;
            animOffsetZ = var5;
         }

      } else {
         int[] var18;
         int var19;
         if(var1 == 1) {
            for(var7 = 0; var7 < var6; ++var7) {
               var8 = var2[var7];
               if(var8 < this.vertexGroups.length) {
                  var18 = this.vertexGroups[var8];

                  for(var19 = 0; var19 < var18.length; ++var19) {
                     var11 = var18[var19];
                     this.verticesX[var11] += var3;
                     this.verticesY[var11] += var4;
                     this.verticesZ[var11] += var5;
                  }
               }
            }

         } else if(var1 == 2) {
            for(var7 = 0; var7 < var6; ++var7) {
               var8 = var2[var7];
               if(var8 < this.vertexGroups.length) {
                  var18 = this.vertexGroups[var8];

                  for(var19 = 0; var19 < var18.length; ++var19) {
                     var11 = var18[var19];
                     this.verticesX[var11] -= animOffsetX;
                     this.verticesY[var11] -= animOffsetY;
                     this.verticesZ[var11] -= animOffsetZ;
                     var12 = (var3 & 255) * 8;
                     int var13 = (var4 & 255) * 8;
                     int var14 = (var5 & 255) * 8;
                     int var15;
                     int var16;
                     int var17;
                     if(var14 != 0) {
                        var15 = Model_sine[var14];
                        var16 = Model_cosine[var14];
                        var17 = var15 * this.verticesY[var11] + var16 * this.verticesX[var11] >> 16;
                        this.verticesY[var11] = var16 * this.verticesY[var11] - var15 * this.verticesX[var11] >> 16;
                        this.verticesX[var11] = var17;
                     }

                     if(var12 != 0) {
                        var15 = Model_sine[var12];
                        var16 = Model_cosine[var12];
                        var17 = var16 * this.verticesY[var11] - var15 * this.verticesZ[var11] >> 16;
                        this.verticesZ[var11] = var15 * this.verticesY[var11] + var16 * this.verticesZ[var11] >> 16;
                        this.verticesY[var11] = var17;
                     }

                     if(var13 != 0) {
                        var15 = Model_sine[var13];
                        var16 = Model_cosine[var13];
                        var17 = var15 * this.verticesZ[var11] + var16 * this.verticesX[var11] >> 16;
                        this.verticesZ[var11] = var16 * this.verticesZ[var11] - var15 * this.verticesX[var11] >> 16;
                        this.verticesX[var11] = var17;
                     }

                     this.verticesX[var11] += animOffsetX;
                     this.verticesY[var11] += animOffsetY;
                     this.verticesZ[var11] += animOffsetZ;
                  }
               }
            }

         } else if(var1 == 3) {
            for(var7 = 0; var7 < var6; ++var7) {
               var8 = var2[var7];
               if(var8 < this.vertexGroups.length) {
                  var18 = this.vertexGroups[var8];

                  for(var19 = 0; var19 < var18.length; ++var19) {
                     var11 = var18[var19];
                     this.verticesX[var11] -= animOffsetX;
                     this.verticesY[var11] -= animOffsetY;
                     this.verticesZ[var11] -= animOffsetZ;
                     this.verticesX[var11] = var3 * this.verticesX[var11] / 128;
                     this.verticesY[var11] = var4 * this.verticesY[var11] / 128;
                     this.verticesZ[var11] = var5 * this.verticesZ[var11] / 128;
                     this.verticesX[var11] += animOffsetX;
                     this.verticesY[var11] += animOffsetY;
                     this.verticesZ[var11] += animOffsetZ;
                  }
               }
            }

         } else if(var1 == 5) {
            if(this.field1685 != null && this.field1676 != null) {
               for(var7 = 0; var7 < var6; ++var7) {
                  var8 = var2[var7];
                  if(var8 < this.field1685.length) {
                     var18 = this.field1685[var8];

                     for(var19 = 0; var19 < var18.length; ++var19) {
                        var11 = var18[var19];
                        var12 = (this.field1676[var11] & 255) + var3 * 8;
                        if(var12 < 0) {
                           var12 = 0;
                        } else if(var12 > 255) {
                           var12 = 255;
                        }

                        this.field1676[var11] = (byte)var12;
                     }
                  }
               }
            }

         }
      }
   }

   @ObfuscatedName("k")
   public void method3843(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.verticesCount; ++var4) {
         this.verticesX[var4] = this.verticesX[var4] * var1 / 128;
         this.verticesY[var4] = var2 * this.verticesY[var4] / 128;
         this.verticesZ[var4] = var3 * this.verticesZ[var4] / 128;
      }

      this.method3826();
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
           signature = "(ZLdv;[B)Ldv;"
   )
   Model method3877(boolean var1, Model var2, byte[] var3) {
      this.rl$buildSharedModel(var1, var2, var3);
      var2.verticesCount = this.verticesCount;
      var2.indicesCount = this.indicesCount;
      var2.field1689 = this.field1689;
      if(var2.verticesX == null || var2.verticesX.length < this.verticesCount) {
         var2.verticesX = new int[this.verticesCount + 100];
         var2.verticesY = new int[this.verticesCount + 100];
         var2.verticesZ = new int[this.verticesCount + 100];
      }

      int var4;
      for(var4 = 0; var4 < this.verticesCount; ++var4) {
         var2.verticesX[var4] = this.verticesX[var4];
         var2.verticesY[var4] = this.verticesY[var4];
         var2.verticesZ[var4] = this.verticesZ[var4];
      }

      if(var1) {
         var2.field1676 = this.field1676;
      } else {
         var2.field1676 = var3;
         if(this.field1676 == null) {
            for(var4 = 0; var4 < this.indicesCount; ++var4) {
               var2.field1676[var4] = 0;
            }
         } else {
            for(var4 = 0; var4 < this.indicesCount; ++var4) {
               var2.field1676[var4] = this.field1676[var4];
            }
         }
      }

      var2.indices1 = this.indices1;
      var2.indices2 = this.indices2;
      var2.indices3 = this.indices3;
      var2.field1672 = this.field1672;
      var2.field1673 = this.field1673;
      var2.field1674 = this.field1674;
      var2.field1675 = this.field1675;
      var2.field1729 = this.field1729;
      var2.field1678 = this.field1678;
      var2.field1671 = this.field1671;
      var2.field1728 = this.field1728;
      var2.field1682 = this.field1682;
      var2.field1683 = this.field1683;
      var2.vertexGroups = this.vertexGroups;
      var2.field1685 = this.field1685;
      var2.field1696 = this.field1696;
      var2.method3826();
      return var2;
   }

   @ObfuscatedName("m")
   public int method3867() {
      this.method3833();
      return this.XYZMag;
   }

   @ObfuscatedName("p")
   void method3859() {
      if(this.boundsType != 2) {
         this.boundsType = 2;
         this.XYZMag = 0;

         for(int var1 = 0; var1 < this.verticesCount; ++var1) {
            int var2 = this.verticesX[var1];
            int var3 = this.verticesY[var1];
            int var4 = this.verticesZ[var1];
            int var5 = var2 * var2 + var4 * var4 + var3 * var3;
            if(var5 > this.XYZMag) {
               this.XYZMag = var5;
            }
         }

         this.XYZMag = (int)(Math.sqrt((double)this.XYZMag) + 0.99D);
         this.radius = this.XYZMag;
         this.diameter = this.XYZMag + this.XYZMag;
      }
   }

   @ObfuscatedName("b")
   void method3826() {
      this.boundsType = 0;
      this.extremeX = -1;
   }

   @ObfuscatedName("o")
   public void method3830() {
      for(int var1 = 0; var1 < this.verticesCount; ++var1) {
         int var2 = this.verticesZ[var1];
         this.verticesZ[var1] = this.verticesX[var1];
         this.verticesX[var1] = -var2;
      }

      this.method3826();
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
           signature = "([[IIIIZI)Ldv;"
   )
   public Model method3827(int[][] var1, int var2, int var3, int var4, boolean var5, int var6) {
      Model var7 = this.copy$contourGround(var1, var2, var3, var4, var5, var6);
      if(var7 != null && var7 != this) {
         RSModel var8 = (RSModel)var7;
         var8.setVertexNormalsX(rl$vertexNormalsX);
         var8.setVertexNormalsY(rl$vertexNormalsY);
         var8.setVertexNormalsZ(rl$vertexNormalsZ);
         var8.setFaceTextureUVCoordinates(faceTextureUVCoords);
         var8.setFaceTextureUCoordinates(this.rl$faceTextureUCoordinates);
         var8.setFaceTextureVCoordinates(this.rl$faceTextureVCoordinates);
      }

      return var7;
   }

   @ObfuscatedName("n")
   @ObfuscatedSignature(
           signature = "(Lei;I)V"
   )
   public void method3835(Frames var1, int var2) {
      if(this.vertexGroups != null) {
         if(var2 != -1) {
            Frame var3 = var1.skeletons[var2];
            FrameMap var4 = var3.skin;
            animOffsetX = 0;
            animOffsetY = 0;
            animOffsetZ = 0;

            for(int var5 = 0; var5 < var3.transformCount; ++var5) {
               int var6 = var3.transformTypes[var5];
               this.method3837(var4.types[var6], var4.list[var6], var3.translator_x[var5], var3.translator_y[var5], var3.translator_z[var5]);
            }

            this.method3826();
         }
      }
   }

   @ObfuscatedName("c")
   public final void method3900(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      field1708[0] = -1;
      if(this.boundsType != 2 && this.boundsType != 1) {
         this.method3859();
      }

      int var9 = Graphics3D.centerX;
      int var10 = Graphics3D.centerY;
      int var11 = Model_sine[var1];
      int var12 = Model_cosine[var1];
      int var13 = Model_sine[var2];
      int var14 = Model_cosine[var2];
      int var15 = Model_sine[var3];
      int var16 = Model_cosine[var3];
      int var17 = Model_sine[var4];
      int var18 = Model_cosine[var4];
      int var19 = var17 * var6 + var18 * var7 >> 16;

      for(int var20 = 0; var20 < this.verticesCount; ++var20) {
         int var21 = this.verticesX[var20];
         int var22 = this.verticesY[var20];
         int var23 = this.verticesZ[var20];
         int var24;
         if(var3 != 0) {
            var24 = var22 * var15 + var21 * var16 >> 16;
            var22 = var22 * var16 - var21 * var15 >> 16;
            var21 = var24;
         }

         if(var1 != 0) {
            var24 = var22 * var12 - var23 * var11 >> 16;
            var23 = var22 * var11 + var23 * var12 >> 16;
            var22 = var24;
         }

         if(var2 != 0) {
            var24 = var23 * var13 + var21 * var14 >> 16;
            var23 = var23 * var14 - var21 * var13 >> 16;
            var21 = var24;
         }

         var21 += var5;
         var22 += var6;
         var23 += var7;
         var24 = var22 * var18 - var23 * var17 >> 16;
         var23 = var22 * var17 + var23 * var18 >> 16;
         field1681[var20] = var23 - var19;
         modelViewportYs[var20] = var9 + var21 * Graphics3D.Rasterizer3D_zoom / var8;
         modelViewportXs[var20] = var10 + var24 * Graphics3D.Rasterizer3D_zoom / var8;
         if(this.field1689 > 0) {
            yViewportBuffer[var20] = var21;
            field1662[var20] = var24;
            field1703[var20] = var23;
         }
      }

      try {
         this.method3847(false, false, false, 0L);
      } catch (Exception var26) {
         ;
      }

   }

   @ObfuscatedName("t")
   public void method3842() {
      for(int var1 = 0; var1 < this.verticesCount; ++var1) {
         int var2 = this.verticesX[var1];
         this.verticesX[var1] = this.verticesZ[var1];
         this.verticesZ[var1] = -var2;
      }

      this.method3826();
   }

   @ObfuscatedName("ah")
   final void method3849(int var1) {
      int var2 = Graphics3D.centerX;
      int var3 = Graphics3D.centerY;
      int var4 = 0;
      int var5 = this.indices1[var1];
      int var6 = this.indices2[var1];
      int var7 = this.indices3[var1];
      int var8 = field1703[var5];
      int var9 = field1703[var6];
      int var10 = field1703[var7];
      if(this.field1676 == null) {
         Graphics3D.rasterAlpha = 0;
      } else {
         Graphics3D.rasterAlpha = this.field1676[var1] & 255;
      }

      int var11;
      int var12;
      int var13;
      int var14;
      if(var8 >= 50) {
         field1705[var4] = modelViewportYs[var5];
         field1716[var4] = modelViewportXs[var5];
         xViewportBuffer[var4++] = this.field1672[var1];
      } else {
         var11 = yViewportBuffer[var5];
         var12 = field1662[var5];
         var13 = this.field1672[var1];
         if(var10 >= 50) {
            var14 = field1710[var10 - var8] * (50 - var8);
            field1705[var4] = var2 + Graphics3D.Rasterizer3D_zoom * (var11 + ((yViewportBuffer[var7] - var11) * var14 >> 16)) / 50;
            field1716[var4] = var3 + Graphics3D.Rasterizer3D_zoom * (var12 + ((field1662[var7] - var12) * var14 >> 16)) / 50;
            xViewportBuffer[var4++] = var13 + ((this.field1674[var1] - var13) * var14 >> 16);
         }

         if(var9 >= 50) {
            var14 = field1710[var9 - var8] * (50 - var8);
            field1705[var4] = var2 + Graphics3D.Rasterizer3D_zoom * (var11 + ((yViewportBuffer[var6] - var11) * var14 >> 16)) / 50;
            field1716[var4] = var3 + Graphics3D.Rasterizer3D_zoom * (var12 + ((field1662[var6] - var12) * var14 >> 16)) / 50;
            xViewportBuffer[var4++] = var13 + ((this.field1673[var1] - var13) * var14 >> 16);
         }
      }

      if(var9 >= 50) {
         field1705[var4] = modelViewportYs[var6];
         field1716[var4] = modelViewportXs[var6];
         xViewportBuffer[var4++] = this.field1673[var1];
      } else {
         var11 = yViewportBuffer[var6];
         var12 = field1662[var6];
         var13 = this.field1673[var1];
         if(var8 >= 50) {
            var14 = field1710[var8 - var9] * (50 - var9);
            field1705[var4] = var2 + Graphics3D.Rasterizer3D_zoom * (var11 + ((yViewportBuffer[var5] - var11) * var14 >> 16)) / 50;
            field1716[var4] = var3 + Graphics3D.Rasterizer3D_zoom * (var12 + ((field1662[var5] - var12) * var14 >> 16)) / 50;
            xViewportBuffer[var4++] = var13 + ((this.field1672[var1] - var13) * var14 >> 16);
         }

         if(var10 >= 50) {
            var14 = field1710[var10 - var9] * (50 - var9);
            field1705[var4] = var2 + Graphics3D.Rasterizer3D_zoom * (var11 + ((yViewportBuffer[var7] - var11) * var14 >> 16)) / 50;
            field1716[var4] = var3 + Graphics3D.Rasterizer3D_zoom * (var12 + ((field1662[var7] - var12) * var14 >> 16)) / 50;
            xViewportBuffer[var4++] = var13 + ((this.field1674[var1] - var13) * var14 >> 16);
         }
      }

      if(var10 >= 50) {
         field1705[var4] = modelViewportYs[var7];
         field1716[var4] = modelViewportXs[var7];
         xViewportBuffer[var4++] = this.field1674[var1];
      } else {
         var11 = yViewportBuffer[var7];
         var12 = field1662[var7];
         var13 = this.field1674[var1];
         if(var9 >= 50) {
            var14 = field1710[var9 - var10] * (50 - var10);
            field1705[var4] = var2 + Graphics3D.Rasterizer3D_zoom * (var11 + ((yViewportBuffer[var6] - var11) * var14 >> 16)) / 50;
            field1716[var4] = var3 + Graphics3D.Rasterizer3D_zoom * (var12 + ((field1662[var6] - var12) * var14 >> 16)) / 50;
            xViewportBuffer[var4++] = var13 + ((this.field1673[var1] - var13) * var14 >> 16);
         }

         if(var8 >= 50) {
            var14 = field1710[var8 - var10] * (50 - var10);
            field1705[var4] = var2 + Graphics3D.Rasterizer3D_zoom * (var11 + ((yViewportBuffer[var5] - var11) * var14 >> 16)) / 50;
            field1716[var4] = var3 + Graphics3D.Rasterizer3D_zoom * (var12 + ((field1662[var5] - var12) * var14 >> 16)) / 50;
            xViewportBuffer[var4++] = var13 + ((this.field1672[var1] - var13) * var14 >> 16);
         }
      }

      var11 = field1705[0];
      var12 = field1705[1];
      var13 = field1705[2];
      var14 = field1716[0];
      int var15 = field1716[1];
      int var16 = field1716[2];
      Graphics3D.rasterClipEnable = false;
      int var17;
      int var18;
      int var19;
      int var20;
      if(var4 == 3) {
         if(var11 < 0 || var12 < 0 || var13 < 0 || var11 > Graphics3D.rasterClipX || var12 > Graphics3D.rasterClipX || var13 > Graphics3D.rasterClipX) {
            Graphics3D.rasterClipEnable = true;
         }

         if(this.field1678 != null && this.field1678[var1] != -1) {
            if(this.field1729 != null && this.field1729[var1] != -1) {
               var20 = this.field1729[var1] & 255;
               var17 = this.field1728[var20];
               var18 = this.field1682[var20];
               var19 = this.field1683[var20];
            } else {
               var17 = var5;
               var18 = var6;
               var19 = var7;
            }

            if(this.field1674[var1] == -1) {
               Graphics3D.method2100(var14, var15, var16, var11, var12, var13, this.field1672[var1], this.field1672[var1], this.field1672[var1], yViewportBuffer[var17], yViewportBuffer[var18], yViewportBuffer[var19], field1662[var17], field1662[var18], field1662[var19], field1703[var17], field1703[var18], field1703[var19], this.field1678[var1]);
            } else {
               Graphics3D.method2100(var14, var15, var16, var11, var12, var13, xViewportBuffer[0], xViewportBuffer[1], xViewportBuffer[2], yViewportBuffer[var17], yViewportBuffer[var18], yViewportBuffer[var19], field1662[var17], field1662[var18], field1662[var19], field1703[var17], field1703[var18], field1703[var19], this.field1678[var1]);
            }
         } else if(this.field1674[var1] == -1) {
            Graphics3D.method2098(var14, var15, var16, var11, var12, var13, field1726[this.field1672[var1]]);
         } else {
            Graphics3D.method2159(var14, var15, var16, var11, var12, var13, xViewportBuffer[0], xViewportBuffer[1], xViewportBuffer[2]);
         }
      }

      if(var4 == 4) {
         if(var11 < 0 || var12 < 0 || var13 < 0 || var11 > Graphics3D.rasterClipX || var12 > Graphics3D.rasterClipX || var13 > Graphics3D.rasterClipX || field1705[3] < 0 || field1705[3] > Graphics3D.rasterClipX) {
            Graphics3D.rasterClipEnable = true;
         }

         if(this.field1678 != null && this.field1678[var1] != -1) {
            if(this.field1729 != null && this.field1729[var1] != -1) {
               var20 = this.field1729[var1] & 255;
               var17 = this.field1728[var20];
               var18 = this.field1682[var20];
               var19 = this.field1683[var20];
            } else {
               var17 = var5;
               var18 = var6;
               var19 = var7;
            }

            short var21 = this.field1678[var1];
            if(this.field1674[var1] == -1) {
               Graphics3D.method2100(var14, var15, var16, var11, var12, var13, this.field1672[var1], this.field1672[var1], this.field1672[var1], yViewportBuffer[var17], yViewportBuffer[var18], yViewportBuffer[var19], field1662[var17], field1662[var18], field1662[var19], field1703[var17], field1703[var18], field1703[var19], var21);
               Graphics3D.method2100(var14, var16, field1716[3], var11, var13, field1705[3], this.field1672[var1], this.field1672[var1], this.field1672[var1], yViewportBuffer[var17], yViewportBuffer[var18], yViewportBuffer[var19], field1662[var17], field1662[var18], field1662[var19], field1703[var17], field1703[var18], field1703[var19], var21);
            } else {
               Graphics3D.method2100(var14, var15, var16, var11, var12, var13, xViewportBuffer[0], xViewportBuffer[1], xViewportBuffer[2], yViewportBuffer[var17], yViewportBuffer[var18], yViewportBuffer[var19], field1662[var17], field1662[var18], field1662[var19], field1703[var17], field1703[var18], field1703[var19], var21);
               Graphics3D.method2100(var14, var16, field1716[3], var11, var13, field1705[3], xViewportBuffer[0], xViewportBuffer[2], xViewportBuffer[3], yViewportBuffer[var17], yViewportBuffer[var18], yViewportBuffer[var19], field1662[var17], field1662[var18], field1662[var19], field1703[var17], field1703[var18], field1703[var19], var21);
            }
         } else if(this.field1674[var1] == -1) {
            var17 = field1726[this.field1672[var1]];
            Graphics3D.method2098(var14, var15, var16, var11, var12, var13, var17);
            Graphics3D.method2098(var14, var16, field1716[3], var11, var13, field1705[3], var17);
         } else {
            Graphics3D.method2159(var14, var15, var16, var11, var12, var13, xViewportBuffer[0], xViewportBuffer[1], xViewportBuffer[2]);
            Graphics3D.method2159(var14, var16, field1716[3], var11, var13, field1705[3], xViewportBuffer[0], xViewportBuffer[2], xViewportBuffer[3]);
         }
      }

   }

   public int[] getTrianglesX() {
      return this.indices1;
   }

   public int[][] getVertexGroups() {
      return this.vertexGroups;
   }

   public List getVertices() {
      int[] var1 = this.getVerticesX();
      int[] var2 = this.getVerticesY();
      int[] var3 = this.getVerticesZ();
      ArrayList var4 = new ArrayList(this.getVerticesCount());

      for(int var5 = 0; var5 < this.getVerticesCount(); ++var5) {
         Vertex var6 = new Vertex(var1[var5], var2[var5], var3[var5]);
         var4.add(var6);
      }

      return var4;
   }

   public void rl$buildSharedModel(boolean var1, net.runelite.api.Model var2, byte[] var3) {
      RSModel var4 = (RSModel)var2;
      var4.setVertexNormalsX(rl$vertexNormalsX);
      var4.setVertexNormalsY(rl$vertexNormalsY);
      var4.setVertexNormalsZ(rl$vertexNormalsZ);
      var4.setFaceTextureUVCoordinates(faceTextureUVCoords);
      var4.setFaceTextureUCoordinates(this.rl$faceTextureUCoordinates);
      var4.setFaceTextureVCoordinates(this.rl$faceTextureVCoordinates);
   }

   @ObfuscatedSignature(
           signature = "([[IIIIZI)Ldv;"
   )
   public Model copy$contourGround(int[][] var1, int var2, int var3, int var4, boolean var5, int var6) {
      this.method3833();
      int var7 = var2 - this.XYZMag;
      int var8 = var2 + this.XYZMag;
      int var9 = var4 - this.XYZMag;
      int var10 = var4 + this.XYZMag;
      if(var7 >= 0 && var8 + 128 >> 7 < var1.length && var9 >= 0 && var10 + 128 >> 7 < var1[0].length) {
         var7 >>= 7;
         var8 = var8 + 127 >> 7;
         var9 >>= 7;
         var10 = var10 + 127 >> 7;
         if(var3 == var1[var7][var9] && var3 == var1[var8][var9] && var3 == var1[var7][var10] && var3 == var1[var8][var10]) {
            return this;
         } else {
            Model var11;
            if(var5) {
               var11 = new Model();
               var11.verticesCount = this.verticesCount;
               var11.indicesCount = this.indicesCount;
               var11.field1689 = this.field1689;
               var11.verticesX = this.verticesX;
               var11.verticesZ = this.verticesZ;
               var11.indices1 = this.indices1;
               var11.indices2 = this.indices2;
               var11.indices3 = this.indices3;
               var11.field1672 = this.field1672;
               var11.field1673 = this.field1673;
               var11.field1674 = this.field1674;
               var11.field1675 = this.field1675;
               var11.field1676 = this.field1676;
               var11.field1729 = this.field1729;
               var11.field1678 = this.field1678;
               var11.field1671 = this.field1671;
               var11.field1728 = this.field1728;
               var11.field1682 = this.field1682;
               var11.field1683 = this.field1683;
               var11.vertexGroups = this.vertexGroups;
               var11.field1685 = this.field1685;
               var11.field1696 = this.field1696;
               var11.verticesY = new int[var11.verticesCount];
            } else {
               var11 = this;
            }

            int var12;
            int var13;
            int var14;
            int var15;
            int var16;
            int var17;
            int var18;
            int var19;
            int var20;
            int var21;
            if(var6 == 0) {
               for(var12 = 0; var12 < var11.verticesCount; ++var12) {
                  var13 = var2 + this.verticesX[var12];
                  var14 = var4 + this.verticesZ[var12];
                  var15 = var13 & 127;
                  var16 = var14 & 127;
                  var17 = var13 >> 7;
                  var18 = var14 >> 7;
                  var19 = var1[var17][var18] * (128 - var15) + var1[var17 + 1][var18] * var15 >> 7;
                  var20 = var1[var17][var18 + 1] * (128 - var15) + var15 * var1[var17 + 1][var18 + 1] >> 7;
                  var21 = var19 * (128 - var16) + var20 * var16 >> 7;
                  var11.verticesY[var12] = var21 + this.verticesY[var12] - var3;
               }
            } else {
               for(var12 = 0; var12 < var11.verticesCount; ++var12) {
                  var13 = (-this.verticesY[var12] << 16) / super.modelHeight;
                  if(var13 < var6) {
                     var14 = var2 + this.verticesX[var12];
                     var15 = var4 + this.verticesZ[var12];
                     var16 = var14 & 127;
                     var17 = var15 & 127;
                     var18 = var14 >> 7;
                     var19 = var15 >> 7;
                     var20 = var1[var18][var19] * (128 - var16) + var1[var18 + 1][var19] * var16 >> 7;
                     var21 = var1[var18][var19 + 1] * (128 - var16) + var16 * var1[var18 + 1][var19 + 1] >> 7;
                     int var22 = var20 * (128 - var17) + var21 * var17 >> 7;
                     var11.verticesY[var12] = (var6 - var13) * (var22 - var3) / var6 + this.verticesY[var12];
                  }
               }
            }

            var11.method3826();
            return var11;
         }
      } else {
         return this;
      }
   }

   public int[] getVerticesX() {
      return this.verticesX;
   }

   public int[] getTrianglesY() {
      return this.indices2;
   }

   public void setFaceTextureUCoordinates(float[][] var1) {
      this.rl$faceTextureUCoordinates = var1;
   }

   public int[] getVerticesY() {
      return this.verticesY;
   }

   public int[] getTrianglesZ() {
      return this.indices3;
   }

   public void setFaceTextureVCoordinates(float[][] var1) {
      this.rl$faceTextureVCoordinates = var1;
   }

   private int[] rl$vertexNormalsX;
   private int[] rl$vertexNormalsY;
   private int[] rl$vertexNormalsZ;

   @Override
   public int[] getVertexNormalsX() {
      return rl$vertexNormalsX;
   }

   @Override
   public void setVertexNormalsX(int[] vertexNormalsX) {
      this.rl$vertexNormalsX = vertexNormalsX;
   }

   @Override
   public int[] getVertexNormalsY() {
      return rl$vertexNormalsY;
   }

   @Override
   public void setVertexNormalsY(int[] vertexNormalsY) {
      this.rl$vertexNormalsY = vertexNormalsY;
   }

   @Override
   public int[] getVertexNormalsZ() {
      return this.rl$vertexNormalsZ;
   }

   @Override
   public void setVertexNormalsZ(int[] vertexNormalsZ) {
      this.rl$vertexNormalsZ = vertexNormalsZ;
   }

   @Override
   public float[] getFaceTextureUVCoordinates() {
      return faceTextureUVCoords;
   }

   @Override
   public void setFaceTextureUVCoordinates(float[] faceTextureUVCoordinates) {
      this.faceTextureUVCoords = faceTextureUVCoordinates;
   }

   @Override
   public byte getOverrideAmount() {
      return 0;
   }

   @Override
   public byte getOverrideHue() {
      return 0;
   }

   @Override
   public byte getOverrideSaturation() {
      return 0;
   }

   @Override
   public byte getOverrideLuminance() {
      return 0;
   }

   public int[] getVerticesZ() {
      return this.verticesZ;
   }

   public int getVerticesCount() {
      return this.verticesCount;
   }

   public int getTrianglesCount() {
      return this.indicesCount;
   }

   public void interpolateFrames(RSFrameMap var1, RSFrame var2, RSFrame var3, int var4, int var5) {
      int var6;
      int var7;
      if(var3 != null && var4 != 0) {
         var6 = 0;
         var7 = 0;

         for(int var8 = 0; var8 < var1.getCount(); ++var8) {
            boolean var9 = false;
            if(var6 < var2.getTransformCount() && var2.getTransformTypes()[var6] == var8) {
               var9 = true;
            }

            boolean var10 = false;
            if(var7 < var3.getTransformCount() && var3.getTransformTypes()[var7] == var8) {
               var10 = true;
            }

            if(var9 || var10) {
               short var11 = 0;
               int var12 = var1.getTypes()[var8];
               if(var12 == 3 || var12 == 10) {
                  var11 = 128;
               }

               int var13 = var11;
               int var14 = var11;
               int var15 = var11;
               if(var9) {
                  var13 = var2.getTranslatorX()[var6];
                  var14 = var2.getTranslatorY()[var6];
                  var15 = var2.getTranslatorZ()[var6];
                  ++var6;
               }

               int var16 = var11;
               int var17 = var11;
               int var18 = var11;
               if(var10) {
                  var16 = var3.getTranslatorX()[var7];
                  var17 = var3.getTranslatorY()[var7];
                  var18 = var3.getTranslatorZ()[var7];
                  ++var7;
               }

               int var19;
               int var20;
               int var21;
               if(var12 == 2) {
                  int var22 = var16 - var13 & 255;
                  int var23 = var17 - var14 & 255;
                  int var24 = var18 - var15 & 255;
                  if(var22 >= 128) {
                     var22 -= 256;
                  }

                  if(var23 >= 128) {
                     var23 -= 256;
                  }

                  if(var24 >= 128) {
                     var24 -= 256;
                  }

                  var19 = var13 + var22 * var4 / var5 & 255;
                  var20 = var14 + var23 * var4 / var5 & 255;
                  var21 = var15 + var24 * var4 / var5 & 255;
               } else if(var12 == 5) {
                  var19 = var13;
                  var20 = 0;
                  var21 = 0;
               } else {
                  var19 = var13 + (var16 - var13) * var4 / var5;
                  var20 = var14 + (var17 - var14) * var4 / var5;
                  var21 = var15 + (var18 - var15) * var4 / var5;
               }

               this.animate(var12, var1.getList()[var8], var19, var20, var21);
            }
         }
      } else {
         for(var6 = 0; var6 < var2.getTransformCount(); ++var6) {
            var7 = var2.getTransformTypes()[var6];
            this.animate(var1.getTypes()[var7], var1.getList()[var7], var2.getTranslatorX()[var6], var2.getTranslatorY()[var6], var2.getTranslatorZ()[var6]);
         }
      }

   }

   public void resetBounds() {
      this.method3826();
   }

   public void animate(int var1, int[] var2, int var3, int var4, int var5) {
      this.method3837(var1, var2, var3, var4, var5);
   }

   private void rl$$init() {
   }

   public void rl$init(RSModel[] models, int length) {
      int var3 = 0;

      for(int var4 = 0; var4 < length; ++var4) {
         RSModel var5 = models[var4];
         if(var5 != null) {
            var3 += var5.getTrianglesCount();
         }
      }

      float[][] var12 = new float[var3][];
      float[][] var13 = new float[var3][];
      int var6 = 0;

      for(int var7 = 0; var7 < length; ++var7) {
         RSModel var8 = models[var7];
         if(var8 != null) {
            float[][] var9 = var8.getFaceTextureUCoordinates();
            float[][] var10 = var8.getFaceTextureVCoordinates();

            for(int var11 = 0; var11 < var8.getTrianglesCount(); ++var11) {
               if(var9 != null && var10 != null) {
                  var12[var6] = var9[var11];
                  var13[var6] = var10[var11];
               }

               ++var6;
            }
         }
      }

      this.setFaceTextureUCoordinates(var12);
      this.setFaceTextureVCoordinates(var13);

      if (getFaceTextures() != null)
      {
         int count = getTrianglesCount();
         float[] uv = new float[count * 6];
         int idx = 0;

         for (int i = 0; i < length; ++i)
         {
            RSModel model = models[i];
            if (model != null)
            {
               float[] modelUV = model.getFaceTextureUVCoordinates();

               if (modelUV != null)
               {
                  System.arraycopy(modelUV, 0, uv, idx, model.getTrianglesCount() * 6);
               }

               idx += model.getTrianglesCount() * 6;
            }
         }

         faceTextureUVCoords = uv;
      }
      vertexNormals();
   }

   private float[] faceTextureUVCoords;

   public void vertexNormals()
   {
      if (rl$vertexNormalsX == null)
      {
         int verticesCount = getVerticesCount();

         rl$vertexNormalsX = new int[verticesCount];
         rl$vertexNormalsY = new int[verticesCount];
         rl$vertexNormalsZ = new int[verticesCount];

         int[] trianglesX = getTrianglesX();
         int[] trianglesY = getTrianglesY();
         int[] trianglesZ = getTrianglesZ();
         int[] verticesX = getVerticesX();
         int[] verticesY = getVerticesY();
         int[] verticesZ = getVerticesZ();

         for (int i = 0; i < getTrianglesCount(); ++i)
         {
            int var9 = trianglesX[i];
            int var10 = trianglesY[i];
            int var11 = trianglesZ[i];

            int var12 = verticesX[var10] - verticesX[var9];
            int var13 = verticesY[var10] - verticesY[var9];
            int var14 = verticesZ[var10] - verticesZ[var9];
            int var15 = verticesX[var11] - verticesX[var9];
            int var16 = verticesY[var11] - verticesY[var9];
            int var17 = verticesZ[var11] - verticesZ[var9];

            int var18 = var13 * var17 - var16 * var14;
            int var19 = var14 * var15 - var17 * var12;

            int var20;
            for (var20 = var12 * var16 - var15 * var13; var18 > 8192 || var19 > 8192 || var20 > 8192 || var18 < -8192 || var19 < -8192 || var20 < -8192; var20 >>= 1)
            {
               var18 >>= 1;
               var19 >>= 1;
            }

            int var21 = (int) Math.sqrt(var18 * var18 + var19 * var19 + var20 * var20);
            if (var21 <= 0)
            {
               var21 = 1;
            }

            var18 = var18 * 256 / var21;
            var19 = var19 * 256 / var21;
            var20 = var20 * 256 / var21;

            rl$vertexNormalsX[var9] += var18;
            rl$vertexNormalsY[var9] += var19;
            rl$vertexNormalsZ[var9] += var20;

            rl$vertexNormalsX[var10] += var18;
            rl$vertexNormalsY[var10] += var19;
            rl$vertexNormalsZ[var10] += var20;

            rl$vertexNormalsX[var11] += var18;
            rl$vertexNormalsY[var11] += var19;
            rl$vertexNormalsZ[var11] += var20;
         }
      }
   }

   @Override
   public List getTriangles() {
      int[] var1 = this.getTrianglesX();
      int[] var2 = this.getTrianglesY();
      int[] var3 = this.getTrianglesZ();
      List var4 = this.getVertices();
      ArrayList var5 = new ArrayList(this.getTrianglesCount());

      for(int var6 = 0; var6 < this.getTrianglesCount(); ++var6) {
         int var7 = var1[var6];
         int var8 = var2[var6];
         int var9 = var3[var6];
         Triangle var10 = new Triangle((Vertex)var4.get(var7), (Vertex)var4.get(var8), (Vertex)var4.get(var9));
         var5.add(var10);
      }

      return var5;
   }

   public void interpolateFrames(RSFrames var1, int var2, RSFrames var3, int var4, int var5, int var6) {
      if(this.getVertexGroups() != null && var2 != -1) {
         RSFrame var7 = var1.getFrames()[var2];
         RSFrameMap var8 = var7.getSkin();
         RSFrame var9 = null;
         if(var3 != null) {
            var9 = var3.getFrames()[var4];
            if(var9.getSkin() != var8) {
               var9 = null;
            }
         }

         ItemContainer.clientInstance.setAnimOffsetX(0);
         ItemContainer.clientInstance.setAnimOffsetY(0);
         ItemContainer.clientInstance.setAnimOffsetZ(0);
         this.interpolateFrames(var8, var7, var9, var5, var6);
         this.resetBounds();
      }

   }

   public Polygon getConvexHull(int var1, int var2, int var3, int var4) {
      List var5 = this.getVertices();

      for(int var6 = 0; var6 < var5.size(); ++var6) {
         Vertex var7 = (Vertex)var5.get(var6);
         var5.set(var6, var7.rotate(var3));
      }

      ArrayList var10 = new ArrayList();
      Iterator var12 = var5.iterator();

      Point var9;
      while(var12.hasNext()) {
         Vertex var8 = (Vertex)var12.next();
         var9 = Perspective.localToCanvas(ItemContainer.clientInstance, var1 - var8.getX(), var2 - var8.getZ(), var4 + var8.getY());
         if(var9 != null) {
            var10.add(var9);
         }
      }

      List var11 = Jarvis.convexHull(var10);
      if(var11 == null) {
         return null;
      } else {
         Polygon var13 = new Polygon();
         Iterator var14 = var11.iterator();

         while(var14.hasNext()) {
            var9 = (Point)var14.next();
            var13.addPoint(var9.getX(), var9.getY());
         }

         return var13;
      }
   }

   public int getSceneId() {
      return this.rl$sceneId;
   }

   public void setSceneId(int var1) {
      this.rl$sceneId = var1;
   }

   public int getBufferOffset() {
      return this.rl$bufferOffset;
   }

   public void setBufferOffset(int var1) {
      this.rl$bufferOffset = var1;
   }

   public int getUvBufferOffset() {
      return this.rl$uvBufferOffset;
   }

   public void setUvBufferOffset(int var1) {
      this.rl$uvBufferOffset = var1;
   }

   public float[][] getFaceTextureUCoordinates() {
      return this.rl$faceTextureUCoordinates;
   }

   public float[][] getFaceTextureVCoordinates() {
      return this.rl$faceTextureVCoordinates;
   }

   public int[] getFaceColors1() {
      return this.field1672;
   }

   public int[] getFaceColors2() {
      return this.field1673;
   }

   public int[] getFaceColors3() {
      return this.field1674;
   }

   public byte[] getFaceRenderPriorities() {
      return this.field1675;
   }

   public byte[] getTriangleTransparencies() {
      return this.field1676;
   }

   public short[] getFaceTextures() {
      return this.field1678;
   }

   public boolean isClickable() {
      return this.field1696;
   }

   @Override
   public int getBottomY() {
      return this.bottomY;
   }

   public int getXYZMag() {
      return this.XYZMag;
   }

   public int getRadius() {
      return this.radius;
   }

   public int getCenterX() {
      return this.centerX;
   }

   public int getCenterY() {
      return this.centerY;
   }

   public int getCenterZ() {
      return this.centerZ;
   }

   public int getExtremeX() {
      return this.extremeX;
   }

   public int getExtremeY() {
      return this.extremeY;
   }

   public int getExtremeZ() {
      return this.extremeZ;
   }

   public RSModel toSharedModel(boolean var1) {
      return this.method3828(var1);
   }

   public RSModel toSharedSpotAnimModel(boolean var1) {
      return this.method3829(var1);
   }

   public void calculateExtreme(int var1) {
      this.method3856(var1);
   }

   public void calculateBoundsCylinder() {
      this.method3833();
   }

   public void rotateY90Ccw() {
      this.method3842();
   }

   public void rotateY180Ccw() {
      this.method3839();
   }

   public void rotateY270Ccw() {
      this.method3830();
   }

   @ObfuscatedName("y")
   public void method3889(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.verticesCount; ++var4) {
         this.verticesX[var4] += var1;
         this.verticesY[var4] += var2;
         this.verticesZ[var4] += var3;
      }

      this.method3826();
   }

   @ObfuscatedName("cb")
   void vmethod3846(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, long var9) {
      field1708[0] = -1;
      if(this.boundsType != 1) {
         this.method3833();
      }

      this.method3856(var1);
      int var11 = var5 * var8 - var4 * var6 >> 16;
      int var12 = var2 * var7 + var3 * var11 >> 16;
      int var13 = var3 * this.XYZMag >> 16;
      int var14 = var12 + var13;
      if(var14 > 50 && var12 < 3500) {
         int var15 = var8 * var4 + var5 * var6 >> 16;
         int var16 = (var15 - this.XYZMag) * Graphics3D.Rasterizer3D_zoom;
         if(var16 / var14 < Graphics3D.Rasterizer3D_clipMidX2) {
            int var17 = (var15 + this.XYZMag) * Graphics3D.Rasterizer3D_zoom;
            if(var17 / var14 > Graphics3D.Rasterizer3D_clipNegativeMidX) {
               int var18 = var3 * var7 - var11 * var2 >> 16;
               int var19 = var2 * this.XYZMag >> 16;
               int var20 = (var18 + var19) * Graphics3D.Rasterizer3D_zoom;
               if(var20 / var14 > Graphics3D.Rasterizer3D_clipNegativeMidY) {
                  int var21 = (var3 * super.modelHeight >> 16) + var19;
                  int var22 = (var18 - var21) * Graphics3D.Rasterizer3D_zoom;
                  if(var22 / var14 < Graphics3D.Rasterizer3D_clipMidY2) {
                     int var23 = var13 + (var2 * super.modelHeight >> 16);
                     boolean var24 = false;
                     boolean var25 = false;
                     if(var12 - var23 <= 50) {
                        var25 = true;
                     }

                     boolean var26 = var25 || this.field1689 > 0;
                     int var27 = class203.method3976();
                     int var28 = ContextMenuRow.method1585();
                     boolean var29 = WorldMapType1.method4933();
                     boolean var30 = 0L != var9 && !class24.method465(var9);
                     boolean var32 = false;
                     int var36;
                     int var37;
                     int var38;
                     int var39;
                     int var47;
                     int var51;
                     int var52;
                     int var53;
                     if(var30 && var29) {
                        boolean var33 = false;
                        if(useBoundingBoxes3D) {
                           boolean var34;
                           if(!WorldMapType1.method4933()) {
                              var34 = false;
                           } else {
                              int var42;
                              int var43;
                              int var44;
                              if(!class47.Viewport_false0) {
                                 var36 = SceneManager.pitchSin;
                                 var37 = SceneManager.pitchCos;
                                 var38 = SceneManager.yawSin;
                                 var39 = SceneManager.yawCos;
                                 byte var40 = 50;
                                 short var41 = 3500;
                                 var42 = (class47.Viewport_mouseX - Graphics3D.centerX) * var40 / Graphics3D.Rasterizer3D_zoom;
                                 var43 = (class47.Viewport_mouseY - Graphics3D.centerY) * var40 / Graphics3D.Rasterizer3D_zoom;
                                 var44 = (class47.Viewport_mouseX - Graphics3D.centerX) * var41 / Graphics3D.Rasterizer3D_zoom;
                                 int var45 = (class47.Viewport_mouseY - Graphics3D.centerY) * var41 / Graphics3D.Rasterizer3D_zoom;
                                 int var46 = Graphics3D.method2109(var43, var40, var37, var36);
                                 var52 = Graphics3D.method2110(var43, var40, var37, var36);
                                 var43 = var46;
                                 var46 = Graphics3D.method2109(var45, var41, var37, var36);
                                 var53 = Graphics3D.method2110(var45, var41, var37, var36);
                                 var45 = var46;
                                 var46 = Graphics3D.method2107(var42, var52, var39, var38);
                                 var52 = Graphics3D.method2174(var42, var52, var39, var38);
                                 var42 = var46;
                                 var46 = Graphics3D.method2107(var44, var53, var39, var38);
                                 var53 = Graphics3D.method2174(var44, var53, var39, var38);
                                 CombatInfo1.field1009 = (var42 + var46) / 2;
                                 NPCEntity.field1103 = (var43 + var45) / 2;
                                 class47.field1734 = (var52 + var53) / 2;
                                 CombatInfo1.field1006 = (var46 - var42) / 2;
                                 class47.field1735 = (var45 - var43) / 2;
                                 class93.field2125 = (var53 - var52) / 2;
                                 class177.field98 = Math.abs(CombatInfo1.field1006);
                                 class47.field1736 = Math.abs(class47.field1735);
                                 class234.field429 = Math.abs(class93.field2125);
                              }

                              var36 = this.centerX + var6;
                              var37 = var7 + this.centerY;
                              var38 = var8 + this.centerZ;
                              var39 = this.extremeX;
                              var52 = this.extremeY;
                              var53 = this.extremeZ;
                              var42 = CombatInfo1.field1009 - var36;
                              var43 = NPCEntity.field1103 - var37;
                              var44 = class47.field1734 - var38;
                              if(Math.abs(var42) > var39 + class177.field98) {
                                 var34 = false;
                              } else if(Math.abs(var43) > var52 + class47.field1736) {
                                 var34 = false;
                              } else if(Math.abs(var44) > var53 + class234.field429) {
                                 var34 = false;
                              } else if(Math.abs(var44 * class47.field1735 - var43 * class93.field2125) > var52 * class234.field429 + var53 * class47.field1736) {
                                 var34 = false;
                              } else if(Math.abs(var42 * class93.field2125 - var44 * CombatInfo1.field1006) > var39 * class234.field429 + var53 * class177.field98) {
                                 var34 = false;
                              } else if(Math.abs(var43 * CombatInfo1.field1006 - var42 * class47.field1735) > var39 * class47.field1736 + var52 * class177.field98) {
                                 var34 = false;
                              } else {
                                 var34 = true;
                              }
                           }

                           var33 = var34;
                        } else {
                           var51 = var12 - var13;
                           if(var51 <= 50) {
                              var51 = 50;
                           }

                           if(var15 > 0) {
                              var16 /= var14;
                              var17 /= var51;
                           } else {
                              var17 /= var14;
                              var16 /= var51;
                           }

                           if(var18 > 0) {
                              var22 /= var14;
                              var20 /= var51;
                           } else {
                              var20 /= var14;
                              var22 /= var51;
                           }

                           var47 = var27 - Graphics3D.centerX;
                           var36 = var28 - Graphics3D.centerY;
                           if(var47 > var16 && var47 < var17 && var36 > var22 && var36 < var20) {
                              var33 = true;
                           }
                        }

                        if(var33) {
                           if(this.field1696) {
                              Bit.method2675(var9);
                           } else {
                              var32 = true;
                           }
                        }
                     }

                     int var50 = Graphics3D.centerX;
                     var51 = Graphics3D.centerY;
                     var47 = 0;
                     var36 = 0;
                     if(var1 != 0) {
                        var47 = Model_sine[var1];
                        var36 = Model_cosine[var1];
                     }

                     for(var37 = 0; var37 < this.verticesCount; ++var37) {
                        var38 = this.verticesX[var37];
                        var39 = this.verticesY[var37];
                        var52 = this.verticesZ[var37];
                        if(var1 != 0) {
                           var53 = var52 * var47 + var38 * var36 >> 16;
                           var52 = var52 * var36 - var38 * var47 >> 16;
                           var38 = var53;
                        }

                        var38 += var6;
                        var39 += var7;
                        var52 += var8;
                        var53 = var52 * var4 + var5 * var38 >> 16;
                        var52 = var5 * var52 - var38 * var4 >> 16;
                        var38 = var53;
                        var53 = var3 * var39 - var52 * var2 >> 16;
                        var52 = var39 * var2 + var3 * var52 >> 16;
                        field1681[var37] = var52 - var12;
                        if(var52 >= 50) {
                           modelViewportYs[var37] = var38 * Graphics3D.Rasterizer3D_zoom / var52 + var50;
                           modelViewportXs[var37] = var53 * Graphics3D.Rasterizer3D_zoom / var52 + var51;
                        } else {
                           modelViewportYs[var37] = -5000;
                           var24 = true;
                        }

                        if(var26) {
                           yViewportBuffer[var37] = var38;
                           field1662[var37] = var53;
                           field1703[var37] = var52;
                        }
                     }

                     try {
                        this.method3847(var24, var32, this.field1696, var9);
                     } catch (Exception var49) {
                        ;
                     }

                  }
               }
            }
         }
      }
   }

   @ObfuscatedName("aa")
   final void method3847(boolean var1, boolean var2, boolean var3, long var4) {
      if(this.diameter < 1600) {
         int var6;
         for(var6 = 0; var6 < this.diameter; ++var6) {
            field1708[var6] = 0;
         }

         var6 = var3?20:5;

         int var7;
         int var8;
         int var10;
         int var11;
         int var12;
         int var13;
         int var15;
         int var16;
         int var18;
         int var27;
         for(var7 = 0; var7 < this.indicesCount; ++var7) {
            if(this.field1674[var7] != -2) {
               var8 = this.indices1[var7];
               var27 = this.indices2[var7];
               var10 = this.indices3[var7];
               var11 = modelViewportYs[var8];
               var12 = modelViewportYs[var27];
               var13 = modelViewportYs[var10];
               int var14;
               int var17;
               if(!var1 || var11 != -5000 && var12 != -5000 && var13 != -5000) {
                  if(var2) {
                     var15 = modelViewportXs[var8];
                     var16 = modelViewportXs[var27];
                     var17 = modelViewportXs[var10];
                     var18 = var6 + class47.Viewport_mouseY;
                     boolean var32;
                     if(var18 < var15 && var18 < var16 && var18 < var17) {
                        var32 = false;
                     } else {
                        var18 = class47.Viewport_mouseY - var6;
                        if(var18 > var15 && var18 > var16 && var18 > var17) {
                           var32 = false;
                        } else {
                           var18 = var6 + class47.Viewport_mouseX;
                           if(var18 < var11 && var18 < var12 && var18 < var13) {
                              var32 = false;
                           } else {
                              var18 = class47.Viewport_mouseX - var6;
                              if(var18 > var11 && var18 > var12 && var18 > var13) {
                                 var32 = false;
                              } else {
                                 var32 = true;
                              }
                           }
                        }
                     }

                     if(var32) {
                        Bit.method2675(var4);
                        var2 = false;
                     }
                  }

                  if((var11 - var12) * (modelViewportXs[var10] - modelViewportXs[var27]) - (var13 - var12) * (modelViewportXs[var8] - modelViewportXs[var27]) > 0) {
                     field1679[var7] = false;
                     if(var11 >= 0 && var12 >= 0 && var13 >= 0 && var11 <= Graphics3D.rasterClipX && var12 <= Graphics3D.rasterClipX && var13 <= Graphics3D.rasterClipX) {
                        field1699[var7] = false;
                     } else {
                        field1699[var7] = true;
                     }

                     var14 = (field1681[var8] + field1681[var27] + field1681[var10]) / 3 + this.radius;
                     field1709[var14][field1708[var14]++] = var7;
                  }
               } else {
                  var14 = yViewportBuffer[var8];
                  var15 = yViewportBuffer[var27];
                  var16 = yViewportBuffer[var10];
                  var17 = field1662[var8];
                  var18 = field1662[var27];
                  int var19 = field1662[var10];
                  int var20 = field1703[var8];
                  int var21 = field1703[var27];
                  int var22 = field1703[var10];
                  var14 -= var15;
                  var16 -= var15;
                  var17 -= var18;
                  var19 -= var18;
                  var20 -= var21;
                  var22 -= var21;
                  int var23 = var17 * var22 - var20 * var19;
                  int var24 = var20 * var16 - var14 * var22;
                  int var25 = var14 * var19 - var17 * var16;
                  if(var15 * var23 + var18 * var24 + var21 * var25 > 0) {
                     field1679[var7] = true;
                     int var26 = (field1681[var8] + field1681[var27] + field1681[var10]) / 3 + this.radius;
                     field1709[var26][field1708[var26]++] = var7;
                  }
               }
            }
         }

         int[] var9;
         if(this.field1675 == null) {
            for(var7 = this.diameter - 1; var7 >= 0; --var7) {
               var8 = field1708[var7];
               if(var8 > 0) {
                  var9 = field1709[var7];

                  for(var10 = 0; var10 < var8; ++var10) {
                     this.drawFace(var9[var10]);
                  }
               }
            }

         } else {
            for(var7 = 0; var7 < 12; ++var7) {
               field1722[var7] = 0;
               field1700[var7] = 0;
            }

            for(var7 = this.diameter - 1; var7 >= 0; --var7) {
               var8 = field1708[var7];
               if(var8 > 0) {
                  var9 = field1709[var7];

                  for(var10 = 0; var10 < var8; ++var10) {
                     var11 = var9[var10];
                     byte var31 = this.field1675[var11];
                     var13 = field1722[var31]++;
                     field1715[var31][var13] = var11;
                     if(var31 < 10) {
                        field1700[var31] += var7;
                     } else if(var31 == 10) {
                        field1712[var13] = var7;
                     } else {
                        field1713[var13] = var7;
                     }
                  }
               }
            }

            var7 = 0;
            if(field1722[1] > 0 || field1722[2] > 0) {
               var7 = (field1700[1] + field1700[2]) / (field1722[1] + field1722[2]);
            }

            var8 = 0;
            if(field1722[3] > 0 || field1722[4] > 0) {
               var8 = (field1700[3] + field1700[4]) / (field1722[3] + field1722[4]);
            }

            var27 = 0;
            if(field1722[6] > 0 || field1722[8] > 0) {
               var27 = (field1700[8] + field1700[6]) / (field1722[8] + field1722[6]);
            }

            var11 = 0;
            var12 = field1722[10];
            int[] var28 = field1715[10];
            int[] var29 = field1712;
            if(var11 == var12) {
               var11 = 0;
               var12 = field1722[11];
               var28 = field1715[11];
               var29 = field1713;
            }

            if(var11 < var12) {
               var10 = var29[var11];
            } else {
               var10 = -1000;
            }

            for(var15 = 0; var15 < 10; ++var15) {
               while(var15 == 0 && var10 > var7) {
                  this.drawFace(var28[var11++]);
                  if(var11 == var12 && var28 != field1715[11]) {
                     var11 = 0;
                     var12 = field1722[11];
                     var28 = field1715[11];
                     var29 = field1713;
                  }

                  if(var11 < var12) {
                     var10 = var29[var11];
                  } else {
                     var10 = -1000;
                  }
               }

               while(var15 == 3 && var10 > var8) {
                  this.drawFace(var28[var11++]);
                  if(var11 == var12 && var28 != field1715[11]) {
                     var11 = 0;
                     var12 = field1722[11];
                     var28 = field1715[11];
                     var29 = field1713;
                  }

                  if(var11 < var12) {
                     var10 = var29[var11];
                  } else {
                     var10 = -1000;
                  }
               }

               while(var15 == 5 && var10 > var27) {
                  this.drawFace(var28[var11++]);
                  if(var11 == var12 && var28 != field1715[11]) {
                     var11 = 0;
                     var12 = field1722[11];
                     var28 = field1715[11];
                     var29 = field1713;
                  }

                  if(var11 < var12) {
                     var10 = var29[var11];
                  } else {
                     var10 = -1000;
                  }
               }

               var16 = field1722[var15];
               int[] var30 = field1715[var15];

               for(var18 = 0; var18 < var16; ++var18) {
                  this.drawFace(var30[var18]);
               }
            }

            while(var10 != -1000) {
               this.drawFace(var28[var11++]);
               if(var11 == var12 && var28 != field1715[11]) {
                  var11 = 0;
                  var28 = field1715[11];
                  var12 = field1722[11];
                  var29 = field1713;
               }

               if(var11 < var12) {
                  var10 = var29[var11];
               } else {
                  var10 = -1000;
               }
            }

         }
      }
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
           signature = "(Z)Ldv;"
   )
   public Model method3828(boolean var1) {
      if(!var1 && field1661.length < this.indicesCount) {
         field1661 = new byte[this.indicesCount + 100];
      }

      return this.method3877(var1, field1665, field1661);
   }

   @ObfuscatedName("h")
   void method3856(int var1) {
      if(this.extremeX == -1) {
         int var2 = 0;
         int var3 = 0;
         int var4 = 0;
         int var5 = 0;
         int var6 = 0;
         int var7 = 0;
         int var8 = Model_cosine[var1];
         int var9 = Model_sine[var1];

         for(int var10 = 0; var10 < this.verticesCount; ++var10) {
            int var11 = Graphics3D.method2124(this.verticesX[var10], this.verticesZ[var10], var8, var9);
            int var12 = this.verticesY[var10];
            int var13 = Graphics3D.method2165(this.verticesX[var10], this.verticesZ[var10], var8, var9);
            if(var11 < var2) {
               var2 = var11;
            }

            if(var11 > var5) {
               var5 = var11;
            }

            if(var12 < var3) {
               var3 = var12;
            }

            if(var12 > var6) {
               var6 = var12;
            }

            if(var13 < var4) {
               var4 = var13;
            }

            if(var13 > var7) {
               var7 = var13;
            }
         }

         this.centerX = (var5 + var2) / 2;
         this.centerY = (var6 + var3) / 2;
         this.centerZ = (var7 + var4) / 2;
         this.extremeX = (var5 - var2 + 1) / 2;
         this.extremeY = (var6 - var3 + 1) / 2;
         this.extremeZ = (var7 - var4 + 1) / 2;
         if(this.extremeX < 32) {
            this.extremeX = 32;
         }

         if(this.extremeZ < 32) {
            this.extremeZ = 32;
         }

         if(this.field1696) {
            this.extremeX += 8;
            this.extremeZ += 8;
         }

      }
   }

   @ObfuscatedName("u")
   public void method3887(int var1) {
      int var2 = Model_sine[var1];
      int var3 = Model_cosine[var1];

      for(int var4 = 0; var4 < this.verticesCount; ++var4) {
         int var5 = var3 * this.verticesY[var4] - var2 * this.verticesZ[var4] >> 16;
         this.verticesZ[var4] = var2 * this.verticesY[var4] + var3 * this.verticesZ[var4] >> 16;
         this.verticesY[var4] = var5;
      }

      this.method3826();
   }

   @ObfuscatedName("ab")
   @Override
   public final void drawFace(int face) {
      DrawCallbacks callbacks = ItemContainer.clientInstance.getDrawCallbacks();
      if (callbacks != null && callbacks.drawFace(this, face)) {
         return;
      }

      if(field1679[face]) {
         this.method3849(face);
      } else {
         int var2 = this.indices1[face];
         int var3 = this.indices2[face];
         int var4 = this.indices3[face];
         Graphics3D.rasterClipEnable = field1699[face];
         if(this.field1676 == null) {
            Graphics3D.rasterAlpha = 0;
         } else {
            Graphics3D.rasterAlpha = this.field1676[face] & 255;
         }

         if(this.field1678 != null && this.field1678[face] != -1) {
            int var5;
            int var6;
            int var7;
            if(this.field1729 != null && this.field1729[face] != -1) {
               int var8 = this.field1729[face] & 255;
               var5 = this.field1728[var8];
               var6 = this.field1682[var8];
               var7 = this.field1683[var8];
            } else {
               var5 = var2;
               var6 = var3;
               var7 = var4;
            }

            if(this.field1674[face] == -1) {
               Graphics3D.method2100(modelViewportXs[var2], modelViewportXs[var3], modelViewportXs[var4], modelViewportYs[var2], modelViewportYs[var3], modelViewportYs[var4], this.field1672[face], this.field1672[face], this.field1672[face], yViewportBuffer[var5], yViewportBuffer[var6], yViewportBuffer[var7], field1662[var5], field1662[var6], field1662[var7], field1703[var5], field1703[var6], field1703[var7], this.field1678[face]);
            } else {
               Graphics3D.method2100(modelViewportXs[var2], modelViewportXs[var3], modelViewportXs[var4], modelViewportYs[var2], modelViewportYs[var3], modelViewportYs[var4], this.field1672[face], this.field1673[face], this.field1674[face], yViewportBuffer[var5], yViewportBuffer[var6], yViewportBuffer[var7], field1662[var5], field1662[var6], field1662[var7], field1703[var5], field1703[var6], field1703[var7], this.field1678[face]);
            }
         } else if(this.field1674[face] == -1) {
            Graphics3D.method2098(modelViewportXs[var2], modelViewportXs[var3], modelViewportXs[var4], modelViewportYs[var2], modelViewportYs[var3], modelViewportYs[var4], field1726[this.field1672[face]]);
         } else {
            Graphics3D.method2159(modelViewportXs[var2], modelViewportXs[var3], modelViewportXs[var4], modelViewportYs[var2], modelViewportYs[var3], modelViewportYs[var4], this.field1672[face], this.field1673[face], this.field1674[face]);
         }

      }
   }

   @ObfuscatedName("g")
   @ObfuscatedSignature(
           signature = "(Z)Ldv;"
   )
   public Model method3829(boolean var1) {
      if(!var1 && field1663.length < this.indicesCount) {
         field1663 = new byte[this.indicesCount + 100];
      }

      return this.method3877(var1, field1690, field1663);
   }
}
