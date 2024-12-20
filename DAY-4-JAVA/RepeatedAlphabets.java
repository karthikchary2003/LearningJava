package Patterns;

//A
//BB
//CCC
//DDDD
//EEEEE

public class RepeatedAlphabets {

	public static void main(String[] args) {
		int alphabet=65;
		int s=5;
		for(int i=1;i<=s;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print((char) (alphabet+i-1));
			}
			System.out.println();
		}
		
	}

}
