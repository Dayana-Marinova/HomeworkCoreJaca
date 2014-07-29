package hackbulgaria.Generics;

public class Box<T> {
	
	private T t;
	
	public Box(){
	}
	
	public Box(T t){
		this.t = t;
	}
	
	public void setT(T t){
		this.t = t;
	}
	
	public T getT(){
		return this.t;
	}
	
	public String toString(){
		return (String)this.t;
	}
}
