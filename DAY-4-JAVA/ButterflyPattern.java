package Patterns;

//*       *
//**     **
//***   ***
//**** ****
//*********
//**** ****
//***   ***
//**     **
//*       *


public class ButterflyPattern {

	public static void main(String[] args) {
		int s=10;
		for(int i=1;i<=s;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			for(int k=s;k>i;k--) {
				System.out.print(" ");
			}
			for(int k=s;k>i;k--) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		for(int i=1;i<s;i++) {
			for(int k=s;k>i;k--) {
				System.out.print("*");
			}
			for(int j=1;j<=i;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print(" ");
			}
			for(int l=s;l>i;l--) {
				System.out.print("*");
			}
			
			
			System.out.println();
		}
	
		
		
	}

}
