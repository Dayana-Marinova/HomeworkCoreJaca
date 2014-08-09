import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class TestPair {
	
	Pair first = new Pair();
	Pair second = new Pair();

	@Before
	public void setUp() throws Exception{
		
	}
	
	@After
	public void tearDown() throws Exception{
		
	}
	
	@Test
	public void testTostring(){
		first.setPair1(1);
        first.setPair2(2);
		assertEquals("First object is: 1, Second object is:2", first.toString());
	}
	
	@Test
	public void testEguals(){
		first.setPair1(1);
        first.setPair2(2);

        second.setPair1(1);
        second.setPair2(2);
        
        assertEquals(true, Pair.equalss(first, second));
	}
	
	@Test
	public void testNotEguals(){
		first.setPair1(1);
        first.setPair2(2);

        second.setPair1(2);
        second.setPair2(1);
        
        assertEquals(false, Pair.equalss(first, second));
	}
}
