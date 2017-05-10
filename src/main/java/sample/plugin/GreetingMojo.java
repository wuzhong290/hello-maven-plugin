package sample.plugin;

/**
 * Created by wuzhong on 2017/5/10.
 */

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;

/**
 * @author wuzhong
 * @goal sayhi
 */
public class GreetingMojo extends AbstractMojo {

    public void execute() throws MojoExecutionException, MojoFailureException {
        getLog().info( "Hello, world." );
    }
}
