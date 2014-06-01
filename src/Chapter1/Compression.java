package Chapter1;

public class Compression {

	/**
	 * @param args
	 * This class compresses the input string.  If the string has multiple letters after the initial letter,
	 * it will print how many trailing letters the string has.
	 */
	public static void main(String[] args) {
		String s1 = "aabbbcdddddeefggggggg";
		String s2 = "a";
		String s3 = "hello";
		String s4 = "ccaaaaaiittttthiiolll";
		
		System.out.println(compress(s1));
		System.out.println(compress(s2));
		System.out.println(compress(s3));
		System.out.println(compress(s4));

	}
	
	public static String compress(String input1){
		if(input1.length() > 1){
			String result = "";
			StringBuilder sb = new StringBuilder(result);
			int count = 1;
			char letter;
			
			
			//feed in first letter
			letter = input1.charAt(0);
			//loop through rest of letters
			for(int i = 1; i < input1.length(); i++){
				if(input1.charAt(i) == letter){
					count ++;
				}
				else{
					sb.append(letter);
					sb.append(count);
					letter = input1.charAt(i);
					count = 1;
				}
			}
			//end case - append last group of letters
			sb.append(letter);
			sb.append(count);
			
			if(sb.length() < input1.length()){
				return sb.toString();
			}
			else{
				return input1;
			}
		}
		else{
			return input1 + 1;
		}
	}
}
