package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class TestClassTwo {

	String name;
	int sId;
	char grade;

	public TestClassTwo(String name, int sId, char grade) {

		super();
		this.name = name;
		this.sId = sId;
		this.grade = grade;
	}
}

public class TestClass {
	public static void main(String[] args) {

		List<TestClassTwo> st1 = Arrays.asList(new TestClassTwo("Ram", 1, 'a'), new TestClassTwo("madhu", 2, 'm'),
				new TestClassTwo("Sita", 3, 's'));
		List<TestClassTwo> st2 = Arrays.asList(new TestClassTwo("Rama", 1, 'r'), new TestClassTwo("madhuSudan", 2, 's'),
				new TestClassTwo("SitaRam", 3, 'm'));
		
		
		List<List<TestClassTwo>> finalStudent=Arrays.asList(st1,st2);
		
		for(List<TestClassTwo> ls:finalStudent) {
			for(TestClassTwo t:ls) {
				System.out.println(t.name);
				
			}
		}

		List<String> finallistone=finalStudent.stream().flatMap(stest->stest.stream()).map(s->s.name).collect(Collectors.toList());
	System.out.println(finallistone);
	}

}
