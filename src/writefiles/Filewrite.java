package writefiles;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Filewrite {
	public static void main(String[] args) throws IOException {
		File f=new File(System.getProperty("user.dir")+"\\src\\myFile.txt");
		FileWriter fw=new FileWriter(f,false);
		BufferedWriter writer=new BufferedWriter(fw);
		
		
		for(int i=0;i<4;i++) {
			for(int j=0;j<3;j++) {
				int num=(int)(Math.random()*100);
				writer.write(num+"\t");
			}
			writer.newLine();
		}
		
		//write inside  the file
//		writer.write("First Line Hare");
//		writer.newLine();
//		writer.write("Second Line Radhe");
//		writer.newLine();
//		writer.write("hareKrisna Govardhan");
//		
		writer.close();
		System.out.println("File created!!!!");
	}

}
