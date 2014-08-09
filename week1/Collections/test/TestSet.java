import static org.junit.Assert.*;

import hackbulgariaCollections.Sets;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class TestSet {

	@Before
	public void setUp() throws Exception{
		
	}
	
	@After
	public void tearDown() throws Exception{
		
	}
	
	@Test
	public void test(){
		Set<Integer> A = new HashSet<Integer>();
		A.addAll( Arrays.asList(1, 2, 3, 4, 5));
		Set<Integer> B = new HashSet<Integer>();
		B.addAll( Arrays.asList(4, 5, 6));
		Set<Integer> C = new HashSet<Integer>();
		C.addAll( Arrays.asList(5, 6, 7));
		
		assertEquals(5, Sets.elementSet(A, B, C));
	}
	
	@Test
	public void test1(){
		Set<Integer> A = new HashSet<Integer>();
		A.addAll( Arrays.asList(1, 2, 3, 4));
		Set<Integer> B = new HashSet<Integer>();
		B.addAll( Arrays.asList(4, 5, 6));
		Set<Integer> C = new HashSet<Integer>();
		C.addAll( Arrays.asList(5, 6, 7));
		
		assertEquals(-1, Sets.elementSet(A, B, C));
	}

}
