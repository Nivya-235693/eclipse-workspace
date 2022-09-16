package test.Demojunit;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class Testcalculator {
	calculator c = null;
	@Before
	public void setup() {
		c = new calculator();
	}
	@Test
	public void testadd() {
		assertEquals(5,c.add(2, 3));
	}
	public void test() {
		fail("Not yet implemented");
	}
}
