package net.runelite.standalone;

import net.runelite.api.events.ClanMemberJoined;
import net.runelite.api.events.ClanMemberLeft;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.api.RSClanMemberManager;
import net.runelite.rs.api.RSName;
import net.runelite.rs.api.RSNameable;

@ObfuscatedName("ky")
public class ClanMemberManager extends NameableContainer implements RSClanMemberManager {
   @ObfuscatedName("e")
   public byte field3738;
   @ObfuscatedName("r")
   @ObfuscatedGetter(
      intValue = 90485331
   )
   public int field3739;
   @ObfuscatedName("b")
   public String name;
   @ObfuscatedName("n")
   public String owner;
   @ObfuscatedName("t")
   @ObfuscatedGetter(
      intValue = -1331778397
   )
   int field3740;
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "Lll;"
   )
   final JagexLoginType field3734;
   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "Lko;"
   )
   final class245 field3735;

   @ObfuscatedSignature(
      signature = "(Lll;Lko;)V"
   )
   public ClanMemberManager(JagexLoginType var1, class245 var2) {
      super(2000);
      this.name = null;
      this.owner = null;
      this.field3740 = 1;
      this.field3734 = var1;
      this.field3735 = var2;
      this.rl$$init();
   }

   @ObfuscatedName("ck")
   @ObfuscatedSignature(
      signature = "(Lgx;B)V",
      garbageValue = "43"
   )
   public final void method2422(Packet var1) {
      Name var2 = new Name(var1.readString(), this.field3734);
      int var3 = var1.readUnsignedShort();
      byte var4 = var1.method5230();
      boolean var5 = false;
      if(var4 == -128) {
         var5 = true;
      }

      ClanMember var6;
      if(var5) {
         if(this.method5322() == 0) {
            return;
         }

         var6 = (ClanMember)this.method5363(var2);
         if(var6 != null && var6.method2020() == var3) {
            this.method5329(var6);
         }
      } else {
         var1.readString();
         var6 = (ClanMember)this.method5363(var2);
         if(var6 == null) {
            if(this.method5322() > super.field3702) {
               return;
            }

            var6 = (ClanMember)this.method5330(var2);
         }

         var6.method2021(var3, ++this.field3740 - 1);
         var6.rank = var4;
         this.method2425(var6);
      }

   }

   @ObfuscatedName("cw")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1095112712"
   )
   public final void method2424() {
      for(int var1 = 0; var1 < this.method5322(); ++var1) {
         ((ClanMember)this.method5397(var1)).method1636();
      }

   }

   @ObfuscatedName("cv")
   @ObfuscatedSignature(
      signature = "(Lkm;I)V",
      garbageValue = "1560633983"
   )
   final void method2425(ClanMember var1) {
      if(var1.method2752().equals(this.field3735.vmethod4647())) {
         this.field3739 = var1.rank;
      }

   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "(I)Lkn;",
      garbageValue = "2122925855"
   )
   Nameable vmethod6437() {
      return new ClanMember();
   }

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;I)V",
      garbageValue = "1738028463"
   )
   final void method2436(String var1) {
      this.owner = class124.method1844(var1);
   }

   public void rl$add(RSName var1, RSName var2) {
      net.runelite.api.ClanMember var3 = (net.runelite.api.ClanMember)this.findByName(var1);
      if(var3 != null) {
         ClanMemberJoined var4 = new ClanMemberJoined(var3);
         ItemContainer.clientInstance.getCallbacks().postDeferred(var4);
      }
   }

   public void rl$remove(RSNameable var1) {
      net.runelite.api.ClanMember var2 = (net.runelite.api.ClanMember)this.findByName(var1.getRsName());
      if(var2 != null) {
         ClanMemberLeft var3 = new ClanMemberLeft(var2);
         ItemContainer.clientInstance.getCallbacks().postDeferred(var3);
      }
   }

   private void rl$$init() {
   }

   public String getClanChatName() {
      return this.name;
   }

   public String getClanOwner() {
      return this.owner;
   }

   @ObfuscatedName("cn")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "1819322040"
   )
   public final void method2438() {
      for(int var1 = 0; var1 < this.method5322(); ++var1) {
         ((ClanMember)this.method5397(var1)).method1631();
      }

   }

   @ObfuscatedName("cr")
   @ObfuscatedSignature(
      signature = "(Lgx;I)V",
      garbageValue = "-1095405022"
   )
   public final void method2450(Packet var1) {
      this.method2436(var1.readString());
      long var2 = var1.method5299();
      this.method2419(FontName.method517(var2));
      this.field3738 = var1.method5230();
      int var4 = var1.readUnsignedShort();
      if(var4 != 65535) {
         this.method5390();

         for(int var5 = 0; var5 < var4; ++var5) {
            ClanMember var6 = (ClanMember)this.method5330(new Name(var1.readString(), this.field3734));
            int var7 = var1.readUnsignedShort();
            var6.method2021(var7, ++this.field3740 - 1);
            var6.rank = var1.method5230();
            var1.readString();
            this.method2425(var6);
         }

      }
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(IB)[Lkn;",
      garbageValue = "-101"
   )
   Nameable[] vmethod6438(int var1) {
      return new ClanMember[var1];
   }

   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;B)V",
      garbageValue = "7"
   )
   final void method2419(String var1) {
      this.name = class124.method1844(var1);
   }
}
