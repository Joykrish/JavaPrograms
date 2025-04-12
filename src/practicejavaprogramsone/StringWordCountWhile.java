package practicejavaprogramsone;


	
	public class StringWordCountWhile {
	    public static void main(String[] args) {
	        String sentence = "Java programming is versatile and fun.";
	        int wordCount = 0;
	        int index = 0;

	        // Trim to remove leading or trailing spaces
	        sentence = sentence.trim();

	        // Check if the sentence is not empty
	        if (!sentence.isEmpty()) {
	            wordCount = 1; // Start with 1 because a non-empty trimmed sentence has at least one word

	            while (index < sentence.length()) {
	                if (sentence.charAt(index) == ' ') {
	                    // Look ahead to avoid counting multiple spaces as multiple words
	                    while (index < sentence.length() && sentence.charAt(index) == ' ') {
	                        index++;
	                    }
	                    if (index < sentence.length()) {
	                        wordCount++;
	                    }
	                } else {
	                    index++;
	                }
	            }
	        }

	        System.out.println("Word count using while loop: " + wordCount);
	    }
	}



