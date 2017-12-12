package bid.nyxi.prankemrf.utils.other;

import java.io.File;
import java.io.IOException;

import org.bukkit.command.CommandSender;
import org.bukkit.configuration.InvalidConfigurationException;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;

import net.md_5.bungee.api.ChatColor;

public class Utils {

	public static boolean validatePermissions(Player player, String... permissions) {
		for (String localPermission : permissions) {
			if (player.hasPermission(localPermission)) {
				return true;
			} else {
				continue;
			}

		}
		return false;
	}

	public static boolean validatePermissions(CommandSender sender, String[] permissions) {
		for (String localPermission : permissions) {
			if (sender.hasPermission(localPermission)) {
				return true;
			} else {
				continue;
			}

		}
		return false;
	}

	public static void saveCustomYml(FileConfiguration ymlConfig, File ymlFile) {
		try {
			ymlConfig.save(ymlFile);
		} catch (IOException e) {
			e.printStackTrace();

		}
	}

	public static void reloadCustomYml(FileConfiguration ymlConfig, File ymlFile) {
		try {
			try {
				ymlConfig.load(ymlFile);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (InvalidConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void sendMessage(Player player, String string, boolean prefix) {
		if (!prefix) {
			player.sendMessage(ChatColor.translateAlternateColorCodes('&', string));
		} else {
			player.sendMessage(ChatColor.translateAlternateColorCodes('&', ConfigUtils.OPTION_PREFIX + " " + string));
		}

	}

	public static void sendMessage(CommandSender sender, String string, boolean prefix) {
		if (!prefix) {
			sender.sendMessage(ChatColor.translateAlternateColorCodes('&', string));
		} else {
			sender.sendMessage(ChatColor.translateAlternateColorCodes('&', ConfigUtils.OPTION_PREFIX + " " + string));
		}
	}

	public static void sendMessage(Player player, String string, boolean prefix, String toReplace, String replaceWith) {
		if (!prefix) {
			player.sendMessage(ChatColor.translateAlternateColorCodes('&', string.replace(toReplace, replaceWith)));
		} else {
			player.sendMessage(ChatColor.translateAlternateColorCodes('&',
					ConfigUtils.OPTION_PREFIX + " " + string.replace(toReplace, replaceWith)));
		}

	}

	public static void sendMessage(CommandSender sender, String string, boolean prefix, String toReplace,
			String replaceWith) {
		if (!prefix) {
			sender.sendMessage(ChatColor.translateAlternateColorCodes('&', string.replace(toReplace, replaceWith)));
		} else {
			sender.sendMessage(ChatColor.translateAlternateColorCodes('&',
					ConfigUtils.OPTION_PREFIX + " " + string.replace(toReplace, replaceWith)));
		}
	}
}
