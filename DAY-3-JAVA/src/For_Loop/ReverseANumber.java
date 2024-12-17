package For_Loop;

//Reverse a Number: Reverse a given number (e.g., 123 → 321).

public class ReverseANumber {

	public static void main(String[] args) {
		int num=123345,rev=0,rem=0;
		
		for(;num!=0;num/=10) {
			rem=num%10;
			rev=rev*10+rem;
		}
		System.out.println(rev);
		
		
	}

}
