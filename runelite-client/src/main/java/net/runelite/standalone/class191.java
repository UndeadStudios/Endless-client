package net.runelite.standalone;

import java.io.File;
import java.io.RandomAccessFile;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("be")
public final class class191 {
   @ObfuscatedName("qf")
   @ObfuscatedSignature(
      signature = "Lcz;"
   )
   static AbstractSoundSystem soundSystem0;
   @ObfuscatedName("fk")
   @ObfuscatedSignature(
      signature = "Lkt;"
   )
   static Font fontBold12;

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "([BB)Lcs;",
      garbageValue = "109"
   )
   static class314 method3809(byte[] var0) {
      class314 var1 = new class314();
      Packet var2 = new Packet(var0);
      var2.offset = var2.payload.length - 2;
      int var3 = var2.readUnsignedShort();
      int var4 = var2.payload.length - 2 - var3 - 12;
      var2.offset = var4;
      int var5 = var2.readInt();
      var1.localIntCount = var2.readUnsignedShort();
      var1.localStringCount = var2.readUnsignedShort();
      var1.intStackCount = var2.readUnsignedShort();
      var1.stringStackCount = var2.readUnsignedShort();
      int var6 = var2.readUnsignedByte();
      int var7;
      int var8;
      if(var6 > 0) {
         var1.switches = var1.method6298(var6);

         for(var7 = 0; var7 < var6; ++var7) {
            var8 = var2.readUnsignedShort();
            IterableHashTable var9 = new IterableHashTable(var8 > 0?TotalQuantityComparator.method1122(var8):1);
            var1.switches[var7] = var9;

            while(var8-- > 0) {
               int var10 = var2.readInt();
               int var11 = var2.readInt();
               var9.method2186(new IntegerNode(var11), (long)var10);
            }
         }
      }

      var2.offset = 0;
      var2.method5094();
      var1.instructions = new int[var5];
      var1.intOperands = new int[var5];
      var1.stringOperands = new String[var5];

      for(var7 = 0; var2.offset < var4; var1.instructions[var7++] = var8) {
         var8 = var2.readUnsignedShort();
         if(var8 == 3) {
            var1.stringOperands[var7] = var2.readString();
         } else if(var8 < 100 && var8 != 21 && var8 != 38 && var8 != 39) {
            var1.intOperands[var7] = var2.readInt();
         } else {
            var1.intOperands[var7] = var2.readUnsignedByte();
         }
      }

      return var1;
   }

   @ObfuscatedName("iv")
   @ObfuscatedSignature(
      signature = "(IIIII)V",
      garbageValue = "804880678"
   )
   static void method3801(int var0, int var1, int var2, int var3) {
      ComponentType var4 = UnitPriceComparator.method2289(var0, var1);
      if(var4 != null && var4.onTargetEnterListener != null) {
         ScriptEvent var5 = new ScriptEvent();
         var5.source = var4;
         var5.params = var4.onTargetEnterListener;
         class192.method3810(var5);
      }

      client.field673 = var3;
      client.spellSelected = true;
      class255.field2065 = var0;
      client.field853 = var1;
      class240.ifTargetMask = var2;
      WorldMapRegion.method5554(var4);
   }

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      signature = "(Lia;II)V",
      garbageValue = "11845653"
   )
   static final void method3805(ComponentType var0, int var1) {
      if(var0.opKeys == null) {
         throw new RuntimeException();
      } else {
         if(var0.opKeysIgnoreHeld == null) {
            var0.opKeysIgnoreHeld = new int[var0.opKeys.length];
         }

         var0.opKeysIgnoreHeld[var1] = Integer.MAX_VALUE;
      }
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;B)Ljava/io/File;",
      garbageValue = "27"
   )
   public static File method3808(String var0) {
      if(!class48.field2055) {
         throw new RuntimeException("");
      } else {
         File var1 = (File)class48.field2057.get(var0);
         if(var1 != null) {
            return var1;
         } else {
            File var2 = new File(class48.field2056, var0);
            RandomAccessFile var3 = null;

            try {
               File var4 = new File(var2.getParent());
               if(!var4.exists()) {
                  throw new RuntimeException("");
               } else {
                  var3 = new RandomAccessFile(var2, "rw");
                  int var5 = var3.read();
                  var3.seek(0L);
                  var3.write(var5);
                  var3.seek(0L);
                  var3.close();
                  class48.field2057.put(var0, var2);
                  return var2;
               }
            } catch (Exception var8) {
               try {
                  if(var3 != null) {
                     var3.close();
                     var3 = null;
                  }
               } catch (Exception var7) {
                  ;
               }

               throw new RuntimeException();
            }
         }
      }
   }

   @ObfuscatedName("u")
   @ObfuscatedSignature(
      signature = "(ILcs;ZB)I",
      garbageValue = "-93"
   )
   static int method3806(int var0, class314 var1, boolean var2) {
      ComponentType var3;
      if(var0 >= 2000) {
         var0 -= 1000;
         var3 = ChatHistory.method6246(class281.intStack[--class281.intStackSize]);
      } else {
         var3 = var2?ClientOptions.field1035:class290.field1119;
      }

      if(var0 == 1927) {
         if(class281.field1080 >= 10) {
            throw new RuntimeException();
         } else if(var3.onResizeListener == null) {
            return 0;
         } else {
            ScriptEvent var4 = new ScriptEvent();
            var4.source = var3;
            var4.params = var3.onResizeListener;
            var4.field582 = class281.field1080 + 1;
            client.field848.method3906(var4);
            return 1;
         }
      } else {
         return 2;
      }
   }
}
