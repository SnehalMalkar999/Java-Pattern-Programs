package pattern;
import java.util.Scanner;
public class NumberSquareColumn {

	public static void main(String[] args) {
		//Create Scanner object for user input
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size of square:");
		int n=sc.nextInt();
		
		//outer loop controls rows
		for(int i=0;i<=n;i++)
		{
			//Inner loop controls column
			for(int j=1;j<=n;j++)
			{
				System.out.print(i+" ");
			}
			//move to the next line after each row
			System.out.println();
		}
		sc.close();
	}

}

