package net.buycraft.plugin.bukkit.command;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.text.SimpleDateFormat;
import java.util.Date;
import net.buycraft.plugin.bukkit.BuycraftPluginBase;
import net.buycraft.plugin.shared.util.ReportBuilder;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;

public class ReloadSubcommand implements Subcommand {
    private final BuycraftPluginBase plugin;

    public ReloadSubcommand(BuycraftPluginBase plugin) {
        this.plugin = plugin;
    }

    @Override
    public void execute(final CommandSender sender, String[] args) {
        sender.sendMessage(ChatColor.GREEN + "Reloaded config.yml (this does NOT reload config.properties)");

        plugin.reloadConfig();
    }

    @Override
    public String getDescription() {
        return "Usage: /tebex reload";
    }
}
