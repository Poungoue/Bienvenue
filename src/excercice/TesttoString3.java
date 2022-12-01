package excercice;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TesttoString3 {

	@Test
	void testToStringString() {
		Robot bob= new Robot("Robot bob",10);
        Robot john =new Robot("Robot john");
        System.out.println(bob.nom);
        System.out.println(john.nom);
        bob.toString("je suis test 3");
	}

}
