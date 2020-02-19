package Calculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class divideTest {

	@Test
	void test() {
		calculator test = new calculator();
		float result = test.divide(1, -1);
		assertEquals(-1,result);
		result = test.divide(0, 0);
		assertEquals(-1,result);
		result = test.divide(15, 2);
		assertEquals(7.5,result);
		result = test.divide(0, 352);
		assertEquals(0,result);
		result = test.divide(15, 15);
		assertEquals(1,result);
	}

}
