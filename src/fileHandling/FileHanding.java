package fileHandling;

import java.io.File;
import java.io.IOException;

public class FileHanding {
	public static void main(String[] args) throws IOException {
		try {
		File f0=new File("E:\\names1.txt");
		if(f0.createNewFile()) {
			System.out.println("File "+f0.getName() +" is created");
		}
		else {
			System.out.println("File already  exist in the directory");
		}
		}
		catch(IOException  e ) {
		System.out.println("An unexpected error");	
		e.printStackTrace();
		}
	}

}
