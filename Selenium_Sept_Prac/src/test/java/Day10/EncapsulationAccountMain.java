package Day10;

public class EncapsulationAccountMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EncapsulationAccount EA = new EncapsulationAccount();
		EA.setName("Radha");
		EA.setId(45);
		EA.setSalary(2345.89);
		EA.show();
		 int myid=EA.getId();
		 System.out.println(myid);
		 System.out.println(EA.getId());

	}

}
