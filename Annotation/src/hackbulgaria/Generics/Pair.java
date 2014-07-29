package hackbulgaria.Generics;

public class Pair<T, E> {
	
	private T t;
	private E e;
	
	public Pair(){
		
	}
	
	public Pair(T t, E e){
		this.t = t;
		this.e = e;
	}
	
	public void setT(T t){
		this.t = t;
	}
	
	public void setE(E e){
		this.e = e;
	}
	
	public T getT(){
		return this.t;
	}
	
	public E getE(){
		return this.e;
	}
	
	public String toString(){
		return "< " + this.t + ", " + this.e + ">";
	}
	
	public T first(){
		return this.t;
	}
	
	public E second(){
		return this.e;
	}
}
