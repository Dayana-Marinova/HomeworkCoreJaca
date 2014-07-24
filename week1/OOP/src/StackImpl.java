import java.util.Arrays;


public class StackImpl implements Stack {
	int size = 0;
	int maxSize = 256;
	Object[] objects;
	
	public StackImpl(){
		this.size = 0;
		this.maxSize = 256;
		objects = new Object[maxSize];
	}

	@Override
	public void push(Object object) {
		if (size == objects.length - 1){
			int newSize = objects.length * 2;
			objects = Arrays.copyOf(objects, newSize);
		}
		objects[size++] = object;
	}

	@Override
	public Object pop() {
		Object object = objects[size];
		size--;
		return object;
	}

	@Override
	public Object top() {
		return objects[size];
	}

	@Override
	public boolean isEmpty() {
		return size == 0;
	}

	@Override
	public int length() {
		return size;
	}

	@Override
	public void clean() {
		size = 0;
	}

}
