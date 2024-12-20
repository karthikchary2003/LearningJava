package Patterns;

public class HollowPyramid {

	//    *
	//   * *
	//  *   *
	// *     *
	//*********


	public static void main(String[] args) {
		int s=9;
		int t=1;
		for(int i=1;i<=s;i++) {
			for(int j=s-i;j>=1;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<=1;k++) {
				System.out.print("*");
			}
			if(i!=1) {
				for(int z=1;z<=t;z++) {
					System.out.print(" ");

				}
				System.out.print("*");
				t=t+2;
			}
			System.out.println();
		}
		
		
			for(int j=1;j<=s*2-1;j++) {
				
//				if(j==1) {
					System.out.print("*");	
//				}
			
			}
		}


	}


