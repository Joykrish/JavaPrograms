package fileHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResources {
	public static void main(String[] args) {
		File file=new File("E:\\names1.txt");
		
		try(FileReader fileReader=new FileReader(file);
				BufferedReader bufferedReader=new BufferedReader(fileReader) ){
			String line=bufferedReader.readLine();
			while(line!=null) {
				System.out.println(line);
				line=bufferedReader.readLine();
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("File not found");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Problem reading the file"+file.getName());
		}
	}

}
