package bid.nyxi.prankemrf.utils.other;

import org.bukkit.plugin.Plugin;

import bid.nyxi.prankemrf.PrankEm;

public class ConfigUtils {

	private static Plugin plugin = PrankEm.getPlugin();

	// # ERRORS #
	public static final String ERROR_PERMISSION = getString(plugin, "error.permission");
	public static final String ERROR_OFFLINE_PLAYER = getString(plugin, "error.offline");
	public static final String ERROR_SPECIFY_PLAYER = getString(plugin, "error.specify");

	public static final String OPTION_PREFIX = getString(plugin, "option.prefix");
	public static final String PRANK_SUCCESS = getString(plugin, "option.prank-success");

	public static final String PRANK_FAKEOP = getString(plugin, "pranks.fake.op.");
	public static final String PRANK_FAKEDEOP = getString(plugin, "pranks.fake.deop");

	public static String getString(Plugin plugin, String path) {
		return plugin.getConfig().getString(path);
	}

	public static boolean getBoolean(Plugin plugin, String path) {
		return plugin.getConfig().getBoolean(path);
	}

	public static int getInt(Plugin plugin, String path) {
		return plugin.getConfig().getInt(path);
	}

}
