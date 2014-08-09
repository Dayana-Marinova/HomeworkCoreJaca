import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.After;
import org.junit.Before;


public class TestTime {
	
	@Before
	public void SetUp() throws Exception{
		
	}
	
	@After
	public void tearDown() throws Exception{
		
	}

	@Test
	public void test(){
		
		Time test = new Time(1, 2, 3, 4, 5, 6);
		
		assertEquals("6:5:4 1.2.3", test.toString());
	}
}
