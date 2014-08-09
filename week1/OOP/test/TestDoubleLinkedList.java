import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class TestDoubleLinkedList {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testIsEmpty() {
        DoubleLinkedList doubleLinkedList = new DoubleLinkedList();
        
        assertTrue(doubleLinkedList.isEmpty());
    }

    @Test
    public void testPushAndTostring(){
    	DoubleLinkedList doubleLinkedList = new DoubleLinkedList();
    	
    	doubleLinkedList.push(2);
    	
    	assertEquals("2", doubleLinkedList.toString());
    }
    
   
    
    @Test
    public void testPushAfterAndTostring(){
    	DoubleLinkedList doubleLinkedList = new DoubleLinkedList();
    	
    	doubleLinkedList.push(2);
    	doubleLinkedList.push(3);
    	doubleLinkedList.pushAfter(1, 2);
    	
    	assertEquals("213", doubleLinkedList.toString());
    }
    
    @Test
    public void testRemove(){
    	DoubleLinkedList doubleLinkedList = new DoubleLinkedList();
    	
    	doubleLinkedList.push(2);
    	doubleLinkedList.push(3);
    	doubleLinkedList.remove(2);
    	
    	assertEquals("2", doubleLinkedList.toString());
    }
}
