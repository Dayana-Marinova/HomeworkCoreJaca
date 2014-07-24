package hackbulgariaCollections;

import java.util.Collection;
import java.util.Stack;

public class ReverseCollection {
	
	Stack<Integer> stack = new Stack<Integer>();
	
	public ReverseCollection(){
	}
	
	public void reverseCollection(Collection<Integer> collection){
		
		for (Integer item : collection){
			stack.push(item);
		}

		collection.clear();
		
		while(!stack.isEmpty()){
			collection.add(stack.pop());
		}
	}
}
