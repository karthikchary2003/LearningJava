package Patterns;

//   *
//  **
// ***
//****

public class RightAngledTriangle {

	public static void main(String[] args) {
		int s=5;
		for(int i=1;i<s;i++) {
			for(int j=i;j<=s;j++) {
				System.out.print(" ");
			}
			for(int k=i;k>=1;k--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
