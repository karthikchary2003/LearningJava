package While_Loop;
//Sum of Digits: Find the sum of digits of a number (e.g., 123 → 1+2+3 = 6).
public class SumOfDigits {

	public static void main(String[] args) {
		int num=1231,rem=0,sum=0;
		
		while(num>0) {
			rem=num%10;
			sum+=rem;
			num/=10;
		}
		System.out.println(sum);
		
	}

}
