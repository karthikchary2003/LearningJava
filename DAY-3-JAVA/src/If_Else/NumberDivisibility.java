package If_Else;

//Check if a number is divisible by both 5 and 11.

public class NumberDivisibility {

	public static void main(String[] args) {

		int a = 55;

		if (a % 5 == 0 && a % 11 == 0) {
			System.out.println("num is divisible by both 5 and 11");
		} else {
			System.out.println("num is not divisble by 5 and 11");
		}

	}

}
