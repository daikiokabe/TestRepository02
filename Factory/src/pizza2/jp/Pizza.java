package pizza2.jp;

import java.util.ArrayList;

public class Pizza {

	private String name;
	String dough;
	String sauce;
	ArrayList toppings = new ArrayList();

	public void prepare() {
		System.out.println(name + "を下処理");
		System.out.println("生地をこねる……");
		System.out.println("ソースを追加……");
		System.out.println("トッピングを追加:");
		for(int i = 0; i < toppings.size(); i++) {
			System.out.println(" " + toppings.get(i));
		}
	}

	public void bake() {
		System.out.println("350度で25分間焼く");
	}

	public void cut() {
		System.out.println("ピザを扇状に切り分ける");
	}

	public void box() {
		System.out.println("PizzaStoreの正式な箱にピザを入れる");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
