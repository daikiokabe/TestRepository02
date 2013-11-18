package pizza2.jp;

public class NYStylePizzaStore extends PizzaStore {

	public NYStylePizzaStore(SimplePizzaFactory factory) {
		super(factory);
	}

	@Override
	public Pizza createPizza(String type) {

		if(type.equals("チーズ")) {
			return new NYStyleCheesePizza();
		} else if(type.equals("野菜")) {
			return new NYStyleVeggiePizza();
		}
		return null;
	}

}
