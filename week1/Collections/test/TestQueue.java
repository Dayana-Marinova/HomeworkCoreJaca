import static org.junit.Assert.*;
import hackbulgariaCollections.BoundedQueue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class TestQueue {

	private BoundedQueue<Integer> first = new BoundedQueue<>(3);
    private BoundedQueue<Integer> second = new BoundedQueue<>(3);

   @Before
   public void setUp() throws Exception {
        this.first = new BoundedQueue<>(3);
        this.second = new BoundedQueue<>(3);
   }

   @After
   public void tearDown() throws Exception {
   }

   @Test
   public void test() {
       
       first.offer(1);
       first.offer(2);
       first.offer(3);
       first.offer(4);
       first.offer(5);
       first.offer(6);

       second.offer(4);
       second.offer(5);
       second.offer(6);

       assertEquals(first, second);
   }

}
