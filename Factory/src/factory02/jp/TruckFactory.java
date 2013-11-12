package factory02.jp;

public class TruckFactory extends CarFactory {

	@Override
	public Car createInstrument() {
		return new Truck();
	}

}
