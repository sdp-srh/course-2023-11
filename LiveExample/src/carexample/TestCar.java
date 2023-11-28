package carexample;

public class TestCar {

	public static void main(String[] args) {
		// Vehicle v = new Vehicle(5000);
	
		/*
		Car car = new Car(10000);
		System.out.println(car.getPrice());
		

		System.out.println(car.getFuelPriceFor100Kilometers());
		
		
		Truck t = new Truck(80000);
		t.setCapacity(500);
		
		System.out.println(t.getCapacity());
		*/
		
		Car beetle = new Car(1000);
		beetle.setBrand("VW");
		
		Car porsche = new Car(999999);
		porsche.setBrand("Porsche");
		
		System.out.println(beetle.getBrand());

		System.out.println(porsche.getBrand());
		
		System.out.println(Car.fuelPrice);
				
		Car.printYear();
	}


}
