package DoWhile_Loop;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int opt=0;
		char choice;
	do {
		System.out.println("welcome to calculator");
		System.out.println("enter the number1:");
		int num1=sc.nextInt();
		
		System.out.println("enter the number 2:");
		int num2=sc.nextInt();
		System.out.println("select the options");
		System.out.println("1.add ,2.subtract, 3.multiply, 4.exit");
		 opt=sc.nextInt();
		
		
		
		if(opt==1) {
			System.out.println(num1+num2);
		}else if(opt==2) {
			System.out.println(num1-num2);
		}else if(opt==3) {
			System.out.println(num1*num2);
		}else if(opt==4) {
			System.out.println("thank you");
			break;
		}
		else {
			System.out.println("out of the range");
		}
		
		System.out.println("do you want to continue or exit if yes press 'y' or 'n' for no");
		 choice=sc.next().charAt(0);
		
	} while (opt==4 || choice=='y' || choice=='Y');
		
		
		
		
		
	}

}
