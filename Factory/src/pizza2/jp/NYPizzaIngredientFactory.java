package pizza2.jp;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

	@Override
	public Dough createDough() {
		return new ThinCrustDough();
	}

	@Override
	public Souce createSouce() {
		return new MarinaraSouce();
	}

	@Override
	public Cheese createCheese() {
		return new ReggianoCheese();
	}

	@Override
	public Veggies[] createVeggies() {
		Veggies veggies[] = {new Galic(), new Onion()};
		return veggies;
	}

	@Override
	public Pepperoni createPepperoni() {
		return new SlicePepperoni();
	}

	@Override
	public Clams createClam() {
		return new FreshClam();
	}

}
