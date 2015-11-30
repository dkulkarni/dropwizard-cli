package com.dw.cli.command;

import com.beust.jcommander.DynamicParameter;
import com.beust.jcommander.Parameter;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by dkulkarni on 29/11/15.
 */
public class MainCommand {

    @DynamicParameter(names = "-D", description = "Dynamic parameters", hidden = true)
    private Map<String, String> dynamicParams = new HashMap<>();


    @Parameter(names = "-help", description = "Type dropwizard -help to see all available options", help = true)
    private boolean help;

    public boolean isHelp() {
        return help;
    }
}
