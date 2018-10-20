package de.ratopi.maven.plugins.test;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.Mojo;

@Mojo( name = "sayhi")
public class GreetingsMojo extends AbstractMojo
{
	@Override
	public void execute() throws MojoExecutionException, MojoFailureException
	{
		getLog().info( "**************" );
		getLog().info( "Hello, world." );
		getLog().info( "**************" );
	}
}
