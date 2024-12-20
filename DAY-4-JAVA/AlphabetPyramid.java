package Patterns;
//A
//AB
//ABC
//ABCD
//ABCDE
//ABCDEF

public class AlphabetPyramid {

	public static void main(String[] args) {
		int alphabet=65;
		int s=5;
		for(int i=0;i<=s;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print((char)(alphabet+j));
			}
			System.out.println();
		}
		
	}

}
