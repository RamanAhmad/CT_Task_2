import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BlackBoxTest_Template2 {

/*
	@Test
	void exampleTest() {
		*/
/* Colors: YELLOW, GREEN, RED *//*

		Color expected = Color.YELLOW;
		int x = 5;
		int y = 1;
		boolean b = false;
		Color actual = BlackBox2.F(x, y, b);
		assertEquals(expected, actual);
		fail("not implemented yet");
	}
*/

	// --------- EQUALITY CASES ---------


	// ------- DO NOT TOUCH BELOW THIS LINE -------
	@AfterAll
	static void tearDownAfterClass() throws Exception {
		assertTrue(BlackBox2.evalEqClasses(), "Not all equivalence classes covert!");
	}

}
