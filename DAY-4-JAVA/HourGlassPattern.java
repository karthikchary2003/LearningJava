package Patterns;


//**********
//*      * 
// *    *  
//  *  *   
//   **    
//   **    
//  *  *   
// *    *  
//*      * 
//*        *
//**********


public class HourGlassPattern {
	public static void main(String[] args) {
		int s=10;
		
		for(int i=1;i<=s;i++) {
			for(int j=1;j<=s;j++) {
				if(i==1 || i==j || i+j==s+1 ) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		
		for(int i=1;i<=s;i++) {
			for(int j=1;j<=s;j++) {
				if(i==1) {
					System.out.print("*");
				}
			}
		}
		
		
		
	}
}
