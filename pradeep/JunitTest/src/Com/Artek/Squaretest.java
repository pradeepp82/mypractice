package Com.Artek;

import static org.junit.Assert.*;

import org.junit.Test;

public class Squaretest {

	@Test
	public void test() {
		Juntitest test = new Juntitest();
		int output = test.square(5);
		assertEquals(25, output);
	}

}
