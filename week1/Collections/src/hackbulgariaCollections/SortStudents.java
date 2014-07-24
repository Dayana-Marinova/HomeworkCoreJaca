package hackbulgariaCollections;

import java.util.LinkedList;

public class SortStudents {
	public static LinkedList<Student> sortStudents(LinkedList<Student> list){
		
		LinkedList<Student> result = new LinkedList<Student>();
		for (int i = 2; i <= 6; i++){
			for (Student student : list){
				if (i == student.getGrade()){
					result.add(student);
				}
			}
		}
		
		return result;
	}
}
