import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListMethods {
	
	public static List<Integer> sortFunction(List<Integer> list){
		List<Integer> sortedList = new ArrayList<Integer>(list);
		Collections.sort(sortedList);
		return sortedList;		
	}
	
	public static List<Integer> reverseFunction(List<Integer> list){
		List<Integer> reversedList = new ArrayList<Integer>(list);
		Collections.reverse(reversedList);
		return reversedList;
	}
	
	public static boolean isMonotonous(List<Integer> list){
		if (isDecreasing(list) || isGrowing(list)){
			return true;
		}
		return false;
	}
	
	public static boolean isDecreasing(List<Integer> list){
		for (int i = 0; i+1 < list.size() - 1; i++){
			if (list.get(i) < list.get(i+1)){
				return false;
			}
		}
		return true;
	}
	
	public static boolean isGrowing(List<Integer> list){
		for (int i = 0; i < list.size() - 1; i++){
			if (list.get(i) > list.get(i+1)){
				return false;
			}
		}
		return true;
	}
}
