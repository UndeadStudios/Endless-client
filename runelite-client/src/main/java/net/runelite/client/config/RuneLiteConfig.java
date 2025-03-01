/*
 * Copyright (c) 2017, Tyler <https://github.com/tylerthardy>
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this
 *    list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
 * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package net.runelite.client.config;

import java.awt.Dimension;
import net.runelite.api.Constants;


@ConfigGroup(RuneLiteConfig.GROUP_NAME)
public interface RuneLiteConfig extends Config
{

	String GROUP_NAME = "runelite";
    @ConfigItem(
		keyName = "gameSize",
			section = "",
		name = "Game size",
		description = "The game will resize to this resolution upon starting the client",
		position = 10
	)
	default Dimension gameSize()
	{
		return Constants.GAME_FIXED_SIZE;
	}

	@ConfigItem(
		keyName = "automaticResizeType",
			section = "",
		name = "Resize type",
		description = "Choose how the window should resize when opening and closing panels",
		position = 11
	)
	default ExpandResizeType automaticResizeType()
	{
		return ExpandResizeType.KEEP_GAME_SIZE;
	}

	@ConfigItem(
		keyName = "lockWindowSize",
			section = "",
		name = "Lock window size",
		description = "Determines if the window resizing is allowed or not",
		position = 12
	)
	default boolean lockWindowSize()
	{
		return false;
	}

	@ConfigItem(
		keyName = "containInScreen",
			section = "",
		name = "Contain in screen",
		description = "Makes the client stay contained in the screen when attempted to move out of it.<br>Note: Only works if custom chrome is enabled.",
		position = 13
	)
	default boolean containInScreen()
	{
		return false;
	}

	@ConfigItem(
		keyName = "rememberScreenBounds",
			section = "",
		name = "Remember client position",
		description = "Save the position and size of the client after exiting",
		position = 14
	)
	default boolean rememberScreenBounds()
	{
		return true;
	}

	@ConfigItem(
		keyName = "uiEnableCustomChrome",
			section = "",
		name = "Enable custom window chrome",
		description = "Use Runelite's custom window title and borders.",
		warning = "Please restart your client after changing this setting",
		position = 15
	)
	default boolean enableCustomChrome()
	{
		return true;
	}

	@ConfigItem(
		keyName = "gameAlwaysOnTop",
			section = "",
		name = "Enable client always on top",
		description = "The game will always be on the top of the screen",
		position = 16
	)
	default boolean gameAlwaysOnTop()
	{
		return false;
	}

	@ConfigItem(
		keyName = "warningOnExit",
			section = "",
		name = "Display warning on exit",
		description = "Toggles a warning popup when trying to exit the client",
		position = 17
	)
	default WarningOnExit warningOnExit()
	{
		return WarningOnExit.LOGGED_IN;
	}

	@ConfigItem(
		keyName = "usernameInTitle",
			section = "",
		name = "Show display name in title",
		description = "Toggles displaying of local player's display name in client title",
		position = 18
	)
	default boolean usernameInTitle()
	{
		return true;
	}

	@ConfigItem(
		keyName = "notificationTray",
			section = "",
		name = "Enable tray notifications",
		description = "Enables tray notifications",
		position = 20
	)
	default boolean enableTrayNotifications()
	{
		return true;
	}

	@ConfigItem(
		keyName = "notificationRequestFocus",
			section = "",
		name = "Request focus on notification",
		description = "Toggles window focus request",
		position = 21
	)
	default boolean requestFocusOnNotification()
	{
		return true;
	}

	@ConfigItem(
		keyName = "notificationSound",
			section = "",
		name = "Enable sound on notifications",
		description = "Enables the playing of a beep sound when notifications are displayed",
		position = 22
	)
	default boolean enableNotificationSound()
	{
		return true;
	}

	@ConfigItem(
		keyName = "notificationGameMessage",
			section = "",
		name = "Enable game message notifications",
		description = "Puts a notification message in the chatbox",
		position = 23
	)
	default boolean enableGameMessageNotification()
	{
		return false;
	}

	@ConfigItem(
		keyName = "notificationFlash",
			section = "",
		name = "Enable flash notification",
		description = "Flashes the game frame as a notification",
		position = 24
	)
	default boolean enableFlashNotification()
	{
		return false;
	}

	@ConfigItem(
		keyName = "notificationFocused",
			section = "",
		name = "Send notifications when focused",
		description = "Toggles all notifications for when the client is focused",
		position = 25
	)
	default boolean sendNotificationsWhenFocused()
	{
		return false;
	}

	@ConfigItem(
		keyName = "fontType",
			section = "",
		name = "Dynamic Overlay Font",
		description = "Configures what font type is used for in-game overlays such as player name, ground items, etc.",
		position = 30
	)
	default FontType fontType()
	{
		return FontType.SMALL;
	}

	@ConfigItem(
		keyName = "tooltipFontType",
			section = "",
		name = "Tooltip Font",
		description = "Configures what font type is used for in-game tooltips such as food stats, NPC names, etc.",
		position = 31
	)
	default FontType tooltipFontType()
	{
		return FontType.SMALL;
	}

	@ConfigItem(
		keyName = "interfaceFontType",
			section = "",
		name = "Interface Overlay Font",
		description = "Configures what font type is used for in-game interface overlays such as panels, opponent info, clue scrolls etc.",
		position = 32
	)
	default FontType interfaceFontType()
	{
		return FontType.REGULAR;
	}

	@ConfigItem(
		keyName = "menuEntryShift",
			section = "",
		name = "Require Shift for overlay menu",
		description = "Overlay right-click menu will require shift to be added",
		position = 33
	)
	default boolean menuEntryShift()
	{
		return true;
	}

	@ConfigItem(
		keyName = "infoBoxVertical",
			section = "",
		name = "Display infoboxes vertically",
		description = "Toggles the infoboxes to display vertically",
		position = 40
	)
	default boolean infoBoxVertical()
	{
		return false;
	}

	@ConfigItem(
		keyName = "infoBoxWrap",
			section = "",
		name = "Infobox wrap count",
		description = "Configures the amount of infoboxes shown before wrapping",
		position = 41
	)
	default int infoBoxWrap()
	{
		return 4;
	}

	@ConfigItem(
		keyName = "infoBoxSize",
			section = "",
		name = "Infobox size (px)",
		description = "Configures the size of each infobox in pixels",
		position = 42
	)
	default int infoBoxSize()
	{
		return 35;
	}
}