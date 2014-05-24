


public class ReplaceSpace {

	/**@author hankwk
	 * @param args
	 * This program replaces spaces in a String with "%20".
	 * Implemented from Cracking the Coding Interview, p.48 #1.5
	 */
	public static void main(String[] args) {
		String testString = "Billy went to the store today.";
		
		System.out.println(replace(testString));

	}
	/**
	 * 
	 * @param used The string used
	 * @return The string replaced with "%20"
	 */
	public static String replace(String used){
		StringBuilder mySB = new StringBuilder(used);
		for (int i = 0; i < mySB.length() -1; i++){
			if( mySB.charAt(i) == ' '){
				mySB.replace(i, i+1, "%20");
			}
		}
		return mySB.toString();
	}

}
