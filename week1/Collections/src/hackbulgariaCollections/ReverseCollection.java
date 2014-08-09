package hackbulgariaCollections;

import java.util.Collection;
import java.util.Stack;

public class ReverseCollection {
	
	static Stack<Integer> stack = new Stack<Integer>();
	
	public ReverseCollection(){
	}
	
	public static void reverseCollection(Collection<Integer> collection){
		
		for (Integer item : collection){
			stack.push(item);
		}

		collection.clear();
		
		while(!stack.isEmpty()){
			collection.add(stack.pop());
		}
	}
}
