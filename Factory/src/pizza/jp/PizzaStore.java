package pizza.jp;

public abstract class PizzaStore {

	SimplePizzaFactory factory;

	public PizzaStore(SimplePizzaFactory factory) {
		this.factory = factory;
		//生成する部分を別にする→「SimpleFactoryパターン」
	}

	public Pizza orderPizza(String type) {
		Pizza pizza = null;

		pizza = factory.createPizza(type);

		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();

		return pizza;
	}

	abstract public Pizza createPizza(String type);
}
