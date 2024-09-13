package fileHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class UisngScannerClass {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader=null;
		File f0 = new File("E:\\names1.txt");
		File f = new File("E:\\names1.txt");
		FileReader f1 = new FileReader(f);
	bufferedReader = new BufferedReader(f1);
		try {
			String line1 = bufferedReader.readLine();
			while (line1 != null) {
				System.out.println(line1);
				line1 = bufferedReader.readLine();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Problem reading file:" + f0.getName());
		}
		
		finally {
			bufferedReader.close();
		}
		Scanner sc = new Scanner(f0);
		while (sc.hasNextLine()) {
			String line = sc.nextLine();
			System.out.println(line);
		}
		sc.close();
	}
}
