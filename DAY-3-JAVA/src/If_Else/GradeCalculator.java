package If_Else;


/*Accept a student's marks and display the grade based on the following criteria:
>= 90: A
80-89: B
70-79: C
< 70: Fail */

public class GradeCalculator {

	public static void main(String[] args) {
		
		int java=9;
		int python=0;
		int javascript=90;
		
		float grade=(java+python+javascript)/3;
		
		if(grade>=90) {
			System.out.println("A grade");
		}else if(grade>=80 && grade<=89) {
			System.out.println("B grade");
		}else if(grade>=70 && grade<=79) {
			System.out.println("C grade");
		}else{
			System.out.println("fail");
		}
		
	}

}
