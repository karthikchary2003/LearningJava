package While_Loop;
//Greatest Common Divisor (GCD): Find the GCD of two numbers using a loop.
public class GcdOfTwoNumbers {

	public static void main(String[] args) {
		int num1=15;
		int num2=10;
		int min=0;
		
		if(num1<num2) {
			min=num1;
		}else {
			min=num2;
		}
		
		for(int i=min;i>=1;i--) {
			if(num1%i==0 && num2%i==0) {
				System.out.println("gcd:"+ i);
				break;
			
			}
		}
		
	}

}
