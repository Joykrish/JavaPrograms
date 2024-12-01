package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ProductList {
	int id;
	String name;
	double price;

	ProductList(int id, String name, double price) {
		this.id = id;
		this.name = name;
		this.price = price;

	}

	public static void main(String[] args) {
		
		List<ProductList> prlist=new ArrayList<ProductList>();
		prlist.add(new ProductList(12,"Laptop",1200));
		prlist.add(new ProductList(13,"Ram",2000));
		prlist.add(new ProductList(14,"Mouse",12000));
		prlist.add(new ProductList(15,"Keypad",5000));
		
		prlist.stream().filter(pr->pr.price>10000).forEach(pr->System.out.println(pr.price));
		
	}
	
	

}
