package excercice;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TesttoString {

	@Test
	void testToStringString() {
		 Robot r1= new Robot("D2R2",10);
         Robot r2= new Robot("Data",10);
         Arena A= new Arena(r1,r2);
         A.fight(r1, r2);
         r1.toString("je suis un test");
	}

}
