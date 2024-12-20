package Patterns;

public class InvertedStarPattern {

//	* * * * *
//	 * * * *
//	  * * *
//	   * *
//	    *

	
	public static void main(String[] args) {
		int s=5;
		for(int i=1;i<=s;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=s-i;k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
