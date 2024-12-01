package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class product{
	int id;
	String name;
	double price;


public product(int id,String name,double price) {
	this.id=id;
	this.name=name;
	this.price=price;
}
}
public class FilterDemofour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<product> productlist=new ArrayList<product>();
		productlist.add(new product(1,"Radha",108));
		productlist.add(new product(2,"Govinda",1010));
		productlist.add(new product(12,"Madhusudan",1008));
		productlist.add(new product(12,"Govardhan",1009));
		productlist.add(new product(12,"Ram",10089));
		
		//productlist.stream().filter(p->p. price>110).forEach(pr->System.out.println(pr.price));
		
		List<product> expensiveProduct=productlist.stream().filter(pr->pr.price<10000).collect(Collectors.toList());
		expensiveProduct.forEach(pr->System.out.println(pr.price));
		//System.out.println(expensiveProduct);
		
	}

}
