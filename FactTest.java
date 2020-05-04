package assn2swtest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FactTest {

	@Test
	void test() {
		trigFunc t = new trigFunc();
		int foutput=t.fact(4);
		assertEquals(24, foutput);
		
		foutput=t.fact(6);
		assertEquals(720, foutput);
	}

}
