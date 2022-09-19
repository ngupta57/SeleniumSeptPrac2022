package Day14;

public class CheckedExceptionsDemo {

	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.out.println("PROGRAM START");
		try {
			Thread.sleep(5000);
		}
		catch (InterruptedException e) {
			System.out.println(e.getMessage());
			String msg= e.getMessage();
			System.out.println(msg);
		}
		
		System.out.println("Program finish");
		
		

	}

}
