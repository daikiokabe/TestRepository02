package pizza2.jp;

public class CheesePizza extends Pizza {

	PizzaIngredientFactory ingredientFactory;

	public CheesePizza(PizzaIngredientFactory ingredientFactory) {
		this.ingredientFactory = ingredientFactory;
	}

	@Override
	public void prepare() {
		System.out.println(name + "を処理");
		dough = ingredientFactory.createDough();
		souce = ingredientFactory.createSouce();
		cheese = ingredientFactory.createCheese();
		clam = ingredientFactory.createClam();
		veggies = ingredientFactory.createVeggies();
	}

}
