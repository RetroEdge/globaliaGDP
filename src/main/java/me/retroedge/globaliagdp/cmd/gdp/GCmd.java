package me.retroedge.globaliagdp.cmd.gdp;

import me.retroedge.globaliagdp.cmd.GCommand;
import me.retroedge.globaliagdp.cmd.GSubCommand;
import me.retroedge.globaliagdp.cmd.gdp.help.GHelp;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabExecutor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Class for the root command, /gdp
public class GCmd extends GSubCommand implements TabExecutor {
    public GEco gdpEco = new GEco();
    public GSettlement gdpSettlement = new GSettlement();
    public GHelp gdpHelp = new GHelp();

    public GCmd() {
        super();
        this.addSubCommand(this.gdpEco);
        this.addSubCommand(this.gdpSettlement);
    }

    @Override
    public void perform(CommandSender sender, ArrayList<String> args) {
        gdpHelp.perform(sender, args);
    }

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        this.execute(sender, new ArrayList<>(Arrays.asList(args)));
        return true;
    }

    @Override
    public @Nullable List<String> onTabComplete(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        if (args.length == 1) {
            ArrayList<String> tabComplete = new ArrayList<>();
            for (GCommand gCommand : this.subCommands) {
                if (gCommand.cmdLabel.contains(args[0])) {
                    tabComplete.add(cmdLabel);
                }
            }
            return tabComplete;
        }
        return null;
        // Add more here to account for tab completions or hints after sub command
    }
}
