package While_Loop;
//Perfect Number: Check if a number is a perfect number (sum of divisors excluding the number equals the number).
public class PerfectNumberOrNot {

	public static void main(String[] args) {
		int num=28,sum=0;
		
		for(int i=1;i<num;i++) {
			if(num%i==0) {
				sum+=i;
			}
		}
		if(num==sum) {
			System.out.println("perfect number");
		}else {
			System.out.println("not a perfect number");
		}
	}

}
