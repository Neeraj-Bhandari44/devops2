package neeraj1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AppTest {

	@Test
	void test() {
		Neeraj obj =new Neeraj();
		assertEquals(obj.fun(),"hello world");
	}

}
