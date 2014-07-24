package hackbulgariaCollections;

public class Student {
	
	private String name;
	private int grade;
	
	public Student(String name, int grade){
		this.name = name;
		this.grade = grade;
	}
	
	public String getName(){
		return this.name;
	}
	
	public int getGrade(){
		return this.grade;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public void setGrade(int grade){
		this.grade = grade;
	}
	
	@Override
    public boolean equals(Object obj){
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }

        Student student = (Student) obj;
        return (name == student.name 
                     || (name != null && name.equals(student.getName())))
                && (grade == student.grade 
                     || (grade != 0 &&  grade == student.getGrade()));
    }
	
	@Override
    public String toString(){
        return String.format("%s:%s", this.name, this.grade);
    }

}
