package net.runelite.client.plugins.chaticons;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;

/**
 * @author Tommeh | 5-4-2019 | 18:06
 * @see <a href="https://www.rune-server.ee/members/tommeh/">Rune-Server profile</a>}
 */
@ConfigGroup("chaticons")
public interface ChatIconsConfig extends Config {

    @ConfigItem(
            position = 0,
            keyName = "hideMemberIcons",
            name = "Hide member icons",
            description = "Hides member icons on chat messages"
    )
    default boolean hideMemberIcons()
    {
        return false;
    }

    @ConfigItem(
            position = 1,
            keyName = "displayAllIcons",
            name = "Display all 3 icons (staff, ironman, member)",
            description = "Display the staff, ironman and member icons when possible"
    )
    default boolean displayAllIcons()
    {
        return true;
    }

}
