package bid.nyxi.prankemrf.utils.nutils;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;

import bid.nyxi.prankemrf.utils.permissions.Permission;

public class NUser {

	private CommandSender sender;

	public NUser(CommandSender sender) {
		this.sender = sender;
	}

	public CommandSender getUser() {
		return sender;
	}

	public boolean valid(Permission permission) {
		return sender.hasPermission(permission.toString()) || isAdmin();
	}

	public void message(String string) {
		sender.sendMessage(ChatColor.translateAlternateColorCodes('&', string));
	}

	public boolean isAdmin() {
		return (sender.hasPermission(Permission.ADMIN.permission())
				|| sender.hasPermission(Permission.SUPER.permission()));
	}
}