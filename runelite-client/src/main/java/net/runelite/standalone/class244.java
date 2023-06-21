package net.runelite.standalone;

import java.io.File;
import java.io.IOException;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ey")
public class class244 extends class133 {
   @ObfuscatedName("lx")
   @ObfuscatedSignature(
      signature = "Lia;"
   )
   static ComponentType field1961;
   @ObfuscatedName("a")
   final boolean field1960;

   public class244(boolean var1) {
      this.field1960 = var1;
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "(Lkl;Lkl;I)I",
      garbageValue = "-174181973"
   )
   int method4639(ChatPlayer var1, ChatPlayer var2) {
      return var1.world != 0 && var2.world != 0?(this.field1960?var1.field3711 - var2.field3711:var2.field3711 - var1.field3711):this.method1960(var1, var2);
   }

   public int compare(Object var1, Object var2) {
      return this.method4639((ChatPlayer)var1, (ChatPlayer)var2);
   }

   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;Ljava/lang/String;ZB)Lda;",
      garbageValue = "2"
   )
   public static FileOnDisk method4645(String var0, String var1, boolean var2) {
      File var3 = new File(class75.cacheDirectory, "preferences" + var0 + ".dat");
      if(var3.exists()) {
         try {
            FileOnDisk var10 = new FileOnDisk(var3, "rw", 10000L);
            return var10;
         } catch (IOException var9) {
            ;
         }
      }

      String var4 = "";
      if(class47.historicCacheId == 33) {
         var4 = "_rc";
      } else if(class47.historicCacheId == 34) {
         var4 = "_wip";
      }

      File var5 = new File(class69.homeDir, "jagex_" + var1 + "_preferences" + var0 + var4 + ".dat");
      FileOnDisk var6;
      if(!var2 && var5.exists()) {
         try {
            var6 = new FileOnDisk(var5, "rw", 10000L);
            return var6;
         } catch (IOException var8) {
            ;
         }
      }

      try {
         var6 = new FileOnDisk(var3, "rw", 10000L);
         return var6;
      } catch (IOException var7) {
         throw new RuntimeException();
      }
   }
}
