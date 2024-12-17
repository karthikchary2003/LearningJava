package DoWhile_Loop;

import java.util.Scanner;

//Sum of Numbers Until Zero: Accept numbers from the user and calculate their sum until the user enters 0.
public class Sum_of_Numbers_Until_Zero {

	public static void main(String[] args) {
		int sum=0,count=0,num=0;
		char choice = 0;
		do {
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the number:");
			 num=sc.nextInt();
			
			if(num!=0) {
				sum+=num;
				count++;
			}else {
				System.out.println("the sum of the numbers is "+sum +"after the inputs of"+count);
				System.out.println("do you want to continue 'y' or 'N");
				choice=sc.next().charAt(0);
			}
			
			
			
		} while (num!=0 ||choice=='y' || choice=='Y');
		
		
		
	}

}
