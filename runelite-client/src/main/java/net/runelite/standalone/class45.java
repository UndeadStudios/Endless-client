package net.runelite.standalone;

import java.lang.ref.SoftReference;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("hi")
public class class45 extends class260 {
   @ObfuscatedName("a")
   SoftReference field2517;

   class45(Object var1, int var2) {
      super(var2);
      this.field2517 = new SoftReference(var1);
   }

   @ObfuscatedName("a")
   Object vmethod4874() {
      return this.field2517.get();
   }

   @ObfuscatedName("s")
   boolean vmethod4869() {
      return true;
   }
}
