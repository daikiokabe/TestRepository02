package factory02.jp;

public abstract class CarFactory {
	private String name;
	private int price;

	private void mark(Car car) {
		car.setName(name);
		car.setPrice(price);
	}

	public Car create() {
		Car car  = createInstrument();
		mark(car);
		return car;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public abstract Car createInstrument();
}
