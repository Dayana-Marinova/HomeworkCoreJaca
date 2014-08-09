import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestCar {

	private Audi audi = new Audi("audi@1243", 12, "blue");
	private Opel opel = new Opel("opel@32543", 5, "red");
	private BMV bmv = new BMV("BMV@658476", 10, "black");
	
	@Before
	public void SetUp() throws Exception{
		
	}
	
	@After
	public void tearDown() throws Exception{
		
	}
	
	@Test
	public void carTest(){
		assertEquals("Model of this car is: audi@1243 Age is: 12 Color is: blue", audi.toString());
		assertEquals("Model of this car is: opel@32543 Age is: 5 Color is: red", opel.toString());
		assertEquals("Model of this car is: BMV@658476 Age is: 10 Color is: black", bmv.toString());
	}
}
