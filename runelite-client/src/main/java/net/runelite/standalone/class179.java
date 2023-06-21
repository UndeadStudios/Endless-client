package net.runelite.standalone;

import java.math.BigInteger;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cy")
public class class179 {
   @ObfuscatedName("b")
   @ObfuscatedSignature(
      signature = "Ldz;"
   )
   static SoundTask task;
   @ObfuscatedName("a")
   static final BigInteger RSA_EXPONENT;
   @ObfuscatedName("s")
   static final BigInteger RSA_MODULUS;

   static {
      RSA_EXPONENT = new BigInteger("10001", 16);
      RSA_MODULUS = new BigInteger("147926487101535673874481304996273029446680384572900776356741718541029295833056728580689225626839331109889051098340610277259374021239154392825073133579283354307195571644831952411288119469259428730829525599875738883869187086987379074879572536962975657340434949610404032466451957196559061637505086995393354666349");
   }

   @ObfuscatedName("hr")
   @ObfuscatedSignature(
      signature = "(IB)V",
      garbageValue = "23"
   )
   static final void method2861(int var0) {
      int[] var1 = class281.minimapSprite.pixels;
      int var2 = var1.length;

      int var3;
      for(var3 = 0; var3 < var2; ++var3) {
         var1[var3] = 0;
      }

      int var4;
      int var5;
      for(var3 = 1; var3 < 103; ++var3) {
         var4 = (103 - var3) * 2048 + 24628;

         for(var5 = 1; var5 < 103; ++var5) {
            if((class91.tileSettings[var0][var5][var3] & 24) == 0) {
               class312.sceneManager.method3737(var1, var4, 512, var0, var5, var3);
            }

            if(var0 < 3 && (class91.tileSettings[var0 + 1][var5][var3] & 8) != 0) {
               class312.sceneManager.method3737(var1, var4, 512, var0 + 1, var5, var3);
            }

            var4 += 4;
         }
      }

      var3 = (238 + (int)(Math.random() * 20.0D) - 10 << 16) + (238 + (int)(Math.random() * 20.0D) - 10 << 8) + (238 + (int)(Math.random() * 20.0D) - 10);
      var4 = 238 + (int)(Math.random() * 20.0D) - 10 << 16;
      class281.minimapSprite.method1390();

      int var6;
      for(var5 = 1; var5 < 103; ++var5) {
         for(var6 = 1; var6 < 103; ++var6) {
            if((class91.tileSettings[var0][var6][var5] & 24) == 0) {
               PlayerComposition.method814(var0, var6, var5, var3, var4);
            }

            if(var0 < 3 && (class91.tileSettings[var0 + 1][var6][var5] & 8) != 0) {
               PlayerComposition.method814(var0 + 1, var6, var5, var3, var4);
            }
         }
      }

      client.field875 = 0;

      for(var5 = 0; var5 < 104; ++var5) {
         for(var6 = 0; var6 < 104; ++var6) {
            long var7 = class312.sceneManager.method3713(ServerProt.level, var5, var6);
            if(0L != var7) {
               int var9 = Resampler.method143(var7);
               int var10 = GrandExchangeOffer.method1736(var9).mapelement;
               if(var10 >= 0) {
                  client.mapIcons[client.field875] = MapLabel.method2858(var10).method1483(false);
                  client.field712[client.field875] = var5;
                  client.field805[client.field875] = var6;
                  ++client.field875;
               }
            }
         }
      }

      Location.rasterProvider.method1872();
   }
}
