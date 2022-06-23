/**
 * 
 */
package org.topicquests.ks.sm;

import org.topicquests.support.RootEnvironment;

/**
 * @author jackpark
 *
 */
public class SMEnvironment extends RootEnvironment {

	/**
	 */
	public SMEnvironment() {
		super("sm-config-props.xml", "logger.properties");
		// TODO Auto-generated constructor stub
	}

	@Override
	public void shutDown() {
		// TODO Auto-generated method stub

	}

}
