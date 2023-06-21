package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dt")
public class class166 extends TaskDataNode {
   @ObfuscatedName("f")
   int field1447;
   @ObfuscatedName("l")
   int field1445;
   @ObfuscatedName("e")
   int field1453;
   @ObfuscatedName("r")
   int field1454;
   @ObfuscatedName("q")
   int startPosition;
   @ObfuscatedName("x")
   int field1456;
   @ObfuscatedName("m")
   int field1449;
   @ObfuscatedName("p")
   int field1448;
   @ObfuscatedName("b")
   int endPosition;
   @ObfuscatedName("a")
   int field1444;
   @ObfuscatedName("n")
   boolean field1452;
   @ObfuscatedName("t")
   int field1455;
   @ObfuscatedName("s")
   int field1443;
   @ObfuscatedName("h")
   int field1446;
   @ObfuscatedName("g")
   int field1442;

   @ObfuscatedSignature(
      signature = "(Lce;III)V"
   )
   class166(RawAudioNode var1, int var2, int var3, int var4) {
      super.data = var1;
      this.startPosition = var1.startPosition;
      this.endPosition = var1.endPosition;
      this.field1452 = var1.field1373;
      this.field1443 = var2;
      this.field1442 = var3;
      this.field1456 = var4;
      this.field1444 = 0;
      this.method2486();
   }

   @ObfuscatedSignature(
      signature = "(Lce;II)V"
   )
   class166(RawAudioNode var1, int var2, int var3) {
      super.data = var1;
      this.startPosition = var1.startPosition;
      this.endPosition = var1.endPosition;
      this.field1452 = var1.field1373;
      this.field1443 = var2;
      this.field1442 = var3;
      this.field1456 = 8192;
      this.field1444 = 0;
      this.method2486();
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "()Ldo;"
   )
   protected TaskDataNode vmethod5968() {
      return null;
   }

   @ObfuscatedName("l")
   public synchronized int method2491() {
      return this.field1442 == Integer.MIN_VALUE?0:this.field1442;
   }

   @ObfuscatedName("v")
   public synchronized void method2496(int var1, int var2) {
      this.method2497(var1, var2, this.method2567());
   }

   @ObfuscatedName("e")
   public synchronized void method2493(int var1) {
      this.method2490(var1 << 6, this.method2567());
   }

   @ObfuscatedName("r")
   synchronized void method2489(int var1) {
      this.method2490(var1, this.method2567());
   }

   @ObfuscatedName("al")
   int method2539(int[] var1, int var2, int var3, int var4, int var5) {
      while(true) {
         if(this.field1453 > 0) {
            int var6 = var2 + this.field1453;
            if(var6 > var4) {
               var6 = var4;
            }

            this.field1453 += var2;
            if(this.field1443 == -256 && (this.field1444 & 255) == 0) {
               if(ContextMenuRow.audioHighMemory) {
                  var2 = method2522(0, ((RawAudioNode)super.data).audioBuffer, var1, this.field1444, var2, this.field1447, this.field1448, this.field1455, this.field1445, 0, var6, var3, this);
               } else {
                  var2 = method2521(((RawAudioNode)super.data).audioBuffer, var1, this.field1444, var2, this.field1446, this.field1454, 0, var6, var3, this);
               }
            } else if(ContextMenuRow.audioHighMemory) {
               var2 = method2526(0, 0, ((RawAudioNode)super.data).audioBuffer, var1, this.field1444, var2, this.field1447, this.field1448, this.field1455, this.field1445, 0, var6, var3, this, this.field1443, var5);
            } else {
               var2 = method2485(0, 0, ((RawAudioNode)super.data).audioBuffer, var1, this.field1444, var2, this.field1446, this.field1454, 0, var6, var3, this, this.field1443, var5);
            }

            this.field1453 -= var2;
            if(this.field1453 != 0) {
               return var2;
            }

            if(!this.method2510()) {
               continue;
            }

            return var4;
         }

         if(this.field1443 == -256 && (this.field1444 & 255) == 0) {
            if(ContextMenuRow.audioHighMemory) {
               return method2514(0, ((RawAudioNode)super.data).audioBuffer, var1, this.field1444, var2, this.field1447, this.field1448, 0, var4, var3, this);
            }

            return method2513(((RawAudioNode)super.data).audioBuffer, var1, this.field1444, var2, this.field1446, 0, var4, var3, this);
         }

         if(ContextMenuRow.audioHighMemory) {
            return method2518(0, 0, ((RawAudioNode)super.data).audioBuffer, var1, this.field1444, var2, this.field1447, this.field1448, 0, var4, var3, this, this.field1443, var5);
         }

         return method2530(0, 0, ((RawAudioNode)super.data).audioBuffer, var1, this.field1444, var2, this.field1446, 0, var4, var3, this, this.field1443, var5);
      }
   }

   @ObfuscatedName("k")
   void method2529() {
      if(this.field1453 != 0) {
         if(this.field1442 == Integer.MIN_VALUE) {
            this.field1442 = 0;
         }

         this.field1453 = 0;
         this.method2486();
      }

   }

   @ObfuscatedName("q")
   public synchronized void vmethod5972(int[] var1, int var2, int var3) {
      if(this.field1442 == 0 && this.field1453 == 0) {
         this.vmethod5976(var3);
      } else {
         RawAudioNode var4 = (RawAudioNode)super.data;
         int var5 = this.startPosition << 8;
         int var6 = this.endPosition << 8;
         int var7 = var4.audioBuffer.length << 8;
         int var8 = var6 - var5;
         if(var8 <= 0) {
            this.field1449 = 0;
         }

         int var9 = var2;
         var3 += var2;
         if(this.field1444 < 0) {
            if(this.field1443 <= 0) {
               this.method2529();
               this.method432();
               return;
            }

            this.field1444 = 0;
         }

         if(this.field1444 >= var7) {
            if(this.field1443 >= 0) {
               this.method2529();
               this.method432();
               return;
            }

            this.field1444 = var7 - 1;
         }

         if(this.field1449 < 0) {
            if(this.field1452) {
               if(this.field1443 < 0) {
                  var9 = this.method2539(var1, var2, var5, var3, var4.audioBuffer[this.startPosition]);
                  if(this.field1444 >= var5) {
                     return;
                  }

                  this.field1444 = var5 + var5 - 1 - this.field1444;
                  this.field1443 = -this.field1443;
               }

               while(true) {
                  var9 = this.method2598(var1, var9, var6, var3, var4.audioBuffer[this.endPosition - 1]);
                  if(this.field1444 < var6) {
                     return;
                  }

                  this.field1444 = var6 + var6 - 1 - this.field1444;
                  this.field1443 = -this.field1443;
                  var9 = this.method2539(var1, var9, var5, var3, var4.audioBuffer[this.startPosition]);
                  if(this.field1444 >= var5) {
                     return;
                  }

                  this.field1444 = var5 + var5 - 1 - this.field1444;
                  this.field1443 = -this.field1443;
               }
            } else if(this.field1443 < 0) {
               while(true) {
                  var9 = this.method2539(var1, var9, var5, var3, var4.audioBuffer[this.endPosition - 1]);
                  if(this.field1444 >= var5) {
                     return;
                  }

                  this.field1444 = var6 - 1 - (var6 - 1 - this.field1444) % var8;
               }
            } else {
               while(true) {
                  var9 = this.method2598(var1, var9, var6, var3, var4.audioBuffer[this.startPosition]);
                  if(this.field1444 < var6) {
                     return;
                  }

                  this.field1444 = var5 + (this.field1444 - var5) % var8;
               }
            }
         } else {
            if(this.field1449 > 0) {
               if(this.field1452) {
                  label139: {
                     if(this.field1443 < 0) {
                        var9 = this.method2539(var1, var2, var5, var3, var4.audioBuffer[this.startPosition]);
                        if(this.field1444 >= var5) {
                           return;
                        }

                        this.field1444 = var5 + var5 - 1 - this.field1444;
                        this.field1443 = -this.field1443;
                        if(--this.field1449 == 0) {
                           break label139;
                        }
                     }

                     do {
                        var9 = this.method2598(var1, var9, var6, var3, var4.audioBuffer[this.endPosition - 1]);
                        if(this.field1444 < var6) {
                           return;
                        }

                        this.field1444 = var6 + var6 - 1 - this.field1444;
                        this.field1443 = -this.field1443;
                        if(--this.field1449 == 0) {
                           break;
                        }

                        var9 = this.method2539(var1, var9, var5, var3, var4.audioBuffer[this.startPosition]);
                        if(this.field1444 >= var5) {
                           return;
                        }

                        this.field1444 = var5 + var5 - 1 - this.field1444;
                        this.field1443 = -this.field1443;
                     } while(--this.field1449 != 0);
                  }
               } else {
                  int var10;
                  if(this.field1443 < 0) {
                     while(true) {
                        var9 = this.method2539(var1, var9, var5, var3, var4.audioBuffer[this.endPosition - 1]);
                        if(this.field1444 >= var5) {
                           return;
                        }

                        var10 = (var6 - 1 - this.field1444) / var8;
                        if(var10 >= this.field1449) {
                           this.field1444 += var8 * this.field1449;
                           this.field1449 = 0;
                           break;
                        }

                        this.field1444 += var8 * var10;
                        this.field1449 -= var10;
                     }
                  } else {
                     while(true) {
                        var9 = this.method2598(var1, var9, var6, var3, var4.audioBuffer[this.startPosition]);
                        if(this.field1444 < var6) {
                           return;
                        }

                        var10 = (this.field1444 - var5) / var8;
                        if(var10 >= this.field1449) {
                           this.field1444 -= var8 * this.field1449;
                           this.field1449 = 0;
                           break;
                        }

                        this.field1444 -= var8 * var10;
                        this.field1449 -= var10;
                     }
                  }
               }
            }

            if(this.field1443 < 0) {
               this.method2539(var1, var9, 0, var3, 0);
               if(this.field1444 < 0) {
                  this.field1444 = -1;
                  this.method2529();
                  this.method432();
               }
            } else {
               this.method2598(var1, var9, var7, var3, 0);
               if(this.field1444 >= var7) {
                  this.field1444 = var7;
                  this.method2529();
                  this.method432();
               }
            }

         }
      }
   }

   @ObfuscatedName("m")
   protected int vmethod5970() {
      return this.field1442 == 0 && this.field1453 == 0?0:1;
   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "()Ldo;"
   )
   protected TaskDataNode vmethod5969() {
      return null;
   }

   @ObfuscatedName("b")
   public synchronized void method2487(int var1) {
      this.field1449 = var1;
   }

   @ObfuscatedName("aw")
   public boolean method2501() {
      return this.field1444 < 0 || this.field1444 >= ((RawAudioNode)super.data).audioBuffer.length << 8;
   }

   @ObfuscatedName("o")
   public synchronized int method2567() {
      return this.field1456 < 0?-1:this.field1456;
   }

   @ObfuscatedName("n")
   public synchronized void vmethod5976(int var1) {
      if(this.field1453 > 0) {
         if(var1 >= this.field1453) {
            if(this.field1442 == Integer.MIN_VALUE) {
               this.field1442 = 0;
               this.field1448 = 0;
               this.field1447 = 0;
               this.field1446 = 0;
               this.method432();
               var1 = this.field1453;
            }

            this.field1453 = 0;
            this.method2486();
         } else {
            this.field1446 += this.field1454 * var1;
            this.field1447 += this.field1455 * var1;
            this.field1448 += this.field1445 * var1;
            this.field1453 -= var1;
         }
      }

      RawAudioNode var2 = (RawAudioNode)super.data;
      int var3 = this.startPosition << 8;
      int var4 = this.endPosition << 8;
      int var5 = var2.audioBuffer.length << 8;
      int var6 = var4 - var3;
      if(var6 <= 0) {
         this.field1449 = 0;
      }

      if(this.field1444 < 0) {
         if(this.field1443 <= 0) {
            this.method2529();
            this.method432();
            return;
         }

         this.field1444 = 0;
      }

      if(this.field1444 >= var5) {
         if(this.field1443 >= 0) {
            this.method2529();
            this.method432();
            return;
         }

         this.field1444 = var5 - 1;
      }

      this.field1444 += this.field1443 * var1;
      if(this.field1449 < 0) {
         if(!this.field1452) {
            if(this.field1443 < 0) {
               if(this.field1444 >= var3) {
                  return;
               }

               this.field1444 = var4 - 1 - (var4 - 1 - this.field1444) % var6;
            } else {
               if(this.field1444 < var4) {
                  return;
               }

               this.field1444 = var3 + (this.field1444 - var3) % var6;
            }

         } else {
            if(this.field1443 < 0) {
               if(this.field1444 >= var3) {
                  return;
               }

               this.field1444 = var3 + var3 - 1 - this.field1444;
               this.field1443 = -this.field1443;
            }

            while(this.field1444 >= var4) {
               this.field1444 = var4 + var4 - 1 - this.field1444;
               this.field1443 = -this.field1443;
               if(this.field1444 >= var3) {
                  return;
               }

               this.field1444 = var3 + var3 - 1 - this.field1444;
               this.field1443 = -this.field1443;
            }

         }
      } else {
         if(this.field1449 > 0) {
            if(this.field1452) {
               label123: {
                  if(this.field1443 < 0) {
                     if(this.field1444 >= var3) {
                        return;
                     }

                     this.field1444 = var3 + var3 - 1 - this.field1444;
                     this.field1443 = -this.field1443;
                     if(--this.field1449 == 0) {
                        break label123;
                     }
                  }

                  do {
                     if(this.field1444 < var4) {
                        return;
                     }

                     this.field1444 = var4 + var4 - 1 - this.field1444;
                     this.field1443 = -this.field1443;
                     if(--this.field1449 == 0) {
                        break;
                     }

                     if(this.field1444 >= var3) {
                        return;
                     }

                     this.field1444 = var3 + var3 - 1 - this.field1444;
                     this.field1443 = -this.field1443;
                  } while(--this.field1449 != 0);
               }
            } else {
               int var7;
               if(this.field1443 < 0) {
                  if(this.field1444 >= var3) {
                     return;
                  }

                  var7 = (var4 - 1 - this.field1444) / var6;
                  if(var7 < this.field1449) {
                     this.field1444 += var6 * var7;
                     this.field1449 -= var7;
                     return;
                  }

                  this.field1444 += var6 * this.field1449;
                  this.field1449 = 0;
               } else {
                  if(this.field1444 < var4) {
                     return;
                  }

                  var7 = (this.field1444 - var3) / var6;
                  if(var7 < this.field1449) {
                     this.field1444 -= var6 * var7;
                     this.field1449 -= var7;
                     return;
                  }

                  this.field1444 -= var6 * this.field1449;
                  this.field1449 = 0;
               }
            }
         }

         if(this.field1443 < 0) {
            if(this.field1444 < 0) {
               this.field1444 = -1;
               this.method2529();
               this.method432();
            }
         } else if(this.field1444 >= var5) {
            this.field1444 = var5;
            this.method2529();
            this.method432();
         }

      }
   }

   @ObfuscatedName("c")
   public synchronized void method2497(int var1, int var2, int var3) {
      if(var1 == 0) {
         this.method2490(var2, var3);
      } else {
         int var4 = method2503(var2, var3);
         int var5 = method2482(var2, var3);
         if(var4 == this.field1447 && var5 == this.field1448) {
            this.field1453 = 0;
         } else {
            int var6 = var2 - this.field1446;
            if(this.field1446 - var2 > var6) {
               var6 = this.field1446 - var2;
            }

            if(var4 - this.field1447 > var6) {
               var6 = var4 - this.field1447;
            }

            if(this.field1447 - var4 > var6) {
               var6 = this.field1447 - var4;
            }

            if(var5 - this.field1448 > var6) {
               var6 = var5 - this.field1448;
            }

            if(this.field1448 - var5 > var6) {
               var6 = this.field1448 - var5;
            }

            if(var1 > var6) {
               var1 = var6;
            }

            this.field1453 = var1;
            this.field1442 = var2;
            this.field1456 = var3;
            this.field1454 = (var2 - this.field1446) / var1;
            this.field1455 = (var4 - this.field1447) / var1;
            this.field1445 = (var5 - this.field1448) / var1;
         }
      }
   }

   @ObfuscatedName("t")
   synchronized void method2490(int var1, int var2) {
      this.field1442 = var1;
      this.field1456 = var2;
      this.field1453 = 0;
      this.method2486();
   }

   @ObfuscatedName("ah")
   public synchronized int method2500() {
      return this.field1443 < 0?-this.field1443:this.field1443;
   }

   @ObfuscatedName("an")
   public boolean method2502() {
      return this.field1453 != 0;
   }

   @ObfuscatedName("at")
   int method2598(int[] var1, int var2, int var3, int var4, int var5) {
      while(true) {
         if(this.field1453 > 0) {
            int var6 = var2 + this.field1453;
            if(var6 > var4) {
               var6 = var4;
            }

            this.field1453 += var2;
            if(this.field1443 == 256 && (this.field1444 & 255) == 0) {
               if(ContextMenuRow.audioHighMemory) {
                  var2 = method2520(0, ((RawAudioNode)super.data).audioBuffer, var1, this.field1444, var2, this.field1447, this.field1448, this.field1455, this.field1445, 0, var6, var3, this);
               } else {
                  var2 = method2507(((RawAudioNode)super.data).audioBuffer, var1, this.field1444, var2, this.field1446, this.field1454, 0, var6, var3, this);
               }
            } else if(ContextMenuRow.audioHighMemory) {
               var2 = method2548(0, 0, ((RawAudioNode)super.data).audioBuffer, var1, this.field1444, var2, this.field1447, this.field1448, this.field1455, this.field1445, 0, var6, var3, this, this.field1443, var5);
            } else {
               var2 = method2533(0, 0, ((RawAudioNode)super.data).audioBuffer, var1, this.field1444, var2, this.field1446, this.field1454, 0, var6, var3, this, this.field1443, var5);
            }

            this.field1453 -= var2;
            if(this.field1453 != 0) {
               return var2;
            }

            if(!this.method2510()) {
               continue;
            }

            return var4;
         }

         if(this.field1443 == 256 && (this.field1444 & 255) == 0) {
            if(ContextMenuRow.audioHighMemory) {
               return method2512(0, ((RawAudioNode)super.data).audioBuffer, var1, this.field1444, var2, this.field1447, this.field1448, 0, var4, var3, this);
            }

            return method2511(((RawAudioNode)super.data).audioBuffer, var1, this.field1444, var2, this.field1446, 0, var4, var3, this);
         }

         if(ContextMenuRow.audioHighMemory) {
            return method2516(0, 0, ((RawAudioNode)super.data).audioBuffer, var1, this.field1444, var2, this.field1447, this.field1448, 0, var4, var3, this, this.field1443, var5);
         }

         return method2515(0, 0, ((RawAudioNode)super.data).audioBuffer, var1, this.field1444, var2, this.field1446, 0, var4, var3, this, this.field1443, var5);
      }
   }

   @ObfuscatedName("y")
   @ObfuscatedSignature(
      signature = "(Z)V",
      garbageValue = "1"
   )
   public synchronized void method2494() {
      this.field1443 = (this.field1443 ^ this.field1443 >> 31) + (this.field1443 >>> 31);
      this.field1443 = -this.field1443;
   }

   @ObfuscatedName("aa")
   public synchronized void method2498(int var1) {
      if(var1 == 0) {
         this.method2489(0);
         this.method432();
      } else if(this.field1447 == 0 && this.field1448 == 0) {
         this.field1453 = 0;
         this.field1442 = 0;
         this.field1446 = 0;
         this.method432();
      } else {
         int var2 = -this.field1446;
         if(this.field1446 > var2) {
            var2 = this.field1446;
         }

         if(-this.field1447 > var2) {
            var2 = -this.field1447;
         }

         if(this.field1447 > var2) {
            var2 = this.field1447;
         }

         if(-this.field1448 > var2) {
            var2 = -this.field1448;
         }

         if(this.field1448 > var2) {
            var2 = this.field1448;
         }

         if(var1 > var2) {
            var1 = var2;
         }

         this.field1453 = var1;
         this.field1442 = Integer.MIN_VALUE;
         this.field1454 = -this.field1446 / var1;
         this.field1455 = -this.field1447 / var1;
         this.field1445 = -this.field1448 / var1;
      }
   }

   @ObfuscatedName("ap")
   int vmethod5966() {
      int var1 = this.field1446 * 3 >> 6;
      var1 = (var1 ^ var1 >> 31) + (var1 >>> 31);
      if(this.field1449 == 0) {
         var1 -= var1 * this.field1444 / (((RawAudioNode)super.data).audioBuffer.length << 8);
      } else if(this.field1449 >= 0) {
         var1 -= var1 * this.startPosition / ((RawAudioNode)super.data).audioBuffer.length;
      }

      return var1 > 255?255:var1;
   }

   @ObfuscatedName("h")
   void method2486() {
      this.field1446 = this.field1442;
      this.field1447 = method2503(this.field1442, this.field1456);
      this.field1448 = method2482(this.field1442, this.field1456);
   }

   @ObfuscatedName("u")
   public synchronized void method2601(int var1) {
      int var2 = ((RawAudioNode)super.data).audioBuffer.length << 8;
      if(var1 < -1) {
         var1 = -1;
      }

      if(var1 > var2) {
         var1 = var2;
      }

      this.field1444 = var1;
   }

   @ObfuscatedName("ab")
   public synchronized void method2499(int var1) {
      if(this.field1443 < 0) {
         this.field1443 = -var1;
      } else {
         this.field1443 = var1;
      }

   }

   @ObfuscatedName("ao")
   boolean method2510() {
      int var1 = this.field1442;
      int var2;
      int var3;
      if(var1 == Integer.MIN_VALUE) {
         var3 = 0;
         var2 = 0;
         var1 = 0;
      } else {
         var2 = method2503(var1, this.field1456);
         var3 = method2482(var1, this.field1456);
      }

      if(var1 == this.field1446 && var2 == this.field1447 && var3 == this.field1448) {
         if(this.field1442 == Integer.MIN_VALUE) {
            this.field1442 = 0;
            this.field1448 = 0;
            this.field1447 = 0;
            this.field1446 = 0;
            this.method432();
            return true;
         } else {
            this.method2486();
            return false;
         }
      } else {
         if(this.field1446 < var1) {
            this.field1454 = 1;
            this.field1453 = var1 - this.field1446;
         } else if(this.field1446 > var1) {
            this.field1454 = -1;
            this.field1453 = this.field1446 - var1;
         } else {
            this.field1454 = 0;
         }

         if(this.field1447 < var2) {
            this.field1455 = 1;
            if(this.field1453 == 0 || this.field1453 > var2 - this.field1447) {
               this.field1453 = var2 - this.field1447;
            }
         } else if(this.field1447 > var2) {
            this.field1455 = -1;
            if(this.field1453 == 0 || this.field1453 > this.field1447 - var2) {
               this.field1453 = this.field1447 - var2;
            }
         } else {
            this.field1455 = 0;
         }

         if(this.field1448 < var3) {
            this.field1445 = 1;
            if(this.field1453 == 0 || this.field1453 > var3 - this.field1448) {
               this.field1453 = var3 - this.field1448;
            }
         } else if(this.field1448 > var3) {
            this.field1445 = -1;
            if(this.field1453 == 0 || this.field1453 > this.field1448 - var3) {
               this.field1453 = this.field1448 - var3;
            }
         } else {
            this.field1445 = 0;
         }

         return false;
      }
   }

   @ObfuscatedName("ak")
   @ObfuscatedSignature(
      signature = "([B[IIIIIIILdt;)I"
   )
   static int method2513(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, class166 var8) {
      var2 >>= 8;
      var7 >>= 8;
      var4 <<= 2;
      if((var5 = var3 + var2 - (var7 - 1)) > var6) {
         var5 = var6;
      }

      int var10001;
      for(var5 -= 3; var3 < var5; var1[var10001] += var0[var2--] * var4) {
         var10001 = var3++;
         var1[var10001] += var0[var2--] * var4;
         var10001 = var3++;
         var1[var10001] += var0[var2--] * var4;
         var10001 = var3++;
         var1[var10001] += var0[var2--] * var4;
         var10001 = var3++;
      }

      for(var5 += 3; var3 < var5; var1[var10001] += var0[var2--] * var4) {
         var10001 = var3++;
      }

      var8.field1444 = var2 << 8;
      return var3;
   }

   @ObfuscatedName("bn")
   @ObfuscatedSignature(
      signature = "(II[B[IIIIIIIIIILdt;II)I"
   )
   static int method2526(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, class166 var13, int var14, int var15) {
      var13.field1446 -= var5 * var13.field1454;
      if(var14 == 0 || (var10 = var5 + (var12 + 256 - var4 + var14) / var14) > var11) {
         var10 = var11;
      }

      var5 <<= 1;

      int var10001;
      for(var10 <<= 1; var5 < var10; var4 += var14) {
         var1 = var4 >> 8;
         byte var16 = var2[var1 - 1];
         var0 = (var2[var1] - var16) * (var4 & 255) + (var16 << 8);
         var10001 = var5++;
         var3[var10001] += var0 * var6 >> 6;
         var6 += var8;
         var10001 = var5++;
         var3[var10001] += var0 * var7 >> 6;
         var7 += var9;
      }

      if(var14 == 0 || (var10 = (var5 >> 1) + (var12 - var4 + var14) / var14) > var11) {
         var10 = var11;
      }

      var10 <<= 1;

      for(var1 = var15; var5 < var10; var4 += var14) {
         var0 = (var1 << 8) + (var4 & 255) * (var2[var4 >> 8] - var1);
         var10001 = var5++;
         var3[var10001] += var0 * var6 >> 6;
         var6 += var8;
         var10001 = var5++;
         var3[var10001] += var0 * var7 >> 6;
         var7 += var9;
      }

      var5 >>= 1;
      var13.field1446 += var13.field1454 * var5;
      var13.field1447 = var6;
      var13.field1448 = var7;
      var13.field1444 = var4;
      return var5;
   }

   @ObfuscatedName("bz")
   @ObfuscatedSignature(
      signature = "([B[IIIIIIIILdt;)I"
   )
   static int method2507(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, class166 var9) {
      var2 >>= 8;
      var8 >>= 8;
      var4 <<= 2;
      var5 <<= 2;
      if((var6 = var3 + var8 - var2) > var7) {
         var6 = var7;
      }

      var9.field1447 += var9.field1455 * (var6 - var3);
      var9.field1448 += var9.field1445 * (var6 - var3);

      int var10001;
      for(var6 -= 3; var3 < var6; var4 += var5) {
         var10001 = var3++;
         var1[var10001] += var0[var2++] * var4;
         var4 += var5;
         var10001 = var3++;
         var1[var10001] += var0[var2++] * var4;
         var4 += var5;
         var10001 = var3++;
         var1[var10001] += var0[var2++] * var4;
         var4 += var5;
         var10001 = var3++;
         var1[var10001] += var0[var2++] * var4;
      }

      for(var6 += 3; var3 < var6; var4 += var5) {
         var10001 = var3++;
         var1[var10001] += var0[var2++] * var4;
      }

      var9.field1446 = var4 >> 2;
      var9.field1444 = var2 << 8;
      return var3;
   }

   @ObfuscatedName("bg")
   @ObfuscatedSignature(
      signature = "(II[B[IIIIIIIILdt;II)I"
   )
   static int method2533(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, class166 var11, int var12, int var13) {
      var11.field1447 -= var11.field1455 * var5;
      var11.field1448 -= var11.field1445 * var5;
      if(var12 == 0 || (var8 = var5 + (var10 - var4 + var12 - 257) / var12) > var9) {
         var8 = var9;
      }

      byte var14;
      int var10001;
      while(var5 < var8) {
         var1 = var4 >> 8;
         var14 = var2[var1];
         var10001 = var5++;
         var3[var10001] += ((var14 << 8) + (var2[var1 + 1] - var14) * (var4 & 255)) * var6 >> 6;
         var6 += var7;
         var4 += var12;
      }

      if(var12 == 0 || (var8 = var5 + (var10 - var4 + var12 - 1) / var12) > var9) {
         var8 = var9;
      }

      for(var1 = var13; var5 < var8; var4 += var12) {
         var14 = var2[var4 >> 8];
         var10001 = var5++;
         var3[var10001] += ((var14 << 8) + (var1 - var14) * (var4 & 255)) * var6 >> 6;
         var6 += var7;
      }

      var11.field1447 += var11.field1455 * var5;
      var11.field1448 += var11.field1445 * var5;
      var11.field1446 = var6;
      var11.field1444 = var4;
      return var5;
   }

   @ObfuscatedName("br")
   @ObfuscatedSignature(
      signature = "(II[B[IIIIIIIILdt;II)I"
   )
   static int method2485(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, class166 var11, int var12, int var13) {
      var11.field1447 -= var11.field1455 * var5;
      var11.field1448 -= var11.field1445 * var5;
      if(var12 == 0 || (var8 = var5 + (var10 + 256 - var4 + var12) / var12) > var9) {
         var8 = var9;
      }

      int var10001;
      while(var5 < var8) {
         var1 = var4 >> 8;
         byte var14 = var2[var1 - 1];
         var10001 = var5++;
         var3[var10001] += ((var14 << 8) + (var2[var1] - var14) * (var4 & 255)) * var6 >> 6;
         var6 += var7;
         var4 += var12;
      }

      if(var12 == 0 || (var8 = var5 + (var10 - var4 + var12) / var12) > var9) {
         var8 = var9;
      }

      var0 = var13;

      for(var1 = var12; var5 < var8; var4 += var1) {
         var10001 = var5++;
         var3[var10001] += ((var0 << 8) + (var2[var4 >> 8] - var0) * (var4 & 255)) * var6 >> 6;
         var6 += var7;
      }

      var11.field1447 += var11.field1455 * var5;
      var11.field1448 += var11.field1445 * var5;
      var11.field1446 = var6;
      var11.field1444 = var4;
      return var5;
   }

   @ObfuscatedName("bd")
   @ObfuscatedSignature(
      signature = "(II[B[IIIIIIIILdt;II)I"
   )
   static int method2518(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, class166 var11, int var12, int var13) {
      if(var12 == 0 || (var8 = var5 + (var10 + 256 - var4 + var12) / var12) > var9) {
         var8 = var9;
      }

      var5 <<= 1;

      int var10001;
      for(var8 <<= 1; var5 < var8; var4 += var12) {
         var1 = var4 >> 8;
         byte var14 = var2[var1 - 1];
         var0 = (var2[var1] - var14) * (var4 & 255) + (var14 << 8);
         var10001 = var5++;
         var3[var10001] += var0 * var6 >> 6;
         var10001 = var5++;
         var3[var10001] += var0 * var7 >> 6;
      }

      if(var12 == 0 || (var8 = (var5 >> 1) + (var10 - var4 + var12) / var12) > var9) {
         var8 = var9;
      }

      var8 <<= 1;

      for(var1 = var13; var5 < var8; var4 += var12) {
         var0 = (var1 << 8) + (var4 & 255) * (var2[var4 >> 8] - var1);
         var10001 = var5++;
         var3[var10001] += var0 * var6 >> 6;
         var10001 = var5++;
         var3[var10001] += var0 * var7 >> 6;
      }

      var11.field1444 = var4;
      return var5 >> 1;
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(Lce;III)Ldt;"
   )
   public static class166 method2509(RawAudioNode var0, int var1, int var2, int var3) {
      return var0.audioBuffer != null && var0.audioBuffer.length != 0?new class166(var0, var1, var2, var3):null;
   }

   @ObfuscatedName("bo")
   @ObfuscatedSignature(
      signature = "(II[B[IIIIIIIILdt;II)I"
   )
   static int method2516(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, class166 var11, int var12, int var13) {
      if(var12 == 0 || (var8 = var5 + (var10 - var4 + var12 - 257) / var12) > var9) {
         var8 = var9;
      }

      var5 <<= 1;

      byte var14;
      int var10001;
      for(var8 <<= 1; var5 < var8; var4 += var12) {
         var1 = var4 >> 8;
         var14 = var2[var1];
         var0 = (var14 << 8) + (var4 & 255) * (var2[var1 + 1] - var14);
         var10001 = var5++;
         var3[var10001] += var0 * var6 >> 6;
         var10001 = var5++;
         var3[var10001] += var0 * var7 >> 6;
      }

      if(var12 == 0 || (var8 = (var5 >> 1) + (var10 - var4 + var12 - 1) / var12) > var9) {
         var8 = var9;
      }

      var8 <<= 1;

      for(var1 = var13; var5 < var8; var4 += var12) {
         var14 = var2[var4 >> 8];
         var0 = (var14 << 8) + (var1 - var14) * (var4 & 255);
         var10001 = var5++;
         var3[var10001] += var0 * var6 >> 6;
         var10001 = var5++;
         var3[var10001] += var0 * var7 >> 6;
      }

      var11.field1444 = var4;
      return var5 >> 1;
   }

   @ObfuscatedName("bp")
   @ObfuscatedSignature(
      signature = "([B[IIIIIIIILdt;)I"
   )
   static int method2521(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, class166 var9) {
      var2 >>= 8;
      var8 >>= 8;
      var4 <<= 2;
      var5 <<= 2;
      if((var6 = var3 + var2 - (var8 - 1)) > var7) {
         var6 = var7;
      }

      var9.field1447 += var9.field1455 * (var6 - var3);
      var9.field1448 += var9.field1445 * (var6 - var3);

      int var10001;
      for(var6 -= 3; var3 < var6; var4 += var5) {
         var10001 = var3++;
         var1[var10001] += var0[var2--] * var4;
         var4 += var5;
         var10001 = var3++;
         var1[var10001] += var0[var2--] * var4;
         var4 += var5;
         var10001 = var3++;
         var1[var10001] += var0[var2--] * var4;
         var4 += var5;
         var10001 = var3++;
         var1[var10001] += var0[var2--] * var4;
      }

      for(var6 += 3; var3 < var6; var4 += var5) {
         var10001 = var3++;
         var1[var10001] += var0[var2--] * var4;
      }

      var9.field1446 = var4 >> 2;
      var9.field1444 = var2 << 8;
      return var3;
   }

   @ObfuscatedName("a")
   static int method2503(int var0, int var1) {
      return var1 < 0?var0:(int)((double)var0 * Math.sqrt((double)(16384 - var1) * 1.220703125E-4D) + 0.5D);
   }

   @ObfuscatedName("bk")
   @ObfuscatedSignature(
      signature = "(II[B[IIIIIIIIIILdt;II)I"
   )
   static int method2548(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, class166 var13, int var14, int var15) {
      var13.field1446 -= var5 * var13.field1454;
      if(var14 == 0 || (var10 = var5 + (var12 - var4 + var14 - 257) / var14) > var11) {
         var10 = var11;
      }

      var5 <<= 1;

      byte var16;
      int var10001;
      for(var10 <<= 1; var5 < var10; var4 += var14) {
         var1 = var4 >> 8;
         var16 = var2[var1];
         var0 = (var16 << 8) + (var4 & 255) * (var2[var1 + 1] - var16);
         var10001 = var5++;
         var3[var10001] += var0 * var6 >> 6;
         var6 += var8;
         var10001 = var5++;
         var3[var10001] += var0 * var7 >> 6;
         var7 += var9;
      }

      if(var14 == 0 || (var10 = (var5 >> 1) + (var12 - var4 + var14 - 1) / var14) > var11) {
         var10 = var11;
      }

      var10 <<= 1;

      for(var1 = var15; var5 < var10; var4 += var14) {
         var16 = var2[var4 >> 8];
         var0 = (var16 << 8) + (var1 - var16) * (var4 & 255);
         var10001 = var5++;
         var3[var10001] += var0 * var6 >> 6;
         var6 += var8;
         var10001 = var5++;
         var3[var10001] += var0 * var7 >> 6;
         var7 += var9;
      }

      var5 >>= 1;
      var13.field1446 += var13.field1454 * var5;
      var13.field1447 = var6;
      var13.field1448 = var7;
      var13.field1444 = var4;
      return var5;
   }

   @ObfuscatedName("be")
   @ObfuscatedSignature(
      signature = "(II[B[IIIIIIILdt;II)I"
   )
   static int method2530(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, class166 var10, int var11, int var12) {
      if(var11 == 0 || (var7 = var5 + (var11 + (var9 + 256 - var4)) / var11) > var8) {
         var7 = var8;
      }

      int var10001;
      while(var5 < var7) {
         var1 = var4 >> 8;
         byte var13 = var2[var1 - 1];
         var10001 = var5++;
         var3[var10001] += ((var13 << 8) + (var2[var1] - var13) * (var4 & 255)) * var6 >> 6;
         var4 += var11;
      }

      if(var11 == 0 || (var7 = var5 + (var11 + (var9 - var4)) / var11) > var8) {
         var7 = var8;
      }

      var0 = var12;

      for(var1 = var11; var5 < var7; var4 += var1) {
         var10001 = var5++;
         var3[var10001] += ((var0 << 8) + (var2[var4 >> 8] - var0) * (var4 & 255)) * var6 >> 6;
      }

      var10.field1444 = var4;
      return var5;
   }

   @ObfuscatedName("bv")
   @ObfuscatedSignature(
      signature = "(I[B[IIIIIIIIIILdt;)I"
   )
   static int method2522(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, class166 var12) {
      var3 >>= 8;
      var11 >>= 8;
      var5 <<= 2;
      var6 <<= 2;
      var7 <<= 2;
      var8 <<= 2;
      if((var9 = var3 + var4 - (var11 - 1)) > var10) {
         var9 = var10;
      }

      var12.field1446 += var12.field1454 * (var9 - var4);
      var4 <<= 1;
      var9 <<= 1;

      byte var13;
      int var10001;
      for(var9 -= 6; var4 < var9; var6 += var8) {
         var13 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
         var6 += var8;
         var13 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
         var6 += var8;
         var13 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
         var6 += var8;
         var13 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
      }

      for(var9 += 6; var4 < var9; var6 += var8) {
         var13 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
      }

      var12.field1447 = var5 >> 2;
      var12.field1448 = var6 >> 2;
      var12.field1444 = var3 << 8;
      return var4 >> 1;
   }

   @ObfuscatedName("am")
   @ObfuscatedSignature(
      signature = "(I[B[IIIIIIIILdt;)I"
   )
   static int method2514(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, class166 var10) {
      var3 >>= 8;
      var9 >>= 8;
      var5 <<= 2;
      var6 <<= 2;
      if((var7 = var3 + var4 - (var9 - 1)) > var8) {
         var7 = var8;
      }

      var4 <<= 1;
      var7 <<= 1;

      int var10001;
      byte var11;
      for(var7 -= 6; var4 < var7; var2[var10001] += var11 * var6) {
         var11 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
         var2[var10001] += var11 * var6;
         var11 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
         var2[var10001] += var11 * var6;
         var11 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
         var2[var10001] += var11 * var6;
         var11 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
      }

      for(var7 += 6; var4 < var7; var2[var10001] += var11 * var6) {
         var11 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
      }

      var10.field1444 = var3 << 8;
      return var4 >> 1;
   }

   @ObfuscatedName("bf")
   @ObfuscatedSignature(
      signature = "(II[B[IIIIIIILdt;II)I"
   )
   static int method2515(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, class166 var10, int var11, int var12) {
      if(var11 == 0 || (var7 = var5 + (var11 + (var9 - var4) - 257) / var11) > var8) {
         var7 = var8;
      }

      byte var13;
      int var10001;
      while(var5 < var7) {
         var1 = var4 >> 8;
         var13 = var2[var1];
         var10001 = var5++;
         var3[var10001] += ((var13 << 8) + (var2[var1 + 1] - var13) * (var4 & 255)) * var6 >> 6;
         var4 += var11;
      }

      if(var11 == 0 || (var7 = var5 + (var11 + (var9 - var4) - 1) / var11) > var8) {
         var7 = var8;
      }

      for(var1 = var12; var5 < var7; var4 += var11) {
         var13 = var2[var4 >> 8];
         var10001 = var5++;
         var3[var10001] += ((var13 << 8) + (var1 - var13) * (var4 & 255)) * var6 >> 6;
      }

      var10.field1444 = var4;
      return var5;
   }

   @ObfuscatedName("ax")
   @ObfuscatedSignature(
      signature = "(I[B[IIIIIIIILdt;)I"
   )
   static int method2512(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, class166 var10) {
      var3 >>= 8;
      var9 >>= 8;
      var5 <<= 2;
      var6 <<= 2;
      if((var7 = var4 + var9 - var3) > var8) {
         var7 = var8;
      }

      var4 <<= 1;
      var7 <<= 1;

      int var10001;
      byte var11;
      for(var7 -= 6; var4 < var7; var2[var10001] += var11 * var6) {
         var11 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
         var2[var10001] += var11 * var6;
         var11 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
         var2[var10001] += var11 * var6;
         var11 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
         var2[var10001] += var11 * var6;
         var11 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
      }

      for(var7 += 6; var4 < var7; var2[var10001] += var11 * var6) {
         var11 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
      }

      var10.field1444 = var3 << 8;
      return var4 >> 1;
   }

   @ObfuscatedName("ad")
   @ObfuscatedSignature(
      signature = "([B[IIIIIIILdt;)I"
   )
   static int method2511(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, class166 var8) {
      var2 >>= 8;
      var7 >>= 8;
      var4 <<= 2;
      if((var5 = var3 + var7 - var2) > var6) {
         var5 = var6;
      }

      int var10001;
      for(var5 -= 3; var3 < var5; var1[var10001] += var0[var2++] * var4) {
         var10001 = var3++;
         var1[var10001] += var0[var2++] * var4;
         var10001 = var3++;
         var1[var10001] += var0[var2++] * var4;
         var10001 = var3++;
         var1[var10001] += var0[var2++] * var4;
         var10001 = var3++;
      }

      for(var5 += 3; var3 < var5; var1[var10001] += var0[var2++] * var4) {
         var10001 = var3++;
      }

      var8.field1444 = var2 << 8;
      return var3;
   }

   @ObfuscatedName("s")
   static int method2482(int var0, int var1) {
      return var1 < 0?-var0:(int)((double)var0 * Math.sqrt((double)var1 * 1.220703125E-4D) + 0.5D);
   }

   @ObfuscatedName("bi")
   @ObfuscatedSignature(
      signature = "(I[B[IIIIIIIIIILdt;)I"
   )
   static int method2520(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, class166 var12) {
      var3 >>= 8;
      var11 >>= 8;
      var5 <<= 2;
      var6 <<= 2;
      var7 <<= 2;
      var8 <<= 2;
      if((var9 = var11 + var4 - var3) > var10) {
         var9 = var10;
      }

      var12.field1446 += var12.field1454 * (var9 - var4);
      var4 <<= 1;
      var9 <<= 1;

      byte var13;
      int var10001;
      for(var9 -= 6; var4 < var9; var6 += var8) {
         var13 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
         var6 += var8;
         var13 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
         var6 += var8;
         var13 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
         var6 += var8;
         var13 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
      }

      for(var9 += 6; var4 < var9; var6 += var8) {
         var13 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
      }

      var12.field1447 = var5 >> 2;
      var12.field1448 = var6 >> 2;
      var12.field1444 = var3 << 8;
      return var4 >> 1;
   }

   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "(Lce;II)Ldt;"
   )
   public static class166 method2484(RawAudioNode var0, int var1, int var2) {
      return var0.audioBuffer != null && var0.audioBuffer.length != 0?new class166(var0, (int)((long)var0.sampleRate * 256L * (long)var1 / (long)(MapIconReference.sampleRate * 100)), var2 << 6):null;
   }
}
