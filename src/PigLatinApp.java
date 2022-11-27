
public class PigLatinApp {

	public static void main(String[] args) {
     
		//beginsWithVowel("slow");
		
		Piglatin pl = new Piglatin();
		String test2 =  pl.translate("!ack");
		System.out.println(test2);
		
		int newStr = pl.findFirstVowel("black");
		System.out.println(newStr);
		
	}
	
	
	
	
}

	

	

	

	


