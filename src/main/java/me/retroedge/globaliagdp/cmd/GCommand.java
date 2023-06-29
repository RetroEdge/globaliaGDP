package me.retroedge.globaliagdp.cmd;

import org.bukkit.command.CommandSender;

import java.util.ArrayList;

/**
 * Represents a command in a command chain.
 * Commands other than the final subcommand should extend {@link me.retroedge.globaliagdp.cmd.GSubCommand} instead.
 */
public abstract class GCommand {
    public String cmdLabel;

    public GCommand() {
        super();
        this.cmdLabel = "";
    }

    public abstract void perform(CommandSender sender, ArrayList<String> args);

    public void execute(CommandSender sender, ArrayList<String> args) {
        this.perform(sender, args);
    }
}
