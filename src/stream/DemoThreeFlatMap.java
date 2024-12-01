package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Student {
	String name;
	int sid;
	char grade;

	Student(String name, int sid, char grade) {
		this.name = name;
		this.sid = sid;
		this.grade = grade;

	}

}

public class DemoThreeFlatMap {

	public static void main(String[] args) {
		List<Student> StudentListOne = new ArrayList<Student>();
		StudentListOne.add(new Student("Krishna", 108, 'A'));
		StudentListOne.add(new Student("Mukunda", 110, 'B'));
		StudentListOne.add(new Student("Madhu", 120, 'C'));

		List<Student> StudentListTwo = new ArrayList<Student>();
		StudentListTwo.add(new Student("Radha", 104, 'A'));
		StudentListTwo.add(new Student("Lalita", 120, 'B'));
		StudentListTwo.add(new Student("Vishakha", 125, 'C'));

		List<List<Student>> StudentList = Arrays.asList(StudentListOne, StudentListTwo);

		// before java8

		for (List<Student> st : StudentList) {
			for (Student s : st) {
				System.out.println(s.name);
			}
		}
		// using streams

		List<String> st = StudentList.stream().flatMap(stuList -> stuList.stream()).map(s -> s.name)
				.collect(Collectors.toList());
		System.out.println(st);

	}

}
