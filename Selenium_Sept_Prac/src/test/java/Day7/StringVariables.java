package Day7;

public class StringVariables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name="Radha";
		String name1= new String("raju");
		System.out.println(name1);
		
		//methos
		int size= name1.length();
		System.out.println(size);
		String last="gupta";
		name.concat(last).concat(name1);
		
		//trim();
		//charAt(); INDEX STARTS 0
		//contains();
		//equals();
		//equalsIgnorecase();
		//replace(); 
		//substring() start index 0123/end 123
		//split();
		//toLowerCase();
		//toUpperCase();
		name.replace('a','g');
		System.out.println(name);
		String Name5 ="ganga";
		String Name6 ="GANGA";
		System.out.println("Name conveted to upper :" + Name5.toUpperCase() +"   and name converted to lower:" + Name6.toLowerCase());

	}

}
