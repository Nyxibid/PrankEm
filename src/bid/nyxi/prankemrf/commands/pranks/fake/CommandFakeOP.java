package bid.nyxi.prankemrf.commands.pranks.fake;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import bid.nyxi.prankemrf.utils.nutils.NUser;
import bid.nyxi.prankemrf.utils.other.ConfigUtils;
import bid.nyxi.prankemrf.utils.other.Utils;
import bid.nyxi.prankemrf.utils.permissions.Permission;

public class CommandFakeOP implements CommandExecutor {

	public boolean onCommand(CommandSender sender, Command cmd, String s, String[] args) {

		NUser user = new NUser(sender);
		Player target;

		if (!user.valid(Permission.FAKE_OP)) {
			Utils.sendMessage(sender, ConfigUtils.ERROR_PERMISSION, true);
			return false;
		}

		if (args.length == 0) {
			Utils.sendMessage(sender, "&cCorrect usage: /fakeop" + " <player>", true);
			return false;
		}

		target = Bukkit.getPlayer(args[0]);

		if (!target.hasPlayedBefore() || !target.isOnline() || target == null) {
			Utils.sendMessage(sender, ConfigUtils.OPTION_PREFIX + " " + ConfigUtils.ERROR_OFFLINE_PLAYER, true);
			return false;
		}

		Utils.sendMessage(Bukkit.getServer().getPlayer(target.getName()), ConfigUtils.PRANK_FAKEOP, true, "%player%",
				args[0]);
		Utils.sendMessage(sender, ConfigUtils.PRANK_SUCCESS, true);

		return true;
	}

}
