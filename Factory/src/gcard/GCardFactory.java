package gcard;

import framework.Factory;
import framework.Product;

public class GCardFactory extends Factory {

	@Override
	protected Product createProduct(String owner) {
		return new GCard(owner);
	}

	@Override
	protected void registerProduct(Product product) {
		//格納しない
	}

}
