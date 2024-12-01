package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class TestOneStudent{
	String name;
	int score;
	
	TestOneStudent(String name,int score){
		this.name=name;
		this.score=score;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getScore() {
		return this.score;
	}
	
}
public class ParellelStrams {
	
	public static void main(String[] args) {
		
		//List<Student> studentList=new ArrayList<Student>();
		List<TestOneStudent> StudentList=Arrays.asList(
				new TestOneStudent("Krishna",100),
				new TestOneStudent("Radha",101),
				new TestOneStudent("Mohan",99),
				new TestOneStudent("Govanrdhan",88),
				new TestOneStudent("Raman",99),
				new TestOneStudent("Shiva",78),
				new TestOneStudent("Ganesha",75)

				);
		//using stream
		StudentList.stream()
		.filter(s->s.getScore()>=80)
		.limit(3)
		.forEach(stu->System.out.println(stu.getName()+" "+stu.getScore()));
		
		System.out.println("---------------------------");
	
		//parallel Stream
		StudentList.parallelStream()
		.filter(s->s.getScore()>=80)
		.limit(3)
		.forEach(stu->System.out.println(stu.getName()+" "+stu.getScore()));
		
		System.out.println("---------------------------");
		//convert normal stream to parallel stream
		StudentList.stream()
		.parallel()
		.filter(s->s.getScore()>=80)
		.limit(3)
		.forEach(stu->System.out.println(stu.getName()+" "+stu.getScore()));
		
	}

}
