package Patterns;

//ABCD
//ABC
//AB
//A

public class InvertedAlphabetPyramid {

	public static void main(String[] args) {
		int alphabet=65;
		int s=5;
		
		for(int i=1;i<=s;i++) {
			for(int j=1;j<=s-i;j++) {
				System.out.print((char) (alphabet+j-1));
			}
			System.out.println();
		}
		
	}

}
