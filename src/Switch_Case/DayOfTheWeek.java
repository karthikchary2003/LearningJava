package Switch_Case;

import java.util.Scanner;

//Write a program that takes a number (1 to 7) and prints the corresponding day of the week (e.g., 1 = Monday, 2 = Tuesday, etc.).

public class DayOfTheWeek {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number:");
		int key=sc.nextInt();
		
		switch (key) {
		case 1:
			System.out.println("monday");
			break;
		case 2:
			System.out.println("tuesday");
			break;
		case 3:
			System.out.println("wednesday");
			break;
		case 4:
			System.out.println("thursday");
			break;
		case 5:
			System.out.println("friday");
			break;
		case 6:
			System.out.println("saturday");
			break;
		case 7:
			System.out.println("sunday");
			break;

		default:
			System.out.println("out of the range");
			break;
		}
	
	}

}
