package factory02.jp;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		CarFactory factory = new BusFactory();
		factory.setName("大型バス");
		factory.setPrice(21000000);
		Car car = factory.create();
		car.printDisplay();
		car.drive();

		factory = new TruckFactory();
		factory.setName("デコトラ");
		factory.setPrice(1000000);
		car = factory.create();
		car.printDisplay();
		car.drive();
	}

}
