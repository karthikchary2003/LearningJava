package Patterns;

//   *
//  * *
// * * *
//* * * *
// * * *
//  * *
//   *


public class DiamondShape {

	public static void main(String[] args) {
		int s=10;
		for(int i=1;i<s;i++) {
			for(int j=1;j<=s-i;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print("* ");
			}
			System.out.println();
			
		}
		
		for(int i=1;i<=s;i++) {
			for(int j=1;j<=i+1;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<s-i;k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}

}
