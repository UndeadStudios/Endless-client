package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.api.RSFriendContainer;

@ObfuscatedName("kr")
public class FriendContainer extends NameableContainer implements RSFriendContainer {
   @ObfuscatedName("b")
   @ObfuscatedGetter(
      intValue = -672753831
   )
   int field3724;
   @ObfuscatedName("n")
   @ObfuscatedSignature(
      signature = "Lhp;"
   )
   public class220 field3725;
   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "Lll;"
   )
   final JagexLoginType field3723;

   @ObfuscatedSignature(
      signature = "(Lll;)V"
   )
   public FriendContainer(JagexLoginType var1) {
      super(400);
      this.field3724 = 1;
      this.field3725 = new class220();
      this.field3723 = var1;
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "(I)Lkn;",
      garbageValue = "2122925855"
   )
   Nameable vmethod6437() {
      return new Friend();
   }

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      signature = "(Lgx;IB)V",
      garbageValue = "1"
   )
   public void method6440(Packet var1, int var2) {
      while(true) {
         if(var1.offset < var2) {
            boolean var3 = var1.readUnsignedByte() == 1;
            Name var4 = new Name(var1.readString(), this.field3723);
            Name var5 = new Name(var1.readString(), this.field3723);
            int var6 = var1.readUnsignedShort();
            int var7 = var1.readUnsignedByte();
            int var8 = var1.readUnsignedByte();
            boolean var9 = (var8 & 2) != 0;
            boolean var10 = (var8 & 1) != 0;
            if(var6 > 0) {
               var1.readString();
               var1.readUnsignedByte();
               var1.readInt();
            }

            var1.readString();
            if(var4 != null && var4.method1532()) {
               Friend var11 = (Friend)this.method5363(var4);
               if(var3) {
                  Friend var12 = (Friend)this.method5363(var5);
                  if(var12 != null && var12 != var11) {
                     if(var11 != null) {
                        this.method5329(var12);
                     } else {
                        var11 = var12;
                     }
                  }
               }

               if(var11 != null) {
                  this.method5326(var11, var4, var5);
                  if(var6 != var11.world) {
                     boolean var14 = true;

                     for(class253 var13 = (class253)this.field3725.method4233(); var13 != null; var13 = (class253)this.field3725.method4229()) {
                        if(var13.field3741.equals(var4)) {
                           if(var6 != 0 && var13.field3742 == 0) {
                              var13.method466();
                              var14 = false;
                           } else if(var6 == 0 && var13.field3742 != 0) {
                              var13.method466();
                              var14 = false;
                           }
                        }
                     }

                     if(var14) {
                        this.field3725.method4234(new class253(var4, var6));
                     }
                  }
               } else {
                  if(this.method5322() >= 400) {
                     continue;
                  }

                  var11 = (Friend)this.method5331(var4, var5);
               }

               if(var6 != var11.world) {
                  var11.field3711 = ++this.field3724 - 1;
                  if(var11.world == -1 && var6 == 0) {
                     var11.field3711 = -(var11.field3711 * -67140027) * -2143445875;
                  }

                  var11.world = var6;
               }

               var11.rank = var7;
               var11.field3729 = var9;
               var11.field3730 = var10;
               continue;
            }

            throw new IllegalStateException();
         }

         this.method5369();
         return;
      }
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(IB)[Lkn;",
      garbageValue = "-101"
   )
   Nameable[] vmethod6438(int var1) {
      return new Friend[var1];
   }

   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "(Lkx;ZB)Z",
      garbageValue = "-71"
   )
   public boolean method6451(Name var1, boolean var2) {
      Friend var3 = (Friend)this.method5325(var1);
      return var3 == null?false:!var2 || var3.world != 0;
   }

   @ObfuscatedName("kn")
   @ObfuscatedSignature(
      signature = "(Lia;I)V",
      garbageValue = "1236878201"
   )
   static final void method6441(ComponentType var0) {
      int var1 = var0.clientcode;
      if(var1 == 324) {
         if(client.field861 == -1) {
            client.field861 = var0.graphic;
            client.field908 = var0.field2736;
         }

         if(client.field918.isFemale) {
            var0.graphic = client.field861;
         } else {
            var0.graphic = client.field908;
         }

      } else if(var1 == 325) {
         if(client.field861 == -1) {
            client.field861 = var0.graphic;
            client.field908 = var0.field2736;
         }

         if(client.field918.isFemale) {
            var0.graphic = client.field908;
         } else {
            var0.graphic = client.field861;
         }

      } else if(var1 == 327) {
         var0.xan2d = 150;
         var0.yan2d = (int)(Math.sin((double) client.gameCycle / 40.0D) * 256.0D) & 2047;
         var0.modelType = 5;
         var0.modelId = 0;
      } else if(var1 == 328) {
         var0.xan2d = 150;
         var0.yan2d = (int)(Math.sin((double) client.gameCycle / 40.0D) * 256.0D) & 2047;
         var0.modelType = 5;
         var0.modelId = 1;
      }
   }

   @ObfuscatedName("kh")
   @ObfuscatedSignature(
      signature = "(Lgx;II)V",
      garbageValue = "-1673328168"
   )
   static void method6439(Packet var0, int var1) {
      byte[] var2 = var0.payload;
      if(client.field688 == null) {
         client.field688 = new byte[24];
      }

      class11.method156(var2, var1, client.field688, 0, 24);
      if(class75.uidDat != null) {
         try {
            class75.uidDat.method5575(0L);
            class75.uidDat.method5583(var0.payload, var1, 24);
         } catch (Exception var4) {
            ;
         }
      }

   }
}
