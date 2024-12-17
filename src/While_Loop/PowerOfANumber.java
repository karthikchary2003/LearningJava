package While_Loop;
//Power of a Number: Compute the power of a number without using Math.pow().
public class PowerOfANumber {

	public static void main(String[] args) {
		
		int base=30;
		int pow=2;
		int power=0;
		
		for(int i=1;i<pow;i++) {
			power+=base*base;
			System.out.println(power);
		}
		
	}

}
