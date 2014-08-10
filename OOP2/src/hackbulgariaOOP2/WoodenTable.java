package hackbulgariaOOP2;

public class WoodenTable extends Furniture {

	public WoodenTable(int price) {
		super(price);
	}

	@Override
	public String getDescription() {
		return "A table made of wood";
	}

}
