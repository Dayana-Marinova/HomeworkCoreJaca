package hackbulgariaCollections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Sets {
	public static int elementSet(Set<Integer> first, Set<Integer> second, Set<Integer> third){
		for (Integer item : first){
			if (second.contains(item) && third.contains(item)){
				return item;
			}
		}
		
		return -1;
	}
	
	public static void main(String[] args) {
		Set<Integer> A = new HashSet<Integer>();
		A.addAll( Arrays.asList(1, 2, 3, 4, 5));
		Set<Integer> B = new HashSet<Integer>();
		B.addAll( Arrays.asList(4, 5, 6));
		Set<Integer> C = new HashSet<Integer>();
		C.addAll( Arrays.asList(5, 6, 7));
		System.out.println(elementSet(A, B, C));
	}
}
