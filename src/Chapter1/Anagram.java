package Chapter1;

public class Anagram {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String testString = "TTTTTTTTTTTT";
		String testString2 = "TTTTTTTTTpTT";
		
		System.out.println(anagram(testString, testString2));

	}
	
	//answer for exercise 1.4
	//determines if a set of Strings are anagrams or not
	public static String anagram(String input, String input2){
		StringBuilder sb = new StringBuilder(input2);
		
		if(input.length() == input2.length()){
			for(int i = 0; i < input.length(); i++){
				for(int j = 0; j < sb.length(); j++){
					if(input.charAt(i) == sb.charAt(j)){
						sb.deleteCharAt(j);
						break;
					}
				}
			}
			if(sb.length() == 0){
				return "anagram";
			}
			else
				return "not anagrams";
		}
		else
			return "Not anagrams. Different count of characters.";
	}

}
