package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DemoTwoFlashMap {
	
	public static void main(String[] args) {
		List<String> teamA=Arrays.asList("Madhusudan","mukunda","Madhav");
		List<String> teamB=Arrays.asList("Hari","Haribol","harsh");
		List<String> teamC=Arrays.asList("Giriraj","Govardhan","Guru");
		
		
		List<List<String>>PlayersinWorkCup=Arrays.asList(teamA,teamB,teamC);
//		
//		List<List<String>>PlayersinWorkCup=new ArrayList<List <String>>();
//		PlayersinWorkCup.add(teamA);
//		PlayersinWorkCup.add(teamB);
//		PlayersinWorkCup.add(teamC);
		//before java 8
		
		for(List<String> team:PlayersinWorkCup) {
			  
			for(String name:team) {
				System.out.println(name);
			}
			//System.out.println(str);
			
		}
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
		//using stream flatmap
		List<String> names=PlayersinWorkCup.stream().flatMap(pList->pList.stream()).map(wd->wd.toUpperCase()).collect(Collectors.toList());
		System.out.println(names);
	}

}
