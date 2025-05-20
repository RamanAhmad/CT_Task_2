import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BlackBoxTest_Template1 {

//	@Test
//	void exampleTest() {
//		/* Colors: YELLOW, GREEN, RED */
//		Color expected = Color.YELLOW;
//		int x = 5;
//		int y = 1;
//		boolean b = false;
//		Color actual = BlackBox1.G(x, y);
//		assertEquals(expected, actual);
//		fail("not implemented yet");
//	}



	@Test
	void test_1() {
		Color expected = Color.RED;
		int x = -1;
		int y = -1;
		Color actual = BlackBox1.G(x, y);
		assertEquals(expected, actual);
	}

	@Test
	void test_2() {
		Color expected = Color.YELLOW;
		int x = -1;
		int y = 5;
		Color actual = BlackBox1.G(x, y);
		assertEquals(expected, actual);
	}

	@Test
	void test_3() {
		Color expected = Color.YELLOW;
		int x = -1;
		int y = 11;
		Color actual = BlackBox1.G(x, y);
		assertEquals(expected, actual);
	}

	@Test
	void test_4() {

		Color expected = Color.YELLOW;
		int x = 100;
		int y = -1;
		Color actual = BlackBox1.G(x, y);
		assertEquals(expected, actual);
	}

	@Test
	void test_5() {
		/* Colors: YELLOW, GREEN, RED */
		Color expected = Color.YELLOW;
		int x = 100;
		int y = 5;
		Color actual = BlackBox1.G(x, y);
		assertEquals(expected, actual);
	}

	@Test
	void test_6() {
		Color expected = Color.GREEN;
		int x = 100;
		int y = 11;
		Color actual = BlackBox1.G(x, y);
		assertEquals(expected, actual);
	}

	@Test
	void testEqu7() {
		Color expected = Color.YELLOW;
		int x = 1;
		int y = -1;
		Color actual = BlackBox1.G(x, y);
		assertEquals(expected, actual);
	}

	@Test
	void testEqu8() {
		Color expected = Color.YELLOW;
		int x = 1;
		int y = 5;
		Color actual = BlackBox1.G(x, y);
		assertEquals(expected, actual);
	}

	@Test
	void testEqu9() {
		Color expected = Color.YELLOW;
		int x = 1;
		int y = 11;
		Color actual = BlackBox1.G(x, y);
		assertEquals(expected, actual);
	}

	@Test
	void testUEqu1() {
		int x = -1;
		int y = -10;
		Color actual = BlackBox1.G(x, y);
		assertNull(actual);
	}

	@Test
	void testUEqu2() {
		int x = -1;
		int y = 101;
		Color actual = BlackBox1.G(x, y);
		assertNull(actual);
	}

	@Test
	void testUEqu3() {
		int x = 101;
		int y = -10;
		Color actual = BlackBox1.G(x, y);
		assertNull(actual);
	}

	@Test
	void testUEqu4() {
		int x = 101;
		int y = 101;
		Color actual = BlackBox1.G(x, y);
		assertNull(actual);
	}

	@Test
	void testUEqu5() {
		int x = 10;
		int y = -10;
		Color actual = BlackBox1.G(x, y);
		assertNull(actual);
	}

	@Test
	void testUEqu6() {
		int x = 10;
		int y = 101;
		Color actual = BlackBox1.G(x, y);
		assertNull(actual);
	}

	@Test
	void testUEqu7() {
		int x = -30;
		int y = -10;
		Color actual = BlackBox1.G(x, y);
		assertNull(actual);
	}

	@Test
	void testUEqu8() {
		int x = -30;
		int y = 101;
		Color actual = BlackBox1.G(x, y);
		assertNull(actual);
	}

	@Test
	void testUEqu9() {
		int x = -30;
		int y = -1;
		Color actual = BlackBox1.G(x, y);
		assertNull(actual);
	}

	@Test
	void testUEqu10() {
		int x = -30;
		int y = 5;
		Color actual = BlackBox1.G(x, y);
		assertNull(actual);
	}

	@Test
	void testUEqu11() {
		int x = -30;
		int y = 30;
		Color actual = BlackBox1.G(x, y);
		assertNull(actual);
	}

	@Test
	void testUEqu12() {
		int x = 120;
		int y = -10;
		Color actual = BlackBox1.G(x, y);
		assertNull(actual);
	}

	@Test
	void testUEqu13() {
		int x = 120;
		int y = 101;
		Color actual = BlackBox1.G(x, y);
		assertNull(actual);
	}

	@Test
	void testUEqu14() {
		int x = 120;
		int y = -1;
		Color actual = BlackBox1.G(x, y);
		assertNull(actual);
	}

	@Test
	void testUEqu15() {
		/* Colors: YELLOW, GREEN, RED */
		int x = 120;
		int y = 5;
		Color actual = BlackBox1.G(x, y);
		assertNull(actual);
	}

	@Test
	void testUEqu16() {
		/* Colors: YELLOW, GREEN, RED */
		int x = 120;
		int y = 30;
		Color actual = BlackBox1.G(x, y);
		assertNull(actual);
	}


	// ------- DO NOT TOUCH BELOW THIS LINE -------
	@AfterAll
	static void tearDownAfterClass() throws Exception {
		assertTrue(BlackBox1.evalEqClasses(), "Not all equivalence classes covert!");
	}

}
