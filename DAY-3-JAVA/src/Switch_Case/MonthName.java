package Switch_Case;

import java.util.Scanner;

//Input a number (1 to 12) and display the corresponding month name.

public class MonthName {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the month no:");
		int key=sc.nextInt();
		
		switch (key) {
		case 1:
			System.out.println("january");
			break;
		case 2:
			System.out.println("february");
			break;
		case 3:
			System.out.println("march");
			break;
		case 4:
			System.out.println("April");
			break;
		case 5:
			System.out.println("May");
			break;
		case 6:
			System.out.println("June");
			break;
		case 7:
			System.out.println("July");
			break;
		case 8:
			System.out.println("august");
			break;
		case 9:
			System.out.println("september");
			break;
		case 10:
			System.out.println("october");
			break;
		case 11:
			System.out.println("november");
			break;
		case 12:
			System.out.println("december");
			break;

		default:
			System.out.println("out of the range");
			break;
		}
	
		
		
	}

}
