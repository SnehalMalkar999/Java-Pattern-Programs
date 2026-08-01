package Pattern;
import java.util.Scanner;
public class RowAlphabetSquare {

	public static void main(String[] args) {
		//create Scanner object to take input
		Scanner sc=new Scanner(System.in);
		
		//input 
		System.out.print("Enter the rows number:");
		 int row=sc.nextInt();
		 
		 System.out.print("Enter the column number:");
		 int col=sc.nextInt();
		 
		 //Starting alphabet
		 char ch='A';
		 //Outer loop controls the rows 
		 for(int i=1;i<=row;i++)
		 {
			 //Inner loop controls the column
			 for(int j=1;j<=col;j++)
			 {
				 System.out.print(ch+" ");
			 }
			 //move to next line
			 System.out.println();
			 
			 //Next Alphabet
			 ch++;
		 }
		 sc.close();
	}

}
