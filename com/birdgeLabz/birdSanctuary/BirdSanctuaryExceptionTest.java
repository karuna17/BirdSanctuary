package com.birdgeLabz.birdSanctuary;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BirdSanctuaryExceptionTest {

	@Test
	public void givenBird_IfNull_ShouldThrowBirdSantuaryException() throws BirdSantuaryException {
		BirdSanctuaryManager birdSanctuaryManager = new BirdSanctuaryManager();
		Birds bird = new Parrot(null);
		Assertions.assertThrows(BirdSantuaryException.class, () -> birdSanctuaryManager.add(bird));  
		
	}

}
