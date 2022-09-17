package Day14;

public class ExceptionHandling_1 {
	
	
	int a = 10;
	
	void ShowDiv () {
		System.out.println("The dive is: "+ a/0);
	}

	public static void main(String[] args) {
		
		ExceptionHandling_1 ec= new ExceptionHandling_1();
		try {
		ec.ShowDiv();
		}
		catch (Exception e) {
			String ECMSG =e.getMessage();
			System.out.println(ECMSG);
		}
		}
		//Exception in thread "main" java.lang.ArithmeticException: / by zero
		//at Day14.ExceptionHandling_1.ShowDiv(ExceptionHandling_1.java:9)
		//at Day14.ExceptionHandling_1.main(ExceptionHandling_1.java:15)

	}


