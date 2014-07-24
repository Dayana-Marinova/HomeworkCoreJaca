package hackbulgariaCollections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class FirstUniqueElement {
	public static int firstElement(Collection<Integer> ints){
		ArrayList<Integer> list = new ArrayList<Integer>(ints);
		for (int i = 0; i < list.size(); i++){
			Integer item = list.get(0);
			list.remove(0);
			if (!list.contains(item)){
				return item;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		Collection<Integer> ints = Arrays.asList(1,2,3,4,5,5,4,3,1);
		System.out.println(firstElement(ints));
	}
}
