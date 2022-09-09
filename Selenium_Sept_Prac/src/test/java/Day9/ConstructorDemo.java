package Day9;

public class ConstructorDemo {
	
	int NoOfEmp;
	String CompType;
	
	ConstructorDemo(){      //CONSTRUCTOR Oveloading
		NoOfEmp =50;
		CompType="Software";
		System.out.println("constructor invoked");
	}
		
		ConstructorDemo(int Emp, String Comp){
			NoOfEmp=Emp;
			CompType=Comp;
		}
		  ConstructorDemo(String Comp, int Emp){
			NoOfEmp=Emp;
			CompType=Comp;
		}
		  ConstructorDemo( int Emp){
				NoOfEmp=Emp;
				
			}
		  
	
	
	void  TellEmployee() {
		System.out.println(NoOfEmp);
	}

	public static void main(String[] args) {
		// constructor is a special kind of method that has the same name as class name which does not return any value and
		//it does not use void before its name and which is invoked automatically when a clas object is created.
		
		ConstructorDemo CD =new ConstructorDemo();
		ConstructorDemo CD1 =new ConstructorDemo(600,"Trading");
		ConstructorDemo CD2 =new ConstructorDemo("Sports",68);
		ConstructorDemo CD3 =new ConstructorDemo(68000);
		
		CD1.TellEmployee();
		CD.TellEmployee();
		CD2.TellEmployee();
		CD3.CompType="RING";
		System.out.println(CD3.CompType);
		CD3.TellEmployee();
		
		

	}

}
