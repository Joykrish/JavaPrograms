package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseArrayList {
public static void main(String[] args) {
	List<Integer> ls=new ArrayList<Integer>();
	ls.add(1);
	ls.add(2);
	ls.add(3);
	ls.add(4);
	ls.add(5);
	Collections.reverse(ls);
	System.out.println(ls);

}
}
