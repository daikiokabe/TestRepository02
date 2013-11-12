package factory02.jp;

public abstract class Car {
	private String name;
	private int price;

	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void printDisplay() {
		System.out.println("名前 : " + name);
		System.out.println("値段 : " + price + "円");
	}

	public abstract void drive();
}
