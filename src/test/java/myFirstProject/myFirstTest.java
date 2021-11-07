package myFirstProject;

//import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class myFirstTest {

	@Test
	void test() {
		// create an object from class = myFirstClass
		myFirstClass squareFunction = new myFirstClass();
		//call the square function with value = 7 and store it to a variable = result 
		int result = squareFunction.square(7);
		Assertions.assertEquals(49, result);
		
	}

}
