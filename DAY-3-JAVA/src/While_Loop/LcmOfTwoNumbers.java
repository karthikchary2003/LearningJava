package While_Loop;
//LCM of Two Numbers: Find the LCM of two numbers.
public class LcmOfTwoNumbers {

	public static void main(String[] args) {
		int num1=2;
		int num2=5;
		int res=0;
		if(num1>num2) {
			res=num1;
		}else{
			res=num2;
		}
		
		
		while(true) {
			if(res%num1==0 && res%num2==0) {
				break;
			}
			res++;
		}
		System.out.println(res);
		
		
		
		
	}

}
