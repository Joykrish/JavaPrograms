package practicejavaprogramtwo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteDataIntextFile {
	public static void main(String[] args) throws IOException {
		FileWriter fw=new FileWriter("E:\\names1.txt");
		BufferedWriter bf=new BufferedWriter(fw);
		bf.write("Hare Krishna12");
		bf.append("\nHare Krishna One Test");
		
		System.out.println("Finished");
		bf.close();
	}
	


}
