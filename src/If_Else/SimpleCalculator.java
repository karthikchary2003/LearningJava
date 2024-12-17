package If_Else;

//Take two numbers and an operator (+, -, *, /) as input and perform the corresponding operation.

import java.util.Scanner;

public class SimpleCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter num1:");
		int num1=sc.nextInt();
		
		System.out.println("enter num2:");
		int num2=sc.nextInt();
		
		System.out.println("Enter your Choice:" );
		System.out.println("1-addition 2-subtraction 3-multiplication 4-division ");
		int choice=sc.nextInt();
		
		
		if(choice==1) {
			System.out.println("addition ot two numbers:"+ (num1+num2));
		}else if(choice==2) {
			System.out.println("subtraction ot two numbers:"+( num1-num2));
		}else if(choice==3) {
			System.out.println("multiplication ot two numbers:"+ (num1*num2));
		}else if(choice==4){
			System.out.println("Division ot two numbers:"+ (num1/num2));

		}
		
		
	}

}
