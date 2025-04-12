package practicejavaprogramtwo;

import java.util.HashMap;

public class MajorityElementOfArray {

	public static void main(String[] args) {
		int [] arr= {1,2,3,4,3,3,4,3,5,3,7,3,3,3};
		majorityElement(arr);

	}
	
	public static void majorityElement(int [] arr) {
	HashMap<Integer,Integer> mp=new HashMap<Integer,Integer>();
	int count=1;
	for(int i=0;i<arr.length;i++) {
		if(!mp.containsKey(arr[i])) {
			mp.put(arr[i], count);
		}
		else {
			mp.put(arr[i], mp.get(arr[i])+1);
		}
	}
	
	for(Integer a:mp.keySet()) {
		System.out.println(a+":"+mp.get(a));
		if(mp.get(a)>(arr.length/2)) {
			System.out.println("Majority element is "+a);
		}
	}
	
	}

	
}
