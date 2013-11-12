package factory02.jp;

public class BusFactory extends CarFactory {

	@Override
	public Car createInstrument() {
		return new Bus();
	}

}
