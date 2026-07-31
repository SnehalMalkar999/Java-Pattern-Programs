package pattern;
import java.util.Scanner;
public class NumberSquareContinuous {

	public static void main(String[] args) {
		//Create Scanner object for user input
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size of square:");
		 int n=sc.nextInt();
		 
		 //starting number
		 System.out.print("Enter the staring number:");
		 int num=sc.nextInt();
		
		//outer loop controls rows
		for(int i=0;i<=n;i++)
		{
			//Inner loop controls column
			for(int j=1;j<=n;j++)
			{
				System.out.print(num+" ");
				//increment the number
				num++;
			}
			//move to the next line after each row
			System.out.println();
		}
		sc.close();
	}

}

