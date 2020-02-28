package assn2swtest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EquivTest {

	@Test
	void test() {
		trigFunc t = new trigFunc();
		int output=t.Sin(0);
		assertEquals(Math.sin(0), output);

		output=t.Cos(0);
		assertEquals(Math.cos(0), output);
		
		output=t.Tan(0);
		assertEquals(Math.tan(0), output);
	}

}
