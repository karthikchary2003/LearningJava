package Switch_Case;

//Write a program to check if a given character is a vowel (a, e, i, o, u) or a consonant.

public class VowelOrConsonant {

	public static void main(String[] args) {
		char ch='z';
		
		switch(ch) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.println("vowel");
			break;
			
		default:
			System.out.println("consonant");
			break;
		}
		
		
	}

}
