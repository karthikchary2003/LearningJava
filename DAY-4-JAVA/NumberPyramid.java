package Patterns;

//    1 
//   1 2 
//  1 2 3 
// 1 2 3 4 
//1 2 3 4 5 

public class NumberPyramid {

	public static void main(String[] args) {
		int s=5;
		for(int i=1;i<=s;i++) {
			for(int j=s;j>=i;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print(k+" ");
			}
			
			System.out.println();
		}
		
	}

}
