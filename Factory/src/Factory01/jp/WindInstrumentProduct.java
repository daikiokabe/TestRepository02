package Factory01.jp;

public abstract class WindInstrumentProduct {
	private String plate; //ネームプレート

	//ネームプレートを付ける
	public void setPlate(String plate) {
		this.plate = plate;
	}

	public void printPlate(){
		System.out.println("名前:" + plate);
	}

	//演奏テスト
	public abstract void play();
}
