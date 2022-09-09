package Day10;

public class ExampleStaticMethodVariable {
	
	static int CompID =2345;
	String BranchCity;
	
	static void show() {
		System.out.println("I am static method");
	}
	void makemoney() {
		System.out.println("we make good money");
	}
	
	void m4() {
		System.out.println(CompID);//static variable
		BranchCity="Bombay";//non static variable
		System.out.println(BranchCity);
		show();// static method accessed
		makemoney();//non-static method		
	}
	static void TellMe() {
		System.out.println(CompID);//STATIC VARIABLE
		show(); //static method
		ExampleStaticMethodVariable ESM = new ExampleStaticMethodVariable();
		ESM.BranchCity="DELHI";
		System.out.println(ESM.BranchCity);//non-static variable via class object
		ESM.makemoney();//NON STATIC METHOD VIA CLASS OBJECT
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stubHI
		TellMe();
		ExampleStaticMethodVariable ESM = new ExampleStaticMethodVariable();
		ESM.m4();
		ESM.makemoney();
		
		

	}

}
