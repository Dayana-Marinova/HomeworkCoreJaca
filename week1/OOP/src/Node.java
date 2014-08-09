
public class Node {
	
	Object obj;
	Node privious;
	Node next;
	
	public Node(Object obj){
		this.obj = obj;
	}
	
	public String toString(){
		return this.obj.toString();
	}
}
