package Day9;

public class PolymorphismMethodOL {
	
	int a ;
	int b;
	String Name;
	
	void addNum() {
		
		Name= "Raghu";
		a=10;
		b=20;
		System.out.println("here is the sum from: "   + Name +" Sum:   " + (a+b));
	}
	
	void addNum(int x, int y, String Nom) {
		a=x;
		b=y;
		Name=Nom;
		System.out.println("here is the sum from: "   + Name +" Sum:   " + a+b);
		
	}
	void addNum(int x, int y) {
		a=x;
		b=y;
		Name="Raju";
		System.out.println("here is the sum from: "   + Name +" Sum:   " + a+b);		
	}
	// this keyword
	void addNum ( int b, String Name)
	{
		this.b=b;
		this.Name=Name;
		a=67;
		System.out.println("The Sum of A+ b is By: " + this.Name + " " +" "+ (a+ this.b));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PolymorphismMethodOL poly =new PolymorphismMethodOL();
		poly.addNum(67, 3);
		poly.addNum();
		poly.addNum(6, 7, "rag");
		poly.addNum(5, "rani");
		

	}

}
