package hackbulgariaOOP2;

public class IronChair extends Furniture {

	public IronChair(int price) {
		super(price);
	}

	@Override
	public String getDescription() {
		return "Chair made of iron";
	}

}
