package hackbulgariaCollections;

import java.util.LinkedList;

public class RotateCollection {
	public LinkedList<Integer> rotate(LinkedList<Integer> collection, int rotateStep){
		if (rotateStep >= 0){
			for (int i = 0; i < rotateStep; i++){
				Integer item = collection.get(collection.size() - 1);
				collection.addFirst(item);
				collection.remove(collection.size()-1);
			}
		}
		else if (rotateStep < 0){
			for (int i = rotateStep; i <= 1; i++){
				Integer item = collection.get(0);
				collection.add(item);
				collection.remove(0);
			}
		}
		else if (rotateStep == 0){
			return collection;
		}
		return collection;
	}
	
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		RotateCollection collection = new RotateCollection();
		System.out.println(collection.rotate(list, 0));
		System.out.println(collection.rotate(list, 2));
		System.out.println(collection.rotate(list, -2));
	}
}
