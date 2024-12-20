package Patterns;

//1 
//2 2 
//3 3 3 
//4 4 4 4 
//5 5 5 5 5 


public class RepeatedNumbers {

	public static void main(String[] args) {
		int s=5;
		
		for(int i=1;i<=s;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
		
	}

}
