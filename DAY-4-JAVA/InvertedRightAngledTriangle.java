package Patterns;


//  ******
//   *****
//    ****
//     ***
//      **
//       *

public class InvertedRightAngledTriangle {

	public static void main(String[] args) {
		int s=10;
		
		for(int i=1;i<s;i++) {
			for(int j=2;j<=i;j++) {
				System.out.print(" ");
			}
			for(int k=s;k>i;k--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
