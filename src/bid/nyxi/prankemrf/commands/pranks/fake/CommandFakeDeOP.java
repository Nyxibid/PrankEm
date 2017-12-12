package bid.nyxi.prankemrf.commands.pranks.fake;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import bid.nyxi.prankemrf.utils.other.ConfigUtils;
import bid.nyxi.prankemrf.utils.other.Utils;

public class CommandFakeDeOP implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command c, String s, String[] args) {

		if (!sender.hasPermission("prankem.fake.deop") || !sender.hasPermission("prankem.fake.*")) {
			Utils.sendMessage(sender, ConfigUtils.ERROR_PERMISSION, true);
		}

		if (args.length == 0) {
			Utils.sendMessage(sender, "&cCorrect usage: /fakedeop" + " <player>", true);
			return true;
		}

		Player target = Bukkit.getServer().getPlayer(args[0]);
		if (target == null || !(target.hasPlayedBefore())) {
			Utils.sendMessage(sender, ConfigUtils.ERROR_OFFLINE_PLAYER, true, "%player%", args[0]);
			return true;
		}
		Utils.sendMessage(target, ConfigUtils.PRANK_FAKEDEOP, false, "%player%", args[0]);
		Utils.sendMessage(sender, ConfigUtils.PRANK_SUCCESS, true, "%player%", args[0]);
		return true;

	}

}
