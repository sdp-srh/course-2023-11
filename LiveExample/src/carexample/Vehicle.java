package carexample;

public abstract class Vehicle {
	protected int price = -1;
	
	public Vehicle(int price) {
		this.price = price;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	public abstract int getFuelPriceFor100Kilometers();
	
	
}
