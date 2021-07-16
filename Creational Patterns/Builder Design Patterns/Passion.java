
public class Passion extends HeroHonda{

	private String name;
	private int price;
	private int mileage;

	public Passion() {

	}

	public Passion(String name, int price, int mileage) {
		super();
		this.name = name;
		this.price = price;
		this.mileage = mileage;
	}
	
	@Override
	public String getName() {
		return name;
	}

	@Override
	public int getPrice() {
		return price;
	}

	@Override
	public int getMileage() {
		return mileage;
	}

}
