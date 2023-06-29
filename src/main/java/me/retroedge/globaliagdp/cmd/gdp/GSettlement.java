package me.retroedge.globaliagdp.cmd.gdp;

import me.retroedge.globaliagdp.cmd.GSubCommand;
import me.retroedge.globaliagdp.cmd.gdp.help.GSHelp;
import me.retroedge.globaliagdp.cmd.gdp.settlement.GSAdd;
import me.retroedge.globaliagdp.cmd.gdp.settlement.GSMove;
import me.retroedge.globaliagdp.cmd.gdp.settlement.GSRemove;
import me.retroedge.globaliagdp.cmd.gdp.settlement.GSUpgrade;
import org.bukkit.command.CommandSender;

import java.util.ArrayList;

// Class for the subcommand /gdp settlement
public class GSettlement extends GSubCommand {
    public GSAdd gdpAdd = new GSAdd();
    public GSMove gdpMove = new GSMove();
    public GSRemove gdpRemove = new GSRemove();
    public GSUpgrade gdpUpgrade = new GSUpgrade();
    public GSHelp gdpHelp = new GSHelp();

    public GSettlement() {
        super();
        this.addSubCommand(this.gdpAdd);
        this.addSubCommand(this.gdpMove);
        this.addSubCommand(this.gdpRemove);
        this.addSubCommand(this.gdpUpgrade);
        this.addSubCommand(this.gdpHelp);

        this.cmdLabel = "settlement";
    }

    @Override
    public void perform(CommandSender sender, ArrayList<String> args) {
        gdpHelp.execute(sender, args);
    }
}
