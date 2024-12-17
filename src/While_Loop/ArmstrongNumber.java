package While_Loop;

//153=1*1*1 + 5*5*5 + 3*3*3 =153

public class ArmstrongNumber {

	public static void main(String[] args) {
		int num=407,sum=0;
		int temp=num;

		while(num>0) {
			int rem=num%10;
			sum+=Math.pow(rem, 3);
			num/=10;
		}
		if(temp==sum) {
			System.out.println("armstrong number");
		}else {
			System.out.println("not an armstrong number");
		}
	}

}
