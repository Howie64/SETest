package rechner;

import java.util.Scanner;

public class main {

	public static void main(String[] args)
	{
		Integer input1 = 0;
		Integer input2 = 0;
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter Int 1:");
		
		try
		{
			input1 = in.nextInt();
			System.out.print("Enter Int 2:");
			input2 = in.nextInt();
			System.out.print("Sum: " + (input1 + input2));
		}
		catch(Exception e)
		{
			System.out.print("Bitte Zahlen eingeben !");
		}
		
		

		
	}

}
