package consturctorPractice;

public class StudentsP {
	String studentName;//="Raman";
	int StudentRollNumber;//=108;
	
	public StudentsP(String studentName,int StudentRollNumber ) {
		this.studentName =studentName;
		this.StudentRollNumber=StudentRollNumber;
	}
	public static void main(String[] args) {
		StudentsP s1=new StudentsP("Joy",108);
		
		System.out.println(s1.studentName);
		System.out.println(s1.StudentRollNumber);
		
		
//		StudentsP s1=new StudentsP();
//		//s1.studentInfo("Jay", 1);
//		
//		
//		StudentsP s2=new StudentsP();
//		//s2.studentInfo("Madan", 2);
//		
//		StudentsP s3=new StudentsP();
//		
//		StudentsP s4=new StudentsP();
//		
//		StudentsP s5=new StudentsP();
		
//		System.out.println(s1.studentName);
//		System.out.println(s1.StudentRollNumber);
//		
//		System.out.println(s2.studentName);
//		System.out.println(s2.StudentRollNumber);
//		
//		System.out.println(s3.studentName);
//		System.out.println(s3.StudentRollNumber);
//		
//		System.out.println(s4.studentName);
//		System.out.println(s4.StudentRollNumber);
	}
	
//	
//	public void studentInfo(String sName,int Snumber) {
//		studentName=sName;
//		StudentRollNumber=Snumber;
//		
//	}

}
