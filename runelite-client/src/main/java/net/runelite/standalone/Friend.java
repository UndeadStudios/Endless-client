package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.api.RSFriend;
import net.runelite.rs.api.RSName;

@ObfuscatedName("ks")
public class Friend extends ChatPlayer implements RSFriend {
   @ObfuscatedName("a")
   boolean field3729;
   @ObfuscatedName("s")
   boolean field3730;

   Friend() {
      this.rl$$init();
   }

   @ObfuscatedName("au")
   @ObfuscatedSignature(
      signature = "(Lkn;I)I",
      garbageValue = "-665156315"
   )
   public int vmethod6266(Nameable var1) {
      return this.method6269((Friend)var1);
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "(Lks;B)I",
      garbageValue = "81"
   )
   int method6269(Friend var1) {
      return super.world == client.world && client.world != var1.world?-1:(client.world == var1.world && super.world != client.world?1:(super.world != 0 && var1.world == 0?-1:(var1.world != 0 && super.world == 0?1:(this.field3729 && !var1.field3729?-1:(!this.field3729 && var1.field3729?1:(this.field3730 && !var1.field3730?-1:(!this.field3730 && var1.field3730?1:(super.world != 0?super.field3711 - var1.field3711:var1.field3711 - super.field3711))))))));
   }

   private void rl$$init() {
   }

   public int compareTo(Object var1) {
      return this.method6269((Friend)var1);
   }

   public String getName() {
      return this.getRsName().getName();
   }

   public String getPrevName() {
      RSName var1 = this.getRsPrevName();
      return var1 == null?null:var1.getName();
   }
}
