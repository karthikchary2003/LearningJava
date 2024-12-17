package Switch_Case;

import java.util.Scanner;

//Take two numbers and an operator (+, -, *, /) as input, and perform the corresponding calculation using switch.

public class Calculator {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number one:");
		int num1=sc.nextInt();
		System.out.println("enter the number two:");
		int num2=sc.nextInt();
		
		System.out.println("enter the operator you want to perform with the operands");
		char ch=sc.next().charAt(0);
		
		switch(ch) {
		case '+':
			System.out.println(num1+num2);
			break;
		case '-':
			System.out.println(num1-num2);
			break;
		case '*':
			System.out.println(num1*num2);
			break;
		case '/':
			System.out.println(num1/num2);
			break;
			default:
				System.out.println("error");
			break;
			
		}
		
		
		
	}
}
