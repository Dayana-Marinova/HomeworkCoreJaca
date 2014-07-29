package hackBulgariaExceptions;

public class User {
	
	private String name;
	
	public User(String name){
		this.name = name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return this.name;
	}
	
	public boolean exceptionMethod(String name) throws DatabaseCorruptedException{
		throw new DatabaseCorruptedException();
	}
	
	public static void main(String[] args) throws DatabaseCorruptedException {
		User user = new User("");
		user.exceptionMethod(user.getName());
	}
}
