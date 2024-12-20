package Patterns;

//1 2 3 4 
//1 2 3 
//1 2 
//1 
public class ReversedNumbers {

	public static void main(String[] args) {
		int s=5;
		
		for(int i=1;i<=s;i++) {
			for(int j=1;j<=s-i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
	}

}
