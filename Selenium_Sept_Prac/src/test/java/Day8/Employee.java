package Day8;

public class Employee {
	int eid;
	String ename;
	String job;
	int esal;
	
	void display() {
		System.out.println(eid);
		System.out.println(ename);
		System.out.println(job);
		System.out.println(esal);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee E1= new Employee();
		Employee E2= new Employee();
		E1.eid=68;
		E1.ename= "RAJA";
		E1.job="MANAGER";
		E1.esal=89090;
		E1.display();
		E2.eid=78;
		E2.ename="RADHA";
		E2.job="NURSE";
		E2.esal=8900;
		E2.display();
		

	}

}
