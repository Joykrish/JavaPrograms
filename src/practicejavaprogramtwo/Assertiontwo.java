package practicejavaprogramtwo;

public class Assertiontwo {
	public static void main(String[] args) {
		String[] weekends= {"Monday","Friday","Saturday"};
		
		assert weekends.length==3;
		System.out.println("There are "+weekends.length+" weekends in a week ");
	}

}
