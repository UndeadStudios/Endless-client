package net.runelite.standalone;

import java.io.EOFException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import net.runelite.api.events.VarClientIntChanged;
import net.runelite.api.events.VarClientStrChanged;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.api.RSVarcs;

@ObfuscatedName("cq")
public class Varcs implements RSVarcs {
   @ObfuscatedName("rg")
   @ObfuscatedGetter(
      intValue = 123379899
   )
   static int field1258;
   @ObfuscatedName("gu")
   static int[][] xteaKeys;
   @ObfuscatedName("f")
   boolean changed;
   @ObfuscatedName("x")
   Map field1256;
   @ObfuscatedName("p")
   @ObfuscatedGetter(
      longValue = 4713395565269692703L
   )
   long field1254;
   @ObfuscatedName("h")
   String[] varCStrings;
   @ObfuscatedName("g")
   boolean[] varcSerials;

   Varcs() {
      this.changed = false;
      int var1 = class177.configs.method4112(19);
      this.field1256 = new HashMap();
      this.varcSerials = new boolean[var1];

      int var2;
      for(var2 = 0; var2 < var1; ++var2) {
         VarClientType var4 = (VarClientType)VarClientType.field3343.method635((long)var2);
         VarClientType var3;
         if(var4 != null) {
            var3 = var4;
         } else {
            byte[] var5 = VarClientType.field3346.method4115(19, var2, -1549261100);
            var4 = new VarClientType();
            if(var5 != null) {
               var4.method4262(new Packet(var5));
            }

            VarClientType.field3343.method628(var4, (long)var2);
            var3 = var4;
         }

         this.varcSerials[var2] = var3.serialize;
      }

      var2 = 0;
      if(class177.configs.method2726(15)) {
         var2 = class177.configs.method4112(15);
      }

      this.varCStrings = new String[var2];
      this.method326();
      this.rl$$init();
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(II)Ljava/lang/String;",
      garbageValue = "1690505693"
   )
   String method353(int var1) {
      return this.varCStrings[var1];
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "(B)Z",
      garbageValue = "10"
   )
   boolean method328() {
      return this.changed;
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "2010296922"
   )
   void method316() {
      FileOnDisk var1 = this.method324(true);

      try {
         int var2 = 3;
         int var3 = 0;
         Iterator var4 = this.field1256.entrySet().iterator();

         while(var4.hasNext()) {
            Entry var5 = (Entry)var4.next();
            int var6 = ((Integer)var5.getKey()).intValue();
            if(this.varcSerials[var6]) {
               Object var7 = var5.getValue();
               var2 += 3;
               if(var7 instanceof Integer) {
                  var2 += 4;
               } else if(var7 instanceof String) {
                  var2 += OwnWorldComparator.method73((String)var7);
               }

               ++var3;
            }
         }

         Packet var24 = new Packet(var2);
         var24.writeByte(2);
         var24.writeShort(var3);
         Iterator var25 = this.field1256.entrySet().iterator();

         while(var25.hasNext()) {
            Entry var13 = (Entry)var25.next();
            int var14 = ((Integer)var13.getKey()).intValue();
            if(this.varcSerials[var14]) {
               var24.writeShort(var14);
               Object var8 = var13.getValue();
               class101 var9 = class101.method1440(var8.getClass());
               var24.writeByte(var9.field14);
               class143 var10 = class101.method1448(var8.getClass());
               var10.vmethod6420(var8, var24);
            }
         }

         var1.method5050(var24.payload, 0, var24.offset);
      } catch (Exception var22) {
         ;
      } finally {
         try {
            var1.method5051();
         } catch (Exception var21) {
            ;
         }

      }

      this.changed = false;
      this.field1254 = class318.method6317();
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(II)Ljava/lang/String;",
      garbageValue = "-388251738"
   )
   String method322(int var1) {
      Object var2 = this.field1256.get(Integer.valueOf(var1));
      return var2 instanceof String?(String)var2:"";
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(ZI)Lda;",
      garbageValue = "1149735458"
   )
   FileOnDisk method324(boolean var1) {
      return class244.method4645("2", TradingPost.field38.name, var1);
   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "21"
   )
   void method331() {
      int var1;
      for(var1 = 0; var1 < this.varcSerials.length; ++var1) {
         if(!this.varcSerials[var1]) {
            this.field1256.remove(Integer.valueOf(var1));
         }
      }

      for(var1 = 0; var1 < this.varCStrings.length; ++var1) {
         this.varCStrings[var1] = null;
      }

   }

   @ObfuscatedName("b")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "43"
   )
   void method326() {
      FileOnDisk var1 = this.method324(false);

      label226: {
         try {
            byte[] var2 = new byte[(int)var1.method5053()];

            int var4;
            for(int var3 = 0; var3 < var2.length; var3 += var4) {
               var4 = var1.method5054(var2, var3, var2.length - var3);
               if(var4 == -1) {
                  throw new EOFException();
               }
            }

            Packet var14 = new Packet(var2);
            if(var14.payload.length - var14.offset >= 1) {
               int var15 = var14.readUnsignedByte();
               if(var15 >= 0 && var15 <= 2) {
                  int var7;
                  int var8;
                  int var9;
                  int var16;
                  if(var15 >= 2) {
                     var16 = var14.readUnsignedShort();
                     var7 = 0;

                     while(true) {
                        if(var7 >= var16) {
                           break label226;
                        }

                        var8 = var14.readUnsignedShort();
                        var9 = var14.readUnsignedByte();
                        class101 var10 = (class101)PlayerList.method4757(class101.method1451(), var9);
                        Object var11 = var10.method1443(var14);
                        if(this.varcSerials[var8]) {
                           this.field1256.put(Integer.valueOf(var8), var11);
                        }

                        ++var7;
                     }
                  } else {
                     var16 = var14.readUnsignedShort();

                     for(var7 = 0; var7 < var16; ++var7) {
                        var8 = var14.readUnsignedShort();
                        var9 = var14.readInt();
                        if(this.varcSerials[var8]) {
                           this.field1256.put(Integer.valueOf(var8), Integer.valueOf(var9));
                        }
                     }

                     var7 = var14.readUnsignedShort();
                     var8 = 0;

                     while(true) {
                        if(var8 >= var7) {
                           break label226;
                        }

                        var14.readUnsignedShort();
                        var14.readString();
                        ++var8;
                     }
                  }
               }

               return;
            }
         } catch (Exception var25) {
            break label226;
         } finally {
            try {
               var1.method5051();
            } catch (Exception var24) {
               ;
            }

         }

         return;
      }

      this.changed = false;
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "(III)V",
      garbageValue = "-1962392844"
   )
   void method317(int var1, int var2) {
      this.field1256.put(Integer.valueOf(var1), Integer.valueOf(var2));
      if(this.varcSerials[var1]) {
         this.changed = true;
      }

      this.onVarCIntChanged(var1, var2);
   }

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "-15"
   )
   void method327() {
      if(this.changed && this.field1254 < class318.method6317() - 60000L) {
         this.method316();
      }

   }

   public void onVarCStrChanged(int var1, String var2) {
      ItemContainer.clientInstance.getCallbacks().post(new VarClientStrChanged(var1));
   }

   public void onVarCIntChanged(int var1, int var2) {
      ItemContainer.clientInstance.getCallbacks().post(new VarClientIntChanged(var1));
   }

   private void rl$$init() {
   }

   public Map getVarcMap() {
      return this.field1256;
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(IB)I",
      garbageValue = "117"
   )
   int method318(int var1) {
      Object var2 = this.field1256.get(Integer.valueOf(var1));
      return var2 instanceof Integer?((Integer)var2).intValue():-1;
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      signature = "(ILjava/lang/String;I)V",
      garbageValue = "324873402"
   )
   void method321(int var1, String var2) {
      this.varCStrings[var1] = var2;
   }

   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "(ILjava/lang/String;I)V",
      garbageValue = "1542210738"
   )
   void method319(int var1, String var2) {
      this.field1256.put(Integer.valueOf(var1), var2);
      this.onVarCStrChanged(var1, var2);
   }

   @ObfuscatedName("gr")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;ZI)V",
      garbageValue = "-595035793"
   )
   static final void method351(String var0, boolean var1) {
      if(client.field764) {
         byte var2 = 4;
         int var3 = var2 + 6;
         int var4 = var2 + 6;
         int var5 = Occluder.font_p12full.method6211(var0, 250);
         int var6 = Occluder.font_p12full.method6163(var0, 250) * 13;
         Rasterizer2D.method692(var3 - var2, var4 - var2, var2 + var5 + var2, var6 + var2 + var2, 0);
         Rasterizer2D.method696(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var2 + var6, 16777215);
         Occluder.font_p12full.method6207(var0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
         MouseInput.method1914(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2);
         if(var1) {
            Location.rasterProvider.vmethod4241(0, 0);
         } else {
            int var7 = var3;
            int var8 = var4;
            int var9 = var5;
            int var10 = var6;

            for(int var11 = 0; var11 < client.interfaceCount; ++var11) {
               if(client.widgetPositionX[var11] + client.widgetBoundsWidth[var11] > var7 && client.widgetPositionX[var11] < var7 + var9 && client.widgetBoundsHeight[var11] + client.widgetPositionY[var11] > var8 && client.widgetPositionY[var11] < var8 + var10) {
                  client.field923[var11] = true;
               }
            }
         }

      }
   }
}
