package hackBulgariaExceptions;

public class DatabaseCorruptedException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public DatabaseCorruptedException(){
		super("Error! Please set name of the user!");
	}
}
