package Day11;

public class InheritanceMain1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InheritanceDemo InDemo =new InheritanceDemo();
		INDEMO2 DEMO2 =new INDEMO2();
		InDemo3 Demo3 =new InDemo3();
		Demo3.cityName = "cohin";
		Demo3.Showcity();
		InDemo.NoOfCars=50;
		Demo3.NoOfCars=100;
		Demo3.CountCars();

	}

}
