import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PigLatinAppTest {

	@Test
	public void testForReplaceSpecialChar() {
		
		Piglatin testVowel = new Piglatin();
		String vowelPlace = testVowel.removeSpecialChar("!black");
		assertEquals("black", vowelPlace);
	}
	
	@Test
	public void testForVowels() {
		
		Piglatin testVowel = new Piglatin();
		boolean vowelPlace = testVowel.doesStringHaveVowel("aeiou");
		assertEquals(true, vowelPlace);
	}
	
	@Test
	public void testForNoVowel() {
		
		Piglatin testVowel = new Piglatin();
		boolean vowelPlace = testVowel.doesStringHaveVowel("BBB");
		assertEquals(false, vowelPlace);
	}
	
	@Test
	public void testForNumVowel() {
		
		Piglatin testVowel = new Piglatin();
		int vowelPlace = testVowel.findFirstVowel("black");
		assertEquals(2, vowelPlace);
	}
	
	@Test
	public void testForTwoCons() {
		
		Piglatin testVowel = new Piglatin();
		boolean vowelPlace = testVowel.twoConsonants("black");
		assertEquals(true, vowelPlace);
	}
	
	@Test
	public void testForNotTwoCons() {
		
		Piglatin testVowel = new Piglatin();
		boolean vowelPlace = testVowel.twoConsonants("ack");
		assertEquals(false, vowelPlace);
	}
	
	@Test
	public void testForTranslateHaveVowel() {
		
		Piglatin testVowel = new Piglatin();
		String vowelPlace = testVowel.translate("ack");
		assertEquals("ackyay", vowelPlace);
	}
	
	@Test
	public void testForTranslateHaveCons() {
		
		Piglatin testVowel = new Piglatin();
		String vowelPlace = testVowel.translate("black");
		assertEquals("ackblay", vowelPlace);
	}
	
	
	@Test
	public void testForTranslateHaveSpaecialChar() {
		
		Piglatin testVowel = new Piglatin();
		String vowelPlace = testVowel.translate("!ack");
		assertEquals("ackay", vowelPlace);
	}

}
