package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.api.RSCombatInfoList;
import net.runelite.rs.api.RSCombatInfoListHolder;
import net.runelite.rs.api.RSHealthBar;

@ObfuscatedName("bm")
public class CombatInfoListHolder extends Node implements RSCombatInfoListHolder {
   @ObfuscatedName("fi")
   @ObfuscatedSignature(
      signature = "Lke;"
   )
   static Fonts fonts;
   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "Lhj;"
   )
   CombatInfoList combatInfo1;
   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "Ljp;"
   )
   HeadbarType headbar;

   @ObfuscatedSignature(
      signature = "(Ljp;)V"
   )
   CombatInfoListHolder(HeadbarType var1) {
      this.combatInfo1 = new CombatInfoList();
      this.headbar = var1;
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "(IIIIB)V",
      garbageValue = "-25"
   )
   void method804(int var1, int var2, int var3, int var4) {
      CombatInfo1 var5 = null;
      int var6 = 0;

      for(CombatInfo1 var7 = (CombatInfo1)this.combatInfo1.method4703(); var7 != null; var7 = (CombatInfo1)this.combatInfo1.method4704()) {
         ++var6;
         if(var7.cycle == var1) {
            var7.method54(var1, var2, var3, var4);
            return;
         }

         if(var7.cycle <= var1) {
            var5 = var7;
         }
      }

      if(var5 == null) {
         if(var6 < 4) {
            this.combatInfo1.method4697(new CombatInfo1(var1, var2, var3, var4));
         }

      } else {
         CombatInfoList.method4701(new CombatInfo1(var1, var2, var3, var4), var5);
         if(var6 >= 4) {
            this.combatInfo1.method4703().method432();
         }

      }
   }

   public RSHealthBar getHealthBar() {
      return this.headbar;
   }

   public RSCombatInfoList getCombatInfo1() {
      return this.combatInfo1;
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(IB)Lby;",
      garbageValue = "-77"
   )
   CombatInfo1 method805(int var1) {
      CombatInfo1 var2 = (CombatInfo1)this.combatInfo1.method4703();
      if(var2 != null && var2.cycle <= var1) {
         for(CombatInfo1 var3 = (CombatInfo1)this.combatInfo1.method4704(); var3 != null && var3.cycle <= var1; var3 = (CombatInfo1)this.combatInfo1.method4704()) {
            var2.method432();
            var2 = var3;
         }

         if(this.headbar.field3394 + var2.int2 + var2.cycle > var1) {
            return var2;
         } else {
            var2.method432();
            return null;
         }
      } else {
         return null;
      }
   }

   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "(B)Z",
      garbageValue = "-37"
   )
   boolean method806() {
      return this.combatInfo1.method4705();
   }
}
