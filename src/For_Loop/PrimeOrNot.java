package For_Loop;

//Check Prime Number: Determine if a given number is prime.

public class PrimeOrNot {

	public static void main(String[] args) {
			
		int a=11,count=0;
		
		for(int i=1;i<=a;i++) {
			if(a%i==0) {
				count++;
			}
		}
		if(count==2) {
			System.out.println("prime");
		}else {
			System.out.println("not a prime ");
		}

	}

}
