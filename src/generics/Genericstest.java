package generics;

import java.util.ArrayList;

public class Genericstest {
	
	public static void main(String[] args) {
		ArrayList as=new ArrayList();
		
		as.add("test");
		as.add(2);
		as.add(45.34);
		
		String one=(String) as.get(0);
	}

}
