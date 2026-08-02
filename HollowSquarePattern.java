package pattern;
import java.util.Scanner;
public class HollowSquarePattern {

	public static void main(String[] args) {
		//create Scanner object to take input
		Scanner sc=new Scanner(System.in);
		
		//input 
		System.out.print("Enter the rows number:");
		 int rows=sc.nextInt();
		 
		 System.out.print("Enter the column number:");
		 int cols=sc.nextInt();
		
		 //Outer loop controls the rows 
		 for(int i=1;i<=rows;i++)
		 {
			 //Inner loop controls the column
			 for(int j=1;j<=cols;j++)
			 {
				 //print star on boundary position only
				 //first-row,last row,first column,last column
				 if(i==1 || i==rows || j==1 || j==cols)
				 {
				 System.out.print("* ");
				 }
				 else 
				 {
					 //print space inside the square
					 System.out.print("  "); 
				 }
			 }
			 
			 //move to next line
			 System.out.println();
		 }
		 sc.close();
	}

}
