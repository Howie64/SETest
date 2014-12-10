package rechner;

import java.util.Scanner;

public class main {

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter Int 1:");
		
		Integer input1 = in.nextInt();
		
		System.out.print("Enter Int 2:");
		
		Integer input2 = in.nextInt();

		System.out.print("Sum: " + (input1 + input2));
	}

}
