package net.runelite.standalone;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.api.RSFrames;
import net.runelite.rs.api.RSModel;
import net.runelite.rs.api.RSSequence;

@ObfuscatedName("ju")
public class Sequence extends CacheableNode implements RSSequence {
    @ObfuscatedName("x")
    @ObfuscatedSignature(
            signature = "Lgp;"
    )
    public static NodeCache sequences;
    @ObfuscatedName("a")
    @ObfuscatedSignature(
            signature = "Liz;"
    )
    public static Js5Index seq_ref;
    @ObfuscatedName("dp")
    @ObfuscatedSignature(
            signature = "Lin;"
    )
    static Js5 field3630;
    @ObfuscatedName("s")
    @ObfuscatedSignature(
            signature = "Liz;"
    )
    public static Js5Index skel_ref;
    @ObfuscatedName("h")
    @ObfuscatedSignature(
            signature = "Lgp;"
    )
    public static NodeCache skeletons;
    @ObfuscatedName("f")
    public int[] frameIDs;
    @ObfuscatedName("l")
    @ObfuscatedGetter(
            intValue = -1031284921
    )
    public int rightHandItem;
    @ObfuscatedName("e")
    public boolean stretches;
    @ObfuscatedName("r")
    @ObfuscatedGetter(
            intValue = 865867889
    )
    public int forcedPriority;
    @ObfuscatedName("k")
    @ObfuscatedGetter(
            intValue = -649153047
    )
    public int replyMode;
    @ObfuscatedName("q")
    public int[] field3628;
    @ObfuscatedName("m")
    public int[] frameLengths;
    @ObfuscatedName("p")
    int[] field3620;
    @ObfuscatedName("b")
    @ObfuscatedGetter(
            intValue = -1011490325
    )
    public int frameStep;
    @ObfuscatedName("o")
    @ObfuscatedGetter(
            intValue = 506000659
    )
    public int maxLoops;
    @ObfuscatedName("n")
    int[] interleaveLeave;
    @ObfuscatedName("t")
    @ObfuscatedGetter(
            intValue = 1499671381
    )
    public int leftHandItem;
    @ObfuscatedName("y")
    @ObfuscatedGetter(
            intValue = 855576215
    )
    public int priority;
    @ObfuscatedName("u")
    @ObfuscatedGetter(
            intValue = 1825570597
    )
    public int precedenceAnimating;

    static {
        sequences = new NodeCache(64);
        skeletons = new NodeCache(100);
    }

    Sequence() {
        this.frameStep = -1;
        this.stretches = false;
        this.forcedPriority = 5;
        this.leftHandItem = -1;
        this.rightHandItem = -1;
        this.maxLoops = 99;
        this.precedenceAnimating = -1;
        this.priority = -1;
        this.replyMode = 2;
        this.rl$$init();
    }

    @ObfuscatedName("f")
    @ObfuscatedSignature(
            signature = "(Ldv;III)Ldv;"
    )
    Model method5010(Model var1, int var2, int var3, int var4) {
        if (var2 < 0) {
            int var5 = var2 ^ Integer.MIN_VALUE;
            int var6 = var5 >> 16;
            var2 = var5 & 65535;
            int var7 = var2 + 1;
            if (var7 >= this.getFrameIDs().length) {
                var7 = -1;
            }

            int[] var8 = this.getFrameIDs();
            int var9 = var8[var2];
            RSFrames var10 = ItemContainer.clientInstance.getFrames(var9 >> 16);
            int var11 = var9 & 65535;
            int var12 = -1;
            RSFrames var13 = null;
            if (var7 != -1) {
                int var14 = var8[var7];
                var13 = ItemContainer.clientInstance.getFrames(var14 >> 16);
                var12 = var14 & 65535;
            }

            if (var10 == null) {
                return (Model) var1.toSharedModel(true);
            } else {
                RSModel var15 = var1.toSharedModel(!var10.getFrames()[var11].isShowing());
                var3 &= 3;
                if (var3 == 1) {
                    var15.rotateY270Ccw();
                } else if (var3 == 2) {
                    var15.rotateY180Ccw();
                } else if (var3 == 3) {
                    var15.rotateY90Ccw();
                }

                var15.interpolateFrames(var10, var11, var13, var12, var6, this.getFrameLenths()[var2]);
                if (var3 == 1) {
                    var15.rotateY90Ccw();
                } else if (var3 == 2) {
                    var15.rotateY180Ccw();
                } else if (var3 == 3) {
                    var15.rotateY270Ccw();
                }

                return (Model) var15;
            }
        } else {
            return (Model) this.copy$transformObjectModel(var1, var2, var3, var4);
        }
    }

    @ObfuscatedName("q")
    @ObfuscatedSignature(
            signature = "(Ldv;II)Ldv;",
            garbageValue = "1849430362"
    )
    public Model method5013(Model var1, int var2) {
        int var3 = this.frameIDs[var2];
        Frames var4 = WallObject.method1971(var3 >> 16);
        var3 &= 65535;
        if (var4 == null) {
            return var1.method3828(true);
        } else {
            Frames var5 = null;
            int var6 = 0;
            if (this.field3620 != null && var2 < this.field3620.length) {
                var6 = this.field3620[var2];
                var5 = WallObject.method1971(var6 >> 16);
                var6 &= 65535;
            }

            Model var7;
            if (var5 != null && var6 != 65535) {
                var7 = var1.method3828(!var4.method6060(var3) & !var5.method6060(var6));
                var7.method3835(var4, var3);
                var7.method3835(var5, var6);
                return var7;
            } else {
                var7 = var1.method3828(!var4.method6060(var3));
                var7.method3835(var4, var3);
                return var7;
            }
        }
    }

    @ObfuscatedName("x")
    @ObfuscatedSignature(
            signature = "(B)V",
            garbageValue = "-26"
    )
    void method5032() {
        if (this.precedenceAnimating == -1) {
            if (this.interleaveLeave != null) {
                this.precedenceAnimating = 2;
            } else {
                this.precedenceAnimating = 0;
            }
        }

        if (this.priority == -1) {
            if (this.interleaveLeave != null) {
                this.priority = 2;
            } else {
                this.priority = 0;
            }
        }

    }

    @ObfuscatedName("m")
    @ObfuscatedSignature(
            signature = "(Ldv;ILju;II)Ldv;"
    )
    public Model method5025(Model var1, int var2, Sequence var3, int var4, int var5) {
        int var6;
        if (var2 < 0) {
            var6 = var2 ^ Integer.MIN_VALUE;
            var2 = var6 & 65535;
        }

        if (var4 < 0) {
            var6 = var4 ^ Integer.MIN_VALUE;
            var4 = var6 & 65535;
        }

        return (Model) this.copy$applyTransformations(var1, var2, var3, var4, var5);
    }

    @ObfuscatedName("p")
    @ObfuscatedSignature(
            signature = "(Ldv;II)Ldv;"
    )
    Model method5011(Model var1, int var2, int var3) {
        if (var2 < 0) {
            int var4 = var2 ^ Integer.MIN_VALUE;
            int var5 = var4 >> 16;
            var2 = var4 & 65535;
            int var6 = var2 + 1;
            if (var6 >= this.getFrameIDs().length) {
                var6 = -1;
            }

            int[] var7 = this.getFrameIDs();
            int var8 = var7[var2];
            RSFrames var9 = ItemContainer.clientInstance.getFrames(var8 >> 16);
            int var10 = var8 & 65535;
            int var11 = -1;
            RSFrames var12 = null;
            if (var6 != -1) {
                int var13 = var7[var6];
                var12 = ItemContainer.clientInstance.getFrames(var13 >> 16);
                var11 = var13 & 65535;
            }

            if (var9 == null) {
                return (Model) var1.toSharedSpotAnimModel(true);
            } else {
                RSModel var14 = var1.toSharedSpotAnimModel(!var9.getFrames()[var10].isShowing());
                var14.interpolateFrames(var9, var10, var12, var11, var5, this.getFrameLenths()[var2]);
                return (Model) var14;
            }
        } else {
            return (Model) this.copy$transformSpotAnimModel(var1, var2, var3);
        }
    }

    @ObfuscatedSignature(
            signature = "(Ldv;III)Ldv;"
    )
    public Model copy$transformObjectModel(Model var1, int var2, int var3, int var4) {
        var2 = this.frameIDs[var2];
        Frames var5 = WallObject.method1971(var2 >> 16);
        var2 &= 65535;
        if (var5 == null) {
            return var1.method3828(true);
        } else {
            Model var6 = var1.method3828(!var5.method6060(var2));
            var3 &= 3;
            if (var3 == 1) {
                var6.method3830();
            } else if (var3 == 2) {
                var6.method3839();
            } else if (var3 == 3) {
                var6.method3842();
            }

            var6.method3835(var5, var2);
            if (var3 == 1) {
                var6.method3842();
            } else if (var3 == 2) {
                var6.method3839();
            } else if (var3 == 3) {
                var6.method3830();
            }

            return var6;
        }
    }

    @ObfuscatedSignature(
            signature = "(Ldv;II)Ldv;"
    )
    public Model copy$transformSpotAnimModel(Model var1, int var2, int var3) {
        var2 = this.frameIDs[var2];
        Frames var4 = WallObject.method1971(var2 >> 16);
        var2 &= 65535;
        if (var4 == null) {
            return var1.method3829(true);
        } else {
            Model var5 = var1.method3829(!var4.method6060(var2));
            var5.method3835(var4, var2);
            return var5;
        }
    }

    @ObfuscatedSignature(
            signature = "(Ldv;II)Ldv;"
    )
    public Model copy$transformActorModel(Model var1, int var2, int var3) {
        var2 = this.frameIDs[var2];
        Frames var4 = WallObject.method1971(var2 >> 16);
        var2 &= 65535;
        if (var4 == null) {
            return var1.method3828(true);
        } else {
            Model var5 = var1.method3828(!var4.method6060(var2));
            var5.method3835(var4, var2);
            return var5;
        }
    }

    @ObfuscatedSignature(
            signature = "(Ldv;ILju;II)Ldv;"
    )
    public Model copy$applyTransformations(Model var1, int var2, Sequence var3, int var4, int var5) {
        var2 = this.frameIDs[var2];
        Frames var6 = WallObject.method1971(var2 >> 16);
        var2 &= 65535;
        if (var6 == null) {
            return var3.method5009(var1, var4, -1682213593);
        } else {
            var4 = var3.frameIDs[var4];
            Frames var7 = WallObject.method1971(var4 >> 16);
            var4 &= 65535;
            Model var8;
            if (var7 == null) {
                var8 = var1.method3828(!var6.method6060(var2));
                var8.method3835(var6, var2);
                return var8;
            } else {
                var8 = var1.method3828(!var6.method6060(var2) & !var7.method6060(var4));
                var8.method3832(var6, var2, var7, var4, this.interleaveLeave);
                return var8;
            }
        }
    }

    public int[] getFrameIDs() {
        return this.frameIDs;
    }

    private void rl$$init() {
    }

    public int[] getFrameLenths() {
        return this.frameLengths;
    }

    public int[] getInterleaveLeave() {
        return this.interleaveLeave;
    }

    public boolean getStretches() {
        return this.stretches;
    }

    public int getMaxLoops() {
        return this.maxLoops;
    }

    public int getPrecedenceAnimating() {
        return this.precedenceAnimating;
    }

    public int getReplyMode() {
        return this.replyMode;
    }

    @ObfuscatedName("s")
    @ObfuscatedSignature(
            signature = "(Lgx;I)V",
            garbageValue = "-1352953985"
    )
    void method5006(Packet var1) {
        while (true) {
            int var2 = var1.readUnsignedByte();
            if (var2 == 0) {
                return;
            }

            this.method5020(var1, var2);
        }
    }

    @ObfuscatedName("h")
    @ObfuscatedSignature(
            signature = "(Ldv;II)Ldv;"
    )
    public Model method5009(Model var1, int var2, int var3) {
        if (var2 < 0) {
            int var4 = var2 ^ Integer.MIN_VALUE;
            int var5 = var4 >> 16;
            var2 = var4 & 65535;
            int var6 = var2 + 1;
            if (var6 >= this.getFrameIDs().length) {
                var6 = -1;
            }

            int[] var7 = this.getFrameIDs();
            int var8 = var7[var2];
            RSFrames var9 = ItemContainer.clientInstance.getFrames(var8 >> 16);
            int var10 = var8 & 65535;
            int var11 = -1;
            RSFrames var12 = null;
            if (var6 != -1) {
                int var13 = var7[var6];
                var12 = ItemContainer.clientInstance.getFrames(var13 >> 16);
                var11 = var13 & 65535;
            }

            if (var9 == null) {
                return (Model) var1.toSharedModel(true);
            } else {
                RSModel var14 = var1.toSharedModel(!var9.getFrames()[var10].isShowing());
                var14.interpolateFrames(var9, var10, var12, var11, var5, this.getFrameLenths()[var2]);
                return (Model) var14;
            }
        } else {
            return (Model) this.copy$transformActorModel(var1, var2, var3);
        }
    }

    @ObfuscatedName("g")
    @ObfuscatedSignature(
            signature = "(Lgx;II)V",
            garbageValue = "-1759684821"
    )
    void method5020(Packet var1, int var2) {
        int var3;
        int var4;
        if (var2 == 1) {
            var3 = var1.readUnsignedShort();
            this.frameLengths = new int[var3];

            for (var4 = 0; var4 < var3; ++var4) {
                this.frameLengths[var4] = var1.readUnsignedShort();
            }

            this.frameIDs = new int[var3];

            for (var4 = 0; var4 < var3; ++var4) {
                this.frameIDs[var4] = var1.readUnsignedShort();
            }

            for (var4 = 0; var4 < var3; ++var4) {
                this.frameIDs[var4] += var1.readUnsignedShort() << 16;
            }
        } else if (var2 == 2) {
            this.frameStep = var1.readUnsignedShort();
        } else if (var2 == 3) {
            var3 = var1.readUnsignedByte();
            this.interleaveLeave = new int[var3 + 1];

            for (var4 = 0; var4 < var3; ++var4) {
                this.interleaveLeave[var4] = var1.readUnsignedByte();
            }

            this.interleaveLeave[var3] = 9999999;
        } else if (var2 == 4) {
            this.stretches = true;
        } else if (var2 == 5) {
            this.forcedPriority = var1.readUnsignedByte();
        } else if (var2 == 6) {
            this.leftHandItem = var1.readUnsignedShort();
        } else if (var2 == 7) {
            this.rightHandItem = var1.readUnsignedShort();
        } else if (var2 == 8) {
            this.maxLoops = var1.readUnsignedByte();
        } else if (var2 == 9) {
            this.precedenceAnimating = var1.readUnsignedByte();
        } else if (var2 == 10) {
            this.priority = var1.readUnsignedByte();
        } else if (var2 == 11) {
            this.replyMode = var1.readUnsignedByte();
        } else if (var2 == 12) {
            var3 = var1.readUnsignedByte();
            this.field3620 = new int[var3];

            for (var4 = 0; var4 < var3; ++var4) {
                this.field3620[var4] = var1.readUnsignedShort();
            }

            for (var4 = 0; var4 < var3; ++var4) {
                this.field3620[var4] += var1.readUnsignedShort() << 16;
            }
        } else if (var2 == 13) {
            var3 = var1.readUnsignedByte();
            this.field3628 = new int[var3];

            for (var4 = 0; var4 < var3; ++var4) {
                this.field3628[var4] = var1.method5090();
            }
        }

    }

    @ObfuscatedName("p")
    @ObfuscatedSignature(
            signature = "(Lge;ILbw;II)V",
            garbageValue = "231852454"
    )
    static final void method5035(Bit var0, int var1, PlayerEntity var2, int var3) {
        byte var4 = -1;
        int var5;
        int var6;
        int var8;
        int var9;
        int var12;
        if ((var3 & 64) != 0) {
            var5 = var0.method5115();
            int var7;
            int var10;
            int var11;
            if (var5 > 0) {
                for (var6 = 0; var6 < var5; ++var6) {
                    var8 = -1;
                    var9 = -1;
                    var10 = -1;
                    var7 = var0.method5269();
                    if (var7 == 32767) {
                        var7 = var0.method5269();
                        var9 = var0.method5269();
                        var8 = var0.method5269();
                        var10 = var0.method5269();
                    } else if (var7 != 32766) {
                        var9 = var0.method5269();
                    } else {
                        var7 = -1;
                    }

                    var11 = var0.method5269();
                    var2.method2452(var7, var9, var8, var10, client.gameCycle, var11);
                }
            }

            var6 = var0.readUnsignedByteC();
            if (var6 > 0) {
                for (var7 = 0; var7 < var6; ++var7) {
                    var8 = var0.method5269();
                    var9 = var0.method5269();
                    if (var9 != 32767) {
                        var10 = var0.method5269();
                        var11 = var0.method5115();
                        var12 = var9 > 0 ? var0.readUnsignedByte() : var11;
                        var2.method2456(var8, client.gameCycle, var9, var10, var11, var12);
                    } else {
                        var2.method2457(var8);
                    }
                }
            }
        }

        if ((var3 & 512) != 0) {
            var2.graphic = var0.method5281();
            var2.graphicChanged(-1);
            var5 = var0.method5133();
            var2.field992 = var5 >> 16;
            var2.graphicsDelay = (var5 & 65535) + client.gameCycle;
            var2.spotAnimFrame = 0;
            var2.spotAnimFrameCycle = 0;
            if (var2.graphicsDelay > client.gameCycle) {
                var2.spotAnimFrame = -1;
            }

            if (var2.graphic == 65535) {
                var2.graphic = -1;
                var2.graphicChanged(-1);
            }
        }

        if ((var3 & 4096) != 0) {
            var4 = var0.method5118();
        }

        if ((var3 & 1024) != 0) {
            var2.field981 = var0.method5120();
            var2.field983 = var0.method5118();
            var2.field943 = var0.method5118();
            var2.field984 = var0.method5120();
            var2.field985 = var0.readUnsignedShort128() + client.gameCycle;
            var2.field986 = var0.method5309() + client.gameCycle;
            var2.field987 = var0.readUnsignedShort();
            if (var2.field635) {
                var2.field981 += var2.xInScene;
                var2.field983 += var2.yInScene;
                var2.field943 += var2.xInScene;
                var2.field984 += var2.yInScene;
                var2.queueSize = 0;
            } else {
                var2.field981 += var2.pathX[0];
                var2.field983 += var2.pathY[0];
                var2.field943 += var2.pathX[0];
                var2.field984 += var2.pathY[0];
                var2.queueSize = 1;
            }

            var2.field950 = 0;
        }

        if ((var3 & 32) != 0) {
            var2.overhead = var0.readString();
            var2.overheadTextChanged(-1);
            if (var2.overhead.charAt(0) == '~') {
                var2.overhead = var2.overhead.substring(1);
                var2.overheadTextChanged(-1);
                KeyFocusListener.method5934(2, var2.name.method1530(), var2.overhead);
            } else if (var2 == class71.localPlayer) {
                KeyFocusListener.method5934(2, var2.name.method1530(), var2.overhead);
            }

            var2.field953 = false;
            var2.field956 = 0;
            var2.field957 = 0;
            var2.overheadTextCyclesRemaining = 150;
        }

        if ((var3 & 4) != 0) {
            var2.facingCoord = var0.method5309();
            if (var2.queueSize == 0) {
                var2.orientation = var2.facingCoord;
                var2.facingCoord = -1;
            }
        }

        if ((var3 & 1) != 0) {
            var5 = var0.method5117();
            byte[] var13 = new byte[var5];
            Packet var14 = new Packet(var13);
            var0.method5135(var13, 0, var5);
            PlayerList.appearances[var1] = var14;
            var2.method6004(var14);
        }

        if ((var3 & 2) != 0) {
            var2.interacting = var0.readUnsignedShort128();
            var2.interactingChanged(-1);
            if (var2.interacting == 65535) {
                var2.interacting = -1;
                var2.interactingChanged(-1);
            }
        }

        if ((var3 & 2048) != 0) {
            PlayerList.moveSpeeds[var1] = var0.method5118();
        }

        if ((var3 & 16) != 0) {
            var5 = var0.readUnsignedShort128();
            int compressed = var0.readUnsignedShort();
            int primary = (compressed) & 0x1F;
            int secondary = (compressed >> 5) & 0x1F;
            int tertiary = ((compressed >> 10) & 0x1F);
            ChatCrownType staffRank = (ChatCrownType) PlayerList.method4757(class248.method4669(), primary);
            boolean var17 = var0.readUnsignedByteC() == 1;
            var8 = var0.readUnsignedByte();
            var9 = var0.offset;
            if (var2.name != null && var2.composition != null) {
                boolean var18 = false;
                if (staffRank.ignorable && class258.friendManager.method2348(var2.name)) {
                    var18 = true;
                }

                if (!var18 && client.field763 == 0 && !var2.hidden) {
                    PlayerList.messageBuffer.offset = 0;
                    var0.method5098(PlayerList.messageBuffer.payload, 0, var8);
                    PlayerList.messageBuffer.offset = 0;
                    String var15 = FontTypeFace.method6234(MapElementType.method1507(ModeWhere.method1463(PlayerList.messageBuffer)));
                    var2.overhead = var15.trim();
                    var2.overheadTextChanged(-1);
                    var2.field956 = var5 >> 8;
                    var2.field957 = var5 & 255;
                    var2.overheadTextCyclesRemaining = 150;
                    var2.field953 = var17;
                    var2.overheadFiltered = var2 != class71.localPlayer && staffRank.ignorable && "" != client.field789 && var15.toLowerCase().indexOf(client.field789) == -1;
                    if (staffRank.staff) {
                        var12 = var17 ? 91 : 1;
                    } else {
                        var12 = var17 ? 90 : 2;
                    }
                    KeyFocusListener.method5934(var12, (staffRank.icon == -1 ? "" : class181.getModIcon(staffRank.icon)) + class181.getModIcon(secondary) + class181.getModIcon(tertiary) + var2.name.method1530(), var15);
               /*if(var19.icon * 1132360445 != -1) {
                  KeyFocusListener.method5934(var12, class181.getModIcon(var19.icon * 1132360445) + var2.name.method1530(), var15);
               } else {
                  KeyFocusListener.method5934(var12, var2.name.method1530(), var15);
               }*/
                }
            }

            var0.offset = var9 + var8;
        }

        if ((var3 & 256) != 0) {
            for (var5 = 0; var5 < 3; ++var5) {
                var2.tagFragments[var5] = var0.readString();
            }
        }

        if ((var3 & 128) != 0) {
            var5 = var0.readUnsignedShort();
            if (var5 == 65535) {
                var5 = -1;
            }

            var6 = var0.readUnsignedByte();
            class135.method1989(var2, var5, var6);
        }

        if (var2.field635) {
            if (var4 == 127) {
                var2.method6011(var2.xInScene, var2.yInScene);
            } else {
                byte var16;
                if (var4 != -1) {
                    var16 = var4;
                } else {
                    var16 = PlayerList.moveSpeeds[var1];
                }

                var2.method6010(var2.xInScene, var2.yInScene, var16);
            }
        }

    }

    @ObfuscatedName("a")
    @ObfuscatedSignature(
            signature = "(Liz;I)V",
            garbageValue = "-1705657688"
    )
    public static void method5008(Js5Index var0) {
        WorldComparator.varplayer_ref = var0;
        SoundTask.field1418 = WorldComparator.varplayer_ref.method4112(16);
    }
}
