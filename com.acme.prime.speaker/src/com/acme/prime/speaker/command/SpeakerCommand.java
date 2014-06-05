package com.acme.prime.speaker.command;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import osgi.enroute.debug.api.Debug;
import com.acme.prime.speaker.api.Speaker;

/**
 * This is the implementation. It registers the Speaker interface and calls it
 * through a Gogo command.
 * 
 */
@Component(service=SpeakerCommand.class, property = { Debug.COMMAND_SCOPE + "=speaker",
		Debug.COMMAND_FUNCTION + "=speaker" }, name="com.acme.prime.speaker.command")
public class SpeakerCommand {
	final static Logger log = LoggerFactory.getLogger(SpeakerCommand.class);
	
	private Speaker target;

	public void speaker(String message) {
		target.say(message);
	}

	@Reference
	void setSpeaker(Speaker service) {
		this.target = service;
	}

}
