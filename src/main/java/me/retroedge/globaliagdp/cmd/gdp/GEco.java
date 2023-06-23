package me.retroedge.globaliagdp.cmd.gdp;

import me.retroedge.globaliagdp.cmd.GSubCommand;
import me.retroedge.globaliagdp.cmd.gdp.eco.GEAdd;
import me.retroedge.globaliagdp.cmd.gdp.eco.GEGet;
import me.retroedge.globaliagdp.cmd.gdp.eco.GESubtract;
import me.retroedge.globaliagdp.cmd.gdp.help.GEHelp;
import org.bukkit.command.CommandSender;

import java.util.ArrayList;

// Class for the subcommand /gdp eco
public class GEco extends GSubCommand {
    public GEAdd gdpAdd = new GEAdd();
    public GEGet gdpGet = new GEGet();
    public GESubtract gdpSub = new GESubtract();
    public GEHelp gdpHelp = new GEHelp();

    public GEco() {
        super();
        this.addSubCommand(this.gdpAdd);
        this.addSubCommand(this.gdpSub);
        this.addSubCommand(this.gdpGet);
        this.addSubCommand(this.gdpHelp);

        this.cmdLabel = "eco";
    }

    @Override
    public void perform(CommandSender sender, ArrayList<String> args) {
        gdpHelp.execute(sender, args);
    }
}
