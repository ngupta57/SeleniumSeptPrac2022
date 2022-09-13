package Day11;

public class InheritanceDemo {
	
	int NoOfCars;
	String cityName ;
	
	void Showcity() {
		System.out.println("the city is:" +cityName);
			}
	void CountCars() {
		System.out.println(NoOfCars);
	}}

	
	class INDEMO2 extends InheritanceDemo {
		
		int TotalTrucks;
		
		String City ="Bombay";
		
		void ShowTruckAndCity() {
			
			System.out.println(" The Truck : " +TotalTrucks +  "  Are in city :"  + City);
		}
	}
	
	 class InDemo3 extends INDEMO2 {
		 
		 int Mobikes;
		 String CITY2="NewYork";
		 
		 void ShowBikeAndCity() {
			 System.out.println("My Bikes are : " + Mobikes + "LYING IN CITY " + CITY2);
		 }
		 
	
	
    
}
