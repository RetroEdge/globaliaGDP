package me.retroedge.globaliagdp.cmd;

import org.bukkit.command.CommandSender;

import java.util.ArrayList;

/**
 * Represents a piece of a command chain which has additional subcommands after it.
 */
public abstract class GSubCommand extends GCommand {

    public ArrayList<GCommand> subCommands;

    public GSubCommand() {
        super();
        this.subCommands = new ArrayList<>();
    }

    @Override
    public void execute(CommandSender sender, ArrayList<String> args) {
        for (GCommand gCommand: this.subCommands) {
            if (gCommand.cmdLabel.equals(args.get(0))) {
                args.remove(0);
                gCommand.execute(sender, args);
            }
        }
        this.perform(sender, args);
    }

    public void addSubCommand(GCommand subCommand) {
        subCommands.add(subCommand);
    }

}
