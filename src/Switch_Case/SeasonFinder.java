package Switch_Case;

import java.util.Scanner;

/*
 * Input a month (1 to 12) and display the corresponding season:

Winter: December, January, February
Spring: March, April, May
Summer: June, July, August
Autumn: September, October, November
 * 
 * */


public class SeasonFinder {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the month no:");
		int key=sc.nextInt();
		
		switch (key) {
		case 1:
			System.out.println("Winter");
			break;
		case 2:
			System.out.println("Winter");
			break;
		case 3:
			System.out.println("Spring");
			break;
		case 4:
			System.out.println("Spring");
			break;
		case 5:
			System.out.println("Spring");
			break;
		case 6:
			System.out.println("Summer");
			break;
		case 7:
			System.out.println("Summer");
			break;
		case 8:
			System.out.println("Summer");
			break;
		case 9:
			System.out.println("Autumn");
			break;
		case 10:
			System.out.println("Autumn");
			break;
		case 11:
			System.out.println("Autumn");
			break;
		case 12:
			System.out.println("Winter");
			break;

		default:
			System.out.println("out of the range");
			break;
		}

	}

}
