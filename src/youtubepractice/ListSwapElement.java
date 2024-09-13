package youtubepractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSwapElement {
public static void main(String[] args) {
	List<Integer>ls=new ArrayList<>();
	ls.add(1);
	ls.add(2);
	ls.add(3);
	ls.add(4);
	ls.add(5);
	System.out.println(ls);
	Collections.swap(ls, 1, 3);
	
	System.out.println(ls);
	
}
}
