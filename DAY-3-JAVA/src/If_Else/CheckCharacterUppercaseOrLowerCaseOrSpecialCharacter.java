package If_Else;

//Check if a character entered is uppercase, lowercase, digit, or special character.
 
import java.util.Scanner;

public class CheckCharacterUppercaseOrLowerCaseOrSpecialCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("enter a character: ");
		char ch=sc.next().charAt(0);
		
		int a=(int)ch;
		
		if(a>=65 && a<=90) {
			System.out.println("Uppercase");
		}else if( a>=97 && a<=122) {
			System.out.println("Lowercase");
		}else {
			System.out.println("SpecialCharacter");
		}
		
	}

}
