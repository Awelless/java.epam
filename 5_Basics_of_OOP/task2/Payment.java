package com.awelless;

import java.util.ArrayList;

public class Payment {

	private ArrayList<Product> products;
	
	Payment() {
		products = new ArrayList<>();
	}

	public void addProduct(String productName, int productCost) {
		products.add(new Product(productName, productCost));
	}

	public void removeProduct(String productName) {

		for (Product product : products) {
			if (product.name == productName) {
				products.remove(product);
				break;
			}
		}
	}

	public int getTotalCost() {

		int cost = 0;

		for(Product product : products) {
			cost += product.cost;
		}

		return cost;
	}

	@Override
	public String toString() {

		StringBuilder builder = new StringBuilder();

		for (Product product : products) {
			builder.append(product.toString() + "\n");
		}

		builder.append("Total cost: " + getTotalCost() + "\n");

		return builder.toString();
	}
	
	private static class Product {
		
		private String name;
		private int cost;
		
		private Product(String name, int cost) {
			this.name = name;
			this.cost = cost;
		}

		@Override
		public String toString() {
			return name + ": " + cost;
		}
	}
}
