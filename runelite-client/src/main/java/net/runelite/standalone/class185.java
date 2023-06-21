package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cn")
public class class185 extends TaskDataNode {
   @ObfuscatedName("x")
   int field1324;
   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "Lhv;"
   )
   Deque field1321;
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "Lhv;"
   )
   Deque field1322;
   @ObfuscatedName("g")
   int field1323;

   public class185() {
      this.field1321 = new Deque();
      this.field1322 = new Deque();
      this.field1323 = 0;
      this.field1324 = -1;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "()Ldo;"
   )
   protected TaskDataNode vmethod5968() {
      return (TaskDataNode)this.field1321.method3930();
   }

   @ObfuscatedName("e")
   void method3537(int var1) {
      for(TaskDataNode var2 = (TaskDataNode)this.field1321.method3930(); var2 != null; var2 = (TaskDataNode)this.field1321.method3924()) {
         var2.vmethod5976(var1);
      }

   }

   @ObfuscatedName("q")
   public final synchronized void vmethod5972(int[] var1, int var2, int var3) {
      do {
         if(this.field1324 < 0) {
            this.method3535(var1, var2, var3);
            return;
         }

         if(var3 + this.field1323 < this.field1324) {
            this.field1323 += var3;
            this.method3535(var1, var2, var3);
            return;
         }

         int var4 = this.field1324 - this.field1323;
         this.method3535(var1, var2, var4);
         var2 += var4;
         var3 -= var4;
         this.field1323 += var4;
         this.method3528();
         class283 var5 = (class283)this.field1322.method3930();
         synchronized(var5) {
            int var7 = var5.method5848();
            if(var7 < 0) {
               var5.field1425 = 0;
               this.method3530(var5);
            } else {
               var5.field1425 = var7;
               this.method3529(var5.next, var5);
            }
         }
      } while(var3 != 0);

   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(Lhy;Ldl;)V"
   )
   void method3529(Node var1, class283 var2) {
      while(this.field1322.head != var1 && ((class283)var1).field1425 <= var2.field1425) {
         var1 = var1.next;
      }

      Deque.method3913(var2, var1);
      this.field1324 = ((class283)this.field1322.head.next).field1425;
   }

   @ObfuscatedName("m")
   protected int vmethod5970() {
      return 0;
   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "()Ldo;"
   )
   protected TaskDataNode vmethod5969() {
      return (TaskDataNode)this.field1321.method3924();
   }

   @ObfuscatedName("b")
   void method3535(int[] var1, int var2, int var3) {
      for(TaskDataNode var4 = (TaskDataNode)this.field1321.method3930(); var4 != null; var4 = (TaskDataNode)this.field1321.method3924()) {
         var4.method5971(var1, var2, var3);
      }

   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "(Ldo;)V"
   )
   public final synchronized void method3531(TaskDataNode var1) {
      this.field1321.method3907(var1);
   }

   @ObfuscatedName("n")
   public final synchronized void vmethod5976(int var1) {
      do {
         if(this.field1324 < 0) {
            this.method3537(var1);
            return;
         }

         if(this.field1323 + var1 < this.field1324) {
            this.field1323 += var1;
            this.method3537(var1);
            return;
         }

         int var2 = this.field1324 - this.field1323;
         this.method3537(var2);
         var1 -= var2;
         this.field1323 += var2;
         this.method3528();
         class283 var3 = (class283)this.field1322.method3930();
         synchronized(var3) {
            int var5 = var3.method5848();
            if(var5 < 0) {
               var3.field1425 = 0;
               this.method3530(var3);
            } else {
               var3.field1425 = var5;
               this.method3529(var3.next, var3);
            }
         }
      } while(var1 != 0);

   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(Ldo;)V"
   )
   public final synchronized void method3527(TaskDataNode var1) {
      var1.method432();
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      signature = "(Ldl;)V"
   )
   void method3530(class283 var1) {
      var1.method432();
      var1.method5845();
      Node var2 = this.field1322.head.next;
      if(var2 == this.field1322.head) {
         this.field1324 = -1;
      } else {
         this.field1324 = ((class283)var2).field1425;
      }

   }

   @ObfuscatedName("g")
   void method3528() {
      if(this.field1323 > 0) {
         for(class283 var1 = (class283)this.field1322.method3930(); var1 != null; var1 = (class283)this.field1322.method3924()) {
            var1.field1425 -= this.field1323;
         }

         this.field1324 -= this.field1323;
         this.field1323 = 0;
      }

   }
}
