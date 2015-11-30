package com.dw.cli;

import com.beust.jcommander.JCommander;
import com.beust.jcommander.ParameterException;
import com.dw.cli.command.CommandNew;
import com.dw.cli.command.MainCommand;

/**
 * Created by dkulkarni on 28/11/15.
 */
public class DropwizardGenerator {

    private JCommander jc;

    private MainCommand mainCommand = new MainCommand();

    private CommandNew commandNew = new CommandNew();

    public static void main(String[] args) {
        MainCommand example = new MainCommand();
        JCommander jCommander = new JCommander(example);

        CommandNew commandNew = new CommandNew();
        jCommander.setProgramName("dropwizard");
        jCommander.addCommand("new", commandNew);

        try {
            jCommander.parse(args);
            commandNew.execute();
        } catch (ParameterException e) {
            System.out.println(e.getMessage());
        }

        if (example.isHelp()) {
            jCommander.usage();
        }

    }
}
