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


	@Test
	void testStateCoverageViaS3() {
		SbSimple1.start();
		SbSimple1.transition("b"); // S1 → S2
		SbSimple1.transition("d"); // S2 → S3
		SbSimple1.transition("d"); // S3 → S4
		SbSimple1.transition("a"); // S4 → Ende
		assertEquals("Final", SbSimple1.getStateName());
	}

	@Test
	@DisplayName("Transitions_S2toS4_and_S4toS2_and_S2toEnde")
	void testTransitionCoverage() {
		SbSimple1.start();
		SbSimple1.transition("b"); // S1 → S2
		SbSimple1.transition("c"); // S2 → S3
		SbSimple1.transition("b"); // S3 → S4
		SbSimple1.transition("a"); // S4 → Ende
		assertEquals("Final", SbSimple1.getStateName());
	}
	@Test
	@DisplayName("Transition_S3toS1")
	void testTransitionCoverage1() {
		SbSimple1.start();
		SbSimple1.transition("b"); // S1 → S2
		SbSimple1.transition("d"); // S2 → S3
		SbSimple1.transition("b"); // S3 → S4
		//SbSimple1.transition("a"); // S4 → Ende
		assertEquals("S1", SbSimple1.getStateName());
	}


	// ------- DO NOT TOUCH BELOW THIS LINE -------
	@AfterAll
	static void tearDownAfterClass() throws Exception {
		assertTrue(SbSimple1.evalCoverage(), "There are states or transitions left to cover!");

	}
	
}