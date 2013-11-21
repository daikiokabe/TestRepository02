package other;

import idcard.IDCardFactory;

import java.util.List;

import framework.Factory;
import framework.Product;
import gcard.GCardFactory;

public class Main {
	public static void main(String args[]){
		Factory factory = new IDCardFactory();
		Product card1 = factory.create("結城浩");
		Product card2 = factory.create("とむら");
		Product card3 = factory.create("佐藤花子");

		Factory factory2 = new GCardFactory();
		Product card4 = factory2.create("okabe");
		Product card5 = factory2.create("tanaka");

		card1.use();
		card2.use();
		card3.use();

		List<String> owners = ((IDCardFactory)factory).getOwners();
		for(String s : owners)
			System.out.println(s);

		card4.use();
		card5.use();
	}
}
