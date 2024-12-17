package If_Else;

//Check if a person is eligible to vote based on their age (must be 18 or older).

public class EligibleTOVoteOrNot {

	public static void main(String[] args) {
		int age=16;
		
		if(age>=18) {
			System.out.println("eligible to vote");
		}else {
			System.out.println("not eligible to vote");
		}
	}

}
