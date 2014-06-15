import static org.junit.Assert.*;

import java.util.List;
import java.util.Arrays;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class TestsForListMethods {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
	
	@Test
	public void testSort(){
		List<Integer> listSort = Arrays.asList(new Integer[]{5, 7, 3, 9, 1, 4});
		assertEquals(Arrays.asList(1, 3, 4, 5, 7, 9), ListMethods.sortFunction(listSort));
		assertEquals(listSort, Arrays.asList(5, 7, 3, 9, 1, 4));
	}
	
	@Test
	public void testReverse(){
		List<Integer> listReverse = Arrays.asList(new Integer[]{5, 7, 3, 9, 1, 4});
		assertEquals(Arrays.asList(4, 1, 9, 3, 7, 5), ListMethods.reverseFunction(listReverse));
		assertEquals(listReverse, Arrays.asList(5, 7, 3, 9, 1, 4));
	}
	
	@Test
	public void testMonotonous(){
		List<Integer> listGrowing = Arrays.asList(new Integer[]{1, 2, 3, 4, 5, 6});
		List<Integer> listDecreasing = Arrays.asList(new Integer[]{6, 5, 4, 3, 2, 1, 1, 1});
		List<Integer> listFake = Arrays.asList(new Integer[]{1, 2, 1, 4, 5, 4});
		
		assertEquals(true, ListMethods.isMonotonous(listGrowing));
		assertEquals(true, ListMethods.isMonotonous(listDecreasing));
		assertEquals(false, ListMethods.isMonotonous(listFake));
		
	}
}
