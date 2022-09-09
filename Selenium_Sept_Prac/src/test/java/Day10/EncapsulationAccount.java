package Day10;

public class EncapsulationAccount {
	
	//to hide data we declare class variable as Private
	
	private String Name;
	private int Id;
	private double Salary;
	// GETTERS AND SETTERS GENERATE BY ECLIPSE
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public double getSalary() {
		return Salary;
	}
	public void setSalary(double salary) {
		Salary = salary;
	}
	
	void show() {
		System.out.println("The name "  + Name + " id: " +Id +"  " + Salary);
	}
	

}
