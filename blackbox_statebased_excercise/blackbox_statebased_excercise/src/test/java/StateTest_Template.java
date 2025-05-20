import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class StateTest_Template {

/*	@Test
	void test() {
		SbSimple1.start(); // (re-) starting the SbSimple1
		SbSimple1.getStateName(); // returns the name of the current state
		SbSimple1.getStateEvents(); // returns a Set of all permitted events of the current state
		SbSimple1.transition("a"); // transition the current state with the given event
		String stateName = SbSimple1.getStateName();
		assertEquals("S4", stateName);
		fail("Not yet implemented");
	}*/



	// ------- DO NOT TOUCH BELOW THIS LINE -------
	@AfterAll
	static void tearDownAfterClass() throws Exception {
		assertTrue(SbSimple1.evalCoverage(), "There are states or transitions left to cover!");

	}
	
}