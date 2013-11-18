package pizza2.jp;

public class NYStylePizzaStore extends PizzaStore {

	//public NYStylePizzaStore(SimplePizzaFactory factory) {
	//	super(factory);
	//}

	@Override
	public Pizza createPizza(String type) {

		Pizza pizza = null;

		if(type.equals("チーズ")) {
			pizza = new NYStyleCheesePizza();
			pizza.setName("ニューヨークスタイルチーズピザ");
		} else if(type.equals("野菜")) {
			pizza = new NYStyleVeggiePizza();
			pizza.setName("ニューヨークスタイル野菜ピザ");
		}
		return pizza;
	}

}
