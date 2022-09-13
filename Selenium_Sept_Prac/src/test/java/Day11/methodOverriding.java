package Day11;


class A {
	int a;
	int b;
	
	void ShowTot() {
		System.out.println("The total is : " +(a+b));
	}	
}

class B extends A {
	int x;
	int y;
	
	        //method overriding
	
	void ShowTot() {
		System.out.println("The total IS "  + (x+y+20));
	}	
}
public class methodOverriding {
public static void main(String[] args) {
		// TODO Auto-generated method stub
A aobj =new A();
B bobj =new  B();
aobj.ShowTot();
aobj.a=24;
aobj.b=50;
aobj.ShowTot();
bobj.ShowTot();

	}

}
