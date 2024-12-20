package Patterns;

//    1
//   121
//  12321
// 1234321
//123454321
public class PyramidNumbers {

	public static void main(String[] args) {
		int s=5;
		
		for(int i=1;i<=s;i++) {
			for(int j=1;j<=s-i;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print(k);
			}
			
			if(i!=1) {
				for(int z=i-1;z>=1;z--) {
					System.out.print(z);
				}
			}
			
			System.out.println();
		}
		
	}

}
