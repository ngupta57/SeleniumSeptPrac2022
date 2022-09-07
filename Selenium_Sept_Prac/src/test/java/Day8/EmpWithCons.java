package Day8;

public class EmpWithCons {
	
	int idd;
	String name;
	
	
	
	EmpWithCons (int iddd, String Name){
		idd=iddd;
		name=Name;
	}
	
	void show() {
		
		System.out.println("the value of id " + idd  + " and name : " + name);
	}

}
