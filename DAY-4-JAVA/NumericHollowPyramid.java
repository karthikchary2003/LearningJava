package Patterns;

//   1
//  1 2
// 1   3
//1 2 3 4 


public class NumericHollowPyramid {

	public static void main(String[] args) {
		int num=4;		
		int s=1;
		
		for(int i=1;i<=num;i++) {
			for(int j=num;j>=i;j--) {
				System.out.print(" ");
			}
			if(i!=1  && i!=num) {
				for(int k=1;k<num;k++) {
					if(k==1 ) {
						System.out.print(k);
					}
				}
			}
			for(int m=s-2;m>=1;m--) {
				if(i!=1 && i!=num) {
					System.out.print(" ");
				}
			}
			s=s+2;
			for(int l=1;l<=1;l++) {
				if( i!=num) {
			System.out.println(i);
				}
			}
			
			for(int b=1;b<=num;b++) {
				if(i==num) {
					System.out.print(b+" ");
				}
			}
	
		}
		
		
		

	}
}
