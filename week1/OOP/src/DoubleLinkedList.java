
public class DoubleLinkedList {
	
	private Node first;
	private Node last;
	
	public DoubleLinkedList(){
		this.setFirst(null);
		this.setLast(null);
	}

	public Node getFirst() {
		return first;
	}

	public void setFirst(Node first) {
		this.first = first;
	}

	public Node getLast() {
		return last;
	}

	public void setLast(Node last) {
		this.last = last;
	}
	
	public boolean isEmpty(){
		return (this.first == null);
	}
	
	public void push(Object obj){
		Node newElement = new Node(obj);
		
		if (isEmpty()){
			this.first = newElement;
		}
		else{
			last.privious = first;
			last.next = null;
		}
		
		this.last = newElement;
		newElement.next = null;
	}
	
	public String toString(){
		String result = "";
		Node curr = new Node(this.first);
		
		while(curr.next != null){
			result += curr.obj;
			curr = curr.next;
		}
		
		result += curr.obj;
		
		return result;
	}
	
	public void pushBefore(Object obj, Object insertObj){
		Node newElement = new Node(obj);
		
		Node curr = this.first;
		
		if (isEmpty()){
			this.first = newElement;
			newElement.next = null;
		}
		else if(this.first.obj == insertObj){
			this.first.privious = newElement;
			newElement.privious = null;
			newElement.next = this.first;
		}
		else{
			while(!(curr.obj.equals(insertObj))){
				curr = curr.next;
			}
			curr.privious.next = newElement;
			newElement.next = curr;
		}
	}
	
	public void pushAfter(Object obj, Object insertObj){
		Node newElement = new Node(obj);
		
		Node curr = this.first;
		
		if(isEmpty()){
			this.first = newElement;
			newElement.next = null;
		}
		else {
			while(!(curr.obj.equals(insertObj))){
				curr = curr.next;
			}
			newElement.next = curr.next;
			curr.next = newElement;
			newElement.privious = curr;
		}
	}
	
	public void remove(Object obj){
		Node curr = this.first;
		
		if(!isEmpty()){
			while(!(curr.obj.equals(obj))){
				curr = curr.next;
			}
			
			Node currNext = curr.next;
			
			curr = curr.privious;
			curr.next = currNext;
		}
		else{
			System.out.println("Is empty!");
		}
	}
}
