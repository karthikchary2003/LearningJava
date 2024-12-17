package If_Else;

//Write a program to find the largest of three numbers.

public class MaxOfThreeNumbers {

	public static void main(String[] args) {
		int a=4;
		int b=5;
		int c=3;
		
		if(a>b && a>c)
		{
			System.out.println(a+" is the max");
		}else if(b>c && b>a) {
			System.out.println(b+" is the max");
		}else {
			System.out.println(c+" is the max");
		}
		
	}

}
