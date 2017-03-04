/*
 * Decompiled with CFR 0_110.
 *
 * Could not load the following classes:
 *  com.sk89q.worldedit.regions.Region
 *  org.bukkit.entity.Player
 *  org.bukkit.event.Event
 *  org.bukkit.event.HandlerList
 */



import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

import com.sk89q.worldedit.regions.Region;

public class WorldEditSelectionChangeEvent extends Event {
    private static final HandlerList handlers = new HandlerList();
    private final Player             player;
    private final Region             region;

    public WorldEditSelectionChangeEvent(final Player player, final Region region) {
        this.player = player;
        this.region = region;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }

    @Override
    public HandlerList getHandlers() {
        return handlers;
    }

    public Player getPlayer() {
        return this.player;
    }

    public Region getRegion() {
        return this.region;
    }
}
