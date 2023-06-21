package net.runelite.standalone;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.rs.api.RSClassInfo;

@ObfuscatedName("ly")
public class ReflectionCheck extends Node implements RSClassInfo {
   @ObfuscatedName("f")
   int[] field3854;
   @ObfuscatedName("x")
   int[] errorIdentifiers;
   @ObfuscatedName("m")
   byte[][][] args;
   @ObfuscatedName("p")
   Method[] methods;
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      intValue = 2098891529
   )
   int field3850;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = -1743299775
   )
   int count;
   @ObfuscatedName("h")
   Field[] fields;
   @ObfuscatedName("g")
   int[] type;

   public Field[] getFields() {
      return this.fields;
   }

   public Method[] getMethods() {
      return this.methods;
   }

   public byte[][][] getArgs() {
      return this.args;
   }
}
