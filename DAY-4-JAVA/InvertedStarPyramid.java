package Patterns;

//* * * * * 
//* * * * 
//* * * 
//* * 
//* 


public class InvertedStarPyramid {

	public static void main(String[] args) {
		int s=5;
		
		for(int i=1;i<=s;i++) {
			for(int j=i;j<=s;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
