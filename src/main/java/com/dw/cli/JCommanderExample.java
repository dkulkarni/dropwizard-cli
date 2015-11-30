package com.dw.cli;

import com.beust.jcommander.Parameter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dkulkarni on 28/11/15.
 */

public class JCommanderExample {
    @Parameter
    private List<String> parameters = new ArrayList<>();

    @Parameter(names = {"-log", "-verbose"}, description = "Level of verbosity")
    private Integer verbose = 1;

    @Parameter(names = "-groups", description = "Comma-separated list of group names to be run")
    private String groups;

    @Parameter(names = "-debug", description = "Debug mode")
    private boolean debug = false;

    @Parameter(names = "-help", description = "Print all available options", help = true)
    private boolean help = false;

    public boolean isHelp() {
        return help;
    }
}
