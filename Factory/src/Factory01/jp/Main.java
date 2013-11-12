package Factory01.jp;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		AbstractCreator creator1 = new SaxophoneCreator();
		creator1.setName("サックステスト");
		WindInstrumentProduct product1 = creator1.create();
		product1.printPlate();
		product1.play();

		AbstractCreator creator2 = new TrumpetCreator();
		creator2.setName("トランペットテスト");
		WindInstrumentProduct product2 = creator2.create();
		product2.printPlate();
		product2.play();
	}

}
