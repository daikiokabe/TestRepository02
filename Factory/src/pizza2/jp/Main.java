package pizza2.jp;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		PizzaStore nyStore = new NYStylePizzaStore(new SimplePizzaFactory());

		Pizza pizza = nyStore.orderPizza("チーズ");
		System.out.println("イーサンの注文は" + pizza.getName());
	}

}
