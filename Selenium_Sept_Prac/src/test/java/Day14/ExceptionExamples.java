package Day14;

public class ExceptionExamples {

	public static void main(String[] args) {
		System.out.println("Program Starting...");

		int number=40;
		try
		{		
			int MyNum = number/0;
			System.out.println("MyNum :" + MyNum);
		}
		catch (ArithmeticException e)
		{
			String M =e.getMessage();
			System.out.println(M);
		}	

		System.out.println("Program Executed already");
		int LI[] = new int[4];
		try {
			LI [5]=89;
		}
		//Two catch blocks 
		catch(ArithmeticException e)
		{
			String M =e.getMessage();
			System.out.println(M);
			e.printStackTrace();
		}
		catch (Exception e) {
			String M= e.getMessage();
			System.out.println(M);
			e.printStackTrace();
		}
		finally {
			System.out.println("you are in finally  safe with two catch blocks");
		}			
		System.out.println(" 2nd Program RAN");

		String Message ="welcome";
		try {
			int num1= Integer.parseInt(Message);
			System.out.println(num1);			
		}
		catch(Exception e) {
			String M= e.getMessage();
			System.out.println(M);
			e.printStackTrace();

		}
		System.out.println("Program ended well after third excxeption");	
	}
}
