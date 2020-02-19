package Calculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class addTest {

	@Test
	void test() {
		calculator test = new calculator();
		int result = test.add(1, -1);
		assertEquals(0,result);
		result = test.add(-1, -3);
		assertEquals(-4,result);
		result = test.add(0, 0);
		assertEquals(0,result);
		result = test.add(0, -3);
		assertEquals(-3,result);
		result = test.add(15,25);
		assertEquals(40,result);
	}

}
