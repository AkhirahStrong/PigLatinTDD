
public class Piglatin {
	
	private static char[] removing;

	/* This class will break the Pig Latin process into separate methods */
	
	
	/*First method will find the first vowel. Y will be the exception
	 * 
	 * The parameter theWord will be used to check for the vowel*/
	
	public  int findFirstVowel(String theWord) {
		String vowels = "aeiou";
		String wordLoward = theWord.toLowerCase();
		
		for(int i = 0; i < wordLoward.length(); i++ ) {
			
			if(vowels.contains(String.valueOf(wordLoward.charAt(i)))) {
				return i; 
			}
		}
		
		// handle cases where a vowel is not found
		return -1;
		
	}
	
	/*This method checks for vowel within a String
	 * 
	 * The parameter will be a placeholder for the user input
	 * If the String has a vowel it will return true else it will return false
	 * 
	 * */
	
	public  boolean doesStringHaveVowel(String translator) {
		
		
		String vowels = "aeiou";

	      char letter = translator.charAt(0);

	      return (vowels.indexOf(letter) != -1);
		
	}
	
	/*Takes a string and removes anything except letters and the ' character
	 * 
	 * The parameter will be a placeholder for the word to be stripped
	 * */
	
	public  String removeSpecialChar(String SpecialChar) {
		
		char[] removeChar = (SpecialChar.strip().toCharArray());
		String result = "";
		for(int i = 0; i < removeChar.length; i++) {
			if(Character.isAlphabetic(removeChar[i]) || removeChar[i] == '\'') {
				result += Character.toString(removeChar[i]);
			}
		}
		return result.strip();
		
	}
	
	
	/*This method will be used to alter the translate method according to starting with two
	 * consonants.
	 * 
	 * The parameter will be a placeholder for the word to be stripped
	 * */
	
	public boolean twoConsonants(String moveCons) {
		return ( moveCons.startsWith ("bl") || moveCons.startsWith ("sc") ||
				moveCons.startsWith ("br") || moveCons.startsWith ("sh") ||
				moveCons.startsWith ("ch") || moveCons.startsWith ("sk") ||
				moveCons.startsWith ("cl") || moveCons.startsWith ("sl") ||
				moveCons.startsWith ("cr") || moveCons.startsWith ("sn") ||
				moveCons.startsWith ("dr") || moveCons.startsWith ("sm") ||
				moveCons.startsWith ("dw") || moveCons.startsWith ("sp") ||
				moveCons.startsWith ("fl") || moveCons.startsWith ("sq") ||
				moveCons.startsWith ("fr") || moveCons.startsWith ("st") ||
				moveCons.startsWith ("gl") || moveCons.startsWith ("sw") ||
				moveCons.startsWith ("gr") || moveCons.startsWith ("th") ||
				moveCons.startsWith ("kl") || moveCons.startsWith ("tr") ||
				moveCons.startsWith ("ph") || moveCons.startsWith ("tw") ||
				moveCons.startsWith ("pl") || moveCons.startsWith ("wh") ||
				moveCons.startsWith ("pr") || moveCons.startsWith ("wr") ); 
	   }
	
	
	/*This method does all of the translating*/
	
	
	public String translate(String translator) {
		String result = "";
		
		if(doesStringHaveVowel(translator)) {
			result = translator + "yay";
		}else if(twoConsonants(translator)){
			result = translator.substring(2) + translator.substring(0, 2) + "ay";
		}else if(removeSpecialChar(translator) != null) {
			result = translator.substring(1) + "ay";
		}else {
			result = translator.substring(1) + translator.charAt(0) + "ay";
		}
		return result;
		
	}
		
	
		
	}


