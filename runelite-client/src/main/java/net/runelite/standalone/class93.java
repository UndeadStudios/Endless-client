package net.runelite.standalone;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.OptionalDataException;
import java.io.StreamCorruptedException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fu")
public abstract class class93 {
   @ObfuscatedName("dh")
   @ObfuscatedSignature(
      signature = "Lin;"
   )
   static Js5 textures;
   @ObfuscatedName("b")
   @ObfuscatedGetter(
      intValue = -707464673
   )
   static int field2125;
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = 1355744007
   )
   public int field2129;
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      intValue = 31491761
   )
   public int field2127;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = -568445929
   )
   public int field2126;
   @ObfuscatedName("g")
   @ObfuscatedGetter(
      intValue = 1316389541
   )
   public int field2130;

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "(IIILfk;I)Z",
      garbageValue = "1138939457"
   )
   public abstract boolean vmethod1252(int var1, int var2, int var3, CollisionData var4);

   @ObfuscatedName("as")
   @ObfuscatedSignature(
      signature = "(ILcs;ZI)I",
      garbageValue = "302016509"
   )
   static int method1253(int var0, class314 var1, boolean var2) {
      if(var0 == 5306) {
         class281.intStack[++class281.intStackSize - 1] = class31.method520();
         return 1;
      } else {
         int var3;
         if(var0 == 5307) {
            var3 = class281.intStack[--class281.intStackSize];
            if(var3 == 1 || var3 == 2) {
               ClanMember.method1637(var3);
            }

            return 1;
         } else if(var0 == 5308) {
            class281.intStack[++class281.intStackSize - 1] = class312.options.screenType;
            return 1;
         } else if(var0 != 5309) {
            if(var0 == 5310) {
               --class281.intStackSize;
               return 1;
            } else {
               return 2;
            }
         } else {
            var3 = class281.intStack[--class281.intStackSize];
            if(var3 == 1 || var3 == 2) {
               class312.options.screenType = var3;
               class72.method1041();
            }

            return 1;
         }
      }
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(Lge;B)V",
      garbageValue = "14"
   )
   public static void method1251(Bit var0) {
      ReflectionCheck var1 = (ReflectionCheck)class242.classInfos.method4703();
      if(var1 != null) {
         int var2 = var0.offset;
         var0.writeInt(var1.field3850);

         for(int var3 = 0; var3 < var1.count; ++var3) {
            if(var1.errorIdentifiers[var3] != 0) {
               var0.writeByte(var1.errorIdentifiers[var3]);
            } else {
               try {
                  int var4 = var1.type[var3];
                  Field var5;
                  int var6;
                  if(var4 == 0) {
                     var5 = var1.fields[var3];
                     var6 = var5.getInt((Object)null);
                     var0.writeByte(0);
                     var0.writeInt(var6);
                  } else if(var4 == 1) {
                     var5 = var1.fields[var3];
                     var5.setInt((Object)null, var1.field3854[var3]);
                     var0.writeByte(0);
                  } else if(var4 == 2) {
                     var5 = var1.fields[var3];
                     var6 = var5.getModifiers();
                     var0.writeByte(0);
                     var0.writeInt(var6);
                  }

                  Method var25;
                  if(var4 != 3) {
                     if(var4 == 4) {
                        var25 = var1.methods[var3];
                        var6 = var25.getModifiers();
                        var0.writeByte(0);
                        var0.writeInt(var6);
                     }
                  } else {
                     var25 = var1.methods[var3];
                     byte[][] var10 = var1.args[var3];
                     Object[] var7 = new Object[var10.length];

                     for(int var8 = 0; var8 < var10.length; ++var8) {
                        ObjectInputStream var9 = new ObjectInputStream(new ByteArrayInputStream(var10[var8]));
                        var7[var8] = var9.readObject();
                     }

                     Object var11 = var25.invoke((Object)null, var7);
                     if(var11 == null) {
                        var0.writeByte(0);
                     } else if(var11 instanceof Number) {
                        var0.writeByte(1);
                        var0.method5075(((Number)var11).longValue());
                     } else if(var11 instanceof String) {
                        var0.writeByte(2);
                        var0.writeString((String)var11);
                     } else {
                        var0.writeByte(4);
                     }
                  }
               } catch (ClassNotFoundException var13) {
                  var0.writeByte(-10);
               } catch (InvalidClassException var14) {
                  var0.writeByte(-11);
               } catch (StreamCorruptedException var15) {
                  var0.writeByte(-12);
               } catch (OptionalDataException var16) {
                  var0.writeByte(-13);
               } catch (IllegalAccessException var17) {
                  var0.writeByte(-14);
               } catch (IllegalArgumentException var18) {
                  var0.writeByte(-15);
               } catch (InvocationTargetException var19) {
                  var0.writeByte(-16);
               } catch (SecurityException var20) {
                  var0.writeByte(-17);
               } catch (IOException var21) {
                  var0.writeByte(-18);
               } catch (NullPointerException var22) {
                  var0.writeByte(-19);
               } catch (Exception var23) {
                  var0.writeByte(-20);
               } catch (Throwable var24) {
                  var0.writeByte(-21);
               }
            }
         }

         var0.method5110(var2);
         var1.method432();
      }
   }
}
