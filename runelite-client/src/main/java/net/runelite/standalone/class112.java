package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ka")
public class class112 {
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      longValue = -6758735277535701557L
   )
   long field3686;
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = 1278380113
   )
   int loginAttempts;
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      longValue = 1385251725868335585L
   )
   long elapsedLoginAttemptTime;
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      intValue = -838843165
   )
   int field3688;
   @ObfuscatedName("p")
   @ObfuscatedGetter(
      intValue = 1210592943
   )
   int gameState;
   @ObfuscatedName("b")
   @ObfuscatedGetter(
      intValue = -718217661
   )
   int field3689;
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      longValue = 331649546976032179L
   )
   long lastPacketReceivedTime;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      longValue = -45624293603189385L
   )
   long loginAttemptTimeStart;
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      longValue = 8613492977957081835L
   )
   long elapsedLastPackedReceivedTime;
   @ObfuscatedName("g")
   public boolean field3683;

   public class112() {
      this.lastPacketReceivedTime = -1L;
      this.loginAttemptTimeStart = -1L;
      this.field3683 = false;
      this.elapsedLoginAttemptTime = 0L;
      this.elapsedLastPackedReceivedTime = 0L;
      this.field3686 = 0L;
      this.gameState = 0;
      this.field3688 = 0;
      this.loginAttempts = 0;
      this.field3689 = 0;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "0"
   )
   public void method1590() {
      this.method1597();
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "1656439833"
   )
   public void method1597() {
      if(-1L != this.loginAttemptTimeStart) {
         this.elapsedLoginAttemptTime = class318.method6317() - this.loginAttemptTimeStart;
         this.loginAttemptTimeStart = -1L;
      }

      ++this.loginAttempts;
      this.field3683 = true;
   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "(Lgx;I)V",
      garbageValue = "1567582660"
   )
   public void method1592(Packet var1) {
      CacheFile.method5578(var1, this.elapsedLastPackedReceivedTime);
      CacheFile.method5578(var1, this.elapsedLoginAttemptTime);
      CacheFile.method5578(var1, this.field3686);
      var1.writeShort(this.gameState);
      var1.writeShort(this.field3688);
      var1.writeShort(this.loginAttempts);
      var1.writeShort(this.field3689);
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "1748851192"
   )
   public void method1587() {
      this.lastPacketReceivedTime = class318.method6317();
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "2058592549"
   )
   public void method1591() {
      if(this.lastPacketReceivedTime != -1L) {
         this.elapsedLastPackedReceivedTime = class318.method6317() - this.lastPacketReceivedTime;
         this.lastPacketReceivedTime = -1L;
      }

   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "597337885"
   )
   public void method1603() {
      this.field3683 = false;
      this.field3688 = 0;
   }

   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "(IB)V",
      garbageValue = "99"
   )
   public void method1589(int var1) {
      this.loginAttemptTimeStart = class318.method6317();
      this.gameState = var1;
   }
}
