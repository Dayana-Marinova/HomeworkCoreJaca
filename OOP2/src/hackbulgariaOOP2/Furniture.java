package hackbulgariaOOP2;

public abstract class Furniture {
	protected int price;
	
	public Furniture(int price){
		this.price = price;
	}
	
	public abstract String getDescription();
}
