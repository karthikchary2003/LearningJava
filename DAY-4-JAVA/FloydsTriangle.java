package Patterns;

//1 
//2 3 
//4 5 6 
//7 8 9 10 
//11 12 13 14 15 

public class FloydsTriangle {

	public static void main(String[] args) {
		int s=5;
		int sum=1;
		for(int i=1;i<=s;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(sum+++" ");
				
			}
			System.out.println();
		}
		
	}

}
