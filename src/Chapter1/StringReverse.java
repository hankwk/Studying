package Chapter1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;


public class StringReverse{

	/**@author hankwk
	 * @param args
	 * This code reverses a given String and also jumbles a String.
	 * JUMBLE IS NOT COMPLETED
	 */
	public static void main(String[] args) {
			String myString = "abcdefghijklmnopqrstuvwxyz";
			
			System.out.println(reverse(myString));
			System.out.println(jumbleEasy(myString));
			

		}
	//exercise 1.2
	public static String reverse(String toReverse){
		String answer = null;
		for(int i = toReverse.length() - 1; i > -1; i--){
			answer = answer + toReverse.charAt(i);
		}
		return answer.substring(4);
	}
	/**
	 * 
	 * @param toJumble The String to jumble.
	 * @return The jumbled string.
	 * NOT COMPLETED
	 */
	public static String jumbleHard(String toJumble){
		Random myRandom = new Random();
		List<Integer> valuesUsed = new ArrayList<Integer>();
		
		for(int i = 0; i < toJumble.length() -1; i++){
			int toAdd = (myRandom.nextInt(toJumble.length()-1));
			valuesUsed.add(toAdd);
			//this part is wrong.
			for(Integer j: valuesUsed){
				while(toAdd == j){
					toAdd = (myRandom.nextInt(toJumble.length()-1));
				}
			}
			//to here
		}
		
		System.out.println(valuesUsed.toString());
		
		return "Hello";
			
	}
	
	public static String jumbleEasy(String toJumble){
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		for(int i = 0; i < toJumble.length()-1; i++){
			numbers.add(i);
		}
		Collections.shuffle(numbers);
		
		System.out.println(numbers);
		
		return "easy";
	}


}
