package net.runelite.standalone;

import net.runelite.api.ClanMemberRank;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.api.RSClanMember;

@ObfuscatedName("km")
public class ClanMember extends ChatPlayer implements RSClanMember {
   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "Lkz;"
   )
   SocialState friendState;
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "Lkz;"
   )
   SocialState ignoreState;

   ClanMember() {
      this.friendState = SocialState.UNSET;
      this.ignoreState = SocialState.UNSET;
      this.rl$$init();
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "1191680626"
   )
   void method1622() {
      this.ignoreState = class258.friendManager.ignoreContainer.method5333(super.name)?SocialState.CONTAINS:SocialState.NOT_CONTAINS;
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1827293258"
   )
   void method1636() {
      this.ignoreState = SocialState.UNSET;
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1615845702"
   )
   void method1631() {
      this.friendState = SocialState.UNSET;
   }

   private void rl$$init() {
   }

   public String getUsername() {
      return this.getRsName().getName();
   }

   public ClanMemberRank getRank() {
      return ClanMemberRank.valueOf(this.getRSRank());
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "-1965801811"
   )
   public final boolean method1620() {
      if(this.friendState == SocialState.UNSET) {
         this.method1621();
      }

      return this.friendState == SocialState.CONTAINS;
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      signature = "(B)Z",
      garbageValue = "-40"
   )
   public final boolean method1623() {
      if(this.ignoreState == SocialState.UNSET) {
         this.method1622();
      }

      return this.ignoreState == SocialState.CONTAINS;
   }

   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-859955771"
   )
   void method1621() {
      this.friendState = class258.friendManager.friendContainer.method5333(super.name)?SocialState.CONTAINS:SocialState.NOT_CONTAINS;
   }

   @ObfuscatedName("gj")
   @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "-1194096980"
   )
   static void method1637(int var0) {
      client.field700 = 0L;
      if(var0 >= 2) {
         client.isResized = true;
         client.resizeChanged(-1);
      } else {
         client.isResized = false;
         client.resizeChanged(-1);
      }

      if(class31.method520() == 1) {
         ItemContainer.clientInstance.method4356(765, 503, -1561289393);
      } else {
         ItemContainer.clientInstance.method4356(7680, 2160, 1895422007);
      }

      if(client.gameState >= 25) {
         ScriptEvent.method1145();
      }

   }
}
