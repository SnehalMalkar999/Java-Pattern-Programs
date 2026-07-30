package pattern;
import java.util.Scanner;
public class SolidSquare {

	public static void main(String[] args) {
		//create Scanner object to take input
		Scanner sc=new Scanner(System.in);
		int m,n;
		//input rows
		System.out.print("Enter the rows number:");
		 m=sc.nextInt();
		 
		 //input column
		 System.out.print("Enter the column number:");
		 n=sc.nextInt();
		 
		 //print solid Rectangle pattern
		 for(int i=1;i<=m;i++)
		 {
			 for(int j=1;j<=n;j++)
			 {
				 System.out.print("* ");
			 }
			 System.out.println();
		 }
		 sc.close();
	}

}
