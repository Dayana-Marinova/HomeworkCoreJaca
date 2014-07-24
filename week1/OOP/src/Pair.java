
public final class Pair {
	
	Object pair1;
	Object pair2;
	
	public Pair(){
	}
	
	public Pair(Object object1, Object object2){
		this.pair1 = object1;
		this.pair2 = object2;
	}
	
	public String toString(){
		return "First object is: " + this.pair1 + ", Second object is:" + this.pair2; 
	}
	
	public void setPair1(Object object1){
		pair1 = object1;
	}
	
	public Object getPair1(){
		return pair1;
	}
	
	public void setPair2(Object object2){
		pair2 = object2;
	}
	
	public Object getPair2(){
		return pair2;
	}
	
	public boolean equals(Pair one, Pair two){
		if (one.pair1.equals(two.pair1) && one.pair2.equals(two.pair2)) {
            return true;
        } else {
            return false;
        }
	}
}
