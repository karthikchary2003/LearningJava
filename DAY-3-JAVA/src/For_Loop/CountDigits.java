package For_Loop;

//Count Digits: Count the number of digits in an integer using a loop.

public class CountDigits {

	public static void main(String[] args) {
		int a=1000,count=0;
		for(;a!=0;a/=10) {
			int rem=a%10;
			count++;
		}
		System.out.println(count);
	}

}
