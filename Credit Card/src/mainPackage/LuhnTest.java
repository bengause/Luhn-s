package mainPackage;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class LuhnTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		boolean tf = Luhn.Luhns(1209887293420198);
		assertEquals("It passes Luhn's " tf, true);
	}

}
