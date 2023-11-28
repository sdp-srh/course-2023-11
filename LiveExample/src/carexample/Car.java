package carexample;

public class Car extends Vehicle {

	public static int fuelPrice = 500;

	protected String color;
	protected int weight;
	protected String brand;
	protected String model;
	
	public Car(int price) {
		super(price);	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}

	@Override
	public int getFuelPriceFor100Kilometers() {
		return 10;
	}	
	
	public static void printYear() {
		System.out.println("2023");
	}
	
	
}

