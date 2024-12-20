package Patterns;

//*   *
// * * 
//  *  
// * * 
//*   *


public class WavePattern {

	public static void main(String[] args) {
		int n=5;
		if(n%2==0) {
			n=n+1;
		}
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i==j || i+j==n+1) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
