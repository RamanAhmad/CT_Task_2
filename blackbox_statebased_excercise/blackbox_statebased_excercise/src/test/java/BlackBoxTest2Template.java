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

    @Test
    void testEqu1() {
        Color expected = Color.RED;
        int x = 2;
        int y = 1;
        boolean b = true;
        Color actual = BlackBox2.F(x, y, b);
        assertEquals(expected, actual);
    }

    @Test
    void testEqu1_1() {
        Color expected = Color.YELLOW;
        int x = 9;
        int y = 0;
        boolean b = false;
        Color actual = BlackBox2.F(x, y, b);
        assertEquals(expected, actual);
    }

    @Test
    void testEqu2() {
        Color expected = Color.YELLOW;
        int x = 5;
        int y = 0;
        boolean b = true;
        Color actual = BlackBox2.F(x, y, b);
        assertEquals(expected, actual);
    }

    @Test
    void testEqu2_2() {
        Color expected = Color.YELLOW;
        int x = 2;
        int y = 1;
        boolean b = false;
        Color actual = BlackBox2.F(x, y, b);
        assertEquals(expected, actual);
    }

    @Test
    void testEqu3() {
        Color expected = Color.YELLOW;
        int x = 10;
        int y = 2;
        boolean b = true;
        Color actual = BlackBox2.F(x, y, b);
        assertEquals(expected, actual);
    }

    @Test
    void testEqu3_3() {
        Color expected = Color.GREEN;
        int x = 12;
        int y = 2;
        boolean b = false;
        Color actual = BlackBox2.F(x, y, b);
        assertEquals(expected, actual);
    }

    @Test
    void testEqu4() {
        Color expected = Color.YELLOW;
        int x = 10;
        int y = -2;
        boolean b = true;
        Color actual = BlackBox2.F(x, y, b);
        assertEquals(expected, actual);
    }

    @Test
    void testEqu4_4() {
        Color expected = Color.GREEN;
        int x = 16;
        int y = -2;
        boolean b = false;
        Color actual = BlackBox2.F(x, y, b);
        assertEquals(expected, actual);
    }

    // --------- Ungueltige Klassen ---------

    @Test
    void testUEqu1() {
        Color expected = Color.GREEN;
        int x = 1;
        int y = 1;
        boolean b = false;
        Color actual = BlackBox2.F(x, y, b);
        assertNull(actual);
    }

    @Test
    void testUEqu1_1() {
        Color expected = Color.GREEN;
        int x = 0;
        int y = 2;
        boolean b = true;
        Color actual = BlackBox2.F(x, y, b);
        assertNull(actual);
    }

    @Test
    void testUEqu2() {
        Color expected = Color.GREEN;
        int x = 0;
        int y = -2;
        boolean b = false;
        Color actual = BlackBox2.F(x, y, b);
        assertNull(actual);
    }

    @Test
    void testUEqu2_2() {
        Color expected = Color.GREEN;
        int x = 0;
        int y = 0;
        boolean b = true;
        Color actual = BlackBox2.F(x, y, b);
        assertNull(actual);
    }

    @Test
    void testUEqu3() {
        Color expected = Color.GREEN;
        int x = 18;
        int y = 1;
        boolean b = true;
        Color actual = BlackBox2.F(x, y, b);
        assertNull(actual);
    }

    @Test
    void testUEqu3_3() {
        Color expected = Color.GREEN;
        int x = 17;
        int y = 2;
        boolean b = false;
        Color actual = BlackBox2.F(x, y, b);
        assertNull(actual);
    }

    @Test
    void testUEqu4() {
        Color expected = Color.GREEN;
        int x = 100;
        int y = 0;
        boolean b = false;
        Color actual = BlackBox2.F(x, y, b);
        assertNull(actual);
    }

    @Test
    void testUEqu4_4() {
        Color expected = Color.GREEN;
        int x = 100;
        int y = -2;
        boolean b = true;
        Color actual = BlackBox2.F(x, y, b);
        assertNull(actual);
    }

    @Test
    void testUEqu5() {
        Color expected = Color.GREEN;
        int x = 2;
        int y = -3;
        boolean b = true;
        Color actual = BlackBox2.F(x, y, b);
        assertNull(actual);
    }

    @Test
    void testUEqu5_5() {
        Color expected = Color.GREEN;
        int x = 2;
        int y = -3;
        boolean b = false;
        Color actual = BlackBox2.F(x, y, b);
        assertNull(actual);
    }

    @Test
    void testUEqu6() {
        Color expected = Color.GREEN;
        int x = 10;
        int y = -3;
        boolean b = true;
        Color actual = BlackBox2.F(x, y, b);
        assertNull(actual);
    }

    @Test
    void testUEqu6_6() {
        Color expected = Color.GREEN;
        int x = 10;
        int y = -3;
        boolean b = false;
        Color actual = BlackBox2.F(x, y, b);
        assertNull(actual);
    }

    @Test
    void testUEqu7() {
        Color expected = Color.GREEN;
        int x = 2;
        int y = 3;
        boolean b = true;
        Color actual = BlackBox2.F(x, y, b);
        assertNull(actual);
    }

    @Test
    void testUEqu7_7() {
        Color expected = Color.GREEN;
        int x = 2;
        int y = 3;
        boolean b = false;
        Color actual = BlackBox2.F(x, y, b);
        assertNull(actual);
    }

    @Test
    void testUEqu8() {
        Color expected = Color.GREEN;
        int x = 10;
        int y = 3;
        boolean b = true;
        Color actual = BlackBox2.F(x, y, b);
        assertNull(actual);
    }

    @Test
    void testUEqu8_8() {
        Color expected = Color.GREEN;
        int x = 10;
        int y = 3;
        boolean b = false;
        Color actual = BlackBox2.F(x, y, b);
        assertNull(actual);
    }

    @Test
    void testUEqu9() {
        Color expected = Color.GREEN;
        int x = 1;
        int y = -3;
        boolean b = false;
        Color actual = BlackBox2.F(x, y, b);
        assertNull(actual);
    }

    @Test
    void testUEqu9_9() {
        Color expected = Color.GREEN;
        int x = 1;
        int y = -3;
        boolean b = true;
        Color actual = BlackBox2.F(x, y, b);
        assertNull(actual);
    }

    @Test
    void testUEqu10() {
        Color expected = Color.GREEN;
        int x = 1;
        int y = 3;
        boolean b = false;
        Color actual = BlackBox2.F(x, y, b);
        assertNull(actual);
    }

    @Test
    void testUEqu10_10() {
        Color expected = Color.GREEN;
        int x = 1;
        int y = 3;
        boolean b = true;
        Color actual = BlackBox2.F(x, y, b);
        assertNull(actual);
    }

    @Test
    void testUEqu11() {
        Color expected = Color.GREEN;
        int x = 17;
        int y = -3;
        boolean b = false;
        Color actual = BlackBox2.F(x, y, b);
        assertNull(actual);
    }

    @Test
    void testUEqu11_11() {
        Color expected = Color.GREEN;
        int x = 17;
        int y = -3;
        boolean b = true;
        Color actual = BlackBox2.F(x, y, b);
        assertNull(actual);
    }

    @Test
    void testUEqu12() {
        Color expected = Color.GREEN;
        int x = 17;
        int y = 3;
        boolean b = false;
        Color actual = BlackBox2.F(x, y, b);
        assertNull(actual);
    }

    @Test
    void testUEqu12_12() {
        Color expected = Color.GREEN;
        int x = 17;
        int y = 3;
        boolean b = true;
        Color actual = BlackBox2.F(x, y, b);
        assertNull(actual);
    }


    // ------- DO NOT TOUCH BELOW THIS LINE -------
    @AfterAll
    static void tearDownAfterClass() throws Exception {
        assertTrue(BlackBox2.evalEqClasses(), "Not all equivalence classes covert!");
    }

}
