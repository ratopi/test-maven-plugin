
package de.ratopi.maven.plugins.test;

import java.io.File;

import de.ratopi.traverse.FileVisitor;
import de.ratopi.traverse.Traverse;
import org.apache.maven.plugin.logging.Log;

/**
 * Check if "beans.xml" is in correct position
 */
public class CheckBeansXml
{
	public boolean checkBeansXml( final Log log )
	{
		final File rootPath = new File( new File( "." ), "src" );
		log.info( "HERE I'AM " + rootPath.getAbsolutePath() );

		final Traverse traverse = new Traverse();

		traverse.traverse(
				rootPath,
				new FileVisitor()
				{
					@Override
					public void visit( File file )
					{
						System.err.println( file );
					}
				}
		);

		return true;
	}
}
