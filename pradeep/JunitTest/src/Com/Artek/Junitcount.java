package Com.Artek;

import static org.junit.Assert.*;

import org.junit.Test;

public class Junitcount {

	@Test
	public void test() {
		 Juntitest test = new Juntitest();
		 int output = test.count("panwar");
		 assertEquals(2, output);
	}

}
