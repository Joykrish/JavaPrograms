   package constructor;

public class Student {
	String StudentName;//="Krishna"; //
	int rollnumber;//=108;
	
	
	public Student(String StudentName,int rollnumber ){
		this.StudentName=StudentName;
		this.rollnumber=rollnumber;  7
	}
	public static void main(String[] args) {


		
		Student Stud1=new Student("Govinda", 111);//1)calling the test class constructor
		//Stud1.studentInfo("Govinda", 111);//Do it 2nd  time
		Student Stud2=new Student("Madhusudan", 102);
		//Stud2.studentInfo("Madhusudan", 102);//problem is every time need to call the method explicitly for number of objects
		Student Stud3=new Student("Radha", 104);
		//Stud3.studentInfo("Radha", 104);
		
		
		Student Stud4=new Student("Govardhan",108);
		Student Stud5=new Student("Raman",109);
		
		System.out.println(Stud1.StudentName);
		System.out.println(Stud1.rollnumber);
		
		System.out.println(Stud2.StudentName);
		System.out.println(Stud2.rollnumber);
		
		System.out.println(Stud3.StudentName);
		System.out.println(Stud3.rollnumber);
		
		System.out.println(Stud5.StudentName);
		System.out.println(Stud5.rollnumber);
		
		//2)Whenever I create student object at that time only I want to assign values for name and rollnumber to the object

	}
//public void studentInfo(String sName,int rNum) {//do it second  time
//	StudentName=sName;
//	rollnumber=rNum;
//	
//}
}
