package com.acme.prime.speaker.provider;

import org.junit.Test;

import com.acme.prime.speaker.api.Speaker;

/*
 * Example JUNit test case
 * 
 */

public class SpeakerImplTest {

	/*
	 * Example test method
	 */

	@Test
	public void simple() {
		Speaker impl = new SpeakerImpl();
		
		impl.say("Hello World");
	}

}
