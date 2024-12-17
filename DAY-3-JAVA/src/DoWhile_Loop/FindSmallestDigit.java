package DoWhile_Loop;
//Find Smallest Digit: Find the smallest digit in a number.
public class FindSmallestDigit {

	public static void main(String[] args) {
		int a=51,min=1000;

		int temp=a;
		do {
	
			 int rem=a%10;
			 
			 if(rem<min) {
				 min=rem;
			 }
			 
			 a=a/10;
			 
			
		} while (a>0);
		System.out.println("smallest digit in the number "+ temp +" is "+ min);
	}

}
