package bid.nyxi.prankemrf;

import java.io.File;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

import bid.nyxi.prankemrf.commands.pranks.fake.CommandFakeDeOP;
import bid.nyxi.prankemrf.commands.pranks.fake.CommandFakeOP;
import bid.nyxi.prankemrf.utils.other.Utils;

public class PrankEm extends JavaPlugin {

	private static Plugin plugin;

	public static Plugin getPlugin() {
		return plugin;
	}

	public File yml = new File(getDataFolder(), "config.yml");
	public FileConfiguration conf = YamlConfiguration.loadConfiguration(yml);

	public void onEnable() {
		plugin = this;

		if (!yml.exists()) {
			Utils.saveCustomYml(conf, yml);
			System.out.println("[PRANKEM2] - CREATED CONFIG.YML");
		}
		registerCommands();
		saveDefaultConfig();
	}

	public void registerCommands() {
		getCommand("fakedeop").setExecutor(new CommandFakeDeOP());
		getCommand("fakeop").setExecutor(new CommandFakeOP());
	}

}
