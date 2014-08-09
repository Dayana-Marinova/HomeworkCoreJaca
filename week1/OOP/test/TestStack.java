import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class TestStack {

	StackImpl test = new StackImpl();
	
	@Before
	public void setUp() throws Exception{
		
	}
	
	@After
	public void tearDown() throws Exception{
		
	}
	
	@Test
	public void testIsEmpty(){
		StackImpl stack = new StackImpl();
		
		assertTrue(stack.isEmpty());
	}
	
	@Test
	public void testNotIsEmpty(){
		StackImpl stack = new StackImpl();
		
		stack.push(2);
		
		assertTrue(!(stack.isEmpty()));
	}
	
	@Test
	public void testLenght(){
		StackImpl stack = new StackImpl();
		
		stack.push(2);
		stack.push(1);
		
		assertEquals(2, stack.length());
	}
	
	@Test
	public void testClear(){
		StackImpl stack = new StackImpl();
		
		stack.push(2);
		stack.clean();
		
		assertTrue(stack.isEmpty());
	}
}
