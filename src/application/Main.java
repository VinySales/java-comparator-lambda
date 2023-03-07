package application;

import java.util.ArrayList;
import java.util.List;

import entities.Product;

public class Main {

	public static void main(String[] args) {
		
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("Iphone 13", 4000.0));
		list.add(new Product("Iphone X", 2000.0));
		list.add(new Product("Iphone 11", 2500.0));
		list.add(new Product("Iphone 12", 3000.0));
		
//		Consumer
		list.forEach(l -> l.setPrice(l.getPrice() * 1.1));

		for (Product product : list) {
			System.out.println(product);
		}
	}

}
