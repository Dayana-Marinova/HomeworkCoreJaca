import static org.junit.Assert.*;

import hackbulgariaCollections.RotateCollection;

import java.util.LinkedList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class TestRotation {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
	
	@Test
	public void test(){
		LinkedList<Integer> list1 = new LinkedList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        
        LinkedList<Integer> list2 = new LinkedList<>();
        list2.add(3);
        list2.add(1);
        list2.add(2);
        
        RotateCollection.rotate(list1, 1);
        
        
        assertEquals(list2, list1);
	}
	
	@Test
	public void test1(){
		LinkedList<Integer> list1 = new LinkedList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        
        LinkedList<Integer> list2 = new LinkedList<>();
        list2.add(2);
        list2.add(3);
        list2.add(1);
        
        RotateCollection.rotate(list1, 2);
        
        
        assertEquals(list2, list1);
	}
	
	@Test
	public void test2(){
		LinkedList<Integer> list1 = new LinkedList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        
        LinkedList<Integer> list2 = new LinkedList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        
        RotateCollection.rotate(list1, 3);
        
        
        assertEquals(list2, list1);
	}
	
	@Test
	public void test3(){
		LinkedList<Integer> list1 = new LinkedList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        
        LinkedList<Integer> list2 = new LinkedList<>();
        list2.add(2);
        list2.add(3);
        list2.add(1);
        
        RotateCollection.rotate(list1, -2);
        
        
        assertEquals(list2, list1);
	}
	
	

}
