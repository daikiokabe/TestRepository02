package Factory01.jp;

public class TrumpetCreator extends AbstractCreator {

	@Override
	public WindInstrumentProduct createInstrument() {
		return new Trumpet();
	}

}
