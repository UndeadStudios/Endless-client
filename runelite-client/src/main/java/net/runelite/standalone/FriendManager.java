package net.runelite.standalone;

import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import java.util.Iterator;
import net.runelite.api.events.RemovedFriend;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.api.RSFriendContainer;
import net.runelite.rs.api.RSFriendManager;
import net.runelite.rs.api.RSIgnoreContainer;
import net.runelite.rs.api.RSName;

@ObfuscatedName("bc")
public class FriendManager implements RSFriendManager {
   @ObfuscatedName("bc")
   @ObfuscatedSignature(
      signature = "[Llv;"
   )
   static IndexedSprite[] slArrowSprites;
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "Lku;"
   )
   public final class268 ignoreContainer;
   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "Lll;"
   )
   final JagexLoginType jagexLoginType;
   @ObfuscatedName("p")
   @ObfuscatedGetter(
      intValue = -2083063705
   )
   int state;
   @ObfuscatedName("h")
   @ObfuscatedSignature(
      signature = "Lkr;"
   )
   public final FriendContainer friendContainer;

   @ObfuscatedSignature(
      signature = "(Lll;)V"
   )
   FriendManager(JagexLoginType var1) {
      this.state = 0;
      this.jagexLoginType = var1;
      this.friendContainer = new FriendContainer(var1);
      this.ignoreContainer = new class268(var1);
      this.rl$$init();
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(Lkx;ZB)Z",
      garbageValue = "1"
   )
   final boolean method2347(Name var1, boolean var2) {
      return var1 == null?false:(var1.equals(class71.localPlayer.name)?true:this.friendContainer.method6451(var1, var2));
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(B)Z",
      garbageValue = "2"
   )
   final boolean method2341() {
      return this.friendContainer.method5323() || this.friendContainer.method5322() >= 200 && client.field767 != 1;
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "-1669991055"
   )
   final boolean method2351() {
      return this.ignoreContainer.method5323() || this.ignoreContainer.method5322() >= 100 && client.field767 != 1;
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "1534107328"
   )
   final void method2345() {
      for(class253 var1 = (class253)this.friendContainer.field3725.method4233(); var1 != null; var1 = (class253)this.friendContainer.field3725.method4229()) {
         if((long)var1.field3743 < class318.method6317() / 1000L - 5L) {
            if(var1.field3742 > 0) {
               KeyFocusListener.method5934(5, "", var1.field3741 + " has logged in.");
            }

            if(var1.field3742 == 0) {
               KeyFocusListener.method5934(5, "", var1.field3741 + " has logged out.");
            }

            var1.method466();
         }
      }

   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;B)V",
      garbageValue = "93"
   )
   final void method2349(String var1) {
      if(var1 != null) {
         Name var2 = new Name(var1, this.jagexLoginType);
         if(var2.method1532()) {
            if(this.method2341()) {
               class15.method312();
            } else if(class71.localPlayer.name.equals(var2)) {
               class53.method865();
            } else if(this.method2347(var2, false)) {
               OwnWorldComparator.method74(var1);
            } else if(this.method2348(var2)) {
               WorldMapRectangle.method3817(var1);
            } else {
               ClientOptions.method1090(var1);
            }
         }
      }
   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "(Lkx;I)Z",
      garbageValue = "731848361"
   )
   final boolean method2348(Name var1) {
      return var1 == null?false:this.ignoreContainer.method5333(var1);
   }

   @ObfuscatedName("o")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;I)V",
      garbageValue = "-1807263636"
   )
   final void method2385(String var1) {
      if(var1 != null) {
         Name var2 = new Name(var1, this.jagexLoginType);
         if(var2.method1532()) {
            if(this.method2351()) {
               class71.method1014();
            } else if(class71.localPlayer.name.equals(var2)) {
               FileRequest.method1172();
            } else if(this.method2348(var2)) {
               class54.method868(var1 + " is already on your ignore list");
            } else if(this.method2347(var2, false)) {
               class181.method3044(var1);
            } else {
               TcpConnectionMessage var3 = class232.method4535(ClientProt.field2309, client.serverConnection.isaac);
               var3.packetBuffer.writeByte(OwnWorldComparator.method73(var1));
               var3.packetBuffer.writeString(var1);
               client.serverConnection.method18(var3);
            }
         }
      }
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "-2049301771"
   )
   boolean method2342() {
      return this.state == 2;
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;I)V",
      garbageValue = "-1932196719"
   )
   final void method2375(String var1) {
      this.rl$removeFriend(var1);
      if(var1 != null) {
         Name var2 = new Name(var1, this.jagexLoginType);
         if(var2.method1532()) {
            if(this.friendContainer.method5328(var2)) {
               WorldMapType2.method3089();
               TcpConnectionMessage var3 = class232.method4535(ClientProt.field2273, client.serverConnection.isaac);
               var3.packetBuffer.writeByte(OwnWorldComparator.method73(var1));
               var3.packetBuffer.writeString(var1);
               client.serverConnection.method18(var3);
            }

            for(int var5 = 0; var5 < PlayerList.highResolutionPlayerCount; ++var5) {
               PlayerEntity var4 = client.players[PlayerList.highResolutionPlayerIndexes[var5]];
               var4.method6023();
            }

            Iterator var6 = ChatHistory.messages.iterator();

            while(var6.hasNext()) {
               ChatLine var7 = (ChatLine)var6.next();
               var7.method5889();
            }

            if(MapIconReference.clanMemberManager != null) {
               MapIconReference.clanMemberManager.method2438();
            }

         }
      }
   }

   @ObfuscatedName("ah")
   @ObfuscatedSignature(
      signature = "(Lkx;B)Z",
      garbageValue = "0"
   )
   final boolean method2355(Name var1) {
      Friend var2 = (Friend)this.friendContainer.method5325(var1);
      return var2 != null && var2.method2031();
   }

   public void rl$removeFriend(String var1) {
      RemovedFriend var2 = new RemovedFriend(var1);
      ItemContainer.clientInstance.getCallbacks().post(var2);
   }

   private void rl$$init() {
   }

   public RSFriendContainer getFriendContainer() {
      return this.friendContainer;
   }

   public RSIgnoreContainer getIgnoreContainer() {
      return this.ignoreContainer;
   }

   public boolean isFriended(RSName var1, boolean var2) {
      return this.method2347((Name)var1, var2);
   }

   @ObfuscatedName("aa")
   @ObfuscatedSignature(
      signature = "(Ljava/lang/String;S)V",
      garbageValue = "19201"
   )
   final void method2353(String var1) {
      if(var1 != null) {
         Name var2 = new Name(var1, this.jagexLoginType);
         if(var2.method1532()) {
            if(this.ignoreContainer.method5328(var2)) {
               WorldMapType2.method3089();
               TcpConnectionMessage var3 = class232.method4535(ClientProt.field2247, client.serverConnection.isaac);
               var3.packetBuffer.writeByte(OwnWorldComparator.method73(var1));
               var3.packetBuffer.writeString(var1);
               client.serverConnection.method18(var3);
            }

            class333.method6434();
         }
      }
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "31"
   )
   final void method2343() {
      this.state = 1;
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "0"
   )
   final void method2389() {
      this.state = 0;
      this.friendContainer.method5390();
      this.ignoreContainer.method5390();
   }

   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "(Lgx;IB)V",
      garbageValue = "-21"
   )
   final void method2344(Packet var1, int var2) {
      this.friendContainer.method6440(var1, var2);
      this.state = 2;

      for(int var3 = 0; var3 < PlayerList.highResolutionPlayerCount; ++var3) {
         PlayerEntity var4 = client.players[PlayerList.highResolutionPlayerIndexes[var3]];
         var4.method6023();
      }

      Iterator var5 = ChatHistory.messages.iterator();

      while(var5.hasNext()) {
         ChatLine var6 = (ChatLine)var5.next();
         var6.method5889();
      }

      if(MapIconReference.clanMemberManager != null) {
         MapIconReference.clanMemberManager.method2438();
      }

   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "(I)J",
      garbageValue = "-983189615"
   )
   static long method2415() {
      try {
         URL var0 = new URL(WorldComparator.method84("services", false) + "m=accountappeal/login.ws");
         URLConnection var1 = var0.openConnection();
         var1.setRequestProperty("connection", "close");
         var1.setDoInput(true);
         var1.setDoOutput(true);
         var1.setConnectTimeout(5000);
         OutputStreamWriter var2 = new OutputStreamWriter(var1.getOutputStream());
         var2.write("data1=req");
         var2.flush();
         InputStream var3 = var1.getInputStream();
         Packet var4 = new Packet(new byte[1000]);

         do {
            int var5 = var3.read(var4.payload, var4.offset, 1000 - var4.offset);
            if(var5 == -1) {
               var4.offset = 0;
               long var7 = var4.method5299();
               return var7;
            }

            var4.offset += var5;
         } while(var4.offset < 1000);

         return 0L;
      } catch (Exception var9) {
         return 0L;
      }
   }

   @ObfuscatedName("im")
   @ObfuscatedSignature(
      signature = "(III)V",
      garbageValue = "37549498"
   )
   static void method2414(int var0, int var1) {
      int var2 = class191.fontBold12.method6160("Choose Option");

      int var3;
      int var4;
      for(var3 = 0; var3 < client.menuOptionCount; ++var3) {
         var4 = class191.fontBold12.method6160(MilliTimer.method1071(var3));
         if(var4 > var2) {
            var2 = var4;
         }
      }

      var2 += 8;
      var3 = client.menuOptionCount * 15 + 22;
      var4 = var0 - var2 / 2;
      if(var2 + var4 > GrandExchangeOffer.canvasWidth) {
         var4 = GrandExchangeOffer.canvasWidth - var2;
      }

      if(var4 < 0) {
         var4 = 0;
      }

      int var5 = var1;
      if(var3 + var1 > class258.canvasHeight) {
         var5 = class258.canvasHeight - var3;
      }

      if(var5 < 0) {
         var5 = 0;
      }

      class181.menuX = var4;
      TotalQuantityComparator.menuY = var5;
      class302.field3309 = var2;
      class288.field1949 = client.menuOptionCount * 15 + 22;
   }
}
