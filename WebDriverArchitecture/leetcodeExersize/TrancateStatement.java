package leetcodeExersize;

public class TrancateStatement {
public static void main(String [] args) {
	
	String str="Hare Krishna Govinda Mukunda Rama Lakshmana";
	System.out.println(truncateStatmentOne(str,4));
	System.out.println(truncateStatmentTwo(str,4));
	
}


public static String truncateStatmentOne(String s,int k) {
	
	String[] st=s.split(" ");
	StringBuffer sb=new StringBuffer();  
	
	 
	for(int i=0;i<k;i++) {
		sb.append(st[i]+" ");
	}
	
	return sb.toString();
}

public static String truncateStatmentTwo(String s,int k) {
	
	String[] st=s.split(" ");
	StringBuffer sb=new StringBuffer();
	int index=0;
	while(k!=0) {
		sb.append(st[index]+" ");
		index++;
		k--;
	}
	return sb.toString();
}
}

