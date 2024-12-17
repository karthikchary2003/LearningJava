package If_Else;

//Take three angles as input and check if they form a valid triangle (sum = 180°).


public class TriangleValidity {

	public static void main(String[] args) {
		int t1=60;
		int t2=60;
		int t3=56;
		
		int sum=(t1+t2+t3);
		
		if(sum==180) {
			System.out.println("valid");
		}else {
			System.out.println("invalid");
		}
		
	}

}
