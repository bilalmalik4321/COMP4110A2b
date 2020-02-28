For the sake of this assignment, we will ignore the human portion of testing, including walkthroughs and desk checking and jump right into
developing test cases for automated testing. As the program does not have multiple inputs and different parts of the code, 
or differing possibility, we will not begin the testing process with test cases from cause-effect graphing and immediately jump into black
box techniques.

We begin by attempting boundary value analysis.

Test2.java is the first JUnit test case that is run, the test is a value just outside the bonds of the input parameter, an integer. The
values 2147483648 and -2147483649 should and clearly do fail. Alongside this, the tsin libraries from math also fail for these inputs, so 
it should be know that the failed test run occurs because of this not a computational error.

Tester.java is then run, it surprisingly fails as well. This is because of the algorithm in place in v1. It stores its divisible value 
into an int instead of a float that can handle the decimal values. This shall be implemented in the next version.

Next we look at Equivalence partitions.

Breaking up into valid and invalid classes, we look first in valid. One partition can be that of zero, this will have to call the base case
immeditely in the algorithm. The only case where this works is sin, which begins at zero, thus its basecase is easy to compute. Cos and tan
have the problem that the equation needs to be run at last for them, as well as the fact that Math.tan, Math.cos, and Math.sin return doubles.

