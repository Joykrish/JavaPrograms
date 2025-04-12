package practicejavaprogramtwo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadDataFromTextFile {
	public static void main(String[] args) throws IOException {
		//byFileReader();
		//byScanner();
		useDelimeter();
	}

	public static void byFileReader() throws IOException {
		FileReader fr1 = new FileReader("E:\\names.txt");

		BufferedReader br = new BufferedReader(fr1);

		String str;

		while ((str = br.readLine()) != null) {
			System.out.println(str);

		}
		br.close();
	}
	
	public static void byScanner() throws FileNotFoundException {
		File f=new File("E:\\names.txt");
		Scanner sc=new Scanner(f);
		while(sc.hasNext()) {
			System.out.println(sc.nextLine());
		}
		
	}
	
	public static void useDelimeter() throws FileNotFoundException {
		File f=new File("E:\\names.txt");
		Scanner sc=new Scanner(f);
		sc.useDelimiter("\\z");
		System.out.println(sc.next());
		
		
	}

}
