package assn2swtest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
/*
 For the sake of this assignment, we will ignore the human portion of testing, including walkthroughs and desk checking and jump right into developing test
 cases for automated testing
 As the program does not have multiple inputs and different parts of the code, or differing possibility,
 We will not begin the testing process with test cases from cause-effect graphing and immediately jump into black box techniques 
  */
class Tester {
//We begin with boundary value analysis
//As the function takes in an integer as value, we will explore the largest and smallest value it can take as input as well as the two just outside those
//constraints
	@Test
	void test() {
		//first check inside the range of the integer
		//largest test
		trigFunc t = new trigFunc();
		int output=t.Sin(2147483647);
		assertEquals(Math.sin(2147483647), output);
		//it fails
		
		//smallest test
		output=t.Sin(-2147483648);
		assertEquals(Math.sin(-2147483648), output);
		//as does this one
		
	}

}
