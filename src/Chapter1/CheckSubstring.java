package Chapter1;

public class CheckSubstring {

	/**
	 * This is the answer to exercise 1.8  I changed the requirements a little to have the first character
	 * in the compared strings to begin with a caps.  I did this because I was not sure what isSubstring()
	 * would return.  I needed a way to find the first letter of the string in s2 without going through 
	 * the whole string to look for identical chars.
	 * @param args
	 */
	public static void main(String[] args) {
		String s1 = "Bigfish";
		String s2 = "shBigfi";
		
		System.out.println(checker(s1, s2));
		
		

	}
	
	public static boolean isSubstring(String input1, String input2){
		return true;
	}
	
	public static String checker(String input1, String input2){
		int input1CountIndex = input1.length()-1;
		int input2StartIndex = 0;
		String resultString = "";
		
		StringBuilder sb = new StringBuilder(resultString);
		
		if(isSubstring(input1, input2)){
			//Go through second string to find where first letter is
			for(int j = 0; j < input2.length(); j++){
				if(input1.charAt(0) == input2.charAt(j)){
					input2StartIndex = j;
					System.out.println("Letter: " + input1.charAt(0) + " Index in s2: " + j);
				}
			}
			//Start second string at input2StartIndex and go to EOS, making string
			for(int j = input2StartIndex; j < input2.length(); j++){
				sb.append(input2.charAt(j));
			}
			//Now add the rest of the chars into the string
			for(int j = 0; j < input2StartIndex; j++){
				sb.append(input2.charAt(j));
			}
			
			if(input1.equals(sb.toString()))
				return "String 2 is a rotation of String 1";
			else
				return "String 2 is not a rotation of String 1";	
			
		}
		else
			return "Not a substring";
		
	}

}
