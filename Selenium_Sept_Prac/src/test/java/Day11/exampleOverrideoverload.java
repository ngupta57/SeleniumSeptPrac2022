package Day11;

class Bank{
	
	int Intrest;
	
	void ShowInt() {
		System.out.println( "The intrest is :"  + Intrest);
	}
	
	 int getint(int i) {		 
		 Intrest=i;
		 return Intrest;		 
	 }	 
}

class icici {
	
	int inrest;
	//method override	
	void ShowInt() {		
		System.out.println("Intrest is :"  + (inrest+1));
	}
	
	int getint() {
		
		return inrest;		
	} 
	
}


public class exampleOverrideoverload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bank bk = new Bank();
		icici ic=new icici();
		
		bk.Intrest=6;
		bk.getint(8);
		bk.ShowInt();
		ic.inrest=4;
		int i= ic.getint();
		System.out.println(i);
		ic.ShowInt();
		ic.getint();

	}

}
