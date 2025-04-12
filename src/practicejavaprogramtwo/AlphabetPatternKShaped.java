package practicejavaprogramtwo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AlphabetPatternKShaped {
	public static void main(String[] args) {
		int letter=65;
		
		for(int i=0;i<5;i++) {
			for(int j=0;j<5-i;j++) {
				System.out.print((char)(letter +j)+" ");
			}
			System.out.println();
		}
		
		for(int i=5;i>=1;i--) {
			for(int j=0;j<=5-i;j++) {
				System.out.print((char)(letter +j)+" ");
			}
			System.out.println();
		}

	}
}