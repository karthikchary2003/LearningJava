package For_Loop;

//Factorial of a Number: Find the factorial of a given number.

public class FactorialOfaNumber {

	public static void main(String[] args) {
		int num=6,fact=1;
		
		for(int i=1;i<=num;i++){
				fact=fact*i;
		
	}
		System.out.println(fact);

	}
}
