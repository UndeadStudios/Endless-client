package net.runelite.client.plugins.chaticons;

import com.google.inject.Provides;
import net.runelite.api.Client;
import net.runelite.api.events.ChatMessage;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;

import javax.inject.Inject;

/**
 * @author Tommeh | 5-4-2019 | 18:08
 * @see <a href="https://www.rune-server.ee/members/tommeh/">Rune-Server profile</a>}
 */
@PluginDescriptor(
        name = "Chat Icons",
        description = "Manages chat icon settings")
public class ChatIconsPlugin extends Plugin {

    @Inject
    private Client client;

    @Inject
    private ChatIconsConfig config;

    @Provides
    ChatIconsConfig provideConfig(ConfigManager configManager)
    {
        return configManager.getConfig(ChatIconsConfig.class);
    }

    @Subscribe
    public void onChatMessage(ChatMessage message) {
        String name = message.getName();
        if (name == null) {
            return;
        }
        if (config.hideMemberIcons() && name.contains("<member=")) {
            name = name.replaceAll("<member=([0-9]|10)>", "");
        }
        if (!config.displayAllIcons()) {
            name = name.replaceAll("<irm=([0-9]|10)>", "");
        }
        message.getMessageNode().setName(name);
        client.refreshChat();
    }
}
