package JDK_1_8_Features.jdk_8_Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Product {
	int id;
	String name;
	double price;

	public Product(int productId, String productName, double productPricr) {
		this.id = productId;
		this.name = productName;
		this.price = productPricr;
	}
}

public class FilterDemo4 {

	public static void main(String[] args) {

		List<Product> productList = new ArrayList<Product>();

		productList.add(new Product(101, "HP Laptop", 25000));
		productList.add(new Product(102, "Dell Laptop", 28000));
		productList.add(new Product(103, "Lenovo Laptop", 23000));
		productList.add(new Product(104, "Sony Laptop", 35000));
		productList.add(new Product(105, "Apple Laptop", 40000));

		// If product of price is >25000, add them in another Collection or print price
		// of that Object

		productList.stream().filter(product -> product.price > 35000).forEach(product -> System.out
				.println(String.format("Product name is: %s and product price is: %.2f", product.name, product.price)));
		
		System.out.println("-----------------------------------");
		
		
		for (Product product : productList) {
			System.out.println("Product name: " + product.name + ", price: " + product.price);
		}
	}

}
