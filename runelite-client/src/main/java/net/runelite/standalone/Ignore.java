package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.api.RSIgnore;
import net.runelite.rs.api.RSName;

@ObfuscatedName("kq")
public class Ignore extends Nameable implements RSIgnore {
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      intValue = 964897101
   )
   int field3709;

   Ignore() {
      this.rl$$init();
   }

   @ObfuscatedName("au")
   @ObfuscatedSignature(
      signature = "(Lkn;I)I",
      garbageValue = "-665156315"
   )
   public int vmethod6266(Nameable var1) {
      return this.method120((Ignore)var1);
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "(Lkq;B)I",
      garbageValue = "1"
   )
   int method120(Ignore var1) {
      return this.field3709 - var1.field3709;
   }

   private void rl$$init() {
   }

   public int compareTo(Object var1) {
      return this.method120((Ignore)var1);
   }

   public String getName() {
      return this.getRsName().getName();
   }

   public String getPrevName() {
      RSName var1 = this.getRsPrevName();
      return var1 == null?null:var1.getName();
   }
}
