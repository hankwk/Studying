package Chapter1;
import java.util.ArrayList;


public class Unique {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String input = "Joey!";
		String input2 = "Hello Hi";
		String input3 = "abcdefghijklmnopqrstuvwxyz";
		String input4 = "Bill is a dog";
		
		
		System.out.println(unique3(input));
		System.out.println(unique3(input2));
		System.out.println(unique3(input3));
		System.out.println(unique3(input4));
		System.out.println(unique3("Yiiiiiiiiiiiiiiiiiiiii"));

	}
	//exercise 1.1
	public static String unique2(String toUse){
		char checker;
	
		for(int i = 0; i < toUse.length(); i++){
			checker = toUse.charAt(i);
			for(int j = i+1; j < toUse.length(); j++){
				if(checker == toUse.charAt(j)){
					return "Not Unique";
				}
			}
		}
		return "Unique";
	}
	
	//This will return the only unique characters in a set string
	//exercise 1.3
	public static String unique3(String toUse){
		char checker;
		StringBuilder sb = new StringBuilder(toUse);
		String wrongString = null;
		
		//first go through the String and pick up any duplicate chars.  Put them in a separate string called wrongString.
		for(int i = 0; i < toUse.length(); i++){
			checker = toUse.charAt(i);
			for(int j = i+1; j < toUse.length(); j++){
				if(checker == toUse.charAt(j)){
					wrongString = wrongString + checker;
					break;
				}
					
			}
		}
		//print out wrongString
		if(wrongString != null){
			wrongString = wrongString.substring(4);
		
			//go through wrongString and omit those characters from the original String.
			for(int j = 0; j < wrongString.length(); j++){
				for(int i = 0; i < sb.length(); i++){
					if(sb.charAt(i) == wrongString.charAt(j)){
						sb.deleteCharAt(i);
						i = i-1;
					}
				}
			}
			return sb.toString();
		}
		return "String is unique";
	}

}
