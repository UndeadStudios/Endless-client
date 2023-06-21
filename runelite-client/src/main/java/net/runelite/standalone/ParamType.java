package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jz")
public class ParamType extends CacheableNode {
   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "Liz;"
   )
   public static Js5Index field3411;
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "Lgp;"
   )
   static NodeCache paramTypeCache;
   @ObfuscatedName("f")
   boolean autoDisable;
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = 387040489
   )
   public int defaultInt;
   @ObfuscatedName("h")
   public String defaultStr;
   @ObfuscatedName("g")
   char type;

   static {
      paramTypeCache = new NodeCache(64);
   }

   ParamType() {
      this.autoDisable = true;
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(Lgx;II)V",
      garbageValue = "-340827270"
   )
   void method605(Packet var1, int var2) {
      if(var2 == 1) {
         byte var4 = var1.method5230();
         int var5 = var4 & 255;
         if(var5 == 0) {
            throw new IllegalArgumentException("");
         }

         if(var5 >= 128 && var5 < 160) {
            char var6 = class13.cp1252AsciiExtension[var5 - 128];
            if(var6 == 0) {
               var6 = '?';
            }

            var5 = var6;
         }

         char var3 = (char)var5;
         this.type = var3;
      } else if(var2 == 2) {
         this.defaultInt = var1.readInt();
      } else if(var2 == 4) {
         this.autoDisable = false;
      } else if(var2 == 5) {
         this.defaultStr = var1.readString();
      }

   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "1788754847"
   )
   void method603() {
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "-2131355083"
   )
   public boolean method606() {
      return this.type == 's';
   }

   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "(Lgx;B)V",
      garbageValue = "-80"
   )
   void method604(Packet var1) {
      while(true) {
         int var2 = var1.readUnsignedByte();
         if(var2 == 0) {
            return;
         }

         this.method605(var1, var2);
      }
   }

   @ObfuscatedName("fs")
   @ObfuscatedSignature(
      signature = "(IIII)V",
      garbageValue = "-171465302"
   )
   static void method609(int var0, int var1, int var2) {
      if(client.field885 != 0 && var1 != 0 && client.queuedSoundEffectCount < 50) {
         client.queuedSoundEffectIDs[client.queuedSoundEffectCount] = var0;
         client.unknownSoundValues1[client.queuedSoundEffectCount] = var1;
         client.unknownSoundValues2[client.queuedSoundEffectCount] = var2;
         client.audioEffects[client.queuedSoundEffectCount] = null;
         client.soundLocations[client.queuedSoundEffectCount] = 0;
         ++client.queuedSoundEffectCount;
      }

   }

   @ObfuscatedName("k")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "56"
   )
   public static void method623() {
      ObjType.items.method629();
      ObjType.itemModelCache.method629();
      ObjType.itemSpriteCache.method629();
   }

   @ObfuscatedName("jp")
   @ObfuscatedSignature(
      signature = "(Lia;B)Z",
      garbageValue = "-8"
   )
   static final boolean method618(ComponentType var0) {
      if(var0.tableActions == null) {
         return false;
      } else {
         for(int var1 = 0; var1 < var0.tableActions.length; ++var1) {
            int var2 = class47.method797(var0, var1);
            int var3 = var0.field2809[var1];
            if(var0.tableActions[var1] == 2) {
               if(var2 >= var3) {
                  return false;
               }
            } else if(var0.tableActions[var1] == 3) {
               if(var2 <= var3) {
                  return false;
               }
            } else if(var0.tableActions[var1] == 4) {
               if(var3 == var2) {
                  return false;
               }
            } else if(var3 != var2) {
               return false;
            }
         }

         return true;
      }
   }
}
