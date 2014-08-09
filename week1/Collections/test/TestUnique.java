import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import hackbulgariaCollections.FirstUniqueElement;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class TestUnique {
	
	@Before
	public void setUp() throws Exception{
		
	}
	
	@After
	public void tearDown() throws Exception{
		
	}
	
	@Test
	public void test(){
		Collection<Integer> ints = Arrays.asList(1,2,3,4,5,5,4,3,1);
		
		assertEquals(2, FirstUniqueElement.firstElement(ints));
	}
	
	public void test1(){
		Collection<Integer> ints = Arrays.asList(1,2,3,4,5,5,4,3);
		
		assertEquals(1, FirstUniqueElement.firstElement(ints));
	}
	
	public void test2(){
		Collection<Integer> ints = Arrays.asList(1,2,3,4,5,5,4,3,2,1);
		
		assertEquals(-1, FirstUniqueElement.firstElement(ints));
	}

}
