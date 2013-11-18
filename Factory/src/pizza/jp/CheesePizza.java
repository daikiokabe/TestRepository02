package pizza.jp;

public class CheesePizza extends Pizza {
	public CheesePizza() {
		this.setName("チーズピザ");
		dough = "薄いクラスト生地";
		sauce = "マリナラソース";

		toppings.add("粉チーズ");
	}
}
