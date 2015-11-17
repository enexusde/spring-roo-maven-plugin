package de.e_nexus.maven.plugins;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.Mojo;

/**
 * Executes the script placed in a folder of the current project.
 * 
 * @author peter.rader
 */
@Mojo(name = "roo")
public class RooMojo extends AbstractMojo {

    /**
     * Execute the Mojo, use the Script to create the application.
     */
    public void execute() throws MojoExecutionException, MojoFailureException {
        getLog().info("--- Spring Roo ---");
    }
}
