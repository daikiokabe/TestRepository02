package Factory01.jp;

public class SaxophoneCreator extends AbstractCreator {

	@Override
	public WindInstrumentProduct createInstrument() {
		return new Saxophone();
	}

}
