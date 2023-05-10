package filterDemo;
import java.util.*;
class Product{
	int id;
	String name;
	double price;
	
	public  Product(int id,String name, double price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}
}

public class FilterDemo4 {

	public static void main(String[] args) {
		
		List<Product> productList = new ArrayList<>();
		productList.add(new Product(231, "HP", 456));
		productList.add(new Product(451, "Dell", 750));
		productList.add(new Product(732, "Lenovo", 654));
		productList.add(new Product(784, "Apple", 850));
		productList.add(new Product(648, "Asus", 869));
		
		//Sort them by price
		productList.stream()
					.filter(p->p.price>500)
					.forEach(pr->System.out.println(pr.price));;
		
	}

}
