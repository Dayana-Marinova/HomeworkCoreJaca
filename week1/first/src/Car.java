public class Car {
	
	String model;
	int age;
	String color;
	
	public Car(String model, int age, String color){
		this.model = model;
		this.age = age;
		this.color = color;
	}
	
	public String toString(){
		return "Model of this car is: " + this.model + " Age is: " + this.age + " Color is: " + this.color;
	}
	
	public static void main(String[] args) {
        Car myCar = new Audi("A6", 5, "blue");
        System.out.println(myCar.toString());
    }
}