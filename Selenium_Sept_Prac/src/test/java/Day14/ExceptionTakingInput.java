package Day14;

import java.util.Scanner;

public class ExceptionTakingInput {

	public static void main(String[] args) throws ArithmeticException {
		// Exception on user input
		 int Mynum =10;		
		Scanner sc=new Scanner(System.in);
		System.out.println ("Give your Num :");		
		int UNum = sc.nextInt();
		try
		{
		System.out.println(Mynum/UNum);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());		
		}
		
		System.out.println("Exception Handled");
		
		
		
	}}
		
		 
		
		
		

	


