package JDK_1_8_Features.jdk_8_Streams;

import java.util.ArrayList;
import java.util.List;

class ProductData {
	int id;
	String name;
	double price;

	public ProductData(int productId, String productName, double productPricr) {
		this.id = productId;
		this.name = productName;
		this.price = productPricr;
	}
}

public class FilterdemoPractice2 {
	
	public static void main(String[] args) {
		
		List<ProductData> productList = new ArrayList<ProductData>();
		
		productList.add(new ProductData(101, "HPLaptop", 122598.35));
		productList.add(new ProductData(102, "DellLaptop", 850000.35));
		productList.add(new ProductData(103, "APPleLaptop", 125000.35));
		productList.add(new ProductData(104, "LenovoLaptop", 51000.35));
		productList.add(new ProductData(101, "HIntelLaptop", 35000.35));
		
		//If Price of product id >65000 then add them in another List or print it.
		
		productList.stream().filter(product->product.price>65000)
		.forEach(product->System.out.println(String.format("Product Name is: %s and product price is: %.2f and productId is: %d", product.name, product.price, product.id)));
	
	}

}
