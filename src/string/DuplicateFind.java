package string;

public class DuplicateFind {
	
	public static void main(String[] args) {
		String input="Banana eat";
		String duplicate="";
		String characters="";
		
		
		for(int i=0;i<input.length();i++) {
			String current=Character.toString(input.charAt(i));
			if(characters.contains(current)) {
				if(!duplicate.contains(current)){
					duplicate+=current+",";
				}
				
			}
			characters+=current;
			
			
			
		}
		System.out.println(duplicate);
	}

}
