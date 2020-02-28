package assn2swtest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EquivTest {

	@Test
	void test() {
		trigFunc t = new trigFunc();
		int output=t.Sin(-2);
		assertEquals(Math.sin(-2), output);

		output=t.Cos(-2);
		assertEquals(Math.cos(-2), output);
		
		output=t.Tan(2);
		assertEquals(Math.tan(-2), output);
	}

}
