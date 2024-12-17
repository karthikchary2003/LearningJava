package DoWhile_Loop;

import java.util.Scanner;

//Guess the Number Game: Ask the user to guess a number and provide hints until they guess correctly.
public class GuessTheNUmberGame {

	public static void main(String[] args) {
		
		int num=0,guess=0;
		do {
			guess=(int) Math.floor(Math.random()*10);
//			System.out.println(guess);
			
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the number:");
			 num=sc.nextInt();
			
			 
			if(num==guess) {
				System.out.println("correct");
				break;
			}else {
				System.out.println("incorrect");
			}
			
		}while(num!=guess);
		
	}

}
