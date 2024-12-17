package While_Loop;

//Palindrome Number: Check if a number is a palindrome (e.g., 121 is a palindrome).

public class PalindromeNumber {

	public static void main(String[] args) {
		int num=123,rev=0;
		int check=num;
		
		while(num>0) {
			int rem=num%10;
			rev=rev*10+rem;
			num/=10;
		}
		if(rev==check) {
			System.out.println("palindrome");
		}else {
			System.out.println("not a palindrome");
		}

	}

}
