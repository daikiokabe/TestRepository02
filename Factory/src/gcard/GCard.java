package gcard;

import framework.Product;

public class GCard extends Product {
	private String owner;

	GCard(String owner) {
		System.out.println(owner + "のGカードを作ります");
		this.owner = owner;
	}

	@Override
	public void use() {
		System.out.println(owner + "のGカードを使います");
	}

	public String getOwner() {
		return owner;
	}

}
