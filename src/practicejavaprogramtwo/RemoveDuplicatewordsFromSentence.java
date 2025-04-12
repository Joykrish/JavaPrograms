package practicejavaprogramtwo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatewordsFromSentence {

	public static void main(String[] args) {
		String str = "Hare Krishna Hare Krishna Krishna Krishna Hare Hare Hare Ram Hare Ram Ram Ram Hare Hare";
System.out.println(str.length());
		String[] array = str.split(" ");

		Set<String> set = new LinkedHashSet<String>();

		for (String st : array) {
			set.add(st);

		}
		
		Iterator<String> itr=set.iterator();
		
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}

	}

}
