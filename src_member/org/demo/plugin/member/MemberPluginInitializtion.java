package org.demo.plugin.member;

import javax.servlet.ServletContextEvent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.demo.plugin.PluginInitialitionInterface;

public class MemberPluginInitializtion implements PluginInitialitionInterface{
	private static final Log log = LogFactory.getLog(MemberPluginInitializtion.class);
	
	public void initialized(ServletContextEvent arg0) {
		System.out.println("member plugin initialized success");
	}

	public void destroyed(ServletContextEvent arg0) {
		System.out.println("member plugin destroyed success");
	}

}
