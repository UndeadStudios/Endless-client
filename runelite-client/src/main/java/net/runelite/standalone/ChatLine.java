package net.runelite.standalone;

import net.runelite.api.ChatMessageType;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.api.RSMessageNode;

@ObfuscatedName("bl")
public class ChatLine extends CacheableNode implements RSMessageNode {
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "Lkz;"
   )
   SocialState friendState;
   @ObfuscatedName("q")
   String value;
   @ObfuscatedName("x")
   String name;
   @ObfuscatedName("m")
   String clan;
   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "Lkz;"
   )
   SocialState ignoreState;
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      intValue = -1952141511
   )
   int id;
   public String runeLiteFormatMessage;
   public int rl$timestamp;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = -304319161
   )
   int tick;
   @ObfuscatedName("h")
   @ObfuscatedSignature(
      signature = "Lkx;"
   )
   Name field597;
   @ObfuscatedName("g")
   @ObfuscatedGetter(
      intValue = 1927995217
   )
   int type;

   ChatLine(int var1, String var2, String var3, String var4) {
      this.friendState = SocialState.UNSET;
      this.ignoreState = SocialState.UNSET;
      this.method5888(var1, var2, var3, var4);
      this.rl$$init();
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(B)Z",
      garbageValue = "112"
   )
   final boolean method5893() {
      if(this.ignoreState == SocialState.UNSET) {
         this.method5905();
      }

      return this.ignoreState == SocialState.CONTAINS;
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-2005241970"
   )
   void method5887() {
      this.friendState = class258.friendManager.friendContainer.method5333(this.field597)?SocialState.CONTAINS:SocialState.NOT_CONTAINS;
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "-83"
   )
   final void method5904() {
      if(this.name != null) {
         this.field597 = new Name(VarPlayerType.method10(this.name), KeyFocusListener.loginType);
      } else {
         this.field597 = null;
      }

   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "3"
   )
   void method5905() {
      this.ignoreState = class258.friendManager.ignoreContainer.method5333(this.field597)?SocialState.CONTAINS:SocialState.NOT_CONTAINS;
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V",
      garbageValue = "-1295158931"
   )
   void method5888(int var1, String var2, String var3, String var4) {
      int var5 = ++ChatHistory.field1262 - 1;
      this.id = var5;
      this.tick = client.gameCycle;
      this.type = var1;
      this.name = var2;
      this.method5904();
      this.clan = var3;
      this.value = var4;
      this.method5889();
      this.method5892();
      this.setMessage(var1, var2, var3, var4);
   }

   public int getRSType() {
      return this.type;
   }

   private void rl$$init() {
      this.rl$timestamp = (int)(System.currentTimeMillis() / 1000L);
   }

   public void setMessage(int var1, String var2, String var3, String var4) {
      this.runeLiteFormatMessage = null;
      this.rl$timestamp = (int)(System.currentTimeMillis() / 1000L);
   }

   public ChatMessageType getType() {
      return ChatMessageType.of(this.getRSType());
   }

   public String getRuneLiteFormatMessage() {
      return this.runeLiteFormatMessage;
   }

   public void setRuneLiteFormatMessage(String var1) {
      this.runeLiteFormatMessage = var1;
   }

   public int getTimestamp() {
      return this.rl$timestamp;
   }

   public void setTimestamp(int var1) {
      this.rl$timestamp = var1;
   }

   public int getId() {
      return this.id;
   }

   public void setName(String var1) {
      this.name = var1;
   }

   public String getName() {
      return this.name;
   }

   public void setSender(String var1) {
      this.clan = var1;
   }

   public String getSender() {
      return this.clan;
   }

   public void setValue(String var1) {
      this.value = var1;
   }

   public String getValue() {
      return this.value;
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "1786943233"
   )
   void method5889() {
      this.friendState = SocialState.UNSET;
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-2066729716"
   )
   void method5892() {
      this.ignoreState = SocialState.UNSET;
   }

   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "459972945"
   )
   final boolean method5890() {
      if(this.friendState == SocialState.UNSET) {
         this.method5887();
      }

      return this.friendState == SocialState.CONTAINS;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/Object;ZI)[B",
      garbageValue = "596133187"
   )
   public static byte[] method5908(Object var0, boolean var1) {
      if(var0 == null) {
         return null;
      } else if(var0 instanceof byte[]) {
         byte[] var6 = (byte[])((byte[])var0);
         if(var1) {
            int var4 = var6.length;
            byte[] var5 = new byte[var4];
            System.arraycopy(var6, 0, var5, 0, var4);
            return var5;
         } else {
            return var6;
         }
      } else if(var0 instanceof AbstractByteBuffer) {
         AbstractByteBuffer var2 = (AbstractByteBuffer)var0;
         return var2.vmethod6380();
      } else {
         throw new IllegalArgumentException();
      }
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(IB)Z",
      garbageValue = "96"
   )
   public static boolean method5915(int var0) {
      if(ComponentType.validInterfaces[var0]) {
         return true;
      } else if(!class234.componentIndex.method4159(var0)) {
         return false;
      } else {
         int var1 = class234.componentIndex.method4112(var0);
         if(var1 == 0) {
            ComponentType.validInterfaces[var0] = true;
            return true;
         } else {
            if(ComponentType.interfaces[var0] == null) {
               ComponentType.interfaces[var0] = new ComponentType[var1];
            }

            for(int var2 = 0; var2 < var1; ++var2) {
               if(ComponentType.interfaces[var0][var2] == null) {
                  byte[] var3 = class234.componentIndex.method4115(var0, var2, -622997650);
                  if(var3 != null) {
                     ComponentType.interfaces[var0][var2] = new ComponentType();
                     ComponentType.interfaces[var0][var2].id = var2 + (var0 << 16);
                     if(var3[0] == -1) {
                        ComponentType.interfaces[var0][var2].method5651(new Packet(var3));
                     } else {
                        ComponentType.interfaces[var0][var2].method5645(new Packet(var3));
                     }
                  }
               }
            }

            ComponentType.validInterfaces[var0] = true;
            return true;
         }
      }
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "(CI)B",
      garbageValue = "-1356468927"
   )
   public static byte method5916(char var0) {
      byte var1;
      if(var0 > 0 && var0 < 128 || var0 >= 160 && var0 <= 255) {
         var1 = (byte)var0;
      } else if(var0 == 8364) {
         var1 = -128;
      } else if(var0 == 8218) {
         var1 = -126;
      } else if(var0 == 402) {
         var1 = -125;
      } else if(var0 == 8222) {
         var1 = -124;
      } else if(var0 == 8230) {
         var1 = -123;
      } else if(var0 == 8224) {
         var1 = -122;
      } else if(var0 == 8225) {
         var1 = -121;
      } else if(var0 == 710) {
         var1 = -120;
      } else if(var0 == 8240) {
         var1 = -119;
      } else if(var0 == 352) {
         var1 = -118;
      } else if(var0 == 8249) {
         var1 = -117;
      } else if(var0 == 338) {
         var1 = -116;
      } else if(var0 == 381) {
         var1 = -114;
      } else if(var0 == 8216) {
         var1 = -111;
      } else if(var0 == 8217) {
         var1 = -110;
      } else if(var0 == 8220) {
         var1 = -109;
      } else if(var0 == 8221) {
         var1 = -108;
      } else if(var0 == 8226) {
         var1 = -107;
      } else if(var0 == 8211) {
         var1 = -106;
      } else if(var0 == 8212) {
         var1 = -105;
      } else if(var0 == 732) {
         var1 = -104;
      } else if(var0 == 8482) {
         var1 = -103;
      } else if(var0 == 353) {
         var1 = -102;
      } else if(var0 == 8250) {
         var1 = -101;
      } else if(var0 == 339) {
         var1 = -100;
      } else if(var0 == 382) {
         var1 = -98;
      } else if(var0 == 376) {
         var1 = -97;
      } else {
         var1 = 63;
      }

      return var1;
   }

   @ObfuscatedName("jv")
   @ObfuscatedSignature(
      signature = "(Lia;I)Lia;",
      garbageValue = "383372328"
   )
   static ComponentType method5913(ComponentType var0) {
      ComponentType var2 = var0;
      int var4 = WorldComparator.method86(var0);
      int var3 = var4 >> 17 & 7;
      int var5 = var3;
      ComponentType var1;
      if(var3 == 0) {
         var1 = null;
      } else {
         int var6 = 0;

         while(true) {
            if(var6 >= var5) {
               var1 = var2;
               break;
            }

            var2 = ChatHistory.method6246(var2.layer);
            if(var2 == null) {
               var1 = null;
               break;
            }

            ++var6;
         }
      }

      ComponentType var7 = var1;
      if(var1 == null) {
         var7 = var0.dragParent;
      }

      return var7;
   }

   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "(CB)C",
      garbageValue = "-39"
   )
   public static char method5917(char var0) {
      switch(var0) {
      case ' ':
      case '-':
      case '_':
      case ' ':
         return '_';
      case '#':
      case '[':
      case ']':
         return var0;
      case 'À':
      case 'Á':
      case 'Â':
      case 'Ã':
      case 'Ä':
      case 'à':
      case 'á':
      case 'â':
      case 'ã':
      case 'ä':
         return 'a';
      case 'Ç':
      case 'ç':
         return 'c';
      case 'È':
      case 'É':
      case 'Ê':
      case 'Ë':
      case 'è':
      case 'é':
      case 'ê':
      case 'ë':
         return 'e';
      case 'Í':
      case 'Î':
      case 'Ï':
      case 'í':
      case 'î':
      case 'ï':
         return 'i';
      case 'Ñ':
      case 'ñ':
         return 'n';
      case 'Ò':
      case 'Ó':
      case 'Ô':
      case 'Õ':
      case 'Ö':
      case 'ò':
      case 'ó':
      case 'ô':
      case 'õ':
      case 'ö':
         return 'o';
      case 'Ù':
      case 'Ú':
      case 'Û':
      case 'Ü':
      case 'ù':
      case 'ú':
      case 'û':
      case 'ü':
         return 'u';
      case 'ß':
         return 'b';
      case 'ÿ':
      case 'Ÿ':
         return 'y';
      default:
         return Character.toLowerCase(var0);
      }
   }
}
