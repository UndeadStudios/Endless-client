package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.api.RSName;

@ObfuscatedName("kx")
public class Name implements Comparable, RSName {
   @ObfuscatedName("a")
   String name;
   @ObfuscatedName("s")
   String cleanName;

   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;Lll;)V"
   )
   public Name(String var1, JagexLoginType var2) {
      this.name = var1;
      String var4;
      if(var1 == null) {
         var4 = null;
      } else {
         int var5 = 0;

         int var6;
         for(var6 = var1.length(); var5 < var6 && Size.method4096(var1.charAt(var5)); ++var5) {
            ;
         }

         while(var6 > var5 && Size.method4096(var1.charAt(var6 - 1))) {
            --var6;
         }

         int var7 = var6 - var5;
         if(var7 >= 1 && var7 <= class140.method2019(var2)) {
            StringBuilder var8 = new StringBuilder(var7);

            for(int var9 = var5; var9 < var6; ++var9) {
               char var10 = var1.charAt(var9);
               boolean var11;
               if(Character.isISOControl(var10)) {
                  var11 = false;
               } else if(FileOnDisk.method5066(var10)) {
                  var11 = true;
               } else {
                  char[] var15 = class51.field3799;
                  int var13 = 0;

                  label59:
                  while(true) {
                     char var14;
                     if(var13 >= var15.length) {
                        var15 = class51.field3801;

                        for(var13 = 0; var13 < var15.length; ++var13) {
                           var14 = var15[var13];
                           if(var10 == var14) {
                              var11 = true;
                              break label59;
                           }
                        }

                        var11 = false;
                        break;
                     }

                     var14 = var15[var13];
                     if(var10 == var14) {
                        var11 = true;
                        break;
                     }

                     ++var13;
                  }
               }

               if(var11) {
                  char var12 = ChatLine.method5917(var10);
                  if(var12 != 0) {
                     var8.append(var12);
                  }
               }
            }

            if(var8.length() == 0) {
               var4 = null;
            } else {
               var4 = var8.toString();
            }
         } else {
            var4 = null;
         }
      }

      this.cleanName = var4;
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "(B)Ljava/lang/String;",
      garbageValue = "-10"
   )
   public String method1530() {
      return this.name;
   }

   public boolean equals(Object var1) {
      if(var1 instanceof Name) {
         Name var2 = (Name)var1;
         return this.cleanName == null?var2.cleanName == null:(var2.cleanName == null?false:(this.hashCode() != var2.hashCode()?false:this.cleanName.equals(var2.cleanName)));
      } else {
         return false;
      }
   }

   public int hashCode() {
      return this.cleanName == null?0:this.cleanName.hashCode();
   }

   public String toString() {
      return this.method1530();
   }

   public String aas() {
      return this.method1530();
   }

   public String aal() {
      return this.method1530();
   }

   public int compareTo(Object var1) {
      return this.method1533((Name)var1);
   }

   public String getName() {
      return this.name;
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "2123331960"
   )
   public boolean method1532() {
      return this.cleanName != null;
   }

   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "(Lkx;I)I",
      garbageValue = "1091130939"
   )
   public int method1533(Name var1) {
      return this.cleanName == null?(var1.cleanName == null?0:1):(var1.cleanName == null?-1:this.cleanName.compareTo(var1.cleanName));
   }
}
