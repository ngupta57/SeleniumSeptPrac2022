package Day10;

public class StaticExample {
	
	static int Deptid =10;
	String Name ="Radha";
	
	void m1() {
		System.out.println("I am non-static Method");
		}
	static void m2()	{
		System.out.println("I am m2 Static Method");
		Deptid=20;
		System.out.println(Deptid);		
	}
	//non static method can access static method and  non static method and static variable and non static variable directly
	
	void examplestatic() {
		Name = "RAKA";//non-static variable
		System.out.println(Name);
		Deptid=27; //static variable 
		System.out.println(Deptid);
		m2();// static method
		m1(); // non static method
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//static method can access static method directly
		m2();
		//static method can access static variable directly
		Deptid= 23;
		System.out.println(Deptid);
		//non static variable can be access by static method through class object
		StaticExample SE = new StaticExample();
		SE.Name="Kamal" ;
		System.out.println(SE.Name);
		SE.examplestatic();		
		
		
		

	}

}
