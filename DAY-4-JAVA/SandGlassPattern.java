package Patterns;

//* * * 
// * * 
//  * 
// * * 
//* * * 

public class SandGlassPattern {

	public static void main(String[] args) {
		int num=3;
		for(int i=1;i<=num;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(" ");
			}
			for(int k=i;k<=num;k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=2;i<=num;i++) {
			for(int j=num;j>=i;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		
	}

}
