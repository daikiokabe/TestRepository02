package pizza2.jp;

public interface PizzaIngredientFactory {
	public Dough createDough();
	public Souce createSouce();
	public Cheese createCheese();
	public Veggies[] createVeggies();
	public Pepperoni createPepperoni();
	public Clams createClam();
}
