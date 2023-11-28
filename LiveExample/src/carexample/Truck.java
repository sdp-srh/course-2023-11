package carexample;

public class Truck extends Car implements LoadingArea {

	int capacity = 0;
	
	public Truck(int price) {
		super(price);
	}

	@Override
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	@Override
	public int getCapacity() {
		return capacity;
	}
	

}
