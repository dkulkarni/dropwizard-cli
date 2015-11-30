package com.dw.cli.command;

import com.beust.jcommander.Parameter;
import com.beust.jcommander.Parameters;
import com.dw.cli.executor.CommandExecutor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dkulkarni on 28/11/15.
 */

@Parameters(commandNames = "new", commandDescription = "Create a new Dropwizard Application")
public class CommandNew implements CommandExecutor {

    private static final Logger logger = LoggerFactory.getLogger("Command: new");

    @Parameter(description = "Name of the application")
    private List<String> appName = new ArrayList<>();

    @Parameter(names = "-baseDir", description = "Directory to create the application", required = true)
    private String baseDir;

    public String getBaseDir() {
        return baseDir;
    }

    @Override
    public void execute() {
        String appDir = baseDir + appName.get(0);
        logger.info("Create application at {}", appDir);


    }
}
