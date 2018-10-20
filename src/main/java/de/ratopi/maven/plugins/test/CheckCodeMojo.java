package de.ratopi.maven.plugins.test;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;

@Mojo(name = "checkcode", defaultPhase = LifecyclePhase.COMPILE, threadSafe = true)
public class CheckCodeMojo extends AbstractMojo
{
	@Override
	public void execute() throws MojoExecutionException, MojoFailureException
	{
		getLog().info( "**************" );
		getLog().info( "Now traversing source files ..." );
		getLog().info( "**************" );

		new CheckBeansXml().checkBeansXml( getLog() );
	}
}
