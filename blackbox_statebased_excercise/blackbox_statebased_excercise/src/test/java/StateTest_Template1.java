import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;

class StateTest_Template1 {

/*	@Test
	void test() {
		SbHard3.start(); // (re-) starting the SbHard3
		SbHard3.getStateName(); // returns the name of the current state
		SbHard3.getStateEvents(); // returns a Set of all permitted events of the current state
		SbHard3.transition("a"); // transition the current state with the given event
		String stateName = SbHard3.getStateName();
		assertEquals("S4", stateName);
		fail("Not yet implemented");
	}*/

	@Test
	void test() {
		SbHard3.start();
		SbHard3.transition("e");
		SbHard3.transition("b");
		SbHard3.transition("b");


		SbHard3.getStateName();
	}
	@Test
	void test2() {
		SbHard3.start();
		SbHard3.transition("a");
		SbHard3.transition("c");
		SbHard3.transition("a");

		SbHard3.getStateName();
	}
	@Test
	void test3() {
		SbHard3.start();
		SbHard3.transition("c");
		SbHard3.transition("d");
		SbHard3.transition("d");
		SbHard3.transition("a");
		SbHard3.transition("c");
		SbHard3.getStateName();

	}

	// ------- DO NOT TOUCH BELOW THIS LINE -------
	@AfterAll
	static void tearDownAfterClass() throws Exception {
		assertTrue(SbHard3.evalCoverage(), "There are states or transitions left to cover!");

	}
	
}