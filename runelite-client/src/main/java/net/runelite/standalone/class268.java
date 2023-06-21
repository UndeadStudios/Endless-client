package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.api.RSIgnoreContainer;

@ObfuscatedName("ku")
public class class268 extends NameableContainer implements RSIgnoreContainer {
   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "Lll;"
   )
   final JagexLoginType field3699;

   @ObfuscatedSignature(
      signature = "(Lll;)V"
   )
   public class268(JagexLoginType var1) {
      super(400);
      this.field3699 = var1;
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "(I)Lkn;",
      garbageValue = "2122925855"
   )
   Nameable vmethod6437() {
      return new Ignore();
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(IB)[Lkn;",
      garbageValue = "-101"
   )
   Nameable[] vmethod6438(int var1) {
      return new Ignore[var1];
   }

   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "(Lgx;II)V",
      garbageValue = "-1361804166"
   )
   public void method5040(Packet var1, int var2) {
      while(true) {
         if(var1.offset < var2) {
            int var3 = var1.readUnsignedByte();
            boolean var4 = (var3 & 1) == 1;
            Name var5 = new Name(var1.readString(), this.field3699);
            Name var6 = new Name(var1.readString(), this.field3699);
            var1.readString();
            if(var5 != null && var5.method1532()) {
               Ignore var7 = (Ignore)this.method5363(var5);
               if(var4) {
                  Ignore var8 = (Ignore)this.method5363(var6);
                  if(var8 != null && var7 != var8) {
                     if(var7 != null) {
                        this.method5329(var8);
                     } else {
                        var7 = var8;
                     }
                  }
               }

               if(var7 != null) {
                  this.method5326(var7, var5, var6);
                  continue;
               }

               if(this.method5322() < 400) {
                  int var9 = this.method5322();
                  var7 = (Ignore)this.method5331(var5, var6);
                  var7.field3709 = var9;
               }
               continue;
            }

            throw new IllegalStateException();
         }

         return;
      }
   }
}
