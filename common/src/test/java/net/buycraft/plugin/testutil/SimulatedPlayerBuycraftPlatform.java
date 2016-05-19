package net.buycraft.plugin.testutil;

import lombok.Getter;
import net.buycraft.plugin.IBuycraftPlatform;
import net.buycraft.plugin.client.ApiClient;
import net.buycraft.plugin.data.QueuedPlayer;
import net.buycraft.plugin.execution.placeholder.PlaceholderManager;
import net.buycraft.plugin.execution.strategy.CommandExecutor;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

public class SimulatedPlayerBuycraftPlatform implements IBuycraftPlatform {
    @Getter
    private final Map<String, TestPlayer> testPlayerMap = new HashMap<>();

    @Override
    public ApiClient getApiClient() {
        return null;
    }

    @Override
    public PlaceholderManager getPlaceholderManager() {
        return null;
    }

    @Override
    public void dispatchCommand(String command) {

    }

    @Override
    public void executeAsync(Runnable runnable) {

    }

    @Override
    public void executeAsyncLater(Runnable runnable, long time, TimeUnit unit) {

    }

    @Override
    public void executeBlocking(Runnable runnable) {

    }

    @Override
    public void executeBlockingLater(Runnable runnable, long time, TimeUnit unit) {

    }

    @Override
    public boolean isPlayerOnline(QueuedPlayer player) {
        return testPlayerMap.containsKey(player.getName());
    }

    @Override
    public int getFreeSlots(QueuedPlayer player) {
        TestPlayer testPlayer = testPlayerMap.get(player);
        if (testPlayer == null) {
            return -1;
        }

        return testPlayer.getFreeSlots();
    }

    @Override
    public void log(Level level, String message) {

    }

    @Override
    public void log(Level level, String message, Throwable throwable) {

    }

    @Override
    public CommandExecutor getExecutor() {
        return null;
    }
}