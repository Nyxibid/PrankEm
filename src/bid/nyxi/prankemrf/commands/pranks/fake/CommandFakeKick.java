package bid.nyxi.prankemrf.commands.pranks.fake;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;

import bid.nyxi.prankemrf.utils.other.Utils;

public class CommandFakeKick {

	public boolean onCommand(CommandSender sender, Command cmd, String s, String[] args) {

		if (!(sender.hasPermission("fake.kick"))) {
			Utils.sendMessage(sender, "You do not have permission to perform this command", true);
			return true;
		}
		if (args.length == 0) {
			Utils.sendMessage(sender, "Please specify a player and reason", true);
			return true;
		}

		return true;

	}
}
