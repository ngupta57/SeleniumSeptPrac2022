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
			LI [3]=89;
			}
		//Two catch blocks 
		catch(ArithmeticException e)
		{
			String M =e.getMessage();
			System.out.println(M);		
		}
		catch (Exception e) {
			String M= e.getMessage();
			System.out.println(M);
			}
		finally {
			System.out.println("you are in finally  safe with two catch blocks");
			}
			
		System.out.println(" 2nd Program RAN");

}}
