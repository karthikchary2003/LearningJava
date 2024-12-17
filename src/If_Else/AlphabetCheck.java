package If_Else;

import java.util.Scanner;

//Write a program to check if a character entered by the user is a vowel, consonant, or not an alphabet.

public class AlphabetCheck {

	public static void main(String[] args) {
		
			
			Scanner sc=new Scanner(System.in);
			System.out.println("enter a character: ");
			char ch=sc.next().charAt(0);
			
			int a=(int)ch;
			
			if(a==97 || a==101 || a==105 || a==111 || a==117 || a==65 || a==69 || a==73 || a==79 || a==85 ) {
				System.out.println("vowels");
			}else if(a>=65 && a<=90 || a>=97 && a<=122) {
				System.out.println("consonant");
			}else {
				System.out.println("not an alphabet");
			}
	}

}
