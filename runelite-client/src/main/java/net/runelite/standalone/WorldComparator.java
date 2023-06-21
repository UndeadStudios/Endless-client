package net.runelite.standalone;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Comparator;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("f")
final class WorldComparator implements Comparator {
   @ObfuscatedName("qe")
   @ObfuscatedSignature(
      signature = "Ldn;"
   )
   static Resampler field36;
   @ObfuscatedName("gq")
   static int[] landRegionFileIds;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = -1139846795
   )
   static int field35;
   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "Liz;"
   )
   static Js5Index varplayer_ref;
   @ObfuscatedName("be")
   @ObfuscatedSignature(
      signature = "Lix;"
   )
   static ModeWhere field33;

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "(Lm;Lm;I)I",
      garbageValue = "-1123704124"
   )
   int method80(GrandExchangeEvent var1, GrandExchangeEvent var2) {
      return var1.world < var2.world?-1:(var2.world == var1.world?0:1);
   }

   public int compare(Object var1, Object var2) {
      return this.method80((GrandExchangeEvent)var1, (GrandExchangeEvent)var2);
   }

   public boolean equals(Object var1) {
      return super.equals(var1);
   }

   @ObfuscatedName("kp")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;ZB)Ljava/lang/String;",
      garbageValue = "0"
   )
   static String method84(String var0, boolean var1) {
      String var2 = var1?"https://":"http://";
      if(client.socketType == 1) {
         var0 = var0 + "-wtrc";
      } else if(client.socketType == 2) {
         var0 = var0 + "-wtqa";
      } else if(client.socketType == 3) {
         var0 = var0 + "-wtwip";
      } else if(client.socketType == 5) {
         var0 = var0 + "-wti";
      } else if(client.socketType == 4) {
         var0 = "local";
      }

      String var3 = "";
      if(class52.sessionToken != null) {
         var3 = "/p=" + class52.sessionToken;
      }

      String var4 = "runescape.com";
      return var2 + var0 + "." + var4 + "/l=" + client.languageId + "/a=" + ClientOptions.field1034 + var3 + "/";
   }

   @ObfuscatedName("kt")
   @ObfuscatedSignature(
      signature = "(Lia;I)I",
      garbageValue = "557758524"
   )
   static int method86(ComponentType var0) {
      IntegerNode var1 = (IntegerNode) client.serverActiveProperties.method6335((long)var0.index + ((long)var0.id << 32));
      return var1 != null?var1.value:var0.activeProperties;
   }

   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "(ILcs;ZI)I",
      garbageValue = "1106183111"
   )
   static int method85(int var0, class314 var1, boolean var2) {
      return var0 < 1000?class121.method1819(var0, var1, var2):(var0 < 1100?PathingEntity.method2472(var0, var1, var2):(var0 < 1200?PathingEntity.method2476(var0, var1, var2):(var0 < 1300?class321.method6332(var0, var1, var2):(var0 < 1400?GameObject.method1096(var0, var1, var2):(var0 < 1500?class308.method6153(var0, var1, var2):(var0 < 1600?ServerProt.method6324(var0, var1, var2):(var0 < 1700?ScriptState.method1044(var0, var1, var2):(var0 < 1800?class241.method4623(var0, var1, var2):(var0 < 1900?class91.method1223(var0, var1, var2):(var0 < 2000?class191.method3806(var0, var1, var2):(var0 < 2100?PathingEntity.method2472(var0, var1, var2):(var0 < 2200?PathingEntity.method2476(var0, var1, var2):(var0 < 2300?class321.method6332(var0, var1, var2):(var0 < 2400?GameObject.method1096(var0, var1, var2):(var0 < 2500?class308.method6153(var0, var1, var2):(var0 < 2600?class47.method795(var0, var1, var2):(var0 < 2700?Varbit.method935(var0, var1, var2):(var0 < 2800?ClientOptions.method1088(var0, var1, var2):(var0 < 2900?class192.method3815(var0, var1, var2):(var0 < 3000?class191.method3806(var0, var1, var2):(var0 < 3200?Item.method4638(var0, var1, var2):(var0 < 3300?WallObject.method1972(var0, var1, var2):(var0 < 3400?NPCType.method4813(var0, var1, var2):(var0 < 3500?class240.method4601(var0, var1, var2):(var0 < 3700?class121.method1818(var0, var1, var2):(var0 < 4000?WorldMapType2.method3095(var0, var1, var2):(var0 < 4100?class294.method5993(var0, var1, var2):(var0 < 4200?MouseInput.method1930(var0, var1, var2):(var0 < 4300?StructType.method3061(var0, var1, var2):(var0 < 5100?class258.method4860(var0, var1, var2):(var0 < 5400?class93.method1253(var0, var1, var2):(var0 < 5600?GameSocket.method1477(var0, var1, var2):(var0 < 5700?WorldMapData.method1716(var0, var1, var2):(var0 < 6300?Item.method4635(var0, var1, var2):(var0 < 6600?class288.method5945(var0, var1, var2):(var0 < 6700?SoundTaskDataProvider.method6146(var0, var1, var2):2))))))))))))))))))))))))))))))))))));
   }

   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "(Lgx;II)V",
      garbageValue = "-620130910"
   )
   public static void method76(Packet var0, int var1) {
      ReflectionCheck var2 = new ReflectionCheck();
      var2.count = var0.readUnsignedByte();
      var2.field3850 = var0.readInt();
      var2.type = new int[var2.count];
      var2.errorIdentifiers = new int[var2.count];
      var2.fields = new Field[var2.count];
      var2.field3854 = new int[var2.count];
      var2.methods = new Method[var2.count];
      var2.args = new byte[var2.count][][];

      for(int var3 = 0; var3 < var2.count; ++var3) {
         try {
            int var4 = var0.readUnsignedByte();
            String var5;
            String var6;
            int var7;
            if(var4 != 0 && var4 != 1 && var4 != 2) {
               if(var4 == 3 || var4 == 4) {
                  var5 = var0.readString();
                  var6 = var0.readString();
                  var7 = var0.readUnsignedByte();
                  String[] var8 = new String[var7];

                  for(int var9 = 0; var9 < var7; ++var9) {
                     var8[var9] = var0.readString();
                  }

                  String var20 = var0.readString();
                  byte[][] var10 = new byte[var7][];
                  int var12;
                  if(var4 == 3) {
                     for(int var11 = 0; var11 < var7; ++var11) {
                        var12 = var0.readInt();
                        var10[var11] = new byte[var12];
                        var0.method5098(var10[var11], 0, var12);
                     }
                  }

                  var2.type[var3] = var4;
                  Class[] var21 = new Class[var7];

                  for(var12 = 0; var12 < var7; ++var12) {
                     var21[var12] = class240.method4595(var8[var12]);
                  }

                  Class var22 = class240.method4595(var20);
                  if(class240.method4595(var5).getClassLoader() == null) {
                     throw new SecurityException();
                  }

                  Method[] var13 = class240.method4595(var5).getDeclaredMethods();
                  Method[] var14 = var13;

                  for(int var15 = 0; var15 < var14.length; ++var15) {
                     Method var16 = var14[var15];
                     if(var16.getName().equals(var6)) {
                        Class[] var17 = var16.getParameterTypes();
                        if(var21.length == var17.length) {
                           boolean var18 = true;

                           for(int var19 = 0; var19 < var21.length; ++var19) {
                              if(var21[var19] != var17[var19]) {
                                 var18 = false;
                                 break;
                              }
                           }

                           if(var18 && var22 == var16.getReturnType()) {
                              var2.methods[var3] = var16;
                           }
                        }
                     }
                  }

                  var2.args[var3] = var10;
               }
            } else {
               var5 = var0.readString();
               var6 = var0.readString();
               var7 = 0;
               if(var4 == 1) {
                  var7 = var0.readInt();
               }

               var2.type[var3] = var4;
               var2.field3854[var3] = var7;
               if(class240.method4595(var5).getClassLoader() == null) {
                  throw new SecurityException();
               }

               var2.fields[var3] = class240.method4595(var5).getDeclaredField(var6);
            }
         } catch (ClassNotFoundException var24) {
            var2.errorIdentifiers[var3] = -1;
         } catch (SecurityException var25) {
            var2.errorIdentifiers[var3] = -2;
         } catch (NullPointerException var26) {
            var2.errorIdentifiers[var3] = -3;
         } catch (Exception var27) {
            var2.errorIdentifiers[var3] = -4;
         } catch (Throwable var28) {
            var2.errorIdentifiers[var3] = -5;
         }
      }

      class242.classInfos.method4699(var2);
   }
}
