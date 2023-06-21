package net.runelite.standalone;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.api.RSName;
import net.runelite.rs.api.RSNameable;
import net.runelite.rs.api.RSNameableContainer;

@ObfuscatedName("kd")
public abstract class NameableContainer implements RSNameableContainer {
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "[Lkn;"
   )
   Nameable[] nameables;
   @ObfuscatedName("q")
   Comparator field3703;
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = 1426289773
   )
   final int field3702;
   @ObfuscatedName("m")
   HashMap field3705;
   @ObfuscatedName("p")
   HashMap field3704;
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      intValue = -525617491
   )
   int count;

   NameableContainer(int var1) {
      this.count = 0;
      this.field3703 = null;
      this.field3702 = var1;
      this.nameables = this.vmethod6438(var1);
      this.field3704 = new HashMap(var1 / 8);
      this.field3705 = new HashMap(var1 / 8);
      this.rl$$init();
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(Lkx;B)Z",
      garbageValue = "100"
   )
   public boolean method5333(Name var1) {
      return !var1.method1532()?false:(this.field3704.containsKey(var1)?true:this.field3705.containsKey(var1));
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      signature = "(Lkn;B)V",
      garbageValue = "-14"
   )
   final void method5329(Nameable var1) {
      this.remove(var1);
      int var2 = this.method5335(var1);
      if(var2 != -1) {
         this.method5339(var2);
         this.method5336(var1);
      }
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "205657117"
   )
   public void method5390() {
      this.count = 0;
      Arrays.fill(this.nameables, (Object)null);
      this.field3704.clear();
      this.field3705.clear();
   }

   @ObfuscatedName("r")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "-1210524042"
   )
   public int method5322() {
      return this.count;
   }

   @ObfuscatedName("ae")
   @ObfuscatedSignature(
      signature = "(Lkn;I)V",
      garbageValue = "-51878755"
   )
   final void method5337(Nameable var1) {
      this.nameables[++this.count - 1] = var1;
   }

   @ObfuscatedName("k")
   @ObfuscatedSignature(
      signature = "(Lkx;I)Z",
      garbageValue = "44623468"
   )
   public final boolean method5328(Name var1) {
      Nameable var2 = this.method5363(var1);
      if(var2 == null) {
         return false;
      } else {
         this.method5329(var2);
         return true;
      }
   }

   @ObfuscatedName("au")
   @ObfuscatedSignature(
      signature = "(IB)V",
      garbageValue = "50"
   )
   final void method5339(int var1) {
      --this.count;
      if(var1 < this.count) {
         System.arraycopy(this.nameables, var1 + 1, this.nameables, var1, this.count - var1);
      }

   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "3"
   )
   public final void method5396() {
      this.field3703 = null;
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      signature = "(Lkn;Lkx;Lkx;I)V",
      garbageValue = "768490434"
   )
   final void method5326(Nameable var1, Name var2, Name var3) {
      this.method5336(var1);
      var1.method2765(var2, var3);
      this.method5373(var1);
   }

   @ObfuscatedName("o")
   @ObfuscatedSignature(
      signature = "(Lkx;I)Lkn;",
      garbageValue = "1163835343"
   )
   public Nameable method5325(Name var1) {
      Nameable var2 = this.method5363(var1);
      return var2 != null?var2:this.method5401(var1);
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "(I)Lkn;",
      garbageValue = "2122925855"
   )
   abstract Nameable vmethod6437();

   @ObfuscatedName("av")
   @ObfuscatedSignature(
      signature = "(Lkn;I)V",
      garbageValue = "648142665"
   )
   final void method5373(Nameable var1) {
      this.field3704.put(var1.name, var1);
      if(var1.prevName != null) {
         Nameable var2 = (Nameable)this.field3705.put(var1.prevName, var1);
         if(var2 != null && var2 != var1) {
            var2.prevName = null;
            var2.onPrevNameChanged(-1);
         }
      }

   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      signature = "(Lkx;I)Lkn;",
      garbageValue = "563524423"
   )
   Nameable method5330(Name var1) {
      return this.method5331(var1, (Name)null);
   }

   @ObfuscatedName("t")
   @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "-1555038209"
   )
   public boolean method5323() {
      return this.field3702 == this.count;
   }

   @ObfuscatedName("ah")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "2074969199"
   )
   public final void method5369() {
      if(this.field3703 == null) {
         Arrays.sort(this.nameables, 0, this.count);
      } else {
         Arrays.sort(this.nameables, 0, this.count, this.field3703);
      }

   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      signature = "(Lkn;I)I",
      garbageValue = "-1066148450"
   )
   final int method5335(Nameable var1) {
      for(int var2 = 0; var2 < this.count; ++var2) {
         if(this.nameables[var2] == var1) {
            return var2;
         }
      }

      return -1;
   }

   public void rl$add(RSName var1, RSName var2) {
   }

   public void rl$remove(RSNameable var1) {
   }

   public void remove(RSNameable var1) {
      this.rl$remove(var1);
   }

   public RSNameable findByName(RSName var1) {
      return this.method5363((Name)var1);
   }

   public void add(RSName var1, RSName var2) {
      this.rl$add(var1, var2);
   }

   private void rl$$init() {
   }

   public int getCount() {
      return this.count;
   }

   public RSNameable[] getNameables() {
      return this.nameables;
   }

   public boolean isMember(RSName var1) {
      return this.method5333((Name)var1);
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      signature = "(Lkn;I)V",
      garbageValue = "-1704494426"
   )
   final void method5336(Nameable var1) {
      if(this.field3704.remove(var1.name) == null) {
         throw new IllegalStateException();
      } else {
         if(var1.prevName != null) {
            this.field3705.remove(var1.prevName);
         }

      }
   }

   @ObfuscatedName("y")
   @ObfuscatedSignature(
      signature = "(Lkx;I)Lkn;",
      garbageValue = "-293306478"
   )
   Nameable method5401(Name var1) {
      return !var1.method1532()?null:(Nameable)this.field3705.get(var1);
   }

   @ObfuscatedName("as")
   @ObfuscatedSignature(
      signature = "(Ljava/util/Comparator;I)V",
      garbageValue = "2079908571"
   )
   public final void method5343(Comparator var1) {
      if(this.field3703 == null) {
         this.field3703 = var1;
      } else if(this.field3703 instanceof class133) {
         ((class133)this.field3703).method1969(var1);
      }

   }

   @ObfuscatedName("aa")
   @ObfuscatedSignature(
      signature = "(Lkx;Lkx;I)Lkn;",
      garbageValue = "235872286"
   )
   Nameable method5331(Name var1, Name var2) {
      if(this.method5363(var1) != null) {
         throw new IllegalStateException();
      } else {
         Nameable var3 = this.vmethod6437();
         var3.method2765(var1, var2);
         this.method5337(var3);
         this.method5373(var3);
         this.add(var1, var2);
         return var3;
      }
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(IB)[Lkn;",
      garbageValue = "-101"
   )
   abstract Nameable[] vmethod6438(int var1);

   @ObfuscatedName("u")
   @ObfuscatedSignature(
      signature = "(Lkx;B)Lkn;",
      garbageValue = "64"
   )
   Nameable method5363(Name var1) {
      return !var1.method1532()?null:(Nameable)this.field3704.get(var1);
   }

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      signature = "(IB)Lkn;",
      garbageValue = "-1"
   )
   public final Nameable method5397(int var1) {
      if(var1 >= 0 && var1 < this.count) {
         return this.nameables[var1];
      } else {
         throw new ArrayIndexOutOfBoundsException(var1);
      }
   }
}
