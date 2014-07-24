package hackbulgariaCollections;

import java.util.LinkedList;

public class BoundedQueue<T> extends LinkedList<T>{
	/**
	 * 
	 */
	private static final long serialVersionUID = 2608053177169689688L;
	int size;
	
	public BoundedQueue(int size){
		this.size = size;
	}
	
	@Override
	public boolean offer(T element){
		if (element == null) {
            return false;
        }
        if (this.size() == size) {
            this.remove();
            this.add(element);
        } else {
            this.add(element);
        }
		return true;
	}
	
	public static void main(String[] args) {
		BoundedQueue<Integer> boundedQueue = new BoundedQueue<>(3);
        boundedQueue.offer(1);
        boundedQueue.offer(2);
        boundedQueue.offer(3);
        boundedQueue.offer(4);
        boundedQueue.offer(5);
        System.out.println(boundedQueue.toString());
	}
}
