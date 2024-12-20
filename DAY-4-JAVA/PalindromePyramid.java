package Patterns;

//1
//121
//12321
//1234321
//123454321



public class PalindromePyramid {

	public static void main(String[] args) {
			int num=9;
			
			for(int i=1;i<=num;i++) {
				for(int j=num;j>=i;j--) {
					System.out.print(" ");
				}
				for(int k=1;k<=i;k++) {
					System.out.print(k);
				}
				for(int k=i-1;k>=1;k--) {
					if(k!=0) {
						System.out.print(k);
					}
				}
				System.out.println();
			}
	}

}
