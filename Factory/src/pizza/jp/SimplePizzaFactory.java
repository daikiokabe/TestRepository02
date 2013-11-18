package pizza.jp;

public class SimplePizzaFactory {

	public Pizza createPizza(String type) {
		Pizza pizza = null;

		if (type.equals("チーズ")) {
			pizza = new CheesePizza();

		} else if (type.equals("ギリシャ")) {
			pizza = new GreekPizza();

		} else if (type.equals("ぺパロニ")) {
			pizza = new PepperoniPizza();

		}

		return pizza;
	}
}
