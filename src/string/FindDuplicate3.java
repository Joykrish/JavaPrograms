package string;

public class FindDuplicate3 {
public static void main(String[]args) {
	String str="IS like banana eatingkS";
	String dup="";
	
	for(int i=0;i<str.length();i++) {
		for(int j=i+1;j<str.length();j++) {
			if(str.charAt(i)==str.charAt(j)) {
				if(!dup.contains(Character.toString(str.charAt(i)))) {
					dup+=str.charAt(i)+",";
				}
			}
		}
	}
	System.out.println(dup);
}
}
