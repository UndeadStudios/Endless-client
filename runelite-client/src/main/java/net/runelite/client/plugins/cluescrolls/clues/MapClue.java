/*
 * Copyright (c) 2018, Lotto <https://github.com/devLotto>
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
package net.runelite.client.plugins.cluescrolls.clues;

import com.google.common.collect.ImmutableSet;
import lombok.Getter;
import net.runelite.api.ObjectComposition;
import net.runelite.api.TileObject;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.coords.WorldPoint;
import net.runelite.client.plugins.cluescrolls.ClueScrollPlugin;
import net.runelite.client.plugins.cluescrolls.clues.emote.ItemRequirement;
import net.runelite.client.plugins.cluescrolls.clues.emote.SingleItemRequirement;
import net.runelite.client.ui.overlay.OverlayUtil;
import net.runelite.client.ui.overlay.components.LineComponent;
import net.runelite.client.ui.overlay.components.PanelComponent;
import net.runelite.client.ui.overlay.components.TitleComponent;

import java.awt.*;
import java.util.Set;

import static net.runelite.api.ItemID.SPADE;
import static net.runelite.api.ItemID.*;
import static net.runelite.api.ObjectID.*;
import static net.runelite.client.plugins.cluescrolls.ClueScrollWorldOverlay.*;

@Getter
public class MapClue extends ClueScroll implements ObjectClueScroll
{
	private static final Set<MapClue> CLUES = ImmutableSet.of(
			new MapClue(87, new WorldPoint(3300, 3291, 0)),
			new MapClue(346, new WorldPoint(3166, 3361, 0)),
			new MapClue(347, new WorldPoint(3290, 3374, 0)),
			new MapClue(351, new WorldPoint(3043, 3398, 0)),
			new MapClue(354, new WorldPoint(2612, 3482, 0)),
			new MapClue(356, new WorldPoint(3110, 3152, 0)),
			new MapClue(337, new WorldPoint(2970, 3415, 0)),
			new MapClue(348, new WorldPoint(3091, 3227, 0)),
			new MapClue(352, new WorldPoint(2907, 3295, 0)),
			new MapClue(355, new WorldPoint(2658, 3488, 0), CRATE_357),
			new MapClue(360, new WorldPoint(2651, 3231, 0)),
			new MapClue(361, new WorldPoint(2565, 3248, 0), CRATE_354),
			new MapClue(362, new WorldPoint(2924, 3210, 0)),
			new MapClue(340, new WorldPoint(2536, 3865, 0)),
			new MapClue(341, new WorldPoint(3434, 3265, 0)),
			new MapClue(342, new WorldPoint(2454, 3230, 0)),
			new MapClue(343, new WorldPoint(2578, 3597, 0)),
			new MapClue(344, new WorldPoint(2666, 3562, 0)),
			new MapClue(350, new WorldPoint(3309, 3503, 0), CRATE_2620),
			new MapClue(CLUE_SCROLL_HARD_2729, new WorldPoint(3190, 3963, 0)),//TODO: Missing interface?
			new MapClue(353, new WorldPoint(2615, 3078, 0)),
			new MapClue(357, new WorldPoint(2488, 3308, 0)),
			new MapClue(358, new WorldPoint(2457, 3182, 0), CRATE_18506),
			new MapClue(359, new WorldPoint(3026, 3628, 0), CRATE_354),
			new MapClue(338, new WorldPoint(3021, 3912, 0)),
			new MapClue(339, new WorldPoint(2722, 3338, 0)),
			new MapClue(86, new WorldPoint(2449, 3130, 0)),
			new MapClue(314, new WorldPoint(2953, 9523, 1), "In the Mogre Camp, near Port Khazard. You require a Diving Apparatus and a Fishbowl Helmet"),
			new MapClue(317, new WorldPoint(2202, 3062, 0)),
			new MapClue(318, new WorldPoint(1815, 3852, 0)),
			new MapClue(316, new WorldPoint(3538, 3208, 0)),
			new MapClue(102, new WorldPoint(2703, 2716, 0), CRATE_6616)
	);

	private static final ItemRequirement HAS_SPADE = new SingleItemRequirement(SPADE);

	private final int interfaceId;
	private final WorldPoint location;
	private final int objectId;
	private final String description;

	private MapClue(int interfaceId, WorldPoint location)
	{
		this(interfaceId, location, -1);
	}

	private MapClue(int interfaceId, WorldPoint location, int objectId)
	{
		this(interfaceId, location, objectId, null);
	}

	private MapClue(int interfaceId, WorldPoint location, String description)
	{
		this(interfaceId, location, -1, description);
	}

	private MapClue(int interfaceId, WorldPoint location, int objectId, String description)
	{
		this.interfaceId = interfaceId;
		this.location = location;
		this.objectId = objectId;
		this.description = description;
	}

	@Override
	public void makeOverlayHint(PanelComponent panelComponent, ClueScrollPlugin plugin)
	{
		panelComponent.getChildren().add(TitleComponent.builder().text("Map Clue").build());

		panelComponent.getChildren().add(LineComponent.builder()
				.left("Click the clue scroll along the edge of your world map to see your destination.")
				.build());

		if (objectId != -1)
		{
			ObjectComposition objectToClick = plugin.getClient().getObjectDefinition(getObjectId());

			String objectName = "N/A";

			if (objectToClick != null)
			{
				objectName = objectToClick.getName();
			}

			panelComponent.getChildren().add(LineComponent.builder()
					.left("Travel to the destination and click the " + objectName + ".")
					.build());
		}
		else
		{
			panelComponent.getChildren().add(LineComponent.builder()
					.left("Travel to the destination and dig on the marked tile.")
					.build());
		}

		if (description != null)
		{
			panelComponent.getChildren().add(LineComponent.builder().build());
			panelComponent.getChildren().add(LineComponent.builder()
					.left(description)
					.build());
		}

		if (objectId == -1 && plugin.getInventoryItems() != null)
		{
			if (!HAS_SPADE.fulfilledBy(plugin.getInventoryItems()))
			{
				panelComponent.getChildren().add(LineComponent.builder().left("").build());
				panelComponent.getChildren().add(LineComponent.builder().left("Requires Spade!").leftColor(Color.RED).build());
			}
		}
	}

	@Override
	public void makeWorldOverlayHint(Graphics2D graphics, ClueScrollPlugin plugin)
	{
		LocalPoint localLocation = LocalPoint.fromWorld(plugin.getClient(), getLocation());

		if (localLocation == null)
		{
			return;
		}

		// Mark game object
		if (objectId != -1)
		{
			net.runelite.api.Point mousePosition = plugin.getClient().getMouseCanvasPosition();

			if (plugin.getObjectsToMark() != null)
			{
				for (TileObject gameObject : plugin.getObjectsToMark())
				{
					OverlayUtil.renderHoverableArea(graphics, gameObject.getClickbox(), mousePosition,
							CLICKBOX_FILL_COLOR, CLICKBOX_BORDER_COLOR, CLICKBOX_HOVER_BORDER_COLOR);

					OverlayUtil.renderImageLocation(plugin.getClient(), graphics, gameObject.getLocalLocation(), plugin.getClueScrollImage(), IMAGE_Z_OFFSET);
				}
			}
		}
		// Mark tile
		else
		{
			OverlayUtil.renderTileOverlay(plugin.getClient(), graphics, localLocation, plugin.getSpadeImage(), Color.ORANGE);
		}
	}

	public static MapClue forInterfaceId(int interfaceId)
	{
		for (MapClue clue : CLUES)
		{
			if (clue.interfaceId == interfaceId)
			{
				return clue;
			}
		}

		return null;
	}

	public int[] getObjectIds()
	{
		return new int[] {objectId};
	}
}
