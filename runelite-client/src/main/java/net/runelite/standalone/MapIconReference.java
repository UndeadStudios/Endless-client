package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ai")
public class MapIconReference {
   @ObfuscatedName("pt")
   @ObfuscatedSignature(
      signature = "Lky;"
   )
   static ClanMemberManager clanMemberManager;
   @ObfuscatedName("as")
   protected static String field362;
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      intValue = 1061963149
   )
   public static int sampleRate;
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      intValue = -1978146945
   )
   public int areaId;
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "Lif;"
   )
   public CoordGrid field359;
   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "Lif;"
   )
   public CoordGrid field360;

   @ObfuscatedSignature(
      signature = "(ILif;Lif;)V"
   )
   public MapIconReference(int var1, CoordGrid var2, CoordGrid var3) {
      this.areaId = var1;
      this.field359 = var2;
      this.field360 = var3;
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "1310433432"
   )
   public static void method2083() {
      NPCType.npcTypeCache.method629();
      NPCType.npcModelCache.method629();
   }

   @ObfuscatedName("s")
   public static String method2082(long var0) {
      if(var0 > 0L && var0 < 6582952005840035281L) {
         if(var0 % 37L == 0L) {
            return null;
         } else {
            int var2 = 0;

            for(long var3 = var0; 0L != var3; var3 /= 37L) {
               ++var2;
            }

            StringBuilder var5;
            char var8;
            for(var5 = new StringBuilder(var2); 0L != var0; var5.append(var8)) {
               long var6 = var0;
               var0 /= 37L;
               var8 = class217.field3802[(int)(var6 - 37L * var0)];
               if(var8 == '_') {
                  int var9 = var5.length() - 1;
                  var5.setCharAt(var9, Character.toUpperCase(var5.charAt(var9)));
                  var8 = 160;
               }
            }

            var5.reverse();
            var5.setCharAt(0, Character.toUpperCase(var5.charAt(0)));
            return var5.toString();
         }
      } else {
         return null;
      }
   }
}
