package Day9;

public class MethodDifferentWayMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodDifferentWay MDW = new MethodDifferentWay();
		MDW.displayMsg();
		MDW.giveMeYourAge(20);
		MDW.TellMeDAY("MON");
		String msg= MDW.getMessage();
		System.out.println(msg);
		System.out.println(MDW.getMessage());
		}

}
