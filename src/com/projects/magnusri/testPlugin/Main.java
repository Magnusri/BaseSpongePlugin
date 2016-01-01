package com.projects.magnusri.testPlugin;

import org.spongepowered.api.event.Listener;
import org.spongepowered.api.event.game.state.GameStartedServerEvent;
import org.spongepowered.api.event.game.state.GameStoppingServerEvent;
import org.spongepowered.api.plugin.Plugin;

import com.google.inject.Inject;

import org.slf4j.Logger;

@Plugin(id = "tPlugin", name = "testPlugin", version = "1.0")
public class Main {
	
	private Logger logger;

	@Inject
	private void setLogger(Logger logger) {
	    this.logger = logger;
	}
	
	public Logger getLogger() {
	    return logger;
	}
    
	@Listener
    public void onServerStart(GameStartedServerEvent event) {
        // Hey! The server has started!
        // Try instantiating your logger in here.
        // (There's a guide for that)
		
		getLogger().info("testPlugin has started!");
		
    }
	
	@Listener
    public void onServerStop(GameStoppingServerEvent event) {
        // Hey! The server has stopped!
		

		getLogger().info("testPlugin has stopped!");
		
    }
	
}