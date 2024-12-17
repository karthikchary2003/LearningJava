package While_Loop;
//Reverse a String: Reverse a given string using a while loop.
public class ReverseAString {

	public static void main(String[] args) {
		String name="king";
		int i=name.length()-1;
		while(i>=0) {
			System.out.print(name.charAt(i));
			i--;
		}
		
		

	}

}
